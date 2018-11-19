package com.tinder.apprating.view;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class AppRatingDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private AppRatingDialog f33718b;
    /* renamed from: c */
    private View f33719c;
    /* renamed from: d */
    private View f33720d;
    /* renamed from: e */
    private View f33721e;
    /* renamed from: f */
    private View f33722f;
    /* renamed from: g */
    private View f33723g;

    @UiThread
    public AppRatingDialog_ViewBinding(final AppRatingDialog appRatingDialog, View view) {
        this.f33718b = appRatingDialog;
        View a = C0761c.a(view, R.id.continueSwipingButton, "method 'continueSwipingButtonOnClick'");
        this.f33719c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppRatingDialog_ViewBinding f33709b;

            public void doClick(View view) {
                appRatingDialog.continueSwipingButtonOnClick();
            }
        });
        a = C0761c.a(view, R.id.cancelFeedbackView, "method 'continueSwipingButtonOnClick'");
        this.f33720d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppRatingDialog_ViewBinding f33711b;

            public void doClick(View view) {
                appRatingDialog.continueSwipingButtonOnClick();
            }
        });
        a = C0761c.a(view, R.id.continueButtonThankYouView, "method 'continueSwipingButtonOnClick'");
        this.f33721e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppRatingDialog_ViewBinding f33713b;

            public void doClick(View view) {
                appRatingDialog.continueSwipingButtonOnClick();
            }
        });
        a = C0761c.a(view, R.id.sendButton, "method 'sendButtonOnClick'");
        this.f33722f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppRatingDialog_ViewBinding f33715b;

            public void doClick(View view) {
                appRatingDialog.sendButtonOnClick();
            }
        });
        view = C0761c.a(view, R.id.reviewButton, "method 'reviewButtonClick'");
        this.f33723g = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ AppRatingDialog_ViewBinding f33717b;

            public void doClick(View view) {
                appRatingDialog.reviewButtonClick();
            }
        });
    }

    public void unbind() {
        if (this.f33718b == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f33718b = null;
        this.f33719c.setOnClickListener(null);
        this.f33719c = null;
        this.f33720d.setOnClickListener(null);
        this.f33720d = null;
        this.f33721e.setOnClickListener(null);
        this.f33721e = null;
        this.f33722f.setOnClickListener(null);
        this.f33722f = null;
        this.f33723g.setOnClickListener(null);
        this.f33723g = null;
    }
}
