package io.fabric.sdk.android.services.settings;

import com.crashlytics.android.beta.BuildConfig;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.events.C15645a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.j */
class C17351j implements SettingsJsonTransform {
    C17351j() {
    }

    public C15665p buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C15665p(m63420a(currentTimeProvider, (long) optInt2, jSONObject), m63421a(jSONObject.getJSONObject("app")), m63432e(jSONObject.getJSONObject("session")), m63433f(jSONObject.getJSONObject("prompt")), m63430c(jSONObject.getJSONObject("features")), m63431d(jSONObject.getJSONObject("analytics")), m63434g(jSONObject.getJSONObject(BuildConfig.ARTIFACT_ID)), optInt, optInt2);
    }

    public JSONObject toJson(C15665p c15665p) throws JSONException {
        return new JSONObject().put(ManagerWebServices.PARAM_EXPIRES_AT, c15665p.f48512g).put("cache_duration", c15665p.f48514i).put("settings_version", c15665p.f48513h).put("features", m63426a(c15665p.f48509d)).put("analytics", m63422a(c15665p.f48510e)).put(BuildConfig.ARTIFACT_ID, m63425a(c15665p.f48511f)).put("app", m63424a(c15665p.f48506a)).put("session", m63428a(c15665p.f48507b)).put("prompt", m63427a(c15665p.f48508c));
    }

    /* renamed from: a */
    private C15659e m63421a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("identifier");
        String string2 = jSONObject.getString("status");
        String string3 = jSONObject.getString("url");
        String string4 = jSONObject.getString("reports_url");
        String string5 = jSONObject.getString("ndk_reports_url");
        boolean optBoolean = jSONObject.optBoolean("update_required", false);
        jSONObject = (jSONObject.has(AnalyticsConstants.VALUE_SHARE_METHOD_ICON) && jSONObject.getJSONObject(AnalyticsConstants.VALUE_SHARE_METHOD_ICON).has("hash")) ? m63429b(jSONObject.getJSONObject(AnalyticsConstants.VALUE_SHARE_METHOD_ICON)) : null;
        return new C15659e(string, string2, string3, string4, string5, optBoolean, jSONObject);
    }

    /* renamed from: b */
    private C15657c m63429b(JSONObject jSONObject) throws JSONException {
        return new C15657c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: c */
    private C15661l m63430c(JSONObject jSONObject) {
        return new C15661l(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false), jSONObject.optBoolean("firebase_crashlytics_enabled", false));
    }

    /* renamed from: d */
    private C15656b m63431d(JSONObject jSONObject) {
        return new C15656b(jSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", C15645a.MAX_BYTE_SIZE_PER_FILE), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("forward_to_google_analytics", false), jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
    }

    /* renamed from: e */
    private C15664o m63432e(JSONObject jSONObject) throws JSONException {
        return new C15664o(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
    }

    /* renamed from: f */
    private C15663n m63433f(JSONObject jSONObject) throws JSONException {
        return new C15663n(jSONObject.optString(ManagerWebServices.PARAM_JOB_TITLE, "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
    }

    /* renamed from: g */
    private C15660f m63434g(JSONObject jSONObject) throws JSONException {
        return new C15660f(jSONObject.optString("update_endpoint", C15666q.f48515a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    /* renamed from: a */
    private long m63420a(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(ManagerWebServices.PARAM_EXPIRES_AT)) {
            return jSONObject.getLong(ManagerWebServices.PARAM_EXPIRES_AT);
        }
        return currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    /* renamed from: a */
    private JSONObject m63424a(C15659e c15659e) throws JSONException {
        JSONObject put = new JSONObject().put("identifier", c15659e.f48474a).put("status", c15659e.f48475b).put("url", c15659e.f48476c).put("reports_url", c15659e.f48477d).put("ndk_reports_url", c15659e.f48478e).put("update_required", c15659e.f48479f);
        if (c15659e.f48480g != null) {
            put.put(AnalyticsConstants.VALUE_SHARE_METHOD_ICON, m63423a(c15659e.f48480g));
        }
        return put;
    }

    /* renamed from: a */
    private JSONObject m63423a(C15657c c15657c) throws JSONException {
        return new JSONObject().put("hash", c15657c.f48460a).put("width", c15657c.f48461b).put("height", c15657c.f48462c);
    }

    /* renamed from: a */
    private JSONObject m63426a(C15661l c15661l) throws JSONException {
        return new JSONObject().put("collect_logged_exceptions", c15661l.f48484b).put("collect_reports", c15661l.f48485c).put("collect_analytics", c15661l.f48486d);
    }

    /* renamed from: a */
    private JSONObject m63428a(C15664o c15664o) throws JSONException {
        return new JSONObject().put("log_buffer_size", c15664o.f48499a).put("max_chained_exception_depth", c15664o.f48500b).put("max_custom_exception_events", c15664o.f48501c).put("max_custom_key_value_pairs", c15664o.f48502d).put("identifier_mask", c15664o.f48503e).put("send_session_without_crash", c15664o.f48504f);
    }

    /* renamed from: a */
    private JSONObject m63422a(C15656b c15656b) throws JSONException {
        return new JSONObject().put("url", c15656b.f48449a).put("flush_interval_secs", c15656b.f48450b).put("max_byte_size_per_file", c15656b.f48451c).put("max_file_count_per_send", c15656b.f48452d).put("max_pending_send_file_count", c15656b.f48453e);
    }

    /* renamed from: a */
    private JSONObject m63425a(C15660f c15660f) throws JSONException {
        return new JSONObject().put("update_endpoint", c15660f.f48481a).put("update_suspend_duration", c15660f.f48482b);
    }

    /* renamed from: a */
    private JSONObject m63427a(C15663n c15663n) throws JSONException {
        return new JSONObject().put(ManagerWebServices.PARAM_JOB_TITLE, c15663n.f48492a).put("message", c15663n.f48493b).put("send_button_title", c15663n.f48494c).put("show_cancel_button", c15663n.f48495d).put("cancel_button_title", c15663n.f48496e).put("show_always_send_button", c15663n.f48497f).put("always_send_button_title", c15663n.f48498g);
    }
}
