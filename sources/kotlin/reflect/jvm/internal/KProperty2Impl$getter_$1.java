package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KProperty2Impl.Getter;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "R", "invoke"}, k = 3, mv = {1, 1, 10})
final class KProperty2Impl$getter_$1 extends Lambda implements Function0<Getter<D, E, ? extends R>> {
    final /* synthetic */ KProperty2Impl this$0;

    KProperty2Impl$getter_$1(KProperty2Impl kProperty2Impl) {
        this.this$0 = kProperty2Impl;
        super(0);
    }

    @NotNull
    public final Getter<D, E, R> invoke() {
        return new Getter(this.this$0);
    }
}
