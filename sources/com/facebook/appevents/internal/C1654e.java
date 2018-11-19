package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.internal.Utility;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.facebook.appevents.internal.e */
public class C1654e {
    /* renamed from: a */
    private static final HashMap<String, Method> f4564a = new HashMap();
    /* renamed from: b */
    private static final HashMap<String, Class<?>> f4565b = new HashMap();
    /* renamed from: c */
    private static final String f4566c = C1654e.class.getCanonicalName();

    /* renamed from: a */
    public static Object m5608a(Context context, IBinder iBinder) {
        try {
            Method method = (Method) f4564a.get("iap_get_interface");
            if (method == null) {
                method = context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class});
                f4564a.put("iap_get_interface", method);
            }
            context = new Object[]{iBinder};
            Utility.m5793b(f4566c, "In-app billing service connected");
            return method.invoke(null, context);
        } catch (Context context2) {
            Log.e(f4566c, "com.android.vending.billing.IInAppBillingService$Stub is not available, please add com.android.vending.billing.IInAppBillingService to the project.", context2);
            return null;
        } catch (Context context22) {
            Log.e(f4566c, "com.android.vending.billing.IInAppBillingService$Stub.asInterface method not found", context22);
            return null;
        } catch (Context context222) {
            Log.e(f4566c, "Illegal access to method com.android.vending.billing.IInAppBillingService$Stub.asInterface", context222);
            return null;
        } catch (Context context2222) {
            Log.e(f4566c, "Invocation target exception in com.android.vending.billing.IInAppBillingService$Stub.asInterface", context2222);
            return null;
        }
    }

    /* renamed from: a */
    public static String m5609a(Context context, String str, Object obj, boolean z) {
        if (obj != null) {
            if (str != "") {
                try {
                    Method method = (Method) f4564a.get("iap_get_sku_details");
                    Class cls = (Class) f4565b.get("com.android.vending.billing.IInAppBillingService");
                    if (method == null || cls == null) {
                        cls = context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
                        method = cls.getDeclaredMethod("getSkuDetails", new Class[]{Integer.TYPE, String.class, String.class, Bundle.class});
                        f4564a.put("iap_get_sku_details", method);
                        f4565b.put("com.android.vending.billing.IInAppBillingService", cls);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    str = new Bundle();
                    str.putStringArrayList("ITEM_ID_LIST", arrayList);
                    obj = cls.cast(obj);
                    Object[] objArr = new Object[4];
                    objArr[0] = Integer.valueOf(3);
                    objArr[1] = context.getPackageName();
                    objArr[2] = z ? "subs" : "inapp";
                    objArr[3] = str;
                    Bundle bundle = (Bundle) method.invoke(obj, objArr);
                    if (bundle.getInt("RESPONSE_CODE") == null) {
                        context = bundle.getStringArrayList("DETAILS_LIST");
                        return context.size() < 1 ? "" : (String) context.get(0);
                    }
                } catch (Context context2) {
                    Log.e(f4566c, "com.android.vending.billing.IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to the project, and import the IInAppBillingService.aidl file into this package", context2);
                } catch (Context context22) {
                    Log.e(f4566c, "com.android.vending.billing.IInAppBillingService.getSkuDetails method is not available", context22);
                } catch (Context context222) {
                    Log.e(f4566c, "Invocation target exception in com.android.vending.billing.IInAppBillingService.getSkuDetails", context222);
                } catch (Context context2222) {
                    Log.e(f4566c, "Illegal access to method com.android.vending.billing.IInAppBillingService.getSkuDetails", context2222);
                }
                return "";
            }
        }
        return "";
    }
}
