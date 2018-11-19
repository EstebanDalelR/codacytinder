package com.tinder.toppicks.exhausted;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006 "}, d2 = {"Lcom/tinder/toppicks/exhausted/TopPickTeaserExhaustedViewModel;", "", "photoUrl", "", "position", "Lcom/tinder/toppicks/exhausted/TopPicksExhaustedPosition;", "location", "Landroid/graphics/PointF;", "width", "", "height", "(Ljava/lang/String;Lcom/tinder/toppicks/exhausted/TopPicksExhaustedPosition;Landroid/graphics/PointF;II)V", "getHeight", "()I", "getLocation", "()Landroid/graphics/PointF;", "getPhotoUrl", "()Ljava/lang/String;", "getPosition", "()Lcom/tinder/toppicks/exhausted/TopPicksExhaustedPosition;", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.exhausted.a */
public final class C15264a {
    @NotNull
    /* renamed from: a */
    private final String f47381a;
    @NotNull
    /* renamed from: b */
    private final TopPicksExhaustedPosition f47382b;
    @NotNull
    /* renamed from: c */
    private final PointF f47383c;
    /* renamed from: d */
    private final int f47384d;
    /* renamed from: e */
    private final int f47385e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15264a) {
            C15264a c15264a = (C15264a) obj;
            if (C2668g.a(this.f47381a, c15264a.f47381a) && C2668g.a(this.f47382b, c15264a.f47382b) && C2668g.a(this.f47383c, c15264a.f47383c)) {
                if ((this.f47384d == c15264a.f47384d ? 1 : null) != null) {
                    if ((this.f47385e == c15264a.f47385e ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f47381a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        TopPicksExhaustedPosition topPicksExhaustedPosition = this.f47382b;
        hashCode = (hashCode + (topPicksExhaustedPosition != null ? topPicksExhaustedPosition.hashCode() : 0)) * 31;
        PointF pointF = this.f47383c;
        if (pointF != null) {
            i = pointF.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f47384d) * 31) + this.f47385e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPickTeaserExhaustedViewModel(photoUrl=");
        stringBuilder.append(this.f47381a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f47382b);
        stringBuilder.append(", location=");
        stringBuilder.append(this.f47383c);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f47384d);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f47385e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15264a(@NotNull String str, @NotNull TopPicksExhaustedPosition topPicksExhaustedPosition, @NotNull PointF pointF, int i, int i2) {
        C2668g.b(str, "photoUrl");
        C2668g.b(topPicksExhaustedPosition, "position");
        C2668g.b(pointF, "location");
        this.f47381a = str;
        this.f47382b = topPicksExhaustedPosition;
        this.f47383c = pointF;
        this.f47384d = i;
        this.f47385e = i2;
    }

    @NotNull
    /* renamed from: a */
    public final String m57360a() {
        return this.f47381a;
    }

    @NotNull
    /* renamed from: b */
    public final TopPicksExhaustedPosition m57361b() {
        return this.f47382b;
    }

    @NotNull
    /* renamed from: c */
    public final PointF m57362c() {
        return this.f47383c;
    }

    /* renamed from: d */
    public final int m57363d() {
        return this.f47384d;
    }

    /* renamed from: e */
    public final int m57364e() {
        return this.f47385e;
    }
}
