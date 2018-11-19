package com.tinder.smsauth.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/entity/Country;", "", "countryCode", "", "regionCode", "", "name", "(ILjava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()I", "getName", "()Ljava/lang/String;", "getRegionCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "entity"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.entity.c */
public final class C14975c {
    /* renamed from: a */
    private final int f46739a;
    @NotNull
    /* renamed from: b */
    private final String f46740b;
    @NotNull
    /* renamed from: c */
    private final String f46741c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14975c) {
            C14975c c14975c = (C14975c) obj;
            return (this.f46739a == c14975c.f46739a ? 1 : null) != null && C2668g.a(this.f46740b, c14975c.f46740b) && C2668g.a(this.f46741c, c14975c.f46741c);
        }
    }

    public int hashCode() {
        int i = this.f46739a * 31;
        String str = this.f46740b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f46741c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Country(countryCode=");
        stringBuilder.append(this.f46739a);
        stringBuilder.append(", regionCode=");
        stringBuilder.append(this.f46740b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f46741c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14975c(int i, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, "regionCode");
        C2668g.b(str2, "name");
        this.f46739a = i;
        this.f46740b = str;
        this.f46741c = str2;
    }

    /* renamed from: a */
    public final int m56561a() {
        return this.f46739a;
    }

    @NotNull
    /* renamed from: b */
    public final String m56562b() {
        return this.f46740b;
    }

    @NotNull
    /* renamed from: c */
    public final String m56563c() {
        return this.f46741c;
    }
}
