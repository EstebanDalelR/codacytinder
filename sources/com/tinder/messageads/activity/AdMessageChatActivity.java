package com.tinder.messageads.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0164c.C0163a;
import android.support.v4.content.C0432b;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import com.tinder.R;
import com.tinder.chat.activity.ChatActivity;
import com.tinder.chat.view.CensorOverflowMenu.Listener;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.common.C8563t;
import com.tinder.common.UrlClickListener;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.messageads.p298e.C9908a;
import com.tinder.messageads.target.AdMessageChatTarget;
import com.tinder.utils.C15365p;
import com.tinder.utils.at;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014J\b\u0010\u001e\u001a\u00020\u0017H\u0014J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lcom/tinder/messageads/activity/AdMessageChatActivity;", "Lcom/tinder/chat/activity/ChatActivity;", "Lcom/tinder/messageads/target/AdMessageChatTarget;", "()V", "avatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "getAvatarView$Tinder_release", "()Lcom/tinder/chat/view/ChatAvatarView;", "setAvatarView$Tinder_release", "(Lcom/tinder/chat/view/ChatAvatarView;)V", "messageView", "Landroid/widget/TextView;", "getMessageView$Tinder_release", "()Landroid/widget/TextView;", "setMessageView$Tinder_release", "(Landroid/widget/TextView;)V", "presenter", "Lcom/tinder/messageads/presenter/AdMessageChatPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/messageads/presenter/AdMessageChatPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/messageads/presenter/AdMessageChatPresenter;)V", "finish", "", "getLayoutResId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "openCustomTab", "url", "", "showAvatar", "showError", "showMessage", "message", "showUnMatchFailure", "showUnMatchSuccessful", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AdMessageChatActivity extends ChatActivity implements AdMessageChatTarget {
    @NotNull
    @BindView(2131361843)
    public ChatAvatarView avatarView;
    @Inject
    @NotNull
    /* renamed from: e */
    public C9908a f45465e;
    /* renamed from: f */
    private HashMap f45466f;
    @NotNull
    @BindView(2131361844)
    public TextView messageView;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "match", "Lcom/tinder/domain/match/model/MessageAdMatch;", "kotlin.jvm.PlatformType", "onDeleteSponsoredMessageClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.AdMessageChatActivity$a */
    static final class C12114a implements Listener {
        /* renamed from: a */
        final /* synthetic */ AdMessageChatActivity f39292a;

        C12114a(AdMessageChatActivity adMessageChatActivity) {
            this.f39292a = adMessageChatActivity;
        }

        public final void onDeleteSponsoredMessageClick(MessageAdMatch messageAdMatch) {
            C9908a r = this.f39292a.mo11525r();
            C2668g.a(messageAdMatch, "match");
            r.m40733a(messageAdMatch);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/messageads/activity/AdMessageChatActivity$showMessage$1", "Lcom/tinder/common/UrlClickListener;", "(Lcom/tinder/messageads/activity/AdMessageChatActivity;)V", "onUrlClick", "", "span", "Landroid/text/style/URLSpan;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.activity.AdMessageChatActivity$b */
    public static final class C12115b implements UrlClickListener {
        /* renamed from: a */
        final /* synthetic */ AdMessageChatActivity f39293a;

        C12115b(AdMessageChatActivity adMessageChatActivity) {
            this.f39293a = adMessageChatActivity;
        }

        public void onUrlClick(@NotNull URLSpan uRLSpan) {
            C2668g.b(uRLSpan, "span");
            this.f39293a.mo11525r().m40738f();
            if (C15365p.a(this.f39293a)) {
                AdMessageChatActivity adMessageChatActivity = this.f39293a;
                uRLSpan = uRLSpan.getURL();
                C2668g.a(uRLSpan, "span.url");
                adMessageChatActivity.m54598a(uRLSpan);
                return;
            }
            uRLSpan.onClick(this.f39293a.mo11524q());
        }
    }

    /* renamed from: b */
    public View mo11519b(int i) {
        if (this.f45466f == null) {
            this.f45466f = new HashMap();
        }
        View view = (View) this.f45466f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45466f.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: d */
    protected int mo11520d() {
        return R.layout.activity_ad_message_chat;
    }

    @NotNull
    /* renamed from: q */
    public final TextView mo11524q() {
        TextView textView = this.messageView;
        if (textView == null) {
            C2668g.b("messageView");
        }
        return textView;
    }

    @NotNull
    /* renamed from: r */
    public final C9908a mo11525r() {
        C9908a c9908a = this.f45465e;
        if (c9908a == null) {
            C2668g.b("presenter");
        }
        return c9908a;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        provideChatActivityComponent().inject(this);
        m54557e().setOverflowClickListener(new C12114a(this));
    }

    protected void onStart() {
        super.onStart();
        C9908a c9908a = this.f45465e;
        if (c9908a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c9908a);
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
    }

    public void finish() {
        C9908a c9908a = this.f45465e;
        if (c9908a == null) {
            C2668g.b("presenter");
        }
        c9908a.m40737e();
        super.finish();
    }

    public void showMessage(@NotNull String str) {
        C2668g.b(str, "message");
        TextView textView = this.messageView;
        if (textView == null) {
            C2668g.b("messageView");
        }
        C8563t.m36564a(textView, str, new C12115b(this));
    }

    public void showAvatar(@NotNull String str) {
        C2668g.b(str, "url");
        ChatAvatarView chatAvatarView = this.avatarView;
        if (chatAvatarView == null) {
            C2668g.b("avatarView");
        }
        chatAvatarView.m36175a(str);
    }

    public void showError() {
        Toast.makeText(this, R.string.error, 0).show();
        finish();
    }

    public void showUnMatchFailure() {
        at.f47621a.a(this, R.string.error_unmatch_notification);
    }

    public void showUnMatchSuccessful() {
        finish();
    }

    /* renamed from: a */
    private final void m54598a(String str) {
        C0163a c0163a = new C0163a();
        Context context = this;
        c0163a.a(context, R.anim.enter_right_to_left, R.anim.enter_left_to_right);
        c0163a.b(context, R.anim.exit_left_to_right, R.anim.exit_right_to_left);
        c0163a.a(true);
        c0163a.a(C0432b.c(context, R.color.white));
        c0163a.a().a(context, Uri.parse(str));
    }
}
