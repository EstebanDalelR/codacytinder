package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class DeserializedMemberScope$functionNamesLazy$2 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope this$0;

    DeserializedMemberScope$functionNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        this.this$0 = deserializedMemberScope;
        super(0);
    }

    @NotNull
    public final Set<Name> invoke() {
        return an.m66899a(this.this$0.functionProtosBytes.keySet(), (Iterable) this.this$0.getNonDeclaredFunctionNames());
    }
}
