package com.tinder.analytics;

import com.tinder.domain.common.usecase.ObservableResultUseCase;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.tindergold.p426a.C16921j;
import com.tinder.tinderplus.analytics.C16939e;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/analytics/AddSkuOfferedEvents;", "Lcom/tinder/domain/common/usecase/ObservableResultUseCase;", "", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "addPlusSkuOfferedEvent", "Lcom/tinder/tinderplus/analytics/AddPlusSkuOfferedEvent;", "addGoldSkuOfferedEvent", "Lcom/tinder/tindergold/analytics/AddGoldSkuOfferedEvent;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/tinderplus/analytics/AddPlusSkuOfferedEvent;Lcom/tinder/tindergold/analytics/AddGoldSkuOfferedEvent;)V", "execute", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.a */
public final class C7311a implements ObservableResultUseCase<C15813i> {
    /* renamed from: a */
    private final OfferRepository f26426a;
    /* renamed from: b */
    private final C16939e f26427b;
    /* renamed from: c */
    private final C16921j f26428c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.a$a */
    static final class C7988a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C7311a f28598a;

        C7988a(C7311a c7311a) {
            this.f28598a = c7311a;
        }

        public /* synthetic */ Object call(Object obj) {
            m33864a((Void) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m33864a(Void voidR) {
            this.f28598a.f26427b.execute();
            this.f28598a.f26428c.execute();
        }
    }

    @Inject
    public C7311a(@NotNull OfferRepository offerRepository, @NotNull C16939e c16939e, @NotNull C16921j c16921j) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(c16939e, "addPlusSkuOfferedEvent");
        C2668g.b(c16921j, "addGoldSkuOfferedEvent");
        this.f26426a = offerRepository;
        this.f26427b = c16939e;
        this.f26428c = c16921j;
    }

    @NotNull
    public Observable<C15813i> execute() {
        Observable<C15813i> k = this.f26426a.observeOfferUpdates().k(new C7988a(this));
        C2668g.a(k, "offerRepository.observeO…ecute()\n                }");
        return k;
    }
}
