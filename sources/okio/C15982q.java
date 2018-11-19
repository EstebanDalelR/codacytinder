package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.q */
public class C15982q {
    /* renamed from: c */
    public static final C15982q f49620c = new C177121();
    /* renamed from: a */
    private boolean f49621a;
    /* renamed from: b */
    private long f49622b;
    /* renamed from: d */
    private long f49623d;

    /* renamed from: okio.q$1 */
    class C177121 extends C15982q {
        /* renamed from: a */
        public C15982q mo13436a(long j) {
            return this;
        }

        /* renamed from: a */
        public C15982q mo13437a(long j, TimeUnit timeUnit) {
            return this;
        }

        /* renamed from: g */
        public void mo13440g() throws IOException {
        }

        C177121() {
        }
    }

    /* renamed from: a */
    public C15982q mo13437a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("timeout < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            this.f49623d = timeUnit.toNanos(j);
            return this;
        }
    }

    public long n_() {
        return this.f49623d;
    }

    public boolean o_() {
        return this.f49621a;
    }

    /* renamed from: d */
    public long mo13438d() {
        if (this.f49621a) {
            return this.f49622b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: a */
    public C15982q mo13436a(long j) {
        this.f49621a = true;
        this.f49622b = j;
        return this;
    }

    public C15982q p_() {
        this.f49623d = 0;
        return this;
    }

    /* renamed from: f */
    public C15982q mo13439f() {
        this.f49621a = false;
        return this;
    }

    /* renamed from: g */
    public void mo13440g() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f49621a && this.f49622b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
