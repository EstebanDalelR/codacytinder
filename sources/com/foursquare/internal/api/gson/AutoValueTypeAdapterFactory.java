package com.foursquare.internal.api.gson;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.google.gson.TypeAdapterFactory;

@RestrictTo({Scope.LIBRARY})
public abstract class AutoValueTypeAdapterFactory implements TypeAdapterFactory {
    @NonNull
    /* renamed from: a */
    public static TypeAdapterFactory m13275a() {
        return new AutoValueGson_AutoValueTypeAdapterFactory();
    }
}
