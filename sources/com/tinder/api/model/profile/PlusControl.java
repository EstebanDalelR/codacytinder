package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/tinder/api/model/profile/PlusControl;", "", "discoverableParty", "", "hideAds", "", "hideAge", "hideDistance", "blend", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBlend", "()Ljava/lang/String;", "getDiscoverableParty", "getHideAds", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHideAge", "getHideDistance", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/tinder/api/model/profile/PlusControl;", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PlusControl {
    @Nullable
    private final String blend;
    @Nullable
    private final String discoverableParty;
    @Nullable
    private final Boolean hideAds;
    @Nullable
    private final Boolean hideAge;
    @Nullable
    private final Boolean hideDistance;

    @NotNull
    public static /* synthetic */ PlusControl copy$default(PlusControl plusControl, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusControl.discoverableParty;
        }
        if ((i & 2) != 0) {
            bool = plusControl.hideAds;
        }
        Boolean bool4 = bool;
        if ((i & 4) != 0) {
            bool2 = plusControl.hideAge;
        }
        Boolean bool5 = bool2;
        if ((i & 8) != 0) {
            bool3 = plusControl.hideDistance;
        }
        Boolean bool6 = bool3;
        if ((i & 16) != 0) {
            str2 = plusControl.blend;
        }
        return plusControl.copy(str, bool4, bool5, bool6, str2);
    }

    @Nullable
    public final String component1() {
        return this.discoverableParty;
    }

    @Nullable
    public final Boolean component2() {
        return this.hideAds;
    }

    @Nullable
    public final Boolean component3() {
        return this.hideAge;
    }

    @Nullable
    public final Boolean component4() {
        return this.hideDistance;
    }

    @Nullable
    public final String component5() {
        return this.blend;
    }

    @NotNull
    public final PlusControl copy(@Nullable @Json(name = "discoverable_party") String str, @Nullable @Json(name = "hide_ads") Boolean bool, @Nullable @Json(name = "hide_age") Boolean bool2, @Nullable @Json(name = "hide_distance") Boolean bool3, @Nullable @Json(name = "blend") String str2) {
        return new PlusControl(str, bool, bool2, bool3, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlusControl) {
                PlusControl plusControl = (PlusControl) obj;
                if (C2668g.a(this.discoverableParty, plusControl.discoverableParty) && C2668g.a(this.hideAds, plusControl.hideAds) && C2668g.a(this.hideAge, plusControl.hideAge) && C2668g.a(this.hideDistance, plusControl.hideDistance) && C2668g.a(this.blend, plusControl.blend)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.discoverableParty;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.hideAds;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.hideAge;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.hideDistance;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.blend;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlusControl(discoverableParty=");
        stringBuilder.append(this.discoverableParty);
        stringBuilder.append(", hideAds=");
        stringBuilder.append(this.hideAds);
        stringBuilder.append(", hideAge=");
        stringBuilder.append(this.hideAge);
        stringBuilder.append(", hideDistance=");
        stringBuilder.append(this.hideDistance);
        stringBuilder.append(", blend=");
        stringBuilder.append(this.blend);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlusControl(@Nullable @Json(name = "discoverable_party") String str, @Nullable @Json(name = "hide_ads") Boolean bool, @Nullable @Json(name = "hide_age") Boolean bool2, @Nullable @Json(name = "hide_distance") Boolean bool3, @Nullable @Json(name = "blend") String str2) {
        this.discoverableParty = str;
        this.hideAds = bool;
        this.hideAge = bool2;
        this.hideDistance = bool3;
        this.blend = str2;
    }

    @Nullable
    public final String getDiscoverableParty() {
        return this.discoverableParty;
    }

    @Nullable
    public final Boolean getHideAds() {
        return this.hideAds;
    }

    @Nullable
    public final Boolean getHideAge() {
        return this.hideAge;
    }

    @Nullable
    public final Boolean getHideDistance() {
        return this.hideDistance;
    }

    @Nullable
    public final String getBlend() {
        return this.blend;
    }
}
