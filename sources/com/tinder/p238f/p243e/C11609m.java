package com.tinder.p238f.p243e;

import android.support.annotation.NonNull;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.model.UserMeta;
import com.tinder.passport.p093d.C3945a;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.f.e.m */
public class C11609m extends Watcher<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final C3945a f38013a;

    protected /* synthetic */ void execute(@NonNull Object obj) {
        m47335a((UserMeta) obj);
    }

    @Inject
    C11609m(@NonNull C3945a c3945a, @NonNull Logger logger) {
        super(logger);
        this.f38013a = c3945a;
    }

    /* renamed from: a */
    protected void m47335a(@NonNull UserMeta userMeta) {
        userMeta = userMeta.getTravelingInfo();
        if (userMeta != null && userMeta.mo10356a()) {
            this.f38013a.b(userMeta.mo10358c());
            this.f38013a.c(userMeta.mo10358c());
        }
    }
}
