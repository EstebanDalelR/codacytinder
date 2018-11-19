package com.mapbox.android.telemetry;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okio.C18549c;

public class TelemetryUtils {
    private static final String BACKGROUND = "Background";
    private static final String CODE_DIVISION_MULTIPLE_ACCESS = "CDMA";
    private static final String DATE_AND_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final int DEFAULT_BATTERY_LEVEL = -1;
    private static final Locale DEFAULT_LOCALE = Locale.US;
    private static final String EMPTY_STRING = "";
    private static final String ENHANCED_DATA_GSM_EVOLUTION = "EDGE";
    private static final String ENHANCED_HIGH_RATE_PACKET_DATA = "EHRPD";
    private static final String EVOLUTION_DATA_OPTIMIZED_0 = "EVDO_0";
    private static final String EVOLUTION_DATA_OPTIMIZED_A = "EVDO_A";
    private static final String EVOLUTION_DATA_OPTIMIZED_B = "EVDO_B";
    private static final String FOREGROUND = "Foreground";
    private static final String GENERAL_PACKET_RADIO_SERVICE = "GPRS";
    private static final String HIGH_SPEED_DOWNLINK_PACKET_ACCESS = "HSDPA";
    private static final String HIGH_SPEED_PACKET_ACCESS = "HSPA";
    private static final String HIGH_SPEED_PACKET_ACCESS_PLUS = "HSPAP";
    private static final String HIGH_SPEED_UNLINK_PACKET_ACCESS = "HSUPA";
    private static final String INTEGRATED_DIGITAL_ENHANCED_NETWORK = "IDEN";
    private static final String LONG_TERM_EVOLUTION = "LTE";
    static final String MAPBOX_SHARED_PREFERENCES = "MapboxSharedPreferences";
    static final String MAPBOX_SHARED_PREFERENCE_KEY_VENDOR_ID = "mapboxVendorId";
    private static final Map<Integer, String> NETWORKS = new C58111();
    private static final String NO_STATE = "";
    private static final int PERCENT_SCALE = 100;
    private static final String SINGLE_CARRIER_RTT = "1xRTT";
    private static final String THREE_STRING_FORMAT = "%s/%s/%s";
    private static final String TWO_STRING_FORMAT = "%s %s";
    private static final int UNAVAILABLE_BATTERY_LEVEL = -1;
    private static final String UNIVERSAL_MOBILE_TELCO_SERVICE = "UMTS";
    private static final String UNKNOWN = "Unknown";
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_AND_TIME_PATTERN, Locale.US);

    /* renamed from: com.mapbox.android.telemetry.TelemetryUtils$1 */
    static class C58111 extends HashMap<Integer, String> {
        C58111() {
            put(Integer.valueOf(7), TelemetryUtils.SINGLE_CARRIER_RTT);
            put(Integer.valueOf(4), TelemetryUtils.CODE_DIVISION_MULTIPLE_ACCESS);
            put(Integer.valueOf(2), TelemetryUtils.ENHANCED_DATA_GSM_EVOLUTION);
            put(Integer.valueOf(14), TelemetryUtils.ENHANCED_HIGH_RATE_PACKET_DATA);
            put(Integer.valueOf(5), TelemetryUtils.EVOLUTION_DATA_OPTIMIZED_0);
            put(Integer.valueOf(6), TelemetryUtils.EVOLUTION_DATA_OPTIMIZED_A);
            put(Integer.valueOf(12), TelemetryUtils.EVOLUTION_DATA_OPTIMIZED_B);
            put(Integer.valueOf(1), TelemetryUtils.GENERAL_PACKET_RADIO_SERVICE);
            put(Integer.valueOf(8), TelemetryUtils.HIGH_SPEED_DOWNLINK_PACKET_ACCESS);
            put(Integer.valueOf(10), TelemetryUtils.HIGH_SPEED_PACKET_ACCESS);
            put(Integer.valueOf(15), TelemetryUtils.HIGH_SPEED_PACKET_ACCESS_PLUS);
            put(Integer.valueOf(9), TelemetryUtils.HIGH_SPEED_UNLINK_PACKET_ACCESS);
            put(Integer.valueOf(11), TelemetryUtils.INTEGRATED_DIGITAL_ENHANCED_NETWORK);
            put(Integer.valueOf(13), TelemetryUtils.LONG_TERM_EVOLUTION);
            put(Integer.valueOf(3), TelemetryUtils.UNIVERSAL_MOBILE_TELCO_SERVICE);
            put(Integer.valueOf(0), TelemetryUtils.UNKNOWN);
        }
    }

    public static String toHumanReadableAscii(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                C18549c c18549c = new C18549c();
                c18549c.a(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    int i2 = (codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2;
                    c18549c.a(i2);
                    i += Character.charCount(codePointAt2);
                }
                return c18549c.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    public static String obtainUniversalUniqueIdentifier() {
        return UUID.randomUUID().toString();
    }

    static String obtainApplicationState() {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) MapboxTelemetry.applicationContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "";
        }
        String packageName = MapboxTelemetry.applicationContext.getPackageName();
        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return FOREGROUND;
            }
        }
        return BACKGROUND;
    }

    static int obtainBatteryLevel() {
        Intent registerBatteryUpdates = registerBatteryUpdates(MapboxTelemetry.applicationContext);
        if (registerBatteryUpdates == null) {
            return -1;
        }
        return Math.round((((float) registerBatteryUpdates.getIntExtra("level", -1)) / ((float) registerBatteryUpdates.getIntExtra("scale", -1))) * 100.0f);
    }

    static boolean isPluggedIn() {
        Intent registerBatteryUpdates = registerBatteryUpdates(MapboxTelemetry.applicationContext);
        boolean z = false;
        if (registerBatteryUpdates == null) {
            return false;
        }
        int intExtra = registerBatteryUpdates.getIntExtra("plugged", -1);
        Object obj = intExtra == 2 ? 1 : null;
        Object obj2 = intExtra == 1 ? 1 : null;
        if (!(obj == null && obj2 == null)) {
            z = true;
        }
        return z;
    }

    static String obtainCellularNetworkType() {
        return (String) NETWORKS.get(Integer.valueOf(((TelephonyManager) MapboxTelemetry.applicationContext.getSystemService("phone")).getNetworkType()));
    }

    static String obtainCurrentDate() {
        return dateFormat.format(new Date());
    }

    static String generateCreateDateFormatted(Date date) {
        return dateFormat.format(date);
    }

    static String createFullUserAgent(String str, Context context) {
        return TextUtils.isEmpty(obtainApplicationIdentifier(context)) != null ? str : toHumanReadableAscii(String.format(DEFAULT_LOCALE, TWO_STRING_FORMAT, new Object[]{obtainApplicationIdentifier(context), str}));
    }

    static boolean isEmpty(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }

    static String retrieveVendorId() {
        String string = obtainSharedPreferences().getString(MAPBOX_SHARED_PREFERENCE_KEY_VENDOR_ID, "");
        return isEmpty(string) ? updateVendorId() : string;
    }

    static SharedPreferences obtainSharedPreferences() {
        return MapboxTelemetry.applicationContext.getSharedPreferences(MAPBOX_SHARED_PREFERENCES, 0);
    }

    private static String updateVendorId() {
        Editor edit = obtainSharedPreferences().edit();
        String obtainUniversalUniqueIdentifier = obtainUniversalUniqueIdentifier();
        edit.putString(MAPBOX_SHARED_PREFERENCE_KEY_VENDOR_ID, obtainUniversalUniqueIdentifier);
        edit.apply();
        return obtainUniversalUniqueIdentifier;
    }

    private static java.lang.String obtainApplicationIdentifier(android.content.Context r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r5.getPackageName();	 Catch:{ Exception -> 0x0029 }
        r5 = r5.getPackageManager();	 Catch:{ Exception -> 0x0029 }
        r1 = 0;	 Catch:{ Exception -> 0x0029 }
        r5 = r5.getPackageInfo(r0, r1);	 Catch:{ Exception -> 0x0029 }
        r2 = DEFAULT_LOCALE;	 Catch:{ Exception -> 0x0029 }
        r3 = "%s/%s/%s";	 Catch:{ Exception -> 0x0029 }
        r4 = 3;	 Catch:{ Exception -> 0x0029 }
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0029 }
        r4[r1] = r0;	 Catch:{ Exception -> 0x0029 }
        r0 = 1;	 Catch:{ Exception -> 0x0029 }
        r1 = r5.versionName;	 Catch:{ Exception -> 0x0029 }
        r4[r0] = r1;	 Catch:{ Exception -> 0x0029 }
        r0 = 2;	 Catch:{ Exception -> 0x0029 }
        r5 = r5.versionCode;	 Catch:{ Exception -> 0x0029 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x0029 }
        r4[r0] = r5;	 Catch:{ Exception -> 0x0029 }
        r5 = java.lang.String.format(r2, r3, r4);	 Catch:{ Exception -> 0x0029 }
        return r5;
    L_0x0029:
        r5 = "";
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.telemetry.TelemetryUtils.obtainApplicationIdentifier(android.content.Context):java.lang.String");
    }

    private static Intent registerBatteryUpdates(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    static boolean isServiceRunning(Class<?> cls) {
        for (RunningServiceInfo runningServiceInfo : ((ActivityManager) MapboxTelemetry.applicationContext.getSystemService("activity")).getRunningServices(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return null;
    }
}
