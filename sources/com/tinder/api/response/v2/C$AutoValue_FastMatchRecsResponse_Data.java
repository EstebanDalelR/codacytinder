package com.tinder.api.response.v2;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.recs.Rec;
import com.tinder.api.response.v2.FastMatchRecsResponse.Data;
import java.util.List;

/* renamed from: com.tinder.api.response.v2.$AutoValue_FastMatchRecsResponse_Data */
abstract class C$AutoValue_FastMatchRecsResponse_Data extends Data {
    private final String newCountToken;
    private final String nextPageToken;
    private final List<Rec> results;

    C$AutoValue_FastMatchRecsResponse_Data(@Nullable String str, @Nullable String str2, @Nullable List<Rec> list) {
        this.nextPageToken = str;
        this.newCountToken = str2;
        this.results = list;
    }

    @Nullable
    @Json(name = "next_page_token")
    public String nextPageToken() {
        return this.nextPageToken;
    }

    @Nullable
    @Json(name = "new_count_token")
    public String newCountToken() {
        return this.newCountToken;
    }

    @Nullable
    public List<Rec> results() {
        return this.results;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data{nextPageToken=");
        stringBuilder.append(this.nextPageToken);
        stringBuilder.append(", newCountToken=");
        stringBuilder.append(this.newCountToken);
        stringBuilder.append(", results=");
        stringBuilder.append(this.results);
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
        r1 = r5 instanceof com.tinder.api.response.v2.FastMatchRecsResponse.Data;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.response.v2.FastMatchRecsResponse.Data) r5;
        r1 = r4.nextPageToken;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.nextPageToken();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.nextPageToken;
        r3 = r5.nextPageToken();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.newCountToken;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.newCountToken();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.newCountToken;
        r3 = r5.newCountToken();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.results;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.results();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.results;
        r5 = r5.results();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.response.v2.$AutoValue_FastMatchRecsResponse_Data.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.nextPageToken == null ? 0 : this.nextPageToken.hashCode()) ^ 1000003) * 1000003) ^ (this.newCountToken == null ? 0 : this.newCountToken.hashCode())) * 1000003;
        if (this.results != null) {
            i = this.results.hashCode();
        }
        return hashCode ^ i;
    }
}
