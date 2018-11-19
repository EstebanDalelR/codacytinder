package com.appsflyer;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

final class ab extends AsyncTask<Void, Void, String> {
    /* renamed from: a */
    private final WeakReference<Context> f2441a;
    /* renamed from: b */
    private String f2442b;

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3143a((Void[]) objArr);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        m3144a((String) obj);
    }

    ab(WeakReference<Context> weakReference) {
        this.f2441a = weakReference;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f2442b = AppsFlyerProperties.m3086a().m3090a("gcmProjectNumber");
    }

    /* renamed from: a */
    protected final String m3143a(Void... voidArr) {
        voidArr = null;
        try {
            if (this.f2442b != null) {
                voidArr = C0932h.m3181b(this.f2441a, this.f2442b);
            }
            return voidArr;
        } catch (Throwable th) {
            AFLogger.m3073a("Error registering for uninstall feature", th);
            return null;
        }
    }

    /* renamed from: a */
    protected final void m3144a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String a = AppsFlyerProperties.m3086a().m3090a("afUninstallToken");
            C0947q c0947q = new C0947q(str);
            if (a == null) {
                C0932h.m3175a((Context) this.f2441a.get(), c0947q);
                return;
            }
            C0947q a2 = C0947q.m3235a(a);
            if (a2 != null && a2.m3241a(c0947q)) {
                C0932h.m3175a((Context) this.f2441a.get(), a2);
            }
        }
    }
}
