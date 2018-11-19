package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.C0609n;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.appcompat.C0667R;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class AbsActionBarView extends ViewGroup {
    private static final int FADE_DURATION = 200;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected final VisibilityAnimListener mVisAnimListener;
    protected C0609n mVisibilityAnim;

    /* renamed from: android.support.v7.widget.AbsActionBarView$1 */
    class C06831 implements Runnable {
        C06831() {
        }

        public void run() {
            AbsActionBarView.this.showOverflowMenu();
        }
    }

    protected class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        private boolean mCanceled = null;
        int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        public VisibilityAnimListener withFinalVisibility(C0609n c0609n, int i) {
            AbsActionBarView.this.mVisibilityAnim = c0609n;
            this.mFinalVisibility = i;
            return this;
        }

        public void onAnimationStart(View view) {
            super.setVisibility(0);
            this.mCanceled = false;
        }

        public void onAnimationEnd(View view) {
            if (this.mCanceled == null) {
                AbsActionBarView.this.mVisibilityAnim = null;
                super.setVisibility(this.mFinalVisibility);
            }
        }

        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }
    }

    protected static int next(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVisAnimListener = new VisibilityAnimListener();
        attributeSet = new TypedValue();
        if (context.getTheme().resolveAttribute(C0667R.attr.actionBarPopupTheme, attributeSet, true) == 0 || attributeSet.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, attributeSet.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0667R.styleable.ActionBar, C0667R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0667R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.onConfigurationChanged(configuration);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            motionEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && motionEvent == null) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            motionEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && motionEvent == null) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.mFinalVisibility;
        }
        return getVisibility();
    }

    public C0609n setupAnimatorToVisibility(int i, long j) {
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.m2384b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0609n a = ViewCompat.m2221m(this).m2377a(1.0f);
            a.m2378a(j);
            a.m2379a(this.mVisAnimListener.withFinalVisibility(a, i));
            return a;
        }
        a = ViewCompat.m2221m(this).m2377a(0.0f);
        a.m2378a(j);
        a.m2379a(this.mVisAnimListener.withFinalVisibility(a, i));
        return a;
    }

    public void animateToVisibility(int i) {
        setupAnimatorToVisibility(i, 200).m2385c();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.mVisibilityAnim != null) {
                this.mVisibilityAnim.m2384b();
            }
            super.setVisibility(i);
        }
    }

    public boolean showOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.showOverflowMenu() : false;
    }

    public void postShowOverflowMenu() {
        post(new C06831());
    }

    public boolean hideOverflowMenu() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.hideOverflowMenu() : false;
    }

    public boolean isOverflowMenuShowing() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.isOverflowMenuShowing() : false;
    }

    public boolean isOverflowMenuShowPending() {
        return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.isOverflowMenuShowPending() : false;
    }

    public boolean isOverflowReserved() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.isOverflowReserved();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
    }

    protected int measureChildView(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(null, (i - view.getMeasuredWidth()) - i3);
    }

    protected int positionChild(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        i2 += (i3 - measuredHeight) / 2;
        if (z) {
            view.layout(i - measuredWidth, i2, i, measuredHeight + i2);
        } else {
            view.layout(i, i2, i + measuredWidth, measuredHeight + i2);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
