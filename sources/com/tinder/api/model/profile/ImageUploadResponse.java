package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.Photo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/profile/ImageUploadResponse;", "", "photos", "", "Lcom/tinder/api/model/common/Photo;", "photoId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getPhotoId", "()Ljava/lang/String;", "getPhotos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ImageUploadResponse {
    @NotNull
    private final String photoId;
    @NotNull
    private final List<Photo> photos;

    @NotNull
    public static /* synthetic */ ImageUploadResponse copy$default(ImageUploadResponse imageUploadResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imageUploadResponse.photos;
        }
        if ((i & 2) != 0) {
            str = imageUploadResponse.photoId;
        }
        return imageUploadResponse.copy(list, str);
    }

    @NotNull
    public final List<Photo> component1() {
        return this.photos;
    }

    @NotNull
    public final String component2() {
        return this.photoId;
    }

    @NotNull
    public final ImageUploadResponse copy(@NotNull @Json(name = "assets") List<? extends Photo> list, @NotNull @Json(name = "client_photo_id") String str) {
        C2668g.b(list, "photos");
        C2668g.b(str, "photoId");
        return new ImageUploadResponse(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImageUploadResponse) {
                ImageUploadResponse imageUploadResponse = (ImageUploadResponse) obj;
                if (C2668g.a(this.photos, imageUploadResponse.photos) && C2668g.a(this.photoId, imageUploadResponse.photoId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.photos;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.photoId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImageUploadResponse(photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", photoId=");
        stringBuilder.append(this.photoId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ImageUploadResponse(@NotNull @Json(name = "assets") List<? extends Photo> list, @NotNull @Json(name = "client_photo_id") String str) {
        C2668g.b(list, "photos");
        C2668g.b(str, "photoId");
        this.photos = list;
        this.photoId = str;
    }

    @NotNull
    public final List<Photo> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final String getPhotoId() {
        return this.photoId;
    }
}
