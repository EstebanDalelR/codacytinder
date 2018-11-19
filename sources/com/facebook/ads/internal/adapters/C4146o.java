package com.facebook.ads.internal.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.Settings.System;
import android.support.v4.content.C0436c;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.Type;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.p036c.C1374a;
import com.facebook.ads.internal.p036c.C1380b;
import com.facebook.ads.internal.p047k.C1490h;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import io.fabric.sdk.android.services.events.C15645a;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.o */
public class C4146o extends aa {
    /* renamed from: c */
    private ab f13225c;
    /* renamed from: d */
    private Context f13226d;
    /* renamed from: e */
    private boolean f13227e = false;
    /* renamed from: f */
    private String f13228f;
    /* renamed from: g */
    private String f13229g;
    /* renamed from: h */
    private String f13230h;
    /* renamed from: i */
    private String f13231i = UUID.randomUUID().toString();
    /* renamed from: j */
    private String f13232j;
    /* renamed from: k */
    private String f13233k;
    /* renamed from: l */
    private String f13234l;
    /* renamed from: m */
    private String f13235m;
    /* renamed from: n */
    private String f13236n;
    /* renamed from: o */
    private String f13237o;
    /* renamed from: p */
    private String f13238p;
    /* renamed from: q */
    private int f13239q;
    /* renamed from: r */
    private String f13240r;
    /* renamed from: s */
    private long f13241s;
    /* renamed from: t */
    private int f13242t = -1;
    /* renamed from: u */
    private ac f13243u;
    /* renamed from: v */
    private C1380b f13244v;

    /* renamed from: d */
    private void m16384d() {
        C0436c.m1648a(this.f13226d).m1652a(this.f13243u, this.f13243u.m4726a());
    }

    /* renamed from: e */
    private void m16385e() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.f13243u;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r2.f13226d;	 Catch:{ Exception -> 0x000f }
        r0 = android.support.v4.content.C0436c.m1648a(r0);	 Catch:{ Exception -> 0x000f }
        r1 = r2.f13243u;	 Catch:{ Exception -> 0x000f }
        r0.m1651a(r1);	 Catch:{ Exception -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.o.e():void");
    }

    /* renamed from: f */
    private String m16386f() {
        if (this.a == null) {
            return null;
        }
        Uri parse;
        Builder builder;
        String urlPrefix = AdSettings.getUrlPrefix();
        if (urlPrefix != null) {
            if (!urlPrefix.isEmpty()) {
                urlPrefix = String.format("https://www.%s.facebook.com/audience_network/server_side_reward", new Object[]{urlPrefix});
                parse = Uri.parse(urlPrefix);
                builder = new Builder();
                builder.scheme(parse.getScheme());
                builder.authority(parse.getAuthority());
                builder.path(parse.getPath());
                builder.query(parse.getQuery());
                builder.fragment(parse.getFragment());
                builder.appendQueryParameter("puid", this.a.getUserID());
                builder.appendQueryParameter("pc", this.a.getCurrency());
                builder.appendQueryParameter("ptid", this.f13231i);
                builder.appendQueryParameter("appid", this.f13236n);
                return builder.build().toString();
            }
        }
        urlPrefix = "https://www.facebook.com/audience_network/server_side_reward";
        parse = Uri.parse(urlPrefix);
        builder = new Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        builder.query(parse.getQuery());
        builder.fragment(parse.getFragment());
        builder.appendQueryParameter("puid", this.a.getUserID());
        builder.appendQueryParameter("pc", this.a.getCurrency());
        builder.appendQueryParameter("ptid", this.f13231i);
        builder.appendQueryParameter("appid", this.f13236n);
        return builder.build().toString();
    }

    /* renamed from: g */
    private String m16387g() {
        return this.f13237o;
    }

    /* renamed from: a */
    public String m16388a() {
        Object obj = "";
        if (this.f13244v != null) {
            obj = this.f13244v.m4809c(this.f13232j);
        }
        return TextUtils.isEmpty(obj) ? this.f13232j : obj;
    }

    /* renamed from: a */
    public void mo3334a(Context context, ab abVar, Map<String, Object> map, final boolean z) {
        this.f13225c = abVar;
        this.f13226d = context;
        this.f13227e = false;
        JSONObject jSONObject = (JSONObject) map.get(ManagerWebServices.FB_DATA);
        this.f13232j = jSONObject.optString("video_url");
        if (this.f13232j != null) {
            if (!this.f13232j.isEmpty()) {
                this.f13233k = jSONObject.optString("video_report_url");
                this.f13238p = jSONObject.optString("ct");
                this.f13234l = jSONObject.optString("end_card_markup");
                this.f13235m = jSONObject.optString("activation_command");
                this.f13237o = jSONObject.optString("context_switch", "endvideo");
                this.f13230h = jSONObject.optString(ManagerWebServices.PARAM_JOB_TITLE);
                this.f13229g = jSONObject.optString("subtitle");
                if (jSONObject.has(AnalyticsConstants.VALUE_SHARE_METHOD_ICON) && !jSONObject.isNull(AnalyticsConstants.VALUE_SHARE_METHOD_ICON)) {
                    try {
                        this.f13228f = jSONObject.getJSONObject(AnalyticsConstants.VALUE_SHARE_METHOD_ICON).getString("url");
                    } catch (Throwable e) {
                        Log.w(C4146o.class.toString(), "Failed to get adIconURL", e);
                    }
                }
                this.f13239q = jSONObject.optInt("skippable_seconds");
                this.f13242t = jSONObject.optInt("video_duration_sec");
                this.f13240r = (String) map.get(AudienceNetworkActivity.PLACEMENT_ID);
                this.f13236n = this.f13240r != null ? this.f13240r.split(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR)[0] : "";
                this.f13241s = ((Long) map.get(AudienceNetworkActivity.REQUEST_TIME)).longValue();
                this.f13243u = new ac(this.f13231i, this, abVar);
                m16384d();
                this.f13244v = new C1380b(context);
                this.f13244v.m4808b(this.f13232j);
                this.f13244v.m4806a(new C1374a(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4146o f10003b;

                    /* renamed from: c */
                    private void m12563c() {
                        this.f10003b.f13227e = true;
                        this.f10003b.f13225c.mo1702a(this.f10003b);
                    }

                    /* renamed from: a */
                    public void mo1673a() {
                        m12563c();
                    }

                    /* renamed from: b */
                    public void mo1674b() {
                        if (z) {
                            this.f10003b.f13225c.mo1703a(this.f10003b, AdError.CACHE_ERROR);
                        } else {
                            m12563c();
                        }
                    }
                });
                return;
            }
        }
        this.f13225c.mo1703a(this, AdError.INTERNAL_ERROR);
    }

    /* renamed from: b */
    public int mo3335b() {
        return this.f13242t;
    }

    /* renamed from: c */
    public boolean mo3336c() {
        if (!this.f13227e) {
            return false;
        }
        String str;
        int i;
        Intent intent = new Intent(this.f13226d, AudienceNetworkActivity.class);
        intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, Type.REWARDED_VIDEO);
        intent.putExtra(AudienceNetworkActivity.VIDEO_URL, m16388a());
        intent.putExtra(AudienceNetworkActivity.VIDEO_REPORT_URL, this.f13233k);
        if (this.b == -1 || System.getInt(this.f13226d.getContentResolver(), "accelerometer_rotation", 0) == 1) {
            if (!C1418g.m4939j(this.f13226d)) {
                str = AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY;
                i = 6;
            }
            intent.putExtra(AudienceNetworkActivity.END_CARD_ACTIVATION_COMMAND, this.f13235m);
            intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f13231i);
            intent.putExtra(AudienceNetworkActivity.END_CARD_MARKUP, C1490h.m5256a(this.f13234l));
            intent.putExtra(AudienceNetworkActivity.CLIENT_TOKEN, this.f13238p);
            intent.putExtra(AudienceNetworkActivity.REWARD_SERVER_URL, m16386f());
            intent.putExtra(AudienceNetworkActivity.CONTEXT_SWITCH_BEHAVIOR, m16387g());
            intent.putExtra(AudienceNetworkActivity.AD_TITLE, this.f13230h);
            intent.putExtra(AudienceNetworkActivity.AD_SUBTITLE, this.f13229g);
            intent.putExtra(AudienceNetworkActivity.AD_ICON_URL, this.f13228f);
            intent.putExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, this.f13239q);
            intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, this.f13240r);
            intent.putExtra(AudienceNetworkActivity.REQUEST_TIME, this.f13241s);
            if (!(this.f13226d instanceof Activity)) {
                intent.setFlags(intent.getFlags() | 268435456);
            }
            this.f13226d.startActivity(intent);
            return true;
        }
        str = AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY;
        i = this.b;
        intent.putExtra(str, i);
        intent.putExtra(AudienceNetworkActivity.END_CARD_ACTIVATION_COMMAND, this.f13235m);
        intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f13231i);
        intent.putExtra(AudienceNetworkActivity.END_CARD_MARKUP, C1490h.m5256a(this.f13234l));
        intent.putExtra(AudienceNetworkActivity.CLIENT_TOKEN, this.f13238p);
        intent.putExtra(AudienceNetworkActivity.REWARD_SERVER_URL, m16386f());
        intent.putExtra(AudienceNetworkActivity.CONTEXT_SWITCH_BEHAVIOR, m16387g());
        intent.putExtra(AudienceNetworkActivity.AD_TITLE, this.f13230h);
        intent.putExtra(AudienceNetworkActivity.AD_SUBTITLE, this.f13229g);
        intent.putExtra(AudienceNetworkActivity.AD_ICON_URL, this.f13228f);
        intent.putExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, this.f13239q);
        intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, this.f13240r);
        intent.putExtra(AudienceNetworkActivity.REQUEST_TIME, this.f13241s);
        if (this.f13226d instanceof Activity) {
            intent.setFlags(intent.getFlags() | 268435456);
        }
        this.f13226d.startActivity(intent);
        return true;
    }

    public void onDestroy() {
        m16385e();
    }
}
