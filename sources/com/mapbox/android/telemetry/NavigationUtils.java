package com.mapbox.android.telemetry;

import android.media.AudioManager;

class NavigationUtils {
    private static final int BRIGHTNESS_EXCEPTION_VALUE = -1;
    private static final double PERCENT_NORMALIZER = 100.0d;
    private static final double SCREEN_BRIGHTNESS_MAX = 255.0d;

    NavigationUtils() {
    }

    static int obtainVolumeLevel() {
        AudioManager audioManager = (AudioManager) MapboxTelemetry.applicationContext.getSystemService("audio");
        return (int) Math.floor((((double) audioManager.getStreamVolume(3)) * PERCENT_NORMALIZER) / ((double) audioManager.getStreamMaxVolume(3)));
    }

    static int obtainScreenBrightness() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.mapbox.android.telemetry.MapboxTelemetry.applicationContext;	 Catch:{ SettingNotFoundException -> 0x0011 }
        r0 = r0.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x0011 }
        r1 = "screen_brightness";	 Catch:{ SettingNotFoundException -> 0x0011 }
        r0 = android.provider.Settings.System.getInt(r0, r1);	 Catch:{ SettingNotFoundException -> 0x0011 }
        r0 = calculateScreenBrightnessPercentage(r0);	 Catch:{ SettingNotFoundException -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r0 = -1;
    L_0x0012:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.android.telemetry.NavigationUtils.obtainScreenBrightness():int");
    }

    static String obtainAudioType() {
        return new AudioTypeChain().setup().obtainAudioType(MapboxTelemetry.applicationContext);
    }

    private static int calculateScreenBrightnessPercentage(int i) {
        return (int) Math.floor((((double) i) * PERCENT_NORMALIZER) / SCREEN_BRIGHTNESS_MAX);
    }
}
