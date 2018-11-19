package org.objenesis.instantiator.p098e;

import java.lang.reflect.Constructor;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* renamed from: org.objenesis.instantiator.e.b */
public class C3972b<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    private final Constructor<T> f12623a;

    public C3972b(Class<T> cls) {
        this.f12623a = C19350a.a(cls, C3972b.m15508a());
        this.f12623a.setAccessible(true);
    }

    public T newInstance() {
        try {
            return this.f12623a.newInstance((Object[]) null);
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }

    /* renamed from: a */
    private static Constructor<Object> m15508a() {
        try {
            return Object.class.getConstructor((Class[]) null);
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }
}
