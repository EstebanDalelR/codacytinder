package com.tinder.data.profile.p228a;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.profile.p331b.C10926a;
import com.tinder.data.profile.persistence.C10961b;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.profile.model.ImageUploadRequest;
import com.tinder.domain.profile.model.ImageUploadRequestFactory;
import com.tinder.domain.profile.model.ImageUploadResult;
import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import com.tinder.domain.profile.model.ProfileOption.TopPhoto;
import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.model.RemoteProfilePhoto;
import com.tinder.domain.profile.model.settings.TopPhotoSettings;
import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.ProfileImageUploader;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\u0015H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/data/profile/photos/ProfilePhotoDataRepository;", "Lcom/tinder/domain/profile/repository/ProfilePhotoRepository;", "getCurrentUserProfilePhotos", "Lcom/tinder/data/profile/usecase/GetCurrentUserProfilePhotos;", "client", "Lcom/tinder/data/profile/photos/ProfilePhotoApiClient;", "persistProfilePhotos", "Lcom/tinder/data/profile/persistence/PersistProfilePhotos;", "profileImageUploader", "Lcom/tinder/domain/profile/usecase/ProfileImageUploader;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Lcom/tinder/data/profile/usecase/GetCurrentUserProfilePhotos;Lcom/tinder/data/profile/photos/ProfilePhotoApiClient;Lcom/tinder/data/profile/persistence/PersistProfilePhotos;Lcom/tinder/domain/profile/usecase/ProfileImageUploader;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "addPendingFacebookPhoto", "Lio/reactivex/Completable;", "pendingFacebookPhoto", "Lcom/tinder/domain/profile/model/PendingFacebookPhoto;", "delete", "profilePhoto", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "observe", "Lio/reactivex/Observable;", "", "observeTopPhotoSettings", "Lcom/tinder/domain/profile/model/settings/TopPhotoSettings;", "updateOrder", "photo", "upload", "Lcom/tinder/domain/profile/model/LocalProfilePhoto;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.a.c */
public final class C10912c implements ProfilePhotoRepository {
    /* renamed from: a */
    private final C10926a f35610a;
    /* renamed from: b */
    private final C8750a f35611b;
    /* renamed from: c */
    private final C10961b f35612c;
    /* renamed from: d */
    private final ProfileImageUploader f35613d;
    /* renamed from: e */
    private final LoadProfileOptionData f35614e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/RemoteProfilePhoto;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$b */
    static final class C8751b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ ProfilePhoto f30740a;

        C8751b(ProfilePhoto profilePhoto) {
            this.f30740a = profilePhoto;
        }

        public /* synthetic */ Object call() {
            return m37276a();
        }

        @NotNull
        /* renamed from: a */
        public final RemoteProfilePhoto m37276a() {
            ProfilePhoto profilePhoto = this.f30740a;
            if (profilePhoto != null) {
                return (RemoteProfilePhoto) profilePhoto;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.profile.model.RemoteProfilePhoto");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/ImageUploadRequest;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$h */
    static final class C8752h<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ LocalProfilePhoto f30741a;

        C8752h(LocalProfilePhoto localProfilePhoto) {
            this.f30741a = localProfilePhoto;
        }

        public /* synthetic */ Object call() {
            return m37277a();
        }

        @NotNull
        /* renamed from: a */
        public final ImageUploadRequest m37277a() {
            return ImageUploadRequestFactory.INSTANCE.fromLocalProfilePhoto(this.f30741a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "Lcom/tinder/domain/common/model/Photo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$a */
    static final class C10904a<T, R> implements Function<List<? extends Photo>, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10912c f35602a;

        C10904a(C10912c c10912c) {
            this.f35602a = c10912c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43459a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43459a(@NotNull List<? extends Photo> list) {
            C2668g.b(list, "it");
            return this.f35602a.f35612c.m43557a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/common/model/Photo;", "it", "Lcom/tinder/domain/profile/model/RemoteProfilePhoto;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$c */
    static final class C10905c<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10912c f35603a;

        C10905c(C10912c c10912c) {
            this.f35603a = c10912c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43460a((RemoteProfilePhoto) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<List<Photo>> m43460a(@NotNull RemoteProfilePhoto remoteProfilePhoto) {
            C2668g.b(remoteProfilePhoto, "it");
            return this.f35603a.f35611b.m37274a(remoteProfilePhoto);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "Lcom/tinder/domain/common/model/Photo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$d */
    static final class C10906d<T, R> implements Function<List<? extends Photo>, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10912c f35604a;

        C10906d(C10912c c10912c) {
            this.f35604a = c10912c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43461a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43461a(@NotNull List<? extends Photo> list) {
            C2668g.b(list, "it");
            return this.f35604a.f35612c.m43557a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/profile/model/RemoteProfilePhoto;", "it", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$e */
    static final class C10907e<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10907e f35605a = new C10907e();

        C10907e() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43462a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<RemoteProfilePhoto> m43462a(@NotNull List<? extends ProfilePhoto> list) {
            C2668g.b(list, "it");
            Iterable<ProfilePhoto> iterable = list;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            for (ProfilePhoto profilePhoto : iterable) {
                if (profilePhoto == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.profile.model.RemoteProfilePhoto");
                }
                arrayList.add((RemoteProfilePhoto) profilePhoto);
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/common/model/Photo;", "it", "Lcom/tinder/domain/profile/model/RemoteProfilePhoto;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$f */
    static final class C10908f<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10912c f35606a;

        C10908f(C10912c c10912c) {
            this.f35606a = c10912c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43463a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<List<Photo>> m43463a(@NotNull List<RemoteProfilePhoto> list) {
            C2668g.b(list, "it");
            return this.f35606a.f35611b.m37275a((List) list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "photos", "", "Lcom/tinder/domain/common/model/Photo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$g */
    static final class C10909g<T, R> implements Function<List<? extends Photo>, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10912c f35607a;

        C10909g(C10912c c10912c) {
            this.f35607a = c10912c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43464a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43464a(@NotNull List<? extends Photo> list) {
            C2668g.b(list, "photos");
            return this.f35607a.f35612c.m43557a(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/ImageUploadResult;", "it", "Lcom/tinder/domain/profile/model/ImageUploadRequest;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$i */
    static final class C10910i<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10912c f35608a;

        C10910i(C10912c c10912c) {
            this.f35608a = c10912c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43465a((ImageUploadRequest) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<ImageUploadResult> m43465a(@NotNull ImageUploadRequest imageUploadRequest) {
            C2668g.b(imageUploadRequest, "it");
            return this.f35608a.f35613d.upload(imageUploadRequest);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/domain/profile/model/ImageUploadResult;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a.c$j */
    static final class C10911j<T, R> implements Function<ImageUploadResult, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C10912c f35609a;

        C10911j(C10912c c10912c) {
            this.f35609a = c10912c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43466a((ImageUploadResult) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43466a(@NotNull ImageUploadResult imageUploadResult) {
            C2668g.b(imageUploadResult, "it");
            return this.f35609a.f35612c.m43557a(imageUploadResult.getPhotos());
        }
    }

    @Inject
    public C10912c(@NotNull C10926a c10926a, @NotNull C8750a c8750a, @NotNull C10961b c10961b, @NotNull ProfileImageUploader profileImageUploader, @NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.b(c10926a, "getCurrentUserProfilePhotos");
        C2668g.b(c8750a, "client");
        C2668g.b(c10961b, "persistProfilePhotos");
        C2668g.b(profileImageUploader, "profileImageUploader");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        this.f35610a = c10926a;
        this.f35611b = c8750a;
        this.f35612c = c10961b;
        this.f35613d = profileImageUploader;
        this.f35614e = loadProfileOptionData;
    }

    @NotNull
    public C3959e<List<ProfilePhoto>> observe() {
        return this.f35610a.execute();
    }

    @NotNull
    public C3959e<TopPhotoSettings> observeTopPhotoSettings() {
        return this.f35614e.execute(TopPhoto.INSTANCE);
    }

    @NotNull
    public C3956a updateOrder(@NotNull List<? extends ProfilePhoto> list) {
        C2668g.b(list, ManagerWebServices.PARAM_PHOTO);
        list = C3960g.a(list).e(C10907e.f35605a).a(new C10908f(this)).d(new C10909g(this));
        C2668g.a(list, "Single.just(photo).map {…ute(photos)\n            }");
        return list;
    }

    @NotNull
    public C3956a upload(@NotNull LocalProfilePhoto localProfilePhoto) {
        C2668g.b(localProfilePhoto, ManagerWebServices.PARAM_PHOTO);
        localProfilePhoto = C3960g.c(new C8752h(localProfilePhoto)).a(new C10910i(this)).d(new C10911j(this));
        C2668g.a(localProfilePhoto, "Single.fromCallable { Im…otos.execute(it.photos) }");
        return localProfilePhoto;
    }

    @NotNull
    public C3956a delete(@NotNull ProfilePhoto profilePhoto) {
        C2668g.b(profilePhoto, "profilePhoto");
        profilePhoto = C3960g.c(new C8751b(profilePhoto)).a(new C10905c(this)).d(new C10906d(this));
        C2668g.a(profilePhoto, "Single.fromCallable { pr…execute(it)\n            }");
        return profilePhoto;
    }

    @NotNull
    public C3956a addPendingFacebookPhoto(@NotNull PendingFacebookPhoto pendingFacebookPhoto) {
        C2668g.b(pendingFacebookPhoto, "pendingFacebookPhoto");
        pendingFacebookPhoto = this.f35611b.m37273a(pendingFacebookPhoto).d(new C10904a(this));
        C2668g.a(pendingFacebookPhoto, "client.addPendingFaceboo…ofilePhotos.execute(it) }");
        return pendingFacebookPhoto;
    }
}
