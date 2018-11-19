package kotlin.internal.p488a;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.internal.C15814b;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.internal.a.a */
public class C17560a extends C15814b {
    /* renamed from: a */
    public void mo13020a(@NotNull Throwable th, @NotNull Throwable th2) {
        C2668g.b(th, ManagerWebServices.PARAM_CAUSE);
        C2668g.b(th2, "exception");
        th.addSuppressed(th2);
    }
}
