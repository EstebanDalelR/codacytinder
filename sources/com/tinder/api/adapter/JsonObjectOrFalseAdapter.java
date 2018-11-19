package com.tinder.api.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.tinder.api.annotation.JsonObjectOrFalse;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Set;

public class JsonObjectOrFalseAdapter<T> extends JsonAdapter<T> {
    @NonNull
    private final JsonAdapter<T> moshiJsonAdapter;

    public static class Factory implements com.squareup.moshi.JsonAdapter.Factory {
        @NonNull
        private final com.squareup.moshi.JsonAdapter.Factory moshiAdapterFactory;

        @NonNull
        public static Factory create(com.squareup.moshi.JsonAdapter.Factory factory) {
            return new Factory(factory);
        }

        private Factory(com.squareup.moshi.JsonAdapter.Factory factory) {
            this.moshiAdapterFactory = factory;
        }

        @Nullable
        public JsonAdapter<?> create(@NonNull Type type, @NonNull Set<? extends Annotation> set, @NonNull C5987p c5987p) {
            if (isAnnotated(set) == null) {
                return null;
            }
            type = this.moshiAdapterFactory.create(type, Collections.emptySet(), c5987p);
            if (type == null) {
                return null;
            }
            return new JsonObjectOrFalseAdapter(type);
        }

        private boolean isAnnotated(@NonNull Set<? extends Annotation> set) {
            for (Annotation annotationType : set) {
                if (annotationType.annotationType().equals(JsonObjectOrFalse.class)) {
                    return true;
                }
            }
            return null;
        }
    }

    private JsonObjectOrFalseAdapter(@NonNull JsonAdapter<T> jsonAdapter) {
        this.moshiJsonAdapter = jsonAdapter;
    }

    @Nullable
    public T fromJson(@NonNull JsonReader jsonReader) throws IOException {
        StringBuilder stringBuilder;
        switch (jsonReader.mo6454h()) {
            case BOOLEAN:
                if (jsonReader.mo6457k() == null) {
                    return null;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Fields annotated with @");
                stringBuilder.append(JsonObjectOrFalse.class.getSimpleName());
                stringBuilder.append(" cannot be true");
                throw new IOException(stringBuilder.toString());
            case BEGIN_OBJECT:
                return this.moshiJsonAdapter.fromJson(jsonReader);
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Fields annotated with @");
                stringBuilder.append(JsonObjectOrFalse.class.getSimpleName());
                stringBuilder.append(" can either be an Object or false");
                throw new IOException(stringBuilder.toString());
        }
    }

    public void toJson(@NonNull C5983k c5983k, @Nullable T t) throws IOException {
        this.moshiJsonAdapter.toJson(c5983k, (Object) t);
    }
}
