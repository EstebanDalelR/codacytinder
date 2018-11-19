package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.media.AudioManager;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.am */
public class am {
    /* renamed from: a */
    public static float m5199a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (((float) streamVolume) * 1.0f) / ((float) streamMaxVolume);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m5200a(Map<String, String> map, boolean z, boolean z2) {
        map.put(AudienceNetworkActivity.AUTOPLAY, z ? "1" : "0");
        map.put("inline", z2 ? "1" : "0");
    }
}
