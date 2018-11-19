package com.google.android.m4b.maps.cg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.view.TextureView;
import android.view.View;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.ag;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.m4b.maps.cg.a */
public abstract class C6599a implements bo {
    /* renamed from: a */
    protected final View f24748a;
    /* renamed from: b */
    protected final Executor f24749b;
    /* renamed from: c */
    private final boolean f24750c;
    /* renamed from: d */
    private final View f24751d;
    /* renamed from: e */
    private final View f24752e;
    /* renamed from: f */
    private final ce f24753f;

    /* renamed from: a */
    protected abstract void mo7049a(Bitmap bitmap, ag agVar, boolean z);

    protected C6599a(View view, View view2, View view3, boolean z, Executor executor, ce ceVar) {
        this.f24748a = view;
        this.f24751d = view2;
        this.f24752e = view3;
        this.f24750c = z;
        this.f24749b = executor;
        this.f24753f = ceVar;
    }

    /* renamed from: b */
    public final synchronized void mo5296b(Bitmap bitmap, final ag agVar, boolean z) {
        z = this.f24748a.getWidth();
        int height = this.f24748a.getHeight();
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(z, height, Config.ARGB_8888);
        } else if (!(bitmap.getWidth() == z && bitmap.getHeight() == height)) {
            C4728u.m21048a(5, "The Bitmap provided in the snapshot() method does not match the map's dimensions, hence another Bitmap is allocated with the right dimensions. If you think this is due to the fact that the map was resized, you can ignore this message. Otherwise, you should check the dimensions of the Bitmap passed to the method.");
            bitmap = Bitmap.createBitmap(z, height, Config.ARGB_8888);
        }
        if (this.f24750c) {
            this.f24749b.execute(new Runnable(this, false) {
                /* renamed from: d */
                private /* synthetic */ C6599a f19035d;

                public final void run() {
                    Bitmap bitmap;
                    int width = this.f19035d.f24748a.getWidth();
                    int height = this.f19035d.f24748a.getHeight();
                    if (bitmap.getWidth() == width) {
                        if (bitmap.getHeight() == height) {
                            bitmap = bitmap;
                            ((TextureView) this.f19035d.f24748a).getBitmap(bitmap);
                            this.f19035d.m29469a(bitmap, false);
                            this.f19035d.m29470a(agVar, bitmap);
                        }
                    }
                    bitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
                    ((TextureView) this.f19035d.f24748a).getBitmap(bitmap);
                    this.f19035d.m29469a(bitmap, false);
                    this.f19035d.m29470a(agVar, bitmap);
                }
            });
        } else {
            mo7049a(bitmap, agVar, false);
        }
    }

    /* renamed from: a */
    protected final void m29470a(ag agVar, Bitmap bitmap) {
        try {
            if ((this.f24753f.m23095a(4000000) ^ 1) != 0) {
                agVar.mo5695a(bitmap);
            } else {
                agVar.mo5696a(C7701d.m33407a((Object) bitmap));
            }
        } catch (ag agVar2) {
            throw new RuntimeRemoteException(agVar2);
        }
    }

    /* renamed from: a */
    protected final void m29469a(Bitmap bitmap, boolean z) {
        Canvas canvas = new Canvas(bitmap);
        this.f24751d.draw(canvas);
        if (z) {
            this.f24752e.draw(canvas);
        }
    }
}
