package com.google.android.m4b.maps.bx;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bl.C4812h;
import com.google.android.m4b.maps.bl.C4816i.C4814a;
import com.google.android.m4b.maps.bl.C4817j;
import com.google.android.m4b.maps.bl.C4818l;
import com.google.android.m4b.maps.bl.C4819p;

public final class aq extends SimpleOnGestureListener implements C4814a {
    /* renamed from: c */
    private static final float f24490c = (C4743b.f17390d ? 0.997f : 0.999f);
    /* renamed from: d */
    private static final float f24491d = (1.0f / f24490c);
    /* renamed from: e */
    private static final double f24492e = Math.log(2.0d);
    /* renamed from: a */
    private final float f24493a;
    /* renamed from: b */
    private final float f24494b;
    /* renamed from: f */
    private final C4997b f24495f;
    /* renamed from: g */
    private C4998c f24496g;
    /* renamed from: h */
    private MotionEvent f24497h;
    /* renamed from: i */
    private float f24498i;
    /* renamed from: j */
    private float f24499j;
    /* renamed from: k */
    private C4996a f24500k = C4996a.NONE;

    /* renamed from: com.google.android.m4b.maps.bx.aq$a */
    enum C4996a {
        NONE,
        IN_PROGRESS,
        ZOOM,
        ROTATE
    }

    /* renamed from: com.google.android.m4b.maps.bx.aq$b */
    public interface C4997b {
        /* renamed from: a */
        void mo5226a(float f, float f2);

        /* renamed from: a */
        boolean mo5227a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo5228b(float f, float f2);

        /* renamed from: c */
        void mo5229c(float f, float f2);

        /* renamed from: d */
        void mo5230d(float f, float f2);

        /* renamed from: e */
        void mo5231e(float f, float f2);

        /* renamed from: f */
        boolean mo5232f(float f, float f2);

        int getHeight();

        int getWidth();

        /* renamed from: u */
        ap mo5237u();

        /* renamed from: v */
        void mo5238v();
    }

    /* renamed from: com.google.android.m4b.maps.bx.aq$c */
    static class C4998c {
        /* renamed from: a */
        boolean f18451a = true;
        /* renamed from: b */
        boolean f18452b = true;
        /* renamed from: c */
        boolean f18453c = false;
        /* renamed from: d */
        boolean f18454d = true;
        /* renamed from: e */
        boolean f18455e = true;
        /* renamed from: f */
        boolean f18456f = true;
        /* renamed from: g */
        boolean f18457g = true;

        C4998c() {
        }
    }

    public aq(C4997b c4997b) {
        this.f24495f = c4997b;
        this.f24496g = new C4998c();
        this.f24494b = (float) C4725p.m21020a(20);
        this.f24493a = (float) C4725p.m21020a(20);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (this.f24500k == C4996a.NONE) {
            this.f24495f.mo5231e(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f24495f.mo5232f(motionEvent.getX(), motionEvent.getY());
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f24495f.mo5227a(motionEvent2) == null && this.f24496g.f18451a != null) {
            this.f24495f.mo5237u().m29055a(f, f2);
            this.f24495f.mo5226a(f, f2);
            this.f24495f.mo5238v();
        }
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f24496g.f18451a != null && onSingleTapUp(motionEvent2) == null) {
            this.f24495f.mo5237u().m29065b(f, f2);
            this.f24495f.mo5238v();
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f24496g.f18457g) {
            this.f24495f.mo5238v();
            this.f24495f.mo5229c(motionEvent.getX(), motionEvent.getY());
        }
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f24495f.mo5238v();
        if (this.f24495f.mo5228b(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        this.f24500k = C4996a.IN_PROGRESS;
        this.f24497h = motionEvent;
        this.f24498i = motionEvent.getX();
        this.f24499j = motionEvent.getY();
        return null;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        this.f24495f.mo5238v();
        if (this.f24497h != null && motionEvent.getAction() == 1) {
            if (this.f24496g.f18452b && this.f24500k == C4996a.IN_PROGRESS) {
                this.f24495f.mo5237u().m29050a(1.0f, motionEvent.getX(), motionEvent.getY(), 330);
                this.f24497h = null;
                this.f24500k = C4996a.NONE;
                return true;
            }
            this.f24497h = null;
            this.f24500k = C4996a.NONE;
        }
        if (this.f24497h == null || motionEvent.getAction() != 2) {
            return false;
        }
        float y = motionEvent.getY() - this.f24499j;
        float x = motionEvent.getX() - this.f24498i;
        if (this.f24500k == C4996a.IN_PROGRESS && Math.abs(y) < this.f24494b && Math.abs(x) < this.f24494b) {
            Math.round(Math.abs(this.f24497h.getX() - motionEvent.getX()));
            if (((float) Math.round(Math.abs(this.f24497h.getY() - motionEvent.getY()))) <= this.f24493a || !this.f24496g.f18452b) {
                return true;
            }
            this.f24500k = C4996a.ZOOM;
        }
        if (this.f24500k == C4996a.ZOOM && this.f24496g.f18452b) {
            this.f24495f.mo5237u().m29051a((y / ((float) this.f24495f.getHeight())) * 6.0f, 0);
            this.f24497h.getX();
            this.f24497h.getY();
        } else if (this.f24500k == C4996a.ROTATE && this.f24496g.f18455e) {
            y = ((float) this.f24495f.getWidth()) * 0.5f;
            x = ((float) this.f24495f.getHeight()) * 0.5f;
            float a = C4812h.m21335a(y, x, this.f24498i, this.f24499j);
            this.f24495f.mo5237u().m29063b(y, x, (float) (((double) ((C4812h.m21335a(y, x, motionEvent.getX(), motionEvent.getY()) - a) * 180.0f)) / 3.141592653589793d));
        }
        this.f24498i = motionEvent.getX();
        this.f24499j = motionEvent.getY();
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (this.f24497h == null && this.f24496g.f18456f) {
            this.f24495f.mo5230d(motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: a */
    public final boolean mo5220a(C4819p c4819p) {
        if (!this.f24496g.f18454d) {
            return false;
        }
        this.f24495f.mo5237u().m29066b(c4819p.mo5058a(), 0);
        return true;
    }

    /* renamed from: a */
    public final boolean mo5219a(C4818l c4818l) {
        if (this.f24496g.f18452b) {
            if (c4818l.m21382e()) {
                this.f24495f.mo5237u().m29051a(-1.0f, 330);
                this.f24495f.getWidth();
                this.f24495f.getHeight();
            } else {
                float log = (float) (Math.log((double) c4818l.mo5057c()) / f24492e);
                float a = c4818l.mo5055a();
                float b = c4818l.mo5056b();
                c4818l = (!c4818l.m21381d() || c4818l.mo5057c() <= f24490c || c4818l.mo5057c() >= f24491d) ? null : true;
                if (c4818l != null) {
                    log = 0.0f;
                }
                this.f24495f.mo5237u().m29049a(log, a, b);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5218a(C4817j c4817j) {
        if (!this.f24496g.f18455e) {
            return null;
        }
        c4817j.mo5052a((float) this.f24495f.getWidth(), (float) this.f24495f.getHeight());
        float c = c4817j.mo5054c() * 57.295776f;
        this.f24495f.mo5237u().m29063b(c4817j.mo5051a(), c4817j.mo5053b(), c);
        return true;
    }

    /* renamed from: a */
    public final void m29069a(boolean z) {
        this.f24496g.f18451a = z;
    }

    /* renamed from: a */
    public final boolean m29070a() {
        return this.f24496g.f18451a;
    }

    /* renamed from: b */
    public final void m29074b(boolean z) {
        this.f24496g.f18452b = z;
    }

    /* renamed from: b */
    public final boolean m29075b() {
        return this.f24496g.f18452b;
    }

    /* renamed from: c */
    public final void m29076c(boolean z) {
        this.f24496g.f18454d = z;
    }

    /* renamed from: c */
    public final boolean m29077c() {
        return this.f24496g.f18454d;
    }

    /* renamed from: d */
    public final void m29078d(boolean z) {
        this.f24496g.f18455e = z;
    }

    /* renamed from: d */
    public final boolean m29079d() {
        return this.f24496g.f18455e;
    }
}
