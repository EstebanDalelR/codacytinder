package retrofit;

import java.io.IOException;
import java.io.InputStream;
import retrofit.mime.TypedInput;

/* renamed from: retrofit.c */
class C19524c implements TypedInput {
    /* renamed from: a */
    private final TypedInput f61028a;
    /* renamed from: b */
    private final C19364a f61029b;

    /* renamed from: retrofit.c$a */
    private static class C19364a extends InputStream {
        /* renamed from: a */
        private final InputStream f60485a;
        /* renamed from: b */
        private IOException f60486b;

        C19364a(InputStream inputStream) {
            this.f60485a = inputStream;
        }

        public int read() throws IOException {
            try {
                return this.f60485a.read();
            } catch (IOException e) {
                this.f60486b = e;
                throw e;
            }
        }

        public int read(byte[] bArr) throws IOException {
            try {
                return this.f60485a.read(bArr);
            } catch (byte[] bArr2) {
                this.f60486b = bArr2;
                throw bArr2;
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            try {
                return this.f60485a.read(bArr, i, i2);
            } catch (byte[] bArr2) {
                this.f60486b = bArr2;
                throw bArr2;
            }
        }

        public long skip(long j) throws IOException {
            try {
                return this.f60485a.skip(j);
            } catch (long j2) {
                this.f60486b = j2;
                throw j2;
            }
        }

        public int available() throws IOException {
            try {
                return this.f60485a.available();
            } catch (IOException e) {
                this.f60486b = e;
                throw e;
            }
        }

        public void close() throws IOException {
            try {
                this.f60485a.close();
            } catch (IOException e) {
                this.f60486b = e;
                throw e;
            }
        }

        public synchronized void mark(int i) {
            this.f60485a.mark(i);
        }

        public synchronized void reset() throws IOException {
            try {
                this.f60485a.reset();
            } catch (IOException e) {
                this.f60486b = e;
                throw e;
            }
        }

        public boolean markSupported() {
            return this.f60485a.markSupported();
        }
    }

    C19524c(TypedInput typedInput) throws IOException {
        this.f61028a = typedInput;
        this.f61029b = new C19364a(typedInput.in());
    }

    public String mimeType() {
        return this.f61028a.mimeType();
    }

    public long length() {
        return this.f61028a.length();
    }

    public InputStream in() throws IOException {
        return this.f61029b;
    }

    /* renamed from: a */
    IOException m70490a() {
        return this.f61029b.f60486b;
    }

    /* renamed from: b */
    boolean m70491b() {
        return this.f61029b.f60486b != null;
    }
}
