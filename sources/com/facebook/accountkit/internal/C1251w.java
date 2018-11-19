package com.facebook.accountkit.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.Pair;
import android.util.Patterns;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.PhoneNumber;
import com.google.android.gms.common.C3813b;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.accountkit.internal.w */
public final class C1251w {
    /* renamed from: a */
    private static final String f3352a = "com.facebook.accountkit.internal.w";
    /* renamed from: b */
    private static final ScheduledThreadPoolExecutor f3353b = new ScheduledThreadPoolExecutor(1);
    /* renamed from: c */
    private static long f3354c = -1;
    /* renamed from: d */
    private static String f3355d = "NoCarrier";
    /* renamed from: e */
    private static String f3356e = "";
    /* renamed from: f */
    private static int f3357f = 0;
    /* renamed from: g */
    private static long f3358g = -1;
    /* renamed from: h */
    private static long f3359h = -1;

    /* renamed from: com.facebook.accountkit.internal.w$1 */
    static class C12501 implements FilenameFilter {
        C12501() {
        }

        public boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    /* renamed from: a */
    public static boolean m4500a(String str) {
        if (str != null) {
            if (str.length() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    static ScheduledThreadPoolExecutor m4489a() {
        return f3353b;
    }

    /* renamed from: b */
    public static Executor m4502b() {
        return AccountKit.m4123l();
    }

    /* renamed from: a */
    static boolean m4496a(android.content.Context r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r1.getPackageInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r2.applicationInfo;	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r2.flags;	 Catch:{ NameNotFoundException -> 0x0017 }
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x0016;
    L_0x0015:
        r0 = 1;
    L_0x0016:
        return r0;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.a(android.content.Context):boolean");
    }

    /* renamed from: a */
    static Object m4485a(JSONObject jSONObject, String str) throws JSONException {
        jSONObject = jSONObject.opt(str);
        return (jSONObject == null || (jSONObject instanceof String) == null) ? jSONObject : new JSONTokener((String) jSONObject).nextValue();
    }

    /* renamed from: b */
    public static boolean m4504b(@NonNull Context context) {
        return C1251w.m4497a(context, "android.permission.RECEIVE_SMS");
    }

    /* renamed from: c */
    static boolean m4508c(@NonNull Context context) {
        return C1251w.m4497a(context, "android.permission.READ_PHONE_STATE");
    }

    /* renamed from: d */
    static boolean m4511d(@NonNull Context context) {
        return C1251w.m4497a(context, "android.permission.GET_ACCOUNTS");
    }

    /* renamed from: a */
    private static boolean m4497a(android.content.Context r1, java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = android.support.v4.content.PermissionChecker.m1639b(r1, r2);	 Catch:{ Exception -> 0x0009 }
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        r0 = 1;
    L_0x0008:
        return r0;
    L_0x0009:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: e */
    public static List<String> m4514e(Context context) {
        if (!C1251w.m4511d(context)) {
            return null;
        }
        List<String> arrayList = new ArrayList();
        for (Account account : AccountManager.get(context).getAccounts()) {
            if (!(C1251w.m4500a(account.name) || !Patterns.EMAIL_ADDRESS.matcher(account.name).matches() || arrayList.contains(account.name))) {
                arrayList.add(account.name);
            }
        }
        return arrayList;
    }

    @Nullable
    @SuppressLint({"HardwareIds"})
    /* renamed from: f */
    public static String m4516f(Context context) {
        if (C1251w.m4508c(context)) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getLine1Number();
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m4518g(Context context) {
        return C3813b.m14425a().mo2566a(context) == null ? true : null;
    }

    @android.support.annotation.Nullable
    /* renamed from: b */
    public static com.google.i18n.phonenumbers.Phonenumber.PhoneNumber m4501b(@android.support.annotation.Nullable java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.facebook.accountkit.internal.C1251w.m4500a(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "+";
        r0 = r3.startsWith(r0);
        if (r0 != 0) goto L_0x0021;
    L_0x0010:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "+";
        r0.append(r2);
        r0.append(r3);
        r3 = r0.toString();
    L_0x0021:
        r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.b();	 Catch:{ NumberParseException -> 0x002c }
        r2 = "";	 Catch:{ NumberParseException -> 0x002c }
        r3 = r0.a(r3, r2);	 Catch:{ NumberParseException -> 0x002c }
        return r3;
    L_0x002c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.b(java.lang.String):com.google.i18n.phonenumbers.Phonenumber$PhoneNumber");
    }

    @Nullable
    /* renamed from: a */
    public static PhoneNumber m4484a(@Nullable Phonenumber.PhoneNumber phoneNumber) {
        if (phoneNumber != null) {
            if (PhoneNumberUtil.b().b(phoneNumber)) {
                return new PhoneNumber(String.valueOf(phoneNumber.a()), String.valueOf(phoneNumber.b()), PhoneNumberUtil.b().c(phoneNumber));
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static PhoneNumber m4506c(@Nullable String str) {
        return C1251w.m4484a(C1251w.m4501b(str));
    }

    @android.support.annotation.Nullable
    /* renamed from: d */
    public static java.lang.String m4509d(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.facebook.accountkit.internal.C1251w.m4500a(r6);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "+";
        r0 = r6.startsWith(r0);
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0 = 1;
        r6 = r6.substring(r0);
    L_0x0015:
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r6.length();	 Catch:{ NumberFormatException -> 0x0053 }
        r0.<init>(r2);	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = 0;
        r3 = r1;
    L_0x0020:
        r4 = r6.length();	 Catch:{ NumberFormatException -> 0x0054 }
        if (r2 >= r4) goto L_0x0054;	 Catch:{ NumberFormatException -> 0x0054 }
    L_0x0026:
        if (r3 != 0) goto L_0x0054;	 Catch:{ NumberFormatException -> 0x0054 }
    L_0x0028:
        r4 = r6.charAt(r2);	 Catch:{ NumberFormatException -> 0x0054 }
        r0.append(r4);	 Catch:{ NumberFormatException -> 0x0054 }
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.b();	 Catch:{ NumberFormatException -> 0x0054 }
        r5 = r0.toString();	 Catch:{ NumberFormatException -> 0x0054 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ NumberFormatException -> 0x0054 }
        r5 = r5.intValue();	 Catch:{ NumberFormatException -> 0x0054 }
        r4 = r4.b(r5);	 Catch:{ NumberFormatException -> 0x0054 }
        r3 = "ZZ";	 Catch:{ NumberFormatException -> 0x0051 }
        r3 = r4.equals(r3);	 Catch:{ NumberFormatException -> 0x0051 }
        if (r3 == 0) goto L_0x004d;
    L_0x004b:
        r3 = r1;
        goto L_0x004e;
    L_0x004d:
        r3 = r4;
    L_0x004e:
        r2 = r2 + 1;
        goto L_0x0020;
    L_0x0051:
        r3 = r4;
        goto L_0x0054;
    L_0x0053:
        r3 = r1;
    L_0x0054:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.d(java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static String m4513e(String str) {
        if (C1251w.m4500a(str)) {
            return "";
        }
        return str.replaceAll("[^\\d]", "");
    }

    /* renamed from: a */
    static void m4490a(Bundle bundle, String str, String str2) {
        if (bundle != null && str != null && str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    static String m4486a(InputStream inputStream) throws IOException {
        Throwable th;
        Closeable bufferedInputStream;
        Closeable inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    char[] cArr = new char[ItemAnimator.FLAG_MOVED];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            stringBuilder.append(cArr, 0, read);
                        } else {
                            String stringBuilder2 = stringBuilder.toString();
                            C1251w.m4491a(bufferedInputStream);
                            C1251w.m4491a(inputStreamReader);
                            return stringBuilder2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C1251w.m4491a(bufferedInputStream);
                    C1251w.m4491a(inputStreamReader);
                    throw th;
                }
            } catch (InputStream inputStream2) {
                th = inputStream2;
                inputStreamReader = null;
                C1251w.m4491a(bufferedInputStream);
                C1251w.m4491a(inputStreamReader);
                throw th;
            }
        } catch (InputStream inputStream22) {
            bufferedInputStream = null;
            th = inputStream22;
            inputStreamReader = bufferedInputStream;
            C1251w.m4491a(bufferedInputStream);
            C1251w.m4491a(inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    static void m4491a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.a(java.io.Closeable):void");
    }

    /* renamed from: h */
    public static java.lang.String m4519h(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "phone";	 Catch:{ Exception -> 0x0035 }
        r3 = r3.getSystemService(r0);	 Catch:{ Exception -> 0x0035 }
        r3 = (android.telephony.TelephonyManager) r3;	 Catch:{ Exception -> 0x0035 }
        r0 = r3.getSimCountryIso();	 Catch:{ Exception -> 0x0035 }
        r1 = 2;	 Catch:{ Exception -> 0x0035 }
        if (r0 == 0) goto L_0x001c;	 Catch:{ Exception -> 0x0035 }
    L_0x000f:
        r2 = r0.length();	 Catch:{ Exception -> 0x0035 }
        if (r2 != r1) goto L_0x001c;	 Catch:{ Exception -> 0x0035 }
    L_0x0015:
        r3 = java.util.Locale.US;	 Catch:{ Exception -> 0x0035 }
        r3 = r0.toLowerCase(r3);	 Catch:{ Exception -> 0x0035 }
        return r3;	 Catch:{ Exception -> 0x0035 }
    L_0x001c:
        r0 = r3.getPhoneType();	 Catch:{ Exception -> 0x0035 }
        if (r0 == r1) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x0022:
        r3 = r3.getNetworkCountryIso();	 Catch:{ Exception -> 0x0035 }
        if (r3 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x0028:
        r0 = r3.length();	 Catch:{ Exception -> 0x0035 }
        if (r0 != r1) goto L_0x0035;	 Catch:{ Exception -> 0x0035 }
    L_0x002e:
        r0 = java.util.Locale.US;	 Catch:{ Exception -> 0x0035 }
        r3 = r3.toLowerCase(r0);	 Catch:{ Exception -> 0x0035 }
        return r3;
    L_0x0035:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.h(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    static void m4494a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    static int m4480a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i += read;
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                outputStream = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw outputStream;
            }
        } catch (Throwable th2) {
            outputStream = th2;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw outputStream;
        }
    }

    /* renamed from: a */
    static boolean m4499a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj.equals(obj2) != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <T> boolean m4505b(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null ? true : null;
    }

    /* renamed from: a */
    public static int m4481a(Object obj) {
        return obj == null ? null : obj.hashCode();
    }

    /* renamed from: a */
    static java.lang.String m4488a(byte[] r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "SHA-1";	 Catch:{ NoSuchAlgorithmException -> 0x000b }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x000b }
        r1 = com.facebook.accountkit.internal.C1251w.m4487a(r0, r1);
        return r1;
    L_0x000b:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.a(byte[]):java.lang.String");
    }

    /* renamed from: a */
    private static String m4487a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        messageDigest = messageDigest.digest();
        bArr = new StringBuilder();
        for (byte b : messageDigest) {
            bArr.append(Integer.toHexString((b >> 4) & 15));
            bArr.append(Integer.toHexString(b & 15));
        }
        return bArr.toString();
    }

    /* renamed from: c */
    static String m4507c() {
        return AccountKit.m4119h();
    }

    /* renamed from: a */
    static void m4492a(String str, Exception exception) {
        if (str != null && exception != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append(exception.getMessage());
            Log.d(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    static void m4493a(String str, String str2, Throwable th) {
        if (!C1251w.m4500a(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: d */
    static void m4510d() {
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            Log.w(f3352a, "This method should be called from the UI thread");
        }
    }

    /* renamed from: a */
    static Pair<AccountKitError, InternalAccountKitError> m4483a(C1228g c1228g) {
        int a = c1228g.m4335a();
        if (c1228g.m4340f() == InternalAccountKitError.INVALID_PHONE_NUMBER_SERVER_CODE) {
            a = InternalAccountKitError.INVALID_PHONE_NUMBER;
        }
        InternalAccountKitError internalAccountKitError = new InternalAccountKitError(a, c1228g.m4336b(), c1228g.m4341g());
        c1228g = c1228g.m4335a();
        if (c1228g != 15003) {
            switch (c1228g) {
                case 100:
                    c1228g = new AccountKitError(Type.ARGUMENT_ERROR, internalAccountKitError);
                    break;
                case 101:
                    c1228g = new AccountKitError(Type.NETWORK_CONNECTION_ERROR, internalAccountKitError);
                    break;
                default:
                    switch (c1228g) {
                        case InternalAccountKitError.LOGIN_REQUEST_EXPIRED /*1948001*/:
                            c1228g = new AccountKitError(Type.LOGIN_INVALIDATED, internalAccountKitError);
                            break;
                        case InternalAccountKitError.INVALID_CREDENTIALS_OR_LOGIN_REQUEST /*1948002*/:
                            c1228g = new AccountKitError(Type.ARGUMENT_ERROR, internalAccountKitError);
                            break;
                        case InternalAccountKitError.TOO_MANY_ATTEMPTS /*1948003*/:
                            c1228g = new AccountKitError(Type.SERVER_ERROR, internalAccountKitError);
                            break;
                        default:
                            c1228g = new AccountKitError(Type.SERVER_ERROR, internalAccountKitError);
                            break;
                    }
            }
        }
        c1228g = new AccountKitError(Type.ARGUMENT_ERROR, internalAccountKitError);
        return new Pair(c1228g, internalAccountKitError);
    }

    /* renamed from: a */
    static boolean m4498a(InternalAccountKitError internalAccountKitError) {
        return (internalAccountKitError == null || internalAccountKitError.getCode() != 15003) ? null : true;
    }

    /* renamed from: b */
    static void m4503b(JSONObject jSONObject, String str) throws JSONException {
        jSONObject.put("anon_id", str);
    }

    /* renamed from: a */
    static void m4495a(org.json.JSONObject r7, android.content.Context r8) throws org.json.JSONException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = new org.json.JSONArray;
        r0.<init>();
        r1 = "a2";
        r0.put(r1);
        com.facebook.accountkit.internal.C1251w.m4522i(r8);
        r1 = r8.getPackageName();
        r2 = "";
        r3 = 0;
        r4 = -1;
        r5 = r8.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0023 }
        r5 = r5.getPackageInfo(r1, r3);	 Catch:{ NameNotFoundException -> 0x0023 }
        r6 = r5.versionCode;	 Catch:{ NameNotFoundException -> 0x0023 }
        r4 = r5.versionName;	 Catch:{ NameNotFoundException -> 0x0024 }
        r2 = r4;
        goto L_0x0024;
    L_0x0023:
        r6 = -1;
    L_0x0024:
        r0.put(r1);
        r0.put(r6);
        r0.put(r2);
        r1 = android.os.Build.VERSION.RELEASE;
        r0.put(r1);
        r1 = android.os.Build.MODEL;
        r0.put(r1);
        r1 = r8.getResources();	 Catch:{ Exception -> 0x0042 }
        r1 = r1.getConfiguration();	 Catch:{ Exception -> 0x0042 }
        r1 = r1.locale;	 Catch:{ Exception -> 0x0042 }
        goto L_0x0046;
    L_0x0042:
        r1 = java.util.Locale.getDefault();
    L_0x0046:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = r1.getLanguage();
        r2.append(r4);
        r4 = "_";
        r2.append(r4);
        r1 = r1.getCountry();
        r2.append(r1);
        r1 = r2.toString();
        r0.put(r1);
        r1 = f3356e;
        r0.put(r1);
        r1 = f3355d;
        r0.put(r1);
        r1 = 0;
        r4 = "window";	 Catch:{ Exception -> 0x008f }
        r8 = r8.getSystemService(r4);	 Catch:{ Exception -> 0x008f }
        r8 = (android.view.WindowManager) r8;	 Catch:{ Exception -> 0x008f }
        if (r8 == 0) goto L_0x008f;	 Catch:{ Exception -> 0x008f }
    L_0x007b:
        r8 = r8.getDefaultDisplay();	 Catch:{ Exception -> 0x008f }
        r4 = new android.util.DisplayMetrics;	 Catch:{ Exception -> 0x008f }
        r4.<init>();	 Catch:{ Exception -> 0x008f }
        r8.getMetrics(r4);	 Catch:{ Exception -> 0x008f }
        r8 = r4.widthPixels;	 Catch:{ Exception -> 0x008f }
        r5 = r4.heightPixels;	 Catch:{ Exception -> 0x0090 }
        r4 = r4.density;	 Catch:{ Exception -> 0x0091 }
        r1 = (double) r4;
        goto L_0x0091;
    L_0x008f:
        r8 = 0;
    L_0x0090:
        r5 = 0;
    L_0x0091:
        r0.put(r8);
        r0.put(r5);
        r8 = java.util.Locale.ENGLISH;
        r4 = "%.2f";
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r1 = java.lang.Double.valueOf(r1);
        r5[r3] = r1;
        r8 = java.lang.String.format(r8, r4, r5);
        r0.put(r8);
        r8 = com.facebook.accountkit.internal.C1251w.m4515f();
        r0.put(r8);
        r1 = f3359h;
        r0.put(r1);
        r1 = f3354c;
        r0.put(r1);
        r8 = "extinfo";
        r0 = r0.toString();
        r7.put(r8, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.a(org.json.JSONObject, android.content.Context):void");
    }

    /* renamed from: e */
    public static String m4512e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ak");
        stringBuilder.append(AccountKit.m4119h());
        stringBuilder.append("://authorize");
        return stringBuilder.toString();
    }

    /* renamed from: f */
    private static int m4515f() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = f3357f;
        if (r0 <= 0) goto L_0x0007;
    L_0x0004:
        r0 = f3357f;
        return r0;
    L_0x0007:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x001a }
        r1 = "/sys/devices/system/cpu/";	 Catch:{ Exception -> 0x001a }
        r0.<init>(r1);	 Catch:{ Exception -> 0x001a }
        r1 = new com.facebook.accountkit.internal.w$1;	 Catch:{ Exception -> 0x001a }
        r1.<init>();	 Catch:{ Exception -> 0x001a }
        r0 = r0.listFiles(r1);	 Catch:{ Exception -> 0x001a }
        r0 = r0.length;	 Catch:{ Exception -> 0x001a }
        f3357f = r0;	 Catch:{ Exception -> 0x001a }
    L_0x001a:
        r0 = f3357f;
        if (r0 > 0) goto L_0x002d;
    L_0x001e:
        r0 = java.lang.Runtime.getRuntime();
        r0 = r0.availableProcessors();
        r1 = 1;
        r0 = java.lang.Math.max(r0, r1);
        f3357f = r0;
    L_0x002d:
        r0 = f3357f;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.f():int");
    }

    /* renamed from: i */
    private static void m4522i(Context context) {
        if (f3358g == -1 || System.currentTimeMillis() - f3358g >= 1800000) {
            f3358g = System.currentTimeMillis();
            C1251w.m4517g();
            C1251w.m4523j(context);
            C1251w.m4521i();
            C1251w.m4520h();
        }
    }

    /* renamed from: g */
    private static void m4517g() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = java.util.TimeZone.getDefault();	 Catch:{ Exception -> 0x0014 }
        r1 = new java.util.Date;	 Catch:{ Exception -> 0x0014 }
        r1.<init>();	 Catch:{ Exception -> 0x0014 }
        r1 = r0.inDaylightTime(r1);	 Catch:{ Exception -> 0x0014 }
        r2 = 0;	 Catch:{ Exception -> 0x0014 }
        r0 = r0.getDisplayName(r1, r2);	 Catch:{ Exception -> 0x0014 }
        f3356e = r0;	 Catch:{ Exception -> 0x0014 }
    L_0x0014:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.g():void");
    }

    /* renamed from: j */
    private static void m4523j(android.content.Context r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = f3355d;
        r1 = "NoCarrier";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r0 = "phone";	 Catch:{ Exception -> 0x0018 }
        r2 = r2.getSystemService(r0);	 Catch:{ Exception -> 0x0018 }
        r2 = (android.telephony.TelephonyManager) r2;	 Catch:{ Exception -> 0x0018 }
        r2 = r2.getNetworkOperatorName();	 Catch:{ Exception -> 0x0018 }
        f3355d = r2;	 Catch:{ Exception -> 0x0018 }
    L_0x0018:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.j(android.content.Context):void");
    }

    /* renamed from: h */
    private static void m4520h() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.facebook.accountkit.internal.C1251w.m4524j();	 Catch:{ Exception -> 0x002a }
        if (r0 == 0) goto L_0x0021;	 Catch:{ Exception -> 0x002a }
    L_0x0006:
        r0 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ Exception -> 0x002a }
        r1 = new android.os.StatFs;	 Catch:{ Exception -> 0x002a }
        r0 = r0.getPath();	 Catch:{ Exception -> 0x002a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x002a }
        r0 = r1.getAvailableBlocks();	 Catch:{ Exception -> 0x002a }
        r2 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r0 = r1.getBlockSize();	 Catch:{ Exception -> 0x002a }
        r0 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r2 = r2 * r0;	 Catch:{ Exception -> 0x002a }
        f3354c = r2;	 Catch:{ Exception -> 0x002a }
    L_0x0021:
        r0 = f3354c;	 Catch:{ Exception -> 0x002a }
        r0 = (double) r0;	 Catch:{ Exception -> 0x002a }
        r0 = com.facebook.accountkit.internal.C1251w.m4482a(r0);	 Catch:{ Exception -> 0x002a }
        f3354c = r0;	 Catch:{ Exception -> 0x002a }
    L_0x002a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.h():void");
    }

    /* renamed from: i */
    private static void m4521i() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.facebook.accountkit.internal.C1251w.m4524j();	 Catch:{ Exception -> 0x002a }
        if (r0 == 0) goto L_0x0021;	 Catch:{ Exception -> 0x002a }
    L_0x0006:
        r0 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ Exception -> 0x002a }
        r1 = new android.os.StatFs;	 Catch:{ Exception -> 0x002a }
        r0 = r0.getPath();	 Catch:{ Exception -> 0x002a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x002a }
        r0 = r1.getBlockCount();	 Catch:{ Exception -> 0x002a }
        r2 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r0 = r1.getBlockSize();	 Catch:{ Exception -> 0x002a }
        r0 = (long) r0;	 Catch:{ Exception -> 0x002a }
        r2 = r2 * r0;	 Catch:{ Exception -> 0x002a }
        f3359h = r2;	 Catch:{ Exception -> 0x002a }
    L_0x0021:
        r0 = f3359h;	 Catch:{ Exception -> 0x002a }
        r0 = (double) r0;	 Catch:{ Exception -> 0x002a }
        r0 = com.facebook.accountkit.internal.C1251w.m4482a(r0);	 Catch:{ Exception -> 0x002a }
        f3359h = r0;	 Catch:{ Exception -> 0x002a }
    L_0x002a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.w.i():void");
    }

    /* renamed from: j */
    private static boolean m4524j() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    private static long m4482a(double d) {
        return Math.round(d / 1.073741824E9d);
    }
}
