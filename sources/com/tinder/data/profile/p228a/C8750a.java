package com.tinder.data.profile.p228a;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderUserApi;
import com.tinder.api.request.DeleteProfilePhotoBody;
import com.tinder.api.request.OrderProfilePhotosBody;
import com.tinder.api.response.AddThirdPartyPhotoResponse;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.C8617w;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import com.tinder.domain.profile.model.RemoteProfilePhoto;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/profile/photos/ProfilePhotoApiClient;", "", "tinderUserApi", "Lcom/tinder/api/TinderUserApi;", "photoDomainApiAdapter", "Lcom/tinder/data/adapter/PhotoDomainApiAdapter;", "pendingFacebookPhotoApiAdapter", "Lcom/tinder/data/adapter/PendingFacebookPhotoApiAdapter;", "(Lcom/tinder/api/TinderUserApi;Lcom/tinder/data/adapter/PhotoDomainApiAdapter;Lcom/tinder/data/adapter/PendingFacebookPhotoApiAdapter;)V", "addPendingFacebookPhoto", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/common/model/Photo;", "photo", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "changeOrder", "photos", "Lcom/tinder/domain/profile/model/RemoteProfilePhoto;", "delete", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.a.a */
public final class C8750a {
    /* renamed from: a */
    private final TinderUserApi f30737a;
    /* renamed from: b */
    private final C10746z f30738b;
    /* renamed from: c */
    private final C8617w f30739c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/Photo;", "kotlin.jvm.PlatformType", "", "it", "Lcom/tinder/api/response/AddThirdPartyPhotoResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.a$a */
    static final class C10901a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8750a f35599a;

        C10901a(C8750a c8750a) {
            this.f35599a = c8750a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43456a((AddThirdPartyPhotoResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Photo> m43456a(@NotNull AddThirdPartyPhotoResponse addThirdPartyPhotoResponse) {
            C2668g.b(addThirdPartyPhotoResponse, "it");
            return this.f35599a.f30738b.a(addThirdPartyPhotoResponse.getAssets());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012(\u0010\u0005\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u00040\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/Photo;", "kotlin.jvm.PlatformType", "", "it", "Lcom/tinder/api/model/common/Photo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.a$b */
    static final class C10902b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8750a f35600a;

        C10902b(C8750a c8750a) {
            this.f35600a = c8750a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43457a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Photo> m43457a(@NotNull List<com.tinder.api.model.common.Photo> list) {
            C2668g.b(list, "it");
            return this.f35600a.f30738b.a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012(\u0010\u0005\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u00040\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/common/model/Photo;", "kotlin.jvm.PlatformType", "", "it", "Lcom/tinder/api/model/common/Photo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.a$c */
    static final class C10903c<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8750a f35601a;

        C10903c(C8750a c8750a) {
            this.f35601a = c8750a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43458a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<Photo> m43458a(@NotNull List<com.tinder.api.model.common.Photo> list) {
            C2668g.b(list, "it");
            return this.f35601a.f30738b.a(list);
        }
    }

    @Inject
    public C8750a(@NotNull TinderUserApi tinderUserApi, @NotNull C10746z c10746z, @NotNull C8617w c8617w) {
        C2668g.b(tinderUserApi, "tinderUserApi");
        C2668g.b(c10746z, "photoDomainApiAdapter");
        C2668g.b(c8617w, "pendingFacebookPhotoApiAdapter");
        this.f30737a = tinderUserApi;
        this.f30738b = c10746z;
        this.f30739c = c8617w;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<List<Photo>> m37275a(@NotNull List<RemoteProfilePhoto> list) {
        C2668g.b(list, "photos");
        Iterable<RemoteProfilePhoto> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (RemoteProfilePhoto id : iterable) {
            arrayList.add(id.getId());
        }
        list = this.f30737a.setProfilePhotoOrder(new OrderProfilePhotosBody((List) arrayList)).e(new C10902b(this));
        C2668g.a(list, "tinderUserApi.setProfile…ter.fromApi(it)\n        }");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<List<Photo>> m37274a(@NotNull RemoteProfilePhoto remoteProfilePhoto) {
        C2668g.b(remoteProfilePhoto, ManagerWebServices.PARAM_PHOTO);
        remoteProfilePhoto = this.f30737a.deleteProfilePhoto(new DeleteProfilePhotoBody(C19301m.a(remoteProfilePhoto.getId()))).e(new C10903c(this));
        C2668g.a(remoteProfilePhoto, "tinderUserApi.deleteProf…ter.fromApi(it)\n        }");
        return remoteProfilePhoto;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<List<Photo>> m37273a(@NotNull PendingFacebookPhoto pendingFacebookPhoto) {
        C2668g.b(pendingFacebookPhoto, ManagerWebServices.PARAM_PHOTO);
        pendingFacebookPhoto = this.f30737a.addThirdPartyPhoto(this.f30739c.m36763a(pendingFacebookPhoto)).e(new C10901a(this));
        C2668g.a(pendingFacebookPhoto, "tinderUserApi.addThirdPa…mApi(it.assets)\n        }");
        return pendingFacebookPhoto;
    }
}
