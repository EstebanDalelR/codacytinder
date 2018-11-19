package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15811g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

public final class RawSubstitution extends TypeSubstitution {
    public static final RawSubstitution INSTANCE = new RawSubstitution();
    private static final JavaTypeAttributes lowerTypeAttr = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
    private static final JavaTypeAttributes upperTypeAttr = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);

    public boolean isEmpty() {
        return false;
    }

    private RawSubstitution() {
    }

    @NotNull
    public TypeProjectionImpl get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        return new TypeProjectionImpl(eraseType(kotlinType));
    }

    private final KotlinType eraseType(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof TypeParameterDescriptor) {
            return eraseType(JavaTypeResolverKt.getErasedUpperBound$default((TypeParameterDescriptor) declarationDescriptor, null, null, 3, null));
        }
        if (declarationDescriptor instanceof ClassDescriptor) {
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            Pair eraseInflexibleBasedOnClassDescriptor = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.lowerIfFlexible(kotlinType), classDescriptor, lowerTypeAttr);
            SimpleType simpleType = (SimpleType) eraseInflexibleBasedOnClassDescriptor.m59805c();
            boolean booleanValue = ((Boolean) eraseInflexibleBasedOnClassDescriptor.m59806d()).booleanValue();
            kotlinType = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.upperIfFlexible(kotlinType), classDescriptor, upperTypeAttr);
            SimpleType simpleType2 = (SimpleType) kotlinType.m59805c();
            kotlinType = ((Boolean) kotlinType.m59806d()).booleanValue();
            if (!booleanValue) {
                if (kotlinType == null) {
                    kotlinType = KotlinTypeFactory.flexibleType(simpleType, simpleType2);
                    return kotlinType;
                }
            }
            kotlinType = (UnwrappedType) new RawTypeImpl(simpleType, simpleType2);
            return kotlinType;
        }
        kotlinType = new StringBuilder();
        kotlinType.append("Unexpected declaration kind: ");
        kotlinType.append(declarationDescriptor);
        throw new IllegalStateException(kotlinType.toString().toString());
    }

    private final Pair<SimpleType, Boolean> eraseInflexibleBasedOnClassDescriptor(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return C15811g.m59834a(simpleType, Boolean.valueOf(false));
        }
        KotlinType kotlinType = simpleType;
        if (KotlinBuiltIns.isArray(kotlinType)) {
            TypeProjection typeProjection = (TypeProjection) simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            classDescriptor = typeProjection.getType();
            C2668g.a(classDescriptor, "componentTypeProjection.type");
            return C15811g.m59834a(KotlinTypeFactory.simpleType(simpleType.getAnnotations(), simpleType.getConstructor(), C15807n.m59826a(new TypeProjectionImpl(projectionKind, eraseType(classDescriptor))), simpleType.isMarkedNullable()), Boolean.valueOf(false));
        } else if (KotlinTypeKt.isError(kotlinType)) {
            classDescriptor = new StringBuilder();
            classDescriptor.append("Raw error type: ");
            classDescriptor.append(simpleType.getConstructor());
            return C15811g.m59834a(ErrorUtils.createErrorType(classDescriptor.toString()), Boolean.valueOf(false));
        } else {
            Annotations annotations = simpleType.getAnnotations();
            TypeConstructor constructor = simpleType.getConstructor();
            List parameters = simpleType.getConstructor().getParameters();
            C2668g.a(parameters, "type.constructor.parameters");
            Iterable<TypeParameterDescriptor> iterable = parameters;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : iterable) {
                RawSubstitution rawSubstitution = INSTANCE;
                C2668g.a(typeParameterDescriptor, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                arrayList.add(computeProjection$default(rawSubstitution, typeParameterDescriptor, javaTypeAttributes, null, 4, null));
            }
            List list = (List) arrayList;
            simpleType = simpleType.isMarkedNullable();
            classDescriptor = classDescriptor.getMemberScope((TypeSubstitution) INSTANCE);
            C2668g.a(classDescriptor, "declaration.getMemberScope(RawSubstitution)");
            return C15811g.m59834a(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(annotations, constructor, list, simpleType, classDescriptor), Boolean.valueOf(true));
        }
    }

    @NotNull
    public static /* synthetic */ TypeProjection computeProjection$default(RawSubstitution rawSubstitution, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, KotlinType kotlinType, int i, Object obj) {
        if ((i & 4) != 0) {
            kotlinType = JavaTypeResolverKt.getErasedUpperBound$default(typeParameterDescriptor, null, null, 3, null);
        }
        return rawSubstitution.computeProjection(typeParameterDescriptor, javaTypeAttributes, kotlinType);
    }

    @NotNull
    public final TypeProjection computeProjection(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull JavaTypeAttributes javaTypeAttributes, @NotNull KotlinType kotlinType) {
        C2668g.b(typeParameterDescriptor, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        C2668g.b(javaTypeAttributes, "attr");
        C2668g.b(kotlinType, "erasedUpperBound");
        switch (javaTypeAttributes.getFlexibility()) {
            case FLEXIBLE_LOWER_BOUND:
                return (TypeProjection) new TypeProjectionImpl(Variance.INVARIANT, kotlinType);
            case FLEXIBLE_UPPER_BOUND:
            case INFLEXIBLE:
                if (!typeParameterDescriptor.getVariance().getAllowsOutPosition()) {
                    return (TypeProjection) new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType());
                }
                List parameters = kotlinType.getConstructor().getParameters();
                C2668g.a(parameters, "erasedUpperBound.constructor.parameters");
                if ((parameters.isEmpty() ^ 1) != 0) {
                    typeParameterDescriptor = (TypeProjection) new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType);
                } else {
                    typeParameterDescriptor = JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
                }
                return typeParameterDescriptor;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
