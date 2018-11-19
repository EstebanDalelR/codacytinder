package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.etl.event.ui;
import com.tinder.passport.p302c.C10039a;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import io.reactivex.C3959e;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsRewindEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/recs/analytics/AddRecsRewindEvent$AddRecsRewindEventRequest;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "passportInteractor", "Lcom/tinder/passport/interactor/PassportInteractor;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "rewindsAvailableRepository", "Lcom/tinder/recs/domain/repository/RewindsAvailableRepository;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/passport/interactor/PassportInteractor;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/recs/domain/repository/RewindsAvailableRepository;)V", "buildRecsRewindEvent", "Lcom/tinder/etl/event/RecsRewindEvent;", "request", "userHasActiveSubscription", "", "rewindsAvailable", "", "execute", "", "AddRecsRewindEventRequest", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddRecsRewindEvent implements VoidUseCase<AddRecsRewindEventRequest> {
    private final C2630h fireworks;
    private final C10039a passportInteractor;
    private final RewindsAvailableRepository rewindsAvailableRepository;
    private final SubscriptionProvider subscriptionProvider;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsRewindEvent$AddRecsRewindEventRequest;", "", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "swipeType", "Lcom/tinder/domain/recs/model/Swipe$Type;", "(Lcom/tinder/domain/recs/model/UserRec;Lcom/tinder/domain/recs/model/Swipe$Type;)V", "getSwipeType", "()Lcom/tinder/domain/recs/model/Swipe$Type;", "getUserRec", "()Lcom/tinder/domain/recs/model/UserRec;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class AddRecsRewindEventRequest {
        @NotNull
        private final Type swipeType;
        @NotNull
        private final UserRec userRec;

        @NotNull
        public static /* synthetic */ AddRecsRewindEventRequest copy$default(AddRecsRewindEventRequest addRecsRewindEventRequest, UserRec userRec, Type type, int i, Object obj) {
            if ((i & 1) != 0) {
                userRec = addRecsRewindEventRequest.userRec;
            }
            if ((i & 2) != 0) {
                type = addRecsRewindEventRequest.swipeType;
            }
            return addRecsRewindEventRequest.copy(userRec, type);
        }

        @NotNull
        public final UserRec component1() {
            return this.userRec;
        }

        @NotNull
        public final Type component2() {
            return this.swipeType;
        }

        @NotNull
        public final AddRecsRewindEventRequest copy(@NotNull UserRec userRec, @NotNull Type type) {
            C2668g.b(userRec, "userRec");
            C2668g.b(type, "swipeType");
            return new AddRecsRewindEventRequest(userRec, type);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddRecsRewindEventRequest) {
                    AddRecsRewindEventRequest addRecsRewindEventRequest = (AddRecsRewindEventRequest) obj;
                    if (C2668g.a(this.userRec, addRecsRewindEventRequest.userRec) && C2668g.a(this.swipeType, addRecsRewindEventRequest.swipeType)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            UserRec userRec = this.userRec;
            int i = 0;
            int hashCode = (userRec != null ? userRec.hashCode() : 0) * 31;
            Type type = this.swipeType;
            if (type != null) {
                i = type.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AddRecsRewindEventRequest(userRec=");
            stringBuilder.append(this.userRec);
            stringBuilder.append(", swipeType=");
            stringBuilder.append(this.swipeType);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public AddRecsRewindEventRequest(@NotNull UserRec userRec, @NotNull Type type) {
            C2668g.b(userRec, "userRec");
            C2668g.b(type, "swipeType");
            this.userRec = userRec;
            this.swipeType = type;
        }

        @NotNull
        public final UserRec getUserRec() {
            return this.userRec;
        }

        @NotNull
        public final Type getSwipeType() {
            return this.swipeType;
        }
    }

    @Inject
    public AddRecsRewindEvent(@NotNull C2630h c2630h, @NotNull C10039a c10039a, @NotNull SubscriptionProvider subscriptionProvider, @NotNull RewindsAvailableRepository rewindsAvailableRepository) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10039a, "passportInteractor");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(rewindsAvailableRepository, "rewindsAvailableRepository");
        this.fireworks = c2630h;
        this.passportInteractor = c10039a;
        this.subscriptionProvider = subscriptionProvider;
        this.rewindsAvailableRepository = rewindsAvailableRepository;
    }

    public void execute(@NotNull AddRecsRewindEventRequest addRecsRewindEventRequest) {
        C2668g.b(addRecsRewindEventRequest, "request");
        C3959e.zip(RxJavaInteropExtKt.toV2Observable(this.subscriptionProvider.observe()), this.rewindsAvailableRepository.observeRewindsAvailable().p(), AddRecsRewindEvent$execute$1.INSTANCE).firstOrError().d(new AddRecsRewindEvent$execute$2(this, addRecsRewindEventRequest)).b(C15756a.m59010b()).a(AddRecsRewindEvent$execute$3.INSTANCE, AddRecsRewindEvent$execute$4.INSTANCE);
    }

    private final ui buildRecsRewindEvent(AddRecsRewindEventRequest addRecsRewindEventRequest, boolean z, int i) {
        UserRec userRec = addRecsRewindEventRequest.getUserRec();
        Integer num = null;
        z = !z ? Integer.valueOf(i) : false;
        if (i > 0) {
            num = Integer.valueOf(-1);
        }
        boolean z2 = false;
        i = ui.a().a(Boolean.valueOf(userRec.isSuperLike())).b(Boolean.valueOf(addRecsRewindEventRequest.getSwipeType() == Type.LIKE)).a(userRec.getId()).c(Boolean.valueOf(userRec.isTraveling())).e(Boolean.valueOf(this.passportInteractor.c() != null));
        if (addRecsRewindEventRequest.getSwipeType() == Type.SUPERLIKE) {
            z2 = true;
        }
        addRecsRewindEventRequest = i.d(Boolean.valueOf(z2)).a((Number) z).b(num).a();
        C2668g.a(addRecsRewindEventRequest, "recsRewindEventBuilder.build()");
        return addRecsRewindEventRequest;
    }
}
