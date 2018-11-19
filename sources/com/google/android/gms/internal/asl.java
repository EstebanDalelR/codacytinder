package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C2416m;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.C2418a;
import com.google.android.gms.ads.mediation.C3778b;
import com.google.android.gms.ads.mediation.C3779c;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzzv
public final class asl extends arz {
    /* renamed from: a */
    private final MediationAdapter f26795a;
    /* renamed from: b */
    private asm f26796b;

    public asl(MediationAdapter mediationAdapter) {
        this.f26795a = mediationAdapter;
    }

    /* renamed from: a */
    private final Bundle m31508a(String str, zzjj zzjj, String str2) throws RemoteException {
        String str3 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        hx.m19916e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        try {
            Bundle bundle;
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    bundle.putString(str4, jSONObject.getString(str4));
                }
            } else {
                bundle = bundle2;
            }
            if (this.f26795a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzjj != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzjj.zzbdj);
                }
            }
            return bundle;
        } catch (Throwable th) {
            hx.m19914c("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    /* renamed from: a */
    private static boolean m31509a(zzjj zzjj) {
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
            this.f26795a.onDestroy();
        } catch (Throwable th) {
            hx.m19914c("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        if (this.f26795a instanceof zzapc) {
            return ((zzapc) this.f26795a).getInterstitialAdapterInfo();
        }
        String str = "MediationAdapter is not a v2 MediationInterstitialAdapter: ";
        String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
        hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final zzll getVideoController() {
        if (!(this.f26795a instanceof zza)) {
            return null;
        }
        try {
            return ((zza) this.f26795a).getVideoController();
        } catch (Throwable th) {
            hx.m19914c("Could not get video controller.", th);
            return null;
        }
    }

    public final IObjectWrapper getView() throws RemoteException {
        if (this.f26795a instanceof MediationBannerAdapter) {
            try {
                return C4296b.a(((MediationBannerAdapter) this.f26795a).getBannerView());
            } catch (Throwable th) {
                hx.m19914c("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() throws RemoteException {
        if (this.f26795a instanceof MediationRewardedVideoAdAdapter) {
            hx.m19911b("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f26795a).isInitialized();
            } catch (Throwable th) {
                hx.m19914c("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void pause() throws RemoteException {
        try {
            this.f26795a.onPause();
        } catch (Throwable th) {
            hx.m19914c("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void resume() throws RemoteException {
        try {
            this.f26795a.onResume();
        } catch (Throwable th) {
            hx.m19914c("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        if (this.f26795a instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) this.f26795a).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                hx.m19914c("Could not set immersive mode.", th);
                return;
            }
        }
        String str = "MediationAdapter is not an OnImmersiveModeUpdatedListener: ";
        String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
        hx.m19915d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final void showInterstitial() throws RemoteException {
        if (this.f26795a instanceof MediationInterstitialAdapter) {
            hx.m19911b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f26795a).showInterstitial();
            } catch (Throwable th) {
                hx.m19914c("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        if (this.f26795a instanceof MediationRewardedVideoAdAdapter) {
            hx.m19911b("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f26795a).showVideo();
            } catch (Throwable th) {
                hx.m19914c("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaem zzaem, List<String> list) throws RemoteException {
        if (this.f26795a instanceof InitializableMediationRewardedVideoAdAdapter) {
            hx.m19911b("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f26795a;
                List arrayList = new ArrayList();
                for (String a : list) {
                    arrayList.add(m31508a(a, null, null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) C4296b.a(iObjectWrapper), new cs(zzaem), arrayList);
            } catch (Throwable th) {
                hx.m19914c("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str = "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzaem zzaem, String str2) throws RemoteException {
        zzjj zzjj2 = zzjj;
        if (this.f26795a instanceof MediationRewardedVideoAdAdapter) {
            hx.m19911b("Initialize rewarded video adapter.");
            try {
                Bundle bundle;
                MediationAdRequest mediationAdRequest;
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) r1.f26795a;
                Bundle a = m31508a(str2, zzjj2, null);
                if (zzjj2 != null) {
                    ask ask = new ask(zzjj2.zzbdf == -1 ? null : new Date(zzjj2.zzbdf), zzjj2.zzbdg, zzjj2.zzbdh != null ? new HashSet(zzjj2.zzbdh) : null, zzjj2.zzbdn, m31509a(zzjj), zzjj2.zzbdj, zzjj2.zzbdu);
                    bundle = zzjj2.zzbdp != null ? zzjj2.zzbdp.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    mediationAdRequest = ask;
                } else {
                    mediationAdRequest = null;
                    bundle = mediationAdRequest;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) C4296b.a(iObjectWrapper), mediationAdRequest, str, new cs(zzaem), a, bundle);
            } catch (Throwable th) {
                hx.m19914c("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            String valueOf = String.valueOf(r1.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzvd zzvd) throws RemoteException {
        zza(iObjectWrapper, zzjj, str, null, zzvd);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException {
        zzjj zzjj2 = zzjj;
        if (this.f26795a instanceof MediationInterstitialAdapter) {
            hx.m19911b("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) r1.f26795a;
                Bundle bundle = null;
                ask ask = new ask(zzjj2.zzbdf == -1 ? null : new Date(zzjj2.zzbdf), zzjj2.zzbdg, zzjj2.zzbdh != null ? new HashSet(zzjj2.zzbdh) : null, zzjj2.zzbdn, m31509a(zzjj), zzjj2.zzbdj, zzjj2.zzbdu);
                if (zzjj2.zzbdp != null) {
                    bundle = zzjj2.zzbdp.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) C4296b.a(iObjectWrapper), new asm(zzvd), m31508a(str, zzjj2, str2), ask, bundle);
            } catch (Throwable th) {
                hx.m19914c("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationInterstitialAdapter: ";
            String valueOf = String.valueOf(r1.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd, zzpe zzpe, List<String> list) throws RemoteException {
        zzjj zzjj2 = zzjj;
        if (this.f26795a instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) r1.f26795a;
                Bundle bundle = null;
                asp asp = new asp(zzjj2.zzbdf == -1 ? null : new Date(zzjj2.zzbdf), zzjj2.zzbdg, zzjj2.zzbdh != null ? new HashSet(zzjj2.zzbdh) : null, zzjj2.zzbdn, m31509a(zzjj), zzjj2.zzbdj, zzpe, list, zzjj2.zzbdu);
                if (zzjj2.zzbdp != null) {
                    bundle = zzjj2.zzbdp.getBundle(mediationNativeAdapter.getClass().getName());
                }
                Bundle bundle2 = bundle;
                r1.f26796b = new asm(zzvd);
                mediationNativeAdapter.requestNativeAd((Context) C4296b.a(iObjectWrapper), r1.f26796b, m31508a(str, zzjj2, str2), asp, bundle2);
            } catch (Throwable th) {
                hx.m19914c("Could not request native ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationNativeAdapter: ";
            String valueOf = String.valueOf(r1.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, zzvd zzvd) throws RemoteException {
        zza(iObjectWrapper, zzjn, zzjj, str, null, zzvd);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException {
        zzjn zzjn2 = zzjn;
        zzjj zzjj2 = zzjj;
        if (this.f26795a instanceof MediationBannerAdapter) {
            hx.m19911b("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) r1.f26795a;
                Bundle bundle = null;
                ask ask = new ask(zzjj2.zzbdf == -1 ? null : new Date(zzjj2.zzbdf), zzjj2.zzbdg, zzjj2.zzbdh != null ? new HashSet(zzjj2.zzbdh) : null, zzjj2.zzbdn, m31509a(zzjj), zzjj2.zzbdj, zzjj2.zzbdu);
                if (zzjj2.zzbdp != null) {
                    bundle = zzjj2.zzbdp.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) C4296b.a(iObjectWrapper), new asm(zzvd), m31508a(str, zzjj2, str2), C2416m.a(zzjn2.width, zzjn2.height, zzjn2.zzbek), ask, bundle);
            } catch (Throwable th) {
                hx.m19914c("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationBannerAdapter: ";
            String valueOf = String.valueOf(r1.f26795a.getClass().getCanonicalName());
            hx.m19916e(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zza(zzjj zzjj, String str, String str2) throws RemoteException {
        if (this.f26795a instanceof MediationRewardedVideoAdAdapter) {
            hx.m19911b("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f26795a;
                Bundle bundle = null;
                MediationAdRequest ask = new ask(zzjj.zzbdf == -1 ? null : new Date(zzjj.zzbdf), zzjj.zzbdg, zzjj.zzbdh != null ? new HashSet(zzjj.zzbdh) : null, zzjj.zzbdn, m31509a(zzjj), zzjj.zzbdj, zzjj.zzbdu);
                if (zzjj.zzbdp != null) {
                    bundle = zzjj.zzbdp.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(ask, m31508a(str, zzjj, str2), bundle);
            } catch (Throwable th) {
                hx.m19914c("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String str3 = "MediationAdapter is not a MediationRewardedVideoAdAdapter: ";
            str = String.valueOf(this.f26795a.getClass().getCanonicalName());
            hx.m19916e(str.length() != 0 ? str3.concat(str) : new String(str3));
            throw new RemoteException();
        }
    }

    public final void zzc(zzjj zzjj, String str) throws RemoteException {
        zza(zzjj, str, null);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            ((OnContextChangedListener) this.f26795a).onContextChanged((Context) C4296b.a(iObjectWrapper));
        } catch (Throwable th) {
            hx.m19909a("Could not inform adapter of changed context", th);
        }
    }

    public final zzvj zzme() {
        C2418a a = this.f26796b.m27234a();
        return a instanceof C3778b ? new asn((C3778b) a) : null;
    }

    public final zzvm zzmf() {
        C2418a a = this.f26796b.m27234a();
        return a instanceof C3779c ? new aso((C3779c) a) : null;
    }

    public final Bundle zzmg() {
        if (this.f26795a instanceof zzapb) {
            return ((zzapb) this.f26795a).zzmg();
        }
        String str = "MediationAdapter is not a v2 MediationBannerAdapter: ";
        String valueOf = String.valueOf(this.f26795a.getClass().getCanonicalName());
        hx.m19916e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        return new Bundle();
    }

    public final Bundle zzmh() {
        return new Bundle();
    }

    public final boolean zzmi() {
        return this.f26795a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final zzqm zzmj() {
        NativeCustomTemplateAd b = this.f26796b.m27235b();
        return b instanceof aof ? ((aof) b).m27166a() : null;
    }
}
