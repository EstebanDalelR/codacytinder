package com.leanplum.p069a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.leanplum.ActionContext;
import com.leanplum.CacheUpdateBlock;
import com.leanplum.Leanplum;
import com.leanplum.LocationManager;
import com.leanplum.Var;
import com.leanplum.utils.SharedPreferencesUtil;
import com.tinder.api.ManagerWebServices;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.bq */
public final class bq {
    /* renamed from: A */
    private static final Pattern f8012A = Pattern.compile(f8038z);
    /* renamed from: a */
    public static final Map<String, Object> f8013a = new HashMap();
    /* renamed from: b */
    private static final Map<String, Var<?>> f8014b = new ConcurrentHashMap();
    /* renamed from: c */
    private static final Map<String, Object> f8015c = new HashMap();
    /* renamed from: d */
    private static final Map<String, InputStream> f8016d = new HashMap();
    /* renamed from: e */
    private static final Map<String, String> f8017e = new HashMap();
    /* renamed from: f */
    private static final Map<String, Object> f8018f = new HashMap();
    /* renamed from: g */
    private static final String f8019g = "__leanplum__";
    /* renamed from: h */
    private static Map<String, Object> f8020h = new HashMap();
    /* renamed from: i */
    private static Map<String, Object> f8021i = new HashMap();
    /* renamed from: j */
    private static Map<String, Object> f8022j = new HashMap();
    /* renamed from: k */
    private static List<Map<String, Object>> f8023k = null;
    /* renamed from: l */
    private static List<Map<String, Object>> f8024l = null;
    /* renamed from: m */
    private static Map<String, Object> f8025m = null;
    /* renamed from: n */
    private static Map<String, Object> f8026n = null;
    /* renamed from: o */
    private static Map<String, Object> f8027o = null;
    /* renamed from: p */
    private static List<Map<String, Object>> f8028p = new ArrayList();
    /* renamed from: q */
    private static CacheUpdateBlock f8029q = null;
    /* renamed from: r */
    private static CacheUpdateBlock f8030r = null;
    /* renamed from: s */
    private static CacheUpdateBlock f8031s = null;
    /* renamed from: t */
    private static boolean f8032t = false;
    /* renamed from: u */
    private static Map<String, Object> f8033u = new HashMap();
    /* renamed from: v */
    private static Object f8034v = null;
    /* renamed from: w */
    private static boolean f8035w = false;
    /* renamed from: x */
    private static int f8036x = 0;
    /* renamed from: y */
    private static Map<String, Object> f8037y = null;
    /* renamed from: z */
    private static final String f8038z = "(?:[^\\.\\[.(\\\\]+|\\\\.)+";

    /* renamed from: a */
    public static String[] m9653a(String str) {
        Matcher matcher = f8012A.matcher(str);
        List arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(str.substring(matcher.start(), matcher.end()));
        }
        return (String[]) arrayList.toArray(new String[null]);
    }

    /* renamed from: a */
    private static Object m9637a(Object obj, Object obj2, boolean z) {
        if (obj == null) {
            return null;
        }
        Object obj3;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            obj3 = map.get(obj2);
            if (z && obj3 == null && (obj2 instanceof String)) {
                obj3 = new HashMap();
                map.put(obj2, obj3);
            }
            return obj3;
        } else if (!(obj instanceof List)) {
            return null;
        } else {
            List list = (List) obj;
            Integer num = (Integer) obj2;
            obj3 = list.get(num.intValue());
            if (z && obj3 == null) {
                obj3 = new HashMap();
                list.set(num.intValue(), obj3);
            }
            return obj3;
        }
    }

    /* renamed from: a */
    public static boolean m9650a(String str, String str2, InputStream inputStream, boolean z, String str3, int i) {
        if (!C2590h.f8067l) {
            return false;
        }
        if (!C2590h.m9712a()) {
            if (inputStream == null) {
                return false;
            }
            Map hashMap = new HashMap();
            Map hashMap2 = new HashMap();
            if (z) {
                hashMap2.put("hash", str3);
                hashMap2.put(ManagerWebServices.PARAM_SIZE, Integer.valueOf(i));
            } else if (C2590h.f8066k && bo.m9628e()) {
                str2 = C2594s.m9718a(inputStream);
                if (str2 != null) {
                    hashMap2.put("hash", str2.f8086a);
                    hashMap2.put(ManagerWebServices.PARAM_SIZE, Integer.valueOf(str2.f8087b));
                }
            } else {
                hashMap2.put(ManagerWebServices.PARAM_SIZE, Integer.valueOf(C2594s.m9716a(C2594s.m9721a(str, str2, (Boolean) false))));
            }
            hashMap.put("", hashMap2);
            f8015c.put(str, hashMap);
            f8016d.put(str, inputStream);
            bq.m9668l();
        }
        return true;
    }

    /* renamed from: a */
    private static void m9645a(String str, String[] strArr, Object obj, String str2, Map<String, Object> map, Map<String, String> map2) {
        if (strArr != null && strArr.length > 0) {
            Object a;
            for (int i = 0; i < strArr.length - 1; i++) {
                a = bq.m9637a(a, strArr[i], true);
            }
            if (a instanceof Map) {
                ((Map) a).put(strArr[strArr.length - 1], obj);
            }
        }
        if (map2 != null) {
            map2.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m9643a(Var<?> var) {
        f8014b.put(var.name(), var);
        synchronized (f8013a) {
            bq.m9645a(var.name(), var.nameComponents(), var.defaultValue(), var.kind(), f8013a, f8017e);
        }
    }

    /* renamed from: b */
    public static <T> Var<T> m9654b(String str) {
        return (Var) f8014b.get(str);
    }

    /* renamed from: s */
    private static void m9675s() {
        synchronized (f8013a) {
            f8034v = bq.m9636a(f8013a, f8020h);
        }
    }

    /* renamed from: a */
    public static Object m9636a(Object obj, Object obj2) {
        if (obj2 == null) {
            return obj;
        }
        if (!((obj2 instanceof Number) || (obj2 instanceof Boolean) || (obj2 instanceof String) || (obj2 instanceof Character) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String))) {
            if (!(obj instanceof Character)) {
                Object obj3;
                boolean z = obj2 instanceof Map;
                Iterable<String> keySet = z ? ((Map) obj2).keySet() : (Iterable) obj2;
                boolean z2 = obj instanceof Map;
                Iterable<Object> keySet2 = z2 ? ((Map) obj).keySet() : (Iterable) obj;
                Map map = z ? (Map) obj2 : null;
                Map map2 = z2 ? (Map) obj : null;
                int i = 0;
                if (obj == null && z && ((Map) obj2).size() > null) {
                    for (Object next : keySet) {
                        if (!(next instanceof String)) {
                            break;
                        }
                        String str = (String) next;
                        if (str.length() >= 3 && str.charAt(0) == '[') {
                            if (str.charAt(str.length() - 1) == ']') {
                                str = str.substring(1, str.length() - 1);
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(Integer.getInteger(str));
                                if (!stringBuilder.toString().equals(str)) {
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    i = 1;
                }
                if ((obj instanceof List) == null) {
                    if (i == 0) {
                        if (!z2) {
                            if (!z) {
                                return null;
                            }
                        }
                        obj = new HashMap();
                        if (keySet2 != null) {
                            for (Object obj32 : keySet2) {
                                if (!(map == null || map2 == null)) {
                                    Object obj4 = map.get(obj32);
                                    Object obj5 = map2.get(obj32);
                                    if (obj4 == null && obj5 != null) {
                                        obj.put(obj32, obj5);
                                    }
                                }
                            }
                        }
                        for (Object obj322 : keySet) {
                            obj.put(obj322, bq.m9636a(map2 != null ? map2.get(obj322) : null, map != null ? map.get(obj322) : null));
                        }
                        return obj;
                    }
                }
                obj = new ArrayList();
                for (Object obj3222 : keySet2) {
                    obj.add(obj3222);
                }
                for (String str2 : keySet) {
                    int parseInt = Integer.parseInt(str2.substring(1, str2.length() - 1));
                    obj3222 = map != null ? map.get(str2) : null;
                    while (parseInt >= obj.size()) {
                        obj.add(null);
                    }
                    obj.set(parseInt, bq.m9636a(obj.get(parseInt), obj3222));
                }
                return obj;
            }
        }
        return obj2;
    }

    /* renamed from: a */
    public static <T> T m9639a(Object[] objArr, Object obj) {
        Object obj2 = obj;
        for (Object a : objArr) {
            obj2 = bq.m9637a(obj2, a, false);
        }
        return obj2;
    }

    /* renamed from: a */
    public static <T> T m9638a(Object[] objArr) {
        return bq.m9639a(objArr, f8034v != null ? f8034v : f8013a);
    }

    /* renamed from: a */
    public static Map<String, Object> m9641a() {
        return f8020h;
    }

    /* renamed from: b */
    public static Map<String, Object> m9655b() {
        return f8022j;
    }

    /* renamed from: c */
    public static List<Map<String, Object>> m9658c() {
        return f8023k;
    }

    /* renamed from: d */
    public static List<Map<String, Object>> m9660d() {
        return f8024l;
    }

    /* renamed from: e */
    public static Map<String, Object> m9661e() {
        return f8021i;
    }

    /* renamed from: f */
    public static boolean m9662f() {
        return f8032t;
    }

    /* renamed from: g */
    public static void m9663g() {
        if (!C2590h.m9712a()) {
            SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences(f8019g, 0);
            if (aw.m9530a() == null) {
                bq.m9647a(new HashMap(), new HashMap(), new ArrayList(), new ArrayList(), new HashMap(), new ArrayList());
                return;
            }
            try {
                C2573a c2573a = new C2573a(aw.m9560e(), aw.m9530a());
                bq.m9647a(ab.m9452a(c2573a.m9448a(sharedPreferences, "__leanplum_variables", "{}")), ab.m9452a(c2573a.m9448a(sharedPreferences, "__leanplum_messages", "{}")), ab.m9451a(new JSONArray(c2573a.m9448a(sharedPreferences, "__leanplum_update_rules", "[]"))), ab.m9451a(new JSONArray(c2573a.m9448a(sharedPreferences, "__leanplum_event_rules", "[]"))), ab.m9452a(c2573a.m9448a(sharedPreferences, "regions", "{}")), ab.m9451a(new JSONArray(c2573a.m9448a(sharedPreferences, "variants", "[]"))));
                String a = c2573a.m9448a(sharedPreferences, "deviceId", null);
                if (a != null) {
                    if (bo.m9623c(a)) {
                        aw.m9539a(a);
                    } else {
                        Object[] objArr = new Object[1];
                        StringBuilder stringBuilder = new StringBuilder("Invalid stored device id found: \"");
                        stringBuilder.append(a);
                        stringBuilder.append("\"; discarding.");
                        objArr[0] = stringBuilder.toString();
                        ao.m9517b(objArr);
                    }
                }
                a = c2573a.m9448a(sharedPreferences, ManagerWebServices.PARAM_USER_ID, null);
                if (a != null) {
                    if (bo.m9619b(a)) {
                        aw.m9548b(a);
                    } else {
                        Object[] objArr2 = new Object[1];
                        StringBuilder stringBuilder2 = new StringBuilder("Invalid stored user id found: \"");
                        stringBuilder2.append(a);
                        stringBuilder2.append("\"; discarding.");
                        objArr2[0] = stringBuilder2.toString();
                        ao.m9517b(objArr2);
                    }
                }
                if (Boolean.parseBoolean(c2573a.m9448a(sharedPreferences, "loggingEnabled", "false"))) {
                    C2590h.f8068m = true;
                }
            } catch (Throwable e) {
                Object[] objArr3 = new Object[1];
                StringBuilder stringBuilder3 = new StringBuilder("Could not load variable diffs.\n");
                stringBuilder3.append(ao.m9513a(e));
                objArr3[0] = stringBuilder3.toString();
                ao.m9516a(objArr3);
            }
            bq.m9673q();
        }
    }

    /* renamed from: h */
    public static void m9664h() {
        if (!C2590h.m9712a() && aw.m9530a() != null) {
            Editor edit = Leanplum.getContext().getSharedPreferences(f8019g, 0).edit();
            C2573a c2573a = new C2573a(aw.m9560e(), aw.m9530a());
            edit.putString("__leanplum_variables", c2573a.m9449a(ab.m9450a(f8020h)));
            edit.putString("__leanplum_messages", c2573a.m9449a(ab.m9450a(f8033u)));
            try {
                edit.putString("__leanplum_update_rules", c2573a.m9449a(ab.m9454a(f8023k).toString()));
            } catch (JSONException e) {
                ao.m9516a("Error converting updateRuleDiffs to JSON", e);
            }
            try {
                edit.putString("__leanplum_event_rules", c2573a.m9449a(ab.m9454a(f8024l).toString()));
            } catch (JSONException e2) {
                ao.m9516a("Error converting eventRuleDiffs to JSON", e2);
            }
            edit.putString("regions", c2573a.m9449a(ab.m9450a(f8021i)));
            try {
                edit.putString("variants", c2573a.m9449a(ab.m9454a(f8028p).toString()));
            } catch (Throwable e3) {
                Object[] objArr = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Error converting ");
                stringBuilder.append(f8028p);
                stringBuilder.append(" to JSON.\n");
                stringBuilder.append(ao.m9513a(e3));
                objArr[0] = stringBuilder.toString();
                ao.m9516a(objArr);
            }
            edit.putString("deviceId", c2573a.m9449a(aw.m9561f()));
            edit.putString(ManagerWebServices.PARAM_USER_ID, c2573a.m9449a(aw.m9562g()));
            edit.putString("loggingEnabled", c2573a.m9449a(String.valueOf(C2590h.f8068m)));
            SharedPreferencesUtil.commitChanges(edit);
        }
    }

    /* renamed from: c */
    static int m9657c(java.lang.String r5) {
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
        r1 = "res/";	 Catch:{ Exception -> 0x003c }
        r2 = "";	 Catch:{ Exception -> 0x003c }
        r5 = r5.replace(r1, r2);	 Catch:{ Exception -> 0x003c }
        r1 = 46;	 Catch:{ Exception -> 0x003c }
        r2 = r5.lastIndexOf(r1);	 Catch:{ Exception -> 0x003c }
        r5 = r5.substring(r0, r2);	 Catch:{ Exception -> 0x003c }
        r2 = 47;	 Catch:{ Exception -> 0x003c }
        r3 = r5.lastIndexOf(r2);	 Catch:{ Exception -> 0x003c }
        r3 = r3 + 1;	 Catch:{ Exception -> 0x003c }
        r3 = r5.substring(r3);	 Catch:{ Exception -> 0x003c }
        r4 = r5.lastIndexOf(r2);	 Catch:{ Exception -> 0x003c }
        r5 = r5.substring(r0, r4);	 Catch:{ Exception -> 0x003c }
        r5 = r5.replace(r2, r1);	 Catch:{ Exception -> 0x003c }
        r1 = com.leanplum.Leanplum.getContext();	 Catch:{ Exception -> 0x003c }
        r2 = r1.getResources();	 Catch:{ Exception -> 0x003c }
        r1 = r1.getPackageName();	 Catch:{ Exception -> 0x003c }
        r5 = r2.getIdentifier(r3, r5, r1);	 Catch:{ Exception -> 0x003c }
        goto L_0x003d;
    L_0x003c:
        r5 = 0;
    L_0x003d:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bq.c(java.lang.String):int");
    }

    /* renamed from: t */
    private static void m9676t() {
        for (String str : new HashMap(f8014b).keySet()) {
            Var var = (Var) f8014b.get(str);
            if (var != null) {
                String str2 = var.stringValue;
                if (var.isResource && ManagerWebServices.PARAM_FILE.equals(var.kind()) && str2 != null && !str2.equals(var.defaultValue())) {
                    Map map = (Map) f8015c.get(str2);
                    InputStream inputStream = (InputStream) f8016d.get(str2);
                    if (!(map == null || inputStream == null)) {
                        var.setOverrideResId(bq.m9657c(var.stringValue()));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9647a(Map<String, Object> map, Map<String, Object> map2, List<Map<String, Object>> list, List<Map<String, Object>> list2, Map<String, Object> map3, List<Map<String, Object>> list3) {
        if (map != null) {
            f8020h = map;
            synchronized (f8013a) {
                f8034v = bq.m9636a(f8013a, f8020h);
            }
            map = new HashMap(f8014b).keySet().iterator();
            while (map.hasNext()) {
                ((Var) f8014b.get((String) map.next())).update();
            }
            bq.m9676t();
        }
        map = null;
        if (map2 != null) {
            f8022j = map2;
            Map hashMap = new HashMap();
            for (Entry entry : map2.entrySet()) {
                Map map4 = (Map) entry.getValue();
                Map hashMap2 = new HashMap(map4);
                map4 = (Map) bq.m9636a((Map) bo.m9595a(f8018f, hashMap2.get("action"), "values"), (Map) map4.get("vars"));
                hashMap.put(entry.getKey(), hashMap2);
                hashMap2.put("vars", map4);
            }
            f8033u = hashMap;
            for (Entry key : hashMap.entrySet()) {
                String str = (String) key.getKey();
                Map map5 = (Map) f8033u.get(str);
                if (!(map5 == null || map5.get("action") == null)) {
                    new ActionContext(map5.get("action").toString(), (Map) map5.get("vars"), str).update();
                }
            }
        }
        if (map3 != null) {
            f8021i = map3;
        }
        if (!(map2 == null && map3 == null)) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            C2587d.m9694a(hashSet, hashSet2);
            LocationManager b = C2587d.m9699b();
            if (b != null) {
                b.setRegionsData(map3, hashSet, hashSet2);
            }
        }
        if (list != null) {
            map2 = list.equals(f8023k) ^ 1;
            f8023k = new ArrayList(list);
            bq.m9677u();
        } else {
            map2 = null;
        }
        if (list2 != null) {
            map = list2.equals(f8024l) ^ 1;
            f8024l = new ArrayList(list2);
        }
        if (list3 != null) {
            f8028p = list3;
        }
        f8036x += 1;
        if (f8035w == null) {
            bq.m9664h();
            f8032t = true;
            if (f8029q != null) {
                f8029q.updateCache();
            }
            if (!(map2 == null || f8030r == null)) {
                f8030r.updateCache();
            }
            if (map != null && f8031s != null) {
                f8031s.updateCache();
            }
        }
    }

    /* renamed from: a */
    static void m9646a(List<Map<String, Object>> list) {
        f8023k = list;
        bq.m9677u();
        if (f8030r != null) {
            f8030r.updateCache();
        }
        bq.m9664h();
    }

    /* renamed from: u */
    private static void m9677u() {
        for (Map map : f8023k) {
            for (Map map2 : (List) map.get("changes")) {
                String str = (String) map2.get("key");
                if (str != null && str.contains(ManagerWebServices.IG_PARAM_IMAGE)) {
                    C2594s.m9717a(true, (String) map2.get("value"), null, null, null);
                }
            }
        }
    }

    /* renamed from: i */
    public static int m9665i() {
        return f8036x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static boolean m9651a(java.util.Map<java.lang.String, java.lang.Object> r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
        r0 = 0;
        if (r8 == 0) goto L_0x009f;
    L_0x0003:
        if (r9 == 0) goto L_0x009f;
    L_0x0005:
        r1 = r8.size();
        r2 = r9.size();
        if (r1 == r2) goto L_0x0011;
    L_0x000f:
        goto L_0x009f;
    L_0x0011:
        r8 = r8.entrySet();
        r8 = r8.iterator();
    L_0x0019:
        r1 = r8.hasNext();
        r2 = 1;
        if (r1 == 0) goto L_0x009e;
    L_0x0020:
        r1 = r8.next();
        r1 = (java.util.Map.Entry) r1;
        r3 = r1.getValue();
        r3 = (java.util.Map) r3;
        r1 = r1.getKey();
        r1 = r9.get(r1);
        r1 = (java.util.Map) r1;
        if (r1 == 0) goto L_0x009d;
    L_0x0038:
        if (r3 != 0) goto L_0x003b;
    L_0x003a:
        goto L_0x009d;
    L_0x003b:
        r4 = "kind";
        r4 = r3.get(r4);
        r5 = "values";
        r5 = r3.get(r5);
        r6 = "kinds";
        r6 = r3.get(r6);
        r7 = "options";
        r3 = r3.get(r7);
        if (r4 == 0) goto L_0x0061;
    L_0x0055:
        r7 = "kind";
        r7 = r1.get(r7);
        r4 = r4.equals(r7);
        if (r4 == 0) goto L_0x009c;
    L_0x0061:
        if (r5 == 0) goto L_0x006f;
    L_0x0063:
        r4 = "values";
        r4 = r1.get(r4);
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x009c;
    L_0x006f:
        if (r6 == 0) goto L_0x007d;
    L_0x0071:
        r4 = "kinds";
        r4 = r1.get(r4);
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x009c;
    L_0x007d:
        if (r3 != 0) goto L_0x0081;
    L_0x007f:
        r4 = 1;
        goto L_0x0082;
    L_0x0081:
        r4 = 0;
    L_0x0082:
        r5 = "options";
        r5 = r1.get(r5);
        if (r5 != 0) goto L_0x008b;
    L_0x008a:
        goto L_0x008c;
    L_0x008b:
        r2 = 0;
    L_0x008c:
        if (r4 != r2) goto L_0x009c;
    L_0x008e:
        if (r3 == 0) goto L_0x0019;
    L_0x0090:
        r2 = "options";
        r1 = r1.get(r2);
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x0019;
    L_0x009c:
        return r0;
    L_0x009d:
        return r0;
    L_0x009e:
        return r2;
    L_0x009f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.bq.a(java.util.Map, java.util.Map):boolean");
    }

    /* renamed from: v */
    private static void m9678v() {
        f8032t = true;
        if (f8029q != null) {
            f8029q.updateCache();
        }
    }

    /* renamed from: j */
    static boolean m9666j() {
        return bq.m9652a(true, false);
    }

    /* renamed from: k */
    static boolean m9667k() {
        return bq.m9652a(false, true);
    }

    /* renamed from: a */
    private static boolean m9652a(boolean z, boolean z2) {
        Map hashMap;
        boolean z3 = true;
        Object obj = null;
        boolean z4 = (!z || f8025m == null || f8013a.equals(f8025m)) ? false : true;
        if (z2) {
            Map map = f8018f;
            Map map2 = f8027o;
            if (map != null && map2 != null) {
                if (map.size() == map2.size()) {
                    for (Entry entry : map.entrySet()) {
                        Map map3 = (Map) entry.getValue();
                        Map map4 = (Map) map2.get(entry.getKey());
                        if (map4 != null) {
                            if (map3 != null) {
                                Object obj2 = map3.get("kind");
                                Object obj3 = map3.get("values");
                                Object obj4 = map3.get("kinds");
                                Object obj5 = map3.get("options");
                                if ((obj2 != null && !obj2.equals(map4.get("kind"))) || ((obj3 != null && !obj3.equals(map4.get("values"))) || (obj4 != null && !obj4.equals(map4.get("kinds"))))) {
                                    break;
                                }
                                if ((obj5 == null ? 1 : null) == (map4.get("options") == null ? 1 : null)) {
                                    if (obj5 != null && obj5.equals(map4.get("options"))) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            break;
                        }
                        break;
                    }
                    obj = 1;
                }
            }
            if (obj == null) {
                if (z3) {
                    hashMap = new HashMap();
                    if (z) {
                        hashMap.put("vars", ab.m9450a(f8013a));
                        hashMap.put("kinds", ab.m9450a(f8017e));
                    }
                    if (z2) {
                        hashMap.put("actionDefinitions", ab.m9450a(f8018f));
                    }
                    hashMap.put("fileAttributes", ab.m9450a(f8015c));
                    aw.m9544b("setVars", hashMap).m9581j();
                }
                return z3;
            }
        }
        z3 = z4;
        if (z3) {
            hashMap = new HashMap();
            if (z) {
                hashMap.put("vars", ab.m9450a(f8013a));
                hashMap.put("kinds", ab.m9450a(f8017e));
            }
            if (z2) {
                hashMap.put("actionDefinitions", ab.m9450a(f8018f));
            }
            hashMap.put("fileAttributes", ab.m9450a(f8015c));
            aw.m9544b("setVars", hashMap).m9581j();
        }
        return z3;
    }

    /* renamed from: l */
    static void m9668l() {
        if (!(C2590h.m9712a() || f8026n == null || !Leanplum.hasStartedAndRegisteredAsDeveloper())) {
            if (C2590h.f8071p) {
                List arrayList = new ArrayList();
                Object arrayList2 = new ArrayList();
                List arrayList3 = new ArrayList();
                int i = 0;
                for (Entry entry : f8015c.entrySet()) {
                    String str = (String) entry.getKey();
                    Map map = (Map) f8026n.get(str);
                    Map map2 = (Map) ((Map) entry.getValue()).get("");
                    map = (Map) (map != null ? map.get("") : null);
                    if (C2594s.m9727a(map2, map)) {
                        Object[] objArr = new Object[1];
                        StringBuilder stringBuilder = new StringBuilder("Will upload file ");
                        stringBuilder.append(str);
                        stringBuilder.append(". Local attributes: ");
                        stringBuilder.append(map2);
                        stringBuilder.append("; server attributes: ");
                        stringBuilder.append(map);
                        objArr[0] = stringBuilder.toString();
                        ao.m9519d(objArr);
                        Object obj = (String) map2.get("hash");
                        if (obj == null) {
                            obj = "";
                        }
                        String c = C2594s.m9732c(str);
                        if ((i > 26214400 && arrayList.size() > 0) || arrayList.size() >= 16) {
                            Map hashMap = new HashMap();
                            hashMap.put(ManagerWebServices.FB_DATA, arrayList2.toString());
                            aw.m9544b("uploadFile", hashMap).m9576a(arrayList, arrayList3);
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList();
                            arrayList3 = new ArrayList();
                            i = 0;
                        }
                        i += ((Integer) map2.get(ManagerWebServices.PARAM_SIZE)).intValue();
                        arrayList.add(c);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("hash", obj);
                            String str2 = ManagerWebServices.PARAM_SIZE;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(map2.get(ManagerWebServices.PARAM_SIZE));
                            jSONObject.put(str2, stringBuilder.toString());
                            jSONObject.put("filename", str);
                            arrayList2.add(jSONObject);
                        } catch (Throwable e) {
                            Object[] objArr2 = new Object[1];
                            StringBuilder stringBuilder2 = new StringBuilder("Unable to upload files.\n");
                            stringBuilder2.append(ao.m9513a(e));
                            objArr2[0] = stringBuilder2.toString();
                            ao.m9516a(objArr2);
                            arrayList2.add(new JSONObject());
                        }
                        arrayList3.add(f8016d.get(str));
                    }
                }
                if (arrayList.size() > 0) {
                    Map hashMap2 = new HashMap();
                    hashMap2.put(ManagerWebServices.FB_DATA, arrayList2.toString());
                    aw.m9544b("uploadFile", hashMap2).m9576a(arrayList, arrayList3);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9649a(boolean z) {
        f8035w = z;
    }

    /* renamed from: m */
    public static boolean m9669m() {
        return f8035w;
    }

    /* renamed from: a */
    public static void m9648a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        f8025m = map;
        f8027o = map3;
        f8026n = map2;
    }

    /* renamed from: a */
    public static void m9642a(CacheUpdateBlock cacheUpdateBlock) {
        f8029q = cacheUpdateBlock;
    }

    /* renamed from: b */
    public static void m9656b(CacheUpdateBlock cacheUpdateBlock) {
        f8030r = cacheUpdateBlock;
    }

    /* renamed from: c */
    public static void m9659c(CacheUpdateBlock cacheUpdateBlock) {
        f8031s = cacheUpdateBlock;
    }

    /* renamed from: n */
    public static List<Map<String, Object>> m9670n() {
        return f8028p;
    }

    /* renamed from: o */
    public static Map<String, Object> m9671o() {
        return f8018f;
    }

    /* renamed from: p */
    public static Map<String, Object> m9672p() {
        return f8033u;
    }

    /* renamed from: a */
    public static void m9644a(String str, int i, List<C2586c<?>> list, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        List arrayList = new ArrayList();
        for (C2586c c2586c : list) {
            bq.m9645a(c2586c.m9687a(), bq.m9653a(c2586c.m9687a()), c2586c.m9689c(), c2586c.m9688b(), (Map) hashMap, (Map) hashMap2);
            arrayList.add(c2586c.m9687a());
        }
        list = new HashMap();
        list.put("kind", Integer.valueOf(i));
        list.put("values", hashMap);
        list.put("kinds", hashMap2);
        list.put("order", arrayList);
        list.put("options", map);
        f8018f.put(str, list);
    }

    /* renamed from: a */
    public static <T> String m9640a(T t) {
        if (!((t instanceof Integer) || (t instanceof Long) || (t instanceof Short) || (t instanceof Character) || (t instanceof Byte))) {
            if (!(t instanceof BigInteger)) {
                if (!((t instanceof Float) || (t instanceof Double))) {
                    if (!(t instanceof BigDecimal)) {
                        if (t instanceof String) {
                            return ManagerWebServices.PARAM_TEASER_STRING;
                        }
                        if (!(t instanceof List)) {
                            if (!(t instanceof Array)) {
                                if (t instanceof Map) {
                                    return ManagerWebServices.PARAM_GROUP;
                                }
                                return (t instanceof Boolean) != null ? "bool" : null;
                            }
                        }
                        return "list";
                    }
                }
                return "float";
            }
        }
        return "integer";
    }

    /* renamed from: q */
    static Map<String, Object> m9673q() {
        if (f8037y == null) {
            try {
                f8037y = ab.m9452a(new C2573a(aw.m9560e(), aw.m9530a()).m9448a(Leanplum.getContext().getSharedPreferences(f8019g, 0), "__leanplum_attributes", "{}"));
            } catch (Throwable e) {
                Object[] objArr = new Object[1];
                StringBuilder stringBuilder = new StringBuilder("Could not load user attributes.\n");
                stringBuilder.append(ao.m9513a(e));
                objArr[0] = stringBuilder.toString();
                ao.m9516a(objArr);
                f8037y = new HashMap();
            }
        }
        return f8037y;
    }

    /* renamed from: r */
    public static void m9674r() {
        if (!(C2590h.m9712a() || aw.m9560e() == null)) {
            if (f8037y != null) {
                Editor edit = Leanplum.getContext().getSharedPreferences(f8019g, 0).edit();
                String a = ab.m9450a(f8037y);
                edit.putString("__leanplum_attributes", new C2573a(aw.m9560e(), aw.m9530a()).m9449a(a));
                SharedPreferencesUtil.commitChanges(edit);
            }
        }
    }

    /* renamed from: w */
    private static void m9679w() {
        f8014b.clear();
        f8015c.clear();
        f8016d.clear();
        f8013a.clear();
        f8017e.clear();
        f8018f.clear();
        f8020h.clear();
        f8022j.clear();
        f8021i.clear();
        f8025m = null;
        f8026n = null;
        f8027o = null;
        f8028p.clear();
        f8029q = null;
        f8032t = false;
        f8033u = null;
        f8034v = null;
        f8035w = false;
        f8036x = 0;
        f8037y = null;
    }
}
