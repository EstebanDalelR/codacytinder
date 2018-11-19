package com.tinder.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

@Deprecated
/* renamed from: com.tinder.views.e */
public class C17262e extends ItemDecoration {
    /* renamed from: a */
    private Drawable f52907a;
    /* renamed from: b */
    private Context f52908b;
    /* renamed from: c */
    private int f52909c;
    /* renamed from: d */
    private int f52910d;
    /* renamed from: e */
    private boolean f52911e = false;

    public C17262e(Context context, Drawable drawable) {
        this.f52908b = context;
        this.f52907a = drawable;
    }

    /* renamed from: a */
    public boolean m63196a(View view, RecyclerView recyclerView) {
        boolean z = true;
        if (!this.f52911e) {
            return true;
        }
        if (recyclerView.getChildAdapterPosition(view) < 2) {
            z = false;
        }
        return z;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (!(this.f52907a == null || recyclerView.getChildAdapterPosition(view) < 1 || m63196a(view, recyclerView) == null)) {
            if (m63195a(recyclerView) == 1) {
                rect.top = this.f52907a.getIntrinsicHeight();
            } else {
                rect.left = this.f52907a.getIntrinsicWidth();
            }
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        if (this.f52907a == null) {
            super.onDrawOver(canvas, recyclerView, state);
            return;
        }
        int i = 1;
        int width;
        int childCount;
        View childAt;
        LayoutParams layoutParams;
        int top;
        if (m63195a(recyclerView) == 1) {
            state = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            childCount = recyclerView.getChildCount();
            while (i < childCount) {
                childAt = recyclerView.getChildAt(i);
                if (m63196a(childAt, recyclerView)) {
                    layoutParams = (LayoutParams) childAt.getLayoutParams();
                    top = childAt.getTop() - layoutParams.topMargin;
                    this.f52907a.setBounds(this.f52909c + state, top, width - this.f52910d, this.f52907a.getIntrinsicHeight() + top);
                    this.f52907a.draw(canvas);
                }
                i++;
            }
        } else {
            state = recyclerView.getPaddingTop();
            width = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            childCount = recyclerView.getChildCount();
            while (i < childCount) {
                childAt = recyclerView.getChildAt(i);
                if (m63196a(childAt, recyclerView)) {
                    layoutParams = (LayoutParams) childAt.getLayoutParams();
                    top = childAt.getLeft() - layoutParams.leftMargin;
                    this.f52907a.setBounds(top, state, this.f52907a.getIntrinsicWidth() + top, width);
                    this.f52907a.draw(canvas);
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private int m63195a(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
        }
        throw new IllegalStateException("DividerItemDecoration can only be used with a LinearLayoutManager.");
    }
}
