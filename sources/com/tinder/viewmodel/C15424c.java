package com.tinder.viewmodel;

import android.graphics.drawable.Drawable;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/tinder/viewmodel/PlaceCardFrontViewModel;", "", "title", "", "expirationTime", "Lorg/joda/time/DateTime;", "viewed", "", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "totalVisitors", "", "newVisitors", "teasers", "", "(Ljava/lang/String;Lorg/joda/time/DateTime;ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "getExpirationTime", "()Lorg/joda/time/DateTime;", "getNewVisitors", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTeasers", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getTotalVisitors", "getViewed", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lorg/joda/time/DateTime;ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/tinder/viewmodel/PlaceCardFrontViewModel;", "equals", "other", "hashCode", "toString", "places_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.viewmodel.c */
public final class C15424c {
    @NotNull
    /* renamed from: a */
    private final String f47709a;
    @NotNull
    /* renamed from: b */
    private final DateTime f47710b;
    /* renamed from: c */
    private final boolean f47711c;
    @NotNull
    /* renamed from: d */
    private final Drawable f47712d;
    @Nullable
    /* renamed from: e */
    private final Integer f47713e;
    @Nullable
    /* renamed from: f */
    private final Integer f47714f;
    @Nullable
    /* renamed from: g */
    private final List<String> f47715g;

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C15424c m57819a(C15424c c15424c, String str, DateTime dateTime, boolean z, Drawable drawable, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c15424c.f47709a;
        }
        if ((i & 2) != 0) {
            dateTime = c15424c.f47710b;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 4) != 0) {
            z = c15424c.f47711c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            drawable = c15424c.f47712d;
        }
        Drawable drawable2 = drawable;
        if ((i & 16) != 0) {
            num = c15424c.f47713e;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = c15424c.f47714f;
        }
        Integer num4 = num2;
        if ((i & 64) != 0) {
            list = c15424c.f47715g;
        }
        return c15424c.m57820a(str, dateTime2, z2, drawable2, num3, num4, list);
    }

    @NotNull
    /* renamed from: a */
    public final C15424c m57820a(@NotNull String str, @NotNull DateTime dateTime, boolean z, @NotNull Drawable drawable, @Nullable Integer num, @Nullable Integer num2, @Nullable List<String> list) {
        String str2 = str;
        C2668g.b(str2, ManagerWebServices.PARAM_JOB_TITLE);
        DateTime dateTime2 = dateTime;
        C2668g.b(dateTime2, "expirationTime");
        Drawable drawable2 = drawable;
        C2668g.b(drawable2, "backgroundDrawable");
        return new C15424c(str2, dateTime2, z, drawable2, num, num2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15424c) {
            C15424c c15424c = (C15424c) obj;
            if (C2668g.a(this.f47709a, c15424c.f47709a) && C2668g.a(this.f47710b, c15424c.f47710b)) {
                return (this.f47711c == c15424c.f47711c ? 1 : null) != null && C2668g.a(this.f47712d, c15424c.f47712d) && C2668g.a(this.f47713e, c15424c.f47713e) && C2668g.a(this.f47714f, c15424c.f47714f) && C2668g.a(this.f47715g, c15424c.f47715g);
            }
        }
    }

    public int hashCode() {
        String str = this.f47709a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        DateTime dateTime = this.f47710b;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        int i2 = this.f47711c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Drawable drawable = this.f47712d;
        hashCode = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num = this.f47713e;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        num = this.f47714f;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        List list = this.f47715g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlaceCardFrontViewModel(title=");
        stringBuilder.append(this.f47709a);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.f47710b);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.f47711c);
        stringBuilder.append(", backgroundDrawable=");
        stringBuilder.append(this.f47712d);
        stringBuilder.append(", totalVisitors=");
        stringBuilder.append(this.f47713e);
        stringBuilder.append(", newVisitors=");
        stringBuilder.append(this.f47714f);
        stringBuilder.append(", teasers=");
        stringBuilder.append(this.f47715g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15424c(@NotNull String str, @NotNull DateTime dateTime, boolean z, @NotNull Drawable drawable, @Nullable Integer num, @Nullable Integer num2, @Nullable List<String> list) {
        C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(dateTime, "expirationTime");
        C2668g.b(drawable, "backgroundDrawable");
        this.f47709a = str;
        this.f47710b = dateTime;
        this.f47711c = z;
        this.f47712d = drawable;
        this.f47713e = num;
        this.f47714f = num2;
        this.f47715g = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m57821a() {
        return this.f47709a;
    }

    @NotNull
    /* renamed from: b */
    public final DateTime m57822b() {
        return this.f47710b;
    }

    /* renamed from: c */
    public final boolean m57823c() {
        return this.f47711c;
    }

    @NotNull
    /* renamed from: d */
    public final Drawable m57824d() {
        return this.f47712d;
    }

    public /* synthetic */ C15424c(String str, DateTime dateTime, boolean z, Drawable drawable, Integer num, Integer num2, List list, int i, C15823e c15823e) {
        this(str, dateTime, z, drawable, (i & 16) != 0 ? (Integer) null : num, (i & 32) != 0 ? (Integer) null : num2, (i & 64) != 0 ? (List) null : list);
    }

    @Nullable
    /* renamed from: e */
    public final Integer m57825e() {
        return this.f47713e;
    }

    @Nullable
    /* renamed from: f */
    public final Integer m57826f() {
        return this.f47714f;
    }

    @Nullable
    /* renamed from: g */
    public final List<String> m57827g() {
        return this.f47715g;
    }
}
