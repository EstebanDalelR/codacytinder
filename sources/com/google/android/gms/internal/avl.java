package com.google.android.gms.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.C2335R;
import com.google.android.gms.ads.internal.ar;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class avl implements zzys<amn> {
    /* renamed from: a */
    private final boolean f23192a;
    /* renamed from: b */
    private final boolean f23193b;
    /* renamed from: c */
    private final boolean f23194c;

    public avl(boolean z, boolean z2, boolean z3) {
        this.f23192a = z;
        this.f23193b = z2;
        this.f23194c = z3;
    }

    public final /* synthetic */ zzou zza(aux aux, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        String string;
        String string2;
        zzpq zzpq;
        String string3;
        double optDouble;
        String optString;
        String optString2;
        amk amk;
        Bundle bundle;
        zzll zzsg;
        View view;
        aux aux2 = aux;
        JSONObject jSONObject2 = jSONObject;
        List<zzakv> a = aux2.m19517a(jSONObject2, ManagerWebServices.PARAM_SPOTIFY_IMAGES, false, this.f23192a, this.f23193b);
        Future a2 = aux2.m19516a(jSONObject2, "app_icon", true, this.f23192a);
        zzakv a3 = aux2.m19515a(jSONObject2, "video");
        Future a4 = aux.m19514a(jSONObject);
        List arrayList = new ArrayList();
        for (zzakv zzakv : a) {
            arrayList.add((amm) zzakv.get());
        }
        zzanh a5 = aux.m19504a(a3);
        String string4 = jSONObject2.getString("headline");
        if (r0.f23194c) {
            if (((Boolean) aja.m19221f().m19334a(alo.cQ)).booleanValue()) {
                Resources v = ar.i().m27324v();
                string = v != null ? v.getString(C2335R.string.s7) : "Test Ad";
                if (string4 != null) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(string).length() + 3) + String.valueOf(string4).length());
                    stringBuilder.append(string);
                    stringBuilder.append(" : ");
                    stringBuilder.append(string4);
                    string4 = stringBuilder.toString();
                }
                string2 = jSONObject2.getString("body");
                zzpq = (zzpq) a2.get();
                string3 = jSONObject2.getString("call_to_action");
                optDouble = jSONObject2.optDouble(ManagerWebServices.PARAM_RATING, -1.0d);
                optString = jSONObject2.optString("store");
                optString2 = jSONObject2.optString("price");
                amk = (amk) a4.get();
                bundle = new Bundle();
                zzsg = a5 == null ? a5.zzsg() : null;
                if (a5 != null) {
                    view = null;
                } else if (a5 != null) {
                    throw null;
                } else {
                    view = (View) a5;
                }
                return new amn(string, arrayList, string2, zzpq, string3, optDouble, optString, optString2, amk, bundle, zzsg, view, null, null);
            }
        }
        string = string4;
        string2 = jSONObject2.getString("body");
        zzpq = (zzpq) a2.get();
        string3 = jSONObject2.getString("call_to_action");
        optDouble = jSONObject2.optDouble(ManagerWebServices.PARAM_RATING, -1.0d);
        optString = jSONObject2.optString("store");
        optString2 = jSONObject2.optString("price");
        amk = (amk) a4.get();
        bundle = new Bundle();
        if (a5 == null) {
        }
        if (a5 != null) {
            view = null;
        } else if (a5 != null) {
            view = (View) a5;
        } else {
            throw null;
        }
        return new amn(string, arrayList, string2, zzpq, string3, optDouble, optString, optString2, amk, bundle, zzsg, view, null, null);
    }
}
