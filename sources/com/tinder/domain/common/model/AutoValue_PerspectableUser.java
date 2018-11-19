package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import java.util.List;

final class AutoValue_PerspectableUser extends PerspectableUser {
    private final List<Interest> commmonInterests;
    private final List<CommonConnection> commonConnections;
    private final int distanceMiles;
    private final ProfileUser profileUser;

    static final class Builder extends com.tinder.domain.common.model.PerspectableUser.Builder {
        private List<Interest> commmonInterests;
        private List<CommonConnection> commonConnections;
        private Integer distanceMiles;
        private ProfileUser profileUser;

        Builder() {
        }

        Builder(PerspectableUser perspectableUser) {
            this.profileUser = perspectableUser.profileUser();
            this.commonConnections = perspectableUser.commonConnections();
            this.commmonInterests = perspectableUser.commmonInterests();
            this.distanceMiles = Integer.valueOf(perspectableUser.distanceMiles());
        }

        public com.tinder.domain.common.model.PerspectableUser.Builder profileUser(ProfileUser profileUser) {
            this.profileUser = profileUser;
            return this;
        }

        public com.tinder.domain.common.model.PerspectableUser.Builder commonConnections(List<CommonConnection> list) {
            this.commonConnections = list;
            return this;
        }

        public com.tinder.domain.common.model.PerspectableUser.Builder commmonInterests(List<Interest> list) {
            this.commmonInterests = list;
            return this;
        }

        public com.tinder.domain.common.model.PerspectableUser.Builder distanceMiles(int i) {
            this.distanceMiles = Integer.valueOf(i);
            return this;
        }

        public PerspectableUser build() {
            String str = "";
            if (this.profileUser == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" profileUser");
                str = stringBuilder.toString();
            }
            if (this.commonConnections == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" commonConnections");
                str = stringBuilder.toString();
            }
            if (this.commmonInterests == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" commmonInterests");
                str = stringBuilder.toString();
            }
            if (this.distanceMiles == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" distanceMiles");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PerspectableUser(this.profileUser, this.commonConnections, this.commmonInterests, this.distanceMiles.intValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_PerspectableUser(ProfileUser profileUser, List<CommonConnection> list, List<Interest> list2, int i) {
        this.profileUser = profileUser;
        this.commonConnections = list;
        this.commmonInterests = list2;
        this.distanceMiles = i;
    }

    @NonNull
    public ProfileUser profileUser() {
        return this.profileUser;
    }

    @NonNull
    public List<CommonConnection> commonConnections() {
        return this.commonConnections;
    }

    @NonNull
    public List<Interest> commmonInterests() {
        return this.commmonInterests;
    }

    public int distanceMiles() {
        return this.distanceMiles;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PerspectableUser{profileUser=");
        stringBuilder.append(this.profileUser);
        stringBuilder.append(", commonConnections=");
        stringBuilder.append(this.commonConnections);
        stringBuilder.append(", commmonInterests=");
        stringBuilder.append(this.commmonInterests);
        stringBuilder.append(", distanceMiles=");
        stringBuilder.append(this.distanceMiles);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerspectableUser)) {
            return false;
        }
        PerspectableUser perspectableUser = (PerspectableUser) obj;
        if (!this.profileUser.equals(perspectableUser.profileUser()) || !this.commonConnections.equals(perspectableUser.commonConnections()) || !this.commmonInterests.equals(perspectableUser.commmonInterests()) || this.distanceMiles != perspectableUser.distanceMiles()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.profileUser.hashCode() ^ 1000003) * 1000003) ^ this.commonConnections.hashCode()) * 1000003) ^ this.commmonInterests.hashCode()) * 1000003) ^ this.distanceMiles;
    }

    public com.tinder.domain.common.model.PerspectableUser.Builder toBuilder() {
        return new Builder(this);
    }
}
