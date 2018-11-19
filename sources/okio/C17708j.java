package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: okio.j */
public final class C17708j implements Source {
    /* renamed from: a */
    private final BufferedSource f55115a;
    /* renamed from: b */
    private final Inflater f55116b;
    /* renamed from: c */
    private int f55117c;
    /* renamed from: d */
    private boolean f55118d;

    public C17708j(Source source, Inflater inflater) {
        this(C15976k.m60609a(source), inflater);
    }

    C17708j(BufferedSource bufferedSource, Inflater inflater) {
        if (bufferedSource == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f55115a = bufferedSource;
            this.f55116b = inflater;
        }
    }

    public long read(C18549c c18549c, long j) throws IOException {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.f55118d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            boolean a;
            do {
                a = m64473a();
                try {
                    C15980o g = c18549c.m66971g(1);
                    int inflate = this.f55116b.inflate(g.f49611a, g.f49613c, (int) Math.min(j, (long) (8192 - g.f49613c)));
                    if (inflate > 0) {
                        g.f49613c += inflate;
                        long j2 = (long) inflate;
                        c18549c.f57797b += j2;
                        return j2;
                    }
                    if (!this.f55116b.finished()) {
                        if (this.f55116b.needsDictionary()) {
                        }
                    }
                    m64472b();
                    if (g.f49612b == g.f49613c) {
                        c18549c.f57796a = g.m60629c();
                        C15981p.m60632a(g);
                    }
                    return -1;
                } catch (C18549c c18549c2) {
                    throw new IOException(c18549c2);
                }
            } while (!a);
            throw new EOFException("source exhausted prematurely");
        }
    }

    /* renamed from: a */
    public boolean m64473a() throws IOException {
        if (!this.f55116b.needsInput()) {
            return false;
        }
        m64472b();
        if (this.f55116b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f55115a.exhausted()) {
            return true;
        } else {
            C15980o c15980o = this.f55115a.buffer().f57796a;
            this.f55117c = c15980o.f49613c - c15980o.f49612b;
            this.f55116b.setInput(c15980o.f49611a, c15980o.f49612b, this.f55117c);
            return false;
        }
    }

    /* renamed from: b */
    private void m64472b() throws IOException {
        if (this.f55117c != 0) {
            int remaining = this.f55117c - this.f55116b.getRemaining();
            this.f55117c -= remaining;
            this.f55115a.skip((long) remaining);
        }
    }

    public C15982q timeout() {
        return this.f55115a.timeout();
    }

    public void close() throws IOException {
        if (!this.f55118d) {
            this.f55116b.end();
            this.f55118d = true;
            this.f55115a.close();
        }
    }
}
