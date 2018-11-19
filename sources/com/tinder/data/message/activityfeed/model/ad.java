package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedSongModel.Select_activity_feed_songModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedSongByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ActivityFeedSongModel$Select_activity_feed_songModel;", "id", "", "name", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
final class ad implements Select_activity_feed_songModel {
    @NotNull
    /* renamed from: a */
    private final String f35267a;
    @NotNull
    /* renamed from: b */
    private final String f35268b;
    @NotNull
    /* renamed from: c */
    private final String f35269c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ad) {
                ad adVar = (ad) obj;
                if (C2668g.a(this.f35267a, adVar.f35267a) && C2668g.a(this.f35268b, adVar.f35268b) && C2668g.a(this.f35269c, adVar.f35269c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35267a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35268b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35269c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedSongByActivityFeedItemId(id=");
        stringBuilder.append(this.f35267a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f35268b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f35269c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ad(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(str3, "url");
        this.f35267a = str;
        this.f35268b = str2;
        this.f35269c = str3;
    }

    @NotNull
    public String id() {
        return this.f35267a;
    }

    @NotNull
    public String name() {
        return this.f35268b;
    }

    @NotNull
    public String url() {
        return this.f35269c;
    }
}
