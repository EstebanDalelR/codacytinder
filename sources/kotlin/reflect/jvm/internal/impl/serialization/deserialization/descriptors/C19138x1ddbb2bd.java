package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$computeNonDeclaredFunctions$1 */
final class C19138x1ddbb2bd extends Lambda implements Function1<SimpleFunctionDescriptor, Boolean> {
    final /* synthetic */ DeserializedClassMemberScope this$0;

    C19138x1ddbb2bd(DeserializedClassMemberScope deserializedClassMemberScope) {
        this.this$0 = deserializedClassMemberScope;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((SimpleFunctionDescriptor) obj));
    }

    public final boolean invoke(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        C2668g.b(simpleFunctionDescriptor, "it");
        return this.this$0.getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.this$0.this$0, simpleFunctionDescriptor);
    }
}
