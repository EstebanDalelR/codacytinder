package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedSongModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedSong;", "Lcom/tinder/data/model/activityfeed/ActivityFeedSongModel;", "id", "", "activityFeedItemId", "name", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getId", "getName", "getUrl", "activity_feed_item_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
final class ac implements ActivityFeedSongModel {
    @NotNull
    /* renamed from: a */
    private final String f35263a;
    @NotNull
    /* renamed from: b */
    private final String f35264b;
    @NotNull
    /* renamed from: c */
    private final String f35265c;
    @NotNull
    /* renamed from: d */
    private final String f35266d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ac) {
                ac acVar = (ac) obj;
                if (C2668g.a(this.f35263a, acVar.f35263a) && C2668g.a(this.f35264b, acVar.f35264b) && C2668g.a(this.f35265c, acVar.f35265c) && C2668g.a(this.f35266d, acVar.f35266d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35263a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35264b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35265c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35266d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedSong(id=");
        stringBuilder.append(this.f35263a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35264b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f35265c);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f35266d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ac(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C2668g.b(str, "id");
        C2668g.b(str2, "activityFeedItemId");
        C2668g.b(str3, "name");
        C2668g.b(str4, "url");
        this.f35263a = str;
        this.f35264b = str2;
        this.f35265c = str3;
        this.f35266d = str4;
    }

    @NotNull
    public String id() {
        return this.f35263a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35264b;
    }

    @NotNull
    public String name() {
        return this.f35265c;
    }

    @NotNull
    public String url() {
        return this.f35266d;
    }
}
