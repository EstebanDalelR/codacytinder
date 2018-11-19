package com.tinder.onboarding.view;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.FileProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.dialogs.DialogError;
import com.tinder.dialogs.PhotoAccessDialog;
import com.tinder.dialogs.PhotoAccessDialog.C8849a;
import com.tinder.onboarding.activities.OnboardingActivity;
import com.tinder.onboarding.activities.OnboardingActivity.ExternalStoragePermissionListener;
import com.tinder.onboarding.activities.OnboardingActivity.OnPhotoSelectedListener;
import com.tinder.onboarding.activities.OnboardingActivity.OnboardingViewVisibleListener;
import com.tinder.onboarding.dialog.PhotoSourceSelectorSheetDialog;
import com.tinder.onboarding.dialog.PhotoSourceSelectorSheetDialog.PhotoSourceSelectedListener;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.gm;
import com.tinder.onboarding.target.PhotosStepTarget;
import com.tinder.utils.C15370u;
import com.tinder.utils.C15377z;
import com.tinder.utils.at;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java8.util.Optional;
import javax.inject.Inject;

public class PhotosStepView extends ConstraintLayout implements ExternalStoragePermissionListener, OnPhotoSelectedListener, OnboardingViewVisibleListener, PhotosStepTarget {
    @Inject
    /* renamed from: a */
    gm f43245a;
    @Inject
    /* renamed from: b */
    C15377z f43246b;
    @Inject
    /* renamed from: c */
    InputMethodManager f43247c;
    @Nullable
    /* renamed from: d */
    private PhotoSourceSelectorSheetDialog f43248d;
    @Nullable
    /* renamed from: e */
    private PhotoAccessDialog f43249e;
    @Nullable
    /* renamed from: f */
    private PhotoAccessDialog f43250f;
    /* renamed from: g */
    private boolean f43251g = false;
    @Nullable
    /* renamed from: h */
    private File f43252h;
    @NonNull
    /* renamed from: i */
    private Optional<C9994a> f43253i = Optional.a();
    /* renamed from: j */
    private final PhotoSourceSelectedListener f43254j = new C122051(this);
    /* renamed from: k */
    private final OnDismissListener f43255k = new C10004p(this);
    @BindView(2131363037)
    Button mAddPhotoDoneButton;
    @BindView(2131363038)
    View mAddPhotoEmptyStateCard;
    @BindView(2131363039)
    ImageView mAddPhotoImageView;
    @BindView(2131363040)
    View mAddPhotoPlusImageCircleView;
    @BindView(2131363041)
    View mAddPhotoTextView;
    @BindString(2131821313)
    String mLoadingString;

    /* renamed from: com.tinder.onboarding.view.PhotosStepView$a */
    private static class C9994a {
        @NonNull
        /* renamed from: a */
        private List<ResolveInfo> f32853a;
        @NonNull
        /* renamed from: b */
        private Uri f32854b;

        private C9994a(@NonNull List<ResolveInfo> list, @NonNull Uri uri) {
            this.f32853a = Collections.unmodifiableList(list);
            this.f32854b = uri;
        }
    }

    /* renamed from: com.tinder.onboarding.view.PhotosStepView$1 */
    class C122051 implements PhotoSourceSelectedListener {
        /* renamed from: a */
        final /* synthetic */ PhotosStepView f39554a;

        C122051(PhotosStepView photosStepView) {
            this.f39554a = photosStepView;
        }

        public void onCameraSelected() {
            this.f39554a.f43245a.c();
        }

        public void onGallerySelected() {
            this.f39554a.f43245a.d();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m52910a() {
        m52906b();
    }

    /* renamed from: a */
    final /* synthetic */ void m52912a(C9994a c9994a) {
        m52909c(c9994a);
    }

    /* renamed from: a */
    final /* synthetic */ void m52911a(DialogInterface dialogInterface) {
        this.f43248d = null;
    }

    public PhotosStepView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.view_onboarding_photos, this);
        if (context instanceof OnboardingComponentProvider) {
            ((OnboardingComponentProvider) context).provideComponent().inject(this);
            return;
        }
        throw new IllegalArgumentException("Parent activity doesn't provide an Onboarding component");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ButterKnife.a(this);
        this.f43245a.a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f43250f != null && this.f43250f.isShowing()) {
            this.f43250f.dismiss();
        }
        if (this.f43249e != null && this.f43249e.isShowing()) {
            this.f43249e.dismiss();
        }
        this.f43245a.a();
    }

    public void showPhotoSourceSelector() {
        this.f43248d = new PhotoSourceSelectorSheetDialog(getContext());
        this.f43248d.m53817a(this.f43254j);
        this.f43248d.setOnDismissListener(this.f43255k);
        this.f43248d.show();
    }

    public void showCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f43246b.a(intent)) {
            try {
                this.f43252h = m52908c();
                Object a = FileProvider.a(getContext(), "com.tinder.fileprovider", this.f43252h);
                intent.putExtra("output", a);
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                ((OnboardingActivity) getContext()).m54545a(intent);
                if (VERSION.SDK_INT < 21) {
                    C9994a a2 = m52905a(intent, a);
                    this.f43253i = Optional.a(a2);
                    m52907b(a2);
                }
            } catch (IOException e) {
                this.f43245a.a(e);
            }
        }
    }

    public void showGallery() {
        Intent intent = new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI);
        if (this.f43246b.a(intent)) {
            ((OnboardingActivity) getContext()).m54550b(intent);
        } else {
            this.f43245a.e();
        }
    }

    public void showPhotoCropper(@NonNull Uri uri) {
        ((OnboardingActivity) getContext()).m54546a(uri);
    }

    public void showPhoto(@NonNull Uri uri) {
        this.f43252h = new File(C15370u.a(getContext(), uri));
        this.mAddPhotoImageView.setImageURI(uri);
    }

    public void hideAddPhoto() {
        if (this.mAddPhotoPlusImageCircleView.getVisibility() == 0) {
            this.mAddPhotoDoneButton.setEnabled(true);
            this.mAddPhotoImageView.setVisibility(0);
            this.mAddPhotoPlusImageCircleView.setVisibility(8);
            this.mAddPhotoTextView.setVisibility(8);
            this.mAddPhotoDoneButton.setBackgroundResource(R.drawable.selector_oval_tinder_gradient);
            this.mAddPhotoDoneButton.setTextColor(-1);
            this.mAddPhotoEmptyStateCard.setVisibility(8);
        }
    }

    public void showExtStorageReadPermissionDialog() {
        if (!this.f43251g) {
            if (this.f43249e == null) {
                this.f43249e = new C8849a(getContext()).m37621a(new C12217q(this)).m37622a();
            }
            this.f43249e.show();
        } else if (ActivityCompat.a((Activity) getContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
            if (this.f43250f == null) {
                this.f43250f = new C8849a(getContext()).m37620a((int) R.string.photo_runtime_permission_explanation).m37623b(R.drawable.app_permissions).m37621a(new C12218r(this)).m37622a();
            }
            this.f43250f.show();
        } else {
            m52906b();
        }
    }

    public void showErrorMessage(String str) {
        DialogError.m37618a(getContext()).m37613a((int) R.string.onboarding_error_dialog_title).m37615a(str).m37616a().show();
    }

    public void showGalleryUnavailableSnackbarMessage() {
        at.a(this, R.string.onboarding_photos_step_gallery_not_accessible);
    }

    public void showAddPhoto() {
        if (this.mAddPhotoPlusImageCircleView.getVisibility() != 0) {
            this.mAddPhotoDoneButton.setEnabled(false);
            this.mAddPhotoImageView.setVisibility(8);
            this.mAddPhotoPlusImageCircleView.setVisibility(0);
            this.mAddPhotoTextView.setVisibility(0);
            this.mAddPhotoDoneButton.setBackgroundResource(R.drawable.onboarding_disabled_oval_button);
            this.mAddPhotoDoneButton.setTextColor(getResources().getColor(R.color.onboarding_add_photo_text_color));
            this.mAddPhotoEmptyStateCard.setVisibility(0);
        }
    }

    public void hideSoftInput() {
        this.f43247c.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @OnClick({2131363036})
    public void onAddPhotoButtonClick() {
        this.f43245a.b();
    }

    @OnClick({2131363037})
    public void onAddPhotoDoneButtonClicked() {
        this.f43245a.a(this.f43252h);
    }

    @TargetApi(16)
    /* renamed from: b */
    private void m52906b() {
        ((OnboardingActivity) getContext()).m54551d();
    }

    /* renamed from: c */
    private File m52908c() throws IOException {
        return File.createTempFile(UUID.randomUUID().toString(), ".jpg", getContext().getCacheDir());
    }

    public void galleryPhotoSelected(Uri uri) {
        this.f43245a.a(uri);
    }

    public void cameraPhotoSelected() {
        this.f43245a.a(Uri.fromFile(this.f43252h));
        this.f43252h = null;
        this.f43253i.a(new C12219s(this));
    }

    public void croppedPhotoSelected(Uri uri) {
        this.f43245a.b(uri);
    }

    public void croppedPhotoError(Exception exception) {
        this.f43245a.a(exception);
    }

    public void onPermissionResult(int[] iArr) {
        this.f43245a.a(iArr);
    }

    public void onVisibilityChanged(boolean z) {
        this.f43245a.a(z);
    }

    public void showProgressDialog() {
        ((OnboardingActivity) getContext()).showProgressDialog();
    }

    public void hideProgressDialog() {
        ((OnboardingActivity) getContext()).hideProgressDialog();
    }

    @NonNull
    /* renamed from: a */
    private C9994a m52905a(@NonNull Intent intent, @NonNull Uri uri) {
        return new C9994a(getContext().getPackageManager().queryIntentActivities(intent, 65536), uri);
    }

    /* renamed from: b */
    private void m52907b(@NonNull C9994a c9994a) {
        List<ResolveInfo> a = c9994a.f32853a;
        c9994a = c9994a.f32854b;
        Context context = getContext();
        for (ResolveInfo resolveInfo : a) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, c9994a, 3);
        }
    }

    /* renamed from: c */
    private void m52909c(@NonNull C9994a c9994a) {
        getContext().revokeUriPermission(c9994a.f32854b, 3);
        this.f43253i = Optional.a();
    }
}
