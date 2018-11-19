package com.google.android.gms.internal;

@zzzv
public abstract class dy implements zzaif<zzakv> {
    /* renamed from: a */
    private final Runnable f23293a = new dz(this);
    /* renamed from: b */
    private volatile Thread f23294b;
    /* renamed from: c */
    private boolean f23295c = false;

    public dy(boolean z) {
    }

    /* renamed from: a */
    public abstract void mo6837a();

    /* renamed from: b */
    public abstract void mo6838b();

    public final void cancel() {
        mo6838b();
        if (this.f23294b != null) {
            this.f23294b.interrupt();
        }
    }

    /* renamed from: e */
    public final zzakv m27331e() {
        return this.f23295c ? fe.m19675a(1, this.f23293a) : fe.m19676a(this.f23293a);
    }

    public final /* synthetic */ Object zznd() {
        return this.f23295c ? fe.m19675a(1, this.f23293a) : fe.m19676a(this.f23293a);
    }
}
