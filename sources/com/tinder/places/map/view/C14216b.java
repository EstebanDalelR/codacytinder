package com.tinder.places.map.view;

import android.support.annotation.DrawableRes;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.geometry.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BG\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/map/view/PlaceMarkerView;", "Lcom/mapbox/mapboxsdk/annotations/MarkerView;", "options", "Lcom/mapbox/mapboxsdk/annotations/BaseMarkerViewOptions;", "Lcom/tinder/places/map/view/PlaceMarkerViewOptions;", "pinResource", "", "radarResource", "iconResource", "placeId", "", "location", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "(Lcom/mapbox/mapboxsdk/annotations/BaseMarkerViewOptions;IIILjava/lang/String;Lcom/mapbox/mapboxsdk/geometry/LatLng;)V", "getIconResource", "()I", "getLocation", "()Lcom/mapbox/mapboxsdk/geometry/LatLng;", "getPinResource", "getPlaceId", "()Ljava/lang/String;", "getRadarResource", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.map.view.b */
public final class C14216b extends MarkerView {
    /* renamed from: a */
    private final int f45045a;
    /* renamed from: b */
    private final int f45046b;
    /* renamed from: c */
    private final int f45047c;
    @NotNull
    /* renamed from: d */
    private final String f45048d;
    @NotNull
    /* renamed from: e */
    private final LatLng f45049e;

    public C14216b(@NotNull BaseMarkerViewOptions<C14216b, PlaceMarkerViewOptions> baseMarkerViewOptions, @DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3, @NotNull String str, @NotNull LatLng latLng) {
        C2668g.b(baseMarkerViewOptions, "options");
        C2668g.b(str, "placeId");
        C2668g.b(latLng, "location");
        super(baseMarkerViewOptions);
        this.f45045a = i;
        this.f45046b = i2;
        this.f45047c = i3;
        this.f45048d = str;
        this.f45049e = latLng;
    }
}
