package com.tinder.model.network;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ErrorResponseConverter_Factory implements Factory<ErrorResponseConverter> {
    private final Provider<Gson> gsonProvider;

    public ErrorResponseConverter_Factory(Provider<Gson> provider) {
        this.gsonProvider = provider;
    }

    public ErrorResponseConverter get() {
        return provideInstance(this.gsonProvider);
    }

    public static ErrorResponseConverter provideInstance(Provider<Gson> provider) {
        return new ErrorResponseConverter((Gson) provider.get());
    }

    public static ErrorResponseConverter_Factory create(Provider<Gson> provider) {
        return new ErrorResponseConverter_Factory(provider);
    }

    public static ErrorResponseConverter newErrorResponseConverter(Gson gson) {
        return new ErrorResponseConverter(gson);
    }
}
