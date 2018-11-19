package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C15819j;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.collections.ab;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.platform.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public static final Companion Companion = new Companion();
    private static final Set<String> PUBLIC_METHOD_NAMES_IN_OBJECT = am.m64178a((Object[]) new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    private final ClassDescriptor additionalSupertypeClassDescriptor;
    @NotNull
    private final Annotations annotations;
    /* renamed from: c */
    private final LazyJavaResolverContext f60039c;
    private final NotNullLazyValue<List<TypeParameterDescriptor>> declaredParameters;
    private final InnerClassesScopeWrapper innerClassesScope;
    private final boolean isInner;
    private final JavaClass jClass;
    private final ClassKind kind;
    private final Modality modality;
    private final LazyJavaStaticClassScope staticScope;
    private final LazyJavaClassTypeConstructor typeConstructor;
    private final LazyJavaClassMemberScope unsubstitutedMemberScope;
    private final Visibility visibility;

    public static final class Companion {
        private Companion() {
        }
    }

    private final class LazyJavaClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters;

        public boolean isDenotable() {
            return true;
        }

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.f60039c.getStorageManager());
            this.parameters = LazyJavaClassDescriptor.this.f60039c.getStorageManager().createLazyValue(new C19089xbaf55d8a(this));
        }

        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.parameters.invoke();
        }

        @NotNull
        protected Collection<KotlinType> computeSupertypes() {
            Object obj;
            Collection supertypes = LazyJavaClassDescriptor.this.jClass.getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            ArrayList arrayList2 = new ArrayList(0);
            KotlinType purelyImplementedSupertype = getPurelyImplementedSupertype();
            Iterator it = supertypes.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType javaClassifierType = (JavaClassifierType) it.next();
                KotlinType transformJavaType = LazyJavaClassDescriptor.this.f60039c.getTypeResolver().transformJavaType(javaClassifierType, JavaTypeResolverKt.toAttributes$default(TypeUsage.SUPERTYPE, false, null, 3, null));
                if (transformJavaType.getConstructor().getDeclarationDescriptor() instanceof MockClassDescriptor) {
                    arrayList2.add(javaClassifierType);
                }
                TypeConstructor constructor = transformJavaType.getConstructor();
                if (purelyImplementedSupertype != null) {
                    obj = purelyImplementedSupertype.getConstructor();
                }
                if (!C2668g.a(constructor, obj)) {
                    if (!KotlinBuiltIns.isAnyOrNullableAny(transformJavaType)) {
                        arrayList.add(transformJavaType);
                    }
                }
            }
            supertypes = arrayList;
            ClassDescriptor access$getAdditionalSupertypeClassDescriptor$p = LazyJavaClassDescriptor.this.additionalSupertypeClassDescriptor;
            if (access$getAdditionalSupertypeClassDescriptor$p != null) {
                obj = MappingUtilKt.createMappedTypeParametersSubstitution(access$getAdditionalSupertypeClassDescriptor$p, LazyJavaClassDescriptor.this).buildSubstitutor().substitute(access$getAdditionalSupertypeClassDescriptor$p.getDefaultType(), Variance.INVARIANT);
            }
            CollectionsKt.addIfNotNull(supertypes, obj);
            CollectionsKt.addIfNotNull(supertypes, purelyImplementedSupertype);
            if ((arrayList2.isEmpty() ^ 1) != 0) {
                ErrorReporter errorReporter = LazyJavaClassDescriptor.this.f60039c.getComponents().getErrorReporter();
                ClassDescriptor declarationDescriptor = getDeclarationDescriptor();
                Iterable<JavaType> iterable = arrayList2;
                Collection arrayList3 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (JavaType javaType : iterable) {
                    if (javaType == null) {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    }
                    arrayList3.add(((JavaClassifierType) javaType).getPresentableText());
                }
                errorReporter.reportIncompleteHierarchy(declarationDescriptor, (List) arrayList3);
            }
            return (supertypes.isEmpty() ^ 1) != 0 ? C19299w.m68840l(arrayList) : C15807n.m59826a(LazyJavaClassDescriptor.this.f60039c.getModule().getBuiltIns().getAnyType());
        }

        private final KotlinType getPurelyImplementedSupertype() {
            FqName fqName;
            ClassDescriptor resolveTopLevelClass;
            int size;
            List parameters;
            int size2;
            Collection arrayList;
            List list;
            FqName purelyImplementsFqNameFromAnnotation = getPurelyImplementsFqNameFromAnnotation();
            if (purelyImplementsFqNameFromAnnotation != null) {
                Object obj = (purelyImplementsFqNameFromAnnotation.isRoot() || !purelyImplementsFqNameFromAnnotation.startsWith(KotlinBuiltIns.BUILT_INS_PACKAGE_NAME)) ? null : 1;
                if (obj != null) {
                    if (purelyImplementsFqNameFromAnnotation == null) {
                        fqName = purelyImplementsFqNameFromAnnotation;
                    } else {
                        fqName = FakePureImplementationsProvider.INSTANCE.getPurelyImplementedInterface(DescriptorUtilsKt.getFqNameSafe(LazyJavaClassDescriptor.this));
                    }
                    if (fqName != null) {
                        return null;
                    }
                    resolveTopLevelClass = DescriptorUtilsKt.resolveTopLevelClass(LazyJavaClassDescriptor.this.f60039c.getModule(), fqName, NoLookupLocation.FROM_JAVA_LOADER);
                    if (resolveTopLevelClass != null) {
                        return null;
                    }
                    TypeConstructor typeConstructor = resolveTopLevelClass.getTypeConstructor();
                    C2668g.a(typeConstructor, "classDescriptor.typeConstructor");
                    size = typeConstructor.getParameters().size();
                    parameters = LazyJavaClassDescriptor.this.getTypeConstructor().getParameters();
                    size2 = parameters.size();
                    if (size2 != size) {
                        C2668g.a(parameters, "typeParameters");
                        Iterable<TypeParameterDescriptor> iterable = parameters;
                        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : iterable) {
                            Variance variance = Variance.INVARIANT;
                            C2668g.a(typeParameterDescriptor, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                            arrayList.add(new TypeProjectionImpl(variance, typeParameterDescriptor.getDefaultType()));
                        }
                        list = (List) arrayList;
                    } else if (size2 == 1 || size <= 1 || purelyImplementsFqNameFromAnnotation != null) {
                        return null;
                    } else {
                        Variance variance2 = Variance.INVARIANT;
                        C2668g.a(parameters, "typeParameters");
                        Object j = C19299w.m68836j(parameters);
                        C2668g.a(j, "typeParameters.single()");
                        TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(variance2, ((TypeParameterDescriptor) j).getDefaultType());
                        Iterable c18461c = new C18461c(1, size);
                        Collection arrayList2 = new ArrayList(C18457p.m66906a(c18461c, 10));
                        Iterator it = c18461c.iterator();
                        while (it.hasNext()) {
                            ((ab) it).mo13805b();
                            arrayList2.add(typeProjectionImpl);
                        }
                        list = (List) arrayList2;
                    }
                    return KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), resolveTopLevelClass, list);
                }
            }
            purelyImplementsFqNameFromAnnotation = null;
            if (purelyImplementsFqNameFromAnnotation == null) {
                fqName = FakePureImplementationsProvider.INSTANCE.getPurelyImplementedInterface(DescriptorUtilsKt.getFqNameSafe(LazyJavaClassDescriptor.this));
            } else {
                fqName = purelyImplementsFqNameFromAnnotation;
            }
            if (fqName != null) {
                return null;
            }
            resolveTopLevelClass = DescriptorUtilsKt.resolveTopLevelClass(LazyJavaClassDescriptor.this.f60039c.getModule(), fqName, NoLookupLocation.FROM_JAVA_LOADER);
            if (resolveTopLevelClass != null) {
                return null;
            }
            TypeConstructor typeConstructor2 = resolveTopLevelClass.getTypeConstructor();
            C2668g.a(typeConstructor2, "classDescriptor.typeConstructor");
            size = typeConstructor2.getParameters().size();
            parameters = LazyJavaClassDescriptor.this.getTypeConstructor().getParameters();
            size2 = parameters.size();
            if (size2 != size) {
                if (size2 == 1) {
                }
                return null;
            }
            C2668g.a(parameters, "typeParameters");
            Iterable<TypeParameterDescriptor> iterable2 = parameters;
            arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
            for (TypeParameterDescriptor typeParameterDescriptor2 : iterable2) {
                Variance variance3 = Variance.INVARIANT;
                C2668g.a(typeParameterDescriptor2, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                arrayList.add(new TypeProjectionImpl(variance3, typeParameterDescriptor2.getDefaultType()));
            }
            list = (List) arrayList;
            return KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), resolveTopLevelClass, list);
        }

        private final FqName getPurelyImplementsFqNameFromAnnotation() {
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName fqName = JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
            C2668g.a(fqName, "JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
            if (findAnnotation == null) {
                return null;
            }
            Object g = C19299w.m68830g((Iterable) findAnnotation.getAllValueArguments().values());
            if (!(g instanceof StringValue)) {
                g = null;
            }
            StringValue stringValue = (StringValue) g;
            if (stringValue != null) {
                String str = (String) stringValue.getValue();
                if (str == null || !FqNamesUtilKt.isValidJavaFqName(str)) {
                    return null;
                }
                return new FqName(str);
            }
            return null;
        }

        @NotNull
        protected SupertypeLoopChecker getSupertypeLoopChecker() {
            return LazyJavaClassDescriptor.this.f60039c.getComponents().getSupertypeLoopChecker();
        }

        @NotNull
        public ClassDescriptor getDeclarationDescriptor() {
            return LazyJavaClassDescriptor.this;
        }

        @NotNull
        public String toString() {
            String asString = LazyJavaClassDescriptor.this.getName().asString();
            C2668g.a(asString, "name.asString()");
            return asString;
        }
    }

    @Nullable
    public ClassDescriptor getCompanionObjectDescriptor() {
        return null;
    }

    @Nullable
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i, C15823e c15823e) {
        if ((i & 8) != 0) {
            classDescriptor = null;
        }
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, classDescriptor);
    }

    public LazyJavaClassDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaClass javaClass, @Nullable ClassDescriptor classDescriptor) {
        JavaClass javaClass2 = javaClass;
        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaResolverContext;
        C2668g.b(lazyJavaResolverContext2, "outerContext");
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        C2668g.b(declarationDescriptor2, "containingDeclaration");
        C2668g.b(javaClass2, "jClass");
        super(lazyJavaResolverContext2.getStorageManager(), declarationDescriptor2, javaClass.getName(), lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaClass2), false);
        this.jClass = javaClass2;
        this.additionalSupertypeClassDescriptor = classDescriptor;
        this.f60039c = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext2, this, this.jClass, 0, 4, null);
        ClassDescriptor classDescriptor2 = this;
        this.f60039c.getComponents().getJavaResolverCache().recordClass(this.jClass, classDescriptor2);
        boolean z = false;
        Object obj = this.jClass.getLightClassOriginKind() == null ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Creating LazyJavaClassDescriptor for light class ");
            stringBuilder.append(r6.jClass);
            throw new AssertionError(stringBuilder.toString());
        }
        ClassKind classKind;
        Modality modality;
        if (r6.jClass.isAnnotationType()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (r6.jClass.isInterface()) {
            classKind = ClassKind.INTERFACE;
        } else if (r6.jClass.isEnum()) {
            classKind = ClassKind.ENUM_CLASS;
        } else {
            classKind = ClassKind.CLASS;
        }
        r6.kind = classKind;
        if (r6.jClass.isAnnotationType()) {
            modality = Modality.FINAL;
        } else {
            boolean z2;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion companion = Modality.Companion;
            if (!r6.jClass.isAbstract()) {
                if (!r6.jClass.isInterface()) {
                    z2 = false;
                    modality = companion.convertFromFlags(z2, r6.jClass.isFinal() ^ true);
                }
            }
            z2 = true;
            modality = companion.convertFromFlags(z2, r6.jClass.isFinal() ^ true);
        }
        r6.modality = modality;
        r6.visibility = r6.jClass.getVisibility();
        if (!(r6.jClass.getOuterClass() == null || r6.jClass.isStatic())) {
            z = true;
        }
        r6.isInner = z;
        r6.typeConstructor = new LazyJavaClassTypeConstructor();
        r6.unsubstitutedMemberScope = new LazyJavaClassMemberScope(r6.f60039c, classDescriptor2, r6.jClass);
        r6.innerClassesScope = new InnerClassesScopeWrapper(getUnsubstitutedMemberScope());
        r6.staticScope = new LazyJavaStaticClassScope(r6.f60039c, r6.jClass, r6);
        r6.annotations = LazyJavaAnnotationsKt.resolveAnnotations(r6.f60039c, r6.jClass);
        r6.declaredParameters = r6.f60039c.getStorageManager().createLazyValue(new LazyJavaClassDescriptor$declaredParameters$1(r6));
    }

    @NotNull
    public ClassKind getKind() {
        return this.kind;
    }

    @NotNull
    public Modality getModality() {
        return this.modality;
    }

    @NotNull
    public Visibility getVisibility() {
        return (C2668g.a(this.visibility, Visibilities.PRIVATE) && this.jClass.getOuterClass() == null) ? JavaVisibilities.PACKAGE_VISIBILITY : this.visibility;
    }

    public boolean isInner() {
        return this.isInner;
    }

    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @NotNull
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        return this.unsubstitutedMemberScope;
    }

    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return this.innerClassesScope;
    }

    @NotNull
    public MemberScope getStaticScope() {
        return this.staticScope;
    }

    @NotNull
    public List<ClassConstructorDescriptor> getConstructors() {
        return (List) this.unsubstitutedMemberScope.getConstructors$descriptors_jvm().invoke();
    }

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return (List) this.declaredParameters.invoke();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy Java class ");
        stringBuilder.append(DescriptorUtilsKt.getFqNameUnsafe(this));
        return stringBuilder.toString();
    }

    @NotNull
    public final LazyJavaClassDescriptor copy$descriptors_jvm(@NotNull JavaResolverCache javaResolverCache, @Nullable ClassDescriptor classDescriptor) {
        C2668g.b(javaResolverCache, "javaResolverCache");
        javaResolverCache = ContextKt.replaceComponents(this.f60039c, this.f60039c.getComponents().replace(javaResolverCache));
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        C2668g.a(containingDeclaration, "containingDeclaration");
        return new LazyJavaClassDescriptor(javaResolverCache, containingDeclaration, this.jClass, classDescriptor);
    }
}
