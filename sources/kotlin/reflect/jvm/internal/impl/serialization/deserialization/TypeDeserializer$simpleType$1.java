package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import org.jetbrains.annotations.NotNull;

final class TypeDeserializer$simpleType$1 extends Lambda implements Function1<Type, List<? extends Argument>> {
    final /* synthetic */ TypeDeserializer this$0;

    TypeDeserializer$simpleType$1(TypeDeserializer typeDeserializer) {
        this.this$0 = typeDeserializer;
        super(1);
    }

    @NotNull
    public final List<Argument> invoke(@NotNull Type type) {
        C2668g.b(type, "$receiver");
        List argumentList = type.getArgumentList();
        C2668g.a(argumentList, "argumentList");
        Collection collection = argumentList;
        type = ProtoTypeTableUtilKt.outerType(type, this.this$0.f49043c.getTypeTable());
        type = type != null ? invoke(type) : null;
        if (type == null) {
            type = C17554o.m64195a();
        }
        return C19299w.m68809b(collection, (Iterable) type);
    }
}
