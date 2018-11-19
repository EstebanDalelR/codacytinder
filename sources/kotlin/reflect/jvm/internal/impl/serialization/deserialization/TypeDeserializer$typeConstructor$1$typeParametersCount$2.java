package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import org.jetbrains.annotations.NotNull;

final class TypeDeserializer$typeConstructor$1$typeParametersCount$2 extends Lambda implements Function1<Type, Integer> {
    public static final TypeDeserializer$typeConstructor$1$typeParametersCount$2 INSTANCE = new TypeDeserializer$typeConstructor$1$typeParametersCount$2();

    TypeDeserializer$typeConstructor$1$typeParametersCount$2() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Integer.valueOf(invoke((Type) obj));
    }

    public final int invoke(@NotNull Type type) {
        C2668g.b(type, "it");
        return type.getArgumentCount();
    }
}
