package com.tinder.reactions.navigation.view.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller.Action;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

public class GalleryLayoutManager extends LayoutManager implements ScrollVectorProvider {
    /* renamed from: a */
    private int f50942a = 0;
    /* renamed from: b */
    private int f50943b = 0;
    /* renamed from: c */
    private int f50944c = 0;
    /* renamed from: d */
    private int f50945d = -1;
    /* renamed from: e */
    private View f50946e;
    /* renamed from: f */
    private C14691e f50947f;
    /* renamed from: g */
    private LinearSnapHelper f50948g = new C187581(this);
    /* renamed from: h */
    private C16387b f50949h = new C16387b();
    /* renamed from: i */
    private boolean f50950i = false;
    /* renamed from: j */
    private int f50951j = 0;
    /* renamed from: k */
    private OrientationHelper f50952k;
    /* renamed from: l */
    private OrientationHelper f50953l;
    /* renamed from: m */
    private ItemTransformer f50954m;
    /* renamed from: n */
    private C14690d f50955n;
    /* renamed from: o */
    private RecyclerView f50956o;

    public interface ItemTransformer {
        void transformItem(GalleryLayoutManager galleryLayoutManager, View view, float f);
    }

    /* renamed from: com.tinder.reactions.navigation.view.widget.GalleryLayoutManager$d */
    private interface C14690d {
        /* renamed from: a */
        void m55964a(RecyclerView recyclerView, View view, int i);
    }

    /* renamed from: com.tinder.reactions.navigation.view.widget.GalleryLayoutManager$e */
    class C14691e {
        /* renamed from: a */
        SparseArray<Rect> f46289a = new SparseArray();
        /* renamed from: b */
        int f46290b = null;
        /* renamed from: c */
        final /* synthetic */ GalleryLayoutManager f46291c;

        C14691e(GalleryLayoutManager galleryLayoutManager) {
            this.f46291c = galleryLayoutManager;
        }
    }

    /* renamed from: com.tinder.reactions.navigation.view.widget.GalleryLayoutManager$b */
    private class C16387b extends OnScrollListener {
        /* renamed from: a */
        int f50939a;
        /* renamed from: b */
        boolean f50940b;
        /* renamed from: c */
        final /* synthetic */ GalleryLayoutManager f50941c;

        private C16387b(GalleryLayoutManager galleryLayoutManager) {
            this.f50941c = galleryLayoutManager;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View findSnapView = this.f50941c.f50948g.findSnapView(recyclerView.getLayoutManager());
            if (findSnapView != 0) {
                i2 = recyclerView.getLayoutManager().getPosition(findSnapView);
                if (i2 != this.f50941c.f50945d) {
                    if (this.f50941c.f50946e != null) {
                        this.f50941c.f50946e.setSelected(false);
                    }
                    this.f50941c.f50946e = findSnapView;
                    this.f50941c.f50946e.setSelected(true);
                    this.f50941c.f50945d = i2;
                    if (this.f50941c.f50950i == 0 && this.f50939a != 0) {
                        this.f50940b = true;
                    } else if (this.f50941c.f50955n != 0) {
                        this.f50941c.f50955n.m55964a(recyclerView, findSnapView, this.f50941c.f50945d);
                    }
                }
            }
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            this.f50939a = i;
            if (this.f50939a == 0) {
                View findSnapView = this.f50941c.f50948g.findSnapView(recyclerView.getLayoutManager());
                if (findSnapView != 0) {
                    int position = recyclerView.getLayoutManager().getPosition(findSnapView);
                    if (position != this.f50941c.f50945d) {
                        if (this.f50941c.f50946e != null) {
                            this.f50941c.f50946e.setSelected(false);
                        }
                        this.f50941c.f50946e = findSnapView;
                        this.f50941c.f50946e.setSelected(true);
                        this.f50941c.f50945d = position;
                        if (this.f50941c.f50955n != null) {
                            this.f50941c.f50955n.m55964a(recyclerView, findSnapView, this.f50941c.f50945d);
                            return;
                        }
                        return;
                    } else if (!this.f50941c.f50950i && this.f50941c.f50955n != null && this.f50940b) {
                        this.f50940b = false;
                        this.f50941c.f50955n.m55964a(recyclerView, findSnapView, this.f50941c.f50945d);
                        return;
                    } else {
                        return;
                    }
                }
                Log.e("GalleryLayoutManager", "onScrollStateChanged: snap null");
            }
        }
    }

    /* renamed from: com.tinder.reactions.navigation.view.widget.GalleryLayoutManager$c */
    private static class C16388c extends LayoutParams {
        private C16388c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private C16388c(int i, int i2) {
            super(i, i2);
        }

        private C16388c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        private C16388c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.tinder.reactions.navigation.view.widget.GalleryLayoutManager$a */
    private class C17999a extends LinearSmoothScroller {
        /* renamed from: a */
        final /* synthetic */ GalleryLayoutManager f55936a;

        private C17999a(GalleryLayoutManager galleryLayoutManager, Context context) {
            this.f55936a = galleryLayoutManager;
            super(context);
        }

        /* renamed from: a */
        private int m65369a(View view) {
            LayoutManager layoutManager = getLayoutManager();
            if (layoutManager != null) {
                if (layoutManager.canScrollHorizontally()) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int decoratedLeft = layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin;
                    view = layoutManager.getDecoratedRight(view) + layoutParams.rightMargin;
                    return ((int) (((float) ((layoutManager.getWidth() - layoutManager.getPaddingRight()) - layoutManager.getPaddingLeft())) / 1073741824)) - (decoratedLeft + ((int) (((float) (view - decoratedLeft)) / 1073741824)));
                }
            }
            return null;
        }

        /* renamed from: b */
        private int m65370b(View view) {
            LayoutManager layoutManager = getLayoutManager();
            if (layoutManager != null) {
                if (layoutManager.canScrollVertically()) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int decoratedTop = layoutManager.getDecoratedTop(view) - layoutParams.topMargin;
                    view = layoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin;
                    return ((int) (((float) ((layoutManager.getHeight() - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop())) / 1073741824)) - (decoratedTop + ((int) (((float) (view - decoratedTop)) / 1073741824)));
                }
            }
            return null;
        }

        protected void onTargetFound(View view, State state, Action action) {
            state = m65369a(view);
            view = m65370b(view);
            int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((double) ((state * state) + (view * view))));
            if (calculateTimeForDeceleration > 0) {
                action.update(-state, -view, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }

        public PointF computeScrollVectorForPosition(int i) {
            return this.f55936a.computeScrollVectorForPosition(i);
        }

        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 75.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: com.tinder.reactions.navigation.view.widget.GalleryLayoutManager$1 */
    class C187581 extends LinearSnapHelper {
        /* renamed from: a */
        final /* synthetic */ GalleryLayoutManager f58260a;

        C187581(GalleryLayoutManager galleryLayoutManager) {
            this.f58260a = galleryLayoutManager;
        }

        @Nullable
        protected LinearSmoothScroller createSnapScroller(LayoutManager layoutManager) {
            if ((layoutManager instanceof ScrollVectorProvider) == null) {
                return null;
            }
            return new LinearSmoothScroller(this, this.f58260a.f50956o.getContext()) {
                /* renamed from: a */
                final /* synthetic */ C187581 f55935a;

                protected void onTargetFound(View view, State state, Action action) {
                    view = this.f55935a.calculateDistanceToFinalSnap(this.f55935a.f58260a.f50956o.getLayoutManager(), view);
                    state = view[null];
                    view = view[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(state), Math.abs(view)));
                    if (calculateTimeForDeceleration > 0) {
                        action.update(state, view, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    } else if (calculateTimeForDeceleration == 0) {
                        action.update(state, view, 1, this.mDecelerateInterpolator);
                    }
                }

                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / ((float) displayMetrics.densityDpi);
                }
            };
        }
    }

    public GalleryLayoutManager(int i) {
        this.f50951j = i;
    }

    /* renamed from: a */
    public int m61791a() {
        return this.f50945d;
    }

    public LayoutParams generateDefaultLayoutParams() {
        if (this.f50951j == 1) {
            return new C16388c(-1, -2);
        }
        return new C16388c(-2, -1);
    }

    public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C16388c(context, attributeSet);
    }

    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C16388c((MarginLayoutParams) layoutParams);
        }
        return new C16388c(layoutParams);
    }

    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C16388c;
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        if (getItemCount() == 0) {
            m61780c();
            detachAndScrapAttachedViews(recycler);
        } else if (!state.isPreLayout()) {
            if (state.getItemCount() == 0 || state.didStructureChange()) {
                if (getChildCount() == 0 || state.didStructureChange()) {
                    m61780c();
                }
                this.f50944c = Math.min(Math.max(0, this.f50944c), getItemCount() - 1);
                detachAndScrapAttachedViews(recycler);
                m61773a(recycler, state, 0);
            }
        }
    }

    /* renamed from: c */
    private void m61780c() {
        if (this.f50947f != null) {
            this.f50947f.f46289a.clear();
        }
        if (this.f50945d != -1) {
            this.f50944c = this.f50945d;
        }
        this.f50944c = Math.min(Math.max(0, this.f50944c), getItemCount() - 1);
        this.f50942a = this.f50944c;
        this.f50943b = this.f50944c;
        this.f50945d = -1;
        if (this.f50946e != null) {
            this.f50946e.setSelected(false);
            this.f50946e = null;
        }
    }

    /* renamed from: a */
    private void m61773a(Recycler recycler, State state, int i) {
        if (this.f50951j == 0) {
            m61772a(recycler, state);
        } else {
            m61777b(recycler, state);
        }
        if (this.f50954m != null) {
            for (recycler = null; recycler < getChildCount(); recycler++) {
                View childAt = getChildAt(recycler);
                this.f50954m.transformItem(this, childAt, m61766a(childAt, (float) i));
            }
        }
        this.f50949h.onScrolled(this.f50956o, 0, 0);
    }

    /* renamed from: a */
    private void m61772a(Recycler recycler, State state) {
        detachAndScrapAttachedViews(recycler);
        state = m61789f().getStartAfterPadding();
        int endAfterPadding = m61789f().getEndAfterPadding();
        int i = this.f50944c;
        Rect rect = new Rect();
        int e = m61787e();
        View viewForPosition = recycler.getViewForPosition(this.f50944c);
        addView(viewForPosition, 0);
        measureChildWithMargins(viewForPosition, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
        e = (int) (((float) getPaddingTop()) + (((float) (e - decoratedMeasuredHeight)) / 2.0f));
        int paddingLeft = (int) (((float) getPaddingLeft()) + (((float) (m61783d() - decoratedMeasuredWidth)) / 2.0f));
        rect.set(paddingLeft, e, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + e);
        layoutDecorated(viewForPosition, rect.left, rect.top, rect.right, rect.bottom);
        if (m61794b().f46289a.get(i) == null) {
            m61794b().f46289a.put(i, rect);
        } else {
            ((Rect) m61794b().f46289a.get(i)).set(rect);
        }
        this.f50943b = i;
        this.f50942a = i;
        i = getDecoratedLeft(viewForPosition);
        int decoratedRight = getDecoratedRight(viewForPosition);
        m61771a(recycler, this.f50944c - 1, i, state);
        m61776b(recycler, this.f50944c + 1, decoratedRight, endAfterPadding);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    /* renamed from: b */
    private void m61777b(Recycler recycler, State state) {
        detachAndScrapAttachedViews(recycler);
        state = m61789f().getStartAfterPadding();
        int endAfterPadding = m61789f().getEndAfterPadding();
        int i = this.f50944c;
        Rect rect = new Rect();
        int d = m61783d();
        View viewForPosition = recycler.getViewForPosition(this.f50944c);
        addView(viewForPosition, 0);
        measureChildWithMargins(viewForPosition, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
        d = (int) (((float) getPaddingLeft()) + (((float) (d - decoratedMeasuredWidth)) / 2.0f));
        int paddingTop = (int) (((float) getPaddingTop()) + (((float) (m61787e() - decoratedMeasuredHeight)) / 2.0f));
        rect.set(d, paddingTop, decoratedMeasuredWidth + d, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewForPosition, rect.left, rect.top, rect.right, rect.bottom);
        if (m61794b().f46289a.get(i) == null) {
            m61794b().f46289a.put(i, rect);
        } else {
            ((Rect) m61794b().f46289a.get(i)).set(rect);
        }
        this.f50943b = i;
        this.f50942a = i;
        i = getDecoratedTop(viewForPosition);
        int decoratedBottom = getDecoratedBottom(viewForPosition);
        m61781c(recycler, this.f50944c - 1, i, state);
        m61785d(recycler, this.f50944c + 1, decoratedBottom, endAfterPadding);
    }

    /* renamed from: a */
    private void m61771a(Recycler recycler, int i, int i2, int i3) {
        Rect rect = new Rect();
        int e = m61787e();
        while (i >= 0 && i2 > i3) {
            View viewForPosition = recycler.getViewForPosition(i);
            addView(viewForPosition, 0);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            int paddingTop = (int) (((float) getPaddingTop()) + (((float) (e - decoratedMeasuredHeight)) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            layoutDecorated(viewForPosition, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            this.f50942a = i;
            if (m61794b().f46289a.get(i) == null) {
                m61794b().f46289a.put(i, rect);
            } else {
                ((Rect) m61794b().f46289a.get(i)).set(rect);
            }
            i--;
        }
    }

    /* renamed from: b */
    private void m61776b(Recycler recycler, int i, int i2, int i3) {
        Rect rect = new Rect();
        int e = m61787e();
        while (i < getItemCount() && i2 < i3) {
            View viewForPosition = recycler.getViewForPosition(i);
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            int paddingTop = (int) (((float) getPaddingTop()) + (((float) (e - decoratedMeasuredHeight)) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            layoutDecorated(viewForPosition, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            this.f50943b = i;
            if (m61794b().f46289a.get(i) == null) {
                m61794b().f46289a.put(i, rect);
            } else {
                ((Rect) m61794b().f46289a.get(i)).set(rect);
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m61781c(Recycler recycler, int i, int i2, int i3) {
        Rect rect = new Rect();
        int d = m61783d();
        while (i >= 0 && i2 > i3) {
            View viewForPosition = recycler.getViewForPosition(i);
            addView(viewForPosition, 0);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int paddingLeft = (int) (((float) getPaddingLeft()) + (((float) (d - decoratedMeasuredWidth)) / 2.0f));
            rect.set(paddingLeft, i2 - getDecoratedMeasuredHeight(viewForPosition), decoratedMeasuredWidth + paddingLeft, i2);
            layoutDecorated(viewForPosition, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            this.f50942a = i;
            if (m61794b().f46289a.get(i) == null) {
                m61794b().f46289a.put(i, rect);
            } else {
                ((Rect) m61794b().f46289a.get(i)).set(rect);
            }
            i--;
        }
    }

    /* renamed from: d */
    private void m61785d(Recycler recycler, int i, int i2, int i3) {
        Rect rect = new Rect();
        int d = m61783d();
        while (i < getItemCount() && i2 < i3) {
            View viewForPosition = recycler.getViewForPosition(i);
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int paddingLeft = (int) (((float) getPaddingLeft()) + (((float) (d - decoratedMeasuredWidth)) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, getDecoratedMeasuredHeight(viewForPosition) + i2);
            layoutDecorated(viewForPosition, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            this.f50943b = i;
            if (m61794b().f46289a.get(i) == null) {
                m61794b().f46289a.put(i, rect);
            } else {
                ((Rect) m61794b().f46289a.get(i)).set(rect);
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m61778b(Recycler recycler, State state, int i) {
        if (getItemCount() != 0) {
            if (this.f50951j == 0) {
                m61786d(recycler, state, i);
            } else {
                m61782c(recycler, state, i);
            }
            if (this.f50954m != null) {
                for (recycler = null; recycler < getChildCount(); recycler++) {
                    View childAt = getChildAt(recycler);
                    this.f50954m.transformItem(this, childAt, m61766a(childAt, (float) i));
                }
            }
        }
    }

    /* renamed from: a */
    private float m61766a(View view, float f) {
        return Math.max(-1.0f, Math.min(1.0f, (((float) m61774b(view, f)) * 1.0f) / ((float) (this.f50951j == 0 ? view.getWidth() : view.getHeight()))));
    }

    /* renamed from: b */
    private int m61774b(View view, float f) {
        OrientationHelper f2 = m61789f();
        int endAfterPadding = ((f2.getEndAfterPadding() - f2.getStartAfterPadding()) / 2) + f2.getStartAfterPadding();
        if (this.f50951j == 0) {
            return (int) (((((float) (view.getWidth() / 2)) - f) + ((float) view.getLeft())) - ((float) endAfterPadding));
        }
        return (int) (((((float) (view.getHeight() / 2)) - f) + ((float) view.getTop())) - ((float) endAfterPadding));
    }

    /* renamed from: c */
    private void m61782c(Recycler recycler, State state, int i) {
        int childCount;
        View childAt;
        int i2;
        View childAt2;
        GalleryLayoutManager galleryLayoutManager = this;
        Recycler recycler2 = recycler;
        int startAfterPadding = m61789f().getStartAfterPadding();
        int endAfterPadding = m61789f().getEndAfterPadding();
        int i3 = 0;
        if (getChildCount() > 0) {
            if (i < 0) {
                for (childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= endAfterPadding) {
                        break;
                    }
                    removeAndRecycleView(childAt, recycler2);
                    galleryLayoutManager.f50943b--;
                }
            } else {
                i2 = 0;
                for (childCount = 0; childCount < getChildCount(); childCount++) {
                    childAt2 = getChildAt(childCount + i2);
                    if (getDecoratedBottom(childAt2) - i >= startAfterPadding) {
                        break;
                    }
                    removeAndRecycleView(childAt2, recycler2);
                    galleryLayoutManager.f50942a++;
                    i2--;
                }
            }
        }
        childCount = galleryLayoutManager.f50942a;
        int d = m61783d();
        int i4 = -1;
        int decoratedMeasuredHeight;
        if (i >= 0) {
            if (getChildCount() != 0) {
                View childAt3 = getChildAt(getChildCount() - 1);
                i2 = getPosition(childAt3) + 1;
                childCount = getDecoratedBottom(childAt3);
                startAfterPadding = i2;
            } else {
                startAfterPadding = childCount;
                childCount = -1;
            }
            int i5 = startAfterPadding;
            while (i5 < getItemCount() && childCount < endAfterPadding + i) {
                Rect rect = (Rect) m61794b().f46289a.get(i5);
                childAt2 = recycler2.getViewForPosition(i5);
                addView(childAt2);
                if (rect == null) {
                    rect = new Rect();
                    m61794b().f46289a.put(i5, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(childAt2, i3, i3);
                i2 = getDecoratedMeasuredWidth(childAt2);
                decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt2);
                int paddingLeft = (int) (((float) getPaddingLeft()) + (((float) (d - i2)) / 2.0f));
                if (childCount == -1 && startAfterPadding == 0) {
                    childCount = (int) (((float) getPaddingTop()) + (((float) (m61787e() - decoratedMeasuredHeight)) / 2.0f));
                    rect2.set(paddingLeft, childCount, i2 + paddingLeft, decoratedMeasuredHeight + childCount);
                } else {
                    rect2.set(paddingLeft, childCount, i2 + paddingLeft, decoratedMeasuredHeight + childCount);
                }
                decoratedMeasuredHeight = rect2.left;
                paddingLeft = rect2.top;
                i3 = rect2.right;
                childAt = childAt2;
                int i6 = decoratedMeasuredHeight;
                decoratedMeasuredHeight = paddingLeft;
                paddingLeft = i3;
                Rect rect3 = rect2;
                layoutDecorated(childAt, i6, decoratedMeasuredHeight, paddingLeft, rect2.bottom);
                childCount = rect3.bottom;
                galleryLayoutManager.f50943b = i5;
                i5++;
                i3 = 0;
            }
            return;
        }
        if (getChildCount() > 0) {
            childAt3 = getChildAt(0);
            i2 = getPosition(childAt3) - 1;
            i4 = getDecoratedTop(childAt3);
            childCount = i2;
        }
        for (endAfterPadding = childCount; endAfterPadding >= 0 && i4 > startAfterPadding + i; endAfterPadding--) {
            Rect rect4 = (Rect) m61794b().f46289a.get(endAfterPadding);
            childAt = recycler2.getViewForPosition(endAfterPadding);
            addView(childAt, 0);
            if (rect4 == null) {
                rect4 = new Rect();
                m61794b().f46289a.put(endAfterPadding, rect4);
            }
            Rect rect5 = rect4;
            measureChildWithMargins(childAt, 0, 0);
            childCount = getDecoratedMeasuredWidth(childAt);
            decoratedMeasuredHeight = (int) (((float) getPaddingLeft()) + (((float) (d - childCount)) / 2.0f));
            rect5.set(decoratedMeasuredHeight, i4 - getDecoratedMeasuredHeight(childAt), childCount + decoratedMeasuredHeight, i4);
            layoutDecorated(childAt, rect5.left, rect5.top, rect5.right, rect5.bottom);
            i4 = rect5.top;
            galleryLayoutManager.f50942a = endAfterPadding;
        }
    }

    /* renamed from: d */
    private void m61786d(Recycler recycler, State state, int i) {
        int i2;
        int i3;
        View childAt;
        View childAt2;
        GalleryLayoutManager galleryLayoutManager = this;
        Recycler recycler2 = recycler;
        int startAfterPadding = m61789f().getStartAfterPadding();
        int endAfterPadding = m61789f().getEndAfterPadding();
        int i4 = 0;
        if (getChildCount() > 0) {
            if (i >= 0) {
                i2 = 0;
                for (i3 = 0; i3 < getChildCount(); i3++) {
                    childAt = getChildAt(i3 + i2);
                    if (getDecoratedRight(childAt) - i >= startAfterPadding) {
                        break;
                    }
                    removeAndRecycleView(childAt, recycler2);
                    galleryLayoutManager.f50942a++;
                    i2--;
                }
            } else {
                for (i3 = getChildCount() - 1; i3 >= 0; i3--) {
                    childAt2 = getChildAt(i3);
                    if (getDecoratedLeft(childAt2) - i > endAfterPadding) {
                        removeAndRecycleView(childAt2, recycler2);
                        galleryLayoutManager.f50943b--;
                    }
                }
            }
        }
        i3 = galleryLayoutManager.f50942a;
        int e = m61787e();
        int i5 = -1;
        int decoratedMeasuredHeight;
        if (i >= 0) {
            if (getChildCount() != 0) {
                View childAt3 = getChildAt(getChildCount() - 1);
                i2 = getPosition(childAt3) + 1;
                i3 = getDecoratedRight(childAt3);
                startAfterPadding = i2;
            } else {
                startAfterPadding = i3;
                i3 = -1;
            }
            int i6 = startAfterPadding;
            while (i6 < getItemCount() && i3 < endAfterPadding + i) {
                Rect rect = (Rect) m61794b().f46289a.get(i6);
                childAt = recycler2.getViewForPosition(i6);
                addView(childAt);
                if (rect == null) {
                    rect = new Rect();
                    m61794b().f46289a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(childAt, i4, i4);
                i2 = getDecoratedMeasuredWidth(childAt);
                decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt);
                int paddingTop = (int) (((float) getPaddingTop()) + (((float) (e - decoratedMeasuredHeight)) / 2.0f));
                if (i3 == -1 && startAfterPadding == 0) {
                    i3 = (int) (((float) getPaddingLeft()) + (((float) (m61783d() - i2)) / 2.0f));
                    rect2.set(i3, paddingTop, i2 + i3, decoratedMeasuredHeight + paddingTop);
                } else {
                    rect2.set(i3, paddingTop, i2 + i3, decoratedMeasuredHeight + paddingTop);
                }
                decoratedMeasuredHeight = rect2.left;
                paddingTop = rect2.top;
                i4 = rect2.right;
                childAt2 = childAt;
                int i7 = decoratedMeasuredHeight;
                decoratedMeasuredHeight = paddingTop;
                paddingTop = i4;
                Rect rect3 = rect2;
                layoutDecorated(childAt2, i7, decoratedMeasuredHeight, paddingTop, rect2.bottom);
                i3 = rect3.right;
                galleryLayoutManager.f50943b = i6;
                i6++;
                i4 = 0;
            }
            return;
        }
        if (getChildCount() > 0) {
            childAt3 = getChildAt(0);
            i2 = getPosition(childAt3) - 1;
            i5 = getDecoratedLeft(childAt3);
            i3 = i2;
        }
        for (endAfterPadding = i3; endAfterPadding >= 0 && i5 > startAfterPadding + i; endAfterPadding--) {
            Rect rect4 = (Rect) m61794b().f46289a.get(endAfterPadding);
            childAt2 = recycler2.getViewForPosition(endAfterPadding);
            addView(childAt2, 0);
            if (rect4 == null) {
                rect4 = new Rect();
                m61794b().f46289a.put(endAfterPadding, rect4);
            }
            Rect rect5 = rect4;
            measureChildWithMargins(childAt2, 0, 0);
            i3 = getDecoratedMeasuredWidth(childAt2);
            i7 = getDecoratedMeasuredHeight(childAt2);
            decoratedMeasuredHeight = (int) (((float) getPaddingTop()) + (((float) (e - i7)) / 2.0f));
            rect5.set(i5 - i3, decoratedMeasuredHeight, i5, i7 + decoratedMeasuredHeight);
            layoutDecorated(childAt2, rect5.left, rect5.top, rect5.right, rect5.bottom);
            i5 = rect5.left;
            galleryLayoutManager.f50942a = endAfterPadding;
        }
    }

    /* renamed from: d */
    private int m61783d() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* renamed from: e */
    private int m61787e() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* renamed from: b */
    public C14691e m61794b() {
        if (this.f50947f == null) {
            this.f50947f = new C14691e(this);
        }
        return this.f50947f;
    }

    /* renamed from: a */
    private int m61767a(int i) {
        int i2 = -1;
        if (getChildCount() == 0) {
            return -1;
        }
        if (i >= this.f50942a) {
            i2 = 1;
        }
        return i2;
    }

    public PointF computeScrollVectorForPosition(int i) {
        i = m61767a(i);
        PointF pointF = new PointF();
        if (i == 0) {
            return 0;
        }
        if (this.f50951j == 0) {
            pointF.x = (float) i;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i;
        }
        return pointF;
    }

    public boolean canScrollHorizontally() {
        return this.f50951j == 0;
    }

    public boolean canScrollVertically() {
        return this.f50951j == 1;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        if (getChildCount() != 0) {
            if (i != 0) {
                int i2 = -i;
                int endAfterPadding = ((m61789f().getEndAfterPadding() - m61789f().getStartAfterPadding()) / 2) + m61789f().getStartAfterPadding();
                View childAt;
                if (i > 0) {
                    if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                        childAt = getChildAt(getChildCount() - 1);
                        i2 = -Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - endAfterPadding));
                    }
                } else if (this.f50942a == 0) {
                    childAt = getChildAt(0);
                    i2 = -Math.min(0, Math.max(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - endAfterPadding));
                }
                int i3 = -i2;
                m61794b().f46290b = i3;
                m61778b(recycler, state, i3);
                offsetChildrenHorizontal(i2);
                return i3;
            }
        }
        return 0;
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        if (getChildCount() != 0) {
            if (i != 0) {
                int i2 = -i;
                int endAfterPadding = ((m61789f().getEndAfterPadding() - m61789f().getStartAfterPadding()) / 2) + m61789f().getStartAfterPadding();
                View childAt;
                if (i > 0) {
                    if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                        childAt = getChildAt(getChildCount() - 1);
                        i2 = -Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - endAfterPadding));
                    }
                } else if (this.f50942a == 0) {
                    childAt = getChildAt(0);
                    i2 = -Math.min(0, Math.max(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - endAfterPadding));
                }
                int i3 = -i2;
                m61794b().f46290b = i3;
                m61778b(recycler, state, i3);
                offsetChildrenVertical(i2);
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: f */
    private OrientationHelper m61789f() {
        if (this.f50951j == 0) {
            if (this.f50952k == null) {
                this.f50952k = OrientationHelper.createHorizontalHelper(this);
            }
            return this.f50952k;
        }
        if (this.f50953l == null) {
            this.f50953l = OrientationHelper.createVerticalHelper(this);
        }
        return this.f50953l;
    }

    /* renamed from: a */
    public void m61793a(ItemTransformer itemTransformer) {
        this.f50954m = itemTransformer;
    }

    /* renamed from: a */
    public void m61792a(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            throw new IllegalArgumentException("The attach RecycleView must not null!!");
        }
        this.f50956o = recyclerView;
        this.f50944c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.f50948g.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f50949h);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        state = new C17999a(recyclerView.getContext());
        state.setTargetPosition(i);
        startSmoothScroll(state);
    }
}
