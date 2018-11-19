package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import com.google.android.exoplayer2.util.C2292c;
import com.google.android.exoplayer2.util.C2302k;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.flv.a */
final class C3625a extends TagPayloadReader {
    /* renamed from: b */
    private static final int[] f10966b = new int[]{5512, 11025, 22050, 44100};
    /* renamed from: c */
    private boolean f10967c;
    /* renamed from: d */
    private boolean f10968d;
    /* renamed from: e */
    private int f10969e;

    public C3625a(TrackOutput trackOutput) {
        super(trackOutput);
    }

    /* renamed from: a */
    protected boolean mo2278a(C2302k c2302k) throws UnsupportedFormatException {
        if (this.f10967c) {
            c2302k.m8390d(1);
        } else {
            int g = c2302k.m8395g();
            r0.f10969e = (g >> 4) & 15;
            if (r0.f10969e == 2) {
                r0.a.format(Format.createAudioSampleFormat(null, "audio/mpeg", null, -1, -1, 1, f10966b[(g >> 2) & 3], null, null, 0, null));
                r0.f10968d = true;
            } else {
                if (r0.f10969e != 7) {
                    if (r0.f10969e != 8) {
                        if (r0.f10969e != 10) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Audio format not supported: ");
                            stringBuilder.append(r0.f10969e);
                            throw new UnsupportedFormatException(stringBuilder.toString());
                        }
                    }
                }
                r0.a.format(Format.createAudioSampleFormat(null, r0.f10969e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, C15645a.MAX_BYTE_SIZE_PER_FILE, (g & 1) == 1 ? 2 : 3, null, null, 0, null));
                r0.f10968d = true;
            }
            r0.f10967c = true;
        }
        return true;
    }

    /* renamed from: a */
    protected void mo2277a(C2302k c2302k, long j) throws ParserException {
        C2302k c2302k2 = c2302k;
        if (this.f10969e == 2) {
            int b = c2302k.m8385b();
            r0.a.sampleData(c2302k2, b);
            r0.a.sampleMetadata(j, 1, b, 0, null);
            return;
        }
        int g = c2302k.m8395g();
        if (g == 0 && !r0.f10968d) {
            byte[] bArr = new byte[c2302k.m8385b()];
            c2302k2.m8384a(bArr, 0, bArr.length);
            Pair a = C2292c.m8322a(bArr);
            r0.a.format(Format.createAudioSampleFormat(null, "audio/mp4a-latm", null, -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            r0.f10968d = true;
        } else if (r0.f10969e != 10 || g == 1) {
            int b2 = c2302k.m8385b();
            r0.a.sampleData(c2302k2, b2);
            r0.a.sampleMetadata(j, 1, b2, 0, null);
        }
    }
}
