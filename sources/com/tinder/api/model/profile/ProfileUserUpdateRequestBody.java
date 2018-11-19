package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/tinder/api/model/profile/ProfileUserUpdateRequestBody;", "", "bio", "", "gender", "", "customGender", "showGenderOnProfile", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBio", "()Ljava/lang/String;", "getCustomGender", "getGender", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowGenderOnProfile", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/tinder/api/model/profile/ProfileUserUpdateRequestBody;", "equals", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileUserUpdateRequestBody {
    @Nullable
    private final String bio;
    @Nullable
    private final String customGender;
    @Nullable
    private final Integer gender;
    @Nullable
    private final Boolean showGenderOnProfile;

    @NotNull
    public static /* synthetic */ ProfileUserUpdateRequestBody copy$default(ProfileUserUpdateRequestBody profileUserUpdateRequestBody, String str, Integer num, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileUserUpdateRequestBody.bio;
        }
        if ((i & 2) != 0) {
            num = profileUserUpdateRequestBody.gender;
        }
        if ((i & 4) != 0) {
            str2 = profileUserUpdateRequestBody.customGender;
        }
        if ((i & 8) != 0) {
            bool = profileUserUpdateRequestBody.showGenderOnProfile;
        }
        return profileUserUpdateRequestBody.copy(str, num, str2, bool);
    }

    @Nullable
    public final String component1() {
        return this.bio;
    }

    @Nullable
    public final Integer component2() {
        return this.gender;
    }

    @Nullable
    public final String component3() {
        return this.customGender;
    }

    @Nullable
    public final Boolean component4() {
        return this.showGenderOnProfile;
    }

    @NotNull
    public final ProfileUserUpdateRequestBody copy(@Nullable @Json(name = "bio") String str, @Nullable @Json(name = "gender") Integer num, @Nullable @Json(name = "custom_gender") String str2, @Nullable @Json(name = "show_gender_on_profile") Boolean bool) {
        return new ProfileUserUpdateRequestBody(str, num, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileUserUpdateRequestBody) {
                ProfileUserUpdateRequestBody profileUserUpdateRequestBody = (ProfileUserUpdateRequestBody) obj;
                if (C2668g.a(this.bio, profileUserUpdateRequestBody.bio) && C2668g.a(this.gender, profileUserUpdateRequestBody.gender) && C2668g.a(this.customGender, profileUserUpdateRequestBody.customGender) && C2668g.a(this.showGenderOnProfile, profileUserUpdateRequestBody.showGenderOnProfile)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.bio;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.gender;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.customGender;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.showGenderOnProfile;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileUserUpdateRequestBody(bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
        stringBuilder.append(", showGenderOnProfile=");
        stringBuilder.append(this.showGenderOnProfile);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ProfileUserUpdateRequestBody(@Nullable @Json(name = "bio") String str, @Nullable @Json(name = "gender") Integer num, @Nullable @Json(name = "custom_gender") String str2, @Nullable @Json(name = "show_gender_on_profile") Boolean bool) {
        this.bio = str;
        this.gender = num;
        this.customGender = str2;
        this.showGenderOnProfile = bool;
    }

    @Nullable
    public final String getBio() {
        return this.bio;
    }

    @Nullable
    public final Integer getGender() {
        return this.gender;
    }

    @Nullable
    public final String getCustomGender() {
        return this.customGender;
    }

    @Nullable
    public final Boolean getShowGenderOnProfile() {
        return this.showGenderOnProfile;
    }
}
