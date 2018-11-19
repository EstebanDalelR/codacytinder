package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SingleModuleClassResolver implements ModuleClassResolver {
    @NotNull
    public JavaDescriptorResolver resolver;

    @Nullable
    public ClassDescriptor resolveClass(@NotNull JavaClass javaClass) {
        C2668g.b(javaClass, "javaClass");
        JavaDescriptorResolver javaDescriptorResolver = this.resolver;
        if (javaDescriptorResolver == null) {
            C2668g.b("resolver");
        }
        return javaDescriptorResolver.resolveClass(javaClass);
    }

    public final void setResolver(@NotNull JavaDescriptorResolver javaDescriptorResolver) {
        C2668g.b(javaDescriptorResolver, "<set-?>");
        this.resolver = javaDescriptorResolver;
    }
}
