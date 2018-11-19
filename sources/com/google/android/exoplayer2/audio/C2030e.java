package com.google.android.exoplayer2.audio;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.C2301j;
import com.tinder.domain.config.model.ProfileEditingConfig;
import io.fabric.sdk.android.services.events.C15645a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.e */
public final class C2030e {
    /* renamed from: a */
    private static final int[] f5572a = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    /* renamed from: b */
    private static final int[] f5573b = new int[]{-1, C15645a.MAX_BYTE_SIZE_PER_FILE, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    /* renamed from: c */
    private static final int[] f5574c = new int[]{64, 112, ProfileEditingConfig.DEFAULT_MAX_LENGTH, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, ItemAnimator.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static boolean m7313a(int i) {
        if (!(i == 2147385345 || i == -25230976 || i == 536864768)) {
            if (i != -14745368) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static Format m7312a(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        C2301j c = C2030e.m7315c(bArr);
        c.m8370b(60);
        int i = f5572a[c.m8373c(6)];
        int i2 = f5573b[c.m8373c(4)];
        int c2 = c.m8373c(5);
        int i3 = c2 >= f5574c.length ? -1 : (f5574c[c2] * AdError.NETWORK_ERROR_CODE) / 2;
        c.m8370b(10);
        return Format.createAudioSampleFormat(str, "audio/vnd.dts", null, i3, -1, i + (c.m8373c(2) > 0 ? 1 : 0), i2, null, drmInitData, 0, str2);
    }

    /* renamed from: a */
    public static int m7311a(byte[] bArr) {
        byte b = bArr[0];
        if (b != (byte) 31) {
            switch (b) {
                case (byte) -2:
                    bArr = ((bArr[4] & 252) >> 2) | ((bArr[5] & 1) << 6);
                    break;
                case (byte) -1:
                    bArr = ((bArr[7] & 60) >> 2) | ((bArr[4] & 7) << 4);
                    break;
                default:
                    bArr = ((bArr[5] & 252) >> 2) | ((bArr[4] & 1) << 6);
                    break;
            }
        }
        bArr = ((bArr[6] & 60) >> 2) | ((bArr[5] & 7) << 4);
        return (bArr + 1) * 32;
    }

    /* renamed from: a */
    public static int m7310a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte b = byteBuffer.get(position);
        if (b != (byte) 31) {
            switch (b) {
                case (byte) -2:
                    byteBuffer = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
                    break;
                case (byte) -1:
                    byteBuffer = ((byteBuffer.get(position + 7) & 60) >> 2) | ((byteBuffer.get(position + 4) & 7) << 4);
                    break;
                default:
                    byteBuffer = ((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6);
                    break;
            }
        }
        byteBuffer = ((byteBuffer.get(position + 6) & 60) >> 2) | ((byteBuffer.get(position + 5) & 7) << 4);
        return (byteBuffer + 1) * 32;
    }

    /* renamed from: b */
    public static int m7314b(byte[] bArr) {
        int i = 0;
        byte b = bArr[0];
        if (b != (byte) 31) {
            switch (b) {
                case (byte) -2:
                    bArr = (((bArr[6] & 240) >> 4) | (((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4))) + 1;
                    break;
                case (byte) -1:
                    bArr = (((bArr[9] & 60) >> 2) | (((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4))) + 1;
                    break;
                default:
                    bArr = (((bArr[7] & 240) >> 4) | (((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4))) + 1;
                    break;
            }
        }
        bArr = (((bArr[8] & 60) >> 2) | (((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4))) + 1;
        i = 1;
        return i != 0 ? (bArr * 16) / 14 : bArr;
    }

    /* renamed from: c */
    private static C2301j m7315c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C2301j(bArr);
        }
        bArr = Arrays.copyOf(bArr, bArr.length);
        if (C2030e.m7316d(bArr)) {
            for (int i = 0; i < bArr.length - 1; i += 2) {
                byte b = bArr[i];
                int i2 = i + 1;
                bArr[i] = bArr[i2];
                bArr[i2] = b;
            }
        }
        C2301j c2301j = new C2301j(bArr);
        if (bArr[0] == (byte) 31) {
            C2301j c2301j2 = new C2301j(bArr);
            while (c2301j2.m8363a() >= 16) {
                c2301j2.m8370b(2);
                c2301j.m8365a(c2301j2.m8373c(14), 14);
            }
        }
        c2301j.m8366a(bArr);
        return c2301j;
    }

    /* renamed from: d */
    private static boolean m7316d(byte[] bArr) {
        return bArr[0] == (byte) -2 || bArr[0] == -1;
    }
}
