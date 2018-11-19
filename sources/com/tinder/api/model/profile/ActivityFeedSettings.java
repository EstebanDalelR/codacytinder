package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJJ\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/tinder/api/model/profile/ActivityFeedSettings;", "", "enabled", "", "shouldShareInstagramUpdates", "shouldShareSpotifyTopArtistUpdates", "shouldShareSpotifyAnthemUpdates", "shouldShareProfileUpdates", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShouldShareInstagramUpdates", "getShouldShareProfileUpdates", "getShouldShareSpotifyAnthemUpdates", "getShouldShareSpotifyTopArtistUpdates", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tinder/api/model/profile/ActivityFeedSettings;", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedSettings {
    @Nullable
    private final Boolean enabled;
    @Nullable
    private final Boolean shouldShareInstagramUpdates;
    @Nullable
    private final Boolean shouldShareProfileUpdates;
    @Nullable
    private final Boolean shouldShareSpotifyAnthemUpdates;
    @Nullable
    private final Boolean shouldShareSpotifyTopArtistUpdates;

    @NotNull
    public static /* synthetic */ ActivityFeedSettings copy$default(ActivityFeedSettings activityFeedSettings, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = activityFeedSettings.enabled;
        }
        if ((i & 2) != 0) {
            bool2 = activityFeedSettings.shouldShareInstagramUpdates;
        }
        Boolean bool6 = bool2;
        if ((i & 4) != 0) {
            bool3 = activityFeedSettings.shouldShareSpotifyTopArtistUpdates;
        }
        Boolean bool7 = bool3;
        if ((i & 8) != 0) {
            bool4 = activityFeedSettings.shouldShareSpotifyAnthemUpdates;
        }
        Boolean bool8 = bool4;
        if ((i & 16) != 0) {
            bool5 = activityFeedSettings.shouldShareProfileUpdates;
        }
        return activityFeedSettings.copy(bool, bool6, bool7, bool8, bool5);
    }

    @Nullable
    public final Boolean component1() {
        return this.enabled;
    }

    @Nullable
    public final Boolean component2() {
        return this.shouldShareInstagramUpdates;
    }

    @Nullable
    public final Boolean component3() {
        return this.shouldShareSpotifyTopArtistUpdates;
    }

    @Nullable
    public final Boolean component4() {
        return this.shouldShareSpotifyAnthemUpdates;
    }

    @Nullable
    public final Boolean component5() {
        return this.shouldShareProfileUpdates;
    }

    @NotNull
    public final ActivityFeedSettings copy(@Nullable @Json(name = "enabled") Boolean bool, @Nullable @Json(name = "instagram") Boolean bool2, @Nullable @Json(name = "spotify") Boolean bool3, @Nullable @Json(name = "spotify_anthem") Boolean bool4, @Nullable @Json(name = "profile") Boolean bool5) {
        return new ActivityFeedSettings(bool, bool2, bool3, bool4, bool5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedSettings) {
                ActivityFeedSettings activityFeedSettings = (ActivityFeedSettings) obj;
                if (C2668g.a(this.enabled, activityFeedSettings.enabled) && C2668g.a(this.shouldShareInstagramUpdates, activityFeedSettings.shouldShareInstagramUpdates) && C2668g.a(this.shouldShareSpotifyTopArtistUpdates, activityFeedSettings.shouldShareSpotifyTopArtistUpdates) && C2668g.a(this.shouldShareSpotifyAnthemUpdates, activityFeedSettings.shouldShareSpotifyAnthemUpdates) && C2668g.a(this.shouldShareProfileUpdates, activityFeedSettings.shouldShareProfileUpdates)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.shouldShareInstagramUpdates;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.shouldShareSpotifyTopArtistUpdates;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.shouldShareSpotifyAnthemUpdates;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.shouldShareProfileUpdates;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedSettings(enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(", shouldShareInstagramUpdates=");
        stringBuilder.append(this.shouldShareInstagramUpdates);
        stringBuilder.append(", shouldShareSpotifyTopArtistUpdates=");
        stringBuilder.append(this.shouldShareSpotifyTopArtistUpdates);
        stringBuilder.append(", shouldShareSpotifyAnthemUpdates=");
        stringBuilder.append(this.shouldShareSpotifyAnthemUpdates);
        stringBuilder.append(", shouldShareProfileUpdates=");
        stringBuilder.append(this.shouldShareProfileUpdates);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedSettings(@Nullable @Json(name = "enabled") Boolean bool, @Nullable @Json(name = "instagram") Boolean bool2, @Nullable @Json(name = "spotify") Boolean bool3, @Nullable @Json(name = "spotify_anthem") Boolean bool4, @Nullable @Json(name = "profile") Boolean bool5) {
        this.enabled = bool;
        this.shouldShareInstagramUpdates = bool2;
        this.shouldShareSpotifyTopArtistUpdates = bool3;
        this.shouldShareSpotifyAnthemUpdates = bool4;
        this.shouldShareProfileUpdates = bool5;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Boolean getShouldShareInstagramUpdates() {
        return this.shouldShareInstagramUpdates;
    }

    @Nullable
    public final Boolean getShouldShareSpotifyTopArtistUpdates() {
        return this.shouldShareSpotifyTopArtistUpdates;
    }

    @Nullable
    public final Boolean getShouldShareSpotifyAnthemUpdates() {
        return this.shouldShareSpotifyAnthemUpdates;
    }

    @Nullable
    public final Boolean getShouldShareProfileUpdates() {
        return this.shouldShareProfileUpdates;
    }
}
