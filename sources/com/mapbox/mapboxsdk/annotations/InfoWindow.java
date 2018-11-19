package com.mapbox.mapboxsdk.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.support.annotation.LayoutRes;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowCloseListener;
import java.lang.ref.WeakReference;

public class InfoWindow {
    private WeakReference<Marker> boundMarker;
    private PointF coordinates;
    private boolean isVisible;
    @LayoutRes
    private int layoutRes;
    private WeakReference<MapboxMap> mapboxMap;
    private float markerHeightOffset;
    private float markerWidthOffset;
    protected WeakReference<View> view;
    private float viewWidthOffset;

    /* renamed from: com.mapbox.mapboxsdk.annotations.InfoWindow$1 */
    class C58131 implements OnClickListener {
        C58131() {
        }

        public void onClick(View view) {
            MapboxMap mapboxMap = (MapboxMap) InfoWindow.this.mapboxMap.get();
            if (mapboxMap != null) {
                view = mapboxMap.getOnInfoWindowClickListener();
                boolean z = false;
                if (view != null) {
                    z = view.onInfoWindowClick(InfoWindow.this.getBoundMarker());
                }
                if (!z) {
                    InfoWindow.this.closeInfoWindow();
                }
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.annotations.InfoWindow$2 */
    class C58142 implements OnLongClickListener {
        C58142() {
        }

        public boolean onLongClick(View view) {
            MapboxMap mapboxMap = (MapboxMap) InfoWindow.this.mapboxMap.get();
            if (mapboxMap != null) {
                view = mapboxMap.getOnInfoWindowLongClickListener();
                if (view != null) {
                    view.onInfoWindowLongClick(InfoWindow.this.getBoundMarker());
                }
            }
            return true;
        }
    }

    InfoWindow(MapView mapView, int i, MapboxMap mapboxMap) {
        this.layoutRes = i;
        initialize(LayoutInflater.from(mapView.getContext()).inflate(i, mapView, false), mapboxMap);
    }

    InfoWindow(View view, MapboxMap mapboxMap) {
        initialize(view, mapboxMap);
    }

    private void initialize(View view, MapboxMap mapboxMap) {
        this.mapboxMap = new WeakReference(mapboxMap);
        this.isVisible = null;
        this.view = new WeakReference(view);
        view.setOnClickListener(new C58131());
        view.setOnLongClickListener(new C58142());
    }

    private void closeInfoWindow() {
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        Marker marker = (Marker) this.boundMarker.get();
        if (!(marker == null || mapboxMap == null)) {
            mapboxMap.deselectMarker(marker);
        }
        close();
    }

    InfoWindow open(MapView mapView, Marker marker, LatLng latLng, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        setBoundMarker(marker);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        View view = (View) this.view.get();
        if (!(view == null || mapboxMap == null)) {
            view.measure(0, 0);
            r0.markerHeightOffset = (float) ((-view.getMeasuredHeight()) + i4);
            r0.markerWidthOffset = (float) (-i3);
            r0.coordinates = mapboxMap.getProjection().toScreenLocation(latLng);
            float f = (float) i3;
            float measuredWidth = (r0.coordinates.x - ((float) (view.getMeasuredWidth() / 2))) + f;
            float measuredHeight = (r0.coordinates.y - ((float) view.getMeasuredHeight())) + ((float) i4);
            if (view instanceof BubbleLayout) {
                Resources resources = mapView.getContext().getResources();
                float measuredWidth2 = ((float) view.getMeasuredWidth()) + measuredWidth;
                float right = (float) mapView.getRight();
                float left = (float) mapView.getLeft();
                float dimension = resources.getDimension(C5812R.dimen.mapbox_infowindow_margin);
                float dimension2 = resources.getDimension(C5812R.dimen.mapbox_infowindow_tipview_width) / 2.0f;
                float measuredWidth3 = ((float) (view.getMeasuredWidth() / 2)) - dimension2;
                if (r0.coordinates.x >= 0.0f && r0.coordinates.x <= ((float) mapView.getWidth()) && r0.coordinates.y >= 0.0f && r0.coordinates.y <= ((float) mapView.getHeight())) {
                    float f2;
                    float measuredWidth4;
                    Object obj;
                    Object obj2;
                    if (measuredWidth2 > right) {
                        measuredWidth2 -= right;
                        f2 = measuredWidth - measuredWidth2;
                        measuredWidth3 += measuredWidth2 + dimension2;
                        measuredWidth4 = ((float) view.getMeasuredWidth()) + f2;
                        obj = 1;
                    } else {
                        f2 = measuredWidth;
                        measuredWidth4 = measuredWidth2;
                        obj = null;
                    }
                    if (measuredWidth < left) {
                        measuredWidth = left - measuredWidth;
                        f2 += measuredWidth;
                        measuredWidth3 -= measuredWidth + dimension2;
                        measuredWidth = f2;
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj != null) {
                        right -= measuredWidth4;
                        if (right < dimension) {
                            measuredWidth = dimension - right;
                            f2 -= measuredWidth;
                            measuredWidth3 += measuredWidth - dimension2;
                            measuredWidth = f2;
                        }
                    }
                    if (obj2 != null) {
                        measuredWidth -= left;
                        if (measuredWidth < dimension) {
                            dimension -= measuredWidth;
                            f2 += dimension;
                            measuredWidth3 -= dimension - dimension2;
                        }
                    }
                    measuredWidth = f2;
                }
                ((BubbleLayout) view).setArrowPosition(measuredWidth3);
            }
            view.setX(measuredWidth);
            view.setY(measuredHeight);
            r0.viewWidthOffset = (measuredWidth - r0.coordinates.x) - f;
            close();
            mapView.addView(view, layoutParams);
            r0.isVisible = true;
        }
        return r0;
    }

    InfoWindow close() {
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        if (this.isVisible && mapboxMap != null) {
            this.isVisible = false;
            View view = (View) this.view.get();
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            Marker boundMarker = getBoundMarker();
            OnInfoWindowCloseListener onInfoWindowCloseListener = mapboxMap.getOnInfoWindowCloseListener();
            if (onInfoWindowCloseListener != null) {
                onInfoWindowCloseListener.onInfoWindowClose(boundMarker);
            }
            setBoundMarker(null);
        }
        return this;
    }

    void adaptDefaultMarker(Marker marker, MapboxMap mapboxMap, MapView mapView) {
        View view = (View) this.view.get();
        if (view == null) {
            view = LayoutInflater.from(mapView.getContext()).inflate(this.layoutRes, mapView, false);
            initialize(view, mapboxMap);
        }
        this.mapboxMap = new WeakReference(mapboxMap);
        mapboxMap = marker.getTitle();
        TextView textView = (TextView) view.findViewById(C5812R.id.infowindow_title);
        if (TextUtils.isEmpty(mapboxMap)) {
            textView.setVisibility(8);
        } else {
            textView.setText(mapboxMap);
            textView.setVisibility(0);
        }
        marker = marker.getSnippet();
        TextView textView2 = (TextView) view.findViewById(C5812R.id.infowindow_description);
        if (TextUtils.isEmpty(marker) == null) {
            textView2.setText(marker);
            textView2.setVisibility(0);
            return;
        }
        textView2.setVisibility(8);
    }

    InfoWindow setBoundMarker(Marker marker) {
        this.boundMarker = new WeakReference(marker);
        return this;
    }

    Marker getBoundMarker() {
        if (this.boundMarker == null) {
            return null;
        }
        return (Marker) this.boundMarker.get();
    }

    public void update() {
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        Marker marker = (Marker) this.boundMarker.get();
        View view = (View) this.view.get();
        if (mapboxMap != null && marker != null && view != null) {
            this.coordinates = mapboxMap.getProjection().toScreenLocation(marker.getPosition());
            if (view instanceof BubbleLayout) {
                view.setX((this.coordinates.x + this.viewWidthOffset) - this.markerWidthOffset);
            } else {
                view.setX((this.coordinates.x - ((float) (view.getMeasuredWidth() / 2))) - this.markerWidthOffset);
            }
            view.setY(this.coordinates.y + this.markerHeightOffset);
        }
    }

    public View getView() {
        return this.view != null ? (View) this.view.get() : null;
    }

    boolean isVisible() {
        return this.isVisible;
    }
}
