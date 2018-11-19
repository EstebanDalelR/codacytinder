package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: okio.d */
public final class C17702d implements Sink {
    /* renamed from: a */
    private final BufferedSink f55100a;
    /* renamed from: b */
    private final Deflater f55101b;
    /* renamed from: c */
    private boolean f55102c;

    public C17702d(Sink sink, Deflater deflater) {
        this(C15976k.m60608a(sink), deflater);
    }

    C17702d(BufferedSink bufferedSink, Deflater deflater) {
        if (bufferedSink == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f55100a = bufferedSink;
            this.f55101b = deflater;
        }
    }

    public void write(C18549c c18549c, long j) throws IOException {
        C15983r.m60641a(c18549c.f57797b, 0, j);
        while (j > 0) {
            C15980o c15980o = c18549c.f57796a;
            int min = (int) Math.min(j, (long) (c15980o.f49613c - c15980o.f49612b));
            this.f55101b.setInput(c15980o.f49611a, c15980o.f49612b, min);
            m64456a(false);
            long j2 = (long) min;
            c18549c.f57797b -= j2;
            c15980o.f49612b += min;
            if (c15980o.f49612b == c15980o.f49613c) {
                c18549c.f57796a = c15980o.m60629c();
                C15981p.m60632a(c15980o);
            }
            j -= j2;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private void m64456a(boolean z) throws IOException {
        C18549c buffer = this.f55100a.buffer();
        while (true) {
            int deflate;
            C15980o g = buffer.m66971g(1);
            if (z) {
                deflate = this.f55101b.deflate(g.f49611a, g.f49613c, 8192 - g.f49613c, 2);
            } else {
                deflate = this.f55101b.deflate(g.f49611a, g.f49613c, 8192 - g.f49613c);
            }
            if (deflate > 0) {
                g.f49613c += deflate;
                buffer.f57797b += (long) deflate;
                this.f55100a.emitCompleteSegments();
            } else if (this.f55101b.needsInput()) {
                break;
            }
        }
        if (g.f49612b == g.f49613c) {
            buffer.f57796a = g.m60629c();
            C15981p.m60632a(g);
        }
    }

    public void flush() throws IOException {
        m64456a(true);
        this.f55100a.flush();
    }

    /* renamed from: a */
    void m64457a() throws IOException {
        this.f55101b.finish();
        m64456a(false);
    }

    public void close() throws IOException {
        if (!this.f55102c) {
            Throwable th = null;
            try {
                m64457a();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f55101b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f55100a.close();
            } catch (Throwable th32) {
                if (th == null) {
                    th = th32;
                }
            }
            this.f55102c = true;
            if (th != null) {
                C15983r.m60642a(th);
            }
        }
    }

    public C15982q timeout() {
        return this.f55100a.timeout();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeflaterSink(");
        stringBuilder.append(this.f55100a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
