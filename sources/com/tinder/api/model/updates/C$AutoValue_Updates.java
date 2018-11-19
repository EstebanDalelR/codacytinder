package com.tinder.api.model.updates;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.updates.Updates.Boost;
import com.tinder.api.model.updates.Updates.LikedMessage;
import com.tinder.api.model.updates.Updates.Places;
import com.tinder.api.model.updates.Updates.PollInterval;
import java.util.List;

/* renamed from: com.tinder.api.model.updates.$AutoValue_Updates */
abstract class C$AutoValue_Updates extends Updates {
    private final List<String> blocks;
    private final Boost boost;
    private final String lastActivityDate;
    private final List<LikedMessage> likedMessages;
    private final List<ApiMatch> matches;
    private final Places places;
    private final PollInterval pollInterval;

    C$AutoValue_Updates(@Nullable List<ApiMatch> list, @Nullable Boost boost, @Nullable String str, @Nullable List<String> list2, @Nullable List<LikedMessage> list3, @Nullable PollInterval pollInterval, @Nullable Places places) {
        this.matches = list;
        this.boost = boost;
        this.lastActivityDate = str;
        this.blocks = list2;
        this.likedMessages = list3;
        this.pollInterval = pollInterval;
        this.places = places;
    }

    @Nullable
    public List<ApiMatch> matches() {
        return this.matches;
    }

    @Nullable
    public Boost boost() {
        return this.boost;
    }

    @Nullable
    @Json(name = "last_activity_date")
    public String lastActivityDate() {
        return this.lastActivityDate;
    }

    @Nullable
    public List<String> blocks() {
        return this.blocks;
    }

    @Nullable
    @Json(name = "liked_messages")
    public List<LikedMessage> likedMessages() {
        return this.likedMessages;
    }

    @Nullable
    @Json(name = "poll_interval")
    public PollInterval pollInterval() {
        return this.pollInterval;
    }

    @Nullable
    public Places places() {
        return this.places;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Updates{matches=");
        stringBuilder.append(this.matches);
        stringBuilder.append(", boost=");
        stringBuilder.append(this.boost);
        stringBuilder.append(", lastActivityDate=");
        stringBuilder.append(this.lastActivityDate);
        stringBuilder.append(", blocks=");
        stringBuilder.append(this.blocks);
        stringBuilder.append(", likedMessages=");
        stringBuilder.append(this.likedMessages);
        stringBuilder.append(", pollInterval=");
        stringBuilder.append(this.pollInterval);
        stringBuilder.append(", places=");
        stringBuilder.append(this.places);
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
        r1 = r5 instanceof com.tinder.api.model.updates.Updates;
        r2 = 0;
        if (r1 == 0) goto L_0x00af;
    L_0x0009:
        r5 = (com.tinder.api.model.updates.Updates) r5;
        r1 = r4.matches;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.matches();
        if (r1 != 0) goto L_0x00ad;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.matches;
        r3 = r5.matches();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0022:
        r1 = r4.boost;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.boost();
        if (r1 != 0) goto L_0x00ad;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.boost;
        r3 = r5.boost();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0039:
        r1 = r4.lastActivityDate;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.lastActivityDate();
        if (r1 != 0) goto L_0x00ad;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.lastActivityDate;
        r3 = r5.lastActivityDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0050:
        r1 = r4.blocks;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.blocks();
        if (r1 != 0) goto L_0x00ad;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.blocks;
        r3 = r5.blocks();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0067:
        r1 = r4.likedMessages;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.likedMessages();
        if (r1 != 0) goto L_0x00ad;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.likedMessages;
        r3 = r5.likedMessages();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x007e:
        r1 = r4.pollInterval;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.pollInterval();
        if (r1 != 0) goto L_0x00ad;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.pollInterval;
        r3 = r5.pollInterval();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0095:
        r1 = r4.places;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r5 = r5.places();
        if (r5 != 0) goto L_0x00ad;
    L_0x009f:
        goto L_0x00ae;
    L_0x00a0:
        r1 = r4.places;
        r5 = r5.places();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00ae;
    L_0x00ad:
        r0 = 0;
    L_0x00ae:
        return r0;
    L_0x00af:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.updates.$AutoValue_Updates.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((this.matches == null ? 0 : this.matches.hashCode()) ^ 1000003) * 1000003) ^ (this.boost == null ? 0 : this.boost.hashCode())) * 1000003) ^ (this.lastActivityDate == null ? 0 : this.lastActivityDate.hashCode())) * 1000003) ^ (this.blocks == null ? 0 : this.blocks.hashCode())) * 1000003) ^ (this.likedMessages == null ? 0 : this.likedMessages.hashCode())) * 1000003) ^ (this.pollInterval == null ? 0 : this.pollInterval.hashCode())) * 1000003;
        if (this.places != null) {
            i = this.places.hashCode();
        }
        return hashCode ^ i;
    }
}
