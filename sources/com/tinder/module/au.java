package com.tinder.module;

import android.content.Context;
import com.tinder.api.TinderApi;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.billing.C14484a;
import com.tinder.purchase.billing.C16219b;
import com.tinder.purchase.domain.repository.C16229a;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.model.C14530a;
import com.tinder.purchase.model.C14531b;
import com.tinder.purchase.p373c.C14488a;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.purchase.register.Register;
import com.tinder.purchase.register.RegisterImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class au {
    @Singleton
    @Provides
    /* renamed from: a */
    Register m40785a(RegisterImpl registerImpl) {
        return registerImpl;
    }

    @Provides
    /* renamed from: b */
    BillerVersionCodeProvider m40787b(RegisterImpl registerImpl) {
        return registerImpl;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    OfferRepository m40783a() {
        return new C16229a();
    }

    @Singleton
    @Provides
    /* renamed from: b */
    C14531b m40786b() {
        return new C14531b();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C14530a m40784a(C14531b c14531b) {
        return new C14530a(c14531b);
    }

    @Singleton
    @Provides
    /* renamed from: c */
    C14484a m40788c() {
        return new C14484a();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    Biller m40781a(@ForApplication Context context, C14530a c14530a, C14484a c14484a) {
        return new C16219b(context, c14530a, c14484a);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C14488a m40782a(TinderApi tinderApi) {
        return new C14488a(tinderApi);
    }
}
