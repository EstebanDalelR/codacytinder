package com.leanplum.p069a;

import android.content.Context;
import android.os.AsyncTask;
import com.leanplum.Leanplum;
import com.leanplum.Var;
import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: com.leanplum.a.s */
public final class C2594s {
    /* renamed from: a */
    static final Object f8115a = new Object();
    /* renamed from: b */
    public static Var<HashMap<String, Object>> f8116b = null;
    /* renamed from: c */
    private static C2596x f8117c = null;
    /* renamed from: d */
    private static boolean f8118d = false;
    /* renamed from: e */
    private static boolean f8119e = false;

    /* renamed from: com.leanplum.a.s$1 */
    final class C25931 extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        private /* synthetic */ List f8113a;
        /* renamed from: b */
        private /* synthetic */ List f8114b;

        C25931(List list, List list2) {
            this.f8113a = list;
            this.f8114b = list2;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m9715a();
        }

        /* renamed from: a */
        private Void m9715a() {
            try {
                C2594s.m9728b(this.f8113a, this.f8114b);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
            return null;
        }
    }

    /* renamed from: c */
    private static String m9731c() {
        return "";
    }

    /* renamed from: a */
    public static int m9717a(boolean r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Runnable r8) {
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
        if (r5 == 0) goto L_0x00b6;
    L_0x0002:
        r6 = r5.equals(r6);
        if (r6 != 0) goto L_0x00b6;
    L_0x0008:
        if (r4 == 0) goto L_0x0010;
    L_0x000a:
        r4 = com.leanplum.p069a.bq.m9657c(r5);
        if (r4 != 0) goto L_0x00b6;
    L_0x0010:
        r4 = 0;
        r6 = 1;
        r0 = 0;
        r1 = 2;
        r2 = com.leanplum.Leanplum.getContext();	 Catch:{ IOException -> 0x006f, all -> 0x0057 }
        r2 = r2.getResources();	 Catch:{ IOException -> 0x006f, all -> 0x0057 }
        r2 = r2.getAssets();	 Catch:{ IOException -> 0x006f, all -> 0x0057 }
        r2 = r2.open(r5);	 Catch:{ IOException -> 0x006f, all -> 0x0057 }
        if (r2 == 0) goto L_0x0043;
    L_0x0026:
        r3 = com.leanplum.p069a.C2595v.f8121b;	 Catch:{ IOException -> 0x0070, all -> 0x003f }
        if (r2 == 0) goto L_0x003e;
    L_0x002a:
        r2.close();	 Catch:{ IOException -> 0x002e }
        goto L_0x003e;
    L_0x002e:
        r4 = move-exception;
        r5 = new java.lang.Object[r1];
        r7 = "Failed to close InputStream.";
        r5[r0] = r7;
        r4 = r4.getMessage();
        r5[r6] = r4;
        com.leanplum.p069a.ao.m9517b(r5);
    L_0x003e:
        return r1;
    L_0x003f:
        r4 = move-exception;
        r5 = r4;
        r4 = r2;
        goto L_0x0058;
    L_0x0043:
        if (r2 == 0) goto L_0x0086;
    L_0x0045:
        r2.close();	 Catch:{ IOException -> 0x0049 }
        goto L_0x0086;
    L_0x0049:
        r2 = move-exception;
        r1 = new java.lang.Object[r1];
        r3 = "Failed to close InputStream.";
        r1[r0] = r3;
        r0 = r2.getMessage();
        r1[r6] = r0;
        goto L_0x0083;
    L_0x0057:
        r5 = move-exception;
    L_0x0058:
        if (r4 == 0) goto L_0x006e;
    L_0x005a:
        r4.close();	 Catch:{ IOException -> 0x005e }
        goto L_0x006e;
    L_0x005e:
        r4 = move-exception;
        r7 = new java.lang.Object[r1];
        r8 = "Failed to close InputStream.";
        r7[r0] = r8;
        r4 = r4.getMessage();
        r7[r6] = r4;
        com.leanplum.p069a.ao.m9517b(r7);
    L_0x006e:
        throw r5;
    L_0x006f:
        r2 = r4;
    L_0x0070:
        if (r2 == 0) goto L_0x0086;
    L_0x0072:
        r2.close();	 Catch:{ IOException -> 0x0076 }
        goto L_0x0086;
    L_0x0076:
        r2 = move-exception;
        r1 = new java.lang.Object[r1];
        r3 = "Failed to close InputStream.";
        r1[r0] = r3;
        r0 = r2.getMessage();
        r1[r6] = r0;
    L_0x0083:
        com.leanplum.p069a.ao.m9517b(r1);
    L_0x0086:
        r6 = com.leanplum.p069a.C2594s.m9732c(r5);
        r6 = com.leanplum.p069a.C2594s.m9730b(r6);
        if (r6 != 0) goto L_0x00b6;
    L_0x0090:
        r6 = com.leanplum.p069a.C2594s.m9734d(r5);
        r6 = com.leanplum.p069a.C2594s.m9730b(r6);
        if (r6 != 0) goto L_0x00b6;
    L_0x009a:
        r6 = "downloadFile";
        r4 = com.leanplum.p069a.aw.m9529a(r6, r4);
        r6 = new com.leanplum.a.g;
        r6.<init>(r8);
        r4.m9575a(r6);
        r6 = new com.leanplum.a.i;
        r6.<init>(r8);
        r4.m9574a(r6);
        r4.m9578b(r5, r7);
        r4 = com.leanplum.p069a.C2595v.f8122c;
        return r4;
    L_0x00b6:
        r4 = com.leanplum.p069a.C2595v.f8120a;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.s.a(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Runnable):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    static com.leanplum.p069a.C2591j m9718a(java.io.InputStream r9) {
        /*
        r0 = 0;
        r1 = "MD5";
        r1 = java.security.MessageDigest.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r2 = 2;
        r3 = 1;
        r4 = 0;
        r5 = new java.security.DigestInputStream;	 Catch:{ all -> 0x0062 }
        r5.<init>(r9, r1);	 Catch:{ all -> 0x0062 }
        r9 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r9 = new byte[r9];	 Catch:{ all -> 0x0060 }
        r6 = 0;
    L_0x0014:
        r7 = r5.read(r9);	 Catch:{ all -> 0x0060 }
        r8 = -1;
        if (r7 == r8) goto L_0x001d;
    L_0x001b:
        r6 = r6 + r7;
        goto L_0x0014;
    L_0x001d:
        r5.close();	 Catch:{ IOException -> 0x0021, NoSuchAlgorithmException -> 0x0081 }
        goto L_0x0031;
    L_0x0021:
        r9 = move-exception;
        r2 = new java.lang.Object[r2];	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r5 = "Failed to close InputStream.";
        r2[r4] = r5;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r9 = r9.getMessage();	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r2[r3] = r9;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        com.leanplum.p069a.ao.m9517b(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
    L_0x0031:
        r9 = r1.digest();	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r1 = new java.lang.StringBuilder;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r1.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r2 = r9.length;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
    L_0x003b:
        if (r4 >= r2) goto L_0x0056;
    L_0x003d:
        r5 = r9[r4];	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r5 = r5 & 255;
        r5 = java.lang.Integer.toHexString(r5);	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r7 = r5.length();	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        if (r7 != r3) goto L_0x0050;
    L_0x004b:
        r7 = 48;
        r1.append(r7);	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
    L_0x0050:
        r1.append(r5);	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r4 = r4 + 1;
        goto L_0x003b;
    L_0x0056:
        r9 = new com.leanplum.a.j;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r1 = r1.toString();	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r9.<init>(r1, r6);	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        return r9;
    L_0x0060:
        r9 = move-exception;
        goto L_0x0065;
    L_0x0062:
        r1 = move-exception;
        r5 = r9;
        r9 = r1;
    L_0x0065:
        if (r5 == 0) goto L_0x007b;
    L_0x0067:
        r5.close();	 Catch:{ IOException -> 0x006b, NoSuchAlgorithmException -> 0x0081 }
        goto L_0x007b;
    L_0x006b:
        r1 = move-exception;
        r2 = new java.lang.Object[r2];	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r5 = "Failed to close InputStream.";
        r2[r4] = r5;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r1 = r1.getMessage();	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        r2[r3] = r1;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
        com.leanplum.p069a.ao.m9517b(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
    L_0x007b:
        throw r9;	 Catch:{ NoSuchAlgorithmException -> 0x0081, IOException -> 0x007c }
    L_0x007c:
        r9 = move-exception;
        r9.printStackTrace();
        return r0;
    L_0x0081:
        r9 = move-exception;
        r9.printStackTrace();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.s.a(java.io.InputStream):com.leanplum.a.j");
    }

    /* renamed from: a */
    static int m9716a(String str) {
        return str == null ? -1 : (int) new File(str).length();
    }

    /* renamed from: b */
    public static boolean m9730b(String str) {
        return (str == null || new File(str).exists() == null) ? null : true;
    }

    /* renamed from: d */
    private static String m9733d() {
        Context context = Leanplum.getContext();
        return context != null ? context.getDir("Leanplum_Documents", 0).getAbsolutePath() : null;
    }

    /* renamed from: e */
    private static String m9735e() {
        return Leanplum.getContext().getDir("Leanplum_Bundle", 0).getAbsolutePath();
    }

    /* renamed from: a */
    private static String m9720a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("/");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: c */
    static String m9732c(String str) {
        return str == null ? null : C2594s.m9720a("", str);
    }

    /* renamed from: a */
    static boolean m9727a(Map<String, Object> map, Map<String, Object> map2) {
        if (map2 == null) {
            return true;
        }
        String str = (String) map.get("hash");
        String str2 = (String) map2.get("hash");
        Integer num = (Integer) map.get(ManagerWebServices.PARAM_SIZE);
        Integer num2 = (Integer) map2.get(ManagerWebServices.PARAM_SIZE);
        if (num2 != null && (num == null || num.equals(num2) != null)) {
            if (str != null) {
                if (str2 != null) {
                    if (str.equals(str2) == null) {
                    }
                }
            }
            return null;
        }
        return true;
    }

    /* renamed from: a */
    static void m9723a(C2596x c2596x) {
        f8117c = c2596x;
    }

    /* renamed from: a */
    static boolean m9726a() {
        return f8119e;
    }

    /* renamed from: b */
    public static boolean m9729b() {
        if (!f8119e) {
            if (!f8118d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static void m9728b(List<Pattern> list, List<Pattern> list2) {
        f8116b = Var.define("__Android Resources", new HashMap());
        String str = "res/drawable";
        String str2 = "res/layout";
        ZipInputStream zipInputStream = null;
        ZipInputStream zipInputStream2;
        try {
            zipInputStream2 = new ZipInputStream(new FileInputStream(Leanplum.getContext().getPackageResourcePath()));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (name.startsWith(str) || name.startsWith(str2)) {
                            Object obj;
                            Object substring = name.substring(4);
                            if (list != null && list.size() > 0) {
                                for (Pattern matcher : list) {
                                    if (matcher.matcher(substring).matches()) {
                                        obj = 1;
                                        break;
                                    }
                                }
                                obj = null;
                                if (obj == null) {
                                }
                            }
                            if (list2 != null) {
                                for (Pattern matcher2 : list2) {
                                    if (matcher2.matcher(substring).matches()) {
                                        obj = 1;
                                        break;
                                    }
                                }
                                obj = null;
                                if (obj != null) {
                                }
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[8192];
                            int i = 0;
                            while (true) {
                                int read = zipInputStream2.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                                i += read;
                            }
                            zipInputStream2.closeEntry();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(nextEntry.getTime());
                            stringBuilder.append(i);
                            String stringBuilder2 = stringBuilder.toString();
                            stringBuilder = new StringBuilder("__Android Resources.");
                            stringBuilder.append(substring.replace(".", "\\.").replace('/', '.'));
                            Var.defineResource(stringBuilder.toString(), name, i, stringBuilder2, byteArrayOutputStream.toByteArray());
                        }
                    } else {
                        try {
                            break;
                        } catch (List<Pattern> list3) {
                            list2 = new Object[]{"Failed to close ZipInputStream.", list3.getMessage()};
                            ao.m9517b(list2);
                            f8118d = true;
                            synchronized (f8115a) {
                                f8119e = false;
                                if (f8117c != null) {
                                    f8117c.mo2615a();
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    list3 = e;
                    zipInputStream = zipInputStream2;
                } catch (Throwable th) {
                    list3 = th;
                }
            }
            zipInputStream2.close();
        } catch (IOException e2) {
            list3 = e2;
            try {
                list2 = new Object[1];
                StringBuilder stringBuilder3 = new StringBuilder("Error occurred when trying to enable resource syncing.");
                stringBuilder3.append(list3.getMessage());
                list2[0] = stringBuilder3.toString();
                ao.m9517b(list2);
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                    } catch (List<Pattern> list32) {
                        list2 = new Object[]{"Failed to close ZipInputStream.", list32.getMessage()};
                        ao.m9517b(list2);
                        f8118d = true;
                        synchronized (f8115a) {
                            f8119e = false;
                            if (f8117c != null) {
                                f8117c.mo2615a();
                            }
                        }
                    }
                }
                f8118d = true;
                synchronized (f8115a) {
                    f8119e = false;
                    if (f8117c != null) {
                        f8117c.mo2615a();
                    }
                }
            } catch (Throwable th2) {
                list32 = th2;
                zipInputStream2 = zipInputStream;
                if (zipInputStream2 != null) {
                    try {
                        zipInputStream2.close();
                    } catch (List<Pattern> list22) {
                        ao.m9517b("Failed to close ZipInputStream.", list22.getMessage());
                    }
                }
                throw list32;
            }
        }
        f8118d = true;
        synchronized (f8115a) {
            f8119e = false;
            if (f8117c != null) {
                f8117c.mo2615a();
            }
        }
    }

    /* renamed from: a */
    private static java.util.List<java.util.regex.Pattern> m9722a(java.util.List<java.lang.String> r6) {
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
        if (r6 != 0) goto L_0x0009;
    L_0x0003:
        r6 = new java.util.ArrayList;
        r6.<init>(r0);
        return r6;
    L_0x0009:
        r1 = new java.util.ArrayList;
        r2 = r6.size();
        r1.<init>(r2);
        r6 = r6.iterator();
    L_0x0016:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0046;
    L_0x001c:
        r2 = r6.next();
        r2 = (java.lang.String) r2;
        r3 = java.util.regex.Pattern.compile(r2);	 Catch:{ PatternSyntaxException -> 0x002a }
        r1.add(r3);	 Catch:{ PatternSyntaxException -> 0x002a }
        goto L_0x0016;
    L_0x002a:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = new java.lang.StringBuilder;
        r5 = "Ignoring malformed resource syncing pattern: \"";
        r4.<init>(r5);
        r4.append(r2);
        r2 = "\". Patterns must be regular expressions.";
        r4.append(r2);
        r2 = r4.toString();
        r3[r0] = r2;
        com.leanplum.p069a.ao.m9516a(r3);
        goto L_0x0016;
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.s.a(java.util.List):java.util.List<java.util.regex.Pattern>");
    }

    /* renamed from: a */
    public static void m9725a(List<String> list, List<String> list2, boolean z) {
        f8119e = true;
        if (!f8118d) {
            try {
                list = C2594s.m9722a((List) list);
                list2 = C2594s.m9722a((List) list2);
                if (z) {
                    bo.m9613a(false, new C25931(list, list2), new Void[0]);
                } else {
                    C2594s.m9728b(list, list2);
                }
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: e */
    public static String m9736e(String str) {
        return C2594s.m9721a(str, str, null);
    }

    /* renamed from: a */
    public static java.lang.String m9721a(java.lang.String r3, java.lang.String r4, java.lang.Boolean r5) {
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
        if (r3 != 0) goto L_0x0004;
    L_0x0002:
        r3 = 0;
        return r3;
    L_0x0004:
        r0 = r3.equals(r4);
        if (r0 == 0) goto L_0x0015;
    L_0x000a:
        r0 = com.leanplum.p069a.C2594s.m9732c(r4);
        r1 = com.leanplum.p069a.C2594s.m9730b(r0);
        if (r1 == 0) goto L_0x0015;
    L_0x0014:
        return r0;
    L_0x0015:
        if (r5 != 0) goto L_0x0044;
    L_0x0017:
        r5 = com.leanplum.Leanplum.getContext();	 Catch:{ Exception -> 0x004b, all -> 0x0042 }
        r5 = r5.getAssets();	 Catch:{ Exception -> 0x004b, all -> 0x0042 }
        r5 = r5.open(r3);	 Catch:{ Exception -> 0x004b, all -> 0x0042 }
        if (r5 == 0) goto L_0x0041;
    L_0x0025:
        r5.close();	 Catch:{ Exception -> 0x0029 }
        goto L_0x0041;
    L_0x0029:
        r4 = move-exception;
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r0 = 0;
        r1 = new java.lang.StringBuilder;
        r2 = "Failed to close InputStream: ";
        r1.<init>(r2);
        r1.append(r4);
        r4 = r1.toString();
        r5[r0] = r4;
        com.leanplum.p069a.ao.m9517b(r5);
    L_0x0041:
        return r3;
    L_0x0042:
        r3 = move-exception;
        throw r3;
    L_0x0044:
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x004b;
    L_0x004a:
        return r3;
    L_0x004b:
        r5 = com.leanplum.p069a.C2594s.m9737f(r3);
        r0 = com.leanplum.p069a.C2594s.m9730b(r5);
        if (r0 != 0) goto L_0x007e;
    L_0x0055:
        r5 = com.leanplum.p069a.C2594s.m9734d(r3);
        r0 = com.leanplum.p069a.C2594s.m9730b(r5);
        if (r0 != 0) goto L_0x007e;
    L_0x005f:
        r5 = com.leanplum.p069a.C2594s.m9732c(r3);
        r3 = com.leanplum.p069a.C2594s.m9730b(r5);
        if (r3 != 0) goto L_0x007e;
    L_0x0069:
        r5 = com.leanplum.p069a.C2594s.m9737f(r4);
        r3 = com.leanplum.p069a.C2594s.m9730b(r5);
        if (r3 != 0) goto L_0x007e;
    L_0x0073:
        r5 = com.leanplum.p069a.C2594s.m9732c(r4);
        r3 = com.leanplum.p069a.C2594s.m9730b(r5);
        if (r3 != 0) goto L_0x007e;
    L_0x007d:
        return r4;
    L_0x007e:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.s.a(java.lang.String, java.lang.String, java.lang.Boolean):java.lang.String");
    }

    /* renamed from: a */
    public static java.io.InputStream m9719a(boolean r3, java.lang.Boolean r4, java.lang.Boolean r5, java.lang.String r6, java.lang.String r7, byte[] r8) {
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
        r0 = android.text.TextUtils.isEmpty(r6);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = com.leanplum.Leanplum.getContext();	 Catch:{ IOException -> 0x0098 }
        if (r3 == 0) goto L_0x001c;	 Catch:{ IOException -> 0x0098 }
    L_0x000e:
        r2 = r6.equals(r7);	 Catch:{ IOException -> 0x0098 }
        if (r2 == 0) goto L_0x001c;	 Catch:{ IOException -> 0x0098 }
    L_0x0014:
        if (r8 == 0) goto L_0x001c;	 Catch:{ IOException -> 0x0098 }
    L_0x0016:
        r3 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0098 }
        r3.<init>(r8);	 Catch:{ IOException -> 0x0098 }
        return r3;	 Catch:{ IOException -> 0x0098 }
    L_0x001c:
        if (r3 == 0) goto L_0x0066;	 Catch:{ IOException -> 0x0098 }
    L_0x001e:
        r3 = r6.equals(r7);	 Catch:{ IOException -> 0x0098 }
        if (r3 == 0) goto L_0x0066;	 Catch:{ IOException -> 0x0098 }
    L_0x0024:
        if (r8 != 0) goto L_0x0066;	 Catch:{ IOException -> 0x0098 }
    L_0x0026:
        r3 = com.leanplum.p069a.bo.m9624d(r6);	 Catch:{ IOException -> 0x0098 }
        if (r3 == 0) goto L_0x0065;	 Catch:{ IOException -> 0x0098 }
    L_0x002c:
        r4 = r0.getResources();	 Catch:{ IOException -> 0x0098 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0098 }
        r6 = "android.resource://";	 Catch:{ IOException -> 0x0098 }
        r5.<init>(r6);	 Catch:{ IOException -> 0x0098 }
        r6 = r4.getResourcePackageName(r3);	 Catch:{ IOException -> 0x0098 }
        r5.append(r6);	 Catch:{ IOException -> 0x0098 }
        r6 = 47;	 Catch:{ IOException -> 0x0098 }
        r5.append(r6);	 Catch:{ IOException -> 0x0098 }
        r7 = r4.getResourceTypeName(r3);	 Catch:{ IOException -> 0x0098 }
        r5.append(r7);	 Catch:{ IOException -> 0x0098 }
        r5.append(r6);	 Catch:{ IOException -> 0x0098 }
        r3 = r4.getResourceEntryName(r3);	 Catch:{ IOException -> 0x0098 }
        r5.append(r3);	 Catch:{ IOException -> 0x0098 }
        r3 = r5.toString();	 Catch:{ IOException -> 0x0098 }
        r3 = android.net.Uri.parse(r3);	 Catch:{ IOException -> 0x0098 }
        r4 = r0.getContentResolver();	 Catch:{ IOException -> 0x0098 }
        r3 = r4.openInputStream(r3);	 Catch:{ IOException -> 0x0098 }
        return r3;
    L_0x0065:
        return r1;
    L_0x0066:
        if (r5 != 0) goto L_0x0071;
    L_0x0068:
        r3 = r0.getAssets();	 Catch:{ IOException -> 0x0084 }
        r3 = r3.open(r6);	 Catch:{ IOException -> 0x0084 }
        return r3;
    L_0x0071:
        r3 = r5.booleanValue();	 Catch:{ IOException -> 0x0098 }
        if (r3 != 0) goto L_0x008f;	 Catch:{ IOException -> 0x0098 }
    L_0x0077:
        r3 = r4.booleanValue();	 Catch:{ IOException -> 0x0098 }
        if (r3 == 0) goto L_0x0084;	 Catch:{ IOException -> 0x0098 }
    L_0x007d:
        r3 = r6.equals(r7);	 Catch:{ IOException -> 0x0098 }
        if (r3 == 0) goto L_0x0084;	 Catch:{ IOException -> 0x0098 }
    L_0x0083:
        goto L_0x008f;	 Catch:{ IOException -> 0x0098 }
    L_0x0084:
        r3 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0098 }
        r4 = new java.io.File;	 Catch:{ IOException -> 0x0098 }
        r4.<init>(r6);	 Catch:{ IOException -> 0x0098 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0098 }
        return r3;	 Catch:{ IOException -> 0x0098 }
    L_0x008f:
        r3 = r0.getAssets();	 Catch:{ IOException -> 0x0098 }
        r3 = r3.open(r6);	 Catch:{ IOException -> 0x0098 }
        return r3;
    L_0x0098:
        r3 = move-exception;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r6 = new java.lang.StringBuilder;
        r7 = "Failed to load a stream.";
        r6.<init>(r7);
        r3 = r3.getMessage();
        r6.append(r3);
        r3 = r6.toString();
        r4[r5] = r3;
        com.leanplum.p069a.ao.m9517b(r4);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.s.a(boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, byte[]):java.io.InputStream");
    }

    /* renamed from: f */
    private static String m9737f(String str) {
        if (str == null) {
            return null;
        }
        return C2594s.m9720a(Leanplum.getContext().getDir("Leanplum_Bundle", 0).getAbsolutePath(), str);
    }

    /* renamed from: d */
    public static String m9734d(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        Context context = Leanplum.getContext();
        if (context != null) {
            str2 = context.getDir("Leanplum_Documents", 0).getAbsolutePath();
        }
        return C2594s.m9720a(str2, str);
    }
}
