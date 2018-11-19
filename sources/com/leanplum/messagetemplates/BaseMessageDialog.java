package com.leanplum.messagetemplates;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.leanplum.Leanplum;
import com.leanplum.utils.BitmapUtil;
import com.leanplum.utils.SizeUtil;
import com.leanplum.views.BackgroundImageView;
import com.leanplum.views.CloseButton;

public class BaseMessageDialog extends Dialog {
    /* renamed from: a */
    private boolean f21356a;
    protected Activity activity;
    /* renamed from: b */
    private boolean f21357b;
    /* renamed from: c */
    private boolean f21358c;
    protected RelativeLayout dialogView;
    protected C5748a htmlOptions$6b189a4a;
    protected BaseMessageOptions options;
    protected WebInterstitialOptions webOptions;
    protected WebView webView;

    /* renamed from: com.leanplum.messagetemplates.BaseMessageDialog$1 */
    final class C57391 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ BaseMessageDialog f21348a;

        /* renamed from: com.leanplum.messagetemplates.BaseMessageDialog$1$1 */
        final class C57381 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C57391 f21347a;

            C57381(C57391 c57391) {
                this.f21347a = c57391;
            }

            public final void run() {
                if (this.f21347a.f21348a.f21357b && this.f21347a.f21348a.webView != null) {
                    this.f21347a.f21348a.webView.stopLoading();
                    this.f21347a.f21348a.webView.loadUrl("");
                    if (this.f21347a.f21348a.dialogView != null) {
                        this.f21347a.f21348a.dialogView.removeAllViews();
                    }
                    this.f21347a.f21348a.webView.removeAllViews();
                    this.f21347a.f21348a.webView.destroy();
                }
            }
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        C57391(BaseMessageDialog baseMessageDialog) {
            this.f21348a = baseMessageDialog;
        }

        public final void onAnimationEnd(Animation animation) {
            super.cancel();
            new Handler().postDelayed(new C57381(this), 10);
        }
    }

    /* renamed from: com.leanplum.messagetemplates.BaseMessageDialog$2 */
    final class C57402 implements OnClickListener {
        /* renamed from: a */
        private /* synthetic */ BaseMessageDialog f21349a;

        C57402(BaseMessageDialog baseMessageDialog) {
            this.f21349a = baseMessageDialog;
        }

        public final void onClick(View view) {
            this.f21349a.cancel();
        }
    }

    /* renamed from: com.leanplum.messagetemplates.BaseMessageDialog$3 */
    final class C57413 extends WebViewClient {
        /* renamed from: a */
        private /* synthetic */ BaseMessageDialog f21350a;

        C57413(BaseMessageDialog baseMessageDialog) {
            this.f21350a = baseMessageDialog;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.contains(this.f21350a.webOptions.getCloseUrl()) == null) {
                return false;
            }
            this.f21350a.cancel();
            webView = str.split("\\?");
            if (webView.length > 1) {
                for (String split : webView[1].split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length > 1 && split2[0].equals("result")) {
                        Leanplum.track(split2[1]);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.leanplum.messagetemplates.BaseMessageDialog$4 */
    final class C57424 implements OnTouchListener {
        /* renamed from: a */
        private /* synthetic */ BaseMessageDialog f21351a;

        C57424(BaseMessageDialog baseMessageDialog) {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent.getAction() == 2 ? true : null;
        }
    }

    /* renamed from: com.leanplum.messagetemplates.BaseMessageDialog$5 */
    final class C57435 implements OnLongClickListener {
        /* renamed from: a */
        private /* synthetic */ BaseMessageDialog f21352a;

        public final boolean onLongClick(View view) {
            return true;
        }

        C57435(BaseMessageDialog baseMessageDialog) {
        }
    }

    /* renamed from: com.leanplum.messagetemplates.BaseMessageDialog$7 */
    final class C57457 implements OnClickListener {
        /* renamed from: a */
        private /* synthetic */ BaseMessageDialog f21355a;

        C57457(BaseMessageDialog baseMessageDialog) {
            this.f21355a = baseMessageDialog;
        }

        public final void onClick(View view) {
            if (this.f21355a.f21358c == null) {
                this.f21355a.options.accept();
                this.f21355a.cancel();
            }
        }
    }

    public void onWindowFocusChanged(boolean r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.webView;	 Catch:{ Throwable -> 0x0011 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ Throwable -> 0x0011 }
    L_0x0004:
        if (r2 == 0) goto L_0x000c;	 Catch:{ Throwable -> 0x0011 }
    L_0x0006:
        r0 = r1.webView;	 Catch:{ Throwable -> 0x0011 }
        r0.onResume();	 Catch:{ Throwable -> 0x0011 }
        goto L_0x0011;	 Catch:{ Throwable -> 0x0011 }
    L_0x000c:
        r0 = r1.webView;	 Catch:{ Throwable -> 0x0011 }
        r0.onPause();	 Catch:{ Throwable -> 0x0011 }
    L_0x0011:
        super.onWindowFocusChanged(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.BaseMessageDialog.onWindowFocusChanged(boolean):void");
    }

    /* renamed from: a */
    private static Animation m25218a() {
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(350);
        return alphaAnimation;
    }

    /* renamed from: b */
    private static Animation m25226b() {
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(350);
        return alphaAnimation;
    }

    public void cancel() {
        if (!this.f21358c) {
            this.f21358c = true;
            Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setInterpolator(new AccelerateInterpolator());
            alphaAnimation.setDuration(350);
            alphaAnimation.setAnimationListener(new C57391(this));
            this.dialogView.startAnimation(alphaAnimation);
        }
    }

    /* renamed from: a */
    private CloseButton m25222a(Activity activity, boolean z, View view) {
        CloseButton closeButton = new CloseButton(activity);
        closeButton.setId(103);
        activity = new LayoutParams(-2, -2);
        if (z) {
            activity.addRule(true, this.dialogView.getId());
            activity.addRule(true, this.dialogView.getId());
            activity.setMargins(0, SizeUtil.dp5, SizeUtil.dp5, 0);
        } else {
            activity.addRule(true, view.getId());
            activity.addRule(true, view.getId());
            activity.setMargins(0, -SizeUtil.dp7, -SizeUtil.dp7, 0);
        }
        closeButton.setLayoutParams(activity);
        closeButton.setOnClickListener(new C57402(this));
        return closeButton;
    }

    /* renamed from: a */
    private RelativeLayout m25220a(Activity activity, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        final Dialog dialog = this;
        Context context = activity;
        boolean z2 = z;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        if (z2) {
            layoutParams = new LayoutParams(-1, -1);
        } else if (dialog.f21357b) {
            r6 = SizeUtil.dpToPx(context, dialog.htmlOptions$6b189a4a.m25256b());
            C5750c c = dialog.htmlOptions$6b189a4a.m25257c();
            if (c != null) {
                if (!TextUtils.isEmpty(c.f21390b)) {
                    i = c.f21389a;
                    if ("%".equals(c.f21390b)) {
                        r7 = (SizeUtil.getDisplaySize(activity).x * i) / 100;
                    } else {
                        r7 = SizeUtil.dpToPx(context, i);
                    }
                    layoutParams = new LayoutParams(r7, r6);
                    layoutParams.addRule(14, -1);
                    r7 = dialog.htmlOptions$6b189a4a.m25254a((Activity) context);
                    if ("Bottom".equals(dialog.htmlOptions$6b189a4a.m25259e())) {
                        layoutParams.topMargin = r7;
                    } else {
                        layoutParams.bottomMargin = r7;
                    }
                }
            }
            layoutParams = new LayoutParams(-1, r6);
            layoutParams.addRule(14, -1);
            r7 = dialog.htmlOptions$6b189a4a.m25254a((Activity) context);
            if ("Bottom".equals(dialog.htmlOptions$6b189a4a.m25259e())) {
                layoutParams.topMargin = r7;
            } else {
                layoutParams.bottomMargin = r7;
            }
        } else {
            Point displaySize = SizeUtil.getDisplaySize(activity);
            r7 = SizeUtil.dpToPx(context, ((CenterPopupOptions) dialog.options).getWidth());
            i = SizeUtil.dpToPx(context, ((CenterPopupOptions) dialog.options).getHeight());
            int i2 = displaySize.x - SizeUtil.dp20;
            r6 = displaySize.y - SizeUtil.dp20;
            double d = (double) r7;
            double d2 = d / ((double) i);
            if (r7 > i2 && ((int) (d / d2)) < r6) {
                i = (int) (((double) i2) / d2);
                r7 = i2;
            }
            if (i <= r6 || ((int) (((double) i) * d2)) >= i2) {
                r6 = i;
            } else {
                r7 = (int) (((double) r6) * d2);
            }
            ViewGroup.LayoutParams layoutParams2 = new LayoutParams(r7, r6);
            layoutParams2.addRule(13, -1);
            layoutParams = layoutParams2;
        }
        relativeLayout.setLayoutParams(layoutParams);
        Drawable shapeDrawable = new ShapeDrawable();
        if (z2) {
            i = 0;
        } else {
            i = SizeUtil.dp20;
        }
        shapeDrawable.setShape(m25217a(i));
        shapeDrawable.getPaint().setColor(0);
        if (VERSION.SDK_INT >= 16) {
            relativeLayout.setBackground(shapeDrawable);
        } else {
            relativeLayout.setBackgroundDrawable(shapeDrawable);
        }
        View relativeLayout2;
        if (!dialog.f21356a && !dialog.f21357b) {
            View backgroundImageView = new BackgroundImageView(context, z2);
            backgroundImageView.setScaleType(ScaleType.CENTER_CROP);
            int i3 = !z2 ? SizeUtil.dp20 : 0;
            backgroundImageView.setImageBitmap(dialog.options.getBackgroundImage());
            Drawable shapeDrawable2 = new ShapeDrawable();
            shapeDrawable2.setShape(m25217a(i3));
            shapeDrawable2.getPaint().setColor(dialog.options.getBackgroundColor());
            if (VERSION.SDK_INT >= 16) {
                backgroundImageView.setBackground(shapeDrawable2);
            } else {
                backgroundImageView.setBackgroundDrawable(shapeDrawable2);
            }
            backgroundImageView.setLayoutParams(new LayoutParams(-1, -1));
            relativeLayout.addView(backgroundImageView, backgroundImageView.getLayoutParams());
            relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            backgroundImageView = new TextView(context);
            backgroundImageView.setPadding(0, SizeUtil.dp5, 0, SizeUtil.dp5);
            backgroundImageView.setGravity(17);
            backgroundImageView.setText(dialog.options.getTitle());
            backgroundImageView.setTextColor(dialog.options.getTitleColor());
            backgroundImageView.setTextSize(2, 20.0f);
            backgroundImageView.setTypeface(null, 1);
            ViewGroup.LayoutParams layoutParams3 = new LayoutParams(-1, -2);
            layoutParams3.addRule(14, -1);
            layoutParams3.addRule(15, -1);
            backgroundImageView.setLayoutParams(layoutParams3);
            relativeLayout2.addView(backgroundImageView, backgroundImageView.getLayoutParams());
            relativeLayout2.setId(104);
            relativeLayout.addView(relativeLayout2, relativeLayout2.getLayoutParams());
            backgroundImageView = new TextView(context);
            layoutParams3 = new LayoutParams(-2, -2);
            layoutParams3.addRule(12, -1);
            layoutParams3.addRule(14, -1);
            layoutParams3.setMargins(0, 0, 0, SizeUtil.dp5);
            backgroundImageView.setPadding(SizeUtil.dp20, SizeUtil.dp5, SizeUtil.dp20, SizeUtil.dp5);
            backgroundImageView.setLayoutParams(layoutParams3);
            backgroundImageView.setText(dialog.options.getAcceptButtonText());
            backgroundImageView.setTextColor(dialog.options.getAcceptButtonTextColor());
            backgroundImageView.setTypeface(null, 1);
            BitmapUtil.stateBackgroundDarkerByPercentage(backgroundImageView, dialog.options.getAcceptButtonBackgroundColor(), 30);
            backgroundImageView.setTextSize(2, 18.0f);
            backgroundImageView.setOnClickListener(new C57457(dialog));
            backgroundImageView.setId(105);
            relativeLayout.addView(backgroundImageView, backgroundImageView.getLayoutParams());
            View textView = new TextView(context);
            textView.setLayoutParams(new LayoutParams(-1, -1));
            textView.setGravity(17);
            textView.setText(dialog.options.getMessageText());
            textView.setTextColor(dialog.options.getMessageColor());
            textView.setTextSize(2, 18.0f);
            ((LayoutParams) textView.getLayoutParams()).addRule(3, relativeLayout2.getId());
            ((LayoutParams) textView.getLayoutParams()).addRule(2, backgroundImageView.getId());
            relativeLayout.addView(textView, textView.getLayoutParams());
        } else if (dialog.f21356a) {
            relativeLayout2 = new WebView(context);
            relativeLayout2.setLayoutParams(new LayoutParams(-1, -1));
            relativeLayout2.setWebViewClient(new C57413(dialog));
            relativeLayout2.loadUrl(dialog.webOptions.getUrl());
            relativeLayout.addView(relativeLayout2, relativeLayout2.getLayoutParams());
        } else {
            dialog.dialogView.setVisibility(8);
            WebView webView = new WebView(context);
            webView.setBackgroundColor(0);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setOnTouchListener(new C57424(dialog));
            webView.canGoBack();
            webView.setLongClickable(false);
            webView.setHapticFeedbackEnabled(false);
            webView.setOnLongClickListener(new C57435(dialog));
            WebSettings settings = webView.getSettings();
            if (VERSION.SDK_INT >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
            settings.setAppCacheEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setLoadWithOverviewMode(true);
            settings.setLoadsImagesAutomatically(true);
            if (VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(true);
                settings.setAllowUniversalAccessFromFileURLs(true);
            }
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            settings.setSupportZoom(false);
            webView.setLayoutParams(new LayoutParams(-1, -1));
            webView.setWebChromeClient(new WebChromeClient());
            webView.setWebViewClient(new WebViewClient(dialog) {
                /* renamed from: b */
                private /* synthetic */ BaseMessageDialog f21354b;

                public final boolean shouldOverrideUrlLoading(android.webkit.WebView r9, java.lang.String r10) {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r8 = this;
                    r9 = r8.f21354b;
                    r9 = r9.htmlOptions$6b189a4a;
                    r9 = r9.m25264j();
                    r9 = r10.contains(r9);
                    r0 = 0;
                    r1 = 1;
                    if (r9 == 0) goto L_0x002d;
                L_0x0010:
                    r9 = r8.f21354b;
                    r9 = r9.dialogView;
                    r9.setVisibility(r0);
                    r9 = r8.f21354b;
                    r9 = r9.activity;
                    if (r9 == 0) goto L_0x002c;
                L_0x001d:
                    r9 = r8.f21354b;
                    r9 = r9.activity;
                    r9 = r9.isFinishing();
                    if (r9 != 0) goto L_0x002c;
                L_0x0027:
                    r9 = r8;
                    r9.show();
                L_0x002c:
                    return r1;
                L_0x002d:
                    r9 = r8.f21354b;
                    r9 = r9.htmlOptions$6b189a4a;
                    r9 = r9.m25266l();
                    r9 = r10.contains(r9);
                    if (r9 == 0) goto L_0x0052;
                L_0x003b:
                    r9 = r8.f21354b;
                    r9.cancel();
                    r9 = r8.f21354b;
                    r0 = "result";
                    r9 = com.leanplum.messagetemplates.BaseMessageDialog.m25224a(r10, r0);
                    r10 = android.text.TextUtils.isEmpty(r9);
                    if (r10 != 0) goto L_0x0051;
                L_0x004e:
                    com.leanplum.Leanplum.track(r9);
                L_0x0051:
                    return r1;
                L_0x0052:
                    r9 = r8.f21354b;
                    r9 = r9.htmlOptions$6b189a4a;
                    r9 = r9.m25263i();
                    r9 = r10.contains(r9);
                    if (r9 == 0) goto L_0x00c3;
                L_0x0060:
                    r9 = r8.f21354b;
                    r0 = "event";
                    r3 = com.leanplum.messagetemplates.BaseMessageDialog.m25224a(r10, r0);
                    r9 = android.text.TextUtils.isEmpty(r3);
                    if (r9 != 0) goto L_0x00c2;
                L_0x006e:
                    r9 = r8.f21354b;
                    r0 = "value";
                    r9 = com.leanplum.messagetemplates.BaseMessageDialog.m25224a(r10, r0);
                    r4 = java.lang.Double.parseDouble(r9);
                    r9 = java.lang.Double.valueOf(r4);
                    r0 = r8.f21354b;
                    r2 = "info";
                    r6 = com.leanplum.messagetemplates.BaseMessageDialog.m25224a(r10, r2);
                    r0 = 0;
                    r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x009a }
                    r4 = r8.f21354b;	 Catch:{ Exception -> 0x009a }
                    r5 = "parameters";	 Catch:{ Exception -> 0x009a }
                    r4 = com.leanplum.messagetemplates.BaseMessageDialog.m25224a(r10, r5);	 Catch:{ Exception -> 0x009a }
                    r2.<init>(r4);	 Catch:{ Exception -> 0x009a }
                    r2 = com.leanplum.ActionContext.mapFromJson(r2);	 Catch:{ Exception -> 0x009a }
                    r7 = r2;
                    goto L_0x009b;
                L_0x009a:
                    r7 = r0;
                L_0x009b:
                    r0 = r8.f21354b;
                    r2 = "isMessageEvent";
                    r10 = com.leanplum.messagetemplates.BaseMessageDialog.m25224a(r10, r2);
                    r0 = "true";
                    r10 = r10.equals(r0);
                    if (r10 == 0) goto L_0x00bb;
                L_0x00ab:
                    r10 = r8.f21354b;
                    r10 = r10.htmlOptions$6b189a4a;
                    r2 = r10.m25260f();
                    r4 = r9.doubleValue();
                    r2.trackMessageEvent(r3, r4, r6, r7);
                    goto L_0x00c2;
                L_0x00bb:
                    r9 = r9.doubleValue();
                    com.leanplum.Leanplum.track(r3, r9, r6, r7);
                L_0x00c2:
                    return r1;
                L_0x00c3:
                    r9 = r8.f21354b;
                    r9 = r9.htmlOptions$6b189a4a;
                    r9 = r9.m25265k();
                    r9 = r10.contains(r9);
                    if (r9 != 0) goto L_0x00e1;
                L_0x00d1:
                    r9 = r8.f21354b;
                    r9 = r9.htmlOptions$6b189a4a;
                    r9 = r9.m25262h();
                    r9 = r10.contains(r9);
                    if (r9 == 0) goto L_0x00e0;
                L_0x00df:
                    goto L_0x00e1;
                L_0x00e0:
                    return r0;
                L_0x00e1:
                    r9 = r8.f21354b;
                    r9.cancel();
                    r9 = r8.f21354b;
                    r0 = "action";
                    r9 = com.leanplum.messagetemplates.BaseMessageDialog.m25224a(r10, r0);
                    r0 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00f5 }
                    r0 = java.net.URLDecoder.decode(r9, r0);	 Catch:{ UnsupportedEncodingException -> 0x00f5 }
                    r9 = r0;
                L_0x00f5:
                    r0 = r8.f21354b;
                    r0 = r0.htmlOptions$6b189a4a;
                    r0 = r0.m25260f();
                    r2 = android.text.TextUtils.isEmpty(r9);
                    if (r2 != 0) goto L_0x011a;
                L_0x0103:
                    if (r0 == 0) goto L_0x011a;
                L_0x0105:
                    r2 = r8.f21354b;
                    r2 = r2.htmlOptions$6b189a4a;
                    r2 = r2.m25265k();
                    r10 = r10.contains(r2);
                    if (r10 == 0) goto L_0x0117;
                L_0x0113:
                    r0.runActionNamed(r9);
                    goto L_0x011a;
                L_0x0117:
                    r0.runTrackedActionNamed(r9);
                L_0x011a:
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.BaseMessageDialog.6.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
                }
            });
            webView.loadDataWithBaseURL(null, dialog.htmlOptions$6b189a4a.m25261g(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
            dialog.webView = webView;
            relativeLayout.addView(dialog.webView, dialog.webView.getLayoutParams());
        }
        return relativeLayout;
    }

    /* renamed from: a */
    private static Shape m25217a(int i) {
        r0 = new float[8];
        i = (float) i;
        r0[0] = i;
        r0[1] = i;
        r0[2] = i;
        r0[3] = i;
        r0[4] = i;
        r0[5] = i;
        r0[6] = i;
        r0[7] = i;
        return new RoundRectShape(r0, null, null);
    }

    /* renamed from: a */
    private ImageView m25219a(Context context, boolean z) {
        ImageView backgroundImageView = new BackgroundImageView(context, z);
        backgroundImageView.setScaleType(ScaleType.CENTER_CROP);
        int i = !z ? SizeUtil.dp20 : null;
        backgroundImageView.setImageBitmap(this.options.getBackgroundImage());
        z = new ShapeDrawable();
        z.setShape(m25217a(i));
        z.getPaint().setColor(this.options.getBackgroundColor());
        if (VERSION.SDK_INT >= 16) {
            backgroundImageView.setBackground(z);
        } else {
            backgroundImageView.setBackgroundDrawable(z);
        }
        backgroundImageView.setLayoutParams(new LayoutParams(-1, -1));
        return backgroundImageView;
    }

    /* renamed from: a */
    private RelativeLayout m25221a(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View textView = new TextView(context);
        textView.setPadding(0, SizeUtil.dp5, 0, SizeUtil.dp5);
        textView.setGravity(17);
        textView.setText(this.options.getTitle());
        textView.setTextColor(this.options.getTitleColor());
        textView.setTextSize(2, 20.0f);
        textView.setTypeface(null, 1);
        context = new LayoutParams(-1, -2);
        context.addRule(14, -1);
        context.addRule(15, -1);
        textView.setLayoutParams(context);
        relativeLayout.addView(textView, textView.getLayoutParams());
        return relativeLayout;
    }

    /* renamed from: b */
    private TextView m25227b(Context context) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LayoutParams(-1, -1));
        textView.setGravity(17);
        textView.setText(this.options.getMessageText());
        textView.setTextColor(this.options.getMessageColor());
        textView.setTextSize(2, 18.0f);
        return textView;
    }

    /* renamed from: c */
    private WebView m25229c(Context context) {
        WebView webView = new WebView(context);
        webView.setLayoutParams(new LayoutParams(-1, -1));
        webView.setWebViewClient(new C57413(this));
        webView.loadUrl(this.webOptions.getUrl());
        return webView;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: d */
    private WebView m25231d(Context context) {
        this.dialogView.setVisibility(8);
        WebView webView = new WebView(context);
        webView.setBackgroundColor(0);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setOnTouchListener(new C57424(this));
        webView.canGoBack();
        webView.setLongClickable(false);
        webView.setHapticFeedbackEnabled(false);
        webView.setOnLongClickListener(new C57435(this));
        WebSettings settings = webView.getSettings();
        if (VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        settings.setAppCacheEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setLoadsImagesAutomatically(true);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(false);
        webView.setLayoutParams(new LayoutParams(-1, -1));
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(/* anonymous class already generated */);
        webView.loadDataWithBaseURL(null, this.htmlOptions$6b189a4a.m25261g(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
        return webView;
    }

    /* renamed from: a */
    private static java.lang.String m25224a(java.lang.String r7, java.lang.String r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "";
        r1 = "\\?";
        r7 = r7.split(r1);
        r1 = r7.length;
        r2 = 1;
        if (r1 <= r2) goto L_0x0033;
    L_0x000c:
        r7 = r7[r2];
        r1 = "&";
        r7 = r7.split(r1);
        r1 = r7.length;
        r3 = 0;
        r4 = r0;
        r0 = 0;
    L_0x0018:
        if (r0 >= r1) goto L_0x0032;
    L_0x001a:
        r5 = r7[r0];
        r6 = "=";
        r5 = r5.split(r6);
        r6 = r5.length;
        if (r6 <= r2) goto L_0x002f;
    L_0x0025:
        r6 = r5[r3];
        r6 = r6.equals(r8);
        if (r6 == 0) goto L_0x002f;
    L_0x002d:
        r4 = r5[r2];
    L_0x002f:
        r0 = r0 + 1;
        goto L_0x0018;
    L_0x0032:
        r0 = r4;
    L_0x0033:
        r7 = "UTF-8";	 Catch:{ Exception -> 0x003a }
        r7 = java.net.URLDecoder.decode(r0, r7);	 Catch:{ Exception -> 0x003a }
        goto L_0x003b;
    L_0x003a:
        r7 = r0;
    L_0x003b:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.messagetemplates.BaseMessageDialog.a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    private TextView m25232e(Context context) {
        View textView = new TextView(context);
        context = new LayoutParams(-2, -2);
        context.addRule(12, -1);
        context.addRule(14, -1);
        context.setMargins(0, 0, 0, SizeUtil.dp5);
        textView.setPadding(SizeUtil.dp20, SizeUtil.dp5, SizeUtil.dp20, SizeUtil.dp5);
        textView.setLayoutParams(context);
        textView.setText(this.options.getAcceptButtonText());
        textView.setTextColor(this.options.getAcceptButtonTextColor());
        textView.setTypeface(null, 1);
        BitmapUtil.stateBackgroundDarkerByPercentage(textView, this.options.getAcceptButtonBackgroundColor(), 30);
        textView.setTextSize(2, 18.0f);
        textView.setOnClickListener(new C57457(this));
        return textView;
    }

    /* renamed from: a */
    private static int m25216a(Activity activity) {
        return ((activity.getWindow().getAttributes().flags & 1024) == 1024 ? true : null) != null ? 16973841 : 16973840;
    }

    protected BaseMessageDialog(Activity activity, boolean z, BaseMessageOptions baseMessageOptions, WebInterstitialOptions webInterstitialOptions, C5748a c5748a) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        int i2;
        final Dialog dialog = this;
        Context context = activity;
        boolean z2 = z;
        WebInterstitialOptions webInterstitialOptions2 = webInterstitialOptions;
        C5748a c5748a2 = c5748a;
        super(context, ((activity.getWindow().getAttributes().flags & 1024) == 1024 ? 1 : null) != null ? 16973841 : 16973840);
        dialog.f21356a = false;
        dialog.f21357b = false;
        dialog.f21358c = false;
        SizeUtil.init(activity);
        dialog.activity = context;
        dialog.options = baseMessageOptions;
        dialog.webOptions = webInterstitialOptions2;
        dialog.htmlOptions$6b189a4a = c5748a2;
        if (webInterstitialOptions2 != null) {
            dialog.f21356a = true;
        }
        if (c5748a2 != null) {
            dialog.f21357b = true;
        }
        dialog.dialogView = new RelativeLayout(context);
        ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        dialog.dialogView.setBackgroundColor(0);
        dialog.dialogView.setLayoutParams(layoutParams2);
        View relativeLayout = new RelativeLayout(context);
        if (z2) {
            layoutParams = new LayoutParams(-1, -1);
        } else if (dialog.f21357b) {
            r10 = SizeUtil.dpToPx(context, dialog.htmlOptions$6b189a4a.m25256b());
            C5750c c = dialog.htmlOptions$6b189a4a.m25257c();
            if (c != null) {
                if (!TextUtils.isEmpty(c.f21390b)) {
                    r12 = c.f21389a;
                    if ("%".equals(c.f21390b)) {
                        r11 = (SizeUtil.getDisplaySize(activity).x * r12) / 100;
                    } else {
                        r11 = SizeUtil.dpToPx(context, r12);
                    }
                    layoutParams = new LayoutParams(r11, r10);
                    layoutParams.addRule(14, -1);
                    r11 = dialog.htmlOptions$6b189a4a.m25254a((Activity) context);
                    if ("Bottom".equals(dialog.htmlOptions$6b189a4a.m25259e())) {
                        layoutParams.topMargin = r11;
                    } else {
                        layoutParams.bottomMargin = r11;
                    }
                }
            }
            layoutParams = new LayoutParams(-1, r10);
            layoutParams.addRule(14, -1);
            r11 = dialog.htmlOptions$6b189a4a.m25254a((Activity) context);
            if ("Bottom".equals(dialog.htmlOptions$6b189a4a.m25259e())) {
                layoutParams.topMargin = r11;
            } else {
                layoutParams.bottomMargin = r11;
            }
        } else {
            Point displaySize = SizeUtil.getDisplaySize(activity);
            r11 = SizeUtil.dpToPx(context, ((CenterPopupOptions) dialog.options).getWidth());
            r12 = SizeUtil.dpToPx(context, ((CenterPopupOptions) dialog.options).getHeight());
            i = displaySize.x - SizeUtil.dp20;
            r10 = displaySize.y - SizeUtil.dp20;
            double d = (double) r11;
            double d2 = d / ((double) r12);
            if (r11 > i && ((int) (d / d2)) < r10) {
                r12 = (int) (((double) i) / d2);
                r11 = i;
            }
            if (r12 <= r10 || ((int) (((double) r12) * d2)) >= i) {
                r10 = r12;
            } else {
                r11 = (int) (((double) r10) * d2);
            }
            ViewGroup.LayoutParams layoutParams3 = new LayoutParams(r11, r10);
            layoutParams3.addRule(13, -1);
            layoutParams = layoutParams3;
        }
        relativeLayout.setLayoutParams(layoutParams);
        Drawable shapeDrawable = new ShapeDrawable();
        if (z2) {
            i2 = 0;
        } else {
            i2 = SizeUtil.dp20;
        }
        shapeDrawable.setShape(m25217a(i2));
        shapeDrawable.getPaint().setColor(0);
        if (VERSION.SDK_INT >= 16) {
            relativeLayout.setBackground(shapeDrawable);
        } else {
            relativeLayout.setBackgroundDrawable(shapeDrawable);
        }
        View backgroundImageView;
        if (!dialog.f21356a && !dialog.f21357b) {
            backgroundImageView = new BackgroundImageView(context, z2);
            backgroundImageView.setScaleType(ScaleType.CENTER_CROP);
            i = !z2 ? SizeUtil.dp20 : 0;
            backgroundImageView.setImageBitmap(dialog.options.getBackgroundImage());
            Drawable shapeDrawable2 = new ShapeDrawable();
            shapeDrawable2.setShape(m25217a(i));
            shapeDrawable2.getPaint().setColor(dialog.options.getBackgroundColor());
            if (VERSION.SDK_INT >= 16) {
                backgroundImageView.setBackground(shapeDrawable2);
            } else {
                backgroundImageView.setBackgroundDrawable(shapeDrawable2);
            }
            backgroundImageView.setLayoutParams(new LayoutParams(-1, -1));
            relativeLayout.addView(backgroundImageView, backgroundImageView.getLayoutParams());
            backgroundImageView = new RelativeLayout(context);
            backgroundImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            View textView = new TextView(context);
            textView.setPadding(0, SizeUtil.dp5, 0, SizeUtil.dp5);
            textView.setGravity(17);
            textView.setText(dialog.options.getTitle());
            textView.setTextColor(dialog.options.getTitleColor());
            textView.setTextSize(2, 20.0f);
            textView.setTypeface(null, 1);
            ViewGroup.LayoutParams layoutParams4 = new LayoutParams(-1, -2);
            layoutParams4.addRule(14, -1);
            layoutParams4.addRule(15, -1);
            textView.setLayoutParams(layoutParams4);
            backgroundImageView.addView(textView, textView.getLayoutParams());
            backgroundImageView.setId(104);
            relativeLayout.addView(backgroundImageView, backgroundImageView.getLayoutParams());
            textView = new TextView(context);
            layoutParams4 = new LayoutParams(-2, -2);
            layoutParams4.addRule(12, -1);
            layoutParams4.addRule(14, -1);
            layoutParams4.setMargins(0, 0, 0, SizeUtil.dp5);
            textView.setPadding(SizeUtil.dp20, SizeUtil.dp5, SizeUtil.dp20, SizeUtil.dp5);
            textView.setLayoutParams(layoutParams4);
            textView.setText(dialog.options.getAcceptButtonText());
            textView.setTextColor(dialog.options.getAcceptButtonTextColor());
            textView.setTypeface(null, 1);
            BitmapUtil.stateBackgroundDarkerByPercentage(textView, dialog.options.getAcceptButtonBackgroundColor(), 30);
            textView.setTextSize(2, 18.0f);
            textView.setOnClickListener(new C57457(dialog));
            textView.setId(105);
            relativeLayout.addView(textView, textView.getLayoutParams());
            View textView2 = new TextView(context);
            textView2.setLayoutParams(new LayoutParams(-1, -1));
            textView2.setGravity(17);
            textView2.setText(dialog.options.getMessageText());
            textView2.setTextColor(dialog.options.getMessageColor());
            textView2.setTextSize(2, 18.0f);
            ((LayoutParams) textView2.getLayoutParams()).addRule(3, backgroundImageView.getId());
            ((LayoutParams) textView2.getLayoutParams()).addRule(2, textView.getId());
            relativeLayout.addView(textView2, textView2.getLayoutParams());
        } else if (dialog.f21356a) {
            backgroundImageView = new WebView(context);
            backgroundImageView.setLayoutParams(new LayoutParams(-1, -1));
            backgroundImageView.setWebViewClient(new C57413(dialog));
            backgroundImageView.loadUrl(dialog.webOptions.getUrl());
            relativeLayout.addView(backgroundImageView, backgroundImageView.getLayoutParams());
        } else {
            dialog.dialogView.setVisibility(8);
            WebView webView = new WebView(context);
            webView.setBackgroundColor(0);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.setOnTouchListener(new C57424(dialog));
            webView.canGoBack();
            webView.setLongClickable(false);
            webView.setHapticFeedbackEnabled(false);
            webView.setOnLongClickListener(new C57435(dialog));
            WebSettings settings = webView.getSettings();
            if (VERSION.SDK_INT >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
            settings.setAppCacheEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setLoadWithOverviewMode(true);
            settings.setLoadsImagesAutomatically(true);
            if (VERSION.SDK_INT >= 16) {
                settings.setAllowFileAccessFromFileURLs(true);
                settings.setAllowUniversalAccessFromFileURLs(true);
            }
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            settings.setSupportZoom(false);
            webView.setLayoutParams(new LayoutParams(-1, -1));
            webView.setWebChromeClient(new WebChromeClient());
            webView.setWebViewClient(/* anonymous class already generated */);
            webView.loadDataWithBaseURL(null, dialog.htmlOptions$6b189a4a.m25261g(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
            dialog.webView = webView;
            relativeLayout.addView(dialog.webView, dialog.webView.getLayoutParams());
        }
        relativeLayout.setId(108);
        dialog.dialogView.addView(relativeLayout, relativeLayout.getLayoutParams());
        if ((!dialog.f21356a || (webInterstitialOptions2 != null && webInterstitialOptions.hasDismissButton())) && !dialog.f21357b) {
            View closeButton = new CloseButton(context);
            closeButton.setId(103);
            ViewGroup.LayoutParams layoutParams5 = new LayoutParams(-2, -2);
            if (z2) {
                layoutParams5.addRule(10, dialog.dialogView.getId());
                layoutParams5.addRule(11, dialog.dialogView.getId());
                layoutParams5.setMargins(0, SizeUtil.dp5, SizeUtil.dp5, 0);
            } else {
                layoutParams5.addRule(6, relativeLayout.getId());
                layoutParams5.addRule(7, relativeLayout.getId());
                layoutParams5.setMargins(0, -SizeUtil.dp7, -SizeUtil.dp7, 0);
            }
            closeButton.setLayoutParams(layoutParams5);
            closeButton.setOnClickListener(new C57402(dialog));
            dialog.dialogView.addView(closeButton, closeButton.getLayoutParams());
        }
        setContentView(dialog.dialogView, dialog.dialogView.getLayoutParams());
        RelativeLayout relativeLayout2 = dialog.dialogView;
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(350);
        relativeLayout2.setAnimation(alphaAnimation);
        if (!z2) {
            Window window = getWindow();
            if (window != null) {
                if (dialog.f21357b) {
                    window.clearFlags(2);
                    window.setFlags(32, 32);
                    if (c5748a2 != null && "Bottom".equals(c5748a.m25259e())) {
                        dialog.dialogView.setGravity(80);
                    }
                } else {
                    window.addFlags(2);
                    if (VERSION.SDK_INT >= 14) {
                        window.setDimAmount(0.7f);
                    }
                }
            }
        }
    }
}
