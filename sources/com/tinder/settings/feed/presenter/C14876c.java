package com.tinder.settings.feed.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.settings.feed.model.FeedSettings;
import com.tinder.domain.settings.feed.model.FeedSharingOption;
import com.tinder.domain.settings.feed.model.FeedSharingType;
import com.tinder.settings.feed.injection.FeedSettingsActivityScope;
import com.tinder.settings.feed.provider.C14879a;
import com.tinder.settings.feed.target.FeedSettingsTarget;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0007J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/tinder/settings/feed/presenter/FeedSettingsPresenter;", "", "shadowProvider", "Lcom/tinder/settings/feed/provider/FeedSettingsShadowProvider;", "(Lcom/tinder/settings/feed/provider/FeedSettingsShadowProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/settings/feed/target/FeedSettingsTarget;", "getTarget$Tinder_release", "()Lcom/tinder/settings/feed/target/FeedSettingsTarget;", "setTarget$Tinder_release", "(Lcom/tinder/settings/feed/target/FeedSettingsTarget;)V", "clearCompositeSubscription", "", "handleFeedSettings", "feedSettings", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "observeFeedSharingOptions", "onNavigationIconClicked", "showFeedSharingOptions", "sortFeedSharingOptions", "", "Lcom/tinder/domain/settings/feed/model/FeedSharingOption;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@FeedSettingsActivityScope
/* renamed from: com.tinder.settings.feed.presenter.c */
public final class C14876c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FeedSettingsTarget f46558a;
    /* renamed from: b */
    private final C17356a f46559b = new C17356a();
    /* renamed from: c */
    private final C14879a f46560c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "feedSettings", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.presenter.c$a */
    static final class C16629a<T> implements Consumer<FeedSettings> {
        /* renamed from: a */
        final /* synthetic */ C14876c f51503a;

        C16629a(C14876c c14876c) {
            this.f51503a = c14876c;
        }

        public /* synthetic */ void accept(Object obj) {
            m62090a((FeedSettings) obj);
        }

        /* renamed from: a */
        public final void m62090a(@Nullable FeedSettings feedSettings) {
            if (feedSettings != null) {
                this.f51503a.m56310a(feedSettings);
            }
        }
    }

    @Inject
    public C14876c(@NotNull C14879a c14879a) {
        C2668g.b(c14879a, "shadowProvider");
        this.f46560c = c14879a;
    }

    /* renamed from: a */
    public final void m56314a() {
        FeedSettingsTarget feedSettingsTarget = this.f46558a;
        if (feedSettingsTarget == null) {
            C2668g.b("target");
        }
        feedSettingsTarget.exitFeedSettings();
    }

    @Take
    /* renamed from: b */
    public final void m56315b() {
        C17356a c17356a = this.f46559b;
        C3959e b = this.f46560c.m56323b();
        Consumer c16629a = new C16629a(this);
        Function1 function1 = FeedSettingsPresenter$observeFeedSharingOptions$2.f59400a;
        if (function1 != null) {
            function1 = new C16630e(function1);
        }
        c17356a.add(b.subscribe(c16629a, (Consumer) function1));
    }

    @Drop
    /* renamed from: c */
    public final void m56316c() {
        this.f46559b.m63446a();
    }

    /* renamed from: a */
    private final void m56310a(FeedSettings feedSettings) {
        FeedSettingsTarget feedSettingsTarget;
        if (feedSettings.getEnabled()) {
            feedSettingsTarget = this.f46558a;
            if (feedSettingsTarget == null) {
                C2668g.b("target");
            }
            feedSettingsTarget.enableSharing();
        } else {
            feedSettingsTarget = this.f46558a;
            if (feedSettingsTarget == null) {
                C2668g.b("target");
            }
            feedSettingsTarget.disableSharing();
        }
        m56312b(feedSettings);
    }

    /* renamed from: b */
    private final void m56312b(FeedSettings feedSettings) {
        feedSettings = m56313c(feedSettings);
        FeedSettingsTarget feedSettingsTarget = this.f46558a;
        if (feedSettingsTarget == null) {
            C2668g.b("target");
        }
        feedSettingsTarget.showOptions(feedSettings);
    }

    /* renamed from: c */
    private final Set<FeedSharingOption> m56313c(FeedSettings feedSettings) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (FeedSharingType optionOrNull : C14877d.m56317a()) {
            FeedSharingOption optionOrNull2 = feedSettings.getOptionOrNull(optionOrNull);
            if (optionOrNull2 != null) {
                linkedHashSet.add(optionOrNull2);
            }
        }
        return linkedHashSet;
    }
}
