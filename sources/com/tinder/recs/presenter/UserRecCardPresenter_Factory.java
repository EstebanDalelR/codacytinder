package com.tinder.recs.presenter;

import com.tinder.recs.analytics.AddRecsViewEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UserRecCardPresenter_Factory implements Factory<UserRecCardPresenter> {
    private final Provider<AddRecsViewEvent> addRecsViewEventProvider;

    public UserRecCardPresenter_Factory(Provider<AddRecsViewEvent> provider) {
        this.addRecsViewEventProvider = provider;
    }

    public UserRecCardPresenter get() {
        return provideInstance(this.addRecsViewEventProvider);
    }

    public static UserRecCardPresenter provideInstance(Provider<AddRecsViewEvent> provider) {
        return new UserRecCardPresenter((AddRecsViewEvent) provider.get());
    }

    public static UserRecCardPresenter_Factory create(Provider<AddRecsViewEvent> provider) {
        return new UserRecCardPresenter_Factory(provider);
    }

    public static UserRecCardPresenter newUserRecCardPresenter(AddRecsViewEvent addRecsViewEvent) {
        return new UserRecCardPresenter(addRecsViewEvent);
    }
}
