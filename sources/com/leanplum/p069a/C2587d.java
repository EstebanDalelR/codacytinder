package com.leanplum.p069a;

import android.content.SharedPreferences.Editor;
import com.leanplum.ActionContext.ContextualValues;
import com.leanplum.Leanplum;
import com.leanplum.utils.SharedPreferencesUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.leanplum.a.d */
public final class C2587d {
    /* renamed from: d */
    private static C2587d f8043d = null;
    /* renamed from: e */
    private static String f8044e = "__Push Notification";
    /* renamed from: f */
    private static String f8045f = "__held_back";
    /* renamed from: g */
    private static final String f8046g = "__leanplum_messaging__";
    /* renamed from: h */
    private static boolean f8047h = false;
    /* renamed from: a */
    private Map<String, Map<String, Number>> f8048a = new HashMap();
    /* renamed from: b */
    private Map<String, Number> f8049b = new HashMap();
    /* renamed from: c */
    private Map<String, Number> f8050c = new HashMap();

    /* renamed from: a */
    public static synchronized C2587d m9690a() {
        C2587d c2587d;
        synchronized (C2587d.class) {
            if (f8043d == null) {
                f8043d = new C2587d();
            }
            c2587d = f8043d;
        }
        return c2587d;
    }

    /* renamed from: b */
    public static com.leanplum.LocationManager m9699b() {
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
        r0 = com.leanplum.p069a.bo.m9633i();
        r1 = 0;
        if (r0 == 0) goto L_0x0033;
    L_0x0007:
        r0 = 0;
        r2 = com.google.android.gms.location.C4486f.f16730a;	 Catch:{ Throwable -> 0x0023 }
        if (r2 == 0) goto L_0x0033;	 Catch:{ Throwable -> 0x0023 }
    L_0x000c:
        r2 = "com.leanplum.LocationManagerImplementation";	 Catch:{ Throwable -> 0x0023 }
        r2 = java.lang.Class.forName(r2);	 Catch:{ Throwable -> 0x0023 }
        r3 = "instance";	 Catch:{ Throwable -> 0x0023 }
        r4 = new java.lang.Class[r0];	 Catch:{ Throwable -> 0x0023 }
        r2 = r2.getMethod(r3, r4);	 Catch:{ Throwable -> 0x0023 }
        r3 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x0023 }
        r2 = r2.invoke(r1, r3);	 Catch:{ Throwable -> 0x0023 }
        r2 = (com.leanplum.LocationManager) r2;	 Catch:{ Throwable -> 0x0023 }
        return r2;
    L_0x0023:
        r2 = f8047h;
        if (r2 != 0) goto L_0x0033;
    L_0x0027:
        r2 = 1;
        r3 = new java.lang.Object[r2];
        r4 = "Geofencing support requires Google Play Services v8.1 and higher.\nAdd this to your build.gradle file:\ncompile ('com.google.android.gms:play-services-location:8.3.0+')";
        r3[r0] = r4;
        com.leanplum.p069a.ao.m9517b(r3);
        f8047h = r2;
    L_0x0033:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.d.b():com.leanplum.LocationManager");
    }

    private C2587d() {
        Leanplum.onAction("__Push Notification", new d$1(this));
        Leanplum.onAction("__Cancel__Push Notification", new d$2(this));
    }

    /* renamed from: c */
    private void m9701c() {
        Leanplum.onAction("__Push Notification", new d$1(this));
        Leanplum.onAction("__Cancel__Push Notification", new d$2(this));
    }

    /* renamed from: d */
    private Map<String, Number> m9703d(String str) {
        Map<String, Number> map = (Map) this.f8048a.get(str);
        if (map != null) {
            return map;
        }
        map = ab.m9452a(Leanplum.getContext().getSharedPreferences(f8046g, 0).getString(String.format("__leanplum_message_occurrences_%s", new Object[]{str}), "{}"));
        this.f8048a.put(str, map);
        return map;
    }

    /* renamed from: a */
    private void m9692a(Map<String, Number> map, String str) {
        Editor edit = Leanplum.getContext().getSharedPreferences(f8046g, 0).edit();
        edit.putString(String.format("__leanplum_message_occurrences_%s", new Object[]{str}), ab.m9450a((Map) map));
        this.f8048a.put(str, map);
        SharedPreferencesUtil.commitChanges(edit);
    }

    /* renamed from: e */
    private int m9704e(String str) {
        Number number = (Number) this.f8049b.get(str);
        if (number != null) {
            return number.intValue();
        }
        int i = Leanplum.getContext().getSharedPreferences(f8046g, 0).getInt(String.format("__leanplum_message_trigger_occurrences_%s", new Object[]{str}), 0);
        this.f8049b.put(str, Integer.valueOf(i));
        return i;
    }

    /* renamed from: a */
    private void m9691a(int i, String str) {
        Editor edit = Leanplum.getContext().getSharedPreferences(f8046g, 0).edit();
        edit.putInt(String.format("__leanplum_message_trigger_occurrences_%s", new Object[]{str}), i);
        this.f8049b.put(str, Integer.valueOf(i));
        SharedPreferencesUtil.commitChanges(edit);
    }

    /* renamed from: a */
    public final C2588e m9705a(String str, Map<String, Object> map, String str2, String str3, ContextualValues contextualValues) {
        C2587d c2587d = this;
        Object obj = str;
        Map<String, Object> map2 = map;
        String str4 = str2;
        String str5 = str3;
        ContextualValues contextualValues2 = contextualValues;
        C2588e c2588e = new C2588e();
        int i = 0;
        if (Leanplum.getContext().getSharedPreferences(f8046g, 0).getBoolean(String.format("__leanplum_message_muted_%s", new Object[]{obj}), false)) {
            return c2588e;
        }
        c2588e.f8051a = m9696a(map2.get("whenTriggers"), str4, str5, contextualValues2);
        c2588e.f8052b = m9696a(map2.get("unlessTriggers"), str4, str5, contextualValues2);
        if (!c2588e.f8051a && !c2588e.f8052b) {
            return c2588e;
        }
        boolean z;
        Object obj2 = map2.get("whenLimits");
        Map map3 = null;
        if (obj2 instanceof Map) {
            map3 = (Map) obj2;
        }
        if (map3 != null) {
            List<Map> list = (List) map3.get("children");
            if (!list.isEmpty()) {
                map3 = m9703d(str);
                int e = m9704e(str) + 1;
                for (Map map4 : list) {
                    String obj3 = map4.get("subject").toString();
                    String obj4 = map4.get("noun").toString();
                    String obj5 = map4.get("verb").toString();
                    String str6;
                    if (obj3.equals("times")) {
                        Object obj6;
                        List list2 = (List) map4.get("objects");
                        int parseInt = list2.size() > 0 ? Integer.parseInt(list2.get(i).toString()) : 0;
                        int parseInt2 = Integer.parseInt(obj4);
                        Number valueOf = Long.valueOf(0);
                        if (obj5.equals("limitSession")) {
                            valueOf = (Number) c2587d.f8050c.get(obj);
                            if (valueOf == null) {
                                valueOf = Long.valueOf(0);
                            }
                        } else {
                            if (map3 != null) {
                                if (!map3.isEmpty()) {
                                    Number number = (Number) map3.get("min");
                                    Number number2 = (Number) map3.get("max");
                                    if (number == null) {
                                        number = Long.valueOf(0);
                                    }
                                    if (number2 == null) {
                                        number2 = Long.valueOf(0);
                                    }
                                    if (obj5.equals("limitUser")) {
                                        valueOf = Long.valueOf((number2.longValue() - number.longValue()) + 1);
                                    } else {
                                        if (obj5.equals("limitMinute")) {
                                            parseInt *= 60;
                                        } else if (obj5.equals("limitHour")) {
                                            parseInt *= 3600;
                                        } else if (obj5.equals("limitDay")) {
                                            parseInt *= 86400;
                                        } else if (obj5.equals("limitWeek")) {
                                            parseInt *= 604800;
                                        } else if (obj5.equals("limitMonth")) {
                                            parseInt *= 2592000;
                                        }
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long longValue = number2.longValue();
                                        int i2 = 0;
                                        while (longValue >= number.longValue()) {
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append(longValue);
                                            if (map3.containsKey(stringBuilder.toString())) {
                                                stringBuilder = new StringBuilder();
                                                stringBuilder.append(longValue);
                                                if ((currentTimeMillis - ((Number) map3.get(stringBuilder.toString())).longValue()) / 1000 > ((long) parseInt)) {
                                                    break;
                                                }
                                                i2++;
                                                if (i2 >= parseInt2) {
                                                    break;
                                                }
                                            }
                                            longValue--;
                                            c2587d = this;
                                            str6 = str;
                                        }
                                    }
                                }
                            }
                            obj6 = 1;
                            if (obj6 == null) {
                                c2587d = this;
                                str6 = str;
                                i = 0;
                            }
                        }
                        if (valueOf.longValue() < ((long) parseInt2)) {
                            obj6 = 1;
                            if (obj6 == null) {
                                c2587d = this;
                                str6 = str;
                                i = 0;
                            }
                        }
                        obj6 = null;
                        if (obj6 == null) {
                            c2587d = this;
                            str6 = str;
                            i = 0;
                        }
                    } else if (!obj3.equals("onNthOccurrence")) {
                        if (obj3.equals("everyNthOccurrence")) {
                            int parseInt3 = Integer.parseInt(obj4);
                            if (parseInt3 != 0) {
                                if (e % parseInt3 != 0) {
                                }
                            }
                        } else {
                            continue;
                        }
                        c2587d = this;
                        str6 = str;
                        i = 0;
                    } else if (e == Integer.parseInt(obj4)) {
                        c2587d = this;
                        str6 = str;
                        i = 0;
                    }
                    z = false;
                }
            }
        }
        z = true;
        c2588e.f8053c = z;
        return c2588e;
    }

    /* renamed from: a */
    private boolean m9697a(String str, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        boolean z = true;
        if (map2 == null) {
            return true;
        }
        List<Map> list = (List) map2.get("children");
        if (list.isEmpty()) {
            return true;
        }
        C2587d c2587d;
        Map d = m9703d(str);
        int e = m9704e(str) + 1;
        for (Map map3 : list) {
            Map map4;
            String obj = map3.get("subject").toString();
            String obj2 = map3.get("noun").toString();
            String obj3 = map3.get("verb").toString();
            String str2;
            if (obj.equals("times")) {
                Object obj4;
                List list2 = (List) map3.get("objects");
                int parseInt = list2.size() > 0 ? Integer.parseInt(list2.get(0).toString()) : 0;
                int parseInt2 = Integer.parseInt(obj2);
                Number valueOf = Long.valueOf(0);
                if (obj3.equals("limitSession")) {
                    valueOf = (Number) this.f8050c.get(str);
                    if (valueOf == null) {
                        valueOf = Long.valueOf(0);
                    }
                } else {
                    c2587d = this;
                    str2 = str;
                    if (d != null) {
                        if (!d.isEmpty()) {
                            Number number = (Number) d.get("min");
                            Number number2 = (Number) d.get("max");
                            if (number == null) {
                                number = Long.valueOf(0);
                            }
                            if (number2 == null) {
                                number2 = Long.valueOf(0);
                            }
                            if (obj3.equals("limitUser")) {
                                valueOf = Long.valueOf((number2.longValue() - number.longValue()) + 1);
                            } else {
                                if (obj3.equals("limitMinute")) {
                                    parseInt *= 60;
                                } else if (obj3.equals("limitHour")) {
                                    parseInt *= 3600;
                                } else if (obj3.equals("limitDay")) {
                                    parseInt *= 86400;
                                } else if (obj3.equals("limitWeek")) {
                                    parseInt *= 604800;
                                } else if (obj3.equals("limitMonth")) {
                                    parseInt *= 2592000;
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                long longValue = number2.longValue();
                                int i = 0;
                                while (longValue >= number.longValue()) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(longValue);
                                    if (d.containsKey(stringBuilder.toString())) {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(longValue);
                                        map4 = d;
                                        if ((currentTimeMillis - ((Number) d.get(stringBuilder.toString())).longValue()) / 1000 > ((long) parseInt)) {
                                            break;
                                        }
                                        i++;
                                        if (i >= parseInt2) {
                                            break;
                                        }
                                    } else {
                                        map4 = d;
                                    }
                                    longValue--;
                                    d = map4;
                                }
                            }
                        }
                    }
                    map4 = d;
                    obj4 = 1;
                    if (obj4 != null) {
                        return false;
                    }
                }
                map4 = d;
                if (valueOf.longValue() < ((long) parseInt2)) {
                    obj4 = 1;
                    if (obj4 != null) {
                        return false;
                    }
                }
                obj4 = null;
                if (obj4 != null) {
                    return false;
                }
            } else {
                c2587d = this;
                str2 = str;
                map4 = d;
                if (obj.equals("onNthOccurrence")) {
                    if (e != Integer.parseInt(obj2)) {
                        return false;
                    }
                } else if (obj.equals("everyNthOccurrence")) {
                    int parseInt3 = Integer.parseInt(obj2);
                    if (parseInt3 == 0 || e % parseInt3 != 0) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
            d = map4;
            z = true;
        }
        c2587d = this;
        return z;
    }

    /* renamed from: a */
    private boolean m9695a(int i, int i2, String str, Map<String, Number> map, String str2) {
        int i3 = i;
        int i4 = i2;
        String str3 = str;
        Map<String, Number> map2 = map;
        Number valueOf = Long.valueOf(0);
        if (str3.equals("limitSession")) {
            valueOf = (Number) this.f8050c.get(str2);
            if (valueOf == null) {
                valueOf = Long.valueOf(0);
            }
        } else {
            C2587d c2587d = this;
            if (map2 != null) {
                if (!map.isEmpty()) {
                    Number number = (Number) map2.get("min");
                    Number number2 = (Number) map2.get("max");
                    if (number == null) {
                        number = Long.valueOf(0);
                    }
                    if (number2 == null) {
                        number2 = Long.valueOf(0);
                    }
                    if (str3.equals("limitUser")) {
                        valueOf = Long.valueOf((number2.longValue() - number.longValue()) + 1);
                    } else {
                        if (str3.equals("limitMinute")) {
                            i4 *= 60;
                        } else if (str3.equals("limitHour")) {
                            i4 *= 3600;
                        } else if (str3.equals("limitDay")) {
                            i4 *= 86400;
                        } else if (str3.equals("limitWeek")) {
                            i4 *= 604800;
                        } else if (str3.equals("limitMonth")) {
                            i4 *= 2592000;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        int i5 = 0;
                        for (long longValue = number2.longValue(); longValue >= number.longValue(); longValue--) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(longValue);
                            if (map2.containsKey(stringBuilder.toString())) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(longValue);
                                if ((currentTimeMillis - ((Number) map2.get(stringBuilder.toString())).longValue()) / 1000 > ((long) i4)) {
                                    break;
                                }
                                i5++;
                                if (i5 >= i3) {
                                    return false;
                                }
                            }
                            long j = 1;
                        }
                    }
                }
            }
            return true;
        }
        return valueOf.longValue() < ((long) i3);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m9696a(java.lang.Object r7, java.lang.String r8, java.lang.String r9, com.leanplum.ActionContext.ContextualValues r10) {
        /*
        r6 = this;
        r0 = r7 instanceof java.util.Map;
        r1 = 0;
        if (r0 == 0) goto L_0x0118;
    L_0x0005:
        r7 = (java.util.Map) r7;
        r0 = "children";
        r7 = r7.get(r0);
        r7 = (java.util.List) r7;
        r7 = r7.iterator();
    L_0x0013:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x0118;
    L_0x0019:
        r0 = r7.next();
        r0 = (java.util.Map) r0;
        r2 = "subject";
        r2 = r0.get(r2);
        r2 = (java.lang.String) r2;
        r2 = r2.equals(r8);
        r3 = 1;
        if (r2 == 0) goto L_0x0114;
    L_0x002e:
        r2 = "noun";
        r2 = r0.get(r2);
        r2 = (java.lang.String) r2;
        if (r2 != 0) goto L_0x003a;
    L_0x0038:
        if (r9 == 0) goto L_0x0042;
    L_0x003a:
        if (r2 == 0) goto L_0x0114;
    L_0x003c:
        r2 = r2.equals(r9);
        if (r2 == 0) goto L_0x0114;
    L_0x0042:
        r2 = "verb";
        r2 = r0.get(r2);
        r2 = (java.lang.String) r2;
        r4 = "objects";
        r0 = r0.get(r4);
        r0 = (java.util.List) r0;
        r4 = "changesTo";
        r4 = r4.equals(r2);
        if (r4 == 0) goto L_0x0086;
    L_0x005a:
        if (r10 == 0) goto L_0x0114;
    L_0x005c:
        if (r0 == 0) goto L_0x0114;
    L_0x005e:
        r0 = r0.iterator();
    L_0x0062:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0114;
    L_0x0068:
        r2 = r0.next();
        if (r2 != 0) goto L_0x0072;
    L_0x006e:
        r4 = r10.attributeValue;
        if (r4 == 0) goto L_0x0112;
    L_0x0072:
        if (r2 == 0) goto L_0x0062;
    L_0x0074:
        r2 = r2.toString();
        r4 = r10.attributeValue;
        r4 = r4.toString();
        r2 = r2.equalsIgnoreCase(r4);
        if (r2 == 0) goto L_0x0062;
    L_0x0084:
        goto L_0x0112;
    L_0x0086:
        r4 = "changesFromTo";
        r4 = r4.equals(r2);
        r5 = 2;
        if (r4 == 0) goto L_0x00d4;
    L_0x008f:
        if (r10 == 0) goto L_0x0114;
    L_0x0091:
        r2 = r0.size();
        if (r2 != r5) goto L_0x0114;
    L_0x0097:
        r2 = r0.get(r1);
        if (r2 == 0) goto L_0x0114;
    L_0x009d:
        r2 = r0.get(r3);
        if (r2 == 0) goto L_0x0114;
    L_0x00a3:
        r2 = r10.previousAttributeValue;
        if (r2 == 0) goto L_0x0114;
    L_0x00a7:
        r2 = r10.attributeValue;
        if (r2 == 0) goto L_0x0114;
    L_0x00ab:
        r2 = r0.get(r1);
        r2 = r2.toString();
        r4 = r10.previousAttributeValue;
        r4 = r4.toString();
        r2 = r2.equalsIgnoreCase(r4);
        if (r2 == 0) goto L_0x0114;
    L_0x00bf:
        r0 = r0.get(r3);
        r0 = r0.toString();
        r2 = r10.attributeValue;
        r2 = r2.toString();
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0114;
    L_0x00d3:
        goto L_0x0084;
    L_0x00d4:
        r4 = "triggersWithParameter";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x0112;
    L_0x00dc:
        if (r10 == 0) goto L_0x0114;
    L_0x00de:
        r2 = r0.size();
        if (r2 != r5) goto L_0x0114;
    L_0x00e4:
        r2 = r0.get(r1);
        if (r2 == 0) goto L_0x0114;
    L_0x00ea:
        r2 = r0.get(r3);
        if (r2 == 0) goto L_0x0114;
    L_0x00f0:
        r2 = r10.parameters;
        if (r2 == 0) goto L_0x0114;
    L_0x00f4:
        r2 = r10.parameters;
        r4 = r0.get(r1);
        r2 = r2.get(r4);
        if (r2 == 0) goto L_0x0114;
    L_0x0100:
        r2 = r2.toString();
        r0 = r0.get(r3);
        r0 = r0.toString();
        r0 = r2.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0114;
    L_0x0112:
        r0 = 1;
        goto L_0x0115;
    L_0x0114:
        r0 = 0;
    L_0x0115:
        if (r0 == 0) goto L_0x0013;
    L_0x0117:
        return r3;
    L_0x0118:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.d.a(java.lang.Object, java.lang.String, java.lang.String, com.leanplum.ActionContext$ContextualValues):boolean");
    }

    /* renamed from: a */
    private static boolean m9698a(Map<String, Object> map, String str, String str2, ContextualValues contextualValues) {
        if (((String) map.get("subject")).equals(str) != null) {
            str = (String) map.get("noun");
            if ((str == null && str2 == null) || !(str == null || str.equals(str2) == null)) {
                str = (String) map.get("verb");
                List list = (List) map.get("objects");
                if ("changesTo".equals(str) != null) {
                    if (!(contextualValues == null || list == null)) {
                        for (String str3 : list) {
                            if ((str3 == null && contextualValues.attributeValue == null) || (str3 != null && str3.toString().equalsIgnoreCase(contextualValues.attributeValue.toString()) != null)) {
                                return true;
                            }
                        }
                    }
                    return false;
                } else if ("changesFromTo".equals(str3) != null) {
                    if (contextualValues == null || list.size() != 2 || list.get(0) == null || list.get(1) == null || contextualValues.previousAttributeValue == null || contextualValues.attributeValue == null || list.get(0).toString().equalsIgnoreCase(contextualValues.previousAttributeValue.toString()) == null || list.get(1).toString().equalsIgnoreCase(contextualValues.attributeValue.toString()) == null) {
                        return false;
                    }
                    return true;
                } else if ("triggersWithParameter".equals(str3) == null) {
                    return true;
                } else {
                    if (contextualValues == null || list.size() != 2 || list.get(0) == null || list.get(1) == null || contextualValues.parameters == null) {
                        return false;
                    }
                    str3 = contextualValues.parameters.get(list.get(0));
                    if (str3 == null || str3.toString().equalsIgnoreCase(list.get(1).toString()) == null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m9706a(String str) {
        int e = m9704e(str) + 1;
        Editor edit = Leanplum.getContext().getSharedPreferences(f8046g, 0).edit();
        edit.putInt(String.format("__leanplum_message_trigger_occurrences_%s", new Object[]{str}), e);
        this.f8049b.put(str, Integer.valueOf(e));
        SharedPreferencesUtil.commitChanges(edit);
    }

    /* renamed from: a */
    public final void m9707a(String str, String str2) {
        m9700b(str, str2);
    }

    /* renamed from: b */
    public final void m9708b(String str) {
        m9700b(str, null);
    }

    /* renamed from: b */
    private void m9700b(String str, String str2) {
        Editor edit;
        Map hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("messageId", str2);
            ag.m9479a("Held Back", 0.0d, null, null, hashMap);
        } else {
            hashMap.put("messageId", str);
            ag.m9479a(null, 0.0d, null, null, hashMap);
        }
        str2 = (Number) this.f8050c.get(str);
        if (str2 == null) {
            str2 = Long.valueOf(0);
        }
        this.f8050c.put(str, Long.valueOf(str2.longValue() + 1));
        Map d = m9703d(str);
        if (d != null) {
            if (!d.isEmpty()) {
                Number number = (Number) d.get("min");
                Number number2 = (Number) d.get("max");
                if (number == null) {
                    number = Long.valueOf(0);
                }
                if (number2 == null) {
                    number2 = Long.valueOf(0);
                }
                Number valueOf = Long.valueOf(number2.longValue() + 1);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(valueOf);
                d.put(stringBuilder.toString(), Long.valueOf(System.currentTimeMillis()));
                if ((valueOf.longValue() - number.longValue()) + 1 > 100) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(number);
                    d.remove(stringBuilder.toString());
                    d.put("min", Long.valueOf(number.longValue() + 1));
                }
                d.put("max", valueOf);
                edit = Leanplum.getContext().getSharedPreferences(f8046g, 0).edit();
                edit.putString(String.format("__leanplum_message_occurrences_%s", new Object[]{str}), ab.m9450a(d));
                this.f8048a.put(str, d);
                SharedPreferencesUtil.commitChanges(edit);
            }
        }
        d = new HashMap();
        d.put("min", Long.valueOf(0));
        d.put("max", Long.valueOf(0));
        d.put("0", Long.valueOf(System.currentTimeMillis()));
        edit = Leanplum.getContext().getSharedPreferences(f8046g, 0).edit();
        edit.putString(String.format("__leanplum_message_occurrences_%s", new Object[]{str}), ab.m9450a(d));
        this.f8048a.put(str, d);
        SharedPreferencesUtil.commitChanges(edit);
    }

    /* renamed from: c */
    public static void m9702c(String str) {
        if (str != null) {
            Editor edit = Leanplum.getContext().getSharedPreferences(f8046g, 0).edit();
            edit.putBoolean(String.format("__leanplum_message_muted_%s", new Object[]{str}), true);
            SharedPreferencesUtil.commitChanges(edit);
        }
    }

    /* renamed from: a */
    public static void m9694a(Set<String> set, Set<String> set2) {
        Map p = bq.m9672p();
        for (String str : p.keySet()) {
            Map map = (Map) p.get(str);
            Object obj = map.get("action");
            if (obj instanceof String) {
                Set set3 = obj.equals("__Push Notification") ? set2 : set;
                Map map2 = (Map) map.get("whenTriggers");
                map = (Map) map.get("unlessTriggers");
                C2587d.m9693a(map2, set3);
                C2587d.m9693a(map, set3);
            }
        }
    }

    /* renamed from: a */
    private static void m9693a(Map<String, Object> map, Set<String> set) {
        if (map != null) {
            for (Map map2 : (List) map.get("children")) {
                String str = (String) map2.get("subject");
                if (str.equals("enterRegion") || str.equals("exitRegion")) {
                    set.add((String) map2.get("noun"));
                }
            }
        }
    }
}
