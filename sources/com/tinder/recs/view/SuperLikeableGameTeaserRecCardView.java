package com.tinder.recs.view;

import android.content.Context;
import android.support.v4.content.C0432b;
import android.view.View;
import com.tinder.R;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.recs.card.SuperLikeableGameTeaserRecCard;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.superlikeable.lottie.SuperLikeableLogoLottieView;
import com.tinder.superlikeable.p422b.C15138d;
import com.tinder.superlikeable.provider.SuperLikeableViewStateNotifier;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.C15148a;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.C15149b;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier.State;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004+,-.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020 H\u0014J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020 H\u0014J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0002H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView;", "Lcom/tinder/recs/view/RecCardView;", "Lcom/tinder/recs/card/SuperLikeableGameTeaserRecCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "backgroundColor", "", "onCardPairStateChangeListener", "Lcom/tinder/cardstack/view/CardStackLayout$OnCardPairStateChangeListener;", "superLikeableLogoView", "Lcom/tinder/superlikeable/lottie/SuperLikeableLogoLottieView;", "superLikeableViewStateNotifier", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateNotifier;", "getSuperLikeableViewStateNotifier", "()Lcom/tinder/superlikeable/provider/SuperLikeableViewStateNotifier;", "setSuperLikeableViewStateNotifier", "(Lcom/tinder/superlikeable/provider/SuperLikeableViewStateNotifier;)V", "supportsStamps", "", "getSupportsStamps", "()Z", "viewStateController", "Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$ViewStateController;", "createViewProperty", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$ViewProperty;", "stateAndNotifier", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$State;", "getParams", "Lcom/tinder/superlikeable/provider/SuperLikeableViewStateProviderAndNotifier$Params;", "hasOverlappingRendering", "notifyReadyForAnimation", "", "onAttachedToCardCollectionLayout", "cardCollectionLayout", "Lcom/tinder/cardstack/view/CardCollectionLayout;", "onAttachedToWindow", "onCardViewRecycled", "onDetachedFromCardCollectionLayout", "onDetachedFromWindow", "onMovedToTop", "recCard", "onRemovedFromTop", "OnCardPairStateChangeListener", "PairState", "ViewStateController", "ViewStateModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGameTeaserRecCardView extends RecCardView<SuperLikeableGameTeaserRecCard> {
    private HashMap _$_findViewCache;
    private final int backgroundColor;
    private com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener onCardPairStateChangeListener;
    private final SuperLikeableLogoLottieView superLikeableLogoView;
    @Inject
    @NotNull
    public SuperLikeableViewStateNotifier superLikeableViewStateNotifier;
    private final boolean supportsStamps;
    private ViewStateController viewStateController = new ViewStateController(new SuperLikeableGameTeaserRecCardView$viewStateController$1(this), null, 2, null);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$PairState;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "PAIR_CREATED_WITH_CARD_ABOVE", "PAIR_DESTROYED_WITH_CARD_ABOVE", "PAIR_NOT_CREATED_IS_TOP_CARD", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum PairState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004R\u0018\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$ViewStateController;", "", "onViewReadyForAnimation", "Lkotlin/Function0;", "", "Lcom/tinder/recs/view/OnViewReadyForAnimationListener;", "viewStateModel", "Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$ViewStateModel;", "(Lkotlin/jvm/functions/Function0;Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$ViewStateModel;)V", "checkAndNotifyIfReadyForAnimation", "onLottieResourceLoaded", "onPairWithAboveCardCreated", "onPairWithAboveCardDestroyed", "onRemovedFromTop", "onViewMovedToTop", "onViewRecycled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class ViewStateController {
        private final Function0<C15813i> onViewReadyForAnimation;
        private final ViewStateModel viewStateModel;

        public ViewStateController(@NotNull Function0<C15813i> function0, @NotNull ViewStateModel viewStateModel) {
            C2668g.b(function0, "onViewReadyForAnimation");
            C2668g.b(viewStateModel, "viewStateModel");
            this.onViewReadyForAnimation = function0;
            this.viewStateModel = viewStateModel;
        }

        public /* synthetic */ ViewStateController(Function0 function0, ViewStateModel viewStateModel, int i, C15823e c15823e) {
            if ((i & 2) != 0) {
                viewStateModel = new ViewStateModel();
            }
            this(function0, viewStateModel);
        }

        public final void onViewMovedToTop() {
            this.viewStateModel.setCardMovedToTop(true);
            if (this.viewStateModel.getPairState() == PairState.UNKNOWN) {
                this.viewStateModel.setPairState(PairState.PAIR_NOT_CREATED_IS_TOP_CARD);
            }
            checkAndNotifyIfReadyForAnimation();
        }

        public final void onRemovedFromTop() {
            this.viewStateModel.setCardMovedToTop(false);
        }

        public final void onPairWithAboveCardCreated() {
            this.viewStateModel.setPairState(PairState.PAIR_CREATED_WITH_CARD_ABOVE);
        }

        public final void onPairWithAboveCardDestroyed() {
            if ((this.viewStateModel.getPairState() == PairState.PAIR_CREATED_WITH_CARD_ABOVE ? 1 : null) == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnPairCreated, expected state was ");
                stringBuilder.append(PairState.PAIR_CREATED_WITH_CARD_ABOVE);
                stringBuilder.append(' ');
                stringBuilder.append("but is ");
                stringBuilder.append(this.viewStateModel.getPairState());
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            this.viewStateModel.setPairState(PairState.PAIR_DESTROYED_WITH_CARD_ABOVE);
            checkAndNotifyIfReadyForAnimation();
        }

        public final void onLottieResourceLoaded() {
            this.viewStateModel.setLottieResourceLoaded(true);
            checkAndNotifyIfReadyForAnimation();
        }

        public final void onViewRecycled() {
            this.viewStateModel.setLottieResourceLoaded(false);
            this.viewStateModel.setCardMovedToTop(false);
            this.viewStateModel.setPairState(PairState.UNKNOWN);
        }

        private final void checkAndNotifyIfReadyForAnimation() {
            if (this.viewStateModel.isReadyForAnimation()) {
                this.onViewReadyForAnimation.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$ViewStateModel;", "", "()V", "isCardMovedToTop", "", "()Z", "setCardMovedToTop", "(Z)V", "isLottieResourceLoaded", "setLottieResourceLoaded", "pairState", "Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$PairState;", "getPairState", "()Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$PairState;", "setPairState", "(Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$PairState;)V", "isReadyForAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class ViewStateModel {
        private boolean isCardMovedToTop;
        private boolean isLottieResourceLoaded;
        @NotNull
        private PairState pairState = PairState.UNKNOWN;

        public final boolean isCardMovedToTop() {
            return this.isCardMovedToTop;
        }

        public final void setCardMovedToTop(boolean z) {
            this.isCardMovedToTop = z;
        }

        public final boolean isLottieResourceLoaded() {
            return this.isLottieResourceLoaded;
        }

        public final void setLottieResourceLoaded(boolean z) {
            this.isLottieResourceLoaded = z;
        }

        @NotNull
        public final PairState getPairState() {
            return this.pairState;
        }

        public final void setPairState(@NotNull PairState pairState) {
            C2668g.b(pairState, "<set-?>");
            this.pairState = pairState;
        }

        public final boolean isReadyForAnimation() {
            return this.isLottieResourceLoaded && this.isCardMovedToTop && (this.pairState == PairState.PAIR_DESTROYED_WITH_CARD_ABOVE || this.pairState == PairState.PAIR_NOT_CREATED_IS_TOP_CARD);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView$OnCardPairStateChangeListener;", "Lcom/tinder/cardstack/view/CardStackLayout$OnCardPairStateChangeListener;", "(Lcom/tinder/recs/view/SuperLikeableGameTeaserRecCardView;)V", "cardAbove", "Landroid/view/View;", "onPairCreated", "", "higherCard", "lowerCard", "onPairDestroyed", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private final class OnCardPairStateChangeListener implements com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener {
        private View cardAbove;

        public void onPairCreated(@Nullable View view, @Nullable View view2) {
            if (C2668g.a(view2, SuperLikeableGameTeaserRecCardView.this) != null) {
                this.cardAbove = view;
                SuperLikeableGameTeaserRecCardView.this.viewStateController.onPairWithAboveCardCreated();
            }
        }

        public void onPairDestroyed(@Nullable View view, @Nullable View view2) {
            if (this.cardAbove != null && C2668g.a(view, this.cardAbove) != null && C2668g.a(view2, SuperLikeableGameTeaserRecCardView.this) != null) {
                this.cardAbove = null;
                SuperLikeableGameTeaserRecCardView.this.viewStateController.onPairWithAboveCardDestroyed();
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), view);
        return view;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public SuperLikeableGameTeaserRecCardView(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, null, 2, null);
        this.backgroundColor = C0432b.c(context, R.color.superlikeable_view_container_background_color);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
        View.inflate(context, R.layout.recs_card_superlikeable_game_teaser_rec, this);
        setCardBackgroundColor(this.backgroundColor);
        context = findViewById(R.id.view_rec_superlikeable_game_logo);
        C2668g.a(context, "findViewById<SuperLikeab…_superlikeable_game_logo)");
        this.superLikeableLogoView = (SuperLikeableLogoLottieView) context;
        this.superLikeableLogoView.m67437i();
    }

    public boolean getSupportsStamps() {
        return this.supportsStamps;
    }

    @NotNull
    public final SuperLikeableViewStateNotifier getSuperLikeableViewStateNotifier() {
        SuperLikeableViewStateNotifier superLikeableViewStateNotifier = this.superLikeableViewStateNotifier;
        if (superLikeableViewStateNotifier == null) {
            C2668g.b("superLikeableViewStateNotifier");
        }
        return superLikeableViewStateNotifier;
    }

    public final void setSuperLikeableViewStateNotifier(@NotNull SuperLikeableViewStateNotifier superLikeableViewStateNotifier) {
        C2668g.b(superLikeableViewStateNotifier, "<set-?>");
        this.superLikeableViewStateNotifier = superLikeableViewStateNotifier;
    }

    public void onCardViewRecycled() {
        this.viewStateController.onViewRecycled();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.superLikeableLogoView.m67438j()) {
            this.viewStateController.onLottieResourceLoaded();
        } else {
            this.superLikeableLogoView.setOnViewReadyListener(new SuperLikeableGameTeaserRecCardView$onAttachedToWindow$1(this.viewStateController));
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.superLikeableLogoView.setOnViewReadyListener(SuperLikeableGameTeaserRecCardView$onDetachedFromWindow$1.INSTANCE);
    }

    public void onMovedToTop(@NotNull SuperLikeableGameTeaserRecCard superLikeableGameTeaserRecCard) {
        C2668g.b(superLikeableGameTeaserRecCard, "recCard");
        this.viewStateController.onViewMovedToTop();
        superLikeableGameTeaserRecCard = this.superLikeableViewStateNotifier;
        if (superLikeableGameTeaserRecCard == null) {
            C2668g.b("superLikeableViewStateNotifier");
        }
        superLikeableGameTeaserRecCard.notifyViewState(createViewProperty(State.MOVED_TO_TOP));
    }

    public void onRemovedFromTop(@NotNull SuperLikeableGameTeaserRecCard superLikeableGameTeaserRecCard) {
        C2668g.b(superLikeableGameTeaserRecCard, "recCard");
        this.viewStateController.onRemovedFromTop();
        superLikeableGameTeaserRecCard = this.superLikeableViewStateNotifier;
        if (superLikeableGameTeaserRecCard == null) {
            C2668g.b("superLikeableViewStateNotifier");
        }
        superLikeableGameTeaserRecCard.notifyViewState(createViewProperty(State.REMOVED_FROM_TOP));
    }

    public void onAttachedToCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "cardCollectionLayout");
        if ((cardCollectionLayout instanceof CardStackLayout) && this.onCardPairStateChangeListener == null) {
            com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener onCardPairStateChangeListener = new OnCardPairStateChangeListener();
            this.onCardPairStateChangeListener = onCardPairStateChangeListener;
            ((CardStackLayout) cardCollectionLayout).a(onCardPairStateChangeListener);
        }
    }

    public void onDetachedFromCardCollectionLayout(@NotNull CardCollectionLayout cardCollectionLayout) {
        C2668g.b(cardCollectionLayout, "cardCollectionLayout");
        if (cardCollectionLayout instanceof CardStackLayout) {
            com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener onCardPairStateChangeListener = this.onCardPairStateChangeListener;
            if (onCardPairStateChangeListener != null) {
                ((CardStackLayout) cardCollectionLayout).b(onCardPairStateChangeListener);
            }
            this.onCardPairStateChangeListener = (com.tinder.cardstack.view.CardStackLayout.OnCardPairStateChangeListener) null;
        }
    }

    private final void notifyReadyForAnimation() {
        SuperLikeableViewStateNotifier superLikeableViewStateNotifier = this.superLikeableViewStateNotifier;
        if (superLikeableViewStateNotifier == null) {
            C2668g.b("superLikeableViewStateNotifier");
        }
        superLikeableViewStateNotifier.notifyViewState(createViewProperty(State.LAYOUT_COMPLETE));
    }

    private final C15149b createViewProperty(State state) {
        return new C15149b(state, getParams());
    }

    private final C15148a getParams() {
        return new C15148a(getRadius(), this.backgroundColor, C15138d.m56965a((View) this), C15138d.m56965a((View) this.superLikeableLogoView), null, this.superLikeableLogoView.m67439k(), false, 80, null);
    }
}
