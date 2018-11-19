package io.branch.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import org.json.JSONObject;

public class BranchViewHandler {
    /* renamed from: a */
    private static BranchViewHandler f48121a;
    /* renamed from: b */
    private boolean f48122b;
    /* renamed from: c */
    private boolean f48123c;
    /* renamed from: d */
    private C15565a f48124d = null;
    /* renamed from: e */
    private boolean f48125e = false;
    /* renamed from: f */
    private String f48126f;
    /* renamed from: g */
    private boolean f48127g;
    /* renamed from: h */
    private Dialog f48128h;

    /* renamed from: io.branch.referral.BranchViewHandler$a */
    private class C15565a {
        /* renamed from: a */
        final /* synthetic */ BranchViewHandler f48111a;
        /* renamed from: b */
        private String f48112b;
        /* renamed from: c */
        private String f48113c;
        /* renamed from: d */
        private int f48114d;
        /* renamed from: e */
        private String f48115e;
        /* renamed from: f */
        private String f48116f;

        private C15565a(io.branch.referral.BranchViewHandler r1, org.json.JSONObject r2, java.lang.String r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r0.f48111a = r1;
            r0.<init>();
            r1 = "";
            r0.f48112b = r1;
            r1 = "";
            r0.f48113c = r1;
            r1 = 1;
            r0.f48114d = r1;
            r1 = "";
            r0.f48115e = r1;
            r1 = "";
            r0.f48116f = r1;
            r0.f48113c = r3;	 Catch:{ Exception -> 0x007a }
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewID;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x007a }
        L_0x0026:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewID;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getString(r1);	 Catch:{ Exception -> 0x007a }
            r0.f48112b = r1;	 Catch:{ Exception -> 0x007a }
        L_0x0032:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewNumOfUse;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x007a }
        L_0x003e:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewNumOfUse;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getInt(r1);	 Catch:{ Exception -> 0x007a }
            r0.f48114d = r1;	 Catch:{ Exception -> 0x007a }
        L_0x004a:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewUrl;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x0062;	 Catch:{ Exception -> 0x007a }
        L_0x0056:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewUrl;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getString(r1);	 Catch:{ Exception -> 0x007a }
            r0.f48115e = r1;	 Catch:{ Exception -> 0x007a }
        L_0x0062:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewHtml;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x007a;	 Catch:{ Exception -> 0x007a }
        L_0x006e:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewHtml;	 Catch:{ Exception -> 0x007a }
            r1 = r1.getKey();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getString(r1);	 Catch:{ Exception -> 0x007a }
            r0.f48116f = r1;	 Catch:{ Exception -> 0x007a }
        L_0x007a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.BranchViewHandler.a.<init>(io.branch.referral.BranchViewHandler, org.json.JSONObject, java.lang.String):void");
        }

        /* renamed from: a */
        private boolean m58181a(Context context) {
            if (this.f48114d <= C15593m.m58388a(context).m58463y(this.f48112b)) {
                if (this.f48114d != -1) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: a */
        public void m58186a(Context context, String str) {
            C15593m.m58388a(context).m58462x(str);
        }
    }

    /* renamed from: io.branch.referral.BranchViewHandler$b */
    private class C15566b extends AsyncTask<Void, Void, Boolean> {
        /* renamed from: a */
        final /* synthetic */ BranchViewHandler f48117a;
        /* renamed from: b */
        private final C15565a f48118b;
        /* renamed from: c */
        private final Context f48119c;
        /* renamed from: d */
        private final BranchViewHandler$IBranchViewEvents f48120d;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m58187a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m58188a((Boolean) obj);
        }

        public C15566b(BranchViewHandler branchViewHandler, C15565a c15565a, Context context, BranchViewHandler$IBranchViewEvents branchViewHandler$IBranchViewEvents) {
            this.f48117a = branchViewHandler;
            this.f48118b = c15565a;
            this.f48119c = context;
            this.f48120d = branchViewHandler$IBranchViewEvents;
        }

        /* renamed from: a */
        protected java.lang.Boolean m58187a(java.lang.Void... r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r8 = 0;
            r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
            r1 = -1;
            r2 = new java.net.URL;	 Catch:{ Exception -> 0x004c }
            r3 = r7.f48118b;	 Catch:{ Exception -> 0x004c }
            r3 = r3.f48115e;	 Catch:{ Exception -> 0x004c }
            r2.<init>(r3);	 Catch:{ Exception -> 0x004c }
            r2 = r2.openConnection();	 Catch:{ Exception -> 0x004c }
            r2 = (java.net.HttpURLConnection) r2;	 Catch:{ Exception -> 0x004c }
            r3 = "GET";	 Catch:{ Exception -> 0x004c }
            r2.setRequestMethod(r3);	 Catch:{ Exception -> 0x004c }
            r2.connect();	 Catch:{ Exception -> 0x004c }
            r3 = r2.getResponseCode();	 Catch:{ Exception -> 0x004c }
            if (r3 != r0) goto L_0x004d;
        L_0x0023:
            r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x004d }
            r4.<init>();	 Catch:{ Exception -> 0x004d }
            r2 = r2.getInputStream();	 Catch:{ Exception -> 0x004d }
            r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Exception -> 0x004d }
            r5 = new byte[r5];	 Catch:{ Exception -> 0x004d }
        L_0x0030:
            r6 = r2.read(r5);	 Catch:{ Exception -> 0x004d }
            if (r6 == r1) goto L_0x003a;	 Catch:{ Exception -> 0x004d }
        L_0x0036:
            r4.write(r5, r8, r6);	 Catch:{ Exception -> 0x004d }
            goto L_0x0030;	 Catch:{ Exception -> 0x004d }
        L_0x003a:
            r1 = r7.f48118b;	 Catch:{ Exception -> 0x004d }
            r5 = "UTF-8";	 Catch:{ Exception -> 0x004d }
            r5 = r4.toString(r5);	 Catch:{ Exception -> 0x004d }
            r1.f48116f = r5;	 Catch:{ Exception -> 0x004d }
            r4.close();	 Catch:{ Exception -> 0x004d }
            r2.close();	 Catch:{ Exception -> 0x004d }
            goto L_0x004d;
        L_0x004c:
            r3 = -1;
        L_0x004d:
            if (r3 != r0) goto L_0x0050;
        L_0x004f:
            r8 = 1;
        L_0x0050:
            r8 = java.lang.Boolean.valueOf(r8);
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.BranchViewHandler.b.a(java.lang.Void[]):java.lang.Boolean");
        }

        /* renamed from: a */
        protected void m58188a(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue() != null) {
                this.f48117a.m58200b(this.f48118b, this.f48119c, this.f48120d);
            } else if (this.f48120d != null) {
                this.f48120d.onBranchViewError(-202, "Unable to create a Branch view due to a temporary network error", this.f48118b.f48113c);
            }
            this.f48117a.f48125e = false;
        }
    }

    private BranchViewHandler() {
    }

    /* renamed from: a */
    public static BranchViewHandler m58191a() {
        if (f48121a == null) {
            f48121a = new BranchViewHandler();
        }
        return f48121a;
    }

    /* renamed from: a */
    public boolean m58205a(Context context) {
        context = m58196a(this.f48124d, context, null);
        if (context != null) {
            this.f48124d = null;
        }
        return context;
    }

    /* renamed from: a */
    public boolean m58207a(JSONObject jSONObject, String str, Context context, BranchViewHandler$IBranchViewEvents branchViewHandler$IBranchViewEvents) {
        return m58196a(new C15565a(jSONObject, str), context, branchViewHandler$IBranchViewEvents);
    }

    /* renamed from: a */
    private boolean m58196a(C15565a c15565a, Context context, BranchViewHandler$IBranchViewEvents branchViewHandler$IBranchViewEvents) {
        if (!this.f48122b) {
            if (!this.f48125e) {
                this.f48122b = false;
                this.f48123c = false;
                if (!(context == null || c15565a == null)) {
                    if (c15565a.m58181a(context)) {
                        if (TextUtils.isEmpty(c15565a.f48116f)) {
                            this.f48125e = true;
                            new C15566b(this, c15565a, context, branchViewHandler$IBranchViewEvents).execute(new Void[0]);
                        } else {
                            m58200b(c15565a, context, branchViewHandler$IBranchViewEvents);
                        }
                        return true;
                    } else if (branchViewHandler$IBranchViewEvents != null) {
                        branchViewHandler$IBranchViewEvents.onBranchViewError(-203, "Unable to create this Branch view. Reached maximum usage limit ", c15565a.f48113c);
                    }
                }
                return false;
            }
        }
        if (branchViewHandler$IBranchViewEvents != null) {
            branchViewHandler$IBranchViewEvents.onBranchViewError(-200, "Unable to create a Branch view. A Branch view is already showing", c15565a.f48113c);
        }
        return false;
    }

    /* renamed from: b */
    private void m58200b(final C15565a c15565a, Context context, final BranchViewHandler$IBranchViewEvents branchViewHandler$IBranchViewEvents) {
        if (!(context == null || c15565a == null)) {
            final WebView webView = new WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            if (VERSION.SDK_INT >= 19) {
                webView.setLayerType(2, null);
            }
            this.f48127g = null;
            if (TextUtils.isEmpty(c15565a.f48116f) == null) {
                webView.loadDataWithBaseURL(null, c15565a.f48116f, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                webView.setWebViewClient(new WebViewClient(this) {
                    /* renamed from: d */
                    final /* synthetic */ BranchViewHandler f48107d;

                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        boolean a = this.f48107d.m58199a(str);
                        if (!a) {
                            webView.loadUrl(str);
                        } else if (this.f48107d.f48128h != null) {
                            this.f48107d.f48128h.dismiss();
                        }
                        return a;
                    }

                    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        super.onPageStarted(webView, str, bitmap);
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        this.f48107d.f48127g = 1;
                    }

                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        this.f48107d.m58193a(c15565a, branchViewHandler$IBranchViewEvents, webView);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m58193a(final C15565a c15565a, final BranchViewHandler$IBranchViewEvents branchViewHandler$IBranchViewEvents, WebView webView) {
        if (this.f48127g || Branch.b() == null || Branch.b().f12589e == null) {
            this.f48122b = false;
            if (branchViewHandler$IBranchViewEvents != null) {
                branchViewHandler$IBranchViewEvents.onBranchViewError(-202, "Unable to create a Branch view due to a temporary network error", c15565a.f48113c);
            }
        } else {
            Activity activity = (Activity) Branch.b().f12589e.get();
            if (activity != null) {
                c15565a.m58186a(activity.getApplicationContext(), c15565a.f48112b);
                this.f48126f = activity.getClass().getName();
                View relativeLayout = new RelativeLayout(activity);
                relativeLayout.setVisibility(8);
                relativeLayout.addView(webView, new LayoutParams(-1, -1));
                relativeLayout.setBackgroundColor(0);
                if (this.f48128h == null || !this.f48128h.isShowing()) {
                    this.f48128h = new Dialog(activity, 16973834);
                    this.f48128h.setContentView(relativeLayout);
                    relativeLayout.setVisibility(0);
                    webView.setVisibility(0);
                    this.f48128h.show();
                    m58192a(relativeLayout);
                    m58192a((View) webView);
                    this.f48122b = true;
                    if (branchViewHandler$IBranchViewEvents != null) {
                        branchViewHandler$IBranchViewEvents.onBranchViewVisible(c15565a.f48113c, c15565a.f48112b);
                    }
                    this.f48128h.setOnDismissListener(new OnDismissListener(this) {
                        /* renamed from: c */
                        final /* synthetic */ BranchViewHandler f48110c;

                        public void onDismiss(DialogInterface dialogInterface) {
                            this.f48110c.f48122b = false;
                            this.f48110c.f48128h = null;
                            if (branchViewHandler$IBranchViewEvents == null) {
                                return;
                            }
                            if (this.f48110c.f48123c != null) {
                                branchViewHandler$IBranchViewEvents.onBranchViewAccepted(c15565a.f48113c, c15565a.f48112b);
                            } else {
                                branchViewHandler$IBranchViewEvents.onBranchViewCancelled(c15565a.f48113c, c15565a.f48112b);
                            }
                        }
                    });
                } else {
                    if (branchViewHandler$IBranchViewEvents != null) {
                        branchViewHandler$IBranchViewEvents.onBranchViewError(-200, "Unable to create a Branch view. A Branch view is already showing", c15565a.f48113c);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m58199a(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = 0;
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0032 }
        r1.<init>(r5);	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r1.getScheme();	 Catch:{ URISyntaxException -> 0x0032 }
        r2 = "branch-cta";	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r5.equalsIgnoreCase(r2);	 Catch:{ URISyntaxException -> 0x0032 }
        r2 = 1;	 Catch:{ URISyntaxException -> 0x0032 }
        if (r5 == 0) goto L_0x0032;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x0013:
        r5 = r1.getHost();	 Catch:{ URISyntaxException -> 0x0032 }
        r3 = "accept";	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r5.equalsIgnoreCase(r3);	 Catch:{ URISyntaxException -> 0x0032 }
        if (r5 == 0) goto L_0x0023;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x001f:
        r4.f48123c = r2;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x0021:
        r0 = 1;	 Catch:{ URISyntaxException -> 0x0032 }
        goto L_0x0032;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x0023:
        r5 = r1.getHost();	 Catch:{ URISyntaxException -> 0x0032 }
        r1 = "cancel";	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r5.equalsIgnoreCase(r1);	 Catch:{ URISyntaxException -> 0x0032 }
        if (r5 == 0) goto L_0x0032;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x002f:
        r4.f48123c = r0;	 Catch:{ URISyntaxException -> 0x0032 }
        goto L_0x0021;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.BranchViewHandler.a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private void m58192a(View view) {
        Animation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setStartOffset(10);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public boolean m58206a(JSONObject jSONObject, String str) {
        C15565a c15565a = new C15565a(jSONObject, str);
        if (!(c15565a == null || Branch.b().f12589e == null)) {
            Context context = (Activity) Branch.b().f12589e.get();
            if (context != null && c15565a.m58181a(context)) {
                this.f48124d = new C15565a(jSONObject, str);
                return true;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m58208b(Context context) {
        return (this.f48124d == null || this.f48124d.m58181a(context) == null) ? null : true;
    }

    /* renamed from: a */
    public void m58204a(Activity activity) {
        if (this.f48126f != null && this.f48126f.equalsIgnoreCase(activity.getClass().getName()) != null) {
            this.f48122b = null;
        }
    }
}
