package com.tinder.fireboarding.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.res.C0441a;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.base.p173c.C8304b;
import com.tinder.fireboarding.C9559a.C9552a;
import com.tinder.fireboarding.C9559a.C9554c;
import com.tinder.fireboarding.C9559a.C9555d;
import com.tinder.fireboarding.C9559a.C9556e;
import com.tinder.fireboarding.C9559a.C9557f;
import com.tinder.fireboarding.view.animation.C9600e;
import com.tinder.fireboarding.view.animation.C9600e.C9596a;
import com.tinder.fireboarding.view.p254a.C9570a;
import com.tinder.utils.au;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001aH\u0014J4\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0-H\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0002J*\u00104\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0-J4\u00105\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001a0-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0-H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/tinder/fireboarding/view/FireboardingViewContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundScalingView", "Lcom/tinder/fireboarding/view/BackgroundScalingView;", "getBackgroundScalingView", "()Lcom/tinder/fireboarding/view/BackgroundScalingView;", "backgroundScalingView$delegate", "Lkotlin/Lazy;", "featureIconContainer", "Landroid/widget/LinearLayout;", "getFeatureIconContainer", "()Landroid/widget/LinearLayout;", "featureIconContainer$delegate", "featureText", "Landroid/widget/TextView;", "getFeatureText", "()Landroid/widget/TextView;", "featureText$delegate", "fireboardingAnimator", "Lcom/tinder/fireboarding/view/animation/FireboardingAnimator;", "addTopMarginToFeatureIcon", "", "featureIcon", "Landroid/view/View;", "asDialog", "Lcom/tinder/fireboarding/view/dialog/FireboardingViewContainerDialog;", "createFeatureIntroAnimationParams", "Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$AnimationParams;", "startViewBounds", "Lcom/tinder/fireboarding/view/ViewBounds;", "gamepadButtonViewBounds", "createFeatureText", "Landroid/text/SpannableStringBuilder;", "featureName", "", "onDetachedFromWindow", "onViewReadyForEntranceAnimation", "params", "Lcom/tinder/fireboarding/view/FireboardingViewContainer$Params;", "onEntranceAnimationEndListener", "Lkotlin/Function0;", "onAnimationEndListener", "prepareBackgroundForScaling", "scaleIconViewToExpectedIconSize", "iconView", "expectedIconSize", "", "startEntranceAnimation", "waitForFeatureIconToBeDrawnAndStartAnimation", "onEntranceAnimationEnd", "Params", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public final class FireboardingViewContainer extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31987a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FireboardingViewContainer.class), "backgroundScalingView", "getBackgroundScalingView()Lcom/tinder/fireboarding/view/BackgroundScalingView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FireboardingViewContainer.class), "featureText", "getFeatureText()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FireboardingViewContainer.class), "featureIconContainer", "getFeatureIconContainer()Landroid/widget/LinearLayout;"))};
    /* renamed from: b */
    private final Lazy f31988b;
    /* renamed from: c */
    private final Lazy f31989c;
    /* renamed from: d */
    private final Lazy f31990d;
    /* renamed from: e */
    private final C9600e f31991e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006%"}, d2 = {"Lcom/tinder/fireboarding/view/FireboardingViewContainer$Params;", "", "startViewBounds", "Lcom/tinder/fireboarding/view/ViewBounds;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "featureName", "", "iconSize", "", "iconView", "Landroid/view/View;", "gamepadButtonViewBounds", "(Lcom/tinder/fireboarding/view/ViewBounds;Landroid/graphics/drawable/GradientDrawable;Ljava/lang/String;ILandroid/view/View;Lcom/tinder/fireboarding/view/ViewBounds;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "getFeatureName", "()Ljava/lang/String;", "getGamepadButtonViewBounds", "()Lcom/tinder/fireboarding/view/ViewBounds;", "getIconSize", "()I", "getIconView", "()Landroid/view/View;", "getStartViewBounds", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.FireboardingViewContainer$a */
    public static final class C9568a {
        @NotNull
        /* renamed from: a */
        private final C9571a f31975a;
        @NotNull
        /* renamed from: b */
        private final GradientDrawable f31976b;
        @NotNull
        /* renamed from: c */
        private final String f31977c;
        /* renamed from: d */
        private final int f31978d;
        @NotNull
        /* renamed from: e */
        private final View f31979e;
        @NotNull
        /* renamed from: f */
        private final C9571a f31980f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9568a) {
                C9568a c9568a = (C9568a) obj;
                if (C2668g.a(this.f31975a, c9568a.f31975a) && C2668g.a(this.f31976b, c9568a.f31976b) && C2668g.a(this.f31977c, c9568a.f31977c)) {
                    return (this.f31978d == c9568a.f31978d ? 1 : null) != null && C2668g.a(this.f31979e, c9568a.f31979e) && C2668g.a(this.f31980f, c9568a.f31980f);
                }
            }
        }

        public int hashCode() {
            C9571a c9571a = this.f31975a;
            int i = 0;
            int hashCode = (c9571a != null ? c9571a.hashCode() : 0) * 31;
            GradientDrawable gradientDrawable = this.f31976b;
            hashCode = (hashCode + (gradientDrawable != null ? gradientDrawable.hashCode() : 0)) * 31;
            String str = this.f31977c;
            hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f31978d) * 31;
            View view = this.f31979e;
            hashCode = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
            C9571a c9571a2 = this.f31980f;
            if (c9571a2 != null) {
                i = c9571a2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Params(startViewBounds=");
            stringBuilder.append(this.f31975a);
            stringBuilder.append(", backgroundDrawable=");
            stringBuilder.append(this.f31976b);
            stringBuilder.append(", featureName=");
            stringBuilder.append(this.f31977c);
            stringBuilder.append(", iconSize=");
            stringBuilder.append(this.f31978d);
            stringBuilder.append(", iconView=");
            stringBuilder.append(this.f31979e);
            stringBuilder.append(", gamepadButtonViewBounds=");
            stringBuilder.append(this.f31980f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9568a(@NotNull C9571a c9571a, @NotNull GradientDrawable gradientDrawable, @NotNull String str, int i, @NotNull View view, @NotNull C9571a c9571a2) {
            C2668g.b(c9571a, "startViewBounds");
            C2668g.b(gradientDrawable, "backgroundDrawable");
            C2668g.b(str, "featureName");
            C2668g.b(view, "iconView");
            C2668g.b(c9571a2, "gamepadButtonViewBounds");
            this.f31975a = c9571a;
            this.f31976b = gradientDrawable;
            this.f31977c = str;
            this.f31978d = i;
            this.f31979e = view;
            this.f31980f = c9571a2;
        }

        @NotNull
        /* renamed from: a */
        public final C9571a m39876a() {
            return this.f31975a;
        }

        @NotNull
        /* renamed from: b */
        public final GradientDrawable m39877b() {
            return this.f31976b;
        }

        @NotNull
        /* renamed from: c */
        public final String m39878c() {
            return this.f31977c;
        }

        /* renamed from: d */
        public final int m39879d() {
            return this.f31978d;
        }

        @NotNull
        /* renamed from: e */
        public final View m39880e() {
            return this.f31979e;
        }

        @NotNull
        /* renamed from: f */
        public final C9571a m39881f() {
            return this.f31980f;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/base/extension/ViewExtKt$doWhenViewHasSize$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.FireboardingViewContainer$b */
    public static final class C9569b implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ View f31981a;
        /* renamed from: b */
        final /* synthetic */ FireboardingViewContainer f31982b;
        /* renamed from: c */
        final /* synthetic */ C9568a f31983c;
        /* renamed from: d */
        final /* synthetic */ View f31984d;
        /* renamed from: e */
        final /* synthetic */ Function0 f31985e;
        /* renamed from: f */
        final /* synthetic */ Function0 f31986f;

        public C9569b(View view, FireboardingViewContainer fireboardingViewContainer, C9568a c9568a, View view2, Function0 function0, Function0 function02) {
            this.f31981a = view;
            this.f31982b = fireboardingViewContainer;
            this.f31983c = c9568a;
            this.f31984d = view2;
            this.f31985e = function0;
            this.f31986f = function02;
        }

        public boolean onPreDraw() {
            if (!C8304b.m35397b(this.f31981a)) {
                return true;
            }
            this.f31981a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f31982b.m39885a(this.f31981a, this.f31983c.m39879d());
            this.f31982b.m39890b(this.f31983c, this.f31984d, this.f31985e, this.f31986f);
            return false;
        }
    }

    private final BackgroundScalingView getBackgroundScalingView() {
        Lazy lazy = this.f31988b;
        KProperty kProperty = f31987a[0];
        return (BackgroundScalingView) lazy.getValue();
    }

    private final LinearLayout getFeatureIconContainer() {
        Lazy lazy = this.f31990d;
        KProperty kProperty = f31987a[2];
        return (LinearLayout) lazy.getValue();
    }

    private final TextView getFeatureText() {
        Lazy lazy = this.f31989c;
        KProperty kProperty = f31987a[1];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ FireboardingViewContainer(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FireboardingViewContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31988b = C18451c.a(LazyThreadSafetyMode.NONE, new FireboardingViewContainer$$special$$inlined$bindView$1(this, C9555d.background_scaling_view));
        this.f31989c = C18451c.a(LazyThreadSafetyMode.NONE, new FireboardingViewContainer$$special$$inlined$bindView$2(this, C9555d.feature_text));
        this.f31990d = C18451c.a(LazyThreadSafetyMode.NONE, new FireboardingViewContainer$$special$$inlined$bindView$3(this, C9555d.feature_icon_container));
        this.f31991e = new C9600e();
        FrameLayout.inflate(context, C9556e.view_fireboarding_container, this);
        setClipChildren(null);
    }

    protected void onDetachedFromWindow() {
        this.f31991e.m39961a();
        super.onDetachedFromWindow();
    }

    @NotNull
    /* renamed from: a */
    public final C9570a m39891a() {
        Context context = getContext();
        C2668g.a(context, "context");
        return new C9570a(context, this);
    }

    /* renamed from: a */
    public final void m39892a(@NotNull C9568a c9568a, @NotNull Function0<C15813i> function0, @NotNull Function0<C15813i> function02) {
        C2668g.b(c9568a, "params");
        C2668g.b(function0, "onEntranceAnimationEndListener");
        C2668g.b(function02, "onAnimationEndListener");
        getFeatureText().setText(m39882a(c9568a.m39878c()));
        View e = c9568a.m39880e();
        getFeatureIconContainer().addView(e);
        m39884a(e);
        m39887a(c9568a, e, function0, function02);
    }

    /* renamed from: b */
    private final void m39890b(C9568a c9568a, View view, Function0<C15813i> function0, Function0<C15813i> function02) {
        m39886a(c9568a);
        this.f31991e.m39962a(getBackgroundScalingView(), view, getFeatureText(), m39883a(c9568a.m39876a(), c9568a.m39881f()), function0, function02);
    }

    /* renamed from: a */
    private final void m39886a(C9568a c9568a) {
        getBackgroundScalingView().setRoundedCornerDrawable(c9568a.m39877b());
        getBackgroundScalingView().setVisibility(0);
    }

    /* renamed from: a */
    private final C9596a m39883a(C9571a c9571a, C9571a c9571a2) {
        return new C9596a(c9571a, C9617b.m40012a((View) this), c9571a2);
    }

    /* renamed from: a */
    private final SpannableStringBuilder m39882a(String str) {
        CharSequence a = au.a(this, C9557f.fireboarding_you_have_unlocked, new String[]{str});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        int a2 = C19303i.a(a, str, 0, false, 6, null);
        str = str.length() + a2;
        Typeface a3 = C0441a.a(getContext(), C9554c.proximanova_extrabold);
        if (a3 != null) {
            C2668g.a(a3, "it");
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("", a3), a2, str, 18);
        }
        spannableStringBuilder.setSpan(new RelativeSizeSpan(2.25f), a2, str, 0);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private final void m39884a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + ((int) au.a(this, C9552a.space_xxl)), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    private final void m39885a(View view, int i) {
        float width = ((float) view.getWidth()) / ((float) 2);
        view.setPivotX(width);
        view.setPivotY(width);
        i = ((float) i) / ((float) view.getWidth());
        view.setScaleX(i);
        view.setScaleY(i);
    }

    /* renamed from: a */
    private final void m39887a(C9568a c9568a, View view, Function0<C15813i> function0, Function0<C15813i> function02) {
        if (C8304b.m35397b(view)) {
            m39885a(view, c9568a.m39879d());
            m39890b(c9568a, view, function0, function02);
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new C9569b(view, this, c9568a, view, function0, function02));
    }
}
