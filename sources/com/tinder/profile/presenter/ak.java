package com.tinder.profile.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10691j;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.Photo;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.profile.model.Profile.EnabledServices;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.model.ProfileFeature;
import com.tinder.profile.model.ProfileShareAction;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p363b.aj;
import com.tinder.profile.p363b.aj.C14373a;
import com.tinder.profile.target.ProfileTarget;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent.RecsAllPhotosViewedEventRequest;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent.RecsPhotoViewEventRequest;
import com.tinder.recs.analytics.RecsPhotoSource;
import com.tinder.recs.model.TappyConfig;
import com.tinder.screenshot.analytics.C16562a;
import com.tinder.screenshot.analytics.C16562a.C14824a;
import com.tinder.screenshotty.C14830c;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.screenshotty.p401a.C14826a.C16570a;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.schedulers.Schedulers;

public class ak {
    @DeadshotTarget
    /* renamed from: a */
    ProfileTarget f45645a;
    /* renamed from: b */
    private final TappyConfig f45646b;
    /* renamed from: c */
    private final AddRecsPhotoViewEvent f45647c;
    /* renamed from: d */
    private final AddRecsAllPhotosViewedEvent f45648d;
    /* renamed from: e */
    private final C14830c f45649e;
    /* renamed from: f */
    private final AbTestUtility f45650f;
    /* renamed from: g */
    private final CurrentScreenTracker f45651g;
    /* renamed from: h */
    private final C16562a f45652h;
    /* renamed from: i */
    private final C16093z f45653i;
    /* renamed from: j */
    private final CurrentScreenNotifier f45654j;
    /* renamed from: k */
    private final C14386k f45655k;
    /* renamed from: l */
    private final aj f45656l;
    @Nullable
    /* renamed from: m */
    private Profile f45657m;
    @Nullable
    /* renamed from: n */
    private Disposable f45658n;
    /* renamed from: o */
    private final EnumSet<Source> f45659o = EnumSet.of(Source.FASTMATCH, Source.TOP_PICKS, Source.REC);
    /* renamed from: p */
    private final EnumSet<Source> f45660p = EnumSet.of(Source.FASTMATCH, Source.TOP_PICKS, Source.REC, Source.MATCH);

    /* renamed from: a */
    static final /* synthetic */ void m54988a(C14826a c14826a) throws Exception {
    }

    /* renamed from: c */
    static final /* synthetic */ void m54991c() {
    }

    /* renamed from: d */
    static final /* synthetic */ void m54993d() {
    }

    /* renamed from: e */
    static final /* synthetic */ void m54994e() {
    }

    @Inject
    public ak(TappyConfig tappyConfig, AddRecsPhotoViewEvent addRecsPhotoViewEvent, AddRecsAllPhotosViewedEvent addRecsAllPhotosViewedEvent, C14830c c14830c, AbTestUtility abTestUtility, CurrentScreenTracker currentScreenTracker, C16562a c16562a, C16093z c16093z, CurrentScreenNotifier currentScreenNotifier, C14386k c14386k, aj ajVar) {
        this.f45646b = tappyConfig;
        this.f45647c = addRecsPhotoViewEvent;
        this.f45648d = addRecsAllPhotosViewedEvent;
        this.f45649e = c14830c;
        this.f45650f = abTestUtility;
        this.f45651g = currentScreenTracker;
        this.f45652h = c16562a;
        this.f45653i = c16093z;
        this.f45654j = currentScreenNotifier;
        this.f45655k = c14386k;
        this.f45656l = ajVar;
    }

    @Take
    /* renamed from: a */
    public void m54996a() {
        this.f45654j.notify(C10691j.f35032a);
    }

    @Drop
    /* renamed from: b */
    public void m55003b() {
        if (this.f45658n != null) {
            this.f45658n.dispose();
        }
    }

    /* renamed from: a */
    public void m54999a(@NonNull Profile profile) {
        if (!Objects.m59114a(this.f45657m, (Object) profile)) {
            this.f45657m = profile;
            List arrayList = new ArrayList();
            arrayList.add(ProfileFeature.BASIC_INFO_TAPPY);
            if (!profile.mo11654d().trim().isEmpty()) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.BIO);
            }
            if (profile.mo11669s() != null) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.ANTHEM);
            }
            if (!profile.mo11670t().isEmpty()) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.TOP_ARTISTS);
                if (!profile.mo11662l().contains(EnabledServices.SPOTIFY)) {
                    arrayList.add(ProfileFeature.CONNECT_SPOTIFY);
                }
            }
            if (!profile.mo11672v().isEmpty()) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.COMMON_CONNECTIONS);
            }
            if (profile.mo11660j() == Source.USER && profile.mo11671u() > 0) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.POTENTIAL_COMMON_CONNECTIONS);
            }
            if (profile.mo11673w() != null) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.INSTAGRAM);
                if (!profile.mo11662l().contains(EnabledServices.INSTAGRAM)) {
                    arrayList.add(ProfileFeature.CONNECT_INSTAGRAM);
                }
            }
            if (!profile.mo11665o().isEmpty()) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.INTERESTS);
            }
            if (this.f45660p.contains(profile.mo11660j())) {
                arrayList.add(ProfileFeature.DIVIDER);
                arrayList.add(ProfileFeature.RECOMMEND);
                arrayList.add(ProfileFeature.DIVIDER);
            }
            if (this.f45659o.contains(profile.mo11660j())) {
                arrayList.add(ProfileFeature.REPORT_USER);
                arrayList.add(ProfileFeature.DIVIDER);
            }
            arrayList.add(ProfileFeature.MARGIN_BOTTOM);
            this.f45645a.showProfile(profile, arrayList);
        }
    }

    /* renamed from: b */
    public void m55004b(Profile profile) {
        this.f45647c.execute(m54987a(profile.mo11657g(), profile)).b(Schedulers.io()).a(al.f57963a, am.f57964a);
    }

    /* renamed from: a */
    public void m54997a(int i, int i2, Profile profile) {
        if (i == i2 - 1) {
            this.f45648d.execute(new RecsAllPhotosViewedEventRequest(RecsPhotoSource.PROFILE, i2, profile.mo11651a(), profile.mo11647B())).b(Schedulers.io()).a(ao.f57965a, ap.f57966a);
        }
        if (i >= 0) {
            if (i < profile.mo11656f().size()) {
                this.f45647c.execute(m54987a(i, profile)).b(Schedulers.io()).a(aq.f57967a, ar.f57968a);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected position=");
        stringBuilder.append(i);
        stringBuilder.append(", where photosCount=");
        stringBuilder.append(profile.mo11656f().size());
        C0001a.c(new RuntimeException(stringBuilder.toString()));
    }

    /* renamed from: a */
    public void m54998a(@Nullable ProfileScreenSource profileScreenSource, String str) {
        if (this.f45658n != null) {
            this.f45658n.dispose();
        }
        this.f45658n = this.f45649e.m56190c().observeOn(C15674a.m58830a()).withLatestFrom(this.f45651g.observe(), new as(this, profileScreenSource, str)).subscribe(at.f50167a, au.f50168a);
    }

    /* renamed from: a */
    final /* synthetic */ C14826a m54995a(@Nullable ProfileScreenSource profileScreenSource, String str, C14826a c14826a, Screen screen) throws Exception {
        if (screen == C10691j.f35032a) {
            this.f45652h.m61992a(new C14824a(screen, profileScreenSource, str, c14826a instanceof C16570a));
        }
        if (!(this.f45650f.isScreenshotNotificationEnabled() == null || this.f45657m == null || screen != C10691j.f35032a)) {
            this.f45645a.sendScreenshotInAppNotification(this.f45657m, c14826a);
        }
        return c14826a;
    }

    /* renamed from: a */
    public void m55001a(Profile profile, String str, C14826a c14826a, ProfileScreenSource profileScreenSource) {
        this.f45653i.m60896a(profile.mo11651a()).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new av(this, c14826a, profile, str, profileScreenSource), an.f50163a);
    }

    /* renamed from: a */
    final /* synthetic */ void m55002a(C14826a c14826a, Profile profile, String str, ProfileScreenSource profileScreenSource, String str2) throws Exception {
        this.f45645a.createChooserToShareScreenshottedProfile(profile, str, c14826a instanceof C16570a ? ((C16570a) c14826a).m61998a() : null, str2, this.f45656l.m54765a(profileScreenSource), ProfileShareAction.SCREENSHOT_BANNER);
    }

    /* renamed from: a */
    public void m55000a(Profile profile, C14373a c14373a) {
        this.f45655k.m54805a(this.f45656l.m54761a(profile, c14373a));
    }

    /* renamed from: a */
    private RecsPhotoViewEventRequest m54987a(int i, Profile profile) {
        return new RecsPhotoViewEventRequest(profile.mo11647B(), profile.mo11651a(), RecsPhotoSource.PROFILE, ((Photo) profile.mo11656f().get(i)).id(), profile.mo11649D());
    }
}
