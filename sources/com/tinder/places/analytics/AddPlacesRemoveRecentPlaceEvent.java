package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qr;
import com.tinder.etl.event.qr.C9214a;
import com.tinder.utils.RxUtils;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002 !B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J=\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u001d\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\""}, d2 = {"Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "add", "", "placeId", "", "source", "Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent$Source;", "type", "Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent$Type;", "confirmed", "", "errorCode", "", "(Ljava/lang/String;Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent$Source;Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent$Type;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "deletePlaceAlwaysError", "deletePlaceOnceError", "deletePlaceSettingsError", "deletePlaceTappedFromSettings", "deletedPlaceAlwaysConfirmedFromPlaces", "deletedPlaceAlwaysFromPlaces", "deletedPlaceOnceConfirmedFromPlaces", "deletedPlaceOnceFromPlaces", "deletedPlaceRequestedFromPlaces", "deletedPlacesFromSettings", "placeIds", "", "Source", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddPlacesRemoveRecentPlaceEvent {
    @NotNull
    /* renamed from: a */
    private final C2630h f33076a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent$Source;", "", "(Ljava/lang/String;I)V", "PLACES", "SETTINGS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesRemoveRecentPlaceEvent$Type;", "", "(Ljava/lang/String;I)V", "ONCE", "ALWAYS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.AddPlacesRemoveRecentPlaceEvent$a */
    static final class C14138a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddPlacesRemoveRecentPlaceEvent f44862a;
        /* renamed from: b */
        final /* synthetic */ String f44863b;
        /* renamed from: c */
        final /* synthetic */ Type f44864c;
        /* renamed from: d */
        final /* synthetic */ Boolean f44865d;
        /* renamed from: e */
        final /* synthetic */ Source f44866e;
        /* renamed from: f */
        final /* synthetic */ Integer f44867f;

        C14138a(AddPlacesRemoveRecentPlaceEvent addPlacesRemoveRecentPlaceEvent, String str, Type type, Boolean bool, Source source, Integer num) {
            this.f44862a = addPlacesRemoveRecentPlaceEvent;
            this.f44863b = str;
            this.f44864c = type;
            this.f44865d = bool;
            this.f44866e = source;
            this.f44867f = num;
        }

        public final void call() {
            String name;
            C9214a a = qr.m45967a().m38642a(this.f44863b);
            Type type = this.f44864c;
            if (type != null) {
                name = type.name();
                if (name != null) {
                    if (name == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    name = name.toLowerCase();
                    C2668g.a(name, "(this as java.lang.String).toLowerCase()");
                    a = a.m38645c(name).m38640a(this.f44865d);
                    name = this.f44866e.name();
                    if (name != null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    name = name.toLowerCase();
                    C2668g.a(name, "(this as java.lang.String).toLowerCase()");
                    this.f44862a.m41316a().a(a.m38644b(name).m38641a((Number) this.f44867f).m38643a());
                    return;
                }
            }
            name = null;
            a = a.m38645c(name).m38640a(this.f44865d);
            name = this.f44866e.name();
            if (name != null) {
                name = name.toLowerCase();
                C2668g.a(name, "(this as java.lang.String).toLowerCase()");
                this.f44862a.m41316a().a(a.m38644b(name).m38641a((Number) this.f44867f).m38643a());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Inject
    public AddPlacesRemoveRecentPlaceEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33076a = c2630h;
    }

    @NotNull
    /* renamed from: a */
    public final C2630h m41316a() {
        return this.f33076a;
    }

    /* renamed from: a */
    public final void m41317a(@NotNull String str) {
        C2668g.b(str, "placeId");
        m41314a(this, str, Source.PLACES, null, null, null, 16, null);
    }

    /* renamed from: b */
    public final void m41321b(@NotNull String str) {
        C2668g.b(str, "placeId");
        m41314a(this, str, Source.PLACES, Type.ONCE, null, null, 16, null);
    }

    /* renamed from: c */
    public final void m41324c(@NotNull String str) {
        C2668g.b(str, "placeId");
        m41314a(this, str, Source.PLACES, Type.ALWAYS, null, null, 16, null);
    }

    /* renamed from: a */
    public final void m41319a(@NotNull String str, boolean z) {
        C2668g.b(str, "placeId");
        m41314a(this, str, Source.PLACES, Type.ONCE, Boolean.valueOf(z), null, 16, null);
    }

    /* renamed from: b */
    public final void m41323b(@NotNull String str, boolean z) {
        C2668g.b(str, "placeId");
        m41314a(this, str, Source.PLACES, Type.ALWAYS, Boolean.valueOf(z), null, 16, null);
    }

    /* renamed from: d */
    public final void m41326d(@NotNull String str) {
        C2668g.b(str, "placeId");
        m41314a(this, str, Source.SETTINGS, Type.ONCE, null, null, 16, null);
    }

    /* renamed from: a */
    public final void m41320a(@NotNull List<String> list, boolean z) {
        C2668g.b(list, "placeIds");
        for (String a : list) {
            m41314a(this, a, Source.SETTINGS, null, Boolean.valueOf(z), null, 16, null);
        }
    }

    /* renamed from: a */
    public final void m41318a(@NotNull String str, int i) {
        C2668g.b(str, "placeId");
        m41315a(str, Source.PLACES, Type.ONCE, null, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void m41322b(@NotNull String str, int i) {
        C2668g.b(str, "placeId");
        m41315a(str, Source.PLACES, Type.ALWAYS, null, Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void m41325c(@NotNull String str, int i) {
        C2668g.b(str, "placeId");
        m41315a(str, Source.SETTINGS, Type.ONCE, null, Integer.valueOf(i));
    }

    /* renamed from: a */
    static /* synthetic */ void m41314a(AddPlacesRemoveRecentPlaceEvent addPlacesRemoveRecentPlaceEvent, String str, Source source, Type type, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        addPlacesRemoveRecentPlaceEvent.m41315a(str, source, type, bool, num);
    }

    /* renamed from: a */
    private final void m41315a(String str, Source source, Type type, Boolean bool, Integer num) {
        Completable.a(new C14138a(this, str, type, bool, source, num)).b(RxUtils.a("AddPlacesRemoveRecentPlaceEvent failed"));
    }
}
