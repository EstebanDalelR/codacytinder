package org.objenesis.strategy;

import java.io.Serializable;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.p094a.C3965a;
import org.objenesis.instantiator.p094a.C3966b;
import org.objenesis.instantiator.p094a.C3967c;
import org.objenesis.instantiator.p095b.C3969c;
import org.objenesis.instantiator.p095b.C4307a;
import org.objenesis.instantiator.p096c.C4308a;
import org.objenesis.instantiator.p097d.C3971a;
import org.objenesis.instantiator.p098e.C3972b;
import org.objenesis.instantiator.p098e.C3973c;

/* renamed from: org.objenesis.strategy.c */
public class C19645c extends C19509a {
    public <T> ObjectInstantiator<T> newInstantiatorOf(Class<T> cls) {
        if (!C19351b.m69491a("Java HotSpot")) {
            if (!C19351b.m69491a("OpenJDK")) {
                if (C19351b.m69491a("Dalvik")) {
                    if (C19351b.m69490a()) {
                        return new C3973c(cls);
                    }
                    if (C19351b.f60416g <= 10) {
                        return new C3965a(cls);
                    }
                    if (C19351b.f60416g <= 17) {
                        return new C3966b(cls);
                    }
                    return new C3967c(cls);
                } else if (C19351b.m69491a("BEA")) {
                    return new C3972b(cls);
                } else {
                    if (C19351b.m69491a("GNU libgcj")) {
                        return new C4308a(cls);
                    }
                    if (C19351b.m69491a("PERC")) {
                        return new C3971a(cls);
                    }
                    return new C3973c(cls);
                }
            }
        }
        if (!C19351b.m69492b()) {
            return new C3972b(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return new C3969c(cls);
        }
        return new C4307a(cls);
    }
}
