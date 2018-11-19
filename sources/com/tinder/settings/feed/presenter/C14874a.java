package com.tinder.settings.feed.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Take;
import com.tinder.feed.p341b.C11695a;
import com.tinder.settings.feed.analytics.AddSettingsOptionUseCase;
import com.tinder.settings.feed.analytics.AddSettingsOptionUseCase.C14872a;
import com.tinder.settings.feed.analytics.AddSettingsOptionUseCase.Type;
import com.tinder.settings.feed.target.FeedSettingItemTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tinder/settings/feed/presenter/FeedSettingItemPresenter;", "", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "addSettingsOptionUseCase", "Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase;", "(Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;Lcom/tinder/settings/feed/analytics/AddSettingsOptionUseCase;)V", "target", "Lcom/tinder/settings/feed/target/FeedSettingItemTarget;", "getTarget$Tinder_release", "()Lcom/tinder/settings/feed/target/FeedSettingItemTarget;", "setTarget$Tinder_release", "(Lcom/tinder/settings/feed/target/FeedSettingItemTarget;)V", "onCardClicked", "", "toggleActivityFeedSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.feed.presenter.a */
public final class C14874a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FeedSettingItemTarget f46555a;
    /* renamed from: b */
    private final C11695a f46556b;
    /* renamed from: c */
    private final AddSettingsOptionUseCase f46557c;

    @Inject
    public C14874a(@NotNull C11695a c11695a, @NotNull AddSettingsOptionUseCase addSettingsOptionUseCase) {
        C2668g.b(c11695a, "feedExperimentUtility");
        C2668g.b(addSettingsOptionUseCase, "addSettingsOptionUseCase");
        this.f46556b = c11695a;
        this.f46557c = addSettingsOptionUseCase;
    }

    @Take
    /* renamed from: a */
    public final void m56306a() {
        if (!this.f46556b.c()) {
            FeedSettingItemTarget feedSettingItemTarget = this.f46555a;
            if (feedSettingItemTarget == null) {
                C2668g.b("target");
            }
            feedSettingItemTarget.disableActivityFeedSettings();
        }
    }

    /* renamed from: b */
    public final void m56307b() {
        FeedSettingItemTarget feedSettingItemTarget = this.f46555a;
        if (feedSettingItemTarget == null) {
            C2668g.b("target");
        }
        feedSettingItemTarget.showActivityFeedSettings();
        this.f46557c.m62086a(new C14872a(Type.SHARED_CONTENT, null, 2, null));
    }
}
