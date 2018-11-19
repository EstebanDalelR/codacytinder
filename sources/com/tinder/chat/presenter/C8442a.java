package com.tinder.chat.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.chat.analytics.C10529d;
import com.tinder.chat.analytics.C10529d.C8427a;
import com.tinder.chat.analytics.C10541x;
import com.tinder.chat.analytics.C10541x.C8438a;
import com.tinder.common.p076a.C2640a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.usecase.MuteMatch;
import com.tinder.domain.match.usecase.UnMatch;
import com.tinder.domain.match.usecase.UnMuteMatch;
import com.tinder.enums.ReportCause;
import com.tinder.feed.analytics.MatchType;
import com.tinder.feed.view.model.C9541g;
import com.tinder.module.ViewScope;
import com.tinder.overflow.analytics.AnalyticsMatchAttribution;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.overflow.analytics.C12239a.C10024a;
import com.tinder.overflow.model.C10028a.C12248b;
import com.tinder.overflow.model.FeedbackType;
import com.tinder.overflow.model.ReasonOption;
import com.tinder.overflow.model.ReportingSource;
import com.tinder.profile.exception.ShareTextException;
import com.tinder.profile.exception.ShareTextException.ExceptionType;
import com.tinder.profile.model.Profile;
import com.tinder.profile.p363b.C14377c;
import com.tinder.profile.p363b.C14378e;
import com.tinder.profile.p363b.C14392s;
import com.tinder.profile.p363b.ab;
import com.tinder.profile.p363b.am;
import com.tinder.profile.p363b.ao;
import com.tinder.profile.p363b.aq.C14375a;
import com.tinder.targets.CensorTarget;
import com.tinder.utils.RxUtils;
import io.reactivex.C3960g;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import retrofit2.Response;
import rx.Completable;

@ViewScope
/* renamed from: com.tinder.chat.presenter.a */
public class C8442a {
    @DeadshotTarget
    /* renamed from: a */
    CensorTarget f29981a;
    /* renamed from: b */
    private final am f29982b;
    /* renamed from: c */
    private final ao f29983c;
    /* renamed from: d */
    private final UnMatch f29984d;
    /* renamed from: e */
    private final MuteMatch f29985e;
    /* renamed from: f */
    private final UnMuteMatch f29986f;
    /* renamed from: g */
    private final C14377c f29987g;
    /* renamed from: h */
    private final C14378e f29988h;
    /* renamed from: i */
    private final ab f29989i;
    /* renamed from: j */
    private final C14392s f29990j;
    /* renamed from: k */
    private final C12239a f29991k;
    /* renamed from: l */
    private final C10529d f29992l;
    /* renamed from: m */
    private final C10541x f29993m;

    @Inject
    public C8442a(am amVar, ao aoVar, UnMatch unMatch, MuteMatch muteMatch, UnMuteMatch unMuteMatch, C14377c c14377c, C14378e c14378e, ab abVar, C14392s c14392s, C12239a c12239a, C10529d c10529d, C10541x c10541x) {
        this.f29982b = amVar;
        this.f29983c = aoVar;
        this.f29984d = unMatch;
        this.f29985e = muteMatch;
        this.f29986f = unMuteMatch;
        this.f29987g = c14377c;
        this.f29988h = c14378e;
        this.f29989i = abVar;
        this.f29990j = c14392s;
        this.f29991k = c12239a;
        this.f29992l = c10529d;
        this.f29993m = c10541x;
    }

    /* renamed from: a */
    public void m36045a() {
        this.f29981a.showReportDialog();
    }

    /* renamed from: a */
    public void m36046a(Match match) {
        if (match instanceof MessageAdMatch) {
            this.f29981a.notifyDeleteSponsoredMessageClick((MessageAdMatch) match);
        } else {
            this.f29981a.showUnMatchDialog();
        }
    }

    /* renamed from: a */
    public void m36051a(String str, String str2, ReportCause reportCause, @Nullable String str3) {
        C2640a.a(str, "PersonId is null, can't report user");
        this.f29983c.a(C14375a.d().a(str).a(Integer.valueOf(reportCause.getIntValue())).b(str3).a()).a(RxUtils.a()).a(new C13718b(this, str, str2, reportCause, str3), new C13719c(this, str));
    }

    /* renamed from: a */
    final /* synthetic */ void m36052a(String str, String str2, ReportCause reportCause, @Nullable String str3, Response response) {
        this.f29981a.showReportSuccessful();
        m36040a(null, str, str2, null, reportCause, str3, ReportingSource.PROFILE);
    }

    /* renamed from: d */
    final /* synthetic */ void m36066d(String str, Throwable th) {
        this.f29981a.showReportFailure();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error reporting rec. personId: ");
        stringBuilder.append(str);
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
    }

    /* renamed from: a */
    public void m36054a(String str, @Nullable String str2, @Nullable String str3, Attribution attribution, ReportCause reportCause, @Nullable String str4) {
        String str5 = str;
        ReportCause reportCause2 = reportCause;
        C2640a.a(str5, "MatchId is null, can't report match");
        String str6 = str4;
        m36036a(str5, reportCause2, str6).a(RxUtils.a().b()).a(new C13722i(this, str5, str2, str3, attribution, reportCause2, str6, m36035a(reportCause2)), new C13723j(this, str5));
    }

    /* renamed from: a */
    final /* synthetic */ void m36055a(String str, @Nullable String str2, @Nullable String str3, Attribution attribution, ReportCause reportCause, @Nullable String str4, String str5) {
        m36040a(str, str2, str3, attribution, reportCause, str4, ReportingSource.CHAT);
        m36042a(str, str5, str4, (boolean) null);
        this.f29981a.showReportSuccessful();
    }

    /* renamed from: c */
    final /* synthetic */ void m36064c(String str, Throwable th) {
        this.f29981a.showReportFailure();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error reporting match from chat. matchId: ");
        stringBuilder.append(str);
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
    }

    /* renamed from: b */
    public void m36060b(String str, @Nullable String str2, String str3, Attribution attribution, @Nullable ReportCause reportCause, @Nullable String str4) {
        C2640a.a(str, "MatchId is null, can't unMatch user");
        String a = m36035a(reportCause);
        if (!a.equals("NO REASON")) {
            m36037a(str, reportCause, str4, a);
        }
        m36039a(str, str3, attribution, str2, reportCause, str4, a);
    }

    /* renamed from: a */
    public void m36050a(String str) {
        C2640a.a(str, "MatchId is null, can't mute user");
        this.f29985e.execute(str).b(C15756a.b()).a(C15674a.a()).a(new C10550k(this, str), new C10551l(this));
    }

    /* renamed from: d */
    final /* synthetic */ void m36065d(String str) throws Exception {
        this.f29981a.showMuteSuccessful();
        this.f29987g.a(str);
    }

    /* renamed from: b */
    final /* synthetic */ void m36062b(Throwable th) throws Exception {
        this.f29981a.showErrorMuteNotifications();
    }

    /* renamed from: b */
    public void m36059b(String str) {
        C2640a.a(str, "MatchId is null, can't unMute user");
        this.f29986f.execute(str).b(C15756a.b()).a(C15674a.a()).a(new C10552m(this, str), new C10553n(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m36063c(String str) throws Exception {
        this.f29981a.showUnMuteSuccessful();
        this.f29988h.a(str);
    }

    /* renamed from: a */
    final /* synthetic */ void m36058a(Throwable th) throws Exception {
        this.f29981a.showErrorUnMuteNotifications();
    }

    @Deprecated
    /* renamed from: a */
    public void m36047a(Profile profile) {
        C2640a.a(profile, "Cannot recommend user because Profile cannot be null");
        this.f29989i.a(profile.a()).a(RxUtils.a().a()).a(new C13724o(this, profile), new C13725p(this, profile));
        this.f29990j.a("menu", profile);
    }

    /* renamed from: a */
    final /* synthetic */ void m36048a(Profile profile, String str) {
        C2640a.a(str, "URL cannot be null");
        this.f29981a.startShareRecIntent(str, profile.b());
    }

    /* renamed from: a */
    final /* synthetic */ void m36049a(Profile profile, Throwable th) {
        C0001a.c(th, "Error sharing user with id %s: %s", new Object[]{profile.a(), th.getMessage()});
        if (m36043c(th) != null) {
            this.f29981a.showUserHasSharingDisabledError();
        } else {
            this.f29981a.showGenericError();
        }
    }

    /* renamed from: a */
    private void m36039a(@NonNull String str, String str2, Attribution attribution, @Nullable String str3, @Nullable ReportCause reportCause, @Nullable String str4, @NonNull String str5) {
        this.f29984d.execute(str).a(C3960g.c(new C8443d(this, reportCause, str4))).b(C15756a.b()).a(C15674a.a()).a(new C10548e(this, str, str3, str2, attribution, str5), new C10549f(this, str));
    }

    /* renamed from: a */
    final /* synthetic */ C9541g m36044a(@Nullable ReportCause reportCause, @Nullable String str) throws Exception {
        return m36033a(reportCause, true, str);
    }

    /* renamed from: a */
    final /* synthetic */ void m36056a(@NonNull String str, @Nullable String str2, String str3, Attribution attribution, @NonNull String str4, C9541g c9541g) throws Exception {
        m36041a(str, str2, str3, attribution, ReportingSource.CHAT, c9541g);
        m36038a(str, str4);
        this.f29981a.showUnMatchSuccessful();
    }

    /* renamed from: b */
    final /* synthetic */ void m36061b(@NonNull String str, Throwable th) throws Exception {
        C0001a.c(th, "Failed to unmatch %s", new Object[]{str});
        this.f29981a.showUnMatchFailure();
    }

    @NonNull
    /* renamed from: a */
    private String m36035a(@Nullable ReportCause reportCause) {
        if (reportCause == null) {
            return "NO REASON";
        }
        switch (reportCause) {
            case INAPPROPRIATE_MESSAGES:
                reportCause = "INAPPROPRIATE_MESSAGES";
                break;
            case INAPPROPRIATE_PHOTOS:
                reportCause = "INAPPROPRIATE_PHOTOS";
                break;
            case OFFLINE_BEHAVIOR:
                reportCause = "OFFLINE_BEHAVIOR";
                break;
            case SPAM:
                reportCause = "SPAM";
                break;
            case OTHER:
                reportCause = "OTHER";
                break;
            default:
                reportCause = "NO REASON";
                break;
        }
        return reportCause;
    }

    /* renamed from: a */
    private void m36041a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Attribution attribution, ReportingSource reportingSource, C9541g c9541g) {
        this.f29991k.m48434a(new C10024a(str, MatchType.SOLO, str2, str3, m36034a(attribution), reportingSource, c9541g.m39814a(), c9541g.m39815b(), c9541g.m39816c()));
    }

    /* renamed from: a */
    private void m36038a(@NonNull String str, @NonNull String str2) {
        this.f29992l.m42612a(new C8427a(str, str2));
    }

    /* renamed from: a */
    private void m36042a(@NonNull String str, @NonNull String str2, @Nullable String str3, boolean z) {
        this.f29993m.m42634a(new C8438a(str, str2, str3, z));
    }

    @Nullable
    /* renamed from: a */
    private AnalyticsMatchAttribution m36034a(@Nullable Attribution attribution) {
        if (attribution == null) {
            return null;
        }
        switch (attribution) {
            case NONE:
                attribution = AnalyticsMatchAttribution.DEFAULT;
                break;
            case I_SUPER_LIKE_THEM:
                attribution = AnalyticsMatchAttribution.SUPER_LIKE;
                break;
            case THEY_SUPER_LIKE_ME:
                attribution = AnalyticsMatchAttribution.SUPER_LIKE;
                break;
            case BOOST:
                attribution = AnalyticsMatchAttribution.BOOST;
                break;
            case FAST_MATCH:
                attribution = AnalyticsMatchAttribution.LIKES_YOU;
                break;
            case TOP_PICKS:
                attribution = AnalyticsMatchAttribution.TOP_PICKS;
                break;
            case PLACES:
                attribution = AnalyticsMatchAttribution.PLACES;
                break;
            default:
                attribution = AnalyticsMatchAttribution.DEFAULT;
                break;
        }
        return attribution;
    }

    @NonNull
    /* renamed from: a */
    private C9541g m36033a(@Nullable ReportCause reportCause, boolean z, @Nullable String str) {
        return new C9541g(z ? FeedbackType.BLOCK : FeedbackType.REPORT, new C12248b(ReasonOption.Companion.m41078a(reportCause)), str);
    }

    /* renamed from: c */
    private boolean m36043c(Throwable th) {
        return ((th instanceof ShareTextException) && ((ShareTextException) th).d() == ExceptionType.USER_IS_HIDDEN) ? true : null;
    }

    /* renamed from: a */
    private void m36037a(@NonNull String str, ReportCause reportCause, @Nullable String str2, String str3) {
        m36036a(str, reportCause, str2).a(RxUtils.a().b()).a(new C13720g(this, str, str3, str2), new C13721h(this, str));
    }

    /* renamed from: a */
    final /* synthetic */ void m36053a(@NonNull String str, String str2, @Nullable String str3) {
        m36042a(str, str2, str3, true);
        this.f29981a.showReportSuccessful();
    }

    /* renamed from: a */
    final /* synthetic */ void m36057a(@NonNull String str, Throwable th) {
        this.f29981a.showReportFailure();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error reporting blocked match from chat. matchId: ");
        stringBuilder.append(str);
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
    }

    /* renamed from: a */
    private Completable m36036a(@NonNull String str, ReportCause reportCause, @Nullable String str2) {
        return this.f29982b.a(C14375a.d().a(str).a(Integer.valueOf(reportCause.getIntValue())).b(str2).a());
    }

    /* renamed from: a */
    private void m36040a(@Nullable String str, String str2, String str3, Attribution attribution, ReportCause reportCause, @Nullable String str4, ReportingSource reportingSource) {
        m36041a(str, str2, str3, attribution, reportingSource, m36033a(reportCause, false, str4));
    }
}
