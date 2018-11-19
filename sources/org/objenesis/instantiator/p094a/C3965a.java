package org.objenesis.instantiator.p094a;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* renamed from: org.objenesis.instantiator.a.a */
public class C3965a<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    private final Class<T> f12608a;
    /* renamed from: b */
    private final Method f12609b = C3965a.m15502a();

    public C3965a(Class<T> cls) {
        this.f12608a = cls;
    }

    public T newInstance() {
        try {
            return this.f12608a.cast(this.f12609b.invoke(null, new Object[]{this.f12608a, Object.class}));
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }

    /* renamed from: a */
    private static Method m15502a() {
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        } catch (Throwable e2) {
            throw new ObjenesisException(e2);
        }
    }
}
