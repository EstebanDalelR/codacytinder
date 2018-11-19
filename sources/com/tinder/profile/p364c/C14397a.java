package com.tinder.profile.p364c;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.profile.model.ImageUploadRequest;
import com.tinder.domain.profile.model.ImageUploadResult;
import com.tinder.domain.profile.usecase.ProfileImageUploader;
import com.tinder.model.ProfilePhoto;
import com.tinder.profile.adapters.C14366i;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/profile/usecase/LegacyUploadProfilePhoto;", "", "imageUploader", "Lcom/tinder/domain/profile/usecase/ProfileImageUploader;", "adapter", "Lcom/tinder/profile/adapters/LegacyProfilePhotoAdapter;", "(Lcom/tinder/domain/profile/usecase/ProfileImageUploader;Lcom/tinder/profile/adapters/LegacyProfilePhotoAdapter;)V", "execute", "Lio/reactivex/Single;", "", "Lcom/tinder/model/ProfilePhoto;", "request", "Lcom/tinder/domain/profile/model/ImageUploadRequest;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.profile.c.a */
public final class C14397a {
    /* renamed from: a */
    private final ProfileImageUploader f45589a;
    /* renamed from: b */
    private final C14366i f45590b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lcom/tinder/domain/common/model/Photo;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/domain/profile/model/ImageUploadResult;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.c.a$a */
    static final class C16094a<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        public static final C16094a f50037a = new C16094a();

        C16094a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60897a((ImageUploadResult) obj);
        }

        /* renamed from: a */
        public final C3959e<Photo> m60897a(@NotNull ImageUploadResult imageUploadResult) {
            C2668g.b(imageUploadResult, "it");
            return C3959e.fromIterable(imageUploadResult.getPhotos());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/model/ProfilePhoto;", "it", "Lcom/tinder/domain/common/model/Photo;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.c.a$b */
    static final class C16095b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14397a f50038a;

        C16095b(C14397a c14397a) {
            this.f50038a = c14397a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m60898a((Photo) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ProfilePhoto m60898a(@NotNull Photo photo) {
            C2668g.b(photo, "it");
            return this.f50038a.f45590b.m54715a(photo);
        }
    }

    @Inject
    public C14397a(@NotNull ProfileImageUploader profileImageUploader, @NotNull C14366i c14366i) {
        C2668g.b(profileImageUploader, "imageUploader");
        C2668g.b(c14366i, "adapter");
        this.f45589a = profileImageUploader;
        this.f45590b = c14366i;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<List<ProfilePhoto>> m54829a(@NotNull ImageUploadRequest imageUploadRequest) {
        C2668g.b(imageUploadRequest, "request");
        imageUploadRequest = this.f45589a.upload(imageUploadRequest).c(C16094a.f50037a).map(new C16095b(this)).toList();
        C2668g.a(imageUploadRequest, "imageUploader.upload(req…) }\n            .toList()");
        return imageUploadRequest;
    }
}
