package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLSurfaceView;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.util.C0550f;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ZoomButtonsController;
import android.widget.ZoomButtonsController.OnZoomListener;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.telemetry.AppUserTurnstile;
import com.mapbox.android.telemetry.Event.Type;
import com.mapbox.android.telemetry.MapEventFactory;
import com.mapbox.mapboxsdk.BuildConfig;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCompassAnimationListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFlingListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapLongClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMoveListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnRotateListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnScaleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnScrollListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnShoveListener;
import com.mapbox.mapboxsdk.maps.NativeMapView.ViewCallback;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.glsurfaceview.GLSurfaceViewMapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.textureview.TextureViewMapRenderer;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MapView extends FrameLayout implements ViewCallback {
    public static final int DID_FAIL_LOADING_MAP = 7;
    public static final int DID_FINISH_LOADING_MAP = 6;
    public static final int DID_FINISH_LOADING_STYLE = 14;
    public static final int DID_FINISH_RENDERING_FRAME = 9;
    public static final int DID_FINISH_RENDERING_FRAME_FULLY_RENDERED = 10;
    public static final int DID_FINISH_RENDERING_MAP = 12;
    public static final int DID_FINISH_RENDERING_MAP_FULLY_RENDERED = 13;
    public static final int REGION_DID_CHANGE = 3;
    public static final int REGION_DID_CHANGE_ANIMATED = 4;
    public static final int REGION_IS_CHANGING = 2;
    public static final int REGION_WILL_CHANGE = 0;
    public static final int REGION_WILL_CHANGE_ANIMATED = 1;
    public static final int SOURCE_DID_CHANGE = 15;
    public static final int WILL_START_LOADING_MAP = 5;
    public static final int WILL_START_RENDERING_FRAME = 8;
    public static final int WILL_START_RENDERING_MAP = 11;
    private ImageView attrView;
    private CompassView compassView;
    private boolean destroyed;
    private PointF focalPoint;
    private boolean hasSurface;
    private ImageView logoView;
    private final MapCallback mapCallback = new MapCallback();
    private MapGestureDetector mapGestureDetector;
    private MapKeyListener mapKeyListener;
    private MapRenderer mapRenderer;
    private MapZoomButtonController mapZoomButtonController;
    private MapboxMap mapboxMap;
    private MapboxMapOptions mapboxMapOptions;
    private NativeMapView nativeMapView;
    private final CopyOnWriteArrayList<OnMapChangedListener> onMapChangedListeners = new CopyOnWriteArrayList();
    private Bundle savedInstanceState;

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$7 */
    class C58417 implements Runnable {
        C58417() {
        }

        public void run() {
            if (!MapView.this.destroyed && MapView.this.mapboxMap == null) {
                MapView.this.initialiseMap();
                MapView.this.mapboxMap.onStart();
            }
        }
    }

    private static class AttributionClickListener implements OnClickListener {
        private final AttributionDialogManager defaultDialogManager;
        private UiSettings uiSettings;

        private AttributionClickListener(Context context, MapboxMap mapboxMap) {
            this.defaultDialogManager = new AttributionDialogManager(context, mapboxMap);
            this.uiSettings = mapboxMap.getUiSettings();
        }

        public void onClick(View view) {
            if (this.uiSettings.getAttributionDialogManager() != null) {
                this.uiSettings.getAttributionDialogManager().onClick(view);
            } else {
                this.defaultDialogManager.onClick(view);
            }
        }
    }

    private static class MapViewLayoutListener implements OnGlobalLayoutListener {
        private WeakReference<MapView> mapViewWeakReference;
        private MapboxMapOptions options;

        MapViewLayoutListener(MapView mapView, MapboxMapOptions mapboxMapOptions) {
            this.mapViewWeakReference = new WeakReference(mapView);
            this.options = mapboxMapOptions;
        }

        public void onGlobalLayout() {
            MapView mapView = (MapView) this.mapViewWeakReference.get();
            if (mapView != null) {
                if (VERSION.SDK_INT >= 16) {
                    mapView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    mapView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                mapView.initialiseDrawingSurface(this.options);
            }
        }
    }

    private static class MapZoomControllerListener implements OnZoomListener {
        private final CameraChangeDispatcher cameraChangeDispatcher;
        private final MapGestureDetector mapGestureDetector;
        private final float mapHeight;
        private final float mapWidth;

        public void onVisibilityChanged(boolean z) {
        }

        MapZoomControllerListener(MapGestureDetector mapGestureDetector, CameraChangeDispatcher cameraChangeDispatcher, float f, float f2) {
            this.mapGestureDetector = mapGestureDetector;
            this.cameraChangeDispatcher = cameraChangeDispatcher;
            this.mapWidth = f;
            this.mapHeight = f2;
        }

        public void onZoom(boolean z) {
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            onZoom(z, this.mapGestureDetector.getFocalPoint());
        }

        private void onZoom(boolean z, @Nullable PointF pointF) {
            if (pointF == null) {
                pointF = new PointF(this.mapWidth / 2.0f, this.mapHeight / 2.0f);
            }
            if (z) {
                this.mapGestureDetector.zoomInAnimated(pointF, true);
            } else {
                this.mapGestureDetector.zoomOutAnimated(pointF, true);
            }
        }
    }

    public interface OnMapChangedListener {
        void onMapChanged(int i);
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$1 */
    class C70961 implements FocalPointChangeListener {
        C70961() {
        }

        public void onFocalPointChanged(PointF pointF) {
            MapView.this.focalPoint = pointF;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$6 */
    class C70986 implements OnMapChangedListener {
        C70986() {
        }

        public void onMapChanged(int i) {
            if (!MapView.this.onMapChangedListeners.isEmpty()) {
                Iterator it = MapView.this.onMapChangedListeners.iterator();
                while (it.hasNext()) {
                    ((OnMapChangedListener) it.next()).onMapChanged(i);
                }
            }
        }
    }

    private class FocalPointInvalidator implements FocalPointChangeListener {
        private final List<FocalPointChangeListener> focalPointChangeListeners;

        private FocalPointInvalidator() {
            this.focalPointChangeListeners = new ArrayList();
        }

        void addListener(FocalPointChangeListener focalPointChangeListener) {
            this.focalPointChangeListeners.add(focalPointChangeListener);
        }

        public void onFocalPointChanged(PointF pointF) {
            MapView.this.mapGestureDetector.setFocalPoint(pointF);
            for (FocalPointChangeListener onFocalPointChanged : this.focalPointChangeListeners) {
                onFocalPointChanged.onFocalPointChanged(pointF);
            }
        }
    }

    private class GesturesManagerInteractionListener implements OnGesturesManagerInteractionListener {
        private GesturesManagerInteractionListener() {
        }

        public void onSetMapClickListener(OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.setOnMapClickListener(onMapClickListener);
        }

        public void onAddMapClickListener(OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.addOnMapClickListener(onMapClickListener);
        }

        public void onRemoveMapClickListener(OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.removeOnMapClickListener(onMapClickListener);
        }

        public void onSetMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.setOnMapLongClickListener(onMapLongClickListener);
        }

        public void onAddMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.addOnMapLongClickListener(onMapLongClickListener);
        }

        public void onRemoveMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.removeOnMapLongClickListener(onMapLongClickListener);
        }

        public void onSetScrollListener(OnScrollListener onScrollListener) {
            MapView.this.mapGestureDetector.setOnScrollListener(onScrollListener);
        }

        public void onAddScrollListener(OnScrollListener onScrollListener) {
            MapView.this.mapGestureDetector.addOnScrollListener(onScrollListener);
        }

        public void onRemoveScrollListener(OnScrollListener onScrollListener) {
            MapView.this.mapGestureDetector.removeOnScrollListener(onScrollListener);
        }

        public void onSetFlingListener(OnFlingListener onFlingListener) {
            MapView.this.mapGestureDetector.setOnFlingListener(onFlingListener);
        }

        public void onAddFlingListener(OnFlingListener onFlingListener) {
            MapView.this.mapGestureDetector.addOnFlingListener(onFlingListener);
        }

        public void onRemoveFlingListener(OnFlingListener onFlingListener) {
            MapView.this.mapGestureDetector.removeOnFlingListener(onFlingListener);
        }

        public void onAddMoveListener(OnMoveListener onMoveListener) {
            MapView.this.mapGestureDetector.addOnMoveListener(onMoveListener);
        }

        public void onRemoveMoveListener(OnMoveListener onMoveListener) {
            MapView.this.mapGestureDetector.removeOnMoveListener(onMoveListener);
        }

        public void onAddRotateListener(OnRotateListener onRotateListener) {
            MapView.this.mapGestureDetector.addOnRotateListener(onRotateListener);
        }

        public void onRemoveRotateListener(OnRotateListener onRotateListener) {
            MapView.this.mapGestureDetector.removeOnRotateListener(onRotateListener);
        }

        public void onAddScaleListener(OnScaleListener onScaleListener) {
            MapView.this.mapGestureDetector.addOnScaleListener(onScaleListener);
        }

        public void onRemoveScaleListener(OnScaleListener onScaleListener) {
            MapView.this.mapGestureDetector.removeOnScaleListener(onScaleListener);
        }

        public void onAddShoveListener(OnShoveListener onShoveListener) {
            MapView.this.mapGestureDetector.addShoveListener(onShoveListener);
        }

        public void onRemoveShoveListener(OnShoveListener onShoveListener) {
            MapView.this.mapGestureDetector.removeShoveListener(onShoveListener);
        }

        public AndroidGesturesManager getGesturesManager() {
            return MapView.this.mapGestureDetector.getGesturesManager();
        }

        public void setGesturesManager(AndroidGesturesManager androidGesturesManager, boolean z, boolean z2) {
            MapView.this.mapGestureDetector.setGesturesManager(MapView.this.getContext(), androidGesturesManager, z, z2);
        }

        public void cancelAllVelocityAnimations() {
            MapView.this.mapGestureDetector.cancelAnimators();
        }
    }

    private static class MapCallback implements OnMapChangedListener {
        private boolean initialLoad;
        private MapboxMap mapboxMap;
        private final List<OnMapReadyCallback> onMapReadyCallbackList;

        private MapCallback() {
            this.onMapReadyCallbackList = new ArrayList();
            this.initialLoad = true;
        }

        void attachMapboxMap(MapboxMap mapboxMap) {
            this.mapboxMap = mapboxMap;
        }

        public void onMapChanged(int i) {
            if (i == 14 && this.initialLoad) {
                this.initialLoad = false;
                this.mapboxMap.onPreMapReady();
                onMapReady();
                this.mapboxMap.onPostMapReady();
                return;
            }
            if (i != 9) {
                if (i != 10) {
                    if (i == 2 || i == 3 || i == 6) {
                        this.mapboxMap.onUpdateRegionChange();
                        return;
                    }
                    return;
                }
            }
            this.mapboxMap.onUpdateFullyRendered();
        }

        private void onMapReady() {
            if (this.onMapReadyCallbackList.size() > 0) {
                Iterator it = this.onMapReadyCallbackList.iterator();
                while (it.hasNext()) {
                    ((OnMapReadyCallback) it.next()).onMapReady(this.mapboxMap);
                    it.remove();
                }
            }
        }

        boolean isInitialLoad() {
            return this.initialLoad;
        }

        void addOnMapReadyCallback(OnMapReadyCallback onMapReadyCallback) {
            this.onMapReadyCallbackList.add(onMapReadyCallback);
        }

        void clearOnMapReadyCallbacks() {
            this.onMapReadyCallbackList.clear();
        }
    }

    @UiThread
    public MapView(@NonNull Context context) {
        super(context);
        initialize(context, MapboxMapOptions.createFromAttributes(context, null));
    }

    @UiThread
    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, MapboxMapOptions.createFromAttributes(context, attributeSet));
    }

    @UiThread
    public MapView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, MapboxMapOptions.createFromAttributes(context, attributeSet));
    }

    @UiThread
    public MapView(@NonNull Context context, @Nullable MapboxMapOptions mapboxMapOptions) {
        super(context);
        if (mapboxMapOptions == null) {
            mapboxMapOptions = MapboxMapOptions.createFromAttributes(context, null);
        }
        initialize(context, mapboxMapOptions);
    }

    @UiThread
    @CallSuper
    protected void initialize(@NonNull Context context, @NonNull MapboxMapOptions mapboxMapOptions) {
        if (!isInEditMode()) {
            this.mapboxMapOptions = mapboxMapOptions;
            View inflate = LayoutInflater.from(context).inflate(C5812R.layout.mapbox_mapview_internal, this);
            this.compassView = (CompassView) inflate.findViewById(C5812R.id.compassView);
            this.attrView = (ImageView) inflate.findViewById(C5812R.id.attributionView);
            this.logoView = (ImageView) inflate.findViewById(C5812R.id.logoView);
            setContentDescription(context.getString(C5812R.string.mapbox_mapActionDescription));
            setWillNotDraw(null);
            getViewTreeObserver().addOnGlobalLayoutListener(new MapViewLayoutListener(this, mapboxMapOptions));
        }
    }

    private void initialiseMap() {
        Context context = getContext();
        this.nativeMapView.addOnMapChangedListener(this.mapCallback);
        FocalPointChangeListener focalPointInvalidator = new FocalPointInvalidator();
        focalPointInvalidator.addListener(createFocalPointChangeListener());
        GesturesManagerInteractionListener gesturesManagerInteractionListener = new GesturesManagerInteractionListener();
        CameraChangeDispatcher cameraChangeDispatcher = new CameraChangeDispatcher();
        Projection projection = new Projection(this.nativeMapView);
        UiSettings uiSettings = new UiSettings(projection, focalPointInvalidator, this.compassView, this.attrView, this.logoView);
        C0550f c0550f = new C0550f();
        MarkerViewManager markerViewManager = new MarkerViewManager((ViewGroup) findViewById(C5812R.id.markerViewContainer));
        IconManager iconManager = new IconManager(this.nativeMapView);
        AnnotationContainer annotationContainer = new AnnotationContainer(this.nativeMapView, c0550f);
        MarkerContainer markerContainer = new MarkerContainer(this.nativeMapView, this, c0550f, iconManager, markerViewManager);
        PolygonContainer polygonContainer = new PolygonContainer(this.nativeMapView, c0550f);
        PolylineContainer polylineContainer = new PolylineContainer(this.nativeMapView, c0550f);
        AnnotationManager annotationManager = r0;
        PolylineContainer polylineContainer2 = polylineContainer;
        PolygonContainer polygonContainer2 = polygonContainer;
        UiSettings uiSettings2 = uiSettings;
        Projection projection2 = projection;
        AnnotationManager annotationManager2 = new AnnotationManager(this.nativeMapView, this, c0550f, markerViewManager, iconManager, annotationContainer, markerContainer, polygonContainer2, polylineContainer2, new ShapeAnnotationContainer(this.nativeMapView, c0550f));
        Transform transform = new Transform(this.nativeMapView, annotationManager.getMarkerViewManager(), cameraChangeDispatcher);
        CameraChangeDispatcher cameraChangeDispatcher2 = cameraChangeDispatcher;
        this.mapboxMap = new MapboxMap(this.nativeMapView, transform, uiSettings2, projection2, gesturesManagerInteractionListener, annotationManager, cameraChangeDispatcher2);
        this.mapCallback.attachMapboxMap(this.mapboxMap);
        this.mapGestureDetector = new MapGestureDetector(context, transform, projection2, uiSettings2, annotationManager, cameraChangeDispatcher2);
        uiSettings = uiSettings2;
        this.mapKeyListener = new MapKeyListener(transform, uiSettings, this.mapGestureDetector);
        this.mapZoomButtonController = new MapZoomButtonController(new ZoomButtonsController(this));
        this.mapZoomButtonController.bind(uiSettings, new MapZoomControllerListener(this.mapGestureDetector, cameraChangeDispatcher2, (float) getWidth(), (float) getHeight()));
        this.compassView.injectCompassAnimationListener(createCompassAnimationListener(cameraChangeDispatcher2));
        this.compassView.setOnClickListener(createCompassClickListener(cameraChangeDispatcher2));
        this.attrView.setOnClickListener(new AttributionClickListener(context, this.mapboxMap));
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestDisallowInterceptTouchEvent(true);
        this.nativeMapView.setReachability(ConnectivityReceiver.instance(context).isConnected(context));
        if (this.savedInstanceState == null) {
            r11.mapboxMap.initialise(context, r11.mapboxMapOptions);
        } else {
            r11.mapboxMap.onRestoreInstanceState(r11.savedInstanceState);
        }
    }

    private FocalPointChangeListener createFocalPointChangeListener() {
        return new C70961();
    }

    private OnCompassAnimationListener createCompassAnimationListener(final CameraChangeDispatcher cameraChangeDispatcher) {
        return new OnCompassAnimationListener() {
            public void onCompassAnimation() {
                cameraChangeDispatcher.onCameraMove();
            }

            public void onCompassAnimationFinished() {
                MapView.this.compassView.isAnimating(false);
                cameraChangeDispatcher.onCameraIdle();
            }
        };
    }

    private OnClickListener createCompassClickListener(final CameraChangeDispatcher cameraChangeDispatcher) {
        return new OnClickListener() {
            public void onClick(View view) {
                if (MapView.this.mapboxMap != null && MapView.this.compassView != null) {
                    if (MapView.this.focalPoint != null) {
                        MapView.this.mapboxMap.setFocalBearing(0.0d, MapView.this.focalPoint.x, MapView.this.focalPoint.y, 150);
                    } else {
                        MapView.this.mapboxMap.setFocalBearing(0.0d, MapView.this.mapboxMap.getWidth() / 1073741824, MapView.this.mapboxMap.getHeight() / 2.0f, 150);
                    }
                    cameraChangeDispatcher.onCameraMoveStarted(3);
                    MapView.this.compassView.isAnimating(true);
                    MapView.this.compassView.postDelayed(MapView.this.compassView, 650);
                }
            }
        };
    }

    @UiThread
    public void onCreate(@Nullable Bundle bundle) {
        if (bundle == null) {
            bundle = Telemetry.obtainTelemetry();
            bundle.push(new AppUserTurnstile(BuildConfig.MAPBOX_SDK_IDENTIFIER, BuildConfig.MAPBOX_SDK_VERSION));
            bundle.push(new MapEventFactory().createMapLoadEvent(Type.MAP_LOAD));
        } else if (bundle.getBoolean(MapboxConstants.STATE_HAS_SAVED_STATE)) {
            this.savedInstanceState = bundle;
        }
    }

    private void initialiseDrawingSurface(MapboxMapOptions mapboxMapOptions) {
        View textureView;
        if (mapboxMapOptions.getTextureMode()) {
            textureView = new TextureView(getContext());
            this.mapRenderer = new TextureViewMapRenderer(getContext(), textureView, mapboxMapOptions.getLocalIdeographFontFamily(), mapboxMapOptions.getTranslucentTextureSurface()) {
                protected void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                    MapView.this.onSurfaceCreated();
                    super.onSurfaceCreated(gl10, eGLConfig);
                }
            };
            addView(textureView, 0);
        } else {
            textureView = new GLSurfaceView(getContext());
            textureView.setZOrderMediaOverlay(this.mapboxMapOptions.getRenderSurfaceOnTop());
            this.mapRenderer = new GLSurfaceViewMapRenderer(getContext(), textureView, mapboxMapOptions.getLocalIdeographFontFamily()) {
                public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                    MapView.this.onSurfaceCreated();
                    super.onSurfaceCreated(gl10, eGLConfig);
                }
            };
            addView(textureView, 0);
        }
        this.nativeMapView = new NativeMapView(getContext(), this, this.mapRenderer);
        this.nativeMapView.addOnMapChangedListener(new C70986());
        this.nativeMapView.resizeView(getMeasuredWidth(), getMeasuredHeight());
    }

    private void onSurfaceCreated() {
        this.hasSurface = true;
        post(new C58417());
    }

    @UiThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        if (this.mapboxMap != null) {
            bundle.putBoolean(MapboxConstants.STATE_HAS_SAVED_STATE, true);
            this.mapboxMap.onSaveInstanceState(bundle);
        }
    }

    @UiThread
    public void onStart() {
        ConnectivityReceiver.instance(getContext()).activate();
        FileSource.getInstance(getContext()).activate();
        if (this.mapboxMap != null) {
            this.mapboxMap.onStart();
        }
        if (this.mapRenderer != null) {
            this.mapRenderer.onStart();
        }
    }

    @UiThread
    public void onResume() {
        if (this.mapRenderer != null) {
            this.mapRenderer.onResume();
        }
    }

    @UiThread
    public void onPause() {
        if (this.mapRenderer != null) {
            this.mapRenderer.onPause();
        }
    }

    @UiThread
    public void onStop() {
        if (this.mapboxMap != null) {
            this.mapGestureDetector.cancelAnimators();
            this.mapboxMap.onStop();
        }
        if (this.mapRenderer != null) {
            this.mapRenderer.onStop();
        }
        ConnectivityReceiver.instance(getContext()).deactivate();
        FileSource.getInstance(getContext()).deactivate();
    }

    @UiThread
    public void onDestroy() {
        this.destroyed = true;
        this.onMapChangedListeners.clear();
        this.mapCallback.clearOnMapReadyCallbacks();
        if (this.nativeMapView != null && this.hasSurface) {
            this.nativeMapView.destroy();
            this.nativeMapView = null;
        }
        if (this.mapRenderer != null) {
            this.mapRenderer.onDestroy();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isMapInitialized()) {
            if (isZoomButtonControllerInitialized()) {
                boolean z = true;
                if (motionEvent.getAction() == 0) {
                    this.mapZoomButtonController.setVisible(true);
                }
                if (!this.mapGestureDetector.onTouchEvent(motionEvent)) {
                    if (super.onTouchEvent(motionEvent) == null) {
                        z = false;
                    }
                }
                return z;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.mapKeyListener.onKeyDown(i, keyEvent)) {
            if (super.onKeyDown(i, keyEvent) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (!this.mapKeyListener.onKeyLongPress(i, keyEvent)) {
            if (super.onKeyLongPress(i, keyEvent) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.mapKeyListener.onKeyUp(i, keyEvent)) {
            if (super.onKeyUp(i, keyEvent) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.mapKeyListener.onTrackballEvent(motionEvent)) {
            if (super.onTrackballEvent(motionEvent) == null) {
                return null;
            }
        }
        return true;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.mapGestureDetector == null) {
            return super.onGenericMotionEvent(motionEvent);
        }
        if (!this.mapGestureDetector.onGenericMotionEvent(motionEvent)) {
            if (super.onGenericMotionEvent(motionEvent) == null) {
                motionEvent = null;
                return motionEvent;
            }
        }
        motionEvent = true;
        return motionEvent;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!isZoomButtonControllerInitialized()) {
            return super.onHoverEvent(motionEvent);
        }
        motionEvent = motionEvent.getActionMasked();
        if (motionEvent != 7) {
            switch (motionEvent) {
                case 9:
                    break;
                case 10:
                    this.mapZoomButtonController.setVisible(false);
                    return true;
                default:
                    return false;
            }
        }
        this.mapZoomButtonController.setVisible(true);
        return true;
    }

    @UiThread
    public void onLowMemory() {
        if (this.nativeMapView != null) {
            this.nativeMapView.onLowMemory();
        }
    }

    public void setStyleUrl(@NonNull String str) {
        if (!this.destroyed) {
            if (isMapInitialized()) {
                this.nativeMapView.setStyleUrl(str);
            } else {
                this.mapboxMapOptions.styleUrl(str);
            }
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.destroyed == 0 && isInEditMode() == 0 && isMapInitialized() != 0) {
            this.nativeMapView.resizeView(i, i2);
        }
    }

    @CallSuper
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isZoomButtonControllerInitialized()) {
            this.mapZoomButtonController.setVisible(false);
        }
    }

    protected void onVisibilityChanged(@NonNull View view, int i) {
        if (isInEditMode() == null && isZoomButtonControllerInitialized() != null) {
            this.mapZoomButtonController.setVisible(i == 0 ? 1 : 0);
        }
    }

    public Bitmap getViewContent() {
        return BitmapUtils.createBitmapFromView(this);
    }

    public void addOnMapChangedListener(@Nullable OnMapChangedListener onMapChangedListener) {
        if (onMapChangedListener != null) {
            this.onMapChangedListeners.add(onMapChangedListener);
        }
    }

    public void removeOnMapChangedListener(@Nullable OnMapChangedListener onMapChangedListener) {
        if (onMapChangedListener != null && this.onMapChangedListeners.contains(onMapChangedListener)) {
            this.onMapChangedListeners.remove(onMapChangedListener);
        }
    }

    @UiThread
    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        if (!this.mapCallback.isInitialLoad() && onMapReadyCallback != null) {
            onMapReadyCallback.onMapReady(this.mapboxMap);
        } else if (onMapReadyCallback != null) {
            this.mapCallback.addOnMapReadyCallback(onMapReadyCallback);
        }
    }

    private boolean isMapInitialized() {
        return this.nativeMapView != null;
    }

    private boolean isZoomButtonControllerInitialized() {
        return this.mapZoomButtonController != null;
    }

    MapboxMap getMapboxMap() {
        return this.mapboxMap;
    }

    void setMapboxMap(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
    }
}
