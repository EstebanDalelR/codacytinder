package com.tinder.tinderplus.provider;

import android.support.annotation.NonNull;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.model.ProfileOption.Likes;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SaveLikeStatus;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.utils.RxUtils;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import org.joda.time.DateTime;
import rx.Observable;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

/* renamed from: com.tinder.tinderplus.provider.a */
public class C16973a implements LikeStatusProvider {
    /* renamed from: a */
    private static final LikeStatus f52361a = LikeStatus.create(100, 0);
    /* renamed from: b */
    private final C19785a<LikeStatus> f52362b;
    @NonNull
    /* renamed from: c */
    private LikeStatus f52363c = f52361a;
    /* renamed from: d */
    private final AbTestUtility f52364d;
    /* renamed from: e */
    private final LoadProfileOptionData f52365e;
    /* renamed from: f */
    private final SaveLikeStatus f52366f;

    public C16973a(AbTestUtility abTestUtility, LoadProfileOptionData loadProfileOptionData, SaveLikeStatus saveLikeStatus) {
        this.f52364d = abTestUtility;
        this.f52365e = loadProfileOptionData;
        this.f52366f = saveLikeStatus;
        this.f52362b = C19785a.f(f52361a);
    }

    public synchronized void saveLikeStatus(@NonNull LikeStatus likeStatus) {
        this.f52363c = currentStatus();
        if (this.f52364d.profileV2EnabledForRevenue()) {
            this.f52366f.execute(likeStatus).b(Schedulers.io()).b(RxUtils.b());
        } else {
            this.f52362b.onNext(likeStatus);
        }
    }

    public synchronized void resetLikeStatus() {
        this.f52363c = currentStatus();
        if (this.f52364d.profileV2EnabledForRevenue()) {
            this.f52366f.execute(f52361a).b(Schedulers.io()).b(RxUtils.b());
        } else {
            this.f52362b.onNext(f52361a);
        }
    }

    @NonNull
    public synchronized LikeStatus currentStatus() {
        if (this.f52364d.profileV2EnabledForRevenue()) {
            return (LikeStatus) this.f52365e.execute(Likes.INSTANCE).blockingFirst(f52361a);
        }
        return (LikeStatus) this.f52362b.A();
    }

    @NonNull
    public synchronized LikeStatus previousStatus() {
        return this.f52363c;
    }

    @NonNull
    public synchronized Observable<LikeStatus> observeLikeStatusUpdates() {
        if (this.f52364d.profileV2EnabledForRevenue()) {
            return C15551e.m58077a(this.f52365e.execute(Likes.INSTANCE), BackpressureStrategy.LATEST).g();
        }
        return this.f52362b.e().g();
    }

    public synchronized boolean isOutOfLikes() {
        return m62739a(currentStatus());
    }

    public synchronized boolean justBecameOutOfLikes() {
        boolean z;
        z = !m62739a(previousStatus()) && m62739a(currentStatus());
        return z;
    }

    /* renamed from: a */
    private boolean m62739a(@NonNull LikeStatus likeStatus) {
        boolean z = false;
        if (likeStatus.likesPercentRemaining() > 0) {
            return false;
        }
        long millisRateLimitedUntil = likeStatus.millisRateLimitedUntil();
        if (millisRateLimitedUntil == 0) {
            return false;
        }
        if (DateTime.a().getMillis() < millisRateLimitedUntil) {
            z = true;
        }
        return z;
    }
}
