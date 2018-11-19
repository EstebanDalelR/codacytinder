package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: okio.h */
public final class C17706h implements Sink {
    /* renamed from: a */
    private final BufferedSink f55105a;
    /* renamed from: b */
    private final Deflater f55106b;
    /* renamed from: c */
    private final C17702d f55107c;
    /* renamed from: d */
    private boolean f55108d;
    /* renamed from: e */
    private final CRC32 f55109e = new CRC32();

    public C17706h(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.f55106b = new Deflater(-1, true);
        this.f55105a = C15976k.m60608a(sink);
        this.f55107c = new C17702d(this.f55105a, this.f55106b);
        m64465a();
    }

    public void write(C18549c c18549c, long j) throws IOException {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j != 0) {
            m64466a(c18549c, j);
            this.f55107c.write(c18549c, j);
        }
    }

    public void flush() throws IOException {
        this.f55107c.flush();
    }

    public C15982q timeout() {
        return this.f55105a.timeout();
    }

    public void close() throws IOException {
        if (!this.f55108d) {
            Throwable th = null;
            try {
                this.f55107c.m64457a();
                m64467b();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f55106b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f55105a.close();
            } catch (Throwable th32) {
                if (th == null) {
                    th = th32;
                }
            }
            this.f55108d = true;
            if (th != null) {
                C15983r.m60642a(th);
            }
        }
    }

    /* renamed from: a */
    private void m64465a() {
        C18549c buffer = this.f55105a.buffer();
        buffer.m66960c(8075);
        buffer.m66958b(8);
        buffer.m66958b(0);
        buffer.m66966e(0);
        buffer.m66958b(0);
        buffer.m66958b(0);
    }

    /* renamed from: b */
    private void m64467b() throws IOException {
        this.f55105a.writeIntLe((int) this.f55109e.getValue());
        this.f55105a.writeIntLe((int) this.f55106b.getBytesRead());
    }

    /* renamed from: a */
    private void m64466a(C18549c c18549c, long j) {
        c18549c = c18549c.f57796a;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (c18549c.f49613c - c18549c.f49612b));
            this.f55109e.update(c18549c.f49611a, c18549c.f49612b, min);
            long j2 = j - ((long) min);
            c18549c = c18549c.f49616f;
            j = j2;
        }
    }
}
