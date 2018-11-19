package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors$enumMemberNames$1 */
final class C19142xaaca1f71 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ EnumEntryClassDescriptors this$0;

    C19142xaaca1f71(EnumEntryClassDescriptors enumEntryClassDescriptors) {
        this.this$0 = enumEntryClassDescriptors;
        super(0);
    }

    @NotNull
    public final Set<Name> invoke() {
        return this.this$0.computeEnumMemberNames();
    }
}
