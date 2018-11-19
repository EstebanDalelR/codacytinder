package org.objenesis.instantiator.p095b;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

@Instantiator(Typology.SERIALIZATION)
/* renamed from: org.objenesis.instantiator.b.c */
public class C3969c<T> implements ObjectInstantiator<T> {
    /* renamed from: a */
    private ObjectInputStream f12617a;

    public C3969c(Class<T> cls) {
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f12617a = new ObjectInputStream(new c$a(cls));
                return;
            } catch (Class<T> cls2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("IOException: ");
                stringBuilder.append(cls2.getMessage());
                throw new Error(stringBuilder.toString());
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(cls2);
        stringBuilder2.append(" not serializable");
        throw new ObjenesisException(new NotSerializableException(stringBuilder2.toString()));
    }

    public T newInstance() {
        try {
            return this.f12617a.readObject();
        } catch (ClassNotFoundException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ClassNotFoundException: ");
            stringBuilder.append(e.getMessage());
            throw new Error(stringBuilder.toString());
        } catch (Throwable e2) {
            throw new ObjenesisException(e2);
        }
    }
}
