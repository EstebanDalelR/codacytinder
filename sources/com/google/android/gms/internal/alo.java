package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzzv
public final class alo {
    /* renamed from: A */
    public static final ald<String> f15423A = ald.m19318a(1, "gads:video:codec_query_mime_types", "");
    /* renamed from: B */
    public static final ald<Integer> f15424B = ald.m19315a(1, "gads:video:codec_query_minimum_version", 16);
    /* renamed from: C */
    public static final ald<Boolean> f15425C = ald.m19317a(0, "gads:looper_for_gms_client:enabled", Boolean.valueOf(true));
    /* renamed from: D */
    public static final ald<Boolean> f15426D = ald.m19317a(0, "gads:sw_ad_request_service:enabled", Boolean.valueOf(true));
    /* renamed from: E */
    public static final ald<String> f15427E = ald.m19318a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
    /* renamed from: F */
    public static final ald<String> f15428F = ald.m19318a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
    /* renamed from: G */
    public static final ald<String> f15429G = ald.m19318a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
    /* renamed from: H */
    public static final ald<Boolean> f15430H = ald.m19317a(0, "gads:enabled_sdk_csi", Boolean.valueOf(false));
    /* renamed from: I */
    public static final ald<String> f15431I = ald.m19318a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");
    /* renamed from: J */
    public static final ald<Boolean> f15432J = ald.m19317a(0, "gads:sdk_csi_write_to_file", Boolean.valueOf(false));
    /* renamed from: K */
    public static final ald<Boolean> f15433K = ald.m19317a(0, "gads:enable_content_fetching", Boolean.valueOf(true));
    /* renamed from: L */
    public static final ald<Integer> f15434L = ald.m19315a(0, "gads:content_length_weight", 1);
    /* renamed from: M */
    public static final ald<Integer> f15435M = ald.m19315a(0, "gads:content_age_weight", 1);
    /* renamed from: N */
    public static final ald<Integer> f15436N = ald.m19315a(0, "gads:min_content_len", 11);
    /* renamed from: O */
    public static final ald<Integer> f15437O = ald.m19315a(0, "gads:fingerprint_number", 10);
    /* renamed from: P */
    public static final ald<Integer> f15438P = ald.m19315a(0, "gads:sleep_sec", 10);
    /* renamed from: Q */
    public static final ald<Boolean> f15439Q = ald.m19317a(1, "gads:enable_content_url_hash", Boolean.valueOf(true));
    /* renamed from: R */
    public static final ald<Integer> f15440R = ald.m19315a(1, "gads:content_vertical_fingerprint_number", 100);
    /* renamed from: S */
    public static final ald<Boolean> f15441S = ald.m19317a(1, "gads:enable_content_vertical_hash", Boolean.valueOf(true));
    /* renamed from: T */
    public static final ald<Integer> f15442T = ald.m19315a(1, "gads:content_vertical_fingerprint_bits", 23);
    /* renamed from: U */
    public static final ald<Integer> f15443U = ald.m19315a(1, "gads:content_vertical_fingerprint_ngram", 3);
    /* renamed from: V */
    public static final ald<String> f15444V = ald.m19318a(1, "gads:content_fetch_view_tag_id", "googlebot");
    /* renamed from: W */
    public static final ald<String> f15445W = ald.m19318a(1, "gads:content_fetch_exclude_view_tag", "none");
    /* renamed from: X */
    public static final ald<Boolean> f15446X = ald.m19317a(0, "gad:app_index_enabled", Boolean.valueOf(true));
    /* renamed from: Y */
    public static final ald<Boolean> f15447Y = ald.m19317a(1, "gads:content_fetch_disable_get_title_from_webview", Boolean.valueOf(false));
    /* renamed from: Z */
    public static final ald<Boolean> f15448Z = ald.m19317a(0, "gads:app_index:without_content_info_present:enabled", Boolean.valueOf(true));
    /* renamed from: a */
    public static final ald<String> f15449a = ald.m19318a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
    public static final ald<Boolean> aA = ald.m19317a(1, "gads:enable_ad_loader_manager", Boolean.valueOf(true));
    public static final ald<Boolean> aB = ald.m19317a(1, "gads:ad_manager_enforce_arp_invariant:enabled", Boolean.valueOf(false));
    public static final ald<Long> aC = ald.m19316a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final ald<Boolean> aD = ald.m19317a(1, "gads:interstitial_ad_immersive_mode", Boolean.valueOf(true));
    public static final ald<Boolean> aE = ald.m19317a(1, "gads:custom_close_blocking:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> aF = ald.m19317a(1, "gads:interstitial_ad_pool:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> aG = ald.m19317a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", Boolean.valueOf(false));
    public static final ald<String> aH = ald.m19318a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    public static final ald<String> aI = ald.m19318a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    public static final ald<Integer> aJ = ald.m19315a(1, "gads:interstitial_ad_pool:max_pools", 3);
    public static final ald<Integer> aK = ald.m19315a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    public static final ald<Integer> aL = ald.m19315a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    public static final ald<String> aM = ald.m19318a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    public static final ald<Integer> aN = ald.m19315a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    public static final ald<Integer> aO = ald.m19315a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    public static final ald<Long> aP = ald.m19316a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);
    public static final ald<Long> aQ = ald.m19316a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);
    public static final ald<Float> aR = ald.m19314a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
    public static final ald<Float> aS = ald.m19314a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
    public static final ald<Boolean> aT = ald.m19317a(0, "gads:debug_logging_feature:enable", Boolean.valueOf(false));
    public static final ald<Boolean> aU = ald.m19317a(0, "gads:debug_logging_feature:intercept_web_view", Boolean.valueOf(false));
    public static final ald<String> aV = ald.m19318a(1, "gads:spherical_video:vertex_shader", "");
    public static final ald<String> aW = ald.m19318a(1, "gads:spherical_video:fragment_shader", "");
    public static final ald<Boolean> aX = ald.m19317a(0, "gads:log:verbose_enabled", Boolean.valueOf(false));
    public static final ald<Boolean> aY = ald.m19317a(1, "gads:include_local_global_rectangles", Boolean.valueOf(false));
    public static final ald<Long> aZ = ald.m19316a(1, "gads:position_watcher:throttle_ms", 200);
    public static final ald<Long> aa = ald.m19316a(0, "gads:app_index:timeout_ms", 1000);
    public static final ald<Boolean> ab = ald.m19317a(0, "gads:kitkat_interstitial_workaround:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> ac = ald.m19317a(0, "gads:interstitial_follow_url", Boolean.valueOf(true));
    public static final ald<Boolean> ad = ald.m19317a(0, "gads:interstitial_follow_url:register_click", Boolean.valueOf(true));
    public static final ald<Boolean> ae = ald.m19317a(0, "gads:ad_key_enabled", Boolean.valueOf(false));
    public static final ald<Boolean> af = ald.m19317a(1, "gads:sai:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> ag = ald.m19317a(1, "gads:sai:banner_ad_enabled", Boolean.valueOf(true));
    public static final ald<Boolean> ah = ald.m19317a(1, "gads:sai:native_ad_enabled", Boolean.valueOf(true));
    public static final ald<Boolean> ai = ald.m19317a(1, "gads:sai:interstitial_ad_enabled", Boolean.valueOf(true));
    public static final ald<Boolean> aj = ald.m19317a(1, "gads:sai:rewardedvideo_ad_enabled", Boolean.valueOf(true));
    public static final ald<String> ak = ald.m19318a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final ald<String> al = ald.m19318a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");
    public static final ald<Boolean> am = ald.m19317a(1, "gads:sai:click_gmsg_enabled", Boolean.valueOf(true));
    public static final ald<Boolean> an = ald.m19317a(1, "gads:sai:using_macro:enabled", Boolean.valueOf(false));
    public static final ald<String> ao = ald.m19318a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final ald<Long> ap = ald.m19316a(1, "gads:sai:timeout_ms", -1);
    public static final ald<Integer> aq = ald.m19315a(1, "gads:sai:scion_thread_pool_size", 5);
    public static final ald<Boolean> ar = ald.m19317a(1, "gads:webview:ignore_over_scroll", Boolean.valueOf(true));
    public static final ald<Boolean> as = ald.m19317a(1, "gads:rewarded:adapter_initialization_enabled", Boolean.valueOf(false));
    public static final ald<Long> at = ald.m19316a(1, "gads:rewarded:adapter_timeout_ms", (long) DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL);
    public static final ald<Boolean> au = ald.m19317a(1, "gads:app_activity_tracker:enabled", Boolean.valueOf(true));
    public static final ald<Long> av = ald.m19316a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final ald<Long> aw = ald.m19316a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final ald<Boolean> ax = ald.m19317a(1, "gads:adid_values_in_adrequest:enabled", Boolean.valueOf(false));
    public static final ald<Long> ay = ald.m19316a(1, "gads:adid_values_in_adrequest:timeout", (long) DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    public static final ald<Boolean> az = ald.m19317a(1, "gads:disable_adid_values_in_ms", Boolean.valueOf(false));
    /* renamed from: b */
    public static final ald<Boolean> f15450b = ald.m19317a(0, "gads:sdk_crash_report_enabled", Boolean.valueOf(false));
    public static final ald<Boolean> bA = ald.m19317a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> bB = ald.m19317a(0, "gass:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> bC = ald.m19317a(0, "gass:enable_int_signal", Boolean.valueOf(true));
    public static final ald<Boolean> bD = ald.m19317a(0, "gass:enable_ad_attestation_signal", Boolean.valueOf(true));
    public static final ald<Boolean> bE = ald.m19317a(0, "gads:support_screen_shot", Boolean.valueOf(true));
    public static final ald<Boolean> bF = ald.m19317a(0, "gads:use_get_drawing_cache_for_screenshot:enabled", Boolean.valueOf(true));
    public static final ald<String> bG = ald.m19318a(1, "gads:sdk_core_constants:caps", "");
    public static final ald<Long> bH = ald.m19316a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));
    public static final ald<Boolean> bI = ald.m19317a(0, "gads:js_flags:mf", Boolean.valueOf(false));
    public static final ald<Boolean> bJ = ald.m19317a(0, "gads:custom_render:ping_on_ad_rendered", Boolean.valueOf(false));
    public static final ald<String> bK = ald.m19318a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final ald<String> bL = ald.m19318a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final ald<Boolean> bM = ald.m19317a(1, "gads:enable_untrack_view_native", Boolean.valueOf(true));
    public static final ald<Boolean> bN = ald.m19317a(1, "gads:ignore_untrack_view_google_native", Boolean.valueOf(true));
    public static final ald<Boolean> bO = ald.m19317a(1, "gads:reset_listeners_preparead_native", Boolean.valueOf(true));
    public static final ald<Integer> bP = ald.m19315a(1, "gads:native_video_load_timeout", 10);
    public static final ald<String> bQ = ald.m19318a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final ald<Boolean> bR = ald.m19317a(1, "gads:clamp_native_video_player_dimensions", Boolean.valueOf(true));
    public static final ald<Boolean> bS = ald.m19317a(1, "gads:enable_store_active_view_state", Boolean.valueOf(false));
    public static final ald<Boolean> bT = ald.m19317a(1, "gads:enable_singleton_broadcast_receiver", Boolean.valueOf(false));
    public static final ald<Boolean> bU = ald.m19317a(1, "gads:native:overlay_new_fix:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> bV = ald.m19317a(1, "gads:native:count_impression_for_assets", Boolean.valueOf(false));
    public static final ald<Boolean> bW = ald.m19317a(1, "gads:fluid_ad:use_wrap_content_height", Boolean.valueOf(false));
    public static final ald<Boolean> bX = ald.m19317a(0, "gads:method_tracing:enabled", Boolean.valueOf(false));
    public static final ald<Long> bY = ald.m19316a(0, "gads:method_tracing:duration_ms", 30000);
    public static final ald<Integer> bZ = ald.m19315a(0, "gads:method_tracing:count", 5);
    public static final ald<Boolean> ba = ald.m19317a(1, "gads:include_lock_screen_apps_for_visibility", Boolean.valueOf(true));
    public static final ald<Boolean> bb = ald.m19317a(0, "gads:device_info_caching:enabled", Boolean.valueOf(true));
    public static final ald<Long> bc = ald.m19316a(0, "gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final ald<Boolean> bd = ald.m19317a(0, "gads:gen204_signals:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> be = ald.m19317a(0, "gads:webview:error_reporting_enabled", Boolean.valueOf(false));
    public static final ald<Boolean> bf = ald.m19317a(1, "gads:gmsg:disable_back_button:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> bg = ald.m19317a(0, "gads:gmsg:video_meta:enabled", Boolean.valueOf(true));
    public static final ald<Long> bh = ald.m19316a(1, "gads:network:network_prediction_timeout_ms", (long) DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    public static final ald<Boolean> bi = ald.m19317a(0, "gads:mediation:dynamite_first:admobadapter", Boolean.valueOf(true));
    public static final ald<Boolean> bj = ald.m19317a(0, "gads:mediation:dynamite_first:adurladapter", Boolean.valueOf(true));
    public static final ald<Boolean> bk = ald.m19317a(1, "gads:bypass_adrequest_service_for_inlined_mediation", Boolean.valueOf(true));
    public static final ald<Long> bl = ald.m19316a(0, "gads:resolve_future:default_timeout_ms", 30000);
    public static final ald<Long> bm = ald.m19316a(0, "gads:ad_loader:timeout_ms", 60000);
    public static final ald<Long> bn = ald.m19316a(0, "gads:rendering:timeout_ms", 60000);
    public static final ald<Boolean> bo = ald.m19317a(0, "gads:adshield:enable_adshield_instrumentation", Boolean.valueOf(false));
    public static final ald<Long> bp = ald.m19316a(1, "gads:gestures:task_timeout", (long) DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    public static final ald<Boolean> bq = ald.m19317a(1, "gads:gestures:btt:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> br = ald.m19317a(1, "gads:gestures:sss:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> bs = ald.m19317a(1, "gads:gestures:asig:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> bt = ald.m19317a(1, "gads:gestures:tos:enabled", Boolean.valueOf(false));
    public static final ald<Integer> bu = ald.m19315a(1, "gads:gestures:ts", 1);
    public static final ald<Boolean> bv = ald.m19317a(1, "gads:gestures:tdvs:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> bw = ald.m19317a(1, "gads:gestures:tvvs:enabled", Boolean.valueOf(false));
    public static final ald<String> bx = ald.m19318a(1, "gads:gestures:pk", "");
    public static final ald<Boolean> by = ald.m19317a(1, "gads:gestures:bs:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> bz = ald.m19317a(1, "gads:gestures:check_initialization_thread:enabled", Boolean.valueOf(false));
    /* renamed from: c */
    public static final ald<Boolean> f15451c = ald.m19317a(0, "gads:sdk_crash_report_full_stacktrace", Boolean.valueOf(false));
    public static final ald<String> cA = ald.m19318a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final ald<String> cB = ald.m19318a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final ald<String> cC = ald.m19318a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final ald<String> cD = ald.m19318a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final ald<Integer> cE = ald.m19315a(1, "gads:drx_debug:timeout_ms", 5000);
    public static final ald<Integer> cF = ald.m19315a(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final ald<Boolean> cG = ald.m19317a(1, "gad:interstitial_for_multi_window", Boolean.valueOf(false));
    public static final ald<Boolean> cH = ald.m19317a(1, "gad:interstitial_ad_stay_active_in_multi_window", Boolean.valueOf(false));
    public static final ald<Integer> cI = ald.m19315a(1, "gad:interstitial:close_button_padding_dip", 0);
    public static final ald<Boolean> cJ = ald.m19317a(1, "gads:clearcut_logging:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> cK = ald.m19317a(0, "gad:force_local_ad_request_service:enabled", Boolean.valueOf(false));
    public static final ald<Integer> cL = ald.m19315a(1, "gad:http_redirect_max_count:times", 8);
    public static final ald<Long> cM = ald.m19316a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);
    public static final ald<String> cN = ald.m19318a(0, "gads:public_beta:traffic_multiplier", "1.0");
    public static final ald<Boolean> cO = ald.m19317a(1, "gads:real_test_request:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> cP = ald.m19317a(1, "gads:real_test_request:render_webview_label", Boolean.valueOf(true));
    public static final ald<Boolean> cQ = ald.m19317a(1, "gads:real_test_request:render_native_label", Boolean.valueOf(true));
    private static ald<String> cR = ald.m19313a(0, "gads:sdk_core_experiment_id");
    private static ald<String> cS = ald.m19318a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");
    private static ald<Boolean> cT = ald.m19317a(0, "gads:request_builder:singleton_webview", Boolean.valueOf(false));
    private static ald<String> cU = ald.m19313a(0, "gads:request_builder:singleton_webview_experiment_id");
    private static ald<Boolean> cV = ald.m19317a(0, "gads:sdk_use_dynamic_module", Boolean.valueOf(true));
    private static ald<String> cW = ald.m19313a(0, "gads:sdk_use_dynamic_module_experiment_id");
    private static ald<String> cX = ald.m19313a(0, "gads:block_autoclicks_experiment_id");
    private static ald<String> cY = ald.m19313a(0, "gads:spam_app_context:experiment_id");
    private static ald<Integer> cZ = ald.m19315a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
    public static final ald<Integer> ca = ald.m19315a(0, "gads:method_tracing:filesize", 134217728);
    public static final ald<Long> cb = ald.m19316a(1, "gads:auto_location_timeout", (long) DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    public static final ald<Boolean> cc = ald.m19317a(1, "gads:fetch_app_settings_using_cld:enabled", Boolean.valueOf(false));
    public static final ald<Long> cd = ald.m19316a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final ald<String> ce = ald.m19318a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
    public static final ald<String> cf = ald.m19318a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
    public static final ald<String> cg = ald.m19318a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
    public static final ald<String> ch = ald.m19318a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
    public static final ald<String> ci = ald.m19318a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
    public static final ald<Long> cj = ald.m19316a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
    public static final ald<Long> ck = ald.m19316a(1, "gads:parental_controls:timeout", (long) DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    public static final ald<Boolean> cl = ald.m19317a(0, "gads:safe_browsing:debug", Boolean.valueOf(false));
    public static final ald<Boolean> cm = ald.m19317a(0, "gads:webview_cookie:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> cn = ald.m19317a(1, "gads:cache:bind_on_foreground", Boolean.valueOf(false));
    public static final ald<Boolean> co = ald.m19317a(1, "gads:cache:bind_on_init", Boolean.valueOf(false));
    public static final ald<Boolean> cp = ald.m19317a(1, "gads:cache:bind_on_request", Boolean.valueOf(false));
    public static final ald<Long> cq = ald.m19316a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final ald<Boolean> cr = ald.m19317a(1, "gads:cache:use_cache_data_source", Boolean.valueOf(false));
    public static final ald<Boolean> cs = ald.m19317a(1, "gads:http_assets_cache:enabled", Boolean.valueOf(false));
    public static final ald<String> ct = ald.m19318a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
    public static final ald<Integer> cu = ald.m19315a(1, "gads:http_assets_cache:time_out", 100);
    public static final ald<Boolean> cv = ald.m19317a(1, "gads:chrome_custom_tabs:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> cw = ald.m19317a(1, "gads:chrome_custom_tabs_browser:enabled", Boolean.valueOf(false));
    public static final ald<Boolean> cx = ald.m19317a(1, "gads:chrome_custom_tabs:disabled", Boolean.valueOf(false));
    public static final ald<Boolean> cy = ald.m19317a(1, "gads:drx_in_app_preview:enabled", Boolean.valueOf(true));
    public static final ald<Boolean> cz = ald.m19317a(1, "gads:drx_debug_signals:enabled", Boolean.valueOf(true));
    /* renamed from: d */
    public static final ald<String> f15452d = ald.m19318a(0, "gads:sdk_crash_report_class_prefix", "com.google.");
    private static ald<String> dA = ald.m19313a(0, "gads:gmsg:video_meta:experiment_id");
    private static ald<Long> dB = ald.m19316a(1, "gads:network:cache_prediction_duration_s", 300);
    private static ald<Boolean> dC = ald.m19317a(0, "gads:adid_notification:first_party_check:enabled", Boolean.valueOf(true));
    private static ald<Boolean> dD = ald.m19317a(0, "gads:edu_device_helper:enabled", Boolean.valueOf(true));
    private static ald<String> dE = ald.m19313a(0, "gads:use_get_drawing_cache_for_screenshot:experiment_id");
    private static ald<String> dF = ald.m19313a(1, "gads:sdk_core_constants:experiment_id");
    private static ald<Boolean> dG = ald.m19317a(1, "gads:js_flags:disable_phenotype", Boolean.valueOf(false));
    private static ald<String> dH = ald.m19318a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");
    private static ald<String> dI = ald.m19318a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
    private static ald<String> dJ = ald.m19313a(1, "gads:singleton_webview_native:experiment_id");
    private static ald<Boolean> dK = ald.m19317a(1, "gads:auto_location_for_coarse_permission", Boolean.valueOf(false));
    private static ald<String> dL = ald.m19319b(1, "gads:auto_location_for_coarse_permission:experiment_id");
    private static ald<String> dM = ald.m19319b(1, "gads:auto_location_timeout:experiment_id");
    private static ald<Long> dN = ald.m19316a(1, "gads:auto_location_interval", -1);
    private static ald<String> dO = ald.m19319b(1, "gads:auto_location_interval:experiment_id");
    private static ald<String> dP = ald.m19313a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
    private static ald<String> dQ = ald.m19313a(0, "gads:afs:csa:experiment_id");
    private static ald<Boolean> dR = ald.m19317a(0, "gads:afs:csa_ad_manager_enabled", Boolean.valueOf(true));
    private static ald<Boolean> dS = ald.m19317a(1, "gads:parental_controls:send_from_client", Boolean.valueOf(true));
    private static ald<Boolean> dT = ald.m19317a(1, "gads:parental_controls:cache_results", Boolean.valueOf(true));
    private static ald<String> dU = ald.m19318a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
    private static ald<Long> dV = ald.m19316a(0, "gads:safe_browsing:safety_net:delay_ms", (long) DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL);
    private static ald<Integer> dW = ald.m19315a(1, "gads:cache:ad_request_timeout_millis", (int) Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    private static ald<Integer> dX = ald.m19315a(1, "gads:cache:max_concurrent_downloads", 10);
    private static ald<Long> dY = ald.m19316a(1, "gads:cache:javascript_timeout_millis", 5000);
    private static ald<Boolean> dZ = ald.m19317a(1, "gads:cache:connection_per_read", Boolean.valueOf(false));
    private static ald<String> da = ald.m19313a(0, "gads:video_stream_cache:experiment_id");
    private static ald<Boolean> db = ald.m19317a(0, "gads:ad_id_app_context:enabled", Boolean.valueOf(false));
    private static ald<Float> dc = ald.m19314a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
    private static ald<String> dd = ald.m19313a(0, "gads:ad_id_app_context:experiment_id");
    private static ald<String> de = ald.m19313a(0, "gads:ad_id_use_shared_preference:experiment_id");
    private static ald<Boolean> df = ald.m19317a(0, "gads:ad_id_use_shared_preference:enabled", Boolean.valueOf(false));
    private static ald<Float> dg = ald.m19314a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);
    private static ald<Boolean> dh = ald.m19317a(0, "gads:ad_id_use_persistent_service:enabled", Boolean.valueOf(false));
    private static ald<String> di = ald.m19319b(0, "gads:looper_for_gms_client:experiment_id");
    private static ald<Boolean> dj = ald.m19317a(0, "gads:sw_dynamite:enabled", Boolean.valueOf(true));
    private static ald<String> dk = ald.m19313a(0, "gads:app_index:experiment_id");
    private static ald<String> dl = ald.m19313a(0, "gads:kitkat_interstitial_workaround:experiment_id");
    private static ald<String> dm = ald.m19313a(0, "gads:interstitial_follow_url:experiment_id");
    private static ald<Boolean> dn = ald.m19317a(0, "gads:analytics_enabled", Boolean.valueOf(true));
    /* renamed from: do */
    private static ald<Integer> f15453do = ald.m19315a(0, "gads:webview_cache_version", 0);
    private static ald<String> dp = ald.m19319b(0, "gads:pan:experiment_id");
    private static ald<Boolean> dq = ald.m19317a(0, "gads:ad_serving:enabled", Boolean.valueOf(true));
    private static ald<Boolean> dr = ald.m19317a(1, "gads:impression_optimization_enabled", Boolean.valueOf(false));
    private static ald<String> ds = ald.m19318a(1, "gads:banner_ad_pool:schema", "customTargeting");
    private static ald<Integer> dt = ald.m19315a(1, "gads:banner_ad_pool:max_queues", 3);
    private static ald<Integer> du = ald.m19315a(1, "gads:banner_ad_pool:max_pools", 3);
    private static ald<Integer> dv = ald.m19315a(1, "gads:heap_wastage:bytes", 0);
    private static ald<Boolean> dw = ald.m19317a(0, "gads:adid_reporting:enabled", Boolean.valueOf(false));
    private static ald<Boolean> dx = ald.m19317a(0, "gads:ad_settings_page_reporting:enabled", Boolean.valueOf(false));
    private static ald<Boolean> dy = ald.m19317a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", Boolean.valueOf(false));
    private static ald<Boolean> dz = ald.m19317a(0, "gads:request_pkg:enabled", Boolean.valueOf(true));
    /* renamed from: e */
    public static final ald<Boolean> f15454e = ald.m19317a(0, "gads:block_autoclicks", Boolean.valueOf(false));
    private static ald<Long> ea = ald.m19316a(1, "gads:cache:connection_timeout", 5000);
    private static ald<Long> eb = ald.m19316a(1, "gads:cache:read_only_connection_timeout", 5000);
    private static ald<Boolean> ec = ald.m19317a(0, "gads:nonagon:red_button", Boolean.valueOf(false));
    private static ald<Boolean> ed = ald.m19317a(1, "gads:nonagon:banner:enabled", Boolean.valueOf(false));
    private static ald<String> ee = ald.m19318a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
    private static ald<Boolean> ef = ald.m19317a(1, "gads:nonagon:interstitial:enabled", Boolean.valueOf(false));
    private static ald<String> eg = ald.m19318a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
    private static ald<Boolean> eh = ald.m19317a(1, "gads:nonagon:rewardedvideo:enabled", Boolean.valueOf(false));
    private static ald<Boolean> ei = ald.m19317a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", Boolean.valueOf(false));
    private static ald<String> ej = ald.m19318a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
    private static ald<Boolean> ek = ald.m19317a(1, "gads:nonagon:nativead:enabled", Boolean.valueOf(false));
    private static ald<String> el = ald.m19318a(1, "gads:nonagon:nativead:ad_unit_exclusions", "(?!)");
    private static ald<Boolean> em = ald.m19317a(1, "gads:nonagon:service:enabled", Boolean.valueOf(false));
    private static byte[] en;
    /* renamed from: f */
    public static final ald<String> f15455f = ald.m19318a(1, "gads:video_exo_player:version", "1");
    /* renamed from: g */
    public static final ald<Integer> f15456g = ald.m19315a(1, "gads:video_exo_player:connect_timeout", (int) C15645a.MAX_BYTE_SIZE_PER_FILE);
    /* renamed from: h */
    public static final ald<Integer> f15457h = ald.m19315a(1, "gads:video_exo_player:read_timeout", (int) C15645a.MAX_BYTE_SIZE_PER_FILE);
    /* renamed from: i */
    public static final ald<Integer> f15458i = ald.m19315a(1, "gads:video_exo_player:loading_check_interval", 1048576);
    /* renamed from: j */
    public static final ald<Integer> f15459j = ald.m19315a(1, "gads:video_stream_cache:limit_count", 5);
    /* renamed from: k */
    public static final ald<Integer> f15460k = ald.m19315a(1, "gads:video_stream_cache:limit_space", 8388608);
    /* renamed from: l */
    public static final ald<Integer> f15461l = ald.m19315a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    /* renamed from: m */
    public static final ald<Long> f15462m = ald.m19316a(1, "gads:video_stream_cache:limit_time_sec", 300);
    /* renamed from: n */
    public static final ald<Long> f15463n = ald.m19316a(1, "gads:video_stream_cache:notify_interval_millis", 125);
    /* renamed from: o */
    public static final ald<Integer> f15464o = ald.m19315a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    /* renamed from: p */
    public static final ald<Boolean> f15465p = ald.m19317a(0, "gads:video:metric_reporting_enabled", Boolean.valueOf(false));
    /* renamed from: q */
    public static final ald<String> f15466q = ald.m19318a(1, "gads:video:metric_frame_hash_times", "");
    /* renamed from: r */
    public static final ald<Long> f15467r = ald.m19316a(1, "gads:video:metric_frame_hash_time_leniency", 500);
    /* renamed from: s */
    public static final ald<Boolean> f15468s = ald.m19317a(1, "gads:video:force_watermark", Boolean.valueOf(false));
    /* renamed from: t */
    public static final ald<Long> f15469t = ald.m19316a(1, "gads:video:surface_update_min_spacing_ms", 1000);
    /* renamed from: u */
    public static final ald<Boolean> f15470u = ald.m19317a(1, "gads:video:spinner:enabled", Boolean.valueOf(false));
    /* renamed from: v */
    public static final ald<Integer> f15471v = ald.m19315a(1, "gads:video:spinner:scale", 4);
    /* renamed from: w */
    public static final ald<Long> f15472w = ald.m19316a(1, "gads:video:spinner:jank_threshold_ms", 50);
    /* renamed from: x */
    public static final ald<Boolean> f15473x = ald.m19317a(1, "gads:video:aggressive_media_codec_release", Boolean.valueOf(false));
    /* renamed from: y */
    public static final ald<Boolean> f15474y = ald.m19317a(1, "gads:memory_bundle:debug_info", Boolean.valueOf(false));
    /* renamed from: z */
    public static final ald<Boolean> f15475z = ald.m19317a(1, "gads:memory_bundle:runtime_info", Boolean.valueOf(true));

    /* renamed from: a */
    public static List<String> m19336a() {
        return aja.m19220e().m19327a();
    }

    /* renamed from: a */
    public static void m19337a(Context context) {
        hg.m19844a(context, new alp(context));
        int intValue = ((Integer) aja.m19221f().m19334a(dv)).intValue();
        if (intValue > 0 && en == null) {
            en = new byte[intValue];
        }
    }

    /* renamed from: a */
    public static void m19338a(Context context, int i, JSONObject jSONObject) {
        aja.m19219d();
        Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        aja.m19220e().m19328a(edit, 1, jSONObject);
        aja.m19219d();
        edit.commit();
    }

    /* renamed from: b */
    public static List<String> m19339b() {
        return aja.m19220e().m19330b();
    }
}
