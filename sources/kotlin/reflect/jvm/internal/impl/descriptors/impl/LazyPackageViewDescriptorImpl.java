package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;"))};
    @NotNull
    private final FqName fqName;
    @NotNull
    private final NotNullLazyValue fragments$delegate;
    @NotNull
    private final MemberScope memberScope;
    @NotNull
    private final ModuleDescriptorImpl module;

    @NotNull
    public List<PackageFragmentDescriptor> getFragments() {
        return (List) StorageKt.getValue(this.fragments$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public boolean isEmpty() {
        return DefaultImpls.isEmpty(this);
    }

    @NotNull
    public ModuleDescriptorImpl getModule() {
        return this.module;
    }

    @NotNull
    public FqName getFqName() {
        return this.fqName;
    }

    public LazyPackageViewDescriptorImpl(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
        C2668g.b(moduleDescriptorImpl, "module");
        C2668g.b(fqName, "fqName");
        C2668g.b(storageManager, "storageManager");
        super(Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        this.module = moduleDescriptorImpl;
        this.fqName = fqName;
        this.fragments$delegate = storageManager.createLazyValue((Function0) new LazyPackageViewDescriptorImpl$fragments$2(this));
        this.memberScope = (MemberScope) new LazyScopeAdapter(storageManager.createLazyValue((Function0) new LazyPackageViewDescriptorImpl$memberScope$1(this)));
    }

    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Nullable
    public PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        ModuleDescriptorImpl module = getModule();
        FqName parent = getFqName().parent();
        C2668g.a(parent, "fqName.parent()");
        return module.getPackage(parent);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PackageViewDescriptor)) {
            obj = null;
        }
        PackageViewDescriptor packageViewDescriptor = (PackageViewDescriptor) obj;
        boolean z = false;
        if (packageViewDescriptor == null) {
            return false;
        }
        if (C2668g.a(getFqName(), packageViewDescriptor.getFqName()) && C2668g.a(getModule(), packageViewDescriptor.getModule()) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + getFqName().hashCode();
    }

    public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        C2668g.b(declarationDescriptorVisitor, "visitor");
        return declarationDescriptorVisitor.visitPackageViewDescriptor(this, d);
    }
}
