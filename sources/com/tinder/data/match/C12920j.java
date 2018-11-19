package com.tinder.data.match;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.match.ao.C10793a;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.match.j */
final class C12920j extends C10793a {
    /* renamed from: a */
    private final String f41427a;
    /* renamed from: b */
    private final String f41428b;
    /* renamed from: c */
    private final String f41429c;
    /* renamed from: d */
    private final boolean f41430d;
    /* renamed from: e */
    private final DateTime f41431e;
    /* renamed from: f */
    private final String f41432f;

    C12920j(String str, String str2, String str3, boolean z, @Nullable DateTime dateTime, @Nullable String str4) {
        if (str == null) {
            throw new NullPointerException("Null template_id");
        }
        this.f41427a = str;
        if (str2 == null) {
            throw new NullPointerException("Null url");
        }
        this.f41428b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null event");
        }
        this.f41429c = str3;
        this.f41430d = z;
        this.f41431e = dateTime;
        this.f41432f = str4;
    }

    @NonNull
    public String template_id() {
        return this.f41427a;
    }

    @NonNull
    public String url() {
        return this.f41428b;
    }

    @NonNull
    public String event() {
        return this.f41429c;
    }

    public boolean is_unique() {
        return this.f41430d;
    }

    @Nullable
    public DateTime ping_time() {
        return this.f41431e;
    }

    @Nullable
    public String line_item_id() {
        return this.f41432f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TrackingUrl{template_id=");
        stringBuilder.append(this.f41427a);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f41428b);
        stringBuilder.append(", event=");
        stringBuilder.append(this.f41429c);
        stringBuilder.append(", is_unique=");
        stringBuilder.append(this.f41430d);
        stringBuilder.append(", ping_time=");
        stringBuilder.append(this.f41431e);
        stringBuilder.append(", line_item_id=");
        stringBuilder.append(this.f41432f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.data.match.ao.C10793a;
        r2 = 0;
        if (r1 == 0) goto L_0x0068;
    L_0x0009:
        r5 = (com.tinder.data.match.ao.C10793a) r5;
        r1 = r4.f41427a;
        r3 = r5.template_id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0066;
    L_0x0017:
        r1 = r4.f41428b;
        r3 = r5.url();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0066;
    L_0x0023:
        r1 = r4.f41429c;
        r3 = r5.event();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0066;
    L_0x002f:
        r1 = r4.f41430d;
        r3 = r5.is_unique();
        if (r1 != r3) goto L_0x0066;
    L_0x0037:
        r1 = r4.f41431e;
        if (r1 != 0) goto L_0x0042;
    L_0x003b:
        r1 = r5.ping_time();
        if (r1 != 0) goto L_0x0066;
    L_0x0041:
        goto L_0x004e;
    L_0x0042:
        r1 = r4.f41431e;
        r3 = r5.ping_time();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0066;
    L_0x004e:
        r1 = r4.f41432f;
        if (r1 != 0) goto L_0x0059;
    L_0x0052:
        r5 = r5.line_item_id();
        if (r5 != 0) goto L_0x0066;
    L_0x0058:
        goto L_0x0067;
    L_0x0059:
        r1 = r4.f41432f;
        r5 = r5.line_item_id();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0067;
    L_0x0066:
        r0 = 0;
    L_0x0067:
        return r0;
    L_0x0068:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.match.j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((this.f41427a.hashCode() ^ 1000003) * 1000003) ^ this.f41428b.hashCode()) * 1000003) ^ this.f41429c.hashCode()) * 1000003) ^ (this.f41430d ? 1231 : 1237)) * 1000003) ^ (this.f41431e == null ? 0 : this.f41431e.hashCode())) * 1000003;
        if (this.f41432f != null) {
            i = this.f41432f.hashCode();
        }
        return hashCode ^ i;
    }
}
