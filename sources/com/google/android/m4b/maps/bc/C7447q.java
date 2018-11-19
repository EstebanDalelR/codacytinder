package com.google.android.m4b.maps.bc;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.cg.C6599a;
import com.google.android.m4b.maps.cg.ce;
import com.google.android.m4b.maps.p124x.ag;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.m4b.maps.bc.q */
public final class C7447q extends C6599a {
    public C7447q(C6450v c6450v, View view, View view2, boolean z, Executor executor, ce ceVar) {
        super((View) c6450v, view, view2, z, executor, ceVar);
    }

    /* renamed from: a */
    protected final void mo7049a(Bitmap bitmap, final ag agVar, boolean z) {
        bitmap = C4733b.m21061a(((C6450v) this.a).m28289a(bitmap));
        m29469a(bitmap, z);
        this.b.execute(new Runnable(this) {
            /* renamed from: c */
            private /* synthetic */ C7447q f17438c;

            public final void run() {
                this.f17438c.m29470a(agVar, bitmap);
            }
        });
    }
}
