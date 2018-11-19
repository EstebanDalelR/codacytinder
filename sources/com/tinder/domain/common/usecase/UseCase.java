package com.tinder.domain.common.usecase;

import android.support.annotation.NonNull;
import rx.Observable;

public interface UseCase<REQUEST, RESULT> {
    @NonNull
    Observable<RESULT> execute(@NonNull REQUEST request);
}
