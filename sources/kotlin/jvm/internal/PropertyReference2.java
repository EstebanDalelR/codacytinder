package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KProperty2.Getter;

public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    protected KCallable computeReflected() {
        return C15825i.m59868a(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public Getter getGetter() {
        return ((KProperty2) m68013a()).getGetter();
    }

    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) m68013a()).getDelegate(obj, obj2);
    }
}
