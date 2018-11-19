package com.tinder.data.adapter;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.request.AddThirdPartyPhotoBody;
import com.tinder.api.request.Asset;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/adapter/PendingFacebookPhotoApiAdapter;", "", "()V", "toApi", "Lcom/tinder/api/request/AddThirdPartyPhotoBody;", "pendingFacebookPhoto", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.adapter.w */
public final class C8617w {
    @NotNull
    /* renamed from: a */
    public final AddThirdPartyPhotoBody m36763a(@NotNull PendingFacebookPhoto pendingFacebookPhoto) {
        C2668g.b(pendingFacebookPhoto, "pendingFacebookPhoto");
        return new AddThirdPartyPhotoBody(ManagerWebServices.PARAM_PHOTOS_SOURCE, C19301m.a(new Asset(pendingFacebookPhoto.getId(), pendingFacebookPhoto.getCroppingInfo().getDistancePercent().getX(), pendingFacebookPhoto.getCroppingInfo().getOffsetPercent().getX(), pendingFacebookPhoto.getCroppingInfo().getDistancePercent().getY(), pendingFacebookPhoto.getCroppingInfo().getOffsetPercent().getY())));
    }
}
