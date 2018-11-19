package com.tinder.onboarding.repository;

import com.google.gson.annotations.SerializedName;
import com.tinder.onboarding.model.network.Field.Type;
import java.util.concurrent.Callable;

final /* synthetic */ class ag implements Callable {
    /* renamed from: a */
    private final Type f32836a;

    ag(Type type) {
        this.f32836a = type;
    }

    public Object call() {
        return ((SerializedName) this.f32836a.getClass().getField(this.f32836a.name()).getAnnotation(SerializedName.class)).value();
    }
}
