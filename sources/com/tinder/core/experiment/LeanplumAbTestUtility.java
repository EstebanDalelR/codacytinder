package com.tinder.core.experiment;

import com.leanplum.Leanplum;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.tinder.common.p077b.C2641a;
import com.tinder.core.experiment.CanIGetYoEmailExperimentProvider.Variant;
import com.tinder.core.experiment.ProfileV2MigrationExperiment.Experiment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.Observable;
import rx.functions.Action1;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0001eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\fH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\fH\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0)H\u0016J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\bH\u0016J\b\u0010-\u001a\u00020\bH\u0016J\b\u0010.\u001a\u00020\bH\u0016J\b\u0010/\u001a\u00020\bH\u0016J\b\u00100\u001a\u00020\bH\u0016J\b\u00101\u001a\u00020\bH\u0016J\b\u00102\u001a\u00020\bH\u0016J\b\u00103\u001a\u00020\bH\u0016J\b\u00104\u001a\u00020\bH\u0016J\b\u00105\u001a\u00020\bH\u0016J\b\u00106\u001a\u00020\bH\u0016J\b\u00107\u001a\u00020\bH\u0016J\b\u00108\u001a\u00020\bH\u0016J\b\u00109\u001a\u00020\bH\u0016J\b\u0010:\u001a\u00020\bH\u0016J\b\u0010;\u001a\u00020\bH\u0016J\b\u0010<\u001a\u00020\bH\u0016J\b\u0010=\u001a\u00020\bH\u0016J\b\u0010>\u001a\u00020\bH\u0016J\b\u0010?\u001a\u00020\bH\u0016J\b\u0010@\u001a\u00020\bH\u0016J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\bH\u0016J\b\u0010C\u001a\u00020\bH\u0016J\b\u0010D\u001a\u00020\bH\u0016J\b\u0010E\u001a\u00020\bH\u0016J\b\u0010F\u001a\u00020\bH\u0016J\b\u0010G\u001a\u00020\bH\u0016J\b\u0010H\u001a\u00020\bH\u0016J\b\u0010I\u001a\u00020\bH\u0016J\b\u0010J\u001a\u00020\bH\u0016J\b\u0010K\u001a\u00020\bH\u0016J\b\u0010L\u001a\u00020\bH\u0016J\b\u0010M\u001a\u00020\bH\u0016J\b\u0010N\u001a\u00020\bH\u0016J\b\u0010O\u001a\u00020\bH\u0016J\b\u0010P\u001a\u00020\bH\u0016J\b\u0010Q\u001a\u00020\bH\u0016J\b\u0010R\u001a\u00020\bH\u0016J\b\u0010S\u001a\u00020\bH\u0016J\b\u0010T\u001a\u00020\bH\u0016J\b\u0010U\u001a\u00020\bH\u0016J\b\u0010V\u001a\u00020\bH\u0016J\b\u0010W\u001a\u00020\bH\u0016J\b\u0010X\u001a\u00020\bH\u0016J\b\u0010Y\u001a\u00020\bH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020\bH\u0016J\b\u0010]\u001a\u00020\bH\u0016J\u0010\u0010^\u001a\u00020\b2\u0006\u0010_\u001a\u00020`H\u0016J\b\u0010a\u001a\u00020\bH\u0016J\b\u0010b\u001a\u00020\bH\u0016J\b\u0010c\u001a\u00020\bH\u0016J\b\u0010d\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/tinder/core/experiment/LeanplumAbTestUtility;", "Lcom/tinder/core/experiment/AbTestUtility;", "variables", "Lcom/tinder/core/experiment/AbTestVariables;", "(Lcom/tinder/core/experiment/AbTestVariables;)V", "profileV2MigrationExperiment", "Lcom/tinder/core/experiment/ProfileV2MigrationExperiment;", "activityFeedEnabled", "", "activityFeedSettingEnabled", "activityMessagesEnabled", "appRatingSendWaitPeriodInDays", "", "appRatingShowWaitPeriodInDays", "appRatingV2", "authExperiment", "Lcom/tinder/core/experiment/AuthExperiment;", "Lcom/tinder/core/experiment/CanIGetYoEmailExperimentProvider$Variant;", "autoPlayControlsEnabled", "fanPlacementId", "", "fanVideoPlacementId", "feedTopLevelNavEnabled", "forceContentUpdate", "Lrx/Observable;", "Ljava/lang/Void;", "getAccountDeleteVariant", "Lcom/tinder/core/experiment/AccountDeleteVariant;", "getAdMessageRequestCadenceMs", "", "getAdsCadence", "getCustomGenderOptions", "getFeedTooltipDaysInactive", "getGifProvider", "getMinimumMessageAdInterstice", "getSecondaryAdCadence", "getTopPicksNotificationOffset", "getTopPicksTooltipSwipeThreshold", "getUserEndpoint", "Lcom/tinder/core/experiment/LeanplumAbTestUtility$UserEndPoint;", "getVariantIds", "", "grandGestureExperiment", "Lcom/tinder/core/experiment/GrandGestureExperiment;", "isAddyV2Enabled", "isBitmojiEnabled", "isControllaEnabled", "isDfpBrandedProfileRecEnabled", "isDiscountingEnabled", "isEdgelessCardsEnabled", "isEmailSettingsEnabled", "isFanVideoAdEnabled", "isFastMatchPollingEnabled", "isFeedProfileChangeBioEnabled", "isFeedProfileChangeSchoolEnabled", "isFeedProfileChangeWorkEnabled", "isFeedTooltipEnabled", "isGamepadCounterEnabled", "isGoldMerchandisingEnabled", "isGrandGesturesEnabled", "isIntroPricingEnabled", "isLoopsCreationEnabled", "isLoopsDisplayEnabled", "isLoopsPhase1Enabled", "isMoreGenderEnabled", "isNewInAppNotificationEnabled", "isNewPhotoGridEnabled", "isOnboardingEmailRequired", "isPerformanceInstrumentationEnabled", "isPersistentConnectionEnabled", "isPhotoPreviewEnabled", "isPlacesShortOnboardingEnabled", "isPlacesWhackAMoleEnabled", "isRecsFanAdsEnabled", "isRecsNativeDisplayDfpAdsEnabled", "isRecsNativeVideoDfpAdsEnabled", "isScreenshotNotificationEnabled", "isSettingsOnRecsEnabled", "isShimmerEnabled", "isSmsAuthV2Enabled", "isSponsoredMessageEnabled", "isSpotifyEnabled", "isSuperLikeableEnabled", "isSwipeOpenForAdsEnabled", "isTinderUEnabled", "isTopPicksEnabled", "loopsEnabled", "loopsFeedEnabled", "loopsMessagesEnabled", "loopsRecsEnabled", "newNewExperiment", "Lcom/tinder/core/experiment/NewNewExperiment;", "pilgrimPlacesDebuggingEnabled", "profileV2EnabledForRevenue", "profileV2MigrationEnabled", "experiment", "Lcom/tinder/core/experiment/ProfileV2MigrationExperiment$Experiment;", "shouldShowAdsForTinderPlusUsers", "tinderHouseAdsEnabled", "typingIndicatorEnabled", "typingIndicatorMorphAnimationEnabled", "UserEndPoint", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class LeanplumAbTestUtility implements AbTestUtility {
    /* renamed from: a */
    private final ProfileV2MigrationExperiment f35062a = new ProfileV2MigrationExperiment(ae.a(new Pair[]{C15811g.a(Experiment.GENDER, Boolean.valueOf(false)), C15811g.a(Experiment.SPOTIFY, Boolean.valueOf(false)), C15811g.a(Experiment.INSTAGRAM, Boolean.valueOf(false)), C15811g.a(Experiment.DISCOVERY, Boolean.valueOf(false)), C15811g.a(Experiment.PHOTOS, Boolean.valueOf(false))}));
    /* renamed from: b */
    private final C8592c f35063b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/core/experiment/LeanplumAbTestUtility$UserEndPoint;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "META", "PROFILE_V2", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum UserEndPoint {
        ;
        
        private final int value;

        protected UserEndPoint(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lrx/Emitter;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.core.experiment.LeanplumAbTestUtility$a */
    static final class C13779a<T> implements Action1<Emitter<T>> {
        /* renamed from: a */
        public static final C13779a f43772a = new C13779a();

        C13779a() {
        }

        public /* synthetic */ void call(Object obj) {
            m53351a((Emitter) obj);
        }

        /* renamed from: a */
        public final void m53351a(final Emitter<Void> emitter) {
            Leanplum.forceContentUpdate(new VariablesChangedCallback() {
                public void variablesChanged() {
                    emitter.onNext(null);
                    emitter.onCompleted();
                }
            });
        }
    }

    @Nullable
    public AuthExperiment<Variant> authExperiment() {
        return null;
    }

    @NotNull
    public String fanVideoPlacementId() {
        return "VID_HD_16_9_15S_LINK#464891386855067_1457035454307317";
    }

    public boolean isEdgelessCardsEnabled() {
        return false;
    }

    public boolean isIntroPricingEnabled() {
        return false;
    }

    public boolean isOnboardingEmailRequired() {
        return false;
    }

    public boolean isSmsAuthV2Enabled() {
        return false;
    }

    public boolean pilgrimPlacesDebuggingEnabled() {
        return false;
    }

    public boolean profileV2EnabledForRevenue() {
        return true;
    }

    public boolean shouldShowAdsForTinderPlusUsers() {
        return false;
    }

    @Inject
    public LeanplumAbTestUtility(@NotNull C8592c c8592c) {
        C2668g.b(c8592c, "variables");
        this.f35063b = c8592c;
    }

    public boolean isPhotoPreviewEnabled() {
        return this.f35063b.m36660c();
    }

    public boolean isSpotifyEnabled() {
        return this.f35063b.m36659b();
    }

    @NotNull
    public C8596l newNewExperiment() {
        return new C8596l(this.f35063b.m36677t(), this.f35063b.m36676s(), this.f35063b.m36678u(), this.f35063b.m36679v(), false);
    }

    public boolean isMoreGenderEnabled() {
        return this.f35063b.m36661d();
    }

    public boolean isDiscountingEnabled() {
        return this.f35063b.m36663f();
    }

    public boolean isGrandGesturesEnabled() {
        return this.f35063b.m36664g();
    }

    @NotNull
    public String getCustomGenderOptions() {
        return this.f35063b.m36662e();
    }

    @NotNull
    public List<Long> getVariantIds() {
        List a = this.f35063b.m36658a();
        if (C2641a.a(a)) {
            return C19301m.a();
        }
        C2668g.a(a, "variants");
        Iterable<Map> iterable = a;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (Map map : iterable) {
            arrayList.add(map.get("id"));
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            if (next instanceof Long) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }

    @NotNull
    public Observable<Void> forceContentUpdate() {
        Observable<Void> a = Observable.a(C13779a.f43772a, BackpressureMode.BUFFER);
        C2668g.a(a, "Observable.create({ emit….BackpressureMode.BUFFER)");
        return a;
    }

    @NotNull
    public UserEndPoint getUserEndpoint() {
        return UserEndPoint.META;
    }

    public boolean isRecsFanAdsEnabled() {
        return this.f35063b.m36665h();
    }

    public boolean isRecsNativeVideoDfpAdsEnabled() {
        return this.f35063b.m36666i();
    }

    public boolean isPerformanceInstrumentationEnabled() {
        return this.f35063b.m36670m();
    }

    public int getAdsCadence() {
        return this.f35063b.m36668k();
    }

    public boolean isFastMatchPollingEnabled() {
        return this.f35063b.m36669l();
    }

    public boolean isSettingsOnRecsEnabled() {
        return this.f35063b.m36671n();
    }

    @NotNull
    public String fanPlacementId() {
        return this.f35063b.m36672o();
    }

    public boolean isControllaEnabled() {
        return this.f35063b.m36673p();
    }

    public boolean isTopPicksEnabled() {
        return this.f35063b.m36674q();
    }

    @NotNull
    public String getTopPicksNotificationOffset() {
        return this.f35063b.m36675r();
    }

    public int getTopPicksTooltipSwipeThreshold() {
        return this.f35063b.ah();
    }

    public boolean isSponsoredMessageEnabled() {
        return this.f35063b.m36680w();
    }

    @NotNull
    public AccountDeleteVariant getAccountDeleteVariant() {
        return AccountDeleteVariant.Companion.m36622a(this.f35063b.m36681x());
    }

    public int appRatingShowWaitPeriodInDays() {
        return this.f35063b.m36682y();
    }

    public boolean appRatingV2() {
        return this.f35063b.m36641J();
    }

    @NotNull
    public C8595j grandGestureExperiment() {
        return new C8595j(this.f35063b.m36633B(), this.f35063b.m36634C(), this.f35063b.m36635D(), this.f35063b.m36636E(), this.f35063b.m36637F());
    }

    public int getSecondaryAdCadence() {
        return this.f35063b.m36639H();
    }

    public boolean isSwipeOpenForAdsEnabled() {
        return this.f35063b.m36640I();
    }

    public boolean isPersistentConnectionEnabled() {
        return this.f35063b.m36642K();
    }

    public int appRatingSendWaitPeriodInDays() {
        return this.f35063b.m36683z();
    }

    public boolean isNewInAppNotificationEnabled() {
        return this.f35063b.m36632A();
    }

    public boolean isShimmerEnabled() {
        return this.f35063b.m36638G();
    }

    public boolean isRecsNativeDisplayDfpAdsEnabled() {
        return this.f35063b.m36667j();
    }

    public boolean profileV2MigrationEnabled(@NotNull Experiment experiment) {
        C2668g.b(experiment, "experiment");
        return this.f35062a.m36631a(experiment);
    }

    public boolean activityMessagesEnabled() {
        return this.f35063b.m36643L();
    }

    public boolean activityFeedEnabled() {
        return activityMessagesEnabled() && this.f35063b.m36644M();
    }

    public boolean activityFeedSettingEnabled() {
        return activityFeedEnabled() && this.f35063b.m36645N();
    }

    public boolean feedTopLevelNavEnabled() {
        return this.f35063b.m36646O();
    }

    public boolean isSuperLikeableEnabled() {
        return this.f35063b.m36647P();
    }

    public long getAdMessageRequestCadenceMs() {
        return this.f35063b.m36648Q();
    }

    public boolean isGamepadCounterEnabled() {
        return this.f35063b.m36649R();
    }

    public int getMinimumMessageAdInterstice() {
        return this.f35063b.m36650S();
    }

    public boolean isDfpBrandedProfileRecEnabled() {
        return this.f35063b.m36651T();
    }

    public boolean isGoldMerchandisingEnabled() {
        return this.f35063b.m36652U();
    }

    public boolean isNewPhotoGridEnabled() {
        return this.f35063b.m36653V();
    }

    public boolean isLoopsPhase1Enabled() {
        return this.f35063b.m36654W();
    }

    public boolean isAddyV2Enabled() {
        return this.f35063b.ad();
    }

    public boolean isFanVideoAdEnabled() {
        return this.f35063b.m36655X();
    }

    public boolean loopsEnabled() {
        return this.f35063b.m36656Y();
    }

    public boolean loopsRecsEnabled() {
        return this.f35063b.m36657Z();
    }

    public boolean loopsFeedEnabled() {
        return this.f35063b.aa();
    }

    public boolean loopsMessagesEnabled() {
        return this.f35063b.ab();
    }

    public boolean autoPlayControlsEnabled() {
        return this.f35063b.ac();
    }

    public boolean typingIndicatorEnabled() {
        return this.f35063b.ae();
    }

    public boolean typingIndicatorMorphAnimationEnabled() {
        return this.f35063b.af();
    }

    public boolean isEmailSettingsEnabled() {
        return this.f35063b.ag();
    }

    public boolean tinderHouseAdsEnabled() {
        return this.f35063b.ai();
    }

    public boolean isFeedProfileChangeBioEnabled() {
        return this.f35063b.aj();
    }

    public boolean isFeedProfileChangeWorkEnabled() {
        return this.f35063b.ak();
    }

    public boolean isFeedProfileChangeSchoolEnabled() {
        return this.f35063b.al();
    }

    public boolean isLoopsCreationEnabled() {
        return this.f35063b.am();
    }

    public boolean isLoopsDisplayEnabled() {
        return this.f35063b.an();
    }

    public boolean isBitmojiEnabled() {
        return this.f35063b.as();
    }

    public boolean isScreenshotNotificationEnabled() {
        return this.f35063b.ao();
    }

    public boolean isFeedTooltipEnabled() {
        return this.f35063b.ap();
    }

    public int getFeedTooltipDaysInactive() {
        return this.f35063b.aq();
    }

    public int getGifProvider() {
        return this.f35063b.ar();
    }

    public boolean isPlacesShortOnboardingEnabled() {
        return this.f35063b.at();
    }

    public boolean isPlacesWhackAMoleEnabled() {
        return this.f35063b.au();
    }

    public boolean isTinderUEnabled() {
        return this.f35063b.av();
    }
}
