package com.tinder.fragments;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.C0432b;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView.Guidelines;
import com.tinder.R;
import com.tinder.account.photos.CurrentUserPhotosView;
import com.tinder.account.photos.photogrid.PhotoExternalStoragePermissionListener;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.activities.ActivityEditProfile.EditProfileDestination;
import com.tinder.activities.ActivityJob;
import com.tinder.activities.SchoolActivity;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.p076a.C2640a;
import com.tinder.common.utils.C8578a;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.C11113b;
import com.tinder.dialogs.C11114d;
import com.tinder.dialogs.C11118u;
import com.tinder.dialogs.C8867t;
import com.tinder.dialogs.DialogError;
import com.tinder.dialogs.InstagramDisconnectDialog;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.profile.model.Coordinates;
import com.tinder.domain.profile.model.CroppingInfo;
import com.tinder.domain.profile.model.LocalProfilePhoto;
import com.tinder.domain.profile.model.PendingFacebookPhoto;
import com.tinder.events.EventPhotosProcessed;
import com.tinder.interfaces.InstagramLoginView;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ad;
import com.tinder.managers.bk;
import com.tinder.model.SparksEvent;
import com.tinder.module.Default;
import com.tinder.presenters.C17744d;
import com.tinder.presenters.bf;
import com.tinder.profile.view.EditProfileSingleLineEntryView;
import com.tinder.settings.activity.MoreGenderActivity;
import com.tinder.spotify.views.SpotifyConnectView;
import com.tinder.spotify.views.SpotifyThemeSongView;
import com.tinder.targets.FragmentViewProfileTarget;
import com.tinder.utils.C15377z;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.views.CustomSwitch;
import de.greenrobot.event.C2664c;
import io.reactivex.disposables.C17356a;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.p500e.C19573b;

public class FragmentEditProfile extends Fragment implements TextWatcher, AnimationListener, OnCheckedChangeListener, InstagramLoginView, FragmentViewProfileTarget {
    @Inject
    /* renamed from: a */
    bk f42185a;
    @Inject
    /* renamed from: b */
    ad f42186b;
    @Inject
    /* renamed from: c */
    ManagerAnalytics f42187c;
    @BindView(2131362274)
    CurrentUserPhotosView currentUserPhotos;
    @Inject
    /* renamed from: d */
    LegacyBreadCrumbTracker f42188d;
    @Inject
    /* renamed from: e */
    C17744d f42189e;
    @BindView(2131362371)
    EditProfilePhotoView editProfilePhotoView;
    @Inject
    /* renamed from: f */
    C15377z f42190f;
    @Inject
    /* renamed from: g */
    bf f42191g;
    @Default
    @Inject
    /* renamed from: h */
    C2664c f42192h;
    /* renamed from: i */
    public OnPermissionDeniedListener f42193i;
    @BindColor(2131099974)
    int instagramLoggedInNameColor;
    /* renamed from: j */
    private final C19573b f42194j = new C19573b();
    /* renamed from: k */
    private final C17356a f42195k = new C17356a();
    /* renamed from: l */
    private C8867t f42196l;
    /* renamed from: m */
    private Intent f42197m;
    @BindView(2131361802)
    TextView mAboutMe;
    @BindView(2131362222)
    View mControlYourProfileContainer;
    @BindView(2131362223)
    TextView mControlYourProfileTitle;
    @BindView(2131362360)
    EditText mEditTextBio;
    @BindView(2131362372)
    EditProfileSingleLineEntryView mEditableSchoolEntryView;
    @BindView(2131362366)
    View mGenderGroup;
    @BindView(2131362364)
    TextView mGenderHeader;
    @BindView(2131362367)
    TextView mGenderMore;
    @BindView(2131362365)
    RadioGroup mGenderRadios;
    @BindView(2131362673)
    CustomSwitch mHideAgeSwitch;
    @BindView(2131362674)
    TextView mHideAgeTitle;
    @BindView(2131362672)
    View mHideAgeView;
    @BindView(2131362676)
    CustomSwitch mHideDistanceSwitch;
    @BindView(2131362677)
    TextView mHideDistanceTitle;
    @BindView(2131362675)
    View mHideDistanceView;
    @BindView(2131362017)
    TextView mInstagramAuthButton;
    @BindView(2131362327)
    TextView mInstagramDisconnect;
    @BindView(2131362743)
    View mInstagramSelectContainer;
    @BindView(2131362369)
    EditProfileSingleLineEntryView mJobCompanyEntryView;
    @BindView(2131362370)
    EditProfileSingleLineEntryView mJobTitleEntryView;
    @BindView(2131362841)
    LinearLayout mLinearLayoutBio;
    @BindView(2131363079)
    TextView mOptimizeToggleLabel;
    @BindView(2131363354)
    ProgressBar mProgressBarAuth;
    @BindView(2131362363)
    EditProfileSingleLineEntryView mReadonlySchoolEntryView;
    @BindView(2131363509)
    NestedScrollView mScrollViewTop;
    @BindView(2131362373)
    SpotifyConnectView mSpotifyConnectedView;
    @BindView(2131362374)
    SpotifyThemeSongView mSpotifyThemeSongView;
    @BindView(2131363758)
    TextView mTextViewCharsRemaining;
    @BindView(2131363820)
    Toolbar mToolbar;
    @BindString(2131820927)
    String mToolbarTitle;
    @BindView(2131362375)
    EditProfileSingleLineEntryView mWorkEntryView;
    /* renamed from: n */
    private Value f42198n;
    /* renamed from: o */
    private Unbinder f42199o;
    /* renamed from: p */
    private boolean f42200p;
    @Nullable
    /* renamed from: q */
    private Intent f42201q;
    @BindColor(2131100253)
    int tinderRedColor;

    /* renamed from: com.tinder.fragments.FragmentEditProfile$2 */
    static /* synthetic */ class C96252 {
        /* renamed from: a */
        static final /* synthetic */ int[] f32149a = new int[EditProfileDestination.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.values();
            r0 = r0.length;
            r0 = new int[r0];
            f32149a = r0;
            r0 = f32149a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.WORK;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f32149a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.SCHOOL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f32149a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.PHOTO;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f32149a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.INSTAGRAM;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f32149a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.SPOTIFY;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f32149a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = com.tinder.activities.ActivityEditProfile.EditProfileDestination.ANTHEM;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.fragments.FragmentEditProfile.2.<clinit>():void");
        }
    }

    public interface OnPermissionDeniedListener {
        void onExtStorageReadPermissionDenied();
    }

    /* renamed from: com.tinder.fragments.FragmentEditProfile$1 */
    class C118401 implements PhotoExternalStoragePermissionListener {
        /* renamed from: a */
        final /* synthetic */ FragmentEditProfile f38619a;

        C118401(FragmentEditProfile fragmentEditProfile) {
            this.f38619a = fragmentEditProfile;
        }

        public void onPermissionGranted() {
            this.f38619a.f42200p = true;
            this.f38619a.f42189e.f();
        }

        public void onPermissionDenied() {
            ((OnPermissionDeniedListener) this.f38619a.getContext()).onExtStorageReadPermissionDenied();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void showInitialPhotosFetched(boolean z) {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
        if (context instanceof Activity) {
            ((Activity) context).getWindow().setSoftInputMode(16);
        }
        if (context instanceof OnPermissionDeniedListener) {
            this.f42193i = (OnPermissionDeniedListener) context;
            return;
        }
        throw new IllegalArgumentException("Host activity should implement OnPermissionDeniedListener");
    }

    public void onDetach() {
        super.onDetach();
        this.f42193i = null;
    }

    /* renamed from: b */
    private boolean m51489b(int i) {
        if (this.editProfilePhotoView.f38596f[i] != null) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("indexToAdd=");
        stringBuilder.append(i);
        com.tinder.utils.ad.a(stringBuilder.toString());
        this.f42200p = true;
        this.editProfilePhotoView.f38599i = i;
        this.f42189e.f();
        return true;
    }

    /* renamed from: d */
    private void m51491d() {
        com.tinder.utils.ad.a();
        this.f42189e.b();
        Deadshot.take(this, this.f42191g);
        this.editProfilePhotoView.m47769a();
        this.editProfilePhotoView.f38600j = this;
        this.mEditTextBio.addTextChangedListener(this);
        this.mGenderRadios.setOnCheckedChangeListener(this);
        this.mProgressBarAuth.setVisibility(8);
        m51492e();
        if (this.f42189e.d()) {
            this.mSpotifyConnectedView.setVisibility(0);
            this.mSpotifyThemeSongView.setVisibility(0);
        }
        this.f42189e.c();
        this.mWorkEntryView.setEntryFieldClickListener(new C9640v(this));
        this.mReadonlySchoolEntryView.setEntryFieldClickListener(new C9641w(this));
        if (getArguments() != null) {
            try {
                EditProfileDestination editProfileDestination = (EditProfileDestination) getArguments().getSerializable(ActivityEditProfile.f29450d);
                if (editProfileDestination != null) {
                    m51485a(editProfileDestination);
                }
            } catch (Throwable e) {
                C0001a.c(e);
            }
        }
    }

    /* renamed from: j */
    final /* synthetic */ void m51512j(View view) {
        goToJobActivity();
    }

    /* renamed from: i */
    final /* synthetic */ void m51511i(View view) {
        goToSchoolActivity();
    }

    /* renamed from: a */
    private void m51485a(@NonNull EditProfileDestination editProfileDestination) {
        switch (C96252.f32149a[editProfileDestination.ordinal()]) {
            case 1:
                this.f42189e.l();
                return;
            case 2:
                this.f42189e.m();
                return;
            case 3:
                this.editProfilePhotoView.m47776c();
                return;
            case 4:
                this.f42191g.b();
                return;
            case 5:
                this.mSpotifyConnectedView.spotifyClicked();
                return;
            case 6:
                this.mSpotifyThemeSongView.chooseThemeSongClicked();
                return;
            default:
                return;
        }
    }

    public void goToJobActivity() {
        startActivity(ActivityJob.a(getContext()));
    }

    public void goToSchoolActivity() {
        startActivity(SchoolActivity.a(getContext()));
    }

    public void focusJob() {
        this.mJobTitleEntryView.requestFocus();
    }

    public void focusSchool() {
        this.mEditableSchoolEntryView.requestFocus();
    }

    public void showGalleryIntentNotAvailableSnackbar() {
        at.a(getActivity(), R.string.no_gallery_found);
    }

    public void displayPlusControlSettings(boolean z, boolean z2, boolean z3) {
        this.mControlYourProfileTitle.setVisibility(0);
        this.mControlYourProfileContainer.setVisibility(0);
        this.mHideAgeSwitch.setVisibility(0);
        this.mHideDistanceSwitch.setVisibility(0);
        if (z) {
            this.mHideAgeSwitch.setClickable(true);
            this.mHideDistanceSwitch.setClickable(true);
            this.mHideAgeSwitch.setChecked(z2);
            this.mHideDistanceSwitch.setChecked(z3);
            this.mHideAgeSwitch.setOnCheckedChangeListener(new ac(this));
            this.mHideDistanceSwitch.setOnCheckedChangeListener(new ad(this));
            this.mHideAgeView.setOnClickListener(new ae(this));
            this.mHideDistanceView.setOnClickListener(new af(this));
            return;
        }
        this.mHideAgeSwitch.setChecked(false);
        this.mHideDistanceSwitch.setChecked(false);
        this.mHideAgeSwitch.setClickable(false);
        this.mHideDistanceSwitch.setClickable(false);
        this.mHideAgeView.setOnClickListener(new ag(this));
        this.mHideDistanceView.setOnClickListener(new ah(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m51503b(CompoundButton compoundButton, boolean z) {
        if (this.mHideAgeTitle != null && this.mHideAgeTitle.getText() != null) {
            this.f42189e.a(z, this.mHideAgeTitle.getText().toString());
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m51498a(CompoundButton compoundButton, boolean z) {
        if (this.mHideDistanceTitle != null && this.mHideDistanceTitle.getText() != null) {
            this.f42189e.b(z, this.mHideDistanceTitle.getText().toString());
        }
    }

    /* renamed from: h */
    final /* synthetic */ void m51510h(View view) {
        this.mHideAgeSwitch.toggle();
    }

    /* renamed from: g */
    final /* synthetic */ void m51509g(View view) {
        this.mHideDistanceSwitch.toggle();
    }

    /* renamed from: f */
    final /* synthetic */ void m51508f(View view) {
        if ((getActivity() instanceof ActivityEditProfile) != null) {
            ((ActivityEditProfile) getActivity()).b();
        }
    }

    /* renamed from: e */
    final /* synthetic */ void m51507e(View view) {
        if ((getActivity() instanceof ActivityEditProfile) != null) {
            ((ActivityEditProfile) getActivity()).b();
        }
    }

    public void showNewPhotoGrid() {
        this.editProfilePhotoView.setVisibility(8);
        this.currentUserPhotos.setVisibility(0);
        this.currentUserPhotos.setPhotoExternalStoragePermissionListener(new C118401(this));
    }

    /* renamed from: a */
    public void m51495a() {
        m51496a(this.editProfilePhotoView.f38595e);
    }

    /* renamed from: a */
    public void m51496a(int i) {
        if (this.editProfilePhotoView.f38596f[i] == null) {
            m51489b(i);
        } else if (i == 0 && this.editProfilePhotoView.getNumPhotos() == 1) {
            this.editProfilePhotoView.f38599i = i;
            this.f42189e.f();
        }
    }

    /* renamed from: e */
    private void m51492e() {
        this.f42189e.e();
        this.f42189e.h();
    }

    /* renamed from: a */
    public void m51500a(boolean z) {
        this.f42189e.a(z, this.mEditTextBio.getText().toString(), this.f42198n, this.mJobTitleEntryView.getText().trim(), this.mJobCompanyEntryView.getText().trim(), this.mEditableSchoolEntryView.getText().trim());
    }

    public void onActivityResult(int i, int i2, @NonNull Intent intent) {
        com.tinder.utils.ad.a(String.format("onActivityResult %s %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        super.onActivityResult(i, i2, intent);
        if (i == 7) {
            switch (i2) {
                case -1:
                    i = intent.getStringExtra("access_code");
                    if (TextUtils.isEmpty(i) == 0) {
                        this.f42191g.a(i);
                        return;
                    }
                    this.f42187c.m40477a(new SparksEvent("Account.InstagramLoginFail"));
                    showInstagramConnectError();
                    return;
                case 0:
                    return;
                default:
                    com.tinder.utils.ad.a("Instagram Login error: code empty");
                    this.f42187c.m40477a(new SparksEvent("Account.InstagramLoginFail"));
                    showInstagramConnectError();
                    return;
            }
        } else if (i != 203) {
            switch (i) {
                case 1111:
                    if (i2 == -1) {
                        this.f42201q = intent;
                        this.f42189e.k();
                        return;
                    }
                    this.editProfilePhotoView.m47778e();
                    return;
                case 1112:
                    if (i2 == -1) {
                        CropImage.a(intent.getData()).a(Guidelines.ON_TOUCH).a(1, 1).a(true).a(getActivity(), this);
                        return;
                    } else {
                        this.editProfilePhotoView.m47778e();
                        return;
                    }
                default:
                    return;
            }
        } else {
            i = CropImage.a(intent);
            if (i2 == 204) {
                DialogError.m37618a(getContext()).m37613a((int) R.string.onboarding_error_dialog_title).m37615a(i.getError().getLocalizedMessage()).m37616a().show();
            }
            if (i2 == -1) {
                this.f42189e.a(i.getUri().getPath());
                return;
            }
            this.editProfilePhotoView.m47778e();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f42197m = new Intent(getActivity(), ActivityAddPhoto.class);
        this.f42197m.addFlags(67108864);
        this.f42189e.a(this);
        this.f42196l = new C8867t(getActivity());
    }

    @TargetApi(16)
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        layoutInflater = layoutInflater.inflate(R.layout.view_edit_profile, viewGroup, false);
        this.f42199o = ButterKnife.a(this, layoutInflater);
        m51494g();
        return layoutInflater;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f42192h.a(this);
        m51491d();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.fragment_edit_profile_menu, menu);
        this.editProfilePhotoView.f38597g = menu.findItem(R.id.menu_edit_profile_swap_profile_pic);
        this.editProfilePhotoView.f38598h = menu.findItem(R.id.menu_edit_profile_swap_pictures);
    }

    public void onEventMainThread(EventPhotosProcessed eventPhotosProcessed) {
        this.editProfilePhotoView.m47779f();
    }

    public void onResume() {
        super.onResume();
        this.f42188d.m40475a((Fragment) this);
        com.tinder.utils.ad.a();
        this.f42200p = false;
        this.editProfilePhotoView.m47774b();
        m51492e();
    }

    public void onPause() {
        super.onPause();
        Activity activity = getActivity();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        stringBuilder.append(" ENTER mSelectingPic: ");
        stringBuilder.append(this.f42200p);
        com.tinder.utils.ad.a(stringBuilder.toString());
        this.f42189e.j();
        if (activity != null) {
            activity.getWindow().setSoftInputMode(32);
        }
    }

    public void saveCurrentUserProfile() {
        Activity activity = getActivity();
        if (!this.f42200p && activity != null && !activity.isFinishing()) {
            m51500a(false);
        }
    }

    public void saveCurrentUserPhotos() {
        this.currentUserPhotos.a();
    }

    public void delegateLegacyPhotoAddedWithFacebookConnected() {
        C2640a.a(this.f42201q, "Photo data has not been set");
        this.editProfilePhotoView.m47770a(this.f42201q);
    }

    public void delegatePhotoAddedWithFacebookConnected() {
        C2640a.a(this.f42201q);
        if (TextUtils.equals(this.f42201q.getStringExtra("photoSource"), "src_camera_roll")) {
            delegateLocalPhotoAdded(this.f42201q.getStringExtra("filePath"));
        } else {
            m51484a(this.f42201q);
        }
    }

    public void delegateLegacyLocalPhotoAdded(String str) {
        this.editProfilePhotoView.m47772a(str);
    }

    public void delegateLocalPhotoAdded(String str) {
        this.currentUserPhotos.a(new LocalProfilePhoto(String.format(ManagerWebServices.PARAM_CLIENT_PHOTO_ID_FORMAT, new Object[]{Long.valueOf(System.currentTimeMillis())}), str));
    }

    public void onDestroyView() {
        super.onDestroyView();
        av.a(this.f42196l);
        if (this.f42192h.b(this)) {
            this.f42192h.c(this);
        }
        this.f42194j.a();
        this.f42195k.a();
        this.f42199o.unbind();
        this.f42189e.i();
        this.f42189e.a();
        Deadshot.drop(this);
    }

    public void showProgressDialog() {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            this.f42196l.show();
        }
    }

    public void dismissProgressDialog() {
        av.a(this.f42196l);
    }

    public void showProfileUpdatedSnackbar() {
        Activity activity = getActivity();
        if (activity != null) {
            at.a(activity, R.string.updated_profile);
        }
    }

    public void showProfileUpdateFailedSnackbar() {
        Activity activity = getActivity();
        if (activity != null) {
            at.a(activity, R.string.error_profile_update, R.string.cancel, new ai(this));
        }
    }

    /* renamed from: d */
    final /* synthetic */ void m51506d(View view) {
        m51493f();
    }

    /* renamed from: f */
    private void m51493f() {
        Activity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
            activity.finish();
        }
    }

    public void finishActivityWithSuccess() {
        Activity activity = getActivity();
        activity.setResult(-1);
        activity.finish();
    }

    public void beforeTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        m51486a(charSequence.toString());
    }

    public void afterTextChanged(@NonNull Editable editable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("editable=");
        stringBuilder.append(editable);
        com.tinder.utils.ad.a(stringBuilder.toString());
        m51486a(editable.toString());
    }

    /* renamed from: a */
    private void m51486a(@Nullable String str) {
        if (!C8578a.m36596a(str)) {
            str = 500 - str.length();
            if (this.mTextViewCharsRemaining != null) {
                this.mTextViewCharsRemaining.setText(String.valueOf(str));
                int length = this.mEditTextBio.length();
                if (str < null) {
                    this.mTextViewCharsRemaining.setTextColor(C0432b.c(getContext(), R.color.red));
                    this.mEditTextBio.getText().setSpan(new BackgroundColorSpan(-65536), str + length, length, 33);
                } else {
                    this.mTextViewCharsRemaining.setTextColor(C0432b.c(getContext(), R.color.text_light));
                    this.mEditTextBio.getText().setSpan(new BackgroundColorSpan(C0432b.c(getContext(), R.color.transparent)), 0, length, 33);
                }
            }
        }
    }

    /* renamed from: g */
    private void m51494g() {
        ((AppCompatActivity) getActivity()).setSupportActionBar(this.mToolbar);
        ActionBar supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(true);
            supportActionBar.setTitle(this.mToolbarTitle);
        }
        this.mToolbar.setNavigationOnClickListener(new aj(this));
    }

    /* renamed from: c */
    final /* synthetic */ void m51505c(View view) {
        getActivity().onBackPressed();
    }

    public void showInstagramLoginScreen() {
        com.tinder.utils.ad.a();
        this.f42186b.m40501a((Fragment) this);
    }

    @OnClick({2131362743})
    public void instagramClicked() {
        this.f42191g.a();
    }

    public void showInstagramLoggedIn(String str) {
        this.mInstagramAuthButton.setText(str);
        m51490c(true);
        m51488b(true);
    }

    public void showInstagramLoggedOut() {
        this.mInstagramAuthButton.setText(getResources().getText(R.string.instagram_login));
        m51490c(false);
        m51488b(false);
    }

    public void onAnimationStart(Animation animation) {
        com.tinder.utils.ad.a();
    }

    public void showInstagramConnectError() {
        new C11114d(getActivity(), new C9642x(this)).show();
    }

    /* renamed from: b */
    final /* synthetic */ void m51502b(View view) {
        this.f42191g.a(4);
    }

    public void showInstagramDisconnectError() {
        this.mInstagramDisconnect.setVisibility(0);
        new C11118u(getActivity(), new C9643y(this)).show();
    }

    /* renamed from: a */
    final /* synthetic */ void m51497a(View view) {
        this.f42191g.b(4);
    }

    public void showInstagramDisconnectDialog() {
        new InstagramDisconnectDialog(getActivity(), new C11853z(this)).show();
    }

    /* renamed from: c */
    final /* synthetic */ void m51504c() {
        com.tinder.utils.ad.a("instagram start logout");
        this.f42191g.b(1);
    }

    public void onAnimationEnd(Animation animation) {
        com.tinder.utils.ad.a();
    }

    public void showInstagramAccountInUseError() {
        new C11113b(getActivity()).show();
    }

    public void showProgress() {
        this.mProgressBarAuth.setVisibility(0);
        this.mInstagramDisconnect.setVisibility(4);
    }

    public void onAnimationRepeat(Animation animation) {
        com.tinder.utils.ad.a();
    }

    public void hideProgress() {
        this.mProgressBarAuth.setVisibility(8);
    }

    /* renamed from: b */
    private void m51488b(boolean z) {
        this.mInstagramDisconnect.setVisibility(z ? false : true);
    }

    /* renamed from: c */
    private void m51490c(boolean z) {
        this.mInstagramAuthButton.setTextColor(z ? this.instagramLoggedInNameColor : this.tinderRedColor);
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f42198n = i == R.id.gender_male ? Value.MALE : Value.FEMALE;
    }

    public void enableSpotifyViews() {
        this.mSpotifyConnectedView.setVisibility(0);
        this.mSpotifyThemeSongView.setVisibility(0);
    }

    public void hideSpotifyViews() {
        this.mSpotifyConnectedView.setVisibility(8);
        this.mSpotifyThemeSongView.setVisibility(8);
    }

    public void enableMoreGenderView() {
        this.mGenderHeader.setText(getString(R.string.i_am));
        this.mGenderGroup.setVisibility(8);
        this.mGenderMore.setVisibility(0);
    }

    public void hideMoreGenderView() {
        this.mGenderHeader.setText(getString(R.string.gender));
        this.mGenderGroup.setVisibility(0);
        this.mGenderMore.setVisibility(8);
    }

    public void setUserGender(Value value, String str) {
        if (TextUtils.isEmpty(str)) {
            if (value == Value.FEMALE) {
                value = R.string.woman;
            } else {
                int i = R.string.man;
            }
            this.mGenderMore.setText(getString(value));
            return;
        }
        this.mGenderMore.setText(str);
    }

    public void setName(String str) {
        TextView textView = this.mAboutMe;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.about));
        stringBuilder.append(' ');
        stringBuilder.append(str);
        textView.setText(stringBuilder.toString());
    }

    public void setGender(Value value) {
        this.f42198n = value;
        this.mGenderRadios.check(this.f42198n == Value.MALE ? R.id.gender_male : R.id.gender_female);
    }

    public void setBio(String str) {
        if (str != null && str.length() > 500) {
            str = str.substring(0, 500);
        }
        m51486a(str);
        this.mEditTextBio.setText(str);
    }

    public void showMyJob(Optional<Job> optional) {
        optional.a(new aa(this), new ab(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m51499a(Job job) {
        this.mWorkEntryView.setText(m51483a(getContext(), job));
        Object titleName = job.titleName();
        if (!TextUtils.isEmpty(titleName) && job.titleDisplayed()) {
            this.mJobTitleEntryView.setText(Html.fromHtml(titleName.trim()));
        }
        titleName = job.companyName();
        if (!TextUtils.isEmpty(titleName) && job.companyDisplayed() != null) {
            this.mJobCompanyEntryView.setText(Html.fromHtml(titleName.trim()));
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m51501b() {
        this.mWorkEntryView.setText(getString(R.string.select_work));
    }

    public void selectPhotosWithFacebook() {
        startActivityForResult(this.f42197m, 1111);
    }

    public void selectPhotosNoFacebook() {
        Intent intent = new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI);
        try {
            if (this.f42190f.a(intent)) {
                startActivityForResult(intent, 1112);
            } else {
                this.f42189e.g();
            }
        } catch (Throwable e) {
            C0001a.c(e);
            this.f42189e.g();
        }
    }

    public void showMySchool(@Nullable CharSequence charSequence) {
        if (charSequence != null) {
            this.mReadonlySchoolEntryView.setText(charSequence.toString());
            this.mEditableSchoolEntryView.setText(charSequence.toString());
            return;
        }
        this.mReadonlySchoolEntryView.setText(getString(R.string.select_schools));
    }

    public void hideMySchool() {
        this.mReadonlySchoolEntryView.setText(getString(R.string.select_schools));
    }

    @OnClick({2131362367})
    public void onMoreGenderClicked() {
        getContext().startActivity(MoreGenderActivity.a(getContext()));
    }

    public void enableJobEditing() {
        av.a(new View[]{this.mJobTitleEntryView, this.mJobCompanyEntryView});
        av.c(new View[]{this.mWorkEntryView});
    }

    public void setJobEditingMaxLength(int i, int i2) {
        this.mJobTitleEntryView.setFieldFilter(new InputFilter[]{new LengthFilter(i)});
        this.mJobCompanyEntryView.setFieldFilter(new InputFilter[]{new LengthFilter(i2)});
    }

    public void disableJobEditing() {
        av.a(new View[]{this.mWorkEntryView});
        av.c(new View[]{this.mJobTitleEntryView, this.mJobCompanyEntryView});
    }

    public void enableSchoolEditing() {
        av.a(new View[]{this.mEditableSchoolEntryView});
        av.c(new View[]{this.mReadonlySchoolEntryView});
    }

    public void disableSchoolsEditing() {
        av.a(new View[]{this.mReadonlySchoolEntryView});
        av.c(new View[]{this.mEditableSchoolEntryView});
    }

    public void setSchoolEditingMaxLength(int i) {
        this.mEditableSchoolEntryView.setFieldFilter(new InputFilter[]{new LengthFilter(i)});
    }

    public void showInstagramConnected(String str) {
        this.mInstagramAuthButton.setText(str);
        m51490c(true);
        m51488b(true);
    }

    public void showInstagramDisconnected() {
        this.mInstagramAuthButton.setText(R.string.instagram_login);
        m51490c(false);
        m51488b(false);
    }

    @Nullable
    /* renamed from: a */
    private Spanned m51483a(@Nullable Context context, Job job) {
        if (context == null) {
            return null;
        }
        Object titleName = job.titleName();
        int isEmpty = TextUtils.isEmpty(titleName) ^ 1;
        Object obj = (isEmpty == 0 || !job.titleDisplayed()) ? null : 1;
        Object companyName = job.companyName();
        int isEmpty2 = TextUtils.isEmpty(companyName) ^ 1;
        job = (isEmpty2 == 0 || job.companyDisplayed() == null) ? null : true;
        if (isEmpty != 0 && obj != null && isEmpty2 != 0 && job != null) {
            return Html.fromHtml(context.getString(R.string.job_at, new Object[]{titleName, companyName}).trim());
        } else if (isEmpty != 0 && obj != null) {
            return Html.fromHtml(titleName.trim());
        } else {
            if (isEmpty2 == 0 || job == null) {
                return null;
            }
            return Html.fromHtml(companyName.trim());
        }
    }

    /* renamed from: a */
    private void m51484a(Intent intent) {
        String stringExtra = intent.getStringExtra("source");
        String stringExtra2 = intent.getStringExtra("id");
        CroppingInfo croppingInfo = new CroppingInfo(new Coordinates((double) intent.getFloatExtra(ManagerWebServices.PARAM_XOFFSET_PERCENT, -1.0f), (double) intent.getFloatExtra(ManagerWebServices.PARAM_YOFFSET_PERCENT, -1.0f)), new Coordinates((double) intent.getFloatExtra(ManagerWebServices.PARAM_XDISTANCE_PERCENT, -1.0f), (double) intent.getFloatExtra(ManagerWebServices.PARAM_YDISTANCE_PERCENT, -1.0f)));
        if (croppingInfo.isMissingCroppingCoordinates() == null) {
            this.currentUserPhotos.a(new PendingFacebookPhoto(stringExtra2, stringExtra, croppingInfo));
        }
    }
}
