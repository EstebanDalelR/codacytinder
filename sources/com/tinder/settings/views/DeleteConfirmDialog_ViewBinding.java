package com.tinder.settings.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class DeleteConfirmDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private DeleteConfirmDialog f51602b;
    /* renamed from: c */
    private View f51603c;
    /* renamed from: d */
    private View f51604d;
    /* renamed from: e */
    private View f51605e;

    @UiThread
    public DeleteConfirmDialog_ViewBinding(final DeleteConfirmDialog deleteConfirmDialog, View view) {
        this.f51602b = deleteConfirmDialog;
        deleteConfirmDialog.titleText = (TextView) C0761c.b(view, R.id.confirmTitle, "field 'titleText'", TextView.class);
        View a = C0761c.a(view, R.id.hideAccountButton, "field 'hideButton' and method 'buttonClicked'");
        deleteConfirmDialog.hideButton = a;
        this.f51603c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ DeleteConfirmDialog_ViewBinding f51597b;

            public void doClick(View view) {
                deleteConfirmDialog.buttonClicked(view);
            }
        });
        a = C0761c.a(view, R.id.deleteAccountButton, "field 'deleteButton' and method 'buttonClicked'");
        deleteConfirmDialog.deleteButton = a;
        this.f51604d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ DeleteConfirmDialog_ViewBinding f51599b;

            public void doClick(View view) {
                deleteConfirmDialog.buttonClicked(view);
            }
        });
        view = C0761c.a(view, R.id.cancelButton, "field 'cancelButton' and method 'buttonClicked'");
        deleteConfirmDialog.cancelButton = view;
        this.f51605e = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ DeleteConfirmDialog_ViewBinding f51601b;

            public void doClick(View view) {
                deleteConfirmDialog.buttonClicked(view);
            }
        });
    }

    @CallSuper
    public void unbind() {
        DeleteConfirmDialog deleteConfirmDialog = this.f51602b;
        if (deleteConfirmDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51602b = null;
        deleteConfirmDialog.titleText = null;
        deleteConfirmDialog.hideButton = null;
        deleteConfirmDialog.deleteButton = null;
        deleteConfirmDialog.cancelButton = null;
        this.f51603c.setOnClickListener(null);
        this.f51603c = null;
        this.f51604d.setOnClickListener(null);
        this.f51604d = null;
        this.f51605e.setOnClickListener(null);
        this.f51605e = null;
    }
}
