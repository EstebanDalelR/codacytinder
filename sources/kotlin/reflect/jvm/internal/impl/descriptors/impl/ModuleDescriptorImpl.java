package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C15810e;
import kotlin.C15811g;
import kotlin.C15819j;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.collections.C19066k;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.Capability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.MultiTargetPlatform;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(ModuleDescriptorImpl.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};
    @NotNull
    private final KotlinBuiltIns builtIns;
    private final Map<Capability<? extends Object>, Object> capabilities;
    private ModuleDependencies dependencies;
    private boolean isValid;
    private PackageFragmentProvider packageFragmentProviderForModuleContent;
    private final Lazy packageFragmentProviderForWholeModuleWithDependencies$delegate;
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> packages;
    private final StorageManager storageManager;

    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable MultiTargetPlatform multiTargetPlatform) {
        this(name, storageManager, kotlinBuiltIns, multiTargetPlatform, null, 16, null);
    }

    private final CompositePackageFragmentProvider getPackageFragmentProviderForWholeModuleWithDependencies() {
        Lazy lazy = this.packageFragmentProviderForWholeModuleWithDependencies$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (CompositePackageFragmentProvider) lazy.getValue();
    }

    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        C2668g.b(declarationDescriptorVisitor, "visitor");
        return DefaultImpls.accept(this, declarationDescriptorVisitor, d);
    }

    @Nullable
    public DeclarationDescriptor getContainingDeclaration() {
        return DefaultImpls.getContainingDeclaration(this);
    }

    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.builtIns;
    }

    @JvmOverloads
    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, MultiTargetPlatform multiTargetPlatform, Map map, int i, C15823e c15823e) {
        if ((i & 8) != null) {
            multiTargetPlatform = null;
        }
        MultiTargetPlatform multiTargetPlatform2 = multiTargetPlatform;
        if ((i & 16) != null) {
            map = ah.m66884a();
        }
        this(name, storageManager, kotlinBuiltIns, multiTargetPlatform2, map);
    }

    @JvmOverloads
    public ModuleDescriptorImpl(@NotNull Name name, @NotNull StorageManager storageManager, @NotNull KotlinBuiltIns kotlinBuiltIns, @Nullable MultiTargetPlatform multiTargetPlatform, @NotNull Map<Capability<?>, ? extends Object> map) {
        C2668g.b(name, "moduleName");
        C2668g.b(storageManager, "storageManager");
        C2668g.b(kotlinBuiltIns, "builtIns");
        C2668g.b(map, "capabilities");
        super(Annotations.Companion.getEMPTY(), name);
        this.storageManager = storageManager;
        this.builtIns = kotlinBuiltIns;
        if (name.isSpecial() == null) {
            kotlinBuiltIns = new StringBuilder();
            kotlinBuiltIns.append("Module name must be special: ");
            kotlinBuiltIns.append(name);
            throw ((Throwable) new IllegalArgumentException(kotlinBuiltIns.toString()));
        }
        if (multiTargetPlatform != null) {
            name = ag.m64174a((Pair) C15811g.m59834a(MultiTargetPlatform.CAPABILITY, multiTargetPlatform));
            if (name != null) {
                this.capabilities = ah.m66887a((Map) map, (Map) name);
                this.isValid = true;
                this.packages = this.storageManager.createMemoizedFunction((Function1) new ModuleDescriptorImpl$packages$1(this));
                this.packageFragmentProviderForWholeModuleWithDependencies$delegate = C15810e.m59833a((Function0) new C19084x39a25915(this));
            }
        }
        name = ah.m66884a();
        this.capabilities = ah.m66887a((Map) map, (Map) name);
        this.isValid = true;
        this.packages = this.storageManager.createMemoizedFunction((Function1) new ModuleDescriptorImpl$packages$1(this));
        this.packageFragmentProviderForWholeModuleWithDependencies$delegate = C15810e.m59833a((Function0) new C19084x39a25915(this));
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void assertValid() {
        if (!isValid()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Accessing invalid module descriptor ");
            stringBuilder.append(this);
            throw new InvalidModuleException(stringBuilder.toString());
        }
    }

    @NotNull
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.dependencies;
        if (moduleDependencies != null) {
            return moduleDependencies.getExpectedByDependencies();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dependencies of module ");
        stringBuilder.append(getId());
        stringBuilder.append(" were not set");
        throw new AssertionError(stringBuilder.toString());
    }

    @NotNull
    public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        assertValid();
        return (PackageViewDescriptor) this.packages.invoke(fqName);
    }

    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(fqName, "fqName");
        C2668g.b(function1, "nameFilter");
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, function1);
    }

    private final boolean isInitialized() {
        return this.packageFragmentProviderForModuleContent != null;
    }

    public final void setDependencies(@NotNull ModuleDependencies moduleDependencies) {
        C2668g.b(moduleDependencies, "dependencies");
        Object obj = this.dependencies == null ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            moduleDependencies = new StringBuilder();
            moduleDependencies.append("Dependencies of ");
            moduleDependencies.append(getId());
            moduleDependencies.append(" were already set");
            throw new AssertionError(moduleDependencies.toString());
        }
        this.dependencies = moduleDependencies;
    }

    public final void setDependencies(@NotNull ModuleDescriptorImpl... moduleDescriptorImplArr) {
        C2668g.b(moduleDescriptorImplArr, "descriptors");
        setDependencies(C19066k.m68007i(moduleDescriptorImplArr));
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list) {
        C2668g.b(list, "descriptors");
        setDependencies(list, am.m64176a());
    }

    public final void setDependencies(@NotNull List<ModuleDescriptorImpl> list, @NotNull Set<ModuleDescriptorImpl> set) {
        C2668g.b(list, "descriptors");
        C2668g.b(set, ManagerWebServices.FB_PARAM_FRIENDS);
        setDependencies((ModuleDependencies) new ModuleDependenciesImpl(list, set, C17554o.m64195a()));
    }

    public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(moduleDescriptor, "targetModule");
        if (!C2668g.a(this, moduleDescriptor)) {
            ModuleDependencies moduleDependencies = this.dependencies;
            if (moduleDependencies == null) {
                C2668g.a();
            }
            if (!C19299w.m68802a((Iterable) moduleDependencies.getModulesWhoseInternalsAreVisible(), (Object) moduleDescriptor)) {
                if (getExpectedByModules().contains(moduleDescriptor) == null) {
                    return null;
                }
            }
        }
        return true;
    }

    private final String getId() {
        String name = getName().toString();
        C2668g.a(name, "name.toString()");
        return name;
    }

    public final void initialize(@NotNull PackageFragmentProvider packageFragmentProvider) {
        C2668g.b(packageFragmentProvider, "providerForModuleContent");
        int isInitialized = isInitialized() ^ 1;
        if (C15819j.f49018a && isInitialized == 0) {
            packageFragmentProvider = new StringBuilder();
            packageFragmentProvider.append("Attempt to initialize module ");
            packageFragmentProvider.append(getId());
            packageFragmentProvider.append(" twice");
            throw new AssertionError(packageFragmentProvider.toString());
        }
        this.packageFragmentProviderForModuleContent = packageFragmentProvider;
    }

    @NotNull
    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return getPackageFragmentProviderForWholeModuleWithDependencies();
    }
}
