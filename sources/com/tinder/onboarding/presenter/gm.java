package com.tinder.onboarding.presenter;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.tinder.onboarding.interactor.C9965a;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.model.OnboardingPermissions;
import com.tinder.onboarding.target.PhotosStepTarget;
import com.tinder.presenters.PresenterBase;
import com.tinder.scope.ActivityScope;
import java.io.File;
import java.io.IOException;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@ActivityScope
public class gm extends PresenterBase<PhotosStepTarget> {
    @NonNull
    /* renamed from: a */
    private final C9965a f14032a;
    @NonNull
    /* renamed from: b */
    private final OnboardingPermissions f14033b;
    @NonNull
    /* renamed from: c */
    private final OnboardingAnalyticsInteractor f14034c;
    @Nonnull
    /* renamed from: d */
    private final gm$a f14035d = new gm$a(this, null);

    @Inject
    public gm(@NonNull C9965a c9965a, @NonNull OnboardingPermissions onboardingPermissions, @NonNull OnboardingAnalyticsInteractor onboardingAnalyticsInteractor) {
        this.f14032a = c9965a;
        this.f14033b = onboardingPermissions;
        this.f14034c = onboardingAnalyticsInteractor;
    }

    /* renamed from: b */
    public void m17330b() {
        m15094a(gn.f44752a);
        this.f14034c.fireOnboardingViewEvent(OnboardingEventCode.CHOOSE_PHOTO_METHOD);
    }

    /* renamed from: c */
    public void m17332c() {
        m15094a(go.f44753a);
        this.f14034c.fireOnboardingViewEvent(OnboardingEventCode.FROM_CAMERA);
    }

    /* renamed from: a */
    public void m17323a(@NonNull Uri uri) {
        m15094a(new gp(uri));
    }

    /* renamed from: d */
    public void m17334d() {
        m15094a(new gq(this));
        this.f14034c.fireOnboardingViewEvent(OnboardingEventCode.FROM_CAMERA_ROLL);
    }

    /* renamed from: c */
    final /* synthetic */ void m17333c(PhotosStepTarget photosStepTarget) {
        if (this.f14033b.isExtStorageReadPermissionGranted()) {
            m17322h();
        } else {
            photosStepTarget.showExtStorageReadPermissionDialog();
        }
    }

    /* renamed from: a */
    public void m17329a(int[] iArr) {
        PhotosStepTarget photosStepTarget = (PhotosStepTarget) m15090H();
        if (photosStepTarget == null) {
            return;
        }
        if (this.f14033b.isGranted(iArr) != null) {
            m17322h();
        } else {
            photosStepTarget.showPhotoSourceSelector();
        }
    }

    /* renamed from: b */
    public void m17331b(@NonNull Uri uri) {
        PhotosStepTarget photosStepTarget = (PhotosStepTarget) m15090H();
        if (photosStepTarget != null) {
            photosStepTarget.showPhoto(uri);
            photosStepTarget.hideAddPhoto();
        }
    }

    /* renamed from: a */
    public void m17324a(File file) {
        m15094a(gr.f44756a);
        this.f14032a.a(file).m10386b(Schedulers.io()).m10378a(C19397a.a()).m10376a(bindToLifecycle().forCompletable()).m10399d(new gs(this)).m10397c(new gt(this)).m10387b(new gu(this)).m10394b(this.f14035d);
    }

    /* renamed from: g */
    final /* synthetic */ void m17337g() {
        m15094a(gw.f44761a);
    }

    /* renamed from: a */
    final /* synthetic */ void m17327a(Throwable th) {
        m17321b((boolean) null);
    }

    /* renamed from: f */
    final /* synthetic */ void m17336f() {
        m17321b(true);
    }

    /* renamed from: a */
    public void m17325a(IOException iOException) {
        C0001a.m29c(iOException);
        if (((PhotosStepTarget) m15090H()) != null) {
            ((PhotosStepTarget) m15090H()).showErrorMessage(iOException.getMessage());
        }
    }

    /* renamed from: a */
    public void m17326a(Exception exception) {
        C0001a.m29c(exception);
        if (((PhotosStepTarget) m15090H()) != null) {
            ((PhotosStepTarget) m15090H()).showErrorMessage(exception.getMessage());
        }
    }

    /* renamed from: e */
    public void m17335e() {
        PhotosStepTarget photosStepTarget = (PhotosStepTarget) m15090H();
        if (photosStepTarget != null) {
            photosStepTarget.showGalleryUnavailableSnackbarMessage();
        }
    }

    /* renamed from: a */
    public void m17328a(boolean z) {
        if (z) {
            m15094a((Action1) gv.f44760a);
            this.f14034c.fireOnboardingViewEvent(OnboardingEventCode.PHOTO);
        }
    }

    /* renamed from: b */
    private void m17321b(boolean z) {
        this.f14034c.fireOnboardingSubmitEvent(OnboardingEventCode.PHOTO, "", z);
    }

    /* renamed from: h */
    private void m17322h() {
        try {
            ((PhotosStepTarget) m15090H()).showGallery();
        } catch (Throwable e) {
            C0001a.m29c(e);
            m17335e();
        }
    }
}
