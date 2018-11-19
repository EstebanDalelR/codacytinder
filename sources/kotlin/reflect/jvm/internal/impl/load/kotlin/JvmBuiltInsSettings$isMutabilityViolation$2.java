package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.platform.JavaToKotlinClassMap;

final class JvmBuiltInsSettings$isMutabilityViolation$2 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$isMutabilityViolation$2(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((CallableMemberDescriptor) obj));
    }

    public final boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        C2668g.a(callableMemberDescriptor, "overridden");
        if (callableMemberDescriptor.getKind() == Kind.DECLARATION) {
            JavaToKotlinClassMap access$getJ2kClassMap$p = this.this$0.j2kClassMap;
            callableMemberDescriptor = callableMemberDescriptor.getContainingDeclaration();
            if (callableMemberDescriptor == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            } else if (access$getJ2kClassMap$p.isMutable((ClassDescriptor) callableMemberDescriptor) != null) {
                return true;
            }
        }
        return null;
    }
}
