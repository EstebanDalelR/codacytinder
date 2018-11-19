package com.foursquare.pilgrim;

import android.net.wifi.ScanResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.foursquare.internal.util.C1947i;
import com.foursquare.pilgrim.AutoValue_WifiScanResult.GsonTypeAdapter;
import com.foursquare.pilgrim.C3513a.C3512a;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class WifiScanResult {

    /* renamed from: com.foursquare.pilgrim.WifiScanResult$a */
    interface C1961a {
        @NonNull
        /* renamed from: a */
        C1961a mo2029a(int i);

        @NonNull
        /* renamed from: a */
        C1961a mo2030a(@Nullable String str);

        @NonNull
        /* renamed from: a */
        WifiScanResult mo2031a();

        @NonNull
        /* renamed from: b */
        C1961a mo2032b(int i);

        @NonNull
        /* renamed from: b */
        C1961a mo2033b(@Nullable String str);
    }

    @Nullable
    public abstract String bssid();

    public abstract int frequency();

    public abstract int rssi();

    @Nullable
    public abstract String ssid();

    public abstract long timestamp();

    public static WifiScanResult create(@NonNull ScanResult scanResult) {
        return new C3512a().m13299a(C1947i.m6837a().mo2013a(scanResult) * 1000).mo2030a(scanResult.SSID).mo2033b(scanResult.BSSID).mo2029a(scanResult.frequency).mo2032b(scanResult.level).mo2031a();
    }

    public static TypeAdapter<WifiScanResult> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
