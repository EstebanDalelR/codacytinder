package com.tinder.fragments;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.account.photos.CurrentUserPhotosView;
import com.tinder.profile.view.EditProfileSingleLineEntryView;
import com.tinder.spotify.views.SpotifyConnectView;
import com.tinder.spotify.views.SpotifyThemeSongView;
import com.tinder.views.CustomSwitch;

public class FragmentEditProfile_ViewBinding implements Unbinder {
    /* renamed from: b */
    private FragmentEditProfile f38624b;
    /* renamed from: c */
    private View f38625c;
    /* renamed from: d */
    private View f38626d;

    @UiThread
    public FragmentEditProfile_ViewBinding(final FragmentEditProfile fragmentEditProfile, View view) {
        this.f38624b = fragmentEditProfile;
        fragmentEditProfile.mToolbar = (Toolbar) C0761c.b(view, R.id.toolbar_edit_profile, "field 'mToolbar'", Toolbar.class);
        fragmentEditProfile.mScrollViewTop = (NestedScrollView) C0761c.b(view, R.id.scrollView, "field 'mScrollViewTop'", NestedScrollView.class);
        fragmentEditProfile.mLinearLayoutBio = (LinearLayout) C0761c.b(view, R.id.linearLayout_bio, "field 'mLinearLayoutBio'", LinearLayout.class);
        fragmentEditProfile.mEditTextBio = (EditText) C0761c.b(view, R.id.editText_bio, "field 'mEditTextBio'", EditText.class);
        fragmentEditProfile.mTextViewCharsRemaining = (TextView) C0761c.b(view, R.id.textView_chars_remaining, "field 'mTextViewCharsRemaining'", TextView.class);
        fragmentEditProfile.mProgressBarAuth = (ProgressBar) C0761c.b(view, R.id.progress_web, "field 'mProgressBarAuth'", ProgressBar.class);
        fragmentEditProfile.mGenderRadios = (RadioGroup) C0761c.b(view, R.id.edit_profile_gender_radios, "field 'mGenderRadios'", RadioGroup.class);
        View a = C0761c.a(view, R.id.instagram_container, "field 'mInstagramSelectContainer' and method 'instagramClicked'");
        fragmentEditProfile.mInstagramSelectContainer = a;
        this.f38625c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ FragmentEditProfile_ViewBinding f38621b;

            public void doClick(View view) {
                fragmentEditProfile.instagramClicked();
            }
        });
        fragmentEditProfile.mInstagramAuthButton = (TextView) C0761c.b(view, R.id.button_instagram_auth, "field 'mInstagramAuthButton'", TextView.class);
        fragmentEditProfile.mInstagramDisconnect = (TextView) C0761c.b(view, R.id.disconnect_button, "field 'mInstagramDisconnect'", TextView.class);
        fragmentEditProfile.mAboutMe = (TextView) C0761c.b(view, R.id.about_me, "field 'mAboutMe'", TextView.class);
        fragmentEditProfile.mControlYourProfileTitle = (TextView) C0761c.b(view, R.id.control_your_profile_title, "field 'mControlYourProfileTitle'", TextView.class);
        fragmentEditProfile.mControlYourProfileContainer = C0761c.a(view, R.id.control_your_profile_container, "field 'mControlYourProfileContainer'");
        fragmentEditProfile.mHideAgeSwitch = (CustomSwitch) C0761c.b(view, R.id.hide_age_switch, "field 'mHideAgeSwitch'", CustomSwitch.class);
        fragmentEditProfile.mHideDistanceSwitch = (CustomSwitch) C0761c.b(view, R.id.hide_distance_switch, "field 'mHideDistanceSwitch'", CustomSwitch.class);
        fragmentEditProfile.mHideAgeView = C0761c.a(view, R.id.hide_age_container, "field 'mHideAgeView'");
        fragmentEditProfile.mHideDistanceView = C0761c.a(view, R.id.hide_distance_container, "field 'mHideDistanceView'");
        fragmentEditProfile.mHideAgeTitle = (TextView) C0761c.b(view, R.id.hide_age_title, "field 'mHideAgeTitle'", TextView.class);
        fragmentEditProfile.mHideDistanceTitle = (TextView) C0761c.b(view, R.id.hide_distance_title, "field 'mHideDistanceTitle'", TextView.class);
        fragmentEditProfile.mOptimizeToggleLabel = (TextView) C0761c.b(view, R.id.optimize_label, "field 'mOptimizeToggleLabel'", TextView.class);
        fragmentEditProfile.mSpotifyThemeSongView = (SpotifyThemeSongView) C0761c.b(view, R.id.edit_profile_theme_song, "field 'mSpotifyThemeSongView'", SpotifyThemeSongView.class);
        fragmentEditProfile.mSpotifyConnectedView = (SpotifyConnectView) C0761c.b(view, R.id.edit_profile_spotify_connect, "field 'mSpotifyConnectedView'", SpotifyConnectView.class);
        fragmentEditProfile.mGenderHeader = (TextView) C0761c.b(view, R.id.edit_profile_gender_header, "field 'mGenderHeader'", TextView.class);
        fragmentEditProfile.mGenderGroup = C0761c.a(view, R.id.edit_profile_gender_radios_group, "field 'mGenderGroup'");
        a = C0761c.a(view, R.id.edit_profile_i_am, "field 'mGenderMore' and method 'onMoreGenderClicked'");
        fragmentEditProfile.mGenderMore = (TextView) C0761c.c(a, R.id.edit_profile_i_am, "field 'mGenderMore'", TextView.class);
        this.f38626d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ FragmentEditProfile_ViewBinding f38623b;

            public void doClick(View view) {
                fragmentEditProfile.onMoreGenderClicked();
            }
        });
        fragmentEditProfile.mWorkEntryView = (EditProfileSingleLineEntryView) C0761c.b(view, R.id.edit_profile_work, "field 'mWorkEntryView'", EditProfileSingleLineEntryView.class);
        fragmentEditProfile.mJobTitleEntryView = (EditProfileSingleLineEntryView) C0761c.b(view, R.id.edit_profile_job_title, "field 'mJobTitleEntryView'", EditProfileSingleLineEntryView.class);
        fragmentEditProfile.mJobCompanyEntryView = (EditProfileSingleLineEntryView) C0761c.b(view, R.id.edit_profile_job_company, "field 'mJobCompanyEntryView'", EditProfileSingleLineEntryView.class);
        fragmentEditProfile.mReadonlySchoolEntryView = (EditProfileSingleLineEntryView) C0761c.b(view, R.id.edit_profile_education, "field 'mReadonlySchoolEntryView'", EditProfileSingleLineEntryView.class);
        fragmentEditProfile.mEditableSchoolEntryView = (EditProfileSingleLineEntryView) C0761c.b(view, R.id.edit_profile_sms_education, "field 'mEditableSchoolEntryView'", EditProfileSingleLineEntryView.class);
        fragmentEditProfile.editProfilePhotoView = (EditProfilePhotoView) C0761c.b(view, R.id.edit_profile_photo, "field 'editProfilePhotoView'", EditProfilePhotoView.class);
        fragmentEditProfile.currentUserPhotos = (CurrentUserPhotosView) C0761c.b(view, R.id.current_user_photos, "field 'currentUserPhotos'", CurrentUserPhotosView.class);
        view = view.getContext();
        Resources resources = view.getResources();
        fragmentEditProfile.instagramLoggedInNameColor = C0432b.c(view, R.color.instagram_loggedin_name);
        fragmentEditProfile.tinderRedColor = C0432b.c(view, R.color.tinder_red);
        fragmentEditProfile.mToolbarTitle = resources.getString(R.string.edit_profile);
    }

    @CallSuper
    public void unbind() {
        FragmentEditProfile fragmentEditProfile = this.f38624b;
        if (fragmentEditProfile == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f38624b = null;
        fragmentEditProfile.mToolbar = null;
        fragmentEditProfile.mScrollViewTop = null;
        fragmentEditProfile.mLinearLayoutBio = null;
        fragmentEditProfile.mEditTextBio = null;
        fragmentEditProfile.mTextViewCharsRemaining = null;
        fragmentEditProfile.mProgressBarAuth = null;
        fragmentEditProfile.mGenderRadios = null;
        fragmentEditProfile.mInstagramSelectContainer = null;
        fragmentEditProfile.mInstagramAuthButton = null;
        fragmentEditProfile.mInstagramDisconnect = null;
        fragmentEditProfile.mAboutMe = null;
        fragmentEditProfile.mControlYourProfileTitle = null;
        fragmentEditProfile.mControlYourProfileContainer = null;
        fragmentEditProfile.mHideAgeSwitch = null;
        fragmentEditProfile.mHideDistanceSwitch = null;
        fragmentEditProfile.mHideAgeView = null;
        fragmentEditProfile.mHideDistanceView = null;
        fragmentEditProfile.mHideAgeTitle = null;
        fragmentEditProfile.mHideDistanceTitle = null;
        fragmentEditProfile.mOptimizeToggleLabel = null;
        fragmentEditProfile.mSpotifyThemeSongView = null;
        fragmentEditProfile.mSpotifyConnectedView = null;
        fragmentEditProfile.mGenderHeader = null;
        fragmentEditProfile.mGenderGroup = null;
        fragmentEditProfile.mGenderMore = null;
        fragmentEditProfile.mWorkEntryView = null;
        fragmentEditProfile.mJobTitleEntryView = null;
        fragmentEditProfile.mJobCompanyEntryView = null;
        fragmentEditProfile.mReadonlySchoolEntryView = null;
        fragmentEditProfile.mEditableSchoolEntryView = null;
        fragmentEditProfile.editProfilePhotoView = null;
        fragmentEditProfile.currentUserPhotos = null;
        this.f38625c.setOnClickListener(null);
        this.f38625c = null;
        this.f38626d.setOnClickListener(null);
        this.f38626d = null;
    }
}
