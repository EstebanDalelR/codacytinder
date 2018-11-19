package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.webvtt.C2245g;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.source.hls.f */
final class C3693f implements Extractor {
    /* renamed from: a */
    private static final Pattern f11500a = Pattern.compile("LOCAL:([^,]+)");
    /* renamed from: b */
    private static final Pattern f11501b = Pattern.compile("MPEGTS:(\\d+)");
    /* renamed from: c */
    private final String f11502c;
    /* renamed from: d */
    private final C2310s f11503d;
    /* renamed from: e */
    private final C2302k f11504e = new C2302k();
    /* renamed from: f */
    private ExtractorOutput f11505f;
    /* renamed from: g */
    private byte[] f11506g = new byte[1024];
    /* renamed from: h */
    private int f11507h;

    public void release() {
    }

    public C3693f(String str, C2310s c2310s) {
        this.f11502c = str;
        this.f11503d = c2310s;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        throw new IllegalStateException();
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f11505f = extractorOutput;
        extractorOutput.seekMap(new C3605b(-9223372036854775807L));
    }

    public void seek(long j, long j2) {
        throw new IllegalStateException();
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        Object length = (int) extractorInput.getLength();
        if (this.f11507h == this.f11506g.length) {
            this.f11506g = Arrays.copyOf(this.f11506g, ((length != -1 ? length : this.f11506g.length) * 3) / 2);
        }
        extractorInput = extractorInput.read(this.f11506g, this.f11507h, this.f11506g.length - this.f11507h);
        if (extractorInput != -1) {
            this.f11507h += extractorInput;
            if (length == -1 || this.f11507h != length) {
                return null;
            }
        }
        m13987a();
        return -1;
    }

    /* renamed from: a */
    private void m13987a() throws ParserException {
        C2302k c2302k = new C2302k(this.f11506g);
        try {
            C2245g.m8099a(c2302k);
            long j = 0;
            long j2 = j;
            while (true) {
                String z = c2302k.m8414z();
                if (TextUtils.isEmpty(z)) {
                    break;
                } else if (z.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = f11500a.matcher(z);
                    StringBuilder stringBuilder;
                    if (matcher.find()) {
                        Matcher matcher2 = f11501b.matcher(z);
                        if (matcher2.find()) {
                            j2 = C2245g.m8098a(matcher.group(1));
                            j = C2310s.m8436d(Long.parseLong(matcher2.group(1)));
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                            stringBuilder.append(z);
                            throw new ParserException(stringBuilder.toString());
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    stringBuilder.append(z);
                    throw new ParserException(stringBuilder.toString());
                }
            }
            Matcher b = C2245g.m8101b(c2302k);
            if (b == null) {
                m13986a(0);
                return;
            }
            long a = C2245g.m8098a(b.group(1));
            long b2 = this.f11503d.m8441b(C2310s.m8437e((a + j) - j2));
            TrackOutput a2 = m13986a(b2 - a);
            this.f11504e.m8383a(this.f11506g, this.f11507h);
            a2.sampleData(this.f11504e, this.f11507h);
            a2.sampleMetadata(b2, 1, this.f11507h, 0, null);
        } catch (Throwable e) {
            throw new ParserException(e);
        }
    }

    /* renamed from: a */
    private TrackOutput m13986a(long j) {
        TrackOutput track = this.f11505f.track(0, 3);
        track.format(Format.createTextSampleFormat(null, "text/vtt", null, -1, 0, this.f11502c, null, j));
        this.f11505f.endTracks();
        return track;
    }
}
