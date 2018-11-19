package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qq;
import com.tinder.etl.event.qq.C9212a;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eJ\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesRecentPlaceViewEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "add", "", "placeId", "", "source", "Lcom/tinder/places/analytics/AddPlacesRecentPlaceViewEvent$Source;", "cardPosition", "", "viewed", "", "expirationTimeSeconds", "", "numNewRecs", "numRecsTotal", "error", "errorCode", "Source", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddPlacesRecentPlaceViewEvent {
    @NotNull
    /* renamed from: a */
    private final C2630h f33075a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesRecentPlaceViewEvent$Source;", "", "(Ljava/lang/String;I)V", "MAP", "CAROUSEL", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesRecentPlaceViewEvent$a */
    static final class C14136a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddPlacesRecentPlaceViewEvent f44851a;
        /* renamed from: b */
        final /* synthetic */ String f44852b;
        /* renamed from: c */
        final /* synthetic */ Source f44853c;
        /* renamed from: d */
        final /* synthetic */ int f44854d;
        /* renamed from: e */
        final /* synthetic */ boolean f44855e;
        /* renamed from: f */
        final /* synthetic */ long f44856f;
        /* renamed from: g */
        final /* synthetic */ int f44857g;
        /* renamed from: h */
        final /* synthetic */ int f44858h;

        C14136a(AddPlacesRecentPlaceViewEvent addPlacesRecentPlaceViewEvent, String str, Source source, int i, boolean z, long j, int i2, int i3) {
            this.f44851a = addPlacesRecentPlaceViewEvent;
            this.f44852b = str;
            this.f44853c = source;
            this.f44854d = i;
            this.f44855e = z;
            this.f44856f = j;
            this.f44857g = i2;
            this.f44858h = i3;
        }

        public final void call() {
            C9212a a = qq.m45945a();
            a.m38632a(this.f44852b);
            String name = this.f44853c.name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            name = name.toLowerCase();
            C2668g.a(name, "(this as java.lang.String).toLowerCase()");
            a.m38636b(name);
            a.m38631a((Number) Integer.valueOf(this.f44854d));
            a.m38634b(Boolean.valueOf(this.f44855e));
            a.m38637c(Long.valueOf(this.f44856f));
            if (this.f44857g == -1 || this.f44858h == -1) {
                a.m38630a(Boolean.valueOf(true));
            } else {
                a.m38638d(Integer.valueOf(this.f44857g));
                a.m38639e(Integer.valueOf(this.f44858h));
                a.m38630a(Boolean.valueOf(false));
            }
            this.f44851a.m41311a().a(a.m38633a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesRecentPlaceViewEvent$b */
    static final class C14137b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddPlacesRecentPlaceViewEvent f44859a;
        /* renamed from: b */
        final /* synthetic */ String f44860b;
        /* renamed from: c */
        final /* synthetic */ int f44861c;

        C14137b(AddPlacesRecentPlaceViewEvent addPlacesRecentPlaceViewEvent, String str, int i) {
            this.f44859a = addPlacesRecentPlaceViewEvent;
            this.f44860b = str;
            this.f44861c = i;
        }

        public final void call() {
            C9212a a = qq.m45945a();
            a.m38632a(this.f44860b);
            a.m38635b((Number) Integer.valueOf(this.f44861c));
            this.f44859a.m41311a().a(a.m38633a());
        }
    }

    @Inject
    public AddPlacesRecentPlaceViewEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33075a = c2630h;
    }

    @NotNull
    /* renamed from: a */
    public final C2630h m41311a() {
        return this.f33075a;
    }

    /* renamed from: a */
    public final void m41313a(@NotNull String str, @NotNull Source source, int i, boolean z, long j, int i2, int i3) {
        String str2 = str;
        C2668g.b(str2, "placeId");
        Source source2 = source;
        C2668g.b(source2, "source");
        Completable.a(new C14136a(this, str2, source2, i, z, j, i2, i3)).b(RxUtils.a("AddPlacesRecentPlaceViewEvent failed"));
    }

    /* renamed from: a */
    public final void m41312a(@NotNull String str, int i) {
        C2668g.b(str, "placeId");
        Completable.a(new C14137b(this, str, i)).b(RxUtils.a("AddPlacesRecentPlaceViewEvent failed"));
    }
}
