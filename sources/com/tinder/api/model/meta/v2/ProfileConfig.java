package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/tinder/api/model/meta/v2/ProfileConfig;", "", "canEditJobs", "", "canEditSchools", "canAddPhotosFromFacebook", "canShowCommonConnections", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCanAddPhotosFromFacebook", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanEditJobs", "getCanEditSchools", "getCanShowCommonConnections", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tinder/api/model/meta/v2/ProfileConfig;", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileConfig {
    @Nullable
    private final Boolean canAddPhotosFromFacebook;
    @Nullable
    private final Boolean canEditJobs;
    @Nullable
    private final Boolean canEditSchools;
    @Nullable
    private final Boolean canShowCommonConnections;

    @NotNull
    public static /* synthetic */ ProfileConfig copy$default(ProfileConfig profileConfig, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = profileConfig.canEditJobs;
        }
        if ((i & 2) != 0) {
            bool2 = profileConfig.canEditSchools;
        }
        if ((i & 4) != 0) {
            bool3 = profileConfig.canAddPhotosFromFacebook;
        }
        if ((i & 8) != 0) {
            bool4 = profileConfig.canShowCommonConnections;
        }
        return profileConfig.copy(bool, bool2, bool3, bool4);
    }

    @Nullable
    public final Boolean component1() {
        return this.canEditJobs;
    }

    @Nullable
    public final Boolean component2() {
        return this.canEditSchools;
    }

    @Nullable
    public final Boolean component3() {
        return this.canAddPhotosFromFacebook;
    }

    @Nullable
    public final Boolean component4() {
        return this.canShowCommonConnections;
    }

    @NotNull
    public final ProfileConfig copy(@Nullable @Json(name = "can_edit_jobs") Boolean bool, @Nullable @Json(name = "can_edit_schools") Boolean bool2, @Nullable @Json(name = "can_add_photos_from_facebook") Boolean bool3, @Nullable @Json(name = "can_show_common_connections") Boolean bool4) {
        return new ProfileConfig(bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileConfig) {
                ProfileConfig profileConfig = (ProfileConfig) obj;
                if (C2668g.a(this.canEditJobs, profileConfig.canEditJobs) && C2668g.a(this.canEditSchools, profileConfig.canEditSchools) && C2668g.a(this.canAddPhotosFromFacebook, profileConfig.canAddPhotosFromFacebook) && C2668g.a(this.canShowCommonConnections, profileConfig.canShowCommonConnections)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.canEditJobs;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.canEditSchools;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.canAddPhotosFromFacebook;
        hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        bool2 = this.canShowCommonConnections;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileConfig(canEditJobs=");
        stringBuilder.append(this.canEditJobs);
        stringBuilder.append(", canEditSchools=");
        stringBuilder.append(this.canEditSchools);
        stringBuilder.append(", canAddPhotosFromFacebook=");
        stringBuilder.append(this.canAddPhotosFromFacebook);
        stringBuilder.append(", canShowCommonConnections=");
        stringBuilder.append(this.canShowCommonConnections);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ProfileConfig(@Nullable @Json(name = "can_edit_jobs") Boolean bool, @Nullable @Json(name = "can_edit_schools") Boolean bool2, @Nullable @Json(name = "can_add_photos_from_facebook") Boolean bool3, @Nullable @Json(name = "can_show_common_connections") Boolean bool4) {
        this.canEditJobs = bool;
        this.canEditSchools = bool2;
        this.canAddPhotosFromFacebook = bool3;
        this.canShowCommonConnections = bool4;
    }

    @Nullable
    public final Boolean getCanEditJobs() {
        return this.canEditJobs;
    }

    @Nullable
    public final Boolean getCanEditSchools() {
        return this.canEditSchools;
    }

    @Nullable
    public final Boolean getCanAddPhotosFromFacebook() {
        return this.canAddPhotosFromFacebook;
    }

    @Nullable
    public final Boolean getCanShowCommonConnections() {
        return this.canShowCommonConnections;
    }
}
