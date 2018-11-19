package com.foursquare.pilgrim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

final class bh {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: a */
    private static Context f5360a;
    /* renamed from: b */
    private static SimpleDateFormat f5361b = new SimpleDateFormat("yyyyMMdd", Locale.US);

    bh() {
    }

    /* renamed from: a */
    static void m7111a(@NonNull Context context) {
        f5360a = context;
    }

    /* renamed from: a */
    static long m7108a() {
        return m7137m().getLong("last_regions_update", 0);
    }

    /* renamed from: a */
    static void m7110a(long j) {
        m7137m().edit().putLong("last_regions_update", j).apply();
    }

    /* renamed from: b */
    static long m7116b() {
        return m7137m().getLong("last_battery_reading", 0);
    }

    /* renamed from: b */
    static void m7117b(long j) {
        m7137m().edit().putLong("last_battery_reading", j).apply();
    }

    /* renamed from: c */
    static boolean m7123c() {
        return m7137m().getBoolean("pilgrimsdk_is_enabled", false);
    }

    /* renamed from: a */
    static void m7113a(boolean z) {
        m7137m().edit().putBoolean("pilgrimsdk_is_enabled", z).apply();
    }

    /* renamed from: d */
    static boolean m7126d() {
        return m7137m().getBoolean("pilgrimsdk_has_sent_init", false);
    }

    /* renamed from: b */
    static void m7119b(boolean z) {
        m7137m().edit().putBoolean("pilgrimsdk_has_sent_init", z).apply();
    }

    /* renamed from: e */
    static long m7128e() {
        return m7137m().getLong("pilgrimsdk_last_status_check_time", 0);
    }

    /* renamed from: c */
    static void m7121c(long j) {
        m7137m().edit().putLong("pilgrimsdk_last_status_check_time", j).apply();
    }

    /* renamed from: a */
    static void m7109a(int i) {
        m7137m().edit().putInt("pilgrimsdk_failed_request_retries", i).apply();
    }

    /* renamed from: d */
    static void m7124d(long j) {
        m7137m().edit().putLong("pilgrimsdk_failed_request_submit_time", j).apply();
    }

    /* renamed from: f */
    static int m7129f() {
        return m7137m().getInt("pilgrimsdk_failed_request_retries", 0);
    }

    /* renamed from: g */
    static long m7131g() {
        return m7137m().getLong("pilgrimsdk_failed_request_submit_time", 0);
    }

    /* renamed from: h */
    static String m7132h() {
        SharedPreferences m = m7137m();
        String string = m.getString("pilgrimsdk_uuid", "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        string = UUID.randomUUID().toString();
        m.edit().putString("pilgrimsdk_uuid", string).apply();
        return string;
    }

    /* renamed from: i */
    static void m7133i() {
        m7109a(0);
        m7124d(0);
        m7113a(false);
        m7110a(0);
    }

    /* renamed from: j */
    static String m7134j() {
        return m7137m().getString("notif_cfg_checksum", null);
    }

    /* renamed from: a */
    static void m7112a(String str) {
        m7137m().edit().putString("notif_cfg_checksum", str).apply();
    }

    /* renamed from: k */
    static byte[] m7135k() {
        String string = m7137m().getString("pilgrimsdk_install_bytes", null);
        if (string == null) {
            return null;
        }
        return Base64.decode(string, 2);
    }

    /* renamed from: a */
    static void m7114a(byte[] bArr) {
        m7137m().edit().putString("pilgrimsdk_install_bytes", Base64.encodeToString(bArr, 2)).apply();
    }

    /* renamed from: a */
    static int m7107a(Date date) {
        SharedPreferences m = m7137m();
        if (m7115a(date, new Date(m.getLong("last_radar_ping_timestamp", 0))) != null) {
            return m.getInt("total_radar_ping_count", 0);
        }
        return 0;
    }

    /* renamed from: b */
    static void m7118b(Date date) {
        SharedPreferences m = m7137m();
        if (m7115a(date, new Date(m.getLong("last_radar_ping_timestamp", 0)))) {
            m.edit().putInt("total_radar_ping_count", m.getInt("total_radar_ping_count", 0) + 1).apply();
            return;
        }
        m.edit().putInt("total_radar_ping_count", 0).apply();
        m.edit().putLong("last_radar_ping_timestamp", date.getTime()).apply();
    }

    /* renamed from: c */
    static int m7120c(Date date) {
        SharedPreferences m = m7137m();
        if (m7115a(date, new Date(m.getLong("pilgrim_sdk_first_exception_timestamp", 0))) != null) {
            return m.getInt("pilgrim_sdk_total_exception_count", 0);
        }
        return 0;
    }

    /* renamed from: d */
    static void m7125d(Date date) {
        SharedPreferences m = m7137m();
        if (m7115a(date, new Date(m.getLong("pilgrim_sdk_first_exception_timestamp", 0)))) {
            m.edit().putInt("pilgrim_sdk_total_exception_count", m.getInt("pilgrim_sdk_total_exception_count", 0) + 1).apply();
            return;
        }
        m.edit().putInt("pilgrim_sdk_total_exception_count", 0).apply();
        m.edit().putLong("pilgrim_sdk_first_exception_timestamp", date.getTime()).apply();
    }

    /* renamed from: e */
    static int m7127e(Date date) {
        SharedPreferences m = m7137m();
        if (m7115a(date, new Date(m.getLong("first_fatal_submit_timestamp", 0))) != null) {
            return m.getInt("daily_max_fatal_submit_count", 0);
        }
        return 0;
    }

    /* renamed from: f */
    static void m7130f(Date date) {
        SharedPreferences m = m7137m();
        if (m7115a(date, new Date(m.getLong("first_fatal_submit_timestamp", 0)))) {
            m.edit().putInt("daily_max_fatal_submit_count", m.getInt("daily_max_fatal_submit_count", 0) + 1).apply();
            return;
        }
        m.edit().putInt("daily_max_fatal_submit_count", 0).apply();
        m.edit().putLong("first_fatal_submit_timestamp", date.getTime()).apply();
    }

    /* renamed from: l */
    static boolean m7136l() {
        return m7137m().getBoolean("pilgrimsdk_first_enable", true);
    }

    /* renamed from: c */
    static void m7122c(boolean z) {
        m7137m().edit().putBoolean("pilgrimsdk_first_enable", z).apply();
    }

    /* renamed from: m */
    static SharedPreferences m7137m() {
        if (f5360a != null) {
            return f5360a.getSharedPreferences("pilgrimsdk_prefs", 0);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bh.class.getSimpleName());
        stringBuilder.append(".context not initialized yet");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    private static boolean m7115a(Date date, Date date2) {
        return f5361b.format(date).equals(f5361b.format(date2));
    }
}
