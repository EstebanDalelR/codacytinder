package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.annotation.Nullable;

public class ByteString implements Serializable, Comparable<ByteString> {
    /* renamed from: a */
    static final char[] f49591a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: b */
    public static final ByteString f49592b = m60581a(new byte[0]);
    private static final long serialVersionUID = 1;
    /* renamed from: c */
    final byte[] f49593c;
    /* renamed from: d */
    transient int f49594d;
    /* renamed from: e */
    transient String f49595e;

    public /* synthetic */ int compareTo(Object obj) {
        return m60593b((ByteString) obj);
    }

    ByteString(byte[] bArr) {
        this.f49593c = bArr;
    }

    /* renamed from: a */
    public static ByteString m60581a(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public static ByteString m60582a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        C15983r.m60641a((long) bArr.length, (long) i, (long) i2);
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new ByteString(obj);
    }

    /* renamed from: a */
    public static ByteString m60580a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        ByteString byteString = new ByteString(str.getBytes(C15983r.f49624a));
        byteString.f49595e = str;
        return byteString;
    }

    /* renamed from: a */
    public String mo13419a() {
        String str = this.f49595e;
        if (str != null) {
            return str;
        }
        str = new String(this.f49593c, C15983r.f49624a);
        this.f49595e = str;
        return str;
    }

    /* renamed from: b */
    public String mo13424b() {
        return C15972b.m60603a(this.f49593c);
    }

    /* renamed from: c */
    public ByteString mo13425c() {
        return m60585d("MD5");
    }

    /* renamed from: d */
    public ByteString mo13426d() {
        return m60585d("SHA-1");
    }

    /* renamed from: e */
    public ByteString mo13427e() {
        return m60585d("SHA-256");
    }

    /* renamed from: d */
    private ByteString m60585d(String str) {
        try {
            return m60581a(MessageDigest.getInstance(str).digest(this.f49593c));
        } catch (String str2) {
            throw new AssertionError(str2);
        }
    }

    @Nullable
    /* renamed from: b */
    public static ByteString m60583b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        str = C15972b.m60605a(str);
        return str != null ? new ByteString(str) : null;
    }

    /* renamed from: f */
    public String mo13429f() {
        char[] cArr = new char[(this.f49593c.length * 2)];
        int i = 0;
        for (byte b : this.f49593c) {
            int i2 = i + 1;
            cArr[i] = f49591a[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = f49591a[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: c */
    public static ByteString m60584c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected hex string: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m60577a(str.charAt(i2)) << 4) + m60577a(str.charAt(i2 + 1)));
            }
            return m60581a(bArr);
        }
    }

    /* renamed from: a */
    private static int m60577a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A') + 10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append(c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static ByteString m60579a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new EOFException();
                }
                i2 += read;
            }
            return new ByteString(bArr);
        }
    }

    /* renamed from: g */
    public ByteString mo13430g() {
        for (int i = 0; i < this.f49593c.length; i++) {
            byte b = this.f49593c[i];
            if (b >= (byte) 65) {
                if (b <= (byte) 90) {
                    byte[] bArr = (byte[]) this.f49593c.clone();
                    bArr[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < bArr.length; i2++) {
                        byte b2 = bArr[i2];
                        if (b2 >= (byte) 65) {
                            if (b2 <= (byte) 90) {
                                bArr[i2] = (byte) (b2 + 32);
                            }
                        }
                    }
                    return new ByteString(bArr);
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public ByteString mo13420a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        } else if (i2 > this.f49593c.length) {
            i2 = new StringBuilder();
            i2.append("endIndex > length(");
            i2.append(this.f49593c.length);
            i2.append(")");
            throw new IllegalArgumentException(i2.toString());
        } else {
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            } else if (i == 0 && i2 == this.f49593c.length) {
                return this;
            } else {
                i2 = new byte[i3];
                System.arraycopy(this.f49593c, i, i2, 0, i3);
                return new ByteString(i2);
            }
        }
    }

    /* renamed from: a */
    public byte mo13418a(int i) {
        return this.f49593c[i];
    }

    /* renamed from: h */
    public int mo13431h() {
        return this.f49593c.length;
    }

    /* renamed from: i */
    public byte[] mo13433i() {
        return (byte[]) this.f49593c.clone();
    }

    /* renamed from: j */
    byte[] mo13434j() {
        return this.f49593c;
    }

    /* renamed from: a */
    void mo13421a(C18549c c18549c) {
        c18549c.m66955a(this.f49593c, 0, this.f49593c.length);
    }

    /* renamed from: a */
    public boolean mo13422a(int i, ByteString byteString, int i2, int i3) {
        return byteString.mo13423a(i2, this.f49593c, i, i3);
    }

    /* renamed from: a */
    public boolean mo13423a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.f49593c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C15983r.m60643a(this.f49593c, i, bArr, i2, i3) != 0;
    }

    /* renamed from: a */
    public final boolean m60592a(ByteString byteString) {
        return mo13422a(0, byteString, 0, byteString.mo13431h());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.mo13431h() == this.f49593c.length && byteString.mo13423a(0, this.f49593c, 0, this.f49593c.length) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int i = this.f49594d;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.f49593c);
        this.f49594d = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public int m60593b(okio.ByteString r10) {
        /*
        r9 = this;
        r0 = r9.mo13431h();
        r1 = r10.mo13431h();
        r2 = java.lang.Math.min(r0, r1);
        r3 = 0;
        r4 = 0;
    L_0x000e:
        r5 = -1;
        r6 = 1;
        if (r4 >= r2) goto L_0x0028;
    L_0x0012:
        r7 = r9.mo13418a(r4);
        r7 = r7 & 255;
        r8 = r10.mo13418a(r4);
        r8 = r8 & 255;
        if (r7 != r8) goto L_0x0023;
    L_0x0020:
        r4 = r4 + 1;
        goto L_0x000e;
    L_0x0023:
        if (r7 >= r8) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r5 = 1;
    L_0x0027:
        return r5;
    L_0x0028:
        if (r0 != r1) goto L_0x002b;
    L_0x002a:
        return r3;
    L_0x002b:
        if (r0 >= r1) goto L_0x002e;
    L_0x002d:
        goto L_0x002f;
    L_0x002e:
        r5 = 1;
    L_0x002f:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.b(okio.ByteString):int");
    }

    public String toString() {
        if (this.f49593c.length == 0) {
            return "[size=0]";
        }
        String a = mo13419a();
        int a2 = m60578a(a, 64);
        StringBuilder stringBuilder;
        if (a2 == -1) {
            if (this.f49593c.length <= 64) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("[hex=");
                stringBuilder.append(mo13429f());
                stringBuilder.append("]");
                a = stringBuilder.toString();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("[size=");
                stringBuilder.append(this.f49593c.length);
                stringBuilder.append(" hex=");
                stringBuilder.append(mo13420a(0, 64).mo13429f());
                stringBuilder.append("…]");
                a = stringBuilder.toString();
            }
            return a;
        }
        String replace = a.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a2 < a.length()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[size=");
            stringBuilder.append(this.f49593c.length);
            stringBuilder.append(" text=");
            stringBuilder.append(replace);
            stringBuilder.append("…]");
            a = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[text=");
            stringBuilder.append(replace);
            stringBuilder.append("]");
            a = stringBuilder.toString();
        }
        return a;
    }

    /* renamed from: a */
    static int m60578a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.readInt();
        r3 = m60579a(r3, r0);
        r0 = okio.ByteString.class;	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r1 = "c";	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r0 = r0.getDeclaredField(r1);	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r1 = 1;	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r0.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r3 = r3.f49593c;	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        r0.set(r2, r3);	 Catch:{ NoSuchFieldException -> 0x0020, IllegalAccessException -> 0x001a }
        return;
    L_0x001a:
        r3 = new java.lang.AssertionError;
        r3.<init>();
        throw r3;
    L_0x0020:
        r3 = new java.lang.AssertionError;
        r3.<init>();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.readObject(java.io.ObjectInputStream):void");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f49593c.length);
        objectOutputStream.write(this.f49593c);
    }
}
