package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.platform.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings.Default;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class DeserializationComponentsForJava {
    @NotNull
    private final DeserializationComponents components;

    public DeserializationComponentsForJava(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull JavaClassDataFinder javaClassDataFinder, @NotNull BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull NotFoundClasses notFoundClasses, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull ContractDeserializer contractDeserializer) {
        JvmBuiltInsSettings settings;
        AdditionalClassPartsProvider additionalClassPartsProvider;
        JvmBuiltInsSettings settings2;
        DeserializationComponents deserializationComponents;
        DeserializationComponents deserializationComponents2;
        JavaClassDataFinder javaClassDataFinder2 = javaClassDataFinder;
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl2 = binaryClassAnnotationAndConstantLoaderImpl;
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider2 = lazyJavaPackageFragmentProvider;
        StorageManager storageManager2 = storageManager;
        C2668g.b(storageManager2, "storageManager");
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        C2668g.b(moduleDescriptor2, "moduleDescriptor");
        DeserializationConfiguration deserializationConfiguration2 = deserializationConfiguration;
        C2668g.b(deserializationConfiguration2, "configuration");
        C2668g.b(javaClassDataFinder2, "classDataFinder");
        C2668g.b(binaryClassAnnotationAndConstantLoaderImpl2, "annotationAndConstantLoader");
        C2668g.b(lazyJavaPackageFragmentProvider2, "packageFragmentProvider");
        C2668g.b(notFoundClasses, "notFoundClasses");
        ErrorReporter errorReporter2 = errorReporter;
        C2668g.b(errorReporter2, "errorReporter");
        LookupTracker lookupTracker2 = lookupTracker;
        C2668g.b(lookupTracker2, "lookupTracker");
        C2668g.b(contractDeserializer, "contractDeserializer");
        KotlinBuiltIns builtIns = moduleDescriptor.getBuiltIns();
        if (!(builtIns instanceof JvmBuiltIns)) {
            builtIns = null;
        }
        JvmBuiltIns jvmBuiltIns = (JvmBuiltIns) builtIns;
        ClassDataFinder classDataFinder = javaClassDataFinder2;
        AnnotationAndConstantLoader annotationAndConstantLoader = binaryClassAnnotationAndConstantLoaderImpl2;
        PackageFragmentProvider packageFragmentProvider = lazyJavaPackageFragmentProvider2;
        LocalClassifierTypeSettings localClassifierTypeSettings = Default.INSTANCE;
        FlexibleTypeDeserializer flexibleTypeDeserializer = JavaFlexibleTypeDeserializer.INSTANCE;
        Iterable a = C17554o.m64195a();
        if (jvmBuiltIns != null) {
            settings = jvmBuiltIns.getSettings();
            if (settings != null) {
                additionalClassPartsProvider = settings;
                if (jvmBuiltIns != null) {
                    settings2 = jvmBuiltIns.getSettings();
                    if (settings2 != null) {
                        deserializationComponents = deserializationComponents2;
                        deserializationComponents2 = new DeserializationComponents(storageManager2, moduleDescriptor2, deserializationConfiguration2, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter2, lookupTracker2, flexibleTypeDeserializer, a, notFoundClasses, contractDeserializer, additionalClassPartsProvider, settings2, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY());
                        this.components = deserializationComponents;
                    }
                }
                settings2 = NoPlatformDependent.INSTANCE;
                deserializationComponents = deserializationComponents2;
                deserializationComponents2 = new DeserializationComponents(storageManager2, moduleDescriptor2, deserializationConfiguration2, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter2, lookupTracker2, flexibleTypeDeserializer, a, notFoundClasses, contractDeserializer, additionalClassPartsProvider, settings2, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY());
                this.components = deserializationComponents;
            }
        }
        settings = None.INSTANCE;
        additionalClassPartsProvider = settings;
        if (jvmBuiltIns != null) {
            settings2 = jvmBuiltIns.getSettings();
            if (settings2 != null) {
                deserializationComponents = deserializationComponents2;
                deserializationComponents2 = new DeserializationComponents(storageManager2, moduleDescriptor2, deserializationConfiguration2, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter2, lookupTracker2, flexibleTypeDeserializer, a, notFoundClasses, contractDeserializer, additionalClassPartsProvider, settings2, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY());
                this.components = deserializationComponents;
            }
        }
        settings2 = NoPlatformDependent.INSTANCE;
        deserializationComponents = deserializationComponents2;
        deserializationComponents2 = new DeserializationComponents(storageManager2, moduleDescriptor2, deserializationConfiguration2, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter2, lookupTracker2, flexibleTypeDeserializer, a, notFoundClasses, contractDeserializer, additionalClassPartsProvider, settings2, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY());
        this.components = deserializationComponents;
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.components;
    }
}
