package com.google.android.m4b.maps.ci;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.C5162c;
import com.google.android.m4b.maps.cg.C5177h;
import com.google.android.m4b.maps.cg.C5180j;
import com.google.android.m4b.maps.cg.C5184n;
import com.google.android.m4b.maps.cg.C5188s;
import com.google.android.m4b.maps.cg.C7519u;
import com.google.android.m4b.maps.cg.ac;
import com.google.android.m4b.maps.cg.an;
import com.google.android.m4b.maps.cg.ao;
import com.google.android.m4b.maps.cg.ap;
import com.google.android.m4b.maps.cg.az;
import com.google.android.m4b.maps.cg.ba.C5145a;
import com.google.android.m4b.maps.cg.bc.C5146a;
import com.google.android.m4b.maps.cg.be;
import com.google.android.m4b.maps.cg.bo;
import com.google.android.m4b.maps.cg.by;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.cg.ce;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p113m.C5475a;
import com.google.android.m4b.maps.p124x.C5549q;
import com.google.android.m4b.maps.p124x.C5551s;
import com.google.android.m4b.maps.p124x.C5558z;
import java.util.Calendar;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.ci.d */
public final class C6642d extends View implements ao {
    /* renamed from: a */
    private final C6644f f24873a = new C6644f(this);
    /* renamed from: b */
    private C6645h f24874b;
    /* renamed from: c */
    private final C6641c f24875c;
    /* renamed from: d */
    private final Resources f24876d;
    /* renamed from: e */
    private final C5207b f24877e;
    /* renamed from: f */
    private final C5206a f24878f;
    /* renamed from: g */
    private C6647k f24879g;
    /* renamed from: h */
    private GestureDetector f24880h;
    /* renamed from: i */
    private C5208g f24881i;
    /* renamed from: j */
    private C5549q f24882j;
    /* renamed from: k */
    private C5551s f24883k;
    /* renamed from: l */
    private final Context f24884l;
    /* renamed from: m */
    private final C5188s f24885m;
    /* renamed from: n */
    private final ap f24886n;
    /* renamed from: o */
    private C7519u f24887o;
    /* renamed from: p */
    private final C7525m f24888p;
    /* renamed from: q */
    private final ce f24889q;
    /* renamed from: r */
    private final cb f24890r;

    /* renamed from: a */
    public final void mo5331a() {
    }

    /* renamed from: d */
    public final View mo5339d() {
        return this;
    }

    /* renamed from: i */
    public final ac mo5348i() {
        return null;
    }

    /* renamed from: k */
    public final void mo5350k() {
    }

    /* renamed from: r */
    public final void mo5353r() {
    }

    /* renamed from: s */
    public final void mo5354s() {
    }

    /* renamed from: t */
    public final void mo5355t() {
    }

    /* renamed from: w */
    public final boolean mo5356w() {
        return false;
    }

    /* renamed from: x */
    public final boolean mo5357x() {
        return false;
    }

    /* renamed from: y */
    public final boolean mo5358y() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo5359z() {
        return false;
    }

    /* renamed from: a */
    public static C6642d m29593a(Context context, Resources resources, C5184n c5184n, ScheduledExecutorService scheduledExecutorService, View view, C5177h c5177h, C5188s c5188s, an anVar, TextView textView, ce ceVar, C5203e c5203e, cb cbVar, C5162c c5162c) {
        View c6642d = new C6642d(context, resources, c5184n, view, c5177h, c5188s, anVar, textView, ceVar, c5203e, cbVar, c5162c);
        c6642d.f24874b = new C6645h(c6642d, scheduledExecutorService);
        c6642d.f24881i = new C5208g(c6642d, c6642d.f24874b);
        c6642d.f24880h = new GestureDetector(c6642d.f24881i);
        c6642d.setFocusable(true);
        c6642d.setClickable(true);
        c6642d.f24887o = new C7519u(c6642d, c6642d.f24874b);
        ViewCompat.a(c6642d, c6642d.f24887o);
        return c6642d;
    }

    private C6642d(Context context, Resources resources, C5184n c5184n, View view, C5177h c5177h, C5188s c5188s, an anVar, TextView textView, ce ceVar, C5203e c5203e, cb cbVar, C5162c c5162c) {
        Resources resources2 = resources;
        super(context);
        this.f24884l = context;
        this.f24876d = resources2;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f24875c = new C6641c(this, resources2, handler);
        this.f24886n = c5177h.m23140e();
        m29594a(0, 0);
        this.f24877e = new C5207b(this);
        this.f24878f = new C5206a(this.f24877e, textView, c5184n.m23170b(), this.f24875c, Calendar.getInstance(), C4725p.m21034k(), anVar, c5203e, c5162c, c5184n.m23171c());
        this.f24885m = c5188s;
        this.f24888p = new C7525m(this, view, c5177h.m23135a(), by.m23062a(handler), ceVar);
        this.f24889q = ceVar;
        this.f24890r = cbVar;
    }

    /* renamed from: a */
    private void m29594a(int i, int i2) {
        if (VERSION.SDK_INT >= 11) {
            int i3 = 1;
            if (VERSION.SDK_INT >= 17 && i > 0 && i2 > 0) {
                Display display = getDisplay();
                if (display != null) {
                    Point point = new Point();
                    display.getRealSize(point);
                    if (i > point.x || i2 > point.y) {
                        i3 = 0;
                    }
                }
            }
            setLayerType(i3, 0);
        }
    }

    /* renamed from: b */
    public final void m29602b() {
        this.f24878f.m23248c();
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        m29594a(i, i2);
        super.onSizeChanged(i, i2, i3, i4);
        this.f24878f.m23248c();
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24879g = this.f24877e.m23251a(canvas, getWidth(), getHeight());
        if (this.f24879g != null) {
            this.f24874b.m29647a(canvas, this.f24879g);
            this.f24873a.m29638a(canvas, this.f24879g);
        }
        this.f24887o.m33161b();
        boolean c = this.f24874b.m29658c();
        az b = this.f24874b.m29654b();
        if (b != null) {
            this.f24886n.m32832a(true, true, b, c);
        } else if (c) {
            this.f24886n.m32833b();
        } else {
            this.f24886n.m32832a(true, false, b, c);
        }
    }

    /* renamed from: a */
    public final void mo5333a(C5549q c5549q) {
        this.f24882j = c5549q;
    }

    /* renamed from: a */
    public final void mo5334a(C5551s c5551s) {
        this.f24883k = c5551s;
    }

    /* renamed from: e */
    public final C5180j mo5340e() {
        return this.f24875c;
    }

    /* renamed from: g */
    public final be mo5344g() {
        return this.f24874b;
    }

    /* renamed from: h */
    public final C5146a mo5346h() {
        return this.f24873a;
    }

    /* renamed from: f */
    public final C5145a mo5342f() {
        return this.f24874b;
    }

    /* renamed from: j */
    public final bo mo5349j() {
        return this.f24888p;
    }

    public final Resources getResources() {
        return this.f24876d;
    }

    protected final void onDetachedFromWindow() {
        this.f24890r.mo5308a();
        this.f24878f.m23249d();
        super.onDetachedFromWindow();
    }

    /* renamed from: e */
    public final void mo5341e(boolean z) {
        if (z) {
            C4728u.m21048a((int) true, "Map gestures are not supported in Lite Mode");
        }
    }

    /* renamed from: f */
    public final void mo5343f(boolean z) {
        if (z) {
            C4728u.m21048a((int) true, "Map gestures are not supported in Lite Mode");
        }
    }

    /* renamed from: g */
    public final void mo5345g(boolean z) {
        if (z) {
            C4728u.m21048a((int) true, "Map gestures are not supported in Lite Mode");
        }
    }

    /* renamed from: h */
    public final void mo5347h(boolean z) {
        if (z) {
            C4728u.m21048a((int) true, "Map gestures are not supported in Lite Mode");
        }
    }

    /* renamed from: a */
    public final boolean mo5336a(boolean z) {
        if (z) {
            C4728u.m21048a((int) true, "Traffic is not supported in Lite Mode");
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5337b(boolean z) {
        if (z) {
            C4728u.m21048a((int) true, "Indoor is not supported in Lite Mode");
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo5338c(boolean z) {
        if (z) {
            C4728u.m21048a((int) true, "Buildings are not supported in Lite Mode");
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5332a(int i) {
        this.f24878f.m23245a(i);
    }

    public final boolean isClickable() {
        if (!this.f24889q.m23096b()) {
            return true;
        }
        ViewGroup viewGroup;
        if (getParent() == null) {
            viewGroup = null;
        } else {
            viewGroup = (ViewGroup) getParent().getParent();
        }
        if (viewGroup != null) {
            return viewGroup.isClickable();
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (!isClickable() || this.f24880h.onTouchEvent(motionEvent) == null) ? null : true;
    }

    /* renamed from: a */
    public final boolean m29600a(MotionEvent motionEvent) {
        if (this.f24879g == null) {
            return null;
        }
        if (this.f24882j != null) {
            try {
                this.f24882j.mo5800a(this.f24879g.mo4987a(new Point((int) motionEvent.getX(), (int) motionEvent.getY())));
            } catch (MotionEvent motionEvent2) {
                throw new RuntimeRemoteException(motionEvent2);
            }
        } else if (C5475a.m23830a(this.f24884l) != null) {
            return true;
        } else {
            this.f24885m.m23186a(this.f24879g.f24922e, this.f24874b.m29654b(), this.f24874b.m29658c());
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m29603b(MotionEvent motionEvent) {
        if (this.f24879g != null) {
            if (this.f24883k != null) {
                try {
                    this.f24883k.mo5802a(this.f24879g.mo4987a(new Point((int) motionEvent.getX(), (int) motionEvent.getY())));
                    return true;
                } catch (MotionEvent motionEvent2) {
                    throw new RuntimeRemoteException(motionEvent2);
                }
            }
        }
        return null;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f24887o.a(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* renamed from: l */
    public final C5162c mo5351l() {
        return this.f24878f.m23244a();
    }

    /* renamed from: m */
    public final void mo5352m() {
        this.f24878f.m23247b();
    }

    /* renamed from: a */
    public final void mo5335a(C5558z c5558z) {
        C4728u.m21048a(5, "setPoiClickListener not implemented in Lite Mode");
    }
}
