package com.tinder.recs.presenter;

import android.support.annotation.NonNull;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.profile.usecase.SetDiscoverability;
import com.tinder.module.ViewScope;
import com.tinder.recs.analytics.AddRecsDiscoveryEvent;
import com.tinder.recs.target.DiscoveryOffTarget;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import javax.inject.Inject;
import rx.Notification;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@ViewScope
public class DiscoveryOffPresenter {
    @NonNull
    private final AddRecsDiscoveryEvent addRecsDiscoveryEvent;
    @NonNull
    private final SetDiscoverability setDiscoverability;
    @DeadshotTarget
    DiscoveryOffTarget target;

    @Inject
    public DiscoveryOffPresenter(@NonNull SetDiscoverability setDiscoverability, @NonNull AddRecsDiscoveryEvent addRecsDiscoveryEvent) {
        this.setDiscoverability = setDiscoverability;
        this.addRecsDiscoveryEvent = addRecsDiscoveryEvent;
    }

    public void enableDiscovery() {
        this.target.showProgress();
        this.setDiscoverability.execute(Boolean.valueOf(true)).b(Schedulers.io()).a(C19397a.a()).a(this.addRecsDiscoveryEvent.execute(Boolean.valueOf(true))).b(new DiscoveryOffPresenter$$Lambda$0(this)).a(new DiscoveryOffPresenter$$Lambda$1(this), new DiscoveryOffPresenter$$Lambda$2(this));
    }

    final /* synthetic */ void lambda$enableDiscovery$0$DiscoveryOffPresenter(Notification notification) {
        this.target.hideProgress();
    }

    final /* synthetic */ void lambda$enableDiscovery$1$DiscoveryOffPresenter() {
        addRecsDiscoveryEvent();
        this.target.hideDiscoveryOff();
    }

    final /* synthetic */ void lambda$enableDiscovery$2$DiscoveryOffPresenter(Throwable th) {
        ad.a(th);
        this.target.showFailedToEnableDiscovery();
    }

    private void addRecsDiscoveryEvent() {
        this.addRecsDiscoveryEvent.execute(Boolean.valueOf(true)).b(Schedulers.io()).b(RxUtils.b());
    }
}
