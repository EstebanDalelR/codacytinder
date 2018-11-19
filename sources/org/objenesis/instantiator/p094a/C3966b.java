package org.objenesis.instantiator.p094a;

import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* renamed from: org.objenesis.instantiator.a.b */
public class C3966b<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    private final Class<T> f12610a;
    /* renamed from: b */
    private final Method f12611b = C3966b.m15503a();
    /* renamed from: c */
    private final Integer f12612c = C3966b.m15504b();

    public C3966b(Class<T> cls) {
        this.f12610a = cls;
    }

    public T newInstance() {
        try {
            return this.f12610a.cast(this.f12611b.invoke(null, new Object[]{this.f12610a, this.f12612c}));
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }

    /* renamed from: a */
    private static Method m15503a() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        } catch (Throwable e2) {
            throw new ObjenesisException(e2);
        }
    }

    /* renamed from: b */
    private static Integer m15504b() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
            declaredMethod.setAccessible(true);
            return (Integer) declaredMethod.invoke(null, new Object[]{Object.class});
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        } catch (Throwable e2) {
            throw new ObjenesisException(e2);
        } catch (Throwable e22) {
            throw new ObjenesisException(e22);
        } catch (Throwable e222) {
            throw new ObjenesisException(e222);
        }
    }
}
