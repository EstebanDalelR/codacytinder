package io.fabric.sdk.android.services.settings;

import android.content.res.Resources.NotFoundException;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.C15612h;
import io.fabric.sdk.android.services.common.C15616a;
import io.fabric.sdk.android.services.common.C15629l;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: io.fabric.sdk.android.services.settings.a */
abstract class C17348a extends C15616a {
    public C17348a(C15611g c15611g, String str, String str2, HttpRequestFactory httpRequestFactory, HttpMethod httpMethod) {
        super(c15611g, str, str2, httpRequestFactory, httpMethod);
    }

    /* renamed from: a */
    public boolean mo13558a(C15658d c15658d) {
        HttpRequest b = m63410b(m63409a(getHttpRequest(), c15658d), c15658d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending app info to ");
        stringBuilder.append(getUrl());
        C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
        if (c15658d.f48472j != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("App icon hash is ");
            stringBuilder.append(c15658d.f48472j.f48488a);
            C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("App icon size is ");
            stringBuilder.append(c15658d.f48472j.f48490c);
            stringBuilder.append("x");
            stringBuilder.append(c15658d.f48472j.f48491d);
            C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
        }
        c15658d = b.m58778b();
        String str = "POST".equals(b.m58802p()) ? "Create" : "Update";
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(" app request ID: ");
        stringBuilder2.append(b.m58780b(C15616a.HEADER_REQUEST_ID));
        C15608c.m58560h().mo12791d("Fabric", stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Result was ");
        stringBuilder3.append(c15658d);
        C15608c.m58560h().mo12791d("Fabric", stringBuilder3.toString());
        return C15629l.m58705a(c15658d) == null ? true : null;
    }

    /* renamed from: a */
    private HttpRequest m63409a(HttpRequest httpRequest, C15658d c15658d) {
        return httpRequest.m58768a(C15616a.HEADER_API_KEY, c15658d.f48463a).m58768a(C15616a.HEADER_CLIENT_TYPE, "android").m58768a(C15616a.HEADER_CLIENT_VERSION, this.kit.getVersion());
    }

    /* renamed from: b */
    private HttpRequest m63410b(HttpRequest httpRequest, C15658d c15658d) {
        Closeable openRawResource;
        Throwable e;
        StringBuilder stringBuilder;
        httpRequest = httpRequest.m58788e("app[identifier]", c15658d.f48464b).m58788e("app[name]", c15658d.f48468f).m58788e("app[display_version]", c15658d.f48465c).m58788e("app[build_version]", c15658d.f48466d).m58767a("app[source]", Integer.valueOf(c15658d.f48469g)).m58788e("app[minimum_sdk_version]", c15658d.f48470h).m58788e("app[built_sdk_version]", c15658d.f48471i);
        if (!CommonUtils.m58618d(c15658d.f48467e)) {
            httpRequest.m58788e("app[instance_identifier]", c15658d.f48467e);
        }
        if (c15658d.f48472j != null) {
            try {
                openRawResource = this.kit.getContext().getResources().openRawResource(c15658d.f48472j.f48489b);
                try {
                    httpRequest.m58788e("app[icon][hash]", c15658d.f48472j.f48488a).m58772a("app[icon][data]", "icon.png", "application/octet-stream", (InputStream) openRawResource).m58767a("app[icon][width]", Integer.valueOf(c15658d.f48472j.f48490c)).m58767a("app[icon][height]", Integer.valueOf(c15658d.f48472j.f48491d));
                } catch (NotFoundException e2) {
                    e = e2;
                    try {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to find app icon with resource ID: ");
                        stringBuilder.append(c15658d.f48472j.f48489b);
                        C15608c.m58560h().mo12794e("Fabric", stringBuilder.toString(), e);
                        CommonUtils.m58603a(openRawResource, "Failed to close app icon InputStream.");
                        if (c15658d.f48473k != null) {
                            for (C15612h c15612h : c15658d.f48473k) {
                                httpRequest.m58788e(m63411a(c15612h), c15612h.m58581b());
                                httpRequest.m58788e(m63413b(c15612h), c15612h.m58582c());
                            }
                        }
                        return httpRequest;
                    } catch (Throwable th) {
                        httpRequest = th;
                        CommonUtils.m58603a(openRawResource, "Failed to close app icon InputStream.");
                        throw httpRequest;
                    }
                }
            } catch (Throwable e3) {
                Throwable th2 = e3;
                openRawResource = null;
                e = th2;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to find app icon with resource ID: ");
                stringBuilder.append(c15658d.f48472j.f48489b);
                C15608c.m58560h().mo12794e("Fabric", stringBuilder.toString(), e);
                CommonUtils.m58603a(openRawResource, "Failed to close app icon InputStream.");
                if (c15658d.f48473k != null) {
                    for (C15612h c15612h2 : c15658d.f48473k) {
                        httpRequest.m58788e(m63411a(c15612h2), c15612h2.m58581b());
                        httpRequest.m58788e(m63413b(c15612h2), c15612h2.m58582c());
                    }
                }
                return httpRequest;
            } catch (Throwable th3) {
                httpRequest = th3;
                openRawResource = null;
                CommonUtils.m58603a(openRawResource, "Failed to close app icon InputStream.");
                throw httpRequest;
            }
            CommonUtils.m58603a(openRawResource, "Failed to close app icon InputStream.");
        }
        if (c15658d.f48473k != null) {
            for (C15612h c15612h22 : c15658d.f48473k) {
                httpRequest.m58788e(m63411a(c15612h22), c15612h22.m58581b());
                httpRequest.m58788e(m63413b(c15612h22), c15612h22.m58582c());
            }
        }
        return httpRequest;
    }

    /* renamed from: a */
    String m63411a(C15612h c15612h) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{c15612h.m58580a()});
    }

    /* renamed from: b */
    String m63413b(C15612h c15612h) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{c15612h.m58580a()});
    }
}
