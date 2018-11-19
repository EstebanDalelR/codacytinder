package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat.Action;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(16)
/* renamed from: android.support.v4.app.t */
class C0421t {
    /* renamed from: a */
    private static final Object f1413a = new Object();
    /* renamed from: b */
    private static Field f1414b;
    /* renamed from: c */
    private static boolean f1415c;
    /* renamed from: d */
    private static final Object f1416d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m1575a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m1573a(Notification notification) {
        synchronized (f1413a) {
            if (f1415c) {
                return null;
            }
            try {
                if (f1414b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        f1414b = declaredField;
                    } else {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1415c = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) f1414b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1414b.set(notification, bundle);
                }
                return bundle;
            } catch (Notification notification2) {
                Log.e("NotificationCompat", "Unable to access notification extras", notification2);
                f1415c = true;
                return null;
            } catch (Notification notification22) {
                Log.e("NotificationCompat", "Unable to access notification extras", notification22);
                f1415c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1572a(Builder builder, Action action) {
        builder.addAction(action.m1400a(), action.m1401b(), action.m1402c());
        builder = new Bundle(action.m1403d());
        if (action.m1405f() != null) {
            builder.putParcelableArray("android.support.remoteInputs", C0421t.m1576a(action.m1405f()));
        }
        if (action.m1406g() != null) {
            builder.putParcelableArray("android.support.dataRemoteInputs", C0421t.m1576a(action.m1406g()));
        }
        builder.putBoolean("android.support.allowGeneratedReplies", action.m1404e());
        return builder;
    }

    /* renamed from: a */
    private static Bundle m1574a(C0424w c0424w) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c0424w.m1583a());
        bundle.putCharSequence("label", c0424w.m1584b());
        bundle.putCharSequenceArray("choices", c0424w.m1585c());
        bundle.putBoolean("allowFreeFormInput", c0424w.m1587e());
        bundle.putBundle("extras", c0424w.m1588f());
        C0424w<String> d = c0424w.m1586d();
        if (!(d == null || d.isEmpty())) {
            ArrayList arrayList = new ArrayList(d.size());
            for (String add : d) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle[] m1576a(C0424w[] c0424wArr) {
        if (c0424wArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c0424wArr.length];
        for (int i = 0; i < c0424wArr.length; i++) {
            bundleArr[i] = C0421t.m1574a(c0424wArr[i]);
        }
        return bundleArr;
    }
}
