package com.foursquare.internal.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.internal.api.gson.AutoValueTypeAdapterFactory;
import com.foursquare.internal.api.gson.GroupTypeAdapterFactory;
import com.foursquare.internal.api.gson.PhotoTypeAdapterFactory;
import com.foursquare.internal.api.gson.ResponseV2TypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.Reader;
import java.lang.reflect.Type;

/* renamed from: com.foursquare.internal.api.a */
public class C1913a {
    /* renamed from: a */
    private static Gson f5132a;

    /* renamed from: a */
    public static Gson m6647a() {
        if (f5132a == null) {
            f5132a = new GsonBuilder().registerTypeAdapterFactory(new GroupTypeAdapterFactory()).registerTypeAdapterFactory(new PhotoTypeAdapterFactory()).registerTypeAdapterFactory(new ResponseV2TypeAdapterFactory()).registerTypeAdapterFactory(AutoValueTypeAdapterFactory.m13275a()).create();
        }
        return f5132a;
    }

    /* renamed from: a */
    public static <T> T m6650a(String str, Class<T> cls) {
        return C1913a.m6651a(str, (Type) cls);
    }

    /* renamed from: a */
    public static <T> T m6649a(String str, TypeToken<T> typeToken) {
        return C1913a.m6651a(str, typeToken.getType());
    }

    /* renamed from: a */
    private static <T> T m6651a(String str, Type type) {
        try {
            return C1913a.m6647a().fromJson(str, type);
        } catch (String str2) {
            throw new IllegalStateException(str2);
        }
    }

    /* renamed from: a */
    public static <T> T m6648a(Reader reader, Type type) {
        try {
            return C1913a.m6647a().fromJson(reader, type);
        } catch (Reader reader2) {
            throw new IllegalStateException(reader2);
        }
    }

    /* renamed from: a */
    public static String m6652a(Object obj) {
        try {
            return C1913a.m6647a().toJson(obj);
        } catch (Object obj2) {
            throw new IllegalStateException(obj2);
        }
    }

    /* renamed from: a */
    public static <T> String m6653a(T t, TypeToken<T> typeToken) {
        try {
            return C1913a.m6647a().toJson(t, typeToken.getType());
        } catch (T t2) {
            throw new IllegalStateException(t2);
        }
    }

    /* renamed from: a */
    public static void m6654a(@Nullable Object obj, @NonNull Type type, @NonNull JsonWriter jsonWriter) {
        try {
            C1913a.m6647a().toJson(obj, type, jsonWriter);
        } catch (Object obj2) {
            throw new IllegalStateException(obj2);
        }
    }
}
