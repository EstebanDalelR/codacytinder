package com.tinder.places.map.view;

import android.content.Context;
import android.support.v4.content.C0432b;
import com.mapbox.geojson.Feature;
import com.tinder.places.viewmodel.C14351c;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class PlacesMapFragment$getFeatureForPlace$1 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ C14217c f45041a;
    /* renamed from: b */
    final /* synthetic */ Feature f45042b;
    /* renamed from: c */
    final /* synthetic */ C14351c f45043c;
    /* renamed from: d */
    final /* synthetic */ Function1 f45044d;

    PlacesMapFragment$getFeatureForPlace$1(C14217c c14217c, Feature feature, C14351c c14351c, Function1 function1) {
        this.f45041a = c14217c;
        this.f45042b = feature;
        this.f45043c = c14351c;
        this.f45044d = function1;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m53942a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m53942a() {
        this.f45042b.addStringProperty("placeId", this.f45043c.a());
        this.f45042b.addStringProperty("placeIdActivated", this.f45041a.m53949a(this.f45043c.a(), true));
        this.f45042b.addStringProperty("placeIdUnactivated", this.f45041a.m53949a(this.f45043c.a(), false));
        this.f45042b.addBooleanProperty("activated", Boolean.valueOf(false));
        Feature feature = this.f45042b;
        String str = "radarColor";
        Context context = this.f45041a.getContext();
        if (context == null) {
            C2668g.a();
        }
        feature.addNumberProperty(str, Integer.valueOf(C0432b.c(context, this.f45043c.c())));
        this.f45042b.addBooleanProperty("colored", Boolean.valueOf(false));
        Function1 function1 = this.f45044d;
        Feature feature2 = this.f45042b;
        C2668g.a(feature2, "feature");
        function1.invoke(feature2);
    }
}
