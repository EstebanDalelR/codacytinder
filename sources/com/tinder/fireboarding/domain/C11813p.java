package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/domain/ObserveIsSuperLikeEnabled;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "observeCompletedFireboardingLevels", "Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "(Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;)V", "execute", "Lio/reactivex/Observable;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.p */
public final class C11813p implements ObservableResultUseCase<Boolean> {
    /* renamed from: a */
    private final C11809n f38539a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/fireboarding/domain/Level;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.p$a */
    static final class C11812a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11812a f38538a = new C11812a();

        C11812a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m47725a((Set) obj));
        }

        /* renamed from: a */
        public final boolean m47725a(@NotNull Set<? extends Level> set) {
            C2668g.b(set, "it");
            return set.contains(Level.SUPERLIKE);
        }
    }

    public C11813p(@NotNull C11809n c11809n) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        this.f38539a = c11809n;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> distinctUntilChanged = this.f38539a.execute().map(C11812a.f38538a).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "observeCompletedFireboar…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }
}
