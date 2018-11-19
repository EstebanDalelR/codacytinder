package com.tinder.fastmatch.p338d;

import com.tinder.data.fastmatch.C8649b;
import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.model.PollingMode;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.meta.model.FastMatchSettings;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import com.tinder.managers.bk;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/fastmatch/provider/FastMatchConfigProviderImpl;", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "fastMatchSharedPreferenceDataStore", "Lcom/tinder/data/fastmatch/FastMatchSharedPreferenceDataStore;", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "notificationSource", "Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;", "(Lcom/tinder/data/fastmatch/FastMatchSharedPreferenceDataStore;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/domain/settings/notifications/NotificationSettingsSource;)V", "subject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "kotlin.jvm.PlatformType", "createConfig", "settings", "Lcom/tinder/domain/meta/model/FastMatchSettings;", "defaultFastMatchSettings", "get", "observe", "Lrx/Observable;", "update", "", "fastMatchConfig", "updateWithSettings", "fastMatchSettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.d.a */
public final class C11623a implements FastMatchConfigProvider {
    /* renamed from: a */
    private final C19785a<FastMatchConfig> f38043a = C19785a.f(C11623a.m47368a(this, null, 1, null));
    /* renamed from: b */
    private final C8649b f38044b;
    /* renamed from: c */
    private final bk f38045c;
    /* renamed from: d */
    private final NotificationSettingsSource f38046d;

    public C11623a(@NotNull C8649b c8649b, @NotNull bk bkVar, @NotNull NotificationSettingsSource notificationSettingsSource) {
        C2668g.b(c8649b, "fastMatchSharedPreferenceDataStore");
        C2668g.b(bkVar, "sharedPreferences");
        C2668g.b(notificationSettingsSource, "notificationSource");
        this.f38044b = c8649b;
        this.f38045c = bkVar;
        this.f38046d = notificationSettingsSource;
    }

    @NotNull
    public FastMatchConfig get() {
        C19785a c19785a = this.f38043a;
        C2668g.a(c19785a, "subject");
        Object A = c19785a.A();
        C2668g.a(A, "subject.value");
        return (FastMatchConfig) A;
    }

    @NotNull
    public Observable<FastMatchConfig> observe() {
        Observable<FastMatchConfig> e = this.f38043a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    public void update(@NotNull FastMatchConfig fastMatchConfig) {
        C2668g.b(fastMatchConfig, "fastMatchConfig");
        this.f38043a.onNext(fastMatchConfig);
    }

    public void updateWithSettings(@NotNull FastMatchSettings fastMatchSettings) {
        C2668g.b(fastMatchSettings, "fastMatchSettings");
        this.f38044b.m36883a(fastMatchSettings.isEnabled());
        this.f38043a.onNext(m47367a(fastMatchSettings));
    }

    /* renamed from: a */
    static /* synthetic */ FastMatchConfig m47368a(C11623a c11623a, FastMatchSettings fastMatchSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            fastMatchSettings = c11623a.m47369a();
        }
        return c11623a.m47367a(fastMatchSettings);
    }

    /* renamed from: a */
    private final FastMatchConfig m47367a(FastMatchSettings fastMatchSettings) {
        return new FastMatchConfig(fastMatchSettings.isEnabled(), this.f38045c.af(), fastMatchSettings.getPreviewMinTimeInMillis(), fastMatchSettings.getPushNotificationFrequencyOptions(), this.f38046d.getLikesYouNotificationFrequency(), fastMatchSettings.getPushNotificationFrequencyDefault(), fastMatchSettings.getNewCountFetchInterval(), fastMatchSettings.getNewCountFetchIntervalWhileBoosting(), fastMatchSettings.getNewCountRangeThreshold(), PollingMode.Companion.fromInt(fastMatchSettings.getPollingMode()));
    }

    /* renamed from: a */
    private final FastMatchSettings m47369a() {
        return new FastMatchSettings(this.f38044b.m36884a(), 0, null, 0, 0, 0, 0, 0, 254, null);
    }
}
