package com.tinder.places.p156a;

import com.tinder.domain.common.reactivex.usecase.ObservableResultUseCase;
import com.tinder.domain.profile.model.Tutorial.PlacesToggleTooltip;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/badge/ShouldShowPlacesTooltip;", "Lcom/tinder/domain/common/reactivex/usecase/ObservableResultUseCase;", "", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "placesDiscoverySegmentAvailableProvider", "Lcom/tinder/places/badge/PlacesDiscoverySegmentAvailableProvider;", "isNewAccount", "Lcom/tinder/fireboarding/domain/IsNewAccount;", "swipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "(Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/places/badge/PlacesDiscoverySegmentAvailableProvider;Lcom/tinder/fireboarding/domain/IsNewAccount;Lcom/tinder/recs/domain/repository/SwipeCountRepository;)V", "execute", "Lio/reactivex/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.a.l */
public final class C7357l implements ObservableResultUseCase<Boolean> {
    /* renamed from: a */
    private final CheckTutorialViewed f26529a;
    /* renamed from: b */
    private final C7343b f26530b;
    /* renamed from: c */
    private final C11806k f26531c;
    /* renamed from: d */
    private final SwipeCountRepository f26532d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isAvailable", "isNew", "hasTutorial", "isSixty", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.l$a */
    static final class C7354a<T1, T2, T3, T4, R> implements Function4<Boolean, Boolean, Boolean, Boolean, Boolean> {
        /* renamed from: a */
        public static final C7354a f26526a = new C7354a();

        C7354a() {
        }

        /* renamed from: a */
        public final boolean m31331a(boolean z, boolean z2, boolean z3, boolean z4) {
            return (z && z3) ? z2 ? z4 : true : false;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            return Boolean.valueOf(m31331a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.l$b */
    static final class C7355b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C7355b f26527a = new C7355b();

        C7355b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m31332a((TutorialViewStatus) obj));
        }

        /* renamed from: a */
        public final boolean m31332a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Integer;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.l$c */
    static final class C7356c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C7356c f26528a = new C7356c();

        C7356c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m31333a((Integer) obj));
        }

        /* renamed from: a */
        public final boolean m31333a(@NotNull Integer num) {
            C2668g.b(num, "it");
            return num.intValue() == 60 ? true : null;
        }
    }

    @Inject
    public C7357l(@NotNull CheckTutorialViewed checkTutorialViewed, @NotNull C7343b c7343b, @NotNull C11806k c11806k, @NotNull SwipeCountRepository swipeCountRepository) {
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(c7343b, "placesDiscoverySegmentAvailableProvider");
        C2668g.b(c11806k, "isNewAccount");
        C2668g.b(swipeCountRepository, "swipeCountRepository");
        this.f26529a = checkTutorialViewed;
        this.f26530b = c7343b;
        this.f26531c = c11806k;
        this.f26532d = swipeCountRepository;
    }

    @NotNull
    public C3959e<Boolean> execute() {
        C3959e<Boolean> combineLatest = C3959e.combineLatest(this.f26530b.m31323a().p(), this.f26531c.execute().e(), this.f26529a.execute(PlacesToggleTooltip.INSTANCE).e(C7355b.f26527a).e(), this.f26532d.observeSwipeCount().map(C7356c.f26528a), C7354a.f26526a);
        C2668g.a(combineLatest, "Observable.combineLatest…\n            })\n        )");
        return combineLatest;
    }
}
