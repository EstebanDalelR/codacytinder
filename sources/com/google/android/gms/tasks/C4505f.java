package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.f */
final class C4505f implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C4500a f16743a;
    /* renamed from: b */
    private /* synthetic */ C6289e f16744b;

    C4505f(C6289e c6289e, C4500a c4500a) {
        this.f16744b = c6289e;
        this.f16743a = c4500a;
    }

    public final void run() {
        try {
            this.f16744b.f23555c.m27626a(this.f16744b.f23554b.then(this.f16743a));
        } catch (Exception e) {
            if (e.getCause() instanceof Exception) {
                this.f16744b.f23555c.m27625a((Exception) e.getCause());
            } else {
                this.f16744b.f23555c.m27625a(e);
            }
        } catch (Exception e2) {
            this.f16744b.f23555c.m27625a(e2);
        }
    }
}
