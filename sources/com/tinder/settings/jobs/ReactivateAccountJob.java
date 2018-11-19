package com.tinder.settings.jobs;

import android.content.Context;
import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;
import com.tinder.managers.ManagerApp;
import com.tinder.settings.p404b.C14864a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/tinder/settings/jobs/ReactivateAccountJob;", "Lcom/firebase/jobdispatcher/JobService;", "()V", "pauseAccount", "Lcom/tinder/settings/interactors/PauseAccount;", "getPauseAccount", "()Lcom/tinder/settings/interactors/PauseAccount;", "setPauseAccount", "(Lcom/tinder/settings/interactors/PauseAccount;)V", "subscription", "Lrx/Subscription;", "getSubscription", "()Lrx/Subscription;", "setSubscription", "(Lrx/Subscription;)V", "onStartJob", "", "jobParams", "Lcom/firebase/jobdispatcher/JobParameters;", "onStopJob", "p0", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ReactivateAccountJob extends JobService {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14864a f51521a;
    @Nullable
    /* renamed from: b */
    private Subscription f51522b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.jobs.ReactivateAccountJob$a */
    static final class C18844a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ReactivateAccountJob f58398a;
        /* renamed from: b */
        final /* synthetic */ JobParameters f58399b;

        C18844a(ReactivateAccountJob reactivateAccountJob, JobParameters jobParameters) {
            this.f58398a = reactivateAccountJob;
            this.f58399b = jobParameters;
        }

        public final void call() {
            this.f58398a.b(this.f58399b, false);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.jobs.ReactivateAccountJob$b */
    static final class C18845b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ ReactivateAccountJob f58400a;
        /* renamed from: b */
        final /* synthetic */ JobParameters f58401b;

        C18845b(ReactivateAccountJob reactivateAccountJob, JobParameters jobParameters) {
            this.f58400a = reactivateAccountJob;
            this.f58401b = jobParameters;
        }

        public /* synthetic */ void call(Object obj) {
            m67296a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67296a(Throwable th) {
            C0001a.c(th);
            this.f58400a.b(this.f58401b, true);
        }
    }

    /* renamed from: a */
    public boolean m62103a(@NotNull JobParameters jobParameters) {
        C2668g.b(jobParameters, "jobParams");
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) applicationContext).h().inject(this);
        C14864a c14864a = this.f51521a;
        if (c14864a == null) {
            C2668g.b("pauseAccount");
        }
        this.f51522b = c14864a.m56283a().b(Schedulers.io()).a(new C18844a(this, jobParameters), new C18845b(this, jobParameters));
        return true;
    }

    /* renamed from: b */
    public boolean m62104b(@NotNull JobParameters jobParameters) {
        C2668g.b(jobParameters, "p0");
        jobParameters = this.f51522b;
        if (jobParameters != null) {
            jobParameters.unsubscribe();
        }
        return true;
    }
}
