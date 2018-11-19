package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker.Default;
import kotlin.reflect.jvm.internal.impl.load.java.components.ExternalAnnotationResolver;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator.DoNothing;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver.Empty;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JavaClassDataFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.platform.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "", "deserialization", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationComponents;", "packagePartProvider", "Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "(Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;)V", "getDeserialization", "()Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;", "module", "Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;", "getModule", "()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "getPackagePartProvider", "()Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Companion", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public final class RuntimeModuleData {
    public static final Companion Companion = new Companion();
    @NotNull
    private final DeserializationComponents deserialization;
    @NotNull
    private final RuntimePackagePartProvider packagePartProvider;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "classLoader", "Ljava/lang/ClassLoader;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final RuntimeModuleData create(@NotNull ClassLoader classLoader) {
            ClassLoader classLoader2 = classLoader;
            C2668g.b(classLoader2, "classLoader");
            StorageManager lockBasedStorageManager = new LockBasedStorageManager();
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, false, 2, null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<runtime module for ");
            stringBuilder.append(classLoader2);
            stringBuilder.append('>');
            Name special = Name.special(stringBuilder.toString());
            C2668g.a(special, "Name.special(\"<runtime module for $classLoader>\")");
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(special, lockBasedStorageManager, jvmBuiltIns, null, null, 24, null);
            ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoader2);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
            RuntimePackagePartProvider runtimePackagePartProvider = new RuntimePackagePartProvider(classLoader2);
            JavaResolverCache javaResolverCache = JavaResolverCache.EMPTY;
            ModuleDescriptor moduleDescriptor = moduleDescriptorImpl;
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptor);
            AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(lockBasedStorageManager, Jsr305State.DISABLED);
            JavaClassFinder reflectJavaClassFinder = new ReflectJavaClassFinder(classLoader2);
            KotlinClassFinder kotlinClassFinder = reflectKotlinClassFinder;
            ExternalAnnotationResolver externalAnnotationResolver = ExternalAnnotationResolver.EMPTY;
            C2668g.a(externalAnnotationResolver, "ExternalAnnotationResolver.EMPTY");
            SignaturePropagator signaturePropagator = SignaturePropagator.DO_NOTHING;
            C2668g.a(signaturePropagator, "SignaturePropagator.DO_NOTHING");
            ErrorReporter errorReporter = RuntimeErrorReporter.INSTANCE;
            ExternalAnnotationResolver externalAnnotationResolver2 = externalAnnotationResolver;
            C2668g.a(javaResolverCache, "javaResolverCache");
            JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator = DoNothing.INSTANCE;
            SamConversionResolver samConversionResolver = Empty.INSTANCE;
            JavaSourceElementFactory javaSourceElementFactory = RuntimeSourceElementFactory.INSTANCE;
            ModuleClassResolver moduleClassResolver = singleModuleClassResolver;
            PackagePartProvider packagePartProvider = runtimePackagePartProvider;
            SupertypeLoopChecker supertypeLoopChecker = EMPTY.INSTANCE;
            LookupTracker lookupTracker = DO_NOTHING.INSTANCE;
            JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
            ReflectionTypes reflectionTypes = new ReflectionTypes(moduleDescriptor, notFoundClasses);
            SignatureEnhancement signatureEnhancement = new SignatureEnhancement(annotationTypeQualifierResolver, Jsr305State.DISABLED);
            JavaResolverComponents javaResolverComponents = r3;
            AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = annotationTypeQualifierResolver;
            JavaClassFinder javaClassFinder = reflectJavaClassFinder;
            ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
            StorageManager storageManager = lockBasedStorageManager;
            NotFoundClasses notFoundClasses2 = notFoundClasses;
            JavaResolverCache javaResolverCache2 = javaResolverCache;
            RuntimePackagePartProvider runtimePackagePartProvider2 = runtimePackagePartProvider;
            SignaturePropagator signaturePropagator2 = signaturePropagator;
            SingleModuleClassResolver singleModuleClassResolver2 = singleModuleClassResolver;
            ErrorReporter errorReporter2 = errorReporter;
            DeserializedDescriptorResolver deserializedDescriptorResolver2 = deserializedDescriptorResolver;
            ModuleDescriptorImpl moduleDescriptorImpl2 = moduleDescriptorImpl;
            NotFoundClasses notFoundClasses3 = notFoundClasses2;
            KotlinClassFinder kotlinClassFinder2 = kotlinClassFinder;
            SingleModuleClassResolver singleModuleClassResolver3 = singleModuleClassResolver2;
            KotlinClassFinder kotlinClassFinder3 = kotlinClassFinder2;
            DeserializedDescriptorResolver deserializedDescriptorResolver3 = deserializedDescriptorResolver2;
            JavaResolverComponents javaResolverComponents2 = new JavaResolverComponents(lockBasedStorageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, externalAnnotationResolver2, signaturePropagator2, errorReporter2, javaResolverCache2, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor2, reflectionTypes, annotationTypeQualifierResolver2, signatureEnhancement, Default.INSTANCE);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(javaResolverComponents);
            JvmBuiltIns jvmBuiltIns3 = jvmBuiltIns2;
            jvmBuiltIns3.initialize(moduleDescriptor2, true);
            JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProvider, javaResolverCache2);
            KotlinClassFinder kotlinClassFinder4 = kotlinClassFinder3;
            JavaClassDataFinder javaClassDataFinder = new JavaClassDataFinder(kotlinClassFinder4, deserializedDescriptorResolver3);
            StorageManager storageManager2 = storageManager;
            NotFoundClasses notFoundClasses4 = notFoundClasses3;
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(moduleDescriptor2, notFoundClasses4, storageManager2, kotlinClassFinder4);
            ModuleDescriptor moduleDescriptor3 = moduleDescriptor2;
            DeserializationComponentsForJava deserializationComponentsForJava = r3;
            DeserializationComponentsForJava deserializationComponentsForJava2 = new DeserializationComponentsForJava(storageManager2, moduleDescriptor3, DeserializationConfiguration.Default.INSTANCE, javaClassDataFinder, binaryClassAnnotationAndConstantLoaderImpl, lazyJavaPackageFragmentProvider, notFoundClasses4, RuntimeErrorReporter.INSTANCE, DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT());
            singleModuleClassResolver3.setResolver(javaDescriptorResolver);
            deserializedDescriptorResolver3.setComponents(deserializationComponentsForJava);
            r1 = new ModuleDescriptorImpl[2];
            moduleDescriptorImpl = moduleDescriptorImpl2;
            r1[0] = moduleDescriptorImpl;
            ModuleDescriptorImpl builtInsModule = jvmBuiltIns3.getBuiltInsModule();
            C2668g.a(builtInsModule, "builtIns.builtInsModule");
            r1[1] = builtInsModule;
            moduleDescriptorImpl.setDependencies(r1);
            moduleDescriptorImpl.initialize(javaDescriptorResolver.getPackageFragmentProvider());
            return new RuntimeModuleData(deserializationComponentsForJava.getComponents(), runtimePackagePartProvider2);
        }
    }

    private RuntimeModuleData(DeserializationComponents deserializationComponents, RuntimePackagePartProvider runtimePackagePartProvider) {
        this.deserialization = deserializationComponents;
        this.packagePartProvider = runtimePackagePartProvider;
    }

    @NotNull
    public final DeserializationComponents getDeserialization() {
        return this.deserialization;
    }

    @NotNull
    public final RuntimePackagePartProvider getPackagePartProvider() {
        return this.packagePartProvider;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.deserialization.getModuleDescriptor();
    }
}
