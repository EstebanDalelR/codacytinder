package net.danlew.android.joda;

import android.util.Log;
import io.fabric.sdk.android.services.events.C15645a;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: net.danlew.android.joda.d */
public class C15884d {
    /* renamed from: a */
    private static Map<Class<?>, Map<String, Integer>> f49060a = new ConcurrentHashMap();

    /* renamed from: b */
    private static String m59941b(String str) {
        File file = new File(str);
        str = new ArrayList();
        do {
            str.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = str.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
            }
            stringBuffer.append((String) str.get(size));
        }
        return stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public static String m59940a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("joda_");
        stringBuilder.append(C15884d.m59941b(str));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static int m59939a(Class<?> cls, String str) {
        Map map;
        if (f49060a.containsKey(cls)) {
            map = (Map) f49060a.get(cls);
        } else {
            map = new ConcurrentHashMap();
            f49060a.put(cls, map);
        }
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        try {
            int i = cls.getField(str).getInt(null);
            if (i != 0) {
                map.put(str, Integer.valueOf(i));
            }
            return i;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to retrieve identifier: type=");
            stringBuilder.append(cls);
            stringBuilder.append(" name=");
            stringBuilder.append(str);
            Log.e("JodaTimeAndroid", stringBuilder.toString(), e);
            return null;
        }
    }
}
