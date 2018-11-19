package com.google.android.m4b.maps.cu;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.m4b.maps.cu.a */
public final class C5301a {
    /* renamed from: a */
    private final ByteBuffer f19682a;

    /* renamed from: com.google.android.m4b.maps.cu.a$a */
    public static class C5300a extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        C5300a(int i, int i2) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append(valueOf);
            stringBuilder.append(i);
            stringBuilder.append(" limit ");
            stringBuilder.append(i2);
            stringBuilder.append(").");
            super(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public static int m23499c(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: c */
    private static int m23501c(long j) {
        return (j & -128) == 0 ? 1 : (j & -16384) == 0 ? 2 : (j & -2097152) == 0 ? 3 : (j & -268435456) == 0 ? 4 : (j & -34359738368L) == 0 ? 5 : (j & -4398046511104L) == 0 ? 6 : (j & -562949953421312L) == 0 ? 7 : (j & -72057594037927936L) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d */
    private static long m23503d(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private C5301a(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private C5301a(ByteBuffer byteBuffer) {
        this.f19682a = byteBuffer;
        this.f19682a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static C5301a m23489a(byte[] bArr) {
        return C5301a.m23490a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C5301a m23490a(byte[] bArr, int i, int i2) {
        return new C5301a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void m23507a(int i, long j) {
        m23517c(i, 0);
        m23497b(j);
    }

    /* renamed from: a */
    public final void m23506a(int i, int i2) {
        m23517c(i, 0);
        if (i2 >= 0) {
            m23514b(i2);
        } else {
            m23497b((long) i2);
        }
    }

    /* renamed from: a */
    public final void m23510a(int i, boolean z) {
        m23517c(i, 0);
        m23504d((int) z);
    }

    /* renamed from: a */
    public final void m23509a(int i, String str) {
        m23517c(i, 2);
        try {
            i = C5301a.m23499c(str.length());
            if (i == C5301a.m23499c(str.length() * 3)) {
                int position = this.f19682a.position();
                if (this.f19682a.remaining() < i) {
                    throw new C5300a(position + i, this.f19682a.limit());
                }
                this.f19682a.position(position + i);
                C5301a.m23491a((CharSequence) str, this.f19682a);
                str = this.f19682a.position();
                this.f19682a.position(position);
                m23514b((str - position) - i);
                this.f19682a.position(str);
                return;
            }
            m23514b(C5301a.m23487a((CharSequence) str));
            C5301a.m23491a((CharSequence) str, this.f19682a);
        } catch (int i2) {
            str = new C5300a(this.f19682a.position(), this.f19682a.limit());
            str.initCause(i2);
            throw str;
        }
    }

    /* renamed from: a */
    public final void m23508a(int i, C5306g c5306g) {
        m23517c(i, 2);
        m23513a(c5306g);
    }

    /* renamed from: a */
    public final void m23511a(int i, byte[] bArr) {
        m23517c(i, 2);
        m23514b(bArr.length);
        m23516b(bArr);
    }

    /* renamed from: b */
    public final void m23515b(int i, long j) {
        m23517c(15, 0);
        m23497b(C5301a.m23503d(j));
    }

    /* renamed from: a */
    private static int m23487a(CharSequence charSequence) {
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
    private static void m23491a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(C5301a.m23488a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (CharSequence charSequence2) {
                byteBuffer = new BufferOverflowException();
                byteBuffer.initCause(charSequence2);
                throw byteBuffer;
            }
        } else {
            C5301a.m23498b(charSequence2, byteBuffer);
        }
    }

    /* renamed from: b */
    private static void m23498b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 'ࠀ') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            } else {
                if (charAt >= '?') {
                    if ('?' >= charAt) {
                        int i2 = i + 1;
                        if (i2 != charSequence.length()) {
                            char charAt2 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(charAt, charAt2)) {
                                i = Character.toCodePoint(charAt, charAt2);
                                byteBuffer.put((byte) ((i >>> 18) | 240));
                                byteBuffer.put((byte) (((i >>> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                byteBuffer.put((byte) (((i >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                byteBuffer.put((byte) ((i & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                                i = i2;
                            } else {
                                i = i2;
                            }
                        }
                        i--;
                        byteBuffer = new StringBuilder(39);
                        byteBuffer.append("Unpaired surrogate at index ");
                        byteBuffer.append(i);
                        throw new IllegalArgumentException(byteBuffer.toString());
                    }
                }
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                byteBuffer.put((byte) ((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
            }
            i++;
        }
    }

    /* renamed from: a */
    private static int m23488a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                bArr = new StringBuilder(39);
                bArr.append("Unpaired surrogate at index ");
                bArr.append(i3);
                throw new IllegalArgumentException(bArr.toString());
            } else {
                bArr = new StringBuilder(37);
                bArr.append("Failed writing ");
                bArr.append(charAt2);
                bArr.append(" at index ");
                bArr.append(i);
                throw new ArrayIndexOutOfBoundsException(bArr.toString());
            }
            i = i5;
            i3++;
        }
        return i;
    }

    /* renamed from: a */
    public final void m23513a(C5306g c5306g) {
        m23514b(c5306g.m23535e());
        c5306g.mo5392a(this);
    }

    /* renamed from: c */
    public static int m23500c(int i, long j) {
        return C5301a.m23486a(i) + C5301a.m23501c(j);
    }

    /* renamed from: b */
    public static int m23492b(int i, int i2) {
        return C5301a.m23486a(i) + (i2 >= 0 ? C5301a.m23499c(i2) : 10);
    }

    /* renamed from: b */
    public static int m23495b(int i, boolean z) {
        return C5301a.m23486a(i) + 1;
    }

    /* renamed from: b */
    public static int m23494b(int i, String str) {
        i = C5301a.m23486a(i);
        int a = C5301a.m23487a((CharSequence) str);
        return i + (C5301a.m23499c(a) + a);
    }

    /* renamed from: b */
    public static int m23493b(int i, C5306g c5306g) {
        i = C5301a.m23486a(i);
        int f = c5306g.m23536f();
        return i + (C5301a.m23499c(f) + f);
    }

    /* renamed from: b */
    public static int m23496b(int i, byte[] bArr) {
        return C5301a.m23486a(i) + (C5301a.m23499c(bArr.length) + bArr.length);
    }

    /* renamed from: d */
    public static int m23502d(int i, long j) {
        return C5301a.m23486a(15) + C5301a.m23501c(C5301a.m23503d(j));
    }

    /* renamed from: b */
    public final void m23516b(byte[] bArr) {
        int length = bArr.length;
        if (this.f19682a.remaining() >= length) {
            this.f19682a.put(bArr, 0, length);
            return;
        }
        throw new C5300a(this.f19682a.position(), this.f19682a.limit());
    }

    /* renamed from: c */
    public final void m23517c(int i, int i2) {
        m23514b(C5309j.m23543a(i, i2));
    }

    /* renamed from: a */
    public static int m23486a(int i) {
        return C5301a.m23499c(C5309j.m23543a(i, 0));
    }

    /* renamed from: b */
    public final void m23514b(int i) {
        while ((i & -128) != 0) {
            m23504d((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i >>>= 7;
        }
        m23504d(i);
    }

    /* renamed from: b */
    private void m23497b(long j) {
        while ((j & -128) != 0) {
            m23504d((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            j >>>= 7;
        }
        m23504d((int) j);
    }

    /* renamed from: a */
    public final void m23512a(long j) {
        if (this.f19682a.remaining() < 8) {
            throw new C5300a(this.f19682a.position(), this.f19682a.limit());
        }
        this.f19682a.putLong(j);
    }

    /* renamed from: a */
    public final void m23505a() {
        if (this.f19682a.remaining() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d */
    private void m23504d(int i) {
        i = (byte) i;
        if (this.f19682a.hasRemaining()) {
            this.f19682a.put(i);
            return;
        }
        throw new C5300a(this.f19682a.position(), this.f19682a.limit());
    }
}
