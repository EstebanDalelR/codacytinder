package okhttp3.internal.http2;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C15908c;
import okhttp3.internal.http2.C15932b.C15931b;
import okio.BufferedSink;
import okio.C18549c;

/* renamed from: okhttp3.internal.http2.h */
final class C15940h implements Closeable {
    /* renamed from: b */
    private static final Logger f49441b = Logger.getLogger(C15933c.class.getName());
    /* renamed from: a */
    final C15931b f49442a = new C15931b(this.f49445e);
    /* renamed from: c */
    private final BufferedSink f49443c;
    /* renamed from: d */
    private final boolean f49444d;
    /* renamed from: e */
    private final C18549c f49445e = new C18549c();
    /* renamed from: f */
    private int f49446f = 16384;
    /* renamed from: g */
    private boolean f49447g;

    C15940h(BufferedSink bufferedSink, boolean z) {
        this.f49443c = bufferedSink;
        this.f49444d = z;
    }

    /* renamed from: a */
    public synchronized void m60394a() throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        } else if (this.f49444d) {
            if (f49441b.isLoggable(Level.FINE)) {
                f49441b.fine(C15908c.m60157a(">> CONNECTION %s", C15933c.f49388a.mo13429f()));
            }
            this.f49443c.write(C15933c.f49388a.mo13433i());
            this.f49443c.flush();
        }
    }

    /* renamed from: a */
    public synchronized void m60401a(C15943j c15943j) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        this.f49446f = c15943j.m60424d(this.f49446f);
        if (c15943j.m60421c() != -1) {
            this.f49442a.m60305a(c15943j.m60421c());
        }
        m60396a(0, 0, (byte) 4, (byte) 1);
        this.f49443c.flush();
    }

    /* renamed from: a */
    public synchronized void m60397a(int i, int i2, List<C15929a> list) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        this.f49442a.m60307a((List) list);
        long a = this.f49445e.m66945a();
        list = (int) Math.min((long) (this.f49446f - 4), a);
        long j = (long) list;
        m60396a(i, list + 4, (byte) 5, a == j ? (byte) 4 : (byte) 0);
        this.f49443c.writeInt(i2 & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        this.f49443c.write(this.f49445e, j);
        if (a > j) {
            m60393b(i, a - j);
        }
    }

    /* renamed from: b */
    public synchronized void m60406b() throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        this.f49443c.flush();
    }

    /* renamed from: a */
    public synchronized void m60403a(boolean z, int i, int i2, List<C15929a> list) throws IOException {
        if (this.f49447g != 0) {
            throw new IOException("closed");
        }
        m60404a(z, i, (List) list);
    }

    /* renamed from: a */
    public synchronized void m60399a(int i, ErrorCode errorCode) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        } else if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        } else {
            m60396a(i, 4, (byte) 3, (byte) 0);
            this.f49443c.writeInt(errorCode.httpCode);
            this.f49443c.flush();
        }
    }

    /* renamed from: c */
    public int m60408c() {
        return this.f49446f;
    }

    /* renamed from: a */
    public synchronized void m60405a(boolean z, int i, C18549c c18549c, int i2) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        byte b = (byte) 0;
        if (z) {
            b = (byte) true;
        }
        m60395a(i, b, c18549c, i2);
    }

    /* renamed from: a */
    void m60395a(int i, byte b, C18549c c18549c, int i2) throws IOException {
        m60396a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f49443c.write(c18549c, (long) i2);
        }
    }

    /* renamed from: b */
    public synchronized void m60407b(C15943j c15943j) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        int i = (byte) 0;
        m60396a(0, c15943j.m60419b() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (c15943j.m60418a(i)) {
                int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                this.f49443c.writeShort(i2);
                this.f49443c.writeInt(c15943j.m60420b(i));
            }
            i++;
        }
        this.f49443c.flush();
    }

    /* renamed from: a */
    public synchronized void m60402a(boolean z, int i, int i2) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        m60396a(0, 8, (byte) 6, (byte) z);
        this.f49443c.writeInt(i);
        this.f49443c.writeInt(i2);
        this.f49443c.flush();
    }

    /* renamed from: a */
    public synchronized void m60400a(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        } else if (errorCode.httpCode == -1) {
            throw C15933c.m60311a("errorCode.httpCode == -1", new Object[0]);
        } else {
            m60396a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f49443c.writeInt(i);
            this.f49443c.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f49443c.write(bArr);
            }
            this.f49443c.flush();
        }
    }

    /* renamed from: a */
    public synchronized void m60398a(int i, long j) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        if (j != 0) {
            if (j <= 2147483647L) {
                m60396a(i, 4, (byte) 8, (byte) 0);
                this.f49443c.writeInt((int) j);
                this.f49443c.flush();
            }
        }
        throw C15933c.m60311a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
    }

    /* renamed from: a */
    public void m60396a(int i, int i2, byte b, byte b2) throws IOException {
        if (f49441b.isLoggable(Level.FINE)) {
            f49441b.fine(C15933c.m60313a(false, i, i2, b, b2));
        }
        if (i2 > this.f49446f) {
            throw C15933c.m60311a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f49446f), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) != 0) {
            throw C15933c.m60311a("reserved bit set: %s", Integer.valueOf(i));
        } else {
            C15940h.m60392a(this.f49443c, i2);
            this.f49443c.writeByte(b & 255);
            this.f49443c.writeByte(b2 & 255);
            this.f49443c.writeInt(i & DefaultClassResolver.NAME);
        }
    }

    public synchronized void close() throws IOException {
        this.f49447g = true;
        this.f49443c.close();
    }

    /* renamed from: a */
    private static void m60392a(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    /* renamed from: b */
    private void m60393b(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f49446f, j);
            long j2 = (long) min;
            long j3 = j - j2;
            m60396a(i, min, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
            this.f49443c.write(this.f49445e, j2);
            j = j3;
        }
    }

    /* renamed from: a */
    void m60404a(boolean z, int i, List<C15929a> list) throws IOException {
        if (this.f49447g) {
            throw new IOException("closed");
        }
        this.f49442a.m60307a((List) list);
        long a = this.f49445e.m66945a();
        int min = (int) Math.min((long) this.f49446f, a);
        long j = (long) min;
        byte b = a == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m60396a(i, min, (byte) true, b);
        this.f49443c.write(this.f49445e, j);
        if (a > j) {
            m60393b(i, a - j);
        }
    }
}
