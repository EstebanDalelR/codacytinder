package com.google.android.gms.internal;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class ady {
    /* renamed from: a */
    private final ByteBuffer f15088a;

    private ady(ByteBuffer byteBuffer) {
        this.f15088a = byteBuffer;
        this.f15088a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private ady(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m18999a(int i) {
        return i >= 0 ? m19016d(i) : 10;
    }

    /* renamed from: a */
    public static int m19000a(long j) {
        return (j & -128) == 0 ? 1 : (j & -16384) == 0 ? 2 : (j & -2097152) == 0 ? 3 : (j & -268435456) == 0 ? 4 : (j & -34359738368L) == 0 ? 5 : (j & -4398046511104L) == 0 ? 6 : (j & -562949953421312L) == 0 ? 7 : (j & -72057594037927936L) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: a */
    private static int m19001a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            StringBuilder stringBuilder;
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                stringBuilder = new StringBuilder(39);
                                stringBuilder.append("Unpaired surrogate at index ");
                                stringBuilder.append(i2);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                if (i3 < length) {
                    return i3;
                }
                long j = ((long) i3) + 4294967296L;
                stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i3 < length) {
            return i3;
        }
        long j2 = ((long) i3) + 4294967296L;
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(j2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    private static int m19002a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        i2 += i;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + i;
            if (i4 >= i2) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i4] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        i += i3;
        while (i3 < length) {
            int i5;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i < i2) {
                i5 = i + 1;
                bArr[i] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i <= i2 - 2) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 6) | 960);
                i = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i3++;
            } else if ((charAt2 < '?' || '?' < charAt2) && i <= i2 - 3) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 12) | 480);
                i = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            } else if (i <= i2 - 4) {
                i5 = i3 + 1;
                if (i5 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i3 = Character.toCodePoint(charAt2, charAt3);
                        i4 = i + 1;
                        bArr[i] = (byte) ((i3 >>> 18) | 240);
                        i = i4 + 1;
                        bArr[i4] = (byte) (((i3 >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                        i4 = i + 1;
                        bArr[i] = (byte) (((i3 >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                        i = i4 + 1;
                        bArr[i4] = (byte) ((i3 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                        i3 = i5;
                        i3++;
                    } else {
                        i3 = i5;
                    }
                }
                i3--;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("Unpaired surrogate at index ");
                stringBuilder.append(i3);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder(37);
                stringBuilder2.append("Failed writing ");
                stringBuilder2.append(charAt2);
                stringBuilder2.append(" at index ");
                stringBuilder2.append(i);
                throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
            }
            i = i5;
            i3++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m19003a(String str) {
        int a = m19001a((CharSequence) str);
        return m19016d(a) + a;
    }

    /* renamed from: a */
    public static ady m19004a(byte[] bArr) {
        return m19005a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static ady m19005a(byte[] bArr, int i, int i2) {
        return new ady(bArr, 0, i2);
    }

    /* renamed from: a */
    private static void m19006a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(m19002a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            m19014b(charSequence, byteBuffer);
        }
    }

    /* renamed from: b */
    public static int m19007b(int i) {
        return m19016d(i << 3);
    }

    /* renamed from: b */
    public static int m19008b(int i, int i2) {
        return m19007b(i) + m18999a(i2);
    }

    /* renamed from: b */
    public static int m19009b(int i, aee aee) {
        i = m19007b(i);
        int f = aee.m19064f();
        return i + (m19016d(f) + f);
    }

    /* renamed from: b */
    public static int m19010b(int i, String str) {
        return m19007b(i) + m19003a(str);
    }

    /* renamed from: b */
    public static int m19011b(int i, byte[] bArr) {
        return m19007b(i) + m19012b(bArr);
    }

    /* renamed from: b */
    public static int m19012b(byte[] bArr) {
        return m19016d(bArr.length) + bArr.length;
    }

    /* renamed from: b */
    private final void m19013b(long j) throws IOException {
        while ((j & -128) != 0) {
            m19019e((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            j >>>= 7;
        }
        m19019e((int) j);
    }

    /* renamed from: b */
    private static void m19014b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i);
            if (charAt >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                int i2;
                if (charAt < ItemAnimator.FLAG_MOVED) {
                    i2 = (charAt >>> 6) | 960;
                } else {
                    if (charAt >= 55296) {
                        if (57343 >= charAt) {
                            i2 = i + 1;
                            if (i2 != charSequence.length()) {
                                char charAt2 = charSequence.charAt(i2);
                                if (Character.isSurrogatePair(charAt, charAt2)) {
                                    i = Character.toCodePoint(charAt, charAt2);
                                    byteBuffer.put((byte) ((i >>> 18) | 240));
                                    byteBuffer.put((byte) (((i >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                    byteBuffer.put((byte) (((i >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                    byteBuffer.put((byte) ((i & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                    i = i2;
                                    i++;
                                } else {
                                    i = i2;
                                }
                            }
                            i--;
                            StringBuilder stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(i);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    byteBuffer.put((byte) ((charAt >>> 12) | 480));
                    i2 = ((charAt >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                }
                byteBuffer.put((byte) i2);
                charAt = (charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH;
            }
            byteBuffer.put((byte) charAt);
            i++;
        }
    }

    /* renamed from: c */
    private static long m19015c(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: d */
    public static int m19016d(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: d */
    public static int m19017d(int i, long j) {
        return m19007b(i) + m19000a(j);
    }

    /* renamed from: e */
    public static int m19018e(int i, long j) {
        return m19007b(i) + m19000a(m19015c(j));
    }

    /* renamed from: e */
    private final void m19019e(int i) throws IOException {
        byte b = (byte) i;
        if (this.f15088a.hasRemaining()) {
            this.f15088a.put(b);
            return;
        }
        throw new zzfjl(this.f15088a.position(), this.f15088a.limit());
    }

    /* renamed from: a */
    public final void m19020a() {
        if (this.f15088a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f15088a.remaining())}));
        }
    }

    /* renamed from: a */
    public final void m19021a(int i, int i2) throws IOException {
        m19030c(i, 0);
        if (i2 >= 0) {
            m19029c(i2);
        } else {
            m19013b((long) i2);
        }
    }

    /* renamed from: a */
    public final void m19022a(int i, long j) throws IOException {
        m19030c(i, 0);
        m19013b(j);
    }

    /* renamed from: a */
    public final void m19023a(int i, aee aee) throws IOException {
        m19030c(i, 2);
        m19027a(aee);
    }

    /* renamed from: a */
    public final void m19024a(int i, String str) throws IOException {
        m19030c(i, 2);
        try {
            i = m19016d(str.length());
            if (i == m19016d(str.length() * 3)) {
                int position = this.f15088a.position();
                if (this.f15088a.remaining() < i) {
                    throw new zzfjl(position + i, this.f15088a.limit());
                }
                this.f15088a.position(position + i);
                m19006a((CharSequence) str, this.f15088a);
                int position2 = this.f15088a.position();
                this.f15088a.position(position);
                m19029c((position2 - position) - i);
                this.f15088a.position(position2);
                return;
            }
            m19029c(m19001a((CharSequence) str));
            m19006a((CharSequence) str, this.f15088a);
        } catch (Throwable e) {
            zzfjl zzfjl = new zzfjl(this.f15088a.position(), this.f15088a.limit());
            zzfjl.initCause(e);
            throw zzfjl;
        }
    }

    /* renamed from: a */
    public final void m19025a(int i, boolean z) throws IOException {
        m19030c(i, 0);
        byte b = (byte) z;
        if (this.f15088a.hasRemaining()) {
            this.f15088a.put(b);
            return;
        }
        throw new zzfjl(this.f15088a.position(), this.f15088a.limit());
    }

    /* renamed from: a */
    public final void m19026a(int i, byte[] bArr) throws IOException {
        m19030c(i, 2);
        m19029c(bArr.length);
        m19032c(bArr);
    }

    /* renamed from: a */
    public final void m19027a(aee aee) throws IOException {
        m19029c(aee.m19063e());
        aee.mo4218a(this);
    }

    /* renamed from: b */
    public final void m19028b(int i, long j) throws IOException {
        m19030c(i, 0);
        m19013b(j);
    }

    /* renamed from: c */
    public final void m19029c(int i) throws IOException {
        while ((i & -128) != 0) {
            m19019e((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i >>>= 7;
        }
        m19019e(i);
    }

    /* renamed from: c */
    public final void m19030c(int i, int i2) throws IOException {
        m19029c((i << 3) | i2);
    }

    /* renamed from: c */
    public final void m19031c(int i, long j) throws IOException {
        m19030c(i, 0);
        m19013b(m19015c(j));
    }

    /* renamed from: c */
    public final void m19032c(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f15088a.remaining() >= length) {
            this.f15088a.put(bArr, 0, length);
            return;
        }
        throw new zzfjl(this.f15088a.position(), this.f15088a.limit());
    }
}
