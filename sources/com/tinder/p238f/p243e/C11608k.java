package com.tinder.p238f.p243e;

import android.support.annotation.NonNull;
import com.tinder.common.logger.Logger;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.watchers.Watcher;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.model.UserMeta;
import com.tinder.superlike.p420c.C15073b;
import com.tinder.superlike.p421e.C15080a;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.tinder.f.e.k */
public class C11608k extends Watcher<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final C15082f f38009a;
    @NonNull
    /* renamed from: b */
    private final LikeStatusProvider f38010b;
    @NonNull
    /* renamed from: c */
    private final C15080a f38011c;
    /* renamed from: d */
    private final AbTestUtility f38012d;

    protected /* synthetic */ void execute(@NonNull Object obj) {
        m47334a((UserMeta) obj);
    }

    @Inject
    C11608k(@NonNull C15082f c15082f, @NonNull LikeStatusProvider likeStatusProvider, @NonNull C15080a c15080a, AbTestUtility abTestUtility, @NonNull Logger logger) {
        super(logger);
        this.f38009a = c15082f;
        this.f38010b = likeStatusProvider;
        this.f38011c = c15080a;
        this.f38012d = abTestUtility;
    }

    /* renamed from: a */
    protected void m47334a(@NonNull UserMeta userMeta) {
        SuperlikeStatus superlikeStatus = userMeta.getSuperlikeStatus();
        if (!(superlikeStatus == null || this.f38012d.profileV2EnabledForRevenue())) {
            this.f38009a.a(superlikeStatus);
        }
        if (!this.f38012d.profileV2EnabledForRevenue()) {
            this.f38010b.saveLikeStatus(LikeStatus.create(userMeta.getLikesPercentRemaining(), userMeta.getMillisRateLimitedUntil()));
        }
        this.f38011c.a(C15073b.a(userMeta, userMeta.getSubscription().isPlus()));
    }
}
