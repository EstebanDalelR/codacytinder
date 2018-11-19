package com.tinder.account.photos.p074b;

import com.tinder.account.photos.p073a.C3882a;
import com.tinder.account.photos.p073a.C3882a.C2616a;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.ProfilePhoto;
import com.tinder.domain.profile.usecase.DeleteProfilePhoto;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/account/photos/usecase/DeletePhotoFromEditInfo;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/profile/model/ProfilePhoto;", "deleteProfilePhoto", "Lcom/tinder/domain/profile/usecase/DeleteProfilePhoto;", "deletePhotoEvent", "Lcom/tinder/account/photos/analytics/AddProfileDeletePhotoEvent;", "(Lcom/tinder/domain/profile/usecase/DeleteProfilePhoto;Lcom/tinder/account/photos/analytics/AddProfileDeletePhotoEvent;)V", "execute", "Lio/reactivex/Completable;", "request", "account_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.account.photos.b.b */
public final class C3887b implements CompletableUseCase<ProfilePhoto> {
    /* renamed from: a */
    private final DeleteProfilePhoto f12161a;
    /* renamed from: b */
    private final C3882a f12162b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.account.photos.b.b$a */
    static final class C3886a implements Action {
        /* renamed from: a */
        final /* synthetic */ C3887b f12159a;
        /* renamed from: b */
        final /* synthetic */ ProfilePhoto f12160b;

        C3886a(C3887b c3887b, ProfilePhoto profilePhoto) {
            this.f12159a = c3887b;
            this.f12160b = profilePhoto;
        }

        public final void run() {
            this.f12159a.f12162b.m14627a(new C2616a(this.f12160b.getId()));
        }
    }

    @Inject
    public C3887b(@NotNull DeleteProfilePhoto deleteProfilePhoto, @NotNull C3882a c3882a) {
        C2668g.m10309b(deleteProfilePhoto, "deleteProfilePhoto");
        C2668g.m10309b(c3882a, "deletePhotoEvent");
        this.f12161a = deleteProfilePhoto;
        this.f12162b = c3882a;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m14633a((ProfilePhoto) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m14633a(@NotNull ProfilePhoto profilePhoto) {
        C2668g.m10309b(profilePhoto, "request");
        Object b = this.f12161a.execute(profilePhoto).m15295b((Action) new C3886a(this, profilePhoto));
        C2668g.m10305a(b, "deleteProfilePhoto.execu…st(request.id))\n        }");
        return b;
    }
}
