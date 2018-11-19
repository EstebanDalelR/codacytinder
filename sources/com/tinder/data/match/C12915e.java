package com.tinder.data.match;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.match.C8680y.C10803d;
import com.tinder.domain.match.model.Match.Attribution;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.match.e */
final class C12915e extends C10803d {
    /* renamed from: a */
    private final String f41399a;
    /* renamed from: b */
    private final DateTime f41400b;
    /* renamed from: c */
    private final DateTime f41401c;
    /* renamed from: d */
    private final Attribution f41402d;
    /* renamed from: e */
    private final boolean f41403e;
    /* renamed from: f */
    private final boolean f41404f;
    /* renamed from: g */
    private final String f41405g;
    /* renamed from: h */
    private final String f41406h;
    /* renamed from: i */
    private final String f41407i;
    /* renamed from: j */
    private final boolean f41408j;
    /* renamed from: k */
    private final MatchType f41409k;

    C12915e(String str, DateTime dateTime, DateTime dateTime2, Attribution attribution, boolean z, boolean z2, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z3, MatchType matchType) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f41399a = str;
        if (dateTime == null) {
            throw new NullPointerException("Null creation_date");
        }
        this.f41400b = dateTime;
        if (dateTime2 == null) {
            throw new NullPointerException("Null last_activity_date");
        }
        this.f41401c = dateTime2;
        if (attribution == null) {
            throw new NullPointerException("Null attribution");
        }
        this.f41402d = attribution;
        this.f41403e = z;
        this.f41404f = z2;
        this.f41405g = str2;
        this.f41406h = str3;
        this.f41407i = str4;
        this.f41408j = z3;
        if (matchType == null) {
            throw new NullPointerException("Null type");
        }
        this.f41409k = matchType;
    }

    @NonNull
    public String id() {
        return this.f41399a;
    }

    @NonNull
    public DateTime creation_date() {
        return this.f41400b;
    }

    @NonNull
    public DateTime last_activity_date() {
        return this.f41401c;
    }

    @NonNull
    public Attribution attribution() {
        return this.f41402d;
    }

    public boolean is_muted() {
        return this.f41403e;
    }

    public boolean is_touched() {
        return this.f41404f;
    }

    @Nullable
    public String person_id() {
        return this.f41405g;
    }

    @Nullable
    public String my_group_id() {
        return this.f41406h;
    }

    @Nullable
    public String their_group_id() {
        return this.f41407i;
    }

    public boolean is_blocked() {
        return this.f41408j;
    }

    @NonNull
    public MatchType type() {
        return this.f41409k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchImpl{id=");
        stringBuilder.append(this.f41399a);
        stringBuilder.append(", creation_date=");
        stringBuilder.append(this.f41400b);
        stringBuilder.append(", last_activity_date=");
        stringBuilder.append(this.f41401c);
        stringBuilder.append(", attribution=");
        stringBuilder.append(this.f41402d);
        stringBuilder.append(", is_muted=");
        stringBuilder.append(this.f41403e);
        stringBuilder.append(", is_touched=");
        stringBuilder.append(this.f41404f);
        stringBuilder.append(", person_id=");
        stringBuilder.append(this.f41405g);
        stringBuilder.append(", my_group_id=");
        stringBuilder.append(this.f41406h);
        stringBuilder.append(", their_group_id=");
        stringBuilder.append(this.f41407i);
        stringBuilder.append(", is_blocked=");
        stringBuilder.append(this.f41408j);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f41409k);
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
        r1 = r5 instanceof com.tinder.data.match.C8680y.C10803d;
        r2 = 0;
        if (r1 == 0) goto L_0x00a7;
    L_0x0009:
        r5 = (com.tinder.data.match.C8680y.C10803d) r5;
        r1 = r4.f41399a;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a5;
    L_0x0017:
        r1 = r4.f41400b;
        r3 = r5.creation_date();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a5;
    L_0x0023:
        r1 = r4.f41401c;
        r3 = r5.last_activity_date();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a5;
    L_0x002f:
        r1 = r4.f41402d;
        r3 = r5.attribution();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a5;
    L_0x003b:
        r1 = r4.f41403e;
        r3 = r5.is_muted();
        if (r1 != r3) goto L_0x00a5;
    L_0x0043:
        r1 = r4.f41404f;
        r3 = r5.is_touched();
        if (r1 != r3) goto L_0x00a5;
    L_0x004b:
        r1 = r4.f41405g;
        if (r1 != 0) goto L_0x0056;
    L_0x004f:
        r1 = r5.person_id();
        if (r1 != 0) goto L_0x00a5;
    L_0x0055:
        goto L_0x0062;
    L_0x0056:
        r1 = r4.f41405g;
        r3 = r5.person_id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a5;
    L_0x0062:
        r1 = r4.f41406h;
        if (r1 != 0) goto L_0x006d;
    L_0x0066:
        r1 = r5.my_group_id();
        if (r1 != 0) goto L_0x00a5;
    L_0x006c:
        goto L_0x0079;
    L_0x006d:
        r1 = r4.f41406h;
        r3 = r5.my_group_id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a5;
    L_0x0079:
        r1 = r4.f41407i;
        if (r1 != 0) goto L_0x0084;
    L_0x007d:
        r1 = r5.their_group_id();
        if (r1 != 0) goto L_0x00a5;
    L_0x0083:
        goto L_0x0090;
    L_0x0084:
        r1 = r4.f41407i;
        r3 = r5.their_group_id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a5;
    L_0x0090:
        r1 = r4.f41408j;
        r3 = r5.is_blocked();
        if (r1 != r3) goto L_0x00a5;
    L_0x0098:
        r1 = r4.f41409k;
        r5 = r5.type();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00a6;
    L_0x00a5:
        r0 = 0;
    L_0x00a6:
        return r0;
    L_0x00a7:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.match.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 1237;
        int i2 = 0;
        int hashCode = (((((((((((((((this.f41399a.hashCode() ^ 1000003) * 1000003) ^ this.f41400b.hashCode()) * 1000003) ^ this.f41401c.hashCode()) * 1000003) ^ this.f41402d.hashCode()) * 1000003) ^ (this.f41403e ? 1231 : 1237)) * 1000003) ^ (this.f41404f ? 1231 : 1237)) * 1000003) ^ (this.f41405g == null ? 0 : this.f41405g.hashCode())) * 1000003) ^ (this.f41406h == null ? 0 : this.f41406h.hashCode())) * 1000003;
        if (this.f41407i != null) {
            i2 = this.f41407i.hashCode();
        }
        hashCode = (hashCode ^ i2) * 1000003;
        if (this.f41408j) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f41409k.hashCode();
    }
}
