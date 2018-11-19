package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

final class JvmBuiltInsSettings$cloneableType$2 extends Lambda implements Function0<SimpleType> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$cloneableType$2(JvmBuiltInsSettings jvmBuiltInsSettings, StorageManager storageManager) {
        this.this$0 = jvmBuiltInsSettings;
        this.$storageManager = storageManager;
        super(0);
    }

    @NotNull
    public final SimpleType invoke() {
        ModuleDescriptor access$getOwnerModuleDescriptor$p = this.this$0.getOwnerModuleDescriptor();
        ClassId cloneable_class_id = JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID();
        C2668g.a(cloneable_class_id, "JvmBuiltInClassDescripto…actory.CLONEABLE_CLASS_ID");
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(access$getOwnerModuleDescriptor$p, cloneable_class_id, new NotFoundClasses(this.$storageManager, this.this$0.getOwnerModuleDescriptor())).getDefaultType();
    }
}
