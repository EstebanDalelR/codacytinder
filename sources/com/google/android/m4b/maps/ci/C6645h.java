package com.google.android.m4b.maps.ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.MotionEvent;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.C7520v;
import com.google.android.m4b.maps.cg.C7520v.C5193a;
import com.google.android.m4b.maps.cg.av;
import com.google.android.m4b.maps.cg.ax;
import com.google.android.m4b.maps.cg.ax.C6602a;
import com.google.android.m4b.maps.cg.az;
import com.google.android.m4b.maps.cg.az.C5143a;
import com.google.android.m4b.maps.cg.ba.C5145a;
import com.google.android.m4b.maps.cg.be;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.cg.ca;
import com.google.android.m4b.maps.cg.ca.C5163a;
import com.google.android.m4b.maps.p124x.C5544l;
import com.google.android.m4b.maps.p124x.C5553u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.ci.h */
public final class C6645h implements C5145a, be {
    /* renamed from: a */
    private final List<C5212l> f24903a = new ArrayList();
    /* renamed from: b */
    private final List<C6643e> f24904b = new ArrayList();
    /* renamed from: c */
    private final List<az> f24905c = new ArrayList();
    /* renamed from: d */
    private final C6642d f24906d;
    /* renamed from: e */
    private az f24907e;
    /* renamed from: f */
    private float f24908f;
    /* renamed from: g */
    private float f24909g;
    /* renamed from: h */
    private float f24910h;
    /* renamed from: i */
    private float f24911i;
    /* renamed from: j */
    private C5209a f24912j = new C5209a(this);
    /* renamed from: k */
    private final ScheduledExecutorService f24913k;

    /* renamed from: com.google.android.m4b.maps.ci.h$a */
    class C5209a implements Comparator<C5212l> {
        /* renamed from: a */
        private /* synthetic */ C6645h f19407a;

        C5209a(C6645h c6645h) {
            this.f19407a = c6645h;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return Float.compare(((C5212l) obj).mo5368b(), ((C5212l) obj2).mo5368b());
        }
    }

    /* renamed from: a */
    public final void mo5364a(av avVar) {
    }

    /* renamed from: a */
    public final void mo5365a(C5544l c5544l) {
    }

    /* renamed from: a */
    public final void mo5366a(C5553u c5553u) {
    }

    public C6645h(C6642d c6642d, ScheduledExecutorService scheduledExecutorService) {
        this.f24906d = c6642d;
        this.f24913k = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C5193a mo5363a(C7520v c7520v) {
        C4728u.m21048a(5, "Ground Overlays are not supported in Lite Mode");
        return null;
    }

    /* renamed from: a */
    public final C6602a mo5360a(ax axVar) {
        C4728u.m21048a(5, "Maps Engine Layers are not supported in Lite Mode");
        return null;
    }

    /* renamed from: a */
    public final C5148a mo5361a(bg bgVar, boolean z) {
        return new C6646j(bgVar, z, this);
    }

    /* renamed from: a */
    public final C5163a mo5362a(ca caVar) {
        C4728u.m21048a(5, "Tile Overlays are not supported in Lite Mode");
        return null;
    }

    /* renamed from: a */
    final void m29650a(C5212l c5212l) {
        this.f24903a.add(c5212l);
        this.f24906d.invalidate();
    }

    /* renamed from: b */
    final void m29656b(C5212l c5212l) {
        this.f24903a.remove(c5212l);
        this.f24906d.invalidate();
    }

    /* renamed from: a */
    final void m29649a(C6643e c6643e) {
        this.f24904b.add(c6643e);
        this.f24906d.invalidate();
    }

    /* renamed from: b */
    final void m29655b(C6643e c6643e) {
        this.f24904b.remove(c6643e);
        if (this.f24907e == c6643e.m29635g()) {
            this.f24907e = null;
        }
        this.f24906d.invalidate();
    }

    /* renamed from: c */
    final void m29657c(C6643e c6643e) {
        this.f24907e = c6643e.m29635g();
        this.f24906d.invalidate();
    }

    /* renamed from: d */
    final void m29660d(C6643e c6643e) {
        if (this.f24907e == c6643e.m29635g()) {
            this.f24907e = null;
        }
        this.f24906d.invalidate();
    }

    /* renamed from: e */
    final boolean m29661e(C6643e c6643e) {
        return this.f24907e == c6643e.m29635g() ? true : null;
    }

    /* renamed from: a */
    public final void m29646a() {
        this.f24906d.invalidate();
    }

    /* renamed from: a */
    public final boolean m29653a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent = motionEvent.getY();
        if (this.f24907e == null || x < this.f24908f || x > this.f24908f + this.f24910h || motionEvent < this.f24909g || motionEvent > this.f24909g + this.f24911i) {
            az azVar = null;
            float f = 1.0E30f;
            for (az azVar2 : this.f24905c) {
                if (azVar2.isVisible()) {
                    Rect t = azVar2.m32887t();
                    float exactCenterX = x - t.exactCenterX();
                    float exactCenterY = motionEvent - t.exactCenterY();
                    exactCenterX = (exactCenterX * exactCenterX) + (exactCenterY * exactCenterY);
                    if (exactCenterX < f) {
                        azVar = azVar2;
                        f = exactCenterX;
                    }
                }
            }
            if (azVar != null) {
                if (azVar.isVisible()) {
                    Rect t2 = azVar.m32887t();
                    Rect rect = new Rect(t2.left - 10, t2.top - 10, t2.right + 10, t2.bottom + 10);
                    if (x >= ((float) rect.left) && x <= ((float) rect.right) && motionEvent >= ((float) rect.top) && motionEvent <= ((float) rect.bottom)) {
                        motionEvent = true;
                        if (motionEvent != null) {
                            azVar.showInfoWindow();
                            azVar.m32886s().m22937g(azVar);
                            if (!(this.f24907e == null || this.f24907e == azVar)) {
                                this.f24907e.hideInfoWindow();
                            }
                            this.f24907e = azVar;
                            this.f24906d.invalidate();
                            return true;
                        } else if (this.f24907e != null) {
                            return false;
                        } else {
                            this.f24907e.hideInfoWindow();
                            this.f24907e = null;
                            this.f24906d.invalidate();
                            return true;
                        }
                    }
                }
            }
            motionEvent = null;
            if (motionEvent != null) {
                azVar.showInfoWindow();
                azVar.m32886s().m22937g(azVar);
                this.f24907e.hideInfoWindow();
                this.f24907e = azVar;
                this.f24906d.invalidate();
                return true;
            } else if (this.f24907e != null) {
                return false;
            } else {
                this.f24907e.hideInfoWindow();
                this.f24907e = null;
                this.f24906d.invalidate();
                return true;
            }
        }
        this.f24907e.m32886s().m22938h(this.f24907e);
        return true;
    }

    /* renamed from: a */
    public final void m29647a(Canvas canvas, C6647k c6647k) {
        Collections.sort(this.f24903a, this.f24912j);
        for (C5212l a : this.f24903a) {
            a.mo5367a(canvas, c6647k);
        }
        for (C6643e a2 : this.f24904b) {
            a2.m29629a(canvas, c6647k);
        }
        this.f24905c.clear();
        if (c6647k != null) {
            Rect rect = new Rect(0, 0, c6647k.f24923f, c6647k.f24924g);
            for (C6643e a22 : this.f24904b) {
                if (Rect.intersects(rect, a22.mo4947i())) {
                    this.f24905c.add(a22.m29635g());
                }
            }
        }
        if (this.f24907e != null) {
            c6647k = this.f24907e;
            Bitmap c = c6647k.m32870c();
            Rect t = c6647k.m32887t();
            Bitmap bitmap = null;
            try {
                bitmap = c6647k.m32886s().m22931b().mo7149a(c6647k, canvas.getWidth(), canvas.getHeight());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            if (bitmap != null) {
                this.f24910h = (float) bitmap.getWidth();
                this.f24911i = (float) bitmap.getHeight();
                float h = c6647k.m32875h();
                c6647k = c6647k.m32877j();
                Paint paint = new Paint();
                this.f24908f = (((float) t.left) + (h * ((float) c.getWidth()))) - (this.f24910h / 2.0f);
                this.f24909g = (((float) t.top) + (c6647k * ((float) c.getHeight()))) - this.f24911i;
                canvas.drawBitmap(bitmap, this.f24908f, this.f24909g, paint);
            }
        }
    }

    /* renamed from: b */
    public final az m29654b() {
        return this.f24905c.size() == 1 ? (az) this.f24905c.get(0) : null;
    }

    /* renamed from: c */
    public final boolean m29658c() {
        return this.f24905c.size() > 1;
    }

    /* renamed from: d */
    public final List<az> mo4937d() {
        return this.f24905c;
    }

    /* renamed from: a */
    public final C5143a mo4933a(az azVar) {
        return new C6643e(azVar, this);
    }
}
