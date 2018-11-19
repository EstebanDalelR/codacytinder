package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class InlineClassesUtilsKt {
    @Nullable
    public static final ValueParameterDescriptor underlyingRepresentation(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "$receiver");
        ValueParameterDescriptor valueParameterDescriptor = null;
        if (!classDescriptor.isInline()) {
            return null;
        }
        classDescriptor = classDescriptor.getUnsubstitutedPrimaryConstructor();
        if (classDescriptor != null) {
            classDescriptor = classDescriptor.getValueParameters();
            if (classDescriptor != null) {
                valueParameterDescriptor = (ValueParameterDescriptor) C19299w.m68838k((List) classDescriptor);
            }
        }
        return valueParameterDescriptor;
    }

    public static final boolean isInlineClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "$receiver");
        return (!(declarationDescriptor instanceof ClassDescriptor) || ((ClassDescriptor) declarationDescriptor).isInline() == null) ? null : true;
    }

    @Nullable
    public static final ValueParameterDescriptor unsubstitutedUnderlyingParameter(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(kotlinType instanceof ClassDescriptor)) {
            kotlinType = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) kotlinType;
        return classDescriptor != null ? underlyingRepresentation(classDescriptor) : null;
    }

    @Nullable
    public static final KotlinType unsubstitutedUnderlyingType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = unsubstitutedUnderlyingParameter(kotlinType);
        return kotlinType != null ? kotlinType.getType() : null;
    }

    public static final boolean isInlineClassType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        return kotlinType != null ? isInlineClass((DeclarationDescriptor) kotlinType) : null;
    }

    @Nullable
    public static final KotlinType substitutedUnderlyingType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "$receiver");
        ValueParameterDescriptor unsubstitutedUnderlyingParameter = unsubstitutedUnderlyingParameter(kotlinType);
        KotlinType kotlinType2 = null;
        if (unsubstitutedUnderlyingParameter == null) {
            return null;
        }
        kotlinType = kotlinType.getMemberScope();
        Name name = unsubstitutedUnderlyingParameter.getName();
        C2668g.a(name, "parameter.name");
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) C19299w.m68830g((Iterable) kotlinType.getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
        if (propertyDescriptor != null) {
            kotlinType2 = propertyDescriptor.getType();
        }
        return kotlinType2;
    }
}
