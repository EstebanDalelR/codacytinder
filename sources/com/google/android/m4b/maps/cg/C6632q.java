package com.google.android.m4b.maps.cg;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.ae.C4706a;
import com.google.android.m4b.maps.p125y.C5571j;
import io.fabric.sdk.android.services.events.C15645a;

/* renamed from: com.google.android.m4b.maps.cg.q */
public final class C6632q implements C4706a {
    /* renamed from: a */
    private C4662a f24851a;
    /* renamed from: b */
    private boolean f24852b;
    /* renamed from: c */
    private String f24853c;
    /* renamed from: d */
    private Context f24854d;

    public C6632q(Context context, String str) {
        C5571j.m24293a((Object) str, (Object) "Package name is null");
        this.f24854d = context;
        String valueOf = String.valueOf("event_store_v2_");
        str = String.valueOf(str);
        this.f24853c = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
        str = C6632q.m29548a(context);
        if (str != null) {
            int indexOf = str.indexOf(58);
            if (indexOf != -1) {
                if (indexOf < str.length()) {
                    str = String.valueOf(str.substring(indexOf + 1));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 1);
                    stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                }
            }
            str = "";
        } else {
            str = "";
        }
        Object c = bx.m23059c();
        try {
            String valueOf2 = String.valueOf("event_store_v2");
            str = String.valueOf(str);
            context = context.getFileStreamPath(str.length() != 0 ? valueOf2.concat(str) : new String(valueOf2));
            if (!(context == null || context.exists() == null)) {
                context.delete();
            }
            bx.m23057a(c);
        } catch (Throwable th) {
            bx.m23057a(c);
        }
    }

    /* renamed from: a */
    public final synchronized C4662a mo5318a() {
        if (!this.f24852b) {
            m29549c();
        }
        return this.f24851a;
    }

    /* renamed from: a */
    public final synchronized void mo5319a(C4662a c4662a) {
        this.f24851a = c4662a;
        this.f24852b = true;
    }

    /* renamed from: c */
    private synchronized void m29549c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.f24853c;	 Catch:{ all -> 0x0050 }
        if (r0 == 0) goto L_0x004b;	 Catch:{ all -> 0x0050 }
    L_0x0005:
        r0 = com.google.android.m4b.maps.cg.bx.m23056a();	 Catch:{ all -> 0x0050 }
        r1 = 0;
        r2 = r6.f24854d;	 Catch:{ IOException -> 0x0035, all -> 0x0030 }
        r3 = r6.f24853c;	 Catch:{ IOException -> 0x0035, all -> 0x0030 }
        r2 = r2.openFileInput(r3);	 Catch:{ IOException -> 0x0035, all -> 0x0030 }
        if (r2 == 0) goto L_0x0027;
    L_0x0014:
        r3 = new com.google.android.m4b.maps.ar.a;	 Catch:{ IOException -> 0x0036 }
        r4 = com.google.android.m4b.maps.de.af.f19891a;	 Catch:{ IOException -> 0x0036 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0036 }
        r6.f24851a = r3;	 Catch:{ IOException -> 0x0036 }
        r3 = r6.f24851a;	 Catch:{ IOException -> 0x0036 }
        r4 = com.google.android.m4b.maps.ap.C4655c.m20771a(r2);	 Catch:{ IOException -> 0x0036 }
        r3.m20819a(r4);	 Catch:{ IOException -> 0x0036 }
        goto L_0x0029;	 Catch:{ IOException -> 0x0036 }
    L_0x0027:
        r6.f24851a = r1;	 Catch:{ IOException -> 0x0036 }
    L_0x0029:
        com.google.android.m4b.maps.cg.bx.m23057a(r0);	 Catch:{ all -> 0x0050 }
    L_0x002c:
        com.google.android.m4b.maps.ap.C4655c.m20773b(r2);	 Catch:{ all -> 0x0050 }
        goto L_0x004b;
    L_0x0030:
        r2 = move-exception;
        r5 = r2;
        r2 = r1;
        r1 = r5;
        goto L_0x0044;
    L_0x0035:
        r2 = r1;
    L_0x0036:
        r6.f24851a = r1;	 Catch:{ all -> 0x0043 }
        r1 = r6.f24854d;	 Catch:{ all -> 0x0043 }
        r3 = r6.f24853c;	 Catch:{ all -> 0x0043 }
        r1.deleteFile(r3);	 Catch:{ all -> 0x0043 }
        com.google.android.m4b.maps.cg.bx.m23057a(r0);	 Catch:{ all -> 0x0050 }
        goto L_0x002c;	 Catch:{ all -> 0x0050 }
    L_0x0043:
        r1 = move-exception;	 Catch:{ all -> 0x0050 }
    L_0x0044:
        com.google.android.m4b.maps.cg.bx.m23057a(r0);	 Catch:{ all -> 0x0050 }
        com.google.android.m4b.maps.ap.C4655c.m20773b(r2);	 Catch:{ all -> 0x0050 }
        throw r1;	 Catch:{ all -> 0x0050 }
    L_0x004b:
        r0 = 1;	 Catch:{ all -> 0x0050 }
        r6.f24852b = r0;	 Catch:{ all -> 0x0050 }
        monitor-exit(r6);
        return;
    L_0x0050:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.q.c():void");
    }

    /* renamed from: b */
    public final synchronized void mo5320b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.f24853c;	 Catch:{ all -> 0x004c }
        r1 = 0;	 Catch:{ all -> 0x004c }
        r2 = 0;	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0046;	 Catch:{ all -> 0x004c }
    L_0x0007:
        r0 = r6.f24851a;	 Catch:{ all -> 0x004c }
        if (r0 != 0) goto L_0x0013;	 Catch:{ all -> 0x004c }
    L_0x000b:
        r0 = r6.f24854d;	 Catch:{ all -> 0x004c }
        r3 = r6.f24853c;	 Catch:{ all -> 0x004c }
        r0.deleteFile(r3);	 Catch:{ all -> 0x004c }
        goto L_0x0046;	 Catch:{ all -> 0x004c }
    L_0x0013:
        r0 = com.google.android.m4b.maps.cg.bx.m23058b();	 Catch:{ all -> 0x004c }
        r3 = r6.f24854d;	 Catch:{ IOException -> 0x0032, all -> 0x002f }
        r4 = r6.f24853c;	 Catch:{ IOException -> 0x0032, all -> 0x002f }
        r3 = r3.openFileOutput(r4, r1);	 Catch:{ IOException -> 0x0032, all -> 0x002f }
        r4 = r6.f24851a;	 Catch:{ IOException -> 0x0033 }
        r4 = r4.m20837d();	 Catch:{ IOException -> 0x0033 }
        r3.write(r4);	 Catch:{ IOException -> 0x0033 }
        com.google.android.m4b.maps.cg.bx.m23057a(r0);	 Catch:{ all -> 0x004c }
    L_0x002b:
        com.google.android.m4b.maps.ap.C4655c.m20770a(r3);	 Catch:{ all -> 0x004c }
        goto L_0x0046;
    L_0x002f:
        r1 = move-exception;
        r3 = r2;
        goto L_0x003f;
    L_0x0032:
        r3 = r2;
    L_0x0033:
        r4 = r6.f24854d;	 Catch:{ all -> 0x003e }
        r5 = r6.f24853c;	 Catch:{ all -> 0x003e }
        r4.deleteFile(r5);	 Catch:{ all -> 0x003e }
        com.google.android.m4b.maps.cg.bx.m23057a(r0);	 Catch:{ all -> 0x004c }
        goto L_0x002b;	 Catch:{ all -> 0x004c }
    L_0x003e:
        r1 = move-exception;	 Catch:{ all -> 0x004c }
    L_0x003f:
        com.google.android.m4b.maps.cg.bx.m23057a(r0);	 Catch:{ all -> 0x004c }
        com.google.android.m4b.maps.ap.C4655c.m20770a(r3);	 Catch:{ all -> 0x004c }
        throw r1;	 Catch:{ all -> 0x004c }
    L_0x0046:
        r6.f24851a = r2;	 Catch:{ all -> 0x004c }
        r6.f24852b = r1;	 Catch:{ all -> 0x004c }
        monitor-exit(r6);
        return;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.q.b():void");
    }

    /* renamed from: a */
    private static String m29548a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int myPid = Process.myPid();
        for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }
}
