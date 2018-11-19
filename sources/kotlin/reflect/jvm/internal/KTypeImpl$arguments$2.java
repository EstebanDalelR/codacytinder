package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C15838a;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KTypeImpl.WhenMappings;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"}, k = 3, mv = {1, 1, 10})
final class KTypeImpl$arguments$2 extends Lambda implements Function0<List<? extends C15838a>> {
    final /* synthetic */ KTypeImpl this$0;

    KTypeImpl$arguments$2(KTypeImpl kTypeImpl) {
        this.this$0 = kTypeImpl;
        super(0);
    }

    @NotNull
    public final List<C15838a> invoke() {
        List arguments = this.this$0.getType().getArguments();
        if (arguments.isEmpty()) {
            return C17554o.m64195a();
        }
        Lazy a = C15810e.m59832a(LazyThreadSafetyMode.PUBLICATION, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this));
        KProperty kProperty = KTypeImpl.$$delegatedProperties[3];
        Iterable<TypeProjection> iterable = arguments;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        int i = 0;
        for (TypeProjection typeProjection : iterable) {
            Object a2;
            int i2 = i + 1;
            if (typeProjection.isStarProjection()) {
                a2 = C15838a.f49035a.m59892a();
            } else {
                KotlinType type = typeProjection.getType();
                C2668g.a(type, "typeProjection.type");
                KTypeImpl kTypeImpl = new KTypeImpl(type, new KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1(i, this, a, kProperty));
                switch (WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()]) {
                    case 1:
                        a2 = C15838a.f49035a.m59893a(kTypeImpl);
                        break;
                    case 2:
                        a2 = C15838a.f49035a.m59894b(kTypeImpl);
                        break;
                    case 3:
                        a2 = C15838a.f49035a.m59895c(kTypeImpl);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(a2);
            i = i2;
        }
        return (List) arrayList;
    }
}
