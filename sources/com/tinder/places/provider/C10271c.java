package com.tinder.places.provider;

import io.reactivex.C3957b;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.processors.C18430a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/places/provider/PlaceFrontmostProvider;", "", "()V", "processor", "Lio/reactivex/processors/BehaviorProcessor;", "Lcom/tinder/places/provider/PlaceFrontmostProvider$PlacesNavState;", "observePlacesFrontmost", "Lio/reactivex/Flowable;", "updateDiscoverPaged", "", "isDiscoverPaged", "", "updatePlacesToggled", "isPlacesToggled", "PlacesNavState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.c */
public final class C10271c {
    /* renamed from: a */
    private final BehaviorProcessor<C10270a> f33401a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/provider/PlaceFrontmostProvider$PlacesNavState;", "", "isPlacesToggled", "", "isDiscoverPaged", "(ZZ)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "isPlacesFrontmost", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.c$a */
    public static final class C10270a {
        /* renamed from: a */
        private final boolean f33399a;
        /* renamed from: b */
        private final boolean f33400b;

        public C10270a() {
            this(false, false, 3, null);
        }

        @NotNull
        /* renamed from: a */
        public static /* synthetic */ C10270a m41657a(C10270a c10270a, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c10270a.f33399a;
            }
            if ((i & 2) != 0) {
                z2 = c10270a.f33400b;
            }
            return c10270a.m41658a(z, z2);
        }

        @NotNull
        /* renamed from: a */
        public final C10270a m41658a(boolean z, boolean z2) {
            return new C10270a(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10270a) {
                C10270a c10270a = (C10270a) obj;
                if ((this.f33399a == c10270a.f33399a ? 1 : null) != null) {
                    if ((this.f33400b == c10270a.f33400b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f33399a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            boolean z = this.f33400b;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlacesNavState(isPlacesToggled=");
            stringBuilder.append(this.f33399a);
            stringBuilder.append(", isDiscoverPaged=");
            stringBuilder.append(this.f33400b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10270a(boolean z, boolean z2) {
            this.f33399a = z;
            this.f33400b = z2;
        }

        public /* synthetic */ C10270a(boolean z, boolean z2, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            this(z, z2);
        }

        /* renamed from: a */
        public final boolean m41659a() {
            return this.f33399a && this.f33400b;
        }
    }

    @Inject
    public C10271c() {
        BehaviorProcessor d = BehaviorProcessor.d(new C10270a(false, false, 3, null));
        C2668g.a(d, "BehaviorProcessor.createDefault(PlacesNavState())");
        this.f33401a = d;
    }

    @NotNull
    /* renamed from: a */
    public final C3957b<C10270a> m41660a() {
        C18430a u = this.f33401a.u();
        C2668g.a(u, "processor.toSerialized()");
        return u;
    }

    /* renamed from: a */
    public final void m41661a(boolean z) {
        this.f33401a.onNext(C10270a.m41657a((C10270a) this.f33401a.s(), z, false, 2, null));
    }

    /* renamed from: b */
    public final void m41662b(boolean z) {
        this.f33401a.onNext(C10270a.m41657a((C10270a) this.f33401a.s(), false, z, 1, null));
    }
}
