package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: okio.k */
public final class C15976k {
    /* renamed from: a */
    static final Logger f49607a = Logger.getLogger(C15976k.class.getName());

    /* renamed from: okio.k$1 */
    class C177091 implements Sink {
        /* renamed from: a */
        final /* synthetic */ C15982q f55119a;
        /* renamed from: b */
        final /* synthetic */ OutputStream f55120b;

        C177091(C15982q c15982q, OutputStream outputStream) {
            this.f55119a = c15982q;
            this.f55120b = outputStream;
        }

        public void write(C18549c c18549c, long j) throws IOException {
            C15983r.m60641a(c18549c.f57797b, 0, j);
            while (j > 0) {
                this.f55119a.mo13440g();
                C15980o c15980o = c18549c.f57796a;
                int min = (int) Math.min(j, (long) (c15980o.f49613c - c15980o.f49612b));
                this.f55120b.write(c15980o.f49611a, c15980o.f49612b, min);
                c15980o.f49612b += min;
                long j2 = (long) min;
                long j3 = j - j2;
                c18549c.f57797b -= j2;
                if (c15980o.f49612b == c15980o.f49613c) {
                    c18549c.f57796a = c15980o.m60629c();
                    C15981p.m60632a(c15980o);
                }
                j = j3;
            }
        }

        public void flush() throws IOException {
            this.f55120b.flush();
        }

        public void close() throws IOException {
            this.f55120b.close();
        }

        public C15982q timeout() {
            return this.f55119a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sink(");
            stringBuilder.append(this.f55120b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: okio.k$2 */
    class C177102 implements Source {
        /* renamed from: a */
        final /* synthetic */ C15982q f55121a;
        /* renamed from: b */
        final /* synthetic */ InputStream f55122b;

        C177102(C15982q c15982q, InputStream inputStream) {
            this.f55121a = c15982q;
            this.f55122b = inputStream;
        }

        public long read(C18549c c18549c, long j) throws IOException {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("byteCount < 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f55121a.mo13440g();
                    C15980o g = c18549c.m66971g(1);
                    j = this.f55122b.read(g.f49611a, g.f49613c, (int) Math.min(j, (long) (8192 - g.f49613c)));
                    if (j == -1) {
                        return -1;
                    }
                    g.f49613c += j;
                    j = (long) j;
                    c18549c.f57797b += j;
                    return j;
                } catch (AssertionError e) {
                    if (C15976k.m60617a(e) != null) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        public void close() throws IOException {
            this.f55122b.close();
        }

        public C15982q timeout() {
            return this.f55121a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("source(");
            stringBuilder.append(this.f55122b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: okio.k$3 */
    class C177113 implements Sink {
        public void close() throws IOException {
        }

        public void flush() throws IOException {
        }

        C177113() {
        }

        public void write(C18549c c18549c, long j) throws IOException {
            c18549c.skip(j);
        }

        public C15982q timeout() {
            return C15982q.f49620c;
        }
    }

    /* renamed from: okio.k$4 */
    class C185504 extends C17701a {
        /* renamed from: a */
        final /* synthetic */ Socket f57798a;

        C185504(Socket socket) {
            this.f57798a = socket;
        }

        /* renamed from: a */
        protected IOException mo13892a(@Nullable IOException iOException) {
            IOException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: a */
        protected void mo13893a() {
            Logger logger;
            Level level;
            StringBuilder stringBuilder;
            try {
                this.f57798a.close();
            } catch (Throwable e) {
                logger = C15976k.f49607a;
                level = Level.WARNING;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to close timed out socket ");
                stringBuilder.append(this.f57798a);
                logger.log(level, stringBuilder.toString(), e);
            } catch (AssertionError e2) {
                if (C15976k.m60617a(e2)) {
                    logger = C15976k.f49607a;
                    level = Level.WARNING;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to close timed out socket ");
                    stringBuilder.append(this.f57798a);
                    logger.log(level, stringBuilder.toString(), e2);
                    return;
                }
                throw e2;
            }
        }
    }

    private C15976k() {
    }

    /* renamed from: a */
    public static BufferedSource m60609a(Source source) {
        return new C18552n(source);
    }

    /* renamed from: a */
    public static BufferedSink m60608a(Sink sink) {
        return new C18551m(sink);
    }

    /* renamed from: a */
    public static Sink m60611a(OutputStream outputStream) {
        return C15976k.m60612a(outputStream, new C15982q());
    }

    /* renamed from: a */
    private static Sink m60612a(OutputStream outputStream, C15982q c15982q) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (c15982q != null) {
            return new C177091(c15982q, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static Sink m60613a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        } else {
            C15982q c = C15976k.m60621c(socket);
            return c.m64450a(C15976k.m60612a(socket.getOutputStream(), c));
        }
    }

    /* renamed from: a */
    public static Source m60615a(InputStream inputStream) {
        return C15976k.m60616a(inputStream, new C15982q());
    }

    /* renamed from: a */
    private static Source m60616a(InputStream inputStream, C15982q c15982q) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (c15982q != null) {
            return new C177102(c15982q, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static Source m60614a(File file) throws FileNotFoundException {
        if (file != null) {
            return C15976k.m60615a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static Sink m60618b(File file) throws FileNotFoundException {
        if (file != null) {
            return C15976k.m60611a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    public static Sink m60620c(File file) throws FileNotFoundException {
        if (file != null) {
            return C15976k.m60611a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static Sink m60610a() {
        return new C177113();
    }

    /* renamed from: b */
    public static Source m60619b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        } else {
            C15982q c = C15976k.m60621c(socket);
            return c.m64451a(C15976k.m60616a(socket.getInputStream(), c));
        }
    }

    /* renamed from: c */
    private static C17701a m60621c(Socket socket) {
        return new C185504(socket);
    }

    /* renamed from: a */
    static boolean m60617a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || assertionError.getMessage().contains("getsockname failed") == null) ? null : true;
    }
}
