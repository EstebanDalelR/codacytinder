package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.collections.C15807n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

final class JvmBuiltInClassDescriptorFactory$cloneable$2 extends Lambda implements Function0<ClassDescriptorImpl> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltInClassDescriptorFactory this$0;

    JvmBuiltInClassDescriptorFactory$cloneable$2(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        this.this$0 = jvmBuiltInClassDescriptorFactory;
        this.$storageManager = storageManager;
        super(0);
    }

    @NotNull
    public final ClassDescriptorImpl invoke() {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl((DeclarationDescriptor) this.this$0.computeContainingDeclaration.invoke(this.this$0.moduleDescriptor), JvmBuiltInClassDescriptorFactory.CLONEABLE_NAME, Modality.ABSTRACT, ClassKind.INTERFACE, C15807n.m59826a(this.this$0.moduleDescriptor.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false);
        classDescriptorImpl.initialize(new CloneableClassScope(this.$storageManager, classDescriptorImpl), am.m64176a(), null);
        return classDescriptorImpl;
    }
}
