package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass.Factory;
import kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory.RuntimeSourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.VersionRequirementTable;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.structure.ReflectJavaElement;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001af\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\b\b\u0000\u0010\u000f*\u00020\u0010\"\b\b\u0001\u0010\u000e*\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0014\u001a\u0002H\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000e0\u001a¢\u0006\u0002\b\u001cH\u0000¢\u0006\u0002\u0010\u001d\u001a&\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0000\u001a\"\u0010#\u001a\u0002H$\"\u0004\b\u0000\u0010$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H$0&H\b¢\u0006\u0002\u0010'\u001a\u0014\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)*\u0004\u0018\u00010*H\u0000\u001a\u0010\u0010+\u001a\u0004\u0018\u00010,*\u0004\u0018\u00010*H\u0000\u001a\u0014\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010*H\u0000\u001a\u0012\u0010/\u001a\b\u0012\u0004\u0012\u00020100*\u000202H\u0000\u001a\u0012\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u000204H\u0000\u001a\u000e\u00105\u001a\u0004\u0018\u000106*\u000207H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\"\u001a\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u00068"}, d2 = {"JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "isPublicInBytecode", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Z", "packageModuleName", "", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getPackageModuleName", "(Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;)Ljava/lang/String;", "deserializeToDescriptor", "D", "M", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "moduleAnchor", "Ljava/lang/Class;", "proto", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "createDescriptor", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "loadClass", "classLoader", "Ljava/lang/ClassLoader;", "packageName", "className", "reflectionCall", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "asKCallableImpl", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "asKFunctionImpl", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKPropertyImpl", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "computeAnnotations", "", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "toJavaClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "toKVisibility", "Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
public final class UtilKt {
    @NotNull
    private static final FqName JVM_STATIC = new FqName("kotlin.jvm.JvmStatic");

    @NotNull
    public static final FqName getJVM_STATIC() {
        return JVM_STATIC;
    }

    @Nullable
    public static final Class<?> toJavaClass(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "$receiver");
        SourceElement source = classDescriptor.getSource();
        if (source instanceof KotlinJvmBinarySourceElement) {
            classDescriptor = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            if (classDescriptor == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.components.ReflectKotlinClass");
            }
            classDescriptor = ((ReflectKotlinClass) classDescriptor).getKlass();
        } else if (source instanceof RuntimeSourceElement) {
            classDescriptor = ((RuntimeSourceElement) source).getJavaElement();
            if (classDescriptor == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.structure.ReflectJavaClass");
            }
            classDescriptor = ((ReflectJavaClass) classDescriptor).getElement();
        } else {
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqNameUnsafe fqName = DescriptorUtils.getFqName(classDescriptor);
            C2668g.a(fqName, "DescriptorUtils.getFqName(this)");
            ClassId mapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(fqName);
            if (mapKotlinToJava == null) {
                mapKotlinToJava = DescriptorUtilsKt.getClassId(classDescriptor);
            }
            if (mapKotlinToJava == null) {
                return null;
            }
            String asString = mapKotlinToJava.getPackageFqName().asString();
            String asString2 = mapKotlinToJava.getRelativeClassName().asString();
            classDescriptor = ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass());
            C2668g.a(asString, "packageName");
            C2668g.a(asString2, "className");
            classDescriptor = loadClass(classDescriptor, asString, asString2);
        }
        return classDescriptor;
    }

    @Nullable
    public static final Class<?> loadClass(@NotNull ClassLoader classLoader, @NotNull String str, @NotNull String str2) {
        C2668g.b(classLoader, "classLoader");
        C2668g.b(str, "packageName");
        C2668g.b(str2, "className");
        if (C2668g.a(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
                default:
                    break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str);
        stringBuilder.append('.');
        stringBuilder.append(C19296q.m68670a(str2, '.', '$', false, 4, null));
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, stringBuilder.toString());
    }

    @Nullable
    public static final KVisibility toKVisibility(@NotNull Visibility visibility) {
        C2668g.b(visibility, "$receiver");
        if (C2668g.a(visibility, Visibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if (C2668g.a(visibility, Visibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if (C2668g.a(visibility, Visibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        if (!C2668g.a(visibility, Visibilities.PRIVATE)) {
            if (C2668g.a(visibility, Visibilities.PRIVATE_TO_THIS) == null) {
                return null;
            }
        }
        return KVisibility.PRIVATE;
    }

    @NotNull
    public static final List<Annotation> computeAnnotations(@NotNull Annotated annotated) {
        C2668g.b(annotated, "$receiver");
        Collection arrayList = new ArrayList();
        for (AnnotationDescriptor source : annotated.getAnnotations()) {
            SourceElement source2 = source.getSource();
            Object obj = null;
            if (source2 instanceof ReflectAnnotationSource) {
                obj = ((ReflectAnnotationSource) source2).getAnnotation();
            } else if (source2 instanceof RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElement) source2).getJavaElement();
                if (!(javaElement instanceof ReflectJavaAnnotation)) {
                    javaElement = null;
                }
                ReflectJavaAnnotation reflectJavaAnnotation = (ReflectJavaAnnotation) javaElement;
                if (reflectJavaAnnotation != null) {
                    obj = reflectJavaAnnotation.getAnnotation();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }

    @Nullable
    public static final KFunctionImpl asKFunctionImpl(@Nullable Object obj) {
        KFunctionImpl kFunctionImpl = (KFunctionImpl) (!(obj instanceof KFunctionImpl) ? null : obj);
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        if (!(obj instanceof FunctionReference)) {
            obj = null;
        }
        FunctionReference functionReference = (FunctionReference) obj;
        obj = functionReference != null ? functionReference.compute() : null;
        if (!(obj instanceof KFunctionImpl)) {
            obj = null;
        }
        return (KFunctionImpl) obj;
    }

    @Nullable
    public static final KPropertyImpl<?> asKPropertyImpl(@Nullable Object obj) {
        KPropertyImpl<?> kPropertyImpl = (KPropertyImpl) (!(obj instanceof KPropertyImpl) ? null : obj);
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        if (!(obj instanceof PropertyReference)) {
            obj = null;
        }
        PropertyReference propertyReference = (PropertyReference) obj;
        obj = propertyReference != null ? propertyReference.compute() : null;
        if (!(obj instanceof KPropertyImpl)) {
            obj = null;
        }
        return (KPropertyImpl) obj;
    }

    @Nullable
    public static final KCallableImpl<?> asKCallableImpl(@Nullable Object obj) {
        KCallableImpl<?> kCallableImpl = (KCallableImpl) (!(obj instanceof KCallableImpl) ? null : obj);
        if (kCallableImpl == null) {
            kCallableImpl = asKFunctionImpl(obj);
        }
        return kCallableImpl != null ? kCallableImpl : asKPropertyImpl(obj);
    }

    @Nullable
    public static final String getPackageModuleName(@NotNull ReflectKotlinClass reflectKotlinClass) {
        C2668g.b(reflectKotlinClass, "$receiver");
        KotlinClassHeader classHeader = reflectKotlinClass.getClassHeader();
        String str = null;
        if (!classHeader.getMetadataVersion().isCompatible()) {
            return null;
        }
        switch (classHeader.getKind()) {
            case FILE_FACADE:
            case MULTIFILE_CLASS_PART:
                String[] data = classHeader.getData();
                if (data == null) {
                    C2668g.a();
                }
                String[] strings = classHeader.getStrings();
                if (strings == null) {
                    C2668g.a();
                }
                reflectKotlinClass = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                JvmNameResolver jvmNameResolver = (JvmNameResolver) reflectKotlinClass.m59805c();
                ExtendableMessage extendableMessage = (Package) reflectKotlinClass.m59806d();
                GeneratedExtension generatedExtension = JvmProtoBuf.packageModuleName;
                C2668g.a(generatedExtension, "JvmProtoBuf.packageModuleName");
                Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
                if (num != null) {
                    str = jvmNameResolver.getString(num.intValue());
                    if (str != null) {
                        break;
                    }
                }
                str = "main";
                break;
            case MULTIFILE_CLASS:
                String str2 = (String) C19299w.m68831g(classHeader.getMultifilePartNames());
                if (str2 != null) {
                    Factory factory = ReflectKotlinClass.Factory;
                    reflectKotlinClass = reflectKotlinClass.getKlass().getClassLoader().loadClass(C19296q.m68670a(str2, '/', '.', false, 4, null));
                    C2668g.a(reflectKotlinClass, "klass.classLoader.loadCl…rtName.replace('/', '.'))");
                    reflectKotlinClass = factory.create(reflectKotlinClass);
                    if (reflectKotlinClass != null) {
                        str = getPackageModuleName(reflectKotlinClass);
                        break;
                    }
                }
                return null;
                break;
            default:
                break;
        }
        return str;
    }

    public static final boolean isPublicInBytecode(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "$receiver");
        Visibility visibility = callableMemberDescriptor.getVisibility();
        return ((C2668g.a(visibility, Visibilities.PUBLIC) || C2668g.a(visibility, Visibilities.INTERNAL)) && AnnotationUtilKt.isEffectivelyInlineOnly(callableMemberDescriptor) == null) ? true : null;
    }

    @Nullable
    public static final <M extends MessageLite, D extends CallableDescriptor> D deserializeToDescriptor(@NotNull Class<?> cls, @NotNull M m, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> function2) {
        List typeParameterList;
        C2668g.b(cls, "moduleAnchor");
        C2668g.b(m, "proto");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(typeTable, "typeTable");
        C2668g.b(function2, "createDescriptor");
        cls = ModuleByClassLoaderKt.getOrCreateModule(cls);
        if (m instanceof Function) {
            typeParameterList = ((Function) m).getTypeParameterList();
        } else if (m instanceof Property) {
            typeParameterList = ((Property) m).getTypeParameterList();
        } else {
            cls = new StringBuilder();
            cls.append("Unsupported message: ");
            cls.append(m);
            throw ((Throwable) new IllegalStateException(cls.toString().toString()));
        }
        List list = typeParameterList;
        DeserializationComponents deserialization = cls.getDeserialization();
        DeclarationDescriptor module = cls.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        C2668g.a(list, "typeParameters");
        return (CallableDescriptor) function2.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, null, null, list)), m);
    }
}
