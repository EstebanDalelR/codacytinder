package com.tinder.crashindicator.view;

import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class AppCrashDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private AppCrashDialog f35095b;
    /* renamed from: c */
    private View f35096c;
    /* renamed from: d */
    private View f35097d;
    /* renamed from: e */
    private View f35098e;
    /* renamed from: f */
    private View f35099f;
    /* renamed from: g */
    private View f35100g;

    @UiThread
    public AppCrashDialog_ViewBinding(final AppCrashDialog appCrashDialog, View view) {
        this.f35095b = appCrashDialog;
        View a = C0761c.a(view, R.id.sendFeedbackButton, "method 'sendFeedbackButtonOnClick'");
        this.f35096c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppCrashDialog_ViewBinding f35086b;

            public void doClick(View view) {
                appCrashDialog.sendFeedbackButtonOnClick();
            }
        });
        a = C0761c.a(view, R.id.continueSwipingButton, "method 'continueSwipingButtonOnClick'");
        this.f35097d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppCrashDialog_ViewBinding f35088b;

            public void doClick(View view) {
                appCrashDialog.continueSwipingButtonOnClick();
            }
        });
        a = C0761c.a(view, R.id.continueButtonThankYouView, "method 'continueSwipingButtonOnClick'");
        this.f35098e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppCrashDialog_ViewBinding f35090b;

            public void doClick(View view) {
                appCrashDialog.continueSwipingButtonOnClick();
            }
        });
        a = C0761c.a(view, R.id.cancelFeedbackView, "method 'cancelFeedbackButtonOnClick'");
        this.f35099f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppCrashDialog_ViewBinding f35092b;

            public void doClick(View view) {
                appCrashDialog.cancelFeedbackButtonOnClick();
            }
        });
        a = C0761c.a(view, R.id.sendButton, "method 'sendButtonOnClick'");
        this.f35100g = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppCrashDialog_ViewBinding f35094b;

            public void doClick(View view) {
                appCrashDialog.sendButtonOnClick();
            }
        });
        view = view.getContext();
        appCrashDialog.activeButtonText = C0432b.c(view, R.color.red3);
        appCrashDialog.inActiveButtonText = C0432b.c(view, R.color.tinder_gray);
    }

    public void unbind() {
        if (this.f35095b == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f35095b = null;
        this.f35096c.setOnClickListener(null);
        this.f35096c = null;
        this.f35097d.setOnClickListener(null);
        this.f35097d = null;
        this.f35098e.setOnClickListener(null);
        this.f35098e = null;
        this.f35099f.setOnClickListener(null);
        this.f35099f = null;
        this.f35100g.setOnClickListener(null);
        this.f35100g = null;
    }
}
