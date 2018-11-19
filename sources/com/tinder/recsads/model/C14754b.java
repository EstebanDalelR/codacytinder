package com.tinder.recsads.model;

import android.location.Location;
import com.tinder.ads.source.dfp.DfpCustomTargetingValuesKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tinder/recsads/model/DfpAdFields;", "", "location", "Landroid/location/Location;", "age", "", "genderId", "(Landroid/location/Location;Ljava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/String;", "getGenderId", "getLocation", "()Landroid/location/Location;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.model.b */
public final class C14754b {
    @NotNull
    /* renamed from: a */
    private final Location f46319a;
    @NotNull
    /* renamed from: b */
    private final String f46320b;
    @NotNull
    /* renamed from: c */
    private final String f46321c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14754b) {
                C14754b c14754b = (C14754b) obj;
                if (C2668g.a(this.f46319a, c14754b.f46319a) && C2668g.a(this.f46320b, c14754b.f46320b) && C2668g.a(this.f46321c, c14754b.f46321c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Location location = this.f46319a;
        int i = 0;
        int hashCode = (location != null ? location.hashCode() : 0) * 31;
        String str = this.f46320b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f46321c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DfpAdFields(location=");
        stringBuilder.append(this.f46319a);
        stringBuilder.append(", age=");
        stringBuilder.append(this.f46320b);
        stringBuilder.append(", genderId=");
        stringBuilder.append(this.f46321c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14754b(@NotNull Location location, @NotNull String str, @NotNull String str2) {
        C2668g.b(location, "location");
        C2668g.b(str, DfpCustomTargetingValuesKt.ADS_TARGETING_AGE);
        C2668g.b(str2, "genderId");
        this.f46319a = location;
        this.f46320b = str;
        this.f46321c = str2;
    }

    @NotNull
    /* renamed from: a */
    public final Location m56029a() {
        return this.f46319a;
    }

    @NotNull
    /* renamed from: b */
    public final String m56030b() {
        return this.f46320b;
    }

    @NotNull
    /* renamed from: c */
    public final String m56031c() {
        return this.f46321c;
    }
}
