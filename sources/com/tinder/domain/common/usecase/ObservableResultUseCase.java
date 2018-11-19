package com.tinder.domain.common.usecase;

import android.support.annotation.NonNull;
import rx.Observable;

public interface ObservableResultUseCase<RESULT> {
    @NonNull
    Observable<RESULT> execute();
}
