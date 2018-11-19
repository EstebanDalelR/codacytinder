package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumEntryByName$1$$special$$inlined$let$lambda$1 */
final class C19140x7c5aab78 extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ Name $name$inlined;
    final /* synthetic */ EnumEntry $proto;
    final /* synthetic */ C19141xaf8327b7 this$0;

    C19140x7c5aab78(EnumEntry enumEntry, C19141xaf8327b7 c19141xaf8327b7, Name name) {
        this.$proto = enumEntry;
        this.this$0 = c19141xaf8327b7;
        this.$name$inlined = name;
        super(0);
    }

    @NotNull
    public final List<AnnotationDescriptor> invoke() {
        return C19299w.m68840l(this.this$0.this$0.this$0.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(this.this$0.this$0.this$0.getThisAsProtoContainer$deserialization(), this.$proto));
    }
}
