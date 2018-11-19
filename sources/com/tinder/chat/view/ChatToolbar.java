package com.tinder.chat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.analytics.C10540v.C8437a;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.presenter.ag;
import com.tinder.chat.target.ChatToolbarTarget;
import com.tinder.chat.view.CensorOverflowMenu.Listener;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.views.AvatarView;
import com.tinder.views.BadgeView;
import com.tinder.views.CustomTextView;
import java.util.List;
import javax.annotation.Nullable;
import javax.inject.Inject;
import kotlin.C15813i;

public class ChatToolbar extends Toolbar implements ChatToolbarTarget {
    @Inject
    /* renamed from: a */
    ag f34340a;
    @BindView(2131362711)
    AvatarView avatarView;
    @Inject
    /* renamed from: b */
    C8468c f34341b;
    @BindView(2131363943)
    BadgeView badgeView;
    @Inject
    /* renamed from: c */
    C10540v f34342c;
    @BindView(2131362104)
    ChatOverflowButton chatOverflowButton;
    /* renamed from: d */
    private Context f34343d;
    @Nullable
    /* renamed from: e */
    private MessageAdMatch f34344e;
    @BindView(2131362720)
    CensorOverflowMenu overflowMenu;
    @BindView(2131362107)
    CustomTextView userNameText;

    public void matchNotFound() {
    }

    public ChatToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.chat_toolbar, this);
        ButterKnife.a(this);
        m42654a();
    }

    /* renamed from: a */
    private void m42654a() {
        this.f34343d = ((ContextWrapper) getContext()).getBaseContext();
        if (this.f34343d instanceof ChatActivitySubcomponentProvider) {
            ((ChatActivitySubcomponentProvider) this.f34343d).provideChatActivityComponent().inject(this);
            return;
        }
        throw new IllegalStateException("Current dagger setup requires of using ChatToolbar in ChatActivity. The more generic approach will follow. ");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f34340a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void bindMatch(Match match) {
        if (match instanceof MessageAdMatch) {
            MessageAdMatch messageAdMatch = (MessageAdMatch) match;
            if (messageAdMatch.getMessageAdType() == Type.SPONSORED) {
                this.chatOverflowButton.setVisibility(0);
                this.overflowMenu.setVisibility(8);
                this.f34344e = messageAdMatch;
                this.avatarView.setEnabled(false);
                m42655a(match);
                if (match instanceof CoreMatch) {
                    this.badgeView.a(((CoreMatch) match).getPerson());
                }
            }
        }
        this.overflowMenu.m50125a(match);
        this.avatarView.setEnabled(true);
        m42655a(match);
        if (match instanceof CoreMatch) {
            this.badgeView.a(((CoreMatch) match).getPerson());
        }
    }

    /* renamed from: a */
    private void m42655a(Match match) {
        this.avatarView.setOnClickListener(new am(this, match));
    }

    /* renamed from: a */
    final /* synthetic */ void m42657a(Match match, View view) {
        this.f34343d.startActivity(this.f34341b.m36226a((Activity) this.f34343d, match));
        this.f34342c.m42632a(new C8437a(match.getId(), "nav"));
    }

    public void bindAvatar(List<String> list, String str) {
        this.avatarView.setAvatars((String[]) list.toArray(new String[list.size()]));
        this.userNameText.setText(str);
    }

    public void setOverflowClickListener(Listener listener) {
        this.overflowMenu.setListener(listener);
        this.chatOverflowButton.setOnDeleteSponsoredMessageSelected(new an(this, listener));
    }

    /* renamed from: a */
    final /* synthetic */ C15813i m42656a(Listener listener) {
        listener.onDeleteSponsoredMessageClick(this.f34344e);
        return C15813i.f49016a;
    }
}
