package com.appsflyer;

import com.tinder.api.networkperf.InstrumentationConstantsKt;
import java.security.MessageDigest;
import java.util.Formatter;
import java.util.Map;

/* renamed from: com.appsflyer.y */
final class C0960y {
    C0960y() {
    }

    /* renamed from: a */
    public final String m3276a(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        String str2 = (String) map.get("af_timestamp");
        String str3 = (String) map.get(InstrumentationConstantsKt.FIELD_UID);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, 7));
        stringBuilder.append(str3.substring(0, 7));
        stringBuilder.append(str2.substring(str2.length() - 7));
        return C0960y.m3273a(stringBuilder.toString());
    }

    /* renamed from: b */
    public final String m3277b(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(map.get("af_timestamp"));
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(map.get(InstrumentationConstantsKt.FIELD_UID));
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(map.get("installDate"));
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(map.get("counter"));
        str = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(map.get("iaecounter"));
        return C0960y.m3273a(C0960y.m3275b(stringBuilder.toString()));
    }

    /* renamed from: a */
    public static String m3273a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return C0960y.m3274a(instance.digest());
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to SHA1");
            AFLogger.m3073a(stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m3275b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return C0960y.m3274a(instance.digest());
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Error turning ");
            stringBuilder.append(str.substring(0, 6));
            stringBuilder.append(".. to MD5");
            AFLogger.m3073a(stringBuilder.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private static String m3274a(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
        }
        bArr = formatter.toString();
        formatter.close();
        return bArr;
    }

    /* renamed from: a */
    public static String m3272a(long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(AppsFlyerProperties.m3086a().m3090a("AppsFlyerKey"));
        stringBuilder.append(j);
        return C0960y.m3273a(stringBuilder.toString());
    }
}
