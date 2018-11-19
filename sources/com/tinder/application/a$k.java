package com.tinder.application;

import com.tinder.settings.feed.activity.FeedSettingsActivity;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponent;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponent.Builder;
import dagger.internal.C15521i;

final class a$k implements Builder {
    /* renamed from: a */
    final /* synthetic */ C4423a f33541a;
    /* renamed from: b */
    private FeedSettingsActivity f33542b;

    private a$k(C4423a c4423a) {
        this.f33541a = c4423a;
    }

    public /* synthetic */ Builder feedSettingsActivity(FeedSettingsActivity feedSettingsActivity) {
        return m41846a(feedSettingsActivity);
    }

    public FeedSettingsActivityComponent build() {
        if (this.f33542b != null) {
            return new a$l(this.f33541a, this, null);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FeedSettingsActivity.class.getCanonicalName());
        stringBuilder.append(" must be set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public a$k m41846a(FeedSettingsActivity feedSettingsActivity) {
        this.f33542b = (FeedSettingsActivity) C15521i.a(feedSettingsActivity);
        return this;
    }
}
