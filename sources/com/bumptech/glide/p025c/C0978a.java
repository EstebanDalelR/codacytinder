package com.bumptech.glide.p025c;

import android.content.Context;
import com.bumptech.glide.load.Key;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bumptech.glide.c.a */
public final class C0978a {
    /* renamed from: a */
    private static final ConcurrentHashMap<String, Key> f2664a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Key m3381a(Context context) {
        String packageName = context.getPackageName();
        Key key = (Key) f2664a.get(packageName);
        if (key != null) {
            return key;
        }
        key = C0978a.m3382b(context);
        Key key2 = (Key) f2664a.putIfAbsent(packageName, key);
        return key2 == null ? key : key2;
    }

    /* renamed from: b */
    private static Key m3382b(Context context) {
        try {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Context context2) {
            context2.printStackTrace();
            context2 = null;
        }
        if (context2 != null) {
            context2 = String.valueOf(context2.versionCode);
        } else {
            context2 = UUID.randomUUID().toString();
        }
        return new C3017c(context2);
    }
}
