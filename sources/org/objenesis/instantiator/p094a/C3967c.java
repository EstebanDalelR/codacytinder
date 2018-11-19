package org.objenesis.instantiator.p094a;

import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* renamed from: org.objenesis.instantiator.a.c */
public class C3967c<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    private final Class<T> f12613a;
    /* renamed from: b */
    private final Method f12614b = C3967c.m15505a();
    /* renamed from: c */
    private final Long f12615c = C3967c.m15506b();

    public C3967c(Class<T> cls) {
        this.f12613a = cls;
    }

    public T newInstance() {
        try {
            return this.f12613a.cast(this.f12614b.invoke(null, new Object[]{this.f12613a, this.f12615c}));
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }

    /* renamed from: a */
    private static Method m15505a() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Long.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        } catch (Throwable e2) {
            throw new ObjenesisException(e2);
        }
    }

    /* renamed from: b */
    private static Long m15506b() {
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
            declaredMethod.setAccessible(true);
            return (Long) declaredMethod.invoke(null, new Object[]{Object.class});
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
