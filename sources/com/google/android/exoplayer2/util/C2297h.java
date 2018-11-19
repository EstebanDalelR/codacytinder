package com.google.android.exoplayer2.util;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;

/* renamed from: com.google.android.exoplayer2.util.h */
public final class C2297h {
    @Nullable
    /* renamed from: a */
    public static String m8341a(int i) {
        switch (i) {
            case 32:
                return "video/mp4v-es";
            case 33:
                return "video/avc";
            case 35:
                return "video/hevc";
            case 64:
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 96:
            case 97:
                return "video/mpeg2";
            case 105:
            case 107:
                return "audio/mpeg";
            case 165:
                return "audio/ac3";
            case 166:
                return "audio/eac3";
            case 169:
            case 172:
                return "audio/vnd.dts";
            case 170:
            case 171:
                return "audio/vnd.dts.hd";
            case 173:
                return "audio/opus";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static boolean m8342a(String str) {
        return "audio".equals(C2297h.m8350i(str));
    }

    /* renamed from: b */
    public static boolean m8343b(String str) {
        return "video".equals(C2297h.m8350i(str));
    }

    /* renamed from: c */
    public static boolean m8344c(String str) {
        return ManagerWebServices.PARAM_TEXT.equals(C2297h.m8350i(str));
    }

    @Nullable
    /* renamed from: d */
    public static String m8345d(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String f : str.split(",")) {
            String f2 = C2297h.m8347f(f2);
            if (f2 != null && C2297h.m8343b(f2)) {
                return f2;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static String m8346e(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String f : str.split(",")) {
            String f2 = C2297h.m8347f(f2);
            if (f2 != null && C2297h.m8342a(f2)) {
                return f2;
            }
        }
        return null;
    }

    @android.support.annotation.Nullable
    /* renamed from: f */
    public static java.lang.String m8347f(@android.support.annotation.Nullable java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r3 = r3.trim();
        r1 = "avc1";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x0101;
    L_0x0010:
        r1 = "avc3";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x001a;
    L_0x0018:
        goto L_0x0101;
    L_0x001a:
        r1 = "hev1";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x00fe;
    L_0x0022:
        r1 = "hvc1";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x002c;
    L_0x002a:
        goto L_0x00fe;
    L_0x002c:
        r1 = "vp9";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x00fb;
    L_0x0034:
        r1 = "vp09";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x003e;
    L_0x003c:
        goto L_0x00fb;
    L_0x003e:
        r1 = "vp8";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x00f8;
    L_0x0046:
        r1 = "vp08";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x0050;
    L_0x004e:
        goto L_0x00f8;
    L_0x0050:
        r1 = "mp4a";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x0086;
    L_0x0058:
        r1 = "mp4a.";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x0080;
    L_0x0060:
        r1 = 5;
        r3 = r3.substring(r1);
        r1 = r3.length();
        r2 = 2;
        if (r1 < r2) goto L_0x0080;
    L_0x006c:
        r1 = 0;
        r3 = r3.substring(r1, r2);	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = com.google.android.exoplayer2.util.C2314v.m8496e(r3);	 Catch:{ NumberFormatException -> 0x0080 }
        r1 = 16;	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = java.lang.Integer.parseInt(r3, r1);	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = com.google.android.exoplayer2.util.C2297h.m8341a(r3);	 Catch:{ NumberFormatException -> 0x0080 }
        goto L_0x0081;
    L_0x0080:
        r3 = r0;
    L_0x0081:
        if (r3 != 0) goto L_0x0085;
    L_0x0083:
        r3 = "audio/mp4a-latm";
    L_0x0085:
        return r3;
    L_0x0086:
        r1 = "ac-3";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x00f5;
    L_0x008e:
        r1 = "dac3";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x0097;
    L_0x0096:
        goto L_0x00f5;
    L_0x0097:
        r1 = "ec-3";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x00f2;
    L_0x009f:
        r1 = "dec3";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00f2;
    L_0x00a8:
        r1 = "ec+3";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x00b3;
    L_0x00b0:
        r3 = "audio/eac3-joc";
        return r3;
    L_0x00b3:
        r1 = "dtsc";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x00ef;
    L_0x00bb:
        r1 = "dtse";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00ef;
    L_0x00c4:
        r1 = "dtsh";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x00ec;
    L_0x00cc:
        r1 = "dtsl";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x00d5;
    L_0x00d4:
        goto L_0x00ec;
    L_0x00d5:
        r1 = "opus";
        r1 = r3.startsWith(r1);
        if (r1 == 0) goto L_0x00e0;
    L_0x00dd:
        r3 = "audio/opus";
        return r3;
    L_0x00e0:
        r1 = "vorbis";
        r3 = r3.startsWith(r1);
        if (r3 == 0) goto L_0x00eb;
    L_0x00e8:
        r3 = "audio/vorbis";
        return r3;
    L_0x00eb:
        return r0;
    L_0x00ec:
        r3 = "audio/vnd.dts.hd";
        return r3;
    L_0x00ef:
        r3 = "audio/vnd.dts";
        return r3;
    L_0x00f2:
        r3 = "audio/eac3";
        return r3;
    L_0x00f5:
        r3 = "audio/ac3";
        return r3;
    L_0x00f8:
        r3 = "video/x-vnd.on2.vp8";
        return r3;
    L_0x00fb:
        r3 = "video/x-vnd.on2.vp9";
        return r3;
    L_0x00fe:
        r3 = "video/hevc";
        return r3;
    L_0x0101:
        r3 = "video/avc";
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.h.f(java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public static int m8348g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (C2297h.m8342a(str)) {
            return 1;
        }
        if (C2297h.m8343b(str)) {
            return 2;
        }
        if (!(C2297h.m8344c(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str))) {
            if (!"application/dvbsubs".equals(str)) {
                if (!("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str))) {
                    if ("application/x-camera-motion".equals(str) == null) {
                        return -1;
                    }
                }
                return 4;
            }
        }
        return 3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    public static int m8349h(java.lang.String r3) {
        /*
        r0 = r3.hashCode();
        r1 = 0;
        r2 = 5;
        switch(r0) {
            case -2123537834: goto L_0x003c;
            case -1095064472: goto L_0x0032;
            case 187078296: goto L_0x0028;
            case 1504578661: goto L_0x001e;
            case 1505942594: goto L_0x0014;
            case 1556697186: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x0046;
    L_0x000a:
        r0 = "audio/true-hd";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0012:
        r3 = 5;
        goto L_0x0047;
    L_0x0014:
        r0 = "audio/vnd.dts.hd";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x001c:
        r3 = 4;
        goto L_0x0047;
    L_0x001e:
        r0 = "audio/eac3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0026:
        r3 = 1;
        goto L_0x0047;
    L_0x0028:
        r0 = "audio/ac3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0030:
        r3 = 0;
        goto L_0x0047;
    L_0x0032:
        r0 = "audio/vnd.dts";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x003a:
        r3 = 3;
        goto L_0x0047;
    L_0x003c:
        r0 = "audio/eac3-joc";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0044:
        r3 = 2;
        goto L_0x0047;
    L_0x0046:
        r3 = -1;
    L_0x0047:
        switch(r3) {
            case 0: goto L_0x0055;
            case 1: goto L_0x0053;
            case 2: goto L_0x0053;
            case 3: goto L_0x0051;
            case 4: goto L_0x004e;
            case 5: goto L_0x004b;
            default: goto L_0x004a;
        };
    L_0x004a:
        return r1;
    L_0x004b:
        r3 = 14;
        return r3;
    L_0x004e:
        r3 = 8;
        return r3;
    L_0x0051:
        r3 = 7;
        return r3;
    L_0x0053:
        r3 = 6;
        return r3;
    L_0x0055:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.h.h(java.lang.String):int");
    }

    @Nullable
    /* renamed from: i */
    private static String m8350i(@Nullable String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid mime type: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
