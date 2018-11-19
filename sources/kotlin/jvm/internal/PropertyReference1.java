package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty1.Getter;

public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
    protected KCallable computeReflected() {
        return C15825i.m59867a(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Getter getGetter() {
        return ((KProperty1) m68013a()).getGetter();
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((KProperty1) m68013a()).getDelegate(obj);
    }
}
