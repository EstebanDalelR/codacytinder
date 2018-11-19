package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.common.C1672a.C1667b;
import com.facebook.common.C1672a.C1670e;
import com.facebook.common.C1672a.C1671f;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import com.tinder.api.ManagerWebServices;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;

public class WebDialog extends Dialog {
    /* renamed from: a */
    private static final int f4667a = C1671f.com_facebook_activity_theme;
    /* renamed from: m */
    private static volatile int f4668m;
    /* renamed from: b */
    private String f4669b;
    /* renamed from: c */
    private String f4670c;
    /* renamed from: d */
    private OnCompleteListener f4671d;
    /* renamed from: e */
    private WebView f4672e;
    /* renamed from: f */
    private ProgressDialog f4673f;
    /* renamed from: g */
    private ImageView f4674g;
    /* renamed from: h */
    private FrameLayout f4675h;
    /* renamed from: i */
    private C1695c f4676i;
    /* renamed from: j */
    private boolean f4677j;
    /* renamed from: k */
    private boolean f4678k;
    /* renamed from: l */
    private boolean f4679l;
    /* renamed from: n */
    private LayoutParams f4680n;

    /* renamed from: com.facebook.internal.WebDialog$1 */
    class C16891 implements OnCancelListener {
        /* renamed from: a */
        final /* synthetic */ WebDialog f4651a;

        C16891(WebDialog webDialog) {
            this.f4651a = webDialog;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f4651a.cancel();
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$2 */
    class C16902 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ WebDialog f4652a;

        C16902(WebDialog webDialog) {
            this.f4652a = webDialog;
        }

        public void onClick(View view) {
            this.f4652a.cancel();
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$4 */
    class C16924 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ WebDialog f4654a;

        C16924(WebDialog webDialog) {
            this.f4654a = webDialog;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus() == null) {
                view.requestFocus();
            }
            return null;
        }
    }

    public interface OnCompleteListener {
        void onComplete(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: com.facebook.internal.WebDialog$a */
    public static class C1693a {
        /* renamed from: a */
        private Context f4655a;
        /* renamed from: b */
        private String f4656b;
        /* renamed from: c */
        private String f4657c;
        /* renamed from: d */
        private int f4658d;
        /* renamed from: e */
        private OnCompleteListener f4659e;
        /* renamed from: f */
        private Bundle f4660f;
        /* renamed from: g */
        private AccessToken f4661g;

        public C1693a(Context context, String str, Bundle bundle) {
            if (!AccessToken.isCurrentAccessTokenActive()) {
                String a = Utility.m5755a(context);
                if (a != null) {
                    this.f4656b = a;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m5811a(context, str, bundle);
        }

        public C1693a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = Utility.m5755a(context);
            }
            C1749x.m6065a(str, "applicationId");
            this.f4656b = str;
            m5811a(context, str2, bundle);
        }

        /* renamed from: a */
        public C1693a m5812a(OnCompleteListener onCompleteListener) {
            this.f4659e = onCompleteListener;
            return this;
        }

        /* renamed from: a */
        public WebDialog mo1866a() {
            if (this.f4661g != null) {
                this.f4660f.putString("app_id", this.f4661g.getApplicationId());
                this.f4660f.putString("access_token", this.f4661g.getToken());
            } else {
                this.f4660f.putString("app_id", this.f4656b);
            }
            return WebDialog.m5824a(this.f4655a, this.f4657c, this.f4660f, this.f4658d, this.f4659e);
        }

        /* renamed from: b */
        public String m5814b() {
            return this.f4656b;
        }

        /* renamed from: c */
        public Context m5815c() {
            return this.f4655a;
        }

        /* renamed from: d */
        public int m5816d() {
            return this.f4658d;
        }

        /* renamed from: e */
        public Bundle m5817e() {
            return this.f4660f;
        }

        /* renamed from: f */
        public OnCompleteListener m5818f() {
            return this.f4659e;
        }

        /* renamed from: a */
        private void m5811a(Context context, String str, Bundle bundle) {
            this.f4655a = context;
            this.f4657c = str;
            if (bundle != null) {
                this.f4660f = bundle;
            } else {
                this.f4660f = new Bundle();
            }
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$b */
    private class C1694b extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ WebDialog f4662a;

        private C1694b(WebDialog webDialog) {
            this.f4662a = webDialog;
        }

        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            r6 = "FacebookSDK.WebDialog";
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "Redirect URL: ";
            r0.append(r1);
            r0.append(r7);
            r0 = r0.toString();
            com.facebook.internal.Utility.m5793b(r6, r0);
            r6 = r5.f4662a;
            r6 = r6.f4670c;
            r6 = r7.startsWith(r6);
            r0 = 1;
            if (r6 == 0) goto L_0x00a6;
        L_0x0023:
            r6 = r5.f4662a;
            r6 = r6.mo1854a(r7);
            r7 = "error";
            r7 = r6.getString(r7);
            if (r7 != 0) goto L_0x0037;
        L_0x0031:
            r7 = "error_type";
            r7 = r6.getString(r7);
        L_0x0037:
            r1 = "error_msg";
            r1 = r6.getString(r1);
            if (r1 != 0) goto L_0x0045;
        L_0x003f:
            r1 = "error_message";
            r1 = r6.getString(r1);
        L_0x0045:
            if (r1 != 0) goto L_0x004d;
        L_0x0047:
            r1 = "error_description";
            r1 = r6.getString(r1);
        L_0x004d:
            r2 = "error_code";
            r2 = r6.getString(r2);
            r3 = com.facebook.internal.Utility.m5785a(r2);
            r4 = -1;
            if (r3 != 0) goto L_0x005f;
        L_0x005a:
            r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x005f }
            goto L_0x0060;
        L_0x005f:
            r2 = -1;
        L_0x0060:
            r3 = com.facebook.internal.Utility.m5785a(r7);
            if (r3 == 0) goto L_0x0074;
        L_0x0066:
            r3 = com.facebook.internal.Utility.m5785a(r1);
            if (r3 == 0) goto L_0x0074;
        L_0x006c:
            if (r2 != r4) goto L_0x0074;
        L_0x006e:
            r7 = r5.f4662a;
            r7.m5839a(r6);
            goto L_0x00a5;
        L_0x0074:
            if (r7 == 0) goto L_0x008c;
        L_0x0076:
            r6 = "access_denied";
            r6 = r7.equals(r6);
            if (r6 != 0) goto L_0x0086;
        L_0x007e:
            r6 = "OAuthAccessDeniedException";
            r6 = r7.equals(r6);
            if (r6 == 0) goto L_0x008c;
        L_0x0086:
            r6 = r5.f4662a;
            r6.cancel();
            goto L_0x00a5;
        L_0x008c:
            r6 = 4201; // 0x1069 float:5.887E-42 double:2.0756E-320;
            if (r2 != r6) goto L_0x0096;
        L_0x0090:
            r6 = r5.f4662a;
            r6.cancel();
            goto L_0x00a5;
        L_0x0096:
            r6 = new com.facebook.FacebookRequestError;
            r6.<init>(r2, r7, r1);
            r7 = r5.f4662a;
            r2 = new com.facebook.FacebookServiceException;
            r2.<init>(r6, r1);
            r7.m5841a(r2);
        L_0x00a5:
            return r0;
        L_0x00a6:
            r6 = "fbconnect://cancel";
            r6 = r7.startsWith(r6);
            if (r6 == 0) goto L_0x00b4;
        L_0x00ae:
            r6 = r5.f4662a;
            r6.cancel();
            return r0;
        L_0x00b4:
            r6 = "touch";
            r6 = r7.contains(r6);
            r1 = 0;
            if (r6 == 0) goto L_0x00be;
        L_0x00bd:
            return r1;
        L_0x00be:
            r6 = r5.f4662a;	 Catch:{ ActivityNotFoundException -> 0x00d3 }
            r6 = r6.getContext();	 Catch:{ ActivityNotFoundException -> 0x00d3 }
            r2 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00d3 }
            r3 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x00d3 }
            r7 = android.net.Uri.parse(r7);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
            r2.<init>(r3, r7);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
            r6.startActivity(r2);	 Catch:{ ActivityNotFoundException -> 0x00d3 }
            return r0;
        L_0x00d3:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f4662a.m5841a(new FacebookDialogException(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            this.f4662a.m5841a(new FacebookDialogException(null, -11, null));
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Webview loading URL: ");
            stringBuilder.append(str);
            Utility.m5793b("FacebookSDK.WebDialog", stringBuilder.toString());
            super.onPageStarted(webView, str, bitmap);
            if (this.f4662a.f4678k == null) {
                this.f4662a.f4673f.show();
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f4662a.f4678k == null) {
                this.f4662a.f4673f.dismiss();
            }
            this.f4662a.f4675h.setBackgroundColor(0);
            this.f4662a.f4672e.setVisibility(0);
            this.f4662a.f4674g.setVisibility(0);
            this.f4662a.f4679l = true;
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$c */
    private class C1695c extends AsyncTask<Void, Void, String[]> {
        /* renamed from: a */
        final /* synthetic */ WebDialog f4663a;
        /* renamed from: b */
        private String f4664b;
        /* renamed from: c */
        private Bundle f4665c;
        /* renamed from: d */
        private Exception[] f4666d;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m5821a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m5820a((String[]) obj);
        }

        C1695c(WebDialog webDialog, String str, Bundle bundle) {
            this.f4663a = webDialog;
            this.f4664b = str;
            this.f4665c = bundle;
        }

        /* renamed from: a */
        protected java.lang.String[] m5821a(java.lang.Void... r10) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r9 = this;
            r10 = r9.f4665c;
            r0 = "media";
            r10 = r10.getStringArray(r0);
            r0 = r10.length;
            r0 = new java.lang.String[r0];
            r1 = r10.length;
            r1 = new java.lang.Exception[r1];
            r9.f4666d = r1;
            r1 = new java.util.concurrent.CountDownLatch;
            r2 = r10.length;
            r1.<init>(r2);
            r2 = new java.util.concurrent.ConcurrentLinkedQueue;
            r2.<init>();
            r3 = com.facebook.AccessToken.getCurrentAccessToken();
            r4 = 0;
        L_0x0020:
            r5 = 0;
            r6 = 1;
            r7 = r10.length;	 Catch:{ Exception -> 0x006d }
            if (r4 >= r7) goto L_0x0069;	 Catch:{ Exception -> 0x006d }
        L_0x0025:
            r7 = r9.isCancelled();	 Catch:{ Exception -> 0x006d }
            if (r7 == 0) goto L_0x0040;	 Catch:{ Exception -> 0x006d }
        L_0x002b:
            r10 = r2.iterator();	 Catch:{ Exception -> 0x006d }
        L_0x002f:
            r0 = r10.hasNext();	 Catch:{ Exception -> 0x006d }
            if (r0 == 0) goto L_0x003f;	 Catch:{ Exception -> 0x006d }
        L_0x0035:
            r0 = r10.next();	 Catch:{ Exception -> 0x006d }
            r0 = (android.os.AsyncTask) r0;	 Catch:{ Exception -> 0x006d }
            r0.cancel(r6);	 Catch:{ Exception -> 0x006d }
            goto L_0x002f;	 Catch:{ Exception -> 0x006d }
        L_0x003f:
            return r5;	 Catch:{ Exception -> 0x006d }
        L_0x0040:
            r7 = r10[r4];	 Catch:{ Exception -> 0x006d }
            r7 = android.net.Uri.parse(r7);	 Catch:{ Exception -> 0x006d }
            r8 = com.facebook.internal.Utility.m5794b(r7);	 Catch:{ Exception -> 0x006d }
            if (r8 == 0) goto L_0x0056;	 Catch:{ Exception -> 0x006d }
        L_0x004c:
            r7 = r7.toString();	 Catch:{ Exception -> 0x006d }
            r0[r4] = r7;	 Catch:{ Exception -> 0x006d }
            r1.countDown();	 Catch:{ Exception -> 0x006d }
            goto L_0x0066;	 Catch:{ Exception -> 0x006d }
        L_0x0056:
            r8 = new com.facebook.internal.WebDialog$c$1;	 Catch:{ Exception -> 0x006d }
            r8.<init>(r9, r0, r4, r1);	 Catch:{ Exception -> 0x006d }
            r7 = com.facebook.share.internal.C1838i.m6452a(r3, r7, r8);	 Catch:{ Exception -> 0x006d }
            r7 = r7.m4066j();	 Catch:{ Exception -> 0x006d }
            r2.add(r7);	 Catch:{ Exception -> 0x006d }
        L_0x0066:
            r4 = r4 + 1;	 Catch:{ Exception -> 0x006d }
            goto L_0x0020;	 Catch:{ Exception -> 0x006d }
        L_0x0069:
            r1.await();	 Catch:{ Exception -> 0x006d }
            return r0;
        L_0x006d:
            r10 = r2.iterator();
        L_0x0071:
            r0 = r10.hasNext();
            if (r0 == 0) goto L_0x0081;
        L_0x0077:
            r0 = r10.next();
            r0 = (android.os.AsyncTask) r0;
            r0.cancel(r6);
            goto L_0x0071;
        L_0x0081:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.c.a(java.lang.Void[]):java.lang.String[]");
        }

        /* renamed from: a */
        protected void m5820a(String[] strArr) {
            this.f4663a.f4673f.dismiss();
            for (Throwable th : this.f4666d) {
                if (th != null) {
                    this.f4663a.m5841a(th);
                    return;
                }
            }
            if (strArr == null) {
                this.f4663a.m5841a(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            strArr = Arrays.asList(strArr);
            if (strArr.contains(null)) {
                this.f4663a.m5841a(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            Utility.m5782a(this.f4665c, ManagerWebServices.PARAM_MEDIA, new JSONArray(strArr));
            String a = C1747v.m6054a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FacebookSdk.m3995f());
            stringBuilder.append("/");
            stringBuilder.append("dialog/");
            stringBuilder.append(this.f4664b);
            this.f4663a.f4669b = Utility.m5750a(a, stringBuilder.toString(), this.f4665c).toString();
            this.f4663a.m5831b((this.f4663a.f4674g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    /* renamed from: a */
    private int m5823a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            d = 0.5d + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d);
        }
        return (int) (((double) i) * d);
    }

    /* renamed from: a */
    protected static void m5828a(android.content.Context r2) {
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
        if (r2 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0029 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0029 }
        r2 = r0.getApplicationInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x0029 }
        if (r2 == 0) goto L_0x0028;
    L_0x0013:
        r0 = r2.metaData;
        if (r0 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0028;
    L_0x0018:
        r0 = f4668m;
        if (r0 != 0) goto L_0x0027;
    L_0x001c:
        r2 = r2.metaData;
        r0 = "com.facebook.sdk.WebDialogTheme";
        r2 = r2.getInt(r0);
        m5827a(r2);
    L_0x0027:
        return;
    L_0x0028:
        return;
    L_0x0029:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.a(android.content.Context):void");
    }

    /* renamed from: a */
    public static WebDialog m5824a(Context context, String str, Bundle bundle, int i, OnCompleteListener onCompleteListener) {
        m5828a(context);
        return new WebDialog(context, str, bundle, i, onCompleteListener);
    }

    /* renamed from: a */
    public static int m5822a() {
        C1749x.m6061a();
        return f4668m;
    }

    /* renamed from: a */
    public static void m5827a(int i) {
        if (i == 0) {
            i = f4667a;
        }
        f4668m = i;
    }

    protected WebDialog(Context context, String str) {
        this(context, str, m5822a());
    }

    private WebDialog(Context context, String str, int i) {
        if (i == 0) {
            i = m5822a();
        }
        super(context, i);
        this.f4670c = "fbconnect://success";
        this.f4677j = false;
        this.f4678k = false;
        this.f4679l = false;
        this.f4669b = str;
    }

    private WebDialog(Context context, String str, Bundle bundle, int i, OnCompleteListener onCompleteListener) {
        if (i == 0) {
            i = m5822a();
        }
        super(context, i);
        this.f4670c = "fbconnect://success";
        this.f4677j = false;
        this.f4678k = false;
        this.f4679l = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(QueryParams.REDIRECT_URI, "fbconnect://success");
        bundle.putString("display", "touch");
        bundle.putString("client_id", FacebookSdk.m3998i());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{FacebookSdk.m3996g()}));
        this.f4671d = onCompleteListener;
        if (str.equals("share") == null || bundle.containsKey(ManagerWebServices.PARAM_MEDIA) == null) {
            String a = C1747v.m6054a();
            i = new StringBuilder();
            i.append(FacebookSdk.m3995f());
            i.append("/");
            i.append("dialog/");
            i.append(str);
            this.f4669b = Utility.m5750a(a, i.toString(), bundle).toString();
            return;
        }
        this.f4676i = new C1695c(this, str, bundle);
    }

    /* renamed from: a */
    public void m5840a(OnCompleteListener onCompleteListener) {
        this.f4671d = onCompleteListener;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void dismiss() {
        if (this.f4672e != null) {
            this.f4672e.stopLoading();
        }
        if (!(this.f4678k || this.f4673f == null || !this.f4673f.isShowing())) {
            this.f4673f.dismiss();
        }
        super.dismiss();
    }

    protected void onStart() {
        super.onStart();
        if (this.f4676i == null || this.f4676i.getStatus() != Status.PENDING) {
            m5846e();
            return;
        }
        this.f4676i.execute(new Void[0]);
        this.f4673f.show();
    }

    protected void onStop() {
        if (this.f4676i != null) {
            this.f4676i.cancel(true);
            this.f4673f.dismiss();
        }
        super.onStop();
    }

    public void onDetachedFromWindow() {
        this.f4678k = true;
        super.onDetachedFromWindow();
    }

    public void onAttachedToWindow() {
        this.f4678k = false;
        if (Utility.m5803d(getContext()) && this.f4680n != null && this.f4680n.token == null) {
            this.f4680n.token = getOwnerActivity().getWindow().getAttributes().token;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Set token on onAttachedToWindow(): ");
            stringBuilder.append(this.f4680n.token);
            Utility.m5793b("FacebookSDK.WebDialog", stringBuilder.toString());
        }
        super.onAttachedToWindow();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f4680n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4673f = new ProgressDialog(getContext());
        this.f4673f.requestWindowFeature(1);
        this.f4673f.setMessage(getContext().getString(C1670e.com_facebook_loading));
        this.f4673f.setCanceledOnTouchOutside(false);
        this.f4673f.setOnCancelListener(new C16891(this));
        requestWindowFeature(1);
        this.f4675h = new FrameLayout(getContext());
        m5846e();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m5837f();
        if (this.f4669b != null) {
            m5831b((this.f4674g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f4675h.addView(this.f4674g, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f4675h);
    }

    /* renamed from: b */
    protected void m5842b(String str) {
        this.f4670c = str;
    }

    /* renamed from: a */
    protected Bundle mo1854a(String str) {
        str = Uri.parse(str);
        Bundle c = Utility.m5795c(str.getQuery());
        c.putAll(Utility.m5795c(str.getFragment()));
        return c;
    }

    /* renamed from: b */
    protected boolean m5843b() {
        return this.f4677j;
    }

    /* renamed from: c */
    protected boolean m5844c() {
        return this.f4679l;
    }

    /* renamed from: d */
    protected WebView m5845d() {
        return this.f4672e;
    }

    /* renamed from: e */
    public void m5846e() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(m5823a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m5823a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* renamed from: a */
    protected void m5839a(Bundle bundle) {
        if (this.f4671d != null && !this.f4677j) {
            this.f4677j = true;
            this.f4671d.onComplete(bundle, null);
            dismiss();
        }
    }

    /* renamed from: a */
    protected void m5841a(Throwable th) {
        if (this.f4671d != null && !this.f4677j) {
            this.f4677j = true;
            if (th instanceof FacebookException) {
                th = (FacebookException) th;
            } else {
                th = new FacebookException(th);
            }
            this.f4671d.onComplete(null, th);
            dismiss();
        }
    }

    public void cancel() {
        if (this.f4671d != null && !this.f4677j) {
            m5841a(new FacebookOperationCanceledException());
        }
    }

    /* renamed from: f */
    private void m5837f() {
        this.f4674g = new ImageView(getContext());
        this.f4674g.setOnClickListener(new C16902(this));
        this.f4674g.setImageDrawable(getContext().getResources().getDrawable(C1667b.com_facebook_close));
        this.f4674g.setVisibility(4);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: b */
    private void m5831b(int i) {
        View linearLayout = new LinearLayout(getContext());
        this.f4672e = new WebView(this, getContext()) {
            /* renamed from: a */
            final /* synthetic */ WebDialog f4653a;

            public void onWindowFocusChanged(boolean r1) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r0 = this;
                super.onWindowFocusChanged(r1);	 Catch:{ NullPointerException -> 0x0003 }
            L_0x0003:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.3.onWindowFocusChanged(boolean):void");
            }
        };
        this.f4672e.setVerticalScrollBarEnabled(false);
        this.f4672e.setHorizontalScrollBarEnabled(false);
        this.f4672e.setWebViewClient(new C1694b());
        this.f4672e.getSettings().setJavaScriptEnabled(true);
        this.f4672e.loadUrl(this.f4669b);
        this.f4672e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f4672e.setVisibility(4);
        this.f4672e.getSettings().setSavePassword(false);
        this.f4672e.getSettings().setSaveFormData(false);
        this.f4672e.setFocusable(true);
        this.f4672e.setFocusableInTouchMode(true);
        this.f4672e.setOnTouchListener(new C16924(this));
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f4672e);
        linearLayout.setBackgroundColor(-872415232);
        this.f4675h.addView(linearLayout);
    }
}
