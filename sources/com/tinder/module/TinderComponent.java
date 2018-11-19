package com.tinder.module;

import com.google.android.gms.iid.InstanceIDListenerService;
import com.tinder.account.photos.component.AccountComponent.Parent;
import com.tinder.account.view.UpdateAccountEmailPasswordActivity;
import com.tinder.account.view.UpdateEmailView;
import com.tinder.account.view.UpdatePasswordView;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.activities.ActivityBanned;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.activities.ActivityGiphy;
import com.tinder.activities.ActivityJob;
import com.tinder.activities.ActivityVerification;
import com.tinder.activities.LoginActivity;
import com.tinder.activities.SchoolActivity;
import com.tinder.activities.WebViewActivityInstagram;
import com.tinder.analytics.C2634g;
import com.tinder.app.dagger.component.MainActivityComponent;
import com.tinder.apprating.p086a.C8257a;
import com.tinder.apprating.view.AppRatingDialog;
import com.tinder.auth.accountkit.AccountKitErrorHeaderFragment;
import com.tinder.auth.accountkit.LoginAccountKitUiManager;
import com.tinder.auth.accountkit.ValidateAccountKitUiManager;
import com.tinder.auth.view.LoginButtonGroupView;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.bitmoji.di.BitmojiComponent;
import com.tinder.boost.dialog.BoostPaywallDialog;
import com.tinder.boost.dialog.BoostSummaryDialog;
import com.tinder.boost.dialog.BoostUpdateDialog;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.presenter.C12628f;
import com.tinder.boost.provider.C10443i;
import com.tinder.boost.view.BoostButtonView;
import com.tinder.chat.injection.components.ChatActivitySubcomponent;
import com.tinder.crashindicator.view.AppCrashDialog;
import com.tinder.dialogs.DialogIsTween;
import com.tinder.dialogs.ad;
import com.tinder.editprofile.view.EditFeedSettingItemView;
import com.tinder.fastmatch.FastMatchRecsActivityComponent;
import com.tinder.fastmatch.view.FastMatchPreviewRowView;
import com.tinder.fastmatch.view.FastMatchPreviewView;
import com.tinder.fastmatch.view.TinderGoldPaywallDialog;
import com.tinder.fragments.C13308g;
import com.tinder.fragments.C13309n;
import com.tinder.fragments.C13310q;
import com.tinder.fragments.EditProfilePhotoView;
import com.tinder.fragments.FragmentAgeMoreGender;
import com.tinder.fragments.FragmentEditProfile;
import com.tinder.fragments.FragmentMap;
import com.tinder.fragments.am;
import com.tinder.fragments.ap;
import com.tinder.fragments.as;
import com.tinder.goingout.view.TimeSinceTextView;
import com.tinder.interactors.C9715f;
import com.tinder.intro.IntroFragment;
import com.tinder.intropricing.di.IntroPricingApplicationComponent;
import com.tinder.loops.di.LoopsApplicationComponent;
import com.tinder.managers.ManagerApp;
import com.tinder.match.DeleteSponsoredMessageJobService;
import com.tinder.match.dialog.C12043a;
import com.tinder.model.SparksEvent;
import com.tinder.notifications.di.SettingsNotificationComponent;
import com.tinder.onboarding.dialog.PhotoSourceSelectorSheetDialog;
import com.tinder.onboarding.module.C2655a;
import com.tinder.onboarding.module.OnboardingComponent;
import com.tinder.overflow.actionitem.C12227d;
import com.tinder.overflow.actionitem.C12231g;
import com.tinder.overflow.actionitem.C12234k;
import com.tinder.overflow.actionitem.C12237m;
import com.tinder.overflow.analytics.RecommendProfileBroadcastReceiver;
import com.tinder.p071a.C2603i;
import com.tinder.p257g.C9648e;
import com.tinder.passport.activities.ActivityPassport;
import com.tinder.paywall.p304b.C12265d;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.viewmodels.C10090l;
import com.tinder.photooptimizer.C13558c;
import com.tinder.places.injection.PlacesComponent;
import com.tinder.places.injection.PlacesDisabledSurveyComponent;
import com.tinder.places.injection.PlacesOnboardingComponent;
import com.tinder.places.injection.PlacesRecsComponent;
import com.tinder.places.injection.PlacesSettingsComponent;
import com.tinder.places.injection.PlacesSurveyOtherComponent;
import com.tinder.places.job.SubmitVisitJob;
import com.tinder.presenters.PresenterDialogIsTween;
import com.tinder.presenters.bf;
import com.tinder.presenters.df;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.presenter.C14426e;
import com.tinder.profile.view.ProfileBitmojiAuthView;
import com.tinder.purchase.job.ReportBillingTimeoutService;
import com.tinder.pushnotifications.TinderGcmListenerService;
import com.tinder.pushnotifications.view.InAppNotificationView;
import com.tinder.reactions.dialog.C16315a;
import com.tinder.services.GCMRegistrationIntentService;
import com.tinder.services.ProcessingPhotosTaskService;
import com.tinder.settings.activity.GenderSearchActivity;
import com.tinder.settings.activity.SettingsActivity;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponent;
import com.tinder.settings.feed.view.FeedSettingsItemView;
import com.tinder.settings.jobs.ReactivateAccountJob;
import com.tinder.settings.loops.injection.AutoPlayLoopsOptionsActivityComponent.Builder;
import com.tinder.settings.loops.view.AutoPlayVideoSettingsView;
import com.tinder.settings.module.C2656a;
import com.tinder.settings.module.ExitSurveyComponent;
import com.tinder.settings.p404b.C14865b;
import com.tinder.settings.presenter.C18077q;
import com.tinder.settings.views.GenderSearchView;
import com.tinder.settings.views.MoreGenderView;
import com.tinder.settings.views.SettingsPurchaseView;
import com.tinder.settings.views.ShowMeView;
import com.tinder.settingsemail.email.component.EmailSettingsComponent$Parent;
import com.tinder.spotify.activity.SpotifyAuthActivity;
import com.tinder.spotify.adapter.SpotifyTrackSearchAdapter;
import com.tinder.spotify.p416b.C18159b;
import com.tinder.spotify.p416b.C18161c;
import com.tinder.spotify.p416b.C18167w;
import com.tinder.spotify.views.SpotifyConnectView;
import com.tinder.spotify.views.SpotifyPickArtistView;
import com.tinder.spotify.views.SpotifyPlayerView;
import com.tinder.spotify.views.SpotifyThemeSongView;
import com.tinder.spotify.views.SpotifyTopTrackItemView;
import com.tinder.spotify.views.SpotifyTrackSearchView;
import com.tinder.superlike.dialog.SuperlikePaywallDialog;
import com.tinder.tindergold.view.TinderGoldIntroDialog;
import com.tinder.tinderplus.activities.ActivityTPlusControl;
import com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl;
import com.tinder.tinderplus.dialog.TinderPlusPaywallDialog;
import com.tinder.tinderplus.p428a.C15190c;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.p429b.C18211a;
import com.tinder.toppicks.di.TopPicksApplicationComponent;
import com.tinder.utils.AppLifeCycleTracker;
import com.tinder.utils.OkHttpGlideModule;
import com.tinder.video.injection.VideoComponent;
import com.tinder.views.MapFrameLayout;
import com.tinder.views.MatchListLayout;
import com.tinder.webprofile.di.WebProfileComponent;

public interface TinderComponent extends Parent, BitmojiComponent.Parent, IntroPricingApplicationComponent.Parent, LoopsApplicationComponent.Parent, SettingsNotificationComponent.Parent, EmailSettingsComponent$Parent, TopPicksApplicationComponent.Parent, VideoComponent.Parent, WebProfileComponent.Parent {
    Builder autoPlayLoopsSettingsActivityComponentBuilder();

    ChatActivitySubcomponent.Builder chatActivityComponentBuilder();

    FastMatchRecsActivityComponent.Builder fastMatchRecsActivityComponentBuilder();

    FeedSettingsActivityComponent.Builder feedSettingsActivityComponentBuilder();

    void inject(InstanceIDListenerService instanceIDListenerService);

    void inject(C2603i c2603i);

    void inject(UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity);

    void inject(UpdateEmailView updateEmailView);

    void inject(UpdatePasswordView updatePasswordView);

    void inject(ActivityAddPhoto activityAddPhoto);

    void inject(ActivityBanned activityBanned);

    void inject(ActivityEditProfile activityEditProfile);

    void inject(ActivityGiphy activityGiphy);

    void inject(ActivityJob activityJob);

    void inject(ActivityVerification activityVerification);

    void inject(LoginActivity loginActivity);

    void inject(SchoolActivity schoolActivity);

    void inject(WebViewActivityInstagram webViewActivityInstagram);

    void inject(C2634g c2634g);

    void inject(C8257a c8257a);

    void inject(AppRatingDialog appRatingDialog);

    void inject(AccountKitErrorHeaderFragment accountKitErrorHeaderFragment);

    void inject(LoginAccountKitUiManager loginAccountKitUiManager);

    void inject(ValidateAccountKitUiManager validateAccountKitUiManager);

    void inject(LoginButtonGroupView loginButtonGroupView);

    void inject(ActivityBase activityBase);

    void inject(ActivitySignedInBase activitySignedInBase);

    void inject(C10400d c10400d);

    void inject(BoostPaywallDialog boostPaywallDialog);

    void inject(BoostSummaryDialog boostSummaryDialog);

    void inject(BoostUpdateDialog boostUpdateDialog);

    void inject(C12628f c12628f);

    void inject(C10443i c10443i);

    void inject(BoostButtonView boostButtonView);

    void inject(AppCrashDialog appCrashDialog);

    void inject(DialogIsTween dialogIsTween);

    void inject(ad adVar);

    void inject(EditFeedSettingItemView editFeedSettingItemView);

    void inject(FastMatchPreviewRowView fastMatchPreviewRowView);

    void inject(FastMatchPreviewView fastMatchPreviewView);

    void inject(TinderGoldPaywallDialog tinderGoldPaywallDialog);

    void inject(EditProfilePhotoView editProfilePhotoView);

    void inject(FragmentAgeMoreGender fragmentAgeMoreGender);

    void inject(FragmentEditProfile fragmentEditProfile);

    void inject(FragmentMap fragmentMap);

    void inject(am amVar);

    void inject(ap apVar);

    void inject(as asVar);

    void inject(C13308g c13308g);

    void inject(C13309n c13309n);

    void inject(C13310q c13310q);

    void inject(C9648e c9648e);

    void inject(TimeSinceTextView timeSinceTextView);

    void inject(C9715f c9715f);

    void inject(IntroFragment introFragment);

    void inject(ManagerApp managerApp);

    void inject(DeleteSponsoredMessageJobService deleteSponsoredMessageJobService);

    void inject(C12043a c12043a);

    void inject(SparksEvent sparksEvent);

    void inject(PhotoSourceSelectorSheetDialog photoSourceSelectorSheetDialog);

    void inject(C12227d c12227d);

    void inject(C12231g c12231g);

    void inject(C12234k c12234k);

    void inject(C12237m c12237m);

    void inject(RecommendProfileBroadcastReceiver recommendProfileBroadcastReceiver);

    void inject(ActivityPassport activityPassport);

    void inject(C12265d c12265d);

    void inject(C10076o c10076o);

    void inject(C10090l c10090l);

    void inject(C13558c c13558c);

    void inject(SubmitVisitJob submitVisitJob);

    void inject(PresenterDialogIsTween presenterDialogIsTween);

    void inject(bf bfVar);

    void inject(df dfVar);

    void inject(C14426e c14426e);

    void inject(ProfileBitmojiAuthView profileBitmojiAuthView);

    void inject(ReportBillingTimeoutService reportBillingTimeoutService);

    void inject(TinderGcmListenerService tinderGcmListenerService);

    void inject(InAppNotificationView inAppNotificationView);

    void inject(C16315a c16315a);

    void inject(GCMRegistrationIntentService gCMRegistrationIntentService);

    void inject(ProcessingPhotosTaskService processingPhotosTaskService);

    void inject(GenderSearchActivity genderSearchActivity);

    void inject(SettingsActivity settingsActivity);

    void inject(C14865b c14865b);

    void inject(FeedSettingsItemView feedSettingsItemView);

    void inject(ReactivateAccountJob reactivateAccountJob);

    void inject(AutoPlayVideoSettingsView autoPlayVideoSettingsView);

    void inject(C18077q c18077q);

    void inject(GenderSearchView genderSearchView);

    void inject(MoreGenderView moreGenderView);

    void inject(SettingsPurchaseView settingsPurchaseView);

    void inject(ShowMeView showMeView);

    void inject(SpotifyAuthActivity spotifyAuthActivity);

    void inject(SpotifyTrackSearchAdapter spotifyTrackSearchAdapter);

    void inject(C18159b c18159b);

    void inject(C18161c c18161c);

    void inject(C18167w c18167w);

    void inject(SpotifyConnectView spotifyConnectView);

    void inject(SpotifyPickArtistView spotifyPickArtistView);

    void inject(SpotifyPlayerView spotifyPlayerView);

    void inject(SpotifyThemeSongView spotifyThemeSongView);

    void inject(SpotifyTopTrackItemView spotifyTopTrackItemView);

    void inject(SpotifyTrackSearchView spotifyTrackSearchView);

    void inject(SuperlikePaywallDialog superlikePaywallDialog);

    void inject(TinderGoldIntroDialog tinderGoldIntroDialog);

    void inject(C15190c c15190c);

    void inject(C15193i c15193i);

    void inject(ActivityTPlusControl activityTPlusControl);

    void inject(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl);

    void inject(C18211a c18211a);

    void inject(TinderPlusPaywallDialog tinderPlusPaywallDialog);

    void inject(AppLifeCycleTracker appLifeCycleTracker);

    void inject(OkHttpGlideModule okHttpGlideModule);

    void inject(com.tinder.utils.ap apVar);

    void inject(MapFrameLayout mapFrameLayout);

    void inject(MatchListLayout matchListLayout);

    MainActivityComponent.Builder newMainActivityComponentBuilder();

    PlacesComponent.Builder placesComponentBuilder();

    PlacesDisabledSurveyComponent.Builder placesDisabledSurveyComponentBuilder();

    PlacesOnboardingComponent.Builder placesOnboardingComponentBuilder();

    PlacesRecsComponent.Builder placesRecsComponentBuilder();

    PlacesSettingsComponent.Builder placesSettingsComponentBuilder();

    PlacesSurveyOtherComponent.Builder placesSurveyOtherComponentBuilder();

    OnboardingComponent plus(C2655a c2655a);

    ExitSurveyComponent plus(C2656a c2656a);

    ProfileComponent.Builder profileComponentBuilder();

    CensorViewComponent.Builder reusuableComponentBuilder();
}
