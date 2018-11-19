package com.tinder.toppicks.notifications;

import android.content.Context;
import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.toppicks.di.TopPicksApplicationComponentProvider;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcherService;", "Lcom/firebase/jobdispatcher/JobService;", "()V", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "getTopPicksApplicationRepository", "()Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "setTopPicksApplicationRepository", "(Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;)V", "topPicksNotificationDispatcher", "Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcher;", "getTopPicksNotificationDispatcher", "()Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcher;", "setTopPicksNotificationDispatcher", "(Lcom/tinder/toppicks/notifications/TopPicksNotificationDispatcher;)V", "onStartJob", "", "job", "Lcom/firebase/jobdispatcher/JobParameters;", "onStopJob", "shouldShowNotification", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksNotificationDispatcherService extends JobService {
    @Inject
    @NotNull
    /* renamed from: a */
    public TopPicksNotificationDispatcher f52490a;
    @Inject
    @NotNull
    /* renamed from: b */
    public TopPicksApplicationRepository f52491b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.TopPicksNotificationDispatcherService$a */
    static final class C17034a implements Action {
        /* renamed from: a */
        final /* synthetic */ TopPicksNotificationDispatcherService f52487a;
        /* renamed from: b */
        final /* synthetic */ JobParameters f52488b;

        C17034a(TopPicksNotificationDispatcherService topPicksNotificationDispatcherService, JobParameters jobParameters) {
            this.f52487a = topPicksNotificationDispatcherService;
            this.f52488b = jobParameters;
        }

        public final void run() {
            JobParameters jobParameters = this.f52488b;
            if (jobParameters != null) {
                this.f52487a.b(jobParameters, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.TopPicksNotificationDispatcherService$b */
    static final class C17035b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17035b f52489a = new C17035b();

        C17035b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62835a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62835a(Throwable th) {
            C0001a.c(th, "Error dispatching notification", new Object[0]);
        }
    }

    /* renamed from: b */
    public boolean m62838b(@Nullable JobParameters jobParameters) {
        return false;
    }

    /* renamed from: a */
    public boolean m62837a(@Nullable JobParameters jobParameters) {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.toppicks.di.TopPicksApplicationComponentProvider");
        }
        ((TopPicksApplicationComponentProvider) applicationContext).provideTopPicksApplicationComponent().inject(this);
        TopPicksApplicationRepository topPicksApplicationRepository = this.f52491b;
        if (topPicksApplicationRepository == null) {
            C2668g.b("topPicksApplicationRepository");
        }
        topPicksApplicationRepository.clearNotificationJobId();
        boolean c = m62836c(jobParameters);
        if (c) {
            TopPicksNotificationDispatcher topPicksNotificationDispatcher = this.f52490a;
            if (topPicksNotificationDispatcher == null) {
                C2668g.b("topPicksNotificationDispatcher");
            }
            topPicksNotificationDispatcher.dispatch().b(C15756a.m59010b()).a(new C17034a(this, jobParameters), (Consumer) C17035b.f52489a);
        }
        return c;
    }

    /* renamed from: c */
    private final boolean m62836c(JobParameters jobParameters) {
        if (jobParameters == null) {
            return false;
        }
        jobParameters = jobParameters.getExtras();
        if (jobParameters == null) {
            return false;
        }
        jobParameters = jobParameters.getInt("bundle_key_dispatch_time");
        DateTime a = DateTime.a();
        C2668g.a(a, "DateTime.now()");
        if (Math.abs(a.getHourOfDay() - jobParameters) <= 2) {
            return true;
        }
        return false;
    }
}
