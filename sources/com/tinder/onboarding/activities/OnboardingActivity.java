package com.tinder.onboarding.activities;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.view.C0600i;
import android.support.v4.view.ViewPager.C2887d;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView.Guidelines;
import com.tinder.R;
import com.tinder.account.view.UpdateAccountPage;
import com.tinder.auth.model.AuthType;
import com.tinder.base.ActivityBase;
import com.tinder.base.view.LockableViewPager;
import com.tinder.dialogs.AccountUpdateCancelConfirmDialog;
import com.tinder.dialogs.DialogError;
import com.tinder.managers.ManagerApp;
import com.tinder.onboarding.dialog.OnboardingCancelConfirmDialog;
import com.tinder.onboarding.dialog.OnboardingCancelConfirmDialog.OnButtonClickedListener;
import com.tinder.onboarding.module.C2655a;
import com.tinder.onboarding.module.OnboardingComponent;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.dn;
import com.tinder.onboarding.target.OnboardingActivityTarget;
import com.tinder.onboarding.view.BirthdayStepView;
import com.tinder.onboarding.view.EmailStepView;
import com.tinder.onboarding.view.GenderStepView;
import com.tinder.onboarding.view.NameStepView;
import com.tinder.onboarding.view.PasswordStepView;
import com.tinder.onboarding.view.PhotosStepView;
import com.tinder.onboarding.viewmodel.OnboardingStep;
import com.tinder.settings.activity.GenderSearchActivity;
import com.tinder.utils.av;
import com.tinder.views.CustomTextView;
import java.util.ArrayList;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public class OnboardingActivity extends ActivityBase implements OnboardingComponentProvider, OnboardingActivityTarget {
    @Inject
    /* renamed from: a */
    dn f45409a;
    /* renamed from: b */
    private ProgressDialog f45410b;
    /* renamed from: c */
    private OnPageChangeListener f45411c;
    @BindDrawable(2131231231)
    Drawable closeIcon;
    /* renamed from: d */
    private OnboardingCancelConfirmDialog f45412d;
    /* renamed from: e */
    private C12157a f45413e;
    @BindString(2131821485)
    String errorString;
    @BindView(2131363058)
    TextView errorText;
    /* renamed from: f */
    private OnboardingComponent f45414f;
    /* renamed from: g */
    private AccountUpdateCancelConfirmDialog f45415g;
    /* renamed from: h */
    private OnClickListener f45416h = new C9957a(this);
    @BindDrawable(2131231227)
    Drawable leftChevron;
    @BindString(2131821313)
    String loadingString;
    @BindColor(2131100037)
    int navIconColor;
    @BindView(2131363346)
    ProgressBar progressBar;
    @BindView(2131363070)
    CustomTextView skipButton;
    @BindView(2131363811)
    TextView titleText;
    @BindView(2131363822)
    Toolbar toolbar;
    @BindView(2131363072)
    ViewFlipper viewFlipper;
    @BindView(2131363110)
    LockableViewPager viewPager;

    public interface CustomGenderSelectedListener {
        void customGenderSelected(String str);
    }

    public interface ExternalStoragePermissionListener {
        void onPermissionResult(int[] iArr);
    }

    public interface OnBackPressedListener {
        boolean onBackPressed();
    }

    public interface OnPhotoSelectedListener {
        void cameraPhotoSelected();

        void croppedPhotoError(Exception exception);

        void croppedPhotoSelected(Uri uri);

        void galleryPhotoSelected(Uri uri);
    }

    public interface OnboardingViewVisibleListener {
        void onVisibilityChanged(boolean z);
    }

    /* renamed from: com.tinder.onboarding.activities.OnboardingActivity$1 */
    class C121551 implements OnButtonClickedListener {
        /* renamed from: a */
        final /* synthetic */ OnboardingActivity f39402a;

        C121551(OnboardingActivity onboardingActivity) {
            this.f39402a = onboardingActivity;
        }

        public void onNegativeButtonClicked() {
            this.f39402a.f45412d.dismiss();
        }

        public void onPositiveButtonClicked() {
            this.f39402a.f45412d.dismiss();
            this.f39402a.f45409a.m52783d();
        }
    }

    /* renamed from: com.tinder.onboarding.activities.OnboardingActivity$3 */
    class C121563 implements AccountUpdateCancelConfirmDialog.OnButtonClickedListener {
        /* renamed from: a */
        final /* synthetic */ OnboardingActivity f39403a;

        C121563(OnboardingActivity onboardingActivity) {
            this.f39403a = onboardingActivity;
        }

        public void onNegativeButtonClicked(@NonNull AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog) {
            accountUpdateCancelConfirmDialog.dismiss();
        }

        public void onPositiveButtonClicked(@NonNull AccountUpdateCancelConfirmDialog accountUpdateCancelConfirmDialog) {
            accountUpdateCancelConfirmDialog.dismiss();
            this.f39403a.f45409a.m52777b(OnboardingStep.EMAIL);
        }
    }

    /* renamed from: com.tinder.onboarding.activities.OnboardingActivity$a */
    private static class C12157a extends C0600i {
        /* renamed from: a */
        private final List<OnboardingStep> f39404a = new ArrayList();
        /* renamed from: b */
        private final Context f39405b;

        C12157a(@NonNull Context context) {
            this.f39405b = context;
        }

        /* renamed from: a */
        Optional<OnboardingStep> m48304a(int i) {
            if (i >= 0) {
                if (i < this.f39404a.size()) {
                    return Optional.a(this.f39404a.get(i));
                }
            }
            return Optional.a();
        }

        /* renamed from: a */
        Optional<Integer> m48305a(@NonNull OnboardingStep onboardingStep) {
            onboardingStep = this.f39404a.indexOf(onboardingStep);
            if (onboardingStep < null) {
                return Optional.a();
            }
            return Optional.a(Integer.valueOf(onboardingStep));
        }

        /* renamed from: a */
        void m48306a(@NonNull List<OnboardingStep> list) {
            if (!this.f39404a.equals(list)) {
                this.f39404a.clear();
                this.f39404a.addAll(list);
                notifyDataSetChanged();
            }
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View nameStepView;
            OnboardingStep onboardingStep = (OnboardingStep) this.f39404a.get(i);
            switch (onboardingStep) {
                case NAME:
                    nameStepView = new NameStepView(this.f39405b);
                    break;
                case BIRTHDAY:
                    nameStepView = new BirthdayStepView(this.f39405b);
                    break;
                case GENDER:
                    nameStepView = new GenderStepView(this.f39405b);
                    break;
                case PHOTOS:
                    nameStepView = new PhotosStepView(this.f39405b);
                    break;
                case EMAIL:
                    nameStepView = new EmailStepView(this.f39405b);
                    break;
                case PASSWORD:
                    nameStepView = new PasswordStepView(this.f39405b);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected Onboarding step:");
                    stringBuilder.append(onboardingStep);
                    throw new IllegalStateException(stringBuilder.toString());
            }
            nameStepView.setTag(onboardingStep);
            viewGroup.addView(nameStepView);
            return nameStepView;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return this.f39404a.size();
        }

        public boolean isViewFromObject(View view, Object obj) {
            boolean z = true;
            if (view == obj) {
                return true;
            }
            if (((ViewGroup) obj).indexOfChild(view) < null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: com.tinder.onboarding.activities.OnboardingActivity$2 */
    class C135062 extends C2887d {
        /* renamed from: a */
        final /* synthetic */ OnboardingActivity f43097a;

        C135062(OnboardingActivity onboardingActivity) {
            this.f43097a = onboardingActivity;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            Drawable g = C0450a.g(i == 0 ? this.f43097a.closeIcon : this.f43097a.leftChevron);
            C0450a.a(g, this.f43097a.navIconColor);
            this.f43097a.toolbar.setNavigationIcon(g);
            this.f43097a.f45409a.m52772a((OnboardingStep) this.f43097a.m54543g().b());
            this.f43097a.m54540b(i);
        }
    }

    /* renamed from: a */
    public static Intent m54536a(Context context, AuthType authType) {
        Intent intent = new Intent(context, OnboardingActivity.class);
        intent.putExtra("authtype", authType.getKey());
        return intent;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f45414f = ManagerApp.e().plus(new C2655a());
        this.f45414f.inject(this);
        setContentView(R.layout.activity_onboarding_2);
        ButterKnife.a(this);
        m54541e();
        this.f45412d = OnboardingCancelConfirmDialog.m52619a((Context) this);
        this.f45412d.m52620a(new C121551(this));
        this.f45413e = new C12157a(this);
        this.viewPager.setAdapter(this.f45413e);
        this.f45411c = new C135062(this);
        this.viewPager.addOnPageChangeListener(this.f45411c);
        this.viewPager.setPagingEnabled(false);
        m54544m();
    }

    protected void onStart() {
        super.onStart();
        this.f45409a.a(this);
        this.f45409a.m52775b();
    }

    protected void onStop() {
        super.onStop();
        this.f45409a.a();
        hideProgressDialog();
        av.a(this.f45412d);
        av.a(this.f45415g);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f45414f = null;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f45409a.a(this);
        this.f45409a.m52787f();
        if (i != 203) {
            switch (i) {
                case 0:
                    if (i2 == -1) {
                        i = intent.getStringExtra("gender");
                        i2 = this.viewPager.findViewWithTag(OnboardingStep.GENDER);
                        if ((i2 instanceof CustomGenderSelectedListener) != null) {
                            ((CustomGenderSelectedListener) i2).customGenderSelected(i);
                            return;
                        }
                        return;
                    }
                    return;
                case 1:
                    if (i2 == -1) {
                        i = this.viewPager.findViewWithTag(OnboardingStep.PHOTOS);
                        if ((i instanceof OnPhotoSelectedListener) != 0) {
                            ((OnPhotoSelectedListener) i).cameraPhotoSelected();
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    if (i2 == -1) {
                        i = this.viewPager.findViewWithTag(OnboardingStep.PHOTOS);
                        if ((i instanceof OnPhotoSelectedListener) != 0) {
                            ((OnPhotoSelectedListener) i).galleryPhotoSelected(intent.getData());
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        i = this.viewPager.findViewWithTag(OnboardingStep.PHOTOS);
        intent = CropImage.a(intent);
        if (i2 == -1 && (i instanceof OnPhotoSelectedListener)) {
            ((OnPhotoSelectedListener) i).croppedPhotoSelected(intent.getUri());
        } else if (i2 == 204 && (i instanceof OnPhotoSelectedListener) != 0) {
            ((OnPhotoSelectedListener) i).croppedPhotoError(intent.getError());
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 3 && "android.permission.READ_EXTERNAL_STORAGE".equals(strArr[0]) != 0) {
            i = this.viewPager.findViewWithTag(OnboardingStep.PHOTOS);
            if ((i instanceof ExternalStoragePermissionListener) != null) {
                ((ExternalStoragePermissionListener) i).onPermissionResult(iArr);
            }
        }
    }

    public OnboardingComponent provideComponent() {
        return this.f45414f;
    }

    public void setSteps(@NonNull List<OnboardingStep> list) {
        this.f45413e.m48306a((List) list);
        this.progressBar.setMax(list.size());
    }

    public void showStep(@NonNull OnboardingStep onboardingStep) {
        onboardingStep = this.f45413e.m48305a(onboardingStep);
        if (onboardingStep.c()) {
            onboardingStep = ((Integer) onboardingStep.b()).intValue();
            this.viewPager.setCurrentItem(onboardingStep, true);
            if (onboardingStep == null) {
                this.f45411c.onPageSelected(onboardingStep);
            }
            this.progressBar.setProgress(onboardingStep + 1);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m54547a(View view) {
        if (this.viewFlipper.getDisplayedChild() == null) {
            onBackPressed();
        } else if (this.viewFlipper.getDisplayedChild() == 1) {
            this.viewFlipper.setDisplayedChild(0);
        }
    }

    @OnClick({2131363059})
    public void onTryAgainButtonClicked() {
        this.f45409a.m52785e();
    }

    @OnClick({2131363070})
    public void onSkipButtonClicked() {
        this.f45415g.show();
    }

    public void onBackPressed() {
        if (!m54542f()) {
            this.f45409a.m52780c();
        }
    }

    public void dismiss() {
        super.onBackPressed();
    }

    public void finishOnboardingWithSuccess() {
        Intent intent = new Intent();
        intent.putExtra("authtype", getIntent().getStringExtra("authtype"));
        setResult(-1, intent);
        finish();
    }

    public void finishOnboardingWithUnderage(int i) {
        Intent intent = new Intent();
        intent.putExtra("days_locked", i);
        setResult(10001, intent);
        finish();
    }

    public void finishOnboardingWithError(Throwable th) {
        finish();
    }

    public void showGenericErrorMessage(boolean z) {
        DialogError.m37618a(this).m37613a((int) R.string.onboarding_error_dialog_title).m37614a(new C9958b(this, z)).m37616a().show();
    }

    /* renamed from: a */
    final /* synthetic */ void m54548a(boolean z, View view) {
        if (z) {
            finish();
        }
    }

    public void showCancelConfirmationDialog() {
        this.f45412d.show();
    }

    public void showProgressDialog() {
        if (this.f45410b == null) {
            this.f45410b = new ProgressDialog(this);
            this.f45410b.setMessage(this.loadingString);
            this.f45410b.setIndeterminate(true);
            this.f45410b.setCancelable(false);
        }
        this.f45410b.show();
    }

    public void hideProgressDialog() {
        if (this.f45410b != null && this.f45410b.isShowing()) {
            this.f45410b.dismiss();
        }
    }

    public void showCreateUserError(Optional<Integer> optional) {
        if (optional.c()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.errorString);
            stringBuilder.append("\n(");
            stringBuilder.append(optional);
            stringBuilder.append(")");
            optional = stringBuilder.toString();
        } else {
            optional = this.errorString;
        }
        this.errorText.setText(optional);
        this.viewFlipper.setDisplayedChild(1);
    }

    public void setTitle(@Nullable String str) {
        if (str == null) {
            hideTitle();
        } else if (this.viewPager.findViewWithTag(m54543g().b()) instanceof GenderStepView) {
            this.titleText.setText(str);
            av.a(new View[]{this.titleText});
        }
    }

    public void hideTitle() {
        av.c(new View[]{this.titleText});
    }

    public void showSkipButton() {
        this.skipButton.setVisibility(0);
    }

    public void hideSkipButton() {
        this.skipButton.setVisibility(8);
    }

    /* renamed from: e */
    private void m54541e() {
        this.closeIcon = C0450a.g(this.closeIcon);
        C0450a.a(this.closeIcon, this.navIconColor);
        this.toolbar.setNavigationIcon(this.closeIcon);
        this.toolbar.setNavigationOnClickListener(this.f45416h);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    /* renamed from: f */
    private boolean m54542f() {
        if (m54543g().c()) {
            View findViewWithTag = this.viewPager.findViewWithTag(m54543g().b());
            if (findViewWithTag != null && (findViewWithTag instanceof OnBackPressedListener)) {
                return ((OnBackPressedListener) findViewWithTag).onBackPressed();
            }
        }
        C0001a.d("Expected to have a step here but got nothing. View pager index is: %d", new Object[]{Integer.valueOf(this.viewPager.getCurrentItem())});
        return false;
    }

    /* renamed from: g */
    private Optional<OnboardingStep> m54543g() {
        return this.f45413e.m48304a(this.viewPager.getCurrentItem());
    }

    /* renamed from: b */
    public void m54549b() {
        startActivityForResult(GenderSearchActivity.a(this, true), 0);
    }

    /* renamed from: a */
    public void m54545a(Intent intent) {
        startActivityForResult(intent, 1);
    }

    /* renamed from: b */
    public void m54550b(Intent intent) {
        startActivityForResult(intent, 2);
    }

    /* renamed from: a */
    public void m54546a(Uri uri) {
        CropImage.a(uri).a(Guidelines.ON_TOUCH).a(1, 1).a(true).a(this);
    }

    @TargetApi(23)
    /* renamed from: d */
    public void m54551d() {
        requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 3);
    }

    /* renamed from: b */
    private void m54540b(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            View findViewWithTag = this.viewPager.findViewWithTag(this.f45413e.m48304a(i2).b());
            if (findViewWithTag instanceof OnboardingViewVisibleListener) {
                ((OnboardingViewVisibleListener) findViewWithTag).onVisibilityChanged(false);
            }
        }
        i++;
        if (i < this.f45413e.getCount()) {
            i = this.viewPager.findViewWithTag(this.f45413e.m48304a(i).b());
            if (i instanceof OnboardingViewVisibleListener) {
                ((OnboardingViewVisibleListener) i).onVisibilityChanged(false);
            }
        }
        i = this.viewPager.findViewWithTag(m54543g().b());
        if (i instanceof OnboardingViewVisibleListener) {
            ((OnboardingViewVisibleListener) i).onVisibilityChanged(true);
        }
    }

    /* renamed from: m */
    private void m54544m() {
        this.f45415g = AccountUpdateCancelConfirmDialog.m51058a(this).m37605a(UpdateAccountPage.EMAIL.getCancelWarningResId()).m37606a(new C121563(this)).m37607a();
    }
}
