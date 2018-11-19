package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;

public class HScrollLinearLayoutManager extends LinearLayoutManager {
    /* renamed from: a */
    private final C1609c f13379a;
    /* renamed from: b */
    private final C1607a f13380b;
    /* renamed from: c */
    private final Context f13381c;
    /* renamed from: d */
    private int[] f13382d;
    /* renamed from: e */
    private int f13383e = 0;
    /* renamed from: f */
    private float f13384f = 50.0f;
    /* renamed from: g */
    private C4190a f13385g;
    /* renamed from: h */
    private int f13386h;

    /* renamed from: com.facebook.ads.internal.view.hscroll.HScrollLinearLayoutManager$a */
    private class C4190a extends LinearSmoothScroller {
        /* renamed from: a */
        final /* synthetic */ HScrollLinearLayoutManager f13378a;

        public C4190a(HScrollLinearLayoutManager hScrollLinearLayoutManager, Context context) {
            this.f13378a = hScrollLinearLayoutManager;
            super(context);
        }

        public int calculateDxToMakeVisible(View view, int i) {
            LayoutManager layoutManager = getLayoutManager();
            if (!layoutManager.canScrollHorizontally()) {
                return 0;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return calculateDtToFit(layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin, layoutManager.getDecoratedRight(view) + layoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i) + this.f13378a.f13383e;
        }

        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return this.f13378a.f13384f / ((float) displayMetrics.densityDpi);
        }

        public PointF computeScrollVectorForPosition(int i) {
            return this.f13378a.computeScrollVectorForPosition(i);
        }

        protected int getHorizontalSnapPreference() {
            return -1;
        }
    }

    public HScrollLinearLayoutManager(Context context, C1609c c1609c, C1607a c1607a) {
        super(context);
        this.f13381c = context;
        this.f13379a = c1609c;
        this.f13380b = c1607a;
        this.f13386h = -1;
        this.f13385g = new C4190a(this, this.f13381c);
    }

    /* renamed from: a */
    public void m16597a(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.f13384f = (float) (50.0d / d);
        this.f13385g = new C4190a(this, this.f13381c);
    }

    /* renamed from: a */
    void m16598a(int i) {
        this.f13386h = i;
    }

    /* renamed from: b */
    public void m16599b(int i) {
        this.f13383e = i;
    }

    public void onMeasure(Recycler recycler, State state, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if ((mode == 1073741824 && getOrientation() == 1) || (mode2 == 1073741824 && getOrientation() == 0)) {
            super.onMeasure(recycler, state, i, i2);
            return;
        }
        int[] a;
        i = MeasureSpec.getSize(i);
        i2 = MeasureSpec.getSize(i2);
        if (this.f13380b.m5483b(this.f13386h)) {
            a = this.f13380b.m5482a(this.f13386h);
        } else {
            int[] iArr = new int[]{0, 0};
            if (state.getItemCount() >= 1) {
                for (int i3 = 0; i3 < 1; i3++) {
                    this.f13382d = this.f13379a.m5485a(recycler, i3, MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                    if (getOrientation() == 0) {
                        iArr[0] = iArr[0] + this.f13382d[0];
                        if (i3 == 0) {
                            iArr[1] = (this.f13382d[1] + getPaddingTop()) + getPaddingBottom();
                        }
                    } else {
                        iArr[1] = iArr[1] + this.f13382d[1];
                        if (i3 == 0) {
                            iArr[0] = (this.f13382d[0] + getPaddingLeft()) + getPaddingRight();
                        }
                    }
                }
                if (this.f13386h != -1) {
                    this.f13380b.m5481a(this.f13386h, iArr);
                }
            }
            a = iArr;
        }
        if (mode == 1073741824) {
            a[0] = i;
        }
        if (mode2 == 1073741824) {
            a[1] = i2;
        }
        setMeasuredDimension(a[0], a[1]);
    }

    public void scrollToPosition(int i) {
        super.scrollToPositionWithOffset(i, this.f13383e);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        this.f13385g.setTargetPosition(i);
        startSmoothScroll(this.f13385g);
    }
}
