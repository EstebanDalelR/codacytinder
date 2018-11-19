package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/api/model/profile/TopPhoto;", "", "topPhotoId", "", "(Ljava/lang/String;)V", "getTopPhotoId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class TopPhoto {
    @Nullable
    private final String topPhotoId;

    @NotNull
    public static /* synthetic */ TopPhoto copy$default(TopPhoto topPhoto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topPhoto.topPhotoId;
        }
        return topPhoto.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.topPhotoId;
    }

    @NotNull
    public final TopPhoto copy(@Nullable @Json(name = "id") String str) {
        return new TopPhoto(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TopPhoto) {
                if (C2668g.a(this.topPhotoId, ((TopPhoto) obj).topPhotoId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.topPhotoId;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPhoto(topPhotoId=");
        stringBuilder.append(this.topPhotoId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPhoto(@Nullable @Json(name = "id") String str) {
        this.topPhotoId = str;
    }

    @Nullable
    public final String getTopPhotoId() {
        return this.topPhotoId;
    }
}
