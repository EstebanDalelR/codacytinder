package com.tinder.toppicks.dialog;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.C6149a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.paywall.viewmodels.C10085h;
import com.tinder.paywall.views.PaywallItemGroupView;
import com.tinder.profile.p365d.C14398a;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.toppicks.C15224a;
import com.tinder.toppicks.FadeAnimation;
import com.tinder.toppicks.SettingsLauncher;
import com.tinder.toppicks.SettingsLauncher.Source;
import com.tinder.toppicks.TopPicksComponentProvider;
import com.tinder.toppicks.TopPicksPaywallViewModel;
import com.tinder.toppicks.TopPicksPaywallViewModel.BylineType;
import com.tinder.toppicks.TopPicksPaywallViewModel.ViewType;
import com.tinder.toppicks.TopPicksPaywallViewTarget;
import com.tinder.toppicks.presenter.C17090j;
import com.tinder.utils.C15365p;
import com.tinder.utils.au;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020\u0012H\u0016J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u0010\u0010H\u001a\u00020\u00122\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u00020\u0012H\u0014J\b\u0010L\u001a\u00020\u0012H\u0014J\u0012\u0010M\u001a\u00020\u00122\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020RH\u0016J\u0010\u0010S\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010T\u001a\u00020\u0012H\u0016J\b\u0010U\u001a\u00020\u0012H\u0002J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020R2\u0006\u0010I\u001a\u00020JH\u0002J \u0010X\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020R2\u0006\u0010\\\u001a\u00020GH\u0002J\u001a\u0010]\u001a\u00020\u00122\u0006\u0010I\u001a\u00020J2\b\u0010^\u001a\u0004\u0018\u00010_H\u0002J\u0010\u0010`\u001a\u00020\u00122\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010a\u001a\u00020\u0012H\u0002J\u0012\u0010b\u001a\u00020\u00122\b\u0010c\u001a\u0004\u0018\u00010dH\u0002J3\u0010e\u001a\u00020\u00122\u0006\u0010f\u001a\u00020G2!\u0010g\u001a\u001d\u0012\u0013\u0012\u00110d¢\u0006\f\bi\u0012\b\bj\u0012\u0004\b\b(k\u0012\u0004\u0012\u00020\u00120hH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0002028\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X.¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Lcom/tinder/toppicks/dialog/TopPicksPaywallView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/toppicks/TopPicksPaywallViewTarget;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionButton", "Lcom/tinder/gold/TinderGoldButtonView;", "bylineView", "Landroid/widget/TextView;", "centerImageView", "Landroid/widget/ImageView;", "countDownTimer", "Landroid/os/CountDownTimer;", "dismissCallback", "Lkotlin/Function0;", "", "getDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "paywallFlowFailureListener", "Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;", "getPaywallFlowFailureListener", "()Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;", "setPaywallFlowFailureListener", "(Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;)V", "paywallFlowSuccessListener", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "getPaywallFlowSuccessListener", "()Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "setPaywallFlowSuccessListener", "(Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;)V", "paywallItemsGroupView", "Lcom/tinder/paywall/views/PaywallItemGroupView;", "paywallListener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "getPaywallListener", "()Lcom/tinder/paywall/legacy/ListenerPaywall;", "setPaywallListener", "(Lcom/tinder/paywall/legacy/ListenerPaywall;)V", "presenter", "Lcom/tinder/toppicks/presenter/TopPicksPaywallPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/toppicks/presenter/TopPicksPaywallPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/toppicks/presenter/TopPicksPaywallPresenter;)V", "settingsLauncher", "Lcom/tinder/toppicks/SettingsLauncher;", "getSettingsLauncher", "()Lcom/tinder/toppicks/SettingsLauncher;", "setSettingsLauncher", "(Lcom/tinder/toppicks/SettingsLauncher;)V", "source", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "getSource", "()Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "setSource", "(Lcom/tinder/paywall/legacy/TopPicksPaywallSource;)V", "titleView", "bind", "viewModel", "Lcom/tinder/toppicks/TopPicksPaywallViewModel;", "dismissPaywall", "fadeContents", "Landroid/animation/Animator;", "fade", "Lcom/tinder/toppicks/FadeAnimation;", "duration", "", "handleActionClick", "viewType", "Lcom/tinder/toppicks/TopPicksPaywallViewModel$ViewType;", "onAttachedToWindow", "onDetachedFromWindow", "onPaywallItemInFocusTap", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "onPurchaseFailure", "messageRes", "", "onPurchaseFailureNonFatal", "onPurchaseSuccess", "openDiscoverySettings", "setupActionButton", "buttonText", "setupByline", "bylineType", "Lcom/tinder/toppicks/TopPicksPaywallViewModel$BylineType;", "bylineText", "countdownTime", "setupContentView", "groupViewModel", "Lcom/tinder/paywall/viewmodels/PaywallItemGroupViewModel;", "showEmptyState", "showEmptyView", "startPurchase", "productId", "", "startTimer", "millisToCountdown", "timerUpdater", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "formattedDate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksPaywallView extends LinearLayout implements TopPicksPaywallViewTarget {
    @NotNull
    /* renamed from: a */
    public TopPicksPaywallSource f52402a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C17090j f52403b;
    @Inject
    @NotNull
    /* renamed from: c */
    public SettingsLauncher f52404c;
    /* renamed from: d */
    private CountDownTimer f52405d;
    @Nullable
    /* renamed from: e */
    private PaywallFlowSuccessListener f52406e;
    @Nullable
    /* renamed from: f */
    private PaywallFlowFailureListener f52407f;
    @Nullable
    /* renamed from: g */
    private ListenerPaywall f52408g;
    @Nullable
    /* renamed from: h */
    private Function0<C15813i> f52409h;
    /* renamed from: i */
    private final TextView f52410i;
    /* renamed from: j */
    private final TextView f52411j;
    /* renamed from: k */
    private final PaywallItemGroupView f52412k;
    /* renamed from: l */
    private final ImageView f52413l;
    /* renamed from: m */
    private final TinderGoldButtonView f52414m;

    public /* synthetic */ TopPicksPaywallView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TopPicksPaywallView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        LinearLayout.inflate(context, R.layout.top_picks_alc_paywall, this);
        setOrientation(1);
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.TopPicksComponentProvider");
        }
        ((TopPicksComponentProvider) context).provideTopPicksComponent().inject(this);
        context = findViewById(R.id.paywall_title);
        C2668g.a(context, "findViewById(R.id.paywall_title)");
        this.f52410i = (TextView) context;
        context = findViewById(R.id.paywall_byline);
        C2668g.a(context, "findViewById(R.id.paywall_byline)");
        this.f52411j = (TextView) context;
        context = findViewById(R.id.paywall_items);
        C2668g.a(context, "findViewById(R.id.paywall_items)");
        this.f52412k = (PaywallItemGroupView) context;
        context = findViewById(R.id.paywall_continue_button);
        C2668g.a(context, "findViewById(R.id.paywall_continue_button)");
        this.f52414m = (TinderGoldButtonView) context;
        context = findViewById(R.id.center_image_view);
        C2668g.a(context, "findViewById(R.id.center_image_view)");
        this.f52413l = (ImageView) context;
    }

    @Nullable
    public final PaywallFlowSuccessListener getPaywallFlowSuccessListener() {
        return this.f52406e;
    }

    public final void setPaywallFlowSuccessListener(@Nullable PaywallFlowSuccessListener paywallFlowSuccessListener) {
        this.f52406e = paywallFlowSuccessListener;
    }

    @Nullable
    public final PaywallFlowFailureListener getPaywallFlowFailureListener() {
        return this.f52407f;
    }

    public final void setPaywallFlowFailureListener(@Nullable PaywallFlowFailureListener paywallFlowFailureListener) {
        this.f52407f = paywallFlowFailureListener;
    }

    @Nullable
    public final ListenerPaywall getPaywallListener() {
        return this.f52408g;
    }

    public final void setPaywallListener(@Nullable ListenerPaywall listenerPaywall) {
        this.f52408g = listenerPaywall;
    }

    @Nullable
    public final Function0<C15813i> getDismissCallback() {
        return this.f52409h;
    }

    public final void setDismissCallback(@Nullable Function0<C15813i> function0) {
        this.f52409h = function0;
    }

    @NotNull
    public final TopPicksPaywallSource getSource() {
        TopPicksPaywallSource topPicksPaywallSource = this.f52402a;
        if (topPicksPaywallSource == null) {
            C2668g.b("source");
        }
        return topPicksPaywallSource;
    }

    public final void setSource(@NotNull TopPicksPaywallSource topPicksPaywallSource) {
        C2668g.b(topPicksPaywallSource, "<set-?>");
        this.f52402a = topPicksPaywallSource;
    }

    @NotNull
    public final C17090j getPresenter$Tinder_release() {
        C17090j c17090j = this.f52403b;
        if (c17090j == null) {
            C2668g.b("presenter");
        }
        return c17090j;
    }

    public final void setPresenter$Tinder_release(@NotNull C17090j c17090j) {
        C2668g.b(c17090j, "<set-?>");
        this.f52403b = c17090j;
    }

    @NotNull
    public final SettingsLauncher getSettingsLauncher() {
        SettingsLauncher settingsLauncher = this.f52404c;
        if (settingsLauncher == null) {
            C2668g.b("settingsLauncher");
        }
        return settingsLauncher;
    }

    public final void setSettingsLauncher(@NotNull SettingsLauncher settingsLauncher) {
        C2668g.b(settingsLauncher, "<set-?>");
        this.f52404c = settingsLauncher;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17090j c17090j = this.f52403b;
        if (c17090j == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c17090j);
        c17090j = this.f52403b;
        if (c17090j == null) {
            C2668g.b("presenter");
        }
        TopPicksPaywallSource topPicksPaywallSource = this.f52402a;
        if (topPicksPaywallSource == null) {
            C2668g.b("source");
        }
        c17090j.m62967a(topPicksPaywallSource, this.f52408g);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        CountDownTimer countDownTimer = this.f52405d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f52414m.a();
    }

    public void bind(@NotNull TopPicksPaywallViewModel topPicksPaywallViewModel) {
        C2668g.b(topPicksPaywallViewModel, "viewModel");
        CountDownTimer countDownTimer = this.f52405d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f52410i.setText(au.m57649a((View) this, topPicksPaywallViewModel.m57280a(), new String[0]));
        m62766a(topPicksPaywallViewModel.m57282c(), topPicksPaywallViewModel.m57281b(), topPicksPaywallViewModel.m57286g());
        m62768a(topPicksPaywallViewModel.m57284e(), topPicksPaywallViewModel.m57285f());
        m62764a(topPicksPaywallViewModel.m57283d(), topPicksPaywallViewModel.m57284e());
    }

    /* renamed from: a */
    private final void m62766a(BylineType bylineType, int i, long j) {
        if (bylineType == BylineType.TIMER) {
            m62765a(j, (Function1) new TopPicksPaywallView$setupByline$1(this, i));
        } else {
            this.f52411j.setText(au.m57649a((View) this, i, new String[0]));
        }
    }

    /* renamed from: a */
    private final void m62764a(int i, ViewType viewType) {
        this.f52414m.setButtonText(i);
        this.f52414m.setButtonAction(new TopPicksPaywallView$setupActionButton$1(this, viewType));
    }

    /* renamed from: a */
    private final void m62768a(ViewType viewType, C10085h c10085h) {
        switch (C15251b.f47353a[viewType.ordinal()]) {
            case 1:
                if (c10085h != null) {
                    this.f52412k.setViewModel(c10085h);
                    return;
                } else {
                    dismissPaywall();
                    return;
                }
            case 2:
                m62771b();
                return;
            default:
                return;
        }
    }

    public void showEmptyState(@NotNull TopPicksPaywallViewModel topPicksPaywallViewModel) {
        C2668g.b(topPicksPaywallViewModel, "viewModel");
        m62765a(topPicksPaywallViewModel.m57286g(), (Function1) new TopPicksPaywallView$showEmptyState$1(this));
        m62771b();
        topPicksPaywallViewModel = this.f52413l.getLayoutParams();
        if (topPicksPaywallViewModel == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LayoutParams layoutParams = (LayoutParams) topPicksPaywallViewModel;
        layoutParams.topMargin = this.f52414m.getHeight() / 2;
        layoutParams.bottomMargin = this.f52414m.getHeight();
        this.f52413l.setLayoutParams(layoutParams);
        this.f52414m.setVisibility(8);
        this.f52410i.setText(R.string.top_picks_alc_paywall_tps_not_available_title);
    }

    public void onPaywallItemInFocusTap(@Nullable C14510e c14510e) {
        if (c14510e != null) {
            m62770a(c14510e.mo11839a());
        }
    }

    public void onPurchaseSuccess() {
        PaywallFlowSuccessListener paywallFlowSuccessListener = this.f52406e;
        if (paywallFlowSuccessListener != null) {
            paywallFlowSuccessListener.handleSuccess();
        }
        dismissPaywall();
    }

    public void onPurchaseFailure(int i) {
        PaywallFlowFailureListener paywallFlowFailureListener = this.f52407f;
        if (paywallFlowFailureListener != null) {
            paywallFlowFailureListener.handleFailure();
        }
        dismissPaywall();
        Toast.makeText(getContext(), i, 1).show();
    }

    public void onPurchaseFailureNonFatal(int i) {
        Toast.makeText(getContext(), i, 1).show();
    }

    public void dismissPaywall() {
        Function0 function0 = this.f52409h;
        if (function0 != null) {
            C15813i c15813i = (C15813i) function0.invoke();
        }
    }

    /* renamed from: a */
    private final void m62765a(long j, Function1<? super String, C15813i> function1) {
        this.f52405d = new C6149a(j, function1).start();
    }

    /* renamed from: a */
    private final void m62770a(String str) {
        if (str != null) {
            C17090j c17090j = this.f52403b;
            if (c17090j == null) {
                C2668g.b("presenter");
            }
            Context context = getContext();
            C2668g.a(context, "context");
            context = C15365p.m57675b(context);
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            c17090j.m62966a((Activity) context, str);
        }
    }

    /* renamed from: a */
    private final void m62763a() {
        dismissPaywall();
        SettingsLauncher settingsLauncher = this.f52404c;
        if (settingsLauncher == null) {
            C2668g.b("settingsLauncher");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        context = C15365p.m57675b(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        settingsLauncher.launchSettings((Activity) context, Source.TOP_PICKS_PAYWALL);
    }

    /* renamed from: a */
    private final void m62767a(ViewType viewType) {
        switch (C15251b.f47354b[viewType.ordinal()]) {
            case 1:
                viewType = this.f52412k.getCurrentOffer();
                m62770a(viewType != null ? viewType.mo11839a() : null);
                return;
            case 2:
                m62763a();
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private final void m62771b() {
        this.f52413l.setVisibility(0);
        this.f52412k.setVisibility(8);
    }

    @NotNull
    /* renamed from: a */
    public final Animator m62772a(@NotNull FadeAnimation fadeAnimation, long j) {
        C2668g.b(fadeAnimation, "fade");
        return new C15224a(this.f52410i, this.f52411j, this.f52412k, this.f52413l, this.f52414m).m57292a(fadeAnimation, j);
    }
}
