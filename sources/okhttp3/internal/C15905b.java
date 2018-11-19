package okhttp3.internal;

/* renamed from: okhttp3.internal.b */
public abstract class C15905b implements Runnable {
    /* renamed from: b */
    protected final String f49242b;

    /* renamed from: c */
    protected abstract void mo13367c();

    public C15905b(String str, Object... objArr) {
        this.f49242b = C15908c.m60157a(str, objArr);
    }

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f49242b);
        try {
            mo13367c();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
