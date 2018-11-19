package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class KClassImpl$Data$descriptor$2 extends Lambda implements Function0<ClassDescriptor> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$descriptor$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    @NotNull
    public final ClassDescriptor invoke() {
        ClassDescriptor deserializeClass;
        ClassId access$getClassId$p = this.this$0.this$0.getClassId();
        RuntimeModuleData moduleData = ((Data) this.this$0.this$0.getData().invoke()).getModuleData();
        if (access$getClassId$p.isLocal()) {
            deserializeClass = moduleData.getDeserialization().deserializeClass(access$getClassId$p);
        } else {
            deserializeClass = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleData.getModule(), access$getClassId$p);
        }
        if (deserializeClass != null) {
            return deserializeClass;
        }
        this.this$0.this$0.reportUnresolvedClass();
        throw null;
    }
}
