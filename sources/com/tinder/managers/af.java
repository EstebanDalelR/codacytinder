package com.tinder.managers;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.android.volley.C3001b;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C2635n;
import com.tinder.analytics.performance.C8146b;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.JsonObjectRequestHeader;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.provider.LocationPingUpdatesProvider;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.interactors.C9719k;
import com.tinder.listeners.ListenerPing;
import com.tinder.model.PingLocation;
import com.tinder.model.SparksEvent;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.ad;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
public class af implements LocationPingUpdatesProvider {
    /* renamed from: a */
    private boolean f39001a = false;
    /* renamed from: b */
    private boolean f39002b = false;
    /* renamed from: c */
    private final bk f39003c;
    /* renamed from: d */
    private final ManagerFusedLocation f39004d;
    /* renamed from: e */
    private final ManagerNetwork f39005e;
    /* renamed from: f */
    private final ManagerAnalytics f39006f;
    /* renamed from: g */
    private final C15193i f39007g;
    /* renamed from: h */
    private final C9719k f39008h;
    /* renamed from: i */
    private final C8146b f39009i;
    /* renamed from: j */
    private final EnvironmentProvider f39010j;
    /* renamed from: k */
    private final MetaGateway f39011k;
    /* renamed from: l */
    private final SyncProfileData f39012l;
    /* renamed from: m */
    private JsonObjectRequestHeader f39013m;
    /* renamed from: n */
    private final PublishSubject<PingLocation> f39014n;

    /* renamed from: a */
    private boolean m48063a(float f) {
        return f > 1609.0f;
    }

    @Inject
    public af(ManagerFusedLocation managerFusedLocation, ManagerNetwork managerNetwork, bk bkVar, ManagerAnalytics managerAnalytics, C15193i c15193i, C9719k c9719k, C2630h c2630h, AbTestUtility abTestUtility, EnvironmentProvider environmentProvider, MetaGateway metaGateway, SyncProfileData syncProfileData) {
        this.f39004d = managerFusedLocation;
        this.f39005e = managerNetwork;
        this.f39003c = bkVar;
        this.f39006f = managerAnalytics;
        this.f39007g = c15193i;
        this.f39008h = c9719k;
        this.f39011k = metaGateway;
        this.f39012l = syncProfileData;
        this.f39009i = new C8146b(c2630h, abTestUtility);
        this.f39010j = environmentProvider;
        this.f39014n = PublishSubject.w();
    }

    /* renamed from: a */
    public void m48068a(@NonNull ListenerPing listenerPing, boolean z) {
        ad.a();
        String a = C2652a.a();
        double d = this.f39004d.d();
        double e = this.f39004d.e();
        if (a == null) {
            ad.a("no token");
            this.f39002b = false;
            listenerPing.onLoggedOut();
        } else if (!z && !this.f39004d.b()) {
            ad.a("no location");
            this.f39002b = false;
            listenerPing.onBadLocation();
        } else if (this.f39004d.b()) {
            z = new StringBuilder();
            z.append("Proceeding to ping ... lat = ");
            z.append(d);
            z.append(" long =");
            z.append(e);
            ad.a(z.toString());
            z = new JSONObject();
            try {
                z.put(ManagerWebServices.PARAM_LAT, d);
                z.put(ManagerWebServices.PARAM_LON, e);
            } catch (Throwable e2) {
                ad.a("Failed to put lat/long into json", e2);
            }
            String str = ManagerWebServices.URL_PING;
            this.f39013m = new JsonObjectRequestHeader(1, str, z, new ag(this, str, listenerPing), new ah(this, str, listenerPing), a);
            this.f39009i.a("PING_TIMER_KEY");
            this.f39013m.setRetryPolicy(m48066a());
            this.f39005e.addRequest(this.f39013m);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m48070a(String str, @NonNull ListenerPing listenerPing, JSONObject jSONObject) {
        m48062a("PING_TIMER_KEY", str, "POST");
        str = new StringBuilder();
        str.append("response=");
        str.append(jSONObject);
        ad.a(str.toString());
        this.f39001a = true;
        try {
            if (jSONObject.optInt("status", Callback.DEFAULT_DRAG_ANIMATION_DURATION) == 200) {
                this.f39006f.m40477a(new SparksEvent("Account.Ping"));
                this.f39002b = true;
                listenerPing.onPingSuccess();
                if (this.f39007g.c() == null) {
                    str = C15551e.a(this.f39011k.fetchMeta()).b(this.f39012l.execute(SyncProfileData.ALL_PROFILE_OPTIONS_SYNC_REQUEST)).b(C15756a.b());
                    jSONObject = this.f39008h;
                    jSONObject.getClass();
                    str.a(ai.m48071a(jSONObject), aj.f39022a);
                    return;
                }
                return;
            }
            this.f39002b = false;
            listenerPing.onPingFailure();
        } catch (String str2) {
            ad.a("Failed to ping", str2);
            this.f39002b = false;
            listenerPing.onPingFailure();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m48069a(String str, @NonNull ListenerPing listenerPing, VolleyError volleyError) {
        C0001a.c(volleyError, ManagerWebServices.URL_PING, new Object[0]);
        m48062a("PING_TIMER_KEY", str, "POST");
        this.f39001a = true;
        this.f39002b = false;
        listenerPing.onPingFailure();
    }

    /* renamed from: a */
    private void m48062a(String str, String str2, String str3) {
        this.f39009i.b(str);
        C8146b c8146b = this.f39009i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f39010j.getUrlBase());
        stringBuilder.append(str2);
        c8146b.a(str, C2635n.a(stringBuilder.toString()), str3, this.f39013m.getStatusCode());
    }

    @NonNull
    /* renamed from: a */
    RetryPolicy m48066a() {
        return new C3001b(5000, 0, 0.0f);
    }

    /* renamed from: a */
    public void m48067a(@NonNull final Location location) {
        ad.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("location onLocation: ");
        stringBuilder.append(location);
        ad.a(stringBuilder.toString());
        final float b = m48064b(location);
        if (!m48063a(b)) {
            if (this.f39002b) {
                ad.a("not pinging because minimum location displacement not met and we've gotten a ping response.");
                return;
            }
        }
        ad.a("pinging because minimum location displacement has met or never got sucessfull ping response yet");
        m48068a(new ListenerPing(this) {
            /* renamed from: c */
            final /* synthetic */ af f39000c;

            public void onPingSuccess() {
                ad.a();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                this.f39000c.f39004d.a(latitude, longitude);
                this.f39000c.f39014n.onNext(PingLocation.create(latitude, longitude, (double) b));
            }

            public void onPingFailure() {
                ad.a();
                ad.c("Failed to ping");
            }

            public void onLoggedOut() {
                ad.a();
            }

            public void onBadLocation() {
                ad.a();
                ad.c("Ping responded with bad location.");
                this.f39000c.f39004d.i();
            }
        }, null);
    }

    /* renamed from: b */
    private float m48064b(@NonNull Location location) {
        float[] fArr = new float[1];
        double y = this.f39003c.y();
        double z = this.f39003c.z();
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), y, z, fArr);
        float f = fArr[0];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("location displacement: ");
        stringBuilder.append(f);
        stringBuilder.append(" after comparing ");
        stringBuilder.append(location.getLatitude());
        stringBuilder.append(',');
        stringBuilder.append(location.getLongitude());
        stringBuilder.append(" with stored location: ");
        stringBuilder.append(y);
        stringBuilder.append(',');
        stringBuilder.append(z);
        ad.a(stringBuilder.toString());
        return f;
    }

    public Observable<PingLocation> observeLocationPingUpdates() {
        return this.f39014n.e().g().k();
    }
}
