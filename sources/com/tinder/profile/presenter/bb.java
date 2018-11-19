package com.tinder.profile.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.enums.ReportCause;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.overflow.analytics.C12239a.C10024a;
import com.tinder.overflow.model.C10028a.C12248b;
import com.tinder.overflow.model.FeedbackType;
import com.tinder.overflow.model.ReasonOption;
import com.tinder.overflow.model.ReportingSource;
import com.tinder.profile.p363b.ao;
import com.tinder.profile.p363b.aq.C14375a;
import com.tinder.profile.target.ProfileReportUserTarget;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0002\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J*\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/tinder/profile/presenter/ProfileReportUserPresenter;", "", "reportRec", "Lcom/tinder/profile/interactor/ReportRec;", "addFeedbackUserEvent", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent;", "(Lcom/tinder/profile/interactor/ReportRec;Lcom/tinder/overflow/analytics/AddFeedbackUserEvent;)V", "target", "Lcom/tinder/profile/target/ProfileReportUserTarget;", "getTarget$Tinder_release", "()Lcom/tinder/profile/target/ProfileReportUserTarget;", "setTarget$Tinder_release", "(Lcom/tinder/profile/target/ProfileReportUserTarget;)V", "", "request", "Lcom/tinder/profile/interactor/ReportUser$Request;", "feedbackUserEventRequest", "Lcom/tinder/overflow/analytics/AddFeedbackUserEvent$Request;", "personId", "", "reportCause", "Lcom/tinder/enums/ReportCause;", "otherReasonDetails", "placeId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class bb {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ProfileReportUserTarget f45666a;
    /* renamed from: b */
    private final ao f45667b;
    /* renamed from: c */
    private final C12239a f45668c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.bb$a */
    static final class C18589a<T> implements Action1<Object> {
        /* renamed from: a */
        final /* synthetic */ bb f57972a;
        /* renamed from: b */
        final /* synthetic */ C10024a f57973b;

        C18589a(bb bbVar, C10024a c10024a) {
            this.f57972a = bbVar;
            this.f57973b = c10024a;
        }

        public final void call(Object obj) {
            this.f57972a.f45668c.a(this.f57973b);
            this.f57972a.m55017a().showReportSuccessful();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.bb$b */
    static final class C18590b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ bb f57974a;

        C18590b(bb bbVar) {
            this.f57974a = bbVar;
        }

        public /* synthetic */ void call(Object obj) {
            m67043a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67043a(Throwable th) {
            this.f57974a.m55017a().showReportFailure();
            C0001a.c(th, "Failed to report user: %s", new Object[]{th.getMessage()});
        }
    }

    @Inject
    public bb(@NotNull ao aoVar, @NotNull C12239a c12239a) {
        C2668g.b(aoVar, "reportRec");
        C2668g.b(c12239a, "addFeedbackUserEvent");
        this.f45667b = aoVar;
        this.f45668c = c12239a;
    }

    @NotNull
    /* renamed from: a */
    public final ProfileReportUserTarget m55017a() {
        ProfileReportUserTarget profileReportUserTarget = this.f45666a;
        if (profileReportUserTarget == null) {
            C2668g.b("target");
        }
        return profileReportUserTarget;
    }

    /* renamed from: a */
    public final void m55019a(@NotNull String str, @NotNull ReportCause reportCause, @Nullable String str2, @Nullable String str3) {
        C2668g.b(str, "personId");
        C2668g.b(reportCause, "reportCause");
        str = C14375a.m54772d().mo11598a(str).mo11597a(Integer.valueOf(reportCause.getIntValue())).mo11600b(str2).mo11599a();
        ReportCause c10024a = new C10024a(null, null, str.mo11601a(), str3, null, str3 != null ? ReportingSource.PLACES : ReportingSource.PROFILE, FeedbackType.REPORT, new C12248b(ReasonOption.Companion.a(reportCause)), str2);
        C2668g.a(str, "request");
        m55018a(str, c10024a);
    }

    /* renamed from: a */
    public final void m55018a(@NotNull C14375a c14375a, @NotNull C10024a c10024a) {
        C2668g.b(c14375a, "request");
        C2668g.b(c10024a, "feedbackUserEventRequest");
        this.f45667b.m60847a(c14375a).a(RxUtils.a()).a(new C18589a(this, c10024a), (Action1) new C18590b(this));
    }
}
