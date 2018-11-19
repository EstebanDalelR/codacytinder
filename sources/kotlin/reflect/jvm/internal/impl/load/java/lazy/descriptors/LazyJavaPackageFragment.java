package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    @NotNull
    private final Annotations annotations;
    @NotNull
    private final NotNullLazyValue binaryClasses$delegate = this.f59982c.getStorageManager().createLazyValue((Function0) new LazyJavaPackageFragment$binaryClasses$2(this));
    /* renamed from: c */
    private final LazyJavaResolverContext f59982c;
    private final JavaPackage jPackage;
    private final NotNullLazyValue partToFacade$delegate;
    private final JvmPackageScope scope = new JvmPackageScope(this.f59982c, this.jPackage, this);
    private final NotNullLazyValue<List<FqName>> subPackages = this.f59982c.getStorageManager().createRecursionTolerantLazyValue((Function0) new LazyJavaPackageFragment$subPackages$1(this), C17554o.m64195a());

    @NotNull
    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.binaryClasses$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaPackage javaPackage) {
        C2668g.b(lazyJavaResolverContext, "outerContext");
        C2668g.b(javaPackage, "jPackage");
        super(lazyJavaResolverContext.getModule(), javaPackage.getFqName());
        this.jPackage = javaPackage;
        this.f59982c = ContextKt.childForClassOrPackage$default(lazyJavaResolverContext, this, null, 0, 6, null);
        if (this.f59982c.getComponents().getAnnotationTypeQualifierResolver().getDisabled() != null) {
            lazyJavaResolverContext = Annotations.Companion.getEMPTY();
        } else {
            lazyJavaResolverContext = LazyJavaAnnotationsKt.resolveAnnotations(this.f59982c, this.jPackage);
        }
        this.annotations = lazyJavaResolverContext;
        this.partToFacade$delegate = this.f59982c.getStorageManager().createLazyValue((Function0) new LazyJavaPackageFragment$partToFacade$2(this));
    }

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return (List) this.subPackages.invoke();
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass javaClass) {
        C2668g.b(javaClass, "jClass");
        return this.scope.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(javaClass);
    }

    @NotNull
    public JvmPackageScope getMemberScope() {
        return this.scope;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy Java package fragment: ");
        stringBuilder.append(getFqName());
        return stringBuilder.toString();
    }

    @NotNull
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }
}
