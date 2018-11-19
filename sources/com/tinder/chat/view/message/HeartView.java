package com.tinder.chat.view.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.view.action.MessageLikingActionHandler;
import com.tinder.chat.view.model.C12748m;
import com.tinder.chat.view.model.C12749o;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.ag;
import com.tinder.chat.view.model.am;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/chat/view/message/HeartView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "empty", "Landroid/widget/ImageView;", "getEmpty$Tinder_release", "()Landroid/widget/ImageView;", "setEmpty$Tinder_release", "(Landroid/widget/ImageView;)V", "full", "getFull$Tinder_release", "setFull$Tinder_release", "isFull", "", "bind", "", "viewModel", "Lcom/tinder/chat/view/model/MessageViewModel;", "actionHandler", "Lcom/tinder/chat/view/action/MessageLikingActionHandler;", "setIsFull", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class HeartView extends FrameLayout {
    /* renamed from: a */
    public static final C8471a f30154a = new C8471a();
    /* renamed from: c */
    private static final C10596b f30155c = new C10596b();
    /* renamed from: b */
    private boolean f30156b = true;
    @NotNull
    @BindView(2131362669)
    public ImageView empty;
    @NotNull
    @BindView(2131362670)
    public ImageView full;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/chat/view/message/HeartView$Companion;", "", "()V", "MESSAGE_LIKING_ACTION_HANDLER_STUB", "com/tinder/chat/view/message/HeartView$Companion$MESSAGE_LIKING_ACTION_HANDLER_STUB$1", "Lcom/tinder/chat/view/message/HeartView$Companion$MESSAGE_LIKING_ACTION_HANDLER_STUB$1;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.HeartView$a */
    public static final class C8471a {
        private C8471a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.HeartView$c */
    static final class C8472c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MessageLikingActionHandler f30150a;
        /* renamed from: b */
        final /* synthetic */ MessageViewModel f30151b;

        C8472c(MessageLikingActionHandler messageLikingActionHandler, MessageViewModel messageViewModel) {
            this.f30150a = messageLikingActionHandler;
            this.f30151b = messageViewModel;
        }

        public final void onClick(View view) {
            this.f30150a.onUnliked(this.f30151b.m42898e());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.HeartView$d */
    static final class C8473d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ MessageViewModel f30152a;
        /* renamed from: b */
        final /* synthetic */ MessageLikingActionHandler f30153b;

        C8473d(MessageViewModel messageViewModel, MessageLikingActionHandler messageLikingActionHandler) {
            this.f30152a = messageViewModel;
            this.f30153b = messageLikingActionHandler;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            int i;
            String str4 = (String) null;
            MessageViewModel messageViewModel = this.f30152a;
            if (messageViewModel instanceof am) {
                str = str4;
                str2 = str;
                str3 = "";
                i = 0;
            } else if (messageViewModel instanceof C12748m) {
                str = str4;
                str2 = str;
                str3 = ((C12748m) this.f30152a).m50173c();
                i = 1;
            } else if (messageViewModel instanceof ag) {
                str = str4;
                str2 = str;
                str3 = ((ag) this.f30152a).m50164a().getId();
                i = 2;
            } else if (messageViewModel instanceof C12749o) {
                str = ((C12749o) this.f30152a).m50175b();
                str3 = "";
                str2 = ((C12749o) this.f30152a).m50174a();
                i = 4;
            } else {
                str = str4;
                str2 = str;
                str3 = "";
                i = -1;
            }
            this.f30153b.onLiked(this.f30152a.m42898e(), this.f30152a.m42909p(), i, this.f30152a.m42899f(), str3, this.f30152a.m42907n().m36429a(), str, str2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JL\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"com/tinder/chat/view/message/HeartView$Companion$MESSAGE_LIKING_ACTION_HANDLER_STUB$1", "Lcom/tinder/chat/view/action/MessageLikingActionHandler;", "()V", "onLiked", "", "messageId", "", "matchId", "messageType", "", "messageText", "contentId", "messageIndex", "contentSource", "contentUrl", "onUnliked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.HeartView$b */
    public static final class C10596b implements MessageLikingActionHandler {
        public void onLiked(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, int i2, @Nullable String str5, @Nullable String str6) {
            C2668g.b(str, "messageId");
            C2668g.b(str2, "matchId");
            C2668g.b(str3, "messageText");
            C2668g.b(str4, "contentId");
        }

        public void onUnliked(@NotNull String str) {
            C2668g.b(str, "messageId");
        }

        C10596b() {
        }
    }

    public HeartView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.chat_message_heart_view, this);
        ButterKnife.a(this);
    }

    @NotNull
    public final ImageView getFull$Tinder_release() {
        ImageView imageView = this.full;
        if (imageView == null) {
            C2668g.b("full");
        }
        return imageView;
    }

    public final void setFull$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.full = imageView;
    }

    @NotNull
    public final ImageView getEmpty$Tinder_release() {
        ImageView imageView = this.empty;
        if (imageView == null) {
            C2668g.b("empty");
        }
        return imageView;
    }

    public final void setEmpty$Tinder_release(@NotNull ImageView imageView) {
        C2668g.b(imageView, "<set-?>");
        this.empty = imageView;
    }

    /* renamed from: a */
    public static /* synthetic */ void m36227a(HeartView heartView, MessageViewModel messageViewModel, MessageLikingActionHandler messageLikingActionHandler, int i, Object obj) {
        if ((i & 2) != 0) {
            messageLikingActionHandler = f30155c;
        }
        heartView.m36228a(messageViewModel, messageLikingActionHandler);
    }

    /* renamed from: a */
    public final void m36228a(@NotNull MessageViewModel<?> messageViewModel, @NotNull MessageLikingActionHandler messageLikingActionHandler) {
        C2668g.b(messageViewModel, "viewModel");
        C2668g.b(messageLikingActionHandler, "actionHandler");
        setIsFull(messageViewModel.m42903j());
        boolean a = (C2668g.a(messageLikingActionHandler, f30155c) ^ 1) & (messageViewModel.m42907n().m36433e() | this.f30156b);
        setEnabled(a);
        ImageView imageView = this.empty;
        if (imageView == null) {
            C2668g.b("empty");
        }
        imageView.setVisibility(a ? 0 : 4);
        if (!a) {
            setOnClickListener(null);
        } else if (this.f30156b) {
            setOnClickListener(new C8472c(messageLikingActionHandler, messageViewModel));
        } else {
            setOnClickListener(new C8473d(messageViewModel, messageLikingActionHandler));
        }
    }

    private final void setIsFull(boolean z) {
        this.f30156b = z;
        if (z) {
            z = this.full;
            if (!z) {
                C2668g.b("full");
            }
            z.setScaleX(1.0f);
            z = this.full;
            if (!z) {
                C2668g.b("full");
            }
            z.setScaleY(1.0f);
            return;
        }
        z = this.full;
        if (!z) {
            C2668g.b("full");
        }
        z.setScaleX(0.0f);
        z = this.full;
        if (!z) {
            C2668g.b("full");
        }
        z.setScaleY(0.0f);
    }
}
