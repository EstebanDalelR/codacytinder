package org.objenesis.instantiator.p097d;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* renamed from: org.objenesis.instantiator.d.a */
public class C3971a<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    private final Method f12621a;
    /* renamed from: b */
    private final Object[] f12622b = new Object[]{null, Boolean.FALSE};

    public C3971a(Class<T> cls) {
        this.f12622b[0] = cls;
        try {
            this.f12621a = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Boolean.TYPE});
            this.f12621a.setAccessible(true);
        } catch (Class<T> cls2) {
            throw new ObjenesisException(cls2);
        } catch (Class<T> cls22) {
            throw new ObjenesisException(cls22);
        }
    }

    public T newInstance() {
        try {
            return this.f12621a.invoke(null, this.f12622b);
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        }
    }
}
