package com.tinder.apprating.p166e;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.common.usecase.SingleResultUseCase;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J4\u0010\u0016\u001a&\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00020\u0002 \u0017*\u0012\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00100\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/apprating/usecase/CheckShowAppRatingDialog;", "Lcom/tinder/domain/common/usecase/SingleResultUseCase;", "", "appRatingRepository", "Lcom/tinder/domain/apprating/AppRatingRepository;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "(Lcom/tinder/domain/apprating/AppRatingRepository;Lcom/tinder/core/experiment/AbTestUtility;Lkotlin/jvm/functions/Function0;)V", "checkActiveSessionDays", "", "readSessionTimeStamp", "", "execute", "Lrx/Single;", "resetAppDismissedBefore", "", "resetAppRatedBefore", "resetTimeStamp", "resetTrigger", "showDialog", "kotlin.jvm.PlatformType", "show", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.apprating.e.b */
public final class C10314b implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final AppRatingRepository f33703a;
    /* renamed from: b */
    private final AbTestUtility f33704b;
    /* renamed from: c */
    private final Function0<DateTime> f33705c;

    @Inject
    public C10314b(@NotNull AppRatingRepository appRatingRepository, @NotNull AbTestUtility abTestUtility, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0) {
        C2668g.b(appRatingRepository, "appRatingRepository");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(function0, "dateTimeProvider");
        this.f33703a = appRatingRepository;
        this.f33704b = abTestUtility;
        this.f33705c = function0;
    }

    @NotNull
    public Single<Boolean> execute() {
        int readNewChatMessageRead = ((this.f33703a.readNewChatMessageRead() & this.f33703a.readChatActivityPaused()) | this.f33703a.readItsANewMatchDialogSeen()) & this.f33703a.readIsVersionRateable();
        boolean readIsAppRatedBefore = this.f33703a.readIsAppRatedBefore();
        int readIsRatingDismissed = this.f33703a.readIsRatingDismissed() | this.f33703a.readIsFeedbackDismissed();
        int a = m42089a(this.f33703a.readSessionTimeStamp());
        Object obj = a > 3 ? 1 : null;
        Object obj2 = a >= this.f33704b.appRatingShowWaitPeriodInDays() ? 1 : null;
        Object obj3 = a >= this.f33704b.appRatingSendWaitPeriodInDays() ? 1 : null;
        Single<Boolean> a2;
        if (obj != null && readNewChatMessageRead != 0 && !readIsAppRatedBefore && readIsRatingDismissed == 0) {
            m42094d();
            a2 = m42090a(true);
            C2668g.a(a2, "showDialog(true)");
            return a2;
        } else if (obj2 != null && readNewChatMessageRead != 0 && readIsRatingDismissed != 0 && !readIsAppRatedBefore) {
            m42093c();
            m42094d();
            a2 = m42090a(true);
            C2668g.a(a2, "showDialog(true)");
            return a2;
        } else if (obj3 != null && readNewChatMessageRead != 0) {
            m42092b();
            m42094d();
            a2 = m42090a(true);
            C2668g.a(a2, "showDialog(true)");
            return a2;
        } else if (this.f33703a.readIsFirstTimeAfterGooglePlayReview()) {
            a2 = m42090a(true);
            C2668g.a(a2, "showDialog(true)");
            return a2;
        } else {
            m42091a();
            a2 = m42090a(false);
            C2668g.a(a2, "showDialog(false)");
            return a2;
        }
    }

    /* renamed from: a */
    private final void m42091a() {
        this.f33703a.writeItsANewMatchDialogSeen(false);
        this.f33703a.writeNewChatMessageRead(false);
        this.f33703a.writeChatActivityPaused(false);
    }

    /* renamed from: b */
    private final void m42092b() {
        this.f33703a.writeIsAppRatedBefore(false);
    }

    /* renamed from: c */
    private final void m42093c() {
        this.f33703a.writeRatingDismissed(false);
        this.f33703a.writeFeedbackDismissed(false);
    }

    /* renamed from: d */
    private final void m42094d() {
        this.f33703a.writeSessionTimeStamp(((DateTime) this.f33705c.invoke()).getMillis());
    }

    /* renamed from: a */
    private final Single<Boolean> m42090a(boolean z) {
        return Single.a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    private final int m42089a(long j) {
        return new Period(new DateTime(j), (DateTime) this.f33705c.invoke(), PeriodType.e()).a();
    }
}
