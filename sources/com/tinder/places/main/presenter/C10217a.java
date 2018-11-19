package com.tinder.places.main.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.profile.model.ProfileOption.Discovery;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.places.main.target.PlacesDisabledTarget;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/main/presenter/PlacesDisabledPresenter;", "", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "profileSubscription", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/places/main/target/PlacesDisabledTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/main/target/PlacesDisabledTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/main/target/PlacesDisabledTarget;)V", "bindGender", "", "unsubscribe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.main.presenter.a */
public final class C10217a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlacesDisabledTarget f33283a;
    /* renamed from: b */
    private Disposable f33284b;
    /* renamed from: c */
    private final LoadProfileOptionData f33285c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;", "discoverySettings", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.a$a */
    static final class C12349a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12349a f39965a = new C12349a();

        C12349a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48742a((DiscoverySettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final GenderFilter m48742a(@NotNull DiscoverySettings discoverySettings) {
            C2668g.b(discoverySettings, "discoverySettings");
            return discoverySettings.genderFilter();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.a$b */
    static final class C12350b<T> implements Consumer<GenderFilter> {
        /* renamed from: a */
        final /* synthetic */ C10217a f39966a;

        C12350b(C10217a c10217a) {
            this.f39966a = c10217a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48743a((GenderFilter) obj);
        }

        /* renamed from: a */
        public final void m48743a(GenderFilter genderFilter) {
            if (genderFilter != null) {
                switch (C10218b.f33286a[genderFilter.ordinal()]) {
                    case 1:
                        this.f39966a.m41541a().setMaleGenderPreference();
                        return;
                    case 2:
                        this.f39966a.m41541a().setFemaleGenderPreference();
                        return;
                    case 3:
                        this.f39966a.m41541a().setNeutralGenderPreference();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.presenter.a$c */
    static final class C12351c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10217a f39967a;

        C12351c(C10217a c10217a) {
            this.f39967a = c10217a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48744a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48744a(Throwable th) {
            C0001a.c(th, "Error getting discovery settings for user", new Object[0]);
            this.f39967a.m41541a().setNeutralGenderPreference();
        }
    }

    @Inject
    public C10217a(@NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        this.f33285c = loadProfileOptionData;
    }

    @NotNull
    /* renamed from: a */
    public final PlacesDisabledTarget m41541a() {
        PlacesDisabledTarget placesDisabledTarget = this.f33283a;
        if (placesDisabledTarget == null) {
            C2668g.b("target");
        }
        return placesDisabledTarget;
    }

    @Take
    /* renamed from: b */
    public final void m41542b() {
        Disposable disposable = this.f33284b;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f33284b = this.f33285c.execute(Discovery.INSTANCE).map(C12349a.f39965a).observeOn(C15674a.a()).subscribe(new C12350b(this), new C12351c(this));
    }

    @Drop
    /* renamed from: c */
    public final void m41543c() {
        Disposable disposable = this.f33284b;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
