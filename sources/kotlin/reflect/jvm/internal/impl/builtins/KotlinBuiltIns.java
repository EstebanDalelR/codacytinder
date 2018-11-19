package kotlin.reflect.jvm.internal.impl.builtins;

import com.tinder.api.ManagerWebServices;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class KotlinBuiltIns {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final FqName ANNOTATION_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("annotation"));
    public static final Name BUILTINS_MODULE_NAME = Name.special("<built-ins module>");
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME = FqName.topLevel(BUILT_INS_PACKAGE_NAME);
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES = am.m64178a((Object[]) new FqName[]{BUILT_INS_PACKAGE_FQ_NAME, COLLECTIONS_PACKAGE_FQ_NAME, RANGES_PACKAGE_FQ_NAME, ANNOTATION_PACKAGE_FQ_NAME, ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("internal"))});
    public static final Name BUILT_INS_PACKAGE_NAME = Name.identifier("kotlin");
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("collections"));
    public static final FqNames FQ_NAMES = new FqNames();
    public static final FqName RANGES_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("ranges"));
    public static final FqName TEXT_PACKAGE_FQ_NAME = BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(ManagerWebServices.PARAM_TEXT));
    private final MemoizedFunctionToNotNull<Name, ClassDescriptor> builtInClassesByName;
    private ModuleDescriptorImpl builtInsModule;
    private final NotNullLazyValue<PackageFragments> packageFragments;
    private final NotNullLazyValue<Primitives> primitives;
    private final StorageManager storageManager;
    private final MemoizedFunctionToNotNull<Integer, ClassDescriptor> suspendFunctionClasses;

    public static class FqNames {
        public final FqNameUnsafe _boolean = fqNameUnsafe("Boolean");
        public final FqNameUnsafe _byte = fqNameUnsafe("Byte");
        public final FqNameUnsafe _char = fqNameUnsafe("Char");
        public final FqNameUnsafe _double = fqNameUnsafe("Double");
        public final FqNameUnsafe _enum = fqNameUnsafe("Enum");
        public final FqNameUnsafe _float = fqNameUnsafe("Float");
        public final FqNameUnsafe _int = fqNameUnsafe("Int");
        public final FqNameUnsafe _long = fqNameUnsafe("Long");
        public final FqNameUnsafe _short = fqNameUnsafe("Short");
        public final FqName annotation = fqName("Annotation");
        public final FqName annotationRetention = annotationName("AnnotationRetention");
        public final FqName annotationTarget = annotationName("AnnotationTarget");
        public final FqNameUnsafe any = fqNameUnsafe("Any");
        public final FqNameUnsafe array = fqNameUnsafe("Array");
        public final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
        public final FqNameUnsafe charRange = rangesFqName("CharRange");
        public final FqNameUnsafe charSequence = fqNameUnsafe("CharSequence");
        public final FqNameUnsafe cloneable = fqNameUnsafe("Cloneable");
        public final FqName collection = collectionsFqName("Collection");
        public final FqName comparable = fqName("Comparable");
        public final FqName deprecated = fqName("Deprecated");
        public final FqName deprecationLevel = fqName("DeprecationLevel");
        public final FqName extensionFunctionType = fqName("ExtensionFunctionType");
        public final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
        public final FqNameUnsafe functionSupertype = fqNameUnsafe("Function");
        public final FqNameUnsafe intRange = rangesFqName("IntRange");
        public final FqName iterable = collectionsFqName("Iterable");
        public final FqName iterator = collectionsFqName("Iterator");
        public final FqNameUnsafe kCallable = reflect("KCallable");
        public final FqNameUnsafe kClass = reflect("KClass");
        public final FqNameUnsafe kMutableProperty0 = reflect("KMutableProperty0");
        public final FqNameUnsafe kMutableProperty1 = reflect("KMutableProperty1");
        public final FqNameUnsafe kMutableProperty2 = reflect("KMutableProperty2");
        public final ClassId kProperty = ClassId.topLevel(reflect("KProperty").toSafe());
        public final FqNameUnsafe kProperty0 = reflect("KProperty0");
        public final FqNameUnsafe kProperty1 = reflect("KProperty1");
        public final FqNameUnsafe kProperty2 = reflect("KProperty2");
        public final FqName list = collectionsFqName("List");
        public final FqName listIterator = collectionsFqName("ListIterator");
        public final FqNameUnsafe longRange = rangesFqName("LongRange");
        public final FqName map = collectionsFqName("Map");
        public final FqName mapEntry = this.map.child(Name.identifier("Entry"));
        public final FqName mustBeDocumented = annotationName("MustBeDocumented");
        public final FqName mutableCollection = collectionsFqName("MutableCollection");
        public final FqName mutableIterable = collectionsFqName("MutableIterable");
        public final FqName mutableIterator = collectionsFqName("MutableIterator");
        public final FqName mutableList = collectionsFqName("MutableList");
        public final FqName mutableListIterator = collectionsFqName("MutableListIterator");
        public final FqName mutableMap = collectionsFqName("MutableMap");
        public final FqName mutableMapEntry = this.mutableMap.child(Name.identifier("MutableEntry"));
        public final FqName mutableSet = collectionsFqName("MutableSet");
        public final FqNameUnsafe nothing = fqNameUnsafe("Nothing");
        public final FqNameUnsafe number = fqNameUnsafe("Number");
        public final FqName parameterName = fqName("ParameterName");
        public final Set<Name> primitiveArrayTypeShortNames = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
        public final Set<Name> primitiveTypeShortNames = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
        public final FqName publishedApi = fqName("PublishedApi");
        public final FqName repeatable = annotationName("Repeatable");
        public final FqName replaceWith = fqName("ReplaceWith");
        public final FqName retention = annotationName("Retention");
        public final FqName set = collectionsFqName("Set");
        public final FqNameUnsafe string = fqNameUnsafe("String");
        public final FqName suppress = fqName("Suppress");
        public final FqName target = annotationName("Target");
        public final FqName throwable = fqName("Throwable");
        public final FqNameUnsafe unit = fqNameUnsafe("Unit");
        public final FqName unsafeVariance = fqName("UnsafeVariance");

        public FqNames() {
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                this.primitiveTypeShortNames.add(primitiveType.getTypeName());
                this.primitiveArrayTypeShortNames.add(primitiveType.getArrayTypeName());
                this.fqNameToPrimitiveType.put(fqNameUnsafe(primitiveType.getTypeName().asString()), primitiveType);
                this.arrayClassFqNameToPrimitiveType.put(fqNameUnsafe(primitiveType.getArrayTypeName().asString()), primitiveType);
            }
        }

        @NotNull
        private static FqNameUnsafe fqNameUnsafe(@NotNull String str) {
            return fqName(str).toUnsafe();
        }

        @NotNull
        private static FqName fqName(@NotNull String str) {
            return KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
        }

        @NotNull
        private static FqName collectionsFqName(@NotNull String str) {
            return KotlinBuiltIns.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
        }

        @NotNull
        private static FqNameUnsafe rangesFqName(@NotNull String str) {
            return KotlinBuiltIns.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
        }

        @NotNull
        private static FqNameUnsafe reflect(@NotNull String str) {
            return ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME().child(Name.identifier(str)).toUnsafe();
        }

        @NotNull
        private static FqName annotationName(@NotNull String str) {
            return KotlinBuiltIns.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
        }
    }

    private static class PackageFragments {
        public final Set<PackageFragmentDescriptor> allImportedByDefaultBuiltInsPackageFragments;
        public final PackageFragmentDescriptor annotationPackageFragment;
        public final PackageFragmentDescriptor builtInsPackageFragment;
        public final PackageFragmentDescriptor collectionsPackageFragment;

        private PackageFragments(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull PackageFragmentDescriptor packageFragmentDescriptor2, @NotNull PackageFragmentDescriptor packageFragmentDescriptor3, @NotNull Set<PackageFragmentDescriptor> set) {
            this.builtInsPackageFragment = packageFragmentDescriptor;
            this.collectionsPackageFragment = packageFragmentDescriptor2;
            this.annotationPackageFragment = packageFragmentDescriptor3;
            this.allImportedByDefaultBuiltInsPackageFragments = set;
        }
    }

    private static class Primitives {
        public final Map<SimpleType, SimpleType> kotlinArrayTypeToPrimitiveKotlinType;
        public final Map<KotlinType, SimpleType> primitiveKotlinTypeToKotlinArrayType;
        public final Map<PrimitiveType, SimpleType> primitiveTypeToArrayKotlinType;

        private Primitives(@NotNull Map<PrimitiveType, SimpleType> map, @NotNull Map<KotlinType, SimpleType> map2, @NotNull Map<SimpleType, SimpleType> map3) {
            this.primitiveTypeToArrayKotlinType = map;
            this.primitiveKotlinTypeToKotlinArrayType = map2;
            this.kotlinArrayTypeToPrimitiveKotlinType = map3;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$1 */
    class C184651 implements Function0<PackageFragments> {
        C184651() {
        }

        public PackageFragments invoke() {
            PackageFragmentProvider packageFragmentProvider = KotlinBuiltIns.this.builtInsModule.getPackageFragmentProvider();
            Map linkedHashMap = new LinkedHashMap();
            PackageFragmentDescriptor access$100 = KotlinBuiltIns.this.createPackage(packageFragmentProvider, linkedHashMap, KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME);
            PackageFragmentDescriptor access$1002 = KotlinBuiltIns.this.createPackage(packageFragmentProvider, linkedHashMap, KotlinBuiltIns.COLLECTIONS_PACKAGE_FQ_NAME);
            KotlinBuiltIns.this.createPackage(packageFragmentProvider, linkedHashMap, KotlinBuiltIns.RANGES_PACKAGE_FQ_NAME);
            return new PackageFragments(access$100, access$1002, KotlinBuiltIns.this.createPackage(packageFragmentProvider, linkedHashMap, KotlinBuiltIns.ANNOTATION_PACKAGE_FQ_NAME), new LinkedHashSet(linkedHashMap.values()));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$2 */
    class C184662 implements Function0<Primitives> {
        C184662() {
        }

        public Primitives invoke() {
            Map enumMap = new EnumMap(PrimitiveType.class);
            Map hashMap = new HashMap();
            Map hashMap2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                SimpleType access$400 = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getTypeName().asString());
                SimpleType access$4002 = KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getArrayTypeName().asString());
                enumMap.put(primitiveType, access$4002);
                hashMap.put(access$400, access$4002);
                hashMap2.put(access$4002, access$400);
            }
            return new Primitives(enumMap, hashMap, hashMap2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$3 */
    class C184673 implements Function1<Integer, ClassDescriptor> {
        C184673() {
        }

        public ClassDescriptor invoke(Integer num) {
            return new FunctionClassDescriptor(KotlinBuiltIns.this.getStorageManager(), ((PackageFragments) KotlinBuiltIns.this.packageFragments.invoke()).builtInsPackageFragment, Kind.SuspendFunction, num.intValue());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$4 */
    class C184684 implements Function1<Name, ClassDescriptor> {
        C184684() {
        }

        public ClassDescriptor invoke(Name name) {
            return KotlinBuiltIns.getBuiltInClassByName(name, KotlinBuiltIns.this.getBuiltInsPackageFragment());
        }
    }

    protected KotlinBuiltIns(@NotNull StorageManager storageManager) {
        this.storageManager = storageManager;
        this.packageFragments = storageManager.createLazyValue(new C184651());
        this.primitives = storageManager.createLazyValue(new C184662());
        this.suspendFunctionClasses = storageManager.createMemoizedFunction(new C184673());
        this.builtInClassesByName = storageManager.createMemoizedFunction(new C184684());
    }

    protected void createBuiltInsModule() {
        this.builtInsModule = new ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.storageManager, this, null);
        this.builtInsModule.initialize(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.storageManager, this.builtInsModule, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider()));
        this.builtInsModule.setDependencies(this.builtInsModule);
    }

    @NotNull
    protected AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return None.INSTANCE;
    }

    @NotNull
    protected PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return NoPlatformDependent.INSTANCE;
    }

    @NotNull
    protected Iterable<ClassDescriptorFactory> getClassDescriptorFactories() {
        return Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.storageManager, this.builtInsModule));
    }

    @NotNull
    private PackageFragmentDescriptor createPackage(@NotNull PackageFragmentProvider packageFragmentProvider, @Nullable Map<FqName, PackageFragmentDescriptor> map, @NotNull FqName fqName) {
        final List packageFragments = packageFragmentProvider.getPackageFragments(fqName);
        if (packageFragments.isEmpty() != null) {
            packageFragmentProvider = new EmptyPackageFragmentDescriptor(this.builtInsModule, fqName);
        } else if (packageFragments.size() == 1) {
            packageFragmentProvider = (PackageFragmentDescriptor) packageFragments.iterator().next();
        } else {
            final FqName fqName2 = fqName;
            PackageFragmentProvider c192946 = new PackageFragmentDescriptorImpl(this.builtInsModule, fqName) {

                /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns$6$1 */
                class C184691 implements Function1<PackageFragmentDescriptor, MemberScope> {
                    C184691() {
                    }

                    public MemberScope invoke(PackageFragmentDescriptor packageFragmentDescriptor) {
                        return packageFragmentDescriptor.getMemberScope();
                    }
                }

                @NotNull
                public MemberScope getMemberScope() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("built-in package ");
                    stringBuilder.append(fqName2);
                    return new ChainedMemberScope(stringBuilder.toString(), C19299w.m68822d(packageFragments, new C184691()));
                }
            };
        }
        if (map != null) {
            map.put(fqName, packageFragmentProvider);
        }
        return packageFragmentProvider;
    }

    @NotNull
    protected StorageManager getStorageManager() {
        return this.storageManager;
    }

    @NotNull
    public ModuleDescriptorImpl getBuiltInsModule() {
        return this.builtInsModule;
    }

    @NotNull
    public PackageFragmentDescriptor getBuiltInsPackageFragment() {
        return ((PackageFragments) this.packageFragments.invoke()).builtInsPackageFragment;
    }

    public static boolean isBuiltIn(@NotNull DeclarationDescriptor declarationDescriptor) {
        return DescriptorUtils.getParentOfType(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
    }

    public static boolean isUnderKotlinPackage(@NotNull DeclarationDescriptor declarationDescriptor) {
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return null;
    }

    @NotNull
    public ClassDescriptor getBuiltInClassByName(@NotNull Name name) {
        return (ClassDescriptor) this.builtInClassesByName.invoke(name);
    }

    @NotNull
    private static ClassDescriptor getBuiltInClassByName(@NotNull Name name, @NotNull PackageFragmentDescriptor packageFragmentDescriptor) {
        ClassDescriptor builtInClassByNameNullable = getBuiltInClassByNameNullable(name, packageFragmentDescriptor);
        if (builtInClassByNameNullable != null) {
            return builtInClassByNameNullable;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Built-in class ");
        stringBuilder.append(packageFragmentDescriptor.getFqName().child(name).asString());
        stringBuilder.append(" is not found");
        throw new AssertionError(stringBuilder.toString());
    }

    @Nullable
    public ClassDescriptor getBuiltInClassByFqNameNullable(@NotNull FqName fqName) {
        return DescriptorUtilKt.resolveClassByFqName(this.builtInsModule, fqName, NoLookupLocation.FROM_BUILTINS);
    }

    @NotNull
    public ClassDescriptor getBuiltInClassByFqName(@NotNull FqName fqName) {
        return getBuiltInClassByFqNameNullable(fqName);
    }

    @Nullable
    private static ClassDescriptor getBuiltInClassByNameNullable(@NotNull Name name, @NotNull PackageFragmentDescriptor packageFragmentDescriptor) {
        return (ClassDescriptor) packageFragmentDescriptor.getMemberScope().getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
    }

    @NotNull
    private ClassDescriptor getBuiltInClassByName(@NotNull String str) {
        return getBuiltInClassByName(Name.identifier(str));
    }

    @NotNull
    private static ClassDescriptor getBuiltInClassByName(@NotNull String str, PackageFragmentDescriptor packageFragmentDescriptor) {
        return getBuiltInClassByName(Name.identifier(str), packageFragmentDescriptor);
    }

    @NotNull
    public ClassDescriptor getAny() {
        return getBuiltInClassByName("Any");
    }

    @NotNull
    public ClassDescriptor getNothing() {
        return getBuiltInClassByName("Nothing");
    }

    @NotNull
    private ClassDescriptor getPrimitiveClassDescriptor(@NotNull PrimitiveType primitiveType) {
        return getBuiltInClassByName(primitiveType.getTypeName().asString());
    }

    @NotNull
    public ClassDescriptor getArray() {
        return getBuiltInClassByName("Array");
    }

    @NotNull
    public ClassDescriptor getNumber() {
        return getBuiltInClassByName("Number");
    }

    @NotNull
    public ClassDescriptor getUnit() {
        return getBuiltInClassByName("Unit");
    }

    @NotNull
    public static String getFunctionName(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Function");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    @NotNull
    public static ClassId getFunctionClassId(int i) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i)));
    }

    @NotNull
    public ClassDescriptor getFunction(int i) {
        return getBuiltInClassByName(getFunctionName(i));
    }

    @NotNull
    public ClassDescriptor getSuspendFunction(int i) {
        return (ClassDescriptor) this.suspendFunctionClasses.invoke(Integer.valueOf(i));
    }

    @NotNull
    public ClassDescriptor getString() {
        return getBuiltInClassByName("String");
    }

    @NotNull
    private ClassDescriptor getCollectionClassByName(@NotNull String str) {
        return getBuiltInClassByName(str, ((PackageFragments) this.packageFragments.invoke()).collectionsPackageFragment);
    }

    @NotNull
    public ClassDescriptor getCollection() {
        return getCollectionClassByName("Collection");
    }

    @NotNull
    private SimpleType getBuiltInTypeByClassName(@NotNull String str) {
        return getBuiltInClassByName(str).getDefaultType();
    }

    @NotNull
    public SimpleType getNothingType() {
        return getNothing().getDefaultType();
    }

    @NotNull
    public SimpleType getNullableNothingType() {
        return getNothingType().makeNullableAsSpecified(true);
    }

    @NotNull
    public SimpleType getAnyType() {
        return getAny().getDefaultType();
    }

    @NotNull
    public SimpleType getNullableAnyType() {
        return getAnyType().makeNullableAsSpecified(true);
    }

    @NotNull
    public SimpleType getDefaultBound() {
        return getNullableAnyType();
    }

    @NotNull
    public SimpleType getPrimitiveKotlinType(@NotNull PrimitiveType primitiveType) {
        return getPrimitiveClassDescriptor(primitiveType).getDefaultType();
    }

    @NotNull
    public SimpleType getByteType() {
        return getPrimitiveKotlinType(PrimitiveType.BYTE);
    }

    @NotNull
    public SimpleType getShortType() {
        return getPrimitiveKotlinType(PrimitiveType.SHORT);
    }

    @NotNull
    public SimpleType getIntType() {
        return getPrimitiveKotlinType(PrimitiveType.INT);
    }

    @NotNull
    public SimpleType getLongType() {
        return getPrimitiveKotlinType(PrimitiveType.LONG);
    }

    @NotNull
    public SimpleType getFloatType() {
        return getPrimitiveKotlinType(PrimitiveType.FLOAT);
    }

    @NotNull
    public SimpleType getDoubleType() {
        return getPrimitiveKotlinType(PrimitiveType.DOUBLE);
    }

    @NotNull
    public SimpleType getCharType() {
        return getPrimitiveKotlinType(PrimitiveType.CHAR);
    }

    @NotNull
    public SimpleType getBooleanType() {
        return getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
    }

    @NotNull
    public SimpleType getUnitType() {
        return getUnit().getDefaultType();
    }

    @NotNull
    public SimpleType getStringType() {
        return getString().getDefaultType();
    }

    @NotNull
    public KotlinType getArrayElementType(@NotNull KotlinType kotlinType) {
        if (!isArray(kotlinType)) {
            KotlinType kotlinType2 = (KotlinType) ((Primitives) this.primitives.invoke()).kotlinArrayTypeToPrimitiveKotlinType.get(TypeUtils.makeNotNullable(kotlinType));
            if (kotlinType2 != null) {
                return kotlinType2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("not array: ");
            stringBuilder.append(kotlinType);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (kotlinType.getArguments().size() == 1) {
            return ((TypeProjection) kotlinType.getArguments().get(0)).getType();
        } else {
            throw new IllegalStateException();
        }
    }

    @NotNull
    public SimpleType getPrimitiveArrayKotlinType(@NotNull PrimitiveType primitiveType) {
        return (SimpleType) ((Primitives) this.primitives.invoke()).primitiveTypeToArrayKotlinType.get(primitiveType);
    }

    @Nullable
    public SimpleType getPrimitiveArrayKotlinTypeByPrimitiveKotlinType(@NotNull KotlinType kotlinType) {
        return (SimpleType) ((Primitives) this.primitives.invoke()).primitiveKotlinTypeToKotlinArrayType.get(kotlinType);
    }

    public static boolean isPrimitiveArray(@NotNull FqNameUnsafe fqNameUnsafe) {
        return FQ_NAMES.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null ? true : null;
    }

    @Nullable
    public static PrimitiveType getPrimitiveType(@NotNull DeclarationDescriptor declarationDescriptor) {
        return FQ_NAMES.primitiveTypeShortNames.contains(declarationDescriptor.getName()) ? (PrimitiveType) FQ_NAMES.fqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor)) : null;
    }

    @Nullable
    public static PrimitiveType getPrimitiveArrayType(@NotNull DeclarationDescriptor declarationDescriptor) {
        return FQ_NAMES.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName()) ? (PrimitiveType) FQ_NAMES.arrayClassFqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor)) : null;
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        return KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), getArray(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
    }

    public static boolean isArray(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.array);
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull ClassDescriptor classDescriptor) {
        if (!classFqNameEquals(classDescriptor, FQ_NAMES.array)) {
            if (getPrimitiveArrayType(classDescriptor) == null) {
                return null;
            }
        }
        return true;
    }

    public static boolean isPrimitiveArray(@NotNull KotlinType kotlinType) {
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        return (kotlinType == null || getPrimitiveArrayType(kotlinType) == null) ? null : true;
    }

    public static boolean isPrimitiveType(@NotNull KotlinType kotlinType) {
        return (kotlinType.isMarkedNullable() || isPrimitiveTypeOrNullablePrimitiveType(kotlinType) == null) ? null : true;
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(@NotNull KotlinType kotlinType) {
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        return (!(kotlinType instanceof ClassDescriptor) || isPrimitiveClass((ClassDescriptor) kotlinType) == null) ? null : true;
    }

    public static boolean isPrimitiveClass(@NotNull ClassDescriptor classDescriptor) {
        return getPrimitiveType(classDescriptor) != null ? true : null;
    }

    public static boolean isConstructedFromGivenClass(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        kotlinType = kotlinType.getConstructor().getDeclarationDescriptor();
        return (!(kotlinType instanceof ClassDescriptor) || classFqNameEquals(kotlinType, fqNameUnsafe) == null) ? null : true;
    }

    private static boolean classFqNameEquals(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull FqNameUnsafe fqNameUnsafe) {
        return (!classifierDescriptor.getName().equals(fqNameUnsafe.shortName()) || fqNameUnsafe.equals(DescriptorUtils.getFqName(classifierDescriptor)) == null) ? null : true;
    }

    private static boolean isNotNullConstructedFromGivenClass(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        return (kotlinType.isMarkedNullable() || isConstructedFromGivenClass(kotlinType, fqNameUnsafe) == null) ? null : true;
    }

    public static boolean isSpecialClassWithNoSupertypes(@NotNull ClassDescriptor classDescriptor) {
        if (!classFqNameEquals(classDescriptor, FQ_NAMES.any)) {
            if (classFqNameEquals(classDescriptor, FQ_NAMES.nothing) == null) {
                return null;
            }
        }
        return true;
    }

    public static boolean isAny(@NotNull ClassDescriptor classDescriptor) {
        return classFqNameEquals(classDescriptor, FQ_NAMES.any);
    }

    public static boolean isBoolean(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._boolean);
    }

    public static boolean isChar(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._char);
    }

    public static boolean isInt(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._int);
    }

    public static boolean isByte(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._byte);
    }

    public static boolean isLong(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._long);
    }

    public static boolean isShort(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._short);
    }

    public static boolean isFloat(@NotNull KotlinType kotlinType) {
        return (isFloatOrNullableFloat(kotlinType) && kotlinType.isMarkedNullable() == null) ? true : null;
    }

    public static boolean isFloatOrNullableFloat(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES._float);
    }

    public static boolean isDouble(@NotNull KotlinType kotlinType) {
        return (isDoubleOrNullableDouble(kotlinType) && kotlinType.isMarkedNullable() == null) ? true : null;
    }

    public static boolean isDoubleOrNullableDouble(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES._double);
    }

    private static boolean isConstructedFromGivenClassAndNotNullable(@NotNull KotlinType kotlinType, @NotNull FqNameUnsafe fqNameUnsafe) {
        return (isConstructedFromGivenClass(kotlinType, fqNameUnsafe) == null || kotlinType.isMarkedNullable() != null) ? null : true;
    }

    public static boolean isNothing(@NotNull KotlinType kotlinType) {
        return (isNothingOrNullableNothing(kotlinType) && TypeUtils.isNullableType(kotlinType) == null) ? true : null;
    }

    public static boolean isNothingOrNullableNothing(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.nothing);
    }

    public static boolean isAnyOrNullableAny(@NotNull KotlinType kotlinType) {
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.any);
    }

    public static boolean isNullableAny(@NotNull KotlinType kotlinType) {
        return (!isAnyOrNullableAny(kotlinType) || kotlinType.isMarkedNullable() == null) ? null : true;
    }

    public static boolean isDefaultBound(@NotNull KotlinType kotlinType) {
        return isNullableAny(kotlinType);
    }

    public static boolean isUnit(@NotNull KotlinType kotlinType) {
        return isNotNullConstructedFromGivenClass(kotlinType, FQ_NAMES.unit);
    }

    public static boolean isString(@Nullable KotlinType kotlinType) {
        return (kotlinType == null || isNotNullConstructedFromGivenClass(kotlinType, FQ_NAMES.string) == null) ? null : true;
    }

    public static boolean isKClass(@NotNull ClassDescriptor classDescriptor) {
        return classFqNameEquals(classDescriptor, FQ_NAMES.kClass);
    }

    public static boolean isDeprecated(@NotNull DeclarationDescriptor declarationDescriptor) {
        boolean z = true;
        if (containsAnnotation(declarationDescriptor, FQ_NAMES.deprecated)) {
            return true;
        }
        if (!(declarationDescriptor instanceof PropertyDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
        boolean isVar = propertyDescriptor.isVar();
        DeclarationDescriptor getter = propertyDescriptor.getGetter();
        declarationDescriptor = propertyDescriptor.getSetter();
        if (getter != null && isDeprecated(getter)) {
            if (isVar) {
                if (!(declarationDescriptor == null || isDeprecated(declarationDescriptor) == null)) {
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public static FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    private static boolean containsAnnotation(DeclarationDescriptor declarationDescriptor, FqName fqName) {
        Annotations annotations = declarationDescriptor.getOriginal().getAnnotations();
        if (annotations.findAnnotation(fqName) != null) {
            return true;
        }
        declarationDescriptor = AnnotationUseSiteTarget.Companion.getAssociatedUseSiteTarget(declarationDescriptor);
        if (declarationDescriptor == null || Annotations.Companion.findUseSiteTargetedAnnotation(annotations, declarationDescriptor, fqName) == null) {
            return null;
        }
        return true;
    }
}
