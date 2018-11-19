package com.tinder.p238f.p243e;

import android.support.annotation.NonNull;
import com.tinder.boost.model.C8345b;
import com.tinder.boost.provider.C8349a;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.model.UserMeta;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.f.e.g */
public class C11604g extends Watcher<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final C8349a f38005a;

    protected /* synthetic */ void execute(@NonNull Object obj) {
        m47331a((UserMeta) obj);
    }

    @Inject
    C11604g(@NonNull C8349a c8349a, @NonNull Logger logger) {
        super(logger);
        this.f38005a = c8349a;
    }

    /* renamed from: a */
    protected void m47331a(@NonNull UserMeta userMeta) {
        this.f38005a.m35552a(C8345b.m35518a(userMeta));
    }
}
