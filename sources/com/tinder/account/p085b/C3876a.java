package com.tinder.account.p085b;

import android.support.annotation.NonNull;
import com.tinder.account.data.UpdateAccountDataStore;
import com.tinder.domain.common.usecase.CompletableUseCase;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.account.b.a */
public class C3876a implements CompletableUseCase<String> {
    @NonNull
    /* renamed from: a */
    private final UpdateAccountDataStore f12139a;

    @NonNull
    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m14619a((String) obj);
    }

    @Inject
    public C3876a(@NonNull UpdateAccountDataStore updateAccountDataStore) {
        this.f12139a = updateAccountDataStore;
    }

    @NonNull
    /* renamed from: a */
    public Completable m14619a(@NonNull String str) {
        return this.f12139a.updateEmail(str);
    }
}
