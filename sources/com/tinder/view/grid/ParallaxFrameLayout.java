package com.tinder.view.grid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.tinder.base.C8314i.C8313c;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\"#B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/view/grid/ParallaxFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "parallaxFactor", "", "getParallaxFactor", "()F", "setParallaxFactor", "(F)V", "value", "Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "parallaxManager", "getParallaxManager", "()Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "setParallaxManager", "(Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;)V", "parallaxOffset", "", "parallaxRange", "calculateChildViewHeight", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "invalidateIfNeeded", "onAttachedToWindow", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "ParallaxManager", "WindowParallaxManager", "base_release"}, k = 1, mv = {1, 1, 10})
public final class ParallaxFrameLayout extends FrameLayout {
    @NotNull
    /* renamed from: a */
    private C15421a f47705a = new C17259b();
    /* renamed from: b */
    private int f47706b;
    /* renamed from: c */
    private int f47707c;
    /* renamed from: d */
    private float f47708d = 1.16f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0014R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "", "()V", "<set-?>", "Lcom/tinder/view/grid/ParallaxFrameLayout;", "parallaxFrameLayout", "getParallaxFrameLayout", "()Lcom/tinder/view/grid/ParallaxFrameLayout;", "setParallaxFrameLayout", "(Lcom/tinder/view/grid/ParallaxFrameLayout;)V", "getContainerHeight", "", "getYOffsetInContainer", "invalidate", "", "onStart", "onStop", "start", "start$base_release", "stop", "stop$base_release", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.view.grid.ParallaxFrameLayout$a */
    public static abstract class C15421a {
        @Nullable
        /* renamed from: a */
        private ParallaxFrameLayout f47703a;

        /* renamed from: a */
        public abstract int mo12672a();

        /* renamed from: b */
        public abstract int mo12673b();

        /* renamed from: f */
        public void mo12735f() {
        }

        /* renamed from: g */
        public void mo12736g() {
        }

        @Nullable
        /* renamed from: c */
        protected final ParallaxFrameLayout m57811c() {
            return this.f47703a;
        }

        /* renamed from: a */
        public final void m57809a(@NotNull ParallaxFrameLayout parallaxFrameLayout) {
            C2668g.b(parallaxFrameLayout, "parallaxFrameLayout");
            this.f47703a = parallaxFrameLayout;
            mo12735f();
        }

        /* renamed from: d */
        public final void m57812d() {
            this.f47703a = (ParallaxFrameLayout) null;
            mo12736g();
        }

        /* renamed from: e */
        public final void m57813e() {
            ParallaxFrameLayout parallaxFrameLayout = this.f47703a;
            if (parallaxFrameLayout != null) {
                parallaxFrameLayout.m57817a(mo12672a(), mo12673b());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/view/grid/ParallaxFrameLayout$WindowParallaxManager;", "Lcom/tinder/view/grid/ParallaxFrameLayout$ParallaxManager;", "()V", "onScrollChangedListener", "Lcom/tinder/view/grid/ParallaxFrameLayout$WindowParallaxManager$OnScrollChangedListener;", "tempViewLocation", "", "getContainerHeight", "", "getYOffsetInContainer", "onStart", "", "onStop", "Companion", "OnScrollChangedListener", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.view.grid.ParallaxFrameLayout$b */
    public static final class C17259b extends C15421a {
        /* renamed from: a */
        public static final C15422a f52883a = new C15422a();
        /* renamed from: d */
        private static final int f52884d;
        /* renamed from: b */
        private final C15423b f52885b = new C15423b(this);
        /* renamed from: c */
        private final int[] f52886c = new int[2];

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/view/grid/ParallaxFrameLayout$WindowParallaxManager$Companion;", "", "()V", "DEVICE_HEIGHT", "", "base_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.view.grid.ParallaxFrameLayout$b$a */
        public static final class C15422a {
            private C15422a() {
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/tinder/view/grid/ParallaxFrameLayout$WindowParallaxManager$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "(Lcom/tinder/view/grid/ParallaxFrameLayout$WindowParallaxManager;)V", "onScrollChanged", "", "base_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.view.grid.ParallaxFrameLayout$b$b */
        private final class C15423b implements OnScrollChangedListener {
            /* renamed from: a */
            final /* synthetic */ C17259b f47704a;

            public C15423b(C17259b c17259b) {
                this.f47704a = c17259b;
            }

            public void onScrollChanged() {
                this.f47704a.m57813e();
            }
        }

        /* renamed from: f */
        public void mo12735f() {
            ParallaxFrameLayout c = m57811c();
            if (c != null) {
                c.getViewTreeObserver().addOnScrollChangedListener(this.f52885b);
            }
        }

        /* renamed from: g */
        public void mo12736g() {
            ParallaxFrameLayout c = m57811c();
            if (c != null) {
                c.getViewTreeObserver().removeOnScrollChangedListener(this.f52885b);
            }
        }

        /* renamed from: a */
        public int mo12672a() {
            ParallaxFrameLayout c = m57811c();
            if (c != null) {
                c.getLocationInWindow(this.f52886c);
            }
            return this.f52886c[1];
        }

        /* renamed from: b */
        public int mo12673b() {
            return f52884d;
        }

        static {
            Resources system = Resources.getSystem();
            C2668g.a(system, "Resources.getSystem()");
            f52884d = system.getDisplayMetrics().heightPixels;
        }
    }

    public ParallaxFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, C8313c.ParallaxFrameLayout, 0, 0);
            try {
                this.f47708d = context.getFloat(C8313c.ParallaxFrameLayout_parallaxFactor, this.f47708d);
            } finally {
                context.recycle();
            }
        }
    }

    @NotNull
    public final C15421a getParallaxManager() {
        return this.f47705a;
    }

    public final void setParallaxManager(@NotNull C15421a c15421a) {
        C2668g.b(c15421a, "value");
        this.f47705a.m57812d();
        this.f47705a = c15421a;
    }

    public final float getParallaxFactor() {
        return this.f47708d;
    }

    public final void setParallaxFactor(float f) {
        this.f47708d = f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47705a.m57809a(this);
    }

    protected void onDetachedFromWindow() {
        this.f47705a.m57812d();
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (((float) MeasureSpec.getSize(i2)) * this.f47708d), 1073741824);
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                View childAt = getChildAt(i3);
                C2668g.a(childAt, "child");
                if (childAt.getVisibility() != 8) {
                    measureChildWithMargins(childAt, i, 0, makeMeasureSpec, 0);
                }
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        setMeasuredDimension(i, i2);
    }

    protected void dispatchDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        int i = this.f47706b;
        int a = m57816a();
        int i2 = -a;
        int i3 = this.f47707c;
        int height = getHeight() - a;
        float min = ((float) height) + (((float) (0 - height)) * (((float) 1) - (((float) (Math.min(Math.max(i, i2), i3) - i2)) / ((float) (i3 - i2)))));
        canvas.save();
        canvas.translate(0.0f, min);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* renamed from: a */
    private final int m57816a() {
        return (int) (((float) getHeight()) * this.f47708d);
    }

    /* renamed from: a */
    private final void m57817a(int i, int i2) {
        if ((this.f47706b != i || this.f47707c != i2) && getChildCount() != 0) {
            this.f47706b = i;
            this.f47707c = i2;
            invalidate();
        }
    }
}
