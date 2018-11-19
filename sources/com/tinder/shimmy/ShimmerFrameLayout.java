package com.tinder.shimmy;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tinder.shimmy.mask.AlphaMaskConfig.C14948a;
import com.tinder.shimmy.mask.AlphaMaskConfig.Layer;
import com.tinder.shimmy.mask.AlphaMaskConfig.Layer.Type;
import com.tinder.shimmy.mask.C14950b;
import com.tinder.shimmy.p411a.C14942b;
import com.tinder.shimmy.shimmer.C14959b;
import com.tinder.shimmy.shimmer.C14963d;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002:\u00069:;<=>B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J \u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0014J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0014J\b\u0010-\u001a\u00020!H\u0014J\b\u0010.\u001a\u00020!H\u0007J\b\u0010/\u001a\u00020!H\u0007J(\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u000202H\u0014J\u0010\u00106\u001a\u00020!2\u0006\u00107\u001a\u00020\u001dH\u0016J\b\u00108\u001a\u00020!H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "alphaMaskManager", "Lcom/tinder/shimmy/mask/AlphaMaskManager;", "alphaMaskRenderer", "Lcom/tinder/shimmy/ShimmerFrameLayout$AlphaMaskRenderer;", "configManager", "Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManager;", "configManagerListener", "Lcom/tinder/shimmy/ShimmerFrameLayout$ConfigManagerListener;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "rollAngleTracker", "Lcom/tinder/shimmy/shimmer/RollAngleTracker;", "shimmerEngine", "Lcom/tinder/shimmy/shimmer/ShimmerEngine;", "textureView", "Landroid/view/TextureView;", "textureViewManager", "Lcom/tinder/shimmy/ShimmerFrameLayout$TextureViewManager;", "checkLayoutParams", "", "p", "Landroid/view/ViewGroup$LayoutParams;", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawChild", "child", "Landroid/view/View;", "drawingTime", "", "generateLayoutParams", "Lcom/tinder/shimmy/ShimmerFrameLayout$LayoutParams;", "hideTextureView", "onAttachedToWindow", "onDetachedFromWindow", "onPause", "onResume", "onSizeChanged", "w", "", "h", "oldw", "oldh", "setEnabled", "enabled", "updateTextureViewVisibility", "AlphaMaskRenderer", "Config", "ConfigManager", "ConfigManagerListener", "LayoutParams", "TextureViewManager", "shimmy_release"}, k = 1, mv = {1, 1, 9})
public final class ShimmerFrameLayout extends FrameLayout implements LifecycleObserver {
    /* renamed from: a */
    private final TextureView f12501a;
    /* renamed from: b */
    private final ShimmerFrameLayout$d f12502b = new ShimmerFrameLayout$d(this);
    /* renamed from: c */
    private final ShimmerFrameLayout$a f12503c = new ShimmerFrameLayout$a(this);
    /* renamed from: d */
    private final ShimmerFrameLayout$c f12504d = new ShimmerFrameLayout$c(this);
    /* renamed from: e */
    private final C14959b f12505e;
    /* renamed from: f */
    private final C14950b f12506f;
    /* renamed from: g */
    private final C14963d f12507g;
    /* renamed from: h */
    private final ShimmerFrameLayout$ConfigManager f12508h;

    public ShimmerFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        C2668g.m10309b(attributeSet, "attrs");
        super(context, attributeSet);
        this.f12501a = new TextureView(context);
        this.f12505e = C14959b.f46697a.a(context);
        this.f12506f = new C14950b();
        this.f12507g = new C14963d(this.f12505e, this.f12506f);
        this.f12508h = ShimmerFrameLayout$ConfigManager.f46651a.a();
        this.f12501a.setSurfaceTextureListener(this.f12502b);
        this.f12501a.setOpaque(false);
        addView((View) this.f12501a, new ShimmerFrameLayout$LayoutParams(0, 0));
        if ((C14942b.a(context) instanceof LifecycleOwner) == null) {
            throw ((Throwable) new IllegalArgumentException("ShimmerFrameLayout can only be added to LifecycleOwner".toString()));
        }
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m15122a(attributeSet);
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ FrameLayout.LayoutParams m71745generateLayoutParams(AttributeSet attributeSet) {
        return m15122a(attributeSet);
    }

    private final LifecycleOwner getLifecycleOwner() {
        Object context = getContext();
        C2668g.m10305a(context, "context");
        Context a = C14942b.a(context);
        if (!(a instanceof LifecycleOwner)) {
            a = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) a;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12506f.a();
        this.f12508h.a(this.f12504d);
        getLifecycleOwner().getLifecycle().mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12506f.b();
        this.f12508h.b(this.f12504d);
        getLifecycleOwner().getLifecycle().mo37b(this);
        m15118b();
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        m15114a();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        m15118b();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m15114a();
    }

    protected void dispatchDraw(@NotNull Canvas canvas) {
        C2668g.m10309b(canvas, "canvas");
        this.f12503c.a();
        super.dispatchDraw(canvas);
        this.f12503c.b();
    }

    protected boolean drawChild(@NotNull Canvas canvas, @NotNull View view, long j) {
        C2668g.m10309b(canvas, "canvas");
        C2668g.m10309b(view, "child");
        ShimmerFrameLayout$a shimmerFrameLayout$a = this.f12503c;
        if (!C2668g.m10308a((Object) view, shimmerFrameLayout$a.f46658a.f12501a)) {
            C14948a a = ShimmerFrameLayout$a.a(shimmerFrameLayout$a);
            if (a != null) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.shimmy.ShimmerFrameLayout.LayoutParams");
                } else if (((ShimmerFrameLayout$LayoutParams) layoutParams).a()) {
                    C14948a.a(a).add(new Layer(a.b(), Type.INCLUDE, new ShimmerFrameLayout$drawChild$$inlined$onDrawChild$1(this, view, j)));
                } else {
                    C14948a.a(a).add(new Layer(a.b(), Type.EXCLUDE, new ShimmerFrameLayout$drawChild$$inlined$onDrawChild$2(this, view, j)));
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post((Runnable) new ShimmerFrameLayout$e(this));
    }

    @NotNull
    /* renamed from: a */
    public ShimmerFrameLayout$LayoutParams m15122a(@NotNull AttributeSet attributeSet) {
        C2668g.m10309b(attributeSet, "attrs");
        Object context = getContext();
        C2668g.m10305a(context, "context");
        return new ShimmerFrameLayout$LayoutParams(context, attributeSet);
    }

    protected boolean checkLayoutParams(@Nullable LayoutParams layoutParams) {
        return layoutParams instanceof ShimmerFrameLayout$LayoutParams;
    }

    /* renamed from: a */
    private final void m15114a() {
        Object obj = (isEnabled() && this.f12508h.a().a() && this.f12505e.a()) ? 1 : null;
        if (obj != null) {
            this.f12502b.b();
            this.f12501a.setVisibility(0);
            return;
        }
        m15118b();
    }

    /* renamed from: b */
    private final void m15118b() {
        this.f12501a.setVisibility(8);
    }
}
