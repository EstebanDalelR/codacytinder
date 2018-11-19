package com.tinder.core.p201a;

import android.location.Location;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\f\u0010\u000b\u001a\u00020\u0007*\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/core/provider/TruncatedLocationProvider;", "", "locationProvider", "Lcom/tinder/core/provider/LocationProvider;", "(Lcom/tinder/core/provider/LocationProvider;)V", "observeLocation", "Lrx/Observable;", "Landroid/location/Location;", "truncate", "", "position", "truncateLatLon", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.a.c */
public final class C8589c {
    /* renamed from: a */
    private final C8588a f30352a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.core.a.c$a */
    static final class C12806a<T, R> implements Func1<Location, Boolean> {
        /* renamed from: a */
        public static final C12806a f41208a = new C12806a();

        C12806a() {
        }

        /* renamed from: a */
        public final boolean m50311a(Location location) {
            return location != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50311a((Location) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/location/Location;", "location", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.core.a.c$b */
    static final class C12807b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C8589c f41209a;

        C12807b(C8589c c8589c) {
            this.f41209a = c8589c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50312a((Location) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Location m50312a(Location location) {
            C8589c c8589c = this.f41209a;
            C2668g.a(location, "location");
            return c8589c.m36619a(location);
        }
    }

    @Inject
    public C8589c(@NotNull C8588a c8588a) {
        C2668g.b(c8588a, "locationProvider");
        this.f30352a = c8588a;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<Location> m36621a() {
        Observable<Location> k = this.f30352a.m36617b().f(C12806a.f41208a).k(new C12807b(this));
        C2668g.a(k, "locationProvider.observe…cation.truncateLatLon() }");
        return k;
    }

    /* renamed from: a */
    private final Location m36619a(@NotNull Location location) {
        location.setLatitude(m36618a(location.getLatitude()));
        location.setLongitude(m36618a(location.getLongitude()));
        return location;
    }

    /* renamed from: a */
    private final double m36618a(double d) {
        if (d > ((double) 0)) {
            double d2 = (double) 100;
            return Math.floor(d * d2) / d2;
        }
        d2 = (double) 100;
        return Math.ceil(d * d2) / d2;
    }
}
