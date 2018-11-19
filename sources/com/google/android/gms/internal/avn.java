package com.google.android.gms.internal;

import android.support.v4.util.C0562m;
import android.view.View;
import com.tinder.api.ManagerWebServices;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class avn implements zzys<amr> {
    /* renamed from: a */
    private final boolean f23198a;

    public avn(boolean z) {
        this.f23198a = z;
    }

    /* renamed from: a */
    private static <K, V> C0562m<K, V> m27262a(C0562m<K, Future<V>> c0562m) throws InterruptedException, ExecutionException {
        C0562m<K, V> c0562m2 = new C0562m();
        for (int i = 0; i < c0562m.size(); i++) {
            c0562m2.put(c0562m.b(i), ((Future) c0562m.c(i)).get());
        }
        return c0562m2;
    }

    public final /* synthetic */ zzou zza(aux aux, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        View view;
        C0562m c0562m = new C0562m();
        C0562m c0562m2 = new C0562m();
        Future a = aux.m19514a(jSONObject);
        zzakv a2 = aux.m19515a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if (ManagerWebServices.PARAM_TEASER_STRING.equals(string)) {
                c0562m2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if (ManagerWebServices.IG_PARAM_IMAGE.equals(string)) {
                c0562m.put(jSONObject2.getString("name"), aux.m19518a(jSONObject2, "image_value", this.f23198a));
            } else {
                String str = "Unknown custom asset type: ";
                string = String.valueOf(string);
                hx.m19916e(string.length() != 0 ? str.concat(string) : new String(str));
            }
        }
        zzanh a3 = aux.m19504a(a2);
        String string2 = jSONObject.getString("custom_template_id");
        C0562m a4 = m27262a(c0562m);
        amk amk = (amk) a.get();
        zzll zzsg = a3 != null ? a3.zzsg() : null;
        if (a3 == null) {
            view = null;
        } else if (a3 == null) {
            throw null;
        } else {
            view = (View) a3;
        }
        return new amr(string2, a4, c0562m2, amk, zzsg, view);
    }
}
