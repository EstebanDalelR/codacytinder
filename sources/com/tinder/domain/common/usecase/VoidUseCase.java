package com.tinder.domain.common.usecase;

import android.support.annotation.NonNull;

public interface VoidUseCase<REQUEST> {
    void execute(@NonNull REQUEST request);
}
