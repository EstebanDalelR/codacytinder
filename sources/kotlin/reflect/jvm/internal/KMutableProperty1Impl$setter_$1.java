package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl.Setter;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "T", "R", "invoke"}, k = 3, mv = {1, 1, 10})
final class KMutableProperty1Impl$setter_$1 extends Lambda implements Function0<Setter<T, R>> {
    final /* synthetic */ KMutableProperty1Impl this$0;

    KMutableProperty1Impl$setter_$1(KMutableProperty1Impl kMutableProperty1Impl) {
        this.this$0 = kMutableProperty1Impl;
        super(0);
    }

    @NotNull
    public final Setter<T, R> invoke() {
        return new Setter(this.this$0);
    }
}
