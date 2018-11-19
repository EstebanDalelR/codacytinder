package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import com.leanplum.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.C15819j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.AnnotationDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.NullDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.StringDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SignatureEnhancement {
    private final AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    private final Jsr305State jsr305State;

    private static class PartEnhancementResult {
        @NotNull
        private final KotlinType type;
        private final boolean wereChanges;

        public PartEnhancementResult(@NotNull KotlinType kotlinType, boolean z) {
            C2668g.b(kotlinType, "type");
            this.type = kotlinType;
            this.wereChanges = z;
        }

        @NotNull
        public final KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }
    }

    private final class SignatureParts {
        private final QualifierApplicabilityType containerApplicabilityType;
        private final LazyJavaResolverContext containerContext;
        private final Collection<KotlinType> fromOverridden;
        private final KotlinType fromOverride;
        private final boolean isCovariant;
        final /* synthetic */ SignatureEnhancement this$0;
        private final Annotated typeContainer;

        public SignatureParts(SignatureEnhancement signatureEnhancement, @Nullable Annotated annotated, @NotNull KotlinType kotlinType, @NotNull Collection<? extends KotlinType> collection, boolean z, @NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull QualifierApplicabilityType qualifierApplicabilityType) {
            C2668g.b(kotlinType, "fromOverride");
            C2668g.b(collection, "fromOverridden");
            C2668g.b(lazyJavaResolverContext, "containerContext");
            C2668g.b(qualifierApplicabilityType, "containerApplicabilityType");
            this.this$0 = signatureEnhancement;
            this.typeContainer = annotated;
            this.fromOverride = kotlinType;
            this.fromOverridden = collection;
            this.isCovariant = z;
            this.containerContext = lazyJavaResolverContext;
            this.containerApplicabilityType = qualifierApplicabilityType;
        }

        private final boolean isForVarargParameter() {
            Annotated annotated = this.typeContainer;
            KotlinType kotlinType = null;
            if (!(annotated instanceof ValueParameterDescriptor)) {
                annotated = null;
            }
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) annotated;
            if (valueParameterDescriptor != null) {
                kotlinType = valueParameterDescriptor.getVarargElementType();
            }
            return kotlinType != null;
        }

        @NotNull
        public static /* synthetic */ PartEnhancementResult enhance$default(SignatureParts signatureParts, TypeEnhancementInfo typeEnhancementInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                typeEnhancementInfo = null;
            }
            return signatureParts.enhance(typeEnhancementInfo);
        }

        @NotNull
        public final PartEnhancementResult enhance(@Nullable TypeEnhancementInfo typeEnhancementInfo) {
            Function1 computeIndexedQualifiersForOverride = computeIndexedQualifiersForOverride();
            typeEnhancementInfo = typeEnhancementInfo != null ? new C19123x93576998(typeEnhancementInfo, computeIndexedQualifiersForOverride) : null;
            KotlinType kotlinType = this.fromOverride;
            if (typeEnhancementInfo == null) {
                typeEnhancementInfo = computeIndexedQualifiersForOverride;
            }
            typeEnhancementInfo = TypeEnhancementKt.enhance(kotlinType, typeEnhancementInfo);
            if (typeEnhancementInfo != null) {
                return new PartEnhancementResult(typeEnhancementInfo, true);
            }
            return new PartEnhancementResult(this.fromOverride, false);
        }

        private final JavaTypeQualifiers extractQualifiers(@NotNull KotlinType kotlinType) {
            Pair pair;
            NullabilityQualifier nullabilityQualifier;
            NullabilityQualifier nullabilityQualifier2;
            MutabilityQualifier mutabilityQualifier;
            if (FlexibleTypesKt.isFlexible(kotlinType)) {
                FlexibleType asFlexibleType = FlexibleTypesKt.asFlexibleType(kotlinType);
                pair = new Pair(asFlexibleType.getLowerBound(), asFlexibleType.getUpperBound());
            } else {
                pair = new Pair(kotlinType, kotlinType);
            }
            KotlinType kotlinType2 = (KotlinType) pair.m59805c();
            KotlinType kotlinType3 = (KotlinType) pair.m59806d();
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            if (kotlinType2.isMarkedNullable()) {
                nullabilityQualifier = NullabilityQualifier.NULLABLE;
            } else if (kotlinType3.isMarkedNullable()) {
                nullabilityQualifier2 = null;
                mutabilityQualifier = javaToKotlinClassMap.isReadOnly(kotlinType2) ? MutabilityQualifier.READ_ONLY : javaToKotlinClassMap.isMutable(kotlinType3) ? MutabilityQualifier.MUTABLE : null;
                return new JavaTypeQualifiers(nullabilityQualifier2, mutabilityQualifier, kotlinType.unwrap() instanceof NotNullTypeParameter, false, 8, null);
            } else {
                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            }
            nullabilityQualifier2 = nullabilityQualifier;
            if (javaToKotlinClassMap.isReadOnly(kotlinType2)) {
            }
            return new JavaTypeQualifiers(nullabilityQualifier2, mutabilityQualifier, kotlinType.unwrap() instanceof NotNullTypeParameter, false, 8, null);
        }

        private final JavaTypeQualifiers extractQualifiersFromAnnotations(@NotNull KotlinType kotlinType, boolean z, JavaTypeQualifiers javaTypeQualifiers) {
            Annotations annotations;
            if (!z || this.typeContainer == null) {
                annotations = kotlinType.getAnnotations();
            } else {
                annotations = AnnotationsKt.composeAnnotations(this.typeContainer.getAnnotations(), kotlinType.getAnnotations());
            }
            C19124x4a767989 c19124x4a767989 = new C19124x4a767989(annotations);
            C19125x4a76798a c19125x4a76798a = C19125x4a76798a.INSTANCE;
            NullabilityQualifier nullabilityQualifier = null;
            if (z) {
                z = this.containerContext.getDefaultTypeQualifiers();
                javaTypeQualifiers = z ? z.get(this.containerApplicabilityType) : null;
            }
            z = extractNullability(annotations);
            if (!z) {
                z = (javaTypeQualifiers == null || !javaTypeQualifiers.getNullability()) ? false : new NullabilityQualifierWithMigrationStatus(javaTypeQualifiers.getNullability(), javaTypeQualifiers.isNullabilityQualifierForWarning$descriptors_jvm());
            }
            NullabilityQualifier qualifier = z ? z.getQualifier() : null;
            MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) c19125x4a76798a.invoke(c19124x4a767989.invoke(JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS(), MutabilityQualifier.READ_ONLY), c19124x4a767989.invoke(JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS(), MutabilityQualifier.MUTABLE));
            if (z) {
                nullabilityQualifier = z.getQualifier();
            }
            boolean z2 = false;
            kotlinType = (nullabilityQualifier != NullabilityQualifier.NOT_NULL || TypeUtilsKt.isTypeParameter(kotlinType) == null) ? null : true;
            if (z && z.isForWarningOnly()) {
                z2 = true;
            }
            return new JavaTypeQualifiers(qualifier, mutabilityQualifier, kotlinType, z2);
        }

        private final NullabilityQualifierWithMigrationStatus extractNullability(@NotNull Annotations annotations) {
            Iterable<AnnotationDescriptor> iterable = annotations;
            SignatureEnhancement signatureEnhancement = this.this$0;
            for (AnnotationDescriptor extractNullability : iterable) {
                NullabilityQualifierWithMigrationStatus extractNullability2 = signatureEnhancement.extractNullability(extractNullability);
                if (extractNullability2 != null) {
                    return extractNullability2;
                }
            }
            return null;
        }

        private final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiersForOverride() {
            Object obj;
            int i;
            JavaTypeQualifiers[] javaTypeQualifiersArr;
            int length;
            int i2;
            boolean z;
            Object obj2;
            TypeAndDefaultQualifiers typeAndDefaultQualifiers;
            KotlinType component1;
            JavaTypeQualifiers component2;
            Collection arrayList;
            TypeAndDefaultQualifiers typeAndDefaultQualifiers2;
            Object type;
            Iterable<KotlinType> iterable = this.fromOverridden;
            Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (KotlinType toIndexed : iterable) {
                arrayList2.add(toIndexed(toIndexed));
            }
            List<List> list = (List) arrayList2;
            List toIndexed2 = toIndexed(this.fromOverride);
            if (this.isCovariant) {
                Iterable<KotlinType> iterable2 = this.fromOverridden;
                if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
                    for (KotlinType equalTypes : iterable2) {
                        if ((KotlinTypeChecker.DEFAULT.equalTypes(equalTypes, this.fromOverride) ^ 1) != 0) {
                            obj = 1;
                            break;
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    obj = 1;
                    if (obj == null) {
                        i = 1;
                    } else {
                        i = toIndexed2.size();
                    }
                    javaTypeQualifiersArr = new JavaTypeQualifiers[i];
                    length = javaTypeQualifiersArr.length;
                    i2 = 0;
                    while (i2 < length) {
                        z = i2 != 0;
                        if (!z) {
                            if (obj == null) {
                                obj2 = null;
                                if (C15819j.f49018a || r9 != null) {
                                    typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) toIndexed2.get(i2);
                                    component1 = typeAndDefaultQualifiers.component1();
                                    component2 = typeAndDefaultQualifiers.component2();
                                    arrayList = new ArrayList();
                                    for (List c : list) {
                                        typeAndDefaultQualifiers2 = (TypeAndDefaultQualifiers) C19299w.m68813c(c, i2);
                                        type = typeAndDefaultQualifiers2 == null ? typeAndDefaultQualifiers2.getType() : null;
                                        if (type == null) {
                                            arrayList.add(type);
                                        }
                                    }
                                    javaTypeQualifiersArr[i2] = computeQualifiersForOverride(component1, (List) arrayList, component2, z);
                                    i2++;
                                } else {
                                    throw new AssertionError("Only head type constructors should be computed");
                                }
                            }
                        }
                        obj2 = 1;
                        if (C15819j.f49018a) {
                        }
                        typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) toIndexed2.get(i2);
                        component1 = typeAndDefaultQualifiers.component1();
                        component2 = typeAndDefaultQualifiers.component2();
                        arrayList = new ArrayList();
                        while (r11.hasNext()) {
                            typeAndDefaultQualifiers2 = (TypeAndDefaultQualifiers) C19299w.m68813c(c, i2);
                            if (typeAndDefaultQualifiers2 == null) {
                            }
                            if (type == null) {
                                arrayList.add(type);
                            }
                        }
                        javaTypeQualifiersArr[i2] = computeQualifiersForOverride(component1, (List) arrayList, component2, z);
                        i2++;
                    }
                    return new C19122x28f4b533(javaTypeQualifiersArr);
                }
            }
            obj = null;
            if (obj == null) {
                i = toIndexed2.size();
            } else {
                i = 1;
            }
            javaTypeQualifiersArr = new JavaTypeQualifiers[i];
            length = javaTypeQualifiersArr.length;
            i2 = 0;
            while (i2 < length) {
                if (i2 != 0) {
                }
                if (z) {
                    if (obj == null) {
                        obj2 = null;
                        if (C15819j.f49018a) {
                        }
                        typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) toIndexed2.get(i2);
                        component1 = typeAndDefaultQualifiers.component1();
                        component2 = typeAndDefaultQualifiers.component2();
                        arrayList = new ArrayList();
                        while (r11.hasNext()) {
                            typeAndDefaultQualifiers2 = (TypeAndDefaultQualifiers) C19299w.m68813c(c, i2);
                            if (typeAndDefaultQualifiers2 == null) {
                            }
                            if (type == null) {
                                arrayList.add(type);
                            }
                        }
                        javaTypeQualifiersArr[i2] = computeQualifiersForOverride(component1, (List) arrayList, component2, z);
                        i2++;
                    }
                }
                obj2 = 1;
                if (C15819j.f49018a) {
                }
                typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) toIndexed2.get(i2);
                component1 = typeAndDefaultQualifiers.component1();
                component2 = typeAndDefaultQualifiers.component2();
                arrayList = new ArrayList();
                while (r11.hasNext()) {
                    typeAndDefaultQualifiers2 = (TypeAndDefaultQualifiers) C19299w.m68813c(c, i2);
                    if (typeAndDefaultQualifiers2 == null) {
                    }
                    if (type == null) {
                        arrayList.add(type);
                    }
                }
                javaTypeQualifiersArr[i2] = computeQualifiersForOverride(component1, (List) arrayList, component2, z);
                i2++;
            }
            return new C19122x28f4b533(javaTypeQualifiersArr);
        }

        private final List<TypeAndDefaultQualifiers> toIndexed(@NotNull KotlinType kotlinType) {
            ArrayList arrayList = new ArrayList(1);
            new SignatureEnhancement$SignatureParts$toIndexed$1(arrayList).invoke(kotlinType, this.containerContext);
            return arrayList;
        }

        private final JavaTypeQualifiers computeQualifiersForOverride(@NotNull KotlinType kotlinType, Collection<? extends KotlinType> collection, JavaTypeQualifiers javaTypeQualifiers, boolean z) {
            NullabilityQualifier nullability;
            Iterable<KotlinType> iterable = collection;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (KotlinType extractQualifiers : iterable) {
                arrayList.add(extractQualifiers(extractQualifiers));
            }
            Iterable<JavaTypeQualifiers> iterable2 = (List) arrayList;
            Collection arrayList2 = new ArrayList();
            for (JavaTypeQualifiers mutability : iterable2) {
                MutabilityQualifier mutability2 = mutability.getMutability();
                if (mutability2 != null) {
                    arrayList2.add(mutability2);
                }
            }
            Set n = C19299w.m68842n((List) arrayList2);
            Collection arrayList3 = new ArrayList();
            for (JavaTypeQualifiers nullability2 : iterable2) {
                nullability = nullability2.getNullability();
                if (nullability != null) {
                    arrayList3.add(nullability);
                }
            }
            Set n2 = C19299w.m68842n((List) arrayList3);
            Collection arrayList4 = new ArrayList();
            for (KotlinType unwrapEnhancement : iterable) {
                nullability = extractQualifiers(TypeWithEnhancementKt.unwrapEnhancement(unwrapEnhancement)).getNullability();
                if (nullability != null) {
                    arrayList4.add(nullability);
                }
            }
            collection = C19299w.m68842n((List) arrayList4);
            kotlinType = extractQualifiersFromAnnotations(kotlinType, z, javaTypeQualifiers);
            boolean z2 = true;
            nullability = null;
            javaTypeQualifiers = (kotlinType.isNullabilityQualifierForWarning$descriptors_jvm() ^ 1) != null ? kotlinType : null;
            NullabilityQualifier nullability3 = javaTypeQualifiers != null ? javaTypeQualifiers.getNullability() : null;
            NullabilityQualifier nullability4 = kotlinType.getNullability();
            boolean z3 = this.isCovariant && z;
            NullabilityQualifier access$select = SignatureEnhancementKt.select(n2, nullability3, z3);
            if (access$select != null) {
                z = isForVarargParameter() && z && access$select == NullabilityQualifier.NULLABLE;
                if (!z) {
                    nullability = access$select;
                }
            }
            MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) SignatureEnhancementKt.select(n, MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, kotlinType.getMutability(), z3);
            if (nullability4 == nullability3) {
                if ((C2668g.a(collection, n2) ^ 1) == null) {
                    javaTypeQualifiers = null;
                    if (kotlinType.isNotNullTypeParameter$descriptors_jvm() == null) {
                        if ((iterable2 instanceof Collection) == null || ((Collection) iterable2).isEmpty() == null) {
                            for (JavaTypeQualifiers isNotNullTypeParameter$descriptors_jvm : iterable2) {
                                if (isNotNullTypeParameter$descriptors_jvm.isNotNullTypeParameter$descriptors_jvm()) {
                                    kotlinType = true;
                                    break;
                                }
                            }
                        }
                        kotlinType = null;
                        if (kotlinType != null) {
                            kotlinType = null;
                            if (nullability != null && r13 != null) {
                                return SignatureEnhancementKt.createJavaTypeQualifiers(SignatureEnhancementKt.select(collection, nullability4, z3), mutabilityQualifier, true, kotlinType);
                            }
                            if (nullability != null) {
                                z2 = false;
                            }
                            return SignatureEnhancementKt.createJavaTypeQualifiers(nullability, mutabilityQualifier, z2, kotlinType);
                        }
                    }
                    kotlinType = true;
                    if (nullability != null) {
                    }
                    if (nullability != null) {
                        z2 = false;
                    }
                    return SignatureEnhancementKt.createJavaTypeQualifiers(nullability, mutabilityQualifier, z2, kotlinType);
                }
            }
            javaTypeQualifiers = true;
            if (kotlinType.isNotNullTypeParameter$descriptors_jvm() == null) {
                while (kotlinType.hasNext()) {
                    if (isNotNullTypeParameter$descriptors_jvm.isNotNullTypeParameter$descriptors_jvm()) {
                        kotlinType = true;
                        break;
                    }
                }
                kotlinType = null;
                if (kotlinType != null) {
                    kotlinType = null;
                    if (nullability != null) {
                    }
                    if (nullability != null) {
                        z2 = false;
                    }
                    return SignatureEnhancementKt.createJavaTypeQualifiers(nullability, mutabilityQualifier, z2, kotlinType);
                }
            }
            kotlinType = true;
            if (nullability != null) {
            }
            if (nullability != null) {
                z2 = false;
            }
            return SignatureEnhancementKt.createJavaTypeQualifiers(nullability, mutabilityQualifier, z2, kotlinType);
        }
    }

    private static final class ValueParameterEnhancementResult extends PartEnhancementResult {
        private final boolean hasDefaultValue;

        public final boolean getHasDefaultValue() {
            return this.hasDefaultValue;
        }

        public ValueParameterEnhancementResult(@NotNull KotlinType kotlinType, boolean z, boolean z2) {
            C2668g.b(kotlinType, "type");
            super(kotlinType, z2);
            this.hasDefaultValue = z;
        }
    }

    public SignatureEnhancement(@NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull Jsr305State jsr305State) {
        C2668g.b(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        C2668g.b(jsr305State, "jsr305State");
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver;
        this.jsr305State = jsr305State;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullabilityTypeFromArgument(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r6) {
        /*
        r5 = this;
        r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(r6);
        r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
        r1 = 0;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        r6 = r1;
    L_0x000a:
        r6 = (kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) r6;
        r0 = 2;
        r2 = 0;
        if (r6 == 0) goto L_0x006c;
    L_0x0010:
        r6 = r6.getEnumEntryName();
        r6 = r6.asString();
        r3 = r6.hashCode();
        r4 = 73135176; // 0x45bf448 float:2.5855495E-36 double:3.6133578E-316;
        if (r3 == r4) goto L_0x005a;
    L_0x0021:
        r4 = 74175084; // 0x46bd26c float:2.7720738E-36 double:3.6647361E-316;
        if (r3 == r4) goto L_0x0051;
    L_0x0026:
        r4 = 433141802; // 0x19d1382a float:2.1632778E-23 double:2.14000484E-315;
        if (r3 == r4) goto L_0x0041;
    L_0x002b:
        r4 = 1933739535; // 0x7342860f float:1.5411753E31 double:9.553942722E-315;
        if (r3 == r4) goto L_0x0031;
    L_0x0030:
        goto L_0x006a;
    L_0x0031:
        r3 = "ALWAYS";
        r6 = r6.equals(r3);
        if (r6 == 0) goto L_0x006a;
    L_0x0039:
        r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
        r6.<init>(r3, r2, r0, r1);
        goto L_0x006b;
    L_0x0041:
        r3 = "UNKNOWN";
        r6 = r6.equals(r3);
        if (r6 == 0) goto L_0x006a;
    L_0x0049:
        r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY;
        r6.<init>(r3, r2, r0, r1);
        goto L_0x006b;
    L_0x0051:
        r3 = "NEVER";
        r6 = r6.equals(r3);
        if (r6 == 0) goto L_0x006a;
    L_0x0059:
        goto L_0x0062;
    L_0x005a:
        r3 = "MAYBE";
        r6 = r6.equals(r3);
        if (r6 == 0) goto L_0x006a;
    L_0x0062:
        r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
        r6.<init>(r3, r2, r0, r1);
        goto L_0x006b;
    L_0x006a:
        r6 = r1;
    L_0x006b:
        return r6;
    L_0x006c:
        r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
        r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL;
        r6.<init>(r3, r2, r0, r1);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.extractNullabilityTypeFromArgument(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    @Nullable
    public final NullabilityQualifierWithMigrationStatus extractNullability(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "annotationDescriptor");
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(annotationDescriptor);
        if (extractNullabilityFromKnownAnnotations != null) {
            return extractNullabilityFromKnownAnnotations;
        }
        AnnotationDescriptor resolveTypeQualifierAnnotation = this.annotationTypeQualifierResolver.resolveTypeQualifierAnnotation(annotationDescriptor);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        if (resolveTypeQualifierAnnotation == null) {
            return null;
        }
        annotationDescriptor = this.annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptor);
        if (annotationDescriptor.isIgnore()) {
            return null;
        }
        extractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(resolveTypeQualifierAnnotation);
        if (extractNullabilityFromKnownAnnotations != null) {
            nullabilityQualifierWithMigrationStatus = NullabilityQualifierWithMigrationStatus.copy$default(extractNullabilityFromKnownAnnotations, null, annotationDescriptor.isWarning(), 1, null);
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        if (fqName == null) {
            return null;
        }
        if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            annotationDescriptor = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null);
        } else if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            annotationDescriptor = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null);
        } else {
            if (C2668g.a(fqName, JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
                nullabilityQualifierWithMigrationStatus = extractNullabilityTypeFromArgument(annotationDescriptor);
            } else if (C2668g.a(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION()) != null && this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations() != null) {
                annotationDescriptor = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null);
            } else if (!(C2668g.a(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION()) == null || this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations() == null)) {
                annotationDescriptor = new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null);
            }
            annotationDescriptor = nullabilityQualifierWithMigrationStatus;
        }
        return annotationDescriptor;
    }

    @NotNull
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Collection<? extends D> collection) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(collection, "platformSignatures");
        Iterable<CallableMemberDescriptor> iterable = collection;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (CallableMemberDescriptor enhanceSignature : iterable) {
            arrayList.add(enhanceSignature(enhanceSignature, lazyJavaResolverContext));
        }
        return (List) arrayList;
    }

    private final <D extends CallableMemberDescriptor> D enhanceSignature(@NotNull D d, LazyJavaResolverContext lazyJavaResolverContext) {
        SignatureEnhancement signatureEnhancement = this;
        D d2 = d;
        if (!(d2 instanceof JavaCallableMemberDescriptor)) {
            return d2;
        }
        CallableMemberDescriptor original;
        PartEnhancementResult enhance$default;
        JavaMethodDescriptor javaMethodDescriptor;
        boolean z;
        SignatureBuildingComponents signatureBuildingComponents;
        DeclarationDescriptor containingDeclaration;
        String computeJvmDescriptor$default;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        Object obj;
        StringBuilder stringBuilder;
        List valueParameters;
        Iterable<ValueParameterDescriptor> iterable;
        Collection arrayList;
        SignatureParts partsForValueParameter;
        List parametersInfo;
        TypeEnhancementInfo typeEnhancementInfo;
        PartEnhancementResult enhance;
        KotlinType type;
        boolean hasDefaultValueInAnnotation;
        boolean z2;
        List list;
        Annotated annotated;
        PropertyDescriptor propertyDescriptor;
        QualifierApplicabilityType qualifierApplicabilityType;
        PartEnhancementResult enhance2;
        Iterable<ValueParameterEnhancementResult> iterable2;
        KotlinType type2;
        Iterable<ValueParameterEnhancementResult> iterable3;
        JavaCallableMemberDescriptor enhance3;
        JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d2;
        if (javaCallableMemberDescriptor.getKind() == Kind.FAKE_OVERRIDE) {
            original = javaCallableMemberDescriptor.getOriginal();
            C2668g.a(original, "original");
            if (original.getOverriddenDescriptors().size() == 1) {
                return d2;
            }
        }
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, d.getAnnotations());
        if (d2 instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) d2;
            PropertyGetterDescriptorImpl getter = javaPropertyDescriptor.getGetter();
            if (!(getter == null || getter.isDefault())) {
                PropertyGetterDescriptorImpl getter2 = javaPropertyDescriptor.getGetter();
                if (getter2 == null) {
                    C2668g.a();
                }
                C2668g.a(getter2, "getter!!");
                original = getter2;
                if (javaCallableMemberDescriptor.getExtensionReceiverParameter() == null) {
                    FunctionDescriptor functionDescriptor = (FunctionDescriptor) (original instanceof FunctionDescriptor ? null : original);
                    enhance$default = SignatureParts.enhance$default(partsForValueParameter(d2, functionDescriptor == null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, copyWithNewDefaultTypeQualifiers, SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE), null, 1, null);
                } else {
                    enhance$default = null;
                }
                javaMethodDescriptor = (JavaMethodDescriptor) (d2 instanceof JavaMethodDescriptor ? null : d2);
                z = false;
                if (javaMethodDescriptor != null) {
                    signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                    containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                    if (containingDeclaration != null) {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                    ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
                    computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, 1, null);
                    C2668g.a(computeJvmDescriptor$default, "this.computeJvmDescriptor()");
                    computeJvmDescriptor$default = signatureBuildingComponents.signature(classDescriptor, computeJvmDescriptor$default);
                    if (computeJvmDescriptor$default != null) {
                        predefinedFunctionEnhancementInfo = (PredefinedFunctionEnhancementInfo) PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(computeJvmDescriptor$default);
                        if (predefinedFunctionEnhancementInfo != null) {
                            obj = predefinedFunctionEnhancementInfo.getParametersInfo().size() != javaCallableMemberDescriptor.getValueParameters().size() ? 1 : null;
                            if (C15819j.f49018a && obj == null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Predefined enhancement info for ");
                                stringBuilder.append(d2);
                                stringBuilder.append(" has ");
                                stringBuilder.append(predefinedFunctionEnhancementInfo.getParametersInfo().size());
                                stringBuilder.append(", but ");
                                stringBuilder.append(javaCallableMemberDescriptor.getValueParameters().size());
                                stringBuilder.append(" expected");
                                throw new AssertionError(stringBuilder.toString());
                            }
                        }
                        valueParameters = original.getValueParameters();
                        C2668g.a(valueParameters, "annotationOwnerForMember.valueParameters");
                        iterable = valueParameters;
                        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                        for (ValueParameterDescriptor valueParameterDescriptor : iterable) {
                            partsForValueParameter = partsForValueParameter(d2, valueParameterDescriptor, copyWithNewDefaultTypeQualifiers, new C19126xdf7d8d68(valueParameterDescriptor));
                            if (predefinedFunctionEnhancementInfo != null) {
                                parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo();
                                if (parametersInfo != null) {
                                    typeEnhancementInfo = (TypeEnhancementInfo) C19299w.m68813c(parametersInfo, valueParameterDescriptor.getIndex());
                                    enhance = partsForValueParameter.enhance(typeEnhancementInfo);
                                    if (enhance.getWereChanges()) {
                                        C2668g.a(valueParameterDescriptor, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                                        type = valueParameterDescriptor.getType();
                                        C2668g.a(type, "p.type");
                                    } else {
                                        type = enhance.getType();
                                    }
                                    C2668g.a(valueParameterDescriptor, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                                    hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor, type);
                                    if (!enhance.getWereChanges()) {
                                        if (hasDefaultValueInAnnotation == valueParameterDescriptor.declaresDefaultValue()) {
                                            z2 = false;
                                            arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                                        }
                                    }
                                    z2 = true;
                                    arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                                }
                            }
                            typeEnhancementInfo = null;
                            enhance = partsForValueParameter.enhance(typeEnhancementInfo);
                            if (enhance.getWereChanges()) {
                                C2668g.a(valueParameterDescriptor, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                                type = valueParameterDescriptor.getType();
                                C2668g.a(type, "p.type");
                            } else {
                                type = enhance.getType();
                            }
                            C2668g.a(valueParameterDescriptor, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                            hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor, type);
                            if (enhance.getWereChanges()) {
                                if (hasDefaultValueInAnnotation == valueParameterDescriptor.declaresDefaultValue()) {
                                    z2 = false;
                                    arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                                }
                            }
                            z2 = true;
                            arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                        }
                        list = (List) arrayList;
                        annotated = original;
                        propertyDescriptor = (PropertyDescriptor) (d2 instanceof PropertyDescriptor ? null : d2);
                        if (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
                            qualifierApplicabilityType = QualifierApplicabilityType.FIELD;
                        } else {
                            qualifierApplicabilityType = QualifierApplicabilityType.METHOD_RETURN_TYPE;
                        }
                        enhance2 = parts(d2, annotated, true, copyWithNewDefaultTypeQualifiers, qualifierApplicabilityType, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE).enhance(predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null);
                        if ((enhance$default == null || !enhance$default.getWereChanges()) && !enhance2.getWereChanges()) {
                            iterable2 = list;
                            if ((iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                for (ValueParameterEnhancementResult wereChanges : iterable2) {
                                    if (wereChanges.getWereChanges()) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                return d2;
                            }
                        }
                        type2 = enhance$default == null ? enhance$default.getType() : null;
                        iterable3 = list;
                        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
                        for (ValueParameterEnhancementResult valueParameterEnhancementResult : iterable3) {
                            arrayList.add(new ValueParameterData(valueParameterEnhancementResult.getType(), valueParameterEnhancementResult.getHasDefaultValue()));
                        }
                        enhance3 = javaCallableMemberDescriptor.enhance(type2, (List) arrayList, enhance2.getType());
                        if (enhance3 != null) {
                            return enhance3;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type D");
                    }
                }
                predefinedFunctionEnhancementInfo = null;
                if (predefinedFunctionEnhancementInfo != null) {
                    if (predefinedFunctionEnhancementInfo.getParametersInfo().size() != javaCallableMemberDescriptor.getValueParameters().size()) {
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Predefined enhancement info for ");
                    stringBuilder.append(d2);
                    stringBuilder.append(" has ");
                    stringBuilder.append(predefinedFunctionEnhancementInfo.getParametersInfo().size());
                    stringBuilder.append(", but ");
                    stringBuilder.append(javaCallableMemberDescriptor.getValueParameters().size());
                    stringBuilder.append(" expected");
                    throw new AssertionError(stringBuilder.toString());
                }
                valueParameters = original.getValueParameters();
                C2668g.a(valueParameters, "annotationOwnerForMember.valueParameters");
                iterable = valueParameters;
                arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (ValueParameterDescriptor valueParameterDescriptor2 : iterable) {
                    partsForValueParameter = partsForValueParameter(d2, valueParameterDescriptor2, copyWithNewDefaultTypeQualifiers, new C19126xdf7d8d68(valueParameterDescriptor2));
                    if (predefinedFunctionEnhancementInfo != null) {
                        parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo();
                        if (parametersInfo != null) {
                            typeEnhancementInfo = (TypeEnhancementInfo) C19299w.m68813c(parametersInfo, valueParameterDescriptor2.getIndex());
                            enhance = partsForValueParameter.enhance(typeEnhancementInfo);
                            if (enhance.getWereChanges()) {
                                type = enhance.getType();
                            } else {
                                C2668g.a(valueParameterDescriptor2, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                                type = valueParameterDescriptor2.getType();
                                C2668g.a(type, "p.type");
                            }
                            C2668g.a(valueParameterDescriptor2, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                            hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor2, type);
                            if (enhance.getWereChanges()) {
                                if (hasDefaultValueInAnnotation == valueParameterDescriptor2.declaresDefaultValue()) {
                                    z2 = false;
                                    arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                                }
                            }
                            z2 = true;
                            arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                        }
                    }
                    typeEnhancementInfo = null;
                    enhance = partsForValueParameter.enhance(typeEnhancementInfo);
                    if (enhance.getWereChanges()) {
                        C2668g.a(valueParameterDescriptor2, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                        type = valueParameterDescriptor2.getType();
                        C2668g.a(type, "p.type");
                    } else {
                        type = enhance.getType();
                    }
                    C2668g.a(valueParameterDescriptor2, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                    hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor2, type);
                    if (enhance.getWereChanges()) {
                        if (hasDefaultValueInAnnotation == valueParameterDescriptor2.declaresDefaultValue()) {
                            z2 = false;
                            arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                        }
                    }
                    z2 = true;
                    arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                }
                list = (List) arrayList;
                annotated = original;
                if (d2 instanceof PropertyDescriptor) {
                }
                propertyDescriptor = (PropertyDescriptor) (d2 instanceof PropertyDescriptor ? null : d2);
                if (propertyDescriptor == null) {
                }
                qualifierApplicabilityType = QualifierApplicabilityType.METHOD_RETURN_TYPE;
                if (predefinedFunctionEnhancementInfo == null) {
                }
                enhance2 = parts(d2, annotated, true, copyWithNewDefaultTypeQualifiers, qualifierApplicabilityType, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE).enhance(predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null);
                iterable2 = list;
                if (iterable2 instanceof Collection) {
                }
                while (r1.hasNext()) {
                    if (wereChanges.getWereChanges()) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return d2;
                }
                if (enhance$default == null) {
                }
                iterable3 = list;
                arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
                for (ValueParameterEnhancementResult valueParameterEnhancementResult2 : iterable3) {
                    arrayList.add(new ValueParameterData(valueParameterEnhancementResult2.getType(), valueParameterEnhancementResult2.getHasDefaultValue()));
                }
                enhance3 = javaCallableMemberDescriptor.enhance(type2, (List) arrayList, enhance2.getType());
                if (enhance3 != null) {
                    return enhance3;
                }
                throw new TypeCastException("null cannot be cast to non-null type D");
            }
        }
        original = d2;
        if (javaCallableMemberDescriptor.getExtensionReceiverParameter() == null) {
            enhance$default = null;
        } else {
            if (original instanceof FunctionDescriptor) {
            }
            FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) (original instanceof FunctionDescriptor ? null : original);
            if (functionDescriptor2 == null) {
            }
            enhance$default = SignatureParts.enhance$default(partsForValueParameter(d2, functionDescriptor2 == null ? (ValueParameterDescriptor) functionDescriptor2.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, copyWithNewDefaultTypeQualifiers, SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE), null, 1, null);
        }
        if (d2 instanceof JavaMethodDescriptor) {
        }
        javaMethodDescriptor = (JavaMethodDescriptor) (d2 instanceof JavaMethodDescriptor ? null : d2);
        z = false;
        if (javaMethodDescriptor != null) {
            signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) containingDeclaration;
                computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, 1, null);
                C2668g.a(computeJvmDescriptor$default, "this.computeJvmDescriptor()");
                computeJvmDescriptor$default = signatureBuildingComponents.signature(classDescriptor2, computeJvmDescriptor$default);
                if (computeJvmDescriptor$default != null) {
                    predefinedFunctionEnhancementInfo = (PredefinedFunctionEnhancementInfo) PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(computeJvmDescriptor$default);
                    if (predefinedFunctionEnhancementInfo != null) {
                        if (predefinedFunctionEnhancementInfo.getParametersInfo().size() != javaCallableMemberDescriptor.getValueParameters().size()) {
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Predefined enhancement info for ");
                        stringBuilder.append(d2);
                        stringBuilder.append(" has ");
                        stringBuilder.append(predefinedFunctionEnhancementInfo.getParametersInfo().size());
                        stringBuilder.append(", but ");
                        stringBuilder.append(javaCallableMemberDescriptor.getValueParameters().size());
                        stringBuilder.append(" expected");
                        throw new AssertionError(stringBuilder.toString());
                    }
                    valueParameters = original.getValueParameters();
                    C2668g.a(valueParameters, "annotationOwnerForMember.valueParameters");
                    iterable = valueParameters;
                    arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (ValueParameterDescriptor valueParameterDescriptor22 : iterable) {
                        partsForValueParameter = partsForValueParameter(d2, valueParameterDescriptor22, copyWithNewDefaultTypeQualifiers, new C19126xdf7d8d68(valueParameterDescriptor22));
                        if (predefinedFunctionEnhancementInfo != null) {
                            parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo();
                            if (parametersInfo != null) {
                                typeEnhancementInfo = (TypeEnhancementInfo) C19299w.m68813c(parametersInfo, valueParameterDescriptor22.getIndex());
                                enhance = partsForValueParameter.enhance(typeEnhancementInfo);
                                if (enhance.getWereChanges()) {
                                    type = enhance.getType();
                                } else {
                                    C2668g.a(valueParameterDescriptor22, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                                    type = valueParameterDescriptor22.getType();
                                    C2668g.a(type, "p.type");
                                }
                                C2668g.a(valueParameterDescriptor22, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                                hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor22, type);
                                if (enhance.getWereChanges()) {
                                    if (hasDefaultValueInAnnotation == valueParameterDescriptor22.declaresDefaultValue()) {
                                        z2 = false;
                                        arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                                    }
                                }
                                z2 = true;
                                arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                            }
                        }
                        typeEnhancementInfo = null;
                        enhance = partsForValueParameter.enhance(typeEnhancementInfo);
                        if (enhance.getWereChanges()) {
                            C2668g.a(valueParameterDescriptor22, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                            type = valueParameterDescriptor22.getType();
                            C2668g.a(type, "p.type");
                        } else {
                            type = enhance.getType();
                        }
                        C2668g.a(valueParameterDescriptor22, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                        hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor22, type);
                        if (enhance.getWereChanges()) {
                            if (hasDefaultValueInAnnotation == valueParameterDescriptor22.declaresDefaultValue()) {
                                z2 = false;
                                arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                            }
                        }
                        z2 = true;
                        arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                    }
                    list = (List) arrayList;
                    annotated = original;
                    if (d2 instanceof PropertyDescriptor) {
                    }
                    propertyDescriptor = (PropertyDescriptor) (d2 instanceof PropertyDescriptor ? null : d2);
                    if (propertyDescriptor == null) {
                    }
                    qualifierApplicabilityType = QualifierApplicabilityType.METHOD_RETURN_TYPE;
                    if (predefinedFunctionEnhancementInfo == null) {
                    }
                    enhance2 = parts(d2, annotated, true, copyWithNewDefaultTypeQualifiers, qualifierApplicabilityType, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE).enhance(predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null);
                    iterable2 = list;
                    if (iterable2 instanceof Collection) {
                    }
                    while (r1.hasNext()) {
                        if (wereChanges.getWereChanges()) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        return d2;
                    }
                    if (enhance$default == null) {
                    }
                    iterable3 = list;
                    arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
                    for (ValueParameterEnhancementResult valueParameterEnhancementResult22 : iterable3) {
                        arrayList.add(new ValueParameterData(valueParameterEnhancementResult22.getType(), valueParameterEnhancementResult22.getHasDefaultValue()));
                    }
                    enhance3 = javaCallableMemberDescriptor.enhance(type2, (List) arrayList, enhance2.getType());
                    if (enhance3 != null) {
                        return enhance3;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type D");
                }
            }
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        predefinedFunctionEnhancementInfo = null;
        if (predefinedFunctionEnhancementInfo != null) {
            if (predefinedFunctionEnhancementInfo.getParametersInfo().size() != javaCallableMemberDescriptor.getValueParameters().size()) {
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Predefined enhancement info for ");
            stringBuilder.append(d2);
            stringBuilder.append(" has ");
            stringBuilder.append(predefinedFunctionEnhancementInfo.getParametersInfo().size());
            stringBuilder.append(", but ");
            stringBuilder.append(javaCallableMemberDescriptor.getValueParameters().size());
            stringBuilder.append(" expected");
            throw new AssertionError(stringBuilder.toString());
        }
        valueParameters = original.getValueParameters();
        C2668g.a(valueParameters, "annotationOwnerForMember.valueParameters");
        iterable = valueParameters;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (ValueParameterDescriptor valueParameterDescriptor222 : iterable) {
            partsForValueParameter = partsForValueParameter(d2, valueParameterDescriptor222, copyWithNewDefaultTypeQualifiers, new C19126xdf7d8d68(valueParameterDescriptor222));
            if (predefinedFunctionEnhancementInfo != null) {
                parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo();
                if (parametersInfo != null) {
                    typeEnhancementInfo = (TypeEnhancementInfo) C19299w.m68813c(parametersInfo, valueParameterDescriptor222.getIndex());
                    enhance = partsForValueParameter.enhance(typeEnhancementInfo);
                    if (enhance.getWereChanges()) {
                        type = enhance.getType();
                    } else {
                        C2668g.a(valueParameterDescriptor222, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                        type = valueParameterDescriptor222.getType();
                        C2668g.a(type, "p.type");
                    }
                    C2668g.a(valueParameterDescriptor222, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                    hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor222, type);
                    if (enhance.getWereChanges()) {
                        if (hasDefaultValueInAnnotation == valueParameterDescriptor222.declaresDefaultValue()) {
                            z2 = false;
                            arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                        }
                    }
                    z2 = true;
                    arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                }
            }
            typeEnhancementInfo = null;
            enhance = partsForValueParameter.enhance(typeEnhancementInfo);
            if (enhance.getWereChanges()) {
                C2668g.a(valueParameterDescriptor222, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
                type = valueParameterDescriptor222.getType();
                C2668g.a(type, "p.type");
            } else {
                type = enhance.getType();
            }
            C2668g.a(valueParameterDescriptor222, BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
            hasDefaultValueInAnnotation = hasDefaultValueInAnnotation(valueParameterDescriptor222, type);
            if (enhance.getWereChanges()) {
                if (hasDefaultValueInAnnotation == valueParameterDescriptor222.declaresDefaultValue()) {
                    z2 = false;
                    arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
                }
            }
            z2 = true;
            arrayList.add(new ValueParameterEnhancementResult(enhance.getType(), hasDefaultValueInAnnotation, z2));
        }
        list = (List) arrayList;
        annotated = original;
        if (d2 instanceof PropertyDescriptor) {
        }
        propertyDescriptor = (PropertyDescriptor) (d2 instanceof PropertyDescriptor ? null : d2);
        if (propertyDescriptor == null) {
        }
        qualifierApplicabilityType = QualifierApplicabilityType.METHOD_RETURN_TYPE;
        if (predefinedFunctionEnhancementInfo == null) {
        }
        enhance2 = parts(d2, annotated, true, copyWithNewDefaultTypeQualifiers, qualifierApplicabilityType, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE).enhance(predefinedFunctionEnhancementInfo == null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null);
        iterable2 = list;
        if (iterable2 instanceof Collection) {
        }
        while (r1.hasNext()) {
            if (wereChanges.getWereChanges()) {
                z = true;
                break;
            }
        }
        if (!z) {
            return d2;
        }
        if (enhance$default == null) {
        }
        iterable3 = list;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
        for (ValueParameterEnhancementResult valueParameterEnhancementResult222 : iterable3) {
            arrayList.add(new ValueParameterData(valueParameterEnhancementResult222.getType(), valueParameterEnhancementResult222.getHasDefaultValue()));
        }
        enhance3 = javaCallableMemberDescriptor.enhance(type2, (List) arrayList, enhance2.getType());
        if (enhance3 != null) {
            return enhance3;
        }
        throw new TypeCastException("null cannot be cast to non-null type D");
    }

    private final boolean hasDefaultValueInAnnotation(@NotNull ValueParameterDescriptor valueParameterDescriptor, KotlinType kotlinType) {
        AnnotationDefaultValue defaultValueFromAnnotation = UtilKt.getDefaultValueFromAnnotation(valueParameterDescriptor);
        if (defaultValueFromAnnotation instanceof StringDefaultValue) {
            kotlinType = UtilsKt.lexicalCastFrom(kotlinType, ((StringDefaultValue) defaultValueFromAnnotation).getValue()) != null ? true : null;
        } else if (C2668g.a(defaultValueFromAnnotation, NullDefaultValue.INSTANCE)) {
            kotlinType = TypeUtils.acceptsNullable(kotlinType);
        } else if (defaultValueFromAnnotation == null) {
            kotlinType = valueParameterDescriptor.declaresDefaultValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (kotlinType == null || valueParameterDescriptor.getOverriddenDescriptors().isEmpty() == null) {
            return false;
        }
        return true;
    }

    private final SignatureParts partsForValueParameter(@NotNull CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContext2;
        Annotated annotated = valueParameterDescriptor;
        if (valueParameterDescriptor != null) {
            valueParameterDescriptor = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations());
            if (valueParameterDescriptor != null) {
                lazyJavaResolverContext2 = valueParameterDescriptor;
                return parts(callableMemberDescriptor, annotated, false, lazyJavaResolverContext2, QualifierApplicabilityType.VALUE_PARAMETER, function1);
            }
        }
        lazyJavaResolverContext2 = lazyJavaResolverContext;
        return parts(callableMemberDescriptor, annotated, false, lazyJavaResolverContext2, QualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    private final SignatureParts parts(@NotNull CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, QualifierApplicabilityType qualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        KotlinType kotlinType = (KotlinType) function1.invoke(callableMemberDescriptor);
        Collection overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        C2668g.a(overriddenDescriptors, "this.overriddenDescriptors");
        Iterable<CallableMemberDescriptor> iterable = overriddenDescriptors;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : iterable) {
            C2668g.a(callableMemberDescriptor2, "it");
            arrayList.add((KotlinType) function1.invoke(callableMemberDescriptor2));
        }
        return new SignatureParts(this, annotated, kotlinType, (List) arrayList, z, ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, ((KotlinType) function1.invoke(callableMemberDescriptor)).getAnnotations()), qualifierApplicabilityType);
    }
}
