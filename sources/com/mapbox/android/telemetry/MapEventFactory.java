package com.mapbox.android.telemetry;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mapbox.android.telemetry.Event.Type;
import java.util.HashMap;
import java.util.Map;

public class MapEventFactory {
    private static final String APPLICATION_CONTEXT_CANT_BE_NULL = "Create a MapboxTelemetry instance before calling this method.";
    private static final String LANDSCAPE = "Landscape";
    private static final String MAP_STATE_ILLEGAL_NULL = "MapState cannot be null.";
    private static final String NOT_A_GESTURE_MAP_EVENT_TYPE = "Type must be a gesture map event.";
    private static final String NOT_A_LOAD_MAP_EVENT_TYPE = "Type must be a load map event.";
    private static final String NO_CARRIER = "EMPTY_CARRIER";
    private static final int NO_NETWORK = -1;
    private static final Map<Integer, String> ORIENTATIONS = new C57861();
    private static final String PORTRAIT = "Portrait";
    private final Map<Type, MapBuildEvent> BUILD_EVENT_MAP_GESTURE = new C57872();

    /* renamed from: com.mapbox.android.telemetry.MapEventFactory$1 */
    static class C57861 extends HashMap<Integer, String> {
        C57861() {
            put(Integer.valueOf(2), MapEventFactory.LANDSCAPE);
            put(Integer.valueOf(1), MapEventFactory.PORTRAIT);
        }
    }

    /* renamed from: com.mapbox.android.telemetry.MapEventFactory$2 */
    class C57872 extends HashMap<Type, MapBuildEvent> {

        /* renamed from: com.mapbox.android.telemetry.MapEventFactory$2$1 */
        class C70831 implements MapBuildEvent {
            C70831() {
            }

            public Event build(MapState mapState) {
                return MapEventFactory.this.buildMapClickEvent(mapState);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.MapEventFactory$2$2 */
        class C70842 implements MapBuildEvent {
            C70842() {
            }

            public Event build(MapState mapState) {
                return MapEventFactory.this.buildMapDragendEvent(mapState);
            }
        }

        C57872() {
            put(Type.MAP_CLICK, new C70831());
            put(Type.MAP_DRAGEND, new C70842());
        }
    }

    public MapEventFactory() {
        if (MapboxTelemetry.applicationContext == null) {
            throw new IllegalStateException(APPLICATION_CONTEXT_CANT_BE_NULL);
        }
    }

    public Event createMapLoadEvent(Type type) {
        checkLoad(type);
        return buildMapLoadEvent();
    }

    public Event createMapGestureEvent(Type type, MapState mapState) {
        checkGesture(type, mapState);
        return ((MapBuildEvent) this.BUILD_EVENT_MAP_GESTURE.get(type)).build(mapState);
    }

    private MapClickEvent buildMapClickEvent(MapState mapState) {
        MapClickEvent mapClickEvent = new MapClickEvent(mapState);
        mapClickEvent.setOrientation(obtainOrientation(MapboxTelemetry.applicationContext));
        mapClickEvent.setCarrier(obtainCellularCarrier(MapboxTelemetry.applicationContext));
        mapClickEvent.setWifi(obtainConnectedToWifi(MapboxTelemetry.applicationContext).booleanValue());
        return mapClickEvent;
    }

    private MapDragendEvent buildMapDragendEvent(MapState mapState) {
        MapDragendEvent mapDragendEvent = new MapDragendEvent(mapState);
        mapDragendEvent.setOrientation(obtainOrientation(MapboxTelemetry.applicationContext));
        mapDragendEvent.setCarrier(obtainCellularCarrier(MapboxTelemetry.applicationContext));
        mapDragendEvent.setWifi(obtainConnectedToWifi(MapboxTelemetry.applicationContext).booleanValue());
        return mapDragendEvent;
    }

    private String obtainOrientation(Context context) {
        return (String) ORIENTATIONS.get(Integer.valueOf(context.getResources().getConfiguration().orientation));
    }

    private float obtainAccessibilityFontScaleSize(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    private String obtainCellularCarrier(Context context) {
        context = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        return TextUtils.isEmpty(context) ? NO_CARRIER : context;
    }

    private float obtainDisplayDensity(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    private Boolean obtainConnectedToWifi(Context context) {
        return Boolean.valueOf(isConnectedToWifi(context));
    }

    private boolean isConnectedToWifi(android.content.Context r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r2 = r2.getApplicationContext();	 Catch:{ Exception -> 0x0015 }
        r0 = "wifi";	 Catch:{ Exception -> 0x0015 }
        r2 = r2.getSystemService(r0);	 Catch:{ Exception -> 0x0015 }
        r2 = (android.net.wifi.WifiManager) r2;	 Catch:{ Exception -> 0x0015 }
        r0 = r2.getConnectionInfo();	 Catch:{ Exception -> 0x0015 }
        r2 = r1.isWifiConnected(r2, r0);	 Catch:{ Exception -> 0x0015 }
        return r2;
    L_0x0015:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.telemetry.MapEventFactory.isConnectedToWifi(android.content.Context):boolean");
    }

    private boolean isWifiConnected(WifiManager wifiManager, WifiInfo wifiInfo) {
        return (wifiManager.isWifiEnabled() == null || networkConnected(wifiInfo) == null) ? null : true;
    }

    private boolean networkConnected(WifiInfo wifiInfo) {
        return wifiInfo.getNetworkId() != -1 ? true : null;
    }

    private MapLoadEvent buildMapLoadEvent() {
        MapLoadEvent mapLoadEvent = new MapLoadEvent(TelemetryUtils.retrieveVendorId());
        mapLoadEvent.setOrientation(obtainOrientation(MapboxTelemetry.applicationContext));
        mapLoadEvent.setAccessibilityFontScale(obtainAccessibilityFontScaleSize(MapboxTelemetry.applicationContext));
        mapLoadEvent.setCarrier(obtainCellularCarrier(MapboxTelemetry.applicationContext));
        mapLoadEvent.setResolution(obtainDisplayDensity(MapboxTelemetry.applicationContext));
        mapLoadEvent.setWifi(obtainConnectedToWifi(MapboxTelemetry.applicationContext).booleanValue());
        return mapLoadEvent;
    }

    private void checkLoad(Type type) {
        if (type != Type.MAP_LOAD) {
            throw new IllegalArgumentException(NOT_A_LOAD_MAP_EVENT_TYPE);
        }
    }

    private void checkGesture(Type type, MapState mapState) {
        checkGestureMapEvent(type);
        isNotNull(mapState);
    }

    private void checkGestureMapEvent(Type type) {
        if (Event.mapGestureEventTypes.contains(type) == null) {
            throw new IllegalArgumentException(NOT_A_GESTURE_MAP_EVENT_TYPE);
        }
    }

    private void isNotNull(MapState mapState) {
        if (mapState == null) {
            throw new IllegalArgumentException(MAP_STATE_ILLEGAL_NULL);
        }
    }
}
