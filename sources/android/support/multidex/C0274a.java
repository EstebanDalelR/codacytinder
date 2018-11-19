package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: android.support.multidex.a */
public final class C0274a {
    /* renamed from: a */
    private static final Set<File> f977a = new HashSet();
    /* renamed from: b */
    private static final boolean f978b = C0274a.m1012a(System.getProperty("java.vm.version"));

    /* renamed from: android.support.multidex.a$a */
    private static final class C0271a {
        /* renamed from: b */
        private static void m998b(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
            Object obj = C0274a.m1014b(classLoader, "pathList").get(classLoader);
            C0274a.m1016b(obj, "dexElements", C0271a.m997a(obj, new ArrayList(list), file));
        }

        /* renamed from: a */
        private static Object[] m997a(Object obj, ArrayList<File> arrayList, File file) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C0274a.m1015b(obj, "makeDexElements", ArrayList.class, File.class).invoke(obj, new Object[]{arrayList, file});
        }
    }

    /* renamed from: android.support.multidex.a$b */
    private static final class C0272b {
        /* renamed from: b */
        private static void m1001b(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
            Object obj = C0274a.m1014b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C0274a.m1016b(obj, "dexElements", C0272b.m1000a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > null) {
                list = arrayList.iterator();
                while (list.hasNext() != null) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) list.next());
                }
                list = C0274a.m1014b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr = (IOException[]) list.get(obj);
                if (iOExceptionArr == null) {
                    file = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    File file2 = new IOException[(arrayList.size() + iOExceptionArr.length)];
                    arrayList.toArray(file2);
                    System.arraycopy(iOExceptionArr, 0, file2, arrayList.size(), iOExceptionArr.length);
                    file = file2;
                }
                list.set(obj, file);
            }
        }

        /* renamed from: a */
        private static Object[] m1000a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C0274a.m1015b(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: android.support.multidex.a$c */
    private static final class C0273c {
        /* renamed from: b */
        private static void m1003b(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field a = C0274a.m1014b(classLoader, "path");
            StringBuilder stringBuilder = new StringBuilder((String) a.get(classLoader));
            Object[] objArr = new String[size];
            Object[] objArr2 = new File[size];
            Object[] objArr3 = new ZipFile[size];
            Object[] objArr4 = new DexFile[size];
            list = list.listIterator();
            while (list.hasNext()) {
                File file = (File) list.next();
                String absolutePath = file.getAbsolutePath();
                stringBuilder.append(':');
                stringBuilder.append(absolutePath);
                int previousIndex = list.previousIndex();
                objArr[previousIndex] = absolutePath;
                objArr2[previousIndex] = file;
                objArr3[previousIndex] = new ZipFile(file);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(absolutePath);
                stringBuilder2.append(".dex");
                objArr4[previousIndex] = DexFile.loadDex(absolutePath, stringBuilder2.toString(), 0);
            }
            a.set(classLoader, stringBuilder.toString());
            C0274a.m1016b((Object) classLoader, "mPaths", objArr);
            C0274a.m1016b((Object) classLoader, "mFiles", objArr2);
            C0274a.m1016b((Object) classLoader, "mZips", objArr3);
            C0274a.m1016b((Object) classLoader, "mDexs", objArr4);
        }
    }

    /* renamed from: a */
    public static void m1007a(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f978b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
        } else if (VERSION.SDK_INT < 4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MultiDex installation failed. SDK ");
            stringBuilder.append(VERSION.SDK_INT);
            stringBuilder.append(" is unsupported. Min SDK version is ");
            stringBuilder.append(4);
            stringBuilder.append(".");
            throw new RuntimeException(stringBuilder.toString());
        } else {
            try {
                ApplicationInfo b = C0274a.m1013b(context);
                if (b == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                C0274a.m1008a(context, new File(b.sourceDir), new File(b.dataDir), "secondary-dexes", "");
                Log.i("MultiDex", "install done");
            } catch (Context context2) {
                Log.e("MultiDex", "MultiDex installation failure", context2);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("MultiDex installation failed (");
                stringBuilder2.append(context2.getMessage());
                stringBuilder2.append(").");
                throw new RuntimeException(stringBuilder2.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m1008a(Context context, File file, File file2, String str, String str2) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        synchronized (f977a) {
            if (f977a.contains(file)) {
                return;
            }
            f977a.add(file);
            if (VERSION.SDK_INT > 20) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MultiDex is not guaranteed to work in SDK version ");
                stringBuilder.append(VERSION.SDK_INT);
                stringBuilder.append(": SDK version higher than ");
                stringBuilder.append(20);
                stringBuilder.append(" should be backed by ");
                stringBuilder.append("runtime with built-in multidex capabilty but it's not the ");
                stringBuilder.append("case here: java.vm.version=\"");
                stringBuilder.append(System.getProperty("java.vm.version"));
                stringBuilder.append("\"");
                Log.w("MultiDex", stringBuilder.toString());
            }
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader == null) {
                    Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                    return;
                }
                try {
                    C0274a.m1017c(context);
                } catch (Throwable th) {
                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                }
                file2 = C0274a.m1004a(context, file2, str);
                C0274a.m1010a(classLoader, file2, MultiDexExtractor.m988a(context, file, file2, str2, (boolean) null));
            } catch (Context context2) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", context2);
            }
        }
    }

    /* renamed from: b */
    private static ApplicationInfo m1013b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (Context context2) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", context2);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m1012a(java.lang.String r5) {
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
        if (r5 == 0) goto L_0x002c;
    L_0x0003:
        r1 = "(\\d+)\\.(\\d+)(\\.\\d+)?";
        r1 = java.util.regex.Pattern.compile(r1);
        r1 = r1.matcher(r5);
        r2 = r1.matches();
        if (r2 == 0) goto L_0x002c;
    L_0x0013:
        r2 = 1;
        r3 = r1.group(r2);	 Catch:{ NumberFormatException -> 0x002c }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x002c }
        r4 = 2;	 Catch:{ NumberFormatException -> 0x002c }
        r1 = r1.group(r4);	 Catch:{ NumberFormatException -> 0x002c }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x002c }
        if (r3 > r4) goto L_0x002b;
    L_0x0027:
        if (r3 != r4) goto L_0x002c;
    L_0x0029:
        if (r1 < r2) goto L_0x002c;
    L_0x002b:
        r0 = 1;
    L_0x002c:
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "VM with version ";
        r2.append(r3);
        r2.append(r5);
        if (r0 == 0) goto L_0x0040;
    L_0x003d:
        r5 = " has multidex support";
        goto L_0x0042;
    L_0x0040:
        r5 = " does not have multidex support";
    L_0x0042:
        r2.append(r5);
        r5 = r2.toString();
        android.util.Log.i(r1, r5);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.a.a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m1010a(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
        if (!list.isEmpty()) {
            if (VERSION.SDK_INT >= 19) {
                C0272b.m1001b(classLoader, list, file);
            } else if (VERSION.SDK_INT >= 14) {
                C0271a.m998b(classLoader, list, file);
            } else {
                C0273c.m1003b(classLoader, list);
            }
        }
    }

    /* renamed from: b */
    private static java.lang.reflect.Field m1014b(java.lang.Object r3, java.lang.String r4) throws java.lang.NoSuchFieldException {
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
        r0 = r3.getClass();
    L_0x0004:
        if (r0 == 0) goto L_0x001a;
    L_0x0006:
        r1 = r0.getDeclaredField(r4);	 Catch:{ NoSuchFieldException -> 0x0015 }
        r2 = r1.isAccessible();	 Catch:{ NoSuchFieldException -> 0x0015 }
        if (r2 != 0) goto L_0x0014;	 Catch:{ NoSuchFieldException -> 0x0015 }
    L_0x0010:
        r2 = 1;	 Catch:{ NoSuchFieldException -> 0x0015 }
        r1.setAccessible(r2);	 Catch:{ NoSuchFieldException -> 0x0015 }
    L_0x0014:
        return r1;
    L_0x0015:
        r0 = r0.getSuperclass();
        goto L_0x0004;
    L_0x001a:
        r0 = new java.lang.NoSuchFieldException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Field ";
        r1.append(r2);
        r1.append(r4);
        r4 = " not found in ";
        r1.append(r4);
        r3 = r3.getClass();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.a.b(java.lang.Object, java.lang.String):java.lang.reflect.Field");
    }

    /* renamed from: b */
    private static java.lang.reflect.Method m1015b(java.lang.Object r3, java.lang.String r4, java.lang.Class<?>... r5) throws java.lang.NoSuchMethodException {
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
        r0 = r3.getClass();
    L_0x0004:
        if (r0 == 0) goto L_0x001a;
    L_0x0006:
        r1 = r0.getDeclaredMethod(r4, r5);	 Catch:{ NoSuchMethodException -> 0x0015 }
        r2 = r1.isAccessible();	 Catch:{ NoSuchMethodException -> 0x0015 }
        if (r2 != 0) goto L_0x0014;	 Catch:{ NoSuchMethodException -> 0x0015 }
    L_0x0010:
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0015 }
        r1.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x0015 }
    L_0x0014:
        return r1;
    L_0x0015:
        r0 = r0.getSuperclass();
        goto L_0x0004;
    L_0x001a:
        r0 = new java.lang.NoSuchMethodException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Method ";
        r1.append(r2);
        r1.append(r4);
        r4 = " with parameters ";
        r1.append(r4);
        r4 = java.util.Arrays.asList(r5);
        r1.append(r4);
        r4 = " not found in ";
        r1.append(r4);
        r3 = r3.getClass();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.a.b(java.lang.Object, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: b */
    private static void m1016b(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        str = C0274a.m1014b(obj, str);
        Object[] objArr2 = (Object[]) str.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        str.set(obj, objArr3);
    }

    /* renamed from: c */
    private static void m1017c(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Clearing old secondary dex dir (");
            stringBuilder.append(file.getPath());
            stringBuilder.append(").");
            Log.i("MultiDex", stringBuilder.toString());
            context = file.listFiles();
            if (context == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to list secondary dex dir content (");
                stringBuilder.append(file.getPath());
                stringBuilder.append(").");
                Log.w("MultiDex", stringBuilder.toString());
                return;
            }
            for (File file2 : context) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Trying to delete old file ");
                stringBuilder2.append(file2.getPath());
                stringBuilder2.append(" of size ");
                stringBuilder2.append(file2.length());
                Log.i("MultiDex", stringBuilder2.toString());
                if (file2.delete()) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Deleted old file ");
                    stringBuilder2.append(file2.getPath());
                    Log.i("MultiDex", stringBuilder2.toString());
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Failed to delete old file ");
                    stringBuilder2.append(file2.getPath());
                    Log.w("MultiDex", stringBuilder2.toString());
                }
            }
            if (file.delete() == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to delete secondary dex dir ");
                stringBuilder.append(file.getPath());
                Log.w("MultiDex", stringBuilder.toString());
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Deleted old secondary dex dir ");
                stringBuilder.append(file.getPath());
                Log.i("MultiDex", stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private static java.io.File m1004a(android.content.Context r2, java.io.File r3, java.lang.String r4) throws java.io.IOException {
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
        r0 = new java.io.File;
        r1 = "code_cache";
        r0.<init>(r3, r1);
        android.support.multidex.C0274a.m1009a(r0);	 Catch:{ IOException -> 0x000b }
        goto L_0x0019;
    L_0x000b:
        r0 = new java.io.File;
        r2 = r2.getFilesDir();
        r3 = "code_cache";
        r0.<init>(r2, r3);
        android.support.multidex.C0274a.m1009a(r0);
    L_0x0019:
        r2 = new java.io.File;
        r2.<init>(r0, r4);
        android.support.multidex.C0274a.m1009a(r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.a.a(android.content.Context, java.io.File, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    private static void m1009a(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            StringBuilder stringBuilder;
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to create dir ");
                stringBuilder.append(file.getPath());
                stringBuilder.append(". Parent file is null.");
                Log.e("MultiDex", stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Failed to create dir ");
                stringBuilder2.append(file.getPath());
                stringBuilder2.append(". parent file is a dir ");
                stringBuilder2.append(parentFile.isDirectory());
                stringBuilder2.append(", a file ");
                stringBuilder2.append(parentFile.isFile());
                stringBuilder2.append(", exists ");
                stringBuilder2.append(parentFile.exists());
                stringBuilder2.append(", readable ");
                stringBuilder2.append(parentFile.canRead());
                stringBuilder2.append(", writable ");
                stringBuilder2.append(parentFile.canWrite());
                Log.e("MultiDex", stringBuilder2.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to create directory ");
            stringBuilder.append(file.getPath());
            throw new IOException(stringBuilder.toString());
        }
    }
}
