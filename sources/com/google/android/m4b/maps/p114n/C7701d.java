package com.google.android.m4b.maps.p114n;

import com.google.android.m4b.maps.p114n.C5484b.C6735a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.m4b.maps.n.d */
public final class C7701d<T> extends C6735a {
    /* renamed from: a */
    private final T f28172a;

    private C7701d(T t) {
        this.f28172a = t;
    }

    /* renamed from: a */
    public static <T> C5484b m33407a(T t) {
        return new C7701d(t);
    }

    /* renamed from: a */
    public static <T> T m33408a(C5484b c5484b) {
        if (c5484b instanceof C7701d) {
            return ((C7701d) c5484b).f28172a;
        }
        c5484b = c5484b.asBinder();
        Field[] declaredFields = c5484b.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(c5484b);
            } catch (C5484b c5484b2) {
                throw new IllegalArgumentException("Binder object is null.", c5484b2);
            } catch (C5484b c5484b22) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", c5484b22);
            } catch (C5484b c5484b222) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", c5484b222);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
