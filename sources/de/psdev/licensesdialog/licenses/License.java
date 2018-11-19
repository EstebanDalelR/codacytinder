package de.psdev.licensesdialog.licenses;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;

public abstract class License implements Serializable {
    /* renamed from: a */
    private static final String f48033a = System.getProperty("line.separator");
    private static final long serialVersionUID = 3100331505738956523L;
    /* renamed from: b */
    private String f48034b = null;
    /* renamed from: c */
    private String f48035c = null;

    /* renamed from: a */
    public abstract String mo12752a();

    /* renamed from: a */
    public abstract String mo12753a(Context context);

    /* renamed from: b */
    public abstract String mo12754b(Context context);

    /* renamed from: c */
    public final String m58067c(Context context) {
        if (this.f48034b == null) {
            this.f48034b = mo12753a(context);
        }
        return this.f48034b;
    }

    /* renamed from: d */
    public final String m58068d(Context context) {
        if (this.f48035c == null) {
            this.f48035c = mo12754b(context);
        }
        return this.f48035c;
    }

    /* renamed from: a */
    protected java.lang.String m58065a(android.content.Context r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        r3 = r3.getResources();	 Catch:{ IOException -> 0x002f }
        r3 = r3.openRawResource(r4);	 Catch:{ IOException -> 0x002f }
        if (r3 == 0) goto L_0x0025;	 Catch:{ IOException -> 0x002f }
    L_0x000b:
        r4 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x002f }
        r1 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x002f }
        r1.<init>(r3);	 Catch:{ IOException -> 0x002f }
        r4.<init>(r1);	 Catch:{ IOException -> 0x002f }
        r3 = r2.m58062a(r4);	 Catch:{ IOException -> 0x0022, all -> 0x001f }
        if (r4 == 0) goto L_0x001e;
    L_0x001b:
        r4.close();	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        return r3;
    L_0x001f:
        r3 = move-exception;
        r0 = r4;
        goto L_0x0036;
    L_0x0022:
        r3 = move-exception;
        r0 = r4;
        goto L_0x0030;
    L_0x0025:
        r3 = new java.io.IOException;	 Catch:{ IOException -> 0x002f }
        r4 = "Error opening license file.";	 Catch:{ IOException -> 0x002f }
        r3.<init>(r4);	 Catch:{ IOException -> 0x002f }
        throw r3;	 Catch:{ IOException -> 0x002f }
    L_0x002d:
        r3 = move-exception;
        goto L_0x0036;
    L_0x002f:
        r3 = move-exception;
    L_0x0030:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x002d }
        r4.<init>(r3);	 Catch:{ all -> 0x002d }
        throw r4;	 Catch:{ all -> 0x002d }
    L_0x0036:
        if (r0 == 0) goto L_0x003b;
    L_0x0038:
        r0.close();	 Catch:{ IOException -> 0x003b }
    L_0x003b:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: de.psdev.licensesdialog.licenses.License.a(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    private String m58062a(BufferedReader bufferedReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return stringBuilder.toString();
            }
            stringBuilder.append(readLine);
            stringBuilder.append(f48033a);
        }
    }
}
