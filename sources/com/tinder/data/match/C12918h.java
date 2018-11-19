package com.tinder.data.match;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.match.C8680y.C10806g;
import com.tinder.data.model.MatchModel;
import com.tinder.data.model.MatchPersonModel;
import com.tinder.data.model.SponsoredMatchCreativeValuesModel;

/* renamed from: com.tinder.data.match.h */
final class C12918h extends C10806g {
    /* renamed from: a */
    private final String f41421a;
    /* renamed from: b */
    private final MatchModel f41422b;
    /* renamed from: c */
    private final MatchPersonModel f41423c;
    /* renamed from: d */
    private final SponsoredMatchCreativeValuesModel f41424d;

    C12918h(String str, MatchModel matchModel, @Nullable MatchPersonModel matchPersonModel, @Nullable SponsoredMatchCreativeValuesModel sponsoredMatchCreativeValuesModel) {
        if (str == null) {
            throw new NullPointerException("Null m_id");
        }
        this.f41421a = str;
        if (matchModel == null) {
            throw new NullPointerException("Null M");
        }
        this.f41422b = matchModel;
        this.f41423c = matchPersonModel;
        this.f41424d = sponsoredMatchCreativeValuesModel;
    }

    @NonNull
    public String m_id() {
        return this.f41421a;
    }

    @NonNull
    /* renamed from: M */
    public MatchModel mo11063M() {
        return this.f41422b;
    }

    @Nullable
    /* renamed from: P */
    public MatchPersonModel mo11064P() {
        return this.f41423c;
    }

    @Nullable
    public SponsoredMatchCreativeValuesModel CV() {
        return this.f41424d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchView{m_id=");
        stringBuilder.append(this.f41421a);
        stringBuilder.append(", M=");
        stringBuilder.append(this.f41422b);
        stringBuilder.append(", P=");
        stringBuilder.append(this.f41423c);
        stringBuilder.append(", CV=");
        stringBuilder.append(this.f41424d);
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
        r1 = r5 instanceof com.tinder.data.match.C8680y.C10806g;
        r2 = 0;
        if (r1 == 0) goto L_0x0054;
    L_0x0009:
        r5 = (com.tinder.data.match.C8680y.C10806g) r5;
        r1 = r4.f41421a;
        r3 = r5.m_id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x0017:
        r1 = r4.f41422b;
        r3 = r5.mo11063M();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x0023:
        r1 = r4.f41423c;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.mo11064P();
        if (r1 != 0) goto L_0x0052;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.f41423c;
        r3 = r5.mo11064P();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x003a:
        r1 = r4.f41424d;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r5 = r5.CV();
        if (r5 != 0) goto L_0x0052;
    L_0x0044:
        goto L_0x0053;
    L_0x0045:
        r1 = r4.f41424d;
        r5 = r5.CV();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0053;
    L_0x0052:
        r0 = 0;
    L_0x0053:
        return r0;
    L_0x0054:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.match.h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((this.f41421a.hashCode() ^ 1000003) * 1000003) ^ this.f41422b.hashCode()) * 1000003) ^ (this.f41423c == null ? 0 : this.f41423c.hashCode())) * 1000003;
        if (this.f41424d != null) {
            i = this.f41424d.hashCode();
        }
        return hashCode ^ i;
    }
}
