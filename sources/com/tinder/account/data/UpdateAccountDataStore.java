package com.tinder.account.data;

import android.support.annotation.NonNull;
import rx.Completable;

public interface UpdateAccountDataStore {
    Completable updateEmail(@NonNull String str);

    Completable updatePassword(@NonNull String str);
}
