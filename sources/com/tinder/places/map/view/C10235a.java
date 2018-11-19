package com.tinder.places.map.view;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tinder/places/map/view/MapboxLayerManager;", "", "()V", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.map.view.a */
public final class C10235a {
    /* renamed from: a */
    public static final C10234a f33348a = new C10234a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/places/map/view/MapboxLayerManager$Companion;", "", "()V", "ACTIVATED_KEY", "", "COLORED_KEY", "DEFAULT_ICON_OFFSET", "", "IMAGE_ACTIVATED_KEY", "IMAGE_ACTIVATED_SUFFIX", "IMAGE_UNACTIVATED_KEY", "IMAGE_UNACTIVATED_SUFFIX", "PIN_LAYER_ID", "PLACE_ID_KEY", "RADAR_COLOR_KEY", "SELECTED_SOURCE_ID", "SOURCE_ID", "addCircleLayers", "", "map", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "addDotLayer", "addPinLayer", "addSelectedLayer", "selectedSource", "Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "createCircleLayer", "Lcom/mapbox/mapboxsdk/style/layers/CircleLayer;", "layerId", "sourceId", "getCircleLayers", "", "getPinLayer", "Lcom/mapbox/mapboxsdk/style/layers/SymbolLayer;", "getSelectedLayer", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.a$a */
    public static final class C10234a {
        private C10234a() {
        }

        /* renamed from: a */
        public final void m41623a(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "map");
            SymbolLayer symbolLayer = new SymbolLayer("pinLayer", "sourceId");
            PropertyValue[] propertyValueArr = new PropertyValue[5];
            propertyValueArr[0] = PropertyFactory.iconImage("{placeIdUnactivated}");
            propertyValueArr[1] = PropertyFactory.iconAllowOverlap(Boolean.valueOf(true));
            propertyValueArr[2] = PropertyFactory.iconIgnorePlacement(Boolean.valueOf(true));
            propertyValueArr[3] = PropertyFactory.iconSize(Float.valueOf(0.8f));
            propertyValueArr[4] = PropertyFactory.iconOffset(new Float[]{Float.valueOf(0.0f), Float.valueOf(-9.0f)});
            symbolLayer = symbolLayer.withProperties(propertyValueArr);
            C2668g.a(symbolLayer, "symbolLayer");
            symbolLayer.setFilter(Expression.eq(Expression.get("activated"), false));
            mapboxMap.addLayer(symbolLayer);
        }

        /* renamed from: b */
        public final void m41625b(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "map");
            C10234a c10234a = this;
            mapboxMap.addLayerBelow(m41622a("circle1", "sourceId"), "pinLayer");
            mapboxMap.addLayerBelow(m41622a("circle2", "sourceId"), "circle1");
        }

        /* renamed from: a */
        public final void m41624a(@NotNull MapboxMap mapboxMap, @NotNull GeoJsonSource geoJsonSource) {
            C2668g.b(mapboxMap, "map");
            C2668g.b(geoJsonSource, "selectedSource");
            mapboxMap.addSource(geoJsonSource);
            geoJsonSource = new SymbolLayer("selectedLayer", "sourceId").withProperties(new PropertyValue[]{PropertyFactory.iconImage("{placeIdActivated}"), PropertyFactory.iconAllowOverlap(Boolean.valueOf(true)), PropertyFactory.iconIgnorePlacement(Boolean.valueOf(true)), PropertyFactory.iconSize(Float.valueOf(0.8f))});
            Expression eq = Expression.eq(Expression.get("colored"), true);
            C2668g.a(geoJsonSource, "selectedLayer");
            geoJsonSource.setFilter(eq);
            mapboxMap.addLayerAbove((Layer) geoJsonSource, "pinLayer");
        }

        /* renamed from: c */
        public final void m41626c(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "map");
            Expression eq = Expression.eq(Expression.get("activated"), true);
            Expression eq2 = Expression.eq(Expression.get("activated"), false);
            CircleLayer circleLayer = new CircleLayer("dot", "sourceId");
            circleLayer.setProperties(new PropertyValue[]{PropertyFactory.circleColor(-1), PropertyFactory.circleRadius(Float.valueOf(6.0f))});
            circleLayer.setFilter(eq2);
            CircleLayer circleLayer2 = new CircleLayer("dotSelected", "sourceId");
            circleLayer2.setFilter(eq);
            circleLayer2.setProperties(new PropertyValue[]{PropertyFactory.circleColor(-1), PropertyFactory.circleRadius(Float.valueOf(6.0f))});
            mapboxMap.addLayerAbove(circleLayer, "circle1");
            mapboxMap.addLayerAbove(circleLayer2, "selectedLayer");
        }

        @NotNull
        /* renamed from: d */
        public final SymbolLayer m41627d(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "map");
            mapboxMap = mapboxMap.getLayerAs("pinLayer");
            if (mapboxMap == null) {
                C2668g.a();
            }
            return (SymbolLayer) mapboxMap;
        }

        @NotNull
        /* renamed from: e */
        public final SymbolLayer m41628e(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "map");
            mapboxMap = mapboxMap.getLayerAs("selectedLayer");
            if (mapboxMap == null) {
                C2668g.a();
            }
            return (SymbolLayer) mapboxMap;
        }

        @NotNull
        /* renamed from: f */
        public final List<CircleLayer> m41629f(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "map");
            Layer layerAs = mapboxMap.getLayerAs("circle1");
            if (layerAs == null) {
                C2668g.a();
            }
            CircleLayer circleLayer = (CircleLayer) layerAs;
            mapboxMap = mapboxMap.getLayerAs("circle2");
            if (mapboxMap == null) {
                C2668g.a();
            }
            CircleLayer circleLayer2 = (CircleLayer) mapboxMap;
            return C19301m.b(new CircleLayer[]{circleLayer, circleLayer2});
        }

        /* renamed from: a */
        private final CircleLayer m41622a(String str, String str2) {
            CircleLayer circleLayer = new CircleLayer(str, str2);
            circleLayer.setFilter(Expression.eq(Expression.get("activated"), true));
            circleLayer.getCircleOpacityTransition();
            circleLayer.setCircleRadiusTransition(new TransitionOptions(0, 0));
            circleLayer.setCircleOpacityTransition(new TransitionOptions(0, 0));
            circleLayer.setProperties(new PropertyValue[]{PropertyFactory.circleRadius(Float.valueOf(1.6f))});
            circleLayer.setProperties(new PropertyValue[]{PropertyFactory.circleOpacity(Float.valueOf(1.0f))});
            return circleLayer;
        }
    }
}
