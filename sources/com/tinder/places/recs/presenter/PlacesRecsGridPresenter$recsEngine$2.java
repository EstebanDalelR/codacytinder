package com.tinder.places.recs.presenter;

import com.tinder.domain.recs.RecsEngine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/RecsEngine;", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesRecsGridPresenter$recsEngine$2 extends Lambda implements Function0<RecsEngine> {
    /* renamed from: a */
    final /* synthetic */ C12433a f45072a;

    PlacesRecsGridPresenter$recsEngine$2(C12433a c12433a) {
        this.f45072a = c12433a;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53981a();
    }

    @NotNull
    /* renamed from: a */
    public final RecsEngine m53981a() {
        RecsEngine engine = this.f45072a.f40100k.getEngine(this.f45072a.f40099j);
        if (engine == null) {
            C2668g.a();
        }
        return engine;
    }
}
