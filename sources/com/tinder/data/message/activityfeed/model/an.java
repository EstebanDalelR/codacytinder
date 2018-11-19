package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.InstagramNewMediaModel.Select_instagram_new_mediaModel;
import com.tinder.domain.feed.InstagramMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\t\u001a\u00020\u0003H\u0016J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÂ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÂ\u0003JW\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\b\u0010 \u001a\u00020\u0006H\u0016R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/InstagramNewMediaByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/InstagramNewMediaModel$Select_instagram_new_mediaModel;", "instagramMediaId", "", "instagramUserName", "userNumber", "", "instagramUserId", "timestamp", "caption", "media", "", "Lcom/tinder/domain/feed/InstagramMedia;", "(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "instagram_media_id", "instagram_user_id", "instagram_user_name", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class an implements Select_instagram_new_mediaModel {
    /* renamed from: a */
    private final String f35293a;
    /* renamed from: b */
    private final String f35294b;
    /* renamed from: c */
    private final long f35295c;
    /* renamed from: d */
    private final long f35296d;
    /* renamed from: e */
    private final long f35297e;
    /* renamed from: f */
    private final String f35298f;
    /* renamed from: g */
    private final List<InstagramMedia> f35299g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof an) {
            an anVar = (an) obj;
            if (C2668g.a(this.f35293a, anVar.f35293a) && C2668g.a(this.f35294b, anVar.f35294b)) {
                if ((this.f35295c == anVar.f35295c ? 1 : null) != null) {
                    if ((this.f35296d == anVar.f35296d ? 1 : null) != null) {
                        return ((this.f35297e > anVar.f35297e ? 1 : (this.f35297e == anVar.f35297e ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35298f, anVar.f35298f) && C2668g.a(this.f35299g, anVar.f35299g);
                    }
                }
            }
        }
    }

    public int hashCode() {
        String str = this.f35293a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35294b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.f35295c;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f35296d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f35297e;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        str2 = this.f35298f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f35299g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramNewMediaByActivityFeedItemId(instagramMediaId=");
        stringBuilder.append(this.f35293a);
        stringBuilder.append(", instagramUserName=");
        stringBuilder.append(this.f35294b);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35295c);
        stringBuilder.append(", instagramUserId=");
        stringBuilder.append(this.f35296d);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35297e);
        stringBuilder.append(", caption=");
        stringBuilder.append(this.f35298f);
        stringBuilder.append(", media=");
        stringBuilder.append(this.f35299g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public an(@NotNull String str, @NotNull String str2, long j, long j2, long j3, @NotNull String str3, @Nullable List<InstagramMedia> list) {
        C2668g.b(str, "instagramMediaId");
        C2668g.b(str2, "instagramUserName");
        C2668g.b(str3, "caption");
        this.f35293a = str;
        this.f35294b = str2;
        this.f35295c = j;
        this.f35296d = j2;
        this.f35297e = j3;
        this.f35298f = str3;
        this.f35299g = list;
    }

    @NotNull
    public String instagram_media_id() {
        return this.f35293a;
    }

    @NotNull
    public String instagram_user_name() {
        return this.f35294b;
    }

    public long user_number() {
        return this.f35295c;
    }

    public long instagram_user_id() {
        return this.f35296d;
    }

    public long timestamp() {
        return this.f35297e;
    }

    @NotNull
    public String caption() {
        return this.f35298f;
    }

    @Nullable
    public List<InstagramMedia> media() {
        return this.f35299g;
    }
}
