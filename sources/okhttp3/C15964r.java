package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okio.BufferedSink;
import okio.ByteString;
import okio.C15976k;

/* renamed from: okhttp3.r */
public abstract class C15964r {

    /* renamed from: okhttp3.r$1 */
    class C176951 extends C15964r {
        /* renamed from: a */
        final /* synthetic */ C15958m f55077a;
        /* renamed from: b */
        final /* synthetic */ ByteString f55078b;

        C176951(C15958m c15958m, ByteString byteString) {
            this.f55077a = c15958m;
            this.f55078b = byteString;
        }

        @Nullable
        public C15958m contentType() {
            return this.f55077a;
        }

        public long contentLength() throws IOException {
            return (long) this.f55078b.mo13431h();
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f55078b);
        }
    }

    /* renamed from: okhttp3.r$2 */
    class C176962 extends C15964r {
        /* renamed from: a */
        final /* synthetic */ C15958m f55079a;
        /* renamed from: b */
        final /* synthetic */ int f55080b;
        /* renamed from: c */
        final /* synthetic */ byte[] f55081c;
        /* renamed from: d */
        final /* synthetic */ int f55082d;

        C176962(C15958m c15958m, int i, byte[] bArr, int i2) {
            this.f55079a = c15958m;
            this.f55080b = i;
            this.f55081c = bArr;
            this.f55082d = i2;
        }

        @Nullable
        public C15958m contentType() {
            return this.f55079a;
        }

        public long contentLength() {
            return (long) this.f55080b;
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f55081c, this.f55082d, this.f55080b);
        }
    }

    /* renamed from: okhttp3.r$3 */
    class C176973 extends C15964r {
        /* renamed from: a */
        final /* synthetic */ C15958m f55083a;
        /* renamed from: b */
        final /* synthetic */ File f55084b;

        C176973(C15958m c15958m, File file) {
            this.f55083a = c15958m;
            this.f55084b = file;
        }

        @Nullable
        public C15958m contentType() {
            return this.f55083a;
        }

        public long contentLength() {
            return this.f55084b.length();
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            Closeable closeable = null;
            try {
                Closeable a = C15976k.m60614a(this.f55084b);
                try {
                    bufferedSink.writeAll(a);
                    C15908c.m60165a(a);
                } catch (Throwable th) {
                    bufferedSink = th;
                    closeable = a;
                    C15908c.m60165a(closeable);
                    throw bufferedSink;
                }
            } catch (Throwable th2) {
                bufferedSink = th2;
                C15908c.m60165a(closeable);
                throw bufferedSink;
            }
        }
    }

    public long contentLength() throws IOException {
        return -1;
    }

    @Nullable
    public abstract C15958m contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static C15964r create(@Nullable C15958m c15958m, String str) {
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
        return C15964r.create(c15958m, str.getBytes(charset));
    }

    public static C15964r create(@Nullable C15958m c15958m, ByteString byteString) {
        return new C176951(c15958m, byteString);
    }

    public static C15964r create(@Nullable C15958m c15958m, byte[] bArr) {
        return C15964r.create(c15958m, bArr, 0, bArr.length);
    }

    public static C15964r create(@Nullable C15958m c15958m, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        C15908c.m60164a((long) bArr.length, (long) i, (long) i2);
        return new C176962(c15958m, i2, bArr, i);
    }

    public static C15964r create(@Nullable C15958m c15958m, File file) {
        if (file != null) {
            return new C176973(c15958m, file);
        }
        throw new NullPointerException("content == null");
    }
}
