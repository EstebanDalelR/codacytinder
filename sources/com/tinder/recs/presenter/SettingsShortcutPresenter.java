package com.tinder.recs.presenter;

import com.facebook.ads.AdError;
import com.tinder.R;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.profile.usecase.LoadDiscoverySettings;
import com.tinder.managers.bj;
import com.tinder.recs.analytics.AddRecsInteractEvent;
import com.tinder.recs.analytics.AddRecsInteractEvent.Request;
import com.tinder.recs.analytics.AddRecsInteractEvent.Type;
import com.tinder.recs.model.AgeConfig;
import com.tinder.recs.target.SettingsShortcutTarget;
import com.tinder.recs.usecase.UpdateDiscoverySettings;
import com.tinder.utils.ac;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\r\u0010\u0017\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0018J\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u000e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002J\u0018\u0010#\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\r\u0010$\u001a\u00020\u0014H\u0001¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001e\u0010'\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u0002\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/tinder/recs/presenter/SettingsShortcutPresenter;", "", "updateDiscoverySettings", "Lcom/tinder/recs/usecase/UpdateDiscoverySettings;", "managerSettings", "Lcom/tinder/managers/ManagerSettings;", "loadDiscoverySettings", "Lcom/tinder/domain/profile/usecase/LoadDiscoverySettings;", "addRecsInteractEvent", "Lcom/tinder/recs/analytics/AddRecsInteractEvent;", "(Lcom/tinder/recs/usecase/UpdateDiscoverySettings;Lcom/tinder/managers/ManagerSettings;Lcom/tinder/domain/profile/usecase/LoadDiscoverySettings;Lcom/tinder/recs/analytics/AddRecsInteractEvent;)V", "discoverySettingsDisposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/recs/target/SettingsShortcutTarget;", "getTarget$Tinder_release", "()Lcom/tinder/recs/target/SettingsShortcutTarget;", "setTarget$Tinder_release", "(Lcom/tinder/recs/target/SettingsShortcutTarget;)V", "convertDistanceBasedOnPreferredUnit", "", "distanceInMiles", "", "drop", "drop$Tinder_release", "fireRecsInteractEvent", "type", "Lcom/tinder/recs/analytics/AddRecsInteractEvent$Type;", "ageConfig", "Lcom/tinder/recs/model/AgeConfig;", "initializeAgeBar", "onAgeChanged", "onDistanceChanged", "setUserPreferredAgeBarValues", "setUserPreferredDistanceValues", "subscribeToDiscoverySettings", "take", "take$Tinder_release", "updateAgeBarRange", "updateDiscoveryPrefs", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SettingsShortcutPresenter {
    private final AddRecsInteractEvent addRecsInteractEvent;
    private Disposable discoverySettingsDisposable;
    private final LoadDiscoverySettings loadDiscoverySettings;
    private final bj managerSettings;
    @DeadshotTarget
    @NotNull
    public SettingsShortcutTarget target;
    private final UpdateDiscoverySettings updateDiscoverySettings;

    @Inject
    public SettingsShortcutPresenter(@NotNull UpdateDiscoverySettings updateDiscoverySettings, @NotNull bj bjVar, @NotNull LoadDiscoverySettings loadDiscoverySettings, @NotNull AddRecsInteractEvent addRecsInteractEvent) {
        C2668g.b(updateDiscoverySettings, "updateDiscoverySettings");
        C2668g.b(bjVar, "managerSettings");
        C2668g.b(loadDiscoverySettings, "loadDiscoverySettings");
        C2668g.b(addRecsInteractEvent, "addRecsInteractEvent");
        this.updateDiscoverySettings = updateDiscoverySettings;
        this.managerSettings = bjVar;
        this.loadDiscoverySettings = loadDiscoverySettings;
        this.addRecsInteractEvent = addRecsInteractEvent;
    }

    @NotNull
    public final SettingsShortcutTarget getTarget$Tinder_release() {
        SettingsShortcutTarget settingsShortcutTarget = this.target;
        if (settingsShortcutTarget == null) {
            C2668g.b("target");
        }
        return settingsShortcutTarget;
    }

    public final void setTarget$Tinder_release(@NotNull SettingsShortcutTarget settingsShortcutTarget) {
        C2668g.b(settingsShortcutTarget, "<set-?>");
        this.target = settingsShortcutTarget;
    }

    @Take
    public final void take$Tinder_release() {
        initializeAgeBar();
        setUserPreferredAgeBarValues();
        setUserPreferredDistanceValues();
    }

    @Drop
    public final void drop$Tinder_release() {
        Disposable disposable = this.discoverySettingsDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void onDistanceChanged(int i) {
        convertDistanceBasedOnPreferredUnit(i);
    }

    public final void onAgeChanged(@NotNull AgeConfig ageConfig) {
        C2668g.b(ageConfig, "ageConfig");
        updateAgeBarRange(ageConfig);
    }

    public final void updateDiscoveryPrefs(@NotNull AgeConfig ageConfig, int i, @NotNull Type type) {
        C2668g.b(ageConfig, "ageConfig");
        C2668g.b(type, "type");
        int i2;
        if (ageConfig.getMaxAge() >= 55) {
            i2 = AdError.NETWORK_ERROR_CODE;
        } else {
            i2 = ageConfig.getMaxAge();
        }
        if (ageConfig.getMinAge() == this.managerSettings.c() && r0 == this.managerSettings.d()) {
            if (((float) i) == this.managerSettings.b()) {
                SettingsShortcutTarget settingsShortcutTarget = this.target;
                if (settingsShortcutTarget == null) {
                    C2668g.b("target");
                }
                settingsShortcutTarget.showNothingToUpdateMessage();
                fireRecsInteractEvent(type, ageConfig, i);
            }
        }
        subscribeToDiscoverySettings(new AgeConfig(ageConfig.getMinAge(), ageConfig.getMaxAge()), i);
        fireRecsInteractEvent(type, ageConfig, i);
    }

    public final void fireRecsInteractEvent(@NotNull Type type, @NotNull AgeConfig ageConfig, int i) {
        C2668g.b(type, "type");
        C2668g.b(ageConfig, "ageConfig");
        this.addRecsInteractEvent.execute(new Request(type.getAnalyticsValue(), this.managerSettings.b(), this.managerSettings.c(), this.managerSettings.d(), (float) i, ageConfig.getMinAge(), ageConfig.getMaxAge()));
    }

    private final void initializeAgeBar() {
        SettingsShortcutTarget settingsShortcutTarget = this.target;
        if (settingsShortcutTarget == null) {
            C2668g.b("target");
        }
        settingsShortcutTarget.setAgeRange(18, 55, 46);
    }

    private final void setUserPreferredAgeBarValues() {
        updateAgeBarRange(new AgeConfig(Math.max(this.managerSettings.c(), 18), Math.min(this.managerSettings.d(), 55)));
    }

    private final void setUserPreferredDistanceValues() {
        int b = (int) this.managerSettings.b();
        SettingsShortcutTarget settingsShortcutTarget = this.target;
        if (settingsShortcutTarget == null) {
            C2668g.b("target");
        }
        settingsShortcutTarget.setStartingDistance(b);
        convertDistanceBasedOnPreferredUnit(b);
    }

    private final void convertDistanceBasedOnPreferredUnit(int i) {
        boolean a = this.managerSettings.a();
        int i2 = a ? R.string.short_distance_unit_mi : R.string.short_distance_unit_km;
        if (!a) {
            i = (int) ((float) Math.rint((double) ac.m57610a((float) i)));
        }
        SettingsShortcutTarget settingsShortcutTarget = this.target;
        if (settingsShortcutTarget == null) {
            C2668g.b("target");
        }
        settingsShortcutTarget.setDistanceText(i2, i);
    }

    private final void updateAgeBarRange(AgeConfig ageConfig) {
        int minAge = ageConfig.getMinAge();
        ageConfig = ageConfig.getMaxAge();
        SettingsShortcutTarget settingsShortcutTarget = this.target;
        if (settingsShortcutTarget == null) {
            C2668g.b("target");
        }
        settingsShortcutTarget.setAgeBarValues(minAge, ageConfig);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(minAge);
        stringBuilder.append(" - ");
        stringBuilder.append(ageConfig);
        String stringBuilder2 = stringBuilder.toString();
        settingsShortcutTarget = this.target;
        if (settingsShortcutTarget == null) {
            C2668g.b("target");
        }
        settingsShortcutTarget.setAgeText(stringBuilder2);
        if (ageConfig >= 55) {
            ageConfig = new StringBuilder();
            ageConfig.append("");
            ageConfig.append(stringBuilder2);
            ageConfig.append('+');
            ageConfig = ageConfig.toString();
            SettingsShortcutTarget settingsShortcutTarget2 = this.target;
            if (settingsShortcutTarget2 == null) {
                C2668g.b("target");
            }
            settingsShortcutTarget2.setAgeText(ageConfig);
        }
    }

    private final void subscribeToDiscoverySettings(AgeConfig ageConfig, int i) {
        Disposable disposable = this.discoverySettingsDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.discoverySettingsDisposable = this.loadDiscoverySettings.execute().e(new SettingsShortcutPresenter$subscribeToDiscoverySettings$1(this, ageConfig, i)).d((Function) new SettingsShortcutPresenter$subscribeToDiscoverySettings$2(this)).b(C15756a.m59010b()).a(C15674a.m58830a()).a((Action) new SettingsShortcutPresenter$subscribeToDiscoverySettings$3(this), new SettingsShortcutPresenter$subscribeToDiscoverySettings$4(this));
    }

    private final DiscoverySettings updateDiscoverySettings(AgeConfig ageConfig, int i) {
        ageConfig = DiscoverySettings.builder().isDiscoverable(this.managerSettings.g()).genderFilter(GenderFilter.fromToggles(this.managerSettings.f(), this.managerSettings.e())).distanceFilter(i).minAgeFilter(ageConfig.getMinAge()).maxAgeFilter(ageConfig.getMaxAge()).build();
        C2668g.a(ageConfig, "DiscoverySettings.builde…Age)\n            .build()");
        return ageConfig;
    }
}
