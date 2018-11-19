package okhttp3.internal.cache;

import java.io.IOException;
import okio.C17703e;
import okio.C18549c;
import okio.Sink;

/* renamed from: okhttp3.internal.cache.d */
class C18545d extends C17703e {
    /* renamed from: a */
    private boolean f57789a;

    /* renamed from: a */
    protected void mo14136a(IOException iOException) {
    }

    C18545d(Sink sink) {
        super(sink);
    }

    public void write(C18549c c18549c, long j) throws IOException {
        if (this.f57789a) {
            c18549c.skip(j);
            return;
        }
        try {
            super.write(c18549c, j);
        } catch (C18549c c18549c2) {
            this.f57789a = 1;
            mo14136a(c18549c2);
        }
    }

    public void flush() throws IOException {
        if (!this.f57789a) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f57789a = true;
                mo14136a(e);
            }
        }
    }

    public void close() throws IOException {
        if (!this.f57789a) {
            try {
                super.close();
            } catch (IOException e) {
                this.f57789a = true;
                mo14136a(e);
            }
        }
    }
}
