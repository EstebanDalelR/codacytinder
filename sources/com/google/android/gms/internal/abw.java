package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

final class abw implements acp {
    /* renamed from: a */
    private static final abw f22884a = new abw();
    /* renamed from: b */
    private final Map<Class<?>, Method> f22885b = new HashMap();

    private abw() {
    }

    /* renamed from: a */
    public static abw m27015a() {
        return f22884a;
    }

    /* renamed from: a */
    public final boolean mo4196a(Class<?> cls) {
        return zzffu.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final aco mo4197b(Class<?> cls) {
        if (zzffu.class.isAssignableFrom(cls)) {
            try {
                Method method = (Method) this.f22885b.get(cls);
                if (method == null) {
                    method = cls.getDeclaredMethod("buildMessageInfo", new Class[0]);
                    method.setAccessible(true);
                    this.f22885b.put(cls, method);
                }
                return (aco) method.invoke(null, new Object[0]);
            } catch (Throwable e) {
                String str = "Unable to get message info for ";
                String valueOf = String.valueOf(cls.getName());
                throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            }
        }
        String str2 = "Unsupported message type: ";
        valueOf = String.valueOf(cls.getName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
