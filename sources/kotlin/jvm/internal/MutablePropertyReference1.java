package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty1.Setter;
import kotlin.reflect.KProperty1.Getter;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KMutableProperty1 {
    protected KCallable computeReflected() {
        return C15825i.m59864a(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Getter getGetter() {
        return ((KMutableProperty1) m68013a()).getGetter();
    }

    public Setter getSetter() {
        return ((KMutableProperty1) m68013a()).getSetter();
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) m68013a()).getDelegate(obj);
    }
}
