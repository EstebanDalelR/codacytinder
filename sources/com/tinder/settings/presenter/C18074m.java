package com.tinder.settings.presenter;

import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import com.tinder.domain.profile.model.ProfileUserUpdateRequest;
import com.tinder.domain.profile.usecase.UpdateProfile;
import com.tinder.presenters.PresenterBase;
import com.tinder.settings.targets.MoreGenderSearchTarget;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/settings/presenter/GenderSearchActivityPresenter;", "Lcom/tinder/presenters/PresenterBase;", "Lcom/tinder/settings/targets/MoreGenderSearchTarget;", "updateProfile", "Lcom/tinder/domain/profile/usecase/UpdateProfile;", "(Lcom/tinder/domain/profile/usecase/UpdateProfile;)V", "saveGender", "", "gender", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.presenter.m */
public final class C18074m extends PresenterBase<MoreGenderSearchTarget> {
    /* renamed from: a */
    private final UpdateProfile f56124a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/tinder/domain/profile/model/EditProfileUpdateStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.m$a */
    static final class C16656a<T> implements Consumer<EditProfileUpdateStatus> {
        /* renamed from: a */
        final /* synthetic */ C18074m f51574a;

        C16656a(C18074m c18074m) {
            this.f51574a = c18074m;
        }

        public /* synthetic */ void accept(Object obj) {
            m62144a((EditProfileUpdateStatus) obj);
        }

        /* renamed from: a */
        public final void m62144a(EditProfileUpdateStatus editProfileUpdateStatus) {
            MoreGenderSearchTarget moreGenderSearchTarget = (MoreGenderSearchTarget) this.f51574a.H();
            if (moreGenderSearchTarget != null) {
                moreGenderSearchTarget.saveMoreGenderSuccess();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.m$b */
    static final class C16657b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C18074m f51575a;

        C16657b(C18074m c18074m) {
            this.f51575a = c18074m;
        }

        public /* synthetic */ void accept(Object obj) {
            m62145a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62145a(Throwable th) {
            C0001a.c(th, "Error saving custom gender", new Object[0]);
            MoreGenderSearchTarget moreGenderSearchTarget = (MoreGenderSearchTarget) this.f51575a.H();
            if (moreGenderSearchTarget != null) {
                moreGenderSearchTarget.saveMoreGenderError();
            }
        }
    }

    @Inject
    public C18074m(@NotNull UpdateProfile updateProfile) {
        C2668g.b(updateProfile, "updateProfile");
        this.f56124a = updateProfile;
    }

    /* renamed from: a */
    public final void m65588a(@Nullable String str) {
        this.f56124a.execute(new ProfileUserUpdateRequest(null, null, str, null, 11, null)).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16656a(this), new C16657b(this));
    }
}
