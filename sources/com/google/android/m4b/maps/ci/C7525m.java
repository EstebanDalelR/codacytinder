package com.google.android.m4b.maps.ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.m4b.maps.cg.C6599a;
import com.google.android.m4b.maps.cg.ce;
import com.google.android.m4b.maps.p124x.ag;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.m4b.maps.ci.m */
public final class C7525m extends C6599a {
    protected C7525m(View view, View view2, View view3, Executor executor, ce ceVar) {
        super(view, view2, view3, false, executor, ceVar);
    }

    /* renamed from: a */
    protected final void mo7049a(final Bitmap bitmap, final ag agVar, final boolean z) {
        this.b.execute(new Runnable(this) {
            /* renamed from: d */
            private /* synthetic */ C7525m f19413d;

            public final void run() {
                this.f19413d.a.draw(new Canvas(bitmap));
                this.f19413d.m29469a(bitmap, z);
                this.f19413d.m29470a(agVar, bitmap);
            }
        });
    }
}
