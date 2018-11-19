package com.tinder.data.profile;

import com.tinder.api.TinderUserApi;
import com.tinder.api.model.profile.ActivityFeedSettings;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.data.profile.adapter.C10915e;
import com.tinder.domain.settings.feed.model.FeedSettings;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/profile/ActivityFeedSettingsApiClient;", "", "tinderApi", "Lcom/tinder/api/TinderUserApi;", "adapter", "Lcom/tinder/data/profile/adapter/ActivityFeedSettingsApiAdapter;", "(Lcom/tinder/api/TinderUserApi;Lcom/tinder/data/profile/adapter/ActivityFeedSettingsApiAdapter;)V", "saveSettings", "Lio/reactivex/Single;", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "settings", "saveSettings$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.a */
public final class C8753a {
    /* renamed from: a */
    private final TinderUserApi f30742a;
    /* renamed from: b */
    private final C10915e f30743b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/api/model/profile/ActivityFeedSettings;", "Lcom/tinder/data/profile/adapter/ApiSettings;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a$a */
    static final class C8749a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C8753a f30735a;
        /* renamed from: b */
        final /* synthetic */ FeedSettings f30736b;

        C8749a(C8753a c8753a, FeedSettings feedSettings) {
            this.f30735a = c8753a;
            this.f30736b = feedSettings;
        }

        public /* synthetic */ Object call() {
            return m37271a();
        }

        @NotNull
        /* renamed from: a */
        public final ActivityFeedSettings m37271a() {
            return this.f30735a.f30743b.m43499a(this.f30736b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/profile/ActivityFeedSettings;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/data/profile/adapter/ApiSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a$b */
    static final class C10899b<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C8753a f35597a;

        C10899b(C8753a c8753a) {
            this.f35597a = c8753a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43454a((ActivityFeedSettings) obj);
        }

        /* renamed from: a */
        public final C3960g<DataResponse<ActivityFeedSettings>> m43454a(@NotNull ActivityFeedSettings activityFeedSettings) {
            C2668g.b(activityFeedSettings, "it");
            return this.f35597a.f30742a.saveActivityFeedSettings(activityFeedSettings);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/settings/feed/model/FeedSettings;", "response", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/profile/ActivityFeedSettings;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.a$c */
    static final class C10900c<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8753a f35598a;

        C10900c(C8753a c8753a) {
            this.f35598a = c8753a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43455a((DataResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final FeedSettings m43455a(@NotNull DataResponse<ActivityFeedSettings> dataResponse) {
            C2668g.b(dataResponse, "response");
            C10915e a = this.f35598a.f30743b;
            ActivityFeedSettings activityFeedSettings = (ActivityFeedSettings) dataResponse.data();
            if (activityFeedSettings != null) {
                return a.m43500a(activityFeedSettings);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got a null response: ");
            stringBuilder.append(dataResponse);
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    @Inject
    public C8753a(@NotNull TinderUserApi tinderUserApi, @NotNull C10915e c10915e) {
        C2668g.b(tinderUserApi, "tinderApi");
        C2668g.b(c10915e, "adapter");
        this.f30742a = tinderUserApi;
        this.f30743b = c10915e;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<FeedSettings> m37280a(@NotNull FeedSettings feedSettings) {
        C2668g.b(feedSettings, "settings");
        feedSettings = C3960g.c(new C8749a(this, feedSettings)).a(new C10899b(this)).e(new C10900c(this));
        C2668g.a(feedSettings, "Single.fromCallable { ad…onse\"))\n                }");
        return feedSettings;
    }
}
