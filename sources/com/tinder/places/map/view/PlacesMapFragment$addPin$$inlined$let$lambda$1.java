package com.tinder.places.map.view;

import com.mapbox.geojson.Feature;
import com.tinder.places.viewmodel.C14351c;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/geojson/Feature;", "invoke", "com/tinder/places/map/view/PlacesMapFragment$addPin$1$1"}, k = 3, mv = {1, 1, 10})
final class PlacesMapFragment$addPin$$inlined$let$lambda$1 extends Lambda implements Function1<Feature, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C14217c f45033a;
    /* renamed from: b */
    final /* synthetic */ C14351c f45034b;

    PlacesMapFragment$addPin$$inlined$let$lambda$1(C14217c c14217c, C14351c c14351c) {
        this.f45033a = c14217c;
        this.f45034b = c14351c;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m53939a((Feature) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53939a(@NotNull Feature feature) {
        C2668g.b(feature, "it");
        List features = this.f45033a.m53971a().features();
        if (features != null) {
            features.add(feature);
        }
        C14217c.m53964b(this.f45033a).setGeoJson(this.f45033a.m53971a());
        this.f45033a.m53972b().m41615c(this.f45034b.a());
    }
}
