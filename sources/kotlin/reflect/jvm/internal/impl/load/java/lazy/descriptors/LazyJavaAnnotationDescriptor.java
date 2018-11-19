package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    @NotNull
    private final NotNullLazyValue allValueArguments$delegate = this.f54773c.getStorageManager().createLazyValue((Function0) new LazyJavaAnnotationDescriptor$allValueArguments$2(this));
    /* renamed from: c */
    private final LazyJavaResolverContext f54773c;
    @Nullable
    private final NullableLazyValue fqName$delegate = this.f54773c.getStorageManager().createNullableLazyValue((Function0) new LazyJavaAnnotationDescriptor$fqName$2(this));
    private final JavaAnnotation javaAnnotation;
    @NotNull
    private final JavaSourceElement source = this.f54773c.getComponents().getSourceElementFactory().source(this.javaAnnotation);
    @NotNull
    private final NotNullLazyValue type$delegate = this.f54773c.getStorageManager().createLazyValue((Function0) new LazyJavaAnnotationDescriptor$type$2(this));

    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, (Object) this, $$delegatedProperties[2]);
    }

    @Nullable
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.fqName$delegate, (Object) this, $$delegatedProperties[0]);
    }

    @NotNull
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, (Object) this, $$delegatedProperties[1]);
    }

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotation javaAnnotation) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(javaAnnotation, "javaAnnotation");
        this.f54773c = lazyJavaResolverContext;
        this.javaAnnotation = javaAnnotation;
    }

    @NotNull
    public JavaSourceElement getSource() {
        return this.source;
    }

    private final ConstantValue<?> resolveAnnotationArgument(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.INSTANCE.createConstantValue(((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue());
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return resolveFromEnumValue(javaEnumValueAnnotationArgument.getEnumClassId(), javaEnumValueAnnotationArgument.getEntryName());
        } else if (javaAnnotationArgument instanceof JavaArrayAnnotationArgument) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                C2668g.a(name, "DEFAULT_ANNOTATION_MEMBER_NAME");
            }
            return resolveFromArray(name, ((JavaArrayAnnotationArgument) javaAnnotationArgument).getElements());
        } else if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
            return resolveFromAnnotation(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
        } else {
            return javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument ? resolveFromJavaClassObjectType(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType()) : null;
        }
    }

    private final ConstantValue<?> resolveFromAnnotation(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f54773c, javaAnnotation));
    }

    private final ConstantValue<?> resolveFromArray(Name name, List<? extends JavaAnnotationArgument> list) {
        SimpleType type = getType();
        C2668g.a(type, "type");
        if (KotlinTypeKt.isError(type)) {
            return null;
        }
        KotlinType type2;
        Iterable<JavaAnnotationArgument> iterable;
        Collection arrayList;
        Object resolveAnnotationArgument;
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(this);
        if (annotationClass == null) {
            C2668g.a();
        }
        name = DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (name != null) {
            type2 = name.getType();
            if (type2 != null) {
                iterable = list;
                arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (JavaAnnotationArgument resolveAnnotationArgument2 : iterable) {
                    resolveAnnotationArgument = resolveAnnotationArgument(resolveAnnotationArgument2);
                    if (resolveAnnotationArgument != null) {
                        resolveAnnotationArgument = new NullValue();
                    }
                    arrayList.add(resolveAnnotationArgument);
                }
                return ConstantValueFactory.INSTANCE.createArrayValue((List) arrayList, type2);
            }
        }
        name = this.f54773c.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType("Unknown array element type"));
        C2668g.a(name, "c.components.module.buil…e\")\n                    )");
        type2 = (KotlinType) name;
        iterable = list;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        while (list.hasNext()) {
            resolveAnnotationArgument = resolveAnnotationArgument(resolveAnnotationArgument2);
            if (resolveAnnotationArgument != null) {
                resolveAnnotationArgument = new NullValue();
            }
            arrayList.add(resolveAnnotationArgument);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue((List) arrayList, type2);
    }

    private final ConstantValue<?> resolveFromEnumValue(ClassId classId, Name name) {
        if (classId != null) {
            if (name != null) {
                return new EnumValue(classId, name);
            }
        }
        return null;
    }

    private final ConstantValue<?> resolveFromJavaClassObjectType(JavaType javaType) {
        javaType = TypeUtils.makeNotNullable(this.f54773c.getTypeResolver().transformJavaType(javaType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null)));
        ClassDescriptor resolveTopLevelClass = DescriptorUtilsKt.resolveTopLevelClass(this.f54773c.getModule(), new FqName("java.lang.Class"), NoLookupLocation.FOR_NON_TRACKED_SCOPE);
        if (resolveTopLevelClass == null) {
            return null;
        }
        return new KClassValue(KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), resolveTopLevelClass, C15807n.m59826a(new TypeProjectionImpl(javaType))));
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    private final ClassDescriptor createTypeForMissingDependencies(FqName fqName) {
        ModuleDescriptor module = this.f54773c.getModule();
        fqName = ClassId.topLevel(fqName);
        C2668g.a(fqName, "ClassId.topLevel(fqName)");
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(module, fqName, this.f54773c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }
}
