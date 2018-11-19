package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.deadshot.Deadshot;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.gestures.p394b.C14653c;
import com.tinder.reactions.gestures.target.GrandGestureMatchAvatarTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/tinder/reactions/gestures/view/GrandGestureMatchAvatarView;", "Landroid/widget/ImageView;", "Lcom/tinder/reactions/gestures/target/GrandGestureMatchAvatarTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "placeholderAvatar", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "presenter", "Lcom/tinder/reactions/gestures/presenter/GrandGestureMatchAvatarPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/reactions/gestures/presenter/GrandGestureMatchAvatarPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/reactions/gestures/presenter/GrandGestureMatchAvatarPresenter;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "showAvatar", "url", "", "showPlaceholderAvatar", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GrandGestureMatchAvatarView extends ImageView implements GrandGestureMatchAvatarTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14653c f50871a;
    /* renamed from: b */
    private final Drawable f50872b;

    public /* synthetic */ GrandGestureMatchAvatarView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public GrandGestureMatchAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f50872b = context.getResources().getDrawable(R.drawable.addaphoto_loader_icon);
        context = C14398a.m54830a(context);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
    }

    @NotNull
    public final C14653c getPresenter$Tinder_release() {
        C14653c c14653c = this.f50871a;
        if (c14653c == null) {
            C2668g.b("presenter");
        }
        return c14653c;
    }

    public final void setPresenter$Tinder_release(@NotNull C14653c c14653c) {
        C2668g.b(c14653c, "<set-?>");
        this.f50871a = c14653c;
    }

    public void showAvatar(@NotNull String str) {
        C2668g.b(str, "url");
        C0994i.b(getContext()).a(str).a(this.f50872b).a(this);
    }

    public void showPlaceholderAvatar() {
        setImageDrawable(this.f50872b);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14653c c14653c = this.f50871a;
        if (c14653c == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14653c);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }
}
