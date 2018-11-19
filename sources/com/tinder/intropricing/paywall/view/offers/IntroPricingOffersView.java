package com.tinder.intropricing.paywall.view.offers;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.C6149a;
import com.tinder.intropricing.C9728a.C9724d;
import com.tinder.intropricing.C9728a.C9726f;
import com.tinder.intropricing.paywall.p266b.C9736b;
import com.tinder.intropricing.paywall.target.IntroPricingOffersTarget;
import com.tinder.intropricing.paywall.view.offers.IntroPricingOffersAdapter.OnProductSelectedListener;
import com.tinder.paywall.view.itemsgroup.C10080a;
import com.tinder.paywall.view.itemsgroup.ItemsGroupView;
import java.util.Arrays;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0014J\b\u0010#\u001a\u00020\u001fH\u0014J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n \r*\u0004\u0018\u00010\u00150\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001a\u0010\u000fR\u0016\u0010\u001c\u001a\n \r*\u0004\u0018\u00010\u001d0\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/intropricing/paywall/target/IntroPricingOffersTarget;", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersAdapter$OnProductSelectedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "expirationTime", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getExpirationTime", "()Landroid/widget/TextView;", "expirationTime$delegate", "Lkotlin/Lazy;", "introPricingOffersAdapter", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingOffersAdapter;", "pricingOffersGroup", "Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;", "getPricingOffersGroup", "()Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;", "pricingOffersGroup$delegate", "renewCopy", "getRenewCopy", "renewCopy$delegate", "unformattedTimerText", "", "bind", "", "introPricing", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingOffersViewModel;", "onAttachedToWindow", "onDetachedFromWindow", "onProductSelected", "product", "Lcom/tinder/intropricing/paywall/view/offers/IntroPricingProduct;", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
public final class IntroPricingOffersView extends LinearLayout implements IntroPricingOffersTarget, OnProductSelectedListener {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38764a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingOffersView.class), "renewCopy", "getRenewCopy()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingOffersView.class), "expirationTime", "getExpirationTime()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingOffersView.class), "pricingOffersGroup", "getPricingOffersGroup()Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;"))};
    /* renamed from: b */
    private final Lazy f38765b;
    /* renamed from: c */
    private final Lazy f38766c;
    /* renamed from: d */
    private final Lazy f38767d;
    /* renamed from: e */
    private final String f38768e;
    /* renamed from: f */
    private final IntroPricingOffersAdapter f38769f;
    /* renamed from: g */
    private CountDownTimer f38770g;

    private final TextView getExpirationTime() {
        Lazy lazy = this.f38766c;
        KProperty kProperty = f38764a[1];
        return (TextView) lazy.getValue();
    }

    private final ItemsGroupView getPricingOffersGroup() {
        Lazy lazy = this.f38767d;
        KProperty kProperty = f38764a[2];
        return (ItemsGroupView) lazy.getValue();
    }

    private final TextView getRenewCopy() {
        Lazy lazy = this.f38765b;
        KProperty kProperty = f38764a[0];
        return (TextView) lazy.getValue();
    }

    public /* synthetic */ IntroPricingOffersView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public IntroPricingOffersView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38765b = C18451c.a((Function0) new IntroPricingOffersView$renewCopy$2(this));
        this.f38766c = C18451c.a((Function0) new IntroPricingOffersView$expirationTime$2(this));
        this.f38767d = C18451c.a((Function0) new IntroPricingOffersView$pricingOffersGroup$2(this));
        this.f38768e = context.getString(C9726f.intro_pricing_discount_expiration);
        this.f38769f = new IntroPricingOffersAdapter(this);
        LinearLayout.inflate(context, C9724d.view_intro_pricing_offers, this);
        setOrientation(1);
        getPricingOffersGroup().m48505a((C10080a) this.f38769f);
    }

    public void bind(@NotNull C9736b c9736b) {
        C2668g.b(c9736b, "introPricing");
        this.f38769f.m47889b(c9736b.m40246d());
        TextView renewCopy = getRenewCopy();
        C2668g.a(renewCopy, "renewCopy");
        C15828l c15828l = C15828l.f49033a;
        String string = getContext().getString(C9726f.intro_pricing_renew_copy);
        C2668g.a(string, "context.getString(R.stri…intro_pricing_renew_copy)");
        Object[] objArr = new Object[]{c9736b.m40244b(), c9736b.m40245c()};
        string = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(string, "java.lang.String.format(format, *args)");
        renewCopy.setText(string);
        CountDownTimer countDownTimer = this.f38770g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c9736b = c9736b.m40243a();
        DateTime a = DateTime.a();
        C2668g.a(a, "DateTime.now()");
        c9736b = c9736b.c(a.getMillis());
        C2668g.a(c9736b, "introPricing.expirationT…us(DateTime.now().millis)");
        this.f38770g = new C6149a(c9736b.getMillis(), new IntroPricingOffersView$bind$1(this)).start();
    }

    public void onProductSelected(@NotNull C9742c c9742c) {
        C2668g.b(c9742c, "product");
        TextView renewCopy = getRenewCopy();
        C2668g.a(renewCopy, "renewCopy");
        C15828l c15828l = C15828l.f49033a;
        String string = getContext().getString(C9726f.intro_pricing_renew_copy);
        C2668g.a(string, "context.getString(R.stri…intro_pricing_renew_copy)");
        Object[] objArr = new Object[]{c9742c.m40257f(), c9742c.m40256e()};
        c9742c = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(c9742c, "java.lang.String.format(format, *args)");
        renewCopy.setText((CharSequence) c9742c);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        CountDownTimer countDownTimer = this.f38770g;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f38770g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
