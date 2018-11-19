package com.tinder.domain.profile.model;

import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileDataRequest;", "", "components", "", "Lcom/tinder/domain/profile/model/ProfileOption;", "(Ljava/util/List;)V", "getComponents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileDataRequest {
    public static final Companion Companion = new Companion();
    @NotNull
    private final List<ProfileOption<?>> components;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00002\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileDataRequest$Builder;", "", "()V", "list", "Ljava/util/LinkedList;", "Lcom/tinder/domain/profile/model/ProfileOption;", "build", "Lcom/tinder/domain/profile/model/ProfileDataRequest;", "with", "component", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Builder {
        private final LinkedList<ProfileOption<?>> list = new LinkedList();

        @NotNull
        public final Builder with(@NotNull ProfileOption<?> profileOption) {
            C2668g.b(profileOption, "component");
            this.list.add(profileOption);
            return this;
        }

        @NotNull
        public final ProfileDataRequest build() {
            if (!this.list.isEmpty()) {
                return new ProfileDataRequest(this.list);
            }
            throw new IllegalArgumentException("Request user components are empty.");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/profile/model/ProfileDataRequest$Companion;", "", "()V", "builder", "Lcom/tinder/domain/profile/model/ProfileDataRequest$Builder;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return Companion.builder();
    }

    @NotNull
    public static /* synthetic */ ProfileDataRequest copy$default(ProfileDataRequest profileDataRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profileDataRequest.components;
        }
        return profileDataRequest.copy(list);
    }

    @NotNull
    public final List<ProfileOption<?>> component1() {
        return this.components;
    }

    @NotNull
    public final ProfileDataRequest copy(@NotNull List<? extends ProfileOption<?>> list) {
        C2668g.b(list, "components");
        return new ProfileDataRequest(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileDataRequest) {
                if (C2668g.a(this.components, ((ProfileDataRequest) obj).components)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.components;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileDataRequest(components=");
        stringBuilder.append(this.components);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ProfileDataRequest(@NotNull List<? extends ProfileOption<?>> list) {
        C2668g.b(list, "components");
        this.components = list;
    }

    @NotNull
    public final List<ProfileOption<?>> getComponents() {
        return this.components;
    }
}
