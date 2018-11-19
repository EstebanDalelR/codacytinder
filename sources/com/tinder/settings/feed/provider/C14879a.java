package com.tinder.settings.feed.provider;

import com.tinder.base.p172b.C8301a;
import com.tinder.domain.settings.feed.model.FeedSettings;
import com.tinder.domain.settings.feed.usecase.LoadFeedSettings;
import com.tinder.settings.feed.injection.FeedSettingsActivityScope;
import io.reactivex.C3959e;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\tJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tR2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/settings/feed/provider/FeedSettingsShadowProvider;", "", "loadFeedSettings", "Lcom/tinder/domain/settings/feed/usecase/LoadFeedSettings;", "mainThreadExecutionVerifier", "Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/domain/settings/feed/usecase/LoadFeedSettings;Lcom/tinder/base/concurrency/MainThreadExecutionVerifier;)V", "feedSettingsBehaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "kotlin.jvm.PlatformType", "get", "observe", "Lio/reactivex/Observable;", "update", "", "newFeedSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@FeedSettingsActivityScope
/* renamed from: com.tinder.settings.feed.provider.a */
public final class C14879a {
    /* renamed from: a */
    private final C19040a<FeedSettings> f46562a = C19040a.m67694a();
    /* renamed from: b */
    private final C8301a f46563b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.feed.provider.a$a */
    static final class C16632a<T> implements Predicate<FeedSettings> {
        /* renamed from: a */
        public static final C16632a f51506a = new C16632a();

        C16632a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62092a((FeedSettings) obj);
        }

        /* renamed from: a */
        public final boolean m62092a(@NotNull FeedSettings feedSettings) {
            C2668g.b(feedSettings, "it");
            return feedSettings.getOptions().isEmpty() ^ 1;
        }
    }

    @Inject
    public C14879a(@NotNull LoadFeedSettings loadFeedSettings, @NotNull C8301a c8301a) {
        C2668g.b(loadFeedSettings, "loadFeedSettings");
        C2668g.b(c8301a, "mainThreadExecutionVerifier");
        this.f46563b = c8301a;
        loadFeedSettings = loadFeedSettings.execute().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a());
        Consumer consumer = (Consumer) new Consumer<FeedSettings>() {
            public /* synthetic */ void accept(Object obj) {
                m62091a((FeedSettings) obj);
            }

            /* renamed from: a */
            public final void m62091a(FeedSettings feedSettings) {
                this.f46562a.onNext(feedSettings);
            }
        };
        Function1 function1 = FeedSettingsShadowProvider$2.f59401a;
        if (function1 != null) {
            function1 = new C16633b(function1);
        }
        loadFeedSettings.subscribe(consumer, (Consumer) function1);
    }

    @NotNull
    /* renamed from: a */
    public final FeedSettings m56321a() {
        C19040a c19040a = this.f46562a;
        C2668g.a(c19040a, "feedSettingsBehaviorSubject");
        Object b = c19040a.m67697b();
        if (b != null) {
            return (FeedSettings) b;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void m56322a(@NotNull FeedSettings feedSettings) {
        C2668g.b(feedSettings, "newFeedSettings");
        this.f46563b.a();
        if ((C2668g.a(feedSettings, m56321a()) ^ 1) != 0) {
            this.f46562a.onNext(feedSettings);
        }
    }

    @NotNull
    /* renamed from: b */
    public final C3959e<FeedSettings> m56323b() {
        C3959e<FeedSettings> filter = this.f46562a.filter(C16632a.f51506a);
        C2668g.a(filter, "feedSettingsBehaviorSubj…it.options.isNotEmpty() }");
        return filter;
    }
}
