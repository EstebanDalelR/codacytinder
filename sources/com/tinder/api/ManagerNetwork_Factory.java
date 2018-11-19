package com.tinder.api;

import com.android.volley.RequestQueue;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ManagerNetwork_Factory implements Factory<ManagerNetwork> {
    private final Provider<RequestQueue> requestQueueProvider;

    public ManagerNetwork_Factory(Provider<RequestQueue> provider) {
        this.requestQueueProvider = provider;
    }

    public ManagerNetwork get() {
        return provideInstance(this.requestQueueProvider);
    }

    public static ManagerNetwork provideInstance(Provider<RequestQueue> provider) {
        return new ManagerNetwork((RequestQueue) provider.get());
    }

    public static ManagerNetwork_Factory create(Provider<RequestQueue> provider) {
        return new ManagerNetwork_Factory(provider);
    }

    public static ManagerNetwork newManagerNetwork(RequestQueue requestQueue) {
        return new ManagerNetwork(requestQueue);
    }
}
