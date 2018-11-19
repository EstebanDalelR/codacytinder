package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedCommentModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0005HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÂ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedComment;", "Lcom/tinder/data/model/activityfeed/ActivityFeedCommentModel;", "id", "", "activityFeedItemId", "", "createdAt", "message", "metadataCarouselItemId", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "component5", "copy", "created_at", "equals", "", "other", "", "hashCode", "", "metadata_carousel_item_id", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.p */
final class C10823p implements ActivityFeedCommentModel {
    /* renamed from: a */
    private final long f35396a;
    /* renamed from: b */
    private final String f35397b;
    /* renamed from: c */
    private final long f35398c;
    /* renamed from: d */
    private final String f35399d;
    /* renamed from: e */
    private final String f35400e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10823p) {
            C10823p c10823p = (C10823p) obj;
            if ((this.f35396a == c10823p.f35396a ? 1 : null) != null && C2668g.a(this.f35397b, c10823p.f35397b)) {
                return ((this.f35398c > c10823p.f35398c ? 1 : (this.f35398c == c10823p.f35398c ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35399d, c10823p.f35399d) && C2668g.a(this.f35400e, c10823p.f35400e);
            }
        }
    }

    public int hashCode() {
        long j = this.f35396a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35397b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35398c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.f35399d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f35400e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedComment(id=");
        stringBuilder.append(this.f35396a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35397b);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.f35398c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f35399d);
        stringBuilder.append(", metadataCarouselItemId=");
        stringBuilder.append(this.f35400e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10823p(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, "message");
        C2668g.b(str3, "metadataCarouselItemId");
        this.f35396a = j;
        this.f35397b = str;
        this.f35398c = j2;
        this.f35399d = str2;
        this.f35400e = str3;
    }

    public long _id() {
        return this.f35396a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35397b;
    }

    public long created_at() {
        return this.f35398c;
    }

    @NotNull
    public String message() {
        return this.f35399d;
    }

    @NotNull
    public String metadata_carousel_item_id() {
        return this.f35400e;
    }
}
