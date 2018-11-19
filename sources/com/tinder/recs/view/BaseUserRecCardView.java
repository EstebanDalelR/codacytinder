package com.tinder.recs.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import com.tinder.cardstack.view.CardCollectionLayout;
import com.tinder.cardstack.view.CardStackLayout;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.User;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.recs.DeepLinkReferralInfo;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.recs.model.UserRec.Teaser;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.presenter.UserRecCardPresenter;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.drawable.BottomGradientRenderer;
import com.tinder.recs.view.exception.UnexpectedImageIndexException;
import com.tinder.recs.view.superlike.SuperLikeDecorator;
import com.tinder.recs.view.superlike.SuperLikeOverlayView;
import java.util.List;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public abstract class BaseUserRecCardView extends RecCardView<UserRecCard> {
    private static final OnCardAtTopOfCardStackListener DUMMY_ON_POSITION_CHANGED_LISTENER = new C164091();
    private static final int GRADIENT_HEIGHT_FRACTION = 4;
    static final int MAX_PHOTO_COUNT = 6;
    @Inject
    UserRecActivePhotoIndexProvider activePhotoIndexProvider;
    @Inject
    BottomGradientRenderer bottomGradientRenderer;
    @BindView(2131363412)
    ViewGroup contentContainer;
    @Inject
    FastMatchConfigProvider fastMatchConfigProvider;
    @BindView(2131363413)
    View fastMatchTeaserView;
    private int gradientHeight;
    private int gradientWidth;
    @BindView(2131363414)
    UserRecCardHeadLineView headlineView;
    private boolean isRewind;
    @NonNull
    private OnCardAtTopOfCardStackListener onCardAtTopOfCardStackListener = DUMMY_ON_POSITION_CHANGED_LISTENER;
    @Nullable
    private OnClickListener onClickListener;
    @Inject
    UserRecCardPresenter presenter;
    private RecAttribution recAttribution = RecAttribution.NONE;
    @BindView(2131363407)
    ReferralBannerView referralBannerView;
    @BindView(2131363408)
    View selectUserBannerView;
    @Nullable
    private SuperLikeDecorator superLikeDecorator;
    @BindView(2131363409)
    SuperLikeOverlayView superLikeOverlayView;
    @BindViews({2131363424, 2131363425})
    List<TextView> teaserViews;
    @Inject
    TopPicksConfig topPicksConfig;
    @Nullable
    private UserRecCard userRecCard;

    public interface OnCardAtTopOfCardStackListener {
        void onMovedToTop(BaseUserRecCardView baseUserRecCardView);

        void onRemovedFromTop(BaseUserRecCardView baseUserRecCardView);
    }

    private enum RecAttribution {
        SUPERLIKE,
        FAST_MATCH,
        TOP_PICK,
        NONE
    }

    /* renamed from: com.tinder.recs.view.BaseUserRecCardView$1 */
    static class C164091 implements OnCardAtTopOfCardStackListener {
        public void onMovedToTop(BaseUserRecCardView baseUserRecCardView) {
        }

        public void onRemovedFromTop(BaseUserRecCardView baseUserRecCardView) {
        }

        C164091() {
        }
    }

    protected abstract void bindPhotos(@NonNull UserRecCard userRecCard);

    public abstract void showPhotoAtIndex(int i);

    public BaseUserRecCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ButterKnife.a(this);
        super.onFinishInflate();
        setOnClickListenerInternal();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.userRecCard != 0) {
            this.gradientHeight = i2 / 4;
            this.gradientWidth = i;
            bindColorGradientForHeight(this.userRecCard.gradientColor(), i, this.gradientHeight);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.contentContainer) {
            this.bottomGradientRenderer.draw(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void bind(UserRecCard userRecCard) {
        this.isRewind = userRecCard.getShowRevertIndicator();
        super.bind(userRecCard);
        this.userRecCard = userRecCard;
        this.recAttribution = findRecAttribution(userRecCard);
        bindColorGradientForHeight(userRecCard.gradientColor(), this.gradientWidth, this.gradientHeight);
        bindRecBannerViews(userRecCard.userRec());
        bindHeadLineViews(userRecCard);
        bindPhotos(userRecCard);
        bindTeasers(userRecCard.teasers());
    }

    public void onMovedToTop(UserRecCard userRecCard) {
        this.presenter.handleCardMovedToTop(userRecCard);
        this.onCardAtTopOfCardStackListener.onMovedToTop(this);
        if (this.superLikeDecorator != null) {
            this.superLikeDecorator.onMovedToTop();
        }
    }

    public void onRemovedFromTop(UserRecCard userRecCard) {
        super.onRemovedFromTop(userRecCard);
        this.onCardAtTopOfCardStackListener.onRemovedFromTop(this);
    }

    public void onAttachedToCardCollectionLayout(@NonNull CardCollectionLayout cardCollectionLayout) {
        super.onAttachedToCardCollectionLayout(cardCollectionLayout);
        if (cardCollectionLayout instanceof CardStackLayout) {
            CardStackLayout cardStackLayout = (CardStackLayout) cardCollectionLayout;
            if (this.recAttribution == RecAttribution.SUPERLIKE) {
                this.superLikeDecorator = new SuperLikeDecorator(this.superLikeOverlayView, this, cardStackLayout, this.isRewind);
                cardStackLayout.a(this.superLikeDecorator);
            }
        }
    }

    public void onDetachedFromCardCollectionLayout(@NonNull CardCollectionLayout cardCollectionLayout) {
        super.onDetachedFromCardCollectionLayout(cardCollectionLayout);
        if (cardCollectionLayout instanceof CardStackLayout) {
            CardStackLayout cardStackLayout = (CardStackLayout) cardCollectionLayout;
            if (this.superLikeDecorator != null) {
                cardStackLayout.b(this.superLikeDecorator);
                this.superLikeDecorator.destroy();
                this.superLikeDecorator = null;
            }
        }
    }

    public void setOnCardAtTopOfCardStackListener(@Nullable OnCardAtTopOfCardStackListener onCardAtTopOfCardStackListener) {
        if (onCardAtTopOfCardStackListener == null) {
            this.onCardAtTopOfCardStackListener = DUMMY_ON_POSITION_CHANGED_LISTENER;
        } else {
            this.onCardAtTopOfCardStackListener = onCardAtTopOfCardStackListener;
        }
    }

    public UserRecCard getUserRecCard() {
        return this.userRecCard;
    }

    public int getDisplayedPhotoIndex() {
        return this.activePhotoIndexProvider.getActivePhotoIndex(this.userRecCard.userRec().getId());
    }

    @Nullable
    public String getDisplayedPhotoUrl() {
        int width = getWidth();
        int height = getHeight();
        int displayedPhotoIndex = getDisplayedPhotoIndex();
        return (displayedPhotoIndex < 0 || displayedPhotoIndex >= Math.min(6, this.userRecCard.userRec().getUser().photos().size()) || width <= 0 || height <= 0) ? null : this.userRecCard.photoUrlForSize(displayedPhotoIndex, width, height);
    }

    public int getPhotoCount() {
        return Math.min(this.userRecCard.userRec().getUser().photos().size(), 6);
    }

    private void bindColorGradientForHeight(@ColorRes int i, int i2, int i3) {
        this.bottomGradientRenderer.setColor(C0432b.c(getContext(), i));
        this.bottomGradientRenderer.setDimensions(i2, i3, (float) getHeight());
    }

    private void bindHeadLineViews(@NonNull UserRecCard userRecCard) {
        TextView textView = this.headlineView.nameView;
        TextView textView2 = this.headlineView.ageView;
        if (userRecCard.showAge()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(userRecCard.name());
            stringBuilder.append(",");
            textView.setText(stringBuilder.toString());
            textView2.setText(userRecCard.age());
            textView2.setVisibility(0);
        } else {
            textView.setText(userRecCard.name());
            textView2.setVisibility(8);
        }
        if (userRecCard.isVerified() != null) {
            this.headlineView.showVerifiedBadge();
        } else {
            this.headlineView.hideVerifiedBadge();
        }
        this.headlineView.hideSuperlikeIcon();
        this.headlineView.hideFastMatchIcon();
        this.headlineView.hideTopPicksIcon();
        switch (this.recAttribution) {
            case SUPERLIKE:
                this.headlineView.showSuperlikeIcon();
                return;
            case FAST_MATCH:
                this.headlineView.showFastMatchIcon();
                return;
            default:
                this.headlineView.hideSuperlikeIcon();
                this.headlineView.hideFastMatchIcon();
                this.headlineView.hideTopPicksIcon();
                return;
        }
    }

    private void bindRecBannerViews(@NonNull UserRec userRec) {
        int i = 8;
        this.referralBannerView.setVisibility(8);
        this.selectUserBannerView.setVisibility(8);
        DeepLinkReferralInfo deepLinkInfo = RecFieldDecorationExtensionsKt.deepLinkInfo(userRec);
        User referrer = deepLinkInfo != null ? deepLinkInfo.referrer() : null;
        if (referrer != null) {
            this.referralBannerView.setReferralData(referrer.photos().isEmpty() != null ? "" : ((Photo) referrer.photos().get(0)).url(), referrer.name());
            this.referralBannerView.setVisibility(0);
            return;
        }
        View view = this.selectUserBannerView;
        if (userRec.isSelectMember() != null) {
            i = 0;
        }
        view.setVisibility(i);
    }

    private void bindTeasers(@NonNull List<Teaser> list) {
        Object obj = this.recAttribution == RecAttribution.FAST_MATCH ? 1 : null;
        if (obj != null) {
            this.fastMatchTeaserView.setVisibility(0);
        } else {
            this.fastMatchTeaserView.setVisibility(8);
        }
        int min = Math.min(list.size(), this.teaserViews.size());
        if (obj != null) {
            list = list.subList(0, Math.max(min - 1, 0));
        } else {
            list = list.subList(0, min);
        }
        int i = 0;
        while (i < this.teaserViews.size()) {
            TextView textView = (TextView) this.teaserViews.get(i);
            if ((i < list.size() ? 1 : null) != null) {
                textView.setText(((Teaser) list.get(i)).getValue());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            i++;
        }
    }

    private RecAttribution findRecAttribution(UserRecCard userRecCard) {
        userRecCard = userRecCard.userRec();
        if (userRecCard.isSuperLike()) {
            return RecAttribution.SUPERLIKE;
        }
        if (userRecCard.isFastMatch() && this.fastMatchConfigProvider.get().isEnabled()) {
            return RecAttribution.FAST_MATCH;
        }
        if (userRecCard.isTopPick() == null || this.topPicksConfig.isEnabled() == null) {
            return RecAttribution.NONE;
        }
        return RecAttribution.TOP_PICK;
    }

    protected boolean isIndexValid(List<Photo> list, int i) {
        if (list != null) {
            if (!list.isEmpty()) {
                if (i >= 0) {
                    if (i < list.size()) {
                        return true;
                    }
                }
                C0001a.b(new UnexpectedImageIndexException(i, list.size()));
                return false;
            }
        }
        return false;
    }

    private void setOnClickListenerInternal() {
        super.setOnClickListener(new BaseUserRecCardView$$Lambda$0(this));
    }

    final /* synthetic */ void lambda$setOnClickListenerInternal$0$BaseUserRecCardView(View view) {
        if (this.onClickListener != null && !isCardMoving()) {
            this.onClickListener.onClick(view);
        }
    }
}
