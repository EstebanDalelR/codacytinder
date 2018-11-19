package kotlin.reflect.jvm.internal.impl.platform;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C15819j;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaToKotlinClassMap {
    public static final JavaToKotlinClassMap INSTANCE;
    private static final HashMap<FqNameUnsafe, ClassId> javaToKotlin = new HashMap();
    private static final HashMap<FqNameUnsafe, ClassId> kotlinToJava = new HashMap();
    @NotNull
    private static final List<PlatformMutabilityMapping> mutabilityMappings;
    private static final HashMap<FqNameUnsafe, FqName> mutableToReadOnly = new HashMap();
    private static final HashMap<FqNameUnsafe, FqName> readOnlyToMutable = new HashMap();

    public static final class PlatformMutabilityMapping {
        @NotNull
        private final ClassId javaClass;
        @NotNull
        private final ClassId kotlinMutable;
        @NotNull
        private final ClassId kotlinReadOnly;

        @NotNull
        public final ClassId component1() {
            return this.javaClass;
        }

        @NotNull
        public final ClassId component2() {
            return this.kotlinReadOnly;
        }

        @NotNull
        public final ClassId component3() {
            return this.kotlinMutable;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PlatformMutabilityMapping) {
                    PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
                    if (C2668g.a(this.javaClass, platformMutabilityMapping.javaClass) && C2668g.a(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && C2668g.a(this.kotlinMutable, platformMutabilityMapping.kotlinMutable)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ClassId classId = this.javaClass;
            int i = 0;
            int hashCode = (classId != null ? classId.hashCode() : 0) * 31;
            ClassId classId2 = this.kotlinReadOnly;
            hashCode = (hashCode + (classId2 != null ? classId2.hashCode() : 0)) * 31;
            classId2 = this.kotlinMutable;
            if (classId2 != null) {
                i = classId2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlatformMutabilityMapping(javaClass=");
            stringBuilder.append(this.javaClass);
            stringBuilder.append(", kotlinReadOnly=");
            stringBuilder.append(this.kotlinReadOnly);
            stringBuilder.append(", kotlinMutable=");
            stringBuilder.append(this.kotlinMutable);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public PlatformMutabilityMapping(@NotNull ClassId classId, @NotNull ClassId classId2, @NotNull ClassId classId3) {
            C2668g.b(classId, "javaClass");
            C2668g.b(classId2, "kotlinReadOnly");
            C2668g.b(classId3, "kotlinMutable");
            this.javaClass = classId;
            this.kotlinReadOnly = classId2;
            this.kotlinMutable = classId3;
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.javaClass;
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        PlatformMutabilityMapping[] platformMutabilityMappingArr = new PlatformMutabilityMapping[8];
        ClassId topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.iterable);
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAMES.iterable)");
        FqName fqName = KotlinBuiltIns.FQ_NAMES.mutableIterable;
        C2668g.a(fqName, "FQ_NAMES.mutableIterable");
        FqName packageFqName = topLevel.getPackageFqName();
        FqName packageFqName2 = topLevel.getPackageFqName();
        C2668g.a(packageFqName2, "kotlinReadOnly.packageFqName");
        fqName = FqNamesUtilKt.tail(fqName, packageFqName2);
        int i = 0;
        platformMutabilityMappingArr[0] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterable.class), topLevel, new ClassId(packageFqName, fqName, false));
        topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.iterator);
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAMES.iterator)");
        fqName = KotlinBuiltIns.FQ_NAMES.mutableIterator;
        C2668g.a(fqName, "FQ_NAMES.mutableIterator");
        packageFqName = topLevel.getPackageFqName();
        FqName packageFqName3 = topLevel.getPackageFqName();
        C2668g.a(packageFqName3, "kotlinReadOnly.packageFqName");
        platformMutabilityMappingArr[1] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterator.class), topLevel, new ClassId(packageFqName, FqNamesUtilKt.tail(fqName, packageFqName3), false));
        topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.collection);
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAMES.collection)");
        fqName = KotlinBuiltIns.FQ_NAMES.mutableCollection;
        C2668g.a(fqName, "FQ_NAMES.mutableCollection");
        packageFqName = topLevel.getPackageFqName();
        packageFqName3 = topLevel.getPackageFqName();
        C2668g.a(packageFqName3, "kotlinReadOnly.packageFqName");
        platformMutabilityMappingArr[2] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Collection.class), topLevel, new ClassId(packageFqName, FqNamesUtilKt.tail(fqName, packageFqName3), false));
        topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.list);
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAMES.list)");
        fqName = KotlinBuiltIns.FQ_NAMES.mutableList;
        C2668g.a(fqName, "FQ_NAMES.mutableList");
        packageFqName = topLevel.getPackageFqName();
        packageFqName3 = topLevel.getPackageFqName();
        C2668g.a(packageFqName3, "kotlinReadOnly.packageFqName");
        platformMutabilityMappingArr[3] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(List.class), topLevel, new ClassId(packageFqName, FqNamesUtilKt.tail(fqName, packageFqName3), false));
        topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.set);
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAMES.set)");
        fqName = KotlinBuiltIns.FQ_NAMES.mutableSet;
        C2668g.a(fqName, "FQ_NAMES.mutableSet");
        packageFqName = topLevel.getPackageFqName();
        packageFqName3 = topLevel.getPackageFqName();
        C2668g.a(packageFqName3, "kotlinReadOnly.packageFqName");
        platformMutabilityMappingArr[4] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Set.class), topLevel, new ClassId(packageFqName, FqNamesUtilKt.tail(fqName, packageFqName3), false));
        topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.listIterator);
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAMES.listIterator)");
        fqName = KotlinBuiltIns.FQ_NAMES.mutableListIterator;
        C2668g.a(fqName, "FQ_NAMES.mutableListIterator");
        packageFqName = topLevel.getPackageFqName();
        packageFqName3 = topLevel.getPackageFqName();
        C2668g.a(packageFqName3, "kotlinReadOnly.packageFqName");
        platformMutabilityMappingArr[5] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(ListIterator.class), topLevel, new ClassId(packageFqName, FqNamesUtilKt.tail(fqName, packageFqName3), false));
        topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.map);
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAMES.map)");
        fqName = KotlinBuiltIns.FQ_NAMES.mutableMap;
        C2668g.a(fqName, "FQ_NAMES.mutableMap");
        packageFqName = topLevel.getPackageFqName();
        packageFqName3 = topLevel.getPackageFqName();
        C2668g.a(packageFqName3, "kotlinReadOnly.packageFqName");
        platformMutabilityMappingArr[6] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.class), topLevel, new ClassId(packageFqName, FqNamesUtilKt.tail(fqName, packageFqName3), false));
        topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.map).createNestedClassId(KotlinBuiltIns.FQ_NAMES.mapEntry.shortName());
        C2668g.a(topLevel, "ClassId.topLevel(FQ_NAME…MES.mapEntry.shortName())");
        fqName = KotlinBuiltIns.FQ_NAMES.mutableMapEntry;
        C2668g.a(fqName, "FQ_NAMES.mutableMapEntry");
        packageFqName = topLevel.getPackageFqName();
        packageFqName3 = topLevel.getPackageFqName();
        C2668g.a(packageFqName3, "kotlinReadOnly.packageFqName");
        platformMutabilityMappingArr[7] = new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Entry.class), topLevel, new ClassId(packageFqName, FqNamesUtilKt.tail(fqName, packageFqName3), false));
        mutabilityMappings = C17554o.m64199b((Object[]) platformMutabilityMappingArr);
        FqNameUnsafe fqNameUnsafe = KotlinBuiltIns.FQ_NAMES.any;
        C2668g.a(fqNameUnsafe, "FQ_NAMES.any");
        javaToKotlinClassMap.addTopLevel(Object.class, fqNameUnsafe);
        fqNameUnsafe = KotlinBuiltIns.FQ_NAMES.string;
        C2668g.a(fqNameUnsafe, "FQ_NAMES.string");
        javaToKotlinClassMap.addTopLevel(String.class, fqNameUnsafe);
        fqNameUnsafe = KotlinBuiltIns.FQ_NAMES.charSequence;
        C2668g.a(fqNameUnsafe, "FQ_NAMES.charSequence");
        javaToKotlinClassMap.addTopLevel(CharSequence.class, fqNameUnsafe);
        FqName fqName2 = KotlinBuiltIns.FQ_NAMES.throwable;
        C2668g.a(fqName2, "FQ_NAMES.throwable");
        javaToKotlinClassMap.addTopLevel(Throwable.class, fqName2);
        fqNameUnsafe = KotlinBuiltIns.FQ_NAMES.cloneable;
        C2668g.a(fqNameUnsafe, "FQ_NAMES.cloneable");
        javaToKotlinClassMap.addTopLevel(Cloneable.class, fqNameUnsafe);
        fqNameUnsafe = KotlinBuiltIns.FQ_NAMES.number;
        C2668g.a(fqNameUnsafe, "FQ_NAMES.number");
        javaToKotlinClassMap.addTopLevel(Number.class, fqNameUnsafe);
        fqName2 = KotlinBuiltIns.FQ_NAMES.comparable;
        C2668g.a(fqName2, "FQ_NAMES.comparable");
        javaToKotlinClassMap.addTopLevel(Comparable.class, fqName2);
        fqNameUnsafe = KotlinBuiltIns.FQ_NAMES._enum;
        C2668g.a(fqNameUnsafe, "FQ_NAMES._enum");
        javaToKotlinClassMap.addTopLevel(Enum.class, fqNameUnsafe);
        fqName2 = KotlinBuiltIns.FQ_NAMES.annotation;
        C2668g.a(fqName2, "FQ_NAMES.annotation");
        javaToKotlinClassMap.addTopLevel(Annotation.class, fqName2);
        for (PlatformMutabilityMapping addMapping : mutabilityMappings) {
            javaToKotlinClassMap.addMapping(addMapping);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            ClassId topLevel2 = ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            C2668g.a(topLevel2, "ClassId.topLevel(jvmType.wrapperFqName)");
            ClassId topLevel3 = ClassId.topLevel(KotlinBuiltIns.getPrimitiveFqName(jvmPrimitiveType.getPrimitiveType()));
            C2668g.a(topLevel3, "ClassId.topLevel(KotlinB…e(jvmType.primitiveType))");
            javaToKotlinClassMap.add(topLevel2, topLevel3);
        }
        for (ClassId topLevel4 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.internal.");
            stringBuilder.append(topLevel4.getShortClassName().asString());
            stringBuilder.append("CompanionObject");
            ClassId topLevel5 = ClassId.topLevel(new FqName(stringBuilder.toString()));
            C2668g.a(topLevel5, "ClassId.topLevel(FqName(…g() + \"CompanionObject\"))");
            topLevel4 = topLevel4.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            C2668g.a(topLevel4, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            javaToKotlinClassMap.add(topLevel5, topLevel4);
        }
        while (i <= 22) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("kotlin.jvm.functions.Function");
            stringBuilder2.append(i);
            topLevel4 = ClassId.topLevel(new FqName(stringBuilder2.toString()));
            C2668g.a(topLevel4, "ClassId.topLevel(FqName(…functions.Function\" + i))");
            topLevel5 = KotlinBuiltIns.getFunctionClassId(i);
            C2668g.a(topLevel5, "KotlinBuiltIns.getFunctionClassId(i)");
            javaToKotlinClassMap.add(topLevel4, topLevel5);
            Kind kind = Kind.KFunction;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(kind.getPackageFqName().toString());
            stringBuilder2.append(".");
            stringBuilder2.append(kind.getClassNamePrefix());
            String stringBuilder3 = stringBuilder2.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append(i);
            fqName = new FqName(stringBuilder.toString());
            topLevel4 = ClassId.topLevel(new FqName(stringBuilder3));
            C2668g.a(topLevel4, "ClassId.topLevel(FqName(kFun))");
            javaToKotlinClassMap.addKotlinToJava(fqName, topLevel4);
            i++;
        }
        FqName toSafe = KotlinBuiltIns.FQ_NAMES.nothing.toSafe();
        C2668g.a(toSafe, "FQ_NAMES.nothing.toSafe()");
        javaToKotlinClassMap.addKotlinToJava(toSafe, javaToKotlinClassMap.classId(Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return (ClassId) javaToKotlin.get(fqName.toUnsafe());
    }

    @Nullable
    public final ClassDescriptor mapJavaToKotlin(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        C2668g.b(fqName, "fqName");
        C2668g.b(kotlinBuiltIns, "builtIns");
        fqName = mapJavaToKotlin(fqName);
        return fqName != null ? kotlinBuiltIns.getBuiltInClassByFqName(fqName.asSingleFqName()) : null;
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe fqNameUnsafe) {
        C2668g.b(fqNameUnsafe, "kotlinFqName");
        return (ClassId) kotlinToJava.get(fqNameUnsafe);
    }

    private final void addMapping(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId component1 = platformMutabilityMapping.component1();
        ClassId component2 = platformMutabilityMapping.component2();
        platformMutabilityMapping = platformMutabilityMapping.component3();
        add(component1, component2);
        FqName asSingleFqName = platformMutabilityMapping.asSingleFqName();
        C2668g.a(asSingleFqName, "mutableClassId.asSingleFqName()");
        addKotlinToJava(asSingleFqName, component1);
        FqName asSingleFqName2 = component2.asSingleFqName();
        FqName asSingleFqName3 = platformMutabilityMapping.asSingleFqName();
        mutableToReadOnly.put(platformMutabilityMapping.asSingleFqName().toUnsafe(), asSingleFqName2);
        readOnlyToMutable.put(asSingleFqName2.toUnsafe(), asSingleFqName3);
    }

    private final void add(ClassId classId, ClassId classId2) {
        addJavaToKotlin(classId, classId2);
        classId2 = classId2.asSingleFqName();
        C2668g.a(classId2, "kotlinClassId.asSingleFqName()");
        addKotlinToJava(classId2, classId);
    }

    private final void addTopLevel(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        FqName toSafe = fqNameUnsafe.toSafe();
        C2668g.a(toSafe, "kotlinFqName.toSafe()");
        addTopLevel((Class) cls, toSafe);
    }

    private final void addTopLevel(Class<?> cls, FqName fqName) {
        cls = classId(cls);
        fqName = ClassId.topLevel(fqName);
        C2668g.a(fqName, "ClassId.topLevel(kotlinFqName)");
        add(cls, fqName);
    }

    private final void addJavaToKotlin(ClassId classId, ClassId classId2) {
        javaToKotlin.put(classId.asSingleFqName().toUnsafe(), classId2);
    }

    private final void addKotlinToJava(FqName fqName, ClassId classId) {
        kotlinToJava.put(fqName.toUnsafe(), classId);
    }

    @NotNull
    public final Collection<ClassDescriptor> mapPlatformClass(@NotNull FqName fqName, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        C2668g.b(fqName, "fqName");
        C2668g.b(kotlinBuiltIns, "builtIns");
        fqName = mapJavaToKotlin(fqName, kotlinBuiltIns);
        if (fqName == null) {
            return am.m64176a();
        }
        if (((FqName) readOnlyToMutable.get(DescriptorUtilsKt.getFqNameUnsafe((DeclarationDescriptor) fqName))) == null) {
            return al.m59817a(fqName);
        }
        fqName = Arrays.asList(new ClassDescriptor[]{fqName, kotlinBuiltIns.getBuiltInClassByFqName((FqName) readOnlyToMutable.get(DescriptorUtilsKt.getFqNameUnsafe((DeclarationDescriptor) fqName)))});
        C2668g.a(fqName, "Arrays.asList(kotlinAnal…tlinMutableAnalogFqName))");
        return (Collection) fqName;
    }

    public final boolean isMutable(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "mutable");
        return mutableToReadOnly.containsKey(DescriptorUtils.getFqName(classDescriptor));
    }

    public final boolean isMutable(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        ClassDescriptor classDescriptor = TypeUtils.getClassDescriptor(kotlinType);
        return (classDescriptor == null || isMutable(classDescriptor) == null) ? null : true;
    }

    public final boolean isReadOnly(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "readOnly");
        return readOnlyToMutable.containsKey(DescriptorUtils.getFqName(classDescriptor));
    }

    public final boolean isReadOnly(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        ClassDescriptor classDescriptor = TypeUtils.getClassDescriptor(kotlinType);
        return (classDescriptor == null || isReadOnly(classDescriptor) == null) ? null : true;
    }

    @NotNull
    public final ClassDescriptor convertMutableToReadOnly(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "mutable");
        return convertToOppositeMutability(classDescriptor, mutableToReadOnly, "mutable");
    }

    @NotNull
    public final ClassDescriptor convertReadOnlyToMutable(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "readOnly");
        return convertToOppositeMutability(classDescriptor, readOnlyToMutable, "read-only");
    }

    private final ClassId classId(Class<?> cls) {
        Object obj = (cls.isPrimitive() || cls.isArray()) ? null : 1;
        if (C15819j.f49018a && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid class: ");
            stringBuilder.append(cls);
            throw new AssertionError(stringBuilder.toString());
        }
        Class declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            cls = ClassId.topLevel(new FqName(cls.getCanonicalName()));
            C2668g.a(cls, "ClassId.topLevel(FqName(clazz.canonicalName))");
            return cls;
        }
        cls = classId(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
        C2668g.a(cls, "classId(outer).createNes…tifier(clazz.simpleName))");
        return cls;
    }

    private final ClassDescriptor convertToOppositeMutability(ClassDescriptor classDescriptor, Map<FqNameUnsafe, FqName> map, String str) {
        DeclarationDescriptor declarationDescriptor = classDescriptor;
        FqName fqName = (FqName) map.get(DescriptorUtils.getFqName(declarationDescriptor));
        if (fqName != null) {
            classDescriptor = DescriptorUtilsKt.getBuiltIns(declarationDescriptor).getBuiltInClassByFqName(fqName);
            C2668g.a(classDescriptor, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return classDescriptor;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Given class ");
        stringBuilder.append(classDescriptor);
        stringBuilder.append(" is not a ");
        stringBuilder.append(str);
        stringBuilder.append(" collection");
        throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
    }
}
