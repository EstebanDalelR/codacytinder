package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty0.Getter;

public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    protected KCallable computeReflected() {
        return C15825i.m59866a(this);
    }

    public Object invoke() {
        return get();
    }

    public Getter getGetter() {
        return ((KProperty0) m68013a()).getGetter();
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((KProperty0) m68013a()).getDelegate();
    }
}
