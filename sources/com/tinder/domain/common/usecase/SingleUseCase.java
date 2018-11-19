package com.tinder.domain.common.usecase;

import android.support.annotation.NonNull;
import rx.Single;

public interface SingleUseCase<REQUEST, RESULT> {
    @NonNull
    Single<RESULT> execute(@NonNull REQUEST request);
}
