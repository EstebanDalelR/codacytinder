package io.fabric.sdk.android;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.C15622f;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.network.C17345b;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.C15658d;
import io.fabric.sdk.android.services.settings.C15659e;
import io.fabric.sdk.android.services.settings.C15662m;
import io.fabric.sdk.android.services.settings.C15665p;
import io.fabric.sdk.android.services.settings.C18336g;
import io.fabric.sdk.android.services.settings.C18337s;
import io.fabric.sdk.android.services.settings.Settings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: io.fabric.sdk.android.i */
class C17324i extends C15611g<Boolean> {
    /* renamed from: a */
    private final HttpRequestFactory f53028a = new C17345b();
    /* renamed from: b */
    private PackageManager f53029b;
    /* renamed from: c */
    private String f53030c;
    /* renamed from: d */
    private PackageInfo f53031d;
    /* renamed from: e */
    private String f53032e;
    /* renamed from: f */
    private String f53033f;
    /* renamed from: g */
    private String f53034g;
    /* renamed from: h */
    private String f53035h;
    /* renamed from: i */
    private String f53036i;
    /* renamed from: j */
    private final Future<Map<String, C15612h>> f53037j;
    /* renamed from: k */
    private final Collection<C15611g> f53038k;

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public String getVersion() {
        return "1.4.3.25";
    }

    protected /* synthetic */ Object doInBackground() {
        return m63383a();
    }

    public C17324i(Future<Map<String, C15612h>> future, Collection<C15611g> collection) {
        this.f53037j = future;
        this.f53038k = collection;
    }

    protected boolean onPreExecute() {
        try {
            this.f53034g = getIdManager().m58644i();
            this.f53029b = getContext().getPackageManager();
            this.f53030c = getContext().getPackageName();
            this.f53031d = this.f53029b.getPackageInfo(this.f53030c, 0);
            this.f53032e = Integer.toString(this.f53031d.versionCode);
            this.f53033f = this.f53031d.versionName == null ? "0.0" : this.f53031d.versionName;
            this.f53035h = this.f53029b.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.f53036i = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (Throwable e) {
            C15608c.m58560h().mo12794e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* renamed from: a */
    protected Boolean m63383a() {
        boolean a;
        String k = CommonUtils.m58625k(getContext());
        C15665p c = m63381c();
        if (c != null) {
            try {
                Map map;
                if (this.f53037j != null) {
                    map = (Map) this.f53037j.get();
                } else {
                    map = new HashMap();
                }
                a = m63379a(k, c.f48506a, m63384a(map, this.f53038k).values());
            } catch (Throwable e) {
                C15608c.m58560h().mo12794e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(a);
        }
        a = false;
        return Boolean.valueOf(a);
    }

    /* renamed from: c */
    private C15665p m63381c() {
        try {
            Settings.m58816a().m58818a(this, this.idManager, this.f53028a, this.f53032e, this.f53033f, m63385b()).m58820c();
            return Settings.m58816a().m58819b();
        } catch (Throwable e) {
            C15608c.m58560h().mo12794e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* renamed from: a */
    Map<String, C15612h> m63384a(Map<String, C15612h> map, Collection<C15611g> collection) {
        for (C15611g c15611g : collection) {
            if (!map.containsKey(c15611g.getIdentifier())) {
                map.put(c15611g.getIdentifier(), new C15612h(c15611g.getIdentifier(), c15611g.getVersion(), "binary"));
            }
        }
        return map;
    }

    /* renamed from: a */
    private boolean m63379a(String str, C15659e c15659e, Collection<C15612h> collection) {
        if ("new".equals(c15659e.f48475b)) {
            if (m63380b(str, c15659e, collection) != null) {
                return Settings.m58816a().m58821d();
            }
            C15608c.m58560h().mo12794e("Fabric", "Failed to create app with Crashlytics service.", null);
            return null;
        } else if ("configured".equals(c15659e.f48475b)) {
            return Settings.m58816a().m58821d();
        } else {
            if (c15659e.f48479f) {
                C15608c.m58560h().mo12791d("Fabric", "Server says an update is required - forcing a full App update.");
                m63382c(str, c15659e, collection);
            }
            return true;
        }
    }

    /* renamed from: b */
    private boolean m63380b(String str, C15659e c15659e, Collection<C15612h> collection) {
        return new C18336g(this, m63385b(), c15659e.f48476c, this.f53028a).mo13558a(m63377a(C15662m.m58822a(getContext(), str), (Collection) collection));
    }

    /* renamed from: c */
    private boolean m63382c(String str, C15659e c15659e, Collection<C15612h> collection) {
        return m63378a(c15659e, C15662m.m58822a(getContext(), str), (Collection) collection);
    }

    /* renamed from: a */
    private boolean m63378a(C15659e c15659e, C15662m c15662m, Collection<C15612h> collection) {
        return new C18337s(this, m63385b(), c15659e.f48476c, this.f53028a).mo13558a(m63377a(c15662m, (Collection) collection));
    }

    /* renamed from: a */
    private C15658d m63377a(C15662m c15662m, Collection<C15612h> collection) {
        return new C15658d(new C15622f().m58689a(getContext()), getIdManager().m58638c(), this.f53033f, this.f53032e, CommonUtils.m58598a(CommonUtils.m58627m(r1)), this.f53035h, DeliveryMechanism.determineFrom(this.f53034g).getId(), this.f53036i, "0", c15662m, collection);
    }

    /* renamed from: b */
    String m63385b() {
        return CommonUtils.m58610b(getContext(), "com.crashlytics.ApiEndpoint");
    }
}
