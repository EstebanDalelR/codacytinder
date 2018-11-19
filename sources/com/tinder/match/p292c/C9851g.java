package com.tinder.match.p292c;

import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.match.p293e.C9864c;
import com.tinder.match.provider.C12076a;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.viewmodel.C9889e;
import com.tinder.match.viewmodel.C9891i;
import com.tinder.module.ViewScope;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.tinder.match.c.g */
public class C9851g {
    @Provides
    /* renamed from: a */
    C9864c m40545a(C9889e c9889e) {
        return new C9864c(c9889e);
    }

    @Provides
    /* renamed from: a */
    C9891i m40547a(C9889e c9889e, FastMatchConfigProvider fastMatchConfigProvider, SubscriptionProvider subscriptionProvider) {
        return new C9891i(c9889e, fastMatchConfigProvider, subscriptionProvider);
    }

    @ViewScope
    @Provides
    /* renamed from: a */
    MatchesSearchQueryProvider m40546a() {
        return new C12076a();
    }
}
