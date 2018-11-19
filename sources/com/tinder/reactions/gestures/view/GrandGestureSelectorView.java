package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieAnimationView.CacheStrategy;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.common.view.SafeViewFlipper;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.audio.C14589a;
import com.tinder.reactions.audio.C14589a.C14588a;
import com.tinder.reactions.gestures.p394b.C14655e;
import com.tinder.reactions.gestures.target.GrandGestureSelectorTarget;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u00020\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u001eJ\b\u0010\u001f\u001a\u00020\u0015H\u0014J\b\u0010 \u001a\u00020\u0015H\u0014J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/tinder/reactions/gestures/view/GrandGestureSelectorView;", "Lcom/tinder/common/view/SafeViewFlipper;", "Lcom/tinder/reactions/gestures/target/GrandGestureSelectorTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "audioHelper", "Lcom/tinder/reactions/audio/GrandGestureAudioHelper;", "getAudioHelper$Tinder_release", "()Lcom/tinder/reactions/audio/GrandGestureAudioHelper;", "setAudioHelper$Tinder_release", "(Lcom/tinder/reactions/audio/GrandGestureAudioHelper;)V", "presenter", "Lcom/tinder/reactions/gestures/presenter/GrandGestureSelectorPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/reactions/gestures/presenter/GrandGestureSelectorPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/reactions/gestures/presenter/GrandGestureSelectorPresenter;)V", "addAnimationViewAt", "", "animationFile", "", "position", "", "getCurrentGrandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "initializeSelectableAnimations", "gestureTypeAnimatonMap", "", "onAttachedToWindow", "onDetachedFromWindow", "playAudio", "audioConfig", "Lcom/tinder/reactions/audio/GrandGestureAudioHelper$AudioConfig;", "setCurrentAnimation", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GrandGestureSelectorView extends SafeViewFlipper implements GrandGestureSelectorTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14655e f50873a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C14589a f50874b;

    public GrandGestureSelectorView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.getPresenter$Tinder_release().m55875a();
            }
        });
    }

    @NotNull
    public final C14655e getPresenter$Tinder_release() {
        C14655e c14655e = this.f50873a;
        if (c14655e == null) {
            C2668g.b("presenter");
        }
        return c14655e;
    }

    public final void setPresenter$Tinder_release(@NotNull C14655e c14655e) {
        C2668g.b(c14655e, "<set-?>");
        this.f50873a = c14655e;
    }

    @NotNull
    public final C14589a getAudioHelper$Tinder_release() {
        C14589a c14589a = this.f50874b;
        if (c14589a == null) {
            C2668g.b("audioHelper");
        }
        return c14589a;
    }

    public final void setAudioHelper$Tinder_release(@NotNull C14589a c14589a) {
        C2668g.b(c14589a, "<set-?>");
        this.f50874b = c14589a;
    }

    /* renamed from: a */
    public final void m61693a(@NotNull Map<GrandGestureType, String> map) {
        C2668g.b(map, "gestureTypeAnimatonMap");
        C14655e c14655e = this.f50873a;
        if (c14655e == null) {
            C2668g.b("presenter");
        }
        c14655e.m55876a(map);
    }

    @NotNull
    public final GrandGestureType getCurrentGrandGestureType() {
        C14655e c14655e = this.f50873a;
        if (c14655e == null) {
            C2668g.b("presenter");
        }
        return c14655e.m55877b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14655e c14655e = this.f50873a;
        if (c14655e == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14655e);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setCurrentAnimation(int i) {
        setDisplayedChild(i);
    }

    public void addAnimationViewAt(@NotNull String str, int i) {
        C2668g.b(str, "animationFile");
        View inflate = SafeViewFlipper.inflate(getContext(), R.layout.grand_gesture_selectable_animation_item, null);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate;
        lottieAnimationView.a(str, CacheStrategy.Weak);
        lottieAnimationView.b(true);
        lottieAnimationView.c();
        addView(lottieAnimationView, i);
    }

    public void playAudio(@NotNull C14588a c14588a) {
        C2668g.b(c14588a, "audioConfig");
        C14589a c14589a = this.f50874b;
        if (c14589a == null) {
            C2668g.b("audioHelper");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        c14589a.m55647a(context, c14588a);
    }
}
