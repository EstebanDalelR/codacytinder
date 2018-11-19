package com.tinder.places.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.qi;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JK\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/tinder/places/analytics/AddPlacesCorrectRecentPlaceEvent;", "", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "add", "", "placeId", "", "alternativeId", "confirmed", "", "numAlternatives", "", "errorCode", "noCorrectAlternative", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "errorAlternativePlace", "userConfirmedAlternativePlace", "userDeletedAfterNoneOfThese", "userKeptAfterNoneOfThese", "userSelectedAlternativePlace", "userSelectedIncorrectPlace", "userSelectedNoneOfTheseOption", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.analytics.a */
public final class C10112a {
    @NotNull
    /* renamed from: a */
    private final C2630h f33081a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.analytics.a$a */
    static final class C14142a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10112a f44874a;
        /* renamed from: b */
        final /* synthetic */ String f44875b;
        /* renamed from: c */
        final /* synthetic */ String f44876c;
        /* renamed from: d */
        final /* synthetic */ Boolean f44877d;
        /* renamed from: e */
        final /* synthetic */ Integer f44878e;
        /* renamed from: f */
        final /* synthetic */ Integer f44879f;
        /* renamed from: g */
        final /* synthetic */ Boolean f44880g;

        C14142a(C10112a c10112a, String str, String str2, Boolean bool, Integer num, Integer num2, Boolean bool2) {
            this.f44874a = c10112a;
            this.f44875b = str;
            this.f44876c = str2;
            this.f44877d = bool;
            this.f44878e = num;
            this.f44879f = num2;
            this.f44880g = bool2;
        }

        public final void call() {
            this.f44874a.m41336a().a(qi.m45883a().m38610b(this.f44875b).m38606a(this.f44876c).m38604a(this.f44877d).m38609b((Number) this.f44878e).m38605a((Number) this.f44879f).m38608b(this.f44880g).m38607a());
        }
    }

    @Inject
    public C10112a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33081a = c2630h;
    }

    @NotNull
    /* renamed from: a */
    public final C2630h m41336a() {
        return this.f33081a;
    }

    /* renamed from: a */
    public final void m41338a(@NotNull String str, int i) {
        C2668g.b(str, "placeId");
        C10112a.m41334a(this, str, null, null, Integer.valueOf(i), null, null, 48, null);
    }

    /* renamed from: a */
    public final void m41339a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "placeId");
        C2668g.b(str2, "alternativeId");
        C10112a.m41334a(this, str, str2, null, null, null, null, 48, null);
    }

    /* renamed from: a */
    public final void m41340a(@NotNull String str, boolean z, @NotNull String str2) {
        C2668g.b(str, "placeId");
        C2668g.b(str2, "alternativeId");
        C10112a.m41334a(this, str, str2, Boolean.valueOf(z), null, null, null, 48, null);
    }

    /* renamed from: b */
    public final void m41342b(@NotNull String str, int i) {
        C2668g.b(str, "placeId");
        C10112a.m41334a(this, str, null, null, null, Integer.valueOf(i), null, 32, null);
    }

    /* renamed from: a */
    public final void m41337a(@NotNull String str) {
        C2668g.b(str, "placeId");
        C10112a.m41334a(this, str, null, null, null, null, Boolean.valueOf(true), 16, null);
    }

    /* renamed from: b */
    public final void m41341b(@NotNull String str) {
        C2668g.b(str, "placeId");
        C10112a.m41334a(this, str, null, Boolean.valueOf(false), null, null, Boolean.valueOf(true), 16, null);
    }

    /* renamed from: c */
    public final void m41343c(@NotNull String str) {
        C2668g.b(str, "placeId");
        C10112a.m41334a(this, str, null, Boolean.valueOf(true), null, null, Boolean.valueOf(true), 16, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m41334a(C10112a c10112a, String str, String str2, Boolean bool, Integer num, Integer num2, Boolean bool2, int i, Object obj) {
        c10112a.m41335a(str, str2, bool, num, (i & 16) != 0 ? (Integer) null : num2, (i & 32) != 0 ? (Boolean) null : bool2);
    }

    /* renamed from: a */
    private final void m41335a(String str, String str2, Boolean bool, Integer num, Integer num2, Boolean bool2) {
        Completable.a(new C14142a(this, str, str2, bool, num, num2, bool2)).b(RxUtils.a("AddPlacesCorrectRecentPlaceEvent failed"));
    }
}
