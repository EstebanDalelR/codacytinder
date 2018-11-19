package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    /* renamed from: a */
    private C0249p f8790a;
    /* renamed from: b */
    private int f8791b = 0;
    /* renamed from: c */
    private int f8792c = 0;

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo233a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo2988b(coordinatorLayout, v, i);
        if (this.f8790a == null) {
            this.f8790a = new C0249p(v);
        }
        this.f8790a.m919a();
        if (this.f8791b != null) {
            this.f8790a.m920a(this.f8791b);
            this.f8791b = 0;
        }
        if (this.f8792c != null) {
            this.f8790a.m922b(this.f8792c);
            this.f8792c = 0;
        }
        return true;
    }

    /* renamed from: b */
    protected void mo2988b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m15640a((View) v, i);
    }

    /* renamed from: a */
    public boolean mo3653a(int i) {
        if (this.f8790a != null) {
            return this.f8790a.m920a(i);
        }
        this.f8791b = i;
        return false;
    }

    /* renamed from: b */
    public int mo3655b() {
        return this.f8790a != null ? this.f8790a.m921b() : 0;
    }
}
