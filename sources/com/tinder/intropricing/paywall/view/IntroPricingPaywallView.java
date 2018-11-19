package com.tinder.intropricing.paywall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.view.IdViewAnimator;
import com.tinder.gold.TinderGoldButtonView;
import com.tinder.intropricing.C9728a.C9724d;
import com.tinder.intropricing.C9728a.C9726f;
import com.tinder.intropricing.di.IntroPricingApplicationComponent.IntroPricingApplicationComponentProvider;
import com.tinder.intropricing.domain.model.IntroPricingPaywallType;
import com.tinder.intropricing.paywall.p265a.C9734a;
import com.tinder.intropricing.paywall.p266b.C9735a;
import com.tinder.intropricing.paywall.p266b.C9736b;
import com.tinder.intropricing.paywall.p266b.C9739f;
import com.tinder.intropricing.paywall.target.IntroPricingPaywallTarget;
import com.tinder.intropricing.paywall.view.info.IntroPricingInfoView;
import com.tinder.intropricing.paywall.view.offers.C11893b;
import com.tinder.intropricing.paywall.view.offers.C9742c;
import com.tinder.intropricing.paywall.view.offers.IntroPricingOffersView;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001=B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000201H\u0014J\b\u00105\u001a\u000201H\u0014J\u000e\u00106\u001a\u0002012\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u0002012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0016R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\u00120\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0016\u001a\n \n*\u0004\u0018\u00010\u00170\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001b\u001a\n \n*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R#\u0010&\u001a\n \n*\u0004\u0018\u00010'0'8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u000e\u001a\u0004\b(\u0010)R#\u0010+\u001a\n \n*\u0004\u0018\u00010,0,8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u000e\u001a\u0004\b-\u0010.¨\u0006>"}, d2 = {"Lcom/tinder/intropricing/paywall/view/IntroPricingPaywallView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/intropricing/paywall/target/IntroPricingPaywallTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "closeButton", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getCloseButton", "()Landroid/widget/ImageView;", "closeButton$delegate", "Lkotlin/Lazy;", "currentPage", "Lcom/tinder/intropricing/paywall/view/IntroPricingPaywallView$Page;", "infoView", "Lcom/tinder/intropricing/paywall/view/info/IntroPricingInfoView;", "getInfoView", "()Lcom/tinder/intropricing/paywall/view/info/IntroPricingInfoView;", "infoView$delegate", "offersView", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersView;", "getOffersView", "()Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersView;", "offersView$delegate", "paywallContent", "Lcom/tinder/base/view/IdViewAnimator;", "getPaywallContent", "()Lcom/tinder/base/view/IdViewAnimator;", "paywallContent$delegate", "presenter", "Lcom/tinder/intropricing/paywall/presenter/IntroPricingPaywallPresenter;", "getPresenter", "()Lcom/tinder/intropricing/paywall/presenter/IntroPricingPaywallPresenter;", "setPresenter", "(Lcom/tinder/intropricing/paywall/presenter/IntroPricingPaywallPresenter;)V", "selectButton", "Lcom/tinder/gold/TinderGoldButtonView;", "getSelectButton", "()Lcom/tinder/gold/TinderGoldButtonView;", "selectButton$delegate", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title$delegate", "bindFakeData", "", "createIntroPricingOffersViewModel", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingOffersViewModel;", "onAttachedToWindow", "onDetachedFromWindow", "setOnCloseClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "updateOffers", "items", "", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "Page", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
public final class IntroPricingPaywallView extends LinearLayout implements IntroPricingPaywallTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38740a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingPaywallView.class), "paywallContent", "getPaywallContent()Lcom/tinder/base/view/IdViewAnimator;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingPaywallView.class), ManagerWebServices.PARAM_JOB_TITLE, "getTitle()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingPaywallView.class), "infoView", "getInfoView()Lcom/tinder/intropricing/paywall/view/info/IntroPricingInfoView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingPaywallView.class), "offersView", "getOffersView()Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingPaywallView.class), "closeButton", "getCloseButton()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingPaywallView.class), "selectButton", "getSelectButton()Lcom/tinder/gold/TinderGoldButtonView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C9734a f38741b;
    /* renamed from: c */
    private final Lazy f38742c;
    /* renamed from: d */
    private final Lazy f38743d;
    /* renamed from: e */
    private final Lazy f38744e;
    /* renamed from: f */
    private final Lazy f38745f;
    /* renamed from: g */
    private final Lazy f38746g;
    /* renamed from: h */
    private final Lazy f38747h;
    /* renamed from: i */
    private Page f38748i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/intropricing/paywall/view/IntroPricingPaywallView$Page;", "", "layoutID", "", "(Ljava/lang/String;II)V", "getLayoutID", "()I", "INFO", "OFFERS", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
    public enum Page {
        ;
        
        private final int layoutID;

        protected Page(int i) {
            this.layoutID = i;
        }

        public final int getLayoutID() {
            return this.layoutID;
        }
    }

    private final ImageView getCloseButton() {
        Lazy lazy = this.f38746g;
        KProperty kProperty = f38740a[4];
        return (ImageView) lazy.getValue();
    }

    private final IntroPricingInfoView getInfoView() {
        Lazy lazy = this.f38744e;
        KProperty kProperty = f38740a[2];
        return (IntroPricingInfoView) lazy.getValue();
    }

    private final IntroPricingOffersView getOffersView() {
        Lazy lazy = this.f38745f;
        KProperty kProperty = f38740a[3];
        return (IntroPricingOffersView) lazy.getValue();
    }

    private final IdViewAnimator getPaywallContent() {
        Lazy lazy = this.f38742c;
        KProperty kProperty = f38740a[0];
        return (IdViewAnimator) lazy.getValue();
    }

    private final TinderGoldButtonView getSelectButton() {
        Lazy lazy = this.f38747h;
        KProperty kProperty = f38740a[5];
        return (TinderGoldButtonView) lazy.getValue();
    }

    private final TextView getTitle() {
        Lazy lazy = this.f38743d;
        KProperty kProperty = f38740a[1];
        return (TextView) lazy.getValue();
    }

    public void updateOffers(@NotNull List<C11893b> list) {
        C2668g.b(list, "items");
    }

    public /* synthetic */ IntroPricingPaywallView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public IntroPricingPaywallView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38742c = C18451c.a((Function0) new IntroPricingPaywallView$paywallContent$2(this));
        this.f38743d = C18451c.a((Function0) new IntroPricingPaywallView$title$2(this));
        this.f38744e = C18451c.a((Function0) new IntroPricingPaywallView$infoView$2(this));
        this.f38745f = C18451c.a((Function0) new IntroPricingPaywallView$offersView$2(this));
        this.f38746g = C18451c.a((Function0) new IntroPricingPaywallView$closeButton$2(this));
        this.f38747h = C18451c.a((Function0) new IntroPricingPaywallView$selectButton$2(this));
        this.f38748i = Page.INFO;
        attributeSet = context.getApplicationContext();
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.intropricing.di.IntroPricingApplicationComponent.IntroPricingApplicationComponentProvider");
        }
        ((IntroPricingApplicationComponentProvider) attributeSet).provideIntroPricingApplicationComponent().inject(this);
        LinearLayout.inflate(context, C9724d.view_paywall_intro_pricing, this);
        setOrientation(1);
        getSelectButton().setButtonAction((Function0) new Function0<C15813i>() {
            public /* synthetic */ Object invoke() {
                m53714a();
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m53714a() {
                if (this.f38748i == Page.INFO) {
                    this.getPaywallContent().setDisplayedChildId(Page.OFFERS.getLayoutID());
                    this.f38748i = Page.OFFERS;
                }
            }
        });
        m47872a();
    }

    @NotNull
    public final C9734a getPresenter() {
        C9734a c9734a = this.f38741b;
        if (c9734a == null) {
            C2668g.b("presenter");
        }
        return c9734a;
    }

    public final void setPresenter(@NotNull C9734a c9734a) {
        C2668g.b(c9734a, "<set-?>");
        this.f38741b = c9734a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9734a c9734a = this.f38741b;
        if (c9734a == null) {
            C2668g.b("presenter");
        }
        c9734a.m40236a((IntroPricingPaywallTarget) this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9734a c9734a = this.f38741b;
        if (c9734a == null) {
            C2668g.b("presenter");
        }
        c9734a.m40237b();
    }

    public final void setOnCloseClickListener(@NotNull OnClickListener onClickListener) {
        C2668g.b(onClickListener, "onClickListener");
        getCloseButton().setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    private final void m47872a() {
        C9739f c9739f = new C9739f();
        DateTime a = DateTime.a().a(10);
        C2668g.a(a, "DateTime.now().plusHours(10)");
        getInfoView().bind(new C9735a(50, IntroPricingPaywallType.THREE_SKU, a, "$14.99", "$29.99", c9739f.m40251a()));
        getOffersView().bind(m47875b());
        TextView title = getTitle();
        C2668g.a(title, ManagerWebServices.PARAM_JOB_TITLE);
        C15828l c15828l = C15828l.f49033a;
        String string = getContext().getString(C9726f.intro_pricing_title);
        C2668g.a(string, "context.getString(R.string.intro_pricing_title)");
        Object[] objArr = new Object[]{Integer.valueOf(50)};
        string = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(string, "java.lang.String.format(format, *args)");
        title.setText(string);
    }

    /* renamed from: b */
    private final C9736b m47875b() {
        C11893b[] c11893bArr = new C11893b[3];
        c11893bArr[0] = new C11893b(new C9742c("1", 1, "Month", "$14.99", "$29.99", "$29.99"), false, 2, null);
        c11893bArr[1] = new C11893b(new C9742c("6", 6, "Months", "$8.99", "$18.83", "$112.98"), true);
        c11893bArr[2] = new C11893b(new C9742c("12", 12, "Months", "$6.49", "$12.98", "$155.76"), false, 2, null);
        List b = C19301m.b(c11893bArr);
        DateTime a = DateTime.a().a(10);
        C2668g.a(a, "DateTime.now().plusHours(10)");
        return new C9736b(a, "$112.98", "$18.83", b);
    }
}
