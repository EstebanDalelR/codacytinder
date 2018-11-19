package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzzv
public final class asq<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends arz {
    /* renamed from: a */
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> f26809a;
    /* renamed from: b */
    private final NETWORK_EXTRAS f26810b;

    public asq(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.f26809a = mediationAdapter;
        this.f26810b = network_extras;
    }

    /* renamed from: a */
    private final SERVER_PARAMETERS m31510a(String str, int i, String str2) throws RemoteException {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } catch (Throwable th) {
                hx.m19914c("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class serverParametersType = this.f26809a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        MediationServerParameters mediationServerParameters = (MediationServerParameters) serverParametersType.newInstance();
        mediationServerParameters.a(hashMap);
        return mediationServerParameters;
    }

    /* renamed from: a */
    private static boolean m31511a(zzjj zzjj) {
        if (!zzjj.zzbdi) {
            aja.m19216a();
            if (!hn.m19870a()) {
                return false;
            }
        }
        return true;
    }

    public final void destroy() throws RemoteException {
        try {
            this.f26809a.destroy();
        } catch (Throwable th) {
            hx.m19914c("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final zzll getVideoController() {
        return null;
    }

    public final IObjectWrapper getView() throws RemoteException {
        if (this.f26809a instanceof MediationBannerAdapter) {
            try {
                return C4296b.a(((MediationBannerAdapter) this.f26809a).getBannerView());
            } catch (Throwable th) {
                hx.m19914c("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f26809a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() {
        return true;
    }

    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void showInterstitial() throws RemoteException {
        if (this.f26809a instanceof MediationInterstitialAdapter) {
            hx.m19911b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f26809a).showInterstitial();
            } catch (Throwable th) {
                hx.m19914c("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f26809a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void showVideo() {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaem zzaem, List<String> list) {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzaem zzaem, String str2) throws RemoteException {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzvd zzvd) throws RemoteException {
        zza(iObjectWrapper, zzjj, str, null, zzvd);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException {
        if (this.f26809a instanceof MediationInterstitialAdapter) {
            hx.m19911b("Requesting interstitial ad from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f26809a).requestInterstitialAd(new asr(zzvd), (Activity) C4296b.a(iObjectWrapper), m31510a(str, zzjj.zzbdj, str2), ate.m19473a(zzjj, m31511a(zzjj)), this.f26810b);
            } catch (Throwable th) {
                hx.m19914c("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f26809a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd, zzpe zzpe, List<String> list) {
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, zzvd zzvd) throws RemoteException {
        zza(iObjectWrapper, zzjn, zzjj, str, null, zzvd);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException {
        if (this.f26809a instanceof MediationBannerAdapter) {
            hx.m19911b("Requesting banner ad from adapter.");
            try {
                ((MediationBannerAdapter) this.f26809a).requestBannerAd(new asr(zzvd), (Activity) C4296b.a(iObjectWrapper), m31510a(str, zzjj.zzbdj, str2), ate.m19472a(zzjn), ate.m19473a(zzjj, m31511a(zzjj)), this.f26810b);
            } catch (Throwable th) {
                hx.m19914c("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f26809a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(zzjj zzjj, String str, String str2) {
    }

    public final void zzc(zzjj zzjj, String str) {
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final zzvj zzme() {
        return null;
    }

    public final zzvm zzmf() {
        return null;
    }

    public final Bundle zzmg() {
        return new Bundle();
    }

    public final Bundle zzmh() {
        return new Bundle();
    }

    public final boolean zzmi() {
        return false;
    }

    public final zzqm zzmj() {
        return null;
    }
}
