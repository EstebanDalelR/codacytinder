package com.tinder.domain.recs;

import com.tinder.domain.recs.model.Rec;
import com.tinder.util.RxUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Subscription;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry;", "", "consumptionObserver", "Lcom/tinder/domain/recs/GlobalRecsConsumptionEventObserver;", "(Lcom/tinder/domain/recs/GlobalRecsConsumptionEventObserver;)V", "subscriptionsBySubscriber", "", "Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry$Listener;", "Lrx/Subscription;", "isSubscribed", "", "listener", "register", "", "unregister", "Companion", "Listener", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class GlobalRecsConsumptionListenerRegistry {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final GlobalRecsConsumptionListenerRegistry sharedInstance = new GlobalRecsConsumptionListenerRegistry(null, 1, null);
    private final GlobalRecsConsumptionEventObserver consumptionObserver;
    private final Map<Listener, Subscription> subscriptionsBySubscriber;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry$Companion;", "", "()V", "sharedInstance", "Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry;", "getSharedInstance", "()Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final GlobalRecsConsumptionListenerRegistry getSharedInstance() {
            return GlobalRecsConsumptionListenerRegistry.sharedInstance;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/recs/GlobalRecsConsumptionListenerRegistry$Listener;", "", "onRecConsumed", "", "rec", "Lcom/tinder/domain/recs/model/Rec;", "engine_release"}, k = 1, mv = {1, 1, 9})
    public interface Listener {
        void onRecConsumed(@NotNull Rec rec);
    }

    public GlobalRecsConsumptionListenerRegistry() {
        this(null, 1, null);
    }

    public GlobalRecsConsumptionListenerRegistry(@NotNull GlobalRecsConsumptionEventObserver globalRecsConsumptionEventObserver) {
        C2668g.b(globalRecsConsumptionEventObserver, "consumptionObserver");
        this.consumptionObserver = globalRecsConsumptionEventObserver;
        this.subscriptionsBySubscriber = (Map) new LinkedHashMap();
    }

    public /* synthetic */ GlobalRecsConsumptionListenerRegistry(GlobalRecsConsumptionEventObserver globalRecsConsumptionEventObserver, int i, C15823e c15823e) {
        if ((i & 1) != 0) {
            globalRecsConsumptionEventObserver = GlobalRecsConsumptionEventMessenger.INSTANCE;
        }
        this(globalRecsConsumptionEventObserver);
    }

    public final synchronized void register(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        if (!RxUtils.f47590a.a((Subscription) this.subscriptionsBySubscriber.get(listener))) {
            Subscription a = this.consumptionObserver.observe().a(Schedulers.io()).a(new GlobalRecsConsumptionListenerRegistry$register$subscription$1(listener), GlobalRecsConsumptionListenerRegistry$register$subscription$2.INSTANCE);
            Map map = this.subscriptionsBySubscriber;
            C2668g.a(a, "subscription");
            map.put(listener, a);
        }
    }

    public final synchronized void unregister(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        Subscription subscription = (Subscription) this.subscriptionsBySubscriber.get(listener);
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.subscriptionsBySubscriber.remove(listener);
    }

    public final synchronized boolean isSubscribed(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        return this.subscriptionsBySubscriber.get(listener) != null ? true : null;
    }
}
