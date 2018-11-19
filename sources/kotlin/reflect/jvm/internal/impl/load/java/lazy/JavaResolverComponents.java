package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.components.ExternalAnnotationResolver;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class JavaResolverComponents {
    @NotNull
    private final AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    @NotNull
    private final DeserializedDescriptorResolver deserializedDescriptorResolver;
    @NotNull
    private final ErrorReporter errorReporter;
    @NotNull
    private final ExternalAnnotationResolver externalAnnotationResolver;
    @NotNull
    private final JavaClassFinder finder;
    @NotNull
    private final JavaClassesTracker javaClassesTracker;
    @NotNull
    private final JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator;
    @NotNull
    private final JavaResolverCache javaResolverCache;
    @NotNull
    private final KotlinClassFinder kotlinClassFinder;
    @NotNull
    private final LookupTracker lookupTracker;
    @NotNull
    private final ModuleDescriptor module;
    @NotNull
    private final ModuleClassResolver moduleClassResolver;
    @NotNull
    private final PackagePartProvider packageMapper;
    @NotNull
    private final ReflectionTypes reflectionTypes;
    @NotNull
    private final SamConversionResolver samConversionResolver;
    @NotNull
    private final SignatureEnhancement signatureEnhancement;
    @NotNull
    private final SignaturePropagator signaturePropagator;
    @NotNull
    private final JavaSourceElementFactory sourceElementFactory;
    @NotNull
    private final StorageManager storageManager;
    @NotNull
    private final SupertypeLoopChecker supertypeLoopChecker;

    public JavaResolverComponents(@NotNull StorageManager storageManager, @NotNull JavaClassFinder javaClassFinder, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ExternalAnnotationResolver externalAnnotationResolver, @NotNull SignaturePropagator signaturePropagator, @NotNull ErrorReporter errorReporter, @NotNull JavaResolverCache javaResolverCache, @NotNull JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, @NotNull SamConversionResolver samConversionResolver, @NotNull JavaSourceElementFactory javaSourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull LookupTracker lookupTracker, @NotNull ModuleDescriptor moduleDescriptor, @NotNull ReflectionTypes reflectionTypes, @NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull SignatureEnhancement signatureEnhancement, @NotNull JavaClassesTracker javaClassesTracker) {
        JavaResolverComponents javaResolverComponents = this;
        StorageManager storageManager2 = storageManager;
        JavaClassFinder javaClassFinder2 = javaClassFinder;
        KotlinClassFinder kotlinClassFinder2 = kotlinClassFinder;
        DeserializedDescriptorResolver deserializedDescriptorResolver2 = deserializedDescriptorResolver;
        ExternalAnnotationResolver externalAnnotationResolver2 = externalAnnotationResolver;
        SignaturePropagator signaturePropagator2 = signaturePropagator;
        ErrorReporter errorReporter2 = errorReporter;
        JavaResolverCache javaResolverCache2 = javaResolverCache;
        JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator2 = javaPropertyInitializerEvaluator;
        SamConversionResolver samConversionResolver2 = samConversionResolver;
        JavaSourceElementFactory javaSourceElementFactory2 = javaSourceElementFactory;
        ModuleClassResolver moduleClassResolver2 = moduleClassResolver;
        PackagePartProvider packagePartProvider2 = packagePartProvider;
        SupertypeLoopChecker supertypeLoopChecker2 = supertypeLoopChecker;
        LookupTracker lookupTracker2 = lookupTracker;
        ModuleDescriptor moduleDescriptor2 = moduleDescriptor;
        C2668g.b(storageManager2, "storageManager");
        C2668g.b(javaClassFinder2, "finder");
        C2668g.b(kotlinClassFinder2, "kotlinClassFinder");
        C2668g.b(deserializedDescriptorResolver2, "deserializedDescriptorResolver");
        C2668g.b(externalAnnotationResolver2, "externalAnnotationResolver");
        C2668g.b(signaturePropagator2, "signaturePropagator");
        C2668g.b(errorReporter2, "errorReporter");
        C2668g.b(javaResolverCache2, "javaResolverCache");
        C2668g.b(javaPropertyInitializerEvaluator2, "javaPropertyInitializerEvaluator");
        C2668g.b(samConversionResolver2, "samConversionResolver");
        C2668g.b(javaSourceElementFactory2, "sourceElementFactory");
        C2668g.b(moduleClassResolver2, "moduleClassResolver");
        C2668g.b(packagePartProvider2, "packageMapper");
        C2668g.b(supertypeLoopChecker2, "supertypeLoopChecker");
        C2668g.b(lookupTracker2, "lookupTracker");
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(reflectionTypes, "reflectionTypes");
        C2668g.b(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        C2668g.b(signatureEnhancement, "signatureEnhancement");
        C2668g.b(javaClassesTracker, "javaClassesTracker");
        ModuleDescriptor moduleDescriptor3 = moduleDescriptor;
        this.storageManager = storageManager2;
        this.finder = javaClassFinder2;
        this.kotlinClassFinder = kotlinClassFinder2;
        this.deserializedDescriptorResolver = deserializedDescriptorResolver2;
        this.externalAnnotationResolver = externalAnnotationResolver2;
        this.signaturePropagator = signaturePropagator2;
        this.errorReporter = errorReporter2;
        this.javaResolverCache = javaResolverCache2;
        this.javaPropertyInitializerEvaluator = javaPropertyInitializerEvaluator2;
        this.samConversionResolver = samConversionResolver2;
        this.sourceElementFactory = javaSourceElementFactory2;
        this.moduleClassResolver = moduleClassResolver2;
        this.packageMapper = packagePartProvider2;
        this.supertypeLoopChecker = supertypeLoopChecker2;
        this.lookupTracker = lookupTracker;
        this.module = moduleDescriptor3;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = annotationTypeQualifierResolver;
        this.reflectionTypes = reflectionTypes;
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver2;
        JavaClassesTracker javaClassesTracker2 = javaClassesTracker;
        this.signatureEnhancement = signatureEnhancement;
        this.javaClassesTracker = javaClassesTracker2;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @NotNull
    public final JavaClassFinder getFinder() {
        return this.finder;
    }

    @NotNull
    public final KotlinClassFinder getKotlinClassFinder() {
        return this.kotlinClassFinder;
    }

    @NotNull
    public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.deserializedDescriptorResolver;
    }

    @NotNull
    public final SignaturePropagator getSignaturePropagator() {
        return this.signaturePropagator;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @NotNull
    public final JavaResolverCache getJavaResolverCache() {
        return this.javaResolverCache;
    }

    @NotNull
    public final JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.javaPropertyInitializerEvaluator;
    }

    @NotNull
    public final JavaSourceElementFactory getSourceElementFactory() {
        return this.sourceElementFactory;
    }

    @NotNull
    public final ModuleClassResolver getModuleClassResolver() {
        return this.moduleClassResolver;
    }

    @NotNull
    public final PackagePartProvider getPackageMapper() {
        return this.packageMapper;
    }

    @NotNull
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.supertypeLoopChecker;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.module;
    }

    @NotNull
    public final ReflectionTypes getReflectionTypes() {
        return this.reflectionTypes;
    }

    @NotNull
    public final AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.annotationTypeQualifierResolver;
    }

    @NotNull
    public final SignatureEnhancement getSignatureEnhancement() {
        return this.signatureEnhancement;
    }

    @NotNull
    public final JavaClassesTracker getJavaClassesTracker() {
        return this.javaClassesTracker;
    }

    @NotNull
    public final JavaResolverComponents replace(@NotNull JavaResolverCache javaResolverCache) {
        JavaResolverCache javaResolverCache2 = javaResolverCache;
        C2668g.b(javaResolverCache2, "javaResolverCache");
        StorageManager storageManager = this.storageManager;
        JavaClassFinder javaClassFinder = this.finder;
        KotlinClassFinder kotlinClassFinder = this.kotlinClassFinder;
        DeserializedDescriptorResolver deserializedDescriptorResolver = this.deserializedDescriptorResolver;
        ExternalAnnotationResolver externalAnnotationResolver = this.externalAnnotationResolver;
        SignaturePropagator signaturePropagator = this.signaturePropagator;
        ErrorReporter errorReporter = this.errorReporter;
        JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator = this.javaPropertyInitializerEvaluator;
        SamConversionResolver samConversionResolver = this.samConversionResolver;
        JavaSourceElementFactory javaSourceElementFactory = this.sourceElementFactory;
        ModuleClassResolver moduleClassResolver = this.moduleClassResolver;
        PackagePartProvider packagePartProvider = this.packageMapper;
        PackagePartProvider packagePartProvider2 = packagePartProvider;
        return new JavaResolverComponents(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, externalAnnotationResolver, signaturePropagator, errorReporter, javaResolverCache2, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider2, this.supertypeLoopChecker, this.lookupTracker, this.module, this.reflectionTypes, this.annotationTypeQualifierResolver, this.signatureEnhancement, this.javaClassesTracker);
    }
}
