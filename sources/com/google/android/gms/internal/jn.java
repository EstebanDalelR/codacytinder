package com.google.android.gms.internal;

final class jn implements Runnable {
    /* renamed from: a */
    private /* synthetic */ jf f16214a;

    jn(jf jfVar) {
        this.f16214a = jfVar;
    }

    public final void run() {
        if (this.f16214a.f26907r != null) {
            this.f16214a.f26907r.onPaused();
        }
    }
}
