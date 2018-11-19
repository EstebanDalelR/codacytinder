package com.tinder.recs.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.tinder.recs.animation.DefaultRecProfileAnimationDecorator.PlaceholderPhotoConfig;
import com.tinder.recs.animation.DefaultRecProfileEntranceAnimationDecorator;
import com.tinder.recs.animation.TappyDefaultRecProfileEntranceAnimationDecorator;
import com.tinder.utils.av;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/recs/view/RecsView$Companion;", "", "()V", "CARDSTACK_MOVED_Z_INDEX", "", "DUMMY_LOCKABLE_VIEWPAGER_PARENT", "Lcom/tinder/base/view/LockableViewPager$LockableViewPagerParent;", "STAMP_ANIMATION_DURATION_MS", "", "VIEW_FLIPPER_INDEX_CARD_STACK", "", "VIEW_FLIPPER_INDEX_DISCOVERY_OFF", "createPlaceholderPhotoConfig", "Lcom/tinder/recs/animation/DefaultRecProfileAnimationDecorator$PlaceholderPhotoConfig;", "photoIndex", "displayedPhotoUrl", "", "totalPhotoCount", "cardView", "Landroid/view/View;", "context", "Landroid/content/Context;", "getProfileEntranceAnimationDecorator", "Lcom/tinder/recs/animation/DefaultRecProfileEntranceAnimationDecorator;", "profileView", "Lcom/tinder/recs/view/RecProfileView;", "placeholderPhotoConfig", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$Companion {
    private RecsView$Companion() {
    }

    private final DefaultRecProfileEntranceAnimationDecorator getProfileEntranceAnimationDecorator(RecProfileView<?> recProfileView, PlaceholderPhotoConfig placeholderPhotoConfig) {
        return new TappyDefaultRecProfileEntranceAnimationDecorator(recProfileView, placeholderPhotoConfig);
    }

    private final PlaceholderPhotoConfig createPlaceholderPhotoConfig(int i, String str, int i2, View view, Context context) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        i = PlaceholderPhotoConfig.builder().displayedPhotoIndex(i).displayedPhotoUrl(str).photoCount(i2).showPageIndicator(null).placeholderX(rect.left).placeholderY(rect.top - av.b(context)).placeholderWidth(rect.width()).placeholderHeight(rect.height()).placeholderParallaxFactor(1.0f).build();
        C2668g.a(i, "PlaceholderPhotoConfig.b…\n                .build()");
        return i;
    }
}
