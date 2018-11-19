package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {
    @NotNull
    public DeserializationComponents components;
    private final NotNullLazyValue<MemberScope> memberScope = this.storageManager.createLazyValue((Function0) new DeserializedPackageFragment$memberScope$1(this));
    @NotNull
    private final StorageManager storageManager;

    @NotNull
    protected abstract MemberScope computeMemberScope();

    @NotNull
    public abstract ClassDataFinder getClassDataFinder();

    public DeserializedPackageFragment(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor) {
        C2668g.b(fqName, "fqName");
        C2668g.b(storageManager, "storageManager");
        C2668g.b(moduleDescriptor, "module");
        super(moduleDescriptor, fqName);
        this.storageManager = storageManager;
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            C2668g.b("components");
        }
        return deserializationComponents;
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        C2668g.b(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }

    @NotNull
    public MemberScope getMemberScope() {
        return (MemberScope) this.memberScope.invoke();
    }

    public boolean hasTopLevelClass(@NotNull Name name) {
        C2668g.b(name, "name");
        MemberScope memberScope = getMemberScope();
        return (!(memberScope instanceof DeserializedMemberScope) || ((DeserializedMemberScope) memberScope).getClassNames$deserialization().contains(name) == null) ? null : true;
    }
}
