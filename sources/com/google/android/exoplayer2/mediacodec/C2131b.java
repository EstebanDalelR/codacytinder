package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.mediacodec.b */
public final class C2131b {
    /* renamed from: a */
    public static void m7680a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("csd-");
            stringBuilder.append(i);
            mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: a */
    public static void m7678a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: a */
    public static void m7677a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: a */
    public static void m7679a(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: a */
    public static void m7676a(MediaFormat mediaFormat, @Nullable ColorInfo colorInfo) {
        if (colorInfo != null) {
            C2131b.m7678a(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            C2131b.m7678a(mediaFormat, "color-standard", colorInfo.colorSpace);
            C2131b.m7678a(mediaFormat, "color-range", colorInfo.colorRange);
            C2131b.m7679a(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }
}
