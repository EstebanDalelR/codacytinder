package com.leanplum.p069a;

/* renamed from: com.leanplum.a.av */
final class av implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C7038o f21174a;

    av(C7038o c7038o) {
        this.f21174a = c7038o;
    }

    public final void run() {
        if (this.f21174a.f25595a != null) {
            this.f21174a.f25595a.onResponse(false);
        }
    }
}
