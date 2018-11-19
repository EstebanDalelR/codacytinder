package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class ao<TListener> {
    /* renamed from: a */
    private TListener f7606a;
    /* renamed from: b */
    private boolean f7607b = false;
    /* renamed from: c */
    private /* synthetic */ al f7608c;

    public ao(al alVar, TListener tListener) {
        this.f7608c = alVar;
        this.f7606a = tListener;
    }

    /* renamed from: a */
    protected abstract void mo2577a(TListener tListener);

    /* renamed from: b */
    public final void m9103b() {
        synchronized (this) {
            Object obj = this.f7606a;
            if (this.f7607b) {
                String valueOf = String.valueOf(this);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                stringBuilder.append("Callback proxy ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" being reused. This is not safe.");
                Log.w("GmsClient", stringBuilder.toString());
            }
        }
        if (obj != null) {
            try {
                mo2577a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f7607b = true;
        }
        m9104c();
    }

    /* renamed from: c */
    public final void m9104c() {
        m9105d();
        synchronized (this.f7608c.f7596r) {
            this.f7608c.f7596r.remove(this);
        }
    }

    /* renamed from: d */
    public final void m9105d() {
        synchronized (this) {
            this.f7606a = null;
        }
    }
}
