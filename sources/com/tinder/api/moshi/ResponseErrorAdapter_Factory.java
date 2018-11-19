package com.tinder.api.moshi;

import com.squareup.moshi.C5987p;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ResponseErrorAdapter_Factory implements Factory<ResponseErrorAdapter> {
    private final Provider<C5987p> moshiProvider;

    public ResponseErrorAdapter_Factory(Provider<C5987p> provider) {
        this.moshiProvider = provider;
    }

    public ResponseErrorAdapter get() {
        return provideInstance(this.moshiProvider);
    }

    public static ResponseErrorAdapter provideInstance(Provider<C5987p> provider) {
        return new ResponseErrorAdapter((C5987p) provider.get());
    }

    public static ResponseErrorAdapter_Factory create(Provider<C5987p> provider) {
        return new ResponseErrorAdapter_Factory(provider);
    }

    public static ResponseErrorAdapter newResponseErrorAdapter(C5987p c5987p) {
        return new ResponseErrorAdapter(c5987p);
    }
}
