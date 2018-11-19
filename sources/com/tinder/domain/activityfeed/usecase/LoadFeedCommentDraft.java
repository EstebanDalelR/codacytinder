package com.tinder.domain.activityfeed.usecase;

import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.feed.DraftRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/activityfeed/usecase/LoadFeedCommentDraft;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "Lcom/tinder/domain/activityfeed/usecase/LoadFeedCommentDraft$Request;", "", "draftRepository", "Lcom/tinder/domain/feed/DraftRepository;", "(Lcom/tinder/domain/feed/DraftRepository;)V", "execute", "Lrx/Single;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadFeedCommentDraft implements SingleUseCase<Request, String> {
    private final DraftRepository draftRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/activityfeed/usecase/LoadFeedCommentDraft$Request;", "", "feedItemId", "", "carouselItemId", "(Ljava/lang/String;Ljava/lang/String;)V", "getCarouselItemId", "()Ljava/lang/String;", "getFeedItemId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @Nullable
        private final String carouselItemId;
        @NotNull
        private final String feedItemId;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.feedItemId;
            }
            if ((i & 2) != 0) {
                str2 = request.carouselItemId;
            }
            return request.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.feedItemId;
        }

        @Nullable
        public final String component2() {
            return this.carouselItemId;
        }

        @NotNull
        public final Request copy(@NotNull String str, @Nullable String str2) {
            C2668g.b(str, "feedItemId");
            return new Request(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.feedItemId, request.feedItemId) && C2668g.a(this.carouselItemId, request.carouselItemId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.feedItemId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.carouselItemId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(feedItemId=");
            stringBuilder.append(this.feedItemId);
            stringBuilder.append(", carouselItemId=");
            stringBuilder.append(this.carouselItemId);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @Nullable String str2) {
            C2668g.b(str, "feedItemId");
            this.feedItemId = str;
            this.carouselItemId = str2;
        }

        @NotNull
        public final String getFeedItemId() {
            return this.feedItemId;
        }

        @Nullable
        public final String getCarouselItemId() {
            return this.carouselItemId;
        }
    }

    @Inject
    public LoadFeedCommentDraft(@NotNull DraftRepository draftRepository) {
        C2668g.b(draftRepository, "draftRepository");
        this.draftRepository = draftRepository;
    }

    @NotNull
    public Single<String> execute(@NotNull Request request) {
        C2668g.b(request, "request");
        return this.draftRepository.loadDraft(request.getFeedItemId(), request.getCarouselItemId());
    }
}
