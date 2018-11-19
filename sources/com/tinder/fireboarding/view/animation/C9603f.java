package com.tinder.fireboarding.view.animation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import com.tinder.api.ManagerWebServices;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import tinder.com.tooltip.C19472b;
import tinder.com.tooltip.OverlayTooltipView.C19458a;
import tinder.com.tooltip.OverlayTooltipView.OnTooltipHideTriggeredListener;
import tinder.com.tooltip.OverlayTooltipView.OnTooltipViewShownListener;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.TooltipView;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u0011"}, d2 = {"Lcom/tinder/fireboarding/view/animation/FireboardingTooltipFactory;", "", "()V", "createTooltipBuilder", "Ltinder/com/tooltip/OverlayTooltipView$Builder;", "params", "Lcom/tinder/fireboarding/view/animation/FireboardingTooltipFactory$TooltipParams;", "tooltipAppearingAnimator", "Lcom/tinder/fireboarding/view/animation/TooltipAppearingAnimator;", "tooltipDisappearingAnimator", "Lcom/tinder/fireboarding/view/animation/TooltipDisappearingAnimator;", "onTooltipPresented", "Lkotlin/Function0;", "", "createTooltipDialog", "Ltinder/com/tooltip/OverlayTooltipDialog;", "TooltipParams", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.f */
public final class C9603f {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tinder/fireboarding/view/animation/FireboardingTooltipFactory$TooltipParams;", "", "anchorView", "Landroid/view/View;", "textColor", "", "text", "", "textBackgroundColor", "(Landroid/view/View;ILjava/lang/String;I)V", "getAnchorView", "()Landroid/view/View;", "getText", "()Ljava/lang/String;", "getTextBackgroundColor", "()I", "getTextColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.f$a */
    public static final class C9601a {
        @NotNull
        /* renamed from: a */
        private final View f32089a;
        /* renamed from: b */
        private final int f32090b;
        @NotNull
        /* renamed from: c */
        private final String f32091c;
        /* renamed from: d */
        private final int f32092d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9601a) {
                C9601a c9601a = (C9601a) obj;
                if (C2668g.a(this.f32089a, c9601a.f32089a)) {
                    if ((this.f32090b == c9601a.f32090b ? 1 : null) != null && C2668g.a(this.f32091c, c9601a.f32091c)) {
                        if ((this.f32092d == c9601a.f32092d ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            View view = this.f32089a;
            int i = 0;
            int hashCode = (((view != null ? view.hashCode() : 0) * 31) + this.f32090b) * 31;
            String str = this.f32091c;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode + i) * 31) + this.f32092d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TooltipParams(anchorView=");
            stringBuilder.append(this.f32089a);
            stringBuilder.append(", textColor=");
            stringBuilder.append(this.f32090b);
            stringBuilder.append(", text=");
            stringBuilder.append(this.f32091c);
            stringBuilder.append(", textBackgroundColor=");
            stringBuilder.append(this.f32092d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9601a(@NotNull View view, int i, @NotNull String str, int i2) {
            C2668g.b(view, "anchorView");
            C2668g.b(str, ManagerWebServices.PARAM_TEXT);
            this.f32089a = view;
            this.f32090b = i;
            this.f32091c = str;
            this.f32092d = i2;
        }

        @NotNull
        /* renamed from: a */
        public final View m39963a() {
            return this.f32089a;
        }

        /* renamed from: b */
        public final int m39964b() {
            return this.f32090b;
        }

        @NotNull
        /* renamed from: c */
        public final String m39965c() {
            return this.f32091c;
        }

        /* renamed from: d */
        public final int m39966d() {
            return this.f32092d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/tinder/fireboarding/view/animation/FireboardingTooltipFactory$createTooltipDialog$2$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.f$d */
    static final class C9602d implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C9612j f32093a;
        /* renamed from: b */
        final /* synthetic */ C9615k f32094b;

        C9602d(C9612j c9612j, C9615k c9615k) {
            this.f32093a = c9612j;
            this.f32094b = c9615k;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f32093a.m40006a();
            this.f32094b.m40009a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/fireboarding/view/animation/FireboardingTooltipFactory$createTooltipBuilder$1", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipViewShownListener;", "(Lcom/tinder/fireboarding/view/animation/TooltipAppearingAnimator;Lkotlin/jvm/functions/Function0;)V", "onTooltipViewShown", "", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "overlayView", "Landroid/view/View;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.f$b */
    public static final class C11828b implements OnTooltipViewShownListener {
        /* renamed from: a */
        final /* synthetic */ C9612j f38566a;
        /* renamed from: b */
        final /* synthetic */ Function0 f38567b;

        C11828b(C9612j c9612j, Function0 function0) {
            this.f38566a = c9612j;
            this.f38567b = function0;
        }

        public void onTooltipViewShown(@NotNull TooltipView tooltipView, @NotNull View view) {
            C2668g.b(tooltipView, "tooltipView");
            C2668g.b(view, "overlayView");
            this.f38566a.m40007a(tooltipView, this.f38567b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016¨\u0006\u000b"}, d2 = {"com/tinder/fireboarding/view/animation/FireboardingTooltipFactory$createTooltipBuilder$2", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipHideTriggeredListener;", "(Lcom/tinder/fireboarding/view/animation/TooltipDisappearingAnimator;)V", "onTooltipHideTriggered", "", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "overlayView", "Landroid/view/View;", "onAnimationEnd", "Lkotlin/Function0;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.f$c */
    public static final class C11829c implements OnTooltipHideTriggeredListener {
        /* renamed from: a */
        final /* synthetic */ C9615k f38568a;

        C11829c(C9615k c9615k) {
            this.f38568a = c9615k;
        }

        public void onTooltipHideTriggered(@NotNull TooltipView tooltipView, @NotNull View view, @NotNull Function0<C15813i> function0) {
            C2668g.b(tooltipView, "tooltipView");
            C2668g.b(view, "overlayView");
            C2668g.b(function0, "onAnimationEnd");
            this.f38568a.m40010a(tooltipView, function0);
        }
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C19472b m39968a(C9603f c9603f, C9601a c9601a, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = FireboardingTooltipFactory$createTooltipDialog$1.f44424a;
        }
        return c9603f.m39969a(c9601a, function0);
    }

    @NotNull
    /* renamed from: a */
    public final C19472b m39969a(@NotNull C9601a c9601a, @NotNull Function0<C15813i> function0) {
        C2668g.b(c9601a, "params");
        C2668g.b(function0, "onTooltipPresented");
        C9612j c9612j = new C9612j();
        C9615k c9615k = new C9615k();
        c9601a = m39967a(c9601a, c9612j, c9615k, function0).a().b();
        c9601a.setCancelable(null);
        c9601a.setOnDismissListener((OnDismissListener) new C9602d(c9612j, c9615k));
        return c9601a;
    }

    /* renamed from: a */
    private final C19458a m39967a(C9601a c9601a, C9612j c9612j, C9615k c9615k, Function0<C15813i> function0) {
        View a = c9601a.m39963a();
        Context context = a.getContext();
        C2668g.a(context, "context");
        return new C19458a(context, AnchorGravity.TOP).a(a).a(c9601a.m39965c()).a(new int[]{c9601a.m39966d(), c9601a.m39966d()}).b(c9601a.m39964b()).a(new C11828b(c9612j, function0)).a((OnTooltipHideTriggeredListener) new C11829c(c9615k));
    }
}
