package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.SimpleCompletableUseCase;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/fireboarding/domain/RemoveInjectedFireboardingRec;", "Lcom/tinder/domain/common/reactivex/usecase/SimpleCompletableUseCase;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "(Lcom/tinder/domain/recs/RecsEngine;)V", "execute", "Lio/reactivex/Completable;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.s */
public final class C11820s implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final RecsEngine f38548a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/recs/model/Rec;", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.s$a */
    static final class C11818a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11818a f38546a = new C11818a();

        C11818a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47731a((RecsUpdate) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Rec> m47731a(@NotNull RecsUpdate recsUpdate) {
            C2668g.b(recsUpdate, "recsUpdate");
            Collection arrayList = new ArrayList();
            for (Object next : recsUpdate.getCurrentRecs()) {
                if ((((Rec) next).getType() == RecType.FIREBOARDING ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "recsToRemove", "", "Lcom/tinder/domain/recs/model/Rec;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.s$b */
    static final class C11819b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11820s f38547a;

        C11819b(C11820s c11820s) {
            this.f38547a = c11820s;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47732a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Completable m47732a(@NotNull List<? extends Rec> list) {
            C2668g.b(list, "recsToRemove");
            return this.f38547a.f38548a.removeRecs(list);
        }
    }

    public C11820s(@NotNull RecsEngine recsEngine) {
        C2668g.b(recsEngine, "recsEngine");
        this.f38548a = recsEngine;
    }

    @NotNull
    public C3956a execute() {
        C3956a c = RxJavaInteropExtKt.toV2Observable(this.f38548a.observeRecsUpdates()).map(C11818a.f38546a).map(new C11819b(this)).firstOrError().c();
        C2668g.a(c, "recsEngine.observeRecsUp…         .toCompletable()");
        return c;
    }
}
