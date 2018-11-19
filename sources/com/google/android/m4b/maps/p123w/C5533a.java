package com.google.android.m4b.maps.p123w;

import android.net.Uri;
import android.provider.BaseColumns;

/* renamed from: com.google.android.m4b.maps.w.a */
public final class C5533a {

    /* renamed from: com.google.android.m4b.maps.w.a$a */
    public static class C5532a implements BaseColumns {
    }

    /* renamed from: com.google.android.m4b.maps.w.a$b */
    public static final class C6781b extends C5532a {
        /* renamed from: a */
        private static Uri f25351a = Uri.parse("content://com.google.settings/partner");

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public static java.lang.String m30156a(android.content.ContentResolver r8, java.lang.String r9) {
            /*
            r0 = 0;
            r2 = f25351a;	 Catch:{ SQLException -> 0x0030, all -> 0x002d }
            r1 = "value";
            r3 = new java.lang.String[]{r1};	 Catch:{ SQLException -> 0x0030, all -> 0x002d }
            r4 = "name=?";
            r1 = 1;
            r5 = new java.lang.String[r1];	 Catch:{ SQLException -> 0x0030, all -> 0x002d }
            r7 = 0;
            r5[r7] = r9;	 Catch:{ SQLException -> 0x0030, all -> 0x002d }
            r6 = 0;
            r1 = r8;
            r8 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ SQLException -> 0x0030, all -> 0x002d }
            if (r8 == 0) goto L_0x0027;
        L_0x0019:
            r1 = r8.moveToNext();	 Catch:{ SQLException -> 0x0025 }
            if (r1 == 0) goto L_0x0027;
        L_0x001f:
            r1 = r8.getString(r7);	 Catch:{ SQLException -> 0x0025 }
            r0 = r1;
            goto L_0x0027;
        L_0x0025:
            r1 = move-exception;
            goto L_0x0032;
        L_0x0027:
            if (r8 == 0) goto L_0x0052;
        L_0x0029:
            r8.close();
            goto L_0x0052;
        L_0x002d:
            r9 = move-exception;
            r8 = r0;
            goto L_0x0054;
        L_0x0030:
            r1 = move-exception;
            r8 = r0;
        L_0x0032:
            r2 = "GoogleSettings";
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0053 }
            r4 = "Can't get key ";
            r3.<init>(r4);	 Catch:{ all -> 0x0053 }
            r3.append(r9);	 Catch:{ all -> 0x0053 }
            r9 = " from ";
            r3.append(r9);	 Catch:{ all -> 0x0053 }
            r9 = f25351a;	 Catch:{ all -> 0x0053 }
            r3.append(r9);	 Catch:{ all -> 0x0053 }
            r9 = r3.toString();	 Catch:{ all -> 0x0053 }
            android.util.Log.e(r2, r9, r1);	 Catch:{ all -> 0x0053 }
            if (r8 == 0) goto L_0x0052;
        L_0x0051:
            goto L_0x0029;
        L_0x0052:
            return r0;
        L_0x0053:
            r9 = move-exception;
        L_0x0054:
            if (r8 == 0) goto L_0x0059;
        L_0x0056:
            r8.close();
        L_0x0059:
            throw r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.w.a.b.a(android.content.ContentResolver, java.lang.String):java.lang.String");
        }
    }
}
