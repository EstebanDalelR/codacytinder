package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.recs.DeepLinkReferralInfo;
import com.tinder.recs.analytics.dedupe.RecsPhotoViewDuplicateEventChecker;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsPhotoViewEvent;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/recs/analytics/AddRecsPhotoViewEvent$RecsPhotoViewEventRequest;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "duplicateEventsChecker", "Lcom/tinder/recs/analytics/dedupe/RecsPhotoViewDuplicateEventChecker;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/recs/analytics/dedupe/RecsPhotoViewDuplicateEventChecker;)V", "execute", "Lrx/Completable;", "request", "RecsPhotoViewEventRequest", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddRecsPhotoViewEvent implements CompletableUseCase<RecsPhotoViewEventRequest> {
    private final RecsPhotoViewDuplicateEventChecker duplicateEventsChecker;
    private final C2630h fireworks;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tinder/recs/analytics/AddRecsPhotoViewEvent$RecsPhotoViewEventRequest;", "", "isSuperLike", "", "userId", "", "source", "Lcom/tinder/recs/analytics/RecsPhotoSource;", "photoId", "deepLinkReferralInfo", "Lcom/tinder/domain/recs/DeepLinkReferralInfo;", "(ZLjava/lang/String;Lcom/tinder/recs/analytics/RecsPhotoSource;Ljava/lang/String;Lcom/tinder/domain/recs/DeepLinkReferralInfo;)V", "getDeepLinkReferralInfo", "()Lcom/tinder/domain/recs/DeepLinkReferralInfo;", "()Z", "getPhotoId", "()Ljava/lang/String;", "getSource", "()Lcom/tinder/recs/analytics/RecsPhotoSource;", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class RecsPhotoViewEventRequest {
        @Nullable
        private final DeepLinkReferralInfo deepLinkReferralInfo;
        private final boolean isSuperLike;
        @NotNull
        private final String photoId;
        @NotNull
        private final RecsPhotoSource source;
        @NotNull
        private final String userId;

        @NotNull
        public static /* synthetic */ RecsPhotoViewEventRequest copy$default(RecsPhotoViewEventRequest recsPhotoViewEventRequest, boolean z, String str, RecsPhotoSource recsPhotoSource, String str2, DeepLinkReferralInfo deepLinkReferralInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                z = recsPhotoViewEventRequest.isSuperLike;
            }
            if ((i & 2) != 0) {
                str = recsPhotoViewEventRequest.userId;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                recsPhotoSource = recsPhotoViewEventRequest.source;
            }
            RecsPhotoSource recsPhotoSource2 = recsPhotoSource;
            if ((i & 8) != 0) {
                str2 = recsPhotoViewEventRequest.photoId;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                deepLinkReferralInfo = recsPhotoViewEventRequest.deepLinkReferralInfo;
            }
            return recsPhotoViewEventRequest.copy(z, str3, recsPhotoSource2, str4, deepLinkReferralInfo);
        }

        public final boolean component1() {
            return this.isSuperLike;
        }

        @NotNull
        public final String component2() {
            return this.userId;
        }

        @NotNull
        public final RecsPhotoSource component3() {
            return this.source;
        }

        @NotNull
        public final String component4() {
            return this.photoId;
        }

        @Nullable
        public final DeepLinkReferralInfo component5() {
            return this.deepLinkReferralInfo;
        }

        @NotNull
        public final RecsPhotoViewEventRequest copy(boolean z, @NotNull String str, @NotNull RecsPhotoSource recsPhotoSource, @NotNull String str2, @Nullable DeepLinkReferralInfo deepLinkReferralInfo) {
            C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
            C2668g.b(recsPhotoSource, "source");
            C2668g.b(str2, "photoId");
            return new RecsPhotoViewEventRequest(z, str, recsPhotoSource, str2, deepLinkReferralInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RecsPhotoViewEventRequest) {
                RecsPhotoViewEventRequest recsPhotoViewEventRequest = (RecsPhotoViewEventRequest) obj;
                return (this.isSuperLike == recsPhotoViewEventRequest.isSuperLike ? 1 : null) != null && C2668g.a(this.userId, recsPhotoViewEventRequest.userId) && C2668g.a(this.source, recsPhotoViewEventRequest.source) && C2668g.a(this.photoId, recsPhotoViewEventRequest.photoId) && C2668g.a(this.deepLinkReferralInfo, recsPhotoViewEventRequest.deepLinkReferralInfo);
            }
        }

        public int hashCode() {
            int i = this.isSuperLike;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            String str = this.userId;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            RecsPhotoSource recsPhotoSource = this.source;
            i = (i + (recsPhotoSource != null ? recsPhotoSource.hashCode() : 0)) * 31;
            str = this.photoId;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            DeepLinkReferralInfo deepLinkReferralInfo = this.deepLinkReferralInfo;
            if (deepLinkReferralInfo != null) {
                i2 = deepLinkReferralInfo.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecsPhotoViewEventRequest(isSuperLike=");
            stringBuilder.append(this.isSuperLike);
            stringBuilder.append(", userId=");
            stringBuilder.append(this.userId);
            stringBuilder.append(", source=");
            stringBuilder.append(this.source);
            stringBuilder.append(", photoId=");
            stringBuilder.append(this.photoId);
            stringBuilder.append(", deepLinkReferralInfo=");
            stringBuilder.append(this.deepLinkReferralInfo);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public RecsPhotoViewEventRequest(boolean z, @NotNull String str, @NotNull RecsPhotoSource recsPhotoSource, @NotNull String str2, @Nullable DeepLinkReferralInfo deepLinkReferralInfo) {
            C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
            C2668g.b(recsPhotoSource, "source");
            C2668g.b(str2, "photoId");
            this.isSuperLike = z;
            this.userId = str;
            this.source = recsPhotoSource;
            this.photoId = str2;
            this.deepLinkReferralInfo = deepLinkReferralInfo;
        }

        public final boolean isSuperLike() {
            return this.isSuperLike;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        public final RecsPhotoSource getSource() {
            return this.source;
        }

        @NotNull
        public final String getPhotoId() {
            return this.photoId;
        }

        @Nullable
        public final DeepLinkReferralInfo getDeepLinkReferralInfo() {
            return this.deepLinkReferralInfo;
        }
    }

    @Inject
    public AddRecsPhotoViewEvent(@NotNull C2630h c2630h, @NotNull RecsPhotoViewDuplicateEventChecker recsPhotoViewDuplicateEventChecker) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(recsPhotoViewDuplicateEventChecker, "duplicateEventsChecker");
        this.fireworks = c2630h;
        this.duplicateEventsChecker = recsPhotoViewDuplicateEventChecker;
    }

    @NotNull
    public Completable execute(@NotNull RecsPhotoViewEventRequest recsPhotoViewEventRequest) {
        C2668g.b(recsPhotoViewEventRequest, "request");
        recsPhotoViewEventRequest = Completable.a(new AddRecsPhotoViewEvent$execute$1(this, recsPhotoViewEventRequest));
        C2668g.a(recsPhotoViewEventRequest, "Completable.fromAction {…nt(event)\n        }\n    }");
        return recsPhotoViewEventRequest;
    }
}
