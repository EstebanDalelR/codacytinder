package com.tinder.sponsoredmessage;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\""}, d2 = {"Lcom/tinder/sponsoredmessage/SponsoredMessageConfig;", "", "enabled", "", "adUnitId", "", "templateId", "requestCadenceMillis", "", "minimumInterstice", "", "shouldShowAdsInTinderPlus", "(ZLjava/lang/String;Ljava/lang/String;JIZ)V", "getAdUnitId", "()Ljava/lang/String;", "getEnabled", "()Z", "getMinimumInterstice", "()I", "getRequestCadenceMillis", "()J", "getShouldShowAdsInTinderPlus", "getTemplateId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.e */
public final class C15034e {
    /* renamed from: a */
    private final boolean f46816a;
    @NotNull
    /* renamed from: b */
    private final String f46817b;
    @NotNull
    /* renamed from: c */
    private final String f46818c;
    /* renamed from: d */
    private final long f46819d;
    /* renamed from: e */
    private final int f46820e;
    /* renamed from: f */
    private final boolean f46821f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15034e) {
            C15034e c15034e = (C15034e) obj;
            if ((this.f46816a == c15034e.f46816a ? 1 : null) != null && C2668g.a(this.f46817b, c15034e.f46817b) && C2668g.a(this.f46818c, c15034e.f46818c)) {
                if ((this.f46819d == c15034e.f46819d ? 1 : null) != null) {
                    if ((this.f46820e == c15034e.f46820e ? 1 : null) != null) {
                        if ((this.f46821f == c15034e.f46821f ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f46816a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        String str = this.f46817b;
        int i3 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f46818c;
        if (str != null) {
            i3 = str.hashCode();
        }
        i = (i + i3) * 31;
        long j = this.f46819d;
        i = (((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f46820e) * 31;
        boolean z = this.f46821f;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SponsoredMessageConfig(enabled=");
        stringBuilder.append(this.f46816a);
        stringBuilder.append(", adUnitId=");
        stringBuilder.append(this.f46817b);
        stringBuilder.append(", templateId=");
        stringBuilder.append(this.f46818c);
        stringBuilder.append(", requestCadenceMillis=");
        stringBuilder.append(this.f46819d);
        stringBuilder.append(", minimumInterstice=");
        stringBuilder.append(this.f46820e);
        stringBuilder.append(", shouldShowAdsInTinderPlus=");
        stringBuilder.append(this.f46821f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15034e(boolean z, @NotNull String str, @NotNull String str2, long j, int i, boolean z2) {
        C2668g.b(str, "adUnitId");
        C2668g.b(str2, "templateId");
        this.f46816a = z;
        this.f46817b = str;
        this.f46818c = str2;
        this.f46819d = j;
        this.f46820e = i;
        this.f46821f = z2;
    }

    /* renamed from: a */
    public final boolean m56647a() {
        return this.f46816a;
    }

    @NotNull
    /* renamed from: b */
    public final String m56648b() {
        return this.f46817b;
    }

    @NotNull
    /* renamed from: c */
    public final String m56649c() {
        return this.f46818c;
    }

    /* renamed from: d */
    public final long m56650d() {
        return this.f46819d;
    }

    /* renamed from: e */
    public final int m56651e() {
        return this.f46820e;
    }

    /* renamed from: f */
    public final boolean m56652f() {
        return this.f46821f;
    }
}
