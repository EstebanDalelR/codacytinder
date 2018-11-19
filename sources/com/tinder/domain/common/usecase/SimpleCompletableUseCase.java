package com.tinder.domain.common.usecase;

import android.support.annotation.NonNull;
import rx.Completable;

public interface SimpleCompletableUseCase {
    @NonNull
    Completable execute();
}
