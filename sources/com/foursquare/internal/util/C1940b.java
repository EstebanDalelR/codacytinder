package com.foursquare.internal.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.data.file.CachedFile;
import com.foursquare.pilgrim.PilgrimSdk;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;

/* renamed from: com.foursquare.internal.util.b */
public final class C1940b {
    /* renamed from: a */
    private static final String f5220a = "b";
    /* renamed from: b */
    private static final HashMap<String, Object> f5221b = new HashMap();
    /* renamed from: c */
    private static final Object f5222c = new Object();
    /* renamed from: d */
    private static boolean f5223d;
    /* renamed from: e */
    private static byte[] f5224e;

    /* renamed from: a */
    public static void m6818a(boolean z, byte[] bArr) {
        f5223d = z;
        f5224e = bArr;
    }

    /* renamed from: a */
    private static Object m6814a(String str) {
        synchronized (f5222c) {
            if (!f5221b.containsKey(str)) {
                f5221b.put(str, new Object());
            }
        }
        return f5221b.get(str);
    }

    /* renamed from: a */
    public static void m6817a(Context context, String str, int i, String str2, boolean z) {
        try {
            synchronized (C1940b.m6814a(str)) {
                if (z) {
                    str2 = C1944f.m6830a(f5224e, str2);
                }
                new CachedFile(str, i).m6673a(context, str2);
            }
        } catch (Context context2) {
            if (f5223d != 0) {
                i = PilgrimSdk.get();
                str2 = LogLevel.ERROR;
                z = new StringBuilder();
                z.append("Error saving cached file [");
                z.append(str);
                z.append("].");
                i.log(str2, z.toString(), context2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m6820a(@NonNull Context context, @NonNull String str, int i, @Nullable Object obj, @NonNull Type type) {
        try {
            synchronized (C1940b.m6814a(str)) {
                new CachedFile(str, i).m6672a(context, obj, type);
            }
            return true;
        } catch (Context context2) {
            if (f5223d != 0) {
                i = PilgrimSdk.get();
                obj = LogLevel.ERROR;
                type = new StringBuilder();
                type.append("Error saving cached file [");
                type.append(str);
                type.append("].");
                i.log(obj, type.toString(), context2);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m6813a(Context context, String str, int i, TypeToken<T> typeToken, boolean z) {
        if (!z) {
            return C1940b.m6812a(context, str, i, (TypeToken) typeToken);
        }
        try {
            return C1913a.m6649a(C1940b.m6815a(context, str, i, z), (TypeToken) typeToken);
        } catch (Context context2) {
            i = PilgrimSdk.get();
            typeToken = LogLevel.ERROR;
            z = new StringBuilder();
            z.append("Error loading cached file: ");
            z.append(str);
            i.log(typeToken, z.toString(), context2);
            return null;
        }
    }

    /* renamed from: a */
    public static String m6815a(Context context, String str, int i, boolean z) {
        return C1940b.m6816a(context, str, i, z, false);
    }

    /* renamed from: a */
    public static String m6816a(Context context, String str, int i, boolean z, boolean z2) {
        try {
            synchronized (C1940b.m6814a(str)) {
                try {
                    context = new CachedFile(str, i).m6671a(context);
                } catch (Context context2) {
                    if (z2) {
                        PilgrimSdk.get().log(LogLevel.ERROR, "Mismatched file version, recovering unique device", context2);
                        context2 = context2.m6669a();
                    } else {
                        context2 = null;
                    }
                }
                if (z && TextUtils.isEmpty(context2) == 0) {
                    context2 = C1944f.m6832b(f5224e, (String) context2);
                }
            }
            return context2;
        } catch (Context context22) {
            i = PilgrimSdk.get();
            z = LogLevel.ERROR;
            z2 = new StringBuilder();
            z2.append("Error loading cached file [");
            z2.append(str);
            z2.append("].");
            i.log(z, z2.toString(), context22);
            return null;
        }
    }

    /* renamed from: a */
    private static <T> T m6812a(Context context, String str, int i, TypeToken<T> typeToken) {
        try {
            synchronized (C1940b.m6814a(str)) {
                try {
                    context = new CachedFile(str, i).m6670a(context, typeToken.getType());
                } catch (Context context2) {
                    PilgrimSdk.get().log(LogLevel.ERROR, "Mismatched file version", context2);
                    context2 = null;
                }
            }
            return context2;
        } catch (Context context22) {
            i = PilgrimSdk.get();
            typeToken = LogLevel.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error loading cached file [");
            stringBuilder.append(str);
            stringBuilder.append("].");
            i.log(typeToken, stringBuilder.toString(), context22);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m6819a(Context context, String str) {
        try {
            return context.deleteFile(str);
        } catch (Context context2) {
            PilgrimSdk pilgrimSdk = PilgrimSdk.get();
            LogLevel logLevel = LogLevel.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error deleting cached file [");
            stringBuilder.append(str);
            stringBuilder.append("]");
            pilgrimSdk.log(logLevel, stringBuilder.toString(), context2);
            return null;
        }
    }
}
