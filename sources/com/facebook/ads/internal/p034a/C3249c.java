package com.facebook.ads.internal.p034a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1488g;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1492j;
import com.facebook.ads.internal.p047k.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.c */
public class C3249c extends C1348a {
    /* renamed from: d */
    private static final String f9956d = "c";
    /* renamed from: e */
    private final Uri f9957e;
    /* renamed from: f */
    private final Map<String, String> f9958f;

    public C3249c(Context context, C1425f c1425f, String str, Uri uri, Map<String, String> map) {
        super(context, c1425f, str);
        this.f9957e = uri;
        this.f9958f = map;
    }

    /* renamed from: a */
    private Intent m12504a(C1492j c1492j) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (!(TextUtils.isEmpty(c1492j.m5262a()) || TextUtils.isEmpty(c1492j.m5263b()))) {
            intent.setComponent(new ComponentName(c1492j.m5262a(), c1492j.m5263b()));
        }
        if (!TextUtils.isEmpty(c1492j.m5264c())) {
            intent.setData(Uri.parse(c1492j.m5264c()));
        }
        return intent;
    }

    /* renamed from: b */
    private Intent m12505b(C1492j c1492j) {
        if (TextUtils.isEmpty(c1492j.m5262a()) || !C1488g.m5235a(this.a, c1492j.m5262a())) {
            return null;
        }
        CharSequence c = c1492j.m5264c();
        if (!TextUtils.isEmpty(c) && (c.startsWith("tel:") || c.startsWith("telprompt:"))) {
            return new Intent("android.intent.action.CALL", Uri.parse(c));
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (TextUtils.isEmpty(c1492j.m5263b()) && TextUtils.isEmpty(c)) {
            return packageManager.getLaunchIntentForPackage(c1492j.m5262a());
        }
        Intent a = m12504a(c1492j);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(a, 65536);
        if (a.getComponent() == null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(c1492j.m5262a())) {
                    a.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                    break;
                }
            }
        }
        return (queryIntentActivities.isEmpty() || a.getComponent() == null) ? null : a;
    }

    /* renamed from: e */
    private List<C1492j> m12506e() {
        Object queryParameter = this.f9957e.getQueryParameter("appsite_data");
        if (!TextUtils.isEmpty(queryParameter)) {
            if (!"[]".equals(queryParameter)) {
                List<C1492j> arrayList = new ArrayList();
                try {
                    JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray("android");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            C1492j a = C1492j.m5261a(optJSONArray.optJSONObject(i));
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                    }
                } catch (Throwable e) {
                    Log.w(f9956d, "Error parsing appsite_data", e);
                }
                return arrayList;
            }
        }
        return null;
    }

    /* renamed from: f */
    private boolean m12507f() {
        List<Intent> d = m12512d();
        if (d == null) {
            return false;
        }
        for (Intent startActivity : d) {
            try {
                this.a.startActivity(startActivity);
                return true;
            } catch (Throwable e) {
                Log.d(f9956d, "Failed to open app intent, falling back", e);
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m12508g() {
        ak akVar = new ak();
        try {
            C1490h.m5252a(akVar, this.a, m12511c(), this.c);
            return true;
        } catch (Throwable e) {
            String str = f9956d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open market url: ");
            stringBuilder.append(this.f9957e.toString());
            Log.d(str, stringBuilder.toString(), e);
            String queryParameter = this.f9957e.getQueryParameter("store_url_web_fallback");
            if (queryParameter != null && queryParameter.length() > 0) {
                try {
                    C1490h.m5252a(akVar, this.a, Uri.parse(queryParameter), this.c);
                } catch (Throwable e2) {
                    str = f9956d;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to open fallback url: ");
                    stringBuilder.append(queryParameter);
                    Log.d(str, stringBuilder.toString(), e2);
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public C1479a mo1717a() {
        return C1479a.OPEN_STORE;
    }

    /* renamed from: b */
    public void mo1718b() {
        Object obj = "opened_deeplink";
        if (!m12507f()) {
            obj = m12508g() ? "opened_store_url" : "opened_store_fallback_url";
        }
        this.f9958f.put(obj, String.valueOf(true));
        m4699a(this.f9958f);
    }

    /* renamed from: c */
    protected Uri m12511c() {
        Object queryParameter = this.f9957e.getQueryParameter("store_url");
        if (!TextUtils.isEmpty(queryParameter)) {
            return Uri.parse(queryParameter);
        }
        String queryParameter2 = this.f9957e.getQueryParameter("store_id");
        return Uri.parse(String.format("market://details?id=%s", new Object[]{queryParameter2}));
    }

    /* renamed from: d */
    protected List<Intent> m12512d() {
        List<C1492j> e = m12506e();
        List<Intent> arrayList = new ArrayList();
        if (e != null) {
            for (C1492j b : e) {
                Intent b2 = m12505b(b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }
}
