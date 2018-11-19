package com.tinder.domain.profile.model;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/profile/model/ImageUploadRequestFactory;", "", "()V", "fromLocalProfilePhoto", "Lcom/tinder/domain/profile/model/ImageUploadRequest;", "localProfilePhoto", "Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ImageUploadRequestFactory {
    public static final ImageUploadRequestFactory INSTANCE = new ImageUploadRequestFactory();

    private ImageUploadRequestFactory() {
    }

    @NotNull
    public final ImageUploadRequest fromLocalProfilePhoto(@NotNull LocalProfilePhoto localProfilePhoto) {
        C2668g.b(localProfilePhoto, "localProfilePhoto");
        return new ImageUploadRequest(localProfilePhoto.getId(), new File(localProfilePhoto.getUri()));
    }
}
