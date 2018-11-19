package com.tinder.chat.injection.p188a;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.chat.activity.ChatActivity;
import com.tinder.chat.analytics.C10531g;
import com.tinder.chat.analytics.C10533j;
import com.tinder.chat.analytics.C10536o;
import com.tinder.chat.analytics.C10537q;
import com.tinder.chat.analytics.C10540v;
import com.tinder.chat.analytics.C10542z;
import com.tinder.chat.analytics.aj;
import com.tinder.chat.analytics.am;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.action.C10584h;
import com.tinder.chat.view.action.C10585j;
import com.tinder.chat.view.action.C10586k;
import com.tinder.chat.view.action.C10593t;
import com.tinder.chat.view.action.C8464u;
import com.tinder.chat.view.action.C8465w;
import com.tinder.chat.view.action.C8467y;
import com.tinder.chat.view.action.ChatContextualMenuDisplayAction;
import com.tinder.chat.view.action.FullscreenGifDisplayAction;
import com.tinder.chat.view.action.FullscreenImageDisplayAction;
import com.tinder.chat.view.action.MatchProfileDisplayAction;
import com.tinder.chat.view.action.aa;
import com.tinder.chat.view.model.ChatScreenState;
import com.tinder.chat.view.provider.C10645d;
import com.tinder.chat.view.provider.C10646h;
import com.tinder.chat.view.provider.C10647l;
import com.tinder.chat.view.provider.C10649u;
import com.tinder.chat.view.provider.C10650w;
import com.tinder.chat.view.provider.C8514q.C8513c;
import com.tinder.chat.view.provider.ChatEmptyStateNotifier;
import com.tinder.chat.view.provider.ChatEmptyStateProvider;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesNotifier;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesNotifier;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatNewMessagesNotifier;
import com.tinder.chat.view.provider.ChatNewMessagesProvider;
import com.tinder.common.tracker.recyclerview.rx.C10706a;
import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import com.tinder.data.keyboard.C10789c;
import com.tinder.data.keyboard.KeyboardHeightNotifier;
import com.tinder.data.keyboard.KeyboardHeightProvider;
import com.tinder.reactions.audio.C16282c;
import com.tinder.reactions.audio.ReactionsAudioStreamer;
import com.tinder.typingindicator.worker.TypingIndicatorVisibilityAnalyticsWorker;
import dagger.Module;
import dagger.Provides;
import java8.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007Ji\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\u0015\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020.2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b/J\u0015\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4J\u0015\u00105\u001a\u0002062\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b7J!\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:092\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>J\r\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\bFJ\u0015\u0010G\u001a\u00020H2\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\bIJ\u001f\u0010J\u001a\u00020K2\b\b\u0001\u0010\n\u001a\u00020\u00042\u0006\u0010L\u001a\u00020MH\u0001¢\u0006\u0002\bNJ\u0017\u0010O\u001a\u00020P2\b\b\u0001\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0001¢\u0006\u0002\bVJ\u0015\u0010W\u001a\u00020X2\u0006\u0010T\u001a\u00020UH\u0001¢\u0006\u0002\bYJ\u0017\u0010Z\u001a\u00020[2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\\J\u001f\u0010]\u001a\u00020^2\b\b\u0001\u0010\n\u001a\u00020\u00042\u0006\u0010_\u001a\u00020`H\u0001¢\u0006\u0002\baJ\r\u0010b\u001a\u00020cH\u0001¢\u0006\u0002\bdJ\u0015\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hH\u0001¢\u0006\u0002\biJ\r\u0010j\u001a\u00020kH\u0001¢\u0006\u0002\blJ\r\u0010m\u001a\u00020nH\u0001¢\u0006\u0002\bo¨\u0006p"}, d2 = {"Lcom/tinder/chat/injection/modules/ChatActivityModule;", "", "()V", "provideChatActivityContext", "Landroid/content/Context;", "chatActivity", "Lcom/tinder/chat/activity/ChatActivity;", "provideChatActivityContext$Tinder_release", "provideChatContextualMenuDisplayAction", "Lcom/tinder/chat/view/action/ChatContextualMenuDisplayAction;", "chatActivityContext", "matchId", "", "copyToClipboardAction", "Lcom/tinder/chat/view/action/MessageTextCopyToClipboardAction;", "likingAction", "Lcom/tinder/chat/view/action/MessageLikingAction;", "retryAction", "Lcom/tinder/chat/view/action/MessageRetryAction;", "deleteAction", "Lcom/tinder/chat/view/action/MessageDeleteAction;", "deleteMessageEvent", "Lcom/tinder/chat/analytics/ChatDeleteMessageEventDispatcher;", "sendErrorOptionEvent", "Lcom/tinder/chat/analytics/ChatCancelSendErrorOptionEventDispatcher;", "chatLongPressMessageEvent", "Lcom/tinder/chat/analytics/ChatLongPressMessageEventDispatcher;", "chatLongPressOptionEvent", "Lcom/tinder/chat/analytics/ChatLongPressOptionEventDispatcher;", "chatSelectSendErrorOptionsEventDispatcher", "Lcom/tinder/chat/analytics/ChatSelectSendErrorOptionsEventDispatcher;", "provideChatContextualMenuDisplayAction$Tinder_release", "provideChatInputGifSelectorStatusUpdatesNotifier", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdatesNotifier;", "chatInputGifSelectorStateUpdates", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdates;", "provideChatInputGifSelectorStatusUpdatesNotifier$Tinder_release", "provideChatInputGifSelectorStatusUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatInputGifSelectorStateUpdatesProvider;", "provideChatInputGifSelectorStatusUpdatesProvider$Tinder_release", "provideChatInputStatusUpdatesNotifier", "Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesNotifier;", "chatInputStateUpdates", "Lcom/tinder/chat/view/provider/ChatInputStateUpdates;", "provideChatInputStatusUpdatesNotifier$Tinder_release", "provideChatInputStatusUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;", "provideChatInputStatusUpdatesProvider$Tinder_release", "provideChatNewMessagesNotifier", "Lcom/tinder/chat/view/provider/ChatNewMessagesNotifier;", "chatNewMessagesProviderAndNotifier", "Lcom/tinder/chat/view/provider/ChatNewMessagesProviderAndNotifier;", "provideChatNewMessagesNotifier$Tinder_release", "provideChatNewMessagesProvider", "Lcom/tinder/chat/view/provider/ChatNewMessagesProvider;", "provideChatNewMessagesProvider$Tinder_release", "provideChatScreenStateProvider", "Ljava8/util/function/Supplier;", "Lrx/Observable;", "Lcom/tinder/chat/view/model/ChatScreenState;", "chatScreenStateProvider", "Lcom/tinder/chat/view/provider/ChatScreenStateProvider;", "provideChatScreenStateProvider$Tinder_release", "provideDefaultChatItemAnimator", "Landroid/support/v7/widget/RecyclerView$ItemAnimator;", "provideDefaultChatItemAnimator$Tinder_release", "provideEmptyChatNotifier", "Lcom/tinder/chat/view/provider/ChatEmptyStateNotifier;", "chatEmptyMessagesProviderAndNotifier", "Lcom/tinder/chat/view/provider/ChatEmptyMessagesProviderAndNotifier;", "provideEmptyChatNotifier$Tinder_release", "provideEmptyChatProvider", "Lcom/tinder/chat/view/provider/ChatEmptyStateProvider;", "provideEmptyChatProvider$Tinder_release", "provideFullscreenGifDisplayAction", "Lcom/tinder/chat/view/action/FullscreenGifDisplayAction;", "chatTapMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatTapMessageEventDispatcher;", "provideFullscreenGifDisplayAction$Tinder_release", "provideFullscreenImageDisplayAction", "Lcom/tinder/chat/view/action/FullscreenImageDisplayAction;", "provideFullscreenImageDisplayAction$Tinder_release", "provideKeyboardHeightNotifier", "Lcom/tinder/data/keyboard/KeyboardHeightNotifier;", "keyboardHeightProviderAndNotifier", "Lcom/tinder/data/keyboard/KeyboardHeightProviderAndNotifier;", "provideKeyboardHeightNotifier$Tinder_release", "provideKeyboardHeightProvider", "Lcom/tinder/data/keyboard/KeyboardHeightProvider;", "provideKeyboardHeightProvider$Tinder_release", "provideLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "provideLifecycle$Tinder_release", "provideMatchProfileDisplayAction", "Lcom/tinder/chat/view/action/MatchProfileDisplayAction;", "chatOpenProfileEventDispatcher", "Lcom/tinder/chat/analytics/ChatOpenProfileEventDispatcher;", "provideMatchProfileDisplayAction$Tinder_release", "provideObserveChatItemUpdatesConfig", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$Config;", "provideObserveChatItemUpdatesConfig$Tinder_release", "provideTypingIndicatorVisibilityAnalyticsWorker", "Lcom/tinder/typingindicator/worker/TypingIndicatorVisibilityAnalyticsWorker;", "chatTypingIndicatorVisibilityAnalyticsWorker", "Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker;", "provideTypingIndicatorVisibilityAnalyticsWorker$Tinder_release", "provideViewVisibleObservable", "Lcom/tinder/common/tracker/recyclerview/rx/ViewVisibleObserver;", "provideViewVisibleObservable$Tinder_release", "providesReactionsAudioStreamer", "Lcom/tinder/reactions/audio/ReactionsAudioStreamer;", "providesReactionsAudioStreamer$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.chat.injection.a.a */
public final class C8440a {
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8513c m36020a() {
        return new C8513c(0, 1, null);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final Context m36011a(@NotNull ChatActivity chatActivity) {
        C2668g.b(chatActivity, "chatActivity");
        return chatActivity;
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final ItemAnimator m36025b() {
        return new DefaultItemAnimator();
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final Lifecycle m36024b(@NotNull ChatActivity chatActivity) {
        C2668g.b(chatActivity, "chatActivity");
        chatActivity = chatActivity.getLifecycle();
        C2668g.a(chatActivity, "chatActivity.lifecycle");
        return chatActivity;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final ChatContextualMenuDisplayAction m36012a(@NotNull Context context, @NotNull String str, @NotNull aa aaVar, @NotNull C8465w c8465w, @NotNull C8467y c8467y, @NotNull C8464u c8464u, @NotNull C10533j c10533j, @NotNull C10531g c10531g, @NotNull C10536o c10536o, @NotNull C10537q c10537q, @NotNull C10542z c10542z) {
        Context context2 = context;
        C2668g.b(context2, "chatActivityContext");
        String str2 = str;
        C2668g.b(str2, "matchId");
        aa aaVar2 = aaVar;
        C2668g.b(aaVar2, "copyToClipboardAction");
        C8465w c8465w2 = c8465w;
        C2668g.b(c8465w2, "likingAction");
        C8467y c8467y2 = c8467y;
        C2668g.b(c8467y2, "retryAction");
        C8464u c8464u2 = c8464u;
        C2668g.b(c8464u2, "deleteAction");
        C10533j c10533j2 = c10533j;
        C2668g.b(c10533j2, "deleteMessageEvent");
        C10531g c10531g2 = c10531g;
        C2668g.b(c10531g2, "sendErrorOptionEvent");
        C10536o c10536o2 = c10536o;
        C2668g.b(c10536o2, "chatLongPressMessageEvent");
        C10537q c10537q2 = c10537q;
        C2668g.b(c10537q2, "chatLongPressOptionEvent");
        C10542z c10542z2 = c10542z;
        C2668g.b(c10542z2, "chatSelectSendErrorOptionsEventDispatcher");
        return new C10584h(context2, str2, aaVar2, c8465w2, c8467y2, c8464u2, c10533j2, c10531g2, c10536o2, c10537q2, c10542z2);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final FullscreenGifDisplayAction m36013a(@NotNull Context context, @NotNull aj ajVar) {
        C2668g.b(context, "chatActivityContext");
        C2668g.b(ajVar, "chatTapMessageEventDispatcher");
        return new C10586k(context, ajVar);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final FullscreenImageDisplayAction m36014a(@NotNull Context context) {
        C2668g.b(context, "chatActivityContext");
        return new C10585j(context);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final MatchProfileDisplayAction m36015a(@NotNull Context context, @NotNull C10540v c10540v) {
        C2668g.b(context, "chatActivityContext");
        C2668g.b(c10540v, "chatOpenProfileEventDispatcher");
        return new C10593t(context, c10540v);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final Supplier<Observable<ChatScreenState>> m36023a(@NotNull C10650w c10650w) {
        C2668g.b(c10650w, "chatScreenStateProvider");
        return c10650w;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final ChatInputTextStateUpdatesProvider m36018a(@NotNull C10647l c10647l) {
        C2668g.b(c10647l, "chatInputStateUpdates");
        return c10647l;
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final ChatInputTextStateUpdatesNotifier m36028b(@NotNull C10647l c10647l) {
        C2668g.b(c10647l, "chatInputStateUpdates");
        return c10647l;
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final ChatInputGifSelectorStateUpdatesProvider m36017a(@NotNull C10646h c10646h) {
        C2668g.b(c10646h, "chatInputGifSelectorStateUpdates");
        return c10646h;
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final ChatInputGifSelectorStateUpdatesNotifier m36027b(@NotNull C10646h c10646h) {
        C2668g.b(c10646h, "chatInputGifSelectorStateUpdates");
        return c10646h;
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: c */
    public final ReactionsAudioStreamer m36031c() {
        return new C16282c();
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: a */
    public final ChatNewMessagesProvider m36019a(@NotNull C10649u c10649u) {
        C2668g.b(c10649u, "chatNewMessagesProviderAndNotifier");
        return c10649u;
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: b */
    public final ChatNewMessagesNotifier m36029b(@NotNull C10649u c10649u) {
        C2668g.b(c10649u, "chatNewMessagesProviderAndNotifier");
        return c10649u;
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: a */
    public final ChatEmptyStateProvider m36016a(@NotNull C10645d c10645d) {
        C2668g.b(c10645d, "chatEmptyMessagesProviderAndNotifier");
        return c10645d;
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: b */
    public final ChatEmptyStateNotifier m36026b(@NotNull C10645d c10645d) {
        C2668g.b(c10645d, "chatEmptyMessagesProviderAndNotifier");
        return c10645d;
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: d */
    public final ViewVisibleObserver m36032d() {
        return new C10706a();
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: a */
    public final TypingIndicatorVisibilityAnalyticsWorker m36022a(@NotNull am amVar) {
        C2668g.b(amVar, "chatTypingIndicatorVisibilityAnalyticsWorker");
        return amVar;
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: a */
    public final KeyboardHeightProvider m36021a(@NotNull C10789c c10789c) {
        C2668g.b(c10789c, "keyboardHeightProviderAndNotifier");
        return c10789c;
    }

    @NotNull
    @ChatActivityScope
    @Provides
    /* renamed from: b */
    public final KeyboardHeightNotifier m36030b(@NotNull C10789c c10789c) {
        C2668g.b(c10789c, "keyboardHeightProviderAndNotifier");
        return c10789c;
    }
}
