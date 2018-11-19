package com.tinder.account.p085b;

import android.support.annotation.NonNull;
import com.tinder.account.data.UpdateAccountDataStore;
import com.tinder.domain.common.usecase.CompletableUseCase;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.account.b.b */
public class C3877b implements CompletableUseCase<String> {
    @NonNull
    /* renamed from: a */
    private final UpdateAccountDataStore f12140a;

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m14620a((String) obj);
    }

    @Inject
    public C3877b(@NonNull UpdateAccountDataStore updateAccountDataStore) {
        this.f12140a = updateAccountDataStore;
    }

    @NonNull
    /* renamed from: a */
    public Completable m14620a(@NonNull String str) {
        return this.f12140a.updatePassword(str);
    }
}
