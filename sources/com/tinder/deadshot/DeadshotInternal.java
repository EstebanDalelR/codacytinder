package com.tinder.deadshot;

import com.tinder.apprating.p164b.C8261a;
import com.tinder.apprating.p164b.C8263c;
import com.tinder.apprating.target.AppRatingTarget;
import com.tinder.boost.presenter.C8346a;
import com.tinder.boost.presenter.C8348e;
import com.tinder.boost.target.BoostButtonTarget;
import com.tinder.chat.presenter.C8442a;
import com.tinder.chat.presenter.C8444r;
import com.tinder.chat.presenter.C8447u;
import com.tinder.chat.presenter.C8449y;
import com.tinder.chat.presenter.C8450z;
import com.tinder.chat.presenter.ac;
import com.tinder.chat.presenter.ad;
import com.tinder.chat.presenter.af;
import com.tinder.chat.presenter.ag;
import com.tinder.chat.presenter.am;
import com.tinder.chat.presenter.an;
import com.tinder.chat.presenter.ap;
import com.tinder.chat.presenter.aq;
import com.tinder.chat.presenter.ar;
import com.tinder.chat.target.ChatInputBoxTarget;
import com.tinder.chat.target.ChatInputEditTextTarget;
import com.tinder.chat.target.ChatTarget;
import com.tinder.chat.target.ChatToolbarTarget;
import com.tinder.chat.target.EmptyChatViewTarget;
import com.tinder.chat.target.GrandGestureTarget;
import com.tinder.chat.target.TypingIndicatorItemTarget;
import com.tinder.common.badge.p190a.C8525a;
import com.tinder.common.badge.p190a.C8527c;
import com.tinder.common.badge.target.BadgeAttributionTarget;
import com.tinder.crashindicator.p203b.C8605a;
import com.tinder.crashindicator.p203b.C8606b;
import com.tinder.crashindicator.target.AppCrashTarget;
import com.tinder.editprofile.p237a.C8947a;
import com.tinder.editprofile.p237a.C8948b;
import com.tinder.editprofile.target.EditFeedSettingItemTarget;
import com.tinder.fastmatch.presenter.C11629g;
import com.tinder.fastmatch.presenter.C11648i;
import com.tinder.fastmatch.presenter.C9385a;
import com.tinder.fastmatch.presenter.C9386b;
import com.tinder.fastmatch.presenter.C9387c;
import com.tinder.fastmatch.presenter.C9388e;
import com.tinder.fastmatch.presenter.C9391h;
import com.tinder.fastmatch.presenter.C9394m;
import com.tinder.fastmatch.presenter.C9395n;
import com.tinder.fastmatch.presenter.C9396o;
import com.tinder.fastmatch.presenter.C9399q;
import com.tinder.fastmatch.presenter.C9400r;
import com.tinder.fastmatch.target.FastMatchPreviewRowTarget;
import com.tinder.fastmatch.target.FastMatchPreviewTarget;
import com.tinder.fastmatch.target.FastMatchRecsActivityTarget;
import com.tinder.fastmatch.target.FastMatchRecsGridTarget;
import com.tinder.fastmatch.target.FastMatchToolbarTarget;
import com.tinder.fastmatch.target.TinderGoldPaywallTarget;
import com.tinder.feed.presenter.C9464a;
import com.tinder.feed.presenter.C9466c;
import com.tinder.feed.presenter.C9468e;
import com.tinder.feed.presenter.C9470g;
import com.tinder.feed.presenter.C9471h;
import com.tinder.feed.presenter.C9472i;
import com.tinder.feed.target.FeedCommentTarget;
import com.tinder.feed.target.FeedMainTarget;
import com.tinder.feed.target.MatchesPageMessagesTabIndicatorTarget;
import com.tinder.home.C9701j;
import com.tinder.home.C9702l;
import com.tinder.home.ShimmerHomeTabTarget;
import com.tinder.interfaces.InstagramLoginView;
import com.tinder.match.dialog.C9862h;
import com.tinder.match.dialog.C9863j;
import com.tinder.match.dialog.ItsAMatchDialogTarget;
import com.tinder.match.presenter.C9865a;
import com.tinder.match.presenter.C9867d;
import com.tinder.match.presenter.C9868e;
import com.tinder.match.presenter.C9869j;
import com.tinder.match.presenter.C9870k;
import com.tinder.match.presenter.C9871l;
import com.tinder.match.presenter.C9872m;
import com.tinder.match.presenter.C9873p;
import com.tinder.match.presenter.C9874q;
import com.tinder.match.presenter.C9875r;
import com.tinder.match.target.MatchListTarget;
import com.tinder.match.target.MatchMessageRowTarget;
import com.tinder.match.target.MatchTabsTarget;
import com.tinder.match.target.MatchesSearchViewTarget;
import com.tinder.match.target.NewMatchRowTarget;
import com.tinder.messageads.p298e.C9908a;
import com.tinder.messageads.p298e.C9909b;
import com.tinder.messageads.target.AdMessageChatTarget;
import com.tinder.overflow.p299a.C10013a;
import com.tinder.overflow.p299a.C10014b;
import com.tinder.overflow.p299a.C10015c;
import com.tinder.overflow.p299a.C10016d;
import com.tinder.overflow.p299a.C10017e;
import com.tinder.overflow.p299a.C10018f;
import com.tinder.overflow.target.RecommendProfileActionItemTarget;
import com.tinder.overflow.target.ReportMatchTarget;
import com.tinder.overflow.target.UnMatchTarget;
import com.tinder.places.card.presenter.C10127a;
import com.tinder.places.card.presenter.C10128b;
import com.tinder.places.card.presenter.C10129c;
import com.tinder.places.card.presenter.C10131e;
import com.tinder.places.card.presenter.C10133f;
import com.tinder.places.card.presenter.C10134g;
import com.tinder.places.card.presenter.C10135i;
import com.tinder.places.card.presenter.C10137m;
import com.tinder.places.card.presenter.C12306h;
import com.tinder.places.card.presenter.PlacesCardViewPresenter;
import com.tinder.places.card.target.PlaceCardAlternativesTarget;
import com.tinder.places.card.target.PlaceCardFrontTarget;
import com.tinder.places.card.target.PlaceRecTeasersTarget;
import com.tinder.places.card.target.PlacesCardTarget;
import com.tinder.places.carousel.presenter.C10193b;
import com.tinder.places.carousel.presenter.C10194c;
import com.tinder.places.carousel.presenter.C10195e;
import com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter;
import com.tinder.places.carousel.target.PlacesCarouselLoadingContainerTarget;
import com.tinder.places.carousel.target.PlacesCarouselTarget;
import com.tinder.places.main.presenter.C10217a;
import com.tinder.places.main.presenter.C10219c;
import com.tinder.places.main.presenter.C10220d;
import com.tinder.places.main.presenter.C10221e;
import com.tinder.places.main.presenter.C10223f;
import com.tinder.places.main.presenter.C10225i;
import com.tinder.places.main.target.PlacesDisabledTarget;
import com.tinder.places.main.target.PlacesPinDropTarget;
import com.tinder.places.main.target.PlacesTarget;
import com.tinder.places.map.p314a.C10229a;
import com.tinder.places.map.p314a.C10230b;
import com.tinder.places.map.target.PlacesMapTarget;
import com.tinder.places.onboarding.presenter.C10265a;
import com.tinder.places.onboarding.presenter.C10266b;
import com.tinder.places.onboarding.presenter.C10267c;
import com.tinder.places.onboarding.presenter.C10268d;
import com.tinder.places.onboarding.target.PlacesOnboardingCardTarget;
import com.tinder.places.onboarding.target.PlacesOnboardingTarget;
import com.tinder.places.recs.presenter.C10278e;
import com.tinder.places.recs.presenter.C10279f;
import com.tinder.places.recs.presenter.C10280g;
import com.tinder.places.recs.presenter.C12433a;
import com.tinder.places.recs.target.PlaceRecsContainerTarget;
import com.tinder.places.recs.target.PlacesRecsGridTarget;
import com.tinder.places.recs.target.PlacesUserRecCardTarget;
import com.tinder.places.settings.presenter.C14317b;
import com.tinder.places.settings.presenter.C14318c;
import com.tinder.places.settings.presenter.C14320g;
import com.tinder.places.settings.presenter.C14321h;
import com.tinder.places.settings.presenter.C14322i;
import com.tinder.places.settings.presenter.PlacesDisabledSurveyPresenter;
import com.tinder.places.settings.target.PlacesDisabledSurveyTarget;
import com.tinder.places.settings.target.PlacesSettingsTarget;
import com.tinder.places.settings.target.PlacesSurveyOtherTarget;
import com.tinder.presenters.bv;
import com.tinder.profile.presenter.C14424c;
import com.tinder.profile.presenter.C14425d;
import com.tinder.profile.presenter.C14426e;
import com.tinder.profile.presenter.C14428g;
import com.tinder.profile.presenter.C14429h;
import com.tinder.profile.presenter.C14430q;
import com.tinder.profile.presenter.C14431r;
import com.tinder.profile.presenter.C14432y;
import com.tinder.profile.presenter.C14434z;
import com.tinder.profile.presenter.ae;
import com.tinder.profile.presenter.aj;
import com.tinder.profile.presenter.ak;
import com.tinder.profile.presenter.aw;
import com.tinder.profile.presenter.ax;
import com.tinder.profile.presenter.ba;
import com.tinder.profile.presenter.bb;
import com.tinder.profile.presenter.bc;
import com.tinder.profile.presenter.bf;
import com.tinder.profile.presenter.bm;
import com.tinder.profile.presenter.bn;
import com.tinder.profile.presenter.bo;
import com.tinder.profile.presenter.bp;
import com.tinder.profile.presenter.bu;
import com.tinder.profile.target.BasicInfoShareRecTarget;
import com.tinder.profile.target.BitmojiAuthTarget;
import com.tinder.profile.target.ControllaTarget;
import com.tinder.profile.target.CurrentUserProfileTarget;
import com.tinder.profile.target.MatchProfileTarget;
import com.tinder.profile.target.ProfileGamepadTarget;
import com.tinder.profile.target.ProfileInstagramAuthTarget;
import com.tinder.profile.target.ProfileRecommendToFriendTarget;
import com.tinder.profile.target.ProfileReportUserTarget;
import com.tinder.profile.target.ProfileTarget;
import com.tinder.profile.target.UserRecProfileTarget;
import com.tinder.profiletab.presenter.C14474d;
import com.tinder.profiletab.presenter.C14475w;
import com.tinder.profiletab.presenter.C14476x;
import com.tinder.profiletab.presenter.C14477z;
import com.tinder.profiletab.target.ProfileTabTarget;
import com.tinder.reactions.chat.presenter.C14603a;
import com.tinder.reactions.chat.presenter.C14604c;
import com.tinder.reactions.chat.presenter.C14605d;
import com.tinder.reactions.chat.presenter.C14606g;
import com.tinder.reactions.chat.target.ExpandReactionDrawerFeatureTarget;
import com.tinder.reactions.chat.target.ReactionTutorialFeatureTarget;
import com.tinder.reactions.dialog.p390a.C14621a;
import com.tinder.reactions.dialog.p390a.C14622b;
import com.tinder.reactions.gestures.p394b.C14651a;
import com.tinder.reactions.gestures.p394b.C14652b;
import com.tinder.reactions.gestures.p394b.C14653c;
import com.tinder.reactions.gestures.p394b.C14654d;
import com.tinder.reactions.gestures.p394b.C14655e;
import com.tinder.reactions.gestures.p394b.C14656f;
import com.tinder.reactions.gestures.p394b.C14657g;
import com.tinder.reactions.gestures.p394b.C14658h;
import com.tinder.reactions.gestures.target.FlingableLottieAnimationTarget;
import com.tinder.reactions.gestures.target.GrandGestureMatchAvatarTarget;
import com.tinder.reactions.gestures.target.GrandGestureSelectorTarget;
import com.tinder.reactions.gestures.target.SelectableGrandGestureTarget;
import com.tinder.reactions.navigation.p398c.C14684a;
import com.tinder.reactions.navigation.p398c.C14686d;
import com.tinder.reactions.navigation.target.GestureNavigationLoadingTarget;
import com.tinder.reactions.p384b.C14594a;
import com.tinder.reactions.p384b.C14596c;
import com.tinder.reactions.target.TinderReactionsIntroTarget;
import com.tinder.recs.presenter.AdRecCardPresenter;
import com.tinder.recs.presenter.AdRecCardPresenter_Holder;
import com.tinder.recs.presenter.DiscoveryOffPresenter;
import com.tinder.recs.presenter.DiscoveryOffPresenter_Holder;
import com.tinder.recs.presenter.GamepadPresenter;
import com.tinder.recs.presenter.GamepadPresenter_Holder;
import com.tinder.recs.presenter.GridSuperLikeButtonPresenter;
import com.tinder.recs.presenter.GridSuperLikeButtonPresenter_Holder;
import com.tinder.recs.presenter.RecsPresenter;
import com.tinder.recs.presenter.RecsPresenter_Holder;
import com.tinder.recs.presenter.RecsStatusPresenter;
import com.tinder.recs.presenter.RecsStatusPresenter_Holder;
import com.tinder.recs.presenter.SettingsShortcutPresenter;
import com.tinder.recs.presenter.SettingsShortcutPresenter_Holder;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter_Holder;
import com.tinder.recs.presenter.TappyUserRecCardPresenter;
import com.tinder.recs.presenter.TappyUserRecCardPresenter_Holder;
import com.tinder.recs.target.AdRecCardTarget;
import com.tinder.recs.target.DiscoveryOffTarget;
import com.tinder.recs.target.GamepadTarget;
import com.tinder.recs.target.GridSuperLikeButtonTarget;
import com.tinder.recs.target.RecsStatusTarget;
import com.tinder.recs.target.RecsTarget;
import com.tinder.recs.target.SettingsShortcutTarget;
import com.tinder.recs.target.TappyUserRecCardTarget;
import com.tinder.recs.view.tappy.TappyCarouselViewTarget;
import com.tinder.settings.feed.presenter.C14874a;
import com.tinder.settings.feed.presenter.C14875b;
import com.tinder.settings.feed.presenter.C14876c;
import com.tinder.settings.feed.presenter.C14878g;
import com.tinder.settings.feed.target.FeedSettingItemTarget;
import com.tinder.settings.feed.target.FeedSettingsTarget;
import com.tinder.settings.loops.p407a.C14883a;
import com.tinder.settings.loops.p407a.C14884c;
import com.tinder.settings.loops.p407a.C14885d;
import com.tinder.settings.loops.p407a.C14886e;
import com.tinder.settings.loops.target.AutoPlayLoopsOptionsTarget;
import com.tinder.settings.loops.target.AutoPlayVideoSettingsTarget;
import com.tinder.settings.presenter.C14896h;
import com.tinder.settings.presenter.C14897l;
import com.tinder.settings.presenter.C16652g;
import com.tinder.settings.presenter.C16653i;
import com.tinder.settings.presenter.bg;
import com.tinder.settings.presenter.bh;
import com.tinder.settings.presenter.bl;
import com.tinder.settings.targets.ExitSurveyFeedbackTarget;
import com.tinder.settings.targets.ExitSurveyTarget;
import com.tinder.settings.targets.SettingsPurchaseTarget;
import com.tinder.settings.targets.ShowMeTarget;
import com.tinder.targets.CensorTarget;
import com.tinder.targets.JobTarget;
import com.tinder.targets.SchoolTarget;
import com.tinder.tindergold.p427b.C15184a;
import com.tinder.tindergold.p427b.C15185b;
import com.tinder.tindergold.target.TinderGoldIntroTarget;
import com.tinder.tinderplus.p429b.C15201k;
import com.tinder.tinderplus.p429b.C15202q;
import com.tinder.tinderplus.target.TinderPlusPaywallTarget;
import com.tinder.toppicks.TopPicksPaywallViewTarget;
import com.tinder.toppicks.presenter.C15284a;
import com.tinder.toppicks.presenter.C15286d;
import com.tinder.toppicks.presenter.C15289i;
import com.tinder.toppicks.presenter.C15291l;
import com.tinder.toppicks.presenter.C15292m;
import com.tinder.toppicks.presenter.C15294p;
import com.tinder.toppicks.presenter.C15295q;
import com.tinder.toppicks.presenter.C15296r;
import com.tinder.toppicks.presenter.C17082e;
import com.tinder.toppicks.presenter.C17090j;
import com.tinder.toppicks.target.TopPicksTarget;
import com.tinder.toppicks.target.TopPicksUserRecCardTarget;
import com.tinder.toppicks.view.TopPicksGoldTarget;
import com.tinder.toppicks.view.TopPicksGridRecsTarget;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

class DeadshotInternal extends Deadshot {
    private final WeakHashMap<Object, WeakReference<Object>> sMapTargetPresenter = new WeakHashMap();

    DeadshotInternal() {
    }

    void takeTargetInternal(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.format("Null Target: %s", new Object[]{obj}));
        } else if (obj2 == null) {
            throw new NullPointerException(String.format("Null Presenter: %s", new Object[]{obj2}));
        } else if ((obj instanceof PlacesSurveyOtherTarget) && (obj2 instanceof C14321h)) {
            takePlacesSurveyOtherTarget((PlacesSurveyOtherTarget) obj, (C14321h) obj2);
        } else if ((obj instanceof PlaceRecTeasersTarget) && (obj2 instanceof C10133f)) {
            takePlaceRecTeasersTarget((PlaceRecTeasersTarget) obj, (C10133f) obj2);
        } else if ((obj instanceof ExitSurveyTarget) && (obj2 instanceof C16653i)) {
            takeExitSurveyTarget((ExitSurveyTarget) obj, (C16653i) obj2);
        } else if ((obj instanceof PlacesMapTarget) && (obj2 instanceof C10229a)) {
            takePlacesMapTarget((PlacesMapTarget) obj, (C10229a) obj2);
        } else if ((obj instanceof TypingIndicatorItemTarget) && (obj2 instanceof aq)) {
            takeTypingIndicatorItemTarget((TypingIndicatorItemTarget) obj, (aq) obj2);
        } else if ((obj instanceof FeedSettingItemTarget) && (obj2 instanceof C14874a)) {
            takeFeedSettingItemTarget((FeedSettingItemTarget) obj, (C14874a) obj2);
        } else if ((obj instanceof PlacesTarget) && (obj2 instanceof C10223f)) {
            takePlacesTarget((PlacesTarget) obj, (C10223f) obj2);
        } else if ((obj instanceof AdRecCardTarget) && (obj2 instanceof AdRecCardPresenter)) {
            takeAdRecCardTarget((AdRecCardTarget) obj, (AdRecCardPresenter) obj2);
        } else if ((obj instanceof PlacesRecsGridTarget) && (obj2 instanceof C12433a)) {
            takePlacesRecsGridTarget((PlacesRecsGridTarget) obj, (C12433a) obj2);
        } else if ((obj instanceof PlacesOnboardingCardTarget) && (obj2 instanceof C10265a)) {
            takePlacesOnboardingCardTarget((PlacesOnboardingCardTarget) obj, (C10265a) obj2);
        } else if ((obj instanceof FastMatchPreviewRowTarget) && (obj2 instanceof C9387c)) {
            takeFastMatchPreviewRowTarget((FastMatchPreviewRowTarget) obj, (C9387c) obj2);
        } else if ((obj instanceof ShimmerHomeTabTarget) && (obj2 instanceof C9701j)) {
            takeShimmerHomeTabTarget((ShimmerHomeTabTarget) obj, (C9701j) obj2);
        } else if ((obj instanceof NewMatchRowTarget) && (obj2 instanceof C9874q)) {
            takeNewMatchRowTarget((NewMatchRowTarget) obj, (C9874q) obj2);
        } else if ((obj instanceof ExitSurveyFeedbackTarget) && (obj2 instanceof C16652g)) {
            takeExitSurveyFeedbackTarget((ExitSurveyFeedbackTarget) obj, (C16652g) obj2);
        } else if ((obj instanceof TappyCarouselViewTarget) && (obj2 instanceof TappyImageDrawableCarouselViewPresenter)) {
            takeTappyCarouselViewTarget((TappyCarouselViewTarget) obj, (TappyImageDrawableCarouselViewPresenter) obj2);
        } else if ((obj instanceof TinderPlusPaywallTarget) && (obj2 instanceof C15201k)) {
            takeTinderPlusPaywallTarget((TinderPlusPaywallTarget) obj, (C15201k) obj2);
        } else if ((obj instanceof ProfileInstagramAuthTarget) && (obj2 instanceof ae)) {
            takeProfileInstagramAuthTarget((ProfileInstagramAuthTarget) obj, (ae) obj2);
        } else if ((obj instanceof PlacesSettingsTarget) && (obj2 instanceof C14318c)) {
            takePlacesSettingsTarget((PlacesSettingsTarget) obj, (C14318c) obj2);
        } else if ((obj instanceof TinderReactionsIntroTarget) && (obj2 instanceof C14621a)) {
            takeTinderReactionsIntroTarget((TinderReactionsIntroTarget) obj, (C14621a) obj2);
        } else if ((obj instanceof AdMessageChatTarget) && (obj2 instanceof C9908a)) {
            takeAdMessageChatTarget((AdMessageChatTarget) obj, (C9908a) obj2);
        } else if ((obj instanceof TopPicksTarget) && (obj2 instanceof C15292m)) {
            takeTopPicksTarget((TopPicksTarget) obj, (C15292m) obj2);
        } else if ((obj instanceof ShowMeTarget) && (obj2 instanceof bh)) {
            takeShowMeTarget((ShowMeTarget) obj, (bh) obj2);
        } else if ((obj instanceof FeedSettingsTarget) && (obj2 instanceof C14876c)) {
            takeFeedSettingsTarget((FeedSettingsTarget) obj, (C14876c) obj2);
        } else if ((obj instanceof ChatInputBoxTarget) && (obj2 instanceof C8447u)) {
            takeChatInputBoxTarget((ChatInputBoxTarget) obj, (C8447u) obj2);
        } else if ((obj instanceof MatchTabsTarget) && (obj2 instanceof C9870k)) {
            takeMatchTabsTarget((MatchTabsTarget) obj, (C9870k) obj2);
        } else if ((obj instanceof DiscoveryOffTarget) && (obj2 instanceof DiscoveryOffPresenter)) {
            takeDiscoveryOffTarget((DiscoveryOffTarget) obj, (DiscoveryOffPresenter) obj2);
        } else if ((obj instanceof AppCrashTarget) && (obj2 instanceof C8605a)) {
            takeAppCrashTarget((AppCrashTarget) obj, (C8605a) obj2);
        } else if ((obj instanceof RecsTarget) && (obj2 instanceof RecsPresenter)) {
            takeRecsTarget((RecsTarget) obj, (RecsPresenter) obj2);
        } else if ((obj instanceof BasicInfoShareRecTarget) && (obj2 instanceof C14424c)) {
            takeBasicInfoShareRecTarget((BasicInfoShareRecTarget) obj, (C14424c) obj2);
        } else if ((obj instanceof CensorTarget) && (obj2 instanceof C8442a)) {
            takeCensorTarget((CensorTarget) obj, (C8442a) obj2);
        } else if ((obj instanceof GrandGestureTarget) && (obj2 instanceof C14594a)) {
            takeGrandGestureTarget((GrandGestureTarget) obj, (C14594a) obj2);
        } else if ((obj instanceof PlacesUserRecCardTarget) && (obj2 instanceof C10279f)) {
            takePlacesUserRecCardTarget((PlacesUserRecCardTarget) obj, (C10279f) obj2);
        } else if ((obj instanceof ProfileRecommendToFriendTarget) && (obj2 instanceof ax)) {
            takeProfileRecommendToFriendTarget((ProfileRecommendToFriendTarget) obj, (ax) obj2);
        } else if ((obj instanceof ChatTarget) && (obj2 instanceof ad)) {
            takeChatTarget((ChatTarget) obj, (ad) obj2);
        } else if ((obj instanceof TopPicksGoldTarget) && (obj2 instanceof C15284a)) {
            takeTopPicksGoldTarget((TopPicksGoldTarget) obj, (C15284a) obj2);
        } else if ((obj instanceof SchoolTarget) && (obj2 instanceof bf)) {
            takeSchoolTarget((SchoolTarget) obj, (bf) obj2);
        } else if ((obj instanceof MatchesSearchViewTarget) && (obj2 instanceof C9872m)) {
            takeMatchesSearchViewTarget((MatchesSearchViewTarget) obj, (C9872m) obj2);
        } else if ((obj instanceof TinderGoldIntroTarget) && (obj2 instanceof C15184a)) {
            takeTinderGoldIntroTarget((TinderGoldIntroTarget) obj, (C15184a) obj2);
        } else if ((obj instanceof MatchListTarget) && (obj2 instanceof C9865a)) {
            takeMatchListTarget((MatchListTarget) obj, (C9865a) obj2);
        } else if ((obj instanceof AutoPlayVideoSettingsTarget) && (obj2 instanceof C14885d)) {
            takeAutoPlayVideoSettingsTarget((AutoPlayVideoSettingsTarget) obj, (C14885d) obj2);
        } else if ((obj instanceof ChatInputEditTextTarget) && (obj2 instanceof C8450z)) {
            takeChatInputEditTextTarget((ChatInputEditTextTarget) obj, (C8450z) obj2);
        } else if ((obj instanceof PlacesCardTarget) && (obj2 instanceof PlacesCardViewPresenter)) {
            takePlacesCardTarget((PlacesCardTarget) obj, (PlacesCardViewPresenter) obj2);
        } else if ((obj instanceof ExpandReactionDrawerFeatureTarget) && (obj2 instanceof C14603a)) {
            takeExpandReactionDrawerFeatureTarget((ExpandReactionDrawerFeatureTarget) obj, (C14603a) obj2);
        } else if ((obj instanceof EmptyChatViewTarget) && (obj2 instanceof an)) {
            takeEmptyChatViewTarget((EmptyChatViewTarget) obj, (an) obj2);
        } else if ((obj instanceof ProfileGamepadTarget) && (obj2 instanceof bn)) {
            takeProfileGamepadTarget((ProfileGamepadTarget) obj, (bn) obj2);
        } else if ((obj instanceof SelectableGrandGestureTarget) && (obj2 instanceof C14657g)) {
            takeSelectableGrandGestureTarget((SelectableGrandGestureTarget) obj, (C14657g) obj2);
        } else if ((obj instanceof PlaceRecsContainerTarget) && (obj2 instanceof C12306h)) {
            takePlaceRecsContainerTarget((PlaceRecsContainerTarget) obj, (C12306h) obj2);
        } else if ((obj instanceof MatchProfileTarget) && (obj2 instanceof C14434z)) {
            takeMatchProfileTarget((MatchProfileTarget) obj, (C14434z) obj2);
        } else if ((obj instanceof BoostButtonTarget) && (obj2 instanceof C8346a)) {
            takeBoostButtonTarget((BoostButtonTarget) obj, (C8346a) obj2);
        } else if ((obj instanceof ProfileTabTarget) && (obj2 instanceof C14476x)) {
            takeProfileTabTarget((ProfileTabTarget) obj, (C14476x) obj2);
        } else if ((obj instanceof PlaceCardAlternativesTarget) && (obj2 instanceof C10127a)) {
            takePlaceCardAlternativesTarget((PlaceCardAlternativesTarget) obj, (C10127a) obj2);
        } else if ((obj instanceof AutoPlayLoopsOptionsTarget) && (obj2 instanceof C14883a)) {
            takeAutoPlayLoopsOptionsTarget((AutoPlayLoopsOptionsTarget) obj, (C14883a) obj2);
        } else if ((obj instanceof CurrentUserProfileTarget) && (obj2 instanceof C14429h)) {
            takeCurrentUserProfileTarget((CurrentUserProfileTarget) obj, (C14429h) obj2);
        } else if ((obj instanceof ItsAMatchDialogTarget) && (obj2 instanceof C9862h)) {
            takeItsAMatchDialogTarget((ItsAMatchDialogTarget) obj, (C9862h) obj2);
        } else if ((obj instanceof GestureNavigationLoadingTarget) && (obj2 instanceof C14684a)) {
            takeGestureNavigationLoadingTarget((GestureNavigationLoadingTarget) obj, (C14684a) obj2);
        } else if ((obj instanceof GamepadTarget) && (obj2 instanceof GamepadPresenter)) {
            takeGamepadTarget((GamepadTarget) obj, (GamepadPresenter) obj2);
        } else if ((obj instanceof EditFeedSettingItemTarget) && (obj2 instanceof C8947a)) {
            takeEditFeedSettingItemTarget((EditFeedSettingItemTarget) obj, (C8947a) obj2);
        } else if ((obj instanceof FastMatchRecsActivityTarget) && (obj2 instanceof C11629g)) {
            takeFastMatchRecsActivityTarget((FastMatchRecsActivityTarget) obj, (C11629g) obj2);
        } else if ((obj instanceof ReportMatchTarget) && (obj2 instanceof C10015c)) {
            takeReportMatchTarget((ReportMatchTarget) obj, (C10015c) obj2);
        } else if ((obj instanceof PlacesPinDropTarget) && (obj2 instanceof C10220d)) {
            takePlacesPinDropTarget((PlacesPinDropTarget) obj, (C10220d) obj2);
        } else if ((obj instanceof ReactionTutorialFeatureTarget) && (obj2 instanceof C14605d)) {
            takeReactionTutorialFeatureTarget((ReactionTutorialFeatureTarget) obj, (C14605d) obj2);
        } else if ((obj instanceof InstagramLoginView) && (obj2 instanceof com.tinder.presenters.bf)) {
            takeInstagramLoginView((InstagramLoginView) obj, (com.tinder.presenters.bf) obj2);
        } else if ((obj instanceof FastMatchRecsGridTarget) && (obj2 instanceof C11648i)) {
            takeFastMatchRecsGridTarget((FastMatchRecsGridTarget) obj, (C11648i) obj2);
        } else if ((obj instanceof GrandGestureSelectorTarget) && (obj2 instanceof C14655e)) {
            takeGrandGestureSelectorTarget((GrandGestureSelectorTarget) obj, (C14655e) obj2);
        } else if ((obj instanceof BadgeAttributionTarget) && (obj2 instanceof C8525a)) {
            takeBadgeAttributionTarget((BadgeAttributionTarget) obj, (C8525a) obj2);
        } else if ((obj instanceof FlingableLottieAnimationTarget) && (obj2 instanceof C14651a)) {
            takeFlingableLottieAnimationTarget((FlingableLottieAnimationTarget) obj, (C14651a) obj2);
        } else if ((obj instanceof ChatToolbarTarget) && (obj2 instanceof ag)) {
            takeChatToolbarTarget((ChatToolbarTarget) obj, (ag) obj2);
        } else if ((obj instanceof PlacesDisabledSurveyTarget) && (obj2 instanceof PlacesDisabledSurveyPresenter)) {
            takePlacesDisabledSurveyTarget((PlacesDisabledSurveyTarget) obj, (PlacesDisabledSurveyPresenter) obj2);
        } else if ((obj instanceof UnMatchTarget) && (obj2 instanceof C10017e)) {
            takeUnMatchTarget((UnMatchTarget) obj, (C10017e) obj2);
        } else if ((obj instanceof GridSuperLikeButtonTarget) && (obj2 instanceof GridSuperLikeButtonPresenter)) {
            takeGridSuperLikeButtonTarget((GridSuperLikeButtonTarget) obj, (GridSuperLikeButtonPresenter) obj2);
        } else if ((obj instanceof ProfileReportUserTarget) && (obj2 instanceof bb)) {
            takeProfileReportUserTarget((ProfileReportUserTarget) obj, (bb) obj2);
        } else if ((obj instanceof SettingsShortcutTarget) && (obj2 instanceof SettingsShortcutPresenter)) {
            takeSettingsShortcutTarget((SettingsShortcutTarget) obj, (SettingsShortcutPresenter) obj2);
        } else if ((obj instanceof JobTarget) && (obj2 instanceof C14431r)) {
            takeJobTarget((JobTarget) obj, (C14431r) obj2);
        } else if ((obj instanceof TappyUserRecCardTarget) && (obj2 instanceof TappyUserRecCardPresenter)) {
            takeTappyUserRecCardTarget((TappyUserRecCardTarget) obj, (TappyUserRecCardPresenter) obj2);
        } else if ((obj instanceof FastMatchToolbarTarget) && (obj2 instanceof C9395n)) {
            takeFastMatchToolbarTarget((FastMatchToolbarTarget) obj, (C9395n) obj2);
        } else if ((obj instanceof TopPicksGridRecsTarget) && (obj2 instanceof C17082e)) {
            takeTopPicksGridRecsTarget((TopPicksGridRecsTarget) obj, (C17082e) obj2);
        } else if ((obj instanceof GrandGestureMatchAvatarTarget) && (obj2 instanceof C14653c)) {
            takeGrandGestureMatchAvatarTarget((GrandGestureMatchAvatarTarget) obj, (C14653c) obj2);
        } else if ((obj instanceof AppRatingTarget) && (obj2 instanceof C8261a)) {
            takeAppRatingTarget((AppRatingTarget) obj, (C8261a) obj2);
        } else if ((obj instanceof TopPicksUserRecCardTarget) && (obj2 instanceof C15295q)) {
            takeTopPicksUserRecCardTarget((TopPicksUserRecCardTarget) obj, (C15295q) obj2);
        } else if ((obj instanceof PlacesCarouselTarget) && (obj2 instanceof C10194c)) {
            takePlacesCarouselTarget((PlacesCarouselTarget) obj, (C10194c) obj2);
        } else if ((obj instanceof RecommendProfileActionItemTarget) && (obj2 instanceof C10013a)) {
            takeRecommendProfileActionItemTarget((RecommendProfileActionItemTarget) obj, (C10013a) obj2);
        } else if ((obj instanceof MatchMessageRowTarget) && (obj2 instanceof C9868e)) {
            takeMatchMessageRowTarget((MatchMessageRowTarget) obj, (C9868e) obj2);
        } else if ((obj instanceof FeedCommentTarget) && (obj2 instanceof C9464a)) {
            takeFeedCommentTarget((FeedCommentTarget) obj, (C9464a) obj2);
        } else if ((obj instanceof PlacesDisabledTarget) && (obj2 instanceof C10217a)) {
            takePlacesDisabledTarget((PlacesDisabledTarget) obj, (C10217a) obj2);
        } else if ((obj instanceof BitmojiAuthTarget) && (obj2 instanceof C14426e)) {
            takeBitmojiAuthTarget((BitmojiAuthTarget) obj, (C14426e) obj2);
        } else if ((obj instanceof PlaceCardFrontTarget) && (obj2 instanceof C10129c)) {
            takePlaceCardFrontTarget((PlaceCardFrontTarget) obj, (C10129c) obj2);
        } else if ((obj instanceof UserRecProfileTarget) && (obj2 instanceof bp)) {
            takeUserRecProfileTarget((UserRecProfileTarget) obj, (bp) obj2);
        } else if ((obj instanceof PlacesOnboardingTarget) && (obj2 instanceof C10267c)) {
            takePlacesOnboardingTarget((PlacesOnboardingTarget) obj, (C10267c) obj2);
        } else if ((obj instanceof SettingsPurchaseTarget) && (obj2 instanceof com.tinder.settings.presenter.bf)) {
            takeSettingsPurchaseTarget((SettingsPurchaseTarget) obj, (com.tinder.settings.presenter.bf) obj2);
        } else if ((obj instanceof RecsStatusTarget) && (obj2 instanceof RecsStatusPresenter)) {
            takeRecsStatusTarget((RecsStatusTarget) obj, (RecsStatusPresenter) obj2);
        } else if ((obj instanceof ProfileTarget) && (obj2 instanceof ak)) {
            takeProfileTarget((ProfileTarget) obj, (ak) obj2);
        } else if ((obj instanceof TinderGoldPaywallTarget) && (obj2 instanceof C9399q)) {
            takeTinderGoldPaywallTarget((TinderGoldPaywallTarget) obj, (C9399q) obj2);
        } else if ((obj instanceof TopPicksPaywallViewTarget) && (obj2 instanceof C17090j)) {
            takeTopPicksPaywallViewTarget((TopPicksPaywallViewTarget) obj, (C17090j) obj2);
        } else if ((obj instanceof FastMatchPreviewTarget) && (obj2 instanceof C9385a)) {
            takeFastMatchPreviewTarget((FastMatchPreviewTarget) obj, (C9385a) obj2);
        } else if ((obj instanceof FeedMainTarget) && (obj2 instanceof C9468e)) {
            takeFeedMainTarget((FeedMainTarget) obj, (C9468e) obj2);
        } else if ((obj instanceof ControllaTarget) && (obj2 instanceof C14474d)) {
            takeControllaTarget((ControllaTarget) obj, (C14474d) obj2);
        } else if ((obj instanceof MatchesPageMessagesTabIndicatorTarget) && (obj2 instanceof C9471h)) {
            takeMatchesPageMessagesTabIndicatorTarget((MatchesPageMessagesTabIndicatorTarget) obj, (C9471h) obj2);
        } else if ((obj instanceof PlacesCarouselLoadingContainerTarget) && (obj2 instanceof PlacesCarouselLoadingContainerPresenter)) {
            takePlacesCarouselLoadingContainerTarget((PlacesCarouselLoadingContainerTarget) obj, (PlacesCarouselLoadingContainerPresenter) obj2);
        } else {
            throw new IllegalArgumentException(String.format("Unexpected Target or Presenter: %s, %s", new Object[]{obj, obj2}));
        }
    }

    void dropTargetInternal(Object obj) {
        if (obj == null) {
            throw new NullPointerException(String.format("Null Target: %s", new Object[]{obj}));
        } else if (obj instanceof PlacesSurveyOtherTarget) {
            dropPlacesSurveyOtherTarget((PlacesSurveyOtherTarget) obj);
        } else if (obj instanceof PlaceRecTeasersTarget) {
            dropPlaceRecTeasersTarget((PlaceRecTeasersTarget) obj);
        } else if (obj instanceof ExitSurveyTarget) {
            dropExitSurveyTarget((ExitSurveyTarget) obj);
        } else if (obj instanceof PlacesMapTarget) {
            dropPlacesMapTarget((PlacesMapTarget) obj);
        } else if (obj instanceof TypingIndicatorItemTarget) {
            dropTypingIndicatorItemTarget((TypingIndicatorItemTarget) obj);
        } else if (obj instanceof FeedSettingItemTarget) {
            dropFeedSettingItemTarget((FeedSettingItemTarget) obj);
        } else if (obj instanceof PlacesTarget) {
            dropPlacesTarget((PlacesTarget) obj);
        } else if (obj instanceof AdRecCardTarget) {
            dropAdRecCardTarget((AdRecCardTarget) obj);
        } else if (obj instanceof PlacesRecsGridTarget) {
            dropPlacesRecsGridTarget((PlacesRecsGridTarget) obj);
        } else if (obj instanceof PlacesOnboardingCardTarget) {
            dropPlacesOnboardingCardTarget((PlacesOnboardingCardTarget) obj);
        } else if (obj instanceof FastMatchPreviewRowTarget) {
            dropFastMatchPreviewRowTarget((FastMatchPreviewRowTarget) obj);
        } else if (obj instanceof ShimmerHomeTabTarget) {
            dropShimmerHomeTabTarget((ShimmerHomeTabTarget) obj);
        } else if (obj instanceof NewMatchRowTarget) {
            dropNewMatchRowTarget((NewMatchRowTarget) obj);
        } else if (obj instanceof ExitSurveyFeedbackTarget) {
            dropExitSurveyFeedbackTarget((ExitSurveyFeedbackTarget) obj);
        } else if (obj instanceof TappyCarouselViewTarget) {
            dropTappyCarouselViewTarget((TappyCarouselViewTarget) obj);
        } else if (obj instanceof TinderPlusPaywallTarget) {
            dropTinderPlusPaywallTarget((TinderPlusPaywallTarget) obj);
        } else if (obj instanceof ProfileInstagramAuthTarget) {
            dropProfileInstagramAuthTarget((ProfileInstagramAuthTarget) obj);
        } else if (obj instanceof PlacesSettingsTarget) {
            dropPlacesSettingsTarget((PlacesSettingsTarget) obj);
        } else if (obj instanceof TinderReactionsIntroTarget) {
            dropTinderReactionsIntroTarget((TinderReactionsIntroTarget) obj);
        } else if (obj instanceof AdMessageChatTarget) {
            dropAdMessageChatTarget((AdMessageChatTarget) obj);
        } else if (obj instanceof TopPicksTarget) {
            dropTopPicksTarget((TopPicksTarget) obj);
        } else if (obj instanceof ShowMeTarget) {
            dropShowMeTarget((ShowMeTarget) obj);
        } else if (obj instanceof FeedSettingsTarget) {
            dropFeedSettingsTarget((FeedSettingsTarget) obj);
        } else if (obj instanceof ChatInputBoxTarget) {
            dropChatInputBoxTarget((ChatInputBoxTarget) obj);
        } else if (obj instanceof MatchTabsTarget) {
            dropMatchTabsTarget((MatchTabsTarget) obj);
        } else if (obj instanceof DiscoveryOffTarget) {
            dropDiscoveryOffTarget((DiscoveryOffTarget) obj);
        } else if (obj instanceof AppCrashTarget) {
            dropAppCrashTarget((AppCrashTarget) obj);
        } else if (obj instanceof RecsTarget) {
            dropRecsTarget((RecsTarget) obj);
        } else if (obj instanceof BasicInfoShareRecTarget) {
            dropBasicInfoShareRecTarget((BasicInfoShareRecTarget) obj);
        } else if (obj instanceof CensorTarget) {
            dropCensorTarget((CensorTarget) obj);
        } else if (obj instanceof GrandGestureTarget) {
            dropGrandGestureTarget((GrandGestureTarget) obj);
        } else if (obj instanceof PlacesUserRecCardTarget) {
            dropPlacesUserRecCardTarget((PlacesUserRecCardTarget) obj);
        } else if (obj instanceof ProfileRecommendToFriendTarget) {
            dropProfileRecommendToFriendTarget((ProfileRecommendToFriendTarget) obj);
        } else if (obj instanceof ChatTarget) {
            dropChatTarget((ChatTarget) obj);
        } else if (obj instanceof TopPicksGoldTarget) {
            dropTopPicksGoldTarget((TopPicksGoldTarget) obj);
        } else if (obj instanceof SchoolTarget) {
            dropSchoolTarget((SchoolTarget) obj);
        } else if (obj instanceof MatchesSearchViewTarget) {
            dropMatchesSearchViewTarget((MatchesSearchViewTarget) obj);
        } else if (obj instanceof TinderGoldIntroTarget) {
            dropTinderGoldIntroTarget((TinderGoldIntroTarget) obj);
        } else if (obj instanceof MatchListTarget) {
            dropMatchListTarget((MatchListTarget) obj);
        } else if (obj instanceof AutoPlayVideoSettingsTarget) {
            dropAutoPlayVideoSettingsTarget((AutoPlayVideoSettingsTarget) obj);
        } else if (obj instanceof ChatInputEditTextTarget) {
            dropChatInputEditTextTarget((ChatInputEditTextTarget) obj);
        } else if (obj instanceof PlacesCardTarget) {
            dropPlacesCardTarget((PlacesCardTarget) obj);
        } else if (obj instanceof ExpandReactionDrawerFeatureTarget) {
            dropExpandReactionDrawerFeatureTarget((ExpandReactionDrawerFeatureTarget) obj);
        } else if (obj instanceof EmptyChatViewTarget) {
            dropEmptyChatViewTarget((EmptyChatViewTarget) obj);
        } else if (obj instanceof ProfileGamepadTarget) {
            dropProfileGamepadTarget((ProfileGamepadTarget) obj);
        } else if (obj instanceof SelectableGrandGestureTarget) {
            dropSelectableGrandGestureTarget((SelectableGrandGestureTarget) obj);
        } else if (obj instanceof PlaceRecsContainerTarget) {
            dropPlaceRecsContainerTarget((PlaceRecsContainerTarget) obj);
        } else if (obj instanceof MatchProfileTarget) {
            dropMatchProfileTarget((MatchProfileTarget) obj);
        } else if (obj instanceof BoostButtonTarget) {
            dropBoostButtonTarget((BoostButtonTarget) obj);
        } else if (obj instanceof ProfileTabTarget) {
            dropProfileTabTarget((ProfileTabTarget) obj);
        } else if (obj instanceof PlaceCardAlternativesTarget) {
            dropPlaceCardAlternativesTarget((PlaceCardAlternativesTarget) obj);
        } else if (obj instanceof AutoPlayLoopsOptionsTarget) {
            dropAutoPlayLoopsOptionsTarget((AutoPlayLoopsOptionsTarget) obj);
        } else if (obj instanceof CurrentUserProfileTarget) {
            dropCurrentUserProfileTarget((CurrentUserProfileTarget) obj);
        } else if (obj instanceof ItsAMatchDialogTarget) {
            dropItsAMatchDialogTarget((ItsAMatchDialogTarget) obj);
        } else if (obj instanceof GestureNavigationLoadingTarget) {
            dropGestureNavigationLoadingTarget((GestureNavigationLoadingTarget) obj);
        } else if (obj instanceof GamepadTarget) {
            dropGamepadTarget((GamepadTarget) obj);
        } else if (obj instanceof EditFeedSettingItemTarget) {
            dropEditFeedSettingItemTarget((EditFeedSettingItemTarget) obj);
        } else if (obj instanceof FastMatchRecsActivityTarget) {
            dropFastMatchRecsActivityTarget((FastMatchRecsActivityTarget) obj);
        } else if (obj instanceof ReportMatchTarget) {
            dropReportMatchTarget((ReportMatchTarget) obj);
        } else if (obj instanceof PlacesPinDropTarget) {
            dropPlacesPinDropTarget((PlacesPinDropTarget) obj);
        } else if (obj instanceof ReactionTutorialFeatureTarget) {
            dropReactionTutorialFeatureTarget((ReactionTutorialFeatureTarget) obj);
        } else if (obj instanceof InstagramLoginView) {
            dropInstagramLoginView((InstagramLoginView) obj);
        } else if (obj instanceof FastMatchRecsGridTarget) {
            dropFastMatchRecsGridTarget((FastMatchRecsGridTarget) obj);
        } else if (obj instanceof GrandGestureSelectorTarget) {
            dropGrandGestureSelectorTarget((GrandGestureSelectorTarget) obj);
        } else if (obj instanceof BadgeAttributionTarget) {
            dropBadgeAttributionTarget((BadgeAttributionTarget) obj);
        } else if (obj instanceof FlingableLottieAnimationTarget) {
            dropFlingableLottieAnimationTarget((FlingableLottieAnimationTarget) obj);
        } else if (obj instanceof ChatToolbarTarget) {
            dropChatToolbarTarget((ChatToolbarTarget) obj);
        } else if (obj instanceof PlacesDisabledSurveyTarget) {
            dropPlacesDisabledSurveyTarget((PlacesDisabledSurveyTarget) obj);
        } else if (obj instanceof UnMatchTarget) {
            dropUnMatchTarget((UnMatchTarget) obj);
        } else if (obj instanceof GridSuperLikeButtonTarget) {
            dropGridSuperLikeButtonTarget((GridSuperLikeButtonTarget) obj);
        } else if (obj instanceof ProfileReportUserTarget) {
            dropProfileReportUserTarget((ProfileReportUserTarget) obj);
        } else if (obj instanceof SettingsShortcutTarget) {
            dropSettingsShortcutTarget((SettingsShortcutTarget) obj);
        } else if (obj instanceof JobTarget) {
            dropJobTarget((JobTarget) obj);
        } else if (obj instanceof TappyUserRecCardTarget) {
            dropTappyUserRecCardTarget((TappyUserRecCardTarget) obj);
        } else if (obj instanceof FastMatchToolbarTarget) {
            dropFastMatchToolbarTarget((FastMatchToolbarTarget) obj);
        } else if (obj instanceof TopPicksGridRecsTarget) {
            dropTopPicksGridRecsTarget((TopPicksGridRecsTarget) obj);
        } else if (obj instanceof GrandGestureMatchAvatarTarget) {
            dropGrandGestureMatchAvatarTarget((GrandGestureMatchAvatarTarget) obj);
        } else if (obj instanceof AppRatingTarget) {
            dropAppRatingTarget((AppRatingTarget) obj);
        } else if (obj instanceof TopPicksUserRecCardTarget) {
            dropTopPicksUserRecCardTarget((TopPicksUserRecCardTarget) obj);
        } else if (obj instanceof PlacesCarouselTarget) {
            dropPlacesCarouselTarget((PlacesCarouselTarget) obj);
        } else if (obj instanceof RecommendProfileActionItemTarget) {
            dropRecommendProfileActionItemTarget((RecommendProfileActionItemTarget) obj);
        } else if (obj instanceof MatchMessageRowTarget) {
            dropMatchMessageRowTarget((MatchMessageRowTarget) obj);
        } else if (obj instanceof FeedCommentTarget) {
            dropFeedCommentTarget((FeedCommentTarget) obj);
        } else if (obj instanceof PlacesDisabledTarget) {
            dropPlacesDisabledTarget((PlacesDisabledTarget) obj);
        } else if (obj instanceof BitmojiAuthTarget) {
            dropBitmojiAuthTarget((BitmojiAuthTarget) obj);
        } else if (obj instanceof PlaceCardFrontTarget) {
            dropPlaceCardFrontTarget((PlaceCardFrontTarget) obj);
        } else if (obj instanceof UserRecProfileTarget) {
            dropUserRecProfileTarget((UserRecProfileTarget) obj);
        } else if (obj instanceof PlacesOnboardingTarget) {
            dropPlacesOnboardingTarget((PlacesOnboardingTarget) obj);
        } else if (obj instanceof SettingsPurchaseTarget) {
            dropSettingsPurchaseTarget((SettingsPurchaseTarget) obj);
        } else if (obj instanceof RecsStatusTarget) {
            dropRecsStatusTarget((RecsStatusTarget) obj);
        } else if (obj instanceof ProfileTarget) {
            dropProfileTarget((ProfileTarget) obj);
        } else if (obj instanceof TinderGoldPaywallTarget) {
            dropTinderGoldPaywallTarget((TinderGoldPaywallTarget) obj);
        } else if (obj instanceof TopPicksPaywallViewTarget) {
            dropTopPicksPaywallViewTarget((TopPicksPaywallViewTarget) obj);
        } else if (obj instanceof FastMatchPreviewTarget) {
            dropFastMatchPreviewTarget((FastMatchPreviewTarget) obj);
        } else if (obj instanceof FeedMainTarget) {
            dropFeedMainTarget((FeedMainTarget) obj);
        } else if (obj instanceof ControllaTarget) {
            dropControllaTarget((ControllaTarget) obj);
        } else if (obj instanceof MatchesPageMessagesTabIndicatorTarget) {
            dropMatchesPageMessagesTabIndicatorTarget((MatchesPageMessagesTabIndicatorTarget) obj);
        } else if (obj instanceof PlacesCarouselLoadingContainerTarget) {
            dropPlacesCarouselLoadingContainerTarget((PlacesCarouselLoadingContainerTarget) obj);
        } else {
            throw new IllegalArgumentException(String.format("Unexpected Target: %s", new Object[]{obj}));
        }
    }

    private void takePlacesSurveyOtherTarget(PlacesSurveyOtherTarget placesSurveyOtherTarget, C14321h c14321h) {
        this.sMapTargetPresenter.put(placesSurveyOtherTarget, new WeakReference(c14321h));
        C14322i.a(c14321h, placesSurveyOtherTarget);
    }

    private void dropPlacesSurveyOtherTarget(PlacesSurveyOtherTarget placesSurveyOtherTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesSurveyOtherTarget);
        if (weakReference != null) {
            C14321h c14321h = (C14321h) weakReference.get();
            if (c14321h != null) {
                C14322i.a(c14321h);
            }
        }
        this.sMapTargetPresenter.remove(placesSurveyOtherTarget);
    }

    private void takePlaceRecTeasersTarget(PlaceRecTeasersTarget placeRecTeasersTarget, C10133f c10133f) {
        this.sMapTargetPresenter.put(placeRecTeasersTarget, new WeakReference(c10133f));
        C10134g.m41441a(c10133f, placeRecTeasersTarget);
    }

    private void dropPlaceRecTeasersTarget(PlaceRecTeasersTarget placeRecTeasersTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placeRecTeasersTarget);
        if (weakReference != null) {
            C10133f c10133f = (C10133f) weakReference.get();
            if (c10133f != null) {
                C10134g.m41440a(c10133f);
            }
        }
        this.sMapTargetPresenter.remove(placeRecTeasersTarget);
    }

    private void takeExitSurveyTarget(ExitSurveyTarget exitSurveyTarget, C16653i c16653i) {
        this.sMapTargetPresenter.put(exitSurveyTarget, new WeakReference(c16653i));
        C14897l.a(c16653i, exitSurveyTarget);
    }

    private void dropExitSurveyTarget(ExitSurveyTarget exitSurveyTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(exitSurveyTarget);
        if (weakReference != null) {
            C16653i c16653i = (C16653i) weakReference.get();
            if (c16653i != null) {
                C14897l.a(c16653i);
            }
        }
        this.sMapTargetPresenter.remove(exitSurveyTarget);
    }

    private void takePlacesMapTarget(PlacesMapTarget placesMapTarget, C10229a c10229a) {
        this.sMapTargetPresenter.put(placesMapTarget, new WeakReference(c10229a));
        C10230b.m41619a(c10229a, placesMapTarget);
    }

    private void dropPlacesMapTarget(PlacesMapTarget placesMapTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesMapTarget);
        if (weakReference != null) {
            C10229a c10229a = (C10229a) weakReference.get();
            if (c10229a != null) {
                C10230b.m41618a(c10229a);
            }
        }
        this.sMapTargetPresenter.remove(placesMapTarget);
    }

    private void takeTypingIndicatorItemTarget(TypingIndicatorItemTarget typingIndicatorItemTarget, aq aqVar) {
        this.sMapTargetPresenter.put(typingIndicatorItemTarget, new WeakReference(aqVar));
        ar.m36112a(aqVar, typingIndicatorItemTarget);
    }

    private void dropTypingIndicatorItemTarget(TypingIndicatorItemTarget typingIndicatorItemTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(typingIndicatorItemTarget);
        if (weakReference != null) {
            aq aqVar = (aq) weakReference.get();
            if (aqVar != null) {
                ar.m36111a(aqVar);
            }
        }
        this.sMapTargetPresenter.remove(typingIndicatorItemTarget);
    }

    private void takeFeedSettingItemTarget(FeedSettingItemTarget feedSettingItemTarget, C14874a c14874a) {
        this.sMapTargetPresenter.put(feedSettingItemTarget, new WeakReference(c14874a));
        C14875b.a(c14874a, feedSettingItemTarget);
    }

    private void dropFeedSettingItemTarget(FeedSettingItemTarget feedSettingItemTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(feedSettingItemTarget);
        if (weakReference != null) {
            C14874a c14874a = (C14874a) weakReference.get();
            if (c14874a != null) {
                C14875b.a(c14874a);
            }
        }
        this.sMapTargetPresenter.remove(feedSettingItemTarget);
    }

    private void takePlacesTarget(PlacesTarget placesTarget, C10223f c10223f) {
        this.sMapTargetPresenter.put(placesTarget, new WeakReference(c10223f));
        C10225i.m41596a(c10223f, placesTarget);
    }

    private void dropPlacesTarget(PlacesTarget placesTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesTarget);
        if (weakReference != null) {
            C10223f c10223f = (C10223f) weakReference.get();
            if (c10223f != null) {
                C10225i.m41595a(c10223f);
            }
        }
        this.sMapTargetPresenter.remove(placesTarget);
    }

    private void takeAdRecCardTarget(AdRecCardTarget adRecCardTarget, AdRecCardPresenter adRecCardPresenter) {
        this.sMapTargetPresenter.put(adRecCardTarget, new WeakReference(adRecCardPresenter));
        AdRecCardPresenter_Holder.takeAll(adRecCardPresenter, adRecCardTarget);
    }

    private void dropAdRecCardTarget(AdRecCardTarget adRecCardTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(adRecCardTarget);
        if (weakReference != null) {
            AdRecCardPresenter adRecCardPresenter = (AdRecCardPresenter) weakReference.get();
            if (adRecCardPresenter != null) {
                AdRecCardPresenter_Holder.dropAll(adRecCardPresenter);
            }
        }
        this.sMapTargetPresenter.remove(adRecCardTarget);
    }

    private void takePlacesRecsGridTarget(PlacesRecsGridTarget placesRecsGridTarget, C12433a c12433a) {
        this.sMapTargetPresenter.put(placesRecsGridTarget, new WeakReference(c12433a));
        C10278e.m41672a(c12433a, placesRecsGridTarget);
    }

    private void dropPlacesRecsGridTarget(PlacesRecsGridTarget placesRecsGridTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesRecsGridTarget);
        if (weakReference != null) {
            C12433a c12433a = (C12433a) weakReference.get();
            if (c12433a != null) {
                C10278e.m41671a(c12433a);
            }
        }
        this.sMapTargetPresenter.remove(placesRecsGridTarget);
    }

    private void takePlacesOnboardingCardTarget(PlacesOnboardingCardTarget placesOnboardingCardTarget, C10265a c10265a) {
        this.sMapTargetPresenter.put(placesOnboardingCardTarget, new WeakReference(c10265a));
        C10266b.m41638a(c10265a, placesOnboardingCardTarget);
    }

    private void dropPlacesOnboardingCardTarget(PlacesOnboardingCardTarget placesOnboardingCardTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesOnboardingCardTarget);
        if (weakReference != null) {
            C10265a c10265a = (C10265a) weakReference.get();
            if (c10265a != null) {
                C10266b.m41637a(c10265a);
            }
        }
        this.sMapTargetPresenter.remove(placesOnboardingCardTarget);
    }

    private void takeFastMatchPreviewRowTarget(FastMatchPreviewRowTarget fastMatchPreviewRowTarget, C9387c c9387c) {
        this.sMapTargetPresenter.put(fastMatchPreviewRowTarget, new WeakReference(c9387c));
        C9388e.m39305a(c9387c, fastMatchPreviewRowTarget);
    }

    private void dropFastMatchPreviewRowTarget(FastMatchPreviewRowTarget fastMatchPreviewRowTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(fastMatchPreviewRowTarget);
        if (weakReference != null) {
            C9387c c9387c = (C9387c) weakReference.get();
            if (c9387c != null) {
                C9388e.m39304a(c9387c);
            }
        }
        this.sMapTargetPresenter.remove(fastMatchPreviewRowTarget);
    }

    private void takeShimmerHomeTabTarget(ShimmerHomeTabTarget shimmerHomeTabTarget, C9701j c9701j) {
        this.sMapTargetPresenter.put(shimmerHomeTabTarget, new WeakReference(c9701j));
        C9702l.m40163a(c9701j, shimmerHomeTabTarget);
    }

    private void dropShimmerHomeTabTarget(ShimmerHomeTabTarget shimmerHomeTabTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(shimmerHomeTabTarget);
        if (weakReference != null) {
            C9701j c9701j = (C9701j) weakReference.get();
            if (c9701j != null) {
                C9702l.m40162a(c9701j);
            }
        }
        this.sMapTargetPresenter.remove(shimmerHomeTabTarget);
    }

    private void takeNewMatchRowTarget(NewMatchRowTarget newMatchRowTarget, C9874q c9874q) {
        this.sMapTargetPresenter.put(newMatchRowTarget, new WeakReference(c9874q));
        C9875r.m40634a(c9874q, newMatchRowTarget);
    }

    private void dropNewMatchRowTarget(NewMatchRowTarget newMatchRowTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(newMatchRowTarget);
        if (weakReference != null) {
            C9874q c9874q = (C9874q) weakReference.get();
            if (c9874q != null) {
                C9875r.m40633a(c9874q);
            }
        }
        this.sMapTargetPresenter.remove(newMatchRowTarget);
    }

    private void takeExitSurveyFeedbackTarget(ExitSurveyFeedbackTarget exitSurveyFeedbackTarget, C16652g c16652g) {
        this.sMapTargetPresenter.put(exitSurveyFeedbackTarget, new WeakReference(c16652g));
        C14896h.a(c16652g, exitSurveyFeedbackTarget);
    }

    private void dropExitSurveyFeedbackTarget(ExitSurveyFeedbackTarget exitSurveyFeedbackTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(exitSurveyFeedbackTarget);
        if (weakReference != null) {
            C16652g c16652g = (C16652g) weakReference.get();
            if (c16652g != null) {
                C14896h.a(c16652g);
            }
        }
        this.sMapTargetPresenter.remove(exitSurveyFeedbackTarget);
    }

    private void takeTappyCarouselViewTarget(TappyCarouselViewTarget tappyCarouselViewTarget, TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter) {
        this.sMapTargetPresenter.put(tappyCarouselViewTarget, new WeakReference(tappyImageDrawableCarouselViewPresenter));
        TappyImageDrawableCarouselViewPresenter_Holder.takeAll(tappyImageDrawableCarouselViewPresenter, tappyCarouselViewTarget);
    }

    private void dropTappyCarouselViewTarget(TappyCarouselViewTarget tappyCarouselViewTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(tappyCarouselViewTarget);
        if (weakReference != null) {
            TappyImageDrawableCarouselViewPresenter tappyImageDrawableCarouselViewPresenter = (TappyImageDrawableCarouselViewPresenter) weakReference.get();
            if (tappyImageDrawableCarouselViewPresenter != null) {
                TappyImageDrawableCarouselViewPresenter_Holder.dropAll(tappyImageDrawableCarouselViewPresenter);
            }
        }
        this.sMapTargetPresenter.remove(tappyCarouselViewTarget);
    }

    private void takeTinderPlusPaywallTarget(TinderPlusPaywallTarget tinderPlusPaywallTarget, C15201k c15201k) {
        this.sMapTargetPresenter.put(tinderPlusPaywallTarget, new WeakReference(c15201k));
        C15202q.a(c15201k, tinderPlusPaywallTarget);
    }

    private void dropTinderPlusPaywallTarget(TinderPlusPaywallTarget tinderPlusPaywallTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(tinderPlusPaywallTarget);
        if (weakReference != null) {
            C15201k c15201k = (C15201k) weakReference.get();
            if (c15201k != null) {
                C15202q.a(c15201k);
            }
        }
        this.sMapTargetPresenter.remove(tinderPlusPaywallTarget);
    }

    private void takeProfileInstagramAuthTarget(ProfileInstagramAuthTarget profileInstagramAuthTarget, ae aeVar) {
        this.sMapTargetPresenter.put(profileInstagramAuthTarget, new WeakReference(aeVar));
        aj.a(aeVar, profileInstagramAuthTarget);
    }

    private void dropProfileInstagramAuthTarget(ProfileInstagramAuthTarget profileInstagramAuthTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(profileInstagramAuthTarget);
        if (weakReference != null) {
            ae aeVar = (ae) weakReference.get();
            if (aeVar != null) {
                aj.a(aeVar);
            }
        }
        this.sMapTargetPresenter.remove(profileInstagramAuthTarget);
    }

    private void takePlacesSettingsTarget(PlacesSettingsTarget placesSettingsTarget, C14318c c14318c) {
        this.sMapTargetPresenter.put(placesSettingsTarget, new WeakReference(c14318c));
        C14320g.a(c14318c, placesSettingsTarget);
    }

    private void dropPlacesSettingsTarget(PlacesSettingsTarget placesSettingsTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesSettingsTarget);
        if (weakReference != null) {
            C14318c c14318c = (C14318c) weakReference.get();
            if (c14318c != null) {
                C14320g.a(c14318c);
            }
        }
        this.sMapTargetPresenter.remove(placesSettingsTarget);
    }

    private void takeTinderReactionsIntroTarget(TinderReactionsIntroTarget tinderReactionsIntroTarget, C14621a c14621a) {
        this.sMapTargetPresenter.put(tinderReactionsIntroTarget, new WeakReference(c14621a));
        C14622b.a(c14621a, tinderReactionsIntroTarget);
    }

    private void dropTinderReactionsIntroTarget(TinderReactionsIntroTarget tinderReactionsIntroTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(tinderReactionsIntroTarget);
        if (weakReference != null) {
            C14621a c14621a = (C14621a) weakReference.get();
            if (c14621a != null) {
                C14622b.a(c14621a);
            }
        }
        this.sMapTargetPresenter.remove(tinderReactionsIntroTarget);
    }

    private void takeAdMessageChatTarget(AdMessageChatTarget adMessageChatTarget, C9908a c9908a) {
        this.sMapTargetPresenter.put(adMessageChatTarget, new WeakReference(c9908a));
        C9909b.m40740a(c9908a, adMessageChatTarget);
    }

    private void dropAdMessageChatTarget(AdMessageChatTarget adMessageChatTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(adMessageChatTarget);
        if (weakReference != null) {
            C9908a c9908a = (C9908a) weakReference.get();
            if (c9908a != null) {
                C9909b.m40739a(c9908a);
            }
        }
        this.sMapTargetPresenter.remove(adMessageChatTarget);
    }

    private void takeTopPicksTarget(TopPicksTarget topPicksTarget, C15292m c15292m) {
        this.sMapTargetPresenter.put(topPicksTarget, new WeakReference(c15292m));
        C15294p.a(c15292m, topPicksTarget);
    }

    private void dropTopPicksTarget(TopPicksTarget topPicksTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(topPicksTarget);
        if (weakReference != null) {
            C15292m c15292m = (C15292m) weakReference.get();
            if (c15292m != null) {
                C15294p.a(c15292m);
            }
        }
        this.sMapTargetPresenter.remove(topPicksTarget);
    }

    private void takeShowMeTarget(ShowMeTarget showMeTarget, bh bhVar) {
        this.sMapTargetPresenter.put(showMeTarget, new WeakReference(bhVar));
        bl.a(bhVar, showMeTarget);
    }

    private void dropShowMeTarget(ShowMeTarget showMeTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(showMeTarget);
        if (weakReference != null) {
            bh bhVar = (bh) weakReference.get();
            if (bhVar != null) {
                bl.a(bhVar);
            }
        }
        this.sMapTargetPresenter.remove(showMeTarget);
    }

    private void takeFeedSettingsTarget(FeedSettingsTarget feedSettingsTarget, C14876c c14876c) {
        this.sMapTargetPresenter.put(feedSettingsTarget, new WeakReference(c14876c));
        C14878g.a(c14876c, feedSettingsTarget);
    }

    private void dropFeedSettingsTarget(FeedSettingsTarget feedSettingsTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(feedSettingsTarget);
        if (weakReference != null) {
            C14876c c14876c = (C14876c) weakReference.get();
            if (c14876c != null) {
                C14878g.a(c14876c);
            }
        }
        this.sMapTargetPresenter.remove(feedSettingsTarget);
    }

    private void takeChatInputBoxTarget(ChatInputBoxTarget chatInputBoxTarget, C8447u c8447u) {
        this.sMapTargetPresenter.put(chatInputBoxTarget, new WeakReference(c8447u));
        C8449y.m36163a(c8447u, chatInputBoxTarget);
    }

    private void dropChatInputBoxTarget(ChatInputBoxTarget chatInputBoxTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(chatInputBoxTarget);
        if (weakReference != null) {
            C8447u c8447u = (C8447u) weakReference.get();
            if (c8447u != null) {
                C8449y.m36162a(c8447u);
            }
        }
        this.sMapTargetPresenter.remove(chatInputBoxTarget);
    }

    private void takeMatchTabsTarget(MatchTabsTarget matchTabsTarget, C9870k c9870k) {
        this.sMapTargetPresenter.put(matchTabsTarget, new WeakReference(c9870k));
        C9871l.m40618a(c9870k, matchTabsTarget);
    }

    private void dropMatchTabsTarget(MatchTabsTarget matchTabsTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(matchTabsTarget);
        if (weakReference != null) {
            C9870k c9870k = (C9870k) weakReference.get();
            if (c9870k != null) {
                C9871l.m40617a(c9870k);
            }
        }
        this.sMapTargetPresenter.remove(matchTabsTarget);
    }

    private void takeDiscoveryOffTarget(DiscoveryOffTarget discoveryOffTarget, DiscoveryOffPresenter discoveryOffPresenter) {
        this.sMapTargetPresenter.put(discoveryOffTarget, new WeakReference(discoveryOffPresenter));
        DiscoveryOffPresenter_Holder.takeAll(discoveryOffPresenter, discoveryOffTarget);
    }

    private void dropDiscoveryOffTarget(DiscoveryOffTarget discoveryOffTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(discoveryOffTarget);
        if (weakReference != null) {
            DiscoveryOffPresenter discoveryOffPresenter = (DiscoveryOffPresenter) weakReference.get();
            if (discoveryOffPresenter != null) {
                DiscoveryOffPresenter_Holder.dropAll(discoveryOffPresenter);
            }
        }
        this.sMapTargetPresenter.remove(discoveryOffTarget);
    }

    private void takeAppCrashTarget(AppCrashTarget appCrashTarget, C8605a c8605a) {
        this.sMapTargetPresenter.put(appCrashTarget, new WeakReference(c8605a));
        C8606b.m36727a(c8605a, appCrashTarget);
    }

    private void dropAppCrashTarget(AppCrashTarget appCrashTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(appCrashTarget);
        if (weakReference != null) {
            C8605a c8605a = (C8605a) weakReference.get();
            if (c8605a != null) {
                C8606b.m36726a(c8605a);
            }
        }
        this.sMapTargetPresenter.remove(appCrashTarget);
    }

    private void takeRecsTarget(RecsTarget recsTarget, RecsPresenter recsPresenter) {
        this.sMapTargetPresenter.put(recsTarget, new WeakReference(recsPresenter));
        RecsPresenter_Holder.takeAll(recsPresenter, recsTarget);
    }

    private void dropRecsTarget(RecsTarget recsTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(recsTarget);
        if (weakReference != null) {
            RecsPresenter recsPresenter = (RecsPresenter) weakReference.get();
            if (recsPresenter != null) {
                RecsPresenter_Holder.dropAll(recsPresenter);
            }
        }
        this.sMapTargetPresenter.remove(recsTarget);
    }

    private void takeBasicInfoShareRecTarget(BasicInfoShareRecTarget basicInfoShareRecTarget, C14424c c14424c) {
        this.sMapTargetPresenter.put(basicInfoShareRecTarget, new WeakReference(c14424c));
        C14425d.a(c14424c, basicInfoShareRecTarget);
    }

    private void dropBasicInfoShareRecTarget(BasicInfoShareRecTarget basicInfoShareRecTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(basicInfoShareRecTarget);
        if (weakReference != null) {
            C14424c c14424c = (C14424c) weakReference.get();
            if (c14424c != null) {
                C14425d.a(c14424c);
            }
        }
        this.sMapTargetPresenter.remove(basicInfoShareRecTarget);
    }

    private void takeCensorTarget(CensorTarget censorTarget, C8442a c8442a) {
        this.sMapTargetPresenter.put(censorTarget, new WeakReference(c8442a));
        C8444r.m36114a(c8442a, censorTarget);
    }

    private void dropCensorTarget(CensorTarget censorTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(censorTarget);
        if (weakReference != null) {
            C8442a c8442a = (C8442a) weakReference.get();
            if (c8442a != null) {
                C8444r.m36113a(c8442a);
            }
        }
        this.sMapTargetPresenter.remove(censorTarget);
    }

    private void takeGrandGestureTarget(GrandGestureTarget grandGestureTarget, C14594a c14594a) {
        this.sMapTargetPresenter.put(grandGestureTarget, new WeakReference(c14594a));
        C14596c.a(c14594a, grandGestureTarget);
    }

    private void dropGrandGestureTarget(GrandGestureTarget grandGestureTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(grandGestureTarget);
        if (weakReference != null) {
            C14594a c14594a = (C14594a) weakReference.get();
            if (c14594a != null) {
                C14596c.a(c14594a);
            }
        }
        this.sMapTargetPresenter.remove(grandGestureTarget);
    }

    private void takePlacesUserRecCardTarget(PlacesUserRecCardTarget placesUserRecCardTarget, C10279f c10279f) {
        this.sMapTargetPresenter.put(placesUserRecCardTarget, new WeakReference(c10279f));
        C10280g.m41676a(c10279f, placesUserRecCardTarget);
    }

    private void dropPlacesUserRecCardTarget(PlacesUserRecCardTarget placesUserRecCardTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesUserRecCardTarget);
        if (weakReference != null) {
            C10279f c10279f = (C10279f) weakReference.get();
            if (c10279f != null) {
                C10280g.m41675a(c10279f);
            }
        }
        this.sMapTargetPresenter.remove(placesUserRecCardTarget);
    }

    private void takeProfileRecommendToFriendTarget(ProfileRecommendToFriendTarget profileRecommendToFriendTarget, ax axVar) {
        this.sMapTargetPresenter.put(profileRecommendToFriendTarget, new WeakReference(axVar));
        ba.a(axVar, profileRecommendToFriendTarget);
    }

    private void dropProfileRecommendToFriendTarget(ProfileRecommendToFriendTarget profileRecommendToFriendTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(profileRecommendToFriendTarget);
        if (weakReference != null) {
            ax axVar = (ax) weakReference.get();
            if (axVar != null) {
                ba.a(axVar);
            }
        }
        this.sMapTargetPresenter.remove(profileRecommendToFriendTarget);
    }

    private void takeChatTarget(ChatTarget chatTarget, ad adVar) {
        this.sMapTargetPresenter.put(chatTarget, new WeakReference(adVar));
        af.m36086a(adVar, chatTarget);
    }

    private void dropChatTarget(ChatTarget chatTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(chatTarget);
        if (weakReference != null) {
            ad adVar = (ad) weakReference.get();
            if (adVar != null) {
                af.m36085a(adVar);
            }
        }
        this.sMapTargetPresenter.remove(chatTarget);
    }

    private void takeTopPicksGoldTarget(TopPicksGoldTarget topPicksGoldTarget, C15284a c15284a) {
        this.sMapTargetPresenter.put(topPicksGoldTarget, new WeakReference(c15284a));
        C15286d.a(c15284a, topPicksGoldTarget);
    }

    private void dropTopPicksGoldTarget(TopPicksGoldTarget topPicksGoldTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(topPicksGoldTarget);
        if (weakReference != null) {
            C15284a c15284a = (C15284a) weakReference.get();
            if (c15284a != null) {
                C15286d.a(c15284a);
            }
        }
        this.sMapTargetPresenter.remove(topPicksGoldTarget);
    }

    private void takeSchoolTarget(SchoolTarget schoolTarget, bf bfVar) {
        this.sMapTargetPresenter.put(schoolTarget, new WeakReference(bfVar));
        bm.a(bfVar, schoolTarget);
    }

    private void dropSchoolTarget(SchoolTarget schoolTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(schoolTarget);
        if (weakReference != null) {
            bf bfVar = (bf) weakReference.get();
            if (bfVar != null) {
                bm.a(bfVar);
            }
        }
        this.sMapTargetPresenter.remove(schoolTarget);
    }

    private void takeMatchesSearchViewTarget(MatchesSearchViewTarget matchesSearchViewTarget, C9872m c9872m) {
        this.sMapTargetPresenter.put(matchesSearchViewTarget, new WeakReference(c9872m));
        C9873p.m40629a(c9872m, matchesSearchViewTarget);
    }

    private void dropMatchesSearchViewTarget(MatchesSearchViewTarget matchesSearchViewTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(matchesSearchViewTarget);
        if (weakReference != null) {
            C9872m c9872m = (C9872m) weakReference.get();
            if (c9872m != null) {
                C9873p.m40628a(c9872m);
            }
        }
        this.sMapTargetPresenter.remove(matchesSearchViewTarget);
    }

    private void takeTinderGoldIntroTarget(TinderGoldIntroTarget tinderGoldIntroTarget, C15184a c15184a) {
        this.sMapTargetPresenter.put(tinderGoldIntroTarget, new WeakReference(c15184a));
        C15185b.a(c15184a, tinderGoldIntroTarget);
    }

    private void dropTinderGoldIntroTarget(TinderGoldIntroTarget tinderGoldIntroTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(tinderGoldIntroTarget);
        if (weakReference != null) {
            C15184a c15184a = (C15184a) weakReference.get();
            if (c15184a != null) {
                C15185b.a(c15184a);
            }
        }
        this.sMapTargetPresenter.remove(tinderGoldIntroTarget);
    }

    private void takeMatchListTarget(MatchListTarget matchListTarget, C9865a c9865a) {
        this.sMapTargetPresenter.put(matchListTarget, new WeakReference(c9865a));
        C9867d.m40596a(c9865a, matchListTarget);
    }

    private void dropMatchListTarget(MatchListTarget matchListTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(matchListTarget);
        if (weakReference != null) {
            C9865a c9865a = (C9865a) weakReference.get();
            if (c9865a != null) {
                C9867d.m40595a(c9865a);
            }
        }
        this.sMapTargetPresenter.remove(matchListTarget);
    }

    private void takeAutoPlayVideoSettingsTarget(AutoPlayVideoSettingsTarget autoPlayVideoSettingsTarget, C14885d c14885d) {
        this.sMapTargetPresenter.put(autoPlayVideoSettingsTarget, new WeakReference(c14885d));
        C14886e.a(c14885d, autoPlayVideoSettingsTarget);
    }

    private void dropAutoPlayVideoSettingsTarget(AutoPlayVideoSettingsTarget autoPlayVideoSettingsTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(autoPlayVideoSettingsTarget);
        if (weakReference != null) {
            C14885d c14885d = (C14885d) weakReference.get();
            if (c14885d != null) {
                C14886e.a(c14885d);
            }
        }
        this.sMapTargetPresenter.remove(autoPlayVideoSettingsTarget);
    }

    private void takeChatInputEditTextTarget(ChatInputEditTextTarget chatInputEditTextTarget, C8450z c8450z) {
        this.sMapTargetPresenter.put(chatInputEditTextTarget, new WeakReference(c8450z));
        ac.m36068a(c8450z, chatInputEditTextTarget);
    }

    private void dropChatInputEditTextTarget(ChatInputEditTextTarget chatInputEditTextTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(chatInputEditTextTarget);
        if (weakReference != null) {
            C8450z c8450z = (C8450z) weakReference.get();
            if (c8450z != null) {
                ac.m36067a(c8450z);
            }
        }
        this.sMapTargetPresenter.remove(chatInputEditTextTarget);
    }

    private void takePlacesCardTarget(PlacesCardTarget placesCardTarget, PlacesCardViewPresenter placesCardViewPresenter) {
        this.sMapTargetPresenter.put(placesCardTarget, new WeakReference(placesCardViewPresenter));
        C10137m.m41445a(placesCardViewPresenter, placesCardTarget);
    }

    private void dropPlacesCardTarget(PlacesCardTarget placesCardTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesCardTarget);
        if (weakReference != null) {
            PlacesCardViewPresenter placesCardViewPresenter = (PlacesCardViewPresenter) weakReference.get();
            if (placesCardViewPresenter != null) {
                C10137m.m41444a(placesCardViewPresenter);
            }
        }
        this.sMapTargetPresenter.remove(placesCardTarget);
    }

    private void takeExpandReactionDrawerFeatureTarget(ExpandReactionDrawerFeatureTarget expandReactionDrawerFeatureTarget, C14603a c14603a) {
        this.sMapTargetPresenter.put(expandReactionDrawerFeatureTarget, new WeakReference(c14603a));
        C14604c.a(c14603a, expandReactionDrawerFeatureTarget);
    }

    private void dropExpandReactionDrawerFeatureTarget(ExpandReactionDrawerFeatureTarget expandReactionDrawerFeatureTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(expandReactionDrawerFeatureTarget);
        if (weakReference != null) {
            C14603a c14603a = (C14603a) weakReference.get();
            if (c14603a != null) {
                C14604c.a(c14603a);
            }
        }
        this.sMapTargetPresenter.remove(expandReactionDrawerFeatureTarget);
    }

    private void takeEmptyChatViewTarget(EmptyChatViewTarget emptyChatViewTarget, an anVar) {
        this.sMapTargetPresenter.put(emptyChatViewTarget, new WeakReference(anVar));
        ap.m36107a(anVar, emptyChatViewTarget);
    }

    private void dropEmptyChatViewTarget(EmptyChatViewTarget emptyChatViewTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(emptyChatViewTarget);
        if (weakReference != null) {
            an anVar = (an) weakReference.get();
            if (anVar != null) {
                ap.m36106a(anVar);
            }
        }
        this.sMapTargetPresenter.remove(emptyChatViewTarget);
    }

    private void takeProfileGamepadTarget(ProfileGamepadTarget profileGamepadTarget, bn bnVar) {
        this.sMapTargetPresenter.put(profileGamepadTarget, new WeakReference(bnVar));
        bo.a(bnVar, profileGamepadTarget);
    }

    private void dropProfileGamepadTarget(ProfileGamepadTarget profileGamepadTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(profileGamepadTarget);
        if (weakReference != null) {
            bn bnVar = (bn) weakReference.get();
            if (bnVar != null) {
                bo.a(bnVar);
            }
        }
        this.sMapTargetPresenter.remove(profileGamepadTarget);
    }

    private void takeSelectableGrandGestureTarget(SelectableGrandGestureTarget selectableGrandGestureTarget, C14657g c14657g) {
        this.sMapTargetPresenter.put(selectableGrandGestureTarget, new WeakReference(c14657g));
        C14658h.a(c14657g, selectableGrandGestureTarget);
    }

    private void dropSelectableGrandGestureTarget(SelectableGrandGestureTarget selectableGrandGestureTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(selectableGrandGestureTarget);
        if (weakReference != null) {
            C14657g c14657g = (C14657g) weakReference.get();
            if (c14657g != null) {
                C14658h.a(c14657g);
            }
        }
        this.sMapTargetPresenter.remove(selectableGrandGestureTarget);
    }

    private void takePlaceRecsContainerTarget(PlaceRecsContainerTarget placeRecsContainerTarget, C12306h c12306h) {
        this.sMapTargetPresenter.put(placeRecsContainerTarget, new WeakReference(c12306h));
        C10135i.m41443a(c12306h, placeRecsContainerTarget);
    }

    private void dropPlaceRecsContainerTarget(PlaceRecsContainerTarget placeRecsContainerTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placeRecsContainerTarget);
        if (weakReference != null) {
            C12306h c12306h = (C12306h) weakReference.get();
            if (c12306h != null) {
                C10135i.m41442a(c12306h);
            }
        }
        this.sMapTargetPresenter.remove(placeRecsContainerTarget);
    }

    private void takeMatchProfileTarget(MatchProfileTarget matchProfileTarget, C14434z c14434z) {
        this.sMapTargetPresenter.put(matchProfileTarget, new WeakReference(c14434z));
        com.tinder.profile.presenter.ad.a(c14434z, matchProfileTarget);
    }

    private void dropMatchProfileTarget(MatchProfileTarget matchProfileTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(matchProfileTarget);
        if (weakReference != null) {
            C14434z c14434z = (C14434z) weakReference.get();
            if (c14434z != null) {
                com.tinder.profile.presenter.ad.a(c14434z);
            }
        }
        this.sMapTargetPresenter.remove(matchProfileTarget);
    }

    private void takeBoostButtonTarget(BoostButtonTarget boostButtonTarget, C8346a c8346a) {
        this.sMapTargetPresenter.put(boostButtonTarget, new WeakReference(c8346a));
        C8348e.m35547a(c8346a, boostButtonTarget);
    }

    private void dropBoostButtonTarget(BoostButtonTarget boostButtonTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(boostButtonTarget);
        if (weakReference != null) {
            C8346a c8346a = (C8346a) weakReference.get();
            if (c8346a != null) {
                C8348e.m35546a(c8346a);
            }
        }
        this.sMapTargetPresenter.remove(boostButtonTarget);
    }

    private void takeProfileTabTarget(ProfileTabTarget profileTabTarget, C14476x c14476x) {
        this.sMapTargetPresenter.put(profileTabTarget, new WeakReference(c14476x));
        C14477z.a(c14476x, profileTabTarget);
    }

    private void dropProfileTabTarget(ProfileTabTarget profileTabTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(profileTabTarget);
        if (weakReference != null) {
            C14476x c14476x = (C14476x) weakReference.get();
            if (c14476x != null) {
                C14477z.a(c14476x);
            }
        }
        this.sMapTargetPresenter.remove(profileTabTarget);
    }

    private void takePlaceCardAlternativesTarget(PlaceCardAlternativesTarget placeCardAlternativesTarget, C10127a c10127a) {
        this.sMapTargetPresenter.put(placeCardAlternativesTarget, new WeakReference(c10127a));
        C10128b.m41411a(c10127a, placeCardAlternativesTarget);
    }

    private void dropPlaceCardAlternativesTarget(PlaceCardAlternativesTarget placeCardAlternativesTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placeCardAlternativesTarget);
        if (weakReference != null) {
            C10127a c10127a = (C10127a) weakReference.get();
            if (c10127a != null) {
                C10128b.m41410a(c10127a);
            }
        }
        this.sMapTargetPresenter.remove(placeCardAlternativesTarget);
    }

    private void takeAutoPlayLoopsOptionsTarget(AutoPlayLoopsOptionsTarget autoPlayLoopsOptionsTarget, C14883a c14883a) {
        this.sMapTargetPresenter.put(autoPlayLoopsOptionsTarget, new WeakReference(c14883a));
        C14884c.a(c14883a, autoPlayLoopsOptionsTarget);
    }

    private void dropAutoPlayLoopsOptionsTarget(AutoPlayLoopsOptionsTarget autoPlayLoopsOptionsTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(autoPlayLoopsOptionsTarget);
        if (weakReference != null) {
            C14883a c14883a = (C14883a) weakReference.get();
            if (c14883a != null) {
                C14884c.a(c14883a);
            }
        }
        this.sMapTargetPresenter.remove(autoPlayLoopsOptionsTarget);
    }

    private void takeCurrentUserProfileTarget(CurrentUserProfileTarget currentUserProfileTarget, C14429h c14429h) {
        this.sMapTargetPresenter.put(currentUserProfileTarget, new WeakReference(c14429h));
        C14430q.a(c14429h, currentUserProfileTarget);
    }

    private void dropCurrentUserProfileTarget(CurrentUserProfileTarget currentUserProfileTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(currentUserProfileTarget);
        if (weakReference != null) {
            C14429h c14429h = (C14429h) weakReference.get();
            if (c14429h != null) {
                C14430q.a(c14429h);
            }
        }
        this.sMapTargetPresenter.remove(currentUserProfileTarget);
    }

    private void takeItsAMatchDialogTarget(ItsAMatchDialogTarget itsAMatchDialogTarget, C9862h c9862h) {
        this.sMapTargetPresenter.put(itsAMatchDialogTarget, new WeakReference(c9862h));
        C9863j.m40575a(c9862h, itsAMatchDialogTarget);
    }

    private void dropItsAMatchDialogTarget(ItsAMatchDialogTarget itsAMatchDialogTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(itsAMatchDialogTarget);
        if (weakReference != null) {
            C9862h c9862h = (C9862h) weakReference.get();
            if (c9862h != null) {
                C9863j.m40574a(c9862h);
            }
        }
        this.sMapTargetPresenter.remove(itsAMatchDialogTarget);
    }

    private void takeGestureNavigationLoadingTarget(GestureNavigationLoadingTarget gestureNavigationLoadingTarget, C14684a c14684a) {
        this.sMapTargetPresenter.put(gestureNavigationLoadingTarget, new WeakReference(c14684a));
        C14686d.a(c14684a, gestureNavigationLoadingTarget);
    }

    private void dropGestureNavigationLoadingTarget(GestureNavigationLoadingTarget gestureNavigationLoadingTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(gestureNavigationLoadingTarget);
        if (weakReference != null) {
            C14684a c14684a = (C14684a) weakReference.get();
            if (c14684a != null) {
                C14686d.a(c14684a);
            }
        }
        this.sMapTargetPresenter.remove(gestureNavigationLoadingTarget);
    }

    private void takeGamepadTarget(GamepadTarget gamepadTarget, GamepadPresenter gamepadPresenter) {
        this.sMapTargetPresenter.put(gamepadTarget, new WeakReference(gamepadPresenter));
        GamepadPresenter_Holder.takeAll(gamepadPresenter, gamepadTarget);
    }

    private void dropGamepadTarget(GamepadTarget gamepadTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(gamepadTarget);
        if (weakReference != null) {
            GamepadPresenter gamepadPresenter = (GamepadPresenter) weakReference.get();
            if (gamepadPresenter != null) {
                GamepadPresenter_Holder.dropAll(gamepadPresenter);
            }
        }
        this.sMapTargetPresenter.remove(gamepadTarget);
    }

    private void takeEditFeedSettingItemTarget(EditFeedSettingItemTarget editFeedSettingItemTarget, C8947a c8947a) {
        this.sMapTargetPresenter.put(editFeedSettingItemTarget, new WeakReference(c8947a));
        C8948b.m37731a(c8947a, editFeedSettingItemTarget);
    }

    private void dropEditFeedSettingItemTarget(EditFeedSettingItemTarget editFeedSettingItemTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(editFeedSettingItemTarget);
        if (weakReference != null) {
            C8947a c8947a = (C8947a) weakReference.get();
            if (c8947a != null) {
                C8948b.m37730a(c8947a);
            }
        }
        this.sMapTargetPresenter.remove(editFeedSettingItemTarget);
    }

    private void takeFastMatchRecsActivityTarget(FastMatchRecsActivityTarget fastMatchRecsActivityTarget, C11629g c11629g) {
        this.sMapTargetPresenter.put(fastMatchRecsActivityTarget, new WeakReference(c11629g));
        C9391h.m39309a(c11629g, fastMatchRecsActivityTarget);
    }

    private void dropFastMatchRecsActivityTarget(FastMatchRecsActivityTarget fastMatchRecsActivityTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(fastMatchRecsActivityTarget);
        if (weakReference != null) {
            C11629g c11629g = (C11629g) weakReference.get();
            if (c11629g != null) {
                C9391h.m39308a(c11629g);
            }
        }
        this.sMapTargetPresenter.remove(fastMatchRecsActivityTarget);
    }

    private void takeReportMatchTarget(ReportMatchTarget reportMatchTarget, C10015c c10015c) {
        this.sMapTargetPresenter.put(reportMatchTarget, new WeakReference(c10015c));
        C10016d.m41041a(c10015c, reportMatchTarget);
    }

    private void dropReportMatchTarget(ReportMatchTarget reportMatchTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(reportMatchTarget);
        if (weakReference != null) {
            C10015c c10015c = (C10015c) weakReference.get();
            if (c10015c != null) {
                C10016d.m41040a(c10015c);
            }
        }
        this.sMapTargetPresenter.remove(reportMatchTarget);
    }

    private void takePlacesPinDropTarget(PlacesPinDropTarget placesPinDropTarget, C10220d c10220d) {
        this.sMapTargetPresenter.put(placesPinDropTarget, new WeakReference(c10220d));
        C10221e.m41554a(c10220d, placesPinDropTarget);
    }

    private void dropPlacesPinDropTarget(PlacesPinDropTarget placesPinDropTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesPinDropTarget);
        if (weakReference != null) {
            C10220d c10220d = (C10220d) weakReference.get();
            if (c10220d != null) {
                C10221e.m41553a(c10220d);
            }
        }
        this.sMapTargetPresenter.remove(placesPinDropTarget);
    }

    private void takeReactionTutorialFeatureTarget(ReactionTutorialFeatureTarget reactionTutorialFeatureTarget, C14605d c14605d) {
        this.sMapTargetPresenter.put(reactionTutorialFeatureTarget, new WeakReference(c14605d));
        C14606g.a(c14605d, reactionTutorialFeatureTarget);
    }

    private void dropReactionTutorialFeatureTarget(ReactionTutorialFeatureTarget reactionTutorialFeatureTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(reactionTutorialFeatureTarget);
        if (weakReference != null) {
            C14605d c14605d = (C14605d) weakReference.get();
            if (c14605d != null) {
                C14606g.a(c14605d);
            }
        }
        this.sMapTargetPresenter.remove(reactionTutorialFeatureTarget);
    }

    private void takeInstagramLoginView(InstagramLoginView instagramLoginView, com.tinder.presenters.bf bfVar) {
        this.sMapTargetPresenter.put(instagramLoginView, new WeakReference(bfVar));
        bv.a(bfVar, instagramLoginView);
    }

    private void dropInstagramLoginView(InstagramLoginView instagramLoginView) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(instagramLoginView);
        if (weakReference != null) {
            com.tinder.presenters.bf bfVar = (com.tinder.presenters.bf) weakReference.get();
            if (bfVar != null) {
                bv.a(bfVar);
            }
        }
        this.sMapTargetPresenter.remove(instagramLoginView);
    }

    private void takeFastMatchRecsGridTarget(FastMatchRecsGridTarget fastMatchRecsGridTarget, C11648i c11648i) {
        this.sMapTargetPresenter.put(fastMatchRecsGridTarget, new WeakReference(c11648i));
        C9394m.m39313a(c11648i, fastMatchRecsGridTarget);
    }

    private void dropFastMatchRecsGridTarget(FastMatchRecsGridTarget fastMatchRecsGridTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(fastMatchRecsGridTarget);
        if (weakReference != null) {
            C11648i c11648i = (C11648i) weakReference.get();
            if (c11648i != null) {
                C9394m.m39312a(c11648i);
            }
        }
        this.sMapTargetPresenter.remove(fastMatchRecsGridTarget);
    }

    private void takeGrandGestureSelectorTarget(GrandGestureSelectorTarget grandGestureSelectorTarget, C14655e c14655e) {
        this.sMapTargetPresenter.put(grandGestureSelectorTarget, new WeakReference(c14655e));
        C14656f.a(c14655e, grandGestureSelectorTarget);
    }

    private void dropGrandGestureSelectorTarget(GrandGestureSelectorTarget grandGestureSelectorTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(grandGestureSelectorTarget);
        if (weakReference != null) {
            C14655e c14655e = (C14655e) weakReference.get();
            if (c14655e != null) {
                C14656f.a(c14655e);
            }
        }
        this.sMapTargetPresenter.remove(grandGestureSelectorTarget);
    }

    private void takeBadgeAttributionTarget(BadgeAttributionTarget badgeAttributionTarget, C8525a c8525a) {
        this.sMapTargetPresenter.put(badgeAttributionTarget, new WeakReference(c8525a));
        C8527c.m36492a(c8525a, badgeAttributionTarget);
    }

    private void dropBadgeAttributionTarget(BadgeAttributionTarget badgeAttributionTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(badgeAttributionTarget);
        if (weakReference != null) {
            C8525a c8525a = (C8525a) weakReference.get();
            if (c8525a != null) {
                C8527c.m36491a(c8525a);
            }
        }
        this.sMapTargetPresenter.remove(badgeAttributionTarget);
    }

    private void takeFlingableLottieAnimationTarget(FlingableLottieAnimationTarget flingableLottieAnimationTarget, C14651a c14651a) {
        this.sMapTargetPresenter.put(flingableLottieAnimationTarget, new WeakReference(c14651a));
        C14652b.a(c14651a, flingableLottieAnimationTarget);
    }

    private void dropFlingableLottieAnimationTarget(FlingableLottieAnimationTarget flingableLottieAnimationTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(flingableLottieAnimationTarget);
        if (weakReference != null) {
            C14651a c14651a = (C14651a) weakReference.get();
            if (c14651a != null) {
                C14652b.a(c14651a);
            }
        }
        this.sMapTargetPresenter.remove(flingableLottieAnimationTarget);
    }

    private void takeChatToolbarTarget(ChatToolbarTarget chatToolbarTarget, ag agVar) {
        this.sMapTargetPresenter.put(chatToolbarTarget, new WeakReference(agVar));
        am.m36094a(agVar, chatToolbarTarget);
    }

    private void dropChatToolbarTarget(ChatToolbarTarget chatToolbarTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(chatToolbarTarget);
        if (weakReference != null) {
            ag agVar = (ag) weakReference.get();
            if (agVar != null) {
                am.m36093a(agVar);
            }
        }
        this.sMapTargetPresenter.remove(chatToolbarTarget);
    }

    private void takePlacesDisabledSurveyTarget(PlacesDisabledSurveyTarget placesDisabledSurveyTarget, PlacesDisabledSurveyPresenter placesDisabledSurveyPresenter) {
        this.sMapTargetPresenter.put(placesDisabledSurveyTarget, new WeakReference(placesDisabledSurveyPresenter));
        C14317b.a(placesDisabledSurveyPresenter, placesDisabledSurveyTarget);
    }

    private void dropPlacesDisabledSurveyTarget(PlacesDisabledSurveyTarget placesDisabledSurveyTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesDisabledSurveyTarget);
        if (weakReference != null) {
            PlacesDisabledSurveyPresenter placesDisabledSurveyPresenter = (PlacesDisabledSurveyPresenter) weakReference.get();
            if (placesDisabledSurveyPresenter != null) {
                C14317b.a(placesDisabledSurveyPresenter);
            }
        }
        this.sMapTargetPresenter.remove(placesDisabledSurveyTarget);
    }

    private void takeUnMatchTarget(UnMatchTarget unMatchTarget, C10017e c10017e) {
        this.sMapTargetPresenter.put(unMatchTarget, new WeakReference(c10017e));
        C10018f.m41048a(c10017e, unMatchTarget);
    }

    private void dropUnMatchTarget(UnMatchTarget unMatchTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(unMatchTarget);
        if (weakReference != null) {
            C10017e c10017e = (C10017e) weakReference.get();
            if (c10017e != null) {
                C10018f.m41047a(c10017e);
            }
        }
        this.sMapTargetPresenter.remove(unMatchTarget);
    }

    private void takeGridSuperLikeButtonTarget(GridSuperLikeButtonTarget gridSuperLikeButtonTarget, GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter) {
        this.sMapTargetPresenter.put(gridSuperLikeButtonTarget, new WeakReference(gridSuperLikeButtonPresenter));
        GridSuperLikeButtonPresenter_Holder.takeAll(gridSuperLikeButtonPresenter, gridSuperLikeButtonTarget);
    }

    private void dropGridSuperLikeButtonTarget(GridSuperLikeButtonTarget gridSuperLikeButtonTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(gridSuperLikeButtonTarget);
        if (weakReference != null) {
            GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter = (GridSuperLikeButtonPresenter) weakReference.get();
            if (gridSuperLikeButtonPresenter != null) {
                GridSuperLikeButtonPresenter_Holder.dropAll(gridSuperLikeButtonPresenter);
            }
        }
        this.sMapTargetPresenter.remove(gridSuperLikeButtonTarget);
    }

    private void takeProfileReportUserTarget(ProfileReportUserTarget profileReportUserTarget, bb bbVar) {
        this.sMapTargetPresenter.put(profileReportUserTarget, new WeakReference(bbVar));
        bc.a(bbVar, profileReportUserTarget);
    }

    private void dropProfileReportUserTarget(ProfileReportUserTarget profileReportUserTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(profileReportUserTarget);
        if (weakReference != null) {
            bb bbVar = (bb) weakReference.get();
            if (bbVar != null) {
                bc.a(bbVar);
            }
        }
        this.sMapTargetPresenter.remove(profileReportUserTarget);
    }

    private void takeSettingsShortcutTarget(SettingsShortcutTarget settingsShortcutTarget, SettingsShortcutPresenter settingsShortcutPresenter) {
        this.sMapTargetPresenter.put(settingsShortcutTarget, new WeakReference(settingsShortcutPresenter));
        SettingsShortcutPresenter_Holder.takeAll(settingsShortcutPresenter, settingsShortcutTarget);
    }

    private void dropSettingsShortcutTarget(SettingsShortcutTarget settingsShortcutTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(settingsShortcutTarget);
        if (weakReference != null) {
            SettingsShortcutPresenter settingsShortcutPresenter = (SettingsShortcutPresenter) weakReference.get();
            if (settingsShortcutPresenter != null) {
                SettingsShortcutPresenter_Holder.dropAll(settingsShortcutPresenter);
            }
        }
        this.sMapTargetPresenter.remove(settingsShortcutTarget);
    }

    private void takeJobTarget(JobTarget jobTarget, C14431r c14431r) {
        this.sMapTargetPresenter.put(jobTarget, new WeakReference(c14431r));
        C14432y.a(c14431r, jobTarget);
    }

    private void dropJobTarget(JobTarget jobTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(jobTarget);
        if (weakReference != null) {
            C14431r c14431r = (C14431r) weakReference.get();
            if (c14431r != null) {
                C14432y.a(c14431r);
            }
        }
        this.sMapTargetPresenter.remove(jobTarget);
    }

    private void takeTappyUserRecCardTarget(TappyUserRecCardTarget tappyUserRecCardTarget, TappyUserRecCardPresenter tappyUserRecCardPresenter) {
        this.sMapTargetPresenter.put(tappyUserRecCardTarget, new WeakReference(tappyUserRecCardPresenter));
        TappyUserRecCardPresenter_Holder.takeAll(tappyUserRecCardPresenter, tappyUserRecCardTarget);
    }

    private void dropTappyUserRecCardTarget(TappyUserRecCardTarget tappyUserRecCardTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(tappyUserRecCardTarget);
        if (weakReference != null) {
            TappyUserRecCardPresenter tappyUserRecCardPresenter = (TappyUserRecCardPresenter) weakReference.get();
            if (tappyUserRecCardPresenter != null) {
                TappyUserRecCardPresenter_Holder.dropAll(tappyUserRecCardPresenter);
            }
        }
        this.sMapTargetPresenter.remove(tappyUserRecCardTarget);
    }

    private void takeFastMatchToolbarTarget(FastMatchToolbarTarget fastMatchToolbarTarget, C9395n c9395n) {
        this.sMapTargetPresenter.put(fastMatchToolbarTarget, new WeakReference(c9395n));
        C9396o.m39320a(c9395n, fastMatchToolbarTarget);
    }

    private void dropFastMatchToolbarTarget(FastMatchToolbarTarget fastMatchToolbarTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(fastMatchToolbarTarget);
        if (weakReference != null) {
            C9395n c9395n = (C9395n) weakReference.get();
            if (c9395n != null) {
                C9396o.m39319a(c9395n);
            }
        }
        this.sMapTargetPresenter.remove(fastMatchToolbarTarget);
    }

    private void takeTopPicksGridRecsTarget(TopPicksGridRecsTarget topPicksGridRecsTarget, C17082e c17082e) {
        this.sMapTargetPresenter.put(topPicksGridRecsTarget, new WeakReference(c17082e));
        C15289i.a(c17082e, topPicksGridRecsTarget);
    }

    private void dropTopPicksGridRecsTarget(TopPicksGridRecsTarget topPicksGridRecsTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(topPicksGridRecsTarget);
        if (weakReference != null) {
            C17082e c17082e = (C17082e) weakReference.get();
            if (c17082e != null) {
                C15289i.a(c17082e);
            }
        }
        this.sMapTargetPresenter.remove(topPicksGridRecsTarget);
    }

    private void takeGrandGestureMatchAvatarTarget(GrandGestureMatchAvatarTarget grandGestureMatchAvatarTarget, C14653c c14653c) {
        this.sMapTargetPresenter.put(grandGestureMatchAvatarTarget, new WeakReference(c14653c));
        C14654d.a(c14653c, grandGestureMatchAvatarTarget);
    }

    private void dropGrandGestureMatchAvatarTarget(GrandGestureMatchAvatarTarget grandGestureMatchAvatarTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(grandGestureMatchAvatarTarget);
        if (weakReference != null) {
            C14653c c14653c = (C14653c) weakReference.get();
            if (c14653c != null) {
                C14654d.a(c14653c);
            }
        }
        this.sMapTargetPresenter.remove(grandGestureMatchAvatarTarget);
    }

    private void takeAppRatingTarget(AppRatingTarget appRatingTarget, C8261a c8261a) {
        this.sMapTargetPresenter.put(appRatingTarget, new WeakReference(c8261a));
        C8263c.m35282a(c8261a, appRatingTarget);
    }

    private void dropAppRatingTarget(AppRatingTarget appRatingTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(appRatingTarget);
        if (weakReference != null) {
            C8261a c8261a = (C8261a) weakReference.get();
            if (c8261a != null) {
                C8263c.m35281a(c8261a);
            }
        }
        this.sMapTargetPresenter.remove(appRatingTarget);
    }

    private void takeTopPicksUserRecCardTarget(TopPicksUserRecCardTarget topPicksUserRecCardTarget, C15295q c15295q) {
        this.sMapTargetPresenter.put(topPicksUserRecCardTarget, new WeakReference(c15295q));
        C15296r.a(c15295q, topPicksUserRecCardTarget);
    }

    private void dropTopPicksUserRecCardTarget(TopPicksUserRecCardTarget topPicksUserRecCardTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(topPicksUserRecCardTarget);
        if (weakReference != null) {
            C15295q c15295q = (C15295q) weakReference.get();
            if (c15295q != null) {
                C15296r.a(c15295q);
            }
        }
        this.sMapTargetPresenter.remove(topPicksUserRecCardTarget);
    }

    private void takePlacesCarouselTarget(PlacesCarouselTarget placesCarouselTarget, C10194c c10194c) {
        this.sMapTargetPresenter.put(placesCarouselTarget, new WeakReference(c10194c));
        C10195e.m41504a(c10194c, placesCarouselTarget);
    }

    private void dropPlacesCarouselTarget(PlacesCarouselTarget placesCarouselTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesCarouselTarget);
        if (weakReference != null) {
            C10194c c10194c = (C10194c) weakReference.get();
            if (c10194c != null) {
                C10195e.m41503a(c10194c);
            }
        }
        this.sMapTargetPresenter.remove(placesCarouselTarget);
    }

    private void takeRecommendProfileActionItemTarget(RecommendProfileActionItemTarget recommendProfileActionItemTarget, C10013a c10013a) {
        this.sMapTargetPresenter.put(recommendProfileActionItemTarget, new WeakReference(c10013a));
        C10014b.m41035a(c10013a, recommendProfileActionItemTarget);
    }

    private void dropRecommendProfileActionItemTarget(RecommendProfileActionItemTarget recommendProfileActionItemTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(recommendProfileActionItemTarget);
        if (weakReference != null) {
            C10013a c10013a = (C10013a) weakReference.get();
            if (c10013a != null) {
                C10014b.m41034a(c10013a);
            }
        }
        this.sMapTargetPresenter.remove(recommendProfileActionItemTarget);
    }

    private void takeMatchMessageRowTarget(MatchMessageRowTarget matchMessageRowTarget, C9868e c9868e) {
        this.sMapTargetPresenter.put(matchMessageRowTarget, new WeakReference(c9868e));
        C9869j.m40610a(c9868e, matchMessageRowTarget);
    }

    private void dropMatchMessageRowTarget(MatchMessageRowTarget matchMessageRowTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(matchMessageRowTarget);
        if (weakReference != null) {
            C9868e c9868e = (C9868e) weakReference.get();
            if (c9868e != null) {
                C9869j.m40609a(c9868e);
            }
        }
        this.sMapTargetPresenter.remove(matchMessageRowTarget);
    }

    private void takeFeedCommentTarget(FeedCommentTarget feedCommentTarget, C9464a c9464a) {
        this.sMapTargetPresenter.put(feedCommentTarget, new WeakReference(c9464a));
        C9466c.m39580a(c9464a, feedCommentTarget);
    }

    private void dropFeedCommentTarget(FeedCommentTarget feedCommentTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(feedCommentTarget);
        if (weakReference != null) {
            C9464a c9464a = (C9464a) weakReference.get();
            if (c9464a != null) {
                C9466c.m39579a(c9464a);
            }
        }
        this.sMapTargetPresenter.remove(feedCommentTarget);
    }

    private void takePlacesDisabledTarget(PlacesDisabledTarget placesDisabledTarget, C10217a c10217a) {
        this.sMapTargetPresenter.put(placesDisabledTarget, new WeakReference(c10217a));
        C10219c.m41545a(c10217a, placesDisabledTarget);
    }

    private void dropPlacesDisabledTarget(PlacesDisabledTarget placesDisabledTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesDisabledTarget);
        if (weakReference != null) {
            C10217a c10217a = (C10217a) weakReference.get();
            if (c10217a != null) {
                C10219c.m41544a(c10217a);
            }
        }
        this.sMapTargetPresenter.remove(placesDisabledTarget);
    }

    private void takeBitmojiAuthTarget(BitmojiAuthTarget bitmojiAuthTarget, C14426e c14426e) {
        this.sMapTargetPresenter.put(bitmojiAuthTarget, new WeakReference(c14426e));
        C14428g.a(c14426e, bitmojiAuthTarget);
    }

    private void dropBitmojiAuthTarget(BitmojiAuthTarget bitmojiAuthTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(bitmojiAuthTarget);
        if (weakReference != null) {
            C14426e c14426e = (C14426e) weakReference.get();
            if (c14426e != null) {
                C14428g.a(c14426e);
            }
        }
        this.sMapTargetPresenter.remove(bitmojiAuthTarget);
    }

    private void takePlaceCardFrontTarget(PlaceCardFrontTarget placeCardFrontTarget, C10129c c10129c) {
        this.sMapTargetPresenter.put(placeCardFrontTarget, new WeakReference(c10129c));
        C10131e.m41433a(c10129c, placeCardFrontTarget);
    }

    private void dropPlaceCardFrontTarget(PlaceCardFrontTarget placeCardFrontTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placeCardFrontTarget);
        if (weakReference != null) {
            C10129c c10129c = (C10129c) weakReference.get();
            if (c10129c != null) {
                C10131e.m41432a(c10129c);
            }
        }
        this.sMapTargetPresenter.remove(placeCardFrontTarget);
    }

    private void takeUserRecProfileTarget(UserRecProfileTarget userRecProfileTarget, bp bpVar) {
        this.sMapTargetPresenter.put(userRecProfileTarget, new WeakReference(bpVar));
        bu.a(bpVar, userRecProfileTarget);
    }

    private void dropUserRecProfileTarget(UserRecProfileTarget userRecProfileTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(userRecProfileTarget);
        if (weakReference != null) {
            bp bpVar = (bp) weakReference.get();
            if (bpVar != null) {
                bu.a(bpVar);
            }
        }
        this.sMapTargetPresenter.remove(userRecProfileTarget);
    }

    private void takePlacesOnboardingTarget(PlacesOnboardingTarget placesOnboardingTarget, C10267c c10267c) {
        this.sMapTargetPresenter.put(placesOnboardingTarget, new WeakReference(c10267c));
        C10268d.m41654a(c10267c, placesOnboardingTarget);
    }

    private void dropPlacesOnboardingTarget(PlacesOnboardingTarget placesOnboardingTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesOnboardingTarget);
        if (weakReference != null) {
            C10267c c10267c = (C10267c) weakReference.get();
            if (c10267c != null) {
                C10268d.m41653a(c10267c);
            }
        }
        this.sMapTargetPresenter.remove(placesOnboardingTarget);
    }

    private void takeSettingsPurchaseTarget(SettingsPurchaseTarget settingsPurchaseTarget, com.tinder.settings.presenter.bf bfVar) {
        this.sMapTargetPresenter.put(settingsPurchaseTarget, new WeakReference(bfVar));
        bg.a(bfVar, settingsPurchaseTarget);
    }

    private void dropSettingsPurchaseTarget(SettingsPurchaseTarget settingsPurchaseTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(settingsPurchaseTarget);
        if (weakReference != null) {
            com.tinder.settings.presenter.bf bfVar = (com.tinder.settings.presenter.bf) weakReference.get();
            if (bfVar != null) {
                bg.a(bfVar);
            }
        }
        this.sMapTargetPresenter.remove(settingsPurchaseTarget);
    }

    private void takeRecsStatusTarget(RecsStatusTarget recsStatusTarget, RecsStatusPresenter recsStatusPresenter) {
        this.sMapTargetPresenter.put(recsStatusTarget, new WeakReference(recsStatusPresenter));
        RecsStatusPresenter_Holder.takeAll(recsStatusPresenter, recsStatusTarget);
    }

    private void dropRecsStatusTarget(RecsStatusTarget recsStatusTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(recsStatusTarget);
        if (weakReference != null) {
            RecsStatusPresenter recsStatusPresenter = (RecsStatusPresenter) weakReference.get();
            if (recsStatusPresenter != null) {
                RecsStatusPresenter_Holder.dropAll(recsStatusPresenter);
            }
        }
        this.sMapTargetPresenter.remove(recsStatusTarget);
    }

    private void takeProfileTarget(ProfileTarget profileTarget, ak akVar) {
        this.sMapTargetPresenter.put(profileTarget, new WeakReference(akVar));
        aw.a(akVar, profileTarget);
    }

    private void dropProfileTarget(ProfileTarget profileTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(profileTarget);
        if (weakReference != null) {
            ak akVar = (ak) weakReference.get();
            if (akVar != null) {
                aw.a(akVar);
            }
        }
        this.sMapTargetPresenter.remove(profileTarget);
    }

    private void takeTinderGoldPaywallTarget(TinderGoldPaywallTarget tinderGoldPaywallTarget, C9399q c9399q) {
        this.sMapTargetPresenter.put(tinderGoldPaywallTarget, new WeakReference(c9399q));
        C9400r.m39346a(c9399q, tinderGoldPaywallTarget);
    }

    private void dropTinderGoldPaywallTarget(TinderGoldPaywallTarget tinderGoldPaywallTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(tinderGoldPaywallTarget);
        if (weakReference != null) {
            C9399q c9399q = (C9399q) weakReference.get();
            if (c9399q != null) {
                C9400r.m39345a(c9399q);
            }
        }
        this.sMapTargetPresenter.remove(tinderGoldPaywallTarget);
    }

    private void takeTopPicksPaywallViewTarget(TopPicksPaywallViewTarget topPicksPaywallViewTarget, C17090j c17090j) {
        this.sMapTargetPresenter.put(topPicksPaywallViewTarget, new WeakReference(c17090j));
        C15291l.a(c17090j, topPicksPaywallViewTarget);
    }

    private void dropTopPicksPaywallViewTarget(TopPicksPaywallViewTarget topPicksPaywallViewTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(topPicksPaywallViewTarget);
        if (weakReference != null) {
            C17090j c17090j = (C17090j) weakReference.get();
            if (c17090j != null) {
                C15291l.a(c17090j);
            }
        }
        this.sMapTargetPresenter.remove(topPicksPaywallViewTarget);
    }

    private void takeFastMatchPreviewTarget(FastMatchPreviewTarget fastMatchPreviewTarget, C9385a c9385a) {
        this.sMapTargetPresenter.put(fastMatchPreviewTarget, new WeakReference(c9385a));
        C9386b.m39298a(c9385a, fastMatchPreviewTarget);
    }

    private void dropFastMatchPreviewTarget(FastMatchPreviewTarget fastMatchPreviewTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(fastMatchPreviewTarget);
        if (weakReference != null) {
            C9385a c9385a = (C9385a) weakReference.get();
            if (c9385a != null) {
                C9386b.m39297a(c9385a);
            }
        }
        this.sMapTargetPresenter.remove(fastMatchPreviewTarget);
    }

    private void takeFeedMainTarget(FeedMainTarget feedMainTarget, C9468e c9468e) {
        this.sMapTargetPresenter.put(feedMainTarget, new WeakReference(c9468e));
        C9470g.m39623a(c9468e, feedMainTarget);
    }

    private void dropFeedMainTarget(FeedMainTarget feedMainTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(feedMainTarget);
        if (weakReference != null) {
            C9468e c9468e = (C9468e) weakReference.get();
            if (c9468e != null) {
                C9470g.m39622a(c9468e);
            }
        }
        this.sMapTargetPresenter.remove(feedMainTarget);
    }

    private void takeControllaTarget(ControllaTarget controllaTarget, C14474d c14474d) {
        this.sMapTargetPresenter.put(controllaTarget, new WeakReference(c14474d));
        C14475w.a(c14474d, controllaTarget);
    }

    private void dropControllaTarget(ControllaTarget controllaTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(controllaTarget);
        if (weakReference != null) {
            C14474d c14474d = (C14474d) weakReference.get();
            if (c14474d != null) {
                C14475w.a(c14474d);
            }
        }
        this.sMapTargetPresenter.remove(controllaTarget);
    }

    private void takeMatchesPageMessagesTabIndicatorTarget(MatchesPageMessagesTabIndicatorTarget matchesPageMessagesTabIndicatorTarget, C9471h c9471h) {
        this.sMapTargetPresenter.put(matchesPageMessagesTabIndicatorTarget, new WeakReference(c9471h));
        C9472i.m39630a(c9471h, matchesPageMessagesTabIndicatorTarget);
    }

    private void dropMatchesPageMessagesTabIndicatorTarget(MatchesPageMessagesTabIndicatorTarget matchesPageMessagesTabIndicatorTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(matchesPageMessagesTabIndicatorTarget);
        if (weakReference != null) {
            C9471h c9471h = (C9471h) weakReference.get();
            if (c9471h != null) {
                C9472i.m39629a(c9471h);
            }
        }
        this.sMapTargetPresenter.remove(matchesPageMessagesTabIndicatorTarget);
    }

    private void takePlacesCarouselLoadingContainerTarget(PlacesCarouselLoadingContainerTarget placesCarouselLoadingContainerTarget, PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter) {
        this.sMapTargetPresenter.put(placesCarouselLoadingContainerTarget, new WeakReference(placesCarouselLoadingContainerPresenter));
        C10193b.m41492a(placesCarouselLoadingContainerPresenter, placesCarouselLoadingContainerTarget);
    }

    private void dropPlacesCarouselLoadingContainerTarget(PlacesCarouselLoadingContainerTarget placesCarouselLoadingContainerTarget) {
        WeakReference weakReference = (WeakReference) this.sMapTargetPresenter.get(placesCarouselLoadingContainerTarget);
        if (weakReference != null) {
            PlacesCarouselLoadingContainerPresenter placesCarouselLoadingContainerPresenter = (PlacesCarouselLoadingContainerPresenter) weakReference.get();
            if (placesCarouselLoadingContainerPresenter != null) {
                C10193b.m41491a(placesCarouselLoadingContainerPresenter);
            }
        }
        this.sMapTargetPresenter.remove(placesCarouselLoadingContainerTarget);
    }
}
