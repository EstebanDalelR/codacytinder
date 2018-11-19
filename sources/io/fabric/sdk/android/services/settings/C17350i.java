package io.fabric.sdk.android.services.settings;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.persistence.C17347b;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.i */
class C17350i implements SettingsController {
    /* renamed from: a */
    private final C15667r f53079a;
    /* renamed from: b */
    private final SettingsJsonTransform f53080b;
    /* renamed from: c */
    private final CurrentTimeProvider f53081c;
    /* renamed from: d */
    private final CachedSettingsIo f53082d;
    /* renamed from: e */
    private final SettingsSpiCall f53083e;
    /* renamed from: f */
    private final C15611g f53084f;
    /* renamed from: g */
    private final PreferenceStore f53085g = new C17347b(this.f53084f);

    public C17350i(C15611g c15611g, C15667r c15667r, CurrentTimeProvider currentTimeProvider, SettingsJsonTransform settingsJsonTransform, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall) {
        this.f53084f = c15611g;
        this.f53079a = c15667r;
        this.f53081c = currentTimeProvider;
        this.f53080b = settingsJsonTransform;
        this.f53082d = cachedSettingsIo;
        this.f53083e = settingsSpiCall;
    }

    public C15665p loadSettingsData() {
        return loadSettingsData(SettingsCacheBehavior.USE_CACHE);
    }

    public C15665p loadSettingsData(SettingsCacheBehavior settingsCacheBehavior) {
        SettingsCacheBehavior settingsCacheBehavior2 = null;
        try {
            if (!(C15608c.m58561i() || m63419c())) {
                settingsCacheBehavior2 = m63414a(settingsCacheBehavior);
            }
            if (settingsCacheBehavior2 == null) {
                settingsCacheBehavior = this.f53083e.invoke(this.f53079a);
                if (settingsCacheBehavior != null) {
                    C15665p buildFromJson = this.f53080b.buildFromJson(this.f53081c, settingsCacheBehavior);
                    try {
                        this.f53082d.writeCachedSettings(buildFromJson.f48512g, settingsCacheBehavior);
                        m63415a(settingsCacheBehavior, "Loaded settings: ");
                        m63417a(m63416a());
                        settingsCacheBehavior2 = buildFromJson;
                    } catch (Exception e) {
                        settingsCacheBehavior = e;
                        settingsCacheBehavior2 = buildFromJson;
                        C15608c.m58560h().mo12794e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", settingsCacheBehavior);
                        return settingsCacheBehavior2;
                    }
                }
            }
            if (settingsCacheBehavior2 == null) {
                return m63414a(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e2) {
            settingsCacheBehavior = e2;
            C15608c.m58560h().mo12794e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", settingsCacheBehavior);
            return settingsCacheBehavior2;
        }
        return settingsCacheBehavior2;
    }

    /* renamed from: a */
    private C15665p m63414a(SettingsCacheBehavior settingsCacheBehavior) {
        C15665p c15665p = null;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            JSONObject readCachedSettings = this.f53082d.readCachedSettings();
            if (readCachedSettings != null) {
                C15665p buildFromJson = this.f53080b.buildFromJson(this.f53081c, readCachedSettings);
                if (buildFromJson != null) {
                    m63415a(readCachedSettings, "Loaded cached settings: ");
                    long currentTimeMillis = this.f53081c.getCurrentTimeMillis();
                    if (SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) == null) {
                        if (buildFromJson.m58823a(currentTimeMillis) != null) {
                            C15608c.m58560h().mo12791d("Fabric", "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C15608c.m58560h().mo12791d("Fabric", "Returning cached settings.");
                        return buildFromJson;
                    } catch (Exception e) {
                        settingsCacheBehavior = e;
                        c15665p = buildFromJson;
                        C15608c.m58560h().mo12794e("Fabric", "Failed to get cached settings", settingsCacheBehavior);
                        return c15665p;
                    }
                }
                C15608c.m58560h().mo12794e("Fabric", "Failed to transform cached settings data.", null);
                return null;
            }
            C15608c.m58560h().mo12791d("Fabric", "No cached settings data found.");
            return null;
        } catch (Exception e2) {
            settingsCacheBehavior = e2;
            C15608c.m58560h().mo12794e("Fabric", "Failed to get cached settings", settingsCacheBehavior);
            return c15665p;
        }
    }

    /* renamed from: a */
    private void m63415a(JSONObject jSONObject, String str) throws JSONException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(jSONObject.toString());
        C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
    }

    /* renamed from: a */
    String m63416a() {
        return CommonUtils.m58598a(CommonUtils.m58627m(this.f53084f.getContext()));
    }

    /* renamed from: b */
    String m63418b() {
        return this.f53085g.get().getString("existing_instance_identifier", "");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    boolean m63417a(String str) {
        Editor edit = this.f53085g.edit();
        edit.putString("existing_instance_identifier", str);
        return this.f53085g.save(edit);
    }

    /* renamed from: c */
    boolean m63419c() {
        return m63418b().equals(m63416a()) ^ 1;
    }
}
