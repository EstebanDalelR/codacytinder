package com.tinder.places.provider;

import com.tinder.domain.profile.model.PlacesUpdateRequest;
import com.tinder.domain.profile.model.ProfileOption.Places;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.p238f.p239a.C9363a;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/provider/ProfilePlacesEnabledProvider;", "Lcom/tinder/places/provider/PlacesEnabledProvider;", "profileRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "crmAttributesReporter", "Lcom/tinder/meta/analytics/CrmAttributesReporter;", "(Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/meta/analytics/CrmAttributesReporter;)V", "observePlacesEnabled", "Lio/reactivex/Observable;", "", "setPlacesEnabled", "Lio/reactivex/Completable;", "placesEnabled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.m */
public final class C12425m implements PlacesEnabledProvider {
    /* renamed from: a */
    private final ProfileRemoteRepository f40080a;
    /* renamed from: b */
    private final LoadProfileOptionData f40081b;
    /* renamed from: c */
    private final C9363a f40082c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.m$a */
    static final class C12423a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12423a f40077a = new C12423a();

        C12423a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m48863a((PlacesSettings) obj));
        }

        /* renamed from: a */
        public final boolean m48863a(@NotNull PlacesSettings placesSettings) {
            C2668g.b(placesSettings, "it");
            return placesSettings.getEnabled();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.m$b */
    static final class C12424b implements Action {
        /* renamed from: a */
        final /* synthetic */ C12425m f40078a;
        /* renamed from: b */
        final /* synthetic */ boolean f40079b;

        C12424b(C12425m c12425m, boolean z) {
            this.f40078a = c12425m;
            this.f40079b = z;
        }

        public final void run() {
            this.f40078a.f40082c.m39208a(this.f40079b);
        }
    }

    @Inject
    public C12425m(@NotNull ProfileRemoteRepository profileRemoteRepository, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull C9363a c9363a) {
        C2668g.b(profileRemoteRepository, "profileRepository");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(c9363a, "crmAttributesReporter");
        this.f40080a = profileRemoteRepository;
        this.f40081b = loadProfileOptionData;
        this.f40082c = c9363a;
    }

    @NotNull
    public C3956a setPlacesEnabled(boolean z) {
        z = this.f40080a.update(new PlacesUpdateRequest(new PlacesSettings(z))).b(new C12424b(this, z));
        C2668g.a(z, "profileRepository.update…sEnabled(placesEnabled) }");
        return z;
    }

    @NotNull
    public C3959e<Boolean> observePlacesEnabled() {
        C3959e<Boolean> map = this.f40081b.execute(Places.INSTANCE).map(C12423a.f40077a);
        C2668g.a(map, "loadProfileOptionData.ex…      .map { it.enabled }");
        return map;
    }
}
