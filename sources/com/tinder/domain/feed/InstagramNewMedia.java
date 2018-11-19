package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006'"}, d2 = {"Lcom/tinder/domain/feed/InstagramNewMedia;", "Lcom/tinder/domain/feed/ActivityEvent;", "userNumber", "", "timestamp", "id", "", "userId", "userName", "caption", "media", "", "Lcom/tinder/domain/feed/InstagramMedia;", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCaption", "()Ljava/lang/String;", "getId", "getMedia", "()Ljava/util/List;", "getTimestamp", "()J", "getUserId", "getUserName", "getUserNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InstagramNewMedia extends ActivityEvent {
    @NotNull
    private final String caption;
    @NotNull
    private final String id;
    @NotNull
    private final List<InstagramMedia> media;
    private final long timestamp;
    private final long userId;
    @NotNull
    private final String userName;
    private final long userNumber;

    @NotNull
    public static /* synthetic */ InstagramNewMedia copy$default(InstagramNewMedia instagramNewMedia, long j, long j2, String str, long j3, String str2, String str3, List list, int i, Object obj) {
        InstagramNewMedia instagramNewMedia2 = instagramNewMedia;
        return instagramNewMedia2.copy((i & 1) != 0 ? instagramNewMedia2.userNumber : j, (i & 2) != 0 ? instagramNewMedia2.getTimestamp() : j2, (i & 4) != 0 ? instagramNewMedia2.id : str, (i & 8) != 0 ? instagramNewMedia2.userId : j3, (i & 16) != 0 ? instagramNewMedia2.userName : str2, (i & 32) != 0 ? instagramNewMedia2.caption : str3, (i & 64) != 0 ? instagramNewMedia2.media : list);
    }

    public final long component1() {
        return this.userNumber;
    }

    public final long component2() {
        return getTimestamp();
    }

    @NotNull
    public final String component3() {
        return this.id;
    }

    public final long component4() {
        return this.userId;
    }

    @NotNull
    public final String component5() {
        return this.userName;
    }

    @NotNull
    public final String component6() {
        return this.caption;
    }

    @NotNull
    public final List<InstagramMedia> component7() {
        return this.media;
    }

    @NotNull
    public final InstagramNewMedia copy(long j, long j2, @NotNull String str, long j3, @NotNull String str2, @NotNull String str3, @NotNull List<InstagramMedia> list) {
        String str4 = str;
        C2668g.b(str4, "id");
        String str5 = str2;
        C2668g.b(str5, "userName");
        String str6 = str3;
        C2668g.b(str6, "caption");
        List<InstagramMedia> list2 = list;
        C2668g.b(list2, ManagerWebServices.PARAM_MEDIA);
        return new InstagramNewMedia(j, j2, str4, j3, str5, str6, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstagramNewMedia) {
            InstagramNewMedia instagramNewMedia = (InstagramNewMedia) obj;
            if ((this.userNumber == instagramNewMedia.userNumber ? 1 : null) != null) {
                if ((getTimestamp() == instagramNewMedia.getTimestamp() ? 1 : null) != null && C2668g.a(this.id, instagramNewMedia.id)) {
                    return ((this.userId > instagramNewMedia.userId ? 1 : (this.userId == instagramNewMedia.userId ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.userName, instagramNewMedia.userName) && C2668g.a(this.caption, instagramNewMedia.caption) && C2668g.a(this.media, instagramNewMedia.media);
                }
            }
        }
    }

    public int hashCode() {
        long j = this.userNumber;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long timestamp = getTimestamp();
        i = (i + ((int) (timestamp ^ (timestamp >>> 32)))) * 31;
        String str = this.id;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.userId;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.userName;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.caption;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.media;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramNewMedia(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(getTimestamp());
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", userName=");
        stringBuilder.append(this.userName);
        stringBuilder.append(", caption=");
        stringBuilder.append(this.caption);
        stringBuilder.append(", media=");
        stringBuilder.append(this.media);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getUserNumber() {
        return this.userNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getCaption() {
        return this.caption;
    }

    @NotNull
    public final List<InstagramMedia> getMedia() {
        return this.media;
    }

    public InstagramNewMedia(long j, long j2, @NotNull String str, long j3, @NotNull String str2, @NotNull String str3, @NotNull List<InstagramMedia> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "userName");
        C2668g.b(str3, "caption");
        C2668g.b(list, ManagerWebServices.PARAM_MEDIA);
        super();
        this.userNumber = j;
        this.timestamp = j2;
        this.id = str;
        this.userId = j3;
        this.userName = str2;
        this.caption = str3;
        this.media = list;
        if ((((Collection) this.media).isEmpty() ^ 1) == null) {
            throw new IllegalArgumentException("Cannot create InstagramNewMedia with empty media".toString());
        }
    }
}
