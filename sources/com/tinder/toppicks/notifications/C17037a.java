package com.tinder.toppicks.notifications;

import android.os.Bundle;
import com.firebase.jobdispatcher.C1886n;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.RetryStrategy;
import com.tinder.toppicks.notifications.TopPicksNotificationScheduler.C15279b;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/toppicks/notifications/DailyTopPicksNotificationScheduler;", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler;", "jobDispatcher", "Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;", "(Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;)V", "schedule", "Lio/reactivex/Completable;", "request", "Lcom/tinder/toppicks/notifications/TopPicksNotificationScheduler$Request;", "unschedule", "", "jobId", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.notifications.a */
public final class C17037a implements TopPicksNotificationScheduler {
    /* renamed from: b */
    private final FirebaseJobDispatcher f52494b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.notifications.a$a */
    static final class C17036a implements Action {
        /* renamed from: a */
        final /* synthetic */ C17037a f52492a;
        /* renamed from: b */
        final /* synthetic */ C15279b f52493b;

        C17036a(C17037a c17037a, C15279b c15279b) {
            this.f52492a = c17037a;
            this.f52493b = c15279b;
        }

        public final void run() {
            Bundle bundle = new Bundle();
            bundle.putInt("bundle_key_dispatch_time", this.f52493b.m57388b());
            this.f52492a.f52494b.a(this.f52492a.f52494b.a().a(TopPicksNotificationDispatcherService.class).a(C1886n.a(this.f52493b.m57389c(), this.f52493b.m57390d())).a(2).a(this.f52493b.m57387a()).a(true).a(RetryStrategy.f5101b).a(new int[]{2}).b(false).a(bundle).a());
        }
    }

    @Inject
    public C17037a(@NotNull FirebaseJobDispatcher firebaseJobDispatcher) {
        C2668g.b(firebaseJobDispatcher, "jobDispatcher");
        this.f52494b = firebaseJobDispatcher;
    }

    @NotNull
    public C3956a schedule(@NotNull C15279b c15279b) {
        C2668g.b(c15279b, "request");
        c15279b = C3956a.a(new C17036a(this, c15279b));
        C2668g.a(c15279b, "Completable.fromAction {…schedule(myJob)\n        }");
        return c15279b;
    }

    public void unschedule(@NotNull String str) {
        C2668g.b(str, "jobId");
        this.f52494b.a(str);
    }
}
