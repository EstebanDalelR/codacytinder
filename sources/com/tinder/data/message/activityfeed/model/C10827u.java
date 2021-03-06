package com.tinder.data.message.activityfeed.model;

import com.tinder.data.message.activityfeed.ActivityEventType;
import com.tinder.data.model.activityfeed.ActivityFeedItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0006HÂ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J3\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedItem;", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemModel;", "id", "", "matchId", "activityEventType", "Lcom/tinder/data/message/activityfeed/ActivityEventType;", "activityId", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/data/message/activityfeed/ActivityEventType;Ljava/lang/String;)V", "activity_event_type", "activity_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "match_id", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.u */
final class C10827u implements ActivityFeedItemModel {
    /* renamed from: a */
    private final String f35407a;
    /* renamed from: b */
    private final String f35408b;
    /* renamed from: c */
    private final ActivityEventType f35409c;
    /* renamed from: d */
    private final String f35410d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10827u) {
                C10827u c10827u = (C10827u) obj;
                if (C2668g.a(this.f35407a, c10827u.f35407a) && C2668g.a(this.f35408b, c10827u.f35408b) && C2668g.a(this.f35409c, c10827u.f35409c) && C2668g.a(this.f35410d, c10827u.f35410d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35407a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35408b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ActivityEventType activityEventType = this.f35409c;
        hashCode = (hashCode + (activityEventType != null ? activityEventType.hashCode() : 0)) * 31;
        str2 = this.f35410d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedItem(id=");
        stringBuilder.append(this.f35407a);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.f35408b);
        stringBuilder.append(", activityEventType=");
        stringBuilder.append(this.f35409c);
        stringBuilder.append(", activityId=");
        stringBuilder.append(this.f35410d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10827u(@NotNull String str, @NotNull String str2, @NotNull ActivityEventType activityEventType, @Nullable String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "matchId");
        C2668g.b(activityEventType, "activityEventType");
        this.f35407a = str;
        this.f35408b = str2;
        this.f35409c = activityEventType;
        this.f35410d = str3;
    }

    @NotNull
    public String id() {
        return this.f35407a;
    }

    @NotNull
    public String match_id() {
        return this.f35408b;
    }

    @NotNull
    public ActivityEventType activity_event_type() {
        return this.f35409c;
    }

    @Nullable
    public String activity_id() {
        return this.f35410d;
    }
}
