package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmBuiltInsSettings$createMockJavaIoSerializableType$superTypes$1 */
final class C19127xf01ceaf8 extends Lambda implements Function0<SimpleType> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    C19127xf01ceaf8(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
        super(0);
    }

    @NotNull
    public final SimpleType invoke() {
        SimpleType anyType = this.this$0.moduleDescriptor.getBuiltIns().getAnyType();
        C2668g.a(anyType, "moduleDescriptor.builtIns.anyType");
        return anyType;
    }
}
