package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    @NotNull
    private final LazyJavaAnnotations annotations = new LazyJavaAnnotations(this.f60036c, (JavaAnnotationOwner) this.javaTypeParameter);
    /* renamed from: c */
    private final LazyJavaResolverContext f60036c;
    @NotNull
    private final JavaTypeParameter javaTypeParameter;

    protected void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
    }

    public LazyJavaTypeParameterDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaTypeParameter javaTypeParameter, int i, @NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(javaTypeParameter, "javaTypeParameter");
        C2668g.b(declarationDescriptor, "containingDeclaration");
        super(lazyJavaResolverContext.getStorageManager(), declarationDescriptor, javaTypeParameter.getName(), Variance.INVARIANT, false, i, SourceElement.NO_SOURCE, lazyJavaResolverContext.getComponents().getSupertypeLoopChecker());
        this.f60036c = lazyJavaResolverContext;
        this.javaTypeParameter = javaTypeParameter;
    }

    @NotNull
    public LazyJavaAnnotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    protected List<KotlinType> resolveUpperBounds() {
        Collection upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType anyType = this.f60036c.getModule().getBuiltIns().getAnyType();
            C2668g.a(anyType, "c.module.builtIns.anyType");
            SimpleType nullableAnyType = this.f60036c.getModule().getBuiltIns().getNullableAnyType();
            C2668g.a(nullableAnyType, "c.module.builtIns.nullableAnyType");
            return C15807n.m59826a(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        Iterable<JavaClassifierType> iterable = upperBounds;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (JavaClassifierType transformJavaType : iterable) {
            arrayList.add(this.f60036c.getTypeResolver().transformJavaType(transformJavaType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, this, 1, null)));
        }
        return (List) arrayList;
    }
}
