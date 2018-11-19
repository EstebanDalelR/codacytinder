package com.tinder.domain.profile.model;

import com.tinder.domain.common.model.Gender.Value;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\u0006\u0010\u001b\u001a\u00020\bJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileUserUpdateRequest;", "Lcom/tinder/domain/profile/model/ProfileUpdateRequest;", "bio", "", "gender", "Lcom/tinder/domain/common/model/Gender$Value;", "customGender", "showGenderOnProfile", "", "(Ljava/lang/String;Lcom/tinder/domain/common/model/Gender$Value;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBio", "()Ljava/lang/String;", "getCustomGender", "getGender", "()Lcom/tinder/domain/common/model/Gender$Value;", "getShowGenderOnProfile", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/tinder/domain/common/model/Gender$Value;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/tinder/domain/profile/model/ProfileUserUpdateRequest;", "equals", "other", "", "hasChanges", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileUserUpdateRequest extends ProfileUpdateRequest {
    @Nullable
    private final String bio;
    @Nullable
    private final String customGender;
    @Nullable
    private final Value gender;
    @Nullable
    private final Boolean showGenderOnProfile;

    public ProfileUserUpdateRequest() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public static /* synthetic */ ProfileUserUpdateRequest copy$default(ProfileUserUpdateRequest profileUserUpdateRequest, String str, Value value, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileUserUpdateRequest.bio;
        }
        if ((i & 2) != 0) {
            value = profileUserUpdateRequest.gender;
        }
        if ((i & 4) != 0) {
            str2 = profileUserUpdateRequest.customGender;
        }
        if ((i & 8) != 0) {
            bool = profileUserUpdateRequest.showGenderOnProfile;
        }
        return profileUserUpdateRequest.copy(str, value, str2, bool);
    }

    @Nullable
    public final String component1() {
        return this.bio;
    }

    @Nullable
    public final Value component2() {
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
    public final ProfileUserUpdateRequest copy(@Nullable String str, @Nullable Value value, @Nullable String str2, @Nullable Boolean bool) {
        return new ProfileUserUpdateRequest(str, value, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileUserUpdateRequest) {
                ProfileUserUpdateRequest profileUserUpdateRequest = (ProfileUserUpdateRequest) obj;
                if (C2668g.a(this.bio, profileUserUpdateRequest.bio) && C2668g.a(this.gender, profileUserUpdateRequest.gender) && C2668g.a(this.customGender, profileUserUpdateRequest.customGender) && C2668g.a(this.showGenderOnProfile, profileUserUpdateRequest.showGenderOnProfile)) {
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
        Value value = this.gender;
        hashCode = (hashCode + (value != null ? value.hashCode() : 0)) * 31;
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
        stringBuilder.append("ProfileUserUpdateRequest(bio=");
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

    public /* synthetic */ ProfileUserUpdateRequest(String str, Value value, String str2, Boolean bool, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            str = null;
        }
        if ((i & 2) != null) {
            value = null;
        }
        if ((i & 4) != null) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        this(str, value, str2, bool);
    }

    @Nullable
    public final String getBio() {
        return this.bio;
    }

    @Nullable
    public final Value getGender() {
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

    public ProfileUserUpdateRequest(@Nullable String str, @Nullable Value value, @Nullable String str2, @Nullable Boolean bool) {
        super();
        this.bio = str;
        this.gender = value;
        this.customGender = str2;
        this.showGenderOnProfile = bool;
    }

    public final boolean hasChanges() {
        if (this.bio == null && this.gender == null && this.customGender == null) {
            if (this.showGenderOnProfile == null) {
                return false;
            }
        }
        return true;
    }
}
