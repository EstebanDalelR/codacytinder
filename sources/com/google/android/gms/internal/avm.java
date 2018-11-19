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
public final class avm implements zzys<amp> {
    /* renamed from: a */
    private final boolean f23195a;
    /* renamed from: b */
    private final boolean f23196b;
    /* renamed from: c */
    private final boolean f23197c;

    public avm(boolean z, boolean z2, boolean z3) {
        this.f23195a = z;
        this.f23196b = z2;
        this.f23197c = z3;
    }

    public final /* synthetic */ zzou zza(aux aux, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        String string;
        String string2;
        zzpq zzpq;
        String string3;
        String string4;
        amk amk;
        Bundle bundle;
        zzll zzsg;
        View view;
        aux aux2 = aux;
        JSONObject jSONObject2 = jSONObject;
        List<zzakv> a = aux2.m19517a(jSONObject2, ManagerWebServices.PARAM_SPOTIFY_IMAGES, false, this.f23195a, this.f23196b);
        Future a2 = aux2.m19516a(jSONObject2, "secondary_image", false, this.f23195a);
        Future a3 = aux.m19514a(jSONObject);
        zzakv a4 = aux2.m19515a(jSONObject2, "video");
        List arrayList = new ArrayList();
        for (zzakv zzakv : a) {
            arrayList.add((amm) zzakv.get());
        }
        zzanh a5 = aux.m19504a(a4);
        String string5 = jSONObject2.getString("headline");
        if (r0.f23197c) {
            if (((Boolean) aja.m19221f().m19334a(alo.cQ)).booleanValue()) {
                Resources v = ar.i().m27324v();
                string = v != null ? v.getString(C2335R.string.s7) : "Test Ad";
                if (string5 != null) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(string).length() + 3) + String.valueOf(string5).length());
                    stringBuilder.append(string);
                    stringBuilder.append(" : ");
                    stringBuilder.append(string5);
                    string5 = stringBuilder.toString();
                }
                string2 = jSONObject2.getString("body");
                zzpq = (zzpq) a2.get();
                string3 = jSONObject2.getString("call_to_action");
                string4 = jSONObject2.getString("advertiser");
                amk = (amk) a3.get();
                bundle = new Bundle();
                zzsg = a5 == null ? a5.zzsg() : null;
                if (a5 != null) {
                    view = null;
                } else if (a5 != null) {
                    throw null;
                } else {
                    view = (View) a5;
                }
                return new amp(string, arrayList, string2, zzpq, string3, string4, amk, bundle, zzsg, view, null, null);
            }
        }
        string = string5;
        string2 = jSONObject2.getString("body");
        zzpq = (zzpq) a2.get();
        string3 = jSONObject2.getString("call_to_action");
        string4 = jSONObject2.getString("advertiser");
        amk = (amk) a3.get();
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
        return new amp(string, arrayList, string2, zzpq, string3, string4, amk, bundle, zzsg, view, null, null);
    }
}
