package com.tinder.domain.profile.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/tinder/domain/profile/model/ProfilePhoto;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "uri", "getUri", "Factory", "Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "Lcom/tinder/domain/profile/model/RemoteProfilePhoto;", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class ProfilePhoto {
    public static final Factory Factory = new Factory();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/model/ProfilePhoto$Factory;", "", "()V", "fromPhoto", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "photo", "Lcom/tinder/domain/common/model/Photo;", "fromUser", "", "user", "Lcom/tinder/domain/common/model/User;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory {
        private Factory() {
        }

        @NotNull
        public final List<ProfilePhoto> fromUser(@NotNull User user) {
            C2668g.b(user, ManagerWebServices.PARAM_USER);
            List<ProfilePhoto> arrayList = new ArrayList();
            user = user.photos();
            C2668g.a(user, "user.photos()");
            for (Photo photo : (Iterable) user) {
                Factory factory = ProfilePhoto.Factory;
                C2668g.a(photo, ManagerWebServices.PARAM_PHOTO);
                arrayList.add(factory.fromPhoto(photo));
            }
            return arrayList;
        }

        private final ProfilePhoto fromPhoto(Photo photo) {
            String id = photo.id();
            C2668g.a(id, "photo.id()");
            photo = photo.url();
            C2668g.a(photo, "photo.url()");
            return new RemoteProfilePhoto(id, photo);
        }
    }

    @NotNull
    public abstract String getId();

    @Nullable
    public abstract String getUri();

    private ProfilePhoto() {
    }
}
