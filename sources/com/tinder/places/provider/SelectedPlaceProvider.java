package com.tinder.places.provider;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.ObservingProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Func1;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/places/provider/SelectedPlaceProvider;", "Lcom/tinder/data/ObservingProvider;", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "()V", "subject", "Lrx/subjects/BehaviorSubject;", "get", "observe", "Lrx/Observable;", "update", "", "request", "PlaceSelection", "SelectedFrom", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SelectedPlaceProvider implements ObservingProvider<C10269a> {
    /* renamed from: a */
    private final C19785a<C10269a> f40056a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/places/provider/SelectedPlaceProvider$SelectedFrom;", "", "(Ljava/lang/String;I)V", "LAST_SELECTED_PLACE", "CAROUSEL", "MAP", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum SelectedFrom {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "", "from", "Lcom/tinder/places/provider/SelectedPlaceProvider$SelectedFrom;", "placeId", "", "(Lcom/tinder/places/provider/SelectedPlaceProvider$SelectedFrom;Ljava/lang/String;)V", "getFrom", "()Lcom/tinder/places/provider/SelectedPlaceProvider$SelectedFrom;", "getPlaceId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.SelectedPlaceProvider$a */
    public static final class C10269a {
        @NotNull
        /* renamed from: a */
        private final SelectedFrom f33397a;
        @NotNull
        /* renamed from: b */
        private final String f33398b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C10269a) {
                    C10269a c10269a = (C10269a) obj;
                    if (C2668g.a(this.f33397a, c10269a.f33397a) && C2668g.a(this.f33398b, c10269a.f33398b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            SelectedFrom selectedFrom = this.f33397a;
            int i = 0;
            int hashCode = (selectedFrom != null ? selectedFrom.hashCode() : 0) * 31;
            String str = this.f33398b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PlaceSelection(from=");
            stringBuilder.append(this.f33397a);
            stringBuilder.append(", placeId=");
            stringBuilder.append(this.f33398b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C10269a(@NotNull SelectedFrom selectedFrom, @NotNull String str) {
            C2668g.b(selectedFrom, ManagerWebServices.PARAM_FROM);
            C2668g.b(str, "placeId");
            this.f33397a = selectedFrom;
            this.f33398b = str;
        }

        @NotNull
        /* renamed from: a */
        public final SelectedFrom m41655a() {
            return this.f33397a;
        }

        @NotNull
        /* renamed from: b */
        public final String m41656b() {
            return this.f33398b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.SelectedPlaceProvider$b */
    static final class C13589b<T, R> implements Func1<C10269a, Boolean> {
        /* renamed from: a */
        public static final C13589b f43334a = new C13589b();

        C13589b() {
        }

        /* renamed from: a */
        public final boolean m53041a(C10269a c10269a) {
            return c10269a != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53041a((C10269a) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "place", "Lcom/tinder/places/provider/SelectedPlaceProvider$PlaceSelection;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.SelectedPlaceProvider$c */
    static final class C13590c<T, R> implements Func1<T, U> {
        /* renamed from: a */
        public static final C13590c f43335a = new C13590c();

        C13590c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m53042a((C10269a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m53042a(C10269a c10269a) {
            return c10269a.m41656b();
        }
    }

    public SelectedPlaceProvider() {
        C19785a w = C19785a.w();
        C2668g.a(w, "BehaviorSubject.create()");
        this.f40056a = w;
    }

    public /* synthetic */ Object get() {
        return m48842a();
    }

    public /* synthetic */ void update(Object obj) {
        m48843a((C10269a) obj);
    }

    @Nullable
    /* renamed from: a */
    public C10269a m48842a() {
        return (C10269a) this.f40056a.A();
    }

    /* renamed from: a */
    public void m48843a(@NotNull C10269a c10269a) {
        C2668g.b(c10269a, "request");
        this.f40056a.onNext(c10269a);
    }

    @NotNull
    public Observable<C10269a> observe() {
        Observable<C10269a> e = this.f40056a.e().f(C13589b.f43334a).e(C13590c.f43335a);
        C2668g.a(e, "subject.asObservable()\n … place -> place.placeId }");
        return e;
    }
}
