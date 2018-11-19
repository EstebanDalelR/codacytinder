package com.tinder.paywall;

import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.PurchaseType;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.tinderplus.p428a.C15192e;
import java.text.NumberFormat;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.paywall.b */
public class C10052b {
    @NonNull
    /* renamed from: a */
    private final C15192e f32952a;

    @VisibleForTesting
    /* renamed from: a */
    double m41120a(double d, int i, double d2, int i2) {
        return 1.0d - ((d / ((double) i)) / (d2 / ((double) i2)));
    }

    @Inject
    C10052b(@NonNull C15192e c15192e) {
        this.f32952a = c15192e;
    }

    @NonNull
    /* renamed from: a */
    public String m41121a(@NonNull C14510e c14510e) {
        if (this.f32952a.d() && c14510e.b() == ProductType.PLUS) {
            return m41117b(c14510e);
        }
        return m41118c(c14510e);
    }

    @NonNull
    /* renamed from: b */
    private String m41117b(@NonNull C14510e c14510e) {
        C14509b g = c14510e.g();
        if (g == null) {
            return "";
        }
        double doubleValue = c14510e.d().b().doubleValue();
        return NumberFormat.getPercentInstance().format(1.0d - (g.c().b().doubleValue() / doubleValue));
    }

    @NonNull
    /* renamed from: c */
    private String m41118c(@NonNull C14510e c14510e) {
        double doubleValue = c14510e.j().b().doubleValue();
        double doubleValue2 = c14510e.d().b().doubleValue();
        int d = m41119d(c14510e);
        int intValue = c14510e.k().intValue();
        c14510e = NumberFormat.getPercentInstance();
        c14510e.setMinimumFractionDigits(0);
        return c14510e.format(m41120a(doubleValue2, d, doubleValue, intValue));
    }

    /* renamed from: d */
    private int m41119d(C14510e c14510e) {
        if (c14510e.c() == PurchaseType.SUBSCRIPTION) {
            return c14510e.e().length();
        }
        return c14510e.f().intValue();
    }
}
