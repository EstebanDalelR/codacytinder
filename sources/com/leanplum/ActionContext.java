package com.leanplum;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.leanplum.p069a.C2587d;
import com.leanplum.p069a.C2589f;
import com.leanplum.p069a.C2590h;
import com.leanplum.p069a.C2594s;
import com.leanplum.p069a.ab;
import com.leanplum.p069a.ag;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bo;
import com.leanplum.p069a.bq;
import com.tinder.api.ManagerWebServices;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

public class ActionContext extends C2589f implements Comparable<ActionContext> {
    /* renamed from: a */
    private final String f12084a;
    /* renamed from: b */
    private ActionContext f12085b;
    /* renamed from: c */
    private final int f12086c;
    /* renamed from: d */
    private String f12087d;
    /* renamed from: e */
    private boolean f12088e;
    /* renamed from: f */
    private ContextualValues f12089f;

    public class ContextualValues {
        public Map<String, Object> arguments;
        public Object attributeValue;
        public Map<String, ?> parameters;
        public Object previousAttributeValue;
    }

    public ActionContext(String str, Map<String, Object> map, String str2) {
        this(str, map, str2, null, AdError.NETWORK_ERROR_CODE);
    }

    public ActionContext(String str, Map<String, Object> map, String str2, String str3, int i) {
        super(str2, str3);
        this.f12088e = null;
        this.f12084a = str;
        this.args = map;
        this.f12086c = bq.m9665i();
        this.priority = i;
    }

    public void preventRealtimeUpdating() {
        this.f12088e = true;
    }

    public void setContextualValues(ContextualValues contextualValues) {
        this.f12089f = contextualValues;
    }

    public ContextualValues getContextualValues() {
        return this.f12089f;
    }

    /* renamed from: a */
    private static Map<String, Object> m14507a(String str) {
        Map map = (Map) bq.m9671o().get(str);
        return map == null ? new HashMap() : map;
    }

    /* renamed from: b */
    private Map<String, Object> m14516b() {
        return m14507a(this.f12084a);
    }

    public void update() {
        m14508a(this.args, "", m14517c());
    }

    public String actionName() {
        return this.f12084a;
    }

    public <T> T objectNamed(String str) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("objectNamed - Invalid name parameter provided.");
            return null;
        }
        try {
            if (!this.f12088e && bq.m9665i() > this.f12086c) {
                ActionContext actionContext = this.f12085b;
                if (actionContext != null) {
                    this.args = actionContext.m14520d(this.f12087d);
                } else if (this.messageId != null) {
                    Map map = (Map) bq.m9672p().get(this.messageId);
                    if (map != null) {
                        this.args = (Map) map.get("vars");
                    }
                }
            }
            return bq.m9639a(bq.m9653a(str), this.args);
        } catch (Throwable th) {
            bo.m9608a(th);
            return null;
        }
    }

    public String stringNamed(String str) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("stringNamed - Invalid name parameter provided.");
            return null;
        }
        str = objectNamed(str);
        if (str == null) {
            return null;
        }
        try {
            return fillTemplate(str.toString());
        } catch (Throwable th) {
            bo.m9608a(th);
            return str.toString();
        }
    }

    public String fillTemplate(String str) {
        if (!(this.f12089f == null || str == null)) {
            if (str.contains("##")) {
                if (this.f12089f.parameters != null) {
                    for (Entry entry : this.f12089f.parameters.entrySet()) {
                        StringBuilder stringBuilder = new StringBuilder("##Parameter ");
                        stringBuilder.append((String) entry.getKey());
                        stringBuilder.append("##");
                        CharSequence stringBuilder2 = stringBuilder.toString();
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(entry.getValue());
                        str = str.replace(stringBuilder2, stringBuilder3.toString());
                    }
                }
                if (this.f12089f.previousAttributeValue != null) {
                    str = str.replace("##Previous Value##", this.f12089f.previousAttributeValue.toString());
                }
                if (this.f12089f.attributeValue != null) {
                    str = str.replace("##Value##", this.f12089f.attributeValue.toString());
                }
                return str;
            }
        }
        return str;
    }

    /* renamed from: b */
    private String m14514b(String str) {
        str = str.split("\\.");
        Map c = m14517c();
        for (int i = 0; i < str.length && c != null; i++) {
            if (i == str.length - 1) {
                str = c.get(str[i]);
                if (str == null) {
                    return null;
                }
                return str.toString();
            }
            c = (Map) c.get(str[i]);
        }
        return null;
    }

    public InputStream streamNamed(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                ao.m9516a("streamNamed - Invalid name parameter provided.");
                return null;
            }
            String obj;
            InputStream a;
            Object[] objArr;
            StringBuilder stringBuilder;
            String stringNamed = stringNamed(str);
            String[] split = str.split("\\.");
            Map c = m14517c();
            int i = 0;
            while (i < split.length && c != null) {
                if (i == split.length - 1) {
                    Object obj2 = c.get(split[i]);
                    if (obj2 != null) {
                        obj = obj2.toString();
                        if (stringNamed == null || stringNamed.length() == 0) {
                            if (obj != null) {
                                if (obj.length() == 0) {
                                }
                            }
                            return null;
                        }
                        a = C2594s.m9719a(false, null, null, C2594s.m9721a(stringNamed, obj, null), obj, null);
                        if (a == null) {
                            objArr = new Object[1];
                            stringBuilder = new StringBuilder("Could not open stream named ");
                            stringBuilder.append(str);
                            objArr[0] = stringBuilder.toString();
                            ao.m9516a(objArr);
                        }
                        return a;
                    }
                } else {
                    c = (Map) c.get(split[i]);
                    i++;
                }
            }
            obj = null;
            if (obj != null) {
                if (obj.length() == 0) {
                }
                a = C2594s.m9719a(false, null, null, C2594s.m9721a(stringNamed, obj, null), obj, null);
                if (a == null) {
                    objArr = new Object[1];
                    stringBuilder = new StringBuilder("Could not open stream named ");
                    stringBuilder.append(str);
                    objArr[0] = stringBuilder.toString();
                    ao.m9516a(objArr);
                }
                return a;
            }
            return null;
        } catch (Throwable th) {
            bo.m9608a(th);
            return null;
        }
    }

    public boolean booleanNamed(String str) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("booleanNamed - Invalid name parameter provided.");
            return false;
        }
        str = objectNamed(str);
        if (str == null) {
            return false;
        }
        try {
            if (str instanceof Boolean) {
                return ((Boolean) str).booleanValue();
            }
            str = str.toString();
            if (!("1".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str) || "true".equalsIgnoreCase(str))) {
                if ("on".equalsIgnoreCase(str) == null) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            bo.m9608a(th);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m14518c(String str) {
        if (!("1".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str) || "true".equalsIgnoreCase(str))) {
            if ("on".equalsIgnoreCase(str) == null) {
                return null;
            }
        }
        return true;
    }

    public Number numberNamed(String str) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("numberNamed - Invalid name parameter provided.");
            return null;
        }
        str = objectNamed(str);
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str.toString())) {
                    if (str instanceof Number) {
                        return (Number) str;
                    }
                    return Double.valueOf(str.toString());
                }
            } catch (Throwable th) {
                bo.m9608a(th);
                return Double.valueOf(0.0d);
            }
        }
        return Double.valueOf(0.0d);
    }

    /* renamed from: d */
    private Map<String, Object> m14520d(String str) {
        str = objectNamed(str);
        if (!(str instanceof Map)) {
            return null;
        }
        Object obj = (Map) str;
        return (Map) bq.m9636a((Map) m14507a((String) obj.get("__name__")).get("values"), obj);
    }

    public void runActionNamed(String str) {
        if (TextUtils.isEmpty(str)) {
            ao.m9516a("runActionNamed - Invalid name parameter provided.");
            return;
        }
        Map d = m14520d(str);
        if (d != null) {
            boolean a;
            Object obj;
            if (d != null) {
                String b = m14515b(d);
                if (m14512a(d)) {
                    Leanplum.forceContentUpdate(new ActionContext$2(this, b, str));
                } else {
                    a = m14510a(b, bq.m9672p(), str);
                    if (!a) {
                        obj = d.get("__name__");
                        if (obj != null) {
                            m14511a(obj.toString(), d, this.messageId, str, Boolean.valueOf(false));
                        }
                    }
                }
            }
            a = false;
            if (a) {
                obj = d.get("__name__");
                if (obj != null) {
                    m14511a(obj.toString(), d, this.messageId, str, Boolean.valueOf(false));
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m14511a(String str, Map<String, Object> map, String str2, String str3, Boolean bool) {
        try {
            ActionContext actionContext = new ActionContext(str, map, str2);
            actionContext.f12089f = this.f12089f;
            actionContext.f12088e = this.f12088e;
            actionContext.isRooted = this.isRooted;
            actionContext.f12087d = str3;
            if (bool.booleanValue() != null) {
                ag.m9476a(actionContext, new ActionContext$1(this, actionContext));
            } else {
                actionContext.f12085b = this;
                ag.m9475a(actionContext);
            }
            return true;
        } catch (Throwable th) {
            bo.m9608a(th);
            return null;
        }
    }

    /* renamed from: a */
    private boolean m14513a(Map<String, Object> map, String str) {
        if (map == null) {
            return false;
        }
        String b = m14515b((Map) map);
        if (m14512a((Map) map) == null) {
            return m14510a(b, bq.m9672p(), str);
        }
        Leanplum.forceContentUpdate(new ActionContext$2(this, b, str));
        return false;
    }

    /* renamed from: a */
    static boolean m14512a(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        map = m14515b((Map) map);
        if (map == null || (bq.m9672p() != null && bq.m9672p().containsKey(map) != null)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m14515b(Map<String, Object> map) {
        return (map == null || !"Chain to Existing Message".equals(map.get("__name__"))) ? null : (String) map.get("Chained message");
    }

    /* renamed from: a */
    private boolean m14510a(String str, Map<String, Object> map, String str2) {
        if (map == null) {
            return false;
        }
        map = (Map) map.get(str);
        if (map == null) {
            return false;
        }
        Map map2 = (Map) map.get("vars");
        map = map.get("action");
        if (map != null) {
            if (m14511a(map.toString(), map2, str, str2, Boolean.valueOf(true)) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private String m14521e(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        List arrayList = new ArrayList();
        for (ActionContext actionContext = this; actionContext.f12085b != null; actionContext = actionContext.f12085b) {
            arrayList.add(actionContext);
        }
        int size = arrayList.size() - 1;
        while (size >= -1) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(' ');
            }
            String str2 = size >= 0 ? ((ActionContext) arrayList.get(size)).f12087d : str;
            if (str2 == null) {
                stringBuilder = new StringBuilder("");
                break;
            }
            stringBuilder.append(str2.replace(" action", ""));
            size--;
        }
        return stringBuilder.toString();
    }

    public void runTrackedActionNamed(String str) {
        try {
            if (!(C2590h.m9712a() || this.messageId == null || !this.isRooted)) {
                if (TextUtils.isEmpty(str)) {
                    ao.m9516a("runTrackedActionNamed - Invalid name parameter provided.");
                    return;
                }
                trackMessageEvent(str, 0.0d, null, null);
            }
            runActionNamed(str);
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public void trackMessageEvent(String str, double d, String str2, Map<String, Object> map) {
        try {
            if (!(C2590h.m9712a() || this.messageId == null)) {
                if (TextUtils.isEmpty(str)) {
                    ao.m9516a("trackMessageEvent - Invalid event parameter provided.");
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                List arrayList = new ArrayList();
                for (ActionContext actionContext = this; actionContext.f12085b != null; actionContext = actionContext.f12085b) {
                    arrayList.add(actionContext);
                }
                int size = arrayList.size() - 1;
                while (size >= -1) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(' ');
                    }
                    String str3 = size >= 0 ? ((ActionContext) arrayList.get(size)).f12087d : str;
                    if (str3 == null) {
                        stringBuilder = new StringBuilder("");
                        break;
                    } else {
                        stringBuilder.append(str3.replace(" action", ""));
                        size--;
                    }
                }
                String stringBuilder2 = stringBuilder.toString();
                if (TextUtils.isEmpty(stringBuilder2) != null) {
                    ao.m9516a("trackMessageEvent - Failed to generate parent action names.");
                    return;
                }
                Map hashMap = new HashMap();
                hashMap.put("messageId", this.messageId);
                ag.m9479a(stringBuilder2, d, str2, (Map) map, hashMap);
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public void track(String str, double d, Map<String, Object> map) {
        try {
            if (!(C2590h.m9712a() || this.messageId == null)) {
                if (TextUtils.isEmpty(str)) {
                    ao.m9516a("track - Invalid event parameter provided.");
                    return;
                }
                Map hashMap = new HashMap();
                hashMap.put("messageId", this.messageId);
                ag.m9479a(str, d, null, (Map) map, hashMap);
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public void muteFutureMessagesOfSameKind() {
        try {
            C2587d.m9690a();
            C2587d.m9702c(this.messageId);
        } catch (Throwable th) {
            bo.m9608a(th);
        }
    }

    public int compareTo(@NonNull ActionContext actionContext) {
        return this.priority - actionContext.getPriority();
    }

    public static String filePath(String str) {
        return C2594s.m9736e(str);
    }

    public static JSONObject mapToJsonObject(Map<String, ?> map) throws JSONException {
        return ab.m9457b((Map) map);
    }

    public static <T> Map<String, T> mapFromJson(JSONObject jSONObject) throws JSONException {
        return ab.m9453a(jSONObject);
    }

    /* renamed from: c */
    private Map<String, Object> m14517c() {
        Map<String, Object> map = (Map) m14507a(this.f12084a).get("values");
        return map == null ? new HashMap() : map;
    }

    /* renamed from: d */
    private Map<String, String> m14519d() {
        Map<String, String> map = (Map) m14507a(this.f12084a).get("kinds");
        return map == null ? new HashMap() : map;
    }

    /* renamed from: a */
    private void m14508a(Map<String, Object> map, String str, Map<String, Object> map2) {
        Map map3 = (Map) m14507a(this.f12084a).get("kinds");
        if (map3 == null) {
            map3 = new HashMap();
        }
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            Map map4 = null;
            Object obj = map2 != null ? map2.get(str2) : null;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            String str3 = (String) map3.get(stringBuilder.toString());
            if ((str3 == null || !str3.equals("action")) && (value instanceof Map)) {
                Map map5 = (Map) value;
                if (!map5.containsKey("__name__")) {
                    if (obj instanceof Map) {
                        map4 = (Map) obj;
                    }
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str);
                    stringBuilder2.append(str2);
                    stringBuilder2.append(".");
                    m14508a(map5, stringBuilder2.toString(), map4);
                }
            }
            if ((str3 != null && str3.equals(ManagerWebServices.PARAM_FILE)) || str2.contains("__file__")) {
                C2594s.m9717a(false, value.toString(), obj != null ? obj.toString() : null, null, null);
            } else if (str3 == null || str3.equals("action")) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(str2);
                value = objectNamed(stringBuilder2.toString());
                if (value instanceof Map) {
                    Map map6 = (Map) value;
                    new ActionContext((String) map6.get("__name__"), map6, this.messageId).update();
                }
            }
        }
    }
}
