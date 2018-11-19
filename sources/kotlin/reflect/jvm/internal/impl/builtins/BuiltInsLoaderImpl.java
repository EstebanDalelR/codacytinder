package kotlin.reflect.jvm.internal.impl.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration.Default;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer.ThrowException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    private final BuiltInsResourceLoader resourceLoader = new BuiltInsResourceLoader();

    @NotNull
    public PackageFragmentProvider createPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(moduleDescriptor, "builtInsModule");
        C2668g.b(iterable, "classDescriptorFactories");
        C2668g.b(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C2668g.b(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set set = KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES;
        C2668g.a(set, "KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAMES");
        return createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, set, iterable, platformDependentDeclarationFilter, additionalClassPartsProvider, new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.resourceLoader));
    }

    @NotNull
    public static /* synthetic */ PackageFragmentProvider createBuiltInPackageFragmentProvider$default(BuiltInsLoaderImpl builtInsLoaderImpl, StorageManager storageManager, ModuleDescriptor moduleDescriptor, Set set, Iterable iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, Function1 function1, int i, Object obj) {
        return builtInsLoaderImpl.createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, set, iterable, platformDependentDeclarationFilter, (i & 32) != 0 ? None.INSTANCE : additionalClassPartsProvider, function1);
    }

    @NotNull
    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Set<FqName> set, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, @NotNull Function1<? super String, ? extends InputStream> function1) {
        StorageManager storageManager2 = storageManager;
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        Set<FqName> set2 = set;
        Function1<? super String, ? extends InputStream> function12 = function1;
        C2668g.b(storageManager2, "storageManager");
        C2668g.b(moduleDescriptor2, "module");
        C2668g.b(set2, "packageFqNames");
        Iterable<? extends ClassDescriptorFactory> iterable2 = iterable;
        C2668g.b(iterable2, "classDescriptorFactories");
        PlatformDependentDeclarationFilter platformDependentDeclarationFilter2 = platformDependentDeclarationFilter;
        C2668g.b(platformDependentDeclarationFilter2, "platformDependentDeclarationFilter");
        AdditionalClassPartsProvider additionalClassPartsProvider2 = additionalClassPartsProvider;
        C2668g.b(additionalClassPartsProvider2, "additionalClassPartsProvider");
        C2668g.b(function12, "loadResource");
        Iterable<FqName> iterable3 = set2;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable3, 10));
        for (FqName fqName : iterable3) {
            String builtInsFilePath = BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName);
            InputStream inputStream = (InputStream) function12.invoke(builtInsFilePath);
            if (inputStream != null) {
                arrayList.add(new BuiltInsPackageFragmentImpl(fqName, storageManager2, moduleDescriptor2, inputStream));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Resource not found in classpath: ");
                stringBuilder.append(builtInsFilePath);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        List list = (List) arrayList;
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(list);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager2, moduleDescriptor2);
        DeserializationConfiguration deserializationConfiguration = Default.INSTANCE;
        PackageFragmentProvider packageFragmentProvider = packageFragmentProviderImpl;
        ClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProvider);
        AnnotationAndConstantLoader annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(moduleDescriptor2, notFoundClasses, BuiltInSerializerProtocol.INSTANCE);
        LocalClassifierTypeSettings localClassifierTypeSettings = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter errorReporter = ErrorReporter.DO_NOTHING;
        C2668g.a(errorReporter, "ErrorReporter.DO_NOTHING");
        PackageFragmentProvider packageFragmentProvider2 = packageFragmentProvider;
        DeserializationComponents deserializationComponents = r0;
        List<BuiltInsPackageFragmentImpl> list2 = list;
        DeserializationComponents deserializationComponents2 = new DeserializationComponents(storageManager2, moduleDescriptor2, deserializationConfiguration, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProvider, localClassifierTypeSettings, errorReporter, DO_NOTHING.INSTANCE, ThrowException.INSTANCE, iterable2, notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider2, platformDependentDeclarationFilter2, BuiltInSerializerProtocol.INSTANCE.getExtensionRegistry());
        for (BuiltInsPackageFragmentImpl components : list2) {
            components.setComponents(deserializationComponents);
        }
        return packageFragmentProvider2;
    }
}
