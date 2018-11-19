package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.google.android.exoplayer2.Format;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: okio.c */
public final class C18549c implements Cloneable, ByteChannel, BufferedSink, BufferedSource {
    /* renamed from: c */
    private static final byte[] f57795c = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    @Nullable
    /* renamed from: a */
    C15980o f57796a;
    /* renamed from: b */
    long f57797b;

    /* renamed from: okio.c$1 */
    class C159731 extends OutputStream {
        /* renamed from: a */
        final /* synthetic */ C18549c f49598a;

        public void close() {
        }

        public void flush() {
        }

        C159731(C18549c c18549c) {
            this.f49598a = c18549c;
        }

        public void write(int i) {
            this.f49598a.m66958b((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f49598a.m66955a(bArr, i, i2);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f49598a);
            stringBuilder.append(".outputStream()");
            return stringBuilder.toString();
        }
    }

    /* renamed from: okio.c$2 */
    class C159742 extends InputStream {
        /* renamed from: a */
        final /* synthetic */ C18549c f49599a;

        public void close() {
        }

        C159742(C18549c c18549c) {
            this.f49599a = c18549c;
        }

        public int read() {
            return this.f49599a.f57797b > 0 ? this.f49599a.readByte() & 255 : -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            return this.f49599a.read(bArr, i, i2);
        }

        public int available() {
            return (int) Math.min(this.f49599a.f57797b, 2147483647L);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f49599a);
            stringBuilder.append(".inputStream()");
            return stringBuilder.toString();
        }
    }

    /* renamed from: okio.c$a */
    public static final class C15975a implements Closeable {
        /* renamed from: a */
        public C18549c f49600a;
        /* renamed from: b */
        public boolean f49601b;
        /* renamed from: c */
        public long f49602c = -1;
        /* renamed from: d */
        public byte[] f49603d;
        /* renamed from: e */
        public int f49604e = -1;
        /* renamed from: f */
        public int f49605f = -1;
        /* renamed from: g */
        private C15980o f49606g;

        /* renamed from: a */
        public int m60606a() {
            if (this.f49602c == this.f49600a.f57797b) {
                throw new IllegalStateException();
            } else if (this.f49602c == -1) {
                return m60607a(0);
            } else {
                return m60607a(this.f49602c + ((long) (this.f49605f - this.f49604e)));
            }
        }

        /* renamed from: a */
        public int m60607a(long j) {
            if (j >= -1) {
                if (j <= this.f49600a.f57797b) {
                    if (j != -1) {
                        if (j != this.f49600a.f57797b) {
                            long j2 = 0;
                            long j3 = this.f49600a.f57797b;
                            C15980o c15980o = this.f49600a.f57796a;
                            C15980o c15980o2 = this.f49600a.f57796a;
                            if (this.f49606g != null) {
                                long j4 = this.f49602c - ((long) (this.f49604e - this.f49606g.f49612b));
                                if (j4 > j) {
                                    c15980o2 = this.f49606g;
                                    j3 = j4;
                                } else {
                                    c15980o = this.f49606g;
                                    j2 = j4;
                                }
                            }
                            if (j3 - j > j - j2) {
                                while (j >= j2 + ((long) (c15980o.f49613c - c15980o.f49612b))) {
                                    long j5 = j2 + ((long) (c15980o.f49613c - c15980o.f49612b));
                                    c15980o = c15980o.f49616f;
                                    j2 = j5;
                                }
                            } else {
                                j2 = j3;
                                c15980o = c15980o2;
                                while (j2 > j) {
                                    c15980o = c15980o.f49617g;
                                    j2 -= (long) (c15980o.f49613c - c15980o.f49612b);
                                }
                            }
                            if (this.f49601b && c15980o.f49614d) {
                                C15980o b = c15980o.m60628b();
                                if (this.f49600a.f57796a == c15980o) {
                                    this.f49600a.f57796a = b;
                                }
                                c15980o = c15980o.m60626a(b);
                                c15980o.f49617g.m60629c();
                            }
                            this.f49606g = c15980o;
                            this.f49602c = j;
                            this.f49603d = c15980o.f49611a;
                            this.f49604e = c15980o.f49612b + ((int) (j - j2));
                            this.f49605f = c15980o.f49613c;
                            return this.f49605f - this.f49604e;
                        }
                    }
                    this.f49606g = null;
                    this.f49602c = j;
                    this.f49603d = null;
                    this.f49604e = -1;
                    this.f49605f = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f49600a.f57797b)}));
        }

        public void close() {
            if (this.f49600a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f49600a = null;
            this.f49606g = null;
            this.f49602c = -1;
            this.f49603d = null;
            this.f49604e = -1;
            this.f49605f = -1;
        }
    }

    /* renamed from: b */
    public C18549c m66957b() {
        return this;
    }

    public C18549c buffer() {
        return this;
    }

    public void close() {
    }

    public BufferedSink emit() {
        return this;
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m66965e();
    }

    public /* synthetic */ BufferedSink emitCompleteSegments() throws IOException {
        return m66957b();
    }

    public /* synthetic */ BufferedSink write(ByteString byteString) throws IOException {
        return m66952a(byteString);
    }

    public /* synthetic */ BufferedSink write(byte[] bArr) throws IOException {
        return m66954a(bArr);
    }

    public /* synthetic */ BufferedSink write(byte[] bArr, int i, int i2) throws IOException {
        return m66955a(bArr, i, i2);
    }

    public /* synthetic */ BufferedSink writeByte(int i) throws IOException {
        return m66958b(i);
    }

    public /* synthetic */ BufferedSink writeDecimalLong(long j) throws IOException {
        return m66967e(j);
    }

    public /* synthetic */ BufferedSink writeHexadecimalUnsignedLong(long j) throws IOException {
        return m66970f(j);
    }

    public /* synthetic */ BufferedSink writeInt(int i) throws IOException {
        return m66966e(i);
    }

    public /* synthetic */ BufferedSink writeIntLe(int i) throws IOException {
        return m66969f(i);
    }

    public /* synthetic */ BufferedSink writeLong(long j) throws IOException {
        return m66961c(j);
    }

    public /* synthetic */ BufferedSink writeLongLe(long j) throws IOException {
        return m66963d(j);
    }

    public /* synthetic */ BufferedSink writeShort(int i) throws IOException {
        return m66960c(i);
    }

    public /* synthetic */ BufferedSink writeShortLe(int i) throws IOException {
        return m66962d(i);
    }

    public /* synthetic */ BufferedSink writeString(String str, int i, int i2, Charset charset) throws IOException {
        return m66950a(str, i, i2, charset);
    }

    public /* synthetic */ BufferedSink writeString(String str, Charset charset) throws IOException {
        return m66951a(str, charset);
    }

    public /* synthetic */ BufferedSink writeUtf8(String str) throws IOException {
        return m66948a(str);
    }

    public /* synthetic */ BufferedSink writeUtf8(String str, int i, int i2) throws IOException {
        return m66949a(str, i, i2);
    }

    public /* synthetic */ BufferedSink writeUtf8CodePoint(int i) throws IOException {
        return m66947a(i);
    }

    /* renamed from: a */
    public long m66945a() {
        return this.f57797b;
    }

    public OutputStream outputStream() {
        return new C159731(this);
    }

    public boolean exhausted() {
        return this.f57797b == 0;
    }

    public void require(long j) throws EOFException {
        if (this.f57797b < j) {
            throw new EOFException();
        }
    }

    public boolean request(long j) {
        return this.f57797b >= j ? 1 : 0;
    }

    public InputStream inputStream() {
        return new C159742(this);
    }

    /* renamed from: a */
    public C18549c m66953a(C18549c c18549c, long j, long j2) {
        if (c18549c == null) {
            throw new IllegalArgumentException("out == null");
        }
        C15983r.m60641a(this.f57797b, j, j2);
        if (j2 == 0) {
            return this;
        }
        c18549c.f57797b += j2;
        C15980o c15980o = this.f57796a;
        while (j >= ((long) (c15980o.f49613c - c15980o.f49612b))) {
            long j3 = j - ((long) (c15980o.f49613c - c15980o.f49612b));
            c15980o = c15980o.f49616f;
            j = j3;
        }
        while (j2 > 0) {
            C15980o a = c15980o.m60624a();
            a.f49612b = (int) (((long) a.f49612b) + j);
            a.f49613c = Math.min(a.f49612b + ((int) j2), a.f49613c);
            if (c18549c.f57796a == null) {
                a.f49617g = a;
                a.f49616f = a;
                c18549c.f57796a = a;
            } else {
                c18549c.f57796a.f49617g.m60626a(a);
            }
            long j4 = j2 - ((long) (a.f49613c - a.f49612b));
            c15980o = c15980o.f49616f;
            j = 0;
            j2 = j4;
        }
        return this;
    }

    /* renamed from: c */
    public long m66959c() {
        long j = this.f57797b;
        if (j == 0) {
            return 0;
        }
        C15980o c15980o = this.f57796a.f49617g;
        if (c15980o.f49613c < 8192 && c15980o.f49615e) {
            j -= (long) (c15980o.f49613c - c15980o.f49612b);
        }
        return j;
    }

    public byte readByte() {
        if (this.f57797b == 0) {
            throw new IllegalStateException("size == 0");
        }
        C15980o c15980o = this.f57796a;
        int i = c15980o.f49612b;
        int i2 = c15980o.f49613c;
        int i3 = i + 1;
        byte b = c15980o.f49611a[i];
        this.f57797b--;
        if (i3 == i2) {
            this.f57796a = c15980o.m60629c();
            C15981p.m60632a(c15980o);
        } else {
            c15980o.f49612b = i3;
        }
        return b;
    }

    /* renamed from: a */
    public byte m66943a(long j) {
        C15983r.m60641a(this.f57797b, j, 1);
        if (this.f57797b - j > j) {
            C15980o c15980o = this.f57796a;
            while (true) {
                long j2 = (long) (c15980o.f49613c - c15980o.f49612b);
                if (j < j2) {
                    return c15980o.f49611a[c15980o.f49612b + ((int) j)];
                }
                long j3 = j - j2;
                c15980o = c15980o.f49616f;
                j = j3;
            }
        } else {
            long j4 = j - this.f57797b;
            j = this.f57796a.f49617g;
            while (true) {
                long j5 = j4 + ((long) (j.f49613c - j.f49612b));
                if (j5 >= 0) {
                    return j.f49611a[j.f49612b + ((int) j5)];
                }
                j = j.f49617g;
                j4 = j5;
            }
        }
    }

    public short readShort() {
        if (this.f57797b < 2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size < 2: ");
            stringBuilder.append(this.f57797b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        C15980o c15980o = this.f57796a;
        int i = c15980o.f49612b;
        int i2 = c15980o.f49613c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c15980o.f49611a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f57797b -= 2;
        if (i4 == i2) {
            this.f57796a = c15980o.m60629c();
            C15981p.m60632a(c15980o);
        } else {
            c15980o.f49612b = i4;
        }
        return (short) i;
    }

    public int readInt() {
        if (this.f57797b < 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size < 4: ");
            stringBuilder.append(this.f57797b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        C15980o c15980o = this.f57796a;
        int i = c15980o.f49612b;
        int i2 = c15980o.f49613c;
        if (i2 - i < 4) {
            return ((((readByte() & 255) << 24) | ((readByte() & 255) << 16)) | ((readByte() & 255) << 8)) | (readByte() & 255);
        }
        byte[] bArr = c15980o.f49611a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        i3 = i4 + 1;
        i |= (bArr[i4] & 255) << 8;
        i4 = i3 + 1;
        i |= bArr[i3] & 255;
        this.f57797b -= 4;
        if (i4 == i2) {
            this.f57796a = c15980o.m60629c();
            C15981p.m60632a(c15980o);
        } else {
            c15980o.f49612b = i4;
        }
        return i;
    }

    public long readLong() {
        if (this.f57797b < 8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size < 8: ");
            stringBuilder.append(r0.f57797b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        C15980o c15980o = r0.f57796a;
        int i = c15980o.f49612b;
        int i2 = c15980o.f49613c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (((long) readInt()) & 4294967295L);
        }
        byte[] bArr = c15980o.f49611a;
        int i3 = i + 1;
        i = i3 + 1;
        i3 = i + 1;
        i = i3 + 1;
        int i4 = i + 1;
        i = i4 + 1;
        i4 = i + 1;
        i = i4 + 1;
        long j = ((((((((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48)) | ((((long) bArr[i]) & 255) << 40)) | ((((long) bArr[i3]) & 255) << 32)) | ((((long) bArr[i]) & 255) << 24)) | ((((long) bArr[i4]) & 255) << 16)) | ((((long) bArr[i]) & 255) << 8)) | (((long) bArr[i4]) & 255);
        r0.f57797b -= 8;
        if (i == i2) {
            r0.f57796a = c15980o.m60629c();
            C15981p.m60632a(c15980o);
        } else {
            c15980o.f49612b = i;
        }
        return j;
    }

    public short readShortLe() {
        return C15983r.m60640a(readShort());
    }

    public int readIntLe() {
        return C15983r.m60638a(readInt());
    }

    public long readLongLe() {
        return C15983r.m60639a(readLong());
    }

    public long readDecimalLong() {
        long j = 0;
        if (this.f57797b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        long j2 = -7;
        Object obj = null;
        Object obj2 = null;
        do {
            C15980o c15980o = r0.f57796a;
            byte[] bArr = c15980o.f49611a;
            int i2 = c15980o.f49612b;
            int i3 = c15980o.f49613c;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= (byte) 48 && b <= (byte) 57) {
                    int i4 = 48 - b;
                    if (j >= -922337203685477580L) {
                        if (j != -922337203685477580L || ((long) i4) >= j2) {
                            j = (j * 10) + ((long) i4);
                        }
                    }
                    C18549c b2 = new C18549c().m66967e(j).m66958b((int) b);
                    if (obj == null) {
                        b2.readByte();
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Number too large: ");
                    stringBuilder.append(b2.readUtf8());
                    throw new NumberFormatException(stringBuilder.toString());
                } else if (b != (byte) 45 || i != 0) {
                    if (i != 0) {
                        obj2 = 1;
                        if (i2 != i3) {
                            r0.f57796a = c15980o.m60629c();
                            C15981p.m60632a(c15980o);
                        } else {
                            c15980o.f49612b = i2;
                        }
                        if (obj2 == null) {
                            break;
                        }
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Expected leading [0-9] or '-' character but was 0x");
                        stringBuilder2.append(Integer.toHexString(b));
                        throw new NumberFormatException(stringBuilder2.toString());
                    }
                } else {
                    j2--;
                    obj = 1;
                }
                i2++;
                i++;
            }
            if (i2 != i3) {
                c15980o.f49612b = i2;
            } else {
                r0.f57796a = c15980o.m60629c();
                C15981p.m60632a(c15980o);
            }
            if (obj2 == null) {
                break;
            }
        } while (r0.f57796a != null);
        r0.f57797b -= (long) i;
        return obj != null ? j : -j;
    }

    public long readHexadecimalUnsignedLong() {
        if (this.f57797b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        long j = 0;
        Object obj = null;
        do {
            C15980o c15980o = r0.f57796a;
            byte[] bArr = c15980o.f49611a;
            int i2 = c15980o.f49612b;
            int i3 = c15980o.f49613c;
            while (i2 < i3) {
                int i4;
                int i5 = bArr[i2];
                if (i5 >= (byte) 48 && i5 <= (byte) 57) {
                    i4 = i5 - 48;
                } else if (i5 >= (byte) 97 && i5 <= (byte) 102) {
                    i4 = (i5 - 97) + 10;
                } else if (i5 < (byte) 65 || i5 > (byte) 70) {
                    if (i != 0) {
                        obj = 1;
                        if (i2 != i3) {
                            r0.f57796a = c15980o.m60629c();
                            C15981p.m60632a(c15980o);
                        } else {
                            c15980o.f49612b = i2;
                        }
                        if (obj == null) {
                            break;
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected leading [0-9a-fA-F] character but was 0x");
                        stringBuilder.append(Integer.toHexString(i5));
                        throw new NumberFormatException(stringBuilder.toString());
                    }
                } else {
                    i4 = (i5 - 65) + 10;
                }
                if ((j & -1152921504606846976L) != 0) {
                    C18549c b = new C18549c().m66970f(j).m66958b(i5);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Number too large: ");
                    stringBuilder2.append(b.readUtf8());
                    throw new NumberFormatException(stringBuilder2.toString());
                }
                i2++;
                i++;
                j = (j << 4) | ((long) i4);
            }
            if (i2 != i3) {
                c15980o.f49612b = i2;
            } else {
                r0.f57796a = c15980o.m60629c();
                C15981p.m60632a(c15980o);
            }
            if (obj == null) {
                break;
            }
        } while (r0.f57796a != null);
        r0.f57797b -= (long) i;
        return j;
    }

    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    public ByteString readByteString(long j) throws EOFException {
        return new ByteString(readByteArray(j));
    }

    public int select(C15977l c15977l) {
        C15980o c15980o = this.f57796a;
        if (c15980o == null) {
            return c15977l.indexOf(ByteString.f49592b);
        }
        c15977l = c15977l.f49608a;
        int length = c15977l.length;
        for (int i = 0; i < length; i++) {
            ByteString byteString = c15977l[i];
            if (this.f57797b >= ((long) byteString.mo13431h())) {
                if (m66942a(c15980o, c15980o.f49612b, byteString, 0, byteString.mo13431h())) {
                    try {
                        skip((long) byteString.mo13431h());
                        return i;
                    } catch (C15977l c15977l2) {
                        throw new AssertionError(c15977l2);
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    int m66944a(C15977l c15977l) {
        C15980o c15980o = this.f57796a;
        c15977l = c15977l.f49608a;
        int length = c15977l.length;
        int i = 0;
        while (i < length) {
            ByteString byteString = c15977l[i];
            int min = (int) Math.min(this.f57797b, (long) byteString.mo13431h());
            if (min != 0) {
                if (!m66942a(c15980o, c15980o.f49612b, byteString, 0, min)) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public void readFully(C18549c c18549c, long j) throws EOFException {
        if (this.f57797b < j) {
            c18549c.write(this, this.f57797b);
            throw new EOFException();
        } else {
            c18549c.write(this, j);
        }
    }

    public long readAll(Sink sink) throws IOException {
        long j = this.f57797b;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    public String readUtf8() {
        try {
            return readString(this.f57797b, C15983r.f49624a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String readUtf8(long j) throws EOFException {
        return readString(j, C15983r.f49624a);
    }

    public String readString(Charset charset) {
        try {
            return readString(this.f57797b, charset);
        } catch (Charset charset2) {
            throw new AssertionError(charset2);
        }
    }

    public String readString(long j, Charset charset) throws EOFException {
        C15983r.m60641a(this.f57797b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j == 0) {
            return "";
        } else {
            C15980o c15980o = this.f57796a;
            if (((long) c15980o.f49612b) + j > ((long) c15980o.f49613c)) {
                return new String(readByteArray(j), charset);
            }
            String str = new String(c15980o.f49611a, c15980o.f49612b, (int) j, charset);
            c15980o.f49612b = (int) (((long) c15980o.f49612b) + j);
            this.f57797b -= j;
            if (c15980o.f49612b == c15980o.f49613c) {
                this.f57796a = c15980o.m60629c();
                C15981p.m60632a(c15980o);
            }
            return str;
        }
    }

    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return m66956b(indexOf);
        }
        return this.f57797b != 0 ? readUtf8(this.f57797b) : null;
    }

    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Format.OFFSET_SAMPLE_RELATIVE);
    }

    public String readUtf8LineStrict(long j) throws EOFException {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("limit < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        long j2 = Format.OFFSET_SAMPLE_RELATIVE;
        if (j != Format.OFFSET_SAMPLE_RELATIVE) {
            j2 = j + 1;
        }
        long indexOf = indexOf((byte) 10, 0, j2);
        if (indexOf != -1) {
            return m66956b(indexOf);
        }
        if (j2 < m66945a() && m66943a(j2 - 1) == (byte) 13 && m66943a(j2) == (byte) 10) {
            return m66956b(j2);
        }
        C18549c c18549c = new C18549c();
        m66953a(c18549c, 0, Math.min(32, m66945a()));
        stringBuilder = new StringBuilder();
        stringBuilder.append("\\n not found: limit=");
        stringBuilder.append(Math.min(m66945a(), j));
        stringBuilder.append(" content=");
        stringBuilder.append(c18549c.readByteString().mo13429f());
        stringBuilder.append(8230);
        throw new EOFException(stringBuilder.toString());
    }

    /* renamed from: b */
    String m66956b(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m66943a(j2) == (byte) 13) {
                j = readUtf8(j2);
                skip(2);
                return j;
            }
        }
        j = readUtf8(j);
        skip(1);
        return j;
    }

    public int readUtf8CodePoint() throws EOFException {
        if (this.f57797b == 0) {
            throw new EOFException();
        }
        int i;
        int i2;
        byte a = m66943a(0);
        int i3 = 1;
        int i4;
        if ((a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            i = a & 127;
            i2 = 1;
            i4 = 0;
        } else if ((a & 224) == 192) {
            i = a & 31;
            i2 = 2;
            i4 = ProfileEditingConfig.DEFAULT_MAX_LENGTH;
        } else if ((a & 240) == 224) {
            i = a & 15;
            i2 = 3;
            i4 = ItemAnimator.FLAG_MOVED;
        } else if ((a & 248) == 240) {
            i = a & 7;
            i2 = 4;
            i4 = 65536;
        } else {
            skip(1);
            return 65533;
        }
        long j = (long) i2;
        if (this.f57797b < j) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("size < ");
            stringBuilder.append(i2);
            stringBuilder.append(": ");
            stringBuilder.append(this.f57797b);
            stringBuilder.append(" (to read code point prefixed 0x");
            stringBuilder.append(Integer.toHexString(a));
            stringBuilder.append(")");
            throw new EOFException(stringBuilder.toString());
        }
        while (i3 < i2) {
            long j2 = (long) i3;
            a = m66943a(j2);
            if ((a & 192) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                i = (i << 6) | (a & 63);
                i3++;
            } else {
                skip(j2);
                return 65533;
            }
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((i < 55296 || i > 57343) && i >= r6) {
            return i;
        }
        return 65533;
    }

    public byte[] readByteArray() {
        try {
            return readByteArray(this.f57797b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public byte[] readByteArray(long j) throws EOFException {
        C15983r.m60641a(this.f57797b, 0, j);
        if (j > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount > Integer.MAX_VALUE: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        j = new byte[((int) j)];
        readFully(j);
        return j;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        C15983r.m60641a((long) bArr.length, (long) i, (long) i2);
        C15980o c15980o = this.f57796a;
        if (c15980o == null) {
            return -1;
        }
        i2 = Math.min(i2, c15980o.f49613c - c15980o.f49612b);
        System.arraycopy(c15980o.f49611a, c15980o.f49612b, bArr, i, i2);
        c15980o.f49612b += i2;
        this.f57797b -= (long) i2;
        if (c15980o.f49612b == c15980o.f49613c) {
            this.f57796a = c15980o.m60629c();
            C15981p.m60632a(c15980o);
        }
        return i2;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C15980o c15980o = this.f57796a;
        if (c15980o == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c15980o.f49613c - c15980o.f49612b);
        byteBuffer.put(c15980o.f49611a, c15980o.f49612b, min);
        c15980o.f49612b += min;
        this.f57797b -= (long) min;
        if (c15980o.f49612b == c15980o.f49613c) {
            this.f57796a = c15980o.m60629c();
            C15981p.m60632a(c15980o);
        }
        return min;
    }

    /* renamed from: d */
    public void m66964d() {
        try {
            skip(this.f57797b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            if (this.f57796a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, (long) (this.f57796a.f49613c - this.f57796a.f49612b));
            long j2 = (long) min;
            this.f57797b -= j2;
            long j3 = j - j2;
            j = this.f57796a;
            j.f49612b += min;
            if (this.f57796a.f49612b == this.f57796a.f49613c) {
                j = this.f57796a;
                this.f57796a = j.m60629c();
                C15981p.m60632a(j);
            }
            j = j3;
        }
    }

    /* renamed from: a */
    public C18549c m66952a(ByteString byteString) {
        if (byteString == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        byteString.mo13421a(this);
        return this;
    }

    /* renamed from: a */
    public C18549c m66948a(String str) {
        return m66949a(str, 0, str.length());
    }

    /* renamed from: a */
    public C18549c m66949a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            i2 = new StringBuilder();
            i2.append("beginIndex < 0: ");
            i2.append(i);
            throw new IllegalArgumentException(i2.toString());
        } else if (i2 < i) {
            r0 = new StringBuilder();
            r0.append("endIndex < beginIndex: ");
            r0.append(i2);
            r0.append(" < ");
            r0.append(i);
            throw new IllegalArgumentException(r0.toString());
        } else if (i2 > str.length()) {
            r0 = new StringBuilder();
            r0.append("endIndex > string.length: ");
            r0.append(i2);
            r0.append(" > ");
            r0.append(str.length());
            throw new IllegalArgumentException(r0.toString());
        } else {
            while (i < i2) {
                char charAt = str.charAt(i);
                int i3;
                int min;
                int i4;
                if (charAt < '') {
                    C15980o g = m66971g(1);
                    byte[] bArr = g.f49611a;
                    i3 = g.f49613c - i;
                    min = Math.min(i2, 8192 - i3);
                    int i5 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i5 < min) {
                        i = str.charAt(i5);
                        if (i >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            break;
                        }
                        i4 = i5 + 1;
                        bArr[i5 + i3] = (byte) i;
                        i5 = i4;
                    }
                    i3 = (i3 + i5) - g.f49613c;
                    g.f49613c += i3;
                    this.f57797b += (long) i3;
                    i = i5;
                } else if (charAt < 'ࠀ') {
                    m66958b((charAt >> 6) | 192);
                    m66958b((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    i++;
                } else {
                    if (charAt >= '?') {
                        if (charAt <= '?') {
                            i3 = i + 1;
                            if (i3 < i2) {
                                min = str.charAt(i3);
                            } else {
                                min = 0;
                            }
                            if (charAt <= '?' && min >= 56320) {
                                if (min <= 57343) {
                                    i4 = (((charAt & -55297) << 10) | (-56321 & min)) + 65536;
                                    m66958b((i4 >> 18) | 240);
                                    m66958b(((i4 >> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                                    m66958b(((i4 >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                                    m66958b((i4 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                                    i += 2;
                                }
                            }
                            m66958b(63);
                            i = i3;
                        }
                    }
                    m66958b((charAt >> 12) | 224);
                    m66958b(((charAt >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    m66958b((charAt & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    i++;
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public C18549c m66947a(int i) {
        if (i < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            m66958b(i);
        } else if (i < ItemAnimator.FLAG_MOVED) {
            m66958b((i >> 6) | 192);
            m66958b((i & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                m66958b((i >> 12) | 224);
                m66958b(((i >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                m66958b((i & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            } else {
                m66958b(63);
            }
        } else if (i <= 1114111) {
            m66958b((i >> 18) | 240);
            m66958b(((i >> 12) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            m66958b(((i >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            m66958b((i & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected code point: ");
            stringBuilder.append(Integer.toHexString(i));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return this;
    }

    /* renamed from: a */
    public C18549c m66951a(String str, Charset charset) {
        return m66950a(str, 0, str.length(), charset);
    }

    /* renamed from: a */
    public C18549c m66950a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            i2 = new StringBuilder();
            i2.append("beginIndex < 0: ");
            i2.append(i);
            throw new IllegalAccessError(i2.toString());
        } else if (i2 < i) {
            charset = new StringBuilder();
            charset.append("endIndex < beginIndex: ");
            charset.append(i2);
            charset.append(" < ");
            charset.append(i);
            throw new IllegalArgumentException(charset.toString());
        } else if (i2 > str.length()) {
            charset = new StringBuilder();
            charset.append("endIndex > string.length: ");
            charset.append(i2);
            charset.append(" > ");
            charset.append(str.length());
            throw new IllegalArgumentException(charset.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C15983r.f49624a)) {
            return m66949a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return m66955a(bytes, 0, bytes.length);
        }
    }

    /* renamed from: a */
    public C18549c m66954a(byte[] bArr) {
        if (bArr != null) {
            return m66955a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public C18549c m66955a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = (long) i2;
        C15983r.m60641a((long) bArr.length, (long) i, j);
        i2 += i;
        while (i < i2) {
            C15980o g = m66971g(1);
            int min = Math.min(i2 - i, 8192 - g.f49613c);
            System.arraycopy(bArr, i, g.f49611a, g.f49613c, min);
            i += min;
            g.f49613c += min;
        }
        this.f57797b += j;
        return this;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C15980o g = m66971g(1);
            int min = Math.min(i, 8192 - g.f49613c);
            byteBuffer.get(g.f49611a, g.f49613c, min);
            i -= min;
            g.f49613c += min;
        }
        this.f57797b += (long) remaining;
        return remaining;
    }

    public long writeAll(Source source) throws IOException {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public BufferedSink write(Source source, long j) throws IOException {
        while (j > 0) {
            long read = source.read(this, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return this;
    }

    /* renamed from: b */
    public C18549c m66958b(int i) {
        C15980o g = m66971g(1);
        byte[] bArr = g.f49611a;
        int i2 = g.f49613c;
        g.f49613c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f57797b++;
        return this;
    }

    /* renamed from: c */
    public C18549c m66960c(int i) {
        C15980o g = m66971g(2);
        byte[] bArr = g.f49611a;
        int i2 = g.f49613c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        g.f49613c = i2;
        this.f57797b += 2;
        return this;
    }

    /* renamed from: d */
    public C18549c m66962d(int i) {
        return m66960c(C15983r.m60640a((short) i));
    }

    /* renamed from: e */
    public C18549c m66966e(int i) {
        C15980o g = m66971g(4);
        byte[] bArr = g.f49611a;
        int i2 = g.f49613c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        g.f49613c = i2;
        this.f57797b += 4;
        return this;
    }

    /* renamed from: f */
    public C18549c m66969f(int i) {
        return m66966e(C15983r.m60638a(i));
    }

    /* renamed from: c */
    public C18549c m66961c(long j) {
        C15980o g = m66971g(8);
        byte[] bArr = g.f49611a;
        int i = g.f49613c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 40) & 255));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 32) & 255));
        i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 24) & 255));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 16) & 255));
        i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 8) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j & 255));
        g.f49613c = i3;
        this.f57797b += 8;
        return this;
    }

    /* renamed from: d */
    public C18549c m66963d(long j) {
        return m66961c(C15983r.m60639a(j));
    }

    /* renamed from: e */
    public C18549c m66967e(long j) {
        if (j == 0) {
            return m66958b((int) 48);
        }
        Object obj = null;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return m66948a("-9223372036854775808");
            }
            obj = 1;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (obj != null) {
            i++;
        }
        C15980o g = m66971g(i);
        byte[] bArr = g.f49611a;
        int i2 = g.f49613c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f57795c[(int) (j % 10)];
            j /= 10;
        }
        if (obj != null) {
            bArr[i2 - 1] = 45;
        }
        g.f49613c += i;
        this.f57797b += (long) i;
        return this;
    }

    /* renamed from: f */
    public C18549c m66970f(long j) {
        if (j == 0) {
            return m66958b((int) 48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C15980o g = m66971g(numberOfTrailingZeros);
        byte[] bArr = g.f49611a;
        int i = g.f49613c;
        for (int i2 = (g.f49613c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f57795c[(int) (j & 15)];
            j >>>= 4;
        }
        g.f49613c += numberOfTrailingZeros;
        this.f57797b += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: g */
    C15980o m66971g(int i) {
        if (i >= 1) {
            if (i <= 8192) {
                C15980o c15980o;
                if (this.f57796a == null) {
                    this.f57796a = C15981p.m60631a();
                    i = this.f57796a;
                    C15980o c15980o2 = this.f57796a;
                    c15980o = this.f57796a;
                    c15980o2.f49617g = c15980o;
                    i.f49616f = c15980o;
                    return c15980o;
                }
                c15980o = this.f57796a.f49617g;
                if (c15980o.f49613c + i > 8192 || c15980o.f49615e == 0) {
                    c15980o = c15980o.m60626a(C15981p.m60631a());
                }
                return c15980o;
            }
        }
        throw new IllegalArgumentException();
    }

    public void write(C18549c c18549c, long j) {
        if (c18549c == null) {
            throw new IllegalArgumentException("source == null");
        } else if (c18549c == this) {
            throw new IllegalArgumentException("source == this");
        } else {
            C15983r.m60641a(c18549c.f57797b, 0, j);
            while (j > 0) {
                C15980o c15980o;
                if (j < ((long) (c18549c.f57796a.f49613c - c18549c.f57796a.f49612b))) {
                    c15980o = this.f57796a != null ? this.f57796a.f49617g : null;
                    if (c15980o != null && c15980o.f49615e) {
                        int i;
                        long j2 = j + ((long) c15980o.f49613c);
                        if (c15980o.f49614d) {
                            i = 0;
                        } else {
                            i = c15980o.f49612b;
                        }
                        if (j2 - ((long) i) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            c18549c.f57796a.m60627a(c15980o, (int) j);
                            c18549c.f57797b -= j;
                            this.f57797b += j;
                            return;
                        }
                    }
                    c18549c.f57796a = c18549c.f57796a.m60625a((int) j);
                }
                c15980o = c18549c.f57796a;
                long j3 = (long) (c15980o.f49613c - c15980o.f49612b);
                c18549c.f57796a = c15980o.m60629c();
                if (this.f57796a == null) {
                    this.f57796a = c15980o;
                    c15980o = this.f57796a;
                    C15980o c15980o2 = this.f57796a;
                    C15980o c15980o3 = this.f57796a;
                    c15980o2.f49617g = c15980o3;
                    c15980o.f49616f = c15980o3;
                } else {
                    this.f57796a.f49617g.m60626a(c15980o).m60630d();
                }
                c18549c.f57797b -= j3;
                this.f57797b += j3;
                j -= j3;
            }
        }
    }

    public long read(C18549c c18549c, long j) {
        if (c18549c == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f57797b == 0) {
            return -1;
        } else {
            if (j > this.f57797b) {
                j = this.f57797b;
            }
            c18549c.write(this, j);
            return j;
        }
    }

    public long indexOf(byte b) {
        return indexOf(b, 0, Format.OFFSET_SAMPLE_RELATIVE);
    }

    public long indexOf(byte b, long j) {
        return indexOf(b, j, Format.OFFSET_SAMPLE_RELATIVE);
    }

    public long indexOf(byte b, long j, long j2) {
        C18549c c18549c = this;
        long j3 = 0;
        if (j >= 0) {
            if (j2 >= j) {
                long j4 = j2 > c18549c.f57797b ? c18549c.f57797b : j2;
                if (j == j4) {
                    return -1;
                }
                C15980o c15980o = c18549c.f57796a;
                if (c15980o == null) {
                    return -1;
                }
                if (c18549c.f57797b - j >= j) {
                    while (true) {
                        long j5 = j3 + ((long) (c15980o.f49613c - c15980o.f49612b));
                        if (j5 >= j) {
                            break;
                        }
                        c15980o = c15980o.f49616f;
                        j3 = j5;
                    }
                } else {
                    j3 = c18549c.f57797b;
                    while (j3 > j) {
                        c15980o = c15980o.f49617g;
                        j3 -= (long) (c15980o.f49613c - c15980o.f49612b);
                    }
                }
                long j6 = j;
                while (j3 < j4) {
                    byte[] bArr = c15980o.f49611a;
                    int min = (int) Math.min((long) c15980o.f49613c, (((long) c15980o.f49612b) + j4) - j3);
                    for (int i = (int) ((((long) c15980o.f49612b) + j6) - j3); i < min; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - c15980o.f49612b)) + j3;
                        }
                    }
                    byte b2 = b;
                    long j7 = j3 + ((long) (c15980o.f49613c - c15980o.f49612b));
                    c15980o = c15980o.f49616f;
                    j6 = j7;
                    j3 = j6;
                }
                return -1;
            }
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(c18549c.f57797b), Long.valueOf(j), Long.valueOf(j2)}));
    }

    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0);
    }

    public long indexOf(ByteString byteString, long j) throws IOException {
        C18549c c18549c = this;
        if (byteString.mo13431h() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C15980o c15980o = c18549c.f57796a;
        long j3 = -1;
        if (c15980o == null) {
            return -1;
        }
        if (c18549c.f57797b - j >= j) {
            while (true) {
                long j4 = j2 + ((long) (c15980o.f49613c - c15980o.f49612b));
                if (j4 >= j) {
                    break;
                }
                c15980o = c15980o.f49616f;
                j2 = j4;
            }
        } else {
            j2 = c18549c.f57797b;
            while (j2 > j) {
                c15980o = c15980o.f49617g;
                j2 -= (long) (c15980o.f49613c - c15980o.f49612b);
            }
        }
        ByteString byteString2 = byteString;
        byte a = byteString2.mo13418a(0);
        int h = byteString.mo13431h();
        long j5 = (c18549c.f57797b - ((long) h)) + 1;
        long j6 = j;
        long j7 = j2;
        C15980o c15980o2 = c15980o;
        while (j7 < j5) {
            C15980o c15980o3;
            byte[] bArr = c15980o2.f49611a;
            int min = (int) Math.min((long) c15980o2.f49613c, (((long) c15980o2.f49612b) + j5) - j7);
            int i = (int) ((((long) c15980o2.f49612b) + j6) - j7);
            while (i < min) {
                byte[] bArr2;
                if (bArr[i] == a) {
                    C18549c c18549c2 = c18549c;
                    bArr2 = bArr;
                    c15980o3 = c15980o2;
                    if (c18549c2.m66942a(c15980o2, i + 1, byteString2, 1, h)) {
                        return ((long) (i - c15980o3.f49612b)) + j7;
                    }
                } else {
                    bArr2 = bArr;
                    c15980o3 = c15980o2;
                }
                i++;
                c15980o2 = c15980o3;
                bArr = bArr2;
                c18549c = this;
            }
            c15980o3 = c15980o2;
            j2 = j7 + ((long) (c15980o3.f49613c - c15980o3.f49612b));
            c15980o2 = c15980o3.f49616f;
            j6 = j2;
            j7 = j6;
            c18549c = this;
            j3 = -1;
        }
        return j3;
    }

    public long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0);
    }

    public long indexOfElement(ByteString byteString, long j) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C15980o c15980o = this.f57796a;
        if (c15980o == null) {
            return -1;
        }
        if (this.f57797b - j >= j) {
            while (true) {
                long j3 = j2 + ((long) (c15980o.f49613c - c15980o.f49612b));
                if (j3 >= j) {
                    break;
                }
                c15980o = c15980o.f49616f;
                j2 = j3;
            }
        } else {
            j2 = this.f57797b;
            while (j2 > j) {
                c15980o = c15980o.f49617g;
                j2 -= (long) (c15980o.f49613c - c15980o.f49612b);
            }
        }
        int i;
        if (byteString.mo13431h() == 2) {
            byte a = byteString.mo13418a(0);
            byteString = byteString.mo13418a(1);
            while (j2 < this.f57797b) {
                byte[] bArr = c15980o.f49611a;
                j = (int) ((((long) c15980o.f49612b) + j) - j2);
                i = c15980o.f49613c;
                while (j < i) {
                    byte b = bArr[j];
                    if (b != a) {
                        if (b != byteString) {
                            j++;
                        }
                    }
                    return ((long) (j - c15980o.f49612b)) + j2;
                }
                long j4 = j2 + ((long) (c15980o.f49613c - c15980o.f49612b));
                c15980o = c15980o.f49616f;
                j = j4;
                j2 = j;
            }
        } else {
            byteString = byteString.mo13434j();
            while (j2 < this.f57797b) {
                byte[] bArr2 = c15980o.f49611a;
                i = c15980o.f49613c;
                for (j = (int) ((((long) c15980o.f49612b) + j) - j2); j < i; j++) {
                    byte b2 = bArr2[j];
                    for (byte b3 : byteString) {
                        if (b2 == b3) {
                            return ((long) (j - c15980o.f49612b)) + j2;
                        }
                    }
                }
                long j5 = j2 + ((long) (c15980o.f49613c - c15980o.f49612b));
                c15980o = c15980o.f49616f;
                j = j5;
                j2 = j;
            }
        }
        return -1;
    }

    public boolean rangeEquals(long j, ByteString byteString) {
        return rangeEquals(j, byteString, 0, byteString.mo13431h());
    }

    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        if (j >= 0 && i >= 0 && i2 >= 0 && this.f57797b - j >= ((long) i2)) {
            if (byteString.mo13431h() - i >= i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (m66943a(j + ((long) i3)) != byteString.mo13418a(i + i3)) {
                        return false;
                    }
                }
                return 1;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m66942a(C15980o c15980o, int i, ByteString byteString, int i2, int i3) {
        int i4 = c15980o.f49613c;
        byte[] bArr = c15980o.f49611a;
        while (i2 < i3) {
            if (i == i4) {
                c15980o = c15980o.f49616f;
                i = c15980o.f49611a;
                i4 = c15980o.f49612b;
                bArr = i;
                i = i4;
                i4 = c15980o.f49613c;
            }
            if (bArr[i] != byteString.mo13418a(i2)) {
                return null;
            }
            i++;
            i2++;
        }
        return true;
    }

    public C15982q timeout() {
        return C15982q.f49620c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18549c)) {
            return false;
        }
        C18549c c18549c = (C18549c) obj;
        if (this.f57797b != c18549c.f57797b) {
            return false;
        }
        long j = 0;
        if (this.f57797b == 0) {
            return true;
        }
        C15980o c15980o = this.f57796a;
        obj = c18549c.f57796a;
        int i = c15980o.f49612b;
        int i2 = obj.f49612b;
        while (j < this.f57797b) {
            long min = (long) Math.min(c15980o.f49613c - i, obj.f49613c - i2);
            int i3 = i2;
            i2 = i;
            i = 0;
            while (((long) i) < min) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (c15980o.f49611a[i2] != obj.f49611a[i3]) {
                    return false;
                }
                i++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == c15980o.f49613c) {
                c15980o = c15980o.f49616f;
                i = c15980o.f49612b;
            } else {
                i = i2;
            }
            if (i3 == obj.f49613c) {
                obj = obj.f49616f;
                i2 = obj.f49612b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    public int hashCode() {
        C15980o c15980o = this.f57796a;
        if (c15980o == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = c15980o.f49612b; i2 < c15980o.f49613c; i2++) {
                i = (i * 31) + c15980o.f49611a[i2];
            }
            c15980o = c15980o.f49616f;
        } while (c15980o != this.f57796a);
        return i;
    }

    public String toString() {
        return m66968f().toString();
    }

    /* renamed from: e */
    public C18549c m66965e() {
        C18549c c18549c = new C18549c();
        if (this.f57797b == 0) {
            return c18549c;
        }
        c18549c.f57796a = this.f57796a.m60624a();
        C15980o c15980o = c18549c.f57796a;
        C15980o c15980o2 = c18549c.f57796a;
        C15980o c15980o3 = c18549c.f57796a;
        c15980o2.f49617g = c15980o3;
        c15980o.f49616f = c15980o3;
        c15980o = this.f57796a;
        while (true) {
            c15980o = c15980o.f49616f;
            if (c15980o != this.f57796a) {
                c18549c.f57796a.f49617g.m60626a(c15980o.m60624a());
            } else {
                c18549c.f57797b = this.f57797b;
                return c18549c;
            }
        }
    }

    /* renamed from: f */
    public ByteString m66968f() {
        if (this.f57797b <= 2147483647L) {
            return m66972h((int) this.f57797b);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.f57797b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: h */
    public ByteString m66972h(int i) {
        if (i == 0) {
            return ByteString.f49592b;
        }
        return new SegmentedByteString(this, i);
    }

    /* renamed from: a */
    public C15975a m66946a(C15975a c15975a) {
        if (c15975a.f49600a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c15975a.f49600a = this;
        c15975a.f49601b = true;
        return c15975a;
    }
}
