package com.foursquare.internal.util;

import android.annotation.TargetApi;
import android.net.wifi.ScanResult;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

@TargetApi(17)
/* renamed from: com.foursquare.internal.util.k */
public class C4229k extends C3504j {
    /* renamed from: a */
    public long mo2013a(ScanResult scanResult) {
        return TimeUnit.MILLISECONDS.toSeconds((System.currentTimeMillis() - SystemClock.elapsedRealtime()) + TimeUnit.MICROSECONDS.toMillis(scanResult.timestamp));
    }
}
