package com.google.android.gms.internal;

final class aj implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ae f15322a;

    aj(ae aeVar) {
        this.f15322a = aeVar;
    }

    public final void run() {
        if (this.f15322a.f26550l != null) {
            this.f15322a.f26550l.a();
            this.f15322a.f26550l = null;
        }
    }
}
