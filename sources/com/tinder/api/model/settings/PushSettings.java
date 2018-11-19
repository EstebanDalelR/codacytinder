package com.tinder.api.model.settings;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lcom/tinder/api/model/settings/PushSettings;", "", "matchPushes", "", "messagePushes", "superlikePushes", "messageLikePushes", "fastMatchFrequency", "", "topPicksDailyPushes", "placesPushes", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getFastMatchFrequency", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMatchPushes", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessageLikePushes", "getMessagePushes", "getPlacesPushes", "getSuperlikePushes", "getTopPicksDailyPushes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tinder/api/model/settings/PushSettings;", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PushSettings {
    @Nullable
    private final Integer fastMatchFrequency;
    @Nullable
    private final Boolean matchPushes;
    @Nullable
    private final Boolean messageLikePushes;
    @Nullable
    private final Boolean messagePushes;
    @Nullable
    private final Boolean placesPushes;
    @Nullable
    private final Boolean superlikePushes;
    @Nullable
    private final Boolean topPicksDailyPushes;

    public PushSettings() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @NotNull
    public static /* synthetic */ PushSettings copy$default(PushSettings pushSettings, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5, Boolean bool6, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = pushSettings.matchPushes;
        }
        if ((i & 2) != 0) {
            bool2 = pushSettings.messagePushes;
        }
        Boolean bool7 = bool2;
        if ((i & 4) != 0) {
            bool3 = pushSettings.superlikePushes;
        }
        Boolean bool8 = bool3;
        if ((i & 8) != 0) {
            bool4 = pushSettings.messageLikePushes;
        }
        Boolean bool9 = bool4;
        if ((i & 16) != 0) {
            num = pushSettings.fastMatchFrequency;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            bool5 = pushSettings.topPicksDailyPushes;
        }
        Boolean bool10 = bool5;
        if ((i & 64) != 0) {
            bool6 = pushSettings.placesPushes;
        }
        return pushSettings.copy(bool, bool7, bool8, bool9, num2, bool10, bool6);
    }

    @Nullable
    public final Boolean component1() {
        return this.matchPushes;
    }

    @Nullable
    public final Boolean component2() {
        return this.messagePushes;
    }

    @Nullable
    public final Boolean component3() {
        return this.superlikePushes;
    }

    @Nullable
    public final Boolean component4() {
        return this.messageLikePushes;
    }

    @Nullable
    public final Integer component5() {
        return this.fastMatchFrequency;
    }

    @Nullable
    public final Boolean component6() {
        return this.topPicksDailyPushes;
    }

    @Nullable
    public final Boolean component7() {
        return this.placesPushes;
    }

    @NotNull
    public final PushSettings copy(@Nullable @Json(name = "match") Boolean bool, @Nullable @Json(name = "message") Boolean bool2, @Nullable @Json(name = "super_like") Boolean bool3, @Nullable @Json(name = "message_like") Boolean bool4, @Nullable @Json(name = "fast_match_frequency") Integer num, @Nullable @Json(name = "top_picks_daily") Boolean bool5, @Nullable @Json(name = "places") Boolean bool6) {
        return new PushSettings(bool, bool2, bool3, bool4, num, bool5, bool6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PushSettings) {
                PushSettings pushSettings = (PushSettings) obj;
                if (C2668g.a(this.matchPushes, pushSettings.matchPushes) && C2668g.a(this.messagePushes, pushSettings.messagePushes) && C2668g.a(this.superlikePushes, pushSettings.superlikePushes) && C2668g.a(this.messageLikePushes, pushSettings.messageLikePushes) && C2668g.a(this.fastMatchFrequency, pushSettings.fastMatchFrequency) && C2668g.a(this.topPicksDailyPushes, pushSettings.topPicksDailyPushes) && C2668g.a(this.placesPushes, pushSettings.placesPushes)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.matchPushes;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.messagePushes;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.superlikePushes;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.messageLikePushes;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.fastMatchFrequency;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        bool2 = this.topPicksDailyPushes;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.placesPushes;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PushSettings(matchPushes=");
        stringBuilder.append(this.matchPushes);
        stringBuilder.append(", messagePushes=");
        stringBuilder.append(this.messagePushes);
        stringBuilder.append(", superlikePushes=");
        stringBuilder.append(this.superlikePushes);
        stringBuilder.append(", messageLikePushes=");
        stringBuilder.append(this.messageLikePushes);
        stringBuilder.append(", fastMatchFrequency=");
        stringBuilder.append(this.fastMatchFrequency);
        stringBuilder.append(", topPicksDailyPushes=");
        stringBuilder.append(this.topPicksDailyPushes);
        stringBuilder.append(", placesPushes=");
        stringBuilder.append(this.placesPushes);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PushSettings(@Nullable @Json(name = "match") Boolean bool, @Nullable @Json(name = "message") Boolean bool2, @Nullable @Json(name = "super_like") Boolean bool3, @Nullable @Json(name = "message_like") Boolean bool4, @Nullable @Json(name = "fast_match_frequency") Integer num, @Nullable @Json(name = "top_picks_daily") Boolean bool5, @Nullable @Json(name = "places") Boolean bool6) {
        this.matchPushes = bool;
        this.messagePushes = bool2;
        this.superlikePushes = bool3;
        this.messageLikePushes = bool4;
        this.fastMatchFrequency = num;
        this.topPicksDailyPushes = bool5;
        this.placesPushes = bool6;
    }

    public /* synthetic */ PushSettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5, Boolean bool6, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            bool = null;
        }
        if ((i & 2) != null) {
            bool2 = null;
        }
        Boolean bool7 = bool2;
        if ((i & 4) != null) {
            bool3 = null;
        }
        Boolean bool8 = bool3;
        if ((i & 8) != null) {
            bool4 = null;
        }
        Boolean bool9 = bool4;
        if ((i & 16) != null) {
            num = null;
        }
        Integer num2 = num;
        if ((i & 32) != null) {
            bool5 = null;
        }
        Boolean bool10 = bool5;
        if ((i & 64) != null) {
            bool6 = null;
        }
        this(bool, bool7, bool8, bool9, num2, bool10, bool6);
    }

    @Nullable
    public final Boolean getMatchPushes() {
        return this.matchPushes;
    }

    @Nullable
    public final Boolean getMessagePushes() {
        return this.messagePushes;
    }

    @Nullable
    public final Boolean getSuperlikePushes() {
        return this.superlikePushes;
    }

    @Nullable
    public final Boolean getMessageLikePushes() {
        return this.messageLikePushes;
    }

    @Nullable
    public final Integer getFastMatchFrequency() {
        return this.fastMatchFrequency;
    }

    @Nullable
    public final Boolean getTopPicksDailyPushes() {
        return this.topPicksDailyPushes;
    }

    @Nullable
    public final Boolean getPlacesPushes() {
        return this.placesPushes;
    }
}
