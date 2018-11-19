package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.ads.internal.js.zzm;
import com.google.android.gms.ads.internal.overlay.C4275c;
import com.google.android.gms.ads.internal.zzbl;
import java.util.Map;
import org.json.JSONObject;

@zzzv
public interface zzanh extends zza, zzm, zzbl, zzamp, zzaog, zzaoh, zzaou, zzaow, zzaox, zzaoy, zzgt {
    void destroy();

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    @Nullable
    OnClickListener getOnClickListener();

    ViewParent getParent();

    String getRequestId();

    int getRequestedOrientation();

    WebView getWebView();

    int getWidth();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, @Nullable String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setContext(Context context);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    void zza(li liVar);

    void zza(mb mbVar);

    void zza(String str, zzt<? super zzanh> zzt);

    void zza(String str, Map<String, ?> map);

    void zza(String str, JSONObject jSONObject);

    void zzad(boolean z);

    void zzae(boolean z);

    void zzaf(boolean z);

    void zzag(int i);

    void zzag(boolean z);

    void zzb(C4275c c4275c);

    void zzb(zzoq zzoq);

    void zzb(String str, zzt<? super zzanh> zzt);

    void zzb(String str, JSONObject jSONObject);

    bn zzbq();

    void zzc(C4275c c4275c);

    void zzcz(String str);

    void zzda(String str);

    void zzmz();

    @Nullable
    li zzsg();

    @Nullable
    alz zzsh();

    Activity zzsi();

    ama zzsj();

    zzakd zzsk();

    void zzss();

    void zzst();

    Context zzsu();

    C4275c zzsv();

    C4275c zzsw();

    mb zzsx();

    String zzsy();

    @Nullable
    ku zzsz();

    boolean zzta();

    tb zztb();

    boolean zztc();

    void zztd();

    boolean zzte();

    boolean zztf();

    boolean zztg();

    void zzth();

    void zzti();

    zzoq zztj();

    void zztk();

    void zztl();
}
