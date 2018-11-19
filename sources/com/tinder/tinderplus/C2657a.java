package com.tinder.tinderplus;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.PlusControlSettings.Blend;
import com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.managers.bk;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.subjects.C19785a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/tinderplus/TinderPlusSettingsProvider;", "", "sharedPrefsManager", "Lcom/tinder/managers/ManagerSharedPreferences;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "subject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "get", "observe", "Lrx/Observable;", "update", "", "plusControlSettings", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "updateSharedPreferences", "settings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "Should be replaced with LoadProfileOptionData.execute(PLUS_CONTROL)")
/* renamed from: com.tinder.tinderplus.a */
public final class C2657a {
    /* renamed from: a */
    private final C19785a<PlusControlSettings> f8371a;
    /* renamed from: b */
    private final bk f8372b;
    /* renamed from: c */
    private final AbTestUtility f8373c;
    /* renamed from: d */
    private final LoadProfileOptionData f8374d;

    @Inject
    public C2657a(@NotNull bk bkVar, @NotNull AbTestUtility abTestUtility, @NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.m10309b(bkVar, "sharedPrefsManager");
        C2668g.m10309b(abTestUtility, "abTestUtility");
        C2668g.m10309b(loadProfileOptionData, "loadProfileOptionData");
        this.f8372b = bkVar;
        this.f8373c = abTestUtility;
        this.f8374d = loadProfileOptionData;
        Object f = C19785a.f(PlusControlSettings.builder().isHideAds(this.f8372b.m14942P()).isHideAge(this.f8372b.m14943Q()).isHideDistance(this.f8372b.m14944R()).blend(Blend.from(this.f8372b.m14940N())).discoverableParty(DiscoverableParty.from(this.f8372b.m14941O())).build());
        C2668g.m10305a(f, "BehaviorSubject.create(tinderPlusSettings)");
        this.f8371a = f;
    }

    @Deprecated(message = "Should be replaced with SavePlusControlSettings#execute()")
    /* renamed from: a */
    public final void m10168a(@NotNull PlusControlSettings plusControlSettings, @NotNull Subscription subscription) {
        C2668g.m10309b(plusControlSettings, "plusControlSettings");
        C2668g.m10309b(subscription, "subscription");
        if (!this.f8373c.profileV2EnabledForRevenue()) {
            if (!C2668g.m10308a((Object) plusControlSettings, (PlusControlSettings) this.f8371a.A()) || (!(subscription.isActiveSubscription() && plusControlSettings.isHideAds()) && subscription.isActiveSubscription())) {
                m10167b(plusControlSettings, subscription);
                this.f8371a.onNext(plusControlSettings);
            }
        }
    }

    /* renamed from: b */
    private final void m10167b(PlusControlSettings plusControlSettings, Subscription subscription) {
        this.f8372b.m15002t(subscription.isActiveSubscription());
        this.f8372b.m15003u(plusControlSettings.isHideAge());
        this.f8372b.m15005v(plusControlSettings.isHideDistance());
        this.f8372b.m14967e(plusControlSettings.blend().toString());
        this.f8372b.m14969f(plusControlSettings.discoverableParty().toString());
    }
}
