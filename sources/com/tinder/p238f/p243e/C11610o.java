package com.tinder.p238f.p243e;

import android.support.annotation.NonNull;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.managers.bk;
import com.tinder.model.GlobalConfig;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.p088c.p089a.p090a.C3923a;
import com.tinder.tinderplus.C2657a;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.f.e.o */
public class C11610o extends Watcher<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final bk f38014a;
    @NonNull
    /* renamed from: b */
    private final C3923a f38015b;
    @NonNull
    /* renamed from: c */
    private final C2657a f38016c;

    protected /* synthetic */ void execute(@NonNull Object obj) {
        m47338a((UserMeta) obj);
    }

    @Inject
    C11610o(@NonNull bk bkVar, @NonNull C3923a c3923a, @NonNull C2657a c2657a, @NonNull Logger logger) {
        super(logger);
        this.f38014a = bkVar;
        this.f38015b = c3923a;
        this.f38016c = c2657a;
    }

    /* renamed from: a */
    protected void m47338a(@NonNull UserMeta userMeta) {
        m47337b(userMeta);
        m47336a(userMeta.getGlobalConfig());
    }

    /* renamed from: b */
    private void m47337b(@NonNull UserMeta userMeta) {
        GlobalConfig globalConfig = userMeta.getGlobalConfig();
        if (globalConfig != null) {
            boolean z = userMeta.getUser() != null && userMeta.getUser().isPhotoOptimizerEnabled();
            this.f38014a.x(z);
            this.f38014a.f(globalConfig.isPhotoOptimizerHasResult());
        }
        User user = userMeta.getUser();
        if (user != null) {
            this.f38016c.a(this.f38015b.a(user), userMeta.getSubscription());
        }
        if (userMeta.getTutorials().contains(ManagerWebServices.PARAM_TUTORIAL_SUPERLIKE_ACTION_VALUE) != null) {
            this.f38014a.i(false);
        }
    }

    /* renamed from: a */
    private void m47336a(@NonNull GlobalConfig globalConfig) {
        this.f38014a.a(globalConfig.fetchConnections);
        this.f38014a.s(globalConfig.superLikeEnabled);
        this.f38014a.w(globalConfig.videoBpcSwipeEnabled);
        this.f38014a.C(globalConfig.photoPreviewEnabled);
        this.f38014a.D(globalConfig.isSelectEnabled);
    }
}
