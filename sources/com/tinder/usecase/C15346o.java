package com.tinder.usecase;

import android.location.Location;
import com.tinder.analytics.ThirdPartyLocationUpdatesListener;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.core.p201a.C8589c;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B*\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/usecase/TrackTruncatedLocationUpdates;", "", "locationProvider", "Lcom/tinder/core/provider/TruncatedLocationProvider;", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "listeners", "", "Lcom/tinder/analytics/ThirdPartyLocationUpdatesListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/tinder/core/provider/TruncatedLocationProvider;Lcom/tinder/app/AppVisibilityTracker;Ljava/util/Set;)V", "execute", "Lio/reactivex/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.o */
public final class C15346o {
    /* renamed from: a */
    private final C8589c f47584a;
    /* renamed from: b */
    private final AppVisibilityTracker f47585b;
    /* renamed from: c */
    private final Set<ThirdPartyLocationUpdatesListener> f47586c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.usecase.o$a */
    static final class C17227a<T> implements Predicate<AppVisibilityTracker$Visibility> {
        /* renamed from: a */
        public static final C17227a f52807a = new C17227a();

        C17227a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m63116a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final boolean m63116a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            C2668g.b(appVisibilityTracker$Visibility, "it");
            return appVisibilityTracker$Visibility == AppVisibilityTracker$Visibility.BACKGROUND ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "truncatedLocation", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.usecase.o$b */
    static final class C17228b<T> implements Consumer<Location> {
        /* renamed from: a */
        final /* synthetic */ C15346o f52808a;

        C17228b(C15346o c15346o) {
            this.f52808a = c15346o;
        }

        public /* synthetic */ void accept(Object obj) {
            m63117a((Location) obj);
        }

        /* renamed from: a */
        public final void m63117a(Location location) {
            for (ThirdPartyLocationUpdatesListener thirdPartyLocationUpdatesListener : this.f52808a.f47586c) {
                C2668g.a(location, "truncatedLocation");
                thirdPartyLocationUpdatesListener.onLocationUpdated(location);
            }
        }
    }

    @Inject
    public C15346o(@NotNull C8589c c8589c, @NotNull AppVisibilityTracker appVisibilityTracker, @NotNull Set<ThirdPartyLocationUpdatesListener> set) {
        C2668g.b(c8589c, "locationProvider");
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        C2668g.b(set, "listeners");
        this.f47584a = c8589c;
        this.f47585b = appVisibilityTracker;
        this.f47586c = set;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m57557a() {
        C3956a ignoreElements = RxJavaInteropExtKt.toV2Observable(this.f47584a.a()).takeUntil(this.f47585b.trackVisibility().filter(C17227a.f52807a)).doOnNext(new C17228b(this)).ignoreElements();
        C2668g.a(ignoreElements, "locationProvider.observe…        .ignoreElements()");
        return ignoreElements;
    }
}
