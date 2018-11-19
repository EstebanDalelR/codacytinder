package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KMutableProperty2.Setter;
import kotlin.reflect.KProperty2.Getter;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
    protected KCallable computeReflected() {
        return C15825i.m59865a(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public Getter getGetter() {
        return ((KMutableProperty2) m68013a()).getGetter();
    }

    public Setter getSetter() {
        return ((KMutableProperty2) m68013a()).getSetter();
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((KMutableProperty2) m68013a()).getDelegate(obj, obj2);
    }
}
