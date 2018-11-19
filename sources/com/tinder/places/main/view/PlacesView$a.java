package com.tinder.places.main.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.tinder.C6250b.C6248a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/places/main/view/PlacesView$hideLoadingMap$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/places/main/view/PlacesView$hideLoadingMap$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesView$a extends AnimatorListenerAdapter {
    /* renamed from: a */
    final /* synthetic */ PlacesView f33329a;

    PlacesView$a(PlacesView placesView) {
        this.f33329a = placesView;
    }

    public void onAnimationEnd(@Nullable Animator animator) {
        ImageView imageView = (ImageView) this.f33329a.a(C6248a.placesLoadingBackground);
        C2668g.a(imageView, "placesLoadingBackground");
        imageView.setAlpha(1.0f);
        imageView = (ImageView) this.f33329a.a(C6248a.placesLoadingBackground);
        C2668g.a(imageView, "placesLoadingBackground");
        imageView.setVisibility(8);
        PlacesView.a(this.f33329a, (Animator) null);
    }
}
