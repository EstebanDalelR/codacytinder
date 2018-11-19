package com.tinder.domain.activityfeed.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.feed.DraftRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/activityfeed/usecase/SaveFeedCommentDraft;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/activityfeed/usecase/SaveFeedCommentDraft$Request;", "draftRepository", "Lcom/tinder/domain/feed/DraftRepository;", "(Lcom/tinder/domain/feed/DraftRepository;)V", "execute", "Lrx/Completable;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SaveFeedCommentDraft implements CompletableUseCase<Request> {
    private final DraftRepository draftRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/activityfeed/usecase/SaveFeedCommentDraft$Request;", "", "feedItemId", "", "carouselItemId", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarouselItemId", "()Ljava/lang/String;", "getFeedItemId", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @Nullable
        private final String carouselItemId;
        @NotNull
        private final String feedItemId;
        @NotNull
        private final String message;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.feedItemId;
            }
            if ((i & 2) != 0) {
                str2 = request.carouselItemId;
            }
            if ((i & 4) != 0) {
                str3 = request.message;
            }
            return request.copy(str, str2, str3);
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
        public final String component3() {
            return this.message;
        }

        @NotNull
        public final Request copy(@NotNull String str, @Nullable String str2, @NotNull String str3) {
            C2668g.b(str, "feedItemId");
            C2668g.b(str3, "message");
            return new Request(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.feedItemId, request.feedItemId) && C2668g.a(this.carouselItemId, request.carouselItemId) && C2668g.a(this.message, request.message)) {
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
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.message;
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
            stringBuilder.append(", message=");
            stringBuilder.append(this.message);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @Nullable String str2, @NotNull String str3) {
            C2668g.b(str, "feedItemId");
            C2668g.b(str3, "message");
            this.feedItemId = str;
            this.carouselItemId = str2;
            this.message = str3;
        }

        @Nullable
        public final String getCarouselItemId() {
            return this.carouselItemId;
        }

        @NotNull
        public final String getFeedItemId() {
            return this.feedItemId;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }
    }

    @Inject
    public SaveFeedCommentDraft(@NotNull DraftRepository draftRepository) {
        C2668g.b(draftRepository, "draftRepository");
        this.draftRepository = draftRepository;
    }

    @NotNull
    public Completable execute(@NotNull Request request) {
        C2668g.b(request, "request");
        return this.draftRepository.saveDraft(request.getFeedItemId(), request.getCarouselItemId(), request.getMessage());
    }
}
