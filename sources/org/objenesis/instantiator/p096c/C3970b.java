package org.objenesis.instantiator.p096c;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;

/* renamed from: org.objenesis.instantiator.c.b */
public abstract class C3970b<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    static Method f12618a;
    /* renamed from: b */
    static ObjectInputStream f12619b;
    /* renamed from: c */
    protected final Class<T> f12620c;

    /* renamed from: a */
    private static void m15507a() {
        if (f12618a == null) {
            try {
                f12618a = ObjectInputStream.class.getDeclaredMethod("newObject", new Class[]{Class.class, Class.class});
                f12618a.setAccessible(true);
                f12619b = new b$a();
            } catch (Throwable e) {
                throw new ObjenesisException(e);
            } catch (Throwable e2) {
                throw new ObjenesisException(e2);
            } catch (Throwable e22) {
                throw new ObjenesisException(e22);
            }
        }
    }

    public C3970b(Class<T> cls) {
        this.f12620c = cls;
        C3970b.m15507a();
    }
}
