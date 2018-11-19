package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.platform.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

public class JvmBuiltInsSettings implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JvmBuiltInsSettings.class), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JvmBuiltInsSettings.class), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JvmBuiltInsSettings.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JvmBuiltInsSettings.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationsImpl;"))};
    @NotNull
    private static final Set<String> BLACK_LIST_CONSTRUCTOR_SIGNATURES;
    @NotNull
    private static final Set<String> BLACK_LIST_METHOD_SIGNATURES;
    public static final Companion Companion = new Companion();
    @NotNull
    private static final Set<String> DROP_LIST_METHOD_SIGNATURES = an.m66900a((Set) SignatureBuildingComponents.INSTANCE.inJavaUtil("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), (Object) "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    @NotNull
    private static final Set<String> MUTABLE_METHOD_SIGNATURES;
    @NotNull
    private static final Set<String> WHITE_LIST_CONSTRUCTOR_SIGNATURES;
    @NotNull
    private static final Set<String> WHITE_LIST_METHOD_SIGNATURES;
    private final NotNullLazyValue cloneableType$delegate;
    private final Lazy isAdditionalBuiltInsFeatureSupported$delegate;
    private final JavaToKotlinClassMap j2kClassMap = JavaToKotlinClassMap.INSTANCE;
    private final CacheWithNotNullValues<FqName, ClassDescriptor> javaAnalogueClassesWithCustomSupertypeCache;
    private final KotlinType mockSerializableType;
    private final ModuleDescriptor moduleDescriptor;
    private final NotNullLazyValue notConsideredDeprecation$delegate;
    private final Lazy ownerModuleDescriptor$delegate;

    public static final class Companion {
        private Companion() {
        }

        public final boolean isSerializableInJava(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = "fqName";
            kotlin.jvm.internal.C2668g.b(r2, r0);
            r0 = r1;
            r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings.Companion) r0;
            r0 = r0.isArrayOrPrimitiveArray(r2);
            if (r0 == 0) goto L_0x0010;
        L_0x000e:
            r2 = 1;
            return r2;
        L_0x0010:
            r0 = kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap.INSTANCE;
            r2 = r0.mapKotlinToJava(r2);
            r0 = 0;
            if (r2 == 0) goto L_0x002d;
        L_0x0019:
            r2 = r2.asSingleFqName();	 Catch:{ ClassNotFoundException -> 0x002c }
            r2 = r2.asString();	 Catch:{ ClassNotFoundException -> 0x002c }
            r2 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x002c }
            r0 = java.io.Serializable.class;
            r2 = r0.isAssignableFrom(r2);
            return r2;
        L_0x002c:
            return r0;
        L_0x002d:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings.Companion.isSerializableInJava(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe):boolean");
        }

        private final boolean isArrayOrPrimitiveArray(FqNameUnsafe fqNameUnsafe) {
            if (!C2668g.a(fqNameUnsafe, KotlinBuiltIns.FQ_NAMES.array)) {
                if (KotlinBuiltIns.isPrimitiveArray(fqNameUnsafe) == null) {
                    return null;
                }
            }
            return true;
        }

        @NotNull
        public final Set<String> getDROP_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.DROP_LIST_METHOD_SIGNATURES;
        }

        @NotNull
        public final Set<String> getBLACK_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.BLACK_LIST_METHOD_SIGNATURES;
        }

        @NotNull
        public final Set<String> getWHITE_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.WHITE_LIST_METHOD_SIGNATURES;
        }

        private final Set<String> buildPrimitiveValueMethodsSet() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            Collection linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType jvmPrimitiveType : C17554o.m64199b((Object[]) new JvmPrimitiveType[]{JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR})) {
                String asString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
                C2668g.a(asString, "it.wrapperFqName.shortName().asString()");
                String[] strArr = new String[1];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(jvmPrimitiveType.getJavaKeywordName());
                stringBuilder.append("Value()");
                stringBuilder.append(jvmPrimitiveType.getDesc());
                strArr[0] = stringBuilder.toString();
                C19291t.m68635a(linkedHashSet, (Iterable) signatureBuildingComponents.inJavaLang(asString, strArr));
            }
            return (LinkedHashSet) linkedHashSet;
        }

        private final Set<String> buildPrimitiveStringConstructorsSet() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            Collection linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType wrapperFqName : C17554o.m64199b((Object[]) new JvmPrimitiveType[]{JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.BYTE, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, JvmPrimitiveType.BYTE, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT})) {
                String asString = wrapperFqName.getWrapperFqName().shortName().asString();
                C2668g.a(asString, "it.wrapperFqName.shortName().asString()");
                String[] constructors = signatureBuildingComponents.constructors("Ljava/lang/String;");
                C19291t.m68635a(linkedHashSet, (Iterable) signatureBuildingComponents.inJavaLang(asString, (String[]) Arrays.copyOf(constructors, constructors.length)));
            }
            return (LinkedHashSet) linkedHashSet;
        }
    }

    private enum JDKMemberStatus {
    }

    private final SimpleType getCloneableType() {
        return (SimpleType) StorageKt.getValue(this.cloneableType$delegate, (Object) this, $$delegatedProperties[2]);
    }

    private final AnnotationsImpl getNotConsideredDeprecation() {
        return (AnnotationsImpl) StorageKt.getValue(this.notConsideredDeprecation$delegate, (Object) this, $$delegatedProperties[3]);
    }

    private final ModuleDescriptor getOwnerModuleDescriptor() {
        Lazy lazy = this.ownerModuleDescriptor$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (ModuleDescriptor) lazy.getValue();
    }

    private final boolean isAdditionalBuiltInsFeatureSupported() {
        Lazy lazy = this.isAdditionalBuiltInsFeatureSupported$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    public JvmBuiltInsSettings(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull Function0<? extends ModuleDescriptor> function0, @NotNull Function0<Boolean> function02) {
        C2668g.b(moduleDescriptor, "moduleDescriptor");
        C2668g.b(storageManager, "storageManager");
        C2668g.b(function0, "deferredOwnerModuleDescriptor");
        C2668g.b(function02, "isAdditionalBuiltInsFeatureSupported");
        this.moduleDescriptor = moduleDescriptor;
        this.ownerModuleDescriptor$delegate = C15810e.m59833a(function0);
        this.isAdditionalBuiltInsFeatureSupported$delegate = C15810e.m59833a(function02);
        this.mockSerializableType = createMockJavaIoSerializableType(storageManager);
        this.cloneableType$delegate = storageManager.createLazyValue((Function0) new JvmBuiltInsSettings$cloneableType$2(this, storageManager));
        this.javaAnalogueClassesWithCustomSupertypeCache = storageManager.createCacheWithNotNullValues();
        this.notConsideredDeprecation$delegate = storageManager.createLazyValue((Function0) new JvmBuiltInsSettings$notConsideredDeprecation$2(this));
    }

    private final KotlinType createMockJavaIoSerializableType(@NotNull StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new C19295xaea9d104(this, this.moduleDescriptor, new FqName("java.io")), Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, C15807n.m59826a(new LazyWrappedType(storageManager, new C19127xf01ceaf8(this))), SourceElement.NO_SOURCE, false);
        classDescriptorImpl.initialize((MemberScope) Empty.INSTANCE, am.m64176a(), null);
        storageManager = classDescriptorImpl.getDefaultType();
        C2668g.a(storageManager, "mockSerializableClass.defaultType");
        return (KotlinType) storageManager;
    }

    @NotNull
    public Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        classDescriptor = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (Companion.isArrayOrPrimitiveArray(classDescriptor)) {
            classDescriptor = new KotlinType[2];
            SimpleType cloneableType = getCloneableType();
            C2668g.a(cloneableType, "cloneableType");
            classDescriptor[0] = cloneableType;
            classDescriptor[1] = this.mockSerializableType;
            return C17554o.m64199b((Object[]) classDescriptor);
        } else if (Companion.isSerializableInJava(classDescriptor) != null) {
            return C15807n.m59826a(this.mockSerializableType);
        } else {
            return C17554o.m64195a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.Name r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r7) {
        /*
        r5 = this;
        r0 = "name";
        kotlin.jvm.internal.C2668g.b(r6, r0);
        r0 = "classDescriptor";
        kotlin.jvm.internal.C2668g.b(r7, r0);
        r0 = kotlin.reflect.jvm.internal.impl.builtins.CloneableClassScope.Companion;
        r0 = r0.getCLONE_NAME$descriptors_jvm();
        r0 = kotlin.jvm.internal.C2668g.a(r6, r0);
        if (r0 == 0) goto L_0x009e;
    L_0x0016:
        r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
        if (r0 == 0) goto L_0x009e;
    L_0x001a:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArrayOrPrimitiveArray(r7);
        if (r0 == 0) goto L_0x009e;
    L_0x0020:
        r7 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r7;
        r0 = r7.getClassProto();
        r0 = r0.getFunctionList();
        r1 = "classDescriptor.classProto.functionList";
        kotlin.jvm.internal.C2668g.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r1 = r0 instanceof java.util.Collection;
        r2 = 0;
        if (r1 == 0) goto L_0x0040;
    L_0x0036:
        r1 = r0;
        r1 = (java.util.Collection) r1;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0072;
    L_0x0040:
        r0 = r0.iterator();
    L_0x0044:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0072;
    L_0x004a:
        r1 = r0.next();
        r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r1;
        r3 = r7.getC();
        r3 = r3.getNameResolver();
        r4 = "functionProto";
        kotlin.jvm.internal.C2668g.a(r1, r4);
        r1 = r1.getName();
        r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r3, r1);
        r3 = kotlin.reflect.jvm.internal.impl.builtins.CloneableClassScope.Companion;
        r3 = r3.getCLONE_NAME$descriptors_jvm();
        r1 = kotlin.jvm.internal.C2668g.a(r1, r3);
        if (r1 == 0) goto L_0x0044;
    L_0x0071:
        r2 = 1;
    L_0x0072:
        if (r2 == 0) goto L_0x007b;
    L_0x0074:
        r6 = kotlin.collections.C17554o.m64195a();
        r6 = (java.util.Collection) r6;
        return r6;
    L_0x007b:
        r0 = r5.getCloneableType();
        r0 = r0.getMemberScope();
        r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS;
        r1 = (kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation) r1;
        r6 = r0.getContributedFunctions(r6, r1);
        r6 = (java.lang.Iterable) r6;
        r6 = kotlin.collections.C19299w.m68828f(r6);
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r6;
        r6 = r5.createCloneForArray(r7, r6);
        r6 = kotlin.collections.C15807n.m59826a(r6);
        r6 = (java.util.Collection) r6;
        return r6;
    L_0x009e:
        r0 = r5.isAdditionalBuiltInsFeatureSupported();
        if (r0 != 0) goto L_0x00ab;
    L_0x00a4:
        r6 = kotlin.collections.C17554o.m64195a();
        r6 = (java.util.Collection) r6;
        return r6;
    L_0x00ab:
        r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings$getFunctions$2;
        r0.<init>(r6);
        r0 = (kotlin.jvm.functions.Function1) r0;
        r6 = r5.getAdditionalFunctions(r7, r0);
        r6 = (java.lang.Iterable) r6;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r6 = r6.iterator();
    L_0x00c3:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x0161;
    L_0x00c9:
        r1 = r6.next();
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r1;
        r2 = r1.getContainingDeclaration();
        if (r2 != 0) goto L_0x00dd;
    L_0x00d5:
        r6 = new kotlin.TypeCastException;
        r7 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
        r6.<init>(r7);
        throw r6;
    L_0x00dd:
        r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2;
        r2 = kotlin.reflect.jvm.internal.impl.platform.MappingUtilKt.createMappedTypeParametersSubstitution(r2, r7);
        r2 = r2.buildSubstitutor();
        r2 = r1.substitute(r2);
        if (r2 != 0) goto L_0x00f5;
    L_0x00ed:
        r6 = new kotlin.TypeCastException;
        r7 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor";
        r6.<init>(r7);
        throw r6;
    L_0x00f5:
        r2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r2;
        r2 = r2.newCopyBuilder();
        r3 = r7;
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3;
        r2.setOwner(r3);
        r3 = r7.getThisAsReceiverParameter();
        r2.setDispatchReceiverParameter(r3);
        r2.setPreserveSourceElement();
        r3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.UnsafeVarianceTypeSubstitution;
        r4 = r5.moduleDescriptor;
        r4 = r4.getBuiltIns();
        r3.<init>(r4);
        r3 = (kotlin.reflect.jvm.internal.impl.types.TypeSubstitution) r3;
        r2.setSubstitution(r3);
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1;
        r1 = r5.getJdkMethodStatus(r1);
        r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings.WhenMappings.$EnumSwitchMapping$0;
        r1 = r1.ordinal();
        r1 = r3[r1];
        r3 = 0;
        switch(r1) {
            case 1: goto L_0x013e;
            case 2: goto L_0x012e;
            case 3: goto L_0x015a;
            case 4: goto L_0x014e;
            default: goto L_0x012d;
        };
    L_0x012d:
        goto L_0x014e;
    L_0x012e:
        r1 = r5.getNotConsideredDeprecation();
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations) r1;
        r1 = r2.setAdditionalAnnotations(r1);
        r3 = "setAdditionalAnnotations(notConsideredDeprecation)";
        kotlin.jvm.internal.C2668g.a(r1, r3);
        goto L_0x014e;
    L_0x013e:
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.ModalityKt.isFinalClass(r7);
        if (r1 == 0) goto L_0x0145;
    L_0x0144:
        goto L_0x015a;
    L_0x0145:
        r1 = r2.setHiddenForResolutionEverywhereBesideSupercalls();
        r3 = "setHiddenForResolutionEverywhereBesideSupercalls()";
        kotlin.jvm.internal.C2668g.a(r1, r3);
    L_0x014e:
        r1 = r2.build();
        if (r1 != 0) goto L_0x0157;
    L_0x0154:
        kotlin.jvm.internal.C2668g.a();
    L_0x0157:
        r3 = r1;
        r3 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r3;
    L_0x015a:
        if (r3 == 0) goto L_0x00c3;
    L_0x015c:
        r0.add(r3);
        goto L_0x00c3;
    L_0x0161:
        r0 = (java.util.List) r0;
        r0 = (java.util.Collection) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings.getFunctions(kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>");
    }

    @NotNull
    public Set<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return am.m64176a();
        }
        classDescriptor = getJavaAnalogue(classDescriptor);
        if (classDescriptor != null) {
            classDescriptor = classDescriptor.getUnsubstitutedMemberScope();
            if (classDescriptor != null) {
                classDescriptor = classDescriptor.getFunctionNames();
                if (classDescriptor != null) {
                    return classDescriptor;
                }
            }
        }
        classDescriptor = am.m64176a();
        return classDescriptor;
    }

    private final Collection<SimpleFunctionDescriptor> getAdditionalFunctions(ClassDescriptor classDescriptor, Function1<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return C17554o.m64195a();
        }
        DeclarationDescriptor declarationDescriptor = javaAnalogue;
        Iterable<ClassDescriptor> mapPlatformClass = this.j2kClassMap.mapPlatformClass(DescriptorUtilsKt.getFqNameSafe(declarationDescriptor), FallbackBuiltIns.Companion.getInstance());
        ClassDescriptor classDescriptor2 = (ClassDescriptor) C19299w.m68825e(mapPlatformClass);
        if (classDescriptor2 == null) {
            return C17554o.m64195a();
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion companion = SmartSet.Companion;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) mapPlatformClass, 10));
        for (ClassDescriptor fqNameSafe : mapPlatformClass) {
            arrayList.add(DescriptorUtilsKt.getFqNameSafe(fqNameSafe));
        }
        SmartSet create = companion.create((List) arrayList);
        classDescriptor = this.j2kClassMap.isMutable(classDescriptor);
        MemberScope unsubstitutedMemberScope = ((ClassDescriptor) this.javaAnalogueClassesWithCustomSupertypeCache.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(declarationDescriptor), new C19128x1b86dd87(javaAnalogue, classDescriptor2))).getUnsubstitutedMemberScope();
        C2668g.a(unsubstitutedMemberScope, QueryParams.SCOPE);
        Iterable iterable = (Iterable) function1.invoke(unsubstitutedMemberScope);
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
            Object obj = null;
            if (simpleFunctionDescriptor.getKind() == Kind.DECLARATION) {
                if (simpleFunctionDescriptor.getVisibility().isPublicAPI()) {
                    if (!KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor)) {
                        Object obj2;
                        Collection overriddenDescriptors = simpleFunctionDescriptor.getOverriddenDescriptors();
                        C2668g.a(overriddenDescriptors, "analogueMember.overriddenDescriptors");
                        Iterable<FunctionDescriptor> iterable2 = overriddenDescriptors;
                        if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
                            for (FunctionDescriptor functionDescriptor : iterable2) {
                                C2668g.a(functionDescriptor, "it");
                                DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
                                C2668g.a(containingDeclaration, "it.containingDeclaration");
                                if (create.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                                    obj2 = 1;
                                    break;
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                            if (!isMutabilityViolation(simpleFunctionDescriptor, classDescriptor)) {
                                obj = 1;
                            }
                        }
                    }
                }
            }
            if (obj != null) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }

    private final SimpleFunctionDescriptor createCloneForArray(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        simpleFunctionDescriptor = simpleFunctionDescriptor.newCopyBuilder();
        simpleFunctionDescriptor.setOwner(deserializedClassDescriptor);
        simpleFunctionDescriptor.setVisibility(Visibilities.PUBLIC);
        simpleFunctionDescriptor.setReturnType(deserializedClassDescriptor.getDefaultType());
        simpleFunctionDescriptor.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
        deserializedClassDescriptor = simpleFunctionDescriptor.build();
        if (deserializedClassDescriptor == null) {
            C2668g.a();
        }
        return (SimpleFunctionDescriptor) deserializedClassDescriptor;
    }

    private final boolean isMutabilityViolation(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z) {
        DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, 1, null);
        Set set = MUTABLE_METHOD_SIGNATURES;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        C2668g.a(computeJvmDescriptor$default, "jvmDescriptor");
        if (z ^ set.contains(signatureBuildingComponents.signature(classDescriptor, computeJvmDescriptor$default))) {
            return true;
        }
        simpleFunctionDescriptor = DFS.ifAny(C15807n.m59826a(simpleFunctionDescriptor), (Neighbors) JvmBuiltInsSettings$isMutabilityViolation$1.INSTANCE, new JvmBuiltInsSettings$isMutabilityViolation$2(this));
        C2668g.a(simpleFunctionDescriptor, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
        return simpleFunctionDescriptor.booleanValue();
    }

    private final JDKMemberStatus getJdkMethodStatus(@NotNull FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        functionDescriptor = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, 1, null);
        ObjectRef objectRef = new ObjectRef();
        objectRef.f49022a = (JDKMemberStatus) null;
        functionDescriptor = DFS.dfs(C15807n.m59826a(classDescriptor), new JvmBuiltInsSettings$getJdkMethodStatus$1(this), new JvmBuiltInsSettings$getJdkMethodStatus$2(functionDescriptor, objectRef));
        C2668g.a(functionDescriptor, "DFS.dfs<ClassDescriptor,…IDERED\n                })");
        return (JDKMemberStatus) functionDescriptor;
    }

    private final LazyJavaClassDescriptor getJavaAnalogue(@NotNull ClassDescriptor classDescriptor) {
        if (KotlinBuiltIns.isAny(classDescriptor)) {
            return null;
        }
        DeclarationDescriptor declarationDescriptor = classDescriptor;
        if (!KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return null;
        }
        classDescriptor = DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor);
        if (!classDescriptor.isSafe()) {
            return null;
        }
        classDescriptor = this.j2kClassMap.mapKotlinToJava(classDescriptor);
        if (classDescriptor != null) {
            classDescriptor = classDescriptor.asSingleFqName();
            if (classDescriptor != null) {
                ModuleDescriptor ownerModuleDescriptor = getOwnerModuleDescriptor();
                C2668g.a(classDescriptor, "javaAnalogueFqName");
                classDescriptor = DescriptorUtilKt.resolveClassByFqName(ownerModuleDescriptor, classDescriptor, NoLookupLocation.FROM_BUILTINS);
                if (!(classDescriptor instanceof LazyJavaClassDescriptor)) {
                    classDescriptor = null;
                }
                return (LazyJavaClassDescriptor) classDescriptor;
            }
        }
        return null;
    }

    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() == ClassKind.CLASS) {
            if (isAdditionalBuiltInsFeatureSupported()) {
                LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
                if (javaAnalogue == null) {
                    return C17554o.m64195a();
                }
                ClassDescriptor mapJavaToKotlin = this.j2kClassMap.mapJavaToKotlin(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance());
                if (mapJavaToKotlin == null) {
                    return C17554o.m64195a();
                }
                ClassDescriptor classDescriptor2 = javaAnalogue;
                TypeSubstitutor buildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(mapJavaToKotlin, classDescriptor2).buildSubstitutor();
                JvmBuiltInsSettings$getConstructors$1 jvmBuiltInsSettings$getConstructors$1 = new JvmBuiltInsSettings$getConstructors$1(buildSubstitutor);
                Collection arrayList = new ArrayList();
                Iterator it = javaAnalogue.getConstructors().iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) next;
                    C2668g.a(classConstructorDescriptor, "javaConstructor");
                    if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                        Object obj;
                        Collection constructors = mapJavaToKotlin.getConstructors();
                        C2668g.a(constructors, "defaultKotlinVersion.constructors");
                        Iterable<ClassConstructorDescriptor> iterable = constructors;
                        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                            for (ClassConstructorDescriptor classConstructorDescriptor2 : iterable) {
                                C2668g.a(classConstructorDescriptor2, "it");
                                if (jvmBuiltInsSettings$getConstructors$1.invoke((ConstructorDescriptor) classConstructorDescriptor2, (ConstructorDescriptor) classConstructorDescriptor)) {
                                    obj = null;
                                    break;
                                }
                            }
                        }
                        obj = 1;
                        if (!(obj == null || isTrivialCopyConstructorFor(classConstructorDescriptor, classDescriptor) || KotlinBuiltIns.isDeprecated(classConstructorDescriptor))) {
                            Set set = BLACK_LIST_CONSTRUCTOR_SIGNATURES;
                            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, 1, null);
                            C2668g.a(computeJvmDescriptor$default, "javaConstructor.computeJvmDescriptor()");
                            if (!set.contains(signatureBuildingComponents.signature(classDescriptor2, computeJvmDescriptor$default))) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                Iterable<ClassConstructorDescriptor> iterable2 = (List) arrayList;
                Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
                for (ClassConstructorDescriptor classConstructorDescriptor3 : iterable2) {
                    CopyBuilder newCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
                    newCopyBuilder.setOwner(classDescriptor);
                    newCopyBuilder.setReturnType(classDescriptor.getDefaultType());
                    newCopyBuilder.setPreserveSourceElement();
                    newCopyBuilder.setSubstitution(buildSubstitutor.getSubstitution());
                    Set set2 = WHITE_LIST_CONSTRUCTOR_SIGNATURES;
                    SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
                    C2668g.a(classConstructorDescriptor3, "javaConstructor");
                    String computeJvmDescriptor$default2 = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, 1, null);
                    C2668g.a(computeJvmDescriptor$default2, "javaConstructor.computeJvmDescriptor()");
                    if (!set2.contains(signatureBuildingComponents2.signature(classDescriptor2, computeJvmDescriptor$default2))) {
                        newCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
                    }
                    FunctionDescriptor build = newCopyBuilder.build();
                    if (build == null) {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    }
                    arrayList2.add((ClassConstructorDescriptor) build);
                }
                return (List) arrayList2;
            }
        }
        return C17554o.m64195a();
    }

    public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        C2668g.b(simpleFunctionDescriptor, "functionDescriptor");
        classDescriptor = getJavaAnalogue(classDescriptor);
        if (classDescriptor == null || !simpleFunctionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        boolean z = false;
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, 1, null);
        classDescriptor = classDescriptor.getUnsubstitutedMemberScope();
        simpleFunctionDescriptor = simpleFunctionDescriptor.getName();
        C2668g.a(simpleFunctionDescriptor, "functionDescriptor.name");
        Iterable<SimpleFunctionDescriptor> contributedFunctions = classDescriptor.getContributedFunctions(simpleFunctionDescriptor, NoLookupLocation.FROM_BUILTINS);
        if ((contributedFunctions instanceof Collection) == null || ((Collection) contributedFunctions).isEmpty() == null) {
            for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : contributedFunctions) {
                if (C2668g.a(MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, false, 1, null), computeJvmDescriptor$default) != null) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    private final boolean isTrivialCopyConstructorFor(@NotNull ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        if (constructorDescriptor.getValueParameters().size() == 1) {
            constructorDescriptor = constructorDescriptor.getValueParameters();
            C2668g.a(constructorDescriptor, "valueParameters");
            constructorDescriptor = C19299w.m68836j((List) constructorDescriptor);
            C2668g.a(constructorDescriptor, "valueParameters.single()");
            constructorDescriptor = ((ValueParameterDescriptor) constructorDescriptor).getType().getConstructor().getDeclarationDescriptor();
            if (C2668g.a(constructorDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(constructorDescriptor) : null, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor)) != null) {
                return true;
            }
        }
        return false;
    }

    static {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        BLACK_LIST_METHOD_SIGNATURES = an.m66899a(an.m66899a(an.m66899a(an.m66899a(an.m66899a(Companion.buildPrimitiveValueMethodsSet(), (Iterable) signatureBuildingComponents.inJavaUtil("List", "sort(Ljava/util/Comparator;)V")), (Iterable) signatureBuildingComponents.inJavaLang("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;")), (Iterable) signatureBuildingComponents.inJavaLang("Double", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.inJavaLang("Float", "isInfinite()Z", "isNaN()Z")), (Iterable) signatureBuildingComponents.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        WHITE_LIST_METHOD_SIGNATURES = an.m66899a(an.m66899a(an.m66899a(an.m66899a(an.m66899a(an.m66899a((Set) signatureBuildingComponents.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable) signatureBuildingComponents.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable) signatureBuildingComponents.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (Iterable) signatureBuildingComponents.inJavaLang("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (Iterable) signatureBuildingComponents.inJavaUtil("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (Iterable) signatureBuildingComponents.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), (Iterable) signatureBuildingComponents.inJavaUtil("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        MUTABLE_METHOD_SIGNATURES = an.m66899a(an.m66899a((Set) signatureBuildingComponents.inJavaUtil("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (Iterable) signatureBuildingComponents.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), (Iterable) signatureBuildingComponents.inJavaUtil("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Set access$buildPrimitiveStringConstructorsSet = Companion.buildPrimitiveStringConstructorsSet();
        String[] constructors = signatureBuildingComponents.constructors("D");
        access$buildPrimitiveStringConstructorsSet = an.m66899a(access$buildPrimitiveStringConstructorsSet, (Iterable) signatureBuildingComponents.inJavaLang("Float", (String[]) Arrays.copyOf(constructors, constructors.length)));
        constructors = signatureBuildingComponents.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        BLACK_LIST_CONSTRUCTOR_SIGNATURES = an.m66899a(access$buildPrimitiveStringConstructorsSet, (Iterable) signatureBuildingComponents.inJavaLang("String", (String[]) Arrays.copyOf(constructors, constructors.length)));
        signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String[] constructors2 = signatureBuildingComponents.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        WHITE_LIST_CONSTRUCTOR_SIGNATURES = signatureBuildingComponents.inJavaLang("Throwable", (String[]) Arrays.copyOf(constructors2, constructors2.length));
    }
}
