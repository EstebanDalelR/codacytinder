package com.foursquare.api.types;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.types.AutoValue_PilgrimStackTraceElement.GsonTypeAdapter;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
@RestrictTo({Scope.LIBRARY_GROUP})
public abstract class PilgrimStackTraceElement {

    interface Builder {
        @NonNull
        PilgrimStackTraceElement build();

        @NonNull
        Builder className(@Nullable String str);

        @NonNull
        Builder fileName(@Nullable String str);

        @NonNull
        Builder lineno(int i);

        @NonNull
        Builder method(@Nullable String str);
    }

    @Nullable
    public abstract String className();

    @Nullable
    public abstract String fileName();

    public abstract int lineno();

    @Nullable
    public abstract String method();

    public static PilgrimStackTraceElement create(@NonNull StackTraceElement stackTraceElement) {
        return new Builder().className(stackTraceElement.getClassName()).method(stackTraceElement.getMethodName()).fileName(stackTraceElement.getFileName()).lineno(stackTraceElement.getLineNumber()).build();
    }

    public static TypeAdapter<PilgrimStackTraceElement> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
