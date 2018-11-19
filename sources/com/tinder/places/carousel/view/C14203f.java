package com.tinder.places.carousel.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tinder.R;
import com.tinder.places.carousel.adapter.PlacesCarouselAdapter.C12325a;
import com.tinder.utils.am;
import com.tinder.utils.an;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J0\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/places/carousel/view/PlacesCarouselItemAnimator;", "Landroid/support/v7/widget/DefaultItemAnimator;", "carouselLayoutManager", "Lcom/tinder/places/carousel/view/CarouselLayoutManager;", "(Lcom/tinder/places/carousel/view/CarouselLayoutManager;)V", "animationMap", "Ljava/util/HashMap;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/animation/Animation;", "Lkotlin/collections/HashMap;", "animateAdd", "", "holder", "animateMove", "fromX", "", "fromY", "toX", "toY", "animateRemove", "endAnimation", "", "item", "endAnimations", "onAnimationFinished", "viewHolder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.carousel.view.f */
public class C14203f extends DefaultItemAnimator {
    /* renamed from: a */
    private final HashMap<ViewHolder, Animation> f45001a = new HashMap();
    /* renamed from: b */
    private final CarouselLayoutManager f45002b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animationUpdate", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.f$a */
    static final class C10204a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ Float f33270a;
        /* renamed from: b */
        final /* synthetic */ float f33271b;
        /* renamed from: c */
        final /* synthetic */ ViewHolder f33272c;

        C10204a(Float f, float f2, ViewHolder viewHolder) {
            this.f33270a = f;
            this.f33271b = f2;
            this.f33272c = viewHolder;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Float f = this.f33270a;
            if (f != null) {
                float floatValue;
                f.floatValue();
                float f2;
                float signum;
                if (this.f33271b > ((float) 0)) {
                    floatValue = this.f33270a.floatValue();
                    f2 = (float) 1;
                    signum = Math.signum(this.f33271b);
                    C2668g.a(valueAnimator, "animationUpdate");
                    floatValue += f2 - (signum * valueAnimator.getAnimatedFraction());
                } else {
                    floatValue = this.f33270a.floatValue();
                    f2 = (float) 1;
                    signum = Math.signum(this.f33271b);
                    C2668g.a(valueAnimator, "animationUpdate");
                    floatValue += f2 + (signum * valueAnimator.getAnimatedFraction());
                }
                valueAnimator = C12330c.f39924a.m41512a(floatValue);
                View view = this.f33272c.itemView;
                C2668g.a(view, "holder.itemView");
                view.setScaleX(valueAnimator);
                view = this.f33272c.itemView;
                C2668g.a(view, "holder.itemView");
                view.setScaleY(valueAnimator);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/carousel/view/PlacesCarouselItemAnimator$animateMove$2", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/places/carousel/view/PlacesCarouselItemAnimator;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.f$b */
    public static final class C12331b extends an {
        /* renamed from: a */
        final /* synthetic */ C14203f f39925a;
        /* renamed from: b */
        final /* synthetic */ ViewHolder f39926b;

        C12331b(C14203f c14203f, ViewHolder viewHolder) {
            this.f39925a = c14203f;
            this.f39926b = viewHolder;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f39925a.dispatchMoveFinished(this.f39926b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/places/carousel/view/PlacesCarouselItemAnimator$animateRemove$1", "Lcom/tinder/utils/SimpleAnimationListener;", "(Lcom/tinder/places/carousel/view/PlacesCarouselItemAnimator;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.carousel.view.f$c */
    public static final class C12332c extends am {
        /* renamed from: a */
        final /* synthetic */ C14203f f39927a;
        /* renamed from: b */
        final /* synthetic */ ViewHolder f39928b;

        C12332c(C14203f c14203f, ViewHolder viewHolder) {
            this.f39927a = c14203f;
            this.f39928b = viewHolder;
        }

        public void onAnimationEnd(@Nullable Animation animation) {
            this.f39927a.dispatchRemoveFinished(this.f39928b);
            this.f39927a.f45002b.removeView(this.f39928b.itemView);
        }
    }

    public C14203f(@NotNull CarouselLayoutManager carouselLayoutManager) {
        C2668g.b(carouselLayoutManager, "carouselLayoutManager");
        this.f45002b = carouselLayoutManager;
    }

    public boolean animateRemove(@Nullable ViewHolder viewHolder) {
        if (viewHolder instanceof C12325a) {
            C12325a c12325a = (C12325a) viewHolder;
            Animation loadAnimation = AnimationUtils.loadAnimation(c12325a.m48663a().getContext(), R.anim.slide_down_entirely_from_default);
            loadAnimation.setAnimationListener(new C12332c(this, viewHolder));
            Map map = this.f45001a;
            C2668g.a(loadAnimation, "downAnim");
            map.put(viewHolder, loadAnimation);
            c12325a.m48663a().startAnimation(loadAnimation);
        }
        return null;
    }

    public boolean animateAdd(@NotNull ViewHolder viewHolder) {
        C2668g.b(viewHolder, "holder");
        Float c = this.f45002b.m48698c(viewHolder.getAdapterPosition());
        if (c != null) {
            c = Float.valueOf(C12330c.f39924a.m41512a(c.floatValue()));
        } else {
            c = null;
        }
        if (c != null) {
            float floatValue = c.floatValue();
            View view = viewHolder.itemView;
            C2668g.a(view, "holder.itemView");
            view.setScaleX(floatValue);
            view = viewHolder.itemView;
            C2668g.a(view, "holder.itemView");
            view.setScaleY(floatValue);
        }
        dispatchAddFinished(viewHolder);
        return true;
    }

    public boolean animateMove(@NotNull ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        C2668g.b(viewHolder, "holder");
        i = (float) (i3 - i);
        i2 = viewHolder.itemView;
        C2668g.a(i2, "holder.itemView");
        i = -(i + i2.getTranslationX());
        i2 = viewHolder.itemView;
        C2668g.a(i2, "holder.itemView");
        i2.setTranslationX(i);
        viewHolder.itemView.animate().translationX(0).setUpdateListener((AnimatorUpdateListener) new C10204a(this.f45002b.m48698c(viewHolder.getAdapterPosition()), i, viewHolder)).setListener((AnimatorListener) new C12331b(this, viewHolder));
        return true;
    }

    public void endAnimation(@Nullable ViewHolder viewHolder) {
        super.endAnimation(viewHolder);
        Map map = this.f45001a;
        if (map == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        if (map.containsKey(viewHolder)) {
            Animation animation = (Animation) this.f45001a.get(viewHolder);
            if (animation != null) {
                animation.cancel();
            }
        }
        if (viewHolder != null) {
            viewHolder = viewHolder.itemView;
            if (viewHolder != null) {
                viewHolder = viewHolder.animate();
                if (viewHolder != null) {
                    viewHolder.cancel();
                }
            }
        }
    }

    public void endAnimations() {
        super.endAnimations();
        Set<Entry> entrySet = this.f45001a.entrySet();
        C2668g.a(entrySet, "animationMap.entries");
        for (Entry entry : entrySet) {
            ((ViewHolder) entry.getKey()).itemView.animate().cancel();
            ((Animation) entry.getValue()).cancel();
        }
    }

    public void onAnimationFinished(@Nullable ViewHolder viewHolder) {
        super.onAnimationFinished(viewHolder);
        Map map = this.f45001a;
        if (map == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        C15829m.g(map).remove(viewHolder);
    }
}
