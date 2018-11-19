package com.tinder.places.p156a;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11140a;
import com.tinder.discovery.p235d.C11140a.C8891a;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/badge/PlacesBadgeTrigger;", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger;", "badgeOwnerAdapter", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;", "shouldShowPlacesBadge", "Lcom/tinder/places/badge/ShouldShowPlacesBadge;", "shouldShowPlacesTooltip", "Lcom/tinder/places/badge/ShouldShowPlacesTooltip;", "(Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;Lcom/tinder/places/badge/ShouldShowPlacesBadge;Lcom/tinder/places/badge/ShouldShowPlacesTooltip;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "onCancelled", "", "run", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.a.a */
public final class C8026a extends C11140a {
    /* renamed from: a */
    private Disposable f28669a;
    /* renamed from: b */
    private final C7353j f28670b;
    /* renamed from: c */
    private final C7357l f28671c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.a$a */
    static final class C7340a<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C7340a f26507a = new C7340a();

        C7340a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m31320a((Boolean) obj);
        }

        /* renamed from: a */
        public final boolean m31320a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return C2668g.a(bool, Boolean.valueOf(true));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.a$b */
    static final class C7341b<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C8026a f26508a;

        C7341b(C8026a c8026a) {
            this.f26508a = c8026a;
        }

        public /* synthetic */ void accept(Object obj) {
            m31321a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m31321a(Boolean bool) {
            this.f26508a.a(true);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.a$c */
    static final class C7342c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C7342c f26509a = new C7342c();

        C7342c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m31322a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m31322a(Throwable th) {
            C0001a.c(th, "Error retrieving places badge trigger", new Object[0]);
        }
    }

    public C8026a(@NotNull C8891a c8891a, @NotNull C7353j c7353j, @NotNull C7357l c7357l) {
        C2668g.b(c8891a, "badgeOwnerAdapter");
        C2668g.b(c7353j, "shouldShowPlacesBadge");
        C2668g.b(c7357l, "shouldShowPlacesTooltip");
        super(DiscoverySegment.PLACES, c8891a);
        this.f28670b = c7353j;
        this.f28671c = c7357l;
    }

    public void u_() {
        this.f28669a = C3959e.merge(this.f28670b.execute(), this.f28671c.execute()).filter(C7340a.f26507a).distinctUntilChanged().observeOn(C15674a.a()).subscribe(new C7341b(this), C7342c.f26509a);
    }

    /* renamed from: d */
    public void m33935d() {
        Disposable disposable = this.f28669a;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
