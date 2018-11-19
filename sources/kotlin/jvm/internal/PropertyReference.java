package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

public abstract class PropertyReference extends CallableReference implements KProperty {
    protected /* synthetic */ KCallable getReflected() {
        return m68013a();
    }

    @SinceKotlin(version = "1.1")
    /* renamed from: a */
    protected KProperty m68013a() {
        return (KProperty) super.getReflected();
    }

    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return m68013a().isLateinit();
    }

    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return m68013a().isConst();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || C2668g.a(getBoundReceiver(), propertyReference.getBoundReceiver()) == null) {
                z = false;
            }
            return z;
        } else if (obj instanceof KProperty) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        PropertyReference compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("property ");
        stringBuilder.append(getName());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}
