package com.tinder.domain.profile.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "id", "", "uri", "croppingInfo", "Lcom/tinder/domain/profile/model/CroppingInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/domain/profile/model/CroppingInfo;)V", "getCroppingInfo", "()Lcom/tinder/domain/profile/model/CroppingInfo;", "getId", "()Ljava/lang/String;", "getUri", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PendingFacebookPhoto extends ProfilePhoto {
    @NotNull
    private final CroppingInfo croppingInfo;
    @NotNull
    private final String id;
    @Nullable
    private final String uri;

    @NotNull
    public static /* synthetic */ PendingFacebookPhoto copy$default(PendingFacebookPhoto pendingFacebookPhoto, String str, String str2, CroppingInfo croppingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingFacebookPhoto.getId();
        }
        if ((i & 2) != 0) {
            str2 = pendingFacebookPhoto.getUri();
        }
        if ((i & 4) != 0) {
            croppingInfo = pendingFacebookPhoto.croppingInfo;
        }
        return pendingFacebookPhoto.copy(str, str2, croppingInfo);
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    @Nullable
    public final String component2() {
        return getUri();
    }

    @NotNull
    public final CroppingInfo component3() {
        return this.croppingInfo;
    }

    @NotNull
    public final PendingFacebookPhoto copy(@NotNull String str, @Nullable String str2, @NotNull CroppingInfo croppingInfo) {
        C2668g.b(str, "id");
        C2668g.b(croppingInfo, "croppingInfo");
        return new PendingFacebookPhoto(str, str2, croppingInfo);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PendingFacebookPhoto) {
                PendingFacebookPhoto pendingFacebookPhoto = (PendingFacebookPhoto) obj;
                if (C2668g.a(getId(), pendingFacebookPhoto.getId()) && C2668g.a(getUri(), pendingFacebookPhoto.getUri()) && C2668g.a(this.croppingInfo, pendingFacebookPhoto.croppingInfo)) {
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
        hashCode = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        CroppingInfo croppingInfo = this.croppingInfo;
        if (croppingInfo != null) {
            i = croppingInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PendingFacebookPhoto(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", uri=");
        stringBuilder.append(getUri());
        stringBuilder.append(", croppingInfo=");
        stringBuilder.append(this.croppingInfo);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    public /* synthetic */ PendingFacebookPhoto(String str, String str2, CroppingInfo croppingInfo, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        this(str, str2, croppingInfo);
    }

    @Nullable
    public String getUri() {
        return this.uri;
    }

    @NotNull
    public final CroppingInfo getCroppingInfo() {
        return this.croppingInfo;
    }

    public PendingFacebookPhoto(@NotNull String str, @Nullable String str2, @NotNull CroppingInfo croppingInfo) {
        C2668g.b(str, "id");
        C2668g.b(croppingInfo, "croppingInfo");
        super();
        this.id = str;
        this.uri = str2;
        this.croppingInfo = croppingInfo;
    }
}
