package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;

public class LegacyMetaContainer<T> {
    private final T meta;

    public LegacyMetaContainer(@NonNull T t) {
        this.meta = t;
    }

    @NonNull
    public T getMeta() {
        return this.meta;
    }
}
