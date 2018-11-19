package com.tinder.onboarding.repository;

import android.support.annotation.NonNull;
import com.tinder.onboarding.model.OnboardingUser;
import com.tinder.onboarding.model.OnboardingUserPhoto;
import rx.Completable;
import rx.Observable;

public interface OnboardingUserRepository {
    Completable createCompleteUser();

    Completable deleteUser();

    Observable<OnboardingUser> getUnderageUser();

    Observable<OnboardingUser> getUser();

    Completable updateUser(@NonNull OnboardingUser onboardingUser);

    Completable updateUserPhoto(@NonNull OnboardingUserPhoto onboardingUserPhoto);
}
