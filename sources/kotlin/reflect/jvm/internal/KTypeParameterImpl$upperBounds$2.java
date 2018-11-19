package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"}, k = 3, mv = {1, 1, 10})
final class KTypeParameterImpl$upperBounds$2 extends Lambda implements Function0<List<? extends KTypeImpl>> {
    final /* synthetic */ KTypeParameterImpl this$0;

    KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        this.this$0 = kTypeParameterImpl;
        super(0);
    }

    @NotNull
    public final List<KTypeImpl> invoke() {
        List upperBounds = this.this$0.getDescriptor().getUpperBounds();
        C2668g.a(upperBounds, "descriptor.upperBounds");
        Iterable<KotlinType> iterable = upperBounds;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (KotlinType kotlinType : iterable) {
            C2668g.a(kotlinType, "kotlinType");
            arrayList.add(new KTypeImpl(kotlinType, new KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1(this)));
        }
        return (List) arrayList;
    }
}
