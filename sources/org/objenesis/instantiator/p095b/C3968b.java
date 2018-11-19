package org.objenesis.instantiator.p095b;

import java.lang.reflect.Constructor;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.NOT_COMPLIANT)
/* renamed from: org.objenesis.instantiator.b.b */
public class C3968b<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    protected Constructor<T> f12616a;

    public C3968b(Class<T> cls) {
        try {
            this.f12616a = cls.getDeclaredConstructor((Class[]) null);
        } catch (Class<T> cls2) {
            throw new ObjenesisException(cls2);
        }
    }

    public T newInstance() {
        try {
            return this.f12616a.newInstance((Object[]) null);
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }
}
