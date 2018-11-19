package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedCommentModel.Select_activity_feed_item_commentsModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÂ\u0003J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0003HÂ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedCommentByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel$Select_activity_feed_item_commentsModel;", "activityFeedItemId", "", "createdAt", "", "message", "metadataCarouselItemId", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "activity_feed_item_id", "component1", "component2", "component3", "component4", "copy", "created_at", "equals", "", "other", "", "hashCode", "", "metadata_carousel_item_id", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.q */
final class C10824q implements Select_activity_feed_item_commentsModel {
    /* renamed from: a */
    private final String f35401a;
    /* renamed from: b */
    private final long f35402b;
    /* renamed from: c */
    private final String f35403c;
    /* renamed from: d */
    private final String f35404d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10824q) {
            C10824q c10824q = (C10824q) obj;
            if (C2668g.a(this.f35401a, c10824q.f35401a)) {
                return ((this.f35402b > c10824q.f35402b ? 1 : (this.f35402b == c10824q.f35402b ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35403c, c10824q.f35403c) && C2668g.a(this.f35404d, c10824q.f35404d);
            }
        }
    }

    public int hashCode() {
        String str = this.f35401a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f35402b;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f35403c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35404d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedCommentByActivityFeedItemId(activityFeedItemId=");
        stringBuilder.append(this.f35401a);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.f35402b);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f35403c);
        stringBuilder.append(", metadataCarouselItemId=");
        stringBuilder.append(this.f35404d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10824q(@NotNull String str, long j, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, "message");
        C2668g.b(str3, "metadataCarouselItemId");
        this.f35401a = str;
        this.f35402b = j;
        this.f35403c = str2;
        this.f35404d = str3;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35401a;
    }

    public long created_at() {
        return this.f35402b;
    }

    @NotNull
    public String message() {
        return this.f35403c;
    }

    @NotNull
    public String metadata_carousel_item_id() {
        return this.f35404d;
    }
}
