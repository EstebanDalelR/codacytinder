package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.data.places.p330b.C10894b;
import com.tinder.etl.event.qt;
import com.tinder.etl.event.qt.C9218a;
import com.tinder.utils.RxUtils;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesViewEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "countPlaces", "Lcom/tinder/data/places/usecase/CountPlacesInCache;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/data/places/usecase/CountPlacesInCache;)V", "add", "", "source", "Lcom/tinder/places/analytics/AddPlacesViewEvent$Source;", "screen", "Lcom/tinder/places/analytics/AddPlacesViewEvent$Screen;", "isLoading", "", "countAndFire", "Lrx/Completable;", "eventBuilder", "Lcom/tinder/etl/event/PlacesViewEvent$Builder;", "fire", "Screen", "Source", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddPlacesViewEvent {
    /* renamed from: a */
    private final C2630h f33079a;
    /* renamed from: b */
    private final C10894b f33080b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesViewEvent$Screen;", "", "(Ljava/lang/String;I)V", "ONBOARDING", "PLACES", "PLACES_DISABLED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Screen {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesViewEvent$Source;", "", "(Ljava/lang/String;I)V", "TOGGLE", "NOTIFICATION", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/PlacesViewEvent$Builder;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesViewEvent$a */
    static final class C10111a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ Source f33077a;
        /* renamed from: b */
        final /* synthetic */ Screen f33078b;

        C10111a(Source source, Screen screen) {
            this.f33077a = source;
            this.f33078b = screen;
        }

        public /* synthetic */ Object call() {
            return m41327a();
        }

        /* renamed from: a */
        public final C9218a m41327a() {
            C9218a a = qt.m45990a();
            String name = this.f33077a.name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            name = name.toLowerCase();
            C2668g.a(name, "(this as java.lang.String).toLowerCase()");
            a = a.m38654b(name);
            name = this.f33078b.name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            name = name.toLowerCase();
            C2668g.a(name, "(this as java.lang.String).toLowerCase()");
            return a.m38652a(name);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "eventBuilder", "Lcom/tinder/etl/event/PlacesViewEvent$Builder;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesViewEvent$b */
    static final class C13559b<T, R> implements Func1<C9218a, Completable> {
        /* renamed from: a */
        final /* synthetic */ AddPlacesViewEvent f43291a;
        /* renamed from: b */
        final /* synthetic */ Screen f43292b;
        /* renamed from: c */
        final /* synthetic */ boolean f43293c;

        C13559b(AddPlacesViewEvent addPlacesViewEvent, Screen screen, boolean z) {
            this.f43291a = addPlacesViewEvent;
            this.f43292b = screen;
            this.f43293c = z;
        }

        public /* synthetic */ Object call(Object obj) {
            return m52976a((C9218a) obj);
        }

        /* renamed from: a */
        public final Completable m52976a(C9218a c9218a) {
            AddPlacesViewEvent addPlacesViewEvent;
            if (this.f43292b == Screen.PLACES) {
                c9218a.m38650a(Boolean.valueOf(this.f43293c));
                if (this.f43293c) {
                    addPlacesViewEvent = this.f43291a;
                    C2668g.a(c9218a, "eventBuilder");
                    return addPlacesViewEvent.m41329a(c9218a);
                }
                addPlacesViewEvent = this.f43291a;
                C2668g.a(c9218a, "eventBuilder");
                return addPlacesViewEvent.m41331b(c9218a);
            }
            addPlacesViewEvent = this.f43291a;
            C2668g.a(c9218a, "eventBuilder");
            return addPlacesViewEvent.m41329a(c9218a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesViewEvent$c */
    static final class C14139c<T> implements Action1<Integer> {
        /* renamed from: a */
        final /* synthetic */ AddPlacesViewEvent f44868a;
        /* renamed from: b */
        final /* synthetic */ C9218a f44869b;

        C14139c(AddPlacesViewEvent addPlacesViewEvent, C9218a c9218a) {
            this.f44868a = addPlacesViewEvent;
            this.f44869b = c9218a;
        }

        public /* synthetic */ void call(Object obj) {
            m53842a((Integer) obj);
        }

        /* renamed from: a */
        public final void m53842a(Integer num) {
            this.f44869b.m38651a((Number) num);
            this.f44868a.f33079a.a(this.f44869b.m38653a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesViewEvent$d */
    static final class C14140d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ AddPlacesViewEvent f44870a;
        /* renamed from: b */
        final /* synthetic */ C9218a f44871b;

        C14140d(AddPlacesViewEvent addPlacesViewEvent, C9218a c9218a) {
            this.f44870a = addPlacesViewEvent;
            this.f44871b = c9218a;
        }

        public /* synthetic */ void call(Object obj) {
            m53843a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53843a(Throwable th) {
            C0001a.c(th, "failed to get places count for AddPlacesViewEvent", new Object[0]);
            this.f44870a.f33079a.a(this.f44871b.m38653a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesViewEvent$e */
    static final class C14141e implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddPlacesViewEvent f44872a;
        /* renamed from: b */
        final /* synthetic */ C9218a f44873b;

        C14141e(AddPlacesViewEvent addPlacesViewEvent, C9218a c9218a) {
            this.f44872a = addPlacesViewEvent;
            this.f44873b = c9218a;
        }

        public final void call() {
            this.f44872a.f33079a.a(this.f44873b.m38653a());
        }
    }

    @Inject
    public AddPlacesViewEvent(@NotNull C2630h c2630h, @NotNull C10894b c10894b) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c10894b, "countPlaces");
        this.f33079a = c2630h;
        this.f33080b = c10894b;
    }

    /* renamed from: a */
    public final void m41333a(@NotNull Source source, @NotNull Screen screen, boolean z) {
        C2668g.b(source, "source");
        C2668g.b(screen, "screen");
        Single.a(new C10111a(source, screen)).c(new C13559b(this, screen, z)).b(RxUtils.a("AddPlacesViewEvent failed"));
    }

    /* renamed from: a */
    private final Completable m41329a(C9218a c9218a) {
        c9218a = Completable.a(new C14141e(this, c9218a));
        C2668g.a(c9218a, "Completable.fromAction {…t(eventBuilder.build()) }");
        return c9218a;
    }

    /* renamed from: b */
    private final Completable m41331b(C9218a c9218a) {
        c9218a = this.f33080b.execute().d(new C14139c(this, c9218a)).c(new C14140d(this, c9218a)).b();
        C2668g.a(c9218a, "countPlaces.execute().do…        }.toCompletable()");
        return c9218a;
    }
}
