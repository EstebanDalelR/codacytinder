package com.tinder.chat.view.message;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.p028a.C1041b;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4331i;
import com.tinder.R;
import com.tinder.chat.view.action.ImageMessageClickingActionHandler;
import com.tinder.chat.view.model.C12749o;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tinder/chat/view/message/MessageImageView;", "Landroid/support/v7/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "imageView$delegate", "Lkotlin/Lazy;", "loadingIndicator", "getLoadingIndicator", "loadingIndicator$delegate", "bind", "", "viewModel", "Lcom/tinder/chat/view/model/ImageMessageViewModel;", "actionHandler", "Lcom/tinder/chat/view/action/ImageMessageClickingActionHandler;", "loadImage", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MessageImageView extends CardView {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f34463a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(MessageImageView.class), "loadingIndicator", "getLoadingIndicator()Landroid/widget/ImageView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(MessageImageView.class), "imageView", "getImageView()Landroid/widget/ImageView;"))};
    /* renamed from: b */
    private final Lazy f34464b;
    /* renamed from: c */
    private final Lazy f34465c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.MessageImageView$a */
    static final class C8477a implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ ImageMessageClickingActionHandler f30163a;
        /* renamed from: b */
        final /* synthetic */ C12749o f30164b;

        C8477a(ImageMessageClickingActionHandler imageMessageClickingActionHandler, C12749o c12749o) {
            this.f30163a = imageMessageClickingActionHandler;
            this.f30164b = c12749o;
        }

        public final boolean onLongClick(View view) {
            this.f30163a.onImageLongClicked(this.f30164b.m42898e(), this.f30164b.m50174a(), this.f30164b.m42905l(), this.f30164b.m42907n().m36429a(), this.f30164b.m50175b(), this.f30164b.m42903j(), this.f30164b.m50175b(), this.f30164b.m50174a());
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0003\u0018\u00010\u0010H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"com/tinder/chat/view/message/MessageImageView$loadImage$1", "Lcom/bumptech/glide/request/target/ViewTarget;", "Landroid/widget/ImageView;", "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;", "(Lcom/tinder/chat/view/message/MessageImageView;Landroid/view/View;)V", "loadingIndicatorAnimation", "Landroid/view/animation/AlphaAnimation;", "getLoadingIndicatorAnimation", "()Landroid/view/animation/AlphaAnimation;", "onLoadStarted", "", "placeholder", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.MessageImageView$b */
    public static final class C14238b extends C4331i<ImageView, C1041b> {
        /* renamed from: b */
        final /* synthetic */ MessageImageView f45126b;
        @NotNull
        /* renamed from: c */
        private final AlphaAnimation f45127c = new AlphaAnimation(0.2f, 1.0f);

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/chat/view/message/MessageImageView$loadImage$1$onResourceReady$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/chat/view/message/MessageImageView$loadImage$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.chat.view.message.MessageImageView$b$a */
        public static final class C8478a extends AnimatorListenerAdapter {
            /* renamed from: a */
            final /* synthetic */ C14238b f30165a;

            C8478a(C14238b c14238b) {
                this.f30165a = c14238b;
            }

            public void onAnimationEnd(@NotNull Animator animator) {
                C2668g.b(animator, "animation");
                this.f30165a.f45126b.getLoadingIndicator().setVisibility(8);
            }
        }

        C14238b(MessageImageView messageImageView, View view) {
            this.f45126b = messageImageView;
            super(view);
        }

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m54052a((C1041b) obj, glideAnimation);
        }

        public void onLoadStarted(@Nullable Drawable drawable) {
            super.onLoadStarted(drawable);
            this.f45126b.getImageView().setImageDrawable(null);
            this.f45126b.getLoadingIndicator().setImageDrawable(this.f45126b.getResources().getDrawable(R.drawable.bitmoji_loading_placeholder));
            if (this.f45126b.getLoadingIndicator().getAnimation() != null) {
                this.f45126b.getLoadingIndicator().getAnimation().cancel();
            }
            this.f45126b.getLoadingIndicator().setVisibility(0);
            this.f45126b.getLoadingIndicator().setAlpha(1.0f);
            this.f45127c.setDuration(750);
            this.f45127c.setRepeatCount(-1);
            this.f45127c.setRepeatMode(2);
            this.f45126b.getLoadingIndicator().startAnimation(this.f45127c);
        }

        /* renamed from: a */
        public void m54052a(@Nullable C1041b c1041b, @Nullable GlideAnimation<? super C1041b> glideAnimation) {
            this.f45126b.getLoadingIndicator().animate().cancel();
            this.f45126b.getLoadingIndicator().animate().setDuration(500).alpha(0.0f).setListener(new C8478a(this));
            this.f45126b.getImageView().setImageDrawable(c1041b);
            if (c1041b != null) {
                c1041b.start();
            }
        }
    }

    private final ImageView getImageView() {
        Lazy lazy = this.f34465c;
        KProperty kProperty = f34463a[1];
        return (ImageView) lazy.getValue();
    }

    private final ImageView getLoadingIndicator() {
        Lazy lazy = this.f34464b;
        KProperty kProperty = f34463a[0];
        return (ImageView) lazy.getValue();
    }

    public MessageImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f34464b = C18451c.a(LazyThreadSafetyMode.NONE, new MessageImageView$$special$$inlined$bindView$1(this, R.id.image_loading_placeholder));
        this.f34465c = C18451c.a(LazyThreadSafetyMode.NONE, new MessageImageView$$special$$inlined$bindView$2(this, R.id.image_content));
        CardView.inflate(context, R.layout.chat_message_image_view, this);
    }

    public /* synthetic */ MessageImageView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    /* renamed from: a */
    public final void m42719a(@NotNull C12749o c12749o, @NotNull ImageMessageClickingActionHandler imageMessageClickingActionHandler) {
        C2668g.b(c12749o, "viewModel");
        C2668g.b(imageMessageClickingActionHandler, "actionHandler");
        m42717a(c12749o);
        getImageView().setOnLongClickListener(new C8477a(imageMessageClickingActionHandler, c12749o));
    }

    /* renamed from: a */
    private final void m42717a(C12749o c12749o) {
        C0994i.b(getContext()).a(c12749o.m50174a()).a(DiskCacheStrategy.SOURCE).b(new C14238b(this, getImageView()));
    }
}
