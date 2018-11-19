package com.tinder.recs.usecase;

import com.tinder.api.TinderApi;
import com.tinder.superlike.p421e.C15082f;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteSuperLike_Factory implements Factory<DeleteSuperLike> {
    private final Provider<C15082f> superlikeStatusProvider;
    private final Provider<TinderApi> tinderApiProvider;

    public DeleteSuperLike_Factory(Provider<TinderApi> provider, Provider<C15082f> provider2) {
        this.tinderApiProvider = provider;
        this.superlikeStatusProvider = provider2;
    }

    public DeleteSuperLike get() {
        return provideInstance(this.tinderApiProvider, this.superlikeStatusProvider);
    }

    public static DeleteSuperLike provideInstance(Provider<TinderApi> provider, Provider<C15082f> provider2) {
        return new DeleteSuperLike((TinderApi) provider.get(), (C15082f) provider2.get());
    }

    public static DeleteSuperLike_Factory create(Provider<TinderApi> provider, Provider<C15082f> provider2) {
        return new DeleteSuperLike_Factory(provider, provider2);
    }

    public static DeleteSuperLike newDeleteSuperLike(TinderApi tinderApi, C15082f c15082f) {
        return new DeleteSuperLike(tinderApi, c15082f);
    }
}
