package com.facebook.ads.internal.view.hscroll;

import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.internal.view.hscroll.c */
public class C1609c {
    /* renamed from: a */
    public int[] m5485a(Recycler recycler, int i, int i2, int i3) {
        View viewForPosition = recycler.getViewForPosition(i);
        int[] a = m5486a(viewForPosition, i2, i3);
        recycler.recycleView(viewForPosition);
        return a;
    }

    /* renamed from: a */
    public int[] m5486a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), layoutParams.width), ViewGroup.getChildMeasureSpec(i2, view.getPaddingTop() + view.getPaddingBottom(), layoutParams.height));
        return new int[]{(view.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin, (view.getMeasuredHeight() + layoutParams.bottomMargin) + layoutParams.topMargin};
    }
}
