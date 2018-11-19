package com.tinder.application;

import android.content.Context;
import com.mapbox.mapboxsdk.maps.MapboxTelemetryProvider;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.data.places.p330b.C10896d;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.analytics.AddPlacesRemoveRecentPlaceEvent;
import com.tinder.places.injection.C10213b;
import com.tinder.places.injection.C13577c;
import com.tinder.places.injection.C13578d;
import com.tinder.places.injection.PlacesSettingsComponent;
import com.tinder.places.main.presenter.C10220d;
import com.tinder.places.main.view.C12373d;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.p311f.C12336a;
import com.tinder.places.p311f.C12337b;
import com.tinder.places.provider.PlacesEnabledProvider;
import com.tinder.places.settings.activity.PlacesSettingsActivity;
import com.tinder.places.settings.presenter.C14318c;
import com.tinder.places.settings.view.C16039c;
import com.tinder.places.settings.view.EditablePlacesRecyclerView;
import com.tinder.places.settings.view.PlacesSettingsView;
import com.tinder.purchase.register.Register;
import com.tinder.updates.UpdatesScheduler;
import de.greenrobot.event.C2664c;

final class a$y implements PlacesSettingsComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33692a;
    /* renamed from: b */
    private C10213b f33693b;

    public void inject(EditablePlacesRecyclerView editablePlacesRecyclerView) {
    }

    private a$y(C4423a c4423a, a$x a_x) {
        this.f33692a = c4423a;
        m42077a(a_x);
    }

    /* renamed from: a */
    private C10896d m42073a() {
        return new C10896d((PlacesRepository) C4423a.eG(this.f33692a).get());
    }

    /* renamed from: b */
    private C12337b m42078b() {
        return C13577c.m52999a(this.f33693b, (PlacesRepository) C4423a.eG(this.f33692a).get());
    }

    /* renamed from: c */
    private C12336a m42079c() {
        return new C12336a((PlacesRepository) C4423a.eG(this.f33692a).get());
    }

    /* renamed from: d */
    private AddPlacesManageEnabledEvent m42080d() {
        return new AddPlacesManageEnabledEvent((C2630h) C4423a.u(this.f33692a).get());
    }

    /* renamed from: e */
    private AddPlacesRemoveRecentPlaceEvent m42081e() {
        return new AddPlacesRemoveRecentPlaceEvent((C2630h) C4423a.u(this.f33692a).get());
    }

    /* renamed from: f */
    private MapboxTelemetryProvider m42082f() {
        return new MapboxTelemetryProvider((Context) C4423a.aR(this.f33692a).get());
    }

    /* renamed from: g */
    private C14318c m42083g() {
        return new C14318c((PlacesLoadedStateProvider) C4423a.eI(this.f33692a).get(), m42073a(), m42078b(), m42079c(), C4423a.eJ(this.f33692a), (PlacesEnabledProvider) C4423a.eK(this.f33692a).get(), m42080d(), m42081e(), C4423a.eQ(this.f33692a), m42082f(), this.f33692a.loadProfileOptionData());
    }

    /* renamed from: a */
    private void m42077a(a$x a_x) {
        this.f33693b = a_x.f33690b;
    }

    public void inject(PlacesSettingsActivity placesSettingsActivity) {
        m42075a(placesSettingsActivity);
    }

    public void inject(PlacesSettingsView placesSettingsView) {
        m42076a(placesSettingsView);
    }

    public void inject(PlacesPinDropView placesPinDropView) {
        m42074a(placesPinDropView);
    }

    /* renamed from: a */
    private PlacesSettingsActivity m42075a(PlacesSettingsActivity placesSettingsActivity) {
        C10358b.m42176a((ActivityBase) placesSettingsActivity, (bk) C4423a.j(this.f33692a).get());
        C10358b.m42174a((ActivityBase) placesSettingsActivity, (C2652a) C4423a.k(this.f33692a).get());
        C10358b.m42173a((ActivityBase) placesSettingsActivity, (UserMetaManager) C4423a.l(this.f33692a).get());
        C10358b.m42172a((ActivityBase) placesSettingsActivity, (ManagerFusedLocation) C4423a.m(this.f33692a).get());
        C10358b.m42177a((ActivityBase) placesSettingsActivity, (bt) C4423a.h(this.f33692a).get());
        C10358b.m42175a((ActivityBase) placesSettingsActivity, (af) C4423a.n(this.f33692a).get());
        C10358b.m42178a((ActivityBase) placesSettingsActivity, (C2664c) C4423a.o(this.f33692a).get());
        C10358b.m42171a((ActivityBase) placesSettingsActivity, (ManagerAnalytics) C4423a.p(this.f33692a).get());
        C10363g.m42184a((ActivitySignedInBase) placesSettingsActivity, (bk) C4423a.j(this.f33692a).get());
        C10363g.m42183a((ActivitySignedInBase) placesSettingsActivity, (ManagerProfile) C4423a.v(this.f33692a).get());
        C10363g.m42191a((ActivitySignedInBase) placesSettingsActivity, (UpdatesScheduler) C4423a.w(this.f33692a).get());
        C10363g.m42182a((ActivitySignedInBase) placesSettingsActivity, (ManagerDeepLinking) C4423a.x(this.f33692a).get());
        C10363g.m42185a((ActivitySignedInBase) placesSettingsActivity, (bq) C4423a.y(this.f33692a).get());
        C10363g.m42187a((ActivitySignedInBase) placesSettingsActivity, C4423a.z(this.f33692a));
        C10363g.m42186a((ActivitySignedInBase) placesSettingsActivity, C4423a.A(this.f33692a));
        C10363g.m42192a((ActivitySignedInBase) placesSettingsActivity, (C2664c) C4423a.B(this.f33692a).get());
        C10363g.m42189a((ActivitySignedInBase) placesSettingsActivity, (Register) C4423a.C(this.f33692a).get());
        C10363g.m42181a((ActivitySignedInBase) placesSettingsActivity, (C8259d) C4423a.D(this.f33692a).get());
        C10363g.m42188a((ActivitySignedInBase) placesSettingsActivity, C4423a.E(this.f33692a));
        C10363g.m42190a((ActivitySignedInBase) placesSettingsActivity, C4423a.F(this.f33692a));
        return placesSettingsActivity;
    }

    /* renamed from: a */
    private PlacesSettingsView m42076a(PlacesSettingsView placesSettingsView) {
        C16039c.a(placesSettingsView, m42083g());
        C16039c.a(placesSettingsView, C13578d.m53003b(this.f33693b));
        return placesSettingsView;
    }

    /* renamed from: a */
    private PlacesPinDropView m42074a(PlacesPinDropView placesPinDropView) {
        C12373d.m48775a(placesPinDropView, new C10220d());
        return placesPinDropView;
    }
}
