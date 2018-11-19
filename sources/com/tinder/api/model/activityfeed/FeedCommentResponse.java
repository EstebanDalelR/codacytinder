package com.tinder.api.model.activityfeed;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.response.v2.ResponseMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/model/activityfeed/FeedCommentResponse;", "", "meta", "Lcom/tinder/api/response/v2/ResponseMeta;", "data", "Lcom/tinder/api/model/activityfeed/FeedCommentResponse$Data;", "(Lcom/tinder/api/response/v2/ResponseMeta;Lcom/tinder/api/model/activityfeed/FeedCommentResponse$Data;)V", "getData", "()Lcom/tinder/api/model/activityfeed/FeedCommentResponse$Data;", "getMeta", "()Lcom/tinder/api/response/v2/ResponseMeta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Data", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FeedCommentResponse {
    @NotNull
    private final Data data;
    @NotNull
    private final ResponseMeta meta;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/model/activityfeed/FeedCommentResponse$Data;", "", "comment", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedComment;", "(Lcom/tinder/api/model/activityfeed/ApiActivityFeedComment;)V", "getComment", "()Lcom/tinder/api/model/activityfeed/ApiActivityFeedComment;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Data {
        @NotNull
        private final ApiActivityFeedComment comment;

        @NotNull
        public static /* synthetic */ Data copy$default(Data data, ApiActivityFeedComment apiActivityFeedComment, int i, Object obj) {
            if ((i & 1) != 0) {
                apiActivityFeedComment = data.comment;
            }
            return data.copy(apiActivityFeedComment);
        }

        @NotNull
        public final ApiActivityFeedComment component1() {
            return this.comment;
        }

        @NotNull
        public final Data copy(@NotNull ApiActivityFeedComment apiActivityFeedComment) {
            C2668g.b(apiActivityFeedComment, "comment");
            return new Data(apiActivityFeedComment);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Data) {
                    if (C2668g.a(this.comment, ((Data) obj).comment)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ApiActivityFeedComment apiActivityFeedComment = this.comment;
            return apiActivityFeedComment != null ? apiActivityFeedComment.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(comment=");
            stringBuilder.append(this.comment);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Data(@NotNull ApiActivityFeedComment apiActivityFeedComment) {
            C2668g.b(apiActivityFeedComment, "comment");
            this.comment = apiActivityFeedComment;
        }

        @NotNull
        public final ApiActivityFeedComment getComment() {
            return this.comment;
        }
    }

    @NotNull
    public static /* synthetic */ FeedCommentResponse copy$default(FeedCommentResponse feedCommentResponse, ResponseMeta responseMeta, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            responseMeta = feedCommentResponse.meta;
        }
        if ((i & 2) != 0) {
            data = feedCommentResponse.data;
        }
        return feedCommentResponse.copy(responseMeta, data);
    }

    @NotNull
    public final ResponseMeta component1() {
        return this.meta;
    }

    @NotNull
    public final Data component2() {
        return this.data;
    }

    @NotNull
    public final FeedCommentResponse copy(@NotNull ResponseMeta responseMeta, @NotNull Data data) {
        C2668g.b(responseMeta, ManagerWebServices.PARAM_META);
        C2668g.b(data, ManagerWebServices.FB_DATA);
        return new FeedCommentResponse(responseMeta, data);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedCommentResponse) {
                FeedCommentResponse feedCommentResponse = (FeedCommentResponse) obj;
                if (C2668g.a(this.meta, feedCommentResponse.meta) && C2668g.a(this.data, feedCommentResponse.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ResponseMeta responseMeta = this.meta;
        int i = 0;
        int hashCode = (responseMeta != null ? responseMeta.hashCode() : 0) * 31;
        Data data = this.data;
        if (data != null) {
            i = data.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedCommentResponse(meta=");
        stringBuilder.append(this.meta);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedCommentResponse(@NotNull ResponseMeta responseMeta, @NotNull Data data) {
        C2668g.b(responseMeta, ManagerWebServices.PARAM_META);
        C2668g.b(data, ManagerWebServices.FB_DATA);
        this.meta = responseMeta;
        this.data = data;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final ResponseMeta getMeta() {
        return this.meta;
    }
}
