package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {
    @NotNull
    private final ProtoBasedClassDataFinder classDataFinder = new ProtoBasedClassDataFinder(this.proto, (NameResolver) this.nameResolver, (Function1) new DeserializedPackageFragmentImpl$classDataFinder$1(this));
    private final DeserializedContainerSource containerSource;
    @NotNull
    private final NameResolverImpl nameResolver;
    @NotNull
    private final PackageFragment proto;

    public DeserializedPackageFragmentImpl(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull PackageFragment packageFragment, @Nullable DeserializedContainerSource deserializedContainerSource) {
        C2668g.b(fqName, "fqName");
        C2668g.b(storageManager, "storageManager");
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(packageFragment, "proto");
        super(fqName, storageManager, moduleDescriptor);
        this.proto = packageFragment;
        this.containerSource = deserializedContainerSource;
        storageManager = this.proto.getStrings();
        C2668g.a(storageManager, "proto.strings");
        moduleDescriptor = this.proto.getQualifiedNames();
        C2668g.a(moduleDescriptor, "proto.qualifiedNames");
        this.nameResolver = new NameResolverImpl(storageManager, moduleDescriptor);
    }

    @NotNull
    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    @NotNull
    protected DeserializedPackageMemberScope computeMemberScope() {
        PackageFragmentDescriptor packageFragmentDescriptor = this;
        Package packageR = this.proto.getPackage();
        C2668g.a(packageR, "proto.`package`");
        return new DeserializedPackageMemberScope(packageFragmentDescriptor, packageR, this.nameResolver, this.containerSource, getComponents(), new DeserializedPackageFragmentImpl$computeMemberScope$1(this));
    }
}
