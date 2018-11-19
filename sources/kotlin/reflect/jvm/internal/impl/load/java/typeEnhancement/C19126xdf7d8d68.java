package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1 */
final class C19126xdf7d8d68 extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {
    final /* synthetic */ ValueParameterDescriptor $p;

    C19126xdf7d8d68(ValueParameterDescriptor valueParameterDescriptor) {
        this.$p = valueParameterDescriptor;
        super(1);
    }

    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "it");
        callableMemberDescriptor = callableMemberDescriptor.getValueParameters().get(this.$p.getIndex());
        C2668g.a(callableMemberDescriptor, "it.valueParameters[p.index]");
        callableMemberDescriptor = ((ValueParameterDescriptor) callableMemberDescriptor).getType();
        C2668g.a(callableMemberDescriptor, "it.valueParameters[p.index].type");
        return callableMemberDescriptor;
    }
}
