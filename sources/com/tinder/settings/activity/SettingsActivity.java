package com.tinder.settings.activity;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.C0432b;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.ads.AdError;
import com.tinder.R;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.apprating.view.AppRatingDialog;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.dialogs.C8867t;
import com.tinder.dialogs.ConfirmLogoutDialog;
import com.tinder.dialogs.ConfirmLogoutDialog.ListenerLogoutClick;
import com.tinder.dialogs.al;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ad;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.model.SparksEvent;
import com.tinder.model.auth.LogoutFrom$BUTTON;
import com.tinder.module.Default;
import com.tinder.p238f.p239a.C9363a;
import com.tinder.passport.activities.ActivityPassport;
import com.tinder.passport.model.PassportLocation;
import com.tinder.passport.p093d.C3945a;
import com.tinder.passport.p300a.C10032a;
import com.tinder.passport.p300a.C10032a.C10031a;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.places.settings.activity.PlacesSettingsActivity;
import com.tinder.settings.SettingsNotificationItemView;
import com.tinder.settings.p405c.C14867d;
import com.tinder.settings.presenter.C18077q;
import com.tinder.settings.targets.SettingsTarget;
import com.tinder.settings.views.SettingsPurchaseView;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.ac;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.views.CustomTextView;
import com.tinder.views.LinearAdapterLayout;
import com.tinder.views.RangeSeekBar;
import com.tinder.views.RangeSeekBar.OnRangeSeekBarChangeListener;
import com.tinder.webprofile.activity.WebProfileUsernameActivity;
import de.greenrobot.event.C2664c;
import de.psdev.licensesdialog.C15543b.C15542a;
import java.util.Locale;
import javax.inject.Inject;

public class SettingsActivity extends ActivitySignedInBase implements OnTouchListener, OnCheckedChangeListener, OnSeekBarChangeListener, ListenerLogoutClick, SettingsTarget, OnRangeSeekBarChangeListener<Integer> {
    /* renamed from: T */
    private long f59991T = 0;
    /* renamed from: U */
    private int f59992U;
    /* renamed from: V */
    private int f59993V;
    /* renamed from: W */
    private final int f59994W = 18;
    /* renamed from: X */
    private final int f59995X = 55;
    /* renamed from: Y */
    private final int f59996Y = 46;
    /* renamed from: Z */
    private boolean f59997Z;
    @Inject
    /* renamed from: a */
    C3945a f59998a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private RangeSeekBar<Integer> ae;
    @BindView(2131361891)
    View appSettingsHeader;
    @Inject
    /* renamed from: b */
    bj f59999b;
    @Inject
    /* renamed from: c */
    ManagerNetwork f60000c;
    @Inject
    /* renamed from: d */
    ad f60001d;
    @BindString(2131820890)
    String deactivateAccountString;
    @BindView(2131362013)
    View deleteButton;
    @BindView(2131362293)
    TextView deleteText;
    @Inject
    /* renamed from: e */
    ManagerAnalytics f60002e;
    @Default
    @Inject
    /* renamed from: f */
    C2664c f60003f;
    @Inject
    /* renamed from: g */
    LegacyBreadCrumbTracker f60004g;
    @Inject
    /* renamed from: h */
    EnvironmentProvider f60005h;
    @Inject
    /* renamed from: i */
    bk f60006i;
    @Inject
    /* renamed from: j */
    C15193i f60007j;
    @Inject
    /* renamed from: k */
    C9363a f60008k;
    @Inject
    /* renamed from: l */
    FastMatchConfigProvider f60009l;
    @Inject
    /* renamed from: m */
    C14867d f60010m;
    @BindView(2131362819)
    FrameLayout mAgePrefsContainer;
    @BindString(2131820685)
    String mBothGender;
    @BindView(2131362018)
    View mButtonLogout;
    @BindView(2131362020)
    View mButtonPrivacy;
    @BindView(2131362021)
    View mButtonRestorePurchase;
    @BindView(2131362027)
    View mButtonTerms;
    @BindView(2131362023)
    View mButtonshare;
    @BindView(2131362109)
    SwitchCompat mCheckBoxDiscover;
    @BindView(2131362110)
    SwitchCompat mCheckBoxFemale;
    @BindView(2131362111)
    SwitchCompat mCheckBoxMale;
    @BindView(2131362127)
    View mClaimArrow;
    @BindView(2131362331)
    TextView mDiscoveryDisclaimerText;
    @BindString(2131821321)
    String mMan;
    @BindView(2131362019)
    View mOpenSource;
    @BindView(2131362821)
    ViewGroup mPassportContainer;
    @BindView(2131363548)
    View mPassportDescription;
    @BindView(2131363549)
    LinearAdapterLayout mPassportList;
    @BindView(2131363366)
    RadioButton mRadioButtonKilometers;
    @BindView(2131363367)
    RadioButton mRadioButtonMiles;
    @BindView(2131363533)
    SeekBar mSeekBarDistance;
    @BindView(2131362112)
    CustomTextView mShowMeGender;
    @BindView(2131363760)
    TextView mTextDistance;
    @BindView(2131363550)
    TextView mTextLocationLabel;
    @BindView(2131363763)
    TextView mTextShowMe;
    @BindView(2131363899)
    TextView mTextVersionNum;
    @BindView(2131363762)
    TextView mTextViewPrefersUnit;
    @BindView(2131363764)
    TextView mTextYears;
    @BindView(2131363818)
    Toolbar mToolbar;
    @BindView(2131363543)
    TextView mTxtGetBoost;
    @BindView(2131363546)
    TextView mTxtPlusOffer;
    @BindView(2131363935)
    View mUsernameCatchphrase;
    @BindView(2131363544)
    CardView mViewBuyALC;
    @BindView(2131363542)
    CardView mViewGetBoost;
    @BindView(2131363545)
    CardView mViewGetPlus;
    @BindView(2131362822)
    View mWebProfileButton;
    @BindView(2131363983)
    View mWebProfileContainer;
    @BindView(2131363553)
    CustomTextView mWebProfileLink;
    @BindView(2131363551)
    CustomTextView mWebProfileShareButton;
    @BindView(2131363554)
    CustomTextView mWebProfileViewButton;
    @BindString(2131821094)
    String mWoman;
    @Inject
    /* renamed from: n */
    C18077q f60011n;
    /* renamed from: o */
    private C10031a f60012o;
    /* renamed from: p */
    private C10032a f60013p;
    @BindString(2131821526)
    String pauseAccountString;
    @BindView(2131363259)
    View placesSettings;
    @BindString(2131821708)
    String privacyPolicy;
    /* renamed from: q */
    private C8867t f60014q;
    /* renamed from: r */
    private al f60015r;
    /* renamed from: s */
    private boolean f60016s;
    @BindDrawable(2131231866)
    Drawable seekBarthumb;
    @BindDrawable(2131231868)
    Drawable seekBarthumbSelected;
    @BindView(2131363547)
    SettingsNotificationItemView settingsNotificationItemView;
    @BindView(2131363541)
    SettingsPurchaseView settingsPurchaseView;
    /* renamed from: t */
    private boolean f60017t;
    @BindString(2131821994)
    String termsOfService;
    /* renamed from: u */
    private boolean f60018u;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public /* synthetic */ void onRangeSeekBarValuesChanged(RangeSeekBar rangeSeekBar, Object obj, Object obj2) {
        m68715a(rangeSeekBar, (Integer) obj, (Integer) obj2);
    }

    @NonNull
    /* renamed from: a */
    public static Intent m68693a(@NonNull Context context) {
        Intent intent = new Intent(context, SettingsActivity.class);
        intent.putExtra("open_passport_menu", "openPassportMenu()");
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        ButterKnife.a(this);
        ManagerApp.e().inject(this);
        this.mToolbar.setNavigationOnClickListener(new C14850j(this));
        this.mToolbar.setTitle(R.string.settings);
        setSupportActionBar(this.mToolbar);
        bundle = getSupportActionBar();
        if (bundle != null) {
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        m68701g();
        m68700f();
        m68699e();
        overridePendingTransition(R.anim.slide_up_fifty_percent_to_default, R.anim.slide_down_five_percent_from_default);
    }

    /* renamed from: d */
    final /* synthetic */ void m68719d(View view) {
        onBackPressed();
    }

    /* renamed from: e */
    private void m68699e() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("open_passport_menu");
            if (stringExtra != null && stringExtra.equals("openPassportMenu()")) {
                new Handler().postDelayed(new C14851k(this), 300);
            }
        }
    }

    /* renamed from: d */
    final /* synthetic */ void m68718d() {
        m68708v();
    }

    protected void onStart() {
        super.onStart();
        this.f60011n.a(this);
        this.f60011n.m65628b();
    }

    protected void onStop() {
        super.onStop();
        this.f60011n.m65620a();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_up_five_percent_to_default, R.anim.slide_down_entirely_from_default);
    }

    @SuppressLint({"StringFormatInvalid"})
    /* renamed from: f */
    private void m68700f() {
        this.f60002e.a(new SparksEvent("UserInteraction.Settings").put("category", 0).put("subcategory", 0));
        av.b(this.mButtonRestorePurchase);
        av.b(this.mButtonLogout);
        av.b(this.mOpenSource);
        av.b(this.mButtonPrivacy);
        av.b(this.mButtonTerms);
        av.b(this.mButtonshare);
        this.mTextVersionNum.setText(getString(R.string.version, new Object[]{"9.4.1(9040176)"}));
        this.mRadioButtonMiles.setOnCheckedChangeListener(this);
        this.mRadioButtonKilometers.setOnCheckedChangeListener(this);
        new LayoutTransition().setAnimator(1, null);
    }

    /* renamed from: g */
    private void m68701g() {
        m68707u();
        this.ae = new RangeSeekBar((BitmapDrawable) this.seekBarthumb, (BitmapDrawable) this.seekBarthumbSelected, Integer.valueOf(18), Integer.valueOf(55), Integer.valueOf(46), this);
        this.ae.setLineHeight((float) getResources().getDimensionPixelSize(R.dimen.slider_line_width));
        this.ae.setSliderSecondaryColor(C0432b.c(this, R.color.gray_background_light));
        this.ae.setSliderPrimaryColor(C0432b.c(this, R.color.tinder_red));
        this.ae.setThumbColor(C0432b.c(this, R.color.tinder_red));
        this.mAgePrefsContainer.addView(this.ae, new LayoutParams(-1, -1, 17));
        this.ae.setNotifyWhileDragging(true);
        this.ae.setContentDescription("age_range_bar");
        this.aa = this.f59999b.e();
        this.ab = this.f59999b.f();
        this.f59997Z = this.f59999b.a();
        this.ad = (int) this.f59999b.b();
        if (this.f60011n.m65641i()) {
            this.mShowMeGender.setOnClickListener(new C14852l(this));
            this.mShowMeGender.setVisibility(0);
            this.mCheckBoxFemale.setVisibility(8);
            this.mCheckBoxMale.setVisibility(8);
        } else {
            this.mShowMeGender.setOnClickListener(null);
            this.mShowMeGender.setVisibility(8);
            this.mCheckBoxFemale.setChecked(this.aa);
            this.mCheckBoxMale.setChecked(this.ab);
            this.mCheckBoxFemale.setVisibility(0);
            this.mCheckBoxMale.setVisibility(0);
        }
        this.ae.setOnRangeSeekBarChangeListener(this);
        this.mSeekBarDistance.setOnSeekBarChangeListener(this);
        this.mCheckBoxDiscover.setOnCheckedChangeListener(this);
        this.mCheckBoxMale.setOnCheckedChangeListener(this);
        this.mCheckBoxFemale.setOnCheckedChangeListener(this);
        m68710x();
        m68696b(this.ad);
        m68706t();
    }

    /* renamed from: c */
    final /* synthetic */ void m68717c(View view) {
        m68692C();
    }

    public void onResume() {
        super.onResume();
        this.f60004g.a(this);
        m68703q();
        m68704r();
        this.ac = this.f59999b.g();
        this.mCheckBoxDiscover.setChecked(this.ac);
        if (this.f60011n.m65641i()) {
            this.aa = this.f59999b.e();
            this.ab = this.f59999b.f();
            if (this.aa && this.ab) {
                this.mShowMeGender.setText(this.mBothGender);
            } else if (this.aa) {
                this.mShowMeGender.setText(this.mWoman);
            } else {
                this.mShowMeGender.setText(this.mMan);
            }
        }
        this.f60011n.m65638g();
    }

    public void onPause() {
        super.onPause();
        if (!(this.f60016s || this.f60017t || !m68711y())) {
            m68702p();
        }
        this.f60003f.c(this);
        av.a(this.f60015r);
        av.a(this.f60014q);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("request code: ");
        stringBuilder.append(i);
        com.tinder.utils.ad.a(stringBuilder.toString());
        this.f60011n.a(this);
        int i3 = 1;
        if (i == 8800 && i2 == -1) {
            PassportLocation passportLocation = (PassportLocation) intent.getParcelableExtra("tinderlocation");
            if (passportLocation == null) {
                com.tinder.utils.ad.c("No location in data passed back by ActivityPassport");
            } else if (this.f60007j.m57121a() != 0) {
                i2 = this.f59998a.b();
                if (i2 == 0 || i2.equals(passportLocation) == 0) {
                    i3 = 0;
                }
                if (i3 == 0) {
                    this.f60000c.cancelRequestsWithTag("travel_request");
                    this.f59998a.d(passportLocation);
                    this.f60013p.a(this.f59998a.a(4));
                    this.f60013p.a(passportLocation);
                    this.f60012o.f32917c.setColorFilter(C10032a.f32920b);
                    this.f60012o.f32918d.setVisibility(4);
                }
            } else {
                C10076o.a(PlusPaywallSource.PASSPORT_RECENT_LOCATION).a(this);
            }
        } else if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 1) {
            setResult(1);
            finish();
        } else if (i2 == 2) {
            this.f60011n.m65636e();
        }
    }

    @OnClick({2131363544})
    void onBuyALCClicked() {
        C10076o.a(SuperlikePaywallSource.SETTINGS_SUPERLIKE_BUTTON).a(this);
    }

    @OnClick({2131363542})
    public void onGetBoostALCClick() {
        this.f60011n.m65640h();
    }

    @OnClick({2131363540})
    void onHelpClicked() {
        this.f60011n.m65644l();
    }

    public void showFAQScreen(@Nullable String str) {
        this.f60001d.a(this, str);
    }

    public void showNetworkFailureMessage() {
        at.m57644b((Activity) this, (int) R.string.error_network_missing);
    }

    public void showRatingView(@StringRes int i) {
        View findViewById = findViewById(R.id.rate_us_or_give_feedback_container);
        CustomTextView customTextView = (CustomTextView) findViewById.findViewById(R.id.rate_us_or_give_feedback_textView);
        findViewById.setVisibility(0);
        customTextView.setText(getResources().getString(i));
        findViewById.setOnClickListener(new C14853m(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m68716b(View view) {
        new AppRatingDialog(this).show();
    }

    @OnClick({2131362822})
    void onUsernameClicked() {
        startActivity(WebProfileUsernameActivity.m68619a((Context) this));
    }

    @OnClick({2131363554})
    void onViewMyProfile() {
        this.f60011n.m65648p();
    }

    @OnClick({2131363551})
    void onShareWebProfile() {
        this.f60011n.m65649q();
    }

    @OnClick({2131362878})
    void onPlacesSettingsClicked() {
        this.f60011n.m65650r();
    }

    public void showPlacesOptions(Boolean bool) {
        this.placesSettings.setVisibility(bool.booleanValue() != null ? null : 8);
    }

    public void navigateToPlacesSettings() {
        startActivity(PlacesSettingsActivity.f45452a.b(this));
    }

    public void launchMyWebProfile(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(m68695b(str))));
    }

    public void createShareWebProfileIntent(String str) {
        str = m68695b(str);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, getResources().getString(R.string.share_url)));
        this.f60002e.a(new SparksEvent("DeepLink.ShareID"));
    }

    public void showEmailSettings() {
        this.settingsNotificationItemView.m56221a();
    }

    @OnClick({2131362821})
    void onPassportClicked() {
        m68708v();
    }

    @OnClick({2131362023})
    void onShareButtonClicked() {
        this.f60002e.a(new SparksEvent("Menu.Share"));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", getString(R.string.share_text));
        startActivity(Intent.createChooser(intent, getString(R.string.share_dialog_title)));
    }

    @OnClick({2131362027})
    void onTOSButtonClicked() {
        this.f60015r = new al(this, m68694a(ManagerWebServices.URL_TOS), this.termsOfService);
        this.f60015r.show();
        this.f60011n.m65642j();
    }

    @OnClick({2131362020})
    void onPrivacyButtonClicked() {
        this.f60015r = new al(this, m68694a(ManagerWebServices.URL_PRIVACY), this.privacyPolicy);
        this.f60015r.show();
        this.f60011n.m65643k();
    }

    @OnClick({2131362021})
    void onRestorePurchasesClicked() {
        this.f60011n.m65645m();
    }

    @OnClick({2131362018})
    void onLogoutButtonClick() {
        new ConfirmLogoutDialog(this, this).show();
    }

    @OnClick({2131362013})
    void onDeleteAccountClick() {
        this.f60011n.m65637f();
    }

    @OnClick({2131362019})
    void onOpenSourceClick() {
        new C15542a(this).m58030a((int) R.string.licenses).m58031a(this.f60010m.m56288a()).m58032a(true).m58033a().m58042b();
    }

    @OnClick({2131363545})
    void onBuyTinderPlus() {
        C10076o.a(PlusPaywallSource.SETTINGS_PLUS_BUTTON).a(this);
    }

    public void showRestoreInProgressMessage() {
        at.m57638a((Activity) this, (int) R.string.restoring_purchase);
    }

    public void showRestoreSuccessMessage(@StringRes int i) {
        at.m57644b((Activity) this, i);
    }

    public void showRestoreFailureMessage(@StringRes int i, String str) {
        if (TextUtils.isEmpty(str)) {
            at.m57638a((Activity) this, i);
            return;
        }
        at.m57640a((Activity) this, String.format("%s\nError: %s", new Object[]{getString(i), str}));
    }

    public void launchActivityExitSurvey() {
        startActivityForResult(new Intent(this, ExitSurveyActivity.class), 1);
    }

    public void launchActivityPassport() {
        startActivityForResult(new Intent(this, ActivityPassport.class), 8800);
    }

    public void showWebProfileUsername(String str) {
        this.mWebProfileViewButton.setVisibility(0);
        this.mWebProfileShareButton.setVisibility(0);
        this.mWebProfileLink.setText(str);
        this.mClaimArrow.setVisibility(8);
        this.mUsernameCatchphrase.setVisibility(8);
    }

    public void showWebProfileUsernameUnavailable() {
        this.mWebProfileLink.setText(getString(R.string.claim_username));
        this.mWebProfileViewButton.setVisibility(8);
        this.mWebProfileShareButton.setVisibility(8);
        this.mClaimArrow.setVisibility(0);
        this.mUsernameCatchphrase.setVisibility(0);
    }

    /* renamed from: p */
    private void m68702p() {
        this.f60011n.m65621a(DiscoverySettings.builder().isDiscoverable(this.ac).genderFilter(GenderFilter.fromToggles(this.ab, this.aa)).distanceFilter(this.ad).minAgeFilter(this.f59992U).maxAgeFilter(m68712z()).build());
    }

    /* renamed from: q */
    private void m68703q() {
        this.f59997Z = this.f59999b.a();
    }

    /* renamed from: r */
    private void m68704r() {
        this.mRadioButtonMiles.setChecked(this.f59997Z);
        this.mRadioButtonKilometers.setChecked(this.f59997Z ^ 1);
    }

    /* renamed from: s */
    private void m68705s() {
        this.mTextViewPrefersUnit.setText("");
        if (this.f59997Z) {
            com.tinder.utils.ad.a("Prefers miles");
            this.mTextViewPrefersUnit.setText(getString(R.string.miles));
            this.mRadioButtonMiles.setTextColor(C0432b.c(this, R.color.white));
            this.mRadioButtonKilometers.setTextColor(C0432b.c(this, R.color.gray));
            return;
        }
        com.tinder.utils.ad.a("Prefers kms");
        this.mTextViewPrefersUnit.setText(getString(R.string.kilometers));
        this.mRadioButtonMiles.setTextColor(C0432b.c(this, R.color.gray));
        this.mRadioButtonKilometers.setTextColor(C0432b.c(this, R.color.white));
    }

    /* renamed from: t */
    private void m68706t() {
        if (this.f60007j.m57123c()) {
            this.mPassportContainer.getLayoutTransition().setInterpolator(0, new OvershootInterpolator());
            PassportLocation b = this.f59998a.b();
            this.f60013p = new C10032a(this, this.f59998a.a(4));
            this.f60013p.a(b);
            this.f60012o = new C10031a();
            View inflate = LayoutInflater.from(this).inflate(R.layout.cell_recent_passport, this.mPassportList, false);
            this.f60012o.f32917c = (ImageView) inflate.findViewById(R.id.purchased_location_img);
            this.f60012o.f32917c.setImageResource(R.drawable.settings_passport_current_location);
            this.f60012o.f32917c.setColorFilter(C10032a.f32919a);
            this.mPassportList.setHeader(inflate);
            this.f60012o.f32915a = (TextView) inflate.findViewById(R.id.purchased_location_name);
            this.f60012o.f32915a.setText(R.string.my_current_location);
            this.f60012o.f32918d = (ImageView) inflate.findViewById(R.id.purchased_location_check);
            inflate = LayoutInflater.from(this).inflate(R.layout.cell_recent_passport, this.mPassportList, false);
            inflate.setTag("footer");
            inflate.setBackgroundResource(R.drawable.rounded_rectangle_white);
            ((ImageView) inflate.findViewById(R.id.purchased_location_img)).setVisibility(4);
            TextView textView = (TextView) inflate.findViewById(R.id.purchased_location_name);
            textView.setText(R.string.add_a_new_location);
            textView.setTextColor(C0432b.b(this, R.color.selector_premium_blue_text));
            this.mPassportList.setFooter(inflate);
            this.mPassportList.setOnClickListenerForItems(new C14854n(this));
            this.mPassportList.setAdapter(this.f60013p);
            if (b == null) {
                this.mTextLocationLabel.setText(R.string.my_current_location);
                this.f60012o.f32918d.setVisibility(0);
                this.f60012o.f32917c.setColorFilter(C10032a.f32919a);
            } else {
                this.mTextLocationLabel.setText(b.getDisplayLabel());
                this.f60012o.f32917c.setColorFilter(C10032a.f32920b);
            }
            return;
        }
        this.mPassportContainer.setVisibility(8);
        this.mPassportDescription.setVisibility(8);
    }

    /* renamed from: a */
    final /* synthetic */ void m68713a(View view) {
        int indexOfChild = this.mPassportList.indexOfChild(view);
        view = (view.getTag() == null || view.getTag().equals("footer") == null) ? null : true;
        com.tinder.utils.ad.a();
        if (view != null) {
            if (SystemClock.elapsedRealtime() - this.f59991T >= 1000) {
                this.f59991T = SystemClock.elapsedRealtime();
                this.f60011n.m65634d();
            }
        } else if (indexOfChild == 0) {
            this.f60013p.a(null);
            this.f60012o.f32918d.setVisibility(0);
            this.f60012o.f32917c.setColorFilter(C10032a.f32919a);
            view = getString(R.string.my_current_location);
            SparksEvent sparksEvent = new SparksEvent("Passport.MenuMyLocation");
            sparksEvent.put(ManagerWebServices.PARAM_FROM, 2);
            this.f60002e.a(sparksEvent);
            this.f59998a.c();
            this.mTextLocationLabel.setText(view);
        } else {
            PassportLocation passportLocation = (PassportLocation) this.f60013p.getItem(indexOfChild - 1);
            CharSequence displayLabel = passportLocation.getDisplayLabel();
            if (this.f60007j.m57121a()) {
                this.f60012o.f32918d.setVisibility(4);
                this.f60012o.f32917c.setColorFilter(C10032a.f32920b);
                this.mTextLocationLabel.setText(displayLabel);
                this.f60013p.a(passportLocation);
                this.mTextLocationLabel.setText(displayLabel);
                this.f59998a.d(passportLocation);
            }
            AsyncTask.execute(new C14855o(this, passportLocation));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m68714a(PassportLocation passportLocation) {
        SparksEvent sparksEvent = new SparksEvent("Passport.MenuChooseLocation");
        sparksEvent.put("newLat", passportLocation.getLatitude());
        sparksEvent.put("newLon", passportLocation.getLongitude());
        this.f60002e.a(sparksEvent);
    }

    /* renamed from: u */
    private void m68707u() {
        this.f59992U = Math.max(this.f59999b.c(), 18);
        this.f59993V = Math.min(this.f59999b.d(), 55);
    }

    /* renamed from: v */
    private void m68708v() {
        this.mTextLocationLabel.setVisibility(4);
        this.mPassportList.setVisibility(0);
        this.f60011n.m65646n();
    }

    /* renamed from: w */
    private void m68709w() {
        this.mTextShowMe.setText("");
        if (this.ab) {
            this.mTextShowMe.append(getString(R.string.males));
        }
        if (this.aa) {
            if (this.ab) {
                this.mTextShowMe.append(", ");
            }
            this.mTextShowMe.append(getString(R.string.females));
        }
    }

    /* renamed from: b */
    private void m68696b(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("distance change ");
        stringBuilder.append(i);
        com.tinder.utils.ad.a(stringBuilder.toString());
        i = Math.max(1, i);
        this.mSeekBarDistance.setProgress(i);
        m68698c(i);
    }

    /* renamed from: c */
    private void m68698c(int i) {
        String string;
        if (this.f59997Z) {
            string = getString(R.string.short_distance_unit_mi);
        } else {
            string = getString(R.string.short_distance_unit_km);
        }
        if (!this.f59997Z) {
            i = Math.round(ac.m57610a((float) i));
        }
        this.mTextDistance.setText(String.format(Locale.getDefault(), "%d%s", new Object[]{Integer.valueOf(i), string}));
    }

    /* renamed from: x */
    private void m68710x() {
        this.ae.setSelectedMinValue(Integer.valueOf(this.f59992U));
        this.ae.setSelectedMaxValue(Integer.valueOf(this.f59993V));
        this.mTextYears.setText(String.format(Locale.getDefault(), "%d - %d", new Object[]{Integer.valueOf(this.f59992U), Integer.valueOf(this.f59993V)}));
        if (this.f59993V == 55) {
            this.mTextYears.setText(String.format("%s+", new Object[]{this.mTextYears.getText()}));
        }
    }

    /* renamed from: a */
    private String m68694a(String str) {
        return String.format("%s?locale=%s", new Object[]{str, Locale.getDefault()});
    }

    /* renamed from: y */
    private boolean m68711y() {
        boolean z = false;
        if (this.aa || this.ab) {
            Object obj;
            if (!this.f59999b.h() && this.aa == this.f59999b.e()) {
                if (this.ab == this.f59999b.f()) {
                    obj = null;
                    if (!(obj == null && this.f59992U == this.f59999b.c() && m68712z() == this.f59999b.d() && this.ac == this.f59999b.g() && ((float) this.ad) == this.f59999b.b())) {
                        z = true;
                    }
                    return z;
                }
            }
            obj = 1;
            z = true;
            return z;
        }
        com.tinder.utils.ad.b("mAreFemalesLiked and mAreMalesLiked are both false. DiscoverySettings can not be updated");
        return false;
    }

    /* renamed from: z */
    private int m68712z() {
        return this.f59993V == 55 ? AdError.NETWORK_ERROR_CODE : this.f59993V;
    }

    public void showProgressDialog() {
        if (!isFinishing()) {
            if (this.f60014q == null) {
                this.f60014q = new C8867t(this);
            }
            if (!this.f60014q.isShowing()) {
                this.f60014q.show();
            }
        }
    }

    /* renamed from: A */
    private void m68690A() {
        if (!this.f60017t) {
            showProgressDialog();
            this.f60017t = true;
            this.f60011n.m65623a(LogoutFrom$BUTTON.INSTANCE);
        }
    }

    public void onAccountDeleted() {
        com.tinder.utils.ad.a("ACCT DELETED");
        bk.a();
        av.a(this.f60014q);
        this.f60016s = true;
        finish();
        m68697b((Context) this);
    }

    /* renamed from: b */
    private static void m68697b(@NonNull Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_show_intro", "");
                    launchIntentForPackage.putExtras(bundle);
                    launchIntentForPackage.putExtra("show delete account dialog", true);
                    launchIntentForPackage.addFlags(67108864);
                    ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 100, PendingIntent.getActivity(context, 223344, launchIntentForPackage, 268435456));
                    System.exit(null);
                    return;
                }
                com.tinder.utils.ad.c("Was not able to restart application, relaunchIntent null");
                return;
            }
            com.tinder.utils.ad.c("Was not able to restart application, PackageManager was null??");
        } catch (Context context2) {
            com.tinder.utils.ad.a("Was not able to restart application due to exception", context2);
        }
    }

    public void onAccountDeleteFailed() {
        com.tinder.utils.ad.a("ACCT NOT DELETED");
        av.a(this.f60014q);
        at.m57638a((Activity) this, (int) R.string.failed_delete);
    }

    public void showGroupsViews() {
        this.mDiscoveryDisclaimerText.setText(R.string.show_me_on_tinder_disclaimer);
    }

    public void hideGroupsViews() {
        this.mDiscoveryDisclaimerText.setText(R.string.show_in_discover_disclaimer);
    }

    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        if (av.b(motionEvent) != null) {
            av.a(view, false);
        } else {
            av.a(view, true);
        }
        return false;
    }

    public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean z) {
        compoundButton = compoundButton.getId();
        switch (compoundButton) {
            case R.id.checkBox_discover:
                this.ac = z;
                return;
            case R.id.checkBox_females:
                this.aa = z;
                if (!z) {
                    this.mCheckBoxMale.setChecked(true);
                }
                m68709w();
                return;
            case R.id.checkBox_males:
                this.ab = z;
                if (!z) {
                    this.mCheckBoxFemale.setChecked(true);
                }
                m68709w();
                return;
            default:
                switch (compoundButton) {
                    case R.id.radioButton_kilometers:
                        compoundButton = new StringBuilder();
                        compoundButton.append("kms checked=");
                        compoundButton.append(z);
                        com.tinder.utils.ad.a(compoundButton.toString());
                        if (z) {
                            this.f59997Z = false;
                            this.f59999b.a(false);
                            m68705s();
                            m68698c(this.mSeekBarDistance.getProgress());
                            return;
                        }
                        return;
                    case R.id.radioButton_miles:
                        compoundButton = new StringBuilder();
                        compoundButton.append("miles checked=");
                        compoundButton.append(z);
                        com.tinder.utils.ad.a(compoundButton.toString());
                        if (z) {
                            this.f59997Z = true;
                            this.f59999b.a(true);
                            m68705s();
                            m68698c(this.mSeekBarDistance.getProgress());
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    public void hideDeleteButton() {
        av.c(new View[]{this.deleteButton});
    }

    public void setDeleteButtonText(@StringRes int i) {
        this.deleteText.setText(i);
    }

    public void onProfileUpdated() {
        at.m57638a((Activity) this, (int) R.string.updated_profile);
        m68691B();
    }

    public void onProfileUpdateFailed() {
        com.tinder.utils.ad.a();
        at.m57638a((Activity) this, (int) R.string.failed_update_profile);
        m68691B();
    }

    public void onDiscoveryPrefsUpdated() {
        this.f59999b.f(false);
    }

    public void onDiscoveryPrefUpdateFailed() {
        com.tinder.utils.ad.c("Failed to update discovery prefs");
    }

    /* renamed from: B */
    private void m68691B() {
        av.a(this.f60014q);
        if (this.f60018u) {
            this.f60018u = false;
        }
    }

    public void onLogoutClick() {
        m68690A();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.ad = Math.max(1, i);
        m68698c(this.ad);
    }

    /* renamed from: a */
    public void m68715a(RangeSeekBar<?> rangeSeekBar, Integer num, Integer num2) {
        this.f59992U = num.intValue();
        this.f59993V = num2.intValue();
        m68710x();
    }

    public void hideSuperlikeAlc() {
        this.mViewBuyALC.setVisibility(8);
    }

    public void showSuperlikeAlc() {
        this.mViewBuyALC.setVisibility(0);
    }

    public void showGetPlus() {
        this.mViewGetPlus.setVisibility(0);
    }

    public void hideGetPlus() {
        this.mViewGetPlus.setVisibility(8);
    }

    public void showPlusOffer(@StringRes int i) {
        this.mTxtPlusOffer.setText(i);
    }

    public void showBoostAlc() {
        this.mViewGetBoost.setVisibility(0);
    }

    public void hideBoostAlc() {
        this.mViewGetBoost.setVisibility(8);
    }

    public void showSettingsPurchaseView() {
        this.settingsPurchaseView.setVisibility(0);
    }

    public void hideSettingsPurchaseView() {
        this.settingsPurchaseView.setVisibility(8);
    }

    public void hideProgressDialog() {
        av.a(this.f60014q);
    }

    /* renamed from: C */
    private void m68692C() {
        startActivity(ShowMeActivity.m68655a((Context) this));
    }

    /* renamed from: b */
    private String m68695b(String str) {
        String string = getString(R.string.web_profile_prefix);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
