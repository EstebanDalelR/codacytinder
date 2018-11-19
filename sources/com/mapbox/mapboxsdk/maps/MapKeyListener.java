package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

final class MapKeyListener {
    private TrackballLongPressTimeOut currentTrackballLongPressTimeOut;
    private final MapGestureDetector mapGestureDetector;
    private final Transform transform;
    private final UiSettings uiSettings;

    private class TrackballLongPressTimeOut implements Runnable {
        private boolean cancelled = null;

        TrackballLongPressTimeOut() {
        }

        public void cancel() {
            this.cancelled = true;
        }

        public void run() {
            if (!this.cancelled) {
                MapKeyListener.this.mapGestureDetector.zoomOutAnimated(new PointF(MapKeyListener.this.uiSettings.getWidth() / 2.0f, MapKeyListener.this.uiSettings.getHeight() / 2.0f), true);
                MapKeyListener.this.currentTrackballLongPressTimeOut = null;
            }
        }
    }

    MapKeyListener(Transform transform, UiSettings uiSettings, MapGestureDetector mapGestureDetector) {
        this.transform = transform;
        this.uiSettings = uiSettings;
        this.mapGestureDetector = mapGestureDetector;
    }

    boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        MapKeyListener mapKeyListener = this;
        int i2 = i;
        double d = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i2 != 66) {
            switch (i2) {
                case 19:
                    if (!mapKeyListener.uiSettings.isScrollGesturesEnabled()) {
                        return false;
                    }
                    mapKeyListener.transform.cancelTransitions();
                    mapKeyListener.transform.moveBy(0.0d, d, 0);
                    return true;
                case 20:
                    if (!mapKeyListener.uiSettings.isScrollGesturesEnabled()) {
                        return false;
                    }
                    mapKeyListener.transform.cancelTransitions();
                    mapKeyListener.transform.moveBy(0.0d, -d, 0);
                    return true;
                case 21:
                    if (!mapKeyListener.uiSettings.isScrollGesturesEnabled()) {
                        return false;
                    }
                    mapKeyListener.transform.cancelTransitions();
                    mapKeyListener.transform.moveBy(d, 0.0d, 0);
                    return true;
                case 22:
                    if (!mapKeyListener.uiSettings.isScrollGesturesEnabled()) {
                        return false;
                    }
                    mapKeyListener.transform.cancelTransitions();
                    mapKeyListener.transform.moveBy(-d, 0.0d, 0);
                    return true;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        keyEvent.startTracking();
        return true;
    }

    boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if ((i != 23 && i != 66) || this.uiSettings.isZoomGesturesEnabled() == 0) {
            return false;
        }
        this.mapGestureDetector.zoomOutAnimated(new PointF(this.uiSettings.getWidth() / 1073741824, this.uiSettings.getHeight() / 2.0f), true);
        return true;
    }

    boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.isCanceled() != null) {
            return false;
        }
        if ((i != 23 && i != 66) || this.uiSettings.isZoomGesturesEnabled() == 0) {
            return false;
        }
        this.mapGestureDetector.zoomInAnimated(new PointF(this.uiSettings.getWidth() / 1073741824, this.uiSettings.getHeight() / 2.0f), true);
        return true;
    }

    boolean onTrackballEvent(MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.currentTrackballLongPressTimeOut != null) {
                    this.currentTrackballLongPressTimeOut.cancel();
                    this.currentTrackballLongPressTimeOut = null;
                }
                this.currentTrackballLongPressTimeOut = new TrackballLongPressTimeOut();
                new Handler(Looper.getMainLooper()).postDelayed(this.currentTrackballLongPressTimeOut, (long) ViewConfiguration.getLongPressTimeout());
                return true;
            case 1:
                if (this.uiSettings.isZoomGesturesEnabled() == null) {
                    return false;
                }
                if (this.currentTrackballLongPressTimeOut != null) {
                    this.mapGestureDetector.zoomInAnimated(new PointF(this.uiSettings.getWidth() / 2.0f, this.uiSettings.getHeight() / 2.0f), true);
                }
                return true;
            case 2:
                if (!this.uiSettings.isScrollGesturesEnabled()) {
                    return false;
                }
                this.transform.cancelTransitions();
                this.transform.moveBy(((double) motionEvent.getX()) * -10.0d, ((double) motionEvent.getY()) * -10.0d, 0);
                return true;
            case 3:
                if (this.currentTrackballLongPressTimeOut != null) {
                    this.currentTrackballLongPressTimeOut.cancel();
                    this.currentTrackballLongPressTimeOut = null;
                }
                return true;
            default:
                return false;
        }
    }
}
