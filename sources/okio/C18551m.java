package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: okio.m */
final class C18551m implements BufferedSink {
    /* renamed from: a */
    public final C18549c f57799a = new C18549c();
    /* renamed from: b */
    public final Sink f57800b;
    /* renamed from: c */
    boolean f57801c;

    /* renamed from: okio.m$1 */
    class C159781 extends OutputStream {
        /* renamed from: a */
        final /* synthetic */ C18551m f49609a;

        C159781(C18551m c18551m) {
            this.f49609a = c18551m;
        }

        public void write(int i) throws IOException {
            if (this.f49609a.f57801c) {
                throw new IOException("closed");
            }
            this.f49609a.f57799a.m66958b((byte) i);
            this.f49609a.emitCompleteSegments();
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f49609a.f57801c) {
                throw new IOException("closed");
            }
            this.f49609a.f57799a.m66955a(bArr, i, i2);
            this.f49609a.emitCompleteSegments();
        }

        public void flush() throws IOException {
            if (!this.f49609a.f57801c) {
                this.f49609a.flush();
            }
        }

        public void close() throws IOException {
            this.f49609a.close();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f49609a);
            stringBuilder.append(".outputStream()");
            return stringBuilder.toString();
        }
    }

    C18551m(Sink sink) {
        if (sink == null) {
            throw new NullPointerException("sink == null");
        }
        this.f57800b = sink;
    }

    public C18549c buffer() {
        return this.f57799a;
    }

    public void write(C18549c c18549c, long j) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.write(c18549c, j);
        emitCompleteSegments();
    }

    public BufferedSink write(ByteString byteString) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66952a(byteString);
        return emitCompleteSegments();
    }

    public BufferedSink writeUtf8(String str) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66948a(str);
        return emitCompleteSegments();
    }

    public BufferedSink writeUtf8(String str, int i, int i2) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66949a(str, i, i2);
        return emitCompleteSegments();
    }

    public BufferedSink writeUtf8CodePoint(int i) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66947a(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeString(String str, Charset charset) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66951a(str, charset);
        return emitCompleteSegments();
    }

    public BufferedSink writeString(String str, int i, int i2, Charset charset) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66950a(str, i, i2, charset);
        return emitCompleteSegments();
    }

    public BufferedSink write(byte[] bArr) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66954a(bArr);
        return emitCompleteSegments();
    }

    public BufferedSink write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66955a(bArr, i, i2);
        return emitCompleteSegments();
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        byteBuffer = this.f57799a.write(byteBuffer);
        emitCompleteSegments();
        return byteBuffer;
    }

    public long writeAll(Source source) throws IOException {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = source.read(this.f57799a, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            long j2 = j + read;
            emitCompleteSegments();
            j = j2;
        }
    }

    public BufferedSink write(Source source, long j) throws IOException {
        while (j > 0) {
            long read = source.read(this.f57799a, j);
            if (read == -1) {
                throw new EOFException();
            }
            long j2 = j - read;
            emitCompleteSegments();
            j = j2;
        }
        return this;
    }

    public BufferedSink writeByte(int i) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66958b(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeShort(int i) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66960c(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeShortLe(int i) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66962d(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeInt(int i) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66966e(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeIntLe(int i) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66969f(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeLong(long j) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66961c(j);
        return emitCompleteSegments();
    }

    public BufferedSink writeLongLe(long j) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66963d(j);
        return emitCompleteSegments();
    }

    public BufferedSink writeDecimalLong(long j) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66967e(j);
        return emitCompleteSegments();
    }

    public BufferedSink writeHexadecimalUnsignedLong(long j) throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        this.f57799a.m66970f(j);
        return emitCompleteSegments();
    }

    public BufferedSink emitCompleteSegments() throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        long c = this.f57799a.m66959c();
        if (c > 0) {
            this.f57800b.write(this.f57799a, c);
        }
        return this;
    }

    public BufferedSink emit() throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        long a = this.f57799a.m66945a();
        if (a > 0) {
            this.f57800b.write(this.f57799a, a);
        }
        return this;
    }

    public OutputStream outputStream() {
        return new C159781(this);
    }

    public void flush() throws IOException {
        if (this.f57801c) {
            throw new IllegalStateException("closed");
        }
        if (this.f57799a.f57797b > 0) {
            this.f57800b.write(this.f57799a, this.f57799a.f57797b);
        }
        this.f57800b.flush();
    }

    public boolean isOpen() {
        return this.f57801c ^ 1;
    }

    public void close() throws IOException {
        if (!this.f57801c) {
            Throwable th = null;
            try {
                if (this.f57799a.f57797b > 0) {
                    this.f57800b.write(this.f57799a, this.f57799a.f57797b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f57800b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f57801c = true;
            if (th != null) {
                C15983r.m60642a(th);
            }
        }
    }

    public C15982q timeout() {
        return this.f57800b.timeout();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append(this.f57800b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
