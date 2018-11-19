package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug.MemoryInfo;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.tinder.api.ManagerWebServices;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class au {
    /* renamed from: a */
    private static final SimpleDateFormat f15731a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* renamed from: a */
    public static zzaax m19492a(Context context, zzaat zzaat, String str) {
        String optString;
        String str2;
        zzaat zzaat2 = zzaat;
        try {
            int b;
            int i;
            String str3;
            zzaax zzaax;
            long j;
            JSONArray optJSONArray;
            List list;
            List list2;
            List list3;
            List a;
            long j2;
            String optString2;
            boolean optBoolean;
            JSONObject jSONObject = new JSONObject(str);
            optString = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            String optString5 = jSONObject.optString("ad_slot_size", optString4);
            boolean z = (zzaat2 == null || zzaat2.zzcnj == 0) ? false : true;
            CharSequence optString6 = jSONObject.optString("ad_json", null);
            if (optString6 == null) {
                optString6 = jSONObject.optString("ad_html", null);
            }
            if (optString6 == null) {
                optString6 = jSONObject.optString("body", null);
            }
            if (optString6 == null && jSONObject.has("ads")) {
                optString6 = jSONObject.toString();
            }
            String optString7 = jSONObject.optString("debug_dialog", null);
            String optString8 = jSONObject.optString("debug_signals", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            String optString9 = jSONObject.optString("orientation", null);
            if ("portrait".equals(optString9)) {
                b = ar.g().mo4621b();
            } else if ("landscape".equals(optString9)) {
                b = ar.g().mo4619a();
            } else {
                i = -1;
                if (TextUtils.isEmpty(optString6) || TextUtils.isEmpty(optString3)) {
                    optString9 = optString;
                    str3 = optString6;
                    zzaax = null;
                    j = -1;
                } else {
                    zzaax = aq.m31496a(zzaat2, context, zzaat2.zzaty.zzcv, optString3, null, null, null, null);
                    str2 = zzaax.zzcja;
                    optString9 = zzaax.body;
                    j = zzaax.zzcpa;
                    str3 = optString9;
                    optString9 = str2;
                }
                if (str3 == null) {
                    return new zzaax(0);
                }
                optJSONArray = jSONObject.optJSONArray("click_urls");
                list = zzaax != null ? null : zzaax.zzcdk;
                if (optJSONArray != null) {
                    list = m19494a(optJSONArray, list);
                }
                optJSONArray = jSONObject.optJSONArray("impression_urls");
                list2 = zzaax != null ? null : zzaax.zzcdl;
                if (optJSONArray != null) {
                    list2 = m19494a(optJSONArray, list2);
                }
                optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
                list3 = zzaax != null ? null : zzaax.zzcoy;
                a = optJSONArray == null ? m19494a(optJSONArray, list3) : list3;
                if (zzaax != null) {
                    if (zzaax.orientation != -1) {
                        i = zzaax.orientation;
                    }
                    if (zzaax.zzcov > 0) {
                        j2 = zzaax.zzcov;
                        optString2 = jSONObject.optString("active_view");
                        optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                        return new zzaax(zzaat2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), a, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzaat2.zzcnl, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzaeq.zza(jSONObject.optJSONArray("rewards")), m19494a(jSONObject.optJSONArray("video_start_urls"), null), m19494a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaz.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaat2.zzcnz, jSONObject.optString("set_cookie", ""), m19494a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzaat2.zzcdo), optString5, zzaey.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzaat2.zzcol, jSONObject.optBoolean("custom_close_blocked"), 0);
                    }
                }
                j2 = j3;
                optString2 = jSONObject.optString("active_view");
                optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                if (optBoolean) {
                }
                return new zzaax(zzaat2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), a, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzaat2.zzcnl, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzaeq.zza(jSONObject.optJSONArray("rewards")), m19494a(jSONObject.optJSONArray("video_start_urls"), null), m19494a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaz.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaat2.zzcnz, jSONObject.optString("set_cookie", ""), m19494a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzaat2.zzcdo), optString5, zzaey.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzaat2.zzcol, jSONObject.optBoolean("custom_close_blocked"), 0);
            }
            i = b;
            if (TextUtils.isEmpty(optString6)) {
            }
            optString9 = optString;
            str3 = optString6;
            zzaax = null;
            j = -1;
            if (str3 == null) {
                return new zzaax(0);
            }
            optJSONArray = jSONObject.optJSONArray("click_urls");
            if (zzaax != null) {
            }
            if (optJSONArray != null) {
                list = m19494a(optJSONArray, list);
            }
            optJSONArray = jSONObject.optJSONArray("impression_urls");
            if (zzaax != null) {
            }
            if (optJSONArray != null) {
                list2 = m19494a(optJSONArray, list2);
            }
            optJSONArray = jSONObject.optJSONArray("manual_impression_urls");
            if (zzaax != null) {
            }
            if (optJSONArray == null) {
            }
            if (zzaax != null) {
                if (zzaax.orientation != -1) {
                    i = zzaax.orientation;
                }
                if (zzaax.zzcov > 0) {
                    j2 = zzaax.zzcov;
                    optString2 = jSONObject.optString("active_view");
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                    }
                    return new zzaax(zzaat2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), a, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzaat2.zzcnl, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzaeq.zza(jSONObject.optJSONArray("rewards")), m19494a(jSONObject.optJSONArray("video_start_urls"), null), m19494a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaz.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaat2.zzcnz, jSONObject.optString("set_cookie", ""), m19494a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzaat2.zzcdo), optString5, zzaey.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzaat2.zzcol, jSONObject.optBoolean("custom_close_blocked"), 0);
                }
            }
            j2 = j3;
            optString2 = jSONObject.optString("active_view");
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
            }
            return new zzaax(zzaat2, optString9, str3, list, list2, j2, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), a, jSONObject.optLong("refresh_interval_milliseconds", -1), i, optString4, j, optString7, optBoolean, optBoolean ? jSONObject.optString("ad_passback_url", null) : null, optString2, jSONObject.optBoolean("custom_render_allowed", false), z, zzaat2.zzcnl, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optString("gws_query_id", ""), "height".equals(jSONObject.optString("fluid", "")), jSONObject.optBoolean("native_express", false), zzaeq.zza(jSONObject.optJSONArray("rewards")), m19494a(jSONObject.optJSONArray("video_start_urls"), null), m19494a(jSONObject.optJSONArray("video_complete_urls"), null), jSONObject.optBoolean("use_displayed_impression", false), zzaaz.zzl(jSONObject.optJSONObject("auto_protection_configuration")), zzaat2.zzcnz, jSONObject.optString("set_cookie", ""), m19494a(jSONObject.optJSONArray("remote_ping_urls"), null), jSONObject.optBoolean("render_in_browser", zzaat2.zzcdo), optString5, zzaey.zzo(jSONObject.optJSONObject("safe_browsing")), optString8, jSONObject.optBoolean("content_vertical_opted_out", true), zzaat2.zzcol, jSONObject.optBoolean("custom_close_blocked"), 0);
        } catch (JSONException e) {
            str2 = "Could not parse the inline ad response: ";
            optString = String.valueOf(e.getMessage());
            hx.m19916e(optString.length() != 0 ? str2.concat(optString) : new String(str2));
            return new zzaax(0);
        }
    }

    /* renamed from: a */
    private static Integer m19493a(boolean z) {
        return Integer.valueOf(z);
    }

    @Nullable
    /* renamed from: a */
    private static List<String> m19494a(@Nullable JSONArray jSONArray, @Nullable List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    @Nullable
    /* renamed from: a */
    private static JSONArray m19495a(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    @Nullable
    /* renamed from: a */
    public static JSONObject m19496a(Context context, ao aoVar) {
        ao aoVar2 = aoVar;
        zzaat zzaat = aoVar2.f15531i;
        Location location = aoVar2.f15526d;
        bb bbVar = aoVar2.f15532j;
        Bundle bundle = aoVar2.f15523a;
        JSONObject jSONObject = aoVar2.f15533k;
        String str;
        String str2;
        try {
            Object obj;
            int i;
            String str3;
            zzaat zzaat2;
            Location location2;
            Bundle bundle2;
            JSONObject jSONObject2;
            bb bbVar2;
            String str4;
            Object obj2;
            Object obj3;
            Map hashMap = new HashMap();
            hashMap.put("extra_caps", aja.m19221f().m19334a(alo.bG));
            if (aoVar2.f15525c.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", aoVar2.f15525c));
            }
            if (zzaat.zzcnc != null) {
                hashMap.put("ad_pos", zzaat.zzcnc);
            }
            zzjj zzjj = zzaat.zzcnd;
            String a = dx.m19649a();
            if (a != null) {
                hashMap.put("abf", a);
            }
            if (zzjj.zzbdf != -1) {
                hashMap.put("cust_age", f15731a.format(new Date(zzjj.zzbdf)));
            }
            if (zzjj.extras != null) {
                hashMap.put("extras", zzjj.extras);
            }
            int i2 = -1;
            if (zzjj.zzbdg != -1) {
                hashMap.put("cust_gender", Integer.valueOf(zzjj.zzbdg));
            }
            if (zzjj.zzbdh != null) {
                hashMap.put("kw", zzjj.zzbdh);
            }
            if (zzjj.zzbdj != -1) {
                hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(zzjj.zzbdj));
            }
            if (zzjj.zzbdi) {
                Object valueOf;
                if (((Boolean) aja.m19221f().m19334a(alo.cO)).booleanValue()) {
                    obj = "test_request";
                    valueOf = Boolean.valueOf(true);
                } else {
                    obj = "adtest";
                    valueOf = "on";
                }
                hashMap.put(obj, valueOf);
            }
            if (zzjj.versionCode >= 2) {
                if (zzjj.zzbdk) {
                    hashMap.put("d_imp_hdr", Integer.valueOf(1));
                }
                if (!TextUtils.isEmpty(zzjj.zzbdl)) {
                    hashMap.put("ppid", zzjj.zzbdl);
                }
            }
            if (zzjj.versionCode >= 3 && zzjj.zzbdo != null) {
                hashMap.put("url", zzjj.zzbdo);
            }
            if (zzjj.versionCode >= 5) {
                if (zzjj.zzbdq != null) {
                    hashMap.put("custom_targeting", zzjj.zzbdq);
                }
                if (zzjj.zzbdr != null) {
                    hashMap.put("category_exclusions", zzjj.zzbdr);
                }
                if (zzjj.zzbds != null) {
                    hashMap.put("request_agent", zzjj.zzbds);
                }
            }
            if (zzjj.versionCode >= 6 && zzjj.zzbdt != null) {
                hashMap.put("request_pkg", zzjj.zzbdt);
            }
            if (zzjj.versionCode >= 7) {
                hashMap.put("is_designed_for_families", Boolean.valueOf(zzjj.zzbdu));
            }
            if (zzaat.zzauc.zzbem != null) {
                Object obj4 = null;
                Object obj5 = null;
                for (zzjn zzjn : zzaat.zzauc.zzbem) {
                    if (!zzjn.zzbeo && r16 == null) {
                        hashMap.put("format", zzjn.zzbek);
                        obj4 = 1;
                    }
                    if (zzjn.zzbeo && r17 == null) {
                        hashMap.put("fluid", "height");
                        obj5 = 1;
                    }
                    if (obj4 != null && r17 != null) {
                        break;
                    }
                }
            } else {
                hashMap.put("format", zzaat.zzauc.zzbek);
                if (zzaat.zzauc.zzbeo) {
                    hashMap.put("fluid", "height");
                }
            }
            if (zzaat.zzauc.width == -1) {
                hashMap.put("smart_w", "full");
            }
            if (zzaat.zzauc.height == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (zzaat.zzauc.zzbem != null) {
                StringBuilder stringBuilder = new StringBuilder();
                zzjn[] zzjnArr = zzaat.zzauc.zzbem;
                int length = zzjnArr.length;
                int i3 = 0;
                Object obj6 = null;
                while (i3 < length) {
                    zzjn zzjn2 = zzjnArr[i3];
                    if (zzjn2.zzbeo) {
                        obj6 = 1;
                    } else {
                        if (stringBuilder.length() != 0) {
                            stringBuilder.append("|");
                        }
                        stringBuilder.append(zzjn2.width == i2 ? (int) (((float) zzjn2.widthPixels) / bbVar.f15863s) : zzjn2.width);
                        stringBuilder.append("x");
                        stringBuilder.append(zzjn2.height == -2 ? (int) (((float) zzjn2.heightPixels) / bbVar.f15863s) : zzjn2.height);
                    }
                    i3++;
                    i2 = -1;
                }
                if (obj6 != null) {
                    if (stringBuilder.length() != 0) {
                        i = 0;
                        stringBuilder.insert(0, "|");
                    } else {
                        i = 0;
                    }
                    stringBuilder.insert(i, "320x50");
                }
                hashMap.put("sz", stringBuilder);
            }
            if (zzaat.zzcnj != 0) {
                hashMap.put("native_version", Integer.valueOf(zzaat.zzcnj));
                hashMap.put("native_templates", zzaat.zzauw);
                str3 = "native_image_orientation";
                zzpe zzpe = zzaat.zzauo;
                if (zzpe != null) {
                    switch (zzpe.zzbvf) {
                        case 0:
                            break;
                        case 1:
                            obj = "portrait";
                            break;
                        case 2:
                            obj = "landscape";
                            break;
                        default:
                            obj = "not_set";
                            break;
                    }
                }
                obj = "any";
                hashMap.put(str3, obj);
                if (!zzaat.zzcns.isEmpty()) {
                    hashMap.put("native_custom_templates", zzaat.zzcns);
                }
                if (zzaat.versionCode >= 24) {
                    hashMap.put("max_num_ads", Integer.valueOf(zzaat.zzcoo));
                }
                if (!TextUtils.isEmpty(zzaat.zzcom)) {
                    try {
                        hashMap.put("native_advanced_settings", new JSONArray(zzaat.zzcom));
                    } catch (Throwable e) {
                        hx.m19914c("Problem creating json from native advanced settings", e);
                    }
                }
            }
            if (zzaat.zzaus != null && zzaat.zzaus.size() > 0) {
                for (Integer num : zzaat.zzaus) {
                    Object valueOf2;
                    if (num.intValue() == 2) {
                        obj = "iba";
                        valueOf2 = Boolean.valueOf(true);
                    } else if (num.intValue() == 1) {
                        obj = "ina";
                        valueOf2 = Boolean.valueOf(true);
                    }
                    hashMap.put(obj, valueOf2);
                }
            }
            if (zzaat.zzauc.zzbep) {
                hashMap.put("ene", Boolean.valueOf(true));
            }
            if (zzaat.zzauq != null) {
                hashMap.put("is_icon_ad", Boolean.valueOf(true));
                hashMap.put("icon_ad_expansion_behavior", Integer.valueOf(zzaat.zzauq.zzbfr));
            }
            hashMap.put("slotname", zzaat.zzatw);
            hashMap.put("pn", zzaat.applicationInfo.packageName);
            if (zzaat.zzcne != null) {
                hashMap.put("vc", Integer.valueOf(zzaat.zzcne.versionCode));
            }
            hashMap.put("ms", aoVar2.f15529g);
            hashMap.put("seq_num", zzaat.zzcng);
            hashMap.put("session_id", zzaat.zzcnh);
            hashMap.put("js", zzaat.zzaty.zzcv);
            bj bjVar = aoVar2.f15527e;
            Bundle bundle3 = zzaat.zzcoe;
            Bundle bundle4 = aoVar2.f15524b;
            hashMap.put("am", Integer.valueOf(bbVar.f15845a));
            hashMap.put("cog", m19493a(bbVar.f15846b));
            hashMap.put("coh", m19493a(bbVar.f15847c));
            if (!TextUtils.isEmpty(bbVar.f15848d)) {
                hashMap.put("carrier", bbVar.f15848d);
            }
            hashMap.put("gl", bbVar.f15849e);
            if (bbVar.f15850f) {
                hashMap.put("simulator", Integer.valueOf(1));
            }
            if (bbVar.f15851g) {
                hashMap.put("is_sidewinder", Integer.valueOf(1));
            }
            hashMap.put("ma", m19493a(bbVar.f15852h));
            hashMap.put("sp", m19493a(bbVar.f15853i));
            hashMap.put("hl", bbVar.f15854j);
            if (!TextUtils.isEmpty(bbVar.f15855k)) {
                hashMap.put("mv", bbVar.f15855k);
            }
            hashMap.put("muv", Integer.valueOf(bbVar.f15857m));
            if (bbVar.f15858n != -2) {
                hashMap.put("cnt", Integer.valueOf(bbVar.f15858n));
            }
            hashMap.put("gnt", Integer.valueOf(bbVar.f15859o));
            hashMap.put("pt", Integer.valueOf(bbVar.f15860p));
            hashMap.put("rm", Integer.valueOf(bbVar.f15861q));
            hashMap.put("riv", Integer.valueOf(bbVar.f15862r));
            Bundle bundle5 = new Bundle();
            bundle5.putString("build_build", bbVar.f15870z);
            bundle5.putString("build_device", bbVar.f15843A);
            Bundle bundle6 = new Bundle();
            bundle6.putBoolean("is_charging", bbVar.f15867w);
            Bundle bundle7 = bundle3;
            bundle6.putDouble("battery_level", bbVar.f15866v);
            bundle5.putBundle("battery", bundle6);
            Bundle bundle8 = new Bundle();
            bundle8.putInt("active_network_state", bbVar.f15869y);
            bundle8.putBoolean("active_network_metered", bbVar.f15868x);
            if (bjVar != null) {
                bundle3 = new Bundle();
                bundle3.putInt("predicted_latency_micros", bjVar.f15904a);
                bundle3.putLong("predicted_down_throughput_bps", bjVar.f15905b);
                bundle3.putLong("predicted_up_throughput_bps", bjVar.f15906c);
                bundle8.putBundle("predictions", bundle3);
            }
            bundle5.putBundle("network", bundle8);
            Bundle bundle9 = new Bundle();
            bundle9.putBoolean("is_browser_custom_tabs_capable", bbVar.f15844B);
            bundle5.putBundle("browser", bundle9);
            if (bundle7 != null) {
                str3 = "android_mem_info";
                bundle8 = new Bundle();
                zzaat2 = zzaat;
                location2 = location;
                bundle2 = bundle;
                jSONObject2 = jSONObject;
                bundle6 = bundle7;
                bundle8.putString("runtime_free", Long.toString(bundle6.getLong("runtime_free_memory", -1)));
                bbVar2 = bbVar;
                bundle8.putString("runtime_max", Long.toString(bundle6.getLong("runtime_max_memory", -1)));
                bundle8.putString("runtime_total", Long.toString(bundle6.getLong("runtime_total_memory", -1)));
                i = 0;
                bundle8.putString("web_view_count", Integer.toString(bundle6.getInt("web_view_count", 0)));
                MemoryInfo memoryInfo = (MemoryInfo) bundle6.getParcelable("debug_memory_info");
                if (memoryInfo != null) {
                    bundle8.putString("debug_info_dalvik_private_dirty", Integer.toString(memoryInfo.dalvikPrivateDirty));
                    bundle8.putString("debug_info_dalvik_pss", Integer.toString(memoryInfo.dalvikPss));
                    bundle8.putString("debug_info_dalvik_shared_dirty", Integer.toString(memoryInfo.dalvikSharedDirty));
                    bundle8.putString("debug_info_native_private_dirty", Integer.toString(memoryInfo.nativePrivateDirty));
                    bundle8.putString("debug_info_native_pss", Integer.toString(memoryInfo.nativePss));
                    bundle8.putString("debug_info_native_shared_dirty", Integer.toString(memoryInfo.nativeSharedDirty));
                    bundle8.putString("debug_info_other_private_dirty", Integer.toString(memoryInfo.otherPrivateDirty));
                    bundle8.putString("debug_info_other_pss", Integer.toString(memoryInfo.otherPss));
                    bundle8.putString("debug_info_other_shared_dirty", Integer.toString(memoryInfo.otherSharedDirty));
                }
                bundle5.putBundle(str3, bundle8);
            } else {
                zzaat2 = zzaat;
                location2 = location;
                bbVar2 = bbVar;
                bundle2 = bundle;
                jSONObject2 = jSONObject;
                i = 0;
            }
            Bundle bundle10 = new Bundle();
            bundle10.putBundle("parental_controls", bundle4);
            bb bbVar3 = bbVar2;
            if (!TextUtils.isEmpty(bbVar3.f15856l)) {
                bundle10.putString("package_version", bbVar3.f15856l);
            }
            bundle5.putBundle("play_store", bundle10);
            hashMap.put("device", bundle5);
            bundle10 = new Bundle();
            bundle10.putString("doritos", aoVar2.f15528f);
            if (((Boolean) aja.m19221f().m19334a(alo.ax)).booleanValue()) {
                Object id;
                boolean isLimitAdTrackingEnabled;
                String str5;
                if (aoVar2.f15530h != null) {
                    id = aoVar2.f15530h.getId();
                    isLimitAdTrackingEnabled = aoVar2.f15530h.isLimitAdTrackingEnabled();
                } else {
                    id = null;
                    isLimitAdTrackingEnabled = false;
                }
                if (TextUtils.isEmpty(id)) {
                    aja.m19216a();
                    bundle10.putString("pdid", hn.m19873b(context));
                    str4 = "pdidtype";
                    str5 = "ssaid";
                } else {
                    bundle10.putString("rdid", id);
                    bundle10.putBoolean("is_lat", isLimitAdTrackingEnabled);
                    str4 = "idtype";
                    str5 = "adid";
                }
                bundle10.putString(str4, str5);
            }
            hashMap.put("pii", bundle10);
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (location2 != null) {
                m19498a((HashMap) hashMap, location2);
                zzaat = zzaat2;
            } else {
                zzaat = zzaat2;
                if (zzaat.zzcnd.versionCode >= 2 && zzaat.zzcnd.zzbdn != null) {
                    m19498a((HashMap) hashMap, zzaat.zzcnd.zzbdn);
                }
            }
            if (zzaat.versionCode >= 2) {
                hashMap.put("quality_signals", zzaat.zzcni);
            }
            if (zzaat.versionCode >= 4 && zzaat.zzcnl) {
                hashMap.put("forceHttps", Boolean.valueOf(zzaat.zzcnl));
            }
            if (bundle2 != null) {
                hashMap.put("content_info", bundle2);
            }
            if (zzaat.versionCode >= 5) {
                hashMap.put("u_sd", Float.valueOf(zzaat.zzaxx));
                hashMap.put("sh", Integer.valueOf(zzaat.zzcnn));
                hashMap.put("sw", Integer.valueOf(zzaat.zzcnm));
            } else {
                hashMap.put("u_sd", Float.valueOf(bbVar3.f15863s));
                hashMap.put("sh", Integer.valueOf(bbVar3.f15865u));
                hashMap.put("sw", Integer.valueOf(bbVar3.f15864t));
            }
            if (zzaat.versionCode >= 6) {
                if (!TextUtils.isEmpty(zzaat.zzcno)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(zzaat.zzcno));
                    } catch (Throwable e2) {
                        hx.m19914c("Problem serializing view hierarchy to JSON", e2);
                    }
                }
                hashMap.put("correlation_id", Long.valueOf(zzaat.zzcnp));
            }
            if (zzaat.versionCode >= 7) {
                hashMap.put("request_id", zzaat.zzcnq);
            }
            if (zzaat.versionCode >= 12 && !TextUtils.isEmpty(zzaat.zzcnu)) {
                hashMap.put("anchor", zzaat.zzcnu);
            }
            if (zzaat.versionCode >= 13) {
                hashMap.put("android_app_volume", Float.valueOf(zzaat.zzcnv));
            }
            if (zzaat.versionCode >= 18) {
                hashMap.put("android_app_muted", Boolean.valueOf(zzaat.zzcob));
            }
            if (zzaat.versionCode >= 14 && zzaat.zzcnw > 0) {
                hashMap.put("target_api", Integer.valueOf(zzaat.zzcnw));
            }
            if (zzaat.versionCode >= 15) {
                String str6 = "scroll_index";
                int i4 = -1;
                if (zzaat.zzcnx != -1) {
                    i4 = zzaat.zzcnx;
                }
                hashMap.put(str6, Integer.valueOf(i4));
            }
            if (zzaat.versionCode >= 16) {
                hashMap.put("_activity_context", Boolean.valueOf(zzaat.zzcny));
            }
            if (zzaat.versionCode >= 18) {
                if (!TextUtils.isEmpty(zzaat.zzcoc)) {
                    try {
                        hashMap.put("app_settings", new JSONObject(zzaat.zzcoc));
                    } catch (Throwable e22) {
                        hx.m19914c("Problem creating json from app settings", e22);
                    }
                }
                hashMap.put("render_in_browser", Boolean.valueOf(zzaat.zzcdo));
            }
            if (zzaat.versionCode >= 18) {
                hashMap.put("android_num_video_cache_tasks", Integer.valueOf(zzaat.zzcod));
            }
            zzakd zzakd = zzaat.zzaty;
            boolean z = zzaat.zzcop;
            boolean z2 = aoVar2.f15534l;
            boolean z3 = zzaat.zzcor;
            Bundle bundle11 = new Bundle();
            bundle9 = new Bundle();
            bundle9.putString("cl", "179146524");
            bundle9.putString("rapid_rc", "dev");
            bundle9.putString("rapid_rollup", "HEAD");
            bundle11.putBundle("build_meta", bundle9);
            bundle11.putString("mf", Boolean.toString(((Boolean) aja.m19221f().m19334a(alo.bI)).booleanValue()));
            bundle11.putBoolean("instant_app", z);
            bundle11.putBoolean("lite", zzakd.zzdem);
            bundle11.putBoolean("local_service", z2);
            bundle11.putBoolean("is_privileged_process", z3);
            hashMap.put("sdk_env", bundle11);
            hashMap.put("cache_state", jSONObject2);
            if (zzaat.versionCode >= 19) {
                hashMap.put("gct", zzaat.zzcof);
            }
            if (zzaat.versionCode >= 21 && zzaat.zzcog) {
                hashMap.put("de", "1");
            }
            if (((Boolean) aja.m19221f().m19334a(alo.aF)).booleanValue()) {
                Bundle bundle12;
                Object obj7;
                Bundle bundle13;
                str = zzaat.zzauc.zzbek;
                if (!str.equals("interstitial_mb")) {
                    if (!str.equals("reward_mb")) {
                        obj2 = null;
                        bundle12 = zzaat.zzcoh;
                        obj7 = bundle12 == null ? 1 : null;
                        if (!(obj2 == null || obj7 == null)) {
                            bundle13 = new Bundle();
                            bundle13.putBundle("interstitial_pool", bundle12);
                            hashMap.put("counters", bundle13);
                        }
                    }
                }
                obj2 = 1;
                bundle12 = zzaat.zzcoh;
                if (bundle12 == null) {
                }
                bundle13 = new Bundle();
                bundle13.putBundle("interstitial_pool", bundle12);
                hashMap.put("counters", bundle13);
            }
            if (zzaat.zzcoi != null) {
                hashMap.put("gmp_app_id", zzaat.zzcoi);
            }
            if (zzaat.zzcoj == null) {
                obj2 = "fbs_aiid";
                obj3 = "";
            } else if ("TIME_OUT".equals(zzaat.zzcoj)) {
                obj2 = "sai_timeout";
                obj3 = aja.m19221f().m19334a(alo.ap);
            } else {
                obj2 = "fbs_aiid";
                obj3 = zzaat.zzcoj;
            }
            hashMap.put(obj2, obj3);
            if (zzaat.zzcok != null) {
                hashMap.put("fbs_aeid", zzaat.zzcok);
            }
            if (zzaat.versionCode >= 24) {
                hashMap.put("disable_ml", Boolean.valueOf(zzaat.zzcoq));
            }
            str = (String) aja.m19221f().m19334a(alo.f15423A);
            if (!(str == null || str.isEmpty())) {
                if (VERSION.SDK_INT >= ((Integer) aja.m19221f().m19334a(alo.f15424B)).intValue()) {
                    HashMap hashMap2 = new HashMap();
                    String[] split = str.split(",");
                    int length2 = split.length;
                    for (i = 
/*
Method generation error in method: com.google.android.gms.internal.au.a(android.content.Context, com.google.android.gms.internal.ao):org.json.JSONObject, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r10_113 'i' int) = (r10_111 'i' int), (r10_112 'i' int) binds: {(r10_111 'i' int)=B:188:0x052e, (r10_112 'i' int)=B:189:0x0532} in method: com.google.android.gms.internal.au.a(android.content.Context, com.google.android.gms.internal.ao):org.json.JSONObject, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:279)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 31 more

*/

                    /* renamed from: a */
                    public static JSONObject m19497a(zzaax zzaax) throws JSONException {
                        String str;
                        Object obj;
                        JSONObject jSONObject = new JSONObject();
                        if (zzaax.zzcja != null) {
                            jSONObject.put("ad_base_url", zzaax.zzcja);
                        }
                        if (zzaax.zzcoz != null) {
                            jSONObject.put("ad_size", zzaax.zzcoz);
                        }
                        jSONObject.put("native", zzaax.zzben);
                        jSONObject.put(zzaax.zzben ? "ad_json" : "ad_html", zzaax.body);
                        if (zzaax.zzcpb != null) {
                            jSONObject.put("debug_dialog", zzaax.zzcpb);
                        }
                        if (zzaax.zzcps != null) {
                            jSONObject.put("debug_signals", zzaax.zzcps);
                        }
                        if (zzaax.zzcov != -1) {
                            jSONObject.put("interstitial_timeout", ((double) zzaax.zzcov) / 1000.0d);
                        }
                        if (zzaax.orientation == ar.g().mo4621b()) {
                            str = "orientation";
                            obj = "portrait";
                        } else {
                            if (zzaax.orientation == ar.g().mo4619a()) {
                                str = "orientation";
                                obj = "landscape";
                            }
                            if (zzaax.zzcdk != null) {
                                jSONObject.put("click_urls", m19495a(zzaax.zzcdk));
                            }
                            if (zzaax.zzcdl != null) {
                                jSONObject.put("impression_urls", m19495a(zzaax.zzcdl));
                            }
                            if (zzaax.zzcoy != null) {
                                jSONObject.put("manual_impression_urls", m19495a(zzaax.zzcoy));
                            }
                            if (zzaax.zzcpe != null) {
                                jSONObject.put("active_view", zzaax.zzcpe);
                            }
                            jSONObject.put("ad_is_javascript", zzaax.zzcpc);
                            if (zzaax.zzcpd != null) {
                                jSONObject.put("ad_passback_url", zzaax.zzcpd);
                            }
                            jSONObject.put("mediation", zzaax.zzcow);
                            jSONObject.put("custom_render_allowed", zzaax.zzcpf);
                            jSONObject.put("content_url_opted_out", zzaax.zzcpg);
                            jSONObject.put("content_vertical_opted_out", zzaax.zzcpt);
                            jSONObject.put("prefetch", zzaax.zzcph);
                            if (zzaax.zzcdq != -1) {
                                jSONObject.put("refresh_interval_milliseconds", zzaax.zzcdq);
                            }
                            if (zzaax.zzcox != -1) {
                                jSONObject.put("mediation_config_cache_time_milliseconds", zzaax.zzcox);
                            }
                            if (!TextUtils.isEmpty(zzaax.zzcpk)) {
                                jSONObject.put("gws_query_id", zzaax.zzcpk);
                            }
                            jSONObject.put("fluid", zzaax.zzbeo ? "height" : "");
                            jSONObject.put("native_express", zzaax.zzbep);
                            if (zzaax.zzcpm != null) {
                                jSONObject.put("video_start_urls", m19495a(zzaax.zzcpm));
                            }
                            if (zzaax.zzcpn != null) {
                                jSONObject.put("video_complete_urls", m19495a(zzaax.zzcpn));
                            }
                            if (zzaax.zzcpl != null) {
                                zzaeq zzaeq = zzaax.zzcpl;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("rb_type", zzaeq.type);
                                jSONObject2.put("rb_amount", zzaeq.zzcwd);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(jSONObject2);
                                jSONObject.put("rewards", jSONArray);
                            }
                            jSONObject.put("use_displayed_impression", zzaax.zzcpo);
                            jSONObject.put("auto_protection_configuration", zzaax.zzcpp);
                            jSONObject.put("render_in_browser", zzaax.zzcdo);
                            return jSONObject;
                        }
                        jSONObject.put(str, obj);
                        if (zzaax.zzcdk != null) {
                            jSONObject.put("click_urls", m19495a(zzaax.zzcdk));
                        }
                        if (zzaax.zzcdl != null) {
                            jSONObject.put("impression_urls", m19495a(zzaax.zzcdl));
                        }
                        if (zzaax.zzcoy != null) {
                            jSONObject.put("manual_impression_urls", m19495a(zzaax.zzcoy));
                        }
                        if (zzaax.zzcpe != null) {
                            jSONObject.put("active_view", zzaax.zzcpe);
                        }
                        jSONObject.put("ad_is_javascript", zzaax.zzcpc);
                        if (zzaax.zzcpd != null) {
                            jSONObject.put("ad_passback_url", zzaax.zzcpd);
                        }
                        jSONObject.put("mediation", zzaax.zzcow);
                        jSONObject.put("custom_render_allowed", zzaax.zzcpf);
                        jSONObject.put("content_url_opted_out", zzaax.zzcpg);
                        jSONObject.put("content_vertical_opted_out", zzaax.zzcpt);
                        jSONObject.put("prefetch", zzaax.zzcph);
                        if (zzaax.zzcdq != -1) {
                            jSONObject.put("refresh_interval_milliseconds", zzaax.zzcdq);
                        }
                        if (zzaax.zzcox != -1) {
                            jSONObject.put("mediation_config_cache_time_milliseconds", zzaax.zzcox);
                        }
                        if (TextUtils.isEmpty(zzaax.zzcpk)) {
                            jSONObject.put("gws_query_id", zzaax.zzcpk);
                        }
                        if (zzaax.zzbeo) {
                        }
                        jSONObject.put("fluid", zzaax.zzbeo ? "height" : "");
                        jSONObject.put("native_express", zzaax.zzbep);
                        if (zzaax.zzcpm != null) {
                            jSONObject.put("video_start_urls", m19495a(zzaax.zzcpm));
                        }
                        if (zzaax.zzcpn != null) {
                            jSONObject.put("video_complete_urls", m19495a(zzaax.zzcpn));
                        }
                        if (zzaax.zzcpl != null) {
                            zzaeq zzaeq2 = zzaax.zzcpl;
                            JSONObject jSONObject22 = new JSONObject();
                            jSONObject22.put("rb_type", zzaeq2.type);
                            jSONObject22.put("rb_amount", zzaeq2.zzcwd);
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(jSONObject22);
                            jSONObject.put("rewards", jSONArray2);
                        }
                        jSONObject.put("use_displayed_impression", zzaax.zzcpo);
                        jSONObject.put("auto_protection_configuration", zzaax.zzcpp);
                        jSONObject.put("render_in_browser", zzaax.zzcdo);
                        return jSONObject;
                    }

                    /* renamed from: a */
                    private static void m19498a(HashMap<String, Object> hashMap, Location location) {
                        HashMap hashMap2 = new HashMap();
                        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                        hashMap2.put("radius", valueOf);
                        hashMap2.put(ManagerWebServices.PARAM_LAT, valueOf3);
                        hashMap2.put("long", valueOf4);
                        hashMap2.put("time", valueOf2);
                        hashMap.put("uule", hashMap2);
                    }
                }
