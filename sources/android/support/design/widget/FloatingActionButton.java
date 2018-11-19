package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.C0181a.C0173d;
import android.support.design.C0181a.C0179j;
import android.support.design.C0181a.C0180k;
import android.support.design.widget.C0237g.C0235c;
import android.support.design.widget.CoordinatorLayout.C0205b;
import android.support.design.widget.CoordinatorLayout.DefaultBehavior;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.C0651o;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@DefaultBehavior(Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private ColorStateList mBackgroundTint;
    private Mode mBackgroundTintMode;
    private int mBorderWidth;
    boolean mCompatPadding;
    private int mCustomSize;
    private AppCompatImageHelper mImageHelper;
    int mImagePadding;
    private C0237g mImpl;
    private int mMaxImageSize;
    private int mRippleColor;
    final Rect mShadowPadding;
    private int mSize;
    private final Rect mTouchArea;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$a */
    public static abstract class C0208a {
        /* renamed from: a */
        public void m730a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void m731b(FloatingActionButton floatingActionButton) {
        }
    }

    public static class Behavior extends android.support.design.widget.CoordinatorLayout.Behavior<FloatingActionButton> {
        /* renamed from: a */
        private Rect f8718a;
        /* renamed from: b */
        private C0208a f8719b;
        /* renamed from: c */
        private boolean f8720c;

        /* renamed from: b */
        public /* synthetic */ boolean mo246b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return m10748a(coordinatorLayout, (FloatingActionButton) view, view2);
        }

        public Behavior() {
            this.f8720c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0180k.FloatingActionButton_Behavior_Layout);
            this.f8720c = context.getBoolean(C0180k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            context.recycle();
        }

        /* renamed from: a */
        public void mo244a(@NonNull C0205b c0205b) {
            if (c0205b.f689h == 0) {
                c0205b.f689h = 80;
            }
        }

        /* renamed from: a */
        public boolean m10748a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m10741a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m10742a(view) != null) {
                m10744b(view, floatingActionButton);
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m10742a(@NonNull View view) {
            view = view.getLayoutParams();
            return view instanceof C0205b ? ((C0205b) view).m720b() instanceof BottomSheetBehavior : null;
        }

        /* renamed from: a */
        private boolean m10743a(View view, FloatingActionButton floatingActionButton) {
            C0205b c0205b = (C0205b) floatingActionButton.getLayoutParams();
            if (this.f8720c && c0205b.m712a() == view.getId() && floatingActionButton.getUserSetVisibility() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m10741a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m10743a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8718a == null) {
                this.f8718a = new Rect();
            }
            Rect rect = this.f8718a;
            C0651o.m2650b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.hide(this.f8719b, false);
            } else {
                floatingActionButton.show(this.f8719b, false);
            }
            return true;
        }

        /* renamed from: b */
        private boolean m10744b(View view, FloatingActionButton floatingActionButton) {
            if (!m10743a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0205b) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.hide(this.f8719b, false);
            } else {
                floatingActionButton.show(this.f8719b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean m10746a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List c = coordinatorLayout.m15650c((View) floatingActionButton);
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) c.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10742a(view) && m10744b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m10741a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m15640a((View) floatingActionButton, i);
            m10740a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean m10747a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            coordinatorLayout = floatingActionButton.mShadowPadding;
            rect.set(floatingActionButton.getLeft() + coordinatorLayout.left, floatingActionButton.getTop() + coordinatorLayout.top, floatingActionButton.getRight() - coordinatorLayout.right, floatingActionButton.getBottom() - coordinatorLayout.bottom);
            return true;
        }

        /* renamed from: a */
        private void m10740a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.mShadowPadding;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0205b c0205b = (C0205b) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - c0205b.rightMargin ? rect.right : floatingActionButton.getLeft() <= c0205b.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - c0205b.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= c0205b.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    ViewCompat.m2202c((View) floatingActionButton, i);
                }
                if (i2 != 0) {
                    ViewCompat.m2205d((View) floatingActionButton, i2);
                }
            }
        }
    }

    /* renamed from: android.support.design.widget.FloatingActionButton$b */
    private class C2767b implements C0239j {
        /* renamed from: a */
        final /* synthetic */ FloatingActionButton f8721a;

        C2767b(FloatingActionButton floatingActionButton) {
            this.f8721a = floatingActionButton;
        }

        /* renamed from: a */
        public float mo247a() {
            return ((float) this.f8721a.getSizeDimension()) / 2.0f;
        }

        /* renamed from: a */
        public void mo248a(int i, int i2, int i3, int i4) {
            this.f8721a.mShadowPadding.set(i, i2, i3, i4);
            this.f8721a.setPadding(i + this.f8721a.mImagePadding, i2 + this.f8721a.mImagePadding, i3 + this.f8721a.mImagePadding, i4 + this.f8721a.mImagePadding);
        }

        /* renamed from: a */
        public void mo249a(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo250b() {
            return this.f8721a.mCompatPadding;
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShadowPadding = new Rect();
        this.mTouchArea = new Rect();
        C0248o.m917a(context);
        context = context.obtainStyledAttributes(attributeSet, C0180k.FloatingActionButton, i, C0179j.Widget_Design_FloatingActionButton);
        this.mBackgroundTint = context.getColorStateList(C0180k.FloatingActionButton_backgroundTint);
        this.mBackgroundTintMode = C0250q.m924a(context.getInt(C0180k.FloatingActionButton_backgroundTintMode, -1), null);
        this.mRippleColor = context.getColor(C0180k.FloatingActionButton_rippleColor, 0);
        this.mSize = context.getInt(C0180k.FloatingActionButton_fabSize, -1);
        this.mCustomSize = context.getDimensionPixelSize(C0180k.FloatingActionButton_fabCustomSize, 0);
        this.mBorderWidth = context.getDimensionPixelSize(C0180k.FloatingActionButton_borderWidth, 0);
        float dimension = context.getDimension(C0180k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = context.getDimension(C0180k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.mCompatPadding = context.getBoolean(C0180k.FloatingActionButton_useCompatPadding, false);
        context.recycle();
        this.mImageHelper = new AppCompatImageHelper(this);
        this.mImageHelper.loadFromAttributes(attributeSet, i);
        this.mMaxImageSize = (int) getResources().getDimension(C0173d.design_fab_image_size);
        getImpl().mo273a(this.mBackgroundTint, this.mBackgroundTintMode, this.mRippleColor, this.mBorderWidth);
        getImpl().m866a(dimension);
        getImpl().m876b(dimension2);
    }

    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.mImagePadding = (sizeDimension - this.mMaxImageSize) / 2;
        getImpl().m881e();
        i = Math.min(resolveAdjustedSize(sizeDimension, i), resolveAdjustedSize(sizeDimension, i2));
        setMeasuredDimension((this.mShadowPadding.left + i) + this.mShadowPadding.right, (i + this.mShadowPadding.top) + this.mShadowPadding.bottom);
    }

    @ColorInt
    public int getRippleColor() {
        return this.mRippleColor;
    }

    public void setRippleColor(@ColorInt int i) {
        if (this.mRippleColor != i) {
            this.mRippleColor = i;
            getImpl().mo272a(i);
        }
    }

    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.mBackgroundTint;
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.mBackgroundTint != colorStateList) {
            this.mBackgroundTint = colorStateList;
            getImpl().m869a(colorStateList);
        }
    }

    @Nullable
    public Mode getBackgroundTintMode() {
        return this.mBackgroundTintMode;
    }

    public void setBackgroundTintMode(@Nullable Mode mode) {
        if (this.mBackgroundTintMode != mode) {
            this.mBackgroundTintMode = mode;
            getImpl().m871a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    public void setBackgroundColor(int i) {
        Log.i(LOG_TAG, "Setting a custom background is not supported.");
    }

    public void setImageResource(@DrawableRes int i) {
        this.mImageHelper.setImageResource(i);
    }

    public void show() {
        show(null);
    }

    public void show(@Nullable C0208a c0208a) {
        show(c0208a, true);
    }

    void show(C0208a c0208a, boolean z) {
        getImpl().m878b(wrapOnVisibilityChangedListener(c0208a), z);
    }

    public void hide() {
        hide(null);
    }

    public void hide(@Nullable C0208a c0208a) {
        hide(c0208a, true);
    }

    void hide(@Nullable C0208a c0208a, boolean z) {
        getImpl().m873a(wrapOnVisibilityChangedListener(c0208a), z);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            getImpl().mo278d();
        }
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public void setSize(int i) {
        if (i != this.mSize) {
            this.mSize = i;
            requestLayout();
        }
    }

    public int getSize() {
        return this.mSize;
    }

    @Nullable
    private C0235c wrapOnVisibilityChangedListener(@Nullable final C0208a c0208a) {
        return c0208a == null ? null : new C0235c(this) {
            /* renamed from: b */
            final /* synthetic */ FloatingActionButton f8717b;

            /* renamed from: a */
            public void mo242a() {
                c0208a.m730a(this.f8717b);
            }

            /* renamed from: b */
            public void mo243b() {
                c0208a.m731b(this.f8717b);
            }
        };
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size should be non-negative.");
        }
        this.mCustomSize = i;
    }

    public int getCustomSize() {
        return this.mCustomSize;
    }

    int getSizeDimension() {
        return getSizeDimension(this.mSize);
    }

    private int getSizeDimension(int i) {
        Resources resources = getResources();
        if (this.mCustomSize != 0) {
            return this.mCustomSize;
        }
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < AUTO_MINI_LARGEST_SCREEN_WIDTH) {
                i = getSizeDimension(1);
            } else {
                i = getSizeDimension(0);
            }
            return i;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(C0173d.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(C0173d.design_fab_size_mini);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m882f();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m883g();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo275a(getDrawableState());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo276b();
    }

    public boolean getContentRect(@NonNull Rect rect) {
        if (!ViewCompat.m2234z(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        rect.left += this.mShadowPadding.left;
        rect.top += this.mShadowPadding.top;
        rect.right -= this.mShadowPadding.right;
        rect.bottom -= this.mShadowPadding.bottom;
        return true;
    }

    @NonNull
    public Drawable getContentBackground() {
        return getImpl().m879c();
    }

    private static int resolveAdjustedSize(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, i2);
        }
        if (mode != 0) {
            return mode != 1073741824 ? i : i2;
        } else {
            return i;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (getContentRect(this.mTouchArea) && !this.mTouchArea.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public float getCompatElevation() {
        return getImpl().mo270a();
    }

    public void setCompatElevation(float f) {
        getImpl().m866a(f);
    }

    private C0237g getImpl() {
        if (this.mImpl == null) {
            this.mImpl = createImpl();
        }
        return this.mImpl;
    }

    private C0237g createImpl() {
        if (VERSION.SDK_INT >= 21) {
            return new C2780h(this, new C2767b(this));
        }
        return new C0237g(this, new C2767b(this));
    }
}
