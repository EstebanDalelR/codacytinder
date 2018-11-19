package com.tinder.places.onboarding.p316b;

import android.content.Context;
import com.tinder.R;
import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.meta.model.Location;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.places.model.PlacesOnboardingConfig;
import com.tinder.domain.places.model.PlacesOnboardingConfig.OnboardingRec;
import com.tinder.domain.profile.model.ProfileOption.Discovery;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.module.ForApplication;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/places/onboarding/usecase/GetOnboardingConfig;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "context", "Landroid/content/Context;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Landroid/content/Context;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "createLocation", "Lcom/tinder/domain/meta/model/Location;", "lat", "", "lon", "execute", "Lrx/Single;", "bucket", "getApiConfig", "getFallbackConfig", "getFallbackPlace", "Lcom/tinder/domain/places/model/Place;", "id", "iconName", "getFallbackRec", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;", "genderFilter", "Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;", "getFallbackTitles", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.b.a */
public final class C12396a implements SingleUseCase<String, PlacesOnboardingConfig> {
    /* renamed from: a */
    private final Context f40034a;
    /* renamed from: b */
    private final LoadProfileOptionData f40035b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "it", "Lcom/tinder/domain/meta/model/DiscoverySettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.b.a$a */
    static final class C12395a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C12396a f40033a;

        C12395a(C12396a c12396a) {
            this.f40033a = c12396a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48806a((DiscoverySettings) obj);
        }

        @NotNull
        /* renamed from: a */
        public final PlacesOnboardingConfig m48806a(@NotNull DiscoverySettings discoverySettings) {
            C2668g.b(discoverySettings, "it");
            Place a = C12396a.m48810a(this.f40033a, "102", null, 2, null);
            List b = C19301m.b(new String[]{this.f40033a.f40034a.getString(R.string.places_onboarding_fallback_chat1), this.f40033a.f40034a.getString(R.string.places_onboarding_fallback_chat2), this.f40033a.f40034a.getString(R.string.places_onboarding_fallback_chat3)});
            C12396a c12396a = this.f40033a;
            GenderFilter genderFilter = discoverySettings.genderFilter();
            C2668g.a(genderFilter, "it.genderFilter()");
            List a2 = c12396a.m48812a(genderFilter);
            List b2 = C19301m.b(new Place[]{this.f40033a.m48811a("107", "ramen"), this.f40033a.m48811a("108", "art"), this.f40033a.m48811a("102", "music"), this.f40033a.m48811a("106", "beer"), this.f40033a.m48811a("104", "pizza")});
            C12396a c12396a2 = this.f40033a;
            discoverySettings = discoverySettings.genderFilter();
            C2668g.a(discoverySettings, "it.genderFilter()");
            return new PlacesOnboardingConfig(a, b, a2, b2, c12396a2.m48815b(discoverySettings));
        }
    }

    @Inject
    public C12396a(@NotNull @ForApplication Context context, @NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.b(context, "context");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        this.f40034a = context;
        this.f40035b = loadProfileOptionData;
    }

    public /* synthetic */ Single execute(Object obj) {
        return m48818a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Single<PlacesOnboardingConfig> m48818a(@NotNull String str) {
        C2668g.b(str, "bucket");
        str = m48814a().b(m48817b());
        C2668g.a(str, "getApiConfig().onErrorRe…Next(getFallbackConfig())");
        return str;
    }

    /* renamed from: a */
    private final Single<PlacesOnboardingConfig> m48814a() {
        Single<PlacesOnboardingConfig> a = Single.a(new RuntimeException("API call not connected yet"));
        C2668g.a(a, "Single.error(RuntimeExce…call not connected yet\"))");
        return a;
    }

    /* renamed from: b */
    private final Single<PlacesOnboardingConfig> m48817b() {
        C3960g e = this.f40035b.execute(Discovery.INSTANCE).firstOrError().b(C15756a.b()).a(C15674a.a()).e(new C12395a(this));
        C2668g.a(e, "loadProfileOptionData.ex…          )\n            }");
        return RxJavaInteropExtKt.toV1Single(e);
    }

    /* renamed from: a */
    private final List<String> m48812a(GenderFilter genderFilter) {
        List arrayList = new ArrayList();
        Context context = this.f40034a;
        switch (C10257b.f33374a[genderFilter.ordinal()]) {
            case 1:
                genderFilter = R.string.places_onboarding_fallback_intro_title_males;
                break;
            case 2:
                genderFilter = R.string.places_onboarding_fallback_intro_title_females;
                break;
            case 3:
                genderFilter = R.string.places_onboarding_fallback_intro_title_both;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        genderFilter = context.getString(genderFilter);
        C2668g.a(genderFilter, "context.getString(\n     …tro_title_both\n        })");
        arrayList.add(genderFilter);
        genderFilter = this.f40034a.getString(R.string.places_onboarding_fallback_card_title);
        C2668g.a(genderFilter, "context.getString(R.stri…ding_fallback_card_title)");
        arrayList.add(genderFilter);
        genderFilter = this.f40034a.getString(R.string.places_onboarding_fallback_chat_title);
        C2668g.a(genderFilter, "context.getString(R.stri…ding_fallback_chat_title)");
        arrayList.add(genderFilter);
        return C19301m.l(arrayList);
    }

    /* renamed from: b */
    private final OnboardingRec m48815b(GenderFilter genderFilter) {
        String stringBuilder;
        StringBuilder stringBuilder2;
        if (genderFilter == GenderFilter.MALE) {
            genderFilter = "Michael";
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("android.resource://");
            stringBuilder2.append(this.f40034a.getPackageName());
            stringBuilder2.append("/drawable/places_onboarding_fallback_male");
            stringBuilder = stringBuilder2.toString();
        } else {
            genderFilter = "Amanda";
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("android.resource://");
            stringBuilder2.append(this.f40034a.getPackageName());
            stringBuilder2.append("/drawable/places_onboarding_fallback_female");
            stringBuilder = stringBuilder2.toString();
        }
        return new OnboardingRec(genderFilter, stringBuilder, "UNSW");
    }

    /* renamed from: a */
    private final Location m48808a(double d, double d2) {
        d = Location.builder().lat(d).lon(d2).build();
        C2668g.a(d, "Location.builder().lat(lat).lon(lon).build()");
        return d;
    }

    /* renamed from: a */
    static /* synthetic */ Place m48810a(C12396a c12396a, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "beer";
        }
        return c12396a.m48811a(str, str2);
    }

    /* renamed from: a */
    private final Place m48811a(String str, String str2) {
        String string = this.f40034a.getString(R.string.places_onboarding_fallback_place_name);
        Location a = m48808a(34.0553d, -118.2498d);
        DateTime a2 = DateTime.a("2012-01-10");
        List a3 = C19301m.a();
        long parseLong = Long.parseLong(str);
        C2668g.a(string, "name");
        C2668g.a(a2, "dateTime");
        return new Place(parseLong, string, a, str2, a2, true, false, a3, null, 0, 0, 1792, null);
    }
}
