package com.tinder.chat.view;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.chat.adapter.C8411d;
import com.tinder.chat.adapter.ChatItemsAdapter;
import com.tinder.chat.adapter.ChatItemsAdapter.C8408a;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.presenter.ad;
import com.tinder.chat.target.ChatTarget;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.deadshot.Deadshot;
import com.tinder.reactions.drawer.mediator.AnimatorControllerInterface;
import java.util.List;
import javax.inject.Inject;

public class ChatViewContainer extends FrameLayout implements LifecycleObserver, ChatTarget, AnimatorControllerInterface {
    @Inject
    /* renamed from: a */
    String f12267a;
    @Inject
    /* renamed from: b */
    ChatItemsAdapter f12268b;
    @Inject
    /* renamed from: c */
    ad f12269c;
    @BindView(2131362105)
    RecyclerView chatRecyclerView;
    @Inject
    /* renamed from: d */
    C8411d f12270d;
    @Inject
    /* renamed from: e */
    Lifecycle f12271e;
    @BindView(2131362394)
    EmptyChatViewContainer emptyChatContainer;
    /* renamed from: f */
    private boolean f12272f;
    @BindView(2131362101)
    ProgressBar loadingIndicator;

    public ChatViewContainer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m14797a();
    }

    public void updateChat(@NonNull List<? extends ChatItem> list, @NonNull DiffResult diffResult) {
        this.f12268b.a(list, diffResult);
    }

    public void showLoading() {
        this.loadingIndicator.setVisibility(0);
        this.chatRecyclerView.setVisibility(8);
        this.emptyChatContainer.setVisibility(8);
    }

    public void showConversation() {
        this.loadingIndicator.setVisibility(8);
        this.chatRecyclerView.setVisibility(0);
        this.emptyChatContainer.setVisibility(8);
    }

    public void showEmptyScreen() {
        this.loadingIndicator.setVisibility(8);
        this.chatRecyclerView.setVisibility(8);
        this.emptyChatContainer.setVisibility(0);
    }

    public void scrollToLatestMessage() {
        this.chatRecyclerView.smoothScrollToPosition(0);
    }

    public RecyclerView getChatRecyclerView() {
        return this.chatRecyclerView;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f12269c);
        this.f12271e.mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        this.f12271e.mo37b(this);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    void onResume() {
        this.f12269c.b();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    void onPause() {
        this.f12269c.c();
    }

    /* renamed from: a */
    private void m14797a() {
        m14799b();
        inflate(getContext(), R.layout.chat_view_container, this);
        ButterKnife.m2675a((View) this);
        m14801d();
        m14800c();
    }

    /* renamed from: b */
    private void m14799b() {
        Context context = getContext();
        if (context instanceof ChatActivitySubcomponentProvider) {
            ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
            return;
        }
        throw new IllegalStateException("Current dagger setup requires of using ChatViewContainer in ChatActivity. The more generic approach will follow. ");
    }

    /* renamed from: c */
    private void m14800c() {
        LayoutManager chatViewContainer$a = new ChatViewContainer$a(getContext());
        chatViewContainer$a.setReverseLayout(true);
        chatViewContainer$a.setItemPrefetchEnabled(false);
        this.chatRecyclerView.setLayoutManager(chatViewContainer$a);
        this.chatRecyclerView.setAdapter(this.f12268b);
        this.chatRecyclerView.setItemAnimator(this.f12270d.a());
        this.chatRecyclerView.addOnScrollListener(new ChatViewContainer$1(this));
    }

    public boolean allowDrag() {
        if (!this.emptyChatContainer.isShown()) {
            if (!this.f12272f) {
                return false;
            }
        }
        return true;
    }

    public void showErrorMessage() {
        Snackbar a = Snackbar.m10756a((View) this, (int) R.string.oops, -1);
        a.m10759a((int) R.string.close_chat, new ap(this));
        a.m646b();
    }

    /* renamed from: a */
    final /* synthetic */ void m14802a(View view) {
        ((Activity) getContext()).finish();
    }

    /* renamed from: d */
    private void m14801d() {
        this.f12268b.a(new aq(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m14803a(C8408a c8408a) {
        this.f12269c.a(c8408a.a(), c8408a.b());
    }
}
