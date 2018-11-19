package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class MultiDexExtractor {

    private static class ExtractedDex extends File {
        /* renamed from: a */
        public long f976a = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    /* renamed from: a */
    static java.util.List<? extends java.io.File> m988a(android.content.Context r14, java.io.File r15, java.io.File r16, java.lang.String r17, boolean r18) throws java.io.IOException {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = r17;
        r1 = r18;
        r3 = "MultiDex";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "MultiDexExtractor.load(";
        r4.append(r5);
        r5 = r15.getPath();
        r4.append(r5);
        r5 = ", ";
        r4.append(r5);
        r4.append(r1);
        r5 = ", ";
        r4.append(r5);
        r4.append(r2);
        r5 = ")";
        r4.append(r5);
        r4 = r4.toString();
        android.util.Log.i(r3, r4);
        r5 = m995b(r15);
        r8 = new java.io.File;
        r3 = "MultiDex.lock";
        r4 = r16;
        r8.<init>(r4, r3);
        r9 = new java.io.RandomAccessFile;
        r3 = "rw";
        r9.<init>(r8, r3);
        r10 = 0;
        r11 = r9.getChannel();	 Catch:{ all -> 0x0112 }
        r3 = "MultiDex";	 Catch:{ all -> 0x010e }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010e }
        r7.<init>();	 Catch:{ all -> 0x010e }
        r12 = "Blocking on lock ";	 Catch:{ all -> 0x010e }
        r7.append(r12);	 Catch:{ all -> 0x010e }
        r12 = r8.getPath();	 Catch:{ all -> 0x010e }
        r7.append(r12);	 Catch:{ all -> 0x010e }
        r7 = r7.toString();	 Catch:{ all -> 0x010e }
        android.util.Log.i(r3, r7);	 Catch:{ all -> 0x010e }
        r12 = r11.lock();	 Catch:{ all -> 0x010e }
        r3 = "MultiDex";	 Catch:{ all -> 0x010b }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010b }
        r7.<init>();	 Catch:{ all -> 0x010b }
        r13 = r8.getPath();	 Catch:{ all -> 0x010b }
        r7.append(r13);	 Catch:{ all -> 0x010b }
        r13 = " locked";	 Catch:{ all -> 0x010b }
        r7.append(r13);	 Catch:{ all -> 0x010b }
        r7 = r7.toString();	 Catch:{ all -> 0x010b }
        android.util.Log.i(r3, r7);	 Catch:{ all -> 0x010b }
        if (r1 != 0) goto L_0x00a9;	 Catch:{ all -> 0x010b }
    L_0x0086:
        r1 = r14;	 Catch:{ all -> 0x010b }
        r3 = r15;	 Catch:{ all -> 0x010b }
        r7 = m994a(r1, r3, r5, r2);	 Catch:{ all -> 0x010b }
        if (r7 != 0) goto L_0x00ab;
    L_0x008e:
        r7 = m987a(r14, r15, r16, r17);	 Catch:{ IOException -> 0x0094 }
        r13 = r7;
        goto L_0x00be;
    L_0x0094:
        r0 = move-exception;
        r7 = "MultiDex";	 Catch:{ all -> 0x010b }
        r13 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction";	 Catch:{ all -> 0x010b }
        android.util.Log.w(r7, r13, r0);	 Catch:{ all -> 0x010b }
        r13 = m989a(r15, r16);	 Catch:{ all -> 0x010b }
        r3 = m985a(r3);	 Catch:{ all -> 0x010b }
        r7 = r13;	 Catch:{ all -> 0x010b }
        m990a(r1, r2, r3, r5, r7);	 Catch:{ all -> 0x010b }
        goto L_0x00be;	 Catch:{ all -> 0x010b }
    L_0x00a9:
        r1 = r14;	 Catch:{ all -> 0x010b }
        r3 = r15;	 Catch:{ all -> 0x010b }
    L_0x00ab:
        r7 = "MultiDex";	 Catch:{ all -> 0x010b }
        r13 = "Detected that extraction must be performed.";	 Catch:{ all -> 0x010b }
        android.util.Log.i(r7, r13);	 Catch:{ all -> 0x010b }
        r13 = m989a(r15, r16);	 Catch:{ all -> 0x010b }
        r3 = m985a(r3);	 Catch:{ all -> 0x010b }
        r7 = r13;	 Catch:{ all -> 0x010b }
        m990a(r1, r2, r3, r5, r7);	 Catch:{ all -> 0x010b }
    L_0x00be:
        if (r12 == 0) goto L_0x00e0;
    L_0x00c0:
        r12.release();	 Catch:{ IOException -> 0x00c4 }
        goto L_0x00e0;
    L_0x00c4:
        r0 = move-exception;
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Failed to release lock on ";
        r2.append(r3);
        r3 = r8.getPath();
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.e(r1, r2);
        r10 = r0;
    L_0x00e0:
        if (r11 == 0) goto L_0x00e5;
    L_0x00e2:
        m991a(r11);
    L_0x00e5:
        m991a(r9);
        if (r10 == 0) goto L_0x00eb;
    L_0x00ea:
        throw r10;
    L_0x00eb:
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "load found ";
        r2.append(r3);
        r3 = r13.size();
        r2.append(r3);
        r3 = " secondary dex files";
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.i(r1, r2);
        return r13;
    L_0x010b:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0116;
    L_0x010e:
        r0 = move-exception;
        r1 = r0;
        r12 = r10;
        goto L_0x0116;
    L_0x0112:
        r0 = move-exception;
        r1 = r0;
        r11 = r10;
        r12 = r11;
    L_0x0116:
        if (r12 == 0) goto L_0x0136;
    L_0x0118:
        r12.release();	 Catch:{ IOException -> 0x011c }
        goto L_0x0136;
    L_0x011c:
        r2 = "MultiDex";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Failed to release lock on ";
        r3.append(r4);
        r4 = r8.getPath();
        r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
    L_0x0136:
        if (r11 == 0) goto L_0x013b;
    L_0x0138:
        m991a(r11);
    L_0x013b:
        m991a(r9);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.MultiDexExtractor.a(android.content.Context, java.io.File, java.io.File, java.lang.String, boolean):java.util.List<? extends java.io.File>");
    }

    /* renamed from: a */
    private static List<ExtractedDex> m987a(Context context, File file, File file2, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getName());
        stringBuilder.append(".classes");
        String stringBuilder2 = stringBuilder.toString();
        SharedPreferences a = m986a(context);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append("dex.number");
        int i = a.getInt(stringBuilder3.toString(), 1);
        List<ExtractedDex> arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append(i2);
            stringBuilder4.append(".zip");
            File extractedDex = new ExtractedDex(file2, stringBuilder4.toString());
            if (extractedDex.isFile()) {
                extractedDex.f976a = m995b(extractedDex);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.crc.");
                stringBuilder4.append(i2);
                long j = a.getLong(stringBuilder4.toString(), -1);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.time.");
                stringBuilder4.append(i2);
                long j2 = a.getLong(stringBuilder4.toString(), -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str3 = stringBuilder2;
                    SharedPreferences sharedPreferences = a;
                    if (j == extractedDex.f976a) {
                        arrayList.add(extractedDex);
                        i2++;
                        stringBuilder2 = str3;
                        a = sharedPreferences;
                    }
                }
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("Invalid extracted dex: ");
                stringBuilder5.append(extractedDex);
                stringBuilder5.append(" (key \"");
                stringBuilder5.append(str2);
                stringBuilder5.append("\"), expected modification time: ");
                stringBuilder5.append(j2);
                stringBuilder5.append(", modification time: ");
                stringBuilder5.append(lastModified);
                stringBuilder5.append(", expected crc: ");
                stringBuilder5.append(j);
                stringBuilder5.append(", file crc: ");
                stringBuilder5.append(extractedDex.f976a);
                throw new IOException(stringBuilder5.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Missing extracted secondary dex file '");
            stringBuilder.append(extractedDex.getPath());
            stringBuilder.append("'");
            throw new IOException(stringBuilder.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m994a(Context context, File file, long j, String str) {
        context = m986a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("timestamp");
        if (context.getLong(stringBuilder.toString(), -1) == m985a(file)) {
            file = new StringBuilder();
            file.append(str);
            file.append("crc");
            if (context.getLong(file.toString(), -1) == j) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static long m985a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: b */
    private static long m995b(File file) throws IOException {
        long a = C0276b.m1018a(file);
        return a == -1 ? a - 1 : a;
    }

    /* renamed from: a */
    private static List<ExtractedDex> m989a(File file, File file2) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getName());
        stringBuilder.append(".classes");
        String stringBuilder2 = stringBuilder.toString();
        m992a(file2, stringBuilder2);
        List<ExtractedDex> arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        file = 2;
        File extractedDex;
        Object obj;
        StringBuilder stringBuilder3;
        try {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("classes");
            stringBuilder4.append(2);
            stringBuilder4.append(".dex");
            ZipEntry entry = zipFile.getEntry(stringBuilder4.toString());
            while (entry != null) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(stringBuilder2);
                stringBuilder5.append(file);
                stringBuilder5.append(".zip");
                extractedDex = new ExtractedDex(file2, stringBuilder5.toString());
                arrayList.add(extractedDex);
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("Extraction is needed for file ");
                stringBuilder6.append(extractedDex);
                Log.i("MultiDex", stringBuilder6.toString());
                int i = 0;
                obj = null;
                while (i < 3 && obj == null) {
                    i++;
                    m993a(zipFile, entry, extractedDex, stringBuilder2);
                    extractedDex.f976a = m995b(extractedDex);
                    obj = 1;
                    String str = "MultiDex";
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Extraction ");
                    stringBuilder3.append(obj != null ? "succeeded" : "failed");
                    stringBuilder3.append(" - length ");
                    stringBuilder3.append(extractedDex.getAbsolutePath());
                    stringBuilder3.append(": ");
                    stringBuilder3.append(extractedDex.length());
                    stringBuilder3.append(" - crc: ");
                    stringBuilder3.append(extractedDex.f976a);
                    Log.i(str, stringBuilder3.toString());
                    if (obj == null) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Failed to delete corrupted secondary dex '");
                            stringBuilder3.append(extractedDex.getPath());
                            stringBuilder3.append("'");
                            Log.w("MultiDex", stringBuilder3.toString());
                        }
                    }
                }
                if (obj == null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not create zip file ");
                    stringBuilder.append(extractedDex.getAbsolutePath());
                    stringBuilder.append(" for secondary dex (");
                    stringBuilder.append(file);
                    stringBuilder.append(")");
                    throw new IOException(stringBuilder.toString());
                }
                file++;
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append("classes");
                stringBuilder4.append(file);
                stringBuilder4.append(".dex");
                entry = zipFile.getEntry(stringBuilder4.toString());
            }
            try {
                zipFile.close();
            } catch (File file3) {
                Log.w("MultiDex", "Failed to close resource", file3);
            }
            return arrayList;
        } catch (Throwable e) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Failed to read crc from ");
            stringBuilder3.append(extractedDex.getAbsolutePath());
            Log.w("MultiDex", stringBuilder3.toString(), e);
            obj = null;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (File file22) {
                Log.w("MultiDex", "Failed to close resource", file22);
            }
        }
    }

    /* renamed from: a */
    private static void m990a(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        context = m986a(context).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("timestamp");
        context.putLong(stringBuilder.toString(), j);
        j = new StringBuilder();
        j.append(str);
        j.append("crc");
        context.putLong(j.toString(), j2);
        j = new StringBuilder();
        j.append(str);
        j.append("dex.number");
        context.putInt(j.toString(), list.size() + 1);
        int i = 2;
        for (ExtractedDex extractedDex : list) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("dex.crc.");
            stringBuilder2.append(i);
            context.putLong(stringBuilder2.toString(), extractedDex.f976a);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("dex.time.");
            stringBuilder2.append(i);
            context.putLong(stringBuilder2.toString(), extractedDex.lastModified());
            i++;
        }
        context.commit();
    }

    /* renamed from: a */
    private static SharedPreferences m986a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: a */
    private static void m992a(File file, final String str) {
        str = file.listFiles(new FileFilter() {
            public boolean accept(File file) {
                file = file.getName();
                return (file.startsWith(str) || file.equals("MultiDex.lock") != null) ? null : true;
            }
        });
        if (str == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to list secondary dex dir content (");
            stringBuilder.append(file.getPath());
            stringBuilder.append(").");
            Log.w("MultiDex", stringBuilder.toString());
            return;
        }
        for (File file2 : str) {
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
    }

    /* renamed from: a */
    private static void m993a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        Closeable inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tmp-");
        stringBuilder.append(str);
        str = File.createTempFile(stringBuilder.toString(), ".zip", file.getParentFile());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Extracting ");
        stringBuilder2.append(str.getPath());
        Log.i("MultiDex", stringBuilder2.toString());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            zipEntry = new byte[16384];
            for (int read = inputStream.read(zipEntry); read != -1; read = inputStream.read(zipEntry)) {
                zipOutputStream.write(zipEntry, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (str.setReadOnly() == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to mark readonly \"");
                stringBuilder.append(str.getAbsolutePath());
                stringBuilder.append("\" (tmp of \"");
                stringBuilder.append(file.getAbsolutePath());
                stringBuilder.append("\")");
                throw new IOException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Renaming to ");
            stringBuilder.append(file.getPath());
            Log.i("MultiDex", stringBuilder.toString());
            if (str.renameTo(file) == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to rename \"");
                stringBuilder.append(str.getAbsolutePath());
                stringBuilder.append("\" to \"");
                stringBuilder.append(file.getAbsolutePath());
                stringBuilder.append("\"");
                throw new IOException(stringBuilder.toString());
            }
            m991a(inputStream);
            str.delete();
        } catch (Throwable th) {
            m991a(inputStream);
            str.delete();
        }
    }

    /* renamed from: a */
    private static void m991a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Closeable closeable2) {
            Log.w("MultiDex", "Failed to close resource", closeable2);
        }
    }
}
