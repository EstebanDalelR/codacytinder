package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ConstantValue<T> {
    private final T value;

    @NotNull
    public abstract KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor);

    public ConstantValue(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            Object value = getValue();
            Object obj2 = null;
            if (!(obj instanceof ConstantValue)) {
                obj = null;
            }
            ConstantValue constantValue = (ConstantValue) obj;
            if (constantValue != null) {
                obj2 = constantValue.getValue();
            }
            if (C2668g.a(value, obj2) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        Object value = getValue();
        return value != null ? value.hashCode() : 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
