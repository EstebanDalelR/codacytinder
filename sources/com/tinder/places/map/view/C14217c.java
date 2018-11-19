package com.tinder.places.map.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.view.C0592b;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.ads.AdError;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.CancelableCallback;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveStartedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnStyleLoadedListener;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.SupportMapFragment;
import com.mapbox.mapboxsdk.maps.UiSettings;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import com.tinder.R;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.map.p314a.C10229a;
import com.tinder.places.map.target.PlacesMapTarget;
import com.tinder.places.map.view.C10235a.C10234a;
import com.tinder.places.viewmodel.C14351c;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.p459b.C18450a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001hB\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020\tH\u0016J\u001e\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0.H\u0002J\u0010\u0010/\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0016J\b\u00100\u001a\u00020'H\u0016J\b\u00101\u001a\u00020'H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u00103\u001a\u00020\n2\u0006\u0010+\u001a\u00020,H\u0002J\b\u00104\u001a\u00020'H\u0016J\b\u00105\u001a\u00020'H\u0002J\u0014\u00106\u001a\u0004\u0018\u0001072\b\u0010(\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;H\u0002J$\u0010<\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020'0=H\u0002J\u0018\u0010>\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020'H\u0016J\u0010\u0010B\u001a\u00020'2\u0006\u00109\u001a\u00020\u0017H\u0002J\"\u0010C\u001a\u00020'2\u0006\u00109\u001a\u00020\u00172\u0006\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020@H\u0002J\b\u0010G\u001a\u00020'H\u0016J\u0010\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020JH\u0016J\u0012\u0010K\u001a\u00020'2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u00020'H\u0016J$\u0010O\u001a\u00020'2\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010P\u001a\u00020'H\u0016J\u0012\u0010Q\u001a\u00020'2\b\u0010R\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010S\u001a\u00020'2\u0006\u0010T\u001a\u00020U2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010V\u001a\u00020'H\u0016J \u0010W\u001a\u00020'2\u0006\u0010X\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010Y\u001a\u00020'2\u0006\u0010(\u001a\u00020\tH\u0016J\b\u0010Z\u001a\u00020'H\u0002J\b\u0010[\u001a\u00020'H\u0002J\u0018\u0010\\\u001a\u00020'2\u0006\u0010]\u001a\u00020\f2\u0006\u0010^\u001a\u00020\fH\u0002J\u0018\u0010_\u001a\u00020'2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020aH\u0016J\u0010\u0010c\u001a\u00020'2\u0006\u0010d\u001a\u00020@H\u0002J\u0010\u0010e\u001a\u00020'2\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010f\u001a\u00020'H\u0016J\u0018\u0010g\u001a\u00020'2\u0006\u0010(\u001a\u00020\t2\u0006\u0010F\u001a\u00020@H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lcom/tinder/places/map/view/PlacesMapFragment;", "Lcom/mapbox/mapboxsdk/maps/SupportMapFragment;", "Lcom/tinder/places/map/target/PlacesMapTarget;", "Lcom/mapbox/mapboxsdk/maps/MapboxMap$OnCameraMoveStartedListener;", "Lcom/mapbox/mapboxsdk/maps/MapboxMap$OnCameraIdleListener;", "Lcom/mapbox/mapboxsdk/maps/MapboxMap$OnStyleLoadedListener;", "()V", "activatedPins", "", "", "Landroid/graphics/Bitmap;", "circleAnimations", "Lcom/mapbox/mapboxsdk/style/layers/CircleLayer;", "Landroid/animation/AnimatorSet;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "featureCollection", "Lcom/mapbox/geojson/FeatureCollection;", "getFeatureCollection", "()Lcom/mapbox/geojson/FeatureCollection;", "setFeatureCollection", "(Lcom/mapbox/geojson/FeatureCollection;)V", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "pendingAnimations", "", "Landroid/animation/ValueAnimator;", "presenter", "Lcom/tinder/places/map/presenter/PlacesMapPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/map/presenter/PlacesMapPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/map/presenter/PlacesMapPresenter;)V", "selectedCollection", "selectedSource", "Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "source", "unActivatedPins", "activatePin", "", "placeId", "activateRadar", "addImages", "pin", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "callback", "Lkotlin/Function0;", "addPin", "animatePinsFromTop", "cancelAndClearCircleAnimations", "createOrGetSelectedPinView", "createOrGetUnselectedPinView", "enableMapInteraction", "endLayerAnimations", "findFeatureById", "Lcom/mapbox/geojson/Feature;", "findFeatureByLocation", "map", "latLng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "getFeatureForPlace", "Lkotlin/Function1;", "getKeyForImage", "activated", "", "hidePins", "initialMapUI", "moveCamera", "cameraPosition", "Lcom/mapbox/mapboxsdk/camera/CameraPosition;", "animated", "onCameraIdle", "onCameraMoveStarted", "reason", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFeatureSelected", "onLowMemory", "onStyleLoaded", "style", "onViewCreated", "view", "Landroid/view/View;", "raisePinAfterDelay", "removeFeatureFromSource", "id", "removePin", "resetPinOffset", "resetSelectedPlace", "selectCircle", "ringOne", "ringTwo", "setInitialMapCoords", "latitude", "", "longitude", "setPinsVisibility", "isVisible", "setupCardFlipGestureDetector", "showPins", "zoomOnPlace", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.map.view.c */
public final class C14217c extends SupportMapFragment implements OnCameraIdleListener, OnCameraMoveStartedListener, OnStyleLoadedListener, PlacesMapTarget {
    /* renamed from: c */
    public static final C10236a f45050c = new C10236a();
    @NotNull
    /* renamed from: a */
    public FeatureCollection f45051a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C10229a f45052b;
    /* renamed from: d */
    private final Set<ValueAnimator> f45053d = new LinkedHashSet();
    /* renamed from: e */
    private final Map<CircleLayer, AnimatorSet> f45054e = new LinkedHashMap();
    /* renamed from: f */
    private final Map<String, Bitmap> f45055f = new LinkedHashMap();
    /* renamed from: g */
    private final Map<String, Bitmap> f45056g = new LinkedHashMap();
    /* renamed from: h */
    private FeatureCollection f45057h;
    /* renamed from: i */
    private GeoJsonSource f45058i;
    /* renamed from: j */
    private GeoJsonSource f45059j;
    /* renamed from: k */
    private MapboxMap f45060k;
    /* renamed from: l */
    private final C17356a f45061l = new C17356a();
    /* renamed from: m */
    private HashMap f45062m;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/places/map/view/PlacesMapFragment$Companion;", "", "()V", "FLY_TO_PIN_ANIMATION_DURATION_MS", "", "PIN_DROP_BOUNCE_TENSION", "", "PIN_DROP_DURATION", "", "PIN_DROP_MAX_DELAY", "PIN_RAISE_ANIMATION_DELAY_MS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$a */
    public static final class C10236a {
        private C10236a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/graphics/Bitmap;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$b */
    static final class C10237b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C14217c f33349a;
        /* renamed from: b */
        final /* synthetic */ C14351c f33350b;

        C10237b(C14217c c14217c, C14351c c14351c) {
            this.f33349a = c14217c;
            this.f33350b = c14351c;
        }

        public /* synthetic */ Object call() {
            return m41630a();
        }

        @NotNull
        /* renamed from: a */
        public final List<Bitmap> m41630a() {
            Bitmap a = this.f33349a.m53944a(this.f33350b);
            Bitmap b = this.f33349a.m53963b(this.f33350b);
            return C19301m.b(new Bitmap[]{a, b});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$e */
    static final class C10238e implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ Float[] f33351a;
        /* renamed from: b */
        final /* synthetic */ SymbolLayer f33352b;
        /* renamed from: c */
        final /* synthetic */ SymbolLayer f33353c;

        C10238e(Float[] fArr, SymbolLayer symbolLayer, SymbolLayer symbolLayer2) {
            this.f33351a = fArr;
            this.f33352b = symbolLayer;
            this.f33353c = symbolLayer2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f33351a[0] = Float.valueOf(0.0f);
            Float[] fArr = this.f33351a;
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            fArr[1] = (Float) valueAnimator;
            this.f33352b.setProperties(new PropertyValue[]{PropertyFactory.iconOffset(this.f33351a)});
            this.f33353c.setProperties(new PropertyValue[]{PropertyFactory.iconOffset(this.f33351a)});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$k */
    static final class C10239k implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ SymbolLayer f33354a;

        C10239k(SymbolLayer symbolLayer) {
            this.f33354a = symbolLayer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            SymbolLayer symbolLayer = this.f33354a;
            PropertyValue[] propertyValueArr = new PropertyValue[1];
            Float[] fArr = new Float[2];
            fArr[0] = Float.valueOf(0.0f);
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            fArr[1] = (Float) valueAnimator;
            propertyValueArr[0] = PropertyFactory.iconOffset(fArr);
            symbolLayer.setProperties(propertyValueArr);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "motionEvent", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$l */
    static final class C10240l implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C0592b f33355a;

        C10240l(C0592b c0592b) {
            this.f33355a = c0592b;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f33355a.a(motionEvent);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/map/view/PlacesMapFragment$setupCardFlipGestureDetector$gestureDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/tinder/places/map/view/PlacesMapFragment;)V", "onSingleTapUp", "", "e", "Landroid/view/MotionEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$m */
    public static final class C10241m extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ C14217c f33356a;

        C10241m(C14217c c14217c) {
            this.f33356a = c14217c;
        }

        public boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
            this.f33356a.m53972b().m41617e();
            return null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$c */
    static final class C12384c<T> implements Consumer<List<? extends Bitmap>> {
        /* renamed from: a */
        final /* synthetic */ C14217c f40009a;
        /* renamed from: b */
        final /* synthetic */ C14351c f40010b;
        /* renamed from: c */
        final /* synthetic */ Function0 f40011c;

        C12384c(C14217c c14217c, C14351c c14351c, Function0 function0) {
            this.f40009a = c14217c;
            this.f40010b = c14351c;
            this.f40011c = function0;
        }

        public /* synthetic */ void accept(Object obj) {
            m48792a((List) obj);
        }

        /* renamed from: a */
        public final void m48792a(List<Bitmap> list) {
            Bitmap bitmap = (Bitmap) list.get(0);
            Bitmap bitmap2 = (Bitmap) list.get(1);
            if (bitmap != null) {
                MapboxMap a = this.f40009a.f45060k;
                if (a != null) {
                    a.addImage(this.f40009a.m53949a(this.f40010b.a(), false), bitmap);
                }
            }
            if (bitmap2 != null) {
                MapboxMap a2 = this.f40009a.f45060k;
                if (a2 != null) {
                    a2.addImage(this.f40009a.m53949a(this.f40010b.a(), true), bitmap2);
                }
            }
            this.f40011c.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$d */
    static final class C12385d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12385d f40012a = new C12385d();

        C12385d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48793a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48793a(Throwable th) {
            C0001a.c(th, "Could not add bitmaps", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/mapboxsdk/camera/CameraPosition;", "it", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "getCameraPosition"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$f */
    static final class C12386f implements CameraUpdate {
        /* renamed from: a */
        final /* synthetic */ CameraPosition f40013a;

        C12386f(CameraPosition cameraPosition) {
            this.f40013a = cameraPosition;
        }

        @NotNull
        public final CameraPosition getCameraPosition(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "it");
            return this.f40013a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/mapboxsdk/camera/CameraPosition;", "it", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "getCameraPosition"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$g */
    static final class C12387g implements CameraUpdate {
        /* renamed from: a */
        final /* synthetic */ CameraPosition f40014a;

        C12387g(CameraPosition cameraPosition) {
            this.f40014a = cameraPosition;
        }

        @NotNull
        public final CameraPosition getCameraPosition(@NotNull MapboxMap mapboxMap) {
            C2668g.b(mapboxMap, "it");
            return this.f40014a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/tinder/places/map/view/PlacesMapFragment$moveCamera$cameraCallback$1", "Lcom/mapbox/mapboxsdk/maps/MapboxMap$CancelableCallback;", "(Lcom/tinder/places/map/view/PlacesMapFragment;)V", "onCancel", "", "onFinish", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$h */
    public static final class C12388h implements CancelableCallback {
        /* renamed from: a */
        final /* synthetic */ C14217c f40015a;

        public void onCancel() {
        }

        C12388h(C14217c c14217c) {
            this.f40015a = c14217c;
        }

        public void onFinish() {
            this.f40015a.m53972b().m41616d();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "onMapClick", "com/tinder/places/map/view/PlacesMapFragment$onStyleLoaded$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$i */
    static final class C12389i implements OnMapClickListener {
        /* renamed from: a */
        final /* synthetic */ MapboxMap f40016a;
        /* renamed from: b */
        final /* synthetic */ C14217c f40017b;

        C12389i(MapboxMap mapboxMap, C14217c c14217c) {
            this.f40016a = mapboxMap;
            this.f40017b = c14217c;
        }

        public final void onMapClick(@NotNull LatLng latLng) {
            C2668g.b(latLng, "it");
            C14217c.m53957a(this.f40017b, this.f40016a, latLng, null, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "map", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "kotlin.jvm.PlatformType", "onMapReady"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.map.view.c$j */
    static final class C12390j implements OnMapReadyCallback {
        /* renamed from: a */
        final /* synthetic */ C14217c f40018a;

        C12390j(C14217c c14217c) {
            this.f40018a = c14217c;
        }

        public final void onMapReady(MapboxMap mapboxMap) {
            this.f40018a.f45060k = mapboxMap;
            mapboxMap.setStyle("mapbox://styles/tindermaps/cjeolfzgz42ng2sqcbi0bt9xn", this.f40018a);
        }
    }

    /* renamed from: c */
    public void m53973c() {
        if (this.f45062m != null) {
            this.f45062m.clear();
        }
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ GeoJsonSource m53964b(C14217c c14217c) {
        c14217c = c14217c.f45058i;
        if (c14217c == null) {
            C2668g.b("source");
        }
        return c14217c;
    }

    @NotNull
    /* renamed from: a */
    public final FeatureCollection m53971a() {
        FeatureCollection featureCollection = this.f45051a;
        if (featureCollection == null) {
            C2668g.b("featureCollection");
        }
        return featureCollection;
    }

    @NotNull
    /* renamed from: b */
    public final C10229a m53972b() {
        C10229a c10229a = this.f45052b;
        if (c10229a == null) {
            C2668g.b("presenter");
        }
        return c10229a;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getActivity();
        if (bundle == null) {
            C2668g.a();
        }
        C2668g.a(bundle, "activity!!");
        Mapbox.getInstance(bundle.getApplicationContext(), "pk.eyJ1IjoidGluZGVybWFwcyIsImEiOiJjamVvbDEwN2U1anZ0MnZsbmg2d3BheGhjIn0.EGDbz_oMaARb1aRDXrGNVg");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        C2668g.b(view, "view");
        super.onViewCreated(view, bundle);
        bundle = getActivity();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.places.injection.PlacesComponentProvider");
        }
        ((PlacesComponentProvider) bundle).getPlacesComponent().inject(this);
        bundle = this.f45052b;
        if (bundle == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, bundle);
        bundle = FeatureCollection.fromFeatures((List) new ArrayList());
        C2668g.a(bundle, "FeatureCollection.fromFeatures(mutableListOf())");
        this.f45051a = bundle;
        bundle = FeatureCollection.fromFeatures((List) new ArrayList());
        C2668g.a(bundle, "FeatureCollection.fromFeatures(mutableListOf())");
        this.f45057h = bundle;
        String str = "sourceId";
        FeatureCollection featureCollection = this.f45051a;
        if (featureCollection == null) {
            C2668g.b("featureCollection");
        }
        this.f45058i = new GeoJsonSource(str, featureCollection);
        str = "selectedSourceId";
        featureCollection = this.f45057h;
        if (featureCollection == null) {
            C2668g.b("selectedCollection");
        }
        this.f45059j = new GeoJsonSource(str, featureCollection);
        getMapAsync((OnMapReadyCallback) new C12390j(this));
        m53950a(view);
    }

    public void onDestroyView() {
        this.f45061l.a();
        m53969f();
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            mapboxMap.clear();
        }
        Deadshot.drop(this);
        super.onDestroyView();
        m53973c();
    }

    public void onLowMemory() {
        try {
            super.onLowMemory();
        } catch (NullPointerException e) {
            C0001a.c(e, "NullPointerException in onLowMemory", new Object[0]);
        }
    }

    public void setInitialMapCoords(double d, double d2) {
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            CameraPosition build = C10242d.f33357a.zoom(0.0d).target(new LatLng(d, d2)).build();
            C2668g.a(build, "cameraPosition");
            C14217c.m53956a(this, mapboxMap, build, false, 4, null);
        }
    }

    public void addPin(@NotNull C14351c c14351c) {
        C2668g.b(c14351c, "pin");
        if (this.f45060k != null) {
            m53959a(c14351c, (Function1) new PlacesMapFragment$addPin$$inlined$let$lambda$1(this, c14351c));
        }
    }

    public void removePin(@NotNull String str) {
        C2668g.b(str, "placeId");
        GeoJsonSource geoJsonSource = this.f45058i;
        if (geoJsonSource == null) {
            C2668g.b("source");
        }
        FeatureCollection featureCollection = this.f45051a;
        if (featureCollection == null) {
            C2668g.b("featureCollection");
        }
        m53960a(str, geoJsonSource, featureCollection);
        geoJsonSource = this.f45059j;
        if (geoJsonSource == null) {
            C2668g.b("selectedSource");
        }
        featureCollection = this.f45057h;
        if (featureCollection == null) {
            C2668g.b("selectedCollection");
        }
        m53960a(str, geoJsonSource, featureCollection);
        this.f45056g.remove(str);
        this.f45055f.remove(str);
    }

    public void zoomOnPlace(@NotNull String str, boolean z) {
        C2668g.b(str, "placeId");
        m53969f();
        m53967d();
        m53970g();
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            FeatureCollection featureCollection = this.f45057h;
            if (featureCollection == null) {
                C2668g.b("selectedCollection");
            }
            List features = featureCollection.features();
            Feature feature = null;
            if (features != null) {
                Object obj;
                for (Object next : features) {
                    if (C2668g.a(((Feature) next).getStringProperty("placeId"), str)) {
                        obj = next;
                        break;
                    }
                }
                feature = (Feature) obj;
            }
            Feature a = m53946a(str);
            if (feature != null) {
                a = feature;
            }
            if (a != null) {
                Geometry geometry = a.geometry();
                if (geometry == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.mapbox.geojson.Point");
                }
                double latitude = ((Point) geometry).latitude();
                Geometry geometry2 = a.geometry();
                if (geometry2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.mapbox.geojson.Point");
                }
                CameraPosition build = C10242d.f33357a.target(new LatLng(latitude, ((Point) geometry2).longitude())).zoom(14.9d).build();
                C10229a c10229a = this.f45052b;
                if (c10229a == null) {
                    C2668g.b("presenter");
                }
                c10229a.m41613b(str);
                C2668g.a(build, "cameraPosition");
                m53952a(mapboxMap, build, z);
            }
        }
    }

    public void enableMapInteraction() {
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            UiSettings uiSettings = mapboxMap.getUiSettings();
            uiSettings.setScrollGesturesEnabled(true);
            uiSettings.setZoomGesturesEnabled(true);
            uiSettings.setDoubleTapGesturesEnabled(true);
        }
    }

    public void onCameraMoveStarted(int i) {
        C10229a c10229a = this.f45052b;
        if (c10229a == null) {
            C2668g.b("presenter");
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c10229a.m41611a(z);
    }

    public void onCameraIdle() {
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            C10229a c10229a = this.f45052b;
            if (c10229a == null) {
                C2668g.b("presenter");
            }
            c10229a.m41608a(mapboxMap.getCameraPosition().zoom);
        }
    }

    public void onStyleLoaded(@Nullable String str) {
        if (C2668g.a(str, "mapbox://styles/tindermaps/cjeolfzgz42ng2sqcbi0bt9xn") != null) {
            MapboxMap mapboxMap = this.f45060k;
            if (mapboxMap != null) {
                m53951a(mapboxMap);
                C10235a.f33348a.m41623a(mapboxMap);
                C10235a.f33348a.m41625b(mapboxMap);
                mapboxMap.addOnMapClickListener(new C12389i(mapboxMap, this));
                C10234a c10234a = C10235a.f33348a;
                GeoJsonSource geoJsonSource = this.f45059j;
                if (geoJsonSource == null) {
                    C2668g.b("selectedSource");
                }
                c10234a.m41624a(mapboxMap, geoJsonSource);
                C10235a.f33348a.m41626c(mapboxMap);
                str = this.f45052b;
                if (str == null) {
                    C2668g.b("presenter");
                }
                str.m41612b();
            }
        }
    }

    public void activatePin(@NotNull String str) {
        C2668g.b(str, "placeId");
        m53968e();
        FeatureCollection featureCollection = this.f45051a;
        if (featureCollection == null) {
            C2668g.b("featureCollection");
        }
        List<Feature> features = featureCollection.features();
        if (features != null) {
            for (Feature feature : features) {
                if (C2668g.a(feature.getStringProperty("placeId"), str)) {
                    feature.addBooleanProperty("colored", Boolean.valueOf(true));
                    feature.addBooleanProperty("activated", Boolean.valueOf(true));
                }
            }
        }
        str = this.f45058i;
        if (str == null) {
            C2668g.b("source");
        }
        featureCollection = this.f45051a;
        if (featureCollection == null) {
            C2668g.b("featureCollection");
        }
        str.setGeoJson(featureCollection);
    }

    public void raisePinAfterDelay() {
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            SymbolLayer e = C10235a.f33348a.m41628e(mapboxMap);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-9.0f, -12.0f});
            C2668g.a(ofFloat, "animator");
            ofFloat.setStartDelay((long) 500);
            ofFloat.addUpdateListener(new C10239k(e));
            this.f45053d.add(ofFloat);
            ofFloat.start();
        }
    }

    public void animatePinsFromTop() {
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            SymbolLayer d = C10235a.f33348a.m41627d(mapboxMap);
            SymbolLayer e = C10235a.f33348a.m41628e(mapboxMap);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-100.0f, -9.0f});
            ofFloat.addUpdateListener(new C10238e(new Float[2], d, e));
            Set set = this.f45053d;
            C2668g.a(ofFloat, "animator");
            set.add(ofFloat);
            ofFloat.start();
        }
    }

    public void activateRadar(@NotNull String str) {
        C2668g.b(str, "placeId");
        str = m53946a(str);
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null && str != null) {
            str = str.getNumberProperty("radarColor");
            List f = C10235a.f33348a.m41629f(mapboxMap);
            CircleLayer circleLayer = (CircleLayer) f.get(0);
            CircleLayer circleLayer2 = (CircleLayer) f.get(1);
            if (circleLayer != null) {
                circleLayer.setProperties(new PropertyValue[]{PropertyFactory.circleColor(str.intValue())});
                if (circleLayer2 != null) {
                    circleLayer2.setProperties(new PropertyValue[]{PropertyFactory.circleColor(str.intValue())});
                    m53954a(circleLayer, circleLayer2);
                }
            }
        }
    }

    public void showPins() {
        m53961a(true);
    }

    public void hidePins() {
        m53961a(false);
    }

    /* renamed from: a */
    private final void m53961a(boolean z) {
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            z = z ? Property.VISIBLE : "none";
            SymbolLayer d = C10235a.f33348a.m41627d(mapboxMap);
            SymbolLayer e = C10235a.f33348a.m41628e(mapboxMap);
            d.setProperties(new PropertyValue[]{PropertyFactory.visibility(z)});
            e.setProperties(new PropertyValue[]{PropertyFactory.visibility(z)});
        }
    }

    /* renamed from: d */
    private final void m53967d() {
        MapboxMap mapboxMap = this.f45060k;
        if (mapboxMap != null) {
            SymbolLayer e = C10235a.f33348a.m41628e(mapboxMap);
            PropertyValue[] propertyValueArr = new PropertyValue[1];
            propertyValueArr[0] = PropertyFactory.iconOffset(new Float[]{Float.valueOf(0.0f), Float.valueOf(-9.0f)});
            e.setProperties(propertyValueArr);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m53956a(C14217c c14217c, MapboxMap mapboxMap, CameraPosition cameraPosition, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c14217c.m53952a(mapboxMap, cameraPosition, z);
    }

    /* renamed from: a */
    private final void m53952a(MapboxMap mapboxMap, CameraPosition cameraPosition, boolean z) {
        C10229a c10229a = this.f45052b;
        if (c10229a == null) {
            C2668g.b("presenter");
        }
        c10229a.m41609a(Double.valueOf(cameraPosition.zoom));
        C12388h c12388h = new C12388h(this);
        if (z) {
            mapboxMap.animateCamera((CameraUpdate) new C12387g(cameraPosition), AdError.NETWORK_ERROR_CODE, c12388h);
        } else {
            mapboxMap.moveCamera((CameraUpdate) new C12386f(cameraPosition), c12388h);
        }
    }

    /* renamed from: a */
    private final void m53959a(C14351c c14351c, Function1<? super Feature, C15813i> function1) {
        LatLng e = c14351c.e();
        if (e == null) {
            C2668g.a();
        }
        double longitude = e.getLongitude();
        LatLng e2 = c14351c.e();
        if (e2 == null) {
            C2668g.a();
        }
        m53958a(c14351c, (Function0) new PlacesMapFragment$getFeatureForPlace$1(this, Feature.fromGeometry(Point.fromLngLat(longitude, e2.getLatitude()), new JsonObject(), c14351c.a()), c14351c, function1));
    }

    /* renamed from: a */
    private final Bitmap m53944a(C14351c c14351c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(c14351c.d());
        stringBuilder.append("");
        stringBuilder.append(c14351c.c());
        String stringBuilder2 = stringBuilder.toString();
        Bitmap bitmap = (Bitmap) this.f45056g.get(stringBuilder2);
        return bitmap != null ? bitmap : (Bitmap) new PlacesMapFragment$createOrGetUnselectedPinView$1(this, c14351c, stringBuilder2).invoke();
    }

    /* renamed from: b */
    private final Bitmap m53963b(C14351c c14351c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(c14351c.d());
        stringBuilder.append("");
        stringBuilder.append(c14351c.c());
        String stringBuilder2 = stringBuilder.toString();
        Bitmap bitmap = (Bitmap) this.f45055f.get(stringBuilder2);
        return bitmap != null ? bitmap : (Bitmap) new PlacesMapFragment$createOrGetSelectedPinView$1(this, c14351c, stringBuilder2).invoke();
    }

    /* renamed from: a */
    private final void m53954a(CircleLayer circleLayer, CircleLayer circleLayer2) {
        circleLayer.setProperties(new PropertyValue[]{PropertyFactory.circleOpacity(Float.valueOf(1.0f))});
        circleLayer.setProperties(new PropertyValue[]{PropertyFactory.circleRadius(Float.valueOf(1.6f))});
        circleLayer2.setProperties(new PropertyValue[]{PropertyFactory.circleOpacity(Float.valueOf(1.0f))});
        circleLayer2.setProperties(new PropertyValue[]{PropertyFactory.circleRadius(Float.valueOf(1.6f))});
        C10246f c10246f = new C10246f(circleLayer, this.f45054e, 0, 4, null);
        circleLayer = new C10246f(circleLayer2, this.f45054e, DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
        c10246f.m41633a();
        circleLayer.m41633a();
    }

    /* renamed from: a */
    private final void m53960a(String str, GeoJsonSource geoJsonSource, FeatureCollection featureCollection) {
        C14217c c14217c = this;
        List<Feature> features = featureCollection.features();
        if (features != null) {
            for (Feature feature : features) {
                if (C2668g.a(feature.getStringProperty("placeId"), str)) {
                    str = featureCollection.features();
                    if (str != null) {
                        str.remove(feature);
                    }
                }
            }
        }
        geoJsonSource.setGeoJson(featureCollection);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    private final void m53968e() {
        /*
        r7 = this;
        r0 = r7.f45051a;
        if (r0 != 0) goto L_0x0009;
    L_0x0004:
        r1 = "featureCollection";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x0009:
        r0 = r0.features();
        if (r0 == 0) goto L_0x007a;
    L_0x000f:
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
    L_0x001c:
        r2 = r0.hasNext();
        r3 = 0;
        if (r2 == 0) goto L_0x0053;
    L_0x0023:
        r2 = r0.next();
        r4 = r2;
        r4 = (com.mapbox.geojson.Feature) r4;
        r5 = "colored";
        r5 = r4.getBooleanProperty(r5);
        r6 = "it.getBooleanProperty(COLORED_KEY)";
        kotlin.jvm.internal.C2668g.a(r5, r6);
        r5 = r5.booleanValue();
        if (r5 != 0) goto L_0x004c;
    L_0x003b:
        r5 = "activated";
        r4 = r4.getBooleanProperty(r5);
        r5 = "it.getBooleanProperty(ACTIVATED_KEY)";
        kotlin.jvm.internal.C2668g.a(r4, r5);
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x004d;
    L_0x004c:
        r3 = 1;
    L_0x004d:
        if (r3 == 0) goto L_0x001c;
    L_0x004f:
        r1.add(r2);
        goto L_0x001c;
    L_0x0053:
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = r1.iterator();
    L_0x005b:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x007a;
    L_0x0061:
        r1 = r0.next();
        r1 = (com.mapbox.geojson.Feature) r1;
        r2 = "colored";
        r4 = java.lang.Boolean.valueOf(r3);
        r1.addBooleanProperty(r2, r4);
        r2 = "activated";
        r4 = java.lang.Boolean.valueOf(r3);
        r1.addBooleanProperty(r2, r4);
        goto L_0x005b;
    L_0x007a:
        r0 = r7.f45058i;
        if (r0 != 0) goto L_0x0083;
    L_0x007e:
        r1 = "source";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x0083:
        r1 = r7.f45051a;
        if (r1 != 0) goto L_0x008c;
    L_0x0087:
        r2 = "featureCollection";
        kotlin.jvm.internal.C2668g.b(r2);
    L_0x008c:
        r0.setGeoJson(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.places.map.view.c.e():void");
    }

    /* renamed from: a */
    static /* synthetic */ void m53957a(C14217c c14217c, MapboxMap mapboxMap, LatLng latLng, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c14217c.m53953a(mapboxMap, latLng, str);
    }

    /* renamed from: a */
    private final void m53953a(MapboxMap mapboxMap, LatLng latLng, String str) {
        str = m53946a(str);
        if (str == null) {
            str = m53945a(mapboxMap, latLng);
        }
        if (str != null) {
            m53970g();
            String stringProperty = str.getStringProperty("placeId");
            latLng = this.f45052b;
            if (latLng == null) {
                C2668g.b("presenter");
            }
            C2668g.a(stringProperty, "placeId");
            latLng.m41610a(stringProperty);
        }
    }

    /* renamed from: a */
    private final Feature m53945a(MapboxMap mapboxMap, LatLng latLng) {
        mapboxMap = mapboxMap.queryRenderedFeatures(mapboxMap.getProjection().toScreenLocation(latLng), new String[]{"pinLayer"});
        C2668g.a(mapboxMap, "features");
        return (((Collection) mapboxMap).isEmpty() ^ 1) != null ? (Feature) mapboxMap.get(null) : null;
    }

    /* renamed from: a */
    private final Feature m53946a(String str) {
        FeatureCollection featureCollection = this.f45051a;
        if (featureCollection == null) {
            C2668g.b("featureCollection");
        }
        List features = featureCollection.features();
        Feature feature = null;
        if (features == null) {
            return null;
        }
        for (Feature next : features) {
            if (C2668g.a(next.getStringProperty("placeId"), str)) {
                feature = next;
                break;
            }
        }
        return feature;
    }

    /* renamed from: a */
    private final void m53951a(MapboxMap mapboxMap) {
        mapboxMap.setPadding(0, 0, 0, C18450a.a(getResources().getDimension(R.dimen.place_card_pager_height)));
        UiSettings uiSettings = mapboxMap.getUiSettings();
        uiSettings.setAttributionEnabled(false);
        uiSettings.setCompassEnabled(false);
        uiSettings.setLogoEnabled(false);
        uiSettings.setDeselectMarkersOnTap(false);
        uiSettings.setScrollGesturesEnabled(false);
        uiSettings.setZoomGesturesEnabled(false);
        uiSettings.setTiltGesturesEnabled(false);
        uiSettings.setRotateGesturesEnabled(false);
        uiSettings.setDoubleTapGesturesEnabled(false);
        mapboxMap.addOnCameraMoveStartedListener(this);
        mapboxMap.addOnCameraIdleListener(this);
        GeoJsonSource geoJsonSource = this.f45058i;
        if (geoJsonSource == null) {
            C2668g.b("source");
        }
        mapboxMap.addSource(geoJsonSource);
    }

    /* renamed from: f */
    private final void m53969f() {
        for (ValueAnimator valueAnimator : this.f45053d) {
            valueAnimator.end();
            C8299a.m35391a(valueAnimator);
        }
        this.f45053d.clear();
        m53970g();
    }

    /* renamed from: g */
    private final void m53970g() {
        for (AnimatorSet animatorSet : this.f45054e.values()) {
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        }
        this.f45054e.clear();
    }

    /* renamed from: a */
    private final void m53958a(C14351c c14351c, Function0<C15813i> function0) {
        this.f45061l.add(C3959e.fromCallable(new C10237b(this, c14351c)).subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C12384c(this, c14351c, function0), (Consumer) C12385d.f40012a));
    }

    /* renamed from: a */
    private final String m53949a(String str, boolean z) {
        if (z) {
            z = new StringBuilder();
            z.append("");
            z.append(str);
            z.append('u');
            return z.toString();
        }
        z = new StringBuilder();
        z.append("");
        z.append(str);
        z.append('a');
        return z.toString();
    }

    /* renamed from: a */
    private final void m53950a(View view) {
        view.setOnTouchListener(new C10240l(new C0592b(getContext(), new C10241m(this))));
    }
}
