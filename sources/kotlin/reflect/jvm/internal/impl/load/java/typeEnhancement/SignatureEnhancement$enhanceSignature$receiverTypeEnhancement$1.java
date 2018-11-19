package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 INSTANCE = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    @NotNull
    public final KotlinType invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.b(callableMemberDescriptor, "it");
        callableMemberDescriptor = callableMemberDescriptor.getExtensionReceiverParameter();
        if (callableMemberDescriptor == null) {
            C2668g.a();
        }
        C2668g.a(callableMemberDescriptor, "it.extensionReceiverParameter!!");
        callableMemberDescriptor = callableMemberDescriptor.getType();
        C2668g.a(callableMemberDescriptor, "it.extensionReceiverParameter!!.type");
        return callableMemberDescriptor;
    }
}
