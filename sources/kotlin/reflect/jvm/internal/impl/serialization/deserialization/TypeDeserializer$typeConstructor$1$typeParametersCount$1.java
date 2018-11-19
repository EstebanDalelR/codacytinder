package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TypeDeserializer$typeConstructor$1$typeParametersCount$1 extends Lambda implements Function1<Type, Type> {
    final /* synthetic */ TypeDeserializer$typeConstructor$1 this$0;

    TypeDeserializer$typeConstructor$1$typeParametersCount$1(TypeDeserializer$typeConstructor$1 typeDeserializer$typeConstructor$1) {
        this.this$0 = typeDeserializer$typeConstructor$1;
        super(1);
    }

    @Nullable
    public final Type invoke(@NotNull Type type) {
        C2668g.b(type, "it");
        return ProtoTypeTableUtilKt.outerType(type, this.this$0.this$0.f49043c.getTypeTable());
    }
}
