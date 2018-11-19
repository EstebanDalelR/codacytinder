package com.tinder.onboarding.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.C3997b;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.managers.ManagerApp;
import com.tinder.onboarding.presenter.gl;
import com.tinder.onboarding.target.PhotoSourceSelectorTarget;
import javax.inject.Inject;

public class PhotoSourceSelectorSheetDialog extends C3997b implements PhotoSourceSelectorTarget {
    @Inject
    /* renamed from: b */
    gl f44628b;
    /* renamed from: c */
    private PhotoSourceSelectedListener f44629c;
    @BindView(2131363190)
    View mCameraView;
    @BindView(2131363191)
    View mGalleryView;

    public interface PhotoSourceSelectedListener {
        void onCameraSelected();

        void onGallerySelected();
    }

    public PhotoSourceSelectorSheetDialog(@NonNull Context context) {
        super(context);
        ManagerApp.e().inject(this);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_photo_source_selector_modal);
        getWindow().setLayout(-1, -1);
        getWindow().setSoftInputMode(32);
        ButterKnife.a(this);
    }

    protected void onStart() {
        super.onStart();
        this.f44628b.a(this);
    }

    protected void onStop() {
        super.onStop();
        this.f44628b.a();
    }

    public void showCameraClicked() {
        dismiss();
        this.f44629c.onCameraSelected();
    }

    public void showGalleryClicked() {
        dismiss();
        this.f44629c.onGallerySelected();
    }

    @OnClick({2131363190})
    public void cameraClick() {
        this.f44628b.m52836b();
    }

    @OnClick({2131363191})
    public void galleryClick() {
        this.f44628b.m52837c();
    }

    /* renamed from: a */
    public void m53817a(PhotoSourceSelectedListener photoSourceSelectedListener) {
        this.f44629c = photoSourceSelectedListener;
    }
}
