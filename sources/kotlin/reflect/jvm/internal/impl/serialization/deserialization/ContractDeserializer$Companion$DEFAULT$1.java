package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ContractDeserializer$Companion$DEFAULT$1 implements ContractDeserializer {
    @Nullable
    public Pair deserializeContractFromFunction(@NotNull Function function, @NotNull FunctionDescriptor functionDescriptor, @NotNull TypeTable typeTable, @NotNull TypeDeserializer typeDeserializer) {
        C2668g.b(function, "proto");
        C2668g.b(functionDescriptor, "ownerFunction");
        C2668g.b(typeTable, "typeTable");
        C2668g.b(typeDeserializer, "typeDeserializer");
        return null;
    }

    ContractDeserializer$Companion$DEFAULT$1() {
    }
}
