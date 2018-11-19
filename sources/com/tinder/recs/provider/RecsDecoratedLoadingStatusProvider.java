package com.tinder.recs.provider;

import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.meta.usecase.ObserveCurrentUser;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.model.RecsDecoratedLoadingStatusInfo;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.C15756a;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001c\u001a\u00020\u001aH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b \f*\u0012\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/recs/provider/RecsDecoratedLoadingStatusProvider;", "", "observeCurrentUser", "Lcom/tinder/domain/meta/usecase/ObserveCurrentUser;", "observeDiscoverySettings", "Lcom/tinder/domain/profile/usecase/ObserveDiscoverySettings;", "(Lcom/tinder/domain/meta/usecase/ObserveCurrentUser;Lcom/tinder/domain/profile/usecase/ObserveDiscoverySettings;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "kotlin.jvm.PlatformType", "createRecsDecoratedLoadingStatusInfo", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "observeChanges", "Lio/reactivex/Observable;", "shouldShowMessageStandardsMaleLoading", "", "gender", "Lcom/tinder/domain/common/model/Gender;", "shouldShowSettingsDialogOnRec", "startSubscription", "", "stopSubscription", "subscribedToLoadingStatusDiscoverySettings", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsDecoratedLoadingStatusProvider {
    private Disposable disposable;
    private final ObserveCurrentUser observeCurrentUser;
    private final ObserveDiscoverySettings observeDiscoverySettings;
    private final C19040a<RecsDecoratedLoadingStatusInfo> subject = C19040a.m67695a(new RecsDecoratedLoadingStatusInfo(false, false));

    @Inject
    public RecsDecoratedLoadingStatusProvider(@NotNull ObserveCurrentUser observeCurrentUser, @NotNull ObserveDiscoverySettings observeDiscoverySettings) {
        C2668g.b(observeCurrentUser, "observeCurrentUser");
        C2668g.b(observeDiscoverySettings, "observeDiscoverySettings");
        this.observeCurrentUser = observeCurrentUser;
        this.observeDiscoverySettings = observeDiscoverySettings;
    }

    @NotNull
    public final C3959e<RecsDecoratedLoadingStatusInfo> observeChanges() {
        C3959e<RecsDecoratedLoadingStatusInfo> distinctUntilChanged = this.subject.hide().distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "subject\n            .hid…  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    public final void startSubscription() {
        subscribedToLoadingStatusDiscoverySettings();
    }

    public final void stopSubscription() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private final void subscribedToLoadingStatusDiscoverySettings() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.disposable = C3959e.combineLatest(RxJavaInteropExtKt.toV2Observable(this.observeCurrentUser.execute()), this.observeDiscoverySettings.execute(), new C16405xc019e2a0(this)).subscribeOn(C15756a.m59010b()).subscribe(new C16406xc019e2a1(this), C16407xc019e2a2.INSTANCE);
    }

    private final RecsDecoratedLoadingStatusInfo createRecsDecoratedLoadingStatusInfo(CurrentUser currentUser, DiscoverySettings discoverySettings) {
        boolean shouldShowSettingsDialogOnRec = shouldShowSettingsDialogOnRec(discoverySettings);
        currentUser = currentUser.gender();
        C2668g.a(currentUser, "currentUser.gender()");
        return new RecsDecoratedLoadingStatusInfo(shouldShowSettingsDialogOnRec, shouldShowMessageStandardsMaleLoading(currentUser, discoverySettings));
    }

    private final boolean shouldShowSettingsDialogOnRec(DiscoverySettings discoverySettings) {
        int distanceFilter = discoverySettings.distanceFilter();
        return ((discoverySettings.minAgeFilter() <= 18 ? true : null) & (discoverySettings.maxAgeFilter() >= 55 ? 1 : 0)) == null || distanceFilter < 100;
    }

    private final boolean shouldShowMessageStandardsMaleLoading(Gender gender, DiscoverySettings discoverySettings) {
        int i = 0;
        gender = gender.value() == Value.MALE ? true : null;
        int i2 = discoverySettings.genderFilter() == GenderFilter.FEMALE ? 1 : 0;
        if (discoverySettings.genderFilter() == GenderFilter.MALE) {
            i = 1;
        }
        return (gender & i2) & (i ^ 1);
    }
}
