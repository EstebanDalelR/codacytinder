package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializationComponents {
    @NotNull
    private final AdditionalClassPartsProvider additionalClassPartsProvider;
    @NotNull
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>, AnnotationWithTarget> annotationAndConstantLoader;
    @NotNull
    private final ClassDataFinder classDataFinder;
    @NotNull
    private final ClassDeserializer classDeserializer = new ClassDeserializer(this);
    @NotNull
    private final DeserializationConfiguration configuration;
    @NotNull
    private final ContractDeserializer contractDeserializer;
    @NotNull
    private final ErrorReporter errorReporter;
    @NotNull
    private final ExtensionRegistryLite extensionRegistryLite;
    @NotNull
    private final Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories;
    @NotNull
    private final FlexibleTypeDeserializer flexibleTypeDeserializer;
    @NotNull
    private final LocalClassifierTypeSettings localClassifierTypeSettings;
    @NotNull
    private final LookupTracker lookupTracker;
    @NotNull
    private final ModuleDescriptor moduleDescriptor;
    @NotNull
    private final NotFoundClasses notFoundClasses;
    @NotNull
    private final PackageFragmentProvider packageFragmentProvider;
    @NotNull
    private final PlatformDependentDeclarationFilter platformDependentDeclarationFilter;
    @NotNull
    private final StorageManager storageManager;

    public DeserializationComponents(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull ClassDataFinder classDataFinder, @NotNull AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>, AnnotationWithTarget> annotationAndConstantLoader, @NotNull PackageFragmentProvider packageFragmentProvider, @NotNull LocalClassifierTypeSettings localClassifierTypeSettings, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull FlexibleTypeDeserializer flexibleTypeDeserializer, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull NotFoundClasses notFoundClasses, @NotNull ContractDeserializer contractDeserializer, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull ExtensionRegistryLite extensionRegistryLite) {
        DeserializationComponents deserializationComponents = this;
        StorageManager storageManager2 = storageManager;
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        DeserializationConfiguration deserializationConfiguration2 = deserializationConfiguration;
        ClassDataFinder classDataFinder2 = classDataFinder;
        AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>, AnnotationWithTarget> annotationAndConstantLoader2 = annotationAndConstantLoader;
        PackageFragmentProvider packageFragmentProvider2 = packageFragmentProvider;
        LocalClassifierTypeSettings localClassifierTypeSettings2 = localClassifierTypeSettings;
        ErrorReporter errorReporter2 = errorReporter;
        LookupTracker lookupTracker2 = lookupTracker;
        FlexibleTypeDeserializer flexibleTypeDeserializer2 = flexibleTypeDeserializer;
        Iterable<? extends ClassDescriptorFactory> iterable2 = iterable;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        ContractDeserializer contractDeserializer2 = contractDeserializer;
        AdditionalClassPartsProvider additionalClassPartsProvider2 = additionalClassPartsProvider;
        PlatformDependentDeclarationFilter platformDependentDeclarationFilter2 = platformDependentDeclarationFilter;
        C2668g.b(storageManager2, "storageManager");
        C2668g.b(moduleDescriptor2, "moduleDescriptor");
        C2668g.b(deserializationConfiguration2, "configuration");
        C2668g.b(classDataFinder2, "classDataFinder");
        C2668g.b(annotationAndConstantLoader2, "annotationAndConstantLoader");
        C2668g.b(packageFragmentProvider2, "packageFragmentProvider");
        C2668g.b(localClassifierTypeSettings2, "localClassifierTypeSettings");
        C2668g.b(errorReporter2, "errorReporter");
        C2668g.b(lookupTracker2, "lookupTracker");
        C2668g.b(flexibleTypeDeserializer2, "flexibleTypeDeserializer");
        C2668g.b(iterable2, "fictitiousClassDescriptorFactories");
        C2668g.b(notFoundClasses2, "notFoundClasses");
        C2668g.b(contractDeserializer2, "contractDeserializer");
        C2668g.b(additionalClassPartsProvider2, "additionalClassPartsProvider");
        C2668g.b(platformDependentDeclarationFilter2, "platformDependentDeclarationFilter");
        ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
        C2668g.b(extensionRegistryLite2, "extensionRegistryLite");
        this.storageManager = storageManager2;
        this.moduleDescriptor = moduleDescriptor2;
        this.configuration = deserializationConfiguration2;
        this.classDataFinder = classDataFinder2;
        this.annotationAndConstantLoader = annotationAndConstantLoader2;
        this.packageFragmentProvider = packageFragmentProvider2;
        this.localClassifierTypeSettings = localClassifierTypeSettings2;
        this.errorReporter = errorReporter2;
        this.lookupTracker = lookupTracker2;
        this.flexibleTypeDeserializer = flexibleTypeDeserializer2;
        this.fictitiousClassDescriptorFactories = iterable2;
        this.notFoundClasses = notFoundClasses2;
        this.contractDeserializer = contractDeserializer2;
        this.additionalClassPartsProvider = additionalClassPartsProvider2;
        this.platformDependentDeclarationFilter = platformDependentDeclarationFilter;
        this.extensionRegistryLite = extensionRegistryLite2;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    @NotNull
    public final DeserializationConfiguration getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final ClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    @NotNull
    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>, AnnotationWithTarget> getAnnotationAndConstantLoader() {
        return this.annotationAndConstantLoader;
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    @NotNull
    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.localClassifierTypeSettings;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    @NotNull
    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.flexibleTypeDeserializer;
    }

    @NotNull
    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.fictitiousClassDescriptorFactories;
    }

    @NotNull
    public final NotFoundClasses getNotFoundClasses() {
        return this.notFoundClasses;
    }

    @NotNull
    public final ContractDeserializer getContractDeserializer() {
        return this.contractDeserializer;
    }

    @NotNull
    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.additionalClassPartsProvider;
    }

    @NotNull
    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.platformDependentDeclarationFilter;
    }

    @NotNull
    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.extensionRegistryLite;
    }

    @NotNull
    public final ClassDeserializer getClassDeserializer() {
        return this.classDeserializer;
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId) {
        C2668g.b(classId, "classId");
        return ClassDeserializer.deserializeClass$default(this.classDeserializer, classId, null, 2, null);
    }

    @NotNull
    public final DeserializationContext createContext(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @Nullable DeserializedContainerSource deserializedContainerSource) {
        C2668g.b(packageFragmentDescriptor, "descriptor");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(typeTable, "typeTable");
        C2668g.b(versionRequirementTable, "versionRequirementTable");
        return new DeserializationContext(this, nameResolver, packageFragmentDescriptor, typeTable, versionRequirementTable, deserializedContainerSource, null, C17554o.m64195a());
    }
}
