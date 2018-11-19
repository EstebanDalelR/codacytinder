package org.joda.time.tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: org.joda.time.tz.a */
public class C19502a implements NameProvider {
    /* renamed from: a */
    private HashMap<Locale, Map<String, Map<String, Object>>> f60897a = m70366a();
    /* renamed from: b */
    private HashMap<Locale, Map<String, Map<Boolean, Object>>> f60898b = m70366a();

    public String getShortName(Locale locale, String str, String str2) {
        locale = m70367a(locale, str, str2);
        if (locale == null) {
            return null;
        }
        return locale[null];
    }

    public String getName(Locale locale, String str, String str2) {
        locale = m70367a(locale, str, str2);
        if (locale == null) {
            return null;
        }
        return locale[1];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized java.lang.String[] m70367a(java.util.Locale r10, java.lang.String r11, java.lang.String r12) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = 0;
        if (r10 == 0) goto L_0x00cd;
    L_0x0004:
        if (r11 == 0) goto L_0x00cd;
    L_0x0006:
        if (r12 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x00cd;
    L_0x000a:
        r1 = r9.f60897a;	 Catch:{ all -> 0x00ca }
        r1 = r1.get(r10);	 Catch:{ all -> 0x00ca }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x00ca }
        if (r1 != 0) goto L_0x001e;
    L_0x0014:
        r1 = r9.f60897a;	 Catch:{ all -> 0x00ca }
        r2 = r9.m70366a();	 Catch:{ all -> 0x00ca }
        r1.put(r10, r2);	 Catch:{ all -> 0x00ca }
        r1 = r2;
    L_0x001e:
        r2 = r1.get(r11);	 Catch:{ all -> 0x00ca }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x00ca }
        if (r2 != 0) goto L_0x00c2;
    L_0x0026:
        r2 = r9.m70366a();	 Catch:{ all -> 0x00ca }
        r1.put(r11, r2);	 Catch:{ all -> 0x00ca }
        r1 = java.util.Locale.ENGLISH;	 Catch:{ all -> 0x00ca }
        r1 = org.joda.time.DateTimeUtils.m68905a(r1);	 Catch:{ all -> 0x00ca }
        r1 = r1.getZoneStrings();	 Catch:{ all -> 0x00ca }
        r3 = r1.length;	 Catch:{ all -> 0x00ca }
        r4 = 0;
        r5 = 0;
    L_0x003a:
        r6 = 5;
        if (r5 >= r3) goto L_0x0050;
    L_0x003d:
        r7 = r1[r5];	 Catch:{ all -> 0x00ca }
        if (r7 == 0) goto L_0x004d;
    L_0x0041:
        r8 = r7.length;	 Catch:{ all -> 0x00ca }
        if (r8 < r6) goto L_0x004d;
    L_0x0044:
        r8 = r7[r4];	 Catch:{ all -> 0x00ca }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00ca }
        if (r8 == 0) goto L_0x004d;
    L_0x004c:
        goto L_0x0051;
    L_0x004d:
        r5 = r5 + 1;
        goto L_0x003a;
    L_0x0050:
        r7 = r0;
    L_0x0051:
        r10 = org.joda.time.DateTimeUtils.m68905a(r10);	 Catch:{ all -> 0x00ca }
        r10 = r10.getZoneStrings();	 Catch:{ all -> 0x00ca }
        r1 = r10.length;	 Catch:{ all -> 0x00ca }
        r3 = 0;
    L_0x005b:
        if (r3 >= r1) goto L_0x0071;
    L_0x005d:
        r5 = r10[r3];	 Catch:{ all -> 0x00ca }
        if (r5 == 0) goto L_0x006e;
    L_0x0061:
        r8 = r5.length;	 Catch:{ all -> 0x00ca }
        if (r8 < r6) goto L_0x006e;
    L_0x0064:
        r8 = r5[r4];	 Catch:{ all -> 0x00ca }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00ca }
        if (r8 == 0) goto L_0x006e;
    L_0x006c:
        r0 = r5;
        goto L_0x0071;
    L_0x006e:
        r3 = r3 + 1;
        goto L_0x005b;
    L_0x0071:
        if (r7 == 0) goto L_0x00c2;
    L_0x0073:
        if (r0 == 0) goto L_0x00c2;
    L_0x0075:
        r10 = 2;
        r11 = r7[r10];	 Catch:{ all -> 0x00ca }
        r1 = new java.lang.String[r10];	 Catch:{ all -> 0x00ca }
        r3 = r0[r10];	 Catch:{ all -> 0x00ca }
        r1[r4] = r3;	 Catch:{ all -> 0x00ca }
        r3 = 1;
        r5 = r0[r3];	 Catch:{ all -> 0x00ca }
        r1[r3] = r5;	 Catch:{ all -> 0x00ca }
        r2.put(r11, r1);	 Catch:{ all -> 0x00ca }
        r11 = r7[r10];	 Catch:{ all -> 0x00ca }
        r1 = 4;
        r5 = r7[r1];	 Catch:{ all -> 0x00ca }
        r11 = r11.equals(r5);	 Catch:{ all -> 0x00ca }
        r5 = 3;
        if (r11 == 0) goto L_0x00b3;
    L_0x0092:
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ca }
        r11.<init>();	 Catch:{ all -> 0x00ca }
        r6 = r7[r1];	 Catch:{ all -> 0x00ca }
        r11.append(r6);	 Catch:{ all -> 0x00ca }
        r6 = "-Summer";
        r11.append(r6);	 Catch:{ all -> 0x00ca }
        r11 = r11.toString();	 Catch:{ all -> 0x00ca }
        r10 = new java.lang.String[r10];	 Catch:{ all -> 0x00ca }
        r1 = r0[r1];	 Catch:{ all -> 0x00ca }
        r10[r4] = r1;	 Catch:{ all -> 0x00ca }
        r0 = r0[r5];	 Catch:{ all -> 0x00ca }
        r10[r3] = r0;	 Catch:{ all -> 0x00ca }
        r2.put(r11, r10);	 Catch:{ all -> 0x00ca }
        goto L_0x00c2;
    L_0x00b3:
        r11 = r7[r1];	 Catch:{ all -> 0x00ca }
        r10 = new java.lang.String[r10];	 Catch:{ all -> 0x00ca }
        r1 = r0[r1];	 Catch:{ all -> 0x00ca }
        r10[r4] = r1;	 Catch:{ all -> 0x00ca }
        r0 = r0[r5];	 Catch:{ all -> 0x00ca }
        r10[r3] = r0;	 Catch:{ all -> 0x00ca }
        r2.put(r11, r10);	 Catch:{ all -> 0x00ca }
    L_0x00c2:
        r10 = r2.get(r12);	 Catch:{ all -> 0x00ca }
        r10 = (java.lang.String[]) r10;	 Catch:{ all -> 0x00ca }
        monitor-exit(r9);
        return r10;
    L_0x00ca:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
    L_0x00cd:
        monitor-exit(r9);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.a.a(java.util.Locale, java.lang.String, java.lang.String):java.lang.String[]");
    }

    /* renamed from: a */
    public String m70369a(Locale locale, String str, String str2, boolean z) {
        locale = m70368c(locale, str, str2, z);
        if (locale == null) {
            return null;
        }
        return locale[null];
    }

    /* renamed from: b */
    public String m70370b(Locale locale, String str, String str2, boolean z) {
        locale = m70368c(locale, str, str2, z);
        if (locale == null) {
            return null;
        }
        return locale[1];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private synchronized java.lang.String[] m70368c(java.util.Locale r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = 0;
        if (r10 == 0) goto L_0x00b2;
    L_0x0004:
        if (r11 == 0) goto L_0x00b2;
    L_0x0006:
        if (r12 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x00b2;
    L_0x000a:
        r12 = "Etc/";
        r12 = r11.startsWith(r12);	 Catch:{ all -> 0x00af }
        r1 = 4;
        if (r12 == 0) goto L_0x0017;
    L_0x0013:
        r11 = r11.substring(r1);	 Catch:{ all -> 0x00af }
    L_0x0017:
        r12 = r9.f60898b;	 Catch:{ all -> 0x00af }
        r12 = r12.get(r10);	 Catch:{ all -> 0x00af }
        r12 = (java.util.Map) r12;	 Catch:{ all -> 0x00af }
        if (r12 != 0) goto L_0x002b;
    L_0x0021:
        r12 = r9.f60898b;	 Catch:{ all -> 0x00af }
        r2 = r9.m70366a();	 Catch:{ all -> 0x00af }
        r12.put(r10, r2);	 Catch:{ all -> 0x00af }
        r12 = r2;
    L_0x002b:
        r2 = r12.get(r11);	 Catch:{ all -> 0x00af }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x00af }
        if (r2 != 0) goto L_0x00a3;
    L_0x0033:
        r2 = r9.m70366a();	 Catch:{ all -> 0x00af }
        r12.put(r11, r2);	 Catch:{ all -> 0x00af }
        r12 = java.util.Locale.ENGLISH;	 Catch:{ all -> 0x00af }
        r12 = org.joda.time.DateTimeUtils.m68905a(r12);	 Catch:{ all -> 0x00af }
        r12 = r12.getZoneStrings();	 Catch:{ all -> 0x00af }
        r3 = r12.length;	 Catch:{ all -> 0x00af }
        r4 = 0;
        r5 = 0;
    L_0x0047:
        r6 = 5;
        if (r5 >= r3) goto L_0x005d;
    L_0x004a:
        r7 = r12[r5];	 Catch:{ all -> 0x00af }
        if (r7 == 0) goto L_0x005a;
    L_0x004e:
        r8 = r7.length;	 Catch:{ all -> 0x00af }
        if (r8 < r6) goto L_0x005a;
    L_0x0051:
        r8 = r7[r4];	 Catch:{ all -> 0x00af }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00af }
        if (r8 == 0) goto L_0x005a;
    L_0x0059:
        goto L_0x005e;
    L_0x005a:
        r5 = r5 + 1;
        goto L_0x0047;
    L_0x005d:
        r7 = r0;
    L_0x005e:
        r10 = org.joda.time.DateTimeUtils.m68905a(r10);	 Catch:{ all -> 0x00af }
        r10 = r10.getZoneStrings();	 Catch:{ all -> 0x00af }
        r12 = r10.length;	 Catch:{ all -> 0x00af }
        r3 = 0;
    L_0x0068:
        if (r3 >= r12) goto L_0x007e;
    L_0x006a:
        r5 = r10[r3];	 Catch:{ all -> 0x00af }
        if (r5 == 0) goto L_0x007b;
    L_0x006e:
        r8 = r5.length;	 Catch:{ all -> 0x00af }
        if (r8 < r6) goto L_0x007b;
    L_0x0071:
        r8 = r5[r4];	 Catch:{ all -> 0x00af }
        r8 = r11.equals(r8);	 Catch:{ all -> 0x00af }
        if (r8 == 0) goto L_0x007b;
    L_0x0079:
        r0 = r5;
        goto L_0x007e;
    L_0x007b:
        r3 = r3 + 1;
        goto L_0x0068;
    L_0x007e:
        if (r7 == 0) goto L_0x00a3;
    L_0x0080:
        if (r0 == 0) goto L_0x00a3;
    L_0x0082:
        r10 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x00af }
        r11 = 2;
        r12 = new java.lang.String[r11];	 Catch:{ all -> 0x00af }
        r3 = r0[r11];	 Catch:{ all -> 0x00af }
        r12[r4] = r3;	 Catch:{ all -> 0x00af }
        r3 = 1;
        r5 = r0[r3];	 Catch:{ all -> 0x00af }
        r12[r3] = r5;	 Catch:{ all -> 0x00af }
        r2.put(r10, r12);	 Catch:{ all -> 0x00af }
        r10 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x00af }
        r11 = new java.lang.String[r11];	 Catch:{ all -> 0x00af }
        r12 = r0[r1];	 Catch:{ all -> 0x00af }
        r11[r4] = r12;	 Catch:{ all -> 0x00af }
        r12 = 3;
        r12 = r0[r12];	 Catch:{ all -> 0x00af }
        r11[r3] = r12;	 Catch:{ all -> 0x00af }
        r2.put(r10, r11);	 Catch:{ all -> 0x00af }
    L_0x00a3:
        r10 = java.lang.Boolean.valueOf(r13);	 Catch:{ all -> 0x00af }
        r10 = r2.get(r10);	 Catch:{ all -> 0x00af }
        r10 = (java.lang.String[]) r10;	 Catch:{ all -> 0x00af }
        monitor-exit(r9);
        return r10;
    L_0x00af:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
    L_0x00b2:
        monitor-exit(r9);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.a.c(java.util.Locale, java.lang.String, java.lang.String, boolean):java.lang.String[]");
    }

    /* renamed from: a */
    private HashMap m70366a() {
        return new HashMap(7);
    }
}
