package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl.Setter;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "R", "invoke"}, k = 3, mv = {1, 1, 10})
final class KPropertyImpl$Setter$caller$2 extends Lambda implements Function0<FunctionCaller<?>> {
    final /* synthetic */ Setter this$0;

    KPropertyImpl$Setter$caller$2(Setter setter) {
        this.this$0 = setter;
        super(0);
    }

    @NotNull
    public final FunctionCaller<?> invoke() {
        return KPropertyImplKt.computeCallerForAccessor(this.this$0, false);
    }
}
