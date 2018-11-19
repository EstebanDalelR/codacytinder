package com.tinder.onboarding.dialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class PhotoSourceSelectorSheetDialog_ViewBinding implements Unbinder {
    /* renamed from: b */
    private PhotoSourceSelectorSheetDialog f39435b;
    /* renamed from: c */
    private View f39436c;
    /* renamed from: d */
    private View f39437d;

    @UiThread
    public PhotoSourceSelectorSheetDialog_ViewBinding(final PhotoSourceSelectorSheetDialog photoSourceSelectorSheetDialog, View view) {
        this.f39435b = photoSourceSelectorSheetDialog;
        View a = C0761c.a(view, R.id.photo_source_selector_camera, "field 'mCameraView' and method 'cameraClick'");
        photoSourceSelectorSheetDialog.mCameraView = a;
        this.f39436c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ PhotoSourceSelectorSheetDialog_ViewBinding f39432b;

            public void doClick(View view) {
                photoSourceSelectorSheetDialog.cameraClick();
            }
        });
        view = C0761c.a(view, R.id.photo_source_selector_gallery, "field 'mGalleryView' and method 'galleryClick'");
        photoSourceSelectorSheetDialog.mGalleryView = view;
        this.f39437d = view;
        view.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ PhotoSourceSelectorSheetDialog_ViewBinding f39434b;

            public void doClick(View view) {
                photoSourceSelectorSheetDialog.galleryClick();
            }
        });
    }

    @CallSuper
    public void unbind() {
        PhotoSourceSelectorSheetDialog photoSourceSelectorSheetDialog = this.f39435b;
        if (photoSourceSelectorSheetDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f39435b = null;
        photoSourceSelectorSheetDialog.mCameraView = null;
        photoSourceSelectorSheetDialog.mGalleryView = null;
        this.f39436c.setOnClickListener(null);
        this.f39436c = null;
        this.f39437d.setOnClickListener(null);
        this.f39437d = null;
    }
}
