package com.tinder.domain.profile.usecase;

import android.support.annotation.NonNull;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.managers.ManagerProfile;
import javax.inject.Inject;
import rx.Completable;
import rx.CompletableEmitter;

public class SetDiscoverability implements CompletableUseCase<Boolean> {
    private final ManagerProfile profileManager;

    @Inject
    SetDiscoverability(ManagerProfile managerProfile) {
        this.profileManager = managerProfile;
    }

    @NonNull
    public Completable execute(@NonNull Boolean bool) {
        return Completable.a(new SetDiscoverability$$Lambda$0(this, bool));
    }

    final /* synthetic */ void lambda$execute$0$SetDiscoverability(@NonNull Boolean bool, final CompletableEmitter completableEmitter) {
        this.profileManager.a(bool.booleanValue(), new ListenerUpdateProfileInfo() {
            public void onProfileUpdateSuccess() {
                completableEmitter.onCompleted();
            }

            public void onProfileUpdateFailed() {
                completableEmitter.onError(new RuntimeException("Error hiding/unhiding profile"));
            }
        });
    }
}
