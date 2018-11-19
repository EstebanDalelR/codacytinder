package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.amn;
import com.google.android.gms.internal.amp;
import com.google.android.gms.internal.ano;
import com.google.android.gms.internal.aro;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanm;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import com.google.android.gms.internal.zzzv;
import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.p */
public final class C2406p {
    @Nullable
    /* renamed from: a */
    public static View m8733a(@Nullable dl dlVar) {
        if (dlVar == null) {
            ec.c("AdState is null");
            return null;
        } else if (!C2406p.m8745b(dlVar) || dlVar.f15970b == null) {
            try {
                IObjectWrapper view = dlVar.f15983o != null ? dlVar.f15983o.getView() : null;
                if (view != null) {
                    return (View) C4296b.m17262a(view);
                }
                ec.e("View in mediation adapter is null.");
                return null;
            } catch (Throwable e) {
                ec.c("Could not get View from mediation adapter.", e);
                return null;
            }
        } else {
            zzanh zzanh = dlVar.f15970b;
            if (zzanh != null) {
                return (View) zzanh;
            }
            throw null;
        }
    }

    /* renamed from: a */
    static zzt<zzanh> m8734a(@Nullable zzvj zzvj, @Nullable zzvm zzvm, C2370c c2370c) {
        return new C3777u(zzvj, c2370c, zzvm);
    }

    /* renamed from: a */
    private static String m8736a(@Nullable Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            ec.e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        encodeToString = String.valueOf(encodeToString);
        return encodeToString.length() != 0 ? valueOf.concat(encodeToString) : new String(valueOf);
    }

    /* renamed from: a */
    static java.lang.String m8737a(@android.support.annotation.Nullable com.google.android.gms.internal.zzpq r1) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        if (r1 != 0) goto L_0x000a;
    L_0x0002:
        r1 = "Image is null. Returning empty string";
        com.google.android.gms.internal.ec.e(r1);
        r1 = "";
        return r1;
    L_0x000a:
        r0 = r1.getUri();	 Catch:{ RemoteException -> 0x0015 }
        if (r0 == 0) goto L_0x001a;	 Catch:{ RemoteException -> 0x0015 }
    L_0x0010:
        r0 = r0.toString();	 Catch:{ RemoteException -> 0x0015 }
        return r0;
    L_0x0015:
        r0 = "Unable to get image uri. Trying data uri next";
        com.google.android.gms.internal.ec.e(r0);
    L_0x001a:
        r1 = com.google.android.gms.ads.internal.C2406p.m8742b(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.p.a(com.google.android.gms.internal.zzpq):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m8740a(zzanh zzanh, aro aro, CountDownLatch countDownLatch) {
        zzanh zzanh2 = zzanh;
        aro aro2 = aro;
        CountDownLatch countDownLatch2 = countDownLatch;
        View view = null;
        boolean z = false;
        if (zzanh2 == null) {
            try {
                throw null;
            } catch (Throwable e) {
                ec.c("Unable to invoke load assets", e);
            } catch (RuntimeException e2) {
                RuntimeException runtimeException = e2;
                countDownLatch.countDown();
                throw runtimeException;
            }
        }
        String str;
        View view2 = (View) zzanh2;
        if (view2 == null) {
            str = "AdWebView is null";
        } else {
            view2.setVisibility(4);
            List list = aro2.f15663b.f15637p;
            if (list != null) {
                if (!list.isEmpty()) {
                    String str2;
                    ku zzsz;
                    zzanm c3773q;
                    zzanh.zzsz().a("/nativeExpressAssetsLoaded", new C3775s(countDownLatch2));
                    zzanh.zzsz().a("/nativeExpressAssetsLoadingFailed", new C3776t(countDownLatch2));
                    zzvj zzme = aro2.f15664c.zzme();
                    zzvm zzmf = aro2.f15664c.zzmf();
                    String callToAction;
                    if (list.contains("2") && zzme != null) {
                        String headline = zzme.getHeadline();
                        List images = zzme.getImages();
                        String body = zzme.getBody();
                        zzpq zzjs = zzme.zzjs();
                        callToAction = zzme.getCallToAction();
                        double starRating = zzme.getStarRating();
                        String store = zzme.getStore();
                        String price = zzme.getPrice();
                        Bundle extras = zzme.getExtras();
                        if (zzme.zzml() != null) {
                            view = (View) C4296b.m17262a(zzme.zzml());
                        }
                        amn amn = new amn(headline, images, body, zzjs, callToAction, starRating, store, price, null, extras, null, view, zzme.zzjx(), null);
                        str2 = aro2.f15663b.f15636o;
                        zzsz = zzanh.zzsz();
                        c3773q = new C3773q(amn, str2, zzanh2);
                    } else if (!list.contains("1") || zzmf == null) {
                        str = "No matching template id and mapper";
                    } else {
                        String headline2 = zzmf.getHeadline();
                        List images2 = zzmf.getImages();
                        String body2 = zzmf.getBody();
                        zzpq zzjz = zzmf.zzjz();
                        String callToAction2 = zzmf.getCallToAction();
                        callToAction = zzmf.getAdvertiser();
                        Bundle extras2 = zzmf.getExtras();
                        if (zzmf.zzml() != null) {
                            view = (View) C4296b.m17262a(zzmf.zzml());
                        }
                        amp amp = new amp(headline2, images2, body2, zzjz, callToAction2, callToAction, null, extras2, null, view, zzmf.zzjx(), null);
                        str2 = aro2.f15663b.f15636o;
                        zzsz = zzanh.zzsz();
                        c3773q = new C3774r(amp, str2, zzanh2);
                    }
                    zzsz.a(c3773q);
                    str2 = aro2.f15663b.f15634m;
                    String str3 = aro2.f15663b.f15635n;
                    if (str3 != null) {
                        zzanh2.loadDataWithBaseURL(str3, str2, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
                    } else {
                        zzanh2.loadData(str2, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8");
                    }
                    z = true;
                    if (!z) {
                        countDownLatch.countDown();
                    }
                    return z;
                }
            }
            str = "No template ids present in mediation response";
        }
        ec.e(str);
        if (z) {
            countDownLatch.countDown();
        }
        return z;
    }

    @Nullable
    /* renamed from: b */
    private static zzpq m8741b(Object obj) {
        return obj instanceof IBinder ? ano.a((IBinder) obj) : null;
    }

    /* renamed from: b */
    private static java.lang.String m8742b(com.google.android.gms.internal.zzpq r1) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = r1.zzjr();	 Catch:{ RemoteException -> 0x002b }
        if (r1 != 0) goto L_0x000e;	 Catch:{ RemoteException -> 0x002b }
    L_0x0006:
        r1 = "Drawable is null. Returning empty string";	 Catch:{ RemoteException -> 0x002b }
        com.google.android.gms.internal.ec.e(r1);	 Catch:{ RemoteException -> 0x002b }
        r1 = "";	 Catch:{ RemoteException -> 0x002b }
        return r1;	 Catch:{ RemoteException -> 0x002b }
    L_0x000e:
        r1 = com.google.android.gms.dynamic.C4296b.m17262a(r1);	 Catch:{ RemoteException -> 0x002b }
        r1 = (android.graphics.drawable.Drawable) r1;	 Catch:{ RemoteException -> 0x002b }
        r0 = r1 instanceof android.graphics.drawable.BitmapDrawable;
        if (r0 != 0) goto L_0x0020;
    L_0x0018:
        r1 = "Drawable is not an instance of BitmapDrawable. Returning empty string";
        com.google.android.gms.internal.ec.e(r1);
        r1 = "";
        return r1;
    L_0x0020:
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r1 = com.google.android.gms.ads.internal.C2406p.m8736a(r1);
        return r1;
    L_0x002b:
        r1 = "Unable to get drawable. Returning empty string";
        com.google.android.gms.internal.ec.e(r1);
        r1 = "";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.p.b(com.google.android.gms.internal.zzpq):java.lang.String");
    }

    /* renamed from: b */
    private static JSONObject m8743b(@Nullable Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                Object obj;
                if (ManagerWebServices.IG_PARAM_IMAGE.equals(jSONObject2.getString(str2))) {
                    obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        obj = C2406p.m8736a((Bitmap) obj);
                    } else {
                        str2 = "Invalid type. An image type extra should return a bitmap";
                        ec.e(str2);
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    str2 = "Invalid asset type. Bitmap should be returned only for image type";
                    ec.e(str2);
                } else {
                    obj = String.valueOf(bundle.get(str2));
                }
                jSONObject.put(str2, obj);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m8744b(zzanh zzanh) {
        OnClickListener onClickListener = zzanh.getOnClickListener();
        if (onClickListener == null) {
            return;
        }
        if (zzanh == null) {
            throw null;
        }
        onClickListener.onClick((View) zzanh);
    }

    /* renamed from: b */
    public static boolean m8745b(@Nullable dl dlVar) {
        return (dlVar == null || !dlVar.f15981m || dlVar.f15982n == null || dlVar.f15982n.f15634m == null) ? false : true;
    }
}
