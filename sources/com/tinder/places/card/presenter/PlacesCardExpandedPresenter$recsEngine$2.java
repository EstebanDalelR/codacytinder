package com.tinder.places.card.presenter;

import com.tinder.domain.recs.RecsEngine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/recs/RecsEngine;", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesCardExpandedPresenter$recsEngine$2 extends Lambda implements Function0<RecsEngine> {
    /* renamed from: a */
    final /* synthetic */ C12306h f44907a;

    PlacesCardExpandedPresenter$recsEngine$2(C12306h c12306h) {
        this.f44907a = c12306h;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53844a();
    }

    @Nullable
    /* renamed from: a */
    public final RecsEngine m53844a() {
        return this.f44907a.f39844o.getEngine(this.f44907a.f39843n);
    }
}
