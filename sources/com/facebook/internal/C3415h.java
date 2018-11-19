package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.h */
public class C3415h extends WebDialog {
    /* renamed from: a */
    private static final String f10396a = "com.facebook.internal.h";
    /* renamed from: b */
    private boolean f10397b;

    /* renamed from: com.facebook.internal.h$1 */
    class C17071 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3415h f4715a;

        C17071(C3415h c3415h) {
            this.f4715a = c3415h;
        }

        public void run() {
            super.cancel();
        }
    }

    /* renamed from: a */
    public static C3415h m13098a(Context context, String str, String str2) {
        WebDialog.m5828a(context);
        return new C3415h(context, str, str2);
    }

    private C3415h(Context context, String str, String str2) {
        super(context, str);
        m5842b(str2);
    }

    /* renamed from: a */
    protected Bundle mo1854a(String str) {
        str = Utility.m5795c(Uri.parse(str).getQuery());
        String string = str.getString("bridge_args");
        str.remove("bridge_args");
        if (!Utility.m5785a(string)) {
            try {
                str.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.m5709a(new JSONObject(string)));
            } catch (Throwable e) {
                Utility.m5778a(f10396a, "Unable to parse bridge_args JSON", e);
            }
        }
        string = str.getString("method_results");
        str.remove("method_results");
        if (!Utility.m5785a(string)) {
            if (Utility.m5785a(string)) {
                string = "{}";
            }
            try {
                str.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.m5709a(new JSONObject(string)));
            } catch (Throwable e2) {
                Utility.m5778a(f10396a, "Unable to parse bridge_args JSON", e2);
            }
        }
        str.remove("version");
        str.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C1745t.m6018a());
        return str;
    }

    public void cancel() {
        WebView d = m5845d();
        if (!(!m5844c() || m5843b() || d == null)) {
            if (d.isShown()) {
                if (!this.f10397b) {
                    this.f10397b = true;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("javascript:");
                    stringBuilder.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
                    d.loadUrl(stringBuilder.toString());
                    new Handler(Looper.getMainLooper()).postDelayed(new C17071(this), 1500);
                    return;
                }
                return;
            }
        }
        super.cancel();
    }
}
