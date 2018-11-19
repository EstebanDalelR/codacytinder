package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.C2335R;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.overlay.C4275c;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.util.Map;
import org.json.JSONObject;

@zzzv
final class ld extends FrameLayout implements zzanh {
    /* renamed from: a */
    private static final int f28758a = Color.argb(0, 0, 0, 0);
    /* renamed from: b */
    private final zzanh f28759b;
    /* renamed from: c */
    private final ju f28760c;

    public ld(zzanh zzanh) {
        super(zzanh.getContext());
        this.f28759b = zzanh;
        this.f28760c = new ju(zzanh.zzsu(), this, this);
        ku zzsz = this.f28759b.zzsz();
        if (zzsz != null) {
            zzsz.f16298a = this;
        }
        zzanh = this.f28759b;
        if (zzanh == null) {
            throw null;
        }
        addView((View) zzanh);
    }

    public final void destroy() {
        this.f28759b.destroy();
    }

    public final OnClickListener getOnClickListener() {
        return this.f28759b.getOnClickListener();
    }

    public final String getRequestId() {
        return this.f28759b.getRequestId();
    }

    public final int getRequestedOrientation() {
        return this.f28759b.getRequestedOrientation();
    }

    public final WebView getWebView() {
        return this.f28759b.getWebView();
    }

    public final boolean isDestroyed() {
        return this.f28759b.isDestroyed();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f28759b.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f28759b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f28759b.loadUrl(str);
    }

    public final void onPause() {
        this.f28760c.m19949b();
        this.f28759b.onPause();
    }

    public final void onResume() {
        this.f28759b.onResume();
    }

    public final void setContext(Context context) {
        this.f28759b.setContext(context);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f28759b.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f28759b.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.f28759b.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f28759b.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f28759b.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f28759b.stopLoading();
    }

    public final void zza(zzc zzc) {
        this.f28759b.zza(zzc);
    }

    public final void zza(agd agd) {
        this.f28759b.zza(agd);
    }

    public final void zza(li liVar) {
        this.f28759b.zza(liVar);
    }

    public final void zza(mb mbVar) {
        this.f28759b.zza(mbVar);
    }

    public final void zza(String str, zzt<? super zzanh> zzt) {
        this.f28759b.zza(str, (zzt) zzt);
    }

    public final void zza(String str, Map<String, ?> map) {
        this.f28759b.zza(str, (Map) map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.f28759b.zza(str, jSONObject);
    }

    public final void zza(boolean z, int i) {
        this.f28759b.zza(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.f28759b.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.f28759b.zza(z, i, str, str2);
    }

    public final void zzac(boolean z) {
        this.f28759b.zzac(z);
    }

    public final void zzad(boolean z) {
        this.f28759b.zzad(z);
    }

    public final void zzae(boolean z) {
        this.f28759b.zzae(z);
    }

    public final void zzaf(boolean z) {
        this.f28759b.zzaf(z);
    }

    public final void zzag(int i) {
        this.f28759b.zzag(i);
    }

    public final void zzag(boolean z) {
        this.f28759b.zzag(z);
    }

    public final void zzb(C4275c c4275c) {
        this.f28759b.zzb(c4275c);
    }

    public final void zzb(@Nullable zzoq zzoq) {
        this.f28759b.zzb(zzoq);
    }

    public final void zzb(String str, zzt<? super zzanh> zzt) {
        this.f28759b.zzb(str, (zzt) zzt);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.f28759b.zzb(str, jSONObject);
    }

    public final bn zzbq() {
        return this.f28759b.zzbq();
    }

    public final void zzc(C4275c c4275c) {
        this.f28759b.zzc(c4275c);
    }

    public final void zzcq() {
        this.f28759b.zzcq();
    }

    public final void zzcr() {
        this.f28759b.zzcr();
    }

    public final void zzcz(String str) {
        this.f28759b.zzcz(str);
    }

    public final void zzda(String str) {
        this.f28759b.zzda(str);
    }

    public final void zzmz() {
        this.f28759b.zzmz();
    }

    public final void zzna() {
        this.f28759b.zzna();
    }

    public final ju zzsf() {
        return this.f28760c;
    }

    public final li zzsg() {
        return this.f28759b.zzsg();
    }

    public final alz zzsh() {
        return this.f28759b.zzsh();
    }

    public final Activity zzsi() {
        return this.f28759b.zzsi();
    }

    public final ama zzsj() {
        return this.f28759b.zzsj();
    }

    public final zzakd zzsk() {
        return this.f28759b.zzsk();
    }

    public final int zzsl() {
        return getMeasuredHeight();
    }

    public final int zzsm() {
        return getMeasuredWidth();
    }

    public final void zzss() {
        this.f28759b.zzss();
    }

    public final void zzst() {
        this.f28759b.zzst();
    }

    public final Context zzsu() {
        return this.f28759b.zzsu();
    }

    public final C4275c zzsv() {
        return this.f28759b.zzsv();
    }

    public final C4275c zzsw() {
        return this.f28759b.zzsw();
    }

    public final mb zzsx() {
        return this.f28759b.zzsx();
    }

    public final String zzsy() {
        return this.f28759b.zzsy();
    }

    public final ku zzsz() {
        return this.f28759b.zzsz();
    }

    public final boolean zzta() {
        return this.f28759b.zzta();
    }

    public final tb zztb() {
        return this.f28759b.zztb();
    }

    public final boolean zztc() {
        return this.f28759b.zztc();
    }

    public final void zztd() {
        this.f28760c.m19950c();
        this.f28759b.zztd();
    }

    public final boolean zzte() {
        return this.f28759b.zzte();
    }

    public final boolean zztf() {
        return this.f28759b.zztf();
    }

    public final boolean zztg() {
        return this.f28759b.zztg();
    }

    public final void zzth() {
        this.f28759b.zzth();
    }

    public final void zzti() {
        this.f28759b.zzti();
    }

    @Nullable
    public final zzoq zztj() {
        return this.f28759b.zztj();
    }

    public final void zztk() {
        setBackgroundColor(f28758a);
        this.f28759b.setBackgroundColor(f28758a);
    }

    public final void zztl() {
        View textView = new TextView(getContext());
        Resources v = ar.i().m27324v();
        textView.setText(v != null ? v.getString(C2335R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }
}
