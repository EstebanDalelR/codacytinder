package com.tinder.fastmatch.view;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.fastmatch.p355a.C13182a;
import com.tinder.fastmatch.presenter.C9399q;
import com.tinder.fastmatch.target.TinderGoldPaywallTarget;
import com.tinder.fastmatch.view.UpgradeGoldPaywallItem.C9415a;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.managers.ManagerApp;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.PaywallItemViewModelColor;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.paywall.views.PaywallItemGroupView;
import com.tinder.paywall.views.PaywallItemGroupView.PaywallItemSelectListener;
import com.tinder.paywall.views.PaywallPerksCarouselView;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.utils.at;
import com.tinder.utils.at.C15355a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002_`B\u0017\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020EH\u0007J\b\u0010G\u001a\u00020EH\u0007J\u0012\u0010H\u001a\u00020E2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u001a\u0010K\u001a\u00020E2\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010L\u001a\u00020MH\u0016J\u0006\u0010N\u001a\u00020EJ\b\u0010O\u001a\u00020EH\u0016J\b\u0010P\u001a\u00020EH\u0016J\b\u0010Q\u001a\u00020EH\u0016J\u001e\u0010R\u001a\u00020E2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020J0T2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020E2\u0006\u0010X\u001a\u00020YH\u0016J\u001e\u0010Z\u001a\u00020E2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0T2\u0006\u0010]\u001a\u00020^H\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0002008\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u0002068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010\u001a¨\u0006a"}, d2 = {"Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog;", "Landroid/app/Dialog;", "Lcom/tinder/fastmatch/target/TinderGoldPaywallTarget;", "Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "context", "Landroid/content/Context;", "options", "Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog$Options;", "(Landroid/content/Context;Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog$Options;)V", "cardBackground", "Landroid/support/v7/widget/CardView;", "getCardBackground", "()Landroid/support/v7/widget/CardView;", "setCardBackground", "(Landroid/support/v7/widget/CardView;)V", "continueButton", "Lcom/tinder/gold/TinderGoldButtonView;", "getContinueButton", "()Lcom/tinder/gold/TinderGoldButtonView;", "setContinueButton", "(Lcom/tinder/gold/TinderGoldButtonView;)V", "defaultTitle", "", "getDefaultTitle", "()Ljava/lang/String;", "setDefaultTitle", "(Ljava/lang/String;)V", "getOptions", "()Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog$Options;", "paywallGroupViewModelFactory", "Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;", "getPaywallGroupViewModelFactory", "()Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;", "setPaywallGroupViewModelFactory", "(Lcom/tinder/paywall/viewmodels/PaywallGroupViewModelFactory;)V", "paywallItems", "Lcom/tinder/paywall/views/PaywallItemGroupView;", "getPaywallItems", "()Lcom/tinder/paywall/views/PaywallItemGroupView;", "setPaywallItems", "(Lcom/tinder/paywall/views/PaywallItemGroupView;)V", "paywallTitle", "Landroid/widget/TextView;", "getPaywallTitle", "()Landroid/widget/TextView;", "setPaywallTitle", "(Landroid/widget/TextView;)V", "perksPager", "Lcom/tinder/paywall/views/PaywallPerksCarouselView;", "getPerksPager", "()Lcom/tinder/paywall/views/PaywallPerksCarouselView;", "setPerksPager", "(Lcom/tinder/paywall/views/PaywallPerksCarouselView;)V", "presenter", "Lcom/tinder/fastmatch/presenter/TinderGoldPaywallPresenter;", "getPresenter", "()Lcom/tinder/fastmatch/presenter/TinderGoldPaywallPresenter;", "setPresenter", "(Lcom/tinder/fastmatch/presenter/TinderGoldPaywallPresenter;)V", "upgradePaywallItem", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem;", "getUpgradePaywallItem", "()Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem;", "setUpgradePaywallItem", "(Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem;)V", "upgradeTitle", "getUpgradeTitle", "setUpgradeTitle", "dismiss", "", "onCardBackgroundClicked", "onDialogBackgroundClicked", "onPaywallItemInFocusTap", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "onPaywallItemSelected", "position", "", "onSubscribeClicked", "prepGoldUpgradeState", "show", "showErrorAndDismiss", "showGoldPaywallForNonSubscribers", "offers", "", "color", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModelColor;", "showGoldUpgrade", "viewModel", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;", "showPerksCarousel", "perkViewModels", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "showFastMatchPreview", "", "Builder", "Options", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TinderGoldPaywallDialog extends Dialog implements TinderGoldPaywallTarget, PaywallItemSelectListener {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9399q f38151a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C10084g f38152b;
    @NotNull
    /* renamed from: c */
    private final C9414b f38153c;
    @NotNull
    @BindView(2131362050)
    public CardView cardBackground;
    @NotNull
    @BindView(2131363711)
    public TinderGoldButtonView continueButton;
    @BindString(2131821125)
    @NotNull
    public String defaultTitle;
    @NotNull
    @BindView(2131363144)
    public PaywallItemGroupView paywallItems;
    @NotNull
    @BindView(2131363135)
    public TextView paywallTitle;
    @NotNull
    @BindView(2131363158)
    public PaywallPerksCarouselView perksPager;
    @NotNull
    @BindView(2131363926)
    public UpgradeGoldPaywallItem upgradePaywallItem;
    @BindString(2131822076)
    @NotNull
    public String upgradeTitle;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog$Builder;", "", "context", "Landroid/content/Context;", "analyticsSource", "", "(Landroid/content/Context;I)V", "options", "Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog$Options;", "build", "Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog;", "firstPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "imageUrls", "", "", "listener", "listenerPaywall", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.TinderGoldPaywallDialog$a */
    public static final class C9413a {
        /* renamed from: a */
        private final C9414b f31540a;
        /* renamed from: b */
        private final Context f31541b;

        public C9413a(@NotNull Context context, int i) {
            C2668g.b(context, "context");
            this.f31541b = context;
            this.f31540a = new C9414b(i, null, null, null, 14, null);
        }

        @NotNull
        /* renamed from: a */
        public final C9413a m39359a(@NotNull PaywallPerk paywallPerk) {
            C2668g.b(paywallPerk, "firstPerk");
            this.f31540a.m39364a(paywallPerk);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C9413a m39360a(@NotNull List<String> list) {
            C2668g.b(list, "imageUrls");
            this.f31540a.m39365a((List) list);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C9413a m39358a(@NotNull ListenerPaywall listenerPaywall) {
            C2668g.b(listenerPaywall, "listenerPaywall");
            this.f31540a.m39363a(listenerPaywall);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final TinderGoldPaywallDialog m39361a() {
            return new TinderGoldPaywallDialog(this.f31541b, this.f31540a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/tinder/fastmatch/view/TinderGoldPaywallDialog$Options;", "", "analyticsSource", "", "firstPerk", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "listener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "imageUrls", "", "", "(ILcom/tinder/paywall/viewmodels/PaywallPerk;Lcom/tinder/paywall/legacy/ListenerPaywall;Ljava/util/List;)V", "getAnalyticsSource", "()I", "getFirstPerk", "()Lcom/tinder/paywall/viewmodels/PaywallPerk;", "setFirstPerk", "(Lcom/tinder/paywall/viewmodels/PaywallPerk;)V", "getImageUrls", "()Ljava/util/List;", "setImageUrls", "(Ljava/util/List;)V", "getListener", "()Lcom/tinder/paywall/legacy/ListenerPaywall;", "setListener", "(Lcom/tinder/paywall/legacy/ListenerPaywall;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.TinderGoldPaywallDialog$b */
    public static final class C9414b {
        /* renamed from: a */
        private final int f31542a;
        @NotNull
        /* renamed from: b */
        private PaywallPerk f31543b;
        @Nullable
        /* renamed from: c */
        private ListenerPaywall f31544c;
        @Nullable
        /* renamed from: d */
        private List<String> f31545d;

        public C9414b() {
            this(0, null, null, null, 15, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9414b) {
                C9414b c9414b = (C9414b) obj;
                return (this.f31542a == c9414b.f31542a ? 1 : null) != null && C2668g.a(this.f31543b, c9414b.f31543b) && C2668g.a(this.f31544c, c9414b.f31544c) && C2668g.a(this.f31545d, c9414b.f31545d);
            }
        }

        public int hashCode() {
            int i = this.f31542a * 31;
            PaywallPerk paywallPerk = this.f31543b;
            int i2 = 0;
            i = (i + (paywallPerk != null ? paywallPerk.hashCode() : 0)) * 31;
            ListenerPaywall listenerPaywall = this.f31544c;
            i = (i + (listenerPaywall != null ? listenerPaywall.hashCode() : 0)) * 31;
            List list = this.f31545d;
            if (list != null) {
                i2 = list.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Options(analyticsSource=");
            stringBuilder.append(this.f31542a);
            stringBuilder.append(", firstPerk=");
            stringBuilder.append(this.f31543b);
            stringBuilder.append(", listener=");
            stringBuilder.append(this.f31544c);
            stringBuilder.append(", imageUrls=");
            stringBuilder.append(this.f31545d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9414b(int i, @NotNull PaywallPerk paywallPerk, @Nullable ListenerPaywall listenerPaywall, @Nullable List<String> list) {
            C2668g.b(paywallPerk, "firstPerk");
            this.f31542a = i;
            this.f31543b = paywallPerk;
            this.f31544c = listenerPaywall;
            this.f31545d = list;
        }

        /* renamed from: a */
        public final int m39362a() {
            return this.f31542a;
        }

        public /* synthetic */ C9414b(int i, PaywallPerk paywallPerk, ListenerPaywall listenerPaywall, List list, int i2, C15823e c15823e) {
            if ((i2 & 1) != null) {
                i = 0;
            }
            if ((i2 & 2) != null) {
                paywallPerk = PaywallPerk.FAST_MATCH;
            }
            if ((i2 & 4) != null) {
                listenerPaywall = null;
            }
            if ((i2 & 8) != 0) {
                list = null;
            }
            this(i, paywallPerk, listenerPaywall, list);
        }

        /* renamed from: a */
        public final void m39364a(@NotNull PaywallPerk paywallPerk) {
            C2668g.b(paywallPerk, "<set-?>");
            this.f31543b = paywallPerk;
        }

        /* renamed from: a */
        public final void m39363a(@Nullable ListenerPaywall listenerPaywall) {
            this.f31544c = listenerPaywall;
        }

        @Nullable
        /* renamed from: b */
        public final ListenerPaywall m39366b() {
            return this.f31544c;
        }

        /* renamed from: a */
        public final void m39365a(@Nullable List<String> list) {
            this.f31545d = list;
        }

        @Nullable
        /* renamed from: c */
        public final List<String> m39367c() {
            return this.f31545d;
        }
    }

    @OnClick({2131362050})
    public final void onCardBackgroundClicked() {
    }

    private TinderGoldPaywallDialog(Context context, C9414b c9414b) {
        super(context, R.style.PlusPaywallDialog);
        this.f38153c = c9414b;
        setContentView(R.layout.dialog_tinder_gold_paywall);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        ButterKnife.a(this);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        context = this.f38151a;
        if (context == null) {
            C2668g.b("presenter");
        }
        context.m39336a(this.f38153c);
        context = this.f38151a;
        if (context == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, context);
    }

    public void show() {
        getWindow().setLayout(-1, -1);
        TinderGoldButtonView tinderGoldButtonView = this.continueButton;
        if (tinderGoldButtonView == null) {
            C2668g.b("continueButton");
        }
        tinderGoldButtonView.setButtonAction(new TinderGoldPaywallDialog$show$1(this));
        super.show();
    }

    public void dismiss() {
        C14510e offer;
        super.dismiss();
        TinderGoldButtonView tinderGoldButtonView = this.continueButton;
        if (tinderGoldButtonView == null) {
            C2668g.b("continueButton");
        }
        tinderGoldButtonView.m40144a();
        UpgradeGoldPaywallItem upgradeGoldPaywallItem = this.upgradePaywallItem;
        if (upgradeGoldPaywallItem == null) {
            C2668g.b("upgradePaywallItem");
        }
        if (upgradeGoldPaywallItem.getVisibility() == 0) {
            upgradeGoldPaywallItem = this.upgradePaywallItem;
            if (upgradeGoldPaywallItem == null) {
                C2668g.b("upgradePaywallItem");
            }
            offer = upgradeGoldPaywallItem.getOffer();
        } else {
            PaywallItemGroupView paywallItemGroupView = this.paywallItems;
            if (paywallItemGroupView == null) {
                C2668g.b("paywallItems");
            }
            offer = paywallItemGroupView.getCurrentOffer();
        }
        if (offer != null) {
            C9399q c9399q = this.f38151a;
            if (c9399q == null) {
                C2668g.b("presenter");
            }
            c9399q.m39342c(offer);
        }
        Deadshot.drop(this);
    }

    public void showPerksCarousel(@NotNull List<? extends C10093o> list, boolean z) {
        C2668g.b(list, "perkViewModels");
        C13182a c13182a = new C13182a(list, z);
        PaywallPerksCarouselView paywallPerksCarouselView = this.perksPager;
        if (paywallPerksCarouselView == null) {
            C2668g.b("perksPager");
        }
        PaywallPerksCarouselView.m41287a(paywallPerksCarouselView, c13182a, false, null, 6, null);
    }

    public void showGoldUpgrade(@NotNull C9415a c9415a) {
        C2668g.b(c9415a, "viewModel");
        TextView textView = this.paywallTitle;
        if (textView == null) {
            C2668g.b("paywallTitle");
        }
        String str = this.upgradeTitle;
        if (str == null) {
            C2668g.b("upgradeTitle");
        }
        textView.setText(str);
        PaywallItemGroupView paywallItemGroupView = this.paywallItems;
        if (paywallItemGroupView == null) {
            C2668g.b("paywallItems");
        }
        paywallItemGroupView.setVisibility(8);
        UpgradeGoldPaywallItem upgradeGoldPaywallItem = this.upgradePaywallItem;
        if (upgradeGoldPaywallItem == null) {
            C2668g.b("upgradePaywallItem");
        }
        upgradeGoldPaywallItem.setVisibility(0);
        upgradeGoldPaywallItem = this.upgradePaywallItem;
        if (upgradeGoldPaywallItem == null) {
            C2668g.b("upgradePaywallItem");
        }
        upgradeGoldPaywallItem.m39379a(c9415a);
    }

    public void prepGoldUpgradeState() {
        TextView textView = this.paywallTitle;
        if (textView == null) {
            C2668g.b("paywallTitle");
        }
        String str = this.upgradeTitle;
        if (str == null) {
            C2668g.b("upgradeTitle");
        }
        textView.setText(str);
        PaywallItemGroupView paywallItemGroupView = this.paywallItems;
        if (paywallItemGroupView == null) {
            C2668g.b("paywallItems");
        }
        paywallItemGroupView.setVisibility(8);
        UpgradeGoldPaywallItem upgradeGoldPaywallItem = this.upgradePaywallItem;
        if (upgradeGoldPaywallItem == null) {
            C2668g.b("upgradePaywallItem");
        }
        upgradeGoldPaywallItem.setVisibility(4);
    }

    public void showGoldPaywallForNonSubscribers(@NotNull List<? extends C14510e> list, @NotNull PaywallItemViewModelColor paywallItemViewModelColor) {
        C2668g.b(list, "offers");
        C2668g.b(paywallItemViewModelColor, ManagerWebServices.PARAM_BADGE_COLOR);
        paywallItemViewModelColor = this.upgradePaywallItem;
        if (paywallItemViewModelColor == null) {
            C2668g.b("upgradePaywallItem");
        }
        paywallItemViewModelColor.setVisibility(8);
        paywallItemViewModelColor = this.paywallTitle;
        if (paywallItemViewModelColor == null) {
            C2668g.b("paywallTitle");
        }
        String str = this.defaultTitle;
        if (str == null) {
            C2668g.b("defaultTitle");
        }
        paywallItemViewModelColor.setText(str);
        paywallItemViewModelColor = this.f38152b;
        if (paywallItemViewModelColor == null) {
            C2668g.b("paywallGroupViewModelFactory");
        }
        list = paywallItemViewModelColor.m41203a(ProductType.GOLD, list, PaywallItemViewModelColor.GOLD, this);
        paywallItemViewModelColor = this.paywallItems;
        if (paywallItemViewModelColor == null) {
            C2668g.b("paywallItems");
        }
        paywallItemViewModelColor.setViewModel(list);
    }

    public void showErrorAndDismiss() {
        C0001a.e("Error showing Tinder Gold paywall", new Object[0]);
        dismiss();
    }

    public void onPaywallItemSelected(@Nullable C14510e c14510e, int i) {
        if (c14510e != null) {
            i = this.f38151a;
            if (i == 0) {
                C2668g.b("presenter");
            }
            i.m39337a(c14510e);
        }
    }

    public void onPaywallItemInFocusTap(@Nullable C14510e c14510e) {
        if (c14510e != null) {
            C9399q c9399q = this.f38151a;
            if (c9399q == null) {
                C2668g.b("presenter");
            }
            c9399q.m39340b(c14510e);
        }
    }

    @OnClick({2131362304})
    public final void onDialogBackgroundClicked() {
        dismiss();
    }

    /* renamed from: a */
    public final void m47464a() {
        C14510e offer;
        UpgradeGoldPaywallItem upgradeGoldPaywallItem = this.upgradePaywallItem;
        if (upgradeGoldPaywallItem == null) {
            C2668g.b("upgradePaywallItem");
        }
        if (upgradeGoldPaywallItem.getVisibility() == 0) {
            upgradeGoldPaywallItem = this.upgradePaywallItem;
            if (upgradeGoldPaywallItem == null) {
                C2668g.b("upgradePaywallItem");
            }
            offer = upgradeGoldPaywallItem.getOffer();
        } else {
            PaywallItemGroupView paywallItemGroupView = this.paywallItems;
            if (paywallItemGroupView == null) {
                C2668g.b("paywallItems");
            }
            offer = paywallItemGroupView.getCurrentOffer();
        }
        if (offer != null) {
            C9399q c9399q = this.f38151a;
            if (c9399q == null) {
                C2668g.b("presenter");
            }
            c9399q.m39340b(offer);
            return;
        }
        C0001a.e("Current offer is null on subscribe click", new Object[0]);
        C15355a c15355a = at.f47621a;
        CardView cardView = this.cardBackground;
        if (cardView == null) {
            C2668g.b("cardBackground");
        }
        c15355a.a(cardView, R.string.purchase_failure);
    }
}
