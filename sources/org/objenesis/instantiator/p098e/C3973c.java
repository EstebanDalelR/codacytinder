package org.objenesis.instantiator.p098e;

import java.lang.reflect.Field;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;
import sun.misc.Unsafe;

@Instantiator(Typology.STANDARD)
/* renamed from: org.objenesis.instantiator.e.c */
public class C3973c<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    private static Unsafe f12624a;
    /* renamed from: b */
    private final Class<T> f12625b;

    public C3973c(Class<T> cls) {
        if (f12624a == null) {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                try {
                    f12624a = (Unsafe) declaredField.get(null);
                } catch (Class<T> cls2) {
                    throw new ObjenesisException(cls2);
                }
            } catch (Class<T> cls22) {
                throw new ObjenesisException(cls22);
            }
        }
        this.f12625b = cls22;
    }

    public T newInstance() {
        try {
            return this.f12625b.cast(f12624a.allocateInstance(this.f12625b));
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }
}
