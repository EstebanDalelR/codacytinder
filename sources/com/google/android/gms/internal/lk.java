package com.google.android.gms.internal;

final class lk implements Runnable {
    /* renamed from: a */
    private /* synthetic */ int f16343a;
    /* renamed from: b */
    private /* synthetic */ int f16344b;
    /* renamed from: c */
    private /* synthetic */ boolean f16345c;
    /* renamed from: d */
    private /* synthetic */ boolean f16346d;
    /* renamed from: e */
    private /* synthetic */ li f16347e;

    lk(li liVar, int i, int i2, boolean z, boolean z2) {
        this.f16347e = liVar;
        this.f16343a = i;
        this.f16344b = i2;
        this.f16345c = z;
        this.f16346d = z2;
    }

    public final void run() {
        synchronized (this.f16347e.f26916b) {
            boolean z = false;
            Object obj = this.f16343a != this.f16344b ? 1 : null;
            Object obj2 = (this.f16347e.f26922h || this.f16344b != 1) ? null : 1;
            Object obj3 = (obj == null || this.f16344b != 1) ? null : 1;
            Object obj4 = (obj == null || this.f16344b != 2) ? null : 1;
            obj = (obj == null || this.f16344b != 3) ? null : 1;
            Object obj5 = this.f16345c != this.f16346d ? 1 : null;
            li liVar = this.f16347e;
            if (this.f16347e.f26922h || obj2 != null) {
                z = true;
            }
            liVar.f26922h = z;
            if (this.f16347e.f26921g == null) {
                return;
            }
            if (obj2 != null) {
                try {
                    this.f16347e.f26921g.onVideoStart();
                } catch (Throwable e) {
                    hx.m19914c("Unable to call onVideoStart()", e);
                }
            }
            if (obj3 != null) {
                try {
                    this.f16347e.f26921g.onVideoPlay();
                } catch (Throwable e2) {
                    hx.m19914c("Unable to call onVideoPlay()", e2);
                }
            }
            if (obj4 != null) {
                try {
                    this.f16347e.f26921g.onVideoPause();
                } catch (Throwable e22) {
                    hx.m19914c("Unable to call onVideoPause()", e22);
                }
            }
            if (obj != null) {
                try {
                    this.f16347e.f26921g.onVideoEnd();
                } catch (Throwable e3) {
                    hx.m19914c("Unable to call onVideoEnd()", e3);
                }
            }
            if (obj5 != null) {
                try {
                    this.f16347e.f26921g.onVideoMute(this.f16346d);
                } catch (Throwable e32) {
                    hx.m19914c("Unable to call onVideoMute()", e32);
                }
            }
        }
        return;
    }
}
