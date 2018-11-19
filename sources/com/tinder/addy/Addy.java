package com.tinder.addy;

import android.arch.persistence.room.C0087d;
import android.arch.persistence.room.C0091e.C0088a;
import android.content.Context;
import com.tinder.addy.AdAggregator.C6178a;
import com.tinder.addy.persistence.PersistenceStrategy;
import com.tinder.addy.persistence.room.AddyDatabase;
import com.tinder.addy.persistence.room.C7298b;
import com.tinder.addy.persistence.room.C7300f;
import com.tinder.addy.ping.PingRepository;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.addy.tracker.AdUrlTracker.C6192a;
import com.tinder.addy.tracker.C7305a;
import com.tinder.addy.tracker.TrackingUrlRepository;
import com.tinder.addy.tracker.TrackingUrlsDecorator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import okhttp3.C17692o;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/addy/Addy;", "", "urlTrackerBuilder", "Lcom/tinder/addy/tracker/AdUrlTracker$Builder;", "pingRepository", "Lcom/tinder/addy/ping/PingRepository;", "trackingUrlRepository", "Lcom/tinder/addy/tracker/TrackingUrlRepository;", "(Lcom/tinder/addy/tracker/AdUrlTracker$Builder;Lcom/tinder/addy/ping/PingRepository;Lcom/tinder/addy/tracker/TrackingUrlRepository;)V", "adAggregators", "", "Lcom/tinder/addy/AdAggregator;", "urlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "addAggregator", "", "adAggregator", "addAggregator$addy_release", "getUrlTracker", "newAdAggregatorBuilder", "Lcom/tinder/addy/AdAggregator$Builder;", "Builder", "InitializationListener", "addy_release"}, k = 1, mv = {1, 1, 10})
public final class Addy {
    /* renamed from: a */
    private final AdUrlTracker f22722a;
    /* renamed from: b */
    private final Set<AdAggregator> f22723b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/addy/Addy$InitializationListener;", "", "onInitialized", "", "addy", "Lcom/tinder/addy/Addy;", "addy_release"}, k = 1, mv = {1, 1, 10})
    public interface InitializationListener {
        void onInitialized(@NotNull Addy addy);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/addy/Addy$Builder;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "initializationListener", "Lcom/tinder/addy/Addy$InitializationListener;", "persistenceStrategy", "Lcom/tinder/addy/persistence/PersistenceStrategy;", "urlTrackerBuilder", "Lcom/tinder/addy/tracker/AdUrlTracker$Builder;", "addTrackingUrlDecorator", "trackingUrlsDecorator", "Lcom/tinder/addy/tracker/TrackingUrlsDecorator;", "build", "Lcom/tinder/addy/Addy;", "listener", "okHttpClient", "Lokhttp3/OkHttpClient;", "addy_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.Addy$a */
    public static final class C6179a {
        /* renamed from: a */
        private final C6192a f22718a = new C6192a();
        /* renamed from: b */
        private PersistenceStrategy f22719b;
        /* renamed from: c */
        private InitializationListener f22720c;
        /* renamed from: d */
        private final Context f22721d;

        public C6179a(@NotNull Context context) {
            C2668g.b(context, "applicationContext");
            this.f22721d = context;
        }

        @NotNull
        /* renamed from: a */
        public final C6179a m26778a(@NotNull C17692o c17692o) {
            C2668g.b(c17692o, "okHttpClient");
            this.f22718a.m26817a(c17692o);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6179a m26776a(@NotNull PersistenceStrategy persistenceStrategy) {
            C2668g.b(persistenceStrategy, "persistenceStrategy");
            this.f22719b = persistenceStrategy;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6179a m26777a(@NotNull TrackingUrlsDecorator trackingUrlsDecorator) {
            C2668g.b(trackingUrlsDecorator, "trackingUrlsDecorator");
            this.f22718a.m26816a(trackingUrlsDecorator);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final Addy m26779a() {
            PersistenceStrategy persistenceStrategy = this.f22719b;
            if (persistenceStrategy == null) {
                C2668g.b("persistenceStrategy");
            }
            if (persistenceStrategy == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C0088a a;
            persistenceStrategy = this.f22719b;
            if (persistenceStrategy == null) {
                C2668g.b("persistenceStrategy");
            }
            switch (C6180a.f22724a[persistenceStrategy.ordinal()]) {
                case 1:
                    a = C0087d.a(this.f22721d, AddyDatabase.class).a();
                    break;
                case 2:
                    a = C0087d.a(this.f22721d, AddyDatabase.class, "addy");
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            AddyDatabase addyDatabase = (AddyDatabase) a.b();
            Addy addy = new Addy(this.f22718a, new C7298b(addyDatabase.mo7415j()), new C7300f(addyDatabase.mo7416k()));
            InitializationListener initializationListener = this.f22720c;
            if (initializationListener != null) {
                initializationListener.onInitialized(addy);
            }
            return addy;
        }
    }

    private Addy(C6192a c6192a, PingRepository pingRepository, TrackingUrlRepository trackingUrlRepository) {
        this.f22722a = c6192a.m26814a(pingRepository).m26815a(trackingUrlRepository).m26818a();
        this.f22723b = (Set) new LinkedHashSet();
    }

    @NotNull
    /* renamed from: a */
    public final C6178a m26780a() {
        return new C6178a(this).m26751a(new C7305a(this.f22722a.m26824a(), this.f22722a.m26828b()));
    }

    @NotNull
    /* renamed from: b */
    public final AdUrlTracker m26782b() {
        return this.f22722a;
    }

    /* renamed from: a */
    public final void m26781a(@NotNull AdAggregator adAggregator) {
        C2668g.b(adAggregator, "adAggregator");
        this.f22723b.add(adAggregator);
    }
}
