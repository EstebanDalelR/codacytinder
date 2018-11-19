package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class IdManager {
    /* renamed from: e */
    private static final Pattern f48336e = Pattern.compile("[^\\p{Alnum}]");
    /* renamed from: f */
    private static final String f48337f = Pattern.quote("/");
    /* renamed from: a */
    C15618c f48338a;
    /* renamed from: b */
    C15617b f48339b;
    /* renamed from: c */
    boolean f48340c;
    /* renamed from: d */
    C15627j f48341d;
    /* renamed from: g */
    private final ReentrantLock f48342g = new ReentrantLock();
    /* renamed from: h */
    private final C15628k f48343h;
    /* renamed from: i */
    private final boolean f48344i;
    /* renamed from: j */
    private final boolean f48345j;
    /* renamed from: k */
    private final Context f48346k;
    /* renamed from: l */
    private final String f48347l;
    /* renamed from: m */
    private final String f48348m;
    /* renamed from: n */
    private final Collection<C15611g> f48349n;

    public enum DeviceIdentifierType {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        private DeviceIdentifierType(int i) {
            this.protobufIndex = i;
        }
    }

    public IdManager(Context context, String str, String str2, Collection<C15611g> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection == null) {
            throw new IllegalArgumentException("kits must not be null");
        } else {
            this.f48346k = context;
            this.f48347l = str;
            this.f48348m = str2;
            this.f48349n = collection;
            this.f48343h = new C15628k();
            this.f48338a = new C15618c(context);
            this.f48341d = new C15627j();
            this.f48344i = CommonUtils.m58606a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (this.f48344i == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Device ID collection disabled for ");
                stringBuilder.append(context.getPackageName());
                C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
            }
            this.f48345j = CommonUtils.m58606a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (this.f48345j == null) {
                collection = new StringBuilder();
                collection.append("User information collection disabled for ");
                collection.append(context.getPackageName());
                C15608c.m58560h().mo12791d("Fabric", collection.toString());
            }
        }
    }

    /* renamed from: a */
    public boolean m58636a() {
        return this.f48345j;
    }

    /* renamed from: a */
    private String m58630a(String str) {
        return str == null ? null : f48336e.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: b */
    public String m58637b() {
        String str = this.f48348m;
        if (str != null) {
            return str;
        }
        SharedPreferences a = CommonUtils.m58589a(this.f48346k);
        m58634b(a);
        String string = a.getString("crashlytics.installation.id", null);
        return string == null ? m58629a(a) : string;
    }

    /* renamed from: c */
    public String m58638c() {
        return this.f48347l;
    }

    /* renamed from: d */
    public String m58639d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m58640e());
        stringBuilder.append("/");
        stringBuilder.append(m58641f());
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public String m58640e() {
        return m58633b(VERSION.RELEASE);
    }

    /* renamed from: f */
    public String m58641f() {
        return m58633b(VERSION.INCREMENTAL);
    }

    /* renamed from: g */
    public String m58642g() {
        return String.format(Locale.US, "%s/%s", new Object[]{m58633b(Build.MANUFACTURER), m58633b(Build.MODEL)});
    }

    /* renamed from: b */
    private String m58633b(String str) {
        return str.replaceAll(f48337f, "");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private String m58629a(SharedPreferences sharedPreferences) {
        this.f48342g.lock();
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string == null) {
                string = m58630a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            this.f48342g.unlock();
            return string;
        } catch (Throwable th) {
            this.f48342g.unlock();
        }
    }

    /* renamed from: b */
    private void m58634b(SharedPreferences sharedPreferences) {
        C15617b l = m58647l();
        if (l != null) {
            m58631a(sharedPreferences, l.f48363a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m58631a(SharedPreferences sharedPreferences, String str) {
        this.f48342g.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                Object string = sharedPreferences.getString("crashlytics.advertising.id", null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString("crashlytics.advertising.id", str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str).commit();
                }
                this.f48342g.unlock();
            }
        } finally {
            this.f48342g.unlock();
        }
    }

    /* renamed from: h */
    public Map<DeviceIdentifierType, String> m58643h() {
        Map hashMap = new HashMap();
        for (C15611g c15611g : this.f48349n) {
            if (c15611g instanceof DeviceIdentifierProvider) {
                for (Entry entry : ((DeviceIdentifierProvider) c15611g).getDeviceIdentifiers().entrySet()) {
                    m58632a(hashMap, (DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: i */
    public String m58644i() {
        return this.f48343h.m58704a(this.f48346k);
    }

    /* renamed from: j */
    public Boolean m58645j() {
        return m58646k() ? m58635m() : null;
    }

    /* renamed from: a */
    private void m58632a(Map<DeviceIdentifierType, String> map, DeviceIdentifierType deviceIdentifierType, String str) {
        if (str != null) {
            map.put(deviceIdentifierType, str);
        }
    }

    /* renamed from: k */
    protected boolean m58646k() {
        return this.f48344i && !this.f48341d.m58703b(this.f48346k);
    }

    /* renamed from: l */
    synchronized C15617b m58647l() {
        if (!this.f48340c) {
            this.f48339b = this.f48338a.m58681a();
            this.f48340c = true;
        }
        return this.f48339b;
    }

    /* renamed from: m */
    private Boolean m58635m() {
        C15617b l = m58647l();
        return l != null ? Boolean.valueOf(l.f48364b) : null;
    }
}
