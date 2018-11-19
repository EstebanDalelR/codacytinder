package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.view.MotionEvent;

public final class aa {
    /* renamed from: a */
    private final Context f18068a;
    /* renamed from: b */
    private final C4913a f18069b;
    /* renamed from: c */
    private float f18070c;
    /* renamed from: d */
    private float f18071d;
    /* renamed from: e */
    private float f18072e;
    /* renamed from: f */
    private float f18073f;
    /* renamed from: g */
    private float f18074g;
    /* renamed from: h */
    private float f18075h;
    /* renamed from: i */
    private float f18076i;
    /* renamed from: j */
    private float f18077j;
    /* renamed from: k */
    private float f18078k;
    /* renamed from: l */
    private boolean f18079l;
    /* renamed from: m */
    private final int f18080m = -1;

    /* renamed from: com.google.android.m4b.maps.bv.aa$a */
    public interface C4913a {
        /* renamed from: a */
        boolean mo5166a(aa aaVar);

        /* renamed from: b */
        boolean mo5167b(aa aaVar);

        /* renamed from: c */
        void mo5168c(aa aaVar);
    }

    public aa(Context context, C4913a c4913a) {
        this.f18068a = context;
        this.f18069b = c4913a;
    }

    /* renamed from: a */
    public final boolean m22032a(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        int actionIndex;
        int pointerCount;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 3) {
                obj = null;
                if (actionMasked == 0 || obj != null) {
                    if (this.f18079l) {
                        this.f18069b.mo5168c(this);
                        this.f18079l = false;
                        this.f18074g = 0.0f;
                    }
                    if (obj != null) {
                        return true;
                    }
                }
                if (actionMasked != 6) {
                    if (actionMasked == 5) {
                        obj2 = null;
                        obj = actionMasked != 6 ? 1 : null;
                        actionIndex = obj == null ? motionEvent.getActionIndex() : -1;
                        pointerCount = motionEvent.getPointerCount();
                        f = 0.0f;
                        f2 = 0.0f;
                        for (i = 0; i < pointerCount; i++) {
                            if (actionIndex == i) {
                                f += motionEvent.getX(i);
                                f2 += motionEvent.getY(i);
                            }
                        }
                        f3 = (float) (obj == null ? pointerCount - 1 : pointerCount);
                        f /= f3;
                        f2 /= f3;
                        f4 = 0.0f;
                        f5 = 0.0f;
                        for (i = 0; i < pointerCount; i++) {
                            if (actionIndex == i) {
                                f4 += Math.abs(motionEvent.getX(i) - f);
                                f5 += Math.abs(motionEvent.getY(i) - f2);
                            }
                        }
                        f4 = (f4 / f3) * 2.0f;
                        f5 = (f5 / f3) * 2.0f;
                        motionEvent = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
                        z = this.f18079l;
                        this.f18070c = f;
                        this.f18071d = f2;
                        if (this.f18079l && (motionEvent == null || obj2 != null)) {
                            this.f18069b.mo5168c(this);
                            this.f18079l = false;
                            this.f18074g = motionEvent;
                        }
                        if (obj2 != null) {
                            this.f18075h = f4;
                            this.f18077j = f4;
                            this.f18076i = f5;
                            this.f18078k = f5;
                            this.f18072e = motionEvent;
                            this.f18073f = motionEvent;
                            this.f18074g = motionEvent;
                        }
                        if (!(this.f18079l || motionEvent == null || (!z && Math.abs(motionEvent - this.f18074g) <= -1.0f))) {
                            this.f18075h = f4;
                            this.f18077j = f4;
                            this.f18076i = f5;
                            this.f18078k = f5;
                            this.f18072e = motionEvent;
                            this.f18073f = motionEvent;
                            this.f18079l = this.f18069b.mo5167b(this);
                        }
                        if (actionMasked == 2) {
                            this.f18075h = f4;
                            this.f18076i = f5;
                            this.f18072e = motionEvent;
                            if ((this.f18079l == null ? this.f18069b.mo5166a(this) : true) != null) {
                                this.f18077j = this.f18075h;
                                this.f18078k = this.f18076i;
                                this.f18073f = this.f18072e;
                            }
                        }
                        return true;
                    }
                }
                obj2 = 1;
                if (actionMasked != 6) {
                }
                if (obj == null) {
                }
                pointerCount = motionEvent.getPointerCount();
                f = 0.0f;
                f2 = 0.0f;
                for (i = 0; i < pointerCount; i++) {
                    if (actionIndex == i) {
                        f += motionEvent.getX(i);
                        f2 += motionEvent.getY(i);
                    }
                }
                if (obj == null) {
                }
                f3 = (float) (obj == null ? pointerCount - 1 : pointerCount);
                f /= f3;
                f2 /= f3;
                f4 = 0.0f;
                f5 = 0.0f;
                for (i = 0; i < pointerCount; i++) {
                    if (actionIndex == i) {
                        f4 += Math.abs(motionEvent.getX(i) - f);
                        f5 += Math.abs(motionEvent.getY(i) - f2);
                    }
                }
                f4 = (f4 / f3) * 2.0f;
                f5 = (f5 / f3) * 2.0f;
                motionEvent = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
                z = this.f18079l;
                this.f18070c = f;
                this.f18071d = f2;
                this.f18069b.mo5168c(this);
                this.f18079l = false;
                this.f18074g = motionEvent;
                if (obj2 != null) {
                    this.f18075h = f4;
                    this.f18077j = f4;
                    this.f18076i = f5;
                    this.f18078k = f5;
                    this.f18072e = motionEvent;
                    this.f18073f = motionEvent;
                    this.f18074g = motionEvent;
                }
                this.f18075h = f4;
                this.f18077j = f4;
                this.f18076i = f5;
                this.f18078k = f5;
                this.f18072e = motionEvent;
                this.f18073f = motionEvent;
                this.f18079l = this.f18069b.mo5167b(this);
                if (actionMasked == 2) {
                    this.f18075h = f4;
                    this.f18076i = f5;
                    this.f18072e = motionEvent;
                    if (this.f18079l == null) {
                    }
                    if ((this.f18079l == null ? this.f18069b.mo5166a(this) : true) != null) {
                        this.f18077j = this.f18075h;
                        this.f18078k = this.f18076i;
                        this.f18073f = this.f18072e;
                    }
                }
                return true;
            }
        }
        obj = 1;
        if (this.f18079l) {
            this.f18069b.mo5168c(this);
            this.f18079l = false;
            this.f18074g = 0.0f;
        }
        if (obj != null) {
            return true;
        }
        if (actionMasked != 6) {
            if (actionMasked == 5) {
                obj2 = null;
                if (actionMasked != 6) {
                }
                if (obj == null) {
                }
                pointerCount = motionEvent.getPointerCount();
                f = 0.0f;
                f2 = 0.0f;
                for (i = 0; i < pointerCount; i++) {
                    if (actionIndex == i) {
                        f += motionEvent.getX(i);
                        f2 += motionEvent.getY(i);
                    }
                }
                if (obj == null) {
                }
                f3 = (float) (obj == null ? pointerCount - 1 : pointerCount);
                f /= f3;
                f2 /= f3;
                f4 = 0.0f;
                f5 = 0.0f;
                for (i = 0; i < pointerCount; i++) {
                    if (actionIndex == i) {
                        f4 += Math.abs(motionEvent.getX(i) - f);
                        f5 += Math.abs(motionEvent.getY(i) - f2);
                    }
                }
                f4 = (f4 / f3) * 2.0f;
                f5 = (f5 / f3) * 2.0f;
                motionEvent = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
                z = this.f18079l;
                this.f18070c = f;
                this.f18071d = f2;
                this.f18069b.mo5168c(this);
                this.f18079l = false;
                this.f18074g = motionEvent;
                if (obj2 != null) {
                    this.f18075h = f4;
                    this.f18077j = f4;
                    this.f18076i = f5;
                    this.f18078k = f5;
                    this.f18072e = motionEvent;
                    this.f18073f = motionEvent;
                    this.f18074g = motionEvent;
                }
                this.f18075h = f4;
                this.f18077j = f4;
                this.f18076i = f5;
                this.f18078k = f5;
                this.f18072e = motionEvent;
                this.f18073f = motionEvent;
                this.f18079l = this.f18069b.mo5167b(this);
                if (actionMasked == 2) {
                    this.f18075h = f4;
                    this.f18076i = f5;
                    this.f18072e = motionEvent;
                    if (this.f18079l == null) {
                    }
                    if ((this.f18079l == null ? this.f18069b.mo5166a(this) : true) != null) {
                        this.f18077j = this.f18075h;
                        this.f18078k = this.f18076i;
                        this.f18073f = this.f18072e;
                    }
                }
                return true;
            }
        }
        obj2 = 1;
        if (actionMasked != 6) {
        }
        if (obj == null) {
        }
        pointerCount = motionEvent.getPointerCount();
        f = 0.0f;
        f2 = 0.0f;
        for (i = 0; i < pointerCount; i++) {
            if (actionIndex == i) {
                f += motionEvent.getX(i);
                f2 += motionEvent.getY(i);
            }
        }
        if (obj == null) {
        }
        f3 = (float) (obj == null ? pointerCount - 1 : pointerCount);
        f /= f3;
        f2 /= f3;
        f4 = 0.0f;
        f5 = 0.0f;
        for (i = 0; i < pointerCount; i++) {
            if (actionIndex == i) {
                f4 += Math.abs(motionEvent.getX(i) - f);
                f5 += Math.abs(motionEvent.getY(i) - f2);
            }
        }
        f4 = (f4 / f3) * 2.0f;
        f5 = (f5 / f3) * 2.0f;
        motionEvent = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
        z = this.f18079l;
        this.f18070c = f;
        this.f18071d = f2;
        this.f18069b.mo5168c(this);
        this.f18079l = false;
        this.f18074g = motionEvent;
        if (obj2 != null) {
            this.f18075h = f4;
            this.f18077j = f4;
            this.f18076i = f5;
            this.f18078k = f5;
            this.f18072e = motionEvent;
            this.f18073f = motionEvent;
            this.f18074g = motionEvent;
        }
        this.f18075h = f4;
        this.f18077j = f4;
        this.f18076i = f5;
        this.f18078k = f5;
        this.f18072e = motionEvent;
        this.f18073f = motionEvent;
        this.f18079l = this.f18069b.mo5167b(this);
        if (actionMasked == 2) {
            this.f18075h = f4;
            this.f18076i = f5;
            this.f18072e = motionEvent;
            if (this.f18079l == null) {
            }
            if ((this.f18079l == null ? this.f18069b.mo5166a(this) : true) != null) {
                this.f18077j = this.f18075h;
                this.f18078k = this.f18076i;
                this.f18073f = this.f18072e;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final float m22031a() {
        return this.f18070c;
    }

    /* renamed from: b */
    public final float m22033b() {
        return this.f18071d;
    }

    /* renamed from: c */
    public final float m22034c() {
        return this.f18072e;
    }

    /* renamed from: d */
    public final float m22035d() {
        return this.f18073f;
    }
}
