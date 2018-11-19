package com.tinder.places.provider;

import android.support.annotation.UiThread;
import com.tinder.places.card.presenter.PlacesCardViewPresenter.FlippedState;
import com.tinder.provider.RxProvider;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.subjects.C19785a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u001c\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00020\nH\u0016J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0006\u0010\u0010\u001a\u00020\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/places/provider/PlaceCardFlippedProvider;", "Lcom/tinder/provider/RxProvider;", "Lkotlin/Pair;", "", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$FlippedState;", "()V", "flipRequestedSubject", "Lrx/subjects/BehaviorSubject;", "subject", "observe", "Lrx/Observable;", "observeFlipRequested", "onPlaceCardFlipped", "", "placeId", "flippedState", "showFrontIfFlipped", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.a */
public final class C12412a implements RxProvider<Pair<? extends String, ? extends FlippedState>> {
    /* renamed from: a */
    private final C19785a<Pair<String, FlippedState>> f40057a;
    /* renamed from: b */
    private final C19785a<String> f40058b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$FlippedState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.a$a */
    static final class C13591a<T, R> implements Func1<Pair<? extends String, ? extends FlippedState>, Boolean> {
        /* renamed from: a */
        public static final C13591a f43336a = new C13591a();

        C13591a() {
        }

        /* renamed from: a */
        public final boolean m53043a(Pair<String, ? extends FlippedState> pair) {
            return pair != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53043a((Pair) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$FlippedState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.a$b */
    static final class C13592b<T, R> implements Func1<Pair<? extends String, ? extends FlippedState>, Boolean> {
        /* renamed from: a */
        public static final C13592b f43337a = new C13592b();

        C13592b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53044a((Pair) obj));
        }

        /* renamed from: a */
        public final boolean m53044a(Pair<String, ? extends FlippedState> pair) {
            return ((FlippedState) pair.b()) == FlippedState.BACK ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0004 \u0005*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "Lcom/tinder/places/card/presenter/PlacesCardViewPresenter$FlippedState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.a$c */
    static final class C13593c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C13593c f43338a = new C13593c();

        C13593c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m53045a((Pair) obj);
        }

        @Nullable
        /* renamed from: a */
        public final String m53045a(Pair<String, ? extends FlippedState> pair) {
            return (String) pair.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "placeId", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.a$d */
    static final class C13594d<T, R> implements Func1<String, Boolean> {
        /* renamed from: a */
        public static final C13594d f43339a = new C13594d();

        C13594d() {
        }

        /* renamed from: a */
        public final boolean m53046a(@Nullable String str) {
            return str != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53046a((String) obj));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.a$e */
    static final class C14220e<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C12412a f45069a;

        C14220e(C12412a c12412a) {
            this.f45069a = c12412a;
        }

        public /* synthetic */ void call(Object obj) {
            m53979a((String) obj);
        }

        /* renamed from: a */
        public final void m53979a(@Nullable String str) {
            this.f45069a.f40058b.onNext(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.provider.a$f */
    static final class C14221f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14221f f45070a = new C14221f();

        C14221f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53980a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53980a(Throwable th) {
            C0001a.c(th, "Failed to flip PlaceCardView to front", new Object[0]);
        }
    }

    @Inject
    public C12412a() {
        C19785a w = C19785a.w();
        C2668g.a(w, "BehaviorSubject.create()");
        this.f40057a = w;
        w = C19785a.w();
        C2668g.a(w, "BehaviorSubject.create()");
        this.f40058b = w;
    }

    @NotNull
    public Observable<Pair<String, FlippedState>> observe() {
        Observable<Pair<String, FlippedState>> e = this.f40057a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<String> m48845a() {
        Observable<String> e = this.f40058b.e();
        C2668g.a(e, "flipRequestedSubject.asObservable()");
        return e;
    }

    @UiThread
    /* renamed from: a */
    public final void m48846a(@Nullable String str, @NotNull FlippedState flippedState) {
        C2668g.b(flippedState, "flippedState");
        this.f40057a.onNext(new Pair(str, flippedState));
    }

    /* renamed from: b */
    public final void m48847b() {
        this.f40057a.c(1).f(C13591a.f43336a).f(C13592b.f43337a).k(C13593c.f43338a).f(C13594d.f43339a).a(C19397a.a()).a(new C14220e(this), C14221f.f45070a);
    }
}
