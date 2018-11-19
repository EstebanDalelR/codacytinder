package okhttp3.internal.http2;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

/* renamed from: okhttp3.internal.http2.i */
class C15942i {
    /* renamed from: a */
    private static final int[] f49451a = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    /* renamed from: b */
    private static final byte[] f49452b = new byte[]{(byte) 13, (byte) 23, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 24, (byte) 30, (byte) 28, (byte) 28, (byte) 30, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 30, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 28, (byte) 6, (byte) 10, (byte) 10, (byte) 12, (byte) 13, (byte) 6, (byte) 8, (byte) 11, (byte) 10, (byte) 10, (byte) 8, (byte) 11, (byte) 8, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 5, (byte) 5, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 6, (byte) 7, (byte) 8, (byte) 15, (byte) 6, (byte) 12, (byte) 10, (byte) 13, (byte) 6, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 8, (byte) 7, (byte) 8, (byte) 13, (byte) 19, (byte) 13, (byte) 14, (byte) 6, (byte) 15, (byte) 5, (byte) 6, (byte) 5, (byte) 6, (byte) 5, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 7, (byte) 7, (byte) 6, (byte) 6, (byte) 6, (byte) 5, (byte) 6, (byte) 7, (byte) 6, (byte) 5, (byte) 5, (byte) 6, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 7, (byte) 15, (byte) 11, (byte) 14, (byte) 13, (byte) 28, (byte) 20, (byte) 22, (byte) 20, (byte) 20, (byte) 22, (byte) 22, (byte) 22, (byte) 23, (byte) 22, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 24, (byte) 23, (byte) 24, (byte) 24, (byte) 22, (byte) 23, (byte) 24, (byte) 23, (byte) 23, (byte) 23, (byte) 23, (byte) 21, (byte) 22, (byte) 23, (byte) 22, (byte) 23, (byte) 23, (byte) 24, (byte) 22, (byte) 21, (byte) 20, (byte) 22, (byte) 22, (byte) 23, (byte) 23, (byte) 21, (byte) 23, (byte) 22, (byte) 22, (byte) 24, (byte) 21, (byte) 22, (byte) 23, (byte) 23, (byte) 21, (byte) 21, (byte) 22, (byte) 21, (byte) 23, (byte) 22, (byte) 23, (byte) 23, (byte) 20, (byte) 22, (byte) 22, (byte) 22, (byte) 23, (byte) 22, (byte) 22, (byte) 23, (byte) 26, (byte) 26, (byte) 20, (byte) 19, (byte) 22, (byte) 23, (byte) 22, (byte) 25, (byte) 26, (byte) 26, (byte) 26, (byte) 27, (byte) 27, (byte) 26, (byte) 24, (byte) 25, (byte) 19, (byte) 21, (byte) 26, (byte) 27, (byte) 27, (byte) 26, (byte) 27, (byte) 24, (byte) 21, (byte) 21, (byte) 26, (byte) 26, (byte) 28, (byte) 27, (byte) 27, (byte) 27, (byte) 20, (byte) 24, (byte) 20, (byte) 21, (byte) 22, (byte) 21, (byte) 21, (byte) 23, (byte) 22, (byte) 22, (byte) 25, (byte) 25, (byte) 24, (byte) 24, (byte) 26, (byte) 23, (byte) 26, (byte) 27, (byte) 26, (byte) 26, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 28, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 27, (byte) 26};
    /* renamed from: c */
    private static final C15942i f49453c = new C15942i();
    /* renamed from: d */
    private final C15941a f49454d = new C15941a();

    /* renamed from: okhttp3.internal.http2.i$a */
    private static final class C15941a {
        /* renamed from: a */
        final C15941a[] f49448a;
        /* renamed from: b */
        final int f49449b;
        /* renamed from: c */
        final int f49450c;

        C15941a() {
            this.f49448a = new C15941a[256];
            this.f49449b = 0;
            this.f49450c = 0;
        }

        C15941a(int i, int i2) {
            this.f49448a = null;
            this.f49449b = i;
            i = i2 & 7;
            if (i == 0) {
                i = 8;
            }
            this.f49450c = i;
        }
    }

    /* renamed from: a */
    public static C15942i m60409a() {
        return f49453c;
    }

    private C15942i() {
        m60411b();
    }

    /* renamed from: a */
    void m60413a(ByteString byteString, BufferedSink bufferedSink) throws IOException {
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (i < byteString.mo13431h()) {
            int a = byteString.mo13418a(i) & 255;
            int i3 = f49451a[a];
            byte b = f49452b[a];
            long j2 = (j << b) | ((long) i3);
            i2 += b;
            while (i2 >= 8) {
                i2 -= 8;
                bufferedSink.writeByte((int) (j2 >> i2));
            }
            i++;
            j = j2;
        }
        if (i2 > 0) {
            bufferedSink.writeByte((int) ((j << (8 - i2)) | ((long) (255 >>> i2))));
        }
    }

    /* renamed from: a */
    int m60412a(ByteString byteString) {
        long j = 0;
        int i = 0;
        while (i < byteString.mo13431h()) {
            int a = byteString.mo13418a(i) & 255;
            i++;
            j += (long) f49452b[a];
        }
        return (int) ((j + 7) >> 3);
    }

    /* renamed from: a */
    byte[] m60414a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15941a c15941a = this.f49454d;
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            i = (i << 8) | (b & 255);
            i2 += 8;
            while (i2 >= 8) {
                c15941a = c15941a.f49448a[(i >>> (i2 - 8)) & 255];
                if (c15941a.f49448a == null) {
                    byteArrayOutputStream.write(c15941a.f49449b);
                    i2 -= c15941a.f49450c;
                    c15941a = this.f49454d;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            bArr = c15941a.f49448a[(i << (8 - i2)) & 255];
            if (bArr.f49448a != null) {
                break;
            } else if (bArr.f49450c > i2) {
                break;
            } else {
                byteArrayOutputStream.write(bArr.f49449b);
                i2 -= bArr.f49450c;
                c15941a = this.f49454d;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: b */
    private void m60411b() {
        for (int i = 0; i < f49452b.length; i++) {
            m60410a(i, f49451a[i], f49452b[i]);
        }
    }

    /* renamed from: a */
    private void m60410a(int i, int i2, byte b) {
        int i3;
        C15941a c15941a = new C15941a(i, b);
        i = this.f49454d;
        while (b > (byte) 8) {
            b = (byte) (b - 8);
            i3 = (i2 >>> b) & 255;
            if (i.f49448a == null) {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
            if (i.f49448a[i3] == null) {
                i.f49448a[i3] = new C15941a();
            }
            i = i.f49448a[i3];
        }
        i3 = 8 - b;
        i2 = (i2 << i3) & 255;
        b = (byte) 1 << i3;
        for (i3 = i2; i3 < i2 + b; i3++) {
            i.f49448a[i3] = c15941a;
        }
    }
}
