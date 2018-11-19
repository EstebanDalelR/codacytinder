package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

public final class KotlinTypeFactory {
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    private KotlinTypeFactory() {
    }

    private final MemberScope computeMemberScope(TypeConstructor typeConstructor, List<? extends TypeProjection> list) {
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if (declarationDescriptor instanceof TypeParameterDescriptor) {
            return declarationDescriptor.getDefaultType().getMemberScope();
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            if (list.isEmpty()) {
                return ((ClassDescriptor) declarationDescriptor).getDefaultType().getMemberScope();
            }
            typeConstructor = ((ClassDescriptor) declarationDescriptor).getMemberScope(TypeConstructorSubstitution.Companion.create(typeConstructor, list));
            C2668g.a(typeConstructor, "descriptor.getMemberScop…(constructor, arguments))");
            return typeConstructor;
        } else if ((declarationDescriptor instanceof TypeAliasDescriptor) != null) {
            typeConstructor = new StringBuilder();
            typeConstructor.append("Scope for abbreviation: ");
            typeConstructor.append(((TypeAliasDescriptor) declarationDescriptor).getName());
            typeConstructor = ErrorUtils.createErrorScope(typeConstructor.toString(), true);
            C2668g.a(typeConstructor, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            return typeConstructor;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported classifier: ");
            stringBuilder.append(declarationDescriptor);
            stringBuilder.append(" for constructor: ");
            stringBuilder.append(typeConstructor);
            throw ((Throwable) new IllegalStateException(stringBuilder.toString()));
        }
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleType(@NotNull Annotations annotations, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z) {
        C2668g.b(annotations, "annotations");
        C2668g.b(typeConstructor, "constructor");
        C2668g.b(list, "arguments");
        if (!annotations.isEmpty() || !list.isEmpty() || z || typeConstructor.getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(annotations, typeConstructor, list, z, INSTANCE.computeMemberScope(typeConstructor, list));
        }
        annotations = typeConstructor.getDeclarationDescriptor();
        if (annotations == null) {
            C2668g.a();
        }
        C2668g.a(annotations, "constructor.declarationDescriptor!!");
        annotations = annotations.getDefaultType();
        C2668g.a(annotations, "constructor.declarationDescriptor!!.defaultType");
        return annotations;
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull Annotations annotations, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope) {
        C2668g.b(annotations, "annotations");
        C2668g.b(typeConstructor, "constructor");
        C2668g.b(list, "arguments");
        C2668g.b(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z, memberScope);
        if (annotations.isEmpty() != null) {
            return simpleTypeImpl;
        }
        return (SimpleType) new AnnotatedSimpleType(simpleTypeImpl, annotations);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull Annotations annotations, @NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeProjection> list) {
        C2668g.b(annotations, "annotations");
        C2668g.b(classDescriptor, "descriptor");
        C2668g.b(list, "arguments");
        classDescriptor = classDescriptor.getTypeConstructor();
        C2668g.a(classDescriptor, "descriptor.typeConstructor");
        return simpleType(annotations, classDescriptor, list, false);
    }

    @JvmStatic
    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(simpleType, "lowerBound");
        C2668g.b(simpleType2, "upperBound");
        if (C2668g.a(simpleType, simpleType2)) {
            return simpleType;
        }
        return new FlexibleTypeImpl(simpleType, simpleType2);
    }
}
