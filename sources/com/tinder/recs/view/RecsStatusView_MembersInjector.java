package com.tinder.recs.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.recs.presenter.RecsStatusPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class RecsStatusView_MembersInjector implements MembersInjector<RecsStatusView> {
    private final Provider<Lifecycle> lifecycleProvider;
    private final Provider<RecsStatusPresenter> presenterProvider;

    public RecsStatusView_MembersInjector(Provider<RecsStatusPresenter> provider, Provider<Lifecycle> provider2) {
        this.presenterProvider = provider;
        this.lifecycleProvider = provider2;
    }

    public static MembersInjector<RecsStatusView> create(Provider<RecsStatusPresenter> provider, Provider<Lifecycle> provider2) {
        return new RecsStatusView_MembersInjector(provider, provider2);
    }

    public void injectMembers(RecsStatusView recsStatusView) {
        injectPresenter(recsStatusView, (RecsStatusPresenter) this.presenterProvider.get());
        injectLifecycle(recsStatusView, (Lifecycle) this.lifecycleProvider.get());
    }

    public static void injectPresenter(RecsStatusView recsStatusView, RecsStatusPresenter recsStatusPresenter) {
        recsStatusView.presenter = recsStatusPresenter;
    }

    public static void injectLifecycle(RecsStatusView recsStatusView, Lifecycle lifecycle) {
        recsStatusView.lifecycle = lifecycle;
    }
}
