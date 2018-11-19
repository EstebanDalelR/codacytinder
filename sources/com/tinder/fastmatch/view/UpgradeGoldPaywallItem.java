package com.tinder.fastmatch.view;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.domain.common.model.TimeInterval;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.utils.RxUtils;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "itemPriceView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getItemPriceView", "()Landroid/widget/TextView;", "itemPriceView$delegate", "Lkotlin/Lazy;", "totalPriceView", "getTotalPriceView", "totalPriceView$delegate", "upgradeOffer", "Lcom/tinder/purchase/domain/model/Offer;", "bindView", "", "viewModel", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;", "getOffer", "ViewModel", "ViewModelFactory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class UpgradeGoldPaywallItem extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31553a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(UpgradeGoldPaywallItem.class), "itemPriceView", "getItemPriceView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(UpgradeGoldPaywallItem.class), "totalPriceView", "getTotalPriceView()Landroid/widget/TextView;"))};
    /* renamed from: b */
    private final Lazy f31554b = C18451c.a((Function0) new UpgradeGoldPaywallItem$itemPriceView$2(this));
    /* renamed from: c */
    private final Lazy f31555c = C18451c.a((Function0) new UpgradeGoldPaywallItem$totalPriceView$2(this));
    /* renamed from: d */
    private C14510e f31556d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;", "", "price", "", "totalPrice", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/purchase/domain/model/Offer;)V", "getOffer", "()Lcom/tinder/purchase/domain/model/Offer;", "getPrice", "()Ljava/lang/String;", "getTotalPrice", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.UpgradeGoldPaywallItem$a */
    public static final class C9415a {
        @NotNull
        /* renamed from: a */
        private final String f31546a;
        @NotNull
        /* renamed from: b */
        private final String f31547b;
        @NotNull
        /* renamed from: c */
        private final C14510e f31548c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9415a) {
                    C9415a c9415a = (C9415a) obj;
                    if (C2668g.a(this.f31546a, c9415a.f31546a) && C2668g.a(this.f31547b, c9415a.f31547b) && C2668g.a(this.f31548c, c9415a.f31548c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f31546a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f31547b;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C14510e c14510e = this.f31548c;
            if (c14510e != null) {
                i = c14510e.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewModel(price=");
            stringBuilder.append(this.f31546a);
            stringBuilder.append(", totalPrice=");
            stringBuilder.append(this.f31547b);
            stringBuilder.append(", offer=");
            stringBuilder.append(this.f31548c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9415a(@NotNull String str, @NotNull String str2, @NotNull C14510e c14510e) {
            C2668g.b(str, "price");
            C2668g.b(str2, "totalPrice");
            C2668g.b(c14510e, "offer");
            this.f31546a = str;
            this.f31547b = str2;
            this.f31548c = c14510e;
        }

        @NotNull
        /* renamed from: a */
        public final String m39368a() {
            return this.f31546a;
        }

        @NotNull
        /* renamed from: b */
        public final String m39369b() {
            return this.f31547b;
        }

        @NotNull
        /* renamed from: c */
        public final C14510e m39370c() {
            return this.f31548c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModelFactory;", "", "application", "Landroid/app/Application;", "biller", "Lcom/tinder/purchase/billing/Biller;", "(Landroid/app/Application;Lcom/tinder/purchase/billing/Biller;)V", "month", "", "numberFormat", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "total", "createViewModel", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;", "upgradeOffer", "Lcom/tinder/purchase/domain/model/Offer;", "offer", "createViewModelFrom", "Lrx/Single;", "skuId", "formatTotalPrice", "formatUpgradePrice", "setCurrency", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.view.UpgradeGoldPaywallItem$b */
    public static final class C9416b {
        /* renamed from: a */
        private final String f31549a;
        /* renamed from: b */
        private final String f31550b;
        /* renamed from: c */
        private final NumberFormat f31551c = NumberFormat.getCurrencyInstance();
        /* renamed from: d */
        private final Biller f31552d;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.view.UpgradeGoldPaywallItem$b$a */
        static final class C13211a<T, R> implements Func1<C14516k, Boolean> {
            /* renamed from: a */
            public static final C13211a f41924a = new C13211a();

            C13211a() {
            }

            /* renamed from: a */
            public final boolean m51201a(@Nullable C14516k c14516k) {
                return c14516k != null;
            }

            public /* synthetic */ Object call(Object obj) {
                return Boolean.valueOf(m51201a((C14516k) obj));
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/purchase/domain/model/Price;", "priceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.view.UpgradeGoldPaywallItem$b$b */
        static final class C13212b<T, R> implements Func1<T, R> {
            /* renamed from: a */
            final /* synthetic */ String f41925a;

            C13212b(String str) {
                this.f41925a = str;
            }

            public /* synthetic */ Object call(Object obj) {
                return m51202a((C14516k) obj);
            }

            @Nullable
            /* renamed from: a */
            public final C14514j m51202a(C14516k c14516k) {
                return c14516k.a(this.f41925a);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "price", "Lcom/tinder/purchase/domain/model/Price;", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.view.UpgradeGoldPaywallItem$b$c */
        static final class C13213c<T, R> implements Func1<T, R> {
            /* renamed from: a */
            final /* synthetic */ C14510e f41926a;

            C13213c(C14510e c14510e) {
                this.f41926a = c14510e;
            }

            public /* synthetic */ Object call(Object obj) {
                return Double.valueOf(m51203a((C14514j) obj));
            }

            /* renamed from: a */
            public final double m51203a(@Nullable C14514j c14514j) {
                if (c14514j != null) {
                    double doubleValue = this.f41926a.d().b().doubleValue();
                    c14514j = c14514j.b();
                    C2668g.a(c14514j, "it.amount()");
                    return doubleValue - c14514j.doubleValue();
                }
                c14514j = this.f41926a.d().b();
                C2668g.a(c14514j, "upgradeOffer.price().amount()");
                return c14514j.doubleValue();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;", "upgradePrice", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Double;)Lcom/tinder/fastmatch/view/UpgradeGoldPaywallItem$ViewModel;"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.view.UpgradeGoldPaywallItem$b$d */
        static final class C13214d<T, R> implements Func1<T, R> {
            /* renamed from: a */
            final /* synthetic */ C9416b f41927a;
            /* renamed from: b */
            final /* synthetic */ C14510e f41928b;

            C13214d(C9416b c9416b, C14510e c14510e) {
                this.f41927a = c9416b;
                this.f41928b = c14510e;
            }

            public /* synthetic */ Object call(Object obj) {
                return m51204a((Double) obj);
            }

            @NotNull
            /* renamed from: a */
            public final C9415a m51204a(Double d) {
                TimeInterval e = this.f41928b.e();
                double doubleValue = d.doubleValue() / ((double) (e != null ? e.length() : 1));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(this.f41927a.f31551c.format(doubleValue));
                stringBuilder.append(' ');
                stringBuilder.append(this.f41927a.f31550b);
                return new C9415a(stringBuilder.toString(), this.f41927a.m39372a(this.f41928b), this.f41928b);
            }
        }

        @Inject
        public C9416b(@NotNull Application application, @NotNull Biller biller) {
            C2668g.b(application, "application");
            C2668g.b(biller, "biller");
            this.f31552d = biller;
            biller = this.f31551c;
            C2668g.a(biller, "numberFormat");
            biller.setMinimumFractionDigits(2);
            biller = application.getResources().getString(R.string.total);
            C2668g.a(biller, "application.resources.getString(R.string.total)");
            this.f31549a = biller;
            application = application.getResources().getString(R.string.plus_paywall_per_month);
            C2668g.a(application, "application.resources.ge…g.plus_paywall_per_month)");
            this.f31550b = application;
        }

        @NotNull
        /* renamed from: a */
        public final C9415a m39377a(@NotNull C14510e c14510e, @NotNull C14510e c14510e2) {
            C2668g.b(c14510e, "upgradeOffer");
            C2668g.b(c14510e2, "offer");
            m39376b(c14510e);
            return new C9415a(m39375b(c14510e, c14510e2), m39372a(c14510e), c14510e);
        }

        @NotNull
        /* renamed from: a */
        public final Single<C9415a> m39378a(@NotNull C14510e c14510e, @NotNull String str) {
            C2668g.b(c14510e, "upgradeOffer");
            C2668g.b(str, "skuId");
            m39376b(c14510e);
            Biller biller = this.f31552d;
            List singletonList = Collections.singletonList(str);
            C2668g.a(singletonList, "Collections.singletonList(skuId)");
            c14510e = biller.loadPriceListing(singletonList).a().a(RxUtils.a()).f(C13211a.f41924a).h().k(new C13212b(str)).k(new C13213c(c14510e)).k(new C13214d(this, c14510e)).a();
            C2668g.a(c14510e, "biller.loadPriceListing(…              .toSingle()");
            return c14510e;
        }

        /* renamed from: b */
        private final String m39375b(C14510e c14510e, C14510e c14510e2) {
            TimeInterval e = c14510e.e();
            int length = e != null ? e.length() : 1;
            double doubleValue = c14510e.d().b().doubleValue();
            c14510e = c14510e2.d().b();
            C2668g.a(c14510e, "offer.price().amount()");
            doubleValue = (doubleValue - c14510e.doubleValue()) / ((double) length);
            c14510e = new StringBuilder();
            c14510e.append("");
            c14510e.append(this.f31551c.format(doubleValue));
            c14510e.append(' ');
            c14510e.append(this.f31550b);
            return c14510e.toString();
        }

        /* renamed from: a */
        private final String m39372a(C14510e c14510e) {
            TimeInterval e = c14510e.e();
            double doubleValue = c14510e.d().b().doubleValue() / ((double) (e != null ? e.length() : 1));
            c14510e = new StringBuilder();
            c14510e.append("");
            c14510e.append(this.f31549a);
            c14510e.append(' ');
            c14510e.append(this.f31551c.format(doubleValue));
            c14510e.append(' ');
            c14510e.append(this.f31550b);
            return c14510e.toString();
        }

        /* renamed from: b */
        private final void m39376b(C14510e c14510e) {
            c14510e = Currency.getInstance(c14510e.d().a());
            NumberFormat numberFormat = this.f31551c;
            C2668g.a(numberFormat, "numberFormat");
            numberFormat.setCurrency(c14510e);
        }
    }

    private final TextView getItemPriceView() {
        Lazy lazy = this.f31554b;
        KProperty kProperty = f31553a[0];
        return (TextView) lazy.getValue();
    }

    private final TextView getTotalPriceView() {
        Lazy lazy = this.f31555c;
        KProperty kProperty = f31553a[1];
        return (TextView) lazy.getValue();
    }

    public UpgradeGoldPaywallItem(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.upgrade_gold_paywall_item, this);
    }

    /* renamed from: a */
    public final void m39379a(@NotNull C9415a c9415a) {
        C2668g.b(c9415a, "viewModel");
        TextView itemPriceView = getItemPriceView();
        C2668g.a(itemPriceView, "itemPriceView");
        itemPriceView.setText(c9415a.m39368a());
        itemPriceView = getTotalPriceView();
        C2668g.a(itemPriceView, "totalPriceView");
        itemPriceView.setText(c9415a.m39369b());
        this.f31556d = c9415a.m39370c();
    }

    @Nullable
    public final C14510e getOffer() {
        return this.f31556d;
    }
}
