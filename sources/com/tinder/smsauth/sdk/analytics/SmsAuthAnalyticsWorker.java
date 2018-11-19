package com.tinder.smsauth.sdk.analytics;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.tinder.common.logger.Logger;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.smsauth.domain.usecase.C18096e;
import com.tinder.smsauth.domain.usecase.C18098g;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/smsauth/sdk/analytics/SmsAuthAnalyticsWorker;", "Landroid/arch/lifecycle/LifecycleObserver;", "observeStateUpdates", "Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;", "observeEvents", "Lcom/tinder/smsauth/domain/usecase/ObserveEvents;", "tracker", "Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/smsauth/domain/usecase/ObserveStateUpdates;Lcom/tinder/smsauth/domain/usecase/ObserveEvents;Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;Lcom/tinder/common/reactivex/schedulers/Schedulers;Lcom/tinder/common/logger/Logger;)V", "eventDisposable", "Lio/reactivex/disposables/Disposable;", "stateDisposable", "start", "", "stop", "sdk_release"}, k = 1, mv = {1, 1, 10})
public final class SmsAuthAnalyticsWorker implements LifecycleObserver {
    /* renamed from: a */
    private Disposable f12509a;
    /* renamed from: b */
    private Disposable f12510b;
    /* renamed from: c */
    private final C18098g f12511c;
    /* renamed from: d */
    private final C18096e f12512d;
    /* renamed from: e */
    private final SmsAuthTracker f12513e;
    /* renamed from: f */
    private final Schedulers f12514f;
    /* renamed from: g */
    private final Logger f12515g;

    @Inject
    public SmsAuthAnalyticsWorker(@NotNull C18098g c18098g, @NotNull C18096e c18096e, @NotNull SmsAuthTracker smsAuthTracker, @NotNull Schedulers schedulers, @NotNull Logger logger) {
        C2668g.m10309b(c18098g, "observeStateUpdates");
        C2668g.m10309b(c18096e, "observeEvents");
        C2668g.m10309b(smsAuthTracker, "tracker");
        C2668g.m10309b(schedulers, "schedulers");
        C2668g.m10309b(logger, "logger");
        this.f12511c = c18098g;
        this.f12512d = c18096e;
        this.f12513e = smsAuthTracker;
        this.f12514f = schedulers;
        this.f12515g = logger;
    }

    @OnLifecycleEvent(Event.ON_START)
    public final void start() {
        Disposable disposable = this.f12509a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f12509a = this.f12511c.a().m15336a(this.f12514f.computation()).m15343a((Function) SmsAuthAnalyticsWorker$a.f51761a).m15355a((Consumer) new SmsAuthAnalyticsWorker$b(this), (Consumer) new SmsAuthAnalyticsWorker$c(this));
        disposable = this.f12510b;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f12510b = this.f12512d.a().m15336a(this.f12514f.computation()).m15355a((Consumer) new SmsAuthAnalyticsWorker$d(this), (Consumer) new SmsAuthAnalyticsWorker$e(this));
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public final void stop() {
        Disposable disposable = this.f12509a;
        if (disposable != null) {
            disposable.dispose();
        }
        disposable = this.f12510b;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
