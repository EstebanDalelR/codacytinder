package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.domain.usecase.RecsFirstInserted;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/fireboarding/domain/InjectFireboardingRec;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/fireboarding/domain/Level;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "recsFirstInserted", "Lcom/tinder/recs/domain/usecase/RecsFirstInserted;", "injectionMargin", "", "(Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/recs/domain/usecase/RecsFirstInserted;I)V", "execute", "Lio/reactivex/Completable;", "request", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.j */
public final class C11804j implements CompletableUseCase<Level> {
    /* renamed from: a */
    private final RecsEngine f38528a;
    /* renamed from: b */
    private final RecsFirstInserted f38529b;
    /* renamed from: c */
    private final int f38530c;

    public C11804j(@NotNull RecsEngine recsEngine, @NotNull RecsFirstInserted recsFirstInserted, int i) {
        C2668g.b(recsEngine, "recsEngine");
        C2668g.b(recsFirstInserted, "recsFirstInserted");
        this.f38528a = recsEngine;
        this.f38529b = recsFirstInserted;
        this.f38530c = i;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m47721a((Level) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m47721a(@NotNull Level level) {
        C2668g.b(level, "request");
        level = this.f38529b.execute().b(RxJavaInteropExtKt.toV2Completable(this.f38528a.insertRec(new C11803i(level), this.f38530c)));
        C2668g.a(level, "recsFirstInserted.execut…mpletable()\n            )");
        return level;
    }
}
