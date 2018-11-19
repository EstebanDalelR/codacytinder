package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class StarProjectionImplKt {
    @NotNull
    public static final KotlinType starProjectionType(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(typeParameterDescriptor, "$receiver");
        DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
        }
        TypeConstructor typeConstructor = ((ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor();
        C2668g.a(typeConstructor, "classDescriptor.typeConstructor");
        List parameters = typeConstructor.getParameters();
        C2668g.a(parameters, "classDescriptor.typeConstructor.parameters");
        Iterable<TypeParameterDescriptor> iterable = parameters;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (TypeParameterDescriptor typeParameterDescriptor2 : iterable) {
            C2668g.a(typeParameterDescriptor2, "it");
            arrayList.add(typeParameterDescriptor2.getTypeConstructor());
        }
        TypeSubstitutor create = TypeSubstitutor.create((TypeSubstitution) new StarProjectionImplKt$starProjectionType$1((List) arrayList));
        List upperBounds = typeParameterDescriptor.getUpperBounds();
        C2668g.a(upperBounds, "this.upperBounds");
        KotlinType substitute = create.substitute((KotlinType) C19299w.m68829f(upperBounds), Variance.OUT_VARIANCE);
        if (substitute != null) {
            return substitute;
        }
        typeParameterDescriptor = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getDefaultBound();
        C2668g.a(typeParameterDescriptor, "builtIns.defaultBound");
        return (KotlinType) typeParameterDescriptor;
    }
}
