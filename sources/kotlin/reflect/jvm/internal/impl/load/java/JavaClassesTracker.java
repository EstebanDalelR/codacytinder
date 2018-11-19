package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import org.jetbrains.annotations.NotNull;

public interface JavaClassesTracker {

    public static final class Default implements JavaClassesTracker {
        public static final Default INSTANCE = new Default();

        public void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor) {
            C2668g.b(javaClassDescriptor, "classDescriptor");
        }

        private Default() {
        }
    }

    void reportClass(@NotNull JavaClassDescriptor javaClassDescriptor);
}
