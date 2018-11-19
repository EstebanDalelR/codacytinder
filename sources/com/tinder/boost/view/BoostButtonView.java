package com.tinder.boost.view;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.boost.dialog.BoostUpdateDialog;
import com.tinder.boost.presenter.C8346a;
import com.tinder.boost.provider.BoostUpdateProvider$a;
import com.tinder.boost.provider.C10443i;
import com.tinder.boost.target.BoostButtonTarget;
import com.tinder.boost.view.BoostEmitterView.C8351b;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.recs.view.BoostButton;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.Tooltip.C19463a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002uvB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020<H\u0016J\b\u0010J\u001a\u00020EH\u0016J\b\u0010K\u001a\u00020EH\u0016J\u0006\u0010L\u001a\u00020\u0010J\b\u0010M\u001a\u00020EH\u0002J\u0010\u0010N\u001a\u00020E2\u0006\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020EH\u0014J\b\u0010R\u001a\u00020EH\u0014J\b\u0010S\u001a\u00020EH\u0014J0\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u00162\u0006\u0010X\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\u0016H\u0014J\b\u0010Z\u001a\u00020EH\u0007J\b\u0010[\u001a\u00020EH\u0007J\b\u0010\\\u001a\u00020EH\u0016J\b\u0010]\u001a\u00020EH\u0002J\u000e\u0010^\u001a\u00020E2\u0006\u0010_\u001a\u00020`J\u0012\u0010a\u001a\u00020E2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0010\u0010d\u001a\u00020E2\u0006\u0010e\u001a\u00020\"H\u0016J\u0010\u0010f\u001a\u00020E2\u0006\u0010g\u001a\u00020hH\u0016J\b\u0010i\u001a\u00020EH\u0016J\u0016\u0010j\u001a\u00020E2\f\u0010k\u001a\b\u0018\u00010lR\u00020mH\u0016J\b\u0010n\u001a\u00020EH\u0016J\b\u0010o\u001a\u00020EH\u0016J\u0010\u0010p\u001a\u00020E2\u0006\u0010q\u001a\u00020\"H\u0002J\u0006\u0010r\u001a\u00020EJ\b\u0010s\u001a\u00020EH\u0007J\u0006\u0010t\u001a\u00020ER\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020\"8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@¨\u0006w"}, d2 = {"Lcom/tinder/boost/view/BoostButtonView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/boost/target/BoostButtonTarget;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "anchorContainer", "Landroid/view/ViewGroup;", "getAnchorContainer", "()Landroid/view/ViewGroup;", "setAnchorContainer", "(Landroid/view/ViewGroup;)V", "boostButton", "Lcom/tinder/recs/view/BoostButton;", "getBoostButton$Tinder_release", "()Lcom/tinder/recs/view/BoostButton;", "setBoostButton$Tinder_release", "(Lcom/tinder/recs/view/BoostButton;)V", "boostEmitterGamepadYDelta", "", "boostEmitterView", "Lcom/tinder/boost/view/BoostEmitterView;", "boostEmitterViewXoffset", "getBoostEmitterViewXoffset", "()I", "setBoostEmitterViewXoffset", "(I)V", "boostEndGradientColor", "boostGamepadOffsetY", "boostStartGradientColor", "boostStartTooltipMessage", "", "getBoostStartTooltipMessage$Tinder_release", "()Ljava/lang/String;", "setBoostStartTooltipMessage$Tinder_release", "(Ljava/lang/String;)V", "boostUpdateDialog", "Lcom/tinder/boost/dialog/BoostUpdateDialog;", "boostYourProfileMessage", "getBoostYourProfileMessage$Tinder_release", "setBoostYourProfileMessage$Tinder_release", "contentContainer", "getContentContainer", "setContentContainer", "onEmitterAttachedListener", "Lcom/tinder/boost/view/BoostButtonView$OnEmitterAttached;", "getOnEmitterAttachedListener", "()Lcom/tinder/boost/view/BoostButtonView$OnEmitterAttached;", "setOnEmitterAttachedListener", "(Lcom/tinder/boost/view/BoostButtonView$OnEmitterAttached;)V", "presenter", "Lcom/tinder/boost/presenter/BoostButtonPresenter;", "getPresenter", "()Lcom/tinder/boost/presenter/BoostButtonPresenter;", "setPresenter", "(Lcom/tinder/boost/presenter/BoostButtonPresenter;)V", "showBoostEmptyLoadTooltip", "", "getShowBoostEmptyLoadTooltip", "()Z", "setShowBoostEmptyLoadTooltip", "(Z)V", "showBoostStartTooltip", "getShowBoostStartTooltip", "setShowBoostStartTooltip", "attachBoostEmitterView", "", "durationRemaining", "", "enableBoostButton", "isEnabled", "fadeMultiplierIn", "fadeMultiplierOut", "getBoostButton", "initializeLifecyclObserver", "launchBoostPaywall", "paywallFlow", "Lcom/tinder/paywall/paywallflow/PaywallFlow;", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "onLayout", "changed", "left", "top", "right", "bottom", "onPause", "onResume", "removeBoostEmitterView", "removeLifecycleObserver", "setAnalyticsSource", "source", "Lcom/tinder/boost/view/BoostButtonView$AnalyticsSource;", "setOnClickListener", "listener", "Landroid/view/View$OnClickListener;", "showBoostMultiplierValue", "multiplier", "showBoostPercentFilled", "percent", "", "showBoostStartToolTip", "showBoostUpdateDialog", "currentBoostTick", "Lcom/tinder/boost/provider/BoostUpdateProvider$BoostTick;", "Lcom/tinder/boost/provider/BoostUpdateProvider;", "showBoostYourProfileToolTip", "showEmptyGauge", "showTooltip", "message", "startAnimatingHearts", "startBoost", "stopAnimatingHearts", "AnalyticsSource", "OnEmitterAttached", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class BoostButtonView extends FrameLayout implements LifecycleObserver, BoostButtonTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C8346a f12229a;
    @Nullable
    /* renamed from: b */
    private ViewGroup f12230b;
    @NotNull
    @BindView(2131361946)
    public BoostButton boostButton;
    @BindDimen(2131165298)
    @JvmField
    public int boostEmitterGamepadYDelta;
    @BindColor(2131099699)
    @JvmField
    public int boostEndGradientColor;
    @BindDimen(2131165299)
    @JvmField
    public int boostGamepadOffsetY;
    @BindColor(2131099700)
    @JvmField
    public int boostStartGradientColor;
    @BindString(2131820675)
    @NotNull
    public String boostStartTooltipMessage;
    @BindString(2131820684)
    @NotNull
    public String boostYourProfileMessage;
    @Nullable
    /* renamed from: c */
    private ViewGroup f12231c;
    /* renamed from: d */
    private int f12232d;
    /* renamed from: e */
    private boolean f12233e = true;
    /* renamed from: f */
    private boolean f12234f;
    @Nullable
    /* renamed from: g */
    private BoostButtonView$OnEmitterAttached f12235g;
    /* renamed from: h */
    private BoostUpdateDialog f12236h;
    /* renamed from: i */
    private BoostEmitterView f12237i;

    public BoostButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.m10309b(context, "context");
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.view_boost_button, this);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).m14877h().inject(this);
    }

    @NotNull
    public final BoostButton getBoostButton$Tinder_release() {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        return boostButton;
    }

    public final void setBoostButton$Tinder_release(@NotNull BoostButton boostButton) {
        C2668g.m10309b(boostButton, "<set-?>");
        this.boostButton = boostButton;
    }

    @NotNull
    public final String getBoostStartTooltipMessage$Tinder_release() {
        String str = this.boostStartTooltipMessage;
        if (str == null) {
            C2668g.m10310b("boostStartTooltipMessage");
        }
        return str;
    }

    public final void setBoostStartTooltipMessage$Tinder_release(@NotNull String str) {
        C2668g.m10309b(str, "<set-?>");
        this.boostStartTooltipMessage = str;
    }

    @NotNull
    public final String getBoostYourProfileMessage$Tinder_release() {
        String str = this.boostYourProfileMessage;
        if (str == null) {
            C2668g.m10310b("boostYourProfileMessage");
        }
        return str;
    }

    public final void setBoostYourProfileMessage$Tinder_release(@NotNull String str) {
        C2668g.m10309b(str, "<set-?>");
        this.boostYourProfileMessage = str;
    }

    @NotNull
    public final C8346a getPresenter() {
        C8346a c8346a = this.f12229a;
        if (c8346a == null) {
            C2668g.m10310b("presenter");
        }
        return c8346a;
    }

    public final void setPresenter(@NotNull C8346a c8346a) {
        C2668g.m10309b(c8346a, "<set-?>");
        this.f12229a = c8346a;
    }

    @Nullable
    public final ViewGroup getContentContainer() {
        return this.f12230b;
    }

    public final void setContentContainer(@Nullable ViewGroup viewGroup) {
        this.f12230b = viewGroup;
    }

    @Nullable
    public final ViewGroup getAnchorContainer() {
        return this.f12231c;
    }

    public final void setAnchorContainer(@Nullable ViewGroup viewGroup) {
        this.f12231c = viewGroup;
    }

    public final int getBoostEmitterViewXoffset() {
        return this.f12232d;
    }

    public final void setBoostEmitterViewXoffset(int i) {
        this.f12232d = i;
    }

    public final boolean getShowBoostStartTooltip() {
        return this.f12233e;
    }

    public final void setShowBoostStartTooltip(boolean z) {
        this.f12233e = z;
    }

    public final boolean getShowBoostEmptyLoadTooltip() {
        return this.f12234f;
    }

    public final void setShowBoostEmptyLoadTooltip(boolean z) {
        this.f12234f = z;
    }

    @Nullable
    public final BoostButtonView$OnEmitterAttached getOnEmitterAttachedListener() {
        return this.f12235g;
    }

    public final void setOnEmitterAttachedListener(@Nullable BoostButtonView$OnEmitterAttached boostButtonView$OnEmitterAttached) {
        this.f12235g = boostButtonView$OnEmitterAttached;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.m2675a((View) this);
        setClipChildren(false);
        setClipToPadding(false);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z = this.f12229a;
        if (!z) {
            C2668g.m10310b("presenter");
        }
        z.a(this.f12234f);
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.setOnClickListener(onClickListener);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m14734c();
        C8346a c8346a = this.f12229a;
        if (c8346a == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c8346a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m14735d();
        Deadshot.drop(this);
    }

    @NotNull
    public final BoostButton getBoostButton() {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        return boostButton;
    }

    public final void setAnalyticsSource(@NotNull BoostButtonView$AnalyticsSource boostButtonView$AnalyticsSource) {
        C2668g.m10309b(boostButtonView$AnalyticsSource, "source");
        C8346a c8346a = this.f12229a;
        if (c8346a == null) {
            C2668g.m10310b("presenter");
        }
        c8346a.a(boostButtonView$AnalyticsSource);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        C8346a c8346a = this.f12229a;
        if (c8346a == null) {
            C2668g.m10310b("presenter");
        }
        Deadshot.take(this, c8346a);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        Deadshot.drop(this);
    }

    @OnClick({2131361946})
    public final void startBoost() {
        C8346a c8346a = this.f12229a;
        if (c8346a == null) {
            C2668g.m10310b("presenter");
        }
        c8346a.d();
    }

    public void enableBoostButton(boolean z) {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.setEnabled(z);
    }

    public void showBoostUpdateDialog(@Nullable BoostUpdateProvider$a boostUpdateProvider$a) {
        BoostUpdateDialog boostUpdateDialog = this.f12236h;
        if (boostUpdateDialog == null || !boostUpdateDialog.isShowing()) {
            this.f12236h = new BoostUpdateDialog(getContext());
            boostUpdateDialog = this.f12236h;
            if (boostUpdateDialog != null) {
                boostUpdateDialog.a(boostUpdateProvider$a);
            }
            boostUpdateProvider$a = this.f12236h;
            if (boostUpdateProvider$a != null) {
                boostUpdateProvider$a.show();
            }
        }
    }

    public void showBoostStartToolTip() {
        if (this.f12233e) {
            String str = this.boostStartTooltipMessage;
            if (str == null) {
                C2668g.m10310b("boostStartTooltipMessage");
            }
            m14733a(str);
        }
    }

    public void showBoostYourProfileToolTip() {
        String str = this.boostYourProfileMessage;
        if (str == null) {
            C2668g.m10310b("boostYourProfileMessage");
        }
        m14733a(str);
    }

    public void fadeMultiplierIn() {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.fadeInMultiplier();
    }

    public void fadeMultiplierOut() {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.fadeOutMultipler();
    }

    public void showEmptyGauge() {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.showEmptyGauge();
    }

    public void removeBoostEmitterView() {
        if (this.f12237i != null) {
            BoostEmitterView boostEmitterView = this.f12237i;
            if (boostEmitterView != null) {
                boostEmitterView.b();
            }
            ViewGroup viewGroup = this.f12230b;
            if (viewGroup != null) {
                viewGroup.removeView(this.f12237i);
            }
            this.f12237i = (BoostEmitterView) null;
        }
    }

    public void showBoostPercentFilled(float f) {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.showPercentFilled(f);
    }

    public void showBoostMultiplierValue(@NotNull String str) {
        C2668g.m10309b(str, "multiplier");
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.showMultiplierValue(str);
    }

    /* renamed from: a */
    public final void m14736a() {
        BoostEmitterView boostEmitterView = this.f12237i;
        if (boostEmitterView != null) {
            boostEmitterView.b();
        }
    }

    /* renamed from: b */
    public final void m14737b() {
        BoostEmitterView boostEmitterView = this.f12237i;
        if (boostEmitterView != null) {
            boostEmitterView.a();
        }
    }

    public void attachBoostEmitterView(long j) {
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        if (boostButton.getWidth() > 0) {
            boostButton = this.boostButton;
            if (boostButton == null) {
                C2668g.m10310b("boostButton");
            }
            if (boostButton.getHeight() > 0) {
                if (this.f12230b == null) {
                    C0001a.m25b("Attempting to start emitting hearts but contentContainer is null", new Object[0]);
                    return;
                }
                BoostEmitterView boostEmitterView = this.f12237i;
                if (boostEmitterView == null || !boostEmitterView.c()) {
                    removeBoostEmitterView();
                    if (this.f12231c == null) {
                        this.f12231c = this;
                    }
                    ViewGroup viewGroup = this.f12230b;
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                    }
                    viewGroup = this.f12231c;
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                    }
                    j = new C8351b().a(this.f12230b).a(j);
                    ViewGroup viewGroup2 = this.f12231c;
                    this.f12237i = j.a((int) ((viewGroup2 != null ? viewGroup2.getY() : getY()) - ((float) this.boostEmitterGamepadYDelta))).b(this.boostGamepadOffsetY).c(this.f12232d).a(new C10443i()).a(this.f12231c);
                    j = this.f12235g;
                    if (j != null) {
                        j.onAttached();
                    }
                    return;
                }
                return;
            }
        }
        boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        boostButton.getViewTreeObserver().addOnGlobalLayoutListener(new BoostButtonView$a(this, j));
    }

    public void launchBoostPaywall(@NotNull C10076o c10076o) {
        C2668g.m10309b(c10076o, "paywallFlow");
        c10076o.a(getContext());
    }

    /* renamed from: a */
    private final void m14733a(String str) {
        int[] iArr = new int[]{this.boostEndGradientColor, this.boostStartGradientColor};
        Object context = getContext();
        C2668g.m10305a(context, "context");
        BoostButton boostButton = this.boostButton;
        if (boostButton == null) {
            C2668g.m10310b("boostButton");
        }
        new C19463a(context, boostButton).a(AnchorGravity.TOP).a(str).a(true).a(iArr).a(-1).a(4000).a().show();
    }

    /* renamed from: c */
    private final void m14734c() {
        if (getContext() instanceof AppCompatActivity) {
            Context context = getContext();
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
            }
            ((AppCompatActivity) context).getLifecycle().mo36a(this);
        }
    }

    /* renamed from: d */
    private final void m14735d() {
        if (getContext() instanceof AppCompatActivity) {
            Context context = getContext();
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
            }
            ((AppCompatActivity) context).getLifecycle().mo37b(this);
        }
    }
}
