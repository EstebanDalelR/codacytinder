package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaPackageScope extends LazyJavaStaticScope {
    private final MemoizedFunctionToNullable<FindClassRequest, ClassDescriptor> classes;
    private final JavaPackage jPackage;
    private final NullableLazyValue<Set<String>> knownClassNamesInPackage;
    @NotNull
    private final LazyJavaPackageFragment ownerDescriptor;

    private static final class FindClassRequest {
        @Nullable
        private final JavaClass javaClass;
        @NotNull
        private final Name name;

        public FindClassRequest(@NotNull Name name, @Nullable JavaClass javaClass) {
            C2668g.b(name, "name");
            this.name = name;
            this.javaClass = javaClass;
        }

        @Nullable
        public final JavaClass getJavaClass() {
            return this.javaClass;
        }

        @NotNull
        public final Name getName() {
            return this.name;
        }

        public boolean equals(@Nullable Object obj) {
            return (!(obj instanceof FindClassRequest) || C2668g.a(this.name, ((FindClassRequest) obj).name) == null) ? null : true;
        }

        public int hashCode() {
            return this.name.hashCode();
        }
    }

    private static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {
            @NotNull
            private final ClassDescriptor descriptor;

            public Found(@NotNull ClassDescriptor classDescriptor) {
                C2668g.b(classDescriptor, "descriptor");
                super();
                this.descriptor = classDescriptor;
            }

            @NotNull
            public final ClassDescriptor getDescriptor() {
                return this.descriptor;
            }
        }

        public static final class NotFound extends KotlinClassLookupResult {
            public static final NotFound INSTANCE = new NotFound();

            private NotFound() {
                super();
            }
        }

        public static final class SyntheticClass extends KotlinClassLookupResult {
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            private SyntheticClass() {
                super();
            }
        }

        private KotlinClassLookupResult() {
        }
    }

    protected void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        C2668g.b(collection, "result");
        C2668g.b(name, "name");
    }

    @NotNull
    protected LazyJavaPackageFragment getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    public LazyJavaPackageScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage, @NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(javaPackage, "jPackage");
        C2668g.b(lazyJavaPackageFragment, "ownerDescriptor");
        super(lazyJavaResolverContext);
        this.jPackage = javaPackage;
        this.ownerDescriptor = lazyJavaPackageFragment;
        this.knownClassNamesInPackage = lazyJavaResolverContext.getStorageManager().createNullableLazyValue((Function0) new LazyJavaPackageScope$knownClassNamesInPackage$1(this, lazyJavaResolverContext));
        this.classes = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues((Function1) new LazyJavaPackageScope$classes$1(this, lazyJavaResolverContext));
    }

    private final KotlinClassLookupResult resolveKotlinBinaryClass(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return (KotlinClassLookupResult) NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() != Kind.CLASS) {
            return (KotlinClassLookupResult) SyntheticClass.INSTANCE;
        }
        kotlinJvmBinaryClass = getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
        return kotlinJvmBinaryClass != null ? new Found(kotlinJvmBinaryClass) : (KotlinClassLookupResult) NotFound.INSTANCE;
    }

    @Nullable
    public ClassDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return findClassifier(name, null);
    }

    private final ClassDescriptor findClassifier(Name name, JavaClass javaClass) {
        if (!SpecialNames.isSafeIdentifier(name)) {
            return null;
        }
        Set set = (Set) this.knownClassNamesInPackage.invoke();
        if (javaClass != null || set == null || set.contains(name.asString())) {
            return (ClassDescriptor) this.classes.invoke(new FindClassRequest(name, javaClass));
        }
        return null;
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass) {
        C2668g.b(javaClass, "javaClass");
        return findClassifier(javaClass.getName(), javaClass);
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return C17554o.m64195a();
    }

    @NotNull
    protected DeclaredMemberIndex computeMemberIndex() {
        return Empty.INSTANCE;
    }

    @NotNull
    protected Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK()) == null) {
            return am.m64176a();
        }
        Set<String> set = (Set) this.knownClassNamesInPackage.invoke();
        Collection collection;
        if (set != null) {
            collection = (Collection) new HashSet();
            for (String identifier : set) {
                collection.add(Name.identifier(identifier));
            }
            return (Set) collection;
        }
        descriptorKindFilter = this.jPackage;
        if (function1 == null) {
            function1 = FunctionsKt.alwaysTrue();
        }
        Iterable<JavaClass> classes = descriptorKindFilter.getClasses(function1);
        collection = (Collection) new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            Object name = javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                collection.add(name);
            }
        }
        return (Set) collection;
    }

    @NotNull
    protected Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        return am.m64176a();
    }

    @NotNull
    protected Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        return am.m64176a();
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        return computeDescriptors(descriptorKindFilter, function1, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
    }
}
