package com.tinder.recs.view;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bumptech.glide.load.resource.bitmap.C3086i;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.presenter.TappyUserRecCardPresenter;
import com.tinder.recs.provider.TappyConfigProvider;
import com.tinder.recs.target.TappyUserRecCardTarget;
import com.tinder.recs.view.tappablecards.TapRegionDetector.TapRegion;
import com.tinder.recs.view.tappablecards.TappyTutorialView;
import com.tinder.recs.view.tappablecards.TappyTutorialView.OnViewTapListener;
import com.tinder.recs.view.tappy.TappyCarouselView;
import com.tinder.recs.view.tappy.TappyCarouselView.OnImageLoadedListener;
import com.tinder.utils.an;
import java.util.List;
import javax.inject.Inject;

public class TappyUserRecCardView extends BaseUserRecCardView implements TappyUserRecCardTarget {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private Bitmap currentPhoto = null;
    private boolean isTutorialShowing = null;
    private OnImageLoadedListener onImageLoadedListener = new TappyUserRecCardView$$Lambda$1(this);
    @Nullable
    private OnUserContentClickListener onUserContentClickListener;
    @Inject
    TappyUserRecCardPresenter presenter;
    @BindView(2131363410)
    TappyCarouselView tappyCarouselView;
    @Inject
    TappyConfigProvider tappyConfigProvider;
    private OnViewTapListener tappyTutorialListener = new TappyUserRecCardView$$Lambda$0(this);
    @BindView(2131363748)
    TappyTutorialView tappyTutorialView;

    public interface OnUserContentClickListener {
        void onUserContentClick();
    }

    public TappyUserRecCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.a(this);
        this.tappyCarouselView.setOnOverTapListener(new TappyUserRecCardView$$Lambda$2(this));
    }

    final /* synthetic */ void lambda$onFinishInflate$0$TappyUserRecCardView(TapRegion tapRegion) {
        this.tappyCarouselView.animateOverTap(tapRegion, this);
    }

    @OnClick({2131363412})
    void onUserContentClick() {
        if (this.onUserContentClickListener != null && !isCardMoving()) {
            this.onUserContentClickListener.onUserContentClick();
        }
    }

    protected TappyCarouselView getRecImageView() {
        return this.tappyCarouselView;
    }

    public void showPhotoAtIndex(int i) {
        if (getUserRecCard() != null && isIndexValid(getUserRecCard().userRec().getUser().photos(), i)) {
            this.tappyCarouselView.showPhotoAtIndex(i);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.isTutorialShowing) {
            this.tappyTutorialView.dispatchTouchEvent(motionEvent);
            return null;
        } else if (!shouldShowTutorial() || motionEvent.getAction() != 1) {
            return super.onTouchEvent(motionEvent);
        } else {
            showTutorial();
            return true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (shouldShowTutorial() == null) {
            if (this.isTutorialShowing == null) {
                return null;
            }
        }
        return true;
    }

    public void bind(UserRecCard userRecCard) {
        super.bind(userRecCard);
        Deadshot.take(this, this.presenter);
        bindImageLoadListener();
        getRecImageView().setOnPhotoPageChangeListener(new TappyUserRecCardView$$Lambda$3(this, userRecCard));
        this.presenter.onUserRecBound(userRecCard.userRec());
    }

    final /* synthetic */ void lambda$bind$1$TappyUserRecCardView(UserRecCard userRecCard, String str, int i, int i2) {
        this.presenter.handleOnPhotoChanged(i, i2, userRecCard.userRec());
        this.tappyCarouselView.setActivePage(i);
    }

    protected void bindPhotos(@NonNull final UserRecCard userRecCard) {
        UserRec userRec = userRecCard.userRec();
        final TappyCarouselView recImageView = getRecImageView();
        int width = recImageView.getWidth();
        int height = recImageView.getHeight();
        if (width != 0) {
            if (height != 0) {
                userRecCard.notifySizeUpdate(width, height);
                userRecCard = userRec.getUser().photos();
                String id = userRec.getUser().id();
                int activePhotoIndex = this.activePhotoIndexProvider.getActivePhotoIndex(id);
                if (!isIndexValid(userRecCard, activePhotoIndex)) {
                    activePhotoIndex = 0;
                    this.activePhotoIndexProvider.updateActivePhotoIndex(id, 0);
                }
                onBindPhotos(id, userRecCard, activePhotoIndex);
                showPhotoAtIndex(activePhotoIndex);
                return;
            }
        }
        recImageView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                recImageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                TappyUserRecCardView.this.bindPhotos(userRecCard);
            }
        });
    }

    private void onBindPhotos(String str, List<Photo> list, int i) {
        int min = Math.min(6, list.size());
        this.tappyCarouselView.bind(str, list.subList(0, min), i);
        this.tappyCarouselView.setPageCount(min);
    }

    public void onMovedToTop(UserRecCard userRecCard) {
        super.onMovedToTop(userRecCard);
        userRecCard = userRecCard.userRec();
        this.presenter.handleCardMovedToTop(this.activePhotoIndexProvider.getActivePhotoIndex(userRecCard.getUser().id()), userRecCard);
    }

    public void onCardViewRecycled() {
        super.onCardViewRecycled();
        this.tappyCarouselView.onViewRecycled();
        Deadshot.drop(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void enableSuperLikeStamps() {
        RecCardStampsDecoration cardStampsDecoration = cardStampsDecoration();
        if (cardStampsDecoration != null) {
            cardStampsDecoration.setShowSuperlikeStamp(true);
        }
    }

    public void disableSuperLikeStamps() {
        RecCardStampsDecoration cardStampsDecoration = cardStampsDecoration();
        if (cardStampsDecoration != null) {
            cardStampsDecoration.setShowSuperlikeStamp(false);
        }
    }

    public void setOnUserContentClickListener(@Nullable OnUserContentClickListener onUserContentClickListener) {
        this.onUserContentClickListener = onUserContentClickListener;
    }

    final /* synthetic */ void lambda$new$2$TappyUserRecCardView(final TappyTutorialView.TapRegion tapRegion) {
        if (this.isTutorialShowing) {
            this.isTutorialShowing = false;
            updateTappyConfig();
            this.tappyTutorialView.animate().setDuration(300).withLayer().alpha(0.0f).setListener(new an() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    TappyUserRecCardView.this.tappyTutorialView.setVisibility(8);
                    TappyUserRecCardView.this.tappyCarouselView.showPageIndicator();
                    TappyUserRecCardView.this.contentContainer.setVisibility(0);
                    TappyUserRecCardView.this.bottomGradientRenderer.setVisibility(0);
                    TappyUserRecCardView.this.currentPhoto = null;
                    TappyUserRecCardView.this.handleTapRegionEvent(tapRegion);
                }
            });
        }
    }

    private void showTutorial() {
        this.isTutorialShowing = true;
        this.tappyTutorialView.setOpenProfileRegionHeight(this.contentContainer.getHeight());
        this.tappyCarouselView.hidePageIndicator();
        this.contentContainer.setVisibility(4);
        this.bottomGradientRenderer.setVisibility(4);
        this.tappyTutorialView.setViewTapListener(this.tappyTutorialListener);
        this.tappyTutorialView.setAlpha(0.0f);
        this.tappyTutorialView.setImageBackground(this.currentPhoto);
        this.tappyTutorialView.setVisibility(0);
        this.tappyTutorialView.animate().setDuration(300).withLayer().alpha(1.0f);
    }

    final /* synthetic */ void lambda$new$3$TappyUserRecCardView(Drawable drawable, int i) {
        if (i == 0 && (drawable instanceof C3086i) != 0) {
            this.currentPhoto = ((C3086i) drawable).b();
            if (this.isTutorialShowing != null) {
                this.tappyTutorialView.setImageBackground(this.currentPhoto);
            }
        }
    }

    private void updateTappyConfig() {
        TappyConfig tappyConfig = this.tappyConfigProvider.get();
        if (tappyConfig != null) {
            this.tappyConfigProvider.update(tappyConfig.toBuilder().isTutorialShown(true).build());
        }
    }

    private void handleTapRegionEvent(TappyTutorialView.TapRegion tapRegion) {
        switch (tapRegion) {
            case PROFILE:
                onUserContentClick();
                return;
            case PREVIOUS_PHOTO:
                this.tappyCarouselView.dispatchTapRegionEvent(TapRegion.LEFT);
                return;
            case NEXT_PHOTO:
                this.tappyCarouselView.dispatchTapRegionEvent(TapRegion.RIGHT);
                return;
            default:
                return;
        }
    }

    private boolean shouldShowTutorial() {
        TappyConfig tappyConfig = this.tappyConfigProvider.get();
        return (tappyConfig == null || tappyConfig.isTutorialShown()) ? false : true;
    }

    private void bindImageLoadListener() {
        if (shouldShowTutorial()) {
            this.tappyCarouselView.setOnImageLoadedListener(this.onImageLoadedListener);
        } else {
            this.tappyCarouselView.setOnImageLoadedListener(null);
        }
    }
}
