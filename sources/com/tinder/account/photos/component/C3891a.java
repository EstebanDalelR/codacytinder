package com.tinder.account.photos.component;

import com.tinder.account.photos.C2619b;
import com.tinder.account.photos.C3883a;
import com.tinder.account.photos.CurrentUserPhotosView;
import com.tinder.account.photos.component.AccountComponent.Parent;
import com.tinder.account.photos.p073a.C3882a;
import com.tinder.account.photos.p074b.C3885a;
import com.tinder.account.photos.p074b.C3887b;
import com.tinder.account.photos.p074b.C3889c;
import com.tinder.account.photos.photogrid.analytics.AddProfileAddPhotoEvent;
import com.tinder.account.photos.photogrid.p075a.C2624a;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.permissions.IsExternalReadPermissionGranted;
import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import com.tinder.domain.profile.usecase.AddPendingFacebookPhoto;
import com.tinder.domain.profile.usecase.DeleteProfilePhoto;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos;
import com.tinder.domain.profile.usecase.SaveSmartPhotosSettings;
import com.tinder.domain.profile.usecase.UpdateProfilePhotoOrder;
import com.tinder.domain.profile.usecase.UploadPhoto;
import dagger.internal.C15521i;

/* renamed from: com.tinder.account.photos.component.a */
public final class C3891a implements AccountComponent {
    /* renamed from: a */
    private Parent f12169a;

    /* renamed from: com.tinder.account.photos.component.a$a */
    public static final class C2621a {
        /* renamed from: a */
        private Parent f8162a;

        private C2621a() {
        }

        /* renamed from: a */
        public AccountComponent m9797a() {
            if (this.f8162a != null) {
                return new C3891a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2621a m9798a(Parent parent) {
            this.f8162a = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3891a(C2621a c2621a) {
        m14638a(c2621a);
    }

    /* renamed from: a */
    public static C2621a m14637a() {
        return new C2621a();
    }

    /* renamed from: b */
    private ObserveProfilePhotos m14639b() {
        return new ObserveProfilePhotos((ProfilePhotoRepository) C15521i.a(this.f12169a.profilePhotoRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: c */
    private UpdateProfilePhotoOrder m14640c() {
        return new UpdateProfilePhotoOrder((ProfilePhotoRepository) C15521i.a(this.f12169a.profilePhotoRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: d */
    private UploadPhoto m14641d() {
        return new UploadPhoto((ProfilePhotoRepository) C15521i.a(this.f12169a.profilePhotoRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: e */
    private AddProfileAddPhotoEvent m14642e() {
        return new AddProfileAddPhotoEvent((C2630h) C15521i.a(this.f12169a.fireworks(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: f */
    private C3889c m14643f() {
        return new C3889c(m14641d(), m14642e());
    }

    /* renamed from: g */
    private DeleteProfilePhoto m14644g() {
        return new DeleteProfilePhoto((ProfilePhotoRepository) C15521i.a(this.f12169a.profilePhotoRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: h */
    private C3882a m14645h() {
        return new C3882a((C2630h) C15521i.a(this.f12169a.fireworks(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: i */
    private C3887b m14646i() {
        return new C3887b(m14644g(), m14645h());
    }

    /* renamed from: j */
    private AddPendingFacebookPhoto m14647j() {
        return new AddPendingFacebookPhoto((ProfilePhotoRepository) C15521i.a(this.f12169a.profilePhotoRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: k */
    private C3885a m14648k() {
        return new C3885a(m14647j(), m14642e());
    }

    /* renamed from: l */
    private LoadProfileOptionData m14649l() {
        return new LoadProfileOptionData((ProfileLocalRepository) C15521i.a(this.f12169a.profileLocalRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: m */
    private SaveSmartPhotosSettings m14650m() {
        return new SaveSmartPhotosSettings((ProfileRemoteRepository) C15521i.a(this.f12169a.profileRemoteRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: n */
    private C2624a m14651n() {
        return new C2624a(m14639b(), m14640c(), (IsExternalReadPermissionGranted) C15521i.a(this.f12169a.isExternalReadPermissionGranted(), "Cannot return null from a non-@Nullable component method"), m14643f(), m14646i(), m14648k(), (MaxPhotoExperiment) C15521i.a(this.f12169a.MaxPhotoExperiment(), "Cannot return null from a non-@Nullable component method"), new C2619b(), m14649l(), m14650m());
    }

    /* renamed from: a */
    private void m14638a(C2621a c2621a) {
        this.f12169a = c2621a.f8162a;
    }

    public void inject(CurrentUserPhotosView currentUserPhotosView) {
        m14636a(currentUserPhotosView);
    }

    /* renamed from: a */
    private CurrentUserPhotosView m14636a(CurrentUserPhotosView currentUserPhotosView) {
        C3883a.m14628a(currentUserPhotosView, m14651n());
        return currentUserPhotosView;
    }
}
