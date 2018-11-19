package com.tinder.data.feed;

import com.tinder.domain.feed.model.FeedExperimentUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.feed.m */
public final class C12893m implements Factory<C8660k> {
    /* renamed from: a */
    private final Provider<FeedExperimentUtility> f41355a;

    public /* synthetic */ Object get() {
        return m50544a();
    }

    public C12893m(Provider<FeedExperimentUtility> provider) {
        this.f41355a = provider;
    }

    /* renamed from: a */
    public C8660k m50544a() {
        return C12893m.m50542a(this.f41355a);
    }

    /* renamed from: a */
    public static C8660k m50542a(Provider<FeedExperimentUtility> provider) {
        return new C8660k((FeedExperimentUtility) provider.get());
    }

    /* renamed from: b */
    public static C12893m m50543b(Provider<FeedExperimentUtility> provider) {
        return new C12893m(provider);
    }
}
