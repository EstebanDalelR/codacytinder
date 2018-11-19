package org.objenesis.instantiator.p096c;

import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.STANDARD)
/* renamed from: org.objenesis.instantiator.c.a */
public class C4308a<T> extends C3970b<T> {
    public C4308a(Class<T> cls) {
        super(cls);
    }

    public T newInstance() {
        try {
            return this.c.cast(a.invoke(b, new Object[]{this.c, Object.class}));
        } catch (Throwable e) {
            throw new ObjenesisException(e);
        } catch (Throwable e2) {
            throw new ObjenesisException(e2);
        } catch (Throwable e22) {
            throw new ObjenesisException(e22);
        }
    }
}
