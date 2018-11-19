package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: okio.i */
public final class C17707i implements Source {
    /* renamed from: a */
    private int f55110a = 0;
    /* renamed from: b */
    private final BufferedSource f55111b;
    /* renamed from: c */
    private final Inflater f55112c;
    /* renamed from: d */
    private final C17708j f55113d;
    /* renamed from: e */
    private final CRC32 f55114e = new CRC32();

    public C17707i(Source source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f55112c = new Inflater(true);
        this.f55111b = C15976k.m60609a(source);
        this.f55113d = new C17708j(this.f55111b, this.f55112c);
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
            if (this.f55110a == 0) {
                m64468a();
                this.f55110a = 1;
            }
            if (this.f55110a == 1) {
                long j2 = c18549c.f57797b;
                j = this.f55113d.read(c18549c, j);
                if (j != -1) {
                    m64470a(c18549c, j2, j);
                    return j;
                }
                this.f55110a = 2;
            }
            if (this.f55110a == 2) {
                m64471b();
                this.f55110a = 3;
                if (this.f55111b.exhausted() == null) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    private void m64468a() throws IOException {
        this.f55111b.require(10);
        byte a = this.f55111b.buffer().m66943a(3);
        Object obj = ((a >> 1) & 1) == 1 ? 1 : null;
        if (obj != null) {
            m64470a(r6.f55111b.buffer(), 0, 10);
        }
        m64469a("ID1ID2", 8075, r6.f55111b.readShort());
        r6.f55111b.skip(8);
        if (((a >> 2) & 1) == 1) {
            r6.f55111b.require(2);
            if (obj != null) {
                m64470a(r6.f55111b.buffer(), 0, 2);
            }
            long readShortLe = (long) r6.f55111b.buffer().readShortLe();
            r6.f55111b.require(readShortLe);
            if (obj != null) {
                m64470a(r6.f55111b.buffer(), 0, readShortLe);
            }
            r6.f55111b.skip(readShortLe);
        }
        if (((a >> 3) & 1) == 1) {
            long indexOf = r6.f55111b.indexOf((byte) 0);
            if (indexOf == -1) {
                throw new EOFException();
            }
            if (obj != null) {
                m64470a(r6.f55111b.buffer(), 0, indexOf + 1);
            }
            r6.f55111b.skip(indexOf + 1);
        }
        if (((a >> 4) & 1) == 1) {
            long indexOf2 = r6.f55111b.indexOf((byte) 0);
            if (indexOf2 == -1) {
                throw new EOFException();
            }
            if (obj != null) {
                m64470a(r6.f55111b.buffer(), 0, indexOf2 + 1);
            }
            r6.f55111b.skip(indexOf2 + 1);
        }
        if (obj != null) {
            m64469a("FHCRC", r6.f55111b.readShortLe(), (short) ((int) r6.f55114e.getValue()));
            r6.f55114e.reset();
        }
    }

    /* renamed from: b */
    private void m64471b() throws IOException {
        m64469a("CRC", this.f55111b.readIntLe(), (int) this.f55114e.getValue());
        m64469a("ISIZE", this.f55111b.readIntLe(), (int) this.f55112c.getBytesWritten());
    }

    public C15982q timeout() {
        return this.f55111b.timeout();
    }

    public void close() throws IOException {
        this.f55113d.close();
    }

    /* renamed from: a */
    private void m64470a(C18549c c18549c, long j, long j2) {
        c18549c = c18549c.f57796a;
        while (j >= ((long) (c18549c.f49613c - c18549c.f49612b))) {
            long j3 = j - ((long) (c18549c.f49613c - c18549c.f49612b));
            c18549c = c18549c.f49616f;
            j = j3;
        }
        while (j2 > 0) {
            j = (int) (((long) c18549c.f49612b) + j);
            int min = (int) Math.min((long) (c18549c.f49613c - j), j2);
            this.f55114e.update(c18549c.f49611a, j, min);
            j3 = j2 - ((long) min);
            c18549c = c18549c.f49616f;
            j = 0;
            j2 = j3;
        }
    }

    /* renamed from: a */
    private void m64469a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
