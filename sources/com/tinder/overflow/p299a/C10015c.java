package com.tinder.overflow.p299a;

import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.enums.ReportCause;
import com.tinder.overflow.target.ReportMatchTarget;
import com.tinder.profile.p363b.am;
import com.tinder.profile.p363b.ao;
import com.tinder.profile.p363b.aq.C14375a;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import retrofit2.Response;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012J \u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/tinder/overflow/presenter/ReportProfilePresenter;", "", "reportMatch", "Lcom/tinder/profile/interactor/ReportMatch;", "reportRec", "Lcom/tinder/profile/interactor/ReportRec;", "(Lcom/tinder/profile/interactor/ReportMatch;Lcom/tinder/profile/interactor/ReportRec;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "target", "Lcom/tinder/overflow/target/ReportMatchTarget;", "getTarget$Tinder_release", "()Lcom/tinder/overflow/target/ReportMatchTarget;", "setTarget$Tinder_release", "(Lcom/tinder/overflow/target/ReportMatchTarget;)V", "clearSubscriptions", "", "matchId", "", "reportCause", "Lcom/tinder/enums/ReportCause;", "otherReasonDetails", "personId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.a.c */
public final class C10015c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ReportMatchTarget f32877a;
    /* renamed from: b */
    private final C19573b f32878b = new C19573b();
    /* renamed from: c */
    private final am f32879c;
    /* renamed from: d */
    private final ao f32880d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.c$a */
    static final class C14109a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10015c f44801a;

        C14109a(C10015c c10015c) {
            this.f44801a = c10015c;
        }

        public final void call() {
            this.f44801a.m41036a().showReportSuccessful();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.c$b */
    static final class C14110b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10015c f44802a;

        C14110b(C10015c c10015c) {
            this.f44802a = c10015c;
        }

        public /* synthetic */ void call(Object obj) {
            m53833a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53833a(Throwable th) {
            this.f44802a.m41036a().showReportFailure();
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lretrofit2/Response;", "Lcom/tinder/api/model/rating/LikeRatingResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.c$c */
    static final class C14111c<T> implements Action1<Response<LikeRatingResponse>> {
        /* renamed from: a */
        final /* synthetic */ C10015c f44803a;

        C14111c(C10015c c10015c) {
            this.f44803a = c10015c;
        }

        public /* synthetic */ void call(Object obj) {
            m53834a((Response) obj);
        }

        /* renamed from: a */
        public final void m53834a(Response<LikeRatingResponse> response) {
            this.f44803a.m41036a().showReportSuccessful();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.c$d */
    static final class C14112d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10015c f44804a;

        C14112d(C10015c c10015c) {
            this.f44804a = c10015c;
        }

        public /* synthetic */ void call(Object obj) {
            m53835a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53835a(Throwable th) {
            this.f44804a.m41036a().showReportFailure();
            C0001a.c(th);
        }
    }

    @Inject
    public C10015c(@NotNull am amVar, @NotNull ao aoVar) {
        C2668g.b(amVar, "reportMatch");
        C2668g.b(aoVar, "reportRec");
        this.f32879c = amVar;
        this.f32880d = aoVar;
    }

    @NotNull
    /* renamed from: a */
    public final ReportMatchTarget m41036a() {
        ReportMatchTarget reportMatchTarget = this.f32877a;
        if (reportMatchTarget == null) {
            C2668g.b("target");
        }
        return reportMatchTarget;
    }

    @Drop
    /* renamed from: b */
    public final void m41038b() {
        this.f32878b.a();
    }

    /* renamed from: a */
    public final void m41037a(@NotNull String str, @NotNull ReportCause reportCause, @Nullable String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(reportCause, "reportCause");
        this.f32878b.a(this.f32879c.a(C14375a.d().a(str).a(Integer.valueOf(reportCause.getIntValue())).b(str2).a()).a(RxUtils.a().b()).a((Action0) new C14109a(this), new C14110b(this)));
    }

    /* renamed from: b */
    public final void m41039b(@NotNull String str, @NotNull ReportCause reportCause, @Nullable String str2) {
        C2668g.b(str, "personId");
        C2668g.b(reportCause, "reportCause");
        this.f32878b.a(this.f32880d.a(C14375a.d().a(str).a(Integer.valueOf(reportCause.getIntValue())).b(str2).a()).a(RxUtils.a()).a((Action1) new C14111c(this), new C14112d(this)));
    }
}
