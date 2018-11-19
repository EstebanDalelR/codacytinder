package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    /* renamed from: a */
    private static final String[] f1431a = new String[]{"_display_name", "_size"};
    /* renamed from: b */
    private static final File f1432b = new File("/");
    @GuardedBy("sCache")
    /* renamed from: c */
    private static HashMap<String, C0425a> f1433c = new HashMap();
    /* renamed from: d */
    private C0425a f1434d;

    /* renamed from: android.support.v4.content.FileProvider$a */
    interface C0425a {
        /* renamed from: a */
        Uri mo451a(File file);

        /* renamed from: a */
        File mo452a(Uri uri);
    }

    /* renamed from: android.support.v4.content.FileProvider$b */
    static class C2836b implements C0425a {
        /* renamed from: a */
        private final String f9019a;
        /* renamed from: b */
        private final HashMap<String, File> f9020b = new HashMap();

        C2836b(String str) {
            this.f9019a = str;
        }

        /* renamed from: a */
        void m11227a(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f9020b.put(str, file.getCanonicalFile());
            } catch (String str2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to resolve canonical path for ");
                stringBuilder.append(file);
                throw new IllegalArgumentException(stringBuilder.toString(), str2);
            }
        }

        /* renamed from: a */
        public android.net.Uri mo451a(java.io.File r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r6.getCanonicalPath();	 Catch:{ IOException -> 0x00bf }
            r6 = 0;
            r1 = r5.f9020b;
            r1 = r1.entrySet();
            r1 = r1.iterator();
        L_0x000f:
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x0043;
        L_0x0015:
            r2 = r1.next();
            r2 = (java.util.Map.Entry) r2;
            r3 = r2.getValue();
            r3 = (java.io.File) r3;
            r3 = r3.getPath();
            r4 = r0.startsWith(r3);
            if (r4 == 0) goto L_0x000f;
        L_0x002b:
            if (r6 == 0) goto L_0x0041;
        L_0x002d:
            r3 = r3.length();
            r4 = r6.getValue();
            r4 = (java.io.File) r4;
            r4 = r4.getPath();
            r4 = r4.length();
            if (r3 <= r4) goto L_0x000f;
        L_0x0041:
            r6 = r2;
            goto L_0x000f;
        L_0x0043:
            if (r6 != 0) goto L_0x005c;
        L_0x0045:
            r6 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Failed to find configured root that contains ";
            r1.append(r2);
            r1.append(r0);
            r0 = r1.toString();
            r6.<init>(r0);
            throw r6;
        L_0x005c:
            r1 = r6.getValue();
            r1 = (java.io.File) r1;
            r1 = r1.getPath();
            r2 = "/";
            r2 = r1.endsWith(r2);
            if (r2 == 0) goto L_0x0077;
        L_0x006e:
            r1 = r1.length();
            r0 = r0.substring(r1);
            goto L_0x0081;
        L_0x0077:
            r1 = r1.length();
            r1 = r1 + 1;
            r0 = r0.substring(r1);
        L_0x0081:
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r6 = r6.getKey();
            r6 = (java.lang.String) r6;
            r6 = android.net.Uri.encode(r6);
            r1.append(r6);
            r6 = 47;
            r1.append(r6);
            r6 = "/";
            r6 = android.net.Uri.encode(r0, r6);
            r1.append(r6);
            r6 = r1.toString();
            r0 = new android.net.Uri$Builder;
            r0.<init>();
            r1 = "content";
            r0 = r0.scheme(r1);
            r1 = r5.f9019a;
            r0 = r0.authority(r1);
            r6 = r0.encodedPath(r6);
            r6 = r6.build();
            return r6;
        L_0x00bf:
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Failed to resolve canonical path for ";
            r1.append(r2);
            r1.append(r6);
            r6 = r1.toString();
            r0.<init>(r6);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.FileProvider.b.a(java.io.File):android.net.Uri");
        }

        /* renamed from: a */
        public java.io.File mo452a(android.net.Uri r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r5.getEncodedPath();
            r1 = 1;
            r2 = 47;
            r2 = r0.indexOf(r2, r1);
            r3 = r0.substring(r1, r2);
            r3 = android.net.Uri.decode(r3);
            r2 = r2 + r1;
            r0 = r0.substring(r2);
            r0 = android.net.Uri.decode(r0);
            r1 = r4.f9020b;
            r1 = r1.get(r3);
            r1 = (java.io.File) r1;
            if (r1 != 0) goto L_0x003d;
        L_0x0026:
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Unable to find configured root for ";
            r1.append(r2);
            r1.append(r5);
            r5 = r1.toString();
            r0.<init>(r5);
            throw r0;
        L_0x003d:
            r5 = new java.io.File;
            r5.<init>(r1, r0);
            r0 = r5.getCanonicalFile();	 Catch:{ IOException -> 0x005d }
            r5 = r0.getPath();
            r1 = r1.getPath();
            r5 = r5.startsWith(r1);
            if (r5 != 0) goto L_0x005c;
        L_0x0054:
            r5 = new java.lang.SecurityException;
            r0 = "Resolved path jumped beyond configured root";
            r5.<init>(r0);
            throw r5;
        L_0x005c:
            return r0;
        L_0x005d:
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "Failed to resolve canonical path for ";
            r1.append(r2);
            r1.append(r5);
            r5 = r1.toString();
            r0.<init>(r5);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.FileProvider.b.a(android.net.Uri):java.io.File");
        }
    }

    public boolean onCreate() {
        return true;
    }

    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.f1434d = m1593a(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    /* renamed from: a */
    public static Uri m1592a(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return m1593a(context, str).mo451a(file);
    }

    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        uri = this.f1434d.mo452a(uri);
        if (strArr == null) {
            strArr = f1431a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i = 0;
        for (Object obj : strArr) {
            int i2;
            if ("_display_name".equals(obj)) {
                strArr3[i] = "_display_name";
                i2 = i + 1;
                objArr[i] = uri.getName();
            } else if ("_size".equals(obj)) {
                strArr3[i] = "_size";
                i2 = i + 1;
                objArr[i] = Long.valueOf(uri.length());
            } else {
            }
            i = i2;
        }
        uri = m1596a(strArr3, i);
        strArr = m1595a(objArr, i);
        str = new MatrixCursor(uri, 1);
        str.addRow(strArr);
        return str;
    }

    public String getType(@NonNull Uri uri) {
        uri = this.f1434d.mo452a(uri);
        int lastIndexOf = uri.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            uri = MimeTypeMap.getSingleton().getMimeTypeFromExtension(uri.getName().substring(lastIndexOf + 1));
            if (uri != null) {
                return uri;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return this.f1434d.mo452a(uri).delete();
    }

    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f1434d.mo452a(uri), m1591a(str));
    }

    /* renamed from: a */
    private static C0425a m1593a(Context context, String str) {
        C0425a c0425a;
        synchronized (f1433c) {
            c0425a = (C0425a) f1433c.get(str);
            if (c0425a == null) {
                try {
                    c0425a = m1597b(context, str);
                    f1433c.put(str, c0425a);
                } catch (Context context2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context2);
                } catch (Context context22) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context22);
                }
            }
        }
        return c0425a;
    }

    /* renamed from: b */
    private static C0425a m1597b(Context context, String str) throws IOException, XmlPullParserException {
        C0425a c2836b = new C2836b(str);
        str = context.getPackageManager().resolveContentProvider(str, ProfileEditingConfig.DEFAULT_MAX_LENGTH).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (str == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = str.next();
            if (next == 1) {
                return c2836b;
            }
            if (next == 2) {
                String name = str.getName();
                File file = null;
                String attributeValue = str.getAttributeValue(null, "name");
                String attributeValue2 = str.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f1432b;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    r1 = C0432b.m1644a(context, null);
                    if (r1.length > 0) {
                        file = r1[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    r1 = C0432b.m1643a(context);
                    if (r1.length > 0) {
                        file = r1[0];
                    }
                } else if (VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    r1 = context.getExternalMediaDirs();
                    if (r1.length > 0) {
                        file = r1[0];
                    }
                }
                if (file != null) {
                    c2836b.m11227a(attributeValue, m1594a(file, attributeValue2));
                }
            }
        }
    }

    /* renamed from: a */
    private static int m1591a(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str)) {
            if (!"wt".equals(str)) {
                if ("wa".equals(str)) {
                    return 704643072;
                }
                if ("rw".equals(str)) {
                    return 939524096;
                }
                if ("rwt".equals(str)) {
                    return 1006632960;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid mode: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return 738197504;
    }

    /* renamed from: a */
    private static File m1594a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: a */
    private static String[] m1596a(String[] strArr, int i) {
        Object obj = new String[i];
        System.arraycopy(strArr, 0, obj, 0, i);
        return obj;
    }

    /* renamed from: a */
    private static Object[] m1595a(Object[] objArr, int i) {
        Object obj = new Object[i];
        System.arraycopy(objArr, 0, obj, 0, i);
        return obj;
    }
}
