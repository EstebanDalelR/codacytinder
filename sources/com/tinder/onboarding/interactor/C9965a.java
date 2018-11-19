package com.tinder.onboarding.interactor;

import android.support.annotation.NonNull;
import com.tinder.onboarding.exception.OnboardingInternalErrorException;
import com.tinder.onboarding.model.GenderSelection;
import com.tinder.onboarding.model.OnboardingEmail;
import com.tinder.onboarding.model.OnboardingPassword;
import com.tinder.onboarding.model.OnboardingUser;
import com.tinder.onboarding.model.OnboardingUser.Builder;
import com.tinder.onboarding.model.OnboardingUserPhoto;
import com.tinder.onboarding.repository.OnboardingUserRepository;
import com.tinder.scope.ActivityScope;
import java.io.File;
import java8.util.Objects;
import java8.util.Optional;
import javax.inject.Inject;
import org.joda.time.LocalDate;
import rx.Completable;
import rx.Observable;

@ActivityScope
/* renamed from: com.tinder.onboarding.interactor.a */
public class C9965a {
    /* renamed from: a */
    private final OnboardingUserRepository f32805a;

    @Inject
    public C9965a(OnboardingUserRepository onboardingUserRepository) {
        this.f32805a = onboardingUserRepository;
    }

    /* renamed from: a */
    public Observable<OnboardingUser> m40937a() {
        return this.f32805a.getUser();
    }

    /* renamed from: a */
    public Completable m40932a(@NonNull OnboardingEmail onboardingEmail) {
        Objects.b(onboardingEmail);
        return this.f32805a.updateUser(new Builder().addEmail(Optional.a(onboardingEmail)).build());
    }

    /* renamed from: a */
    public Completable m40933a(@NonNull OnboardingPassword onboardingPassword) {
        return this.f32805a.updateUser(new Builder().addPassword(Optional.a(onboardingPassword)).build());
    }

    /* renamed from: a */
    public Completable m40935a(@NonNull String str) {
        Objects.b(str);
        return this.f32805a.updateUser(new Builder().addName(Optional.a(str)).build());
    }

    /* renamed from: a */
    public Completable m40936a(@NonNull LocalDate localDate) {
        Objects.b(localDate);
        return this.f32805a.updateUser(new Builder().addBirthday(Optional.a(localDate)).build());
    }

    /* renamed from: a */
    public Completable m40931a(@NonNull GenderSelection genderSelection) {
        genderSelection = Observable.a(genderSelection).h(new C13510b(genderSelection)).a();
        OnboardingUserRepository onboardingUserRepository = this.f32805a;
        onboardingUserRepository.getClass();
        return genderSelection.c(C13511c.m52624a(onboardingUserRepository));
    }

    /* renamed from: a */
    static final /* synthetic */ Observable m40930a(@NonNull GenderSelection genderSelection, GenderSelection genderSelection2) {
        if (genderSelection.gender() == null) {
            return Observable.a(new OnboardingInternalErrorException("Gender in GenderSelection is null"));
        }
        return Observable.a(new Builder().addGenderSelection(Optional.a(genderSelection)).build());
    }

    /* renamed from: a */
    public Completable m40934a(@NonNull File file) {
        return this.f32805a.updateUserPhoto(new OnboardingUserPhoto.Builder(file).build());
    }

    /* renamed from: b */
    public Completable m40938b() {
        return this.f32805a.createCompleteUser();
    }

    /* renamed from: c */
    public Completable m40939c() {
        return this.f32805a.deleteUser();
    }

    /* renamed from: d */
    public Observable<OnboardingUser> m40940d() {
        return this.f32805a.getUnderageUser();
    }
}
