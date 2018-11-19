package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/fireboarding/domain/ObserveProgressiveOnboarding;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "Lcom/tinder/fireboarding/domain/ProgressiveOnboarding;", "observeCompletedFireboardingLevels", "Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "completedLevelsProgressiveOnboardingAdapter", "Lcom/tinder/fireboarding/domain/CompletedLevelsProgressiveOnboardingAdapter;", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "(Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;Lcom/tinder/fireboarding/domain/CompletedLevelsProgressiveOnboardingAdapter;Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;)V", "execute", "Lio/reactivex/Single;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.q */
public final class C11816q implements SingleResultUseCase<ProgressiveOnboarding> {
    /* renamed from: a */
    private final C11809n f38542a;
    /* renamed from: b */
    private final C9562d f38543b;
    /* renamed from: c */
    private final C11811o f38544c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/fireboarding/domain/ProgressiveOnboarding;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.q$a */
    static final class C11815a<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11816q f38541a;

        C11815a(C11816q c11816q) {
            this.f38541a = c11816q;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47727a((C9566h) obj);
        }

        /* renamed from: a */
        public final C3960g<ProgressiveOnboarding> m47727a(@NotNull C9566h c9566h) {
            C2668g.b(c9566h, "it");
            if (c9566h.m39871a() == null) {
                return C3960g.a(ProgressiveOnboarding.NOT_IN_FIREBOARDING);
            }
            return this.f38541a.f38542a.execute().map(new Function<T, R>() {
                public /* synthetic */ Object apply(Object obj) {
                    return m47726a((Set) obj);
                }

                @NotNull
                /* renamed from: a */
                public final ProgressiveOnboarding m47726a(@NotNull Set<? extends Level> set) {
                    C2668g.b(set, "it");
                    return this.f38541a.f38543b.m39869a(set);
                }
            }).firstOrError();
        }
    }

    public C11816q(@NotNull C11809n c11809n, @NotNull C9562d c9562d, @NotNull C11811o c11811o) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        C2668g.b(c9562d, "completedLevelsProgressiveOnboardingAdapter");
        C2668g.b(c11811o, "observeFireboardingConfig");
        this.f38542a = c11809n;
        this.f38543b = c9562d;
        this.f38544c = c11811o;
    }

    @NotNull
    public C3960g<ProgressiveOnboarding> execute() {
        C3960g<ProgressiveOnboarding> a = this.f38544c.execute().f().a(new C11815a(this));
        C2668g.a(a, "observeFireboardingConfi…          }\n            }");
        return a;
    }
}
