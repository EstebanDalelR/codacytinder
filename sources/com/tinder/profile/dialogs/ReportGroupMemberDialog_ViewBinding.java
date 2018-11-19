package com.tinder.profile.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class ReportGroupMemberDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private ReportGroupMemberDialog f50084b;
    /* renamed from: c */
    private View f50085c;

    @UiThread
    public ReportGroupMemberDialog_ViewBinding(final ReportGroupMemberDialog reportGroupMemberDialog, View view) {
        this.f50084b = reportGroupMemberDialog;
        reportGroupMemberDialog.recyclerView = (RecyclerView) C0761c.b(view, R.id.dialog_report_user_list, "field 'recyclerView'", RecyclerView.class);
        view = C0761c.a(view, R.id.dialog_report_user_cancel_button, "method 'handleCancelClicked'");
        this.f50085c = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ ReportGroupMemberDialog_ViewBinding f50083b;

            public void doClick(View view) {
                reportGroupMemberDialog.handleCancelClicked();
            }
        });
    }

    @CallSuper
    public void unbind() {
        ReportGroupMemberDialog reportGroupMemberDialog = this.f50084b;
        if (reportGroupMemberDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50084b = null;
        reportGroupMemberDialog.recyclerView = null;
        this.f50085c.setOnClickListener(null);
        this.f50085c = null;
    }
}
