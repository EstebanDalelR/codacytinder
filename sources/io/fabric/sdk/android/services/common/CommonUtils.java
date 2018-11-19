package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.C15608c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonUtils {
    /* renamed from: a */
    public static final Comparator<File> f48332a = new C156131();
    /* renamed from: b */
    private static Boolean f48333b = null;
    /* renamed from: c */
    private static final char[] f48334c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: d */
    private static long f48335d = -1;

    /* renamed from: io.fabric.sdk.android.services.common.CommonUtils$1 */
    static class C156131 implements Comparator<File> {
        C156131() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m58583a((File) obj, (File) obj2);
        }

        /* renamed from: a */
        public int m58583a(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> matcher = null;

        static {
            matcher = new HashMap(4);
            matcher.put("armeabi-v7a", ARMV7);
            matcher.put("armeabi", ARMV6);
            matcher.put("arm64-v8a", ARM64);
            matcher.put("x86", X86_32);
        }

        static Architecture getValue() {
            Object obj = Build.CPU_ABI;
            if (TextUtils.isEmpty(obj)) {
                C15608c.m58560h().mo12791d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = (Architecture) matcher.get(obj.toLowerCase(Locale.US));
            if (architecture == null) {
                architecture = UNKNOWN;
            }
            return architecture;
        }
    }

    /* renamed from: b */
    public static String m58609b(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    /* renamed from: a */
    public static SharedPreferences m58589a(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* renamed from: a */
    public static String m58591a(File file, String str) {
        Closeable bufferedReader;
        String str2 = null;
        if (file.exists()) {
            try {
                String[] split;
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        CharSequence readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            break;
                        }
                    } catch (Exception e) {
                        str = e;
                    }
                }
                str2 = split[1];
            } catch (Exception e2) {
                str = e2;
                bufferedReader = null;
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error parsing ");
                    stringBuilder.append(file);
                    C15608c.m58560h().mo12794e("Fabric", stringBuilder.toString(), str);
                    m58603a(bufferedReader, "Failed to close system file reader.");
                    return str2;
                } catch (Throwable th) {
                    file = th;
                    m58603a(bufferedReader, "Failed to close system file reader.");
                    throw file;
                }
            } catch (Throwable th2) {
                file = th2;
                bufferedReader = null;
                m58603a(bufferedReader, "Failed to close system file reader.");
                throw file;
            }
            m58603a(bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    /* renamed from: a */
    public static int m58584a() {
        return Architecture.getValue().ordinal();
    }

    /* renamed from: b */
    public static synchronized long m58607b() {
        long j;
        synchronized (CommonUtils.class) {
            if (f48335d == -1) {
                j = 0;
                Object a = m58591a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    String toUpperCase = a.toUpperCase(Locale.US);
                    try {
                        long a2;
                        if (toUpperCase.endsWith("KB")) {
                            a2 = m58587a(toUpperCase, "KB", 1024);
                        } else if (toUpperCase.endsWith("MB")) {
                            a2 = m58587a(toUpperCase, "MB", 1048576);
                        } else if (toUpperCase.endsWith("GB")) {
                            a2 = m58587a(toUpperCase, "GB", 1073741824);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unexpected meminfo format while computing RAM: ");
                            stringBuilder.append(toUpperCase);
                            C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
                        }
                        j = a2;
                    } catch (Throwable e) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Unexpected meminfo format while computing RAM: ");
                        stringBuilder2.append(toUpperCase);
                        C15608c.m58560h().mo12794e("Fabric", stringBuilder2.toString(), e);
                    }
                }
                f48335d = j;
            }
            j = f48335d;
        }
        return j;
    }

    /* renamed from: a */
    static long m58587a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[null].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static RunningAppProcessInfo m58588a(String str, Context context) {
        Context<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m58592a(InputStream inputStream) throws IOException {
        inputStream = new Scanner(inputStream).useDelimiter("\\A");
        return inputStream.hasNext() ? inputStream.next() : "";
    }

    /* renamed from: a */
    public static String m58594a(String str) {
        return m58595a(str, "SHA-1");
    }

    /* renamed from: b */
    public static String m58612b(String str) {
        return m58595a(str, "SHA-256");
    }

    /* renamed from: b */
    public static String m58611b(InputStream inputStream) {
        return m58593a(inputStream, "SHA-1");
    }

    /* renamed from: a */
    private static String m58595a(String str, String str2) {
        return m58597a(str.getBytes(), str2);
    }

    /* renamed from: a */
    private static String m58593a(InputStream inputStream, String str) {
        try {
            str = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m58596a(str.digest());
                }
                str.update(bArr, 0, read);
            }
        } catch (InputStream inputStream2) {
            C15608c.m58560h().mo12794e("Fabric", "Could not calculate hash for app icon.", inputStream2);
            return "";
        }
    }

    /* renamed from: a */
    private static String m58597a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m58596a(instance.digest());
        } catch (byte[] bArr2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create hashing algorithm: ");
            stringBuilder.append(str);
            stringBuilder.append(", returning empty string.");
            C15608c.m58560h().mo12794e("Fabric", stringBuilder.toString(), bArr2);
            return "";
        }
    }

    /* renamed from: a */
    public static String m58598a(String... strArr) {
        String str = null;
        if (strArr != null) {
            if (strArr.length != 0) {
                List<String> arrayList = new ArrayList();
                for (String str2 : strArr) {
                    if (str2 != null) {
                        arrayList.add(str2.replace("-", "").toLowerCase(Locale.US));
                    }
                }
                Collections.sort(arrayList);
                strArr = new StringBuilder();
                for (String append : arrayList) {
                    strArr.append(append);
                }
                String stringBuilder = strArr.toString();
                if (stringBuilder.length() > 0) {
                    str = m58594a(stringBuilder);
                }
                return str;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static long m58608b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: c */
    public static long m58613c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: c */
    public static Float m58614c(Context context) {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context == null) {
            return null;
        }
        return Float.valueOf(((float) context.getIntExtra("level", -1)) / ((float) context.getIntExtra("scale", -1)));
    }

    /* renamed from: d */
    public static boolean m58617d(Context context) {
        boolean z = false;
        if (m58620f(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static void m58600a(Context context, String str) {
        if (m58619e(context) != null) {
            C15608c.m58560h().mo12791d("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m58601a(Context context, String str, Throwable th) {
        if (m58619e(context) != null) {
            C15608c.m58560h().mo12793e("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m58599a(Context context, int i, String str, String str2) {
        if (m58619e(context) != null) {
            C15608c.m58560h().log(i, "Fabric", str2);
        }
    }

    /* renamed from: e */
    public static boolean m58619e(Context context) {
        if (f48333b == null) {
            f48333b = Boolean.valueOf(m58606a(context, "com.crashlytics.Trace", false));
        }
        return f48333b.booleanValue();
    }

    /* renamed from: a */
    public static boolean m58606a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = m58585a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                str = m58585a(context, str, ManagerWebServices.PARAM_TEASER_STRING);
                if (str > null) {
                    return Boolean.parseBoolean(context.getString(str));
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static int m58585a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m58624j(context));
    }

    /* renamed from: f */
    public static boolean m58620f(Context context) {
        context = Secure.getString(context.getContentResolver(), "android_id");
        if (!("sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT))) {
            if (context != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m58621g(Context context) {
        context = m58620f(context);
        String str = Build.TAGS;
        if ((context == null && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (context != null || file.exists() == null) {
            return null;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m58615c() {
        if (!Debug.isDebuggerConnected()) {
            if (!Debug.waitingForDebugger()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static int m58622h(Context context) {
        int i = m58620f(context) ? 1 : 0;
        if (m58621g(context) != null) {
            i |= 2;
        }
        return m58615c() != null ? i | 4 : i;
    }

    /* renamed from: a */
    public static int m58586a(Context context, boolean z) {
        context = m58614c(context);
        if (z) {
            if (context != null) {
                if (((double) context.floatValue()) >= 99.0d) {
                    return 3;
                }
                return ((double) context.floatValue()) < 4636666922610458624 ? 2 : null;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public static String m58596a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = f48334c[i2 >>> 4];
            cArr[i3 + 1] = f48334c[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: i */
    public static boolean m58623i(Context context) {
        return (context.getApplicationInfo().flags & 2) != null ? true : null;
    }

    /* renamed from: b */
    public static String m58610b(Context context, String str) {
        str = m58585a(context, str, ManagerWebServices.PARAM_TEASER_STRING);
        return str > null ? context.getString(str) : "";
    }

    /* renamed from: a */
    public static void m58603a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Closeable closeable2) {
                C15608c.m58560h().mo12794e("Fabric", str, closeable2);
            }
        }
    }

    /* renamed from: a */
    public static void m58604a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Flushable flushable2) {
                C15608c.m58560h().mo12794e("Fabric", str, flushable2);
            }
        }
    }

    /* renamed from: d */
    public static boolean m58618d(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m58590a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("value must be zero or greater");
        }
        return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
    }

    /* renamed from: j */
    public static String m58624j(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            return context.getResources().getResourcePackageName(i);
        }
        return context.getPackageName();
    }

    /* renamed from: a */
    public static void m58605a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public static String m58625k(Context context) {
        Throwable e;
        Throwable th;
        String str = null;
        Closeable openRawResource;
        try {
            openRawResource = context.getResources().openRawResource(m58626l(context));
            try {
                String b = m58611b((InputStream) openRawResource);
                if (!m58618d(b)) {
                    str = b;
                }
                m58603a(openRawResource, "Failed to close icon input stream.");
                return str;
            } catch (Exception e2) {
                e = e2;
                try {
                    C15608c.m58560h().mo12794e("Fabric", "Could not calculate hash for app icon.", e);
                    m58603a(openRawResource, "Failed to close icon input stream.");
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    m58603a(openRawResource, "Failed to close icon input stream.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            openRawResource = null;
            C15608c.m58560h().mo12794e("Fabric", "Could not calculate hash for app icon.", e);
            m58603a(openRawResource, "Failed to close icon input stream.");
            return null;
        } catch (Context context2) {
            th = context2;
            openRawResource = null;
            m58603a(openRawResource, "Failed to close icon input stream.");
            throw th;
        }
    }

    /* renamed from: l */
    public static int m58626l(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: m */
    public static String m58627m(Context context) {
        int a = m58585a(context, "io.fabric.android.build_id", ManagerWebServices.PARAM_TEASER_STRING);
        if (a == 0) {
            a = m58585a(context, "com.crashlytics.android.build_id", ManagerWebServices.PARAM_TEASER_STRING);
        }
        if (a == 0) {
            return null;
        }
        context = context.getResources().getString(a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Build ID is: ");
        stringBuilder.append(context);
        C15608c.m58560h().mo12791d("Fabric", stringBuilder.toString());
        return context;
    }

    /* renamed from: a */
    public static void m58602a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.CommonUtils.a(java.io.Closeable):void");
    }

    /* renamed from: c */
    public static boolean m58616c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == null ? true : null;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: n */
    public static boolean m58628n(Context context) {
        boolean z = true;
        if (!m58616c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        context = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null || context.isConnectedOrConnecting() == null) {
            z = false;
        }
        return z;
    }
}
