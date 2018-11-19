package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

final class DeserializedPackageFragment$memberScope$1 extends Lambda implements Function0<MemberScope> {
    final /* synthetic */ DeserializedPackageFragment this$0;

    DeserializedPackageFragment$memberScope$1(DeserializedPackageFragment deserializedPackageFragment) {
        this.this$0 = deserializedPackageFragment;
        super(0);
    }

    @NotNull
    public final MemberScope invoke() {
        return this.this$0.computeMemberScope();
    }
}
