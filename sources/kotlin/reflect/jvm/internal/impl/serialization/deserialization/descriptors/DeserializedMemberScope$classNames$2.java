package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class DeserializedMemberScope$classNames$2 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ Function0 $classNames;

    DeserializedMemberScope$classNames$2(Function0 function0) {
        this.$classNames = function0;
        super(0);
    }

    @NotNull
    public final Set<Name> invoke() {
        return C19299w.m68842n((Iterable) this.$classNames.invoke());
    }
}
