package com.tinder.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

@Deprecated
/* renamed from: com.tinder.utils.x */
public class C15375x {
    /* renamed from: a */
    private static final Gson f47645a = new Gson();

    @Deprecated
    /* renamed from: a */
    public static <T> T m57707a(String str, Class<T> cls) throws JsonSyntaxException {
        return f47645a.fromJson(str, cls);
    }

    /* renamed from: a */
    public static Gson m57706a() {
        return f47645a;
    }
}
