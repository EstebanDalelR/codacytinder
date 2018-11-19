package com.tinder.profile.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class CensorMenuDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private CensorMenuDialog f50049b;
    /* renamed from: c */
    private View f50050c;
    /* renamed from: d */
    private View f50051d;
    /* renamed from: e */
    private View f50052e;
    /* renamed from: f */
    private View f50053f;
    /* renamed from: g */
    private View f50054g;

    @UiThread
    public CensorMenuDialog_ViewBinding(final CensorMenuDialog censorMenuDialog, View view) {
        this.f50049b = censorMenuDialog;
        View a = C0761c.a(view, R.id.btn_mute, "field 'muteButton' and method 'onMute'");
        censorMenuDialog.muteButton = (TextView) C0761c.c(a, R.id.btn_mute, "field 'muteButton'", TextView.class);
        this.f50050c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ CensorMenuDialog_ViewBinding f50040b;

            public void doClick(View view) {
                censorMenuDialog.onMute();
            }
        });
        a = C0761c.a(view, R.id.btn_un_mute, "field 'unMuteButton' and method 'onUnMute'");
        censorMenuDialog.unMuteButton = (TextView) C0761c.c(a, R.id.btn_un_mute, "field 'unMuteButton'", TextView.class);
        this.f50051d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ CensorMenuDialog_ViewBinding f50042b;

            public void doClick(View view) {
                censorMenuDialog.onUnMute();
            }
        });
        censorMenuDialog.viewSeperator1 = C0761c.a(view, R.id.view_separator1, "field 'viewSeperator1'");
        a = C0761c.a(view, R.id.btn_unmatch, "field 'unmatchButton' and method 'onUnmatch'");
        censorMenuDialog.unmatchButton = a;
        this.f50052e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ CensorMenuDialog_ViewBinding f50044b;

            public void doClick(View view) {
                censorMenuDialog.onUnmatch();
            }
        });
        censorMenuDialog.viewSeparator2 = C0761c.a(view, R.id.view_separator2, "field 'viewSeparator2'");
        a = C0761c.a(view, R.id.btn_report, "field 'reportButton' and method 'onReportUser'");
        censorMenuDialog.reportButton = a;
        this.f50053f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ CensorMenuDialog_ViewBinding f50046b;

            public void doClick(View view) {
                censorMenuDialog.onReportUser();
            }
        });
        view = C0761c.a(view, R.id.btn_recommend, "field 'recommendButton' and method 'onRecommend'");
        censorMenuDialog.recommendButton = view;
        this.f50054g = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ CensorMenuDialog_ViewBinding f50048b;

            public void doClick(View view) {
                censorMenuDialog.onRecommend();
            }
        });
    }

    @CallSuper
    public void unbind() {
        CensorMenuDialog censorMenuDialog = this.f50049b;
        if (censorMenuDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50049b = null;
        censorMenuDialog.muteButton = null;
        censorMenuDialog.unMuteButton = null;
        censorMenuDialog.viewSeperator1 = null;
        censorMenuDialog.unmatchButton = null;
        censorMenuDialog.viewSeparator2 = null;
        censorMenuDialog.reportButton = null;
        censorMenuDialog.recommendButton = null;
        this.f50050c.setOnClickListener(null);
        this.f50050c = null;
        this.f50051d.setOnClickListener(null);
        this.f50051d = null;
        this.f50052e.setOnClickListener(null);
        this.f50052e = null;
        this.f50053f.setOnClickListener(null);
        this.f50053f = null;
        this.f50054g.setOnClickListener(null);
        this.f50054g = null;
    }
}
