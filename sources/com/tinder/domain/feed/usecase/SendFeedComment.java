package com.tinder.domain.feed.usecase;

import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.feed.ActivityFeedComment;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/feed/usecase/SendFeedComment;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "Lcom/tinder/domain/feed/usecase/SendFeedComment$Request;", "Lcom/tinder/domain/feed/ActivityFeedComment;", "feedRepository", "Lcom/tinder/domain/feed/FeedRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/feed/FeedRepository;Lkotlin/jvm/functions/Function0;)V", "execute", "Lrx/Single;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SendFeedComment implements SingleUseCase<Request, ActivityFeedComment> {
    private final Function0<DateTime> dateTimeProvider;
    private final FeedRepository feedRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/feed/usecase/SendFeedComment$Request;", "", "feedItemId", "", "comment", "carouselItemId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarouselItemId", "()Ljava/lang/String;", "getComment", "getFeedItemId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @Nullable
        private final String carouselItemId;
        @NotNull
        private final String comment;
        @NotNull
        private final String feedItemId;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.feedItemId;
            }
            if ((i & 2) != 0) {
                str2 = request.comment;
            }
            if ((i & 4) != 0) {
                str3 = request.carouselItemId;
            }
            return request.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.feedItemId;
        }

        @NotNull
        public final String component2() {
            return this.comment;
        }

        @Nullable
        public final String component3() {
            return this.carouselItemId;
        }

        @NotNull
        public final Request copy(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            C2668g.b(str, "feedItemId");
            C2668g.b(str2, "comment");
            return new Request(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.feedItemId, request.feedItemId) && C2668g.a(this.comment, request.comment) && C2668g.a(this.carouselItemId, request.carouselItemId)) {
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
            String str2 = this.comment;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.carouselItemId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(feedItemId=");
            stringBuilder.append(this.feedItemId);
            stringBuilder.append(", comment=");
            stringBuilder.append(this.comment);
            stringBuilder.append(", carouselItemId=");
            stringBuilder.append(this.carouselItemId);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            C2668g.b(str, "feedItemId");
            C2668g.b(str2, "comment");
            this.feedItemId = str;
            this.comment = str2;
            this.carouselItemId = str3;
        }

        @NotNull
        public final String getFeedItemId() {
            return this.feedItemId;
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        public /* synthetic */ Request(String str, String str2, String str3, int i, C15823e c15823e) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            this(str, str2, str3);
        }

        @Nullable
        public final String getCarouselItemId() {
            return this.carouselItemId;
        }
    }

    @Inject
    public SendFeedComment(@NotNull FeedRepository feedRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(feedRepository, "feedRepository");
        C2668g.b(function0, "dateTimeProvider");
        this.feedRepository = feedRepository;
        this.dateTimeProvider = function0;
    }

    @NotNull
    public Single<ActivityFeedComment> execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = Single.a(new SendFeedComment$execute$1(this, request)).a(new SendFeedComment$execute$2(this));
        C2668g.a(request, "Single.fromCallable {\n  ….addComment(it)\n        }");
        return request;
    }
}
