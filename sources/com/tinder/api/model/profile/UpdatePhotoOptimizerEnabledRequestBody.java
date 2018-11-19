package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/api/model/profile/UpdatePhotoOptimizerEnabledRequestBody;", "", "photoOptimizerEnabled", "", "(Z)V", "getPhotoOptimizerEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class UpdatePhotoOptimizerEnabledRequestBody {
    private final boolean photoOptimizerEnabled;

    @NotNull
    public static /* synthetic */ UpdatePhotoOptimizerEnabledRequestBody copy$default(UpdatePhotoOptimizerEnabledRequestBody updatePhotoOptimizerEnabledRequestBody, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updatePhotoOptimizerEnabledRequestBody.photoOptimizerEnabled;
        }
        return updatePhotoOptimizerEnabledRequestBody.copy(z);
    }

    public final boolean component1() {
        return this.photoOptimizerEnabled;
    }

    @NotNull
    public final UpdatePhotoOptimizerEnabledRequestBody copy(@Json(name = "photo_optimizer_enabled") boolean z) {
        return new UpdatePhotoOptimizerEnabledRequestBody(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdatePhotoOptimizerEnabledRequestBody) {
            if ((this.photoOptimizerEnabled == ((UpdatePhotoOptimizerEnabledRequestBody) obj).photoOptimizerEnabled ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.photoOptimizerEnabled;
        return z ? 1 : z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UpdatePhotoOptimizerEnabledRequestBody(photoOptimizerEnabled=");
        stringBuilder.append(this.photoOptimizerEnabled);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public UpdatePhotoOptimizerEnabledRequestBody(@Json(name = "photo_optimizer_enabled") boolean z) {
        this.photoOptimizerEnabled = z;
    }

    public final boolean getPhotoOptimizerEnabled() {
        return this.photoOptimizerEnabled;
    }
}
