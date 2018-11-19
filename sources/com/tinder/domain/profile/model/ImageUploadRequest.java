package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/profile/model/ImageUploadRequest;", "", "id", "", "file", "Ljava/io/File;", "(Ljava/lang/String;Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ImageUploadRequest {
    @NotNull
    private final File file;
    @NotNull
    private final String id;

    @NotNull
    public static /* synthetic */ ImageUploadRequest copy$default(ImageUploadRequest imageUploadRequest, String str, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageUploadRequest.id;
        }
        if ((i & 2) != 0) {
            file = imageUploadRequest.file;
        }
        return imageUploadRequest.copy(str, file);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final File component2() {
        return this.file;
    }

    @NotNull
    public final ImageUploadRequest copy(@NotNull String str, @NotNull File file) {
        C2668g.b(str, "id");
        C2668g.b(file, ManagerWebServices.PARAM_FILE);
        return new ImageUploadRequest(str, file);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImageUploadRequest) {
                ImageUploadRequest imageUploadRequest = (ImageUploadRequest) obj;
                if (C2668g.a(this.id, imageUploadRequest.id) && C2668g.a(this.file, imageUploadRequest.file)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        File file = this.file;
        if (file != null) {
            i = file.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImageUploadRequest(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", file=");
        stringBuilder.append(this.file);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ImageUploadRequest(@NotNull String str, @NotNull File file) {
        C2668g.b(str, "id");
        C2668g.b(file, ManagerWebServices.PARAM_FILE);
        this.id = str;
        this.file = file;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }
}
