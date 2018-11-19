package com.leanplum.p069a;

import com.leanplum.callbacks.StartCallback;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.n */
public class C7037n implements ba {
    /* renamed from: b */
    private static String f25583b = "integer";
    /* renamed from: c */
    private static String f25584c = "float";
    /* renamed from: d */
    private static String f25585d = "string";
    /* renamed from: e */
    private static String f25586e = "bool";
    /* renamed from: f */
    private static String f25587f = "file";
    /* renamed from: g */
    private static String f25588g = "group";
    /* renamed from: h */
    private static String f25589h = "list";
    /* renamed from: i */
    private static String f25590i = "action";
    /* renamed from: j */
    private static String f25591j = "color";
    /* renamed from: a */
    final /* synthetic */ StartCallback f25592a;

    C7037n(StartCallback startCallback) {
        this.f25592a = startCallback;
    }

    /* renamed from: a */
    public void m30598a(JSONObject jSONObject) {
        aq.a().a(new at(this, jSONObject));
    }
}
