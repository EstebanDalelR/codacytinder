package com.tinder.domain.common.usecase;

import android.support.annotation.NonNull;
import rx.Completable;

public interface CompletableUseCase<REQUEST> {

    public static class EmptyRequest {
        private static final EmptyRequest EMPTY_REQUEST = new EmptyRequest();

        public static EmptyRequest get() {
            return EMPTY_REQUEST;
        }

        private EmptyRequest() {
        }
    }

    @NonNull
    Completable execute(@NonNull REQUEST request);
}
