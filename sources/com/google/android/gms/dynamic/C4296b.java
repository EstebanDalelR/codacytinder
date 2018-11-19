package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.b */
public final class C4296b<T> extends C3828a {
    /* renamed from: a */
    private final T f13994a;

    private C4296b(T t) {
        this.f13994a = t;
    }

    /* renamed from: a */
    public static <T> IObjectWrapper m17261a(T t) {
        return new C4296b(t);
    }

    /* renamed from: a */
    public static <T> T m17262a(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof C4296b) {
            return ((C4296b) iObjectWrapper).f13994a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
            stringBuilder.append(length);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}
