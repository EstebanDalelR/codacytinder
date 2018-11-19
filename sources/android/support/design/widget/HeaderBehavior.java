package android.support.design.widget;

import android.content.Context;
import android.support.v4.p010a.C0360a;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.facebook.ads.AdError;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    /* renamed from: a */
    OverScroller f12709a;
    /* renamed from: b */
    private Runnable f12710b;
    /* renamed from: c */
    private boolean f12711c;
    /* renamed from: d */
    private int f12712d = -1;
    /* renamed from: e */
    private int f12713e;
    /* renamed from: f */
    private int f12714f = -1;
    /* renamed from: g */
    private VelocityTracker f12715g;

    /* renamed from: android.support.design.widget.HeaderBehavior$a */
    private class C0209a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ HeaderBehavior f701a;
        /* renamed from: b */
        private final CoordinatorLayout f702b;
        /* renamed from: c */
        private final V f703c;

        C0209a(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, V v) {
            this.f701a = headerBehavior;
            this.f702b = coordinatorLayout;
            this.f703c = v;
        }

        public void run() {
            if (this.f703c != null && this.f701a.f12709a != null) {
                if (this.f701a.f12709a.computeScrollOffset()) {
                    this.f701a.a_(this.f702b, this.f703c, this.f701a.f12709a.getCurrY());
                    ViewCompat.m2188a(this.f703c, (Runnable) this);
                    return;
                }
                this.f701a.mo3649a(this.f702b, this.f703c);
            }
        }
    }

    /* renamed from: a */
    void mo3649a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: c */
    boolean mo3657c(V v) {
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo234a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f12714f < 0) {
            this.f12714f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f12711c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f12711c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo3657c(v) && coordinatorLayout.m15645a((View) v, x, y) != null) {
                    this.f12713e = y;
                    this.f12712d = motionEvent.getPointerId(0);
                    m15655d();
                    break;
                }
            case 1:
            case 3:
                this.f12711c = false;
                this.f12712d = -1;
                if (this.f12715g != null) {
                    this.f12715g.recycle();
                    this.f12715g = null;
                    break;
                }
                break;
            case 2:
                coordinatorLayout = this.f12712d;
                if (coordinatorLayout != -1) {
                    coordinatorLayout = motionEvent.findPointerIndex(coordinatorLayout);
                    if (coordinatorLayout != -1) {
                        coordinatorLayout = (int) motionEvent.getY(coordinatorLayout);
                        if (Math.abs(coordinatorLayout - this.f12713e) > this.f12714f) {
                            this.f12711c = true;
                            this.f12713e = coordinatorLayout;
                            break;
                        }
                    }
                    break;
                }
                break;
                break;
            default:
                break;
        }
        if (this.f12715g != null) {
            this.f12715g.addMovement(motionEvent);
        }
        return this.f12711c;
    }

    /* renamed from: b */
    public boolean mo238b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f12714f < 0) {
            this.f12714f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                y = (int) motionEvent.getY();
                if (coordinatorLayout.m15645a((View) v, (int) motionEvent.getX(), y) != null && mo3657c(v) != null) {
                    this.f12713e = y;
                    this.f12712d = motionEvent.getPointerId(0);
                    m15655d();
                    break;
                }
                return false;
            case 1:
                if (this.f12715g != null) {
                    this.f12715g.addMovement(motionEvent);
                    this.f12715g.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
                    m15660a(coordinatorLayout, (View) v, -mo3648a(v), 0, this.f12715g.getYVelocity(this.f12712d));
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f12712d);
                if (findPointerIndex != -1) {
                    findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                    y = this.f12713e - findPointerIndex;
                    if (!this.f12711c && Math.abs(y) > this.f12714f) {
                        this.f12711c = true;
                        y = y > 0 ? y - this.f12714f : y + this.f12714f;
                    }
                    int i = y;
                    if (this.f12711c) {
                        this.f12713e = findPointerIndex;
                        m15662b(coordinatorLayout, v, i, mo3656b(v), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
            default:
                break;
        }
        this.f12711c = false;
        this.f12712d = -1;
        if (this.f12715g != null) {
            this.f12715g.recycle();
            this.f12715g = null;
        }
        if (this.f12715g != null) {
            this.f12715g.addMovement(motionEvent);
        }
        return true;
    }

    int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo3647a(coordinatorLayout, (View) v, i, Integer.MIN_VALUE, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: a */
    int mo3647a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        V b = mo3655b();
        if (i2 != 0 && b >= i2 && b <= i3) {
            v = C0360a.m1309a(i, i2, i3);
            if (b != v) {
                mo3653a(v);
                return b - v;
            }
        }
        return null;
    }

    /* renamed from: a */
    int mo3646a() {
        return mo3655b();
    }

    /* renamed from: b */
    final int m15662b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo3647a(coordinatorLayout, (View) v, mo3646a() - i, i2, i3);
    }

    /* renamed from: a */
    final boolean m15660a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        View view = v;
        if (this.f12710b != null) {
            view.removeCallbacks(r0.f12710b);
            r0.f12710b = null;
        }
        if (r0.f12709a == null) {
            r0.f12709a = new OverScroller(view.getContext());
        }
        r0.f12709a.fling(0, mo3655b(), 0, Math.round(f), 0, 0, i, i2);
        if (r0.f12709a.computeScrollOffset()) {
            r0.f12710b = new C0209a(r0, coordinatorLayout, view);
            ViewCompat.m2188a(view, r0.f12710b);
            return true;
        }
        mo3649a(coordinatorLayout, view);
        return false;
    }

    /* renamed from: b */
    int mo3656b(V v) {
        return -v.getHeight();
    }

    /* renamed from: a */
    int mo3648a(V v) {
        return v.getHeight();
    }

    /* renamed from: d */
    private void m15655d() {
        if (this.f12715g == null) {
            this.f12715g = VelocityTracker.obtain();
        }
    }
}
