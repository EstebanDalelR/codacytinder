package com.tinder.tinderplus.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.paywall.views.DiscountBannerView;
import com.tinder.paywall.views.OnPerksCarouselPageChangeListener;
import com.tinder.paywall.views.PaywallItemGroupView;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.paywall.views.PaywallPerksCarouselView;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.dialog.C16952a.C16951a;
import com.tinder.tinderplus.p429b.C15201k;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.tinderplus.target.TinderPlusPaywallTarget;
import com.tinder.utils.at;
import com.tinder.utils.at.C15355a;
import com.tinder.utils.av;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002{|B\u0017\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010[\u001a\u00020\\H\u0016J\r\u0010]\u001a\u00020\\H\u0001¢\u0006\u0002\b^J\r\u0010_\u001a\u00020\\H\u0001¢\u0006\u0002\b`J\u0012\u0010a\u001a\u00020\\2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u001a\u0010d\u001a\u00020\\2\b\u0010b\u001a\u0004\u0018\u00010c2\u0006\u0010e\u001a\u00020\u0010H\u0016J\b\u0010f\u001a\u00020\\H\u0007JF\u0010g\u001a\u00020\\2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020j0i2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020c0i2\u0006\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010o2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0016J\b\u0010t\u001a\u00020\\H\u0016J\u0010\u0010u\u001a\u00020\\2\u0006\u0010v\u001a\u00020wH\u0016J\b\u0010x\u001a\u00020\\H\u0016J\b\u0010y\u001a\u00020\\H\u0016J\b\u0010z\u001a\u00020\\H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020C8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001e\u0010H\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010'\"\u0004\bJ\u0010)R\u001e\u0010K\u001a\u00020L8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020%8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010'\"\u0004\bY\u0010)R\u0012\u0010Z\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog;", "Landroid/app/Dialog;", "Lcom/tinder/tinderplus/target/TinderPlusPaywallTarget;", "Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "context", "Landroid/content/Context;", "options", "Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options;", "(Landroid/content/Context;Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options;)V", "cardBackground", "Landroid/support/v7/widget/CardView;", "getCardBackground", "()Landroid/support/v7/widget/CardView;", "setCardBackground", "(Landroid/support/v7/widget/CardView;)V", "defaultTitleSize", "", "dialogTitle", "Landroid/widget/TextView;", "getDialogTitle", "()Landroid/widget/TextView;", "setDialogTitle", "(Landroid/widget/TextView;)V", "discountBanner", "Lcom/tinder/paywall/views/DiscountBannerView;", "getDiscountBanner", "()Lcom/tinder/paywall/views/DiscountBannerView;", "setDiscountBanner", "(Lcom/tinder/paywall/views/DiscountBannerView;)V", "discountTitleSize", "likeStatusProvider", "Lcom/tinder/tinderplus/provider/LikeStatusProvider;", "getLikeStatusProvider", "()Lcom/tinder/tinderplus/provider/LikeStatusProvider;", "setLikeStatusProvider", "(Lcom/tinder/tinderplus/provider/LikeStatusProvider;)V", "limitedTime", "", "getLimitedTime", "()Ljava/lang/String;", "setLimitedTime", "(Ljava/lang/String;)V", "paywallGroupViewModelFactory", "Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;", "getPaywallGroupViewModelFactory", "()Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;", "setPaywallGroupViewModelFactory", "(Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;)V", "paywallItems", "Lcom/tinder/paywall/views/PaywallItemGroupView;", "getPaywallItems", "()Lcom/tinder/paywall/views/PaywallItemGroupView;", "setPaywallItems", "(Lcom/tinder/paywall/views/PaywallItemGroupView;)V", "paywallPerksCarouselView", "Lcom/tinder/paywall/views/PaywallPerksCarouselView;", "getPaywallPerksCarouselView", "()Lcom/tinder/paywall/views/PaywallPerksCarouselView;", "setPaywallPerksCarouselView", "(Lcom/tinder/paywall/views/PaywallPerksCarouselView;)V", "presenter", "Lcom/tinder/tinderplus/presenters/TinderPlusPaywallPresenter;", "getPresenter", "()Lcom/tinder/tinderplus/presenters/TinderPlusPaywallPresenter;", "setPresenter", "(Lcom/tinder/tinderplus/presenters/TinderPlusPaywallPresenter;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "special", "getSpecial", "setSpecial", "subscribeButton", "Landroid/widget/Button;", "getSubscribeButton", "()Landroid/widget/Button;", "setSubscribeButton", "(Landroid/widget/Button;)V", "superlikeInteractor", "Lcom/tinder/superlike/interactors/SuperlikeInteractor;", "getSuperlikeInteractor", "()Lcom/tinder/superlike/interactors/SuperlikeInteractor;", "setSuperlikeInteractor", "(Lcom/tinder/superlike/interactors/SuperlikeInteractor;)V", "title", "getTitle", "setTitle", "white", "dismiss", "", "onBackgroundWindowClick", "onBackgroundWindowClick$Tinder_release", "onCardBackgroundClick", "onCardBackgroundClick$Tinder_release", "onPaywallItemInFocusTap", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "onPaywallItemSelected", "position", "onSubscribeButtonClick", "setupViews", "perkViewModels", "", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "offers", "shouldShowDiscount", "", "firstPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "paywallColorScheme", "Lcom/tinder/paywall/views/PaywallBaseView$ColorScheme;", "color", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;", "show", "showDiscountOffers", "expiresAt", "", "showErrorMessageAndDismiss", "showProgressLoading", "showRegularOffers", "Builder", "Options", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TinderPlusPaywallDialog extends Dialog implements PaywallItemSelectListener, TinderPlusPaywallTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C15201k f52228a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C15071e f52229b;
    @Inject
    @NotNull
    /* renamed from: c */
    public LikeStatusProvider f52230c;
    @NotNull
    @BindView(2131362050)
    public CardView cardBackground;
    @Inject
    @NotNull
    /* renamed from: d */
    public C10084g f52231d;
    @BindDimen(2131166267)
    @JvmField
    public int defaultTitleSize;
    @NotNull
    @BindView(2131363135)
    public TextView dialogTitle;
    @NotNull
    @BindView(2131362329)
    public DiscountBannerView discountBanner;
    @BindDimen(2131166268)
    @JvmField
    public int discountTitleSize;
    @BindString(2131821290)
    @NotNull
    public String limitedTime;
    @NotNull
    @BindView(2131363144)
    public PaywallItemGroupView paywallItems;
    @NotNull
    @BindView(2131363158)
    public PaywallPerksCarouselView paywallPerksCarouselView;
    @NotNull
    @BindView(2131363145)
    public ProgressBar progressBar;
    @BindString(2131821928)
    @NotNull
    public String special;
    @NotNull
    @BindView(2131363711)
    public Button subscribeButton;
    @BindString(2131821126)
    @NotNull
    public String title;
    @BindColor(2131100300)
    @JvmField
    public int white;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "builder", "Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options$Builder;", "analyticsSource", "", "build", "Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog;", "firstPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "incentives", "", "intendedUser", "Lcom/tinder/paywall/paywallflow/PaywallFlow$IntendedUser;", "isFromDiscountNotification", "", "listener", "listenerPaywall", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.dialog.TinderPlusPaywallDialog$a */
    public static final class C15203a {
        /* renamed from: a */
        private final C15204a f47289a = C15206b.f47291a.m57164a();
        /* renamed from: b */
        private final Context f47290b;

        public C15203a(@NotNull Context context) {
            C2668g.b(context, "context");
            this.f47290b = context;
        }

        @NotNull
        /* renamed from: a */
        public final C15203a m57150a(int i) {
            this.f47289a.mo12542a(i);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C15203a m57155a(boolean z) {
            this.f47289a.mo12547a(z);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C15203a m57153a(@NotNull PaywallPerk paywallPerk) {
            C2668g.b(paywallPerk, "firstPerk");
            this.f47289a.mo12545a(paywallPerk);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C15203a m57154a(@NotNull List<Integer> list) {
            C2668g.b(list, "incentives");
            this.f47289a.mo12546a((List) list);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C15203a m57151a(@NotNull ListenerPaywall listenerPaywall) {
            C2668g.b(listenerPaywall, "listenerPaywall");
            this.f47289a.mo12543a(listenerPaywall);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C15203a m57152a(@NotNull C10075b c10075b) {
            C2668g.b(c10075b, "intendedUser");
            this.f47289a.mo12544a(c10075b);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final TinderPlusPaywallDialog m57156a() {
            return new TinderPlusPaywallDialog(this.f47290b, this.f47289a.mo12548a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options;", "", "()V", "isFromDiscountNotification", "", "()Z", "analyticsSource", "", "firstPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "incentives", "", "intendedUser", "Lcom/tinder/paywall/paywallflow/PaywallFlow$IntendedUser;", "listener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "Builder", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.dialog.TinderPlusPaywallDialog$b */
    public static abstract class C15206b {
        /* renamed from: a */
        public static final C15205b f47291a = new C15205b();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options$Builder;", "", "()V", "analyticsSource", "", "build", "Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options;", "firstPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "incentives", "", "intendedUser", "Lcom/tinder/paywall/paywallflow/PaywallFlow$IntendedUser;", "isFromDiscountNotification", "newFromDiscountNotification", "", "listener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.tinderplus.dialog.TinderPlusPaywallDialog$b$a */
        public static abstract class C15204a {
            @NotNull
            /* renamed from: a */
            public abstract C15204a mo12542a(int i);

            @NotNull
            /* renamed from: a */
            public abstract C15204a mo12543a(@NotNull ListenerPaywall listenerPaywall);

            @NotNull
            /* renamed from: a */
            public abstract C15204a mo12544a(@NotNull C10075b c10075b);

            @NotNull
            /* renamed from: a */
            public abstract C15204a mo12545a(@NotNull PaywallPerk paywallPerk);

            @NotNull
            /* renamed from: a */
            public abstract C15204a mo12546a(@NotNull List<Integer> list);

            @NotNull
            /* renamed from: a */
            public abstract C15204a mo12547a(boolean z);

            @NotNull
            /* renamed from: a */
            public abstract C15206b mo12548a();
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options$Companion;", "", "()V", "builder", "Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog$Options$Builder;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.tinderplus.dialog.TinderPlusPaywallDialog$b$b */
        public static final class C15205b {
            private C15205b() {
            }

            @NotNull
            /* renamed from: a */
            public final C15204a m57164a() {
                return new C16951a();
            }
        }

        /* renamed from: a */
        public abstract boolean mo12549a();

        /* renamed from: b */
        public abstract int mo12550b();

        @Nullable
        /* renamed from: c */
        public abstract PaywallPerk mo12551c();

        @Nullable
        /* renamed from: d */
        public abstract List<Integer> mo12552d();

        @Nullable
        /* renamed from: e */
        public abstract ListenerPaywall mo12553e();

        @Nullable
        /* renamed from: f */
        public abstract C10075b mo12554f();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.dialog.TinderPlusPaywallDialog$d */
    static final class C15207d implements Runnable {
        /* renamed from: a */
        final /* synthetic */ TinderPlusPaywallDialog f47292a;

        C15207d(TinderPlusPaywallDialog tinderPlusPaywallDialog) {
            this.f47292a = tinderPlusPaywallDialog;
        }

        public final void run() {
            if (this.f47292a.isShowing()) {
                this.f47292a.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/tinderplus/dialog/TinderPlusPaywallDialog$setupViews$1", "Lcom/tinder/paywall/views/OnPerksCarouselPageChangeListener;", "(Lcom/tinder/tinderplus/dialog/TinderPlusPaywallDialog;)V", "onPageChange", "", "position", "", "lastPage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.dialog.TinderPlusPaywallDialog$c */
    public static final class C16947c implements OnPerksCarouselPageChangeListener {
        /* renamed from: a */
        final /* synthetic */ TinderPlusPaywallDialog f52227a;

        C16947c(TinderPlusPaywallDialog tinderPlusPaywallDialog) {
            this.f52227a = tinderPlusPaywallDialog;
        }

        public void onPageChange(int i, int i2) {
            this.f52227a.m62632a().m57141a(i, i2);
        }
    }

    @OnClick({2131362050})
    public final void onCardBackgroundClick$Tinder_release() {
    }

    private TinderPlusPaywallDialog(Context context, C15206b c15206b) {
        super(context, R.style.PlusPaywallDialog);
        setContentView(R.layout.dialog_tinder_plus_paywall);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        ButterKnife.a(this);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        context = this.f52228a;
        if (context == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, context);
        context = this.f52228a;
        if (context == null) {
            C2668g.b("presenter");
        }
        context.m57143a(c15206b);
    }

    @NotNull
    /* renamed from: a */
    public final C15201k m62632a() {
        C15201k c15201k = this.f52228a;
        if (c15201k == null) {
            C2668g.b("presenter");
        }
        return c15201k;
    }

    public void show() {
        getWindow().setLayout(-1, -1);
        C15201k c15201k = this.f52228a;
        if (c15201k == null) {
            C2668g.b("presenter");
        }
        c15201k.m57144b();
        super.show();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupViews(@org.jetbrains.annotations.NotNull java.util.List<? extends com.tinder.paywall.viewmodels.C10093o> r4, @org.jetbrains.annotations.NotNull java.util.List<? extends com.tinder.purchase.domain.model.C14510e> r5, boolean r6, @org.jetbrains.annotations.Nullable com.tinder.paywall.viewmodels.PaywallPerk r7, @org.jetbrains.annotations.NotNull com.tinder.paywall.views.PaywallBaseView.ColorScheme r8, @org.jetbrains.annotations.NotNull com.tinder.paywall.viewmodels.PaywallItemViewModelColor r9) {
        /*
        r3 = this;
        r0 = "perkViewModels";
        kotlin.jvm.internal.C2668g.b(r4, r0);
        r0 = "offers";
        kotlin.jvm.internal.C2668g.b(r5, r0);
        r0 = "paywallColorScheme";
        kotlin.jvm.internal.C2668g.b(r8, r0);
        r0 = "color";
        kotlin.jvm.internal.C2668g.b(r9, r0);
        r0 = r3.f52231d;
        if (r0 != 0) goto L_0x001d;
    L_0x0018:
        r1 = "paywallGroupViewModelFactory";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x001d:
        r1 = com.tinder.domain.profile.model.ProductType.PLUS;
        r2 = r3;
        r2 = (com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener) r2;
        r5 = r0.a(r1, r5, r9, r2);
        r9 = r3.paywallItems;
        if (r9 != 0) goto L_0x002f;
    L_0x002a:
        r0 = "paywallItems";
        kotlin.jvm.internal.C2668g.b(r0);
    L_0x002f:
        r9.setViewModel(r5);
        r5 = r3.getContext();
        r8 = r8.getPaywallButtonSelector();
        r5 = android.support.v4.content.C0432b.a(r5, r8);
        r8 = r3.subscribeButton;
        if (r8 != 0) goto L_0x0047;
    L_0x0042:
        r9 = "subscribeButton";
        kotlin.jvm.internal.C2668g.b(r9);
    L_0x0047:
        r8.setBackground(r5);
        r5 = 2;
        r5 = new android.view.View[r5];
        r8 = r3.paywallItems;
        if (r8 != 0) goto L_0x0056;
    L_0x0051:
        r9 = "paywallItems";
        kotlin.jvm.internal.C2668g.b(r9);
    L_0x0056:
        r8 = (android.view.View) r8;
        r9 = 0;
        r5[r9] = r8;
        r8 = r3.subscribeButton;
        if (r8 != 0) goto L_0x0064;
    L_0x005f:
        r0 = "subscribeButton";
        kotlin.jvm.internal.C2668g.b(r0);
    L_0x0064:
        r8 = (android.view.View) r8;
        r0 = 1;
        r5[r0] = r8;
        com.tinder.utils.av.c(r5);
        r5 = new android.view.View[r0];
        r8 = r3.progressBar;
        if (r8 != 0) goto L_0x0077;
    L_0x0072:
        r1 = "progressBar";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x0077:
        r8 = (android.view.View) r8;
        r5[r9] = r8;
        com.tinder.utils.av.a(r5);
        r5 = r3.dialogTitle;
        if (r5 != 0) goto L_0x0087;
    L_0x0082:
        r8 = "dialogTitle";
        kotlin.jvm.internal.C2668g.b(r8);
    L_0x0087:
        r8 = r3.white;
        r5.setTextColor(r8);
        r5 = r3.dialogTitle;
        if (r5 != 0) goto L_0x0095;
    L_0x0090:
        r8 = "dialogTitle";
        kotlin.jvm.internal.C2668g.b(r8);
    L_0x0095:
        r8 = r3.title;
        if (r8 != 0) goto L_0x009e;
    L_0x0099:
        r1 = "title";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x009e:
        r8 = (java.lang.CharSequence) r8;
        r5.setText(r8);
        r5 = new com.tinder.tinderplus.adapters.d;
        r5.<init>(r4);
        r4 = r3.f52230c;
        if (r4 != 0) goto L_0x00b1;
    L_0x00ac:
        r8 = "likeStatusProvider";
        kotlin.jvm.internal.C2668g.b(r8);
    L_0x00b1:
        r4 = r4.currentStatus();
        r6 = r6 ^ r0;
        if (r7 == 0) goto L_0x0106;
    L_0x00b8:
        r8 = com.tinder.tinderplus.dialog.C15209b.f47293a;
        r7 = r7.ordinal();
        r7 = r8[r7];
        switch(r7) {
            case 1: goto L_0x00f7;
            case 2: goto L_0x00c4;
            default: goto L_0x00c3;
        };
    L_0x00c3:
        goto L_0x0106;
    L_0x00c4:
        if (r6 == 0) goto L_0x00f5;
    L_0x00c6:
        r4 = r3.f52229b;
        if (r4 != 0) goto L_0x00cf;
    L_0x00ca:
        r6 = "superlikeInteractor";
        kotlin.jvm.internal.C2668g.b(r6);
    L_0x00cf:
        r4 = r4.m56820c();
        if (r4 != 0) goto L_0x00f5;
    L_0x00d5:
        r4 = r3.f52229b;
        if (r4 != 0) goto L_0x00de;
    L_0x00d9:
        r6 = "superlikeInteractor";
        kotlin.jvm.internal.C2668g.b(r6);
    L_0x00de:
        r4 = r4.m56818b();
        if (r4 == 0) goto L_0x00e9;
    L_0x00e4:
        r6 = r4.resetDateInMillis();
        goto L_0x00eb;
    L_0x00e9:
        r6 = 0;
    L_0x00eb:
        r1 = java.lang.System.currentTimeMillis();
        r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r4 >= 0) goto L_0x00f5;
    L_0x00f3:
        r6 = 1;
        goto L_0x0106;
    L_0x00f5:
        r6 = 0;
        goto L_0x0106;
    L_0x00f7:
        if (r6 == 0) goto L_0x00f5;
    L_0x00f9:
        r6 = r4.millisRateLimitedUntil();
        r1 = java.lang.System.currentTimeMillis();
        r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r4 >= 0) goto L_0x00f5;
    L_0x0105:
        goto L_0x00f3;
    L_0x0106:
        r4 = r3.paywallPerksCarouselView;
        if (r4 != 0) goto L_0x010f;
    L_0x010a:
        r7 = "paywallPerksCarouselView";
        kotlin.jvm.internal.C2668g.b(r7);
    L_0x010f:
        r5 = (com.tinder.paywall.p304b.C12265d) r5;
        r7 = new com.tinder.tinderplus.dialog.TinderPlusPaywallDialog$c;
        r7.<init>(r3);
        r7 = (com.tinder.paywall.views.OnPerksCarouselPageChangeListener) r7;
        r4.a(r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.tinderplus.dialog.TinderPlusPaywallDialog.setupViews(java.util.List, java.util.List, boolean, com.tinder.paywall.viewmodels.PaywallPerk, com.tinder.paywall.views.PaywallBaseView$ColorScheme, com.tinder.paywall.viewmodels.PaywallItemViewModelColor):void");
    }

    public void showRegularOffers() {
        View[] viewArr = new View[2];
        DiscountBannerView discountBannerView = this.discountBanner;
        if (discountBannerView == null) {
            C2668g.b("discountBanner");
        }
        viewArr[0] = discountBannerView;
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            C2668g.b("progressBar");
        }
        viewArr[1] = progressBar;
        av.c(viewArr);
        View[] viewArr2 = new View[2];
        PaywallItemGroupView paywallItemGroupView = this.paywallItems;
        if (paywallItemGroupView == null) {
            C2668g.b("paywallItems");
        }
        viewArr2[0] = paywallItemGroupView;
        Button button = this.subscribeButton;
        if (button == null) {
            C2668g.b("subscribeButton");
        }
        viewArr2[1] = button;
        av.a(viewArr2);
        TextView textView = this.dialogTitle;
        if (textView == null) {
            C2668g.b("dialogTitle");
        }
        textView.setTextSize(0, (float) this.defaultTitleSize);
    }

    public void showDiscountOffers(long j) {
        View[] viewArr = new View[1];
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            C2668g.b("progressBar");
        }
        viewArr[0] = progressBar;
        av.c(viewArr);
        viewArr = new View[2];
        PaywallItemGroupView paywallItemGroupView = this.paywallItems;
        if (paywallItemGroupView == null) {
            C2668g.b("paywallItems");
        }
        viewArr[0] = paywallItemGroupView;
        Button button = this.subscribeButton;
        if (button == null) {
            C2668g.b("subscribeButton");
        }
        viewArr[1] = button;
        av.a(viewArr);
        TextView textView = this.dialogTitle;
        if (textView == null) {
            C2668g.b("dialogTitle");
        }
        String str = this.limitedTime;
        if (str == null) {
            C2668g.b("limitedTime");
        }
        textView.setText(str);
        textView = this.dialogTitle;
        if (textView == null) {
            C2668g.b("dialogTitle");
        }
        textView.setTextSize(0, (float) this.discountTitleSize);
        DiscountBannerView discountBannerView = this.discountBanner;
        if (discountBannerView == null) {
            C2668g.b("discountBanner");
        }
        discountBannerView.setVisibility(0);
        discountBannerView = this.discountBanner;
        if (discountBannerView == null) {
            C2668g.b("discountBanner");
        }
        str = this.special;
        if (str == null) {
            C2668g.b("special");
        }
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        str = str.toUpperCase();
        C2668g.a(str, "(this as java.lang.String).toUpperCase()");
        discountBannerView.a(str);
        discountBannerView = this.discountBanner;
        if (discountBannerView == null) {
            C2668g.b("discountBanner");
        }
        discountBannerView.a(j);
    }

    public void showProgressLoading() {
        View[] viewArr = new View[1];
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            C2668g.b("progressBar");
        }
        viewArr[0] = progressBar;
        av.a(viewArr);
        viewArr = new View[2];
        PaywallItemGroupView paywallItemGroupView = this.paywallItems;
        if (paywallItemGroupView == null) {
            C2668g.b("paywallItems");
        }
        viewArr[0] = paywallItemGroupView;
        Button button = this.subscribeButton;
        if (button == null) {
            C2668g.b("subscribeButton");
        }
        viewArr[1] = button;
        av.c(viewArr);
    }

    public void showErrorMessageAndDismiss() {
        CardView cardView = this.cardBackground;
        if (cardView == null) {
            C2668g.b("cardBackground");
        }
        cardView.setVisibility(8);
        C15355a c15355a = at.f47621a;
        CardView cardView2 = this.cardBackground;
        if (cardView2 == null) {
            C2668g.b("cardBackground");
        }
        View rootView = cardView2.getRootView();
        C2668g.a(rootView, "cardBackground.rootView");
        c15355a.m57630a(rootView, (int) R.string.error_getting_sku_details);
        new Handler().postDelayed(new C15207d(this), 1000);
    }

    public void onPaywallItemSelected(@Nullable C14510e c14510e, int i) {
        if (c14510e != null) {
            i = this.f52228a;
            if (i == 0) {
                C2668g.b("presenter");
            }
            i.m57145b(c14510e);
        }
    }

    public void onPaywallItemInFocusTap(@Nullable C14510e c14510e) {
        if (c14510e != null) {
            C15201k c15201k = this.f52228a;
            if (c15201k == null) {
                C2668g.b("presenter");
            }
            c15201k.m57142a(c14510e);
        }
    }

    public void dismiss() {
        super.dismiss();
        Deadshot.drop(this);
        DiscountBannerView discountBannerView = this.discountBanner;
        if (discountBannerView == null) {
            C2668g.b("discountBanner");
        }
        if (discountBannerView.getVisibility() == 0) {
            discountBannerView = this.discountBanner;
            if (discountBannerView == null) {
                C2668g.b("discountBanner");
            }
            discountBannerView.a();
        }
    }

    @OnClick({2131363711})
    public final void onSubscribeButtonClick() {
        PaywallItemGroupView paywallItemGroupView = this.paywallItems;
        if (paywallItemGroupView == null) {
            C2668g.b("paywallItems");
        }
        C14510e currentOffer = paywallItemGroupView.getCurrentOffer();
        if (currentOffer == null) {
            C0001a.e("Current offer is null on subscribe click", new Object[0]);
            C15355a c15355a = at.f47621a;
            CardView cardView = this.cardBackground;
            if (cardView == null) {
                C2668g.b("cardBackground");
            }
            c15355a.m57630a((View) cardView, (int) R.string.purchase_failure);
        }
        C15201k c15201k = this.f52228a;
        if (c15201k == null) {
            C2668g.b("presenter");
        }
        c15201k.m57142a(currentOffer);
    }

    @OnClick({2131362304})
    public final void onBackgroundWindowClick$Tinder_release() {
        dismiss();
    }
}
