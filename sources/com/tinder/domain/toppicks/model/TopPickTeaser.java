package com.tinder.domain.toppicks.model;

import com.tinder.domain.recs.model.Tag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "", "id", "", "expirationTime", "Lorg/joda/time/DateTime;", "photoUrl", "tags", "", "Lcom/tinder/domain/recs/model/Tag;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;)V", "getExpirationTime", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getPhotoUrl", "getTags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPickTeaser {
    @NotNull
    private final DateTime expirationTime;
    @NotNull
    private final String id;
    @NotNull
    private final String photoUrl;
    @NotNull
    private final List<Tag> tags;

    @NotNull
    public static /* synthetic */ TopPickTeaser copy$default(TopPickTeaser topPickTeaser, String str, DateTime dateTime, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topPickTeaser.id;
        }
        if ((i & 2) != 0) {
            dateTime = topPickTeaser.expirationTime;
        }
        if ((i & 4) != 0) {
            str2 = topPickTeaser.photoUrl;
        }
        if ((i & 8) != 0) {
            list = topPickTeaser.tags;
        }
        return topPickTeaser.copy(str, dateTime, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final DateTime component2() {
        return this.expirationTime;
    }

    @NotNull
    public final String component3() {
        return this.photoUrl;
    }

    @NotNull
    public final List<Tag> component4() {
        return this.tags;
    }

    @NotNull
    public final TopPickTeaser copy(@NotNull String str, @NotNull DateTime dateTime, @NotNull String str2, @NotNull List<Tag> list) {
        C2668g.b(str, "id");
        C2668g.b(dateTime, "expirationTime");
        C2668g.b(str2, "photoUrl");
        C2668g.b(list, "tags");
        return new TopPickTeaser(str, dateTime, str2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TopPickTeaser) {
                TopPickTeaser topPickTeaser = (TopPickTeaser) obj;
                if (C2668g.a(this.id, topPickTeaser.id) && C2668g.a(this.expirationTime, topPickTeaser.expirationTime) && C2668g.a(this.photoUrl, topPickTeaser.photoUrl) && C2668g.a(this.tags, topPickTeaser.tags)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DateTime dateTime = this.expirationTime;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        String str2 = this.photoUrl;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.tags;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPickTeaser(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", photoUrl=");
        stringBuilder.append(this.photoUrl);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.tags);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPickTeaser(@NotNull String str, @NotNull DateTime dateTime, @NotNull String str2, @NotNull List<Tag> list) {
        C2668g.b(str, "id");
        C2668g.b(dateTime, "expirationTime");
        C2668g.b(str2, "photoUrl");
        C2668g.b(list, "tags");
        this.id = str;
        this.expirationTime = dateTime;
        this.photoUrl = str2;
        this.tags = list;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final DateTime getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    @NotNull
    public final List<Tag> getTags() {
        return this.tags;
    }
}
