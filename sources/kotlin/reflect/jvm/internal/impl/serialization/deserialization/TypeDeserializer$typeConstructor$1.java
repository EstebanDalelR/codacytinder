package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.sequences.C17625i;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;

final class TypeDeserializer$typeConstructor$1 extends Lambda implements Function1<Integer, ClassDescriptor> {
    final /* synthetic */ Type $proto;
    final /* synthetic */ TypeDeserializer this$0;

    TypeDeserializer$typeConstructor$1(TypeDeserializer typeDeserializer, Type type) {
        this.this$0 = typeDeserializer;
        this.$proto = type;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final ClassDescriptor invoke(int i) {
        i = NameResolverUtilKt.getClassId(this.this$0.f49043c.getNameResolver(), i);
        List g = C19155k.m68035g(C19155k.m68032e(C17625i.m64229a((Object) this.$proto, (Function1) new TypeDeserializer$typeConstructor$1$typeParametersCount$1(this)), TypeDeserializer$typeConstructor$1$typeParametersCount$2.INSTANCE));
        int i2 = C19155k.m68038i(C17625i.m64229a((Object) i, (Function1) TypeDeserializer$typeConstructor$1$classNestingLevel$1.INSTANCE));
        while (g.size() < i2) {
            g.add(Integer.valueOf(0));
        }
        return this.this$0.f49043c.getComponents().getNotFoundClasses().getClass(i, g);
    }
}
