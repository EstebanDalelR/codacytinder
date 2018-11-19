package com.tinder.chat.view.message;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.view.action.GifClickingActionHandler;
import com.tinder.chat.view.model.C12748m;
import com.tinder.common.view.extension.C8581b;
import com.tinder.common.view.extension.C8583c;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/tinder/chat/view/message/MessageGifView;", "Landroid/support/v7/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gifView", "Landroid/widget/ImageView;", "getGifView$Tinder_release", "()Landroid/widget/ImageView;", "setGifView$Tinder_release", "(Landroid/widget/ImageView;)V", "loadingIndicator", "Landroid/view/View;", "getLoadingIndicator$Tinder_release", "()Landroid/view/View;", "setLoadingIndicator$Tinder_release", "(Landroid/view/View;)V", "bind", "", "viewModel", "Lcom/tinder/chat/view/model/GifMessageViewModel;", "actionHandler", "Lcom/tinder/chat/view/action/GifClickingActionHandler;", "loadGif", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MessageGifView extends CardView {
    @NotNull
    @BindView(2131362632)
    public ImageView gifView;
    @NotNull
    @BindView(2131362861)
    public View loadingIndicator;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.MessageGifView$a */
    static final class C8475a implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ GifClickingActionHandler f30159a;
        /* renamed from: b */
        final /* synthetic */ C12748m f30160b;

        C8475a(GifClickingActionHandler gifClickingActionHandler, C12748m c12748m) {
            this.f30159a = gifClickingActionHandler;
            this.f30160b = c12748m;
        }

        public final boolean onLongClick(View view) {
            this.f30159a.onGifLongClicked(this.f30160b.m42898e(), this.f30160b.m50171a(), this.f30160b.m42905l(), this.f30160b.m42907n().m36429a(), this.f30160b.m50173c(), this.f30160b.m42903j());
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.MessageGifView$b */
    static final class C8476b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ GifClickingActionHandler f30161a;
        /* renamed from: b */
        final /* synthetic */ C12748m f30162b;

        C8476b(GifClickingActionHandler gifClickingActionHandler, C12748m c12748m) {
            this.f30161a = gifClickingActionHandler;
            this.f30162b = c12748m;
        }

        public final void onClick(View view) {
            this.f30161a.onGifClicked(this.f30162b.m50171a(), this.f30162b.m42909p(), 1, this.f30162b.m50173c(), this.f30162b.m42907n().m36429a());
        }
    }

    public MessageGifView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        CardView.inflate(context, R.layout.chat_message_gif_view, this);
        ButterKnife.a(this);
    }

    public /* synthetic */ MessageGifView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @NotNull
    public final ImageView getGifView$Tinder_release() {
        ImageView imageView = this.gifView;
        if (imageView == null) {
            C2668g.b("gifView");
        }
        return imageView;
    }

    public final void setGifView$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.gifView = imageView;
    }

    @NotNull
    public final View getLoadingIndicator$Tinder_release() {
        View view = this.loadingIndicator;
        if (view == null) {
            C2668g.b("loadingIndicator");
        }
        return view;
    }

    public final void setLoadingIndicator$Tinder_release(@NotNull View view) {
        C2668g.b(view, "<set-?>");
        this.loadingIndicator = view;
    }

    /* renamed from: a */
    public final void m42715a(@NotNull C12748m c12748m, @NotNull GifClickingActionHandler gifClickingActionHandler) {
        C2668g.b(c12748m, "viewModel");
        C2668g.b(gifClickingActionHandler, "actionHandler");
        m42714a(c12748m);
        ImageView imageView = this.gifView;
        if (imageView == null) {
            C2668g.b("gifView");
        }
        imageView.setOnLongClickListener(new C8475a(gifClickingActionHandler, c12748m));
        imageView = this.gifView;
        if (imageView == null) {
            C2668g.b("gifView");
        }
        imageView.setOnClickListener(new C8476b(gifClickingActionHandler, c12748m));
    }

    /* renamed from: a */
    private final void m42714a(C12748m c12748m) {
        ImageView imageView = this.gifView;
        if (imageView == null) {
            C2668g.b("gifView");
        }
        String a = c12748m.m50171a();
        View view = this.loadingIndicator;
        if (view == null) {
            C2668g.b("loadingIndicator");
        }
        ImageView imageView2 = this.gifView;
        if (imageView2 == null) {
            C2668g.b("gifView");
        }
        C8581b.m36602a(imageView, a, view, new C8583c(0, imageView2.getLayoutParams().width, 0, c12748m.m50172b(), null, 21, null));
    }
}
