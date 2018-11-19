package com.tinder.intropricing.paywall.view.offers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.gold.C9684a;
import com.tinder.intropricing.C9728a.C9721a;
import com.tinder.intropricing.C9728a.C9722b;
import com.tinder.intropricing.C9728a.C9724d;
import com.tinder.paywall.view.itemsgroup.Bindable;
import com.tinder.paywall.view.itemsgroup.ItemViewModel;
import com.tinder.paywall.view.itemsgroup.OnItemSelectedListener;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR#\u0010\u0015\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0004¢\u0006\u0002\n\u0000R#\u0010\u0019\u001a\n \r*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u001e\u001a\n \r*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001f\u0010\u001cR#\u0010!\u001a\n \r*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b\"\u0010\u001cR#\u0010$\u001a\n \r*\u0004\u0018\u00010\u001a0\u001a8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b%\u0010\u001c¨\u0006)"}, d2 = {"Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/paywall/view/itemsgroup/Bindable;", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOfferViewModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "listener", "Lcom/tinder/paywall/view/itemsgroup/OnItemSelectedListener;", "(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/tinder/paywall/view/itemsgroup/OnItemSelectedListener;)V", "backgroundOutlineView", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "getBackgroundOutlineView", "()Landroid/view/ViewGroup;", "backgroundOutlineView$delegate", "Lkotlin/Lazy;", "backgroundView", "getBackgroundView", "backgroundView$delegate", "container", "getContainer", "container$delegate", "data", "offerLength", "Landroid/widget/TextView;", "getOfferLength", "()Landroid/widget/TextView;", "offerLength$delegate", "offerLengthName", "getOfferLengthName", "offerLengthName$delegate", "offerPrice", "getOfferPrice", "offerPrice$delegate", "offerPriceSubtitle", "getOfferPriceSubtitle", "offerPriceSubtitle$delegate", "bind", "", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.tinder.intropricing.paywall.view.offers.a */
public final class C11892a extends FrameLayout implements Bindable<C11893b> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38771a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C11892a.class), "backgroundView", "getBackgroundView()Landroid/view/ViewGroup;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11892a.class), "backgroundOutlineView", "getBackgroundOutlineView()Landroid/view/ViewGroup;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11892a.class), "container", "getContainer()Landroid/view/ViewGroup;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11892a.class), "offerLength", "getOfferLength()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11892a.class), "offerLengthName", "getOfferLengthName()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11892a.class), "offerPrice", "getOfferPrice()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(C11892a.class), "offerPriceSubtitle", "getOfferPriceSubtitle()Landroid/widget/TextView;"))};
    /* renamed from: b */
    private final Lazy f38772b;
    /* renamed from: c */
    private final Lazy f38773c;
    /* renamed from: d */
    private final Lazy f38774d;
    /* renamed from: e */
    private final Lazy f38775e;
    /* renamed from: f */
    private final Lazy f38776f;
    /* renamed from: g */
    private final Lazy f38777g;
    /* renamed from: h */
    private final Lazy f38778h;
    /* renamed from: i */
    private C11893b f38779i;
    /* renamed from: j */
    private final OnItemSelectedListener<C11893b> f38780j;

    private final ViewGroup getBackgroundOutlineView() {
        Lazy lazy = this.f38773c;
        KProperty kProperty = f38771a[1];
        return (ViewGroup) lazy.getValue();
    }

    private final ViewGroup getBackgroundView() {
        Lazy lazy = this.f38772b;
        KProperty kProperty = f38771a[0];
        return (ViewGroup) lazy.getValue();
    }

    private final ViewGroup getContainer() {
        Lazy lazy = this.f38774d;
        KProperty kProperty = f38771a[2];
        return (ViewGroup) lazy.getValue();
    }

    private final TextView getOfferLength() {
        Lazy lazy = this.f38775e;
        KProperty kProperty = f38771a[3];
        return (TextView) lazy.getValue();
    }

    private final TextView getOfferLengthName() {
        Lazy lazy = this.f38776f;
        KProperty kProperty = f38771a[4];
        return (TextView) lazy.getValue();
    }

    private final TextView getOfferPrice() {
        Lazy lazy = this.f38777g;
        KProperty kProperty = f38771a[5];
        return (TextView) lazy.getValue();
    }

    private final TextView getOfferPriceSubtitle() {
        Lazy lazy = this.f38778h;
        KProperty kProperty = f38771a[6];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ void bind(Object obj) {
        m47894a((C11893b) obj);
    }

    public /* synthetic */ C11892a(Context context, AttributeSet attributeSet, OnItemSelectedListener onItemSelectedListener, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet, onItemSelectedListener);
    }

    public C11892a(@NotNull Context context, @Nullable AttributeSet attributeSet, @NotNull OnItemSelectedListener<? super C11893b> onItemSelectedListener) {
        C2668g.b(context, "context");
        C2668g.b(onItemSelectedListener, "listener");
        super(context, attributeSet);
        this.f38780j = onItemSelectedListener;
        this.f38772b = C18451c.a((Function0) new IntroPricingOfferView$backgroundView$2(this));
        this.f38773c = C18451c.a((Function0) new IntroPricingOfferView$backgroundOutlineView$2(this));
        this.f38774d = C18451c.a((Function0) new IntroPricingOfferView$container$2(this));
        this.f38775e = C18451c.a((Function0) new IntroPricingOfferView$offerLength$2(this));
        this.f38776f = C18451c.a((Function0) new IntroPricingOfferView$offerLengthName$2(this));
        this.f38777g = C18451c.a((Function0) new IntroPricingOfferView$offerPrice$2(this));
        this.f38778h = C18451c.a((Function0) new IntroPricingOfferView$offerPriceSubtitle$2(this));
        FrameLayout.inflate(context, C9724d.intro_pricing_paywall_item, this);
        setLayoutParams((LayoutParams) new LinearLayout.LayoutParams(-1, -2));
        context = (int) context.getResources().getDimension(C9721a.space_xxs);
        setPadding(context, context, context, context);
        getContainer().setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                view = this.f38779i;
                if (view != null) {
                    this.f38780j.onItemSelected((ItemViewModel) view);
                }
            }
        });
    }

    /* renamed from: a */
    public void m47894a(@NotNull C11893b c11893b) {
        C2668g.b(c11893b, ManagerWebServices.FB_DATA);
        this.f38779i = c11893b;
        TextView offerPriceSubtitle = getOfferPriceSubtitle();
        C2668g.a(offerPriceSubtitle, "offerPriceSubtitle");
        C9684a.m40145a(offerPriceSubtitle, c11893b.m47898b());
        ViewGroup backgroundOutlineView;
        if (c11893b.m47898b()) {
            getBackgroundView().setBackgroundResource(C9722b.gold_background_selected);
            backgroundOutlineView = getBackgroundOutlineView();
            C2668g.a(backgroundOutlineView, "backgroundOutlineView");
            backgroundOutlineView.setVisibility(0);
        } else {
            getBackgroundView().setBackgroundResource(C9722b.gold_background_unselected);
            backgroundOutlineView = getBackgroundOutlineView();
            C2668g.a(backgroundOutlineView, "backgroundOutlineView");
            backgroundOutlineView.setVisibility(4);
        }
        c11893b = c11893b.m47897a();
        offerPriceSubtitle = getOfferLength();
        C2668g.a(offerPriceSubtitle, "offerLength");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(c11893b.m40253b());
        offerPriceSubtitle.setText(stringBuilder.toString());
        offerPriceSubtitle = getOfferLengthName();
        C2668g.a(offerPriceSubtitle, "offerLengthName");
        offerPriceSubtitle.setText(c11893b.m40254c());
        offerPriceSubtitle = getOfferPrice();
        C2668g.a(offerPriceSubtitle, "offerPrice");
        offerPriceSubtitle.setText(c11893b.m40255d());
    }
}
