package com.tinder.overflow.p299a;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.match.usecase.UnMatch;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.enums.ReportCause;
import com.tinder.overflow.target.UnMatchTarget;
import com.tinder.profile.p363b.am;
import com.tinder.profile.p363b.aq.C14375a;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\"\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/overflow/presenter/UnMatchPresenter;", "", "unMatch", "Lcom/tinder/domain/match/usecase/UnMatch;", "reportMatch", "Lcom/tinder/profile/interactor/ReportMatch;", "(Lcom/tinder/domain/match/usecase/UnMatch;Lcom/tinder/profile/interactor/ReportMatch;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "target", "Lcom/tinder/overflow/target/UnMatchTarget;", "getTarget$Tinder_release", "()Lcom/tinder/overflow/target/UnMatchTarget;", "setTarget$Tinder_release", "(Lcom/tinder/overflow/target/UnMatchTarget;)V", "clearSubscriptions", "", "matchId", "", "reportCause", "Lcom/tinder/enums/ReportCause;", "otherReasonDetails", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.a.e */
public final class C10017e {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public UnMatchTarget f32881a;
    /* renamed from: b */
    private final C19573b f32882b = new C19573b();
    /* renamed from: c */
    private final UnMatch f32883c;
    /* renamed from: d */
    private final am f32884d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.e$a */
    static final class C14113a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10017e f44805a;

        C14113a(C10017e c10017e) {
            this.f44805a = c10017e;
        }

        public final void call() {
            this.f44805a.m41044a().showUnMatchSuccessful();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.a.e$b */
    static final class C14114b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10017e f44806a;

        C14114b(C10017e c10017e) {
            this.f44806a = c10017e;
        }

        public /* synthetic */ void call(Object obj) {
            m53836a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53836a(Throwable th) {
            C0001a.c(th);
            this.f44806a.m41044a().showUnMatchFailure();
        }
    }

    @Inject
    public C10017e(@NotNull UnMatch unMatch, @NotNull am amVar) {
        C2668g.b(unMatch, "unMatch");
        C2668g.b(amVar, "reportMatch");
        this.f32883c = unMatch;
        this.f32884d = amVar;
    }

    @NotNull
    /* renamed from: a */
    public final UnMatchTarget m41044a() {
        UnMatchTarget unMatchTarget = this.f32881a;
        if (unMatchTarget == null) {
            C2668g.b("target");
        }
        return unMatchTarget;
    }

    @Drop
    /* renamed from: b */
    public final void m41046b() {
        this.f32882b.a();
    }

    /* renamed from: a */
    public final void m41045a(@NotNull String str, @Nullable ReportCause reportCause, @Nullable String str2) {
        C2668g.b(str, "matchId");
        if (reportCause != null) {
            m41043b(str, reportCause, str2);
        }
        m41042a(str);
    }

    /* renamed from: b */
    private final void m41043b(String str, ReportCause reportCause, String str2) {
        this.f32884d.a(C14375a.d().a(str).a(Integer.valueOf(reportCause.getIntValue())).b(str2).a()).b(Schedulers.io()).b(RxUtils.b());
    }

    /* renamed from: a */
    private final void m41042a(String str) {
        this.f32882b.a(RxJavaInteropExtKt.toV1Completable(this.f32883c.execute(str)).a(RxUtils.a().b()).a(new C14113a(this), new C14114b(this)));
    }
}
