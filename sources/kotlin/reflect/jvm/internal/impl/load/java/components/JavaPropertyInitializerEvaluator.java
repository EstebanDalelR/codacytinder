package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JavaPropertyInitializerEvaluator {

    public static final class DoNothing implements JavaPropertyInitializerEvaluator {
        public static final DoNothing INSTANCE = new DoNothing();

        @Nullable
        public Void getInitializerConstant(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor) {
            C2668g.b(javaField, "field");
            C2668g.b(propertyDescriptor, "descriptor");
            return null;
        }

        private DoNothing() {
        }
    }

    @Nullable
    ConstantValue<?> getInitializerConstant(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);
}
