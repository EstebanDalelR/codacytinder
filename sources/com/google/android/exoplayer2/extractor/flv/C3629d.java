package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import com.google.android.exoplayer2.util.C2300i;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.video.C2327a;

/* renamed from: com.google.android.exoplayer2.extractor.flv.d */
final class C3629d extends TagPayloadReader {
    /* renamed from: b */
    private final C2302k f10988b = new C2302k(C2300i.f6921a);
    /* renamed from: c */
    private final C2302k f10989c = new C2302k(4);
    /* renamed from: d */
    private int f10990d;
    /* renamed from: e */
    private boolean f10991e;
    /* renamed from: f */
    private int f10992f;

    public C3629d(TrackOutput trackOutput) {
        super(trackOutput);
    }

    /* renamed from: a */
    protected boolean mo2278a(C2302k c2302k) throws UnsupportedFormatException {
        c2302k = c2302k.m8395g();
        int i = (c2302k >> 4) & 15;
        c2302k &= 15;
        if (c2302k != 7) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Video format not supported: ");
            stringBuilder.append(c2302k);
            throw new UnsupportedFormatException(stringBuilder.toString());
        }
        this.f10992f = i;
        return i != 5 ? true : null;
    }

    /* renamed from: a */
    protected void mo2277a(C2302k c2302k, long j) throws ParserException {
        int g = c2302k.m8395g();
        long l = j + (((long) c2302k.m8400l()) * 1000);
        if (g == 0 && !this.f10991e) {
            C2302k c2302k2 = new C2302k(new byte[c2302k.m8385b()]);
            c2302k.m8384a(c2302k2.f6929a, 0, c2302k.m8385b());
            c2302k = C2327a.m8521a(c2302k2);
            this.f10990d = c2302k.f6993b;
            this.a.format(Format.createVideoSampleFormat(null, "video/avc", null, -1, -1, c2302k.f6994c, c2302k.f6995d, -1.0f, c2302k.f6992a, -1, c2302k.f6996e, null));
            this.f10991e = true;
        } else if (g == 1 && this.f10991e) {
            byte[] bArr = this.f10989c.f6929a;
            bArr[0] = (byte) 0;
            bArr[1] = (byte) 0;
            bArr[2] = (byte) 0;
            g = 4 - this.f10990d;
            int i = 0;
            while (c2302k.m8385b() > 0) {
                c2302k.m8384a(this.f10989c.f6929a, g, this.f10990d);
                this.f10989c.m8388c(0);
                int u = this.f10989c.m8409u();
                this.f10988b.m8388c(0);
                this.a.sampleData(this.f10988b, 4);
                i += 4;
                this.a.sampleData(c2302k, u);
                i += u;
            }
            this.a.sampleMetadata(l, this.f10992f == 1 ? 1 : 0, i, 0, null);
        }
    }
}
