package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.recs.analytics.dedupe.RecsAllPhotosViewedDuplicateEventChecker;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsAllPhotosViewedEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/recs/analytics/AddRecsAllPhotosViewedEvent$RecsAllPhotosViewedEventRequest;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "duplicateEventsChecker", "Lcom/tinder/recs/analytics/dedupe/RecsAllPhotosViewedDuplicateEventChecker;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/recs/analytics/dedupe/RecsAllPhotosViewedDuplicateEventChecker;)V", "execute", "Lrx/Completable;", "request", "RecsAllPhotosViewedEventRequest", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddRecsAllPhotosViewedEvent implements CompletableUseCase<RecsAllPhotosViewedEventRequest> {
    private final RecsAllPhotosViewedDuplicateEventChecker duplicateEventsChecker;
    private final C2630h fireworks;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsAllPhotosViewedEvent$RecsAllPhotosViewedEventRequest;", "", "source", "Lcom/tinder/recs/analytics/RecsPhotoSource;", "photoCount", "", "userId", "", "isSuperLike", "", "(Lcom/tinder/recs/analytics/RecsPhotoSource;ILjava/lang/String;Z)V", "()Z", "getPhotoCount", "()I", "getSource", "()Lcom/tinder/recs/analytics/RecsPhotoSource;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class RecsAllPhotosViewedEventRequest {
        private final boolean isSuperLike;
        private final int photoCount;
        @NotNull
        private final RecsPhotoSource source;
        @NotNull
        private final String userId;

        @NotNull
        public static /* synthetic */ RecsAllPhotosViewedEventRequest copy$default(RecsAllPhotosViewedEventRequest recsAllPhotosViewedEventRequest, RecsPhotoSource recsPhotoSource, int i, String str, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                recsPhotoSource = recsAllPhotosViewedEventRequest.source;
            }
            if ((i2 & 2) != 0) {
                i = recsAllPhotosViewedEventRequest.photoCount;
            }
            if ((i2 & 4) != 0) {
                str = recsAllPhotosViewedEventRequest.userId;
            }
            if ((i2 & 8) != 0) {
                z = recsAllPhotosViewedEventRequest.isSuperLike;
            }
            return recsAllPhotosViewedEventRequest.copy(recsPhotoSource, i, str, z);
        }

        @NotNull
        public final RecsPhotoSource component1() {
            return this.source;
        }

        public final int component2() {
            return this.photoCount;
        }

        @NotNull
        public final String component3() {
            return this.userId;
        }

        public final boolean component4() {
            return this.isSuperLike;
        }

        @NotNull
        public final RecsAllPhotosViewedEventRequest copy(@NotNull RecsPhotoSource recsPhotoSource, int i, @NotNull String str, boolean z) {
            C2668g.b(recsPhotoSource, "source");
            C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
            return new RecsAllPhotosViewedEventRequest(recsPhotoSource, i, str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RecsAllPhotosViewedEventRequest) {
                RecsAllPhotosViewedEventRequest recsAllPhotosViewedEventRequest = (RecsAllPhotosViewedEventRequest) obj;
                if (C2668g.a(this.source, recsAllPhotosViewedEventRequest.source)) {
                    if ((this.photoCount == recsAllPhotosViewedEventRequest.photoCount ? 1 : null) != null && C2668g.a(this.userId, recsAllPhotosViewedEventRequest.userId)) {
                        if ((this.isSuperLike == recsAllPhotosViewedEventRequest.isSuperLike ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            RecsPhotoSource recsPhotoSource = this.source;
            int i = 0;
            int hashCode = (((recsPhotoSource != null ? recsPhotoSource.hashCode() : 0) * 31) + this.photoCount) * 31;
            String str = this.userId;
            if (str != null) {
                i = str.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.isSuperLike;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecsAllPhotosViewedEventRequest(source=");
            stringBuilder.append(this.source);
            stringBuilder.append(", photoCount=");
            stringBuilder.append(this.photoCount);
            stringBuilder.append(", userId=");
            stringBuilder.append(this.userId);
            stringBuilder.append(", isSuperLike=");
            stringBuilder.append(this.isSuperLike);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public RecsAllPhotosViewedEventRequest(@NotNull RecsPhotoSource recsPhotoSource, int i, @NotNull String str, boolean z) {
            C2668g.b(recsPhotoSource, "source");
            C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
            this.source = recsPhotoSource;
            this.photoCount = i;
            this.userId = str;
            this.isSuperLike = z;
        }

        @NotNull
        public final RecsPhotoSource getSource() {
            return this.source;
        }

        public final int getPhotoCount() {
            return this.photoCount;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public final boolean isSuperLike() {
            return this.isSuperLike;
        }
    }

    @Inject
    public AddRecsAllPhotosViewedEvent(@NotNull C2630h c2630h, @NotNull RecsAllPhotosViewedDuplicateEventChecker recsAllPhotosViewedDuplicateEventChecker) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(recsAllPhotosViewedDuplicateEventChecker, "duplicateEventsChecker");
        this.fireworks = c2630h;
        this.duplicateEventsChecker = recsAllPhotosViewedDuplicateEventChecker;
    }

    @NotNull
    public Completable execute(@NotNull RecsAllPhotosViewedEventRequest recsAllPhotosViewedEventRequest) {
        C2668g.b(recsAllPhotosViewedEventRequest, "request");
        recsAllPhotosViewedEventRequest = Completable.a(new AddRecsAllPhotosViewedEvent$execute$1(this, recsAllPhotosViewedEventRequest));
        C2668g.a(recsAllPhotosViewedEventRequest, "Completable.fromAction {…)\n            }\n        }");
        return recsAllPhotosViewedEventRequest;
    }
}
