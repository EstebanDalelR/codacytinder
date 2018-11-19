package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: okio.n */
final class C18552n implements BufferedSource {
    /* renamed from: a */
    public final C18549c f57802a = new C18549c();
    /* renamed from: b */
    public final Source f57803b;
    /* renamed from: c */
    boolean f57804c;

    /* renamed from: okio.n$1 */
    class C159791 extends InputStream {
        /* renamed from: a */
        final /* synthetic */ C18552n f49610a;

        C159791(C18552n c18552n) {
            this.f49610a = c18552n;
        }

        public int read() throws IOException {
            if (this.f49610a.f57804c) {
                throw new IOException("closed");
            } else if (this.f49610a.f57802a.f57797b == 0 && this.f49610a.f57803b.read(this.f49610a.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            } else {
                return this.f49610a.f57802a.readByte() & 255;
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f49610a.f57804c) {
                throw new IOException("closed");
            }
            C15983r.m60641a((long) bArr.length, (long) i, (long) i2);
            if (this.f49610a.f57802a.f57797b == 0 && this.f49610a.f57803b.read(this.f49610a.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return this.f49610a.f57802a.read(bArr, i, i2);
        }

        public int available() throws IOException {
            if (!this.f49610a.f57804c) {
                return (int) Math.min(this.f49610a.f57802a.f57797b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            this.f49610a.close();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f49610a);
            stringBuilder.append(".inputStream()");
            return stringBuilder.toString();
        }
    }

    C18552n(Source source) {
        if (source == null) {
            throw new NullPointerException("source == null");
        }
        this.f57803b = source;
    }

    public C18549c buffer() {
        return this.f57802a;
    }

    public long read(C18549c c18549c, long j) throws IOException {
        if (c18549c == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f57804c) {
            throw new IllegalStateException("closed");
        } else if (this.f57802a.f57797b == 0 && this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        } else {
            return this.f57802a.read(c18549c, Math.min(j, this.f57802a.f57797b));
        }
    }

    public boolean exhausted() throws IOException {
        if (!this.f57804c) {
            return this.f57802a.exhausted() && this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public void require(long j) throws IOException {
        if (request(j) == null) {
            throw new EOFException();
        }
    }

    public boolean request(long j) throws IOException {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f57804c) {
            throw new IllegalStateException("closed");
        } else {
            while (this.f57802a.f57797b < j) {
                if (this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return 0;
                }
            }
            return 1;
        }
    }

    public byte readByte() throws IOException {
        require(1);
        return this.f57802a.readByte();
    }

    public ByteString readByteString() throws IOException {
        this.f57802a.writeAll(this.f57803b);
        return this.f57802a.readByteString();
    }

    public ByteString readByteString(long j) throws IOException {
        require(j);
        return this.f57802a.readByteString(j);
    }

    public int select(C15977l c15977l) throws IOException {
        if (this.f57804c) {
            throw new IllegalStateException("closed");
        }
        do {
            int a = this.f57802a.m66944a(c15977l);
            if (a == -1) {
                return -1;
            }
            long h = (long) c15977l.f49608a[a].mo13431h();
            if (h <= this.f57802a.f57797b) {
                this.f57802a.skip(h);
                return a;
            }
        } while (this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    public byte[] readByteArray() throws IOException {
        this.f57802a.writeAll(this.f57803b);
        return this.f57802a.readByteArray();
    }

    public byte[] readByteArray(long j) throws IOException {
        require(j);
        return this.f57802a.readByteArray(j);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            require((long) bArr.length);
            this.f57802a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f57802a.f57797b > 0) {
                int read = this.f57802a.read(bArr, i, (int) this.f57802a.f57797b);
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        C15983r.m60641a((long) bArr.length, (long) i, j);
        if (this.f57802a.f57797b == 0 && this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f57802a.read(bArr, i, (int) Math.min(j, this.f57802a.f57797b));
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f57802a.f57797b == 0 && this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f57802a.read(byteBuffer);
    }

    public void readFully(C18549c c18549c, long j) throws IOException {
        try {
            require(j);
            this.f57802a.readFully(c18549c, j);
        } catch (long j2) {
            c18549c.writeAll(this.f57802a);
            throw j2;
        }
    }

    public long readAll(Sink sink) throws IOException {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long c = this.f57802a.m66959c();
            if (c > 0) {
                long j2 = j + c;
                sink.write(this.f57802a, c);
                j = j2;
            }
        }
        if (this.f57802a.m66945a() <= 0) {
            return j;
        }
        c = j + this.f57802a.m66945a();
        sink.write(this.f57802a, this.f57802a.m66945a());
        return c;
    }

    public String readUtf8() throws IOException {
        this.f57802a.writeAll(this.f57803b);
        return this.f57802a.readUtf8();
    }

    public String readUtf8(long j) throws IOException {
        require(j);
        return this.f57802a.readUtf8(j);
    }

    public String readString(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f57802a.writeAll(this.f57803b);
        return this.f57802a.readString(charset);
    }

    public String readString(long j, Charset charset) throws IOException {
        require(j);
        if (charset != null) {
            return this.f57802a.readString(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Nullable
    public String readUtf8Line() throws IOException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return this.f57802a.m66956b(indexOf);
        }
        return this.f57802a.f57797b != 0 ? readUtf8(this.f57802a.f57797b) : null;
    }

    public String readUtf8LineStrict() throws IOException {
        return readUtf8LineStrict(Format.OFFSET_SAMPLE_RELATIVE);
    }

    public String readUtf8LineStrict(long j) throws IOException {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("limit < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        long j2 = j == Format.OFFSET_SAMPLE_RELATIVE ? Format.OFFSET_SAMPLE_RELATIVE : j + 1;
        long indexOf = indexOf((byte) 10, 0, j2);
        if (indexOf != -1) {
            return this.f57802a.m66956b(indexOf);
        }
        if (j2 < Format.OFFSET_SAMPLE_RELATIVE && request(j2) && this.f57802a.m66943a(j2 - 1) == (byte) 13 && request(j2 + 1) && this.f57802a.m66943a(j2) == (byte) 10) {
            return this.f57802a.m66956b(j2);
        }
        C18549c c18549c = new C18549c();
        this.f57802a.m66953a(c18549c, 0, Math.min(32, this.f57802a.m66945a()));
        stringBuilder = new StringBuilder();
        stringBuilder.append("\\n not found: limit=");
        stringBuilder.append(Math.min(this.f57802a.m66945a(), j));
        stringBuilder.append(" content=");
        stringBuilder.append(c18549c.readByteString().mo13429f());
        stringBuilder.append(8230);
        throw new EOFException(stringBuilder.toString());
    }

    public int readUtf8CodePoint() throws IOException {
        require(1);
        byte a = this.f57802a.m66943a(0);
        if ((a & 224) == 192) {
            require(2);
        } else if ((a & 240) == 224) {
            require(3);
        } else if ((a & 248) == 240) {
            require(4);
        }
        return this.f57802a.readUtf8CodePoint();
    }

    public short readShort() throws IOException {
        require(2);
        return this.f57802a.readShort();
    }

    public short readShortLe() throws IOException {
        require(2);
        return this.f57802a.readShortLe();
    }

    public int readInt() throws IOException {
        require(4);
        return this.f57802a.readInt();
    }

    public int readIntLe() throws IOException {
        require(4);
        return this.f57802a.readIntLe();
    }

    public long readLong() throws IOException {
        require(8);
        return this.f57802a.readLong();
    }

    public long readLongLe() throws IOException {
        require(8);
        return this.f57802a.readLongLe();
    }

    public long readDecimalLong() throws IOException {
        require(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request((long) i2)) {
                break;
            }
            byte a = this.f57802a.m66943a((long) i);
            if (a < (byte) 48 || a > (byte) 57) {
                if (i != 0) {
                    break;
                } else if (a != (byte) 45) {
                    break;
                }
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[]{Byte.valueOf(a)}));
        }
        return this.f57802a.readDecimalLong();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readHexadecimalUnsignedLong() throws java.io.IOException {
        /*
        r6 = this;
        r0 = 1;
        r6.require(r0);
        r0 = 0;
        r1 = 0;
    L_0x0007:
        r2 = r1 + 1;
        r3 = (long) r2;
        r3 = r6.request(r3);
        if (r3 == 0) goto L_0x0049;
    L_0x0010:
        r3 = r6.f57802a;
        r4 = (long) r1;
        r3 = r3.m66943a(r4);
        r4 = 48;
        if (r3 < r4) goto L_0x001f;
    L_0x001b:
        r4 = 57;
        if (r3 <= r4) goto L_0x0030;
    L_0x001f:
        r4 = 97;
        if (r3 < r4) goto L_0x0027;
    L_0x0023:
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r3 <= r4) goto L_0x0030;
    L_0x0027:
        r4 = 65;
        if (r3 < r4) goto L_0x0032;
    L_0x002b:
        r4 = 70;
        if (r3 <= r4) goto L_0x0030;
    L_0x002f:
        goto L_0x0032;
    L_0x0030:
        r1 = r2;
        goto L_0x0007;
    L_0x0032:
        if (r1 != 0) goto L_0x0049;
    L_0x0034:
        r1 = new java.lang.NumberFormatException;
        r2 = "Expected leading [0-9a-fA-F] character but was %#x";
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r3 = java.lang.Byte.valueOf(r3);
        r4[r0] = r3;
        r0 = java.lang.String.format(r2, r4);
        r1.<init>(r0);
        throw r1;
    L_0x0049:
        r0 = r6.f57802a;
        r0 = r0.readHexadecimalUnsignedLong();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.n.readHexadecimalUnsignedLong():long");
    }

    public void skip(long j) throws IOException {
        if (this.f57804c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f57802a.f57797b == 0 && this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f57802a.m66945a());
            this.f57802a.skip(min);
            j -= min;
        }
    }

    public long indexOf(byte b) throws IOException {
        return indexOf(b, 0, Format.OFFSET_SAMPLE_RELATIVE);
    }

    public long indexOf(byte b, long j) throws IOException {
        return indexOf(b, j, Format.OFFSET_SAMPLE_RELATIVE);
    }

    public long indexOf(byte b, long j, long j2) throws IOException {
        if (this.f57804c) {
            throw new IllegalStateException("closed");
        }
        if (j >= 0) {
            if (j2 >= j) {
                while (j < j2) {
                    long indexOf = this.f57802a.indexOf(b, j, j2);
                    if (indexOf != -1) {
                        return indexOf;
                    }
                    indexOf = this.f57802a.f57797b;
                    if (indexOf < j2) {
                        if (this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                            j = Math.max(j, indexOf);
                        }
                    }
                    return -1;
                }
                return -1;
            }
        }
        throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
    }

    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0);
    }

    public long indexOf(ByteString byteString, long j) throws IOException {
        if (this.f57804c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.f57802a.indexOf(byteString, j);
            if (indexOf != -1) {
                return indexOf;
            }
            indexOf = this.f57802a.f57797b;
            if (this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            j = Math.max(j, (indexOf - ((long) byteString.mo13431h())) + 1);
        }
    }

    public long indexOfElement(ByteString byteString) throws IOException {
        return indexOfElement(byteString, 0);
    }

    public long indexOfElement(ByteString byteString, long j) throws IOException {
        if (this.f57804c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.f57802a.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            indexOfElement = this.f57802a.f57797b;
            if (this.f57803b.read(this.f57802a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            j = Math.max(j, indexOfElement);
        }
    }

    public boolean rangeEquals(long j, ByteString byteString) throws IOException {
        return rangeEquals(j, byteString, 0, byteString.mo13431h());
    }

    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) throws IOException {
        if (this.f57804c) {
            throw new IllegalStateException("closed");
        }
        if (j >= 0 && i >= 0 && i2 >= 0) {
            if (byteString.mo13431h() - i >= i2) {
                int i3 = 0;
                while (i3 < i2) {
                    long j2 = j + ((long) i3);
                    if (!request(j2 + 1) || this.f57802a.m66943a(j2) != byteString.mo13418a(i + i3)) {
                        return false;
                    }
                    i3++;
                }
                return 1;
            }
        }
        return false;
    }

    public InputStream inputStream() {
        return new C159791(this);
    }

    public boolean isOpen() {
        return this.f57804c ^ 1;
    }

    public void close() throws IOException {
        if (!this.f57804c) {
            this.f57804c = true;
            this.f57803b.close();
            this.f57802a.m66964d();
        }
    }

    public C15982q timeout() {
        return this.f57803b.timeout();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append(this.f57803b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
