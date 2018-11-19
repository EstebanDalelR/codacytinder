package com.tinder.settings.activity;

import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.settings.SettingsNotificationItemView;
import com.tinder.settings.views.SettingsPurchaseView;
import com.tinder.views.CustomTextView;
import com.tinder.views.LinearAdapterLayout;

public class SettingsActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private SettingsActivity f51344b;
    /* renamed from: c */
    private View f51345c;
    /* renamed from: d */
    private View f51346d;
    /* renamed from: e */
    private View f51347e;
    /* renamed from: f */
    private View f51348f;
    /* renamed from: g */
    private View f51349g;
    /* renamed from: h */
    private View f51350h;
    /* renamed from: i */
    private View f51351i;
    /* renamed from: j */
    private View f51352j;
    /* renamed from: k */
    private View f51353k;
    /* renamed from: l */
    private View f51354l;
    /* renamed from: m */
    private View f51355m;
    /* renamed from: n */
    private View f51356n;
    /* renamed from: o */
    private View f51357o;
    /* renamed from: p */
    private View f51358p;
    /* renamed from: q */
    private View f51359q;
    /* renamed from: r */
    private View f51360r;

    @UiThread
    public SettingsActivity_ViewBinding(final SettingsActivity settingsActivity, View view) {
        this.f51344b = settingsActivity;
        settingsActivity.mCheckBoxDiscover = (SwitchCompat) C0761c.b(view, R.id.checkBox_discover, "field 'mCheckBoxDiscover'", SwitchCompat.class);
        View a = C0761c.a(view, R.id.settings_get_tinder_plus, "field 'mViewGetPlus' and method 'onBuyTinderPlus'");
        settingsActivity.mViewGetPlus = (CardView) C0761c.c(a, R.id.settings_get_tinder_plus, "field 'mViewGetPlus'", CardView.class);
        this.f51345c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51327b;

            public void doClick(View view) {
                settingsActivity.onBuyTinderPlus();
            }
        });
        a = C0761c.a(view, R.id.settings_get_boost, "field 'mViewGetBoost' and method 'onGetBoostALCClick'");
        settingsActivity.mViewGetBoost = (CardView) C0761c.c(a, R.id.settings_get_boost, "field 'mViewGetBoost'", CardView.class);
        this.f51346d = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51343b;

            public void doClick(View view) {
                settingsActivity.onGetBoostALCClick();
            }
        });
        settingsActivity.mTxtGetBoost = (TextView) C0761c.b(view, R.id.settings_get_boost_btn, "field 'mTxtGetBoost'", TextView.class);
        a = C0761c.a(view, R.id.settings_get_more_super_likes, "field 'mViewBuyALC' and method 'onBuyALCClicked'");
        settingsActivity.mViewBuyALC = (CardView) C0761c.c(a, R.id.settings_get_more_super_likes, "field 'mViewBuyALC'", CardView.class);
        this.f51347e = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51313b;

            public void doClick(View view) {
                settingsActivity.onBuyALCClicked();
            }
        });
        settingsActivity.mTxtPlusOffer = (TextView) C0761c.b(view, R.id.settings_get_tinder_plus_btn, "field 'mTxtPlusOffer'", TextView.class);
        settingsActivity.settingsPurchaseView = (SettingsPurchaseView) C0761c.b(view, R.id.settings_consumables, "field 'settingsPurchaseView'", SettingsPurchaseView.class);
        settingsActivity.mSeekBarDistance = (SeekBar) C0761c.b(view, R.id.seekBar_distance, "field 'mSeekBarDistance'", SeekBar.class);
        settingsActivity.mTextDistance = (TextView) C0761c.b(view, R.id.textView_distance, "field 'mTextDistance'", TextView.class);
        settingsActivity.mTextYears = (TextView) C0761c.b(view, R.id.textView_years, "field 'mTextYears'", TextView.class);
        settingsActivity.mTextShowMe = (TextView) C0761c.b(view, R.id.textView_show_me, "field 'mTextShowMe'", TextView.class);
        settingsActivity.mTextLocationLabel = (TextView) C0761c.b(view, R.id.settings_passport_location_txt, "field 'mTextLocationLabel'", TextView.class);
        settingsActivity.mCheckBoxMale = (SwitchCompat) C0761c.b(view, R.id.checkBox_males, "field 'mCheckBoxMale'", SwitchCompat.class);
        settingsActivity.mCheckBoxFemale = (SwitchCompat) C0761c.b(view, R.id.checkBox_females, "field 'mCheckBoxFemale'", SwitchCompat.class);
        settingsActivity.mPassportList = (LinearAdapterLayout) C0761c.b(view, R.id.settings_passport_list_recents, "field 'mPassportList'", LinearAdapterLayout.class);
        settingsActivity.mClaimArrow = C0761c.a(view, R.id.claim_arrow, "field 'mClaimArrow'");
        settingsActivity.mUsernameCatchphrase = C0761c.a(view, R.id.username_catchphrase, "field 'mUsernameCatchphrase'");
        settingsActivity.mWebProfileContainer = C0761c.a(view, R.id.web_profile_container, "field 'mWebProfileContainer'");
        a = C0761c.a(view, R.id.layout_settings_url, "field 'mWebProfileButton' and method 'onUsernameClicked'");
        settingsActivity.mWebProfileButton = a;
        this.f51348f = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51315b;

            public void doClick(View view) {
                settingsActivity.onUsernameClicked();
            }
        });
        a = C0761c.a(view, R.id.settings_view_web_profile, "field 'mWebProfileViewButton' and method 'onViewMyProfile'");
        settingsActivity.mWebProfileViewButton = (CustomTextView) C0761c.c(a, R.id.settings_view_web_profile, "field 'mWebProfileViewButton'", CustomTextView.class);
        this.f51349g = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51317b;

            public void doClick(View view) {
                settingsActivity.onViewMyProfile();
            }
        });
        a = C0761c.a(view, R.id.settings_share_web_profile, "field 'mWebProfileShareButton' and method 'onShareWebProfile'");
        settingsActivity.mWebProfileShareButton = (CustomTextView) C0761c.c(a, R.id.settings_share_web_profile, "field 'mWebProfileShareButton'", CustomTextView.class);
        this.f51350h = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51319b;

            public void doClick(View view) {
                settingsActivity.onShareWebProfile();
            }
        });
        settingsActivity.mWebProfileLink = (CustomTextView) C0761c.b(view, R.id.settings_txt_url, "field 'mWebProfileLink'", CustomTextView.class);
        settingsActivity.mTextVersionNum = (TextView) C0761c.b(view, R.id.txt_version_num, "field 'mTextVersionNum'", TextView.class);
        settingsActivity.mDiscoveryDisclaimerText = (TextView) C0761c.b(view, R.id.discovery_disclaimer_txt, "field 'mDiscoveryDisclaimerText'", TextView.class);
        settingsActivity.mTextViewPrefersUnit = (TextView) C0761c.b(view, R.id.textView_distances_in, "field 'mTextViewPrefersUnit'", TextView.class);
        settingsActivity.mRadioButtonMiles = (RadioButton) C0761c.b(view, R.id.radioButton_miles, "field 'mRadioButtonMiles'", RadioButton.class);
        settingsActivity.mRadioButtonKilometers = (RadioButton) C0761c.b(view, R.id.radioButton_kilometers, "field 'mRadioButtonKilometers'", RadioButton.class);
        a = C0761c.a(view, R.id.button_open_source, "field 'mOpenSource' and method 'onOpenSourceClick'");
        settingsActivity.mOpenSource = a;
        this.f51351i = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51321b;

            public void doClick(View view) {
                settingsActivity.onOpenSourceClick();
            }
        });
        a = C0761c.a(view, R.id.button_logout, "field 'mButtonLogout' and method 'onLogoutButtonClick'");
        settingsActivity.mButtonLogout = a;
        this.f51352j = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51323b;

            public void doClick(View view) {
                settingsActivity.onLogoutButtonClick();
            }
        });
        settingsActivity.mAgePrefsContainer = (FrameLayout) C0761c.b(view, R.id.layout_age, "field 'mAgePrefsContainer'", FrameLayout.class);
        settingsActivity.mToolbar = (Toolbar) C0761c.b(view, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
        a = C0761c.a(view, R.id.button_restore_purchase, "field 'mButtonRestorePurchase' and method 'onRestorePurchasesClicked'");
        settingsActivity.mButtonRestorePurchase = a;
        this.f51353k = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51325b;

            public void doClick(View view) {
                settingsActivity.onRestorePurchasesClicked();
            }
        });
        a = C0761c.a(view, R.id.button_privacy_policy, "field 'mButtonPrivacy' and method 'onPrivacyButtonClicked'");
        settingsActivity.mButtonPrivacy = a;
        this.f51354l = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51329b;

            public void doClick(View view) {
                settingsActivity.onPrivacyButtonClicked();
            }
        });
        a = C0761c.a(view, R.id.button_tos, "field 'mButtonTerms' and method 'onTOSButtonClicked'");
        settingsActivity.mButtonTerms = a;
        this.f51355m = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51331b;

            public void doClick(View view) {
                settingsActivity.onTOSButtonClicked();
            }
        });
        a = C0761c.a(view, R.id.button_share, "field 'mButtonshare' and method 'onShareButtonClicked'");
        settingsActivity.mButtonshare = a;
        this.f51356n = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51333b;

            public void doClick(View view) {
                settingsActivity.onShareButtonClicked();
            }
        });
        a = C0761c.a(view, R.id.layout_settings_passport, "field 'mPassportContainer' and method 'onPassportClicked'");
        settingsActivity.mPassportContainer = (ViewGroup) C0761c.c(a, R.id.layout_settings_passport, "field 'mPassportContainer'", ViewGroup.class);
        this.f51357o = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51335b;

            public void doClick(View view) {
                settingsActivity.onPassportClicked();
            }
        });
        settingsActivity.mPassportDescription = C0761c.a(view, R.id.settings_passport_description, "field 'mPassportDescription'");
        settingsActivity.mShowMeGender = (CustomTextView) C0761c.b(view, R.id.checkBox_show_me, "field 'mShowMeGender'", CustomTextView.class);
        settingsActivity.deleteText = (TextView) C0761c.b(view, R.id.delete_account_text, "field 'deleteText'", TextView.class);
        a = C0761c.a(view, R.id.button_delete_account, "field 'deleteButton' and method 'onDeleteAccountClick'");
        settingsActivity.deleteButton = a;
        this.f51358p = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51337b;

            public void doClick(View view) {
                settingsActivity.onDeleteAccountClick();
            }
        });
        settingsActivity.placesSettings = C0761c.a(view, R.id.placesSettingsContainer, "field 'placesSettings'");
        settingsActivity.settingsNotificationItemView = (SettingsNotificationItemView) C0761c.b(view, R.id.settings_notification_item_view, "field 'settingsNotificationItemView'", SettingsNotificationItemView.class);
        settingsActivity.appSettingsHeader = C0761c.a(view, R.id.app_settings_header, "field 'appSettingsHeader'");
        a = C0761c.a(view, R.id.settings_btn_help_and_support, "method 'onHelpClicked'");
        this.f51359q = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51339b;

            public void doClick(View view) {
                settingsActivity.onHelpClicked();
            }
        });
        a = C0761c.a(view, R.id.managePlacesButton, "method 'onPlacesSettingsClicked'");
        this.f51360r = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ SettingsActivity_ViewBinding f51341b;

            public void doClick(View view) {
                settingsActivity.onPlacesSettingsClicked();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        settingsActivity.seekBarthumb = C0432b.a(view, R.drawable.seekbar_thumb);
        settingsActivity.seekBarthumbSelected = C0432b.a(view, R.drawable.seekbar_thumb_selected);
        settingsActivity.mBothGender = resources.getString(R.string.both_gender);
        settingsActivity.mWoman = resources.getString(R.string.females);
        settingsActivity.mMan = resources.getString(R.string.males);
        settingsActivity.termsOfService = resources.getString(R.string.terms_of_service);
        settingsActivity.privacyPolicy = resources.getString(R.string.privacy_policy);
        settingsActivity.pauseAccountString = resources.getString(R.string.pause_account);
        settingsActivity.deactivateAccountString = resources.getString(R.string.deactivate_account);
    }

    @CallSuper
    public void unbind() {
        SettingsActivity settingsActivity = this.f51344b;
        if (settingsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f51344b = null;
        settingsActivity.mCheckBoxDiscover = null;
        settingsActivity.mViewGetPlus = null;
        settingsActivity.mViewGetBoost = null;
        settingsActivity.mTxtGetBoost = null;
        settingsActivity.mViewBuyALC = null;
        settingsActivity.mTxtPlusOffer = null;
        settingsActivity.settingsPurchaseView = null;
        settingsActivity.mSeekBarDistance = null;
        settingsActivity.mTextDistance = null;
        settingsActivity.mTextYears = null;
        settingsActivity.mTextShowMe = null;
        settingsActivity.mTextLocationLabel = null;
        settingsActivity.mCheckBoxMale = null;
        settingsActivity.mCheckBoxFemale = null;
        settingsActivity.mPassportList = null;
        settingsActivity.mClaimArrow = null;
        settingsActivity.mUsernameCatchphrase = null;
        settingsActivity.mWebProfileContainer = null;
        settingsActivity.mWebProfileButton = null;
        settingsActivity.mWebProfileViewButton = null;
        settingsActivity.mWebProfileShareButton = null;
        settingsActivity.mWebProfileLink = null;
        settingsActivity.mTextVersionNum = null;
        settingsActivity.mDiscoveryDisclaimerText = null;
        settingsActivity.mTextViewPrefersUnit = null;
        settingsActivity.mRadioButtonMiles = null;
        settingsActivity.mRadioButtonKilometers = null;
        settingsActivity.mOpenSource = null;
        settingsActivity.mButtonLogout = null;
        settingsActivity.mAgePrefsContainer = null;
        settingsActivity.mToolbar = null;
        settingsActivity.mButtonRestorePurchase = null;
        settingsActivity.mButtonPrivacy = null;
        settingsActivity.mButtonTerms = null;
        settingsActivity.mButtonshare = null;
        settingsActivity.mPassportContainer = null;
        settingsActivity.mPassportDescription = null;
        settingsActivity.mShowMeGender = null;
        settingsActivity.deleteText = null;
        settingsActivity.deleteButton = null;
        settingsActivity.placesSettings = null;
        settingsActivity.settingsNotificationItemView = null;
        settingsActivity.appSettingsHeader = null;
        this.f51345c.setOnClickListener(null);
        this.f51345c = null;
        this.f51346d.setOnClickListener(null);
        this.f51346d = null;
        this.f51347e.setOnClickListener(null);
        this.f51347e = null;
        this.f51348f.setOnClickListener(null);
        this.f51348f = null;
        this.f51349g.setOnClickListener(null);
        this.f51349g = null;
        this.f51350h.setOnClickListener(null);
        this.f51350h = null;
        this.f51351i.setOnClickListener(null);
        this.f51351i = null;
        this.f51352j.setOnClickListener(null);
        this.f51352j = null;
        this.f51353k.setOnClickListener(null);
        this.f51353k = null;
        this.f51354l.setOnClickListener(null);
        this.f51354l = null;
        this.f51355m.setOnClickListener(null);
        this.f51355m = null;
        this.f51356n.setOnClickListener(null);
        this.f51356n = null;
        this.f51357o.setOnClickListener(null);
        this.f51357o = null;
        this.f51358p.setOnClickListener(null);
        this.f51358p = null;
        this.f51359q.setOnClickListener(null);
        this.f51359q = null;
        this.f51360r.setOnClickListener(null);
        this.f51360r = null;
    }
}
