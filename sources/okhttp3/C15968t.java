package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okio.BufferedSource;
import okio.C18549c;

/* renamed from: okhttp3.t */
public abstract class C15968t implements Closeable {
    private Reader reader;

    /* renamed from: okhttp3.t$a */
    static final class C15967a extends Reader {
        /* renamed from: a */
        private final BufferedSource f49584a;
        /* renamed from: b */
        private final Charset f49585b;
        /* renamed from: c */
        private boolean f49586c;
        /* renamed from: d */
        private Reader f49587d;

        C15967a(BufferedSource bufferedSource, Charset charset) {
            this.f49584a = bufferedSource;
            this.f49585b = charset;
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f49586c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.f49587d;
            if (reader == null) {
                Reader inputStreamReader = new InputStreamReader(this.f49584a.inputStream(), C15908c.m60160a(this.f49584a, this.f49585b));
                this.f49587d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        public void close() throws IOException {
            this.f49586c = true;
            if (this.f49587d != null) {
                this.f49587d.close();
            } else {
                this.f49584a.close();
            }
        }
    }

    /* renamed from: okhttp3.t$1 */
    class C176981 extends C15968t {
        /* renamed from: a */
        final /* synthetic */ C15958m f55085a;
        /* renamed from: b */
        final /* synthetic */ long f55086b;
        /* renamed from: c */
        final /* synthetic */ BufferedSource f55087c;

        C176981(C15958m c15958m, long j, BufferedSource bufferedSource) {
            this.f55085a = c15958m;
            this.f55086b = j;
            this.f55087c = bufferedSource;
        }

        @Nullable
        public C15958m contentType() {
            return this.f55085a;
        }

        public long contentLength() {
            return this.f55086b;
        }

        public BufferedSource source() {
            return this.f55087c;
        }
    }

    public abstract long contentLength();

    @Nullable
    public abstract C15958m contentType();

    public abstract BufferedSource source();

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot buffer entire body for content length: ");
            stringBuilder.append(contentLength);
            throw new IOException(stringBuilder.toString());
        }
        Closeable source = source();
        try {
            byte[] readByteArray = source.readByteArray();
            if (contentLength == -1 || contentLength == ((long) readByteArray.length)) {
                return readByteArray;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Content-Length (");
            stringBuilder2.append(contentLength);
            stringBuilder2.append(") and stream length (");
            stringBuilder2.append(readByteArray.length);
            stringBuilder2.append(") disagree");
            throw new IOException(stringBuilder2.toString());
        } finally {
            C15908c.m60165a(source);
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        reader = new C15967a(source(), charset());
        this.reader = reader;
        return reader;
    }

    public final String string() throws IOException {
        Closeable source = source();
        try {
            String readString = source.readString(C15908c.m60160a((BufferedSource) source, charset()));
            return readString;
        } finally {
            C15908c.m60165a(source);
        }
    }

    private Charset charset() {
        C15958m contentType = contentType();
        return contentType != null ? contentType.m60481a(C15908c.f49249e) : C15908c.f49249e;
    }

    public void close() {
        C15908c.m60165a(source());
    }

    public static C15968t create(@Nullable C15958m c15958m, String str) {
        Charset charset = C15908c.f49249e;
        if (c15958m != null) {
            charset = c15958m.m60482b();
            if (charset == null) {
                charset = C15908c.f49249e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c15958m);
                stringBuilder.append("; charset=utf-8");
                c15958m = C15958m.m60479a(stringBuilder.toString());
            }
        }
        str = new C18549c().m66951a(str, charset);
        return C15968t.create(c15958m, str.m66945a(), str);
    }

    public static C15968t create(@Nullable C15958m c15958m, byte[] bArr) {
        return C15968t.create(c15958m, (long) bArr.length, new C18549c().m66954a(bArr));
    }

    public static C15968t create(@Nullable C15958m c15958m, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new C176981(c15958m, j, bufferedSource);
        }
        throw new NullPointerException("source == null");
    }
}
