package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class KClassImpl$Data$allNonStaticMembers$2 extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$allNonStaticMembers$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    @NotNull
    public final List<KCallableImpl<?>> invoke() {
        return C19299w.m68809b(this.this$0.getDeclaredNonStaticMembers(), (Iterable) this.this$0.getInheritedNonStaticMembers());
    }
}
