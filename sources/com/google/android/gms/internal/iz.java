package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@zzzv
public class iz<T> implements zzalh<T> {
    /* renamed from: a */
    private final Object f23339a = new Object();
    /* renamed from: b */
    private int f23340b = 0;
    /* renamed from: c */
    private BlockingQueue<ja> f23341c = new LinkedBlockingQueue();
    /* renamed from: d */
    private T f23342d;

    /* renamed from: d */
    public final void m27365d() {
        synchronized (this.f23339a) {
            if (this.f23340b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f23340b = -1;
            for (ja jaVar : this.f23341c) {
                jaVar.f16201b.run();
            }
            this.f23341c.clear();
        }
    }

    /* renamed from: e */
    public final int m27366e() {
        return this.f23340b;
    }

    public final void zza(zzalk<T> zzalk, zzali zzali) {
        synchronized (this.f23339a) {
            if (this.f23340b == 1) {
                zzalk.zzf(this.f23342d);
            } else if (this.f23340b == -1) {
                zzali.run();
            } else if (this.f23340b == 0) {
                this.f23341c.add(new ja(this, zzalk, zzali));
            }
        }
    }

    public final void zzk(T t) {
        synchronized (this.f23339a) {
            if (this.f23340b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f23342d = t;
            this.f23340b = 1;
            for (ja jaVar : this.f23341c) {
                jaVar.f16200a.zzf(t);
            }
            this.f23341c.clear();
        }
    }
}
