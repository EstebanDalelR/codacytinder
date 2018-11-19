package com.tinder.session.analytics.p402a;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tinder/session/analytics/settingsemail/EmailSettingsAnalyticsPayload;", "", "emailMasked", "", "emailOptions", "", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEmailMasked", "()Ljava/lang/String;", "getEmailOptions", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.analytics.a.c */
public final class C14832c {
    @Nullable
    /* renamed from: a */
    private final String f46439a;
    @Nullable
    /* renamed from: b */
    private final Map<String, Boolean> f46440b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14832c) {
                C14832c c14832c = (C14832c) obj;
                if (C2668g.a(this.f46439a, c14832c.f46439a) && C2668g.a(this.f46440b, c14832c.f46440b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f46439a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f46440b;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmailSettingsAnalyticsPayload(emailMasked=");
        stringBuilder.append(this.f46439a);
        stringBuilder.append(", emailOptions=");
        stringBuilder.append(this.f46440b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14832c(@Nullable String str, @Nullable Map<String, Boolean> map) {
        this.f46439a = str;
        this.f46440b = map;
    }

    @Nullable
    /* renamed from: a */
    public final String m56194a() {
        return this.f46439a;
    }

    @Nullable
    /* renamed from: b */
    public final Map<String, Boolean> m56195b() {
        return this.f46440b;
    }
}
