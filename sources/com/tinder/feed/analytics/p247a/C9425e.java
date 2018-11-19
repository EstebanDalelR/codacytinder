package com.tinder.feed.analytics.p247a;

import com.tinder.feed.analytics.ActivityType;
import com.tinder.overflow.analytics.AnalyticsMatchAttribution;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u001aJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0016HÆ\u0003J\t\u0010:\u001a\u00020\u0016HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00102J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00102J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010D\u001a\u0004\u0018\u00010\u0010HÆ\u0003J¼\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0016HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00103\u001a\u0004\b4\u00102¨\u0006L"}, d2 = {"Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "", "feedItemId", "", "activityId", "activityType", "Lcom/tinder/feed/analytics/ActivityType;", "timeSinceActivityPosted", "", "otherId", "matchId", "attribution", "Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;", "distanceInMiles", "", "teaser1", "Lcom/tinder/feed/analytics/factory/Teaser;", "teaser2", "activityCaption", "Lcom/tinder/feed/analytics/factory/ActivityCaption;", "mediaId", "mediaPosition", "", "mediaAvailable", "message", "timeSinceMessageSent", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/feed/analytics/ActivityType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;Ljava/lang/Float;Lcom/tinder/feed/analytics/factory/Teaser;Lcom/tinder/feed/analytics/factory/Teaser;Lcom/tinder/feed/analytics/factory/ActivityCaption;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;)V", "getActivityCaption", "()Lcom/tinder/feed/analytics/factory/ActivityCaption;", "getActivityId", "()Ljava/lang/String;", "getActivityType", "()Lcom/tinder/feed/analytics/ActivityType;", "getAttribution", "()Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;", "getDistanceInMiles", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFeedItemId", "getMatchId", "getMediaAvailable", "()I", "getMediaId", "getMediaPosition", "getMessage", "getOtherId", "getTeaser1", "()Lcom/tinder/feed/analytics/factory/Teaser;", "getTeaser2", "getTimeSinceActivityPosted", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTimeSinceMessageSent", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/feed/analytics/ActivityType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/overflow/analytics/AnalyticsMatchAttribution;Ljava/lang/Float;Lcom/tinder/feed/analytics/factory/Teaser;Lcom/tinder/feed/analytics/factory/Teaser;Lcom/tinder/feed/analytics/factory/ActivityCaption;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;)Lcom/tinder/feed/analytics/factory/FeedViewAndInteractCommonProperties;", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.a.e */
public final class C9425e {
    @NotNull
    /* renamed from: a */
    private final String f31577a;
    @NotNull
    /* renamed from: b */
    private final String f31578b;
    @NotNull
    /* renamed from: c */
    private final ActivityType f31579c;
    @Nullable
    /* renamed from: d */
    private final Long f31580d;
    @NotNull
    /* renamed from: e */
    private final String f31581e;
    @NotNull
    /* renamed from: f */
    private final String f31582f;
    @NotNull
    /* renamed from: g */
    private final AnalyticsMatchAttribution f31583g;
    @Nullable
    /* renamed from: h */
    private final Float f31584h;
    @Nullable
    /* renamed from: i */
    private final C9431m f31585i;
    @Nullable
    /* renamed from: j */
    private final C9431m f31586j;
    @Nullable
    /* renamed from: k */
    private final C9422a f31587k;
    @NotNull
    /* renamed from: l */
    private final String f31588l;
    /* renamed from: m */
    private final int f31589m;
    /* renamed from: n */
    private final int f31590n;
    @Nullable
    /* renamed from: o */
    private final String f31591o;
    @Nullable
    /* renamed from: p */
    private final Long f31592p;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9425e) {
            C9425e c9425e = (C9425e) obj;
            if (C2668g.a(this.f31577a, c9425e.f31577a) && C2668g.a(this.f31578b, c9425e.f31578b) && C2668g.a(this.f31579c, c9425e.f31579c) && C2668g.a(this.f31580d, c9425e.f31580d) && C2668g.a(this.f31581e, c9425e.f31581e) && C2668g.a(this.f31582f, c9425e.f31582f) && C2668g.a(this.f31583g, c9425e.f31583g) && C2668g.a(this.f31584h, c9425e.f31584h) && C2668g.a(this.f31585i, c9425e.f31585i) && C2668g.a(this.f31586j, c9425e.f31586j) && C2668g.a(this.f31587k, c9425e.f31587k) && C2668g.a(this.f31588l, c9425e.f31588l)) {
                if ((this.f31589m == c9425e.f31589m ? 1 : null) != null) {
                    return (this.f31590n == c9425e.f31590n ? 1 : null) != null && C2668g.a(this.f31591o, c9425e.f31591o) && C2668g.a(this.f31592p, c9425e.f31592p);
                }
            }
        }
    }

    public int hashCode() {
        String str = this.f31577a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31578b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ActivityType activityType = this.f31579c;
        hashCode = (hashCode + (activityType != null ? activityType.hashCode() : 0)) * 31;
        Long l = this.f31580d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.f31581e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f31582f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AnalyticsMatchAttribution analyticsMatchAttribution = this.f31583g;
        hashCode = (hashCode + (analyticsMatchAttribution != null ? analyticsMatchAttribution.hashCode() : 0)) * 31;
        Float f = this.f31584h;
        hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        C9431m c9431m = this.f31585i;
        hashCode = (hashCode + (c9431m != null ? c9431m.hashCode() : 0)) * 31;
        c9431m = this.f31586j;
        hashCode = (hashCode + (c9431m != null ? c9431m.hashCode() : 0)) * 31;
        C9422a c9422a = this.f31587k;
        hashCode = (hashCode + (c9422a != null ? c9422a.hashCode() : 0)) * 31;
        str2 = this.f31588l;
        hashCode = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f31589m) * 31) + this.f31590n) * 31;
        str2 = this.f31591o;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        l = this.f31592p;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedViewAndInteractCommonProperties(feedItemId=");
        stringBuilder.append(this.f31577a);
        stringBuilder.append(", activityId=");
        stringBuilder.append(this.f31578b);
        stringBuilder.append(", activityType=");
        stringBuilder.append(this.f31579c);
        stringBuilder.append(", timeSinceActivityPosted=");
        stringBuilder.append(this.f31580d);
        stringBuilder.append(", otherId=");
        stringBuilder.append(this.f31581e);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.f31582f);
        stringBuilder.append(", attribution=");
        stringBuilder.append(this.f31583g);
        stringBuilder.append(", distanceInMiles=");
        stringBuilder.append(this.f31584h);
        stringBuilder.append(", teaser1=");
        stringBuilder.append(this.f31585i);
        stringBuilder.append(", teaser2=");
        stringBuilder.append(this.f31586j);
        stringBuilder.append(", activityCaption=");
        stringBuilder.append(this.f31587k);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.f31588l);
        stringBuilder.append(", mediaPosition=");
        stringBuilder.append(this.f31589m);
        stringBuilder.append(", mediaAvailable=");
        stringBuilder.append(this.f31590n);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f31591o);
        stringBuilder.append(", timeSinceMessageSent=");
        stringBuilder.append(this.f31592p);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9425e(@NotNull String str, @NotNull String str2, @NotNull ActivityType activityType, @Nullable Long l, @NotNull String str3, @NotNull String str4, @NotNull AnalyticsMatchAttribution analyticsMatchAttribution, @Nullable Float f, @Nullable C9431m c9431m, @Nullable C9431m c9431m2, @Nullable C9422a c9422a, @NotNull String str5, int i, int i2, @Nullable String str6, @Nullable Long l2) {
        String str7 = str;
        String str8 = str2;
        ActivityType activityType2 = activityType;
        String str9 = str3;
        String str10 = str4;
        AnalyticsMatchAttribution analyticsMatchAttribution2 = analyticsMatchAttribution;
        String str11 = str5;
        C2668g.b(str7, "feedItemId");
        C2668g.b(str8, "activityId");
        C2668g.b(activityType2, "activityType");
        C2668g.b(str9, "otherId");
        C2668g.b(str10, "matchId");
        C2668g.b(analyticsMatchAttribution2, "attribution");
        C2668g.b(str11, "mediaId");
        this.f31577a = str7;
        this.f31578b = str8;
        this.f31579c = activityType2;
        this.f31580d = l;
        this.f31581e = str9;
        this.f31582f = str10;
        this.f31583g = analyticsMatchAttribution2;
        this.f31584h = f;
        this.f31585i = c9431m;
        this.f31586j = c9431m2;
        this.f31587k = c9422a;
        this.f31588l = str11;
        this.f31589m = i;
        this.f31590n = i2;
        this.f31591o = str6;
        this.f31592p = l2;
    }

    @NotNull
    /* renamed from: a */
    public final String m39400a() {
        return this.f31577a;
    }

    @NotNull
    /* renamed from: b */
    public final String m39401b() {
        return this.f31578b;
    }

    @NotNull
    /* renamed from: c */
    public final ActivityType m39402c() {
        return this.f31579c;
    }

    @Nullable
    /* renamed from: d */
    public final Long m39403d() {
        return this.f31580d;
    }

    @NotNull
    /* renamed from: e */
    public final String m39404e() {
        return this.f31581e;
    }

    @NotNull
    /* renamed from: f */
    public final String m39405f() {
        return this.f31582f;
    }

    @NotNull
    /* renamed from: g */
    public final AnalyticsMatchAttribution m39406g() {
        return this.f31583g;
    }

    @Nullable
    /* renamed from: h */
    public final Float m39407h() {
        return this.f31584h;
    }

    @Nullable
    /* renamed from: i */
    public final C9431m m39408i() {
        return this.f31585i;
    }

    @Nullable
    /* renamed from: j */
    public final C9431m m39409j() {
        return this.f31586j;
    }

    @Nullable
    /* renamed from: k */
    public final C9422a m39410k() {
        return this.f31587k;
    }

    @NotNull
    /* renamed from: l */
    public final String m39411l() {
        return this.f31588l;
    }

    /* renamed from: m */
    public final int m39412m() {
        return this.f31589m;
    }

    /* renamed from: n */
    public final int m39413n() {
        return this.f31590n;
    }

    @Nullable
    /* renamed from: o */
    public final String m39414o() {
        return this.f31591o;
    }

    @Nullable
    /* renamed from: p */
    public final Long m39415p() {
        return this.f31592p;
    }
}
