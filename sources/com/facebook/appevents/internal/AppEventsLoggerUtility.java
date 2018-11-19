package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C1701b;
import com.facebook.internal.C1738r;
import com.facebook.internal.Utility;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppEventsLoggerUtility {
    /* renamed from: a */
    private static final Map<GraphAPIActivityType, String> f4539a = new C16431();

    /* renamed from: com.facebook.appevents.internal.AppEventsLoggerUtility$1 */
    static class C16431 extends HashMap<GraphAPIActivityType, String> {
        C16431() {
            put(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m5579a(GraphAPIActivityType graphAPIActivityType, C1701b c1701b, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f4539a.get(graphAPIActivityType));
        graphAPIActivityType = AppEventsLogger.m5531e();
        if (graphAPIActivityType != null) {
            jSONObject.put("app_user_id", graphAPIActivityType);
        }
        Utility.m5781a(jSONObject, c1701b, str, z);
        try {
            Utility.m5780a(jSONObject, context);
        } catch (GraphAPIActivityType graphAPIActivityType2) {
            C1738r.m5979a(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", graphAPIActivityType2.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
