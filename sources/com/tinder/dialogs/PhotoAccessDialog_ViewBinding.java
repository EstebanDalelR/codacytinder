package com.tinder.dialogs;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class PhotoAccessDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private PhotoAccessDialog f35962b;
    /* renamed from: c */
    private View f35963c;

    @UiThread
    public PhotoAccessDialog_ViewBinding(final PhotoAccessDialog photoAccessDialog, View view) {
        this.f35962b = photoAccessDialog;
        photoAccessDialog.mTitle = (TextView) C0761c.b(view, R.id.photo_permission_dialog_title, "field 'mTitle'", TextView.class);
        photoAccessDialog.mSubtitle = (TextView) C0761c.b(view, R.id.photo_permission_dialog_subtitle, "field 'mSubtitle'", TextView.class);
        photoAccessDialog.mImage = (ImageView) C0761c.b(view, R.id.photo_permission_dialog_image, "field 'mImage'", ImageView.class);
        view = C0761c.a(view, R.id.photo_permission_dialog_button_positive, "method 'onPositiveButtonClicked'");
        this.f35963c = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ PhotoAccessDialog_ViewBinding f35961b;

            public void doClick(View view) {
                photoAccessDialog.onPositiveButtonClicked();
            }
        });
    }

    public void unbind() {
        PhotoAccessDialog photoAccessDialog = this.f35962b;
        if (photoAccessDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f35962b = null;
        photoAccessDialog.mTitle = null;
        photoAccessDialog.mSubtitle = null;
        photoAccessDialog.mImage = null;
        this.f35963c.setOnClickListener(null);
        this.f35963c = null;
    }
}
