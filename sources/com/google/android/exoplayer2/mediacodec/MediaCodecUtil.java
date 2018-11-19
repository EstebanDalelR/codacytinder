package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class MediaCodecUtil {
    /* renamed from: a */
    private static final C2130a f6115a = C2130a.m7659a("OMX.google.raw.decoder");
    /* renamed from: b */
    private static final Pattern f6116b = Pattern.compile("^\\D?(\\d+)$");
    /* renamed from: c */
    private static final HashMap<C2128a, List<C2130a>> f6117c = new HashMap();
    /* renamed from: d */
    private static final SparseIntArray f6118d = new SparseIntArray();
    /* renamed from: e */
    private static final SparseIntArray f6119e = new SparseIntArray();
    /* renamed from: f */
    private static final Map<String, Integer> f6120f = new HashMap();
    /* renamed from: g */
    private static int f6121g = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$a */
    private static final class C2128a {
        /* renamed from: a */
        public final String f6113a;
        /* renamed from: b */
        public final boolean f6114b;

        public C2128a(String str, boolean z) {
            this.f6113a = str;
            this.f6114b = z;
        }

        public int hashCode() {
            return (((this.f6113a == null ? 0 : this.f6113a.hashCode()) + 31) * 31) + (this.f6114b ? 1231 : 1237);
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (obj.getClass() == C2128a.class) {
                    C2128a c2128a = (C2128a) obj;
                    if (!TextUtils.equals(this.f6113a, c2128a.f6113a) || this.f6114b != c2128a.f6114b) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    private interface C2129b {
        /* renamed from: a */
        int mo2308a();

        /* renamed from: a */
        MediaCodecInfo mo2309a(int i);

        /* renamed from: a */
        boolean mo2310a(String str, CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo2311b();
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    private static final class C3664c implements C2129b {
        /* renamed from: b */
        public boolean mo2311b() {
            return false;
        }

        private C3664c() {
        }

        /* renamed from: a */
        public int mo2308a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: a */
        public MediaCodecInfo mo2309a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public boolean mo2310a(String str, CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    @TargetApi(21)
    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    private static final class C3665d implements C2129b {
        /* renamed from: a */
        private final int f11330a;
        /* renamed from: b */
        private MediaCodecInfo[] f11331b;

        /* renamed from: b */
        public boolean mo2311b() {
            return true;
        }

        public C3665d(boolean z) {
            this.f11330a = z;
        }

        /* renamed from: a */
        public int mo2308a() {
            m13825c();
            return this.f11331b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo2309a(int i) {
            m13825c();
            return this.f11331b[i];
        }

        /* renamed from: a */
        public boolean mo2310a(String str, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: c */
        private void m13825c() {
            if (this.f11331b == null) {
                this.f11331b = new MediaCodecList(this.f11330a).getCodecInfos();
            }
        }
    }

    /* renamed from: a */
    private static int m7646a(int i) {
        switch (i) {
            case 1:
                return 25344;
            case 2:
                return 25344;
            case 8:
                return 101376;
            case 16:
                return 101376;
            case 32:
                return 101376;
            case 64:
                return 202752;
            case ProfileEditingConfig.DEFAULT_MAX_LENGTH /*128*/:
                return 414720;
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case ItemAnimator.FLAG_MOVED /*2048*/:
                return 2097152;
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
                return 9437184;
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    static {
        f6118d.put(66, 1);
        f6118d.put(77, 2);
        f6118d.put(88, 4);
        f6118d.put(100, 8);
        f6119e.put(10, 1);
        f6119e.put(11, 4);
        f6119e.put(12, 8);
        f6119e.put(13, 16);
        f6119e.put(20, 32);
        f6119e.put(21, 64);
        f6119e.put(22, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        f6119e.put(30, 256);
        f6119e.put(31, 512);
        f6119e.put(32, 1024);
        f6119e.put(40, ItemAnimator.FLAG_MOVED);
        f6119e.put(41, 4096);
        f6119e.put(42, 8192);
        f6119e.put(50, 16384);
        f6119e.put(51, 32768);
        f6119e.put(52, 65536);
        f6120f.put("L30", Integer.valueOf(1));
        f6120f.put("L60", Integer.valueOf(4));
        f6120f.put("L63", Integer.valueOf(16));
        f6120f.put("L90", Integer.valueOf(64));
        f6120f.put("L93", Integer.valueOf(256));
        f6120f.put("L120", Integer.valueOf(1024));
        f6120f.put("L123", Integer.valueOf(4096));
        f6120f.put("L150", Integer.valueOf(16384));
        f6120f.put("L153", Integer.valueOf(65536));
        f6120f.put("L156", Integer.valueOf(262144));
        f6120f.put("L180", Integer.valueOf(1048576));
        f6120f.put("L183", Integer.valueOf(4194304));
        f6120f.put("L186", Integer.valueOf(16777216));
        f6120f.put("H30", Integer.valueOf(2));
        f6120f.put("H60", Integer.valueOf(8));
        f6120f.put("H63", Integer.valueOf(32));
        f6120f.put("H90", Integer.valueOf(ProfileEditingConfig.DEFAULT_MAX_LENGTH));
        f6120f.put("H93", Integer.valueOf(512));
        f6120f.put("H120", Integer.valueOf(ItemAnimator.FLAG_MOVED));
        f6120f.put("H123", Integer.valueOf(8192));
        f6120f.put("H150", Integer.valueOf(32768));
        f6120f.put("H153", Integer.valueOf(131072));
        f6120f.put("H156", Integer.valueOf(524288));
        f6120f.put("H180", Integer.valueOf(2097152));
        f6120f.put("H183", Integer.valueOf(8388608));
        f6120f.put("H186", Integer.valueOf(33554432));
    }

    /* renamed from: a */
    public static C2130a m7649a() {
        return f6115a;
    }

    @Nullable
    /* renamed from: a */
    public static C2130a m7650a(String str, boolean z) throws DecoderQueryException {
        str = m7656b(str, z);
        return str.isEmpty() ? null : (C2130a) str.get(false);
    }

    /* renamed from: b */
    public static synchronized List<C2130a> m7656b(String str, boolean z) throws DecoderQueryException {
        synchronized (MediaCodecUtil.class) {
            C2128a c2128a = new C2128a(str, z);
            List<C2130a> list = (List) f6117c.get(c2128a);
            if (list != null) {
                return list;
            }
            C2129b c3665d = C2314v.f6956a >= 21 ? new C3665d(z) : new C3664c();
            List a = m7651a(c2128a, c3665d, str);
            if (z && a.isEmpty() && true <= C2314v.f6956a && C2314v.f6956a <= true) {
                c3665d = new C3664c();
                a = m7651a(c2128a, c3665d, str);
                if (!a.isEmpty()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("MediaCodecList API didn't list secure decoder for: ");
                    stringBuilder.append(str);
                    stringBuilder.append(". Assuming: ");
                    stringBuilder.append(((C2130a) a.get(0)).f6122a);
                    Log.w("MediaCodecUtil", stringBuilder.toString());
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                a.addAll(m7651a(new C2128a("audio/eac3", c2128a.f6114b), c3665d, str));
            }
            m7652a(a);
            str = Collections.unmodifiableList(a);
            f6117c.put(c2128a, str);
            return str;
        }
    }

    /* renamed from: b */
    public static int m7654b() throws DecoderQueryException {
        if (f6121g == -1) {
            int i = 0;
            C2130a a = m7650a("video/avc", false);
            if (a != null) {
                CodecProfileLevel[] a2 = a.m7673a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m7646a(a2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C2314v.f6956a >= 21 ? 345600 : 172800);
            }
            f6121g = i;
        }
        return f6121g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m7647a(java.lang.String r6) {
        /*
        r0 = 0;
        if (r6 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = "\\.";
        r1 = r6.split(r1);
        r2 = 0;
        r3 = r1[r2];
        r4 = -1;
        r5 = r3.hashCode();
        switch(r5) {
            case 3006243: goto L_0x0033;
            case 3006244: goto L_0x0029;
            case 3199032: goto L_0x0020;
            case 3214780: goto L_0x0016;
            default: goto L_0x0015;
        };
    L_0x0015:
        goto L_0x003d;
    L_0x0016:
        r2 = "hvc1";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003d;
    L_0x001e:
        r2 = 1;
        goto L_0x003e;
    L_0x0020:
        r5 = "hev1";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x003d;
    L_0x0028:
        goto L_0x003e;
    L_0x0029:
        r2 = "avc2";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003d;
    L_0x0031:
        r2 = 3;
        goto L_0x003e;
    L_0x0033:
        r2 = "avc1";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x003d;
    L_0x003b:
        r2 = 2;
        goto L_0x003e;
    L_0x003d:
        r2 = -1;
    L_0x003e:
        switch(r2) {
            case 0: goto L_0x0047;
            case 1: goto L_0x0047;
            case 2: goto L_0x0042;
            case 3: goto L_0x0042;
            default: goto L_0x0041;
        };
    L_0x0041:
        return r0;
    L_0x0042:
        r6 = m7655b(r6, r1);
        return r6;
    L_0x0047:
        r6 = m7648a(r6, r1);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.a(java.lang.String):android.util.Pair<java.lang.Integer, java.lang.Integer>");
    }

    /* renamed from: a */
    private static ArrayList<C2130a> m7651a(C2128a c2128a, C2129b c2129b, String str) throws DecoderQueryException {
        int i;
        MediaCodecInfo mediaCodecInfo;
        StringBuilder stringBuilder;
        Exception e;
        Exception exception;
        StringBuilder stringBuilder2;
        C2128a c2128a2 = c2128a;
        C2129b c2129b2 = c2129b;
        try {
            ArrayList<C2130a> arrayList = new ArrayList();
            String str2 = c2128a2.f6113a;
            int a = c2129b.mo2308a();
            boolean b = c2129b.mo2311b();
            int i2 = 0;
            while (i2 < a) {
                MediaCodecInfo a2 = c2129b2.mo2309a(i2);
                String name = a2.getName();
                if (m7653a(a2, name, b, str)) {
                    String[] supportedTypes = a2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str3 = supportedTypes[i3];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str3);
                                i = a;
                                try {
                                    boolean a3 = c2129b2.mo2310a(str2, capabilitiesForType);
                                    boolean b2 = m7657b(name);
                                    if (b) {
                                        mediaCodecInfo = a2;
                                        try {
                                            if (c2128a2.f6114b != a3) {
                                                if (!b || c2128a2.f6114b) {
                                                    if (!b && a3) {
                                                        stringBuilder = new StringBuilder();
                                                        stringBuilder.append(name);
                                                        stringBuilder.append(".secure");
                                                        arrayList.add(C2130a.m7660a(stringBuilder.toString(), str2, capabilitiesForType, b2, true));
                                                        return arrayList;
                                                    }
                                                }
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            exception = e;
                                            if (C2314v.f6956a > 23) {
                                            }
                                            stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append("Failed to query codec ");
                                            stringBuilder2.append(name);
                                            stringBuilder2.append(" (");
                                            stringBuilder2.append(str3);
                                            stringBuilder2.append(")");
                                            Log.e("MediaCodecUtil", stringBuilder2.toString());
                                            throw exception;
                                        }
                                    }
                                    mediaCodecInfo = a2;
                                    if (b) {
                                    }
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(name);
                                    stringBuilder.append(".secure");
                                    arrayList.add(C2130a.m7660a(stringBuilder.toString(), str2, capabilitiesForType, b2, true));
                                    return arrayList;
                                    arrayList.add(C2130a.m7660a(name, str2, capabilitiesForType, b2, false));
                                } catch (Exception e3) {
                                    e = e3;
                                    mediaCodecInfo = a2;
                                    exception = e;
                                    if (C2314v.f6956a > 23 || arrayList.isEmpty()) {
                                        stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append("Failed to query codec ");
                                        stringBuilder2.append(name);
                                        stringBuilder2.append(" (");
                                        stringBuilder2.append(str3);
                                        stringBuilder2.append(")");
                                        Log.e("MediaCodecUtil", stringBuilder2.toString());
                                        throw exception;
                                    }
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Skipping codec ");
                                    stringBuilder.append(name);
                                    stringBuilder.append(" (failed to query capabilities)");
                                    Log.e("MediaCodecUtil", stringBuilder.toString());
                                    i3++;
                                    a = i;
                                    a2 = mediaCodecInfo;
                                    c2129b2 = c2129b;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                i = a;
                                mediaCodecInfo = a2;
                                exception = e;
                                if (C2314v.f6956a > 23) {
                                }
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Failed to query codec ");
                                stringBuilder2.append(name);
                                stringBuilder2.append(" (");
                                stringBuilder2.append(str3);
                                stringBuilder2.append(")");
                                Log.e("MediaCodecUtil", stringBuilder2.toString());
                                throw exception;
                            }
                        }
                        i = a;
                        mediaCodecInfo = a2;
                        i3++;
                        a = i;
                        a2 = mediaCodecInfo;
                        c2129b2 = c2129b;
                    }
                    continue;
                }
                i2++;
                a = a;
                c2129b2 = c2129b;
            }
            return arrayList;
        } catch (Throwable e5) {
            throw new DecoderQueryException(e5);
        }
    }

    /* renamed from: a */
    private static boolean m7653a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() == null) {
            if (z || str.endsWith(".secure") == null) {
                if (C2314v.f6956a < true && ("CIPAACDecoder".equals(str) != null || "CIPMP3Decoder".equals(str) != null || "CIPVorbisDecoder".equals(str) != null || "CIPAMRNBDecoder".equals(str) != null || "AACDecoder".equals(str) != null || "MP3Decoder".equals(str) != null)) {
                    return false;
                }
                if (C2314v.f6956a < 18 && "OMX.SEC.MP3.Decoder".equals(str) != null) {
                    return false;
                }
                if (C2314v.f6956a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) != null && ("a70".equals(C2314v.f6957b) != null || ("Xiaomi".equals(C2314v.f6958c) != null && C2314v.f6957b.startsWith("HM") != null))) {
                    return false;
                }
                if (C2314v.f6956a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) != null && ("dlxu".equals(C2314v.f6957b) != null || "protou".equals(C2314v.f6957b) != null || "ville".equals(C2314v.f6957b) != null || "villeplus".equals(C2314v.f6957b) != null || "villec2".equals(C2314v.f6957b) != null || C2314v.f6957b.startsWith("gee") != null || "C6602".equals(C2314v.f6957b) != null || "C6603".equals(C2314v.f6957b) != null || "C6606".equals(C2314v.f6957b) != null || "C6616".equals(C2314v.f6957b) != null || "L36h".equals(C2314v.f6957b) != null || "SO-02E".equals(C2314v.f6957b) != null)) {
                    return false;
                }
                if (C2314v.f6956a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) != null && ("C1504".equals(C2314v.f6957b) != null || "C1505".equals(C2314v.f6957b) != null || "C1604".equals(C2314v.f6957b) != null || "C1605".equals(C2314v.f6957b) != null)) {
                    return false;
                }
                if (C2314v.f6956a < true && (("OMX.SEC.aac.dec".equals(str) != null || "OMX.Exynos.AAC.Decoder".equals(str) != null) && "samsung".equals(C2314v.f6958c) != null && (C2314v.f6957b.startsWith("zeroflte") != null || C2314v.f6957b.startsWith("zerolte") != null || C2314v.f6957b.startsWith("zenlte") != null || "SC-05G".equals(C2314v.f6957b) != null || "marinelteatt".equals(C2314v.f6957b) != null || "404SC".equals(C2314v.f6957b) != null || "SC-04G".equals(C2314v.f6957b) != null || "SCV31".equals(C2314v.f6957b) != null))) {
                    return false;
                }
                if (C2314v.f6956a <= 19 && "OMX.SEC.vp8.dec".equals(str) != null && "samsung".equals(C2314v.f6958c) != null && (C2314v.f6957b.startsWith("d2") != null || C2314v.f6957b.startsWith("serrano") != null || C2314v.f6957b.startsWith("jflte") != null || C2314v.f6957b.startsWith("santos") != null || C2314v.f6957b.startsWith("t0") != null)) {
                    return false;
                }
                if (C2314v.f6956a <= 19 && C2314v.f6957b.startsWith("jflte") != null && "OMX.qcom.video.decoder.vp8".equals(str) != null) {
                    return false;
                }
                if ("audio/eac3-joc".equals(str2) == null || "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str) == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m7652a(List<C2130a> list) {
        if (C2314v.f6956a < 26) {
            int i = 1;
            if (list.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((C2130a) list.get(0)).f6122a)) {
                while (i < list.size()) {
                    C2130a c2130a = (C2130a) list.get(i);
                    if ("OMX.google.raw.decoder".equals(c2130a.f6122a)) {
                        list.remove(i);
                        list.add(0, c2130a);
                        return;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m7657b(String str) {
        return (C2314v.f6956a > 22 || (!("ODROID-XU3".equals(C2314v.f6959d) || "Nexus 10".equals(C2314v.f6959d)) || (!"OMX.Exynos.AVC.Decoder".equals(str) && "OMX.Exynos.AVC.Decoder.secure".equals(str) == null))) ? null : true;
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m7648a(String str, String[] strArr) {
        if (strArr.length < 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring malformed HEVC codec string: ");
            stringBuilder.append(str);
            Log.w("MediaCodecUtil", stringBuilder.toString());
            return null;
        }
        Matcher matcher = f6116b.matcher(strArr[1]);
        if (matcher.matches()) {
            str = matcher.group(1);
            if ("1".equals(str)) {
                str = true;
            } else if ("2".equals(str)) {
                str = 2;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown HEVC profile string: ");
                stringBuilder.append(str);
                Log.w("MediaCodecUtil", stringBuilder.toString());
                return null;
            }
            Integer num = (Integer) f6120f.get(strArr[3]);
            if (num != null) {
                return new Pair(Integer.valueOf(str), num);
            }
            strArr = new StringBuilder();
            strArr.append("Unknown HEVC level string: ");
            strArr.append(matcher.group(1));
            Log.w("MediaCodecUtil", strArr.toString());
            return null;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring malformed HEVC codec string: ");
        stringBuilder.append(str);
        Log.w("MediaCodecUtil", stringBuilder.toString());
        return null;
    }

    /* renamed from: b */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m7655b(java.lang.String r5, java.lang.String[] r6) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r6.length;
        r1 = 2;
        r2 = 0;
        if (r0 >= r1) goto L_0x001c;
    L_0x0005:
        r6 = "MediaCodecUtil";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Ignoring malformed AVC codec string: ";
        r0.append(r1);
        r0.append(r5);
        r5 = r0.toString();
        android.util.Log.w(r6, r5);
        return r2;
    L_0x001c:
        r0 = 1;
        r3 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cc }
        r3 = r3.length();	 Catch:{ NumberFormatException -> 0x00cc }
        r4 = 6;	 Catch:{ NumberFormatException -> 0x00cc }
        if (r3 != r4) goto L_0x0048;	 Catch:{ NumberFormatException -> 0x00cc }
    L_0x0026:
        r3 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cc }
        r4 = 0;	 Catch:{ NumberFormatException -> 0x00cc }
        r1 = r3.substring(r4, r1);	 Catch:{ NumberFormatException -> 0x00cc }
        r3 = 16;	 Catch:{ NumberFormatException -> 0x00cc }
        r1 = java.lang.Integer.parseInt(r1, r3);	 Catch:{ NumberFormatException -> 0x00cc }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ NumberFormatException -> 0x00cc }
        r6 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cc }
        r0 = 4;	 Catch:{ NumberFormatException -> 0x00cc }
        r6 = r6.substring(r0);	 Catch:{ NumberFormatException -> 0x00cc }
        r6 = java.lang.Integer.parseInt(r6, r3);	 Catch:{ NumberFormatException -> 0x00cc }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NumberFormatException -> 0x00cc }
        r0 = r1;	 Catch:{ NumberFormatException -> 0x00cc }
        goto L_0x0060;	 Catch:{ NumberFormatException -> 0x00cc }
    L_0x0048:
        r3 = r6.length;	 Catch:{ NumberFormatException -> 0x00cc }
        r4 = 3;	 Catch:{ NumberFormatException -> 0x00cc }
        if (r3 < r4) goto L_0x00b5;	 Catch:{ NumberFormatException -> 0x00cc }
    L_0x004c:
        r0 = r6[r0];	 Catch:{ NumberFormatException -> 0x00cc }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00cc }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ NumberFormatException -> 0x00cc }
        r6 = r6[r1];	 Catch:{ NumberFormatException -> 0x00cc }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x00cc }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ NumberFormatException -> 0x00cc }
    L_0x0060:
        r5 = f6118d;
        r1 = r0.intValue();
        r3 = -1;
        r5 = r5.get(r1, r3);
        if (r5 != r3) goto L_0x0084;
    L_0x006d:
        r5 = "MediaCodecUtil";
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r1 = "Unknown AVC profile: ";
        r6.append(r1);
        r6.append(r0);
        r6 = r6.toString();
        android.util.Log.w(r5, r6);
        return r2;
    L_0x0084:
        r0 = f6119e;
        r1 = r6.intValue();
        r0 = r0.get(r1, r3);
        if (r0 != r3) goto L_0x00a7;
    L_0x0090:
        r5 = "MediaCodecUtil";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Unknown AVC level: ";
        r0.append(r1);
        r0.append(r6);
        r6 = r0.toString();
        android.util.Log.w(r5, r6);
        return r2;
    L_0x00a7:
        r6 = new android.util.Pair;
        r5 = java.lang.Integer.valueOf(r5);
        r0 = java.lang.Integer.valueOf(r0);
        r6.<init>(r5, r0);
        return r6;
    L_0x00b5:
        r6 = "MediaCodecUtil";	 Catch:{ NumberFormatException -> 0x00cc }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00cc }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x00cc }
        r1 = "Ignoring malformed AVC codec string: ";	 Catch:{ NumberFormatException -> 0x00cc }
        r0.append(r1);	 Catch:{ NumberFormatException -> 0x00cc }
        r0.append(r5);	 Catch:{ NumberFormatException -> 0x00cc }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x00cc }
        android.util.Log.w(r6, r0);	 Catch:{ NumberFormatException -> 0x00cc }
        return r2;
    L_0x00cc:
        r6 = "MediaCodecUtil";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Ignoring malformed AVC codec string: ";
        r0.append(r1);
        r0.append(r5);
        r5 = r0.toString();
        android.util.Log.w(r6, r5);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b(java.lang.String, java.lang.String[]):android.util.Pair<java.lang.Integer, java.lang.Integer>");
    }
}
