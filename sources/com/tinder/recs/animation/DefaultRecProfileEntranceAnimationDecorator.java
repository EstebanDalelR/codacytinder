package com.tinder.recs.animation;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C3442e;
import com.tinder.profile.view.ProfileView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderImageView;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.animation.RecProfileAnimationDecorator.State;
import com.tinder.recs.view.RecProfileView;

public class DefaultRecProfileEntranceAnimationDecorator extends DefaultRecProfileAnimationDecorator {
    protected final View photosView = this.profileView.getProfilePhotosView();
    protected final PlaceholderImageView placeholderImageView;
    protected final ProfileView profileView;
    protected State state;

    /* renamed from: com.tinder.recs.animation.DefaultRecProfileEntranceAnimationDecorator$2 */
    class C147012 implements OnGlobalLayoutListener {
        C147012() {
        }

        public void onGlobalLayout() {
            if (DefaultRecProfileEntranceAnimationDecorator.this.placeholderImageView.getHeight() > 0) {
                DefaultRecProfileEntranceAnimationDecorator.this.placeholderImageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                DefaultRecProfileEntranceAnimationDecorator.this.performSpringAnimation();
            }
        }
    }

    public DefaultRecProfileEntranceAnimationDecorator(@NonNull RecProfileView recProfileView, @NonNull PlaceholderPhotoConfig placeholderPhotoConfig) {
        super(recProfileView, placeholderPhotoConfig);
        this.profileView = recProfileView.getProfileView();
        this.placeholderImageView = recProfileView.getPlaceholderImageView();
        this.state = State.INITIALIZED;
    }

    public void animate() {
        this.state = State.RUNNING;
        setupPlaceholder();
        final ProfileView profileView = this.recProfileView.getProfileView();
        View profilePhotosView = profileView.getProfilePhotosView();
        if (profilePhotosView != null) {
            if (profilePhotosView.getWidth() != 0) {
                startArrowDownButtonAnimation();
                performSpringAnimation();
                return;
            }
        }
        profileView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                profileView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                DefaultRecProfileEntranceAnimationDecorator.this.animate();
            }
        });
    }

    void setupPlaceholder() {
        this.placeholderImageView.updateSize((float) this.config.placeholderX(), (float) this.config.placeholderY(), this.config.placeholderWidth(), this.config.placeholderHeight(), this.config.placeholderParallaxFactor());
        if (this.config.showPageIndicator()) {
            this.placeholderImageView.showPageIndicator(this.config.photoCount(), this.config.displayedPhotoIndex());
        }
        this.placeholderImageView.loadImageUrl(this.config.displayedPhotoUrl(), this.config.placeholderTagName());
        String placeholderTagName = this.config.placeholderTagName();
        if (placeholderTagName != null && !placeholderTagName.isEmpty()) {
            this.placeholderImageView.setTagViewWithName(placeholderTagName);
        }
    }

    void startArrowDownButtonAnimation() {
        this.profileView.a();
    }

    @NonNull
    public State getState() {
        return this.state;
    }

    protected void performSpringAnimation() {
        if (this.placeholderImageView.getHeight() <= 0) {
            this.placeholderImageView.getViewTreeObserver().addOnGlobalLayoutListener(new C147012());
        } else {
            startAnimation();
        }
    }

    protected void startAnimation() {
        int width = this.profileView.getProfilePhotosView().getWidth();
        final int placeholderWidth = width - this.config.placeholderWidth();
        final int placeholderHeight = width - this.config.placeholderHeight();
        this.placeholderImageView.setAlpha(1.0f);
        final int height = this.recProfileView.getHeight() - width;
        this.profileView.setTranslationY((float) height);
        C1811f createSpring = createSpring();
        createSpring.a(new C3442e() {
            public void onSpringActivate(C1811f c1811f) {
                DefaultRecProfileEntranceAnimationDecorator.this.profileView.setVisibility(0);
                DefaultRecProfileEntranceAnimationDecorator.this.recProfileView.getEntranceBackground().setVisibility(0);
                DefaultRecProfileEntranceAnimationDecorator.this.notifyAnimationStart();
            }

            public void onSpringUpdate(C1811f c1811f) {
                c1811f = (float) c1811f.c();
                float f = 1.0f - c1811f;
                DefaultRecProfileEntranceAnimationDecorator.this.profileView.setTranslationY(((float) height) * f);
                DefaultRecProfileEntranceAnimationDecorator.this.recProfileView.getEntranceBackground().setAlpha(c1811f);
                float placeholderX = f * ((float) DefaultRecProfileEntranceAnimationDecorator.this.config.placeholderX());
                float placeholderY = f * ((float) DefaultRecProfileEntranceAnimationDecorator.this.config.placeholderY());
                int placeholderWidth = (int) (((float) DefaultRecProfileEntranceAnimationDecorator.this.config.placeholderWidth()) + (((float) placeholderWidth) * c1811f));
                int placeholderHeight = (int) (((float) DefaultRecProfileEntranceAnimationDecorator.this.config.placeholderHeight()) + (c1811f * ((float) placeholderHeight)));
                c1811f = DefaultRecProfileEntranceAnimationDecorator.this.config.placeholderParallaxFactor();
                DefaultRecProfileEntranceAnimationDecorator.this.placeholderImageView.updateSize(placeholderX, placeholderY, placeholderWidth, placeholderHeight, ((1.0f - c1811f) * f) + c1811f);
            }

            public void onSpringAtRest(C1811f c1811f) {
                super.onSpringAtRest(c1811f);
                DefaultRecProfileEntranceAnimationDecorator.this.recProfileView.getEntranceBackground().setVisibility(8);
                DefaultRecProfileEntranceAnimationDecorator.this.placeholderImageView.setVisibility(4);
                DefaultRecProfileEntranceAnimationDecorator.this.photosView.setVisibility(0);
                DefaultRecProfileEntranceAnimationDecorator.this.profileView.setBackgroundColor(-1);
                DefaultRecProfileEntranceAnimationDecorator.this.state = State.FINISHED;
                DefaultRecProfileEntranceAnimationDecorator.this.notifyAnimationEnd();
            }
        });
        createSpring.b(1.0d);
    }
}
