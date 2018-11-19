package com.tinder.data.profile;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.api.model.profile.ImageUploadResponse;
import com.tinder.data.adapter.C10746z;
import com.tinder.domain.profile.model.ImageUploadRequest;
import com.tinder.domain.profile.model.ImageUploadResult;
import com.tinder.domain.profile.usecase.ProfileImageUploader;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import okhttp3.C15958m;
import okhttp3.C15964r;
import okhttp3.C17690n.C15960b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/data/profile/ApiProfileImageUploader;", "Lcom/tinder/domain/profile/usecase/ProfileImageUploader;", "tinderApi", "Lcom/tinder/api/TinderApi;", "photoDomainApiAdapter", "Lcom/tinder/data/adapter/PhotoDomainApiAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/adapter/PhotoDomainApiAdapter;)V", "upload", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/ImageUploadResult;", "request", "Lcom/tinder/domain/profile/model/ImageUploadRequest;", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.c */
public final class C10928c implements ProfileImageUploader {
    /* renamed from: a */
    public static final C8755a f35627a = new C8755a();
    /* renamed from: d */
    private static final C15958m f35628d = C15958m.a("image/jpeg");
    /* renamed from: b */
    private final TinderApi f35629b;
    /* renamed from: c */
    private final C10746z f35630c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/profile/ApiProfileImageUploader$Companion;", "", "()V", "IMAGE_MEDIA_TYPE", "Lokhttp3/MediaType;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.c$a */
    public static final class C8755a {
        private C8755a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/profile/model/ImageUploadResult;", "<name for destructuring parameter 0>", "Lcom/tinder/api/model/profile/ImageUploadResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.c$b */
    static final class C10927b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10928c f35626a;

        C10927b(C10928c c10928c) {
            this.f35626a = c10928c;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43523a((ImageUploadResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final ImageUploadResult m43523a(@NotNull ImageUploadResponse imageUploadResponse) {
            C2668g.b(imageUploadResponse, "<name for destructuring parameter 0>");
            List component1 = imageUploadResponse.component1();
            imageUploadResponse = imageUploadResponse.component2();
            component1 = this.f35626a.f35630c.a(component1);
            C2668g.a(component1, "photos");
            return new ImageUploadResult(component1, imageUploadResponse);
        }
    }

    @Inject
    public C10928c(@NotNull TinderApi tinderApi, @NotNull C10746z c10746z) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10746z, "photoDomainApiAdapter");
        this.f35629b = tinderApi;
        this.f35630c = c10746z;
    }

    @NotNull
    public C3960g<ImageUploadResult> upload(@NotNull ImageUploadRequest imageUploadRequest) {
        C2668g.b(imageUploadRequest, "request");
        imageUploadRequest = this.f35629b.uploadPhoto(imageUploadRequest.getId(), C15960b.a(ManagerWebServices.PARAM_FILE, imageUploadRequest.getFile().getName(), C15964r.create(f35628d, imageUploadRequest.getFile()))).e(new C10927b(this));
        C2668g.a(imageUploadRequest, "tinderApi.uploadPhoto(re…s, photoId)\n            }");
        return imageUploadRequest;
    }
}
