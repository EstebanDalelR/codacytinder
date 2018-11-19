package com.mapbox.mapboxsdk.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.android.gestures.MoveGestureDetector.C7075a;
import com.mapbox.android.gestures.MoveGestureDetector.OnMoveGestureListener;
import com.mapbox.android.gestures.MultiFingerTapGestureDetector;
import com.mapbox.android.gestures.MultiFingerTapGestureDetector.OnMultiFingerTapGestureListener;
import com.mapbox.android.gestures.RotateGestureDetector;
import com.mapbox.android.gestures.RotateGestureDetector.C7076a;
import com.mapbox.android.gestures.RotateGestureDetector.OnRotateGestureListener;
import com.mapbox.android.gestures.ShoveGestureDetector;
import com.mapbox.android.gestures.ShoveGestureDetector.C7077a;
import com.mapbox.android.gestures.ShoveGestureDetector.OnShoveGestureListener;
import com.mapbox.android.gestures.StandardGestureDetector.C7079a;
import com.mapbox.android.gestures.StandardGestureDetector.StandardOnGestureListener;
import com.mapbox.android.gestures.StandardScaleGestureDetector;
import com.mapbox.android.gestures.StandardScaleGestureDetector.C7080a;
import com.mapbox.android.gestures.StandardScaleGestureDetector.StandardOnScaleGestureListener;
import com.mapbox.android.telemetry.Event.Type;
import com.mapbox.android.telemetry.MapEventFactory;
import com.mapbox.android.telemetry.MapState;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFlingListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapLongClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMoveListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnRotateListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnScaleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnScrollListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnShoveListener;
import com.mapbox.mapboxsdk.utils.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

final class MapGestureDetector {
    private Handler animationsTimeoutHandler = new Handler();
    private final AnnotationManager annotationManager;
    private final CameraChangeDispatcher cameraChangeDispatcher;
    private Runnable cancelAnimatorsRunnable = new C58351();
    private boolean executeDoubleTap;
    private PointF focalPoint;
    private AndroidGesturesManager gesturesManager;
    private OnFlingListener onFlingListener;
    private final CopyOnWriteArrayList<OnFlingListener> onFlingListenerList = new CopyOnWriteArrayList();
    private OnMapClickListener onMapClickListener;
    private final CopyOnWriteArrayList<OnMapClickListener> onMapClickListenerList = new CopyOnWriteArrayList();
    private OnMapLongClickListener onMapLongClickListener;
    private final CopyOnWriteArrayList<OnMapLongClickListener> onMapLongClickListenerList = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList<OnMoveListener> onMoveListenerList = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList<OnRotateListener> onRotateListenerList = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList<OnScaleListener> onScaleListenerList = new CopyOnWriteArrayList();
    private OnScrollListener onScrollListener;
    private final CopyOnWriteArrayList<OnScrollListener> onScrollListenerList = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList<OnShoveListener> onShoveListenerList = new CopyOnWriteArrayList();
    private final Projection projection;
    private Animator rotateAnimator;
    private Animator scaleAnimator;
    private final List<Animator> scheduledAnimators = new ArrayList();
    private final Transform transform;
    private final UiSettings uiSettings;

    /* renamed from: com.mapbox.mapboxsdk.maps.MapGestureDetector$1 */
    class C58351 implements Runnable {
        C58351() {
        }

        public void run() {
            MapGestureDetector.this.cancelAnimators();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapGestureDetector$3 */
    class C58373 extends AnimatorListenerAdapter {
        C58373() {
        }

        public void onAnimationStart(Animator animator) {
            MapGestureDetector.this.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(3);
        }

        public void onAnimationCancel(Animator animator) {
            MapGestureDetector.this.transform.cancelTransitions();
        }

        public void onAnimationEnd(Animator animator) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
        }
    }

    private final class TapGestureListener implements OnMultiFingerTapGestureListener {
        private TapGestureListener() {
        }

        public boolean onMultiFingerTap(MultiFingerTapGestureDetector multiFingerTapGestureDetector, int i) {
            if (MapGestureDetector.this.uiSettings.isZoomGesturesEnabled()) {
                if (i == 2) {
                    MapGestureDetector.this.transform.cancelTransitions();
                    MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                    MapGestureDetector.this.sendTelemetryEvent("TwoFingerTap", multiFingerTapGestureDetector.m30658m());
                    if (MapGestureDetector.this.focalPoint != 0) {
                        multiFingerTapGestureDetector = MapGestureDetector.this.focalPoint;
                    } else {
                        multiFingerTapGestureDetector = multiFingerTapGestureDetector.m30658m();
                    }
                    MapGestureDetector.this.zoomOutAnimated(multiFingerTapGestureDetector, false);
                    return true;
                }
            }
            return false;
        }
    }

    private final class MoveGestureListener extends C7075a {
        private MoveGestureListener() {
        }

        public boolean onMoveBegin(MoveGestureDetector moveGestureDetector) {
            if (!MapGestureDetector.this.uiSettings.isScrollGesturesEnabled()) {
                return null;
            }
            MapGestureDetector.this.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            MapGestureDetector.this.sendTelemetryEvent("Pan", moveGestureDetector.m30658m());
            MapGestureDetector.this.notifyOnMoveBeginListeners(moveGestureDetector);
            return true;
        }

        public boolean onMove(MoveGestureDetector moveGestureDetector, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            MapGestureDetector.this.transform.moveBy((double) (-f), (double) (-f2), 0);
            MapGestureDetector.this.notifyOnScrollListeners();
            MapGestureDetector.this.notifyOnMoveListeners(moveGestureDetector);
            return true;
        }

        public void onMoveEnd(MoveGestureDetector moveGestureDetector, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
            MapGestureDetector.this.notifyOnMoveEndListeners(moveGestureDetector);
        }
    }

    private final class RotateGestureListener extends C7076a {
        private final float defaultSpanSinceStartThreshold;
        private final float minimumAngularVelocity;
        private final float minimumScaleSpanWhenRotating;
        private PointF rotateFocalPoint;

        /* renamed from: com.mapbox.mapboxsdk.maps.MapGestureDetector$RotateGestureListener$1 */
        class C58381 implements AnimatorUpdateListener {
            C58381() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MapGestureDetector.this.transform.setBearing(MapGestureDetector.this.transform.getRawBearing() + ((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()), RotateGestureListener.this.rotateFocalPoint.x, RotateGestureListener.this.rotateFocalPoint.y, 0);
            }
        }

        /* renamed from: com.mapbox.mapboxsdk.maps.MapGestureDetector$RotateGestureListener$2 */
        class C58392 extends AnimatorListenerAdapter {
            C58392() {
            }

            public void onAnimationStart(Animator animator) {
                MapGestureDetector.this.transform.cancelTransitions();
                MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(3);
            }

            public void onAnimationCancel(Animator animator) {
                MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
            }

            public void onAnimationEnd(Animator animator) {
                MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
            }
        }

        public RotateGestureListener(float f, float f2, float f3) {
            this.minimumScaleSpanWhenRotating = f;
            this.minimumAngularVelocity = f2;
            this.defaultSpanSinceStartThreshold = f3;
        }

        public boolean onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            if (!MapGestureDetector.this.uiSettings.isRotateGesturesEnabled()) {
                return null;
            }
            MapGestureDetector.this.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            if (MapGestureDetector.this.uiSettings.isIncreaseScaleThresholdWhenRotating()) {
                MapGestureDetector.this.gesturesManager.m25357b().m34508b(this.minimumScaleSpanWhenRotating);
                MapGestureDetector.this.gesturesManager.m25357b().mo7609q();
            }
            setRotateFocalPoint(rotateGestureDetector);
            MapGestureDetector.this.sendTelemetryEvent("Rotation", this.rotateFocalPoint);
            MapGestureDetector.this.notifyOnRotateBeginListeners(rotateGestureDetector);
            return true;
        }

        public boolean onRotate(RotateGestureDetector rotateGestureDetector, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            setRotateFocalPoint(rotateGestureDetector);
            MapGestureDetector.this.transform.setBearing(MapGestureDetector.this.transform.getRawBearing() + ((double) f), this.rotateFocalPoint.x, this.rotateFocalPoint.y);
            MapGestureDetector.this.notifyOnRotateListeners(rotateGestureDetector);
            return true;
        }

        public void onRotateEnd(RotateGestureDetector rotateGestureDetector, float f, float f2, float f3) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
            if (MapGestureDetector.this.uiSettings.isIncreaseScaleThresholdWhenRotating() != null) {
                MapGestureDetector.this.gesturesManager.m25357b().m34508b(this.defaultSpanSinceStartThreshold);
            }
            MapGestureDetector.this.notifyOnRotateEndListeners(rotateGestureDetector);
            if (MapGestureDetector.this.uiSettings.isRotateVelocityAnimationEnabled() != null && Math.abs(f3) >= this.minimumAngularVelocity) {
                rotateGestureDetector = f3 < null ? true : null;
                f = MathUtils.clamp((float) Math.pow((double) f3, 2.0d), 1.5f, 20.0f);
                f2 = (long) (Math.log((double) (1.0f + f)) * 500.0d);
                if (rotateGestureDetector != null) {
                    f = -f;
                }
                MapGestureDetector.this.rotateAnimator = createRotateAnimator(f, f2);
                MapGestureDetector.this.scheduleAnimator(MapGestureDetector.this.rotateAnimator);
            }
        }

        private void setRotateFocalPoint(RotateGestureDetector rotateGestureDetector) {
            if (MapGestureDetector.this.focalPoint != null) {
                this.rotateFocalPoint = MapGestureDetector.this.focalPoint;
            } else {
                this.rotateFocalPoint = rotateGestureDetector.m30658m();
            }
        }

        private Animator createRotateAnimator(float f, long j) {
            f = ValueAnimator.ofFloat(new float[]{f, 0.0f});
            f.setDuration(j);
            f.setInterpolator(new DecelerateInterpolator());
            f.addUpdateListener(new C58381());
            f.addListener(new C58392());
            return f;
        }
    }

    private final class ScaleGestureListener extends C7080a {
        private final float minimumVelocity;
        private boolean quickZoom;
        private PointF scaleFocalPoint;

        ScaleGestureListener(float f) {
            this.minimumVelocity = f;
        }

        public boolean onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector) {
            if (!MapGestureDetector.this.uiSettings.isZoomGesturesEnabled()) {
                return false;
            }
            MapGestureDetector.this.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            this.quickZoom = standardScaleGestureDetector.m30657l() == 1;
            if (this.quickZoom) {
                MapGestureDetector.this.executeDoubleTap = false;
                MapGestureDetector.this.gesturesManager.m25359d().mo7377a(false);
            }
            if (MapGestureDetector.this.uiSettings.isIncreaseRotateThresholdWhenScaling()) {
                MapGestureDetector.this.gesturesManager.m25358c().m34479b(40.3f);
            }
            setScaleFocalPoint(standardScaleGestureDetector);
            MapGestureDetector.this.sendTelemetryEvent("Pinch", this.scaleFocalPoint);
            MapGestureDetector.this.notifyOnScaleBeginListeners(standardScaleGestureDetector);
            return true;
        }

        public boolean onScale(StandardScaleGestureDetector standardScaleGestureDetector) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            setScaleFocalPoint(standardScaleGestureDetector);
            MapGestureDetector.this.transform.zoomBy(getNewZoom(standardScaleGestureDetector.m34518s(), this.quickZoom), this.scaleFocalPoint);
            MapGestureDetector.this.notifyOnScaleListeners(standardScaleGestureDetector);
            return true;
        }

        public void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
            if (this.quickZoom) {
                MapGestureDetector.this.gesturesManager.m25359d().mo7377a(true);
            }
            if (MapGestureDetector.this.uiSettings.isIncreaseRotateThresholdWhenScaling()) {
                MapGestureDetector.this.gesturesManager.m25358c().m34479b(15.3f);
            }
            MapGestureDetector.this.notifyOnScaleEndListeners(standardScaleGestureDetector);
            if (MapGestureDetector.this.uiSettings.isScaleVelocityAnimationEnabled()) {
                f = Math.abs(f) + Math.abs(f2);
                if (f > this.minimumVelocity) {
                    double calculateScale = calculateScale((double) f, standardScaleGestureDetector.m34517r());
                    MapGestureDetector.this.scaleAnimator = MapGestureDetector.this.createScaleAnimator(MapGestureDetector.this.transform.getRawZoom(), calculateScale, this.scaleFocalPoint, (long) ((Math.abs(calculateScale) * 1000.0d) / 4.0d));
                    MapGestureDetector.this.scheduleAnimator(MapGestureDetector.this.scaleAnimator);
                }
            }
        }

        private void setScaleFocalPoint(StandardScaleGestureDetector standardScaleGestureDetector) {
            if (MapGestureDetector.this.focalPoint != null) {
                this.scaleFocalPoint = MapGestureDetector.this.focalPoint;
            } else if (this.quickZoom) {
                this.scaleFocalPoint = new PointF(MapGestureDetector.this.uiSettings.getWidth() / 2.0f, MapGestureDetector.this.uiSettings.getHeight() / 2.0f);
            } else {
                this.scaleFocalPoint = standardScaleGestureDetector.m30658m();
            }
        }

        private double calculateScale(double d, boolean z) {
            d = (double) ((float) Math.log((d / 1000.0d) + 1.0d));
            return z ? -d : d;
        }

        private double getNewZoom(float f, boolean z) {
            double log = Math.log((double) f) / Math.log(1.5707963267948966d);
            if (!z) {
                return log;
            }
            f = log < 0.0f ? Float.MIN_VALUE : 0.0f;
            log = MathUtils.clamp(Math.abs(log), 0.0d, 0.15000000596046448d);
            if (f != null) {
                log = -log;
            }
            return log;
        }
    }

    private final class ShoveGestureListener extends C7077a {
        private ShoveGestureListener() {
        }

        public boolean onShoveBegin(ShoveGestureDetector shoveGestureDetector) {
            if (!MapGestureDetector.this.uiSettings.isTiltGesturesEnabled()) {
                return false;
            }
            MapGestureDetector.this.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            MapGestureDetector.this.sendTelemetryEvent("Pitch", shoveGestureDetector.m30658m());
            MapGestureDetector.this.gesturesManager.m25359d().mo7377a(false);
            MapGestureDetector.this.notifyOnShoveBeginListeners(shoveGestureDetector);
            return true;
        }

        public boolean onShove(ShoveGestureDetector shoveGestureDetector, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            MapGestureDetector.this.transform.setTilt(Double.valueOf(MathUtils.clamp(MapGestureDetector.this.transform.getTilt() - ((double) (f * 0.1f)), 0.0d, 60.0d)));
            MapGestureDetector.this.notifyOnShoveListeners(shoveGestureDetector);
            return true;
        }

        public void onShoveEnd(ShoveGestureDetector shoveGestureDetector, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
            MapGestureDetector.this.gesturesManager.m25359d().mo7377a(Float.MIN_VALUE);
            MapGestureDetector.this.notifyOnShoveEndListeners(shoveGestureDetector);
        }
    }

    private final class StandardGestureListener extends C7079a {
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private StandardGestureListener() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            MapGestureDetector.this.transform.cancelTransitions();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            if (!MapGestureDetector.this.annotationManager.onTap(pointF)) {
                if (MapGestureDetector.this.uiSettings.isDeselectMarkersOnTap()) {
                    MapGestureDetector.this.annotationManager.deselectMarkers();
                }
                MapGestureDetector.this.notifyOnMapClickListeners(pointF);
            }
            MapGestureDetector.this.sendTelemetryEvent("SingleTap", new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                MapGestureDetector.this.executeDoubleTap = true;
            }
            if (motionEvent.getActionMasked() != 1) {
                return super.onDoubleTapEvent(motionEvent);
            }
            if (MapGestureDetector.this.uiSettings.isZoomGesturesEnabled() && MapGestureDetector.this.uiSettings.isDoubleTapGesturesEnabled()) {
                if (MapGestureDetector.this.executeDoubleTap) {
                    PointF access$1000;
                    MapGestureDetector.this.transform.cancelTransitions();
                    MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                    if (MapGestureDetector.this.focalPoint != null) {
                        access$1000 = MapGestureDetector.this.focalPoint;
                    } else {
                        access$1000 = new PointF(motionEvent.getX(), motionEvent.getY());
                    }
                    MapGestureDetector.this.zoomInAnimated(access$1000, false);
                    MapGestureDetector.this.sendTelemetryEvent("DoubleTap", new PointF(motionEvent.getX(), motionEvent.getY()));
                    return true;
                }
            }
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            MapGestureDetector.this.notifyOnMapLongClickListeners(new PointF(motionEvent.getX(), motionEvent.getY()));
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3 = f;
            float f4 = f2;
            if (!MapGestureDetector.this.uiSettings.isScrollGesturesEnabled()) {
                return false;
            }
            MapGestureDetector.this.notifyOnFlingListeners();
            if (!MapGestureDetector.this.uiSettings.isFlingVelocityAnimationEnabled()) {
                return false;
            }
            float pixelRatio = MapGestureDetector.this.uiSettings.getPixelRatio();
            double hypot = Math.hypot((double) (f3 / pixelRatio), (double) (f4 / pixelRatio));
            if (hypot < 1000.0d) {
                return false;
            }
            MapGestureDetector.this.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            double tilt = MapGestureDetector.this.transform.getTilt();
            double d = 0.0d;
            if (tilt != 0.0d) {
                d = tilt / 10.0d;
            }
            d += 1.5d;
            double d2 = (double) pixelRatio;
            MapGestureDetector.this.transform.moveBy((((double) f3) / d) / d2, (((double) f4) / d) / d2, (long) (((hypot / 7.0d) / d) + 150.0d));
            return true;
        }
    }

    MapGestureDetector(Context context, Transform transform, Projection projection, UiSettings uiSettings, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher) {
        this.annotationManager = annotationManager;
        this.transform = transform;
        this.projection = projection;
        this.uiSettings = uiSettings;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
        if (context != null) {
            initializeGesturesManager(new AndroidGesturesManager(context), true);
            initializeGestureListeners(context, true);
        }
    }

    private void initializeGestureListeners(Context context, boolean z) {
        if (z) {
            StandardOnGestureListener standardGestureListener = new StandardGestureListener();
            OnMoveGestureListener moveGestureListener = new MoveGestureListener();
            StandardOnScaleGestureListener scaleGestureListener = new ScaleGestureListener(context.getResources().getDimension(C5812R.dimen.mapbox_minimum_scale_velocity));
            OnRotateGestureListener rotateGestureListener = new RotateGestureListener(context.getResources().getDimension(C5812R.dimen.mapbox_minimum_scale_span_when_rotating), context.getResources().getDimension(C5812R.dimen.mapbox_minimum_angular_velocity), context.getResources().getDimension(C5812R.dimen.mapbox_defaultScaleSpanSinceStartThreshold));
            OnShoveGestureListener shoveGestureListener = new ShoveGestureListener();
            OnMultiFingerTapGestureListener tapGestureListener = new TapGestureListener();
            this.gesturesManager.m25352a(standardGestureListener);
            this.gesturesManager.m25348a(moveGestureListener);
            this.gesturesManager.m25353a(scaleGestureListener);
            this.gesturesManager.m25350a(rotateGestureListener);
            this.gesturesManager.m25351a(shoveGestureListener);
            this.gesturesManager.m25349a(tapGestureListener);
        }
    }

    private void initializeGesturesManager(AndroidGesturesManager androidGesturesManager, boolean z) {
        if (z) {
            z = new HashSet();
            z.add(Integer.valueOf(3));
            z.add(Integer.valueOf(1));
            Set hashSet = new HashSet();
            hashSet.add(Integer.valueOf(3));
            hashSet.add(Integer.valueOf(2));
            Set hashSet2 = new HashSet();
            hashSet2.add(Integer.valueOf(1));
            hashSet2.add(Integer.valueOf(6));
            androidGesturesManager.m25355a(z, hashSet, hashSet2);
        }
        this.gesturesManager = androidGesturesManager;
    }

    void setFocalPoint(PointF pointF) {
        if (pointF == null && this.uiSettings.getFocalPoint() != null) {
            pointF = this.uiSettings.getFocalPoint();
        }
        this.focalPoint = pointF;
    }

    @Nullable
    PointF getFocalPoint() {
        return this.focalPoint;
    }

    boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getButtonState() != 0 && motionEvent.getButtonState() != 1) {
            return false;
        }
        boolean a = this.gesturesManager.m25356a(motionEvent);
        motionEvent = motionEvent.getActionMasked();
        if (motionEvent != 3) {
            switch (motionEvent) {
                case null:
                    cancelAnimators();
                    this.transform.setGestureInProgress(true);
                    break;
                case 1:
                    this.transform.setGestureInProgress(false);
                    this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
                    for (Animator start : this.scheduledAnimators) {
                        start.start();
                    }
                    this.scheduledAnimators.clear();
                    break;
                default:
                    break;
            }
        }
        this.scheduledAnimators.clear();
        this.transform.setGestureInProgress(false);
        return a;
    }

    void cancelAnimators() {
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.scheduledAnimators.clear();
        cancelAnimator(this.scaleAnimator);
        cancelAnimator(this.rotateAnimator);
    }

    private void cancelAnimator(Animator animator) {
        if (animator != null && animator.isStarted()) {
            animator.cancel();
        }
    }

    private void scheduleAnimator(Animator animator) {
        this.scheduledAnimators.add(animator);
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.animationsTimeoutHandler.postDelayed(this.cancelAnimatorsRunnable, 150);
    }

    boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 2 || motionEvent.getActionMasked() != 8 || !this.uiSettings.isZoomGesturesEnabled()) {
            return false;
        }
        this.transform.cancelTransitions();
        this.transform.zoomBy((double) motionEvent.getAxisValue(9), new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    private Animator createScaleAnimator(double d, double d2, final PointF pointF, long j) {
        d = ValueAnimator.ofFloat(new float[]{(float) d, (float) (d + d2)});
        d.setDuration(j);
        d.setInterpolator(new DecelerateInterpolator());
        d.addUpdateListener(new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MapGestureDetector.this.transform.setZoom((double) ((Float) valueAnimator.getAnimatedValue()).floatValue(), pointF);
            }
        });
        d.addListener(new C58373());
        return d;
    }

    void zoomInAnimated(PointF pointF, boolean z) {
        zoomAnimated(true, pointF, z);
    }

    void zoomOutAnimated(PointF pointF, boolean z) {
        zoomAnimated(false, pointF, z);
    }

    private void zoomAnimated(boolean z, PointF pointF, boolean z2) {
        cancelAnimator(this.scaleAnimator);
        this.scaleAnimator = createScaleAnimator(this.transform.getRawZoom(), z ? 1.0d : -1.0d, pointF, 300);
        if (z2) {
            this.scaleAnimator.start();
        } else {
            scheduleAnimator(this.scaleAnimator);
        }
    }

    private void sendTelemetryEvent(String str, PointF pointF) {
        if (isZoomValid(this.transform)) {
            MapEventFactory mapEventFactory = new MapEventFactory();
            pointF = this.projection.fromScreenLocation(pointF);
            MapState mapState = new MapState(pointF.getLatitude(), pointF.getLongitude(), this.transform.getZoom());
            mapState.setGesture(str);
            Telemetry.obtainTelemetry().push(mapEventFactory.createMapGestureEvent(Type.MAP_CLICK, mapState));
        }
    }

    private boolean isZoomValid(Transform transform) {
        boolean z = false;
        if (transform == null) {
            return false;
        }
        double zoom = transform.getZoom();
        if (zoom >= 0.0d && zoom <= 25.5d) {
            z = true;
        }
        return z;
    }

    void notifyOnMapClickListeners(PointF pointF) {
        if (this.onMapClickListener != null) {
            this.onMapClickListener.onMapClick(this.projection.fromScreenLocation(pointF));
        }
        Iterator it = this.onMapClickListenerList.iterator();
        while (it.hasNext()) {
            ((OnMapClickListener) it.next()).onMapClick(this.projection.fromScreenLocation(pointF));
        }
    }

    void notifyOnMapLongClickListeners(PointF pointF) {
        if (this.onMapLongClickListener != null) {
            this.onMapLongClickListener.onMapLongClick(this.projection.fromScreenLocation(pointF));
        }
        Iterator it = this.onMapLongClickListenerList.iterator();
        while (it.hasNext()) {
            ((OnMapLongClickListener) it.next()).onMapLongClick(this.projection.fromScreenLocation(pointF));
        }
    }

    void notifyOnFlingListeners() {
        if (this.onFlingListener != null) {
            this.onFlingListener.onFling();
        }
        Iterator it = this.onFlingListenerList.iterator();
        while (it.hasNext()) {
            ((OnFlingListener) it.next()).onFling();
        }
    }

    void notifyOnScrollListeners() {
        if (this.onScrollListener != null) {
            this.onScrollListener.onScroll();
        }
        Iterator it = this.onScrollListenerList.iterator();
        while (it.hasNext()) {
            ((OnScrollListener) it.next()).onScroll();
        }
    }

    void notifyOnMoveBeginListeners(MoveGestureDetector moveGestureDetector) {
        Iterator it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            ((OnMoveListener) it.next()).onMoveBegin(moveGestureDetector);
        }
    }

    void notifyOnMoveListeners(MoveGestureDetector moveGestureDetector) {
        Iterator it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            ((OnMoveListener) it.next()).onMove(moveGestureDetector);
        }
    }

    void notifyOnMoveEndListeners(MoveGestureDetector moveGestureDetector) {
        Iterator it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            ((OnMoveListener) it.next()).onMoveEnd(moveGestureDetector);
        }
    }

    void notifyOnRotateBeginListeners(RotateGestureDetector rotateGestureDetector) {
        Iterator it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotateBegin(rotateGestureDetector);
        }
    }

    void notifyOnRotateListeners(RotateGestureDetector rotateGestureDetector) {
        Iterator it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotate(rotateGestureDetector);
        }
    }

    void notifyOnRotateEndListeners(RotateGestureDetector rotateGestureDetector) {
        Iterator it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotateEnd(rotateGestureDetector);
        }
    }

    void notifyOnScaleBeginListeners(StandardScaleGestureDetector standardScaleGestureDetector) {
        Iterator it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            ((OnScaleListener) it.next()).onScaleBegin(standardScaleGestureDetector);
        }
    }

    void notifyOnScaleListeners(StandardScaleGestureDetector standardScaleGestureDetector) {
        Iterator it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            ((OnScaleListener) it.next()).onScale(standardScaleGestureDetector);
        }
    }

    void notifyOnScaleEndListeners(StandardScaleGestureDetector standardScaleGestureDetector) {
        Iterator it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            ((OnScaleListener) it.next()).onScaleEnd(standardScaleGestureDetector);
        }
    }

    void notifyOnShoveBeginListeners(ShoveGestureDetector shoveGestureDetector) {
        Iterator it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            ((OnShoveListener) it.next()).onShoveBegin(shoveGestureDetector);
        }
    }

    void notifyOnShoveListeners(ShoveGestureDetector shoveGestureDetector) {
        Iterator it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            ((OnShoveListener) it.next()).onShove(shoveGestureDetector);
        }
    }

    void notifyOnShoveEndListeners(ShoveGestureDetector shoveGestureDetector) {
        Iterator it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            ((OnShoveListener) it.next()).onShoveEnd(shoveGestureDetector);
        }
    }

    void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.onMapClickListener = onMapClickListener;
    }

    void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListener = onMapLongClickListener;
    }

    void setOnFlingListener(OnFlingListener onFlingListener) {
        this.onFlingListener = onFlingListener;
    }

    void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    void addOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.onMapClickListenerList.add(onMapClickListener);
    }

    void removeOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.onMapClickListenerList.remove(onMapClickListener);
    }

    void addOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListenerList.add(onMapLongClickListener);
    }

    void removeOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListenerList.remove(onMapLongClickListener);
    }

    void addOnFlingListener(OnFlingListener onFlingListener) {
        this.onFlingListenerList.add(onFlingListener);
    }

    void removeOnFlingListener(OnFlingListener onFlingListener) {
        this.onFlingListenerList.remove(onFlingListener);
    }

    void addOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListenerList.add(onScrollListener);
    }

    void removeOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListenerList.remove(onScrollListener);
    }

    void addOnMoveListener(OnMoveListener onMoveListener) {
        this.onMoveListenerList.add(onMoveListener);
    }

    void removeOnMoveListener(OnMoveListener onMoveListener) {
        this.onMoveListenerList.remove(onMoveListener);
    }

    void addOnRotateListener(OnRotateListener onRotateListener) {
        this.onRotateListenerList.add(onRotateListener);
    }

    void removeOnRotateListener(OnRotateListener onRotateListener) {
        this.onRotateListenerList.remove(onRotateListener);
    }

    void addOnScaleListener(OnScaleListener onScaleListener) {
        this.onScaleListenerList.add(onScaleListener);
    }

    void removeOnScaleListener(OnScaleListener onScaleListener) {
        this.onScaleListenerList.remove(onScaleListener);
    }

    void addShoveListener(OnShoveListener onShoveListener) {
        this.onShoveListenerList.add(onShoveListener);
    }

    void removeShoveListener(OnShoveListener onShoveListener) {
        this.onShoveListenerList.remove(onShoveListener);
    }

    AndroidGesturesManager getGesturesManager() {
        return this.gesturesManager;
    }

    void setGesturesManager(Context context, AndroidGesturesManager androidGesturesManager, boolean z, boolean z2) {
        initializeGesturesManager(androidGesturesManager, z2);
        initializeGestureListeners(context, z);
    }
}
