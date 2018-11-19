package com.tinder.profile.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C2635n;
import com.tinder.analytics.performance.C6242m;
import com.tinder.analytics.performance.C8154t;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.recs.model.PlacesUserRec;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.enums.ReportCause;
import com.tinder.feed.view.model.C9541g;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.overflow.analytics.C12239a.C10024a;
import com.tinder.overflow.model.C10028a.C12248b;
import com.tinder.overflow.model.FeedbackType;
import com.tinder.overflow.model.ReasonOption;
import com.tinder.overflow.model.ReportingSource;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.p363b.C16081p;
import com.tinder.profile.p363b.ao;
import com.tinder.profile.p363b.aq.C14375a;
import com.tinder.profile.target.UserRecProfileTarget;
import com.tinder.recs.analytics.AddRecsProfileCloseEvent;
import com.tinder.recs.analytics.AddRecsProfileOpenEvent;
import com.tinder.scope.ActivityScope;
import com.tinder.utils.RxUtils;
import java.util.Collections;
import javax.inject.Inject;
import retrofit2.Response;

@ActivityScope
public class bp {
    @DeadshotTarget
    /* renamed from: a */
    UserRecProfileTarget f45683a;
    @NonNull
    /* renamed from: b */
    private final C14418b f45684b;
    @NonNull
    /* renamed from: c */
    private final ao f45685c;
    @NonNull
    /* renamed from: d */
    private final C16081p f45686d;
    @NonNull
    /* renamed from: e */
    private final AddRecsProfileOpenEvent f45687e;
    @NonNull
    /* renamed from: f */
    private final AddRecsProfileCloseEvent f45688f;
    @NonNull
    /* renamed from: g */
    private final C8154t f45689g;
    @NonNull
    /* renamed from: h */
    private final C12239a f45690h;

    @Inject
    bp(@NonNull C14418b c14418b, @NonNull ao aoVar, @NonNull C16081p c16081p, @NonNull AddRecsProfileOpenEvent addRecsProfileOpenEvent, @NonNull AddRecsProfileCloseEvent addRecsProfileCloseEvent, @NonNull C2630h c2630h, @NonNull AbTestUtility abTestUtility, @NonNull C12239a c12239a) {
        this.f45684b = c14418b;
        this.f45685c = aoVar;
        this.f45686d = c16081p;
        this.f45687e = addRecsProfileOpenEvent;
        this.f45688f = addRecsProfileCloseEvent;
        this.f45689g = new C8154t(c2630h, abTestUtility);
        this.f45690h = c12239a;
    }

    /* renamed from: a */
    public void m55050a(@NonNull UserRec userRec, int i) {
        this.f45683a.showProfile(this.f45684b.m54932a(userRec, i));
    }

    /* renamed from: a */
    public void m55051a(@NonNull UserRec userRec, @NonNull ReportCause reportCause, @Nullable String str) {
        String id = userRec.getUser().id();
        this.f45685c.m60847a(C14375a.m54772d().mo11598a(id).mo11597a(Integer.valueOf(reportCause.getIntValue())).mo11600b(str).mo11599a()).a(RxUtils.a()).b(new bq(this)).a(new br(this, id, reportCause, str, userRec), new bs(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m55049a() {
        this.f45689g.a("REPORT_USER_TIMER_KEY");
    }

    /* renamed from: a */
    final /* synthetic */ void m55052a(String str, @NonNull ReportCause reportCause, @Nullable String str2, @NonNull UserRec userRec, Response response) {
        m55047a("REPORT_USER_TIMER_KEY", response, str);
        m55048b().showReportSuccessful();
        reportCause = m55046a(reportCause, str2);
        if ((userRec instanceof PlacesUserRec) != null) {
            userRec = ((PlacesUserRec) userRec).getPlaceId();
            response = ReportingSource.PLACES;
        } else {
            userRec = null;
            response = ReportingSource.PROFILE;
        }
        this.f45690h.a(new C10024a(null, null, str, userRec, null, response, reportCause.a(), reportCause.b(), str2));
    }

    /* renamed from: a */
    final /* synthetic */ void m55053a(Throwable th) {
        m55048b().showReportFailure();
    }

    /* renamed from: b */
    private UserRecProfileTarget m55048b() {
        return this.f45683a;
    }

    /* renamed from: a */
    private void m55047a(String str, Response<LikeRatingResponse> response, String str2) {
        this.f45689g.b(str);
        C6242m a = C6242m.a().a(str2).a();
        String str3 = str2;
        String str4 = str;
        this.f45689g.a(str3, str4, C2635n.a(response.raw().m60553a().m60526a().toString(), Collections.singletonMap(str2, InstrumentationConstantsKt.REPLACE_USER_ID_WITH)), response.code(), a);
    }

    /* renamed from: a */
    private C9541g m55046a(ReportCause reportCause, @Nullable String str) {
        return new C9541g(FeedbackType.REPORT, new C12248b(ReasonOption.Companion.a(reportCause)), str);
    }
}
