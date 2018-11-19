package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "id", "", "uri", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUri", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LocalProfilePhoto extends ProfilePhoto {
    @NotNull
    private final String id;
    @NotNull
    private final String uri;

    @NotNull
    public static /* synthetic */ LocalProfilePhoto copy$default(LocalProfilePhoto localProfilePhoto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localProfilePhoto.getId();
        }
        if ((i & 2) != 0) {
            str2 = localProfilePhoto.getUri();
        }
        return localProfilePhoto.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    @NotNull
    public final String component2() {
        return getUri();
    }

    @NotNull
    public final LocalProfilePhoto copy(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "id");
        C2668g.b(str2, ManagerWebServices.PARAM_SPOTIFY_URI);
        return new LocalProfilePhoto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalProfilePhoto) {
                LocalProfilePhoto localProfilePhoto = (LocalProfilePhoto) obj;
                if (C2668g.a(getId(), localProfilePhoto.getId()) && C2668g.a(getUri(), localProfilePhoto.getUri())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String id = getId();
        int i = 0;
        int hashCode = (id != null ? id.hashCode() : 0) * 31;
        String uri = getUri();
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocalProfilePhoto(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", uri=");
        stringBuilder.append(getUri());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public String getUri() {
        return this.uri;
    }

    public LocalProfilePhoto(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "id");
        C2668g.b(str2, ManagerWebServices.PARAM_SPOTIFY_URI);
        super();
        this.id = str;
        this.uri = str2;
    }
}
