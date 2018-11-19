package com.tinder.p238f.p243e;

import com.tinder.api.ManagerWebServices;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.interactors.C9718i;
import com.tinder.model.UserMeta;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/meta/watchers/PhotoProcessingScheduler;", "Lcom/tinder/domain/common/watchers/Watcher;", "Lcom/tinder/model/UserMeta;", "interactor", "Lcom/tinder/interactors/PhotosProcessingInteractor;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/interactors/PhotosProcessingInteractor;Lcom/tinder/common/logger/Logger;)V", "execute", "", "meta", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.f.e.e */
public final class C11603e extends Watcher<UserMeta> {
    /* renamed from: a */
    private final C9718i f38004a;

    public /* synthetic */ void execute(Object obj) {
        m47330a((UserMeta) obj);
    }

    @Inject
    public C11603e(@NotNull C9718i c9718i, @NotNull Logger logger) {
        C2668g.b(c9718i, "interactor");
        C2668g.b(logger, "logger");
        super(logger);
        this.f38004a = c9718i;
    }

    /* renamed from: a */
    protected void m47330a(@NotNull UserMeta userMeta) {
        C2668g.b(userMeta, ManagerWebServices.PARAM_META);
        userMeta = userMeta.getUser();
        if (userMeta != null && userMeta.isPhotoProcessing() != null) {
            this.f38004a.m40215a();
        }
    }
}
