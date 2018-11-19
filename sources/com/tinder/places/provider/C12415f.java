package com.tinder.places.provider;

import android.support.annotation.UiThread;
import com.tinder.data.places.provider.PlacesConfigExpansionProvider;
import com.tinder.domain.places.model.PlacesConfigExpansion;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.p494a.C19562a;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/places/provider/PlacesConfigExpansionImplProvider;", "Lcom/tinder/data/places/provider/PlacesConfigExpansionProvider;", "()V", "subject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "get", "observe", "Lrx/Observable;", "update", "", "config", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.provider.f */
public final class C12415f implements PlacesConfigExpansionProvider {
    /* renamed from: a */
    private final C19785a<PlacesConfigExpansion> f40063a;

    public C12415f() {
        C19785a f = C19785a.f(new PlacesConfigExpansion(null, null, null, null, null, 31, null));
        C2668g.a(f, "BehaviorSubject.create(PlacesConfigExpansion())");
        this.f40063a = f;
    }

    @NotNull
    public PlacesConfigExpansion get() {
        Object A = this.f40063a.A();
        C2668g.a(A, "subject.value");
        return (PlacesConfigExpansion) A;
    }

    @NotNull
    public Observable<PlacesConfigExpansion> observe() {
        Observable<PlacesConfigExpansion> e = this.f40063a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    @UiThread
    public void update(@NotNull PlacesConfigExpansion placesConfigExpansion) {
        C2668g.b(placesConfigExpansion, "config");
        C19562a.b();
        this.f40063a.onNext(placesConfigExpansion);
    }
}
