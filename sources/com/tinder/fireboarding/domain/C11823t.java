package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.recs.domain.usecase.RecsFirstInserted;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/fireboarding/domain/ShouldShowNudgeAnimation;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "observeCompletedFireboardingLevels", "Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "recsFirstInserted", "Lcom/tinder/recs/domain/usecase/RecsFirstInserted;", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "(Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;Lcom/tinder/recs/domain/usecase/RecsFirstInserted;Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;)V", "execute", "Lio/reactivex/Single;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.t */
public final class C11823t implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final C11809n f38551a;
    /* renamed from: b */
    private final RecsFirstInserted f38552b;
    /* renamed from: c */
    private final C11811o f38553c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/tinder/fireboarding/domain/Level;", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "completedFireboardingLevels", "fireboardingConfig", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.t$a */
    static final class C11821a<T1, T2, R> implements BiFunction<Set<? extends Level>, C9566h, Pair<? extends Set<? extends Level>, ? extends C9566h>> {
        /* renamed from: a */
        public static final C11821a f38549a = new C11821a();

        C11821a() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47734a((Set) obj, (C9566h) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Set<Level>, C9566h> m47734a(@NotNull Set<? extends Level> set, @NotNull C9566h c9566h) {
            C2668g.b(set, "completedFireboardingLevels");
            C2668g.b(c9566h, "fireboardingConfig");
            return new Pair(set, c9566h);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/tinder/fireboarding/domain/Level;", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.t$b */
    static final class C11822b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11822b f38550a = new C11822b();

        C11822b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m47735a((Pair) obj));
        }

        /* renamed from: a */
        public final boolean m47735a(@NotNull Pair<? extends Set<? extends Level>, C9566h> pair) {
            C2668g.b(pair, "it");
            return (!((Set) pair.a()).isEmpty() || ((C9566h) pair.b()).m39871a() == null) ? null : true;
        }
    }

    public C11823t(@NotNull C11809n c11809n, @NotNull RecsFirstInserted recsFirstInserted, @NotNull C11811o c11811o) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        C2668g.b(recsFirstInserted, "recsFirstInserted");
        C2668g.b(c11811o, "observeFireboardingConfig");
        this.f38551a = c11809n;
        this.f38552b = recsFirstInserted;
        this.f38553c = c11811o;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        C3960g<Boolean> a = this.f38552b.execute().a(C3957b.a(this.f38551a.execute().toFlowable(BackpressureStrategy.LATEST), this.f38553c.execute(), C11821a.f38549a).f(C11822b.f38550a).f());
        C2668g.a(a, "recsFirstInserted.execut…stOrError()\n            )");
        return a;
    }
}
