package com.tinder.app;

import com.tinder.analytics.C7319e;
import com.tinder.analytics.C7319e.C6218a;
import com.tinder.domain.injection.qualifiers.CurrentDateTimeMillis;
import com.tinder.managers.C2652a;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/app/AppVisibilityLogger;", "Lio/reactivex/functions/Consumer;", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "authenticationManager", "Lcom/tinder/managers/AuthenticationManager;", "currentDateTimeMillis", "Lkotlin/Function0;", "", "appCloseEventDispatcher", "Lcom/tinder/analytics/AppCloseEventDispatcher;", "(Lcom/tinder/managers/AuthenticationManager;Lkotlin/jvm/functions/Function0;Lcom/tinder/analytics/AppCloseEventDispatcher;)V", "startTimer", "accept", "", "visibility", "isUserLoggedIn", "", "onBackground", "onForeground", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.app.c */
public final class C3918c implements Consumer<AppVisibilityTracker$Visibility> {
    /* renamed from: a */
    private long f12205a;
    /* renamed from: b */
    private final C2652a f12206b;
    /* renamed from: c */
    private final Function0<Long> f12207c;
    /* renamed from: d */
    private final C7319e f12208d;

    @Inject
    public C3918c(@NotNull C2652a c2652a, @NotNull @CurrentDateTimeMillis Function0<Long> function0, @NotNull C7319e c7319e) {
        C2668g.m10309b(c2652a, "authenticationManager");
        C2668g.m10309b(function0, "currentDateTimeMillis");
        C2668g.m10309b(c7319e, "appCloseEventDispatcher");
        this.f12206b = c2652a;
        this.f12207c = function0;
        this.f12208d = c7319e;
    }

    public /* synthetic */ void accept(Object obj) {
        m14687a((AppVisibilityTracker$Visibility) obj);
    }

    /* renamed from: a */
    public void m14687a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        C2668g.m10309b(appVisibilityTracker$Visibility, "visibility");
        switch (C8237d.f29463a[appVisibilityTracker$Visibility.ordinal()]) {
            case 1:
                m14684a();
                return;
            case 2:
                m14685b();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m14684a() {
        this.f12205a = ((Number) this.f12207c.invoke()).longValue();
    }

    /* renamed from: b */
    private final void m14685b() {
        if (this.f12205a > 0) {
            this.f12208d.a(new C6218a(false, m14686c(), (int) TimeUnit.MILLISECONDS.toSeconds(((Number) this.f12207c.invoke()).longValue() - this.f12205a)));
            this.f12205a = 0;
        }
    }

    /* renamed from: c */
    private final boolean m14686c() {
        return this.f12206b.m10128d();
    }
}
