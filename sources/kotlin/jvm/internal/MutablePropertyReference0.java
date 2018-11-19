package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty0.Setter;
import kotlin.reflect.KProperty0.Getter;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
    protected KCallable computeReflected() {
        return C15825i.m59863a(this);
    }

    public Object invoke() {
        return get();
    }

    public Getter getGetter() {
        return ((KMutableProperty0) m68013a()).getGetter();
    }

    public Setter getSetter() {
        return ((KMutableProperty0) m68013a()).getSetter();
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((KMutableProperty0) m68013a()).getDelegate();
    }
}
