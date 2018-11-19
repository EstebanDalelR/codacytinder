package com.tinder.api.request;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/request/DeleteProfilePhotoBody;", "", "photoIds", "", "", "(Ljava/util/List;)V", "getPhotoIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteProfilePhotoBody {
    @NotNull
    private final List<String> photoIds;

    @NotNull
    public static /* synthetic */ DeleteProfilePhotoBody copy$default(DeleteProfilePhotoBody deleteProfilePhotoBody, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deleteProfilePhotoBody.photoIds;
        }
        return deleteProfilePhotoBody.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.photoIds;
    }

    @NotNull
    public final DeleteProfilePhotoBody copy(@NotNull @Json(name = "assets") List<String> list) {
        C2668g.b(list, "photoIds");
        return new DeleteProfilePhotoBody(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeleteProfilePhotoBody) {
                if (C2668g.a(this.photoIds, ((DeleteProfilePhotoBody) obj).photoIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.photoIds;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeleteProfilePhotoBody(photoIds=");
        stringBuilder.append(this.photoIds);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DeleteProfilePhotoBody(@NotNull @Json(name = "assets") List<String> list) {
        C2668g.b(list, "photoIds");
        this.photoIds = list;
    }

    @NotNull
    public final List<String> getPhotoIds() {
        return this.photoIds;
    }
}
