package com.tinder.intropricing.paywall.view.info;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.C6149a;
import com.tinder.intropricing.C9728a.C9724d;
import com.tinder.intropricing.C9728a.C9726f;
import com.tinder.intropricing.paywall.p266b.C9735a;
import com.tinder.intropricing.paywall.target.IntroPricingInfoTarget;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020%H\u0014J\b\u0010)\u001a\u00020%H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR#\u0010\u0014\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000eR#\u0010\u0017\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u000eR#\u0010\u001a\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001b\u0010\u000eR#\u0010\u001d\u001a\n \f*\u0004\u0018\u00010\u001e0\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\n \f*\u0004\u0018\u00010#0#X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tinder/intropricing/paywall/view/info/IntroPricingInfoView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/intropricing/paywall/target/IntroPricingInfoTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "introPricingDiscountedPrice", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getIntroPricingDiscountedPrice", "()Landroid/widget/TextView;", "introPricingDiscountedPrice$delegate", "Lkotlin/Lazy;", "introPricingExpirationTime", "getIntroPricingExpirationTime", "introPricingExpirationTime$delegate", "introPricingOriginalPrice", "getIntroPricingOriginalPrice", "introPricingOriginalPrice$delegate", "introPricingTOS", "getIntroPricingTOS", "introPricingTOS$delegate", "introPricingTOSTitle", "getIntroPricingTOSTitle", "introPricingTOSTitle$delegate", "perksList", "Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;", "getPerksList", "()Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;", "perksList$delegate", "unformattedTimerText", "", "bind", "", "introPricing", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingInfoViewModel;", "onAttachedToWindow", "onDetachedFromWindow", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
public final class IntroPricingInfoView extends LinearLayout implements IntroPricingInfoTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f38750a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingInfoView.class), "perksList", "getPerksList()Lcom/tinder/paywall/view/itemsgroup/ItemsGroupView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingInfoView.class), "introPricingOriginalPrice", "getIntroPricingOriginalPrice()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingInfoView.class), "introPricingDiscountedPrice", "getIntroPricingDiscountedPrice()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingInfoView.class), "introPricingTOS", "getIntroPricingTOS()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingInfoView.class), "introPricingTOSTitle", "getIntroPricingTOSTitle()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(IntroPricingInfoView.class), "introPricingExpirationTime", "getIntroPricingExpirationTime()Landroid/widget/TextView;"))};
    /* renamed from: b */
    private final Lazy f38751b;
    /* renamed from: c */
    private final Lazy f38752c;
    /* renamed from: d */
    private final Lazy f38753d;
    /* renamed from: e */
    private final Lazy f38754e;
    /* renamed from: f */
    private final Lazy f38755f;
    /* renamed from: g */
    private final Lazy f38756g;
    /* renamed from: h */
    private final String f38757h;
    /* renamed from: i */
    private CountDownTimer f38758i;

    private final TextView getIntroPricingDiscountedPrice() {
        Lazy lazy = this.f38753d;
        KProperty kProperty = f38750a[2];
        return (TextView) lazy.getValue();
    }

    private final TextView getIntroPricingExpirationTime() {
        Lazy lazy = this.f38756g;
        KProperty kProperty = f38750a[5];
        return (TextView) lazy.getValue();
    }

    private final TextView getIntroPricingOriginalPrice() {
        Lazy lazy = this.f38752c;
        KProperty kProperty = f38750a[1];
        return (TextView) lazy.getValue();
    }

    private final TextView getIntroPricingTOS() {
        Lazy lazy = this.f38754e;
        KProperty kProperty = f38750a[3];
        return (TextView) lazy.getValue();
    }

    private final TextView getIntroPricingTOSTitle() {
        Lazy lazy = this.f38755f;
        KProperty kProperty = f38750a[4];
        return (TextView) lazy.getValue();
    }

    private final ItemsGroupView getPerksList() {
        Lazy lazy = this.f38751b;
        KProperty kProperty = f38750a[0];
        return (ItemsGroupView) lazy.getValue();
    }

    public /* synthetic */ IntroPricingInfoView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public IntroPricingInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f38751b = C18451c.a((Function0) new IntroPricingInfoView$perksList$2(this));
        this.f38752c = C18451c.a((Function0) new IntroPricingInfoView$introPricingOriginalPrice$2(this));
        this.f38753d = C18451c.a((Function0) new IntroPricingInfoView$introPricingDiscountedPrice$2(this));
        this.f38754e = C18451c.a((Function0) new IntroPricingInfoView$introPricingTOS$2(this));
        this.f38755f = C18451c.a((Function0) new IntroPricingInfoView$introPricingTOSTitle$2(this));
        this.f38756g = C18451c.a((Function0) new IntroPricingInfoView$introPricingExpirationTime$2(this));
        this.f38757h = context.getString(C9726f.intro_pricing_discount_expiration);
        LinearLayout.inflate(context, C9724d.view_intro_pricing_info, this);
        setOrientation(1);
    }

    public void bind(@NotNull C9735a c9735a) {
        C2668g.b(c9735a, "introPricing");
        getPerksList().m48505a(new C11891b(c9735a.m40242e()));
        TextView introPricingOriginalPrice = getIntroPricingOriginalPrice();
        C2668g.a(introPricingOriginalPrice, "introPricingOriginalPrice");
        introPricingOriginalPrice.setText(c9735a.m40241d());
        introPricingOriginalPrice = getIntroPricingOriginalPrice();
        C2668g.a(introPricingOriginalPrice, "introPricingOriginalPrice");
        TextView introPricingOriginalPrice2 = getIntroPricingOriginalPrice();
        C2668g.a(introPricingOriginalPrice2, "introPricingOriginalPrice");
        introPricingOriginalPrice.setPaintFlags(introPricingOriginalPrice2.getPaintFlags() | 16);
        introPricingOriginalPrice = getIntroPricingDiscountedPrice();
        C2668g.a(introPricingOriginalPrice, "introPricingDiscountedPrice");
        C15828l c15828l = C15828l.f49033a;
        String string = getContext().getString(C9726f.intro_pricing_discounted_price);
        C2668g.a(string, "context.getString(R.stri…pricing_discounted_price)");
        Object[] objArr = new Object[]{c9735a.m40240c()};
        string = String.format(string, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(string, "java.lang.String.format(format, *args)");
        introPricingOriginalPrice.setText(string);
        switch (C9740a.f32353a[c9735a.m40238a().ordinal()]) {
            case 1:
                introPricingOriginalPrice = getIntroPricingTOS();
                C2668g.a(introPricingOriginalPrice, "introPricingTOS");
                c15828l = C15828l.f49033a;
                string = getContext().getString(C9726f.intro_pricing_tos_one_sku);
                C2668g.a(string, "context.getString(R.stri…ntro_pricing_tos_one_sku)");
                Object[] objArr2 = new Object[]{c9735a.m40241d()};
                string = String.format(string, Arrays.copyOf(objArr2, objArr2.length));
                C2668g.a(string, "java.lang.String.format(format, *args)");
                introPricingOriginalPrice.setText(string);
                break;
            case 2:
                introPricingOriginalPrice = getIntroPricingTOSTitle();
                C2668g.a(introPricingOriginalPrice, "introPricingTOSTitle");
                introPricingOriginalPrice.setVisibility(4);
                introPricingOriginalPrice = getIntroPricingTOS();
                C2668g.a(introPricingOriginalPrice, "introPricingTOS");
                introPricingOriginalPrice.setVisibility(4);
                break;
            default:
                break;
        }
        CountDownTimer countDownTimer = this.f38758i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c9735a = c9735a.m40239b();
        DateTime a = DateTime.a();
        C2668g.a(a, "DateTime.now()");
        c9735a = c9735a.c(a.getMillis());
        C2668g.a(c9735a, "introPricing.expirationT…us(DateTime.now().millis)");
        this.f38758i = new C6149a(c9735a.getMillis(), new IntroPricingInfoView$bind$1(this)).start();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        CountDownTimer countDownTimer = this.f38758i;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f38758i;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
