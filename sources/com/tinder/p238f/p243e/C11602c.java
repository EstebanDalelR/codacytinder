package com.tinder.p238f.p243e;

import com.tinder.api.ManagerWebServices;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.UserMeta;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/meta/watchers/PersistLegacyUser;", "Lcom/tinder/domain/common/watchers/Watcher;", "Lcom/tinder/model/UserMeta;", "profileManager", "Lcom/tinder/managers/ManagerProfile;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/managers/ManagerProfile;Lcom/tinder/common/logger/Logger;)V", "execute", "", "meta", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.f.e.c */
public final class C11602c extends Watcher<UserMeta> {
    /* renamed from: a */
    private final ManagerProfile f38003a;

    public /* synthetic */ void execute(Object obj) {
        m47329a((UserMeta) obj);
    }

    @Inject
    public C11602c(@NotNull ManagerProfile managerProfile, @NotNull Logger logger) {
        C2668g.b(managerProfile, "profileManager");
        C2668g.b(logger, "logger");
        super(logger);
        this.f38003a = managerProfile;
    }

    /* renamed from: a */
    protected void m47329a(@NotNull UserMeta userMeta) {
        C2668g.b(userMeta, ManagerWebServices.PARAM_META);
        userMeta = userMeta.getUser();
        if (userMeta != null) {
            this.f38003a.a(userMeta);
        }
    }
}
