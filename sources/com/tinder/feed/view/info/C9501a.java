package com.tinder.feed.view.info;

import com.tinder.api.ManagerWebServices;
import com.tinder.feed.view.model.ActivityFeedViewModel.Attribution;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006#"}, d2 = {"Lcom/tinder/feed/view/info/FeedInfoModel;", "", "id", "", "userId", "matchId", "matchName", "avatarUrl", "attribution", "Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "infoDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;Ljava/lang/String;)V", "getAttribution", "()Lcom/tinder/feed/view/model/ActivityFeedViewModel$Attribution;", "getAvatarUrl", "()Ljava/lang/String;", "getId", "getInfoDetail", "getMatchId", "getMatchName", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.info.a */
public final class C9501a {
    @NotNull
    /* renamed from: a */
    private final String f31832a;
    @NotNull
    /* renamed from: b */
    private final String f31833b;
    @NotNull
    /* renamed from: c */
    private final String f31834c;
    @NotNull
    /* renamed from: d */
    private final String f31835d;
    @NotNull
    /* renamed from: e */
    private final String f31836e;
    @NotNull
    /* renamed from: f */
    private final Attribution f31837f;
    @NotNull
    /* renamed from: g */
    private final String f31838g;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9501a) {
                C9501a c9501a = (C9501a) obj;
                if (C2668g.a(this.f31832a, c9501a.f31832a) && C2668g.a(this.f31833b, c9501a.f31833b) && C2668g.a(this.f31834c, c9501a.f31834c) && C2668g.a(this.f31835d, c9501a.f31835d) && C2668g.a(this.f31836e, c9501a.f31836e) && C2668g.a(this.f31837f, c9501a.f31837f) && C2668g.a(this.f31838g, c9501a.f31838g)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31832a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31833b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f31834c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f31835d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f31836e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Attribution attribution = this.f31837f;
        hashCode = (hashCode + (attribution != null ? attribution.hashCode() : 0)) * 31;
        str2 = this.f31838g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedInfoModel(id=");
        stringBuilder.append(this.f31832a);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.f31833b);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.f31834c);
        stringBuilder.append(", matchName=");
        stringBuilder.append(this.f31835d);
        stringBuilder.append(", avatarUrl=");
        stringBuilder.append(this.f31836e);
        stringBuilder.append(", attribution=");
        stringBuilder.append(this.f31837f);
        stringBuilder.append(", infoDetail=");
        stringBuilder.append(this.f31838g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9501a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Attribution attribution, @NotNull String str6) {
        C2668g.b(str, "id");
        C2668g.b(str2, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(str3, "matchId");
        C2668g.b(str4, "matchName");
        C2668g.b(str5, "avatarUrl");
        C2668g.b(attribution, "attribution");
        C2668g.b(str6, "infoDetail");
        this.f31832a = str;
        this.f31833b = str2;
        this.f31834c = str3;
        this.f31835d = str4;
        this.f31836e = str5;
        this.f31837f = attribution;
        this.f31838g = str6;
    }

    @NotNull
    /* renamed from: a */
    public final String m39744a() {
        return this.f31832a;
    }

    @NotNull
    /* renamed from: b */
    public final String m39745b() {
        return this.f31833b;
    }

    @NotNull
    /* renamed from: c */
    public final String m39746c() {
        return this.f31834c;
    }

    @NotNull
    /* renamed from: d */
    public final String m39747d() {
        return this.f31835d;
    }

    @NotNull
    /* renamed from: e */
    public final String m39748e() {
        return this.f31836e;
    }

    @NotNull
    /* renamed from: f */
    public final Attribution m39749f() {
        return this.f31837f;
    }

    @NotNull
    /* renamed from: g */
    public final String m39750g() {
        return this.f31838g;
    }
}
