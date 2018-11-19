package com.tinder.recs.target;

import android.net.Uri;
import com.tinder.boost.provider.BoostUpdateProvider$a;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.domain.common.model.CommonConnection;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.fireboarding.domain.Level;
import com.tinder.fireboarding.view.reccard.FireboardingRecCardView.C9619b;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.C15148a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&JH\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\u001c\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00052\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H&J\"\u0010$\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00052\u0010\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\u0012H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000fH&J\b\u0010+\u001a\u00020\u0003H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\tH&J\b\u00101\u001a\u00020\u0003H&J\u001a\u00102\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000104H&J\u001a\u00105\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000104H&J\b\u00106\u001a\u00020\u0003H&J\u0014\u00107\u001a\u00020\u00032\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H&J\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H&J\u0010\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u0005H&J\u0014\u0010=\u001a\u00020\u00032\n\u0010>\u001a\u00060?R\u00020@H&J\b\u0010A\u001a\u00020\u0003H&J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020DH&J\b\u0010E\u001a\u00020\u0003H&J\b\u0010F\u001a\u00020\u0003H&J\b\u0010G\u001a\u00020\u0003H&J\b\u0010H\u001a\u00020\u0003H&J\b\u0010I\u001a\u00020\u0003H&J\b\u0010J\u001a\u00020\u0003H&J\u0010\u0010K\u001a\u00020\u00032\u0006\u0010L\u001a\u00020MH&J\u0010\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u00020PH&J\b\u0010Q\u001a\u00020\u0003H&J\b\u0010R\u001a\u00020\u0003H&¨\u0006S"}, d2 = {"Lcom/tinder/recs/target/RecsTarget;", "", "animateSuperlikeButton", "", "superlikesRemaining", "", "clearRecs", "createChooserToShareScreenshottedProfile", "otherId", "", "name", "uri", "Landroid/net/Uri;", "referralUrl", "isSuperlike", "", "isRecTraveling", "commonConnections", "", "Lcom/tinder/domain/common/model/CommonConnection;", "disableSwipes", "disableTouch", "dismissFireboardingViewContainer", "displayBoostSummary", "enableBoostButton", "shouldEnable", "enableSwipes", "enableTouch", "freezeAnimatingCards", "hideCardStackView", "hideHeartsAnimation", "hideSuperLikeableGame", "insertRec", "position", "card", "Lcom/tinder/cardstack/model/Card;", "insertRecs", "cards", "launchPaywall", "paywallFlow", "Lcom/tinder/paywall/paywallflow/PaywallFlow;", "notifyScreenshotCaptured", "photosPermissionEnabled", "onFireboardingRecCardViewMovedToTop", "onFireboardingRecCardViewReadyForAnimation", "recCardViewParams", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$RecCardViewParams;", "openUrl", "url", "refreshTopCard", "removeAdsRec", "removeAnimation", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "removeRec", "revertLastAnimatedCard", "rewindRec", "sendScreenshotInAppNotification", "screenshot", "Lcom/tinder/screenshotty/model/Screenshot;", "setSuperLikeRemainingCount", "superLikeRemainingCount", "showBoostUpdateDialog", "currentBoostTick", "Lcom/tinder/boost/provider/BoostUpdateProvider$BoostTick;", "Lcom/tinder/boost/provider/BoostUpdateProvider;", "showCardStackView", "showFireboardingLevelTutorialTooltip", "level", "Lcom/tinder/fireboarding/domain/Level;", "showGamepadWithBoost", "showHeartsAnimation", "showNudgeAnimation", "showReferredRecLoadError", "showSuperLikeableGame", "showSuperlikeError", "showTutorialSwipeDialog", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "startSuperLikeableEntranceAnimation", "params", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;", "switchToCardStackView", "switchToDiscoveryOffView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface RecsTarget {
    void animateSuperlikeButton(int i);

    void clearRecs();

    void createChooserToShareScreenshottedProfile(@NotNull String str, @NotNull String str2, @Nullable Uri uri, @NotNull String str3, boolean z, boolean z2, @NotNull List<? extends CommonConnection> list);

    void disableSwipes();

    void disableTouch();

    void dismissFireboardingViewContainer();

    void displayBoostSummary();

    void enableBoostButton(boolean z);

    void enableSwipes();

    void enableTouch();

    void freezeAnimatingCards();

    void hideCardStackView();

    void hideHeartsAnimation();

    void hideSuperLikeableGame();

    void insertRec(int i, @NotNull C8395a<?> c8395a);

    void insertRecs(int i, @NotNull List<? extends C8395a<?>> list);

    void launchPaywall(@NotNull C10076o c10076o);

    void notifyScreenshotCaptured(boolean z);

    void onFireboardingRecCardViewMovedToTop();

    void onFireboardingRecCardViewReadyForAnimation(@NotNull C9619b c9619b);

    void openUrl(@NotNull String str);

    void refreshTopCard();

    void removeAdsRec(int i, @Nullable C8361a c8361a);

    void removeRec(int i, @Nullable C8361a c8361a);

    void revertLastAnimatedCard();

    void rewindRec(@NotNull C8395a<?> c8395a);

    void sendScreenshotInAppNotification(@NotNull C14826a c14826a);

    void setSuperLikeRemainingCount(int i);

    void showBoostUpdateDialog(@NotNull BoostUpdateProvider$a boostUpdateProvider$a);

    void showCardStackView();

    void showFireboardingLevelTutorialTooltip(@NotNull Level level);

    void showGamepadWithBoost();

    void showHeartsAnimation();

    void showNudgeAnimation();

    void showReferredRecLoadError();

    void showSuperLikeableGame();

    void showSuperlikeError();

    void showTutorialSwipeDialog(@NotNull Swipe swipe);

    void startSuperLikeableEntranceAnimation(@NotNull C15148a c15148a);

    void switchToCardStackView();

    void switchToDiscoveryOffView();
}
