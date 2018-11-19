package android.support.design.widget;

import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.C0650n;
import android.support.v4.widget.C0650n.C0649a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {
    /* renamed from: a */
    private boolean f8732a;
    /* renamed from: b */
    C0650n f8733b;
    /* renamed from: c */
    OnDismissListener f8734c;
    /* renamed from: d */
    int f8735d = 2;
    /* renamed from: e */
    float f8736e = 0.5f;
    /* renamed from: f */
    float f8737f = 0.0f;
    /* renamed from: g */
    float f8738g = 0.5f;
    /* renamed from: h */
    private float f8739h = 0.0f;
    /* renamed from: i */
    private boolean f8740i;
    /* renamed from: j */
    private final C0649a f8741j = new C27691(this);

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    private class C0212a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ SwipeDismissBehavior f706a;
        /* renamed from: b */
        private final View f707b;
        /* renamed from: c */
        private final boolean f708c;

        C0212a(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
            this.f706a = swipeDismissBehavior;
            this.f707b = view;
            this.f708c = z;
        }

        public void run() {
            if (this.f706a.f8733b != null && this.f706a.f8733b.m2633a(true)) {
                ViewCompat.m2188a(this.f707b, (Runnable) this);
            } else if (this.f708c && this.f706a.f8734c != null) {
                this.f706a.f8734c.onDismiss(this.f707b);
            }
        }
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$1 */
    class C27691 extends C0649a {
        /* renamed from: a */
        final /* synthetic */ SwipeDismissBehavior f8729a;
        /* renamed from: b */
        private int f8730b;
        /* renamed from: c */
        private int f8731c = -1;

        C27691(SwipeDismissBehavior swipeDismissBehavior) {
            this.f8729a = swipeDismissBehavior;
        }

        /* renamed from: a */
        public boolean mo229a(View view, int i) {
            return (this.f8731c != -1 || this.f8729a.mo2981a(view) == null) ? null : true;
        }

        /* renamed from: b */
        public void mo256b(View view, int i) {
            this.f8731c = i;
            this.f8730b = view.getLeft();
            view = view.getParent();
            if (view != null) {
                view.requestDisallowInterceptTouchEvent(1);
            }
        }

        /* renamed from: a */
        public void mo226a(int i) {
            if (this.f8729a.f8734c != null) {
                this.f8729a.f8734c.onDragStateChanged(i);
            }
        }

        /* renamed from: a */
        public void mo227a(View view, float f, float f2) {
            int i;
            this.f8731c = -1;
            f2 = view.getWidth();
            if (m10763a(view, f) != null) {
                i = view.getLeft() < this.f8730b ? this.f8730b - f2 : this.f8730b + f2;
                f2 = Float.MIN_VALUE;
            } else {
                i = this.f8730b;
                f2 = 0.0f;
            }
            if (this.f8729a.f8733b.m2630a(i, view.getTop()) != null) {
                ViewCompat.m2188a(view, new C0212a(this.f8729a, view, f2));
            } else if (f2 != null && this.f8729a.f8734c != null) {
                this.f8729a.f8734c.onDismiss(view);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private boolean m10763a(android.view.View r6, float r7) {
            /*
            r5 = this;
            r0 = 0;
            r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            r2 = 0;
            r3 = 1;
            if (r1 == 0) goto L_0x0041;
        L_0x0007:
            r6 = android.support.v4.view.ViewCompat.m2208f(r6);
            if (r6 != r3) goto L_0x000f;
        L_0x000d:
            r6 = 1;
            goto L_0x0010;
        L_0x000f:
            r6 = 0;
        L_0x0010:
            r1 = r5.f8729a;
            r1 = r1.f8735d;
            r4 = 2;
            if (r1 != r4) goto L_0x0018;
        L_0x0017:
            return r3;
        L_0x0018:
            r1 = r5.f8729a;
            r1 = r1.f8735d;
            if (r1 != 0) goto L_0x002c;
        L_0x001e:
            if (r6 == 0) goto L_0x0026;
        L_0x0020:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 >= 0) goto L_0x002b;
        L_0x0024:
            r2 = 1;
            goto L_0x002b;
        L_0x0026:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 <= 0) goto L_0x002b;
        L_0x002a:
            goto L_0x0024;
        L_0x002b:
            return r2;
        L_0x002c:
            r1 = r5.f8729a;
            r1 = r1.f8735d;
            if (r1 != r3) goto L_0x0040;
        L_0x0032:
            if (r6 == 0) goto L_0x003a;
        L_0x0034:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 <= 0) goto L_0x003f;
        L_0x0038:
            r2 = 1;
            goto L_0x003f;
        L_0x003a:
            r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
            if (r6 >= 0) goto L_0x003f;
        L_0x003e:
            goto L_0x0038;
        L_0x003f:
            return r2;
        L_0x0040:
            return r2;
        L_0x0041:
            r7 = r6.getLeft();
            r0 = r5.f8730b;
            r7 = r7 - r0;
            r6 = r6.getWidth();
            r6 = (float) r6;
            r0 = r5.f8729a;
            r0 = r0.f8736e;
            r6 = r6 * r0;
            r6 = java.lang.Math.round(r6);
            r7 = java.lang.Math.abs(r7);
            if (r7 < r6) goto L_0x005e;
        L_0x005d:
            r2 = 1;
        L_0x005e:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.1.a(android.view.View, float):boolean");
        }

        /* renamed from: b */
        public int mo255b(View view) {
            return view.getWidth();
        }

        /* renamed from: b */
        public int mo230b(View view, int i, int i2) {
            int i3;
            i2 = ViewCompat.m2208f(view) == 1 ? 1 : 0;
            if (this.f8729a.f8735d == 0) {
                if (i2 != 0) {
                    i2 = this.f8730b - view.getWidth();
                    i3 = this.f8730b;
                } else {
                    i2 = this.f8730b;
                    i3 = view.getWidth() + this.f8730b;
                }
            } else if (this.f8729a.f8735d != 1) {
                i2 = this.f8730b - view.getWidth();
                i3 = view.getWidth() + this.f8730b;
            } else if (i2 != 0) {
                i2 = this.f8730b;
                i3 = view.getWidth() + this.f8730b;
            } else {
                i2 = this.f8730b - view.getWidth();
                i3 = this.f8730b;
            }
            return SwipeDismissBehavior.m10773a(i2, i, i3);
        }

        /* renamed from: a */
        public int mo225a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo228a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f8730b) + (((float) view.getWidth()) * this.f8729a.f8737f);
            float width2 = ((float) this.f8730b) + (((float) view.getWidth()) * this.f8729a.f8738g);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m10772a(0.0f, 1065353216 - SwipeDismissBehavior.m10775b(width, width2, f), 1.0f));
            }
        }
    }

    /* renamed from: b */
    static float m10775b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo2981a(@NonNull View view) {
        return true;
    }

    /* renamed from: a */
    public void m10778a(OnDismissListener onDismissListener) {
        this.f8734c = onDismissListener;
    }

    /* renamed from: a */
    public void m10777a(int i) {
        this.f8735d = i;
    }

    /* renamed from: a */
    public void m10776a(float f) {
        this.f8737f = m10772a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public void m10781b(float f) {
        this.f8738g = m10772a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public boolean mo234a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f8732a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f8732a = coordinatorLayout.m15645a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f8732a;
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        this.f8732a = false;
        if (!z) {
            return false;
        }
        m10774a((ViewGroup) coordinatorLayout);
        return this.f8733b.m2631a(motionEvent);
    }

    /* renamed from: b */
    public boolean mo238b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f8733b == null) {
            return null;
        }
        this.f8733b.m2635b(motionEvent);
        return true;
    }

    /* renamed from: a */
    private void m10774a(ViewGroup viewGroup) {
        if (this.f8733b == null) {
            if (this.f8740i) {
                viewGroup = C0650n.m2610a(viewGroup, this.f8739h, this.f8741j);
            } else {
                viewGroup = C0650n.m2611a(viewGroup, this.f8741j);
            }
            this.f8733b = viewGroup;
        }
    }

    /* renamed from: a */
    static float m10772a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m10773a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
