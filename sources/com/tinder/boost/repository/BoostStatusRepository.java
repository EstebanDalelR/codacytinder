package com.tinder.boost.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.boost.model.BoostStatus;
import rx.Observable;
import rx.Single;

public interface BoostStatusRepository {
    Observable<BoostStatus> createBoost();

    @Nullable
    BoostStatus getBoostStatus();

    Single<BoostStatus> loadBoostStatus();

    Observable<BoostStatus> observeBoostStatus();

    void setBoostStatus(@NonNull BoostStatus boostStatus);
}
