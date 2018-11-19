package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.etl.event.lq;
import com.tinder.etl.event.lq.C9168a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/recs/analytics/AddNewMatchEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/recs/analytics/AddNewMatchEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "currentUserProvider", "Lcom/tinder/data/user/CurrentUserProvider;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/data/user/CurrentUserProvider;)V", "getCurrentUserProvider", "()Lcom/tinder/data/user/CurrentUserProvider;", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "createUserMatchEvent", "Lcom/tinder/etl/event/MatchNewEvent;", "match", "Lcom/tinder/api/model/common/ApiMatch;", "currentUserSuperlikedMatch", "", "execute", "Lrx/Completable;", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddNewMatchEvent implements CompletableUseCase<Request> {
    @NotNull
    private final CurrentUserProvider currentUserProvider;
    @NotNull
    private final C2630h fireworks;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/recs/analytics/AddNewMatchEvent$Request;", "", "ratingMatch", "Lcom/tinder/api/model/common/ApiMatch;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "(Lcom/tinder/api/model/common/ApiMatch;Lcom/tinder/domain/recs/model/Swipe;)V", "getRatingMatch", "()Lcom/tinder/api/model/common/ApiMatch;", "getSwipe", "()Lcom/tinder/domain/recs/model/Swipe;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final ApiMatch ratingMatch;
        @NotNull
        private final Swipe swipe;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, ApiMatch apiMatch, Swipe swipe, int i, Object obj) {
            if ((i & 1) != 0) {
                apiMatch = request.ratingMatch;
            }
            if ((i & 2) != 0) {
                swipe = request.swipe;
            }
            return request.copy(apiMatch, swipe);
        }

        @NotNull
        public final ApiMatch component1() {
            return this.ratingMatch;
        }

        @NotNull
        public final Swipe component2() {
            return this.swipe;
        }

        @NotNull
        public final Request copy(@NotNull ApiMatch apiMatch, @NotNull Swipe swipe) {
            C2668g.b(apiMatch, "ratingMatch");
            C2668g.b(swipe, "swipe");
            return new Request(apiMatch, swipe);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.ratingMatch, request.ratingMatch) && C2668g.a(this.swipe, request.swipe)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ApiMatch apiMatch = this.ratingMatch;
            int i = 0;
            int hashCode = (apiMatch != null ? apiMatch.hashCode() : 0) * 31;
            Swipe swipe = this.swipe;
            if (swipe != null) {
                i = swipe.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(ratingMatch=");
            stringBuilder.append(this.ratingMatch);
            stringBuilder.append(", swipe=");
            stringBuilder.append(this.swipe);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull ApiMatch apiMatch, @NotNull Swipe swipe) {
            C2668g.b(apiMatch, "ratingMatch");
            C2668g.b(swipe, "swipe");
            this.ratingMatch = apiMatch;
            this.swipe = swipe;
        }

        @NotNull
        public final ApiMatch getRatingMatch() {
            return this.ratingMatch;
        }

        @NotNull
        public final Swipe getSwipe() {
            return this.swipe;
        }
    }

    @Inject
    public AddNewMatchEvent(@NotNull C2630h c2630h, @NotNull CurrentUserProvider currentUserProvider) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(currentUserProvider, "currentUserProvider");
        this.fireworks = c2630h;
        this.currentUserProvider = currentUserProvider;
    }

    @NotNull
    public final C2630h getFireworks() {
        return this.fireworks;
    }

    @NotNull
    public final CurrentUserProvider getCurrentUserProvider() {
        return this.currentUserProvider;
    }

    @NotNull
    public Completable execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = Completable.a(new AddNewMatchEvent$execute$1(this, request));
        C2668g.a(request, "Completable.fromAction {…addEvent(event)\n        }");
        return request;
    }

    private final lq createUserMatchEvent(ApiMatch apiMatch) {
        boolean z = false;
        C9168a e = lq.a().a(apiMatch._id()).b(Boolean.valueOf(false)).c(Boolean.valueOf(currentUserSuperlikedMatch(apiMatch))).a(apiMatch.isSuperLike()).d(apiMatch.isBoostMatch()).e(apiMatch.isFastMatch());
        List participants = apiMatch.participants();
        if (participants != null) {
            String str = (String) C19299w.m68834i(participants);
            if (str != null) {
                e.b(str);
            }
        }
        Boolean isPlaceMatch = apiMatch.isPlaceMatch();
        if (isPlaceMatch != null) {
            z = isPlaceMatch.booleanValue();
        }
        if (!z) {
            apiMatch = null;
        }
        if (apiMatch != null) {
            apiMatch = apiMatch.place();
            if (apiMatch != null) {
                apiMatch = apiMatch.id();
                if (apiMatch != null) {
                    e.c(apiMatch);
                }
            }
        }
        apiMatch = e.a();
        C2668g.a(apiMatch, "builder.build()");
        return apiMatch;
    }

    private final boolean currentUserSuperlikedMatch(ApiMatch apiMatch) {
        ProfileUser profileUser = this.currentUserProvider.get();
        return C19296q.m68676a(profileUser != null ? profileUser.id() : null, apiMatch.superLiker(), false, 2, null);
    }
}
