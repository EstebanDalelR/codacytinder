package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2314v;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.mediacodec.a */
public final class C2130a {
    /* renamed from: a */
    public final String f6122a;
    @Nullable
    /* renamed from: b */
    public final String f6123b;
    @Nullable
    /* renamed from: c */
    public final CodecCapabilities f6124c;
    /* renamed from: d */
    public final boolean f6125d;
    /* renamed from: e */
    public final boolean f6126e;
    /* renamed from: f */
    public final boolean f6127f;
    /* renamed from: g */
    public final boolean f6128g;

    /* renamed from: a */
    public static C2130a m7659a(String str) {
        return new C2130a(str, null, null, true, false, false);
    }

    /* renamed from: a */
    public static C2130a m7660a(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C2130a(str, str2, codecCapabilities, false, z, z2);
    }

    private C2130a(String str, @Nullable String str2, @Nullable CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.f6122a = (String) C2289a.m8309a((Object) str);
        this.f6123b = str2;
        this.f6124c = codecCapabilities;
        this.f6128g = z;
        str = null;
        z = (z2 || codecCapabilities == null || !C2130a.m7661a(codecCapabilities)) ? false : true;
        this.f6125d = z;
        z = codecCapabilities != null && C2130a.m7665c(codecCapabilities);
        this.f6126e = z;
        if (z3 || !(codecCapabilities == null || C2130a.m7668e(codecCapabilities) == null)) {
            str = true;
        }
        this.f6127f = str;
    }

    /* renamed from: a */
    public CodecProfileLevel[] m7673a() {
        if (this.f6124c != null) {
            if (this.f6124c.profileLevels != null) {
                return this.f6124c.profileLevels;
            }
        }
        return new CodecProfileLevel[0];
    }

    /* renamed from: b */
    public boolean m7675b(String str) {
        if (str != null) {
            if (this.f6123b != null) {
                String f = C2297h.m8347f(str);
                if (f == null) {
                    return true;
                }
                StringBuilder stringBuilder;
                if (this.f6123b.equals(f)) {
                    Pair a = MediaCodecUtil.m7647a(str);
                    if (a == null) {
                        return true;
                    }
                    for (CodecProfileLevel codecProfileLevel : m7673a()) {
                        if (codecProfileLevel.profile == ((Integer) a.first).intValue() && codecProfileLevel.level >= ((Integer) a.second).intValue()) {
                            return true;
                        }
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("codec.profileLevel, ");
                    stringBuilder.append(str);
                    stringBuilder.append(", ");
                    stringBuilder.append(f);
                    m7664c(stringBuilder.toString());
                    return false;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("codec.mime ");
                stringBuilder.append(str);
                stringBuilder.append(", ");
                stringBuilder.append(f);
                m7664c(stringBuilder.toString());
                return false;
            }
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean m7672a(int i, int i2, double d) {
        if (this.f6124c == null) {
            m7664c("sizeAndRate.caps");
            return false;
        }
        VideoCapabilities videoCapabilities = this.f6124c.getVideoCapabilities();
        if (videoCapabilities == null) {
            m7664c("sizeAndRate.vCaps");
            return false;
        }
        if (!C2130a.m7662a(videoCapabilities, i, i2, d)) {
            StringBuilder stringBuilder;
            if (i < i2) {
                if (C2130a.m7662a(videoCapabilities, i2, i, d)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("sizeAndRate.rotated, ");
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(i2);
                    stringBuilder.append("x");
                    stringBuilder.append(d);
                    m7666d(stringBuilder.toString());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("sizeAndRate.support, ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            stringBuilder.append("x");
            stringBuilder.append(d);
            m7664c(stringBuilder.toString());
            return false;
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: a */
    public Point m7670a(int i, int i2) {
        if (this.f6124c == null) {
            m7664c("align.caps");
            return null;
        }
        VideoCapabilities videoCapabilities = this.f6124c.getVideoCapabilities();
        if (videoCapabilities == null) {
            m7664c("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C2314v.m8455a(i, widthAlignment) * widthAlignment, C2314v.m8455a(i2, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean m7671a(int i) {
        if (this.f6124c == null) {
            m7664c("sampleRate.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = this.f6124c.getAudioCapabilities();
        if (audioCapabilities == null) {
            m7664c("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sampleRate.support, ");
            stringBuilder.append(i);
            m7664c(stringBuilder.toString());
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    public boolean m7674b(int i) {
        if (this.f6124c == null) {
            m7664c("channelCount.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = this.f6124c.getAudioCapabilities();
        if (audioCapabilities == null) {
            m7664c("channelCount.aCaps");
            return false;
        } else if (C2130a.m7658a(this.f6122a, this.f6123b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("channelCount.support, ");
            stringBuilder.append(i);
            m7664c(stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: c */
    private void m7664c(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NoSupport [");
        stringBuilder.append(str);
        stringBuilder.append("] [");
        stringBuilder.append(this.f6122a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6123b);
        stringBuilder.append("] [");
        stringBuilder.append(C2314v.f6960e);
        stringBuilder.append("]");
        Log.d("MediaCodecInfo", stringBuilder.toString());
    }

    /* renamed from: d */
    private void m7666d(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssumedSupport [");
        stringBuilder.append(str);
        stringBuilder.append("] [");
        stringBuilder.append(this.f6122a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f6123b);
        stringBuilder.append("] [");
        stringBuilder.append(C2314v.f6960e);
        stringBuilder.append("]");
        Log.d("MediaCodecInfo", stringBuilder.toString());
    }

    /* renamed from: a */
    private static int m7658a(String str, String str2, int i) {
        if (i <= 1) {
            if (C2314v.f6956a < 26 || i <= 0) {
                if (!("audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2))) {
                    if (!"audio/gsm".equals(str2)) {
                        str2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) != null ? 16 : 30;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("AssumedMaxChannelAdjustment: ");
                        stringBuilder.append(str);
                        stringBuilder.append(", [");
                        stringBuilder.append(i);
                        stringBuilder.append(" to ");
                        stringBuilder.append(str2);
                        stringBuilder.append("]");
                        Log.w("MediaCodecInfo", stringBuilder.toString());
                        return str2;
                    }
                }
                return i;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m7661a(CodecCapabilities codecCapabilities) {
        return (C2314v.f6956a < 19 || C2130a.m7663b(codecCapabilities) == null) ? null : true;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m7663b(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: c */
    private static boolean m7665c(CodecCapabilities codecCapabilities) {
        return (C2314v.f6956a < 21 || C2130a.m7667d(codecCapabilities) == null) ? null : true;
    }

    @TargetApi(21)
    /* renamed from: d */
    private static boolean m7667d(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: e */
    private static boolean m7668e(CodecCapabilities codecCapabilities) {
        return (C2314v.f6956a < 21 || C2130a.m7669f(codecCapabilities) == null) ? null : true;
    }

    @TargetApi(21)
    /* renamed from: f */
    private static boolean m7669f(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @TargetApi(21)
    /* renamed from: a */
    private static boolean m7662a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d != -1.0d) {
            if (d > 0.0d) {
                return videoCapabilities.areSizeAndRateSupported(i, i2, d);
            }
        }
        return videoCapabilities.isSizeSupported(i, i2);
    }
}
