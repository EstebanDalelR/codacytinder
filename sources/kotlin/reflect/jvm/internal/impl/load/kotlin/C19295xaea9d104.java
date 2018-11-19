package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1 */
public final class C19295xaea9d104 extends PackageFragmentDescriptorImpl {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    C19295xaea9d104(JvmBuiltInsSettings jvmBuiltInsSettings, ModuleDescriptor moduleDescriptor, FqName fqName) {
        this.this$0 = jvmBuiltInsSettings;
        super(moduleDescriptor, fqName);
    }

    @NotNull
    public Empty getMemberScope() {
        return Empty.INSTANCE;
    }
}
