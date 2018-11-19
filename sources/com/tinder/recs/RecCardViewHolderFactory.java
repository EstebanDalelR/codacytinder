package com.tinder.recs;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.R;
import com.tinder.ads.TinderAdType;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.view.CardViewHolder;
import com.tinder.cardstack.view.CardViewHolder.Factory;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.fireboarding.view.reccard.C11839a;
import com.tinder.fireboarding.view.reccard.FireboardingLevelIconViewFactory;
import com.tinder.fireboarding.view.reccard.FireboardingRecCardView;
import com.tinder.fireboarding.view.reccard.FireboardingRecCardView.OnFireboardingRecCardViewListener;
import com.tinder.module.ViewScope;
import com.tinder.p204d.p205a.C8609a;
import com.tinder.recs.analytics.V1BrandedProfileCardAdAnalyticsListener;
import com.tinder.recs.card.AdRecCard;
import com.tinder.recs.card.SuperLikeableGameTeaserRecCard;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.model.AdRec;
import com.tinder.recs.view.AdRecCardView;
import com.tinder.recs.view.BaseUserRecCardView;
import com.tinder.recs.view.RecsView;
import com.tinder.recs.view.SuperLikeableGameTeaserRecCardView;
import com.tinder.recs.view.TappyUserRecCardView;
import com.tinder.recsads.C16429a;
import com.tinder.recsads.V1BrandedProfileCardRecCardView;
import com.tinder.recsads.V1BrandedProfileCardRecCardView.Listener;
import com.tinder.recsads.p466a.C16428a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@ViewScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0003\u0012\u0015\u0018\b\u0007\u0018\u0000 &2\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0004&'()B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u0014\u0010$\u001a\u00020\u001b2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8CX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tinder/recs/RecCardViewHolderFactory;", "Lcom/tinder/cardstack/view/CardViewHolder$Factory;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "recsView", "Lcom/tinder/recs/view/RecsView;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "v1BrandedProfileCardAdAnalyticsListener", "Lcom/tinder/recs/analytics/V1BrandedProfileCardAdAnalyticsListener;", "adRecCardViewHolderFactory", "Lcom/tinder/recsads/AdRecCardViewHolderFactory;", "fireboardingLevelIconViewFactory", "Lcom/tinder/fireboarding/view/reccard/FireboardingLevelIconViewFactory;", "loopsExperimentUtility", "Lcom/tinder/loop/experiment/LoopsExperimentUtility;", "(Lcom/tinder/recs/view/RecsView;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/recs/analytics/V1BrandedProfileCardAdAnalyticsListener;Lcom/tinder/recsads/AdRecCardViewHolderFactory;Lcom/tinder/fireboarding/view/reccard/FireboardingLevelIconViewFactory;Lcom/tinder/loop/experiment/LoopsExperimentUtility;)V", "bpcV2Listener", "com/tinder/recs/RecCardViewHolderFactory$bpcV2Listener$1", "Lcom/tinder/recs/RecCardViewHolderFactory$bpcV2Listener$1;", "legacyBpcListener", "com/tinder/recs/RecCardViewHolderFactory$legacyBpcListener$1", "Lcom/tinder/recs/RecCardViewHolderFactory$legacyBpcListener$1;", "onFireBoardingRecCardViewListener", "com/tinder/recs/RecCardViewHolderFactory$onFireBoardingRecCardViewListener$1", "Lcom/tinder/recs/RecCardViewHolderFactory$onFireBoardingRecCardViewListener$1;", "tappyLayout", "", "getTappyLayout", "()I", "createMatchParentLayoutParams", "Landroid/support/v7/widget/RecyclerView$LayoutParams;", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getViewType", "card", "Companion", "OnCardAtTopOfCardStackListener", "SimpleCardViewHolder", "TappyOnCardAtTopOfStackListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecCardViewHolderFactory implements Factory<CardViewHolder<C8395a<?>>, C8395a<?>> {
    @Deprecated
    public static final Companion Companion = new Companion();
    private static final int TYPE_AD_BRANDED_PROFILE = 3;
    private static final int TYPE_AD_REC = 1;
    private static final int TYPE_FIREBOARDING = 4;
    private static final int TYPE_SUPER_LIKABLE_GAME_REC = 2;
    private static final int TYPE_USER_REC = 0;
    private final AbTestUtility abTestUtility;
    private final C16429a adRecCardViewHolderFactory;
    private final RecCardViewHolderFactory$bpcV2Listener$1 bpcV2Listener = new RecCardViewHolderFactory$bpcV2Listener$1(this);
    private final FireboardingLevelIconViewFactory fireboardingLevelIconViewFactory;
    private final RecCardViewHolderFactory$legacyBpcListener$1 legacyBpcListener = new RecCardViewHolderFactory$legacyBpcListener$1(this);
    private final C8609a loopsExperimentUtility;
    private final RecCardViewHolderFactory$onFireBoardingRecCardViewListener$1 onFireBoardingRecCardViewListener = new RecCardViewHolderFactory$onFireBoardingRecCardViewListener$1(this);
    private final RecsView recsView;
    private final V1BrandedProfileCardAdAnalyticsListener v1BrandedProfileCardAdAnalyticsListener;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/recs/RecCardViewHolderFactory$Companion;", "", "()V", "TYPE_AD_BRANDED_PROFILE", "", "TYPE_AD_REC", "TYPE_FIREBOARDING", "TYPE_SUPER_LIKABLE_GAME_REC", "TYPE_USER_REC", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private static final class Companion {
        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/tinder/recs/RecCardViewHolderFactory$OnCardAtTopOfCardStackListener;", "Lcom/tinder/recs/view/BaseUserRecCardView$OnCardAtTopOfCardStackListener;", "recsView", "Lcom/tinder/recs/view/RecsView;", "(Lcom/tinder/recs/view/RecsView;)V", "getRecsView", "()Lcom/tinder/recs/view/RecsView;", "onMovedToTop", "", "view", "Lcom/tinder/recs/view/BaseUserRecCardView;", "onRemovedFromTop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private static class OnCardAtTopOfCardStackListener implements com.tinder.recs.view.BaseUserRecCardView.OnCardAtTopOfCardStackListener {
        @NotNull
        private final RecsView recsView;

        public OnCardAtTopOfCardStackListener(@NotNull RecsView recsView) {
            C2668g.b(recsView, "recsView");
            this.recsView = recsView;
        }

        @NotNull
        protected final RecsView getRecsView() {
            return this.recsView;
        }

        public void onMovedToTop(@NotNull BaseUserRecCardView baseUserRecCardView) {
            C2668g.b(baseUserRecCardView, "view");
            baseUserRecCardView.setOnClickListener(new C14695xff4b14aa(this, baseUserRecCardView));
        }

        public void onRemovedFromTop(@NotNull BaseUserRecCardView baseUserRecCardView) {
            C2668g.b(baseUserRecCardView, "view");
            baseUserRecCardView.setOnClickListener(null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/recs/RecCardViewHolderFactory$SimpleCardViewHolder;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lcom/tinder/cardstack/model/Card;", "itemView", "Landroid/view/View;", "(Lcom/tinder/recs/RecCardViewHolderFactory;Landroid/view/View;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private final class SimpleCardViewHolder extends CardViewHolder<C8395a<?>> {
        final /* synthetic */ RecCardViewHolderFactory this$0;

        public SimpleCardViewHolder(RecCardViewHolderFactory recCardViewHolderFactory, @NotNull View view) {
            C2668g.b(view, "itemView");
            this.this$0 = recCardViewHolderFactory;
            super(view);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/recs/RecCardViewHolderFactory$TappyOnCardAtTopOfStackListener;", "Lcom/tinder/recs/RecCardViewHolderFactory$OnCardAtTopOfCardStackListener;", "recsView", "Lcom/tinder/recs/view/RecsView;", "(Lcom/tinder/recs/view/RecsView;)V", "onMovedToTop", "", "view", "Lcom/tinder/recs/view/BaseUserRecCardView;", "onRemovedFromTop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private static final class TappyOnCardAtTopOfStackListener extends OnCardAtTopOfCardStackListener {
        public TappyOnCardAtTopOfStackListener(@NotNull RecsView recsView) {
            C2668g.b(recsView, "recsView");
            super(recsView);
        }

        public void onMovedToTop(@NotNull BaseUserRecCardView baseUserRecCardView) {
            C2668g.b(baseUserRecCardView, "view");
            ((TappyUserRecCardView) baseUserRecCardView).setOnUserContentClickListener(new C16391xd68f29e4(this, baseUserRecCardView));
        }

        public void onRemovedFromTop(@NotNull BaseUserRecCardView baseUserRecCardView) {
            C2668g.b(baseUserRecCardView, "view");
            ((TappyUserRecCardView) baseUserRecCardView).setOnUserContentClickListener(null);
        }
    }

    @Inject
    public RecCardViewHolderFactory(@NotNull RecsView recsView, @NotNull AbTestUtility abTestUtility, @NotNull V1BrandedProfileCardAdAnalyticsListener v1BrandedProfileCardAdAnalyticsListener, @NotNull C16429a c16429a, @NotNull FireboardingLevelIconViewFactory fireboardingLevelIconViewFactory, @NotNull C8609a c8609a) {
        C2668g.b(recsView, "recsView");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(v1BrandedProfileCardAdAnalyticsListener, "v1BrandedProfileCardAdAnalyticsListener");
        C2668g.b(c16429a, "adRecCardViewHolderFactory");
        C2668g.b(fireboardingLevelIconViewFactory, "fireboardingLevelIconViewFactory");
        C2668g.b(c8609a, "loopsExperimentUtility");
        this.recsView = recsView;
        this.abTestUtility = abTestUtility;
        this.v1BrandedProfileCardAdAnalyticsListener = v1BrandedProfileCardAdAnalyticsListener;
        this.adRecCardViewHolderFactory = c16429a;
        this.fireboardingLevelIconViewFactory = fireboardingLevelIconViewFactory;
        this.loopsExperimentUtility = c8609a;
    }

    @LayoutRes
    private final int getTappyLayout() {
        return this.abTestUtility.newNewExperiment().b() ? this.loopsExperimentUtility.a() ? R.layout.recs_card_user_loops_new_stamps : R.layout.recs_card_user_tappy_newnew : this.loopsExperimentUtility.a() ? R.layout.recs_card_user_loops : R.layout.recs_card_user_tappy;
    }

    @NotNull
    public CardViewHolder<C8395a<?>> createViewHolder(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "parent");
        switch (i) {
            case 0:
                i = getTappyLayout();
                TappyOnCardAtTopOfStackListener tappyOnCardAtTopOfStackListener = new TappyOnCardAtTopOfStackListener(this.recsView);
                viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
                if (viewGroup != null) {
                    BaseUserRecCardView baseUserRecCardView = (BaseUserRecCardView) viewGroup;
                    baseUserRecCardView.setOnCardAtTopOfCardStackListener(tappyOnCardAtTopOfStackListener);
                    viewGroup = (CardViewHolder) new SimpleCardViewHolder(this, baseUserRecCardView);
                    break;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.view.BaseUserRecCardView");
            case 1:
                viewGroup = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recs_card_ad, viewGroup, false);
                if (viewGroup != null) {
                    viewGroup = (CardViewHolder) new SimpleCardViewHolder(this, (AdRecCardView) viewGroup);
                    break;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.recs.view.AdRecCardView");
            case 2:
                viewGroup = viewGroup.getContext();
                C2668g.a(viewGroup, "parent.context");
                i = new SuperLikeableGameTeaserRecCardView(viewGroup);
                i.setLayoutParams(createMatchParentLayoutParams());
                viewGroup = (CardViewHolder) new SimpleCardViewHolder(this, (View) i);
                break;
            case 3:
                viewGroup = viewGroup.getContext();
                C2668g.a(viewGroup, "parent.context");
                i = new V1BrandedProfileCardRecCardView(viewGroup);
                i.m67216a((Listener) this.legacyBpcListener);
                i.m67216a((Listener) this.v1BrandedProfileCardAdAnalyticsListener);
                viewGroup = (CardViewHolder) new SimpleCardViewHolder(this, (View) i);
                break;
            case 4:
                Context context = viewGroup.getContext();
                C2668g.a(context, "parent.context");
                FireboardingRecCardView fireboardingRecCardView = new FireboardingRecCardView(context, null, this.fireboardingLevelIconViewFactory, 2, null);
                fireboardingRecCardView.setLayoutParams(createMatchParentLayoutParams());
                fireboardingRecCardView.setOnFireboardingRecCardViewListener((OnFireboardingRecCardViewListener) this.onFireBoardingRecCardViewListener);
                return (CardViewHolder) new SimpleCardViewHolder(this, fireboardingRecCardView);
            default:
                this.adRecCardViewHolderFactory.m61809a(this.bpcV2Listener);
                viewGroup = this.adRecCardViewHolderFactory.createViewHolder(viewGroup, i);
                break;
        }
        return viewGroup;
    }

    public int getViewType(@NotNull C8395a<?> c8395a) {
        C2668g.b(c8395a, "card");
        if (c8395a instanceof UserRecCard) {
            return null;
        }
        if (c8395a instanceof AdRecCard) {
            return ((AdRec) ((AdRecCard) c8395a).getItem()).getAd().adType() == TinderAdType.BRANDED_PROFILE_CARD ? 3 : 1;
        } else {
            if (c8395a instanceof C16428a) {
                return this.adRecCardViewHolderFactory.getViewType(c8395a);
            }
            if (c8395a instanceof SuperLikeableGameTeaserRecCard) {
                return 2;
            }
            if (c8395a instanceof C11839a) {
                return 4;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unconfigured card type ");
            stringBuilder.append(c8395a.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private final LayoutParams createMatchParentLayoutParams() {
        return new LayoutParams(-1, -1);
    }
}
