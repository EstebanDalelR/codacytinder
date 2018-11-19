package com.leanplum.p069a;

/* renamed from: com.leanplum.a.bt */
final class bt implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ak f21227a;

    bt(ak akVar) {
        this.f21227a = akVar;
    }

    public final void run() {
        try {
            if (this.f21227a.f21159r != null) {
                this.f21227a.f21159r.close();
                this.f21227a.f21159r = null;
            }
        } catch (Exception e) {
            ao.f(new Object[]{"Error while disconnecting", e});
            this.f21227a.f21158q.mo6206a(e);
        }
    }
}
