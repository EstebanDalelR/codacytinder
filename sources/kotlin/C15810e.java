package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, k = 5, mv = {1, 1, 10}, xi = 1, xs = "kotlin/LazyKt")
/* renamed from: kotlin.e */
class C15810e {
    @NotNull
    /* renamed from: a */
    public static final <T> Lazy<T> m59833a(@NotNull Function0<? extends T> function0) {
        C2668g.b(function0, "initializer");
        return new SynchronizedLazyImpl(function0, null, 2, null);
    }

    @NotNull
    /* renamed from: a */
    public static final <T> Lazy<T> m59832a(@NotNull LazyThreadSafetyMode lazyThreadSafetyMode, @NotNull Function0<? extends T> function0) {
        C2668g.b(lazyThreadSafetyMode, "mode");
        C2668g.b(function0, "initializer");
        switch (C15809d.f49014a[lazyThreadSafetyMode.ordinal()]) {
            case 1:
                return (Lazy) new SynchronizedLazyImpl(function0, null, 2, null);
            case 2:
                return (Lazy) new SafePublicationLazyImpl(function0);
            case 3:
                return (Lazy) new UnsafeLazyImpl(function0);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
