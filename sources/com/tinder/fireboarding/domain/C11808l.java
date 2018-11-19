package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/domain/IsSuperlikeEnabled;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "observeCompletedFireboardingLevels", "Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "(Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;)V", "execute", "Lio/reactivex/Single;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.l */
public final class C11808l implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final C11809n f38534a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/fireboarding/domain/Level;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.l$a */
    static final class C11807a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11807a f38533a = new C11807a();

        C11807a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m47723a((Set) obj));
        }

        /* renamed from: a */
        public final boolean m47723a(@NotNull Set<? extends Level> set) {
            C2668g.b(set, "it");
            return set.contains(Level.SUPERLIKE);
        }
    }

    public C11808l(@NotNull C11809n c11809n) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        this.f38534a = c11809n;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        C3960g<Boolean> e = this.f38534a.execute().firstOrError().e(C11807a.f38533a);
        C2668g.a(e, "observeCompletedFireboar…ntains(Level.SUPERLIKE) }");
        return e;
    }
}
