package com.tinder.crashindicator.reporter;

import com.tinder.analytics.C7319e;
import com.tinder.analytics.C7319e.C6218a;
import com.tinder.managers.C2652a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/crashindicator/reporter/LogAppCloseOnUncaughtExceptionHandler;", "Lcom/tinder/crashindicator/reporter/AppCloseOnUncaughtExceptionHandler;", "authenticationManager", "Lcom/tinder/managers/AuthenticationManager;", "appCloseEventDispatcher", "Lcom/tinder/analytics/AppCloseEventDispatcher;", "(Lcom/tinder/managers/AuthenticationManager;Lcom/tinder/analytics/AppCloseEventDispatcher;)V", "onAppClose", "", "sessionLengthInMilliseconds", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.crashindicator.reporter.c */
public final class C10717c implements AppCloseOnUncaughtExceptionHandler {
    /* renamed from: a */
    private final C2652a f35083a;
    /* renamed from: b */
    private final C7319e f35084b;

    @Inject
    public C10717c(@NotNull C2652a c2652a, @NotNull C7319e c7319e) {
        C2668g.b(c2652a, "authenticationManager");
        C2668g.b(c7319e, "appCloseEventDispatcher");
        this.f35083a = c2652a;
        this.f35084b = c7319e;
    }

    public void onAppClose(long j) {
        this.f35084b.a(new C6218a(true, this.f35083a.d(), (int) TimeUnit.MILLISECONDS.toSeconds(j)));
    }
}
