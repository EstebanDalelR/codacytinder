package com.tinder.api.moshi;

import com.squareup.moshi.JsonAdapter.Factory;

public abstract class TinderMoshiAdapterFactory implements Factory {
    public static Factory create() {
        return new AutoValueMoshi_TinderMoshiAdapterFactory();
    }
}
