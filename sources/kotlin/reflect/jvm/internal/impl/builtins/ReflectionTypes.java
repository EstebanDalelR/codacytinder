package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C15807n;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ReflectionTypes {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final Companion Companion = new Companion();
    @NotNull
    private final ClassLookup kClass$delegate = new ClassLookup(1);
    @NotNull
    private final ClassLookup kMutableProperty0$delegate = new ClassLookup(1);
    @NotNull
    private final ClassLookup kMutableProperty1$delegate = new ClassLookup(2);
    @NotNull
    private final ClassLookup kMutableProperty2$delegate = new ClassLookup(3);
    @NotNull
    private final ClassLookup kProperty0$delegate = new ClassLookup(1);
    @NotNull
    private final ClassLookup kProperty1$delegate = new ClassLookup(2);
    @NotNull
    private final ClassLookup kProperty2$delegate = new ClassLookup(3);
    private final Lazy kotlinReflectScope$delegate;
    private final NotFoundClasses notFoundClasses;

    private static final class ClassLookup {
        private final int numberOfTypeParameters;

        public ClassLookup(int i) {
            this.numberOfTypeParameters = i;
        }

        @NotNull
        public final ClassDescriptor getValue(@NotNull ReflectionTypes reflectionTypes, @NotNull KProperty<?> kProperty) {
            C2668g.b(reflectionTypes, "types");
            C2668g.b(kProperty, "property");
            return reflectionTypes.find(C19296q.m68681d(kProperty.getName()), this.numberOfTypeParameters);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final KotlinType createKPropertyStarType(@NotNull ModuleDescriptor moduleDescriptor) {
            C2668g.b(moduleDescriptor, "module");
            ClassId classId = KotlinBuiltIns.FQ_NAMES.kProperty;
            C2668g.a(classId, "KotlinBuiltIns.FQ_NAMES.kProperty");
            moduleDescriptor = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, classId);
            if (moduleDescriptor == null) {
                return null;
            }
            Annotations empty = Annotations.Companion.getEMPTY();
            TypeConstructor typeConstructor = moduleDescriptor.getTypeConstructor();
            C2668g.a(typeConstructor, "kPropertyClass.typeConstructor");
            List parameters = typeConstructor.getParameters();
            C2668g.a(parameters, "kPropertyClass.typeConstructor.parameters");
            Object j = C19299w.m68836j(parameters);
            C2668g.a(j, "kPropertyClass.typeConstructor.parameters.single()");
            return KotlinTypeFactory.simpleNotNullType(empty, moduleDescriptor, C15807n.m59826a(new StarProjectionImpl((TypeParameterDescriptor) j)));
        }
    }

    private final MemberScope getKotlinReflectScope() {
        Lazy lazy = this.kotlinReflectScope$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (MemberScope) lazy.getValue();
    }

    @NotNull
    public final ClassDescriptor getKClass() {
        return this.kClass$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public ReflectionTypes(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(notFoundClasses, "notFoundClasses");
        this.notFoundClasses = notFoundClasses;
        this.kotlinReflectScope$delegate = C15810e.m59832a(LazyThreadSafetyMode.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(moduleDescriptor));
    }

    private final ClassDescriptor find(String str, int i) {
        str = Name.identifier(str);
        MemberScope kotlinReflectScope = getKotlinReflectScope();
        C2668g.a(str, "name");
        ClassifierDescriptor contributedClassifier = kotlinReflectScope.getContributedClassifier(str, NoLookupLocation.FROM_REFLECTION);
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) contributedClassifier;
        return classDescriptor != null ? classDescriptor : this.notFoundClasses.getClass(new ClassId(ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), str), C15807n.m59826a(Integer.valueOf(i)));
    }
}
