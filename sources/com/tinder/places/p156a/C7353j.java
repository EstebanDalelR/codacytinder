package com.tinder.places.p156a;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.model.PlacesConfig;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/badge/ShouldShowPlacesBadge;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "placesDiscoverySegmentAvailableProvider", "Lcom/tinder/places/badge/PlacesDiscoverySegmentAvailableProvider;", "swipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "isNewAccount", "Lcom/tinder/fireboarding/domain/IsNewAccount;", "(Lcom/tinder/domain/places/PlacesConfigProvider;Lcom/tinder/places/badge/PlacesDiscoverySegmentAvailableProvider;Lcom/tinder/recs/domain/repository/SwipeCountRepository;Lcom/tinder/fireboarding/domain/IsNewAccount;)V", "execute", "Lio/reactivex/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.a.j */
public final class C7353j implements ObservableResultUseCase<Boolean> {
    /* renamed from: a */
    private final PlacesConfigProvider f26522a;
    /* renamed from: b */
    private final C7343b f26523b;
    /* renamed from: c */
    private final SwipeCountRepository f26524c;
    /* renamed from: d */
    private final C11806k f26525d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isAvailable", "isNew", "areNewPlacesAvailable", "isTen", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.j$a */
    static final class C7350a<T1, T2, T3, T4, R> implements Function4<Boolean, Boolean, Boolean, Boolean, Boolean> {
        /* renamed from: a */
        public static final C7350a f26519a = new C7350a();

        C7350a() {
        }

        /* renamed from: a */
        public final boolean m31328a(boolean z, boolean z2, boolean z3, boolean z4) {
            return z ? z2 ? z4 : z3 : false;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            return Boolean.valueOf(m31328a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/places/model/PlacesConfig;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.j$b */
    static final class C7351b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C7351b f26520a = new C7351b();

        C7351b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m31329a((PlacesConfig) obj));
        }

        /* renamed from: a */
        public final boolean m31329a(@NotNull PlacesConfig placesConfig) {
            C2668g.b(placesConfig, "it");
            return placesConfig.getNewPlacesAvailable();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Integer;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.j$c */
    static final class C7352c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C7352c f26521a = new C7352c();

        C7352c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m31330a((Integer) obj));
        }

        /* renamed from: a */
        public final boolean m31330a(@NotNull Integer num) {
            C2668g.b(num, "it");
            return num.intValue() == 10 ? true : null;
        }
    }

    @Inject
    public C7353j(@NotNull PlacesConfigProvider placesConfigProvider, @NotNull C7343b c7343b, @NotNull SwipeCountRepository swipeCountRepository, @NotNull C11806k c11806k) {
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        C2668g.b(c7343b, "placesDiscoverySegmentAvailableProvider");
        C2668g.b(swipeCountRepository, "swipeCountRepository");
        C2668g.b(c11806k, "isNewAccount");
        this.f26522a = placesConfigProvider;
        this.f26523b = c7343b;
        this.f26524c = swipeCountRepository;
        this.f26525d = c11806k;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> combineLatest = C3959e.combineLatest(this.f26523b.m31323a().p(), this.f26525d.execute().e(), RxJavaInteropExtKt.toV2Observable(this.f26522a.observe()).map(C7351b.f26520a), this.f26524c.observeSwipeCount().map(C7352c.f26521a), C7350a.f26519a);
        C2668g.a(combineLatest, "Observable.combineLatest…\n            })\n        )");
        return combineLatest;
    }
}
