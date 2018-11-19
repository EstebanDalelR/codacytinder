package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class LazyJavaStaticScope extends LazyJavaScope {
    protected void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        C2668g.b(name, "name");
        C2668g.b(collection, "result");
    }

    @Nullable
    protected Void getDispatchReceiverParameter() {
        return null;
    }

    public LazyJavaStaticScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        C2668g.b(lazyJavaResolverContext, "c");
        super(lazyJavaResolverContext);
    }

    @NotNull
    protected MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2) {
        C2668g.b(javaMethod, "method");
        C2668g.b(list, "methodTypeParameters");
        C2668g.b(kotlinType, "returnType");
        C2668g.b(list2, "valueParameters");
        return new MethodSignatureData(kotlinType, null, list2, list, false, C17554o.m64195a());
    }
}
