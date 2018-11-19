package com.leanplum.p069a;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.leanplum.a.y */
final class C5729y {
    /* renamed from: A */
    private static final int f21284A = 8;
    /* renamed from: B */
    private static final int f21285B = 9;
    /* renamed from: C */
    private static final int f21286C = 10;
    /* renamed from: D */
    private static final List<Integer> f21287D = Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10)});
    /* renamed from: E */
    private static final List<Integer> f21288E = Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2)});
    /* renamed from: n */
    private static final int f21289n = 255;
    /* renamed from: o */
    private static final int f21290o = 128;
    /* renamed from: p */
    private static final int f21291p = 128;
    /* renamed from: q */
    private static final int f21292q = 64;
    /* renamed from: r */
    private static final int f21293r = 32;
    /* renamed from: s */
    private static final int f21294s = 16;
    /* renamed from: t */
    private static final int f21295t = 15;
    /* renamed from: u */
    private static final int f21296u = 127;
    /* renamed from: v */
    private static final int f21297v = 1;
    /* renamed from: w */
    private static final int f21298w = 2;
    /* renamed from: x */
    private static final int f21299x = 0;
    /* renamed from: y */
    private static final int f21300y = 1;
    /* renamed from: z */
    private static final int f21301z = 2;
    /* renamed from: a */
    private ak f21302a;
    /* renamed from: b */
    private boolean f21303b = true;
    /* renamed from: c */
    private int f21304c;
    /* renamed from: d */
    private boolean f21305d;
    /* renamed from: e */
    private boolean f21306e;
    /* renamed from: f */
    private int f21307f;
    /* renamed from: g */
    private int f21308g;
    /* renamed from: h */
    private int f21309h;
    /* renamed from: i */
    private int f21310i;
    /* renamed from: j */
    private byte[] f21311j = new byte[0];
    /* renamed from: k */
    private byte[] f21312k = new byte[0];
    /* renamed from: l */
    private boolean f21313l = false;
    /* renamed from: m */
    private ByteArrayOutputStream f21314m = new ByteArrayOutputStream();

    public C5729y(ak akVar) {
        this.f21302a = akVar;
    }

    /* renamed from: a */
    private static byte[] m25163a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length == 0) {
            return bArr;
        }
        for (int i2 = 0; i2 < bArr.length - i; i2++) {
            int i3 = i + i2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i2 % 4]);
        }
        return bArr;
    }

    /* renamed from: a */
    public final void m25173a(C5730z c5730z) throws IOException {
        while (true) {
            boolean z = false;
            if (c5730z.available() != -1) {
                int i = 8;
                int i2 = 3;
                byte readByte;
                byte[] a;
                int length;
                switch (this.f21304c) {
                    case 0:
                        readByte = c5730z.readByte();
                        Object obj = (readByte & 64) == 64 ? 1 : null;
                        Object obj2 = (readByte & 32) == 32 ? 1 : null;
                        Object obj3 = (readByte & 16) == 16 ? 1 : null;
                        if (obj == null && obj2 == null) {
                            if (obj3 == null) {
                                this.f21305d = (readByte & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                                this.f21307f = readByte & 15;
                                this.f21311j = new byte[0];
                                this.f21312k = new byte[0];
                                if (!f21287D.contains(Integer.valueOf(this.f21307f))) {
                                    throw new aa("Bad opcode");
                                } else if (f21288E.contains(Integer.valueOf(this.f21307f)) || this.f21305d) {
                                    this.f21304c = 1;
                                    break;
                                } else {
                                    throw new aa("Expected non-final packet");
                                }
                            }
                        }
                        throw new aa("RSV not zero");
                    case 1:
                        readByte = c5730z.readByte();
                        if ((readByte & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            z = true;
                        }
                        this.f21306e = z;
                        this.f21309h = readByte & f21296u;
                        if (this.f21309h >= 0 && this.f21309h <= 125) {
                            if (!this.f21306e) {
                                i2 = 4;
                            }
                            this.f21304c = i2;
                            break;
                        }
                        if (this.f21309h == 126) {
                            i = 2;
                        }
                        this.f21308g = i;
                        this.f21304c = 2;
                        break;
                    case 2:
                        a = c5730z.m25176a(this.f21308g);
                        length = a.length;
                        if (a.length < length) {
                            throw new IllegalArgumentException("length must be less than or equal to b.length");
                        }
                        long j = 0;
                        int i3;
                        while (i3 < length) {
                            int i4 = ((length - 1) - i3) << 3;
                            i3++;
                            j += (long) ((a[i3] & f21289n) << i4);
                        }
                        if (j >= 0) {
                            if (j <= 2147483647L) {
                                this.f21309h = (int) j;
                                if (!this.f21306e) {
                                    i2 = 4;
                                }
                                this.f21304c = i2;
                                break;
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder("Bad integer: ");
                        stringBuilder.append(j);
                        throw new aa(stringBuilder.toString());
                    case 3:
                        this.f21311j = c5730z.m25176a(4);
                        this.f21304c = 4;
                        break;
                    case 4:
                        this.f21312k = c5730z.m25176a(this.f21309h);
                        Object a2 = C5729y.m25163a(this.f21312k, this.f21311j, 0);
                        i2 = this.f21307f;
                        if (i2 == 0) {
                            if (this.f21310i == 0) {
                                throw new aa("Mode was not set.");
                            }
                            this.f21314m.write(a2);
                            if (this.f21305d) {
                                a = this.f21314m.toByteArray();
                                if (this.f21310i == 1) {
                                    this.f21302a.m25055b().mo6207a(C5729y.m25170c(a));
                                } else {
                                    this.f21302a.m25055b().mo6204a();
                                }
                                this.f21310i = 0;
                                this.f21314m.reset();
                            }
                        } else if (i2 == 1) {
                            if (this.f21305d) {
                                this.f21302a.m25055b().mo6207a(C5729y.m25170c((byte[]) a2));
                            } else {
                                this.f21310i = 1;
                                this.f21314m.write(a2);
                            }
                        } else if (i2 == 2) {
                            if (this.f21305d) {
                                this.f21302a.m25055b().mo6204a();
                            } else {
                                this.f21310i = 2;
                                this.f21314m.write(a2);
                            }
                        } else if (i2 == 8) {
                            String c;
                            length = a2.length >= 2 ? (a2[0] * 256) + a2[1] : 0;
                            if (a2.length > 2) {
                                int length2 = a2.length;
                                if (2 > length2) {
                                    throw new IllegalArgumentException();
                                }
                                i = a2.length;
                                if (2 > i) {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                                length2 -= 2;
                                i = Math.min(length2, i - 2);
                                byte[] bArr = new byte[length2];
                                System.arraycopy(a2, 2, bArr, 0, i);
                                c = C5729y.m25170c(bArr);
                            } else {
                                c = null;
                            }
                            this.f21302a.m25055b().mo6205a(length, c);
                        } else if (i2 == 9) {
                            if (a2.length > 125) {
                                throw new aa("Ping payload too large");
                            }
                            this.f21302a.m25057b(m25159a(a2, 10, -1));
                        }
                        this.f21304c = 0;
                        break;
                    default:
                        break;
                }
            }
            this.f21302a.m25055b().mo6205a(0, "EOF");
            return;
        }
    }

    /* renamed from: a */
    private void m25157a(byte b) throws aa {
        Object obj = (b & 64) == 64 ? 1 : null;
        Object obj2 = (b & 32) == 32 ? 1 : null;
        Object obj3 = (b & 16) == 16 ? 1 : null;
        if (obj == null && obj2 == null) {
            if (obj3 == null) {
                this.f21305d = (b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH;
                this.f21307f = b & 15;
                this.f21311j = new byte[0];
                this.f21312k = new byte[0];
                if (f21287D.contains(Integer.valueOf(this.f21307f)) == (byte) 0) {
                    throw new aa("Bad opcode");
                } else if (f21288E.contains(Integer.valueOf(this.f21307f)) == (byte) 0 && this.f21305d == (byte) 0) {
                    throw new aa("Expected non-final packet");
                } else {
                    this.f21304c = 1;
                    return;
                }
            }
        }
        throw new aa("RSV not zero");
    }

    /* renamed from: b */
    private void m25165b(byte b) {
        this.f21306e = (b & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH;
        this.f21309h = b & f21296u;
        if (this.f21309h < (byte) 0 || this.f21309h > (byte) 125) {
            this.f21308g = this.f21309h == (byte) 126 ? (byte) 2 : (byte) 8;
            this.f21304c = 2;
            return;
        }
        this.f21304c = this.f21306e != (byte) 0 ? (byte) 3 : (byte) 4;
    }

    /* renamed from: a */
    private byte[] m25162a(byte[] bArr, int i, int i2) {
        return m25159a((Object) bArr, i, -1);
    }

    /* renamed from: a */
    private byte[] m25160a(String str, int i, int i2) {
        return m25159a((Object) str, i, i2);
    }

    /* renamed from: a */
    private byte[] m25159a(Object obj, int i, int i2) {
        Object obj2 = obj;
        int i3 = i2;
        if (this.f21313l) {
            return null;
        }
        int i4;
        int i5;
        obj2 = obj2 instanceof String ? C5729y.m25171c((String) obj2) : (byte[]) obj2;
        int i6 = i3 > 0 ? 2 : 0;
        int length = obj2.length + i6;
        int i7 = length <= 125 ? 2 : length <= 65535 ? 4 : 10;
        int i8 = (r0.f21303b ? 4 : 0) + i7;
        int i9 = r0.f21303b ? ProfileEditingConfig.DEFAULT_MAX_LENGTH : 0;
        byte[] bArr = new byte[(length + i8)];
        bArr[0] = (byte) (((byte) i) | -128);
        if (length <= 125) {
            bArr[1] = (byte) (length | i9);
        } else if (length <= 65535) {
            bArr[1] = (byte) (i9 | 126);
            bArr[2] = (byte) ((int) Math.floor((double) (((float) length) / 256.0f)));
            bArr[3] = (byte) length;
        } else {
            bArr[1] = (byte) (i9 | f21296u);
            double d = (double) length;
            i4 = i6;
            i5 = i7;
            bArr[2] = (byte) ((int) Math.floor(d / Math.pow(2.0d, 56.0d)));
            bArr[3] = (byte) ((int) Math.floor(d / Math.pow(2.0d, 48.0d)));
            bArr[4] = (byte) ((int) Math.floor(d / Math.pow(2.0d, 40.0d)));
            bArr[5] = (byte) ((int) Math.floor(d / Math.pow(2.0d, 32.0d)));
            bArr[6] = (byte) ((int) Math.floor(d / Math.pow(2.0d, 24.0d)));
            bArr[7] = (byte) ((int) Math.floor(d / Math.pow(2.0d, 16.0d)));
            bArr[8] = (byte) ((int) Math.floor(d / Math.pow(2.0d, 8.0d)));
            bArr[9] = (byte) length;
            if (i3 > 0) {
                bArr[i8] = (byte) ((int) Math.floor((double) (((float) i3) / 256.0f)));
                bArr[i8 + 1] = (byte) i3;
            }
            System.arraycopy(obj2, 0, bArr, i8 + i4, obj2.length);
            if (r0.f21303b) {
                byte[] bArr2 = new byte[]{(byte) ((int) Math.floor(Math.random() * 256.0d)), (byte) ((int) Math.floor(Math.random() * 256.0d)), (byte) ((int) Math.floor(Math.random() * 256.0d)), (byte) ((int) Math.floor(Math.random() * 256.0d))};
                System.arraycopy(bArr2, 0, bArr, i5, 4);
                C5729y.m25163a(bArr, bArr2, i8);
            }
            return bArr;
        }
        i4 = i6;
        i5 = i7;
        if (i3 > 0) {
            bArr[i8] = (byte) ((int) Math.floor((double) (((float) i3) / 256.0f)));
            bArr[i8 + 1] = (byte) i3;
        }
        System.arraycopy(obj2, 0, bArr, i8 + i4, obj2.length);
        if (r0.f21303b) {
            byte[] bArr22 = new byte[]{(byte) ((int) Math.floor(Math.random() * 256.0d)), (byte) ((int) Math.floor(Math.random() * 256.0d)), (byte) ((int) Math.floor(Math.random() * 256.0d)), (byte) ((int) Math.floor(Math.random() * 256.0d))};
            System.arraycopy(bArr22, 0, bArr, i5, 4);
            C5729y.m25163a(bArr, bArr22, i8);
        }
        return bArr;
    }

    /* renamed from: b */
    private void m25166b(String str) {
        this.f21302a.m25054a(m25159a((Object) str, 9, -1));
    }

    /* renamed from: a */
    private void m25158a(int i, String str) {
        if (!this.f21313l) {
            this.f21302a.m25054a(m25159a((Object) str, 8, i));
            this.f21313l = true;
        }
    }

    /* renamed from: a */
    private void m25156a() throws IOException {
        byte[] a = C5729y.m25163a(this.f21312k, this.f21311j, 0);
        int i = this.f21307f;
        if (i == 0) {
            if (this.f21310i == 0) {
                throw new aa("Mode was not set.");
            }
            this.f21314m.write(a);
            if (this.f21305d) {
                a = this.f21314m.toByteArray();
                if (this.f21310i == 1) {
                    this.f21302a.m25055b().mo6207a(C5729y.m25170c(a));
                } else {
                    this.f21302a.m25055b().mo6204a();
                }
                this.f21310i = 0;
                this.f21314m.reset();
            }
        } else if (i == 1) {
            if (this.f21305d) {
                this.f21302a.m25055b().mo6207a(C5729y.m25170c(a));
                return;
            }
            this.f21310i = 1;
            this.f21314m.write(a);
        } else if (i == 2) {
            if (this.f21305d) {
                this.f21302a.m25055b().mo6204a();
                return;
            }
            this.f21310i = 2;
            this.f21314m.write(a);
        } else if (i == 8) {
            String c;
            i = a.length >= 2 ? (a[0] * 256) + a[1] : 0;
            if (a.length > 2) {
                int length = a.length;
                if (2 > length) {
                    throw new IllegalArgumentException();
                }
                int length2 = a.length;
                if (2 > length2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                length -= 2;
                length2 = Math.min(length, length2 - 2);
                byte[] bArr = new byte[length];
                System.arraycopy(a, 2, bArr, 0, length2);
                c = C5729y.m25170c(bArr);
            } else {
                c = null;
            }
            this.f21302a.m25055b().mo6205a(i, c);
        } else if (i == 9) {
            if (a.length > 125) {
                throw new aa("Ping payload too large");
            }
            this.f21302a.m25057b(m25162a(a, 10, -1));
        }
    }

    /* renamed from: b */
    private void m25164b() {
        this.f21310i = 0;
        this.f21314m.reset();
    }

    /* renamed from: c */
    private static String m25170c(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (byte[] bArr2) {
            throw new RuntimeException(bArr2);
        }
    }

    /* renamed from: c */
    private static byte[] m25171c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (String str2) {
            throw new RuntimeException(str2);
        }
    }

    /* renamed from: d */
    private static int m25172d(byte[] bArr) throws aa {
        int length = bArr.length;
        if (bArr.length < length) {
            throw new IllegalArgumentException("length must be less than or equal to b.length");
        }
        int i = 0;
        long j = 0;
        while (i < length) {
            int i2 = ((length - 1) - i) << 3;
            i++;
            j += (long) ((bArr[i] & f21289n) << i2);
        }
        if (j >= 0) {
            if (j <= 2147483647L) {
                return (int) j;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Bad integer: ");
        stringBuilder.append(j);
        throw new aa(stringBuilder.toString());
    }

    /* renamed from: b */
    private static byte[] m25168b(byte[] bArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length;
        if (i >= 0) {
            if (i <= length) {
                i2 -= i;
                length = Math.min(i2, length - i);
                i2 = new byte[i2];
                System.arraycopy(bArr, i, i2, 0, length);
                return i2;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: a */
    private static byte[] m25161a(byte[] bArr, int i) {
        i = bArr.length;
        if (2 > i) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length;
        if (2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i -= 2;
        length = Math.min(i, length - 2);
        i = new byte[i];
        System.arraycopy(bArr, 2, i, 0, length);
        return i;
    }

    /* renamed from: c */
    private static long m25169c(byte[] bArr, int i, int i2) {
        if (bArr.length < i2) {
            throw new IllegalArgumentException("length must be less than or equal to b.length");
        }
        long j = 0;
        i = 0;
        while (i < i2) {
            int i3 = ((i2 - 1) - i) << 3;
            i++;
            j += (long) ((bArr[i] & f21289n) << i3);
        }
        return j;
    }

    /* renamed from: b */
    private void m25167b(byte[] bArr) throws aa {
        int length = bArr.length;
        if (bArr.length < length) {
            throw new IllegalArgumentException("length must be less than or equal to b.length");
        }
        int i = 0;
        long j = 0;
        while (true) {
            int i2 = 3;
            if (i >= length) {
                break;
            }
            i2 = ((length - 1) - i) << 3;
            i++;
            j += (long) ((bArr[i] & f21289n) << i2);
        }
        if (j >= 0) {
            if (j <= 2147483647L) {
                this.f21309h = (int) j;
                if (this.f21306e == null) {
                    i2 = 4;
                }
                this.f21304c = i2;
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Bad integer: ");
        stringBuilder.append(j);
        throw new aa(stringBuilder.toString());
    }

    /* renamed from: a */
    public final byte[] m25174a(String str) {
        return m25159a((Object) str, 1, -1);
    }

    /* renamed from: a */
    public final byte[] m25175a(byte[] bArr) {
        return m25159a((Object) bArr, 2, -1);
    }
}
