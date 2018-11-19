package org.objenesis.instantiator.p095b;

import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.NOT_COMPLIANT)
/* renamed from: org.objenesis.instantiator.b.a */
public class C4307a<T> extends C3968b<T> {
    public C4307a(Class<T> cls) {
        super(cls);
        if (this.a != null) {
            this.a.setAccessible(true);
        }
    }
}
