package com.tinder.main.p287c;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.p011a.C2890b;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.main.Badgeable;
import com.tinder.main.Badgeable$Trigger;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u000bH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001cH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0014J\b\u0010\"\u001a\u00020\u0013H\u0014J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/main/view/MainTabIconView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/main/Badgeable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "interpolator", "Landroid/support/v4/view/animation/FastOutSlowInInterpolator;", "getInterpolator", "()Landroid/support/v4/view/animation/FastOutSlowInInterpolator;", "isIndicating", "", "()Z", "setIndicating", "(Z)V", "triggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/main/Badgeable$Trigger;", "addTrigger", "", "trigger", "animateSelected", "animateTab", "isSelecting", "animateUnselected", "getAnimListener", "Landroid/animation/Animator$AnimatorListener;", "getSelectColor", "", "getUnselectedColor", "getViewToAnimate", "Landroid/widget/ImageView;", "hideBadge", "onAttachedToWindow", "onDetachedFromWindow", "removeTrigger", "showBadge", "showIndicator", "shouldShow", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.c.b */
public abstract class C11993b extends FrameLayout implements Badgeable {
    /* renamed from: a */
    private boolean f38947a;
    @NotNull
    /* renamed from: b */
    private final C2890b f38948b = new C2890b();
    /* renamed from: c */
    private final CopyOnWriteArraySet<Badgeable$Trigger> f38949c = new CopyOnWriteArraySet();

    @Nullable
    /* renamed from: a */
    public abstract AnimatorListener mo11151a(boolean z);

    public abstract int getSelectColor();

    public abstract int getUnselectedColor();

    @NotNull
    public abstract ImageView getViewToAnimate();

    public C11993b(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
    }

    /* renamed from: e */
    public final boolean m48037e() {
        return this.f38947a;
    }

    public final void setIndicating(boolean z) {
        this.f38947a = z;
    }

    @NotNull
    protected final C2890b getInterpolator() {
        return this.f38948b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (Badgeable$Trigger register : this.f38949c) {
            register.register(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Badgeable$Trigger unregister : this.f38949c) {
            unregister.unregister();
        }
    }

    /* renamed from: a */
    public void mo11152a() {
        C11993b.m48031a(this, false, 1, null);
    }

    /* renamed from: b */
    public void mo11153b() {
        m48032c(false);
    }

    public void addTrigger(@NotNull Badgeable$Trigger badgeable$Trigger) {
        C2668g.b(badgeable$Trigger, "trigger");
        this.f38949c.add(badgeable$Trigger);
    }

    public void removeTrigger(@NotNull Badgeable$Trigger badgeable$Trigger) {
        C2668g.b(badgeable$Trigger, "trigger");
        this.f38949c.remove(badgeable$Trigger);
    }

    public void showBadge() {
        m48036b(true);
    }

    public void hideBadge() {
        m48036b(false);
    }

    /* renamed from: a */
    static /* synthetic */ void m48031a(C11993b c11993b, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTab");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        c11993b.m48032c(z);
    }

    /* renamed from: c */
    private final void m48032c(boolean z) {
        clearAnimation();
        int selectColor = z ? getSelectColor() : getUnselectedColor();
        AnimatorListener a = mo11151a(z);
        z = z ? true : true;
        getViewToAnimate().setColorFilter(selectColor, Mode.SRC_ATOP);
        ViewPropertyAnimator animate = animate();
        animate.scaleX(z);
        animate.scaleY(z);
        C2668g.a(animate, "animation");
        animate.setInterpolator((TimeInterpolator) this.f38948b);
        if (a != null) {
            animate.setListener(a);
        }
        animate.start();
    }

    /* renamed from: b */
    public final void m48036b(boolean z) {
        if ((z != this.f38947a ? 1 : null) != null) {
            this.f38947a = z;
            invalidate();
        }
    }
}
