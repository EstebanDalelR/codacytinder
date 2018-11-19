package com.tinder.api;

import dagger.internal.Factory;

public final class ResponseCodeRequest_Factory_Factory implements Factory<ResponseCodeRequest.Factory> {
    private static final ResponseCodeRequest_Factory_Factory INSTANCE = new ResponseCodeRequest_Factory_Factory();

    public ResponseCodeRequest.Factory get() {
        return provideInstance();
    }

    public static ResponseCodeRequest.Factory provideInstance() {
        return new ResponseCodeRequest.Factory();
    }

    public static ResponseCodeRequest_Factory_Factory create() {
        return INSTANCE;
    }

    public static ResponseCodeRequest.Factory newFactory() {
        return new ResponseCodeRequest.Factory();
    }
}
