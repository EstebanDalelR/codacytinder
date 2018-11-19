package com.tinder.fireboarding.view.p254a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import com.tinder.fireboarding.view.FireboardingViewContainer;
import com.tinder.fireboarding.view.FireboardingViewContainer.C9568a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\b\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/fireboarding/view/dialog/FireboardingViewContainerDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "fireBoardingViewContainer", "Lcom/tinder/fireboarding/view/FireboardingViewContainer;", "(Landroid/content/Context;Lcom/tinder/fireboarding/view/FireboardingViewContainer;)V", "animateIn", "", "params", "Lcom/tinder/fireboarding/view/FireboardingViewContainer$Params;", "onEntranceAnimationEndListener", "Lkotlin/Function0;", "onAnimationEndListener", "show", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.a.a */
public final class C9570a extends Dialog {
    /* renamed from: a */
    private final FireboardingViewContainer f31992a;

    public C9570a(@NotNull Context context, @NotNull FireboardingViewContainer fireboardingViewContainer) {
        C2668g.b(context, "context");
        C2668g.b(fireboardingViewContainer, "fireBoardingViewContainer");
        super(context);
        this.f31992a = fireboardingViewContainer;
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable((Drawable) new ColorDrawable(0));
        getWindow().clearFlags(2);
        setContentView((View) this.f31992a);
        setCancelable(false);
    }

    public void show() {
        Window window = getWindow();
        C2668g.a(window, "window");
        window.getAttributes().windowAnimations = 0;
        getWindow().setLayout(-1, -1);
        super.show();
    }

    /* renamed from: a */
    public final void m39893a(@NotNull C9568a c9568a, @NotNull Function0<C15813i> function0, @NotNull Function0<C15813i> function02) {
        C2668g.b(c9568a, "params");
        C2668g.b(function0, "onEntranceAnimationEndListener");
        C2668g.b(function02, "onAnimationEndListener");
        this.f31992a.m39892a(c9568a, (Function0) function0, (Function0) function02);
    }
}
