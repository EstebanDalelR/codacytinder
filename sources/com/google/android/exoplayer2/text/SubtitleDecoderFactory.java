package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;

public interface SubtitleDecoderFactory {
    /* renamed from: a */
    public static final SubtitleDecoderFactory f6451a = new C37001();

    /* renamed from: com.google.android.exoplayer2.text.SubtitleDecoderFactory$1 */
    static class C37001 implements SubtitleDecoderFactory {
        C37001() {
        }

        public boolean supportsFormat(Format format) {
            format = format.sampleMimeType;
            if (!("text/vtt".equals(format) || "text/x-ssa".equals(format) || "application/ttml+xml".equals(format) || "application/x-mp4-vtt".equals(format) || "application/x-subrip".equals(format) || "application/x-quicktime-tx3g".equals(format) || "application/cea-608".equals(format) || "application/x-mp4-cea-608".equals(format) || "application/cea-708".equals(format) || "application/dvbsubs".equals(format))) {
                if ("application/pgs".equals(format) == null) {
                    return null;
                }
            }
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.exoplayer2.text.SubtitleDecoder createDecoder(com.google.android.exoplayer2.Format r3) {
            /*
            r2 = this;
            r0 = r3.sampleMimeType;
            r1 = r0.hashCode();
            switch(r1) {
                case -1351681404: goto L_0x0072;
                case -1248334819: goto L_0x0067;
                case -1026075066: goto L_0x005d;
                case -1004728940: goto L_0x0053;
                case 691401887: goto L_0x0049;
                case 822864842: goto L_0x003f;
                case 930165504: goto L_0x0035;
                case 1566015601: goto L_0x002b;
                case 1566016562: goto L_0x0020;
                case 1668750253: goto L_0x0016;
                case 1693976202: goto L_0x000b;
                default: goto L_0x0009;
            };
        L_0x0009:
            goto L_0x007d;
        L_0x000b:
            r1 = "application/ttml+xml";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x0013:
            r0 = 3;
            goto L_0x007e;
        L_0x0016:
            r1 = "application/x-subrip";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x001e:
            r0 = 4;
            goto L_0x007e;
        L_0x0020:
            r1 = "application/cea-708";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x0028:
            r0 = 8;
            goto L_0x007e;
        L_0x002b:
            r1 = "application/cea-608";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x0033:
            r0 = 6;
            goto L_0x007e;
        L_0x0035:
            r1 = "application/x-mp4-cea-608";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x003d:
            r0 = 7;
            goto L_0x007e;
        L_0x003f:
            r1 = "text/x-ssa";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x0047:
            r0 = 1;
            goto L_0x007e;
        L_0x0049:
            r1 = "application/x-quicktime-tx3g";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x0051:
            r0 = 5;
            goto L_0x007e;
        L_0x0053:
            r1 = "text/vtt";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x005b:
            r0 = 0;
            goto L_0x007e;
        L_0x005d:
            r1 = "application/x-mp4-vtt";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x0065:
            r0 = 2;
            goto L_0x007e;
        L_0x0067:
            r1 = "application/pgs";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x006f:
            r0 = 10;
            goto L_0x007e;
        L_0x0072:
            r1 = "application/dvbsubs";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x007d;
        L_0x007a:
            r0 = 9;
            goto L_0x007e;
        L_0x007d:
            r0 = -1;
        L_0x007e:
            switch(r0) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00a9;
                case 6: goto L_0x009f;
                case 7: goto L_0x009f;
                case 8: goto L_0x0097;
                case 9: goto L_0x008f;
                case 10: goto L_0x0089;
                default: goto L_0x0081;
            };
        L_0x0081:
            r3 = new java.lang.IllegalArgumentException;
            r0 = "Attempted to create decoder for unsupported format";
            r3.<init>(r0);
            throw r3;
        L_0x0089:
            r3 = new com.google.android.exoplayer2.text.c.a;
            r3.<init>();
            return r3;
        L_0x008f:
            r0 = new com.google.android.exoplayer2.text.b.a;
            r3 = r3.initializationData;
            r0.<init>(r3);
            return r0;
        L_0x0097:
            r0 = new com.google.android.exoplayer2.text.a.c;
            r3 = r3.accessibilityChannel;
            r0.<init>(r3);
            return r0;
        L_0x009f:
            r0 = new com.google.android.exoplayer2.text.a.a;
            r1 = r3.sampleMimeType;
            r3 = r3.accessibilityChannel;
            r0.<init>(r1, r3);
            return r0;
        L_0x00a9:
            r0 = new com.google.android.exoplayer2.text.f.a;
            r3 = r3.initializationData;
            r0.<init>(r3);
            return r0;
        L_0x00b1:
            r3 = new com.google.android.exoplayer2.text.e.a;
            r3.<init>();
            return r3;
        L_0x00b7:
            r3 = new com.google.android.exoplayer2.text.ttml.a;
            r3.<init>();
            return r3;
        L_0x00bd:
            r3 = new com.google.android.exoplayer2.text.webvtt.b;
            r3.<init>();
            return r3;
        L_0x00c3:
            r0 = new com.google.android.exoplayer2.text.d.a;
            r3 = r3.initializationData;
            r0.<init>(r3);
            return r0;
        L_0x00cb:
            r3 = new com.google.android.exoplayer2.text.webvtt.f;
            r3.<init>();
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.SubtitleDecoderFactory.1.createDecoder(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.text.SubtitleDecoder");
        }
    }

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
