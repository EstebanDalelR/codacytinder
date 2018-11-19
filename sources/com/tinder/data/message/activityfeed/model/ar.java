package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.MessageActivityFeedItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/MessageActivityFeedItem;", "Lcom/tinder/data/model/activityfeed/MessageActivityFeedItemModel;", "messageId", "", "activityFeedItemId", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getMessageId", "activity_feed_item_id", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "message_id", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
final class ar implements MessageActivityFeedItemModel {
    @NotNull
    /* renamed from: a */
    private final String f35302a;
    @NotNull
    /* renamed from: b */
    private final String f35303b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ar) {
                ar arVar = (ar) obj;
                if (C2668g.a(this.f35302a, arVar.f35302a) && C2668g.a(this.f35303b, arVar.f35303b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35302a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35303b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageActivityFeedItem(messageId=");
        stringBuilder.append(this.f35302a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35303b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ar(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "messageId");
        C2668g.b(str2, "activityFeedItemId");
        this.f35302a = str;
        this.f35303b = str2;
    }

    @NotNull
    public String message_id() {
        return this.f35302a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35303b;
    }
}
