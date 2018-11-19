package com.tinder.chat.injection.components;

import com.tinder.chat.activity.ChatActivity;
import com.tinder.chat.injection.p188a.C8440a;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.chat.view.ChatAvatarView;
import com.tinder.chat.view.ChatInputBoxContainer;
import com.tinder.chat.view.ChatInputSendButtonView;
import com.tinder.chat.view.ChatToolbar;
import com.tinder.chat.view.ChatViewContainer;
import com.tinder.chat.view.EmptyChatViewContainer;
import com.tinder.chat.view.message.C10599a;
import com.tinder.chat.view.message.C10608c;
import com.tinder.chat.view.message.C10612e;
import com.tinder.chat.view.message.C10616g;
import com.tinder.chat.view.message.C10618i;
import com.tinder.chat.view.message.C10620k;
import com.tinder.chat.view.message.C10622m;
import com.tinder.chat.view.message.C10624o;
import com.tinder.chat.view.message.C10626q;
import com.tinder.chat.view.message.C10629s;
import com.tinder.chat.view.message.C10633w;
import com.tinder.chat.view.message.InboundGifMessageView;
import com.tinder.chat.view.message.InboundImageMessageView;
import com.tinder.chat.view.message.InboundTextMessageView;
import com.tinder.chat.view.message.OutboundGifMessageView;
import com.tinder.chat.view.message.OutboundImageMessageView;
import com.tinder.chat.view.message.OutboundTextMessageView;
import com.tinder.chat.view.message.SpotifyChatTrackPlayerView;
import com.tinder.chat.view.message.ai;
import com.tinder.chat.view.message.ak;
import com.tinder.chat.view.message.am;
import com.tinder.chat.view.message.ao;
import com.tinder.chat.view.message.aq;
import com.tinder.chat.view.message.as;
import com.tinder.chat.view.message.au;
import com.tinder.chat.view.message.aw;
import com.tinder.chat.view.message.ay;
import com.tinder.chat.view.message.ba;
import com.tinder.chat.view.message.be;
import com.tinder.chat.view.message.bh;
import com.tinder.messageads.activity.AdMessageChatActivity;
import com.tinder.reactions.chat.view.ChatInputExpandButtonView;
import com.tinder.reactions.drawer.mediator.C16324e;
import com.tinder.reactions.drawer.view.ChatInputEditText;
import com.tinder.reactions.gestures.animators.C14650f;
import com.tinder.reactions.gestures.animators.C16335a;
import com.tinder.reactions.gestures.animators.C16339h;
import com.tinder.reactions.gestures.animators.C16342k;
import com.tinder.reactions.gestures.view.FlingableLottieAnimationView;
import com.tinder.reactions.gestures.view.GrandGestureMatchAvatarView;
import com.tinder.reactions.gestures.view.GrandGestureSelectorView;
import com.tinder.reactions.gestures.view.SelectableGrandGestureView;
import com.tinder.reactions.navigation.mediator.C16374a;
import com.tinder.reactions.navigation.p396a.C17992a;
import com.tinder.reactions.navigation.view.GestureNavigationLoadingView;
import com.tinder.reactions.navigation.view.GrandGestureNavigationView;
import com.tinder.reactions.p382a.p383a.C14578a;
import com.tinder.reactions.view.GrandGestureLayout;
import com.tinder.video.injection.VideoInjector;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Subcomponent(modules = {C8440a.class, C14578a.class})
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001pJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00100\u001a\u000201H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u000203H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00104\u001a\u000205H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00106\u001a\u000207H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u00108\u001a\u000209H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020;H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010<\u001a\u00020=H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010@\u001a\u00020AH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010B\u001a\u00020CH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010D\u001a\u00020EH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010F\u001a\u00020GH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010H\u001a\u00020IH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010J\u001a\u00020KH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010L\u001a\u00020MH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010N\u001a\u00020OH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010P\u001a\u00020QH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010R\u001a\u00020SH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010T\u001a\u00020UH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010V\u001a\u00020WH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010X\u001a\u00020YH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020[H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020]H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010^\u001a\u00020_H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010`\u001a\u00020aH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010b\u001a\u00020cH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010d\u001a\u00020eH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010f\u001a\u00020gH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010h\u001a\u00020iH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010j\u001a\u00020kH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010l\u001a\u00020mH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010n\u001a\u00020oH&¨\u0006q"}, d2 = {"Lcom/tinder/chat/injection/components/ChatActivitySubcomponent;", "Lcom/tinder/video/injection/VideoInjector;", "inject", "", "chatActivity", "Lcom/tinder/chat/activity/ChatActivity;", "chatAvatarView", "Lcom/tinder/chat/view/ChatAvatarView;", "chatInputBoxContainer", "Lcom/tinder/chat/view/ChatInputBoxContainer;", "chatInputSendButtonView", "Lcom/tinder/chat/view/ChatInputSendButtonView;", "chatToolbar", "Lcom/tinder/chat/view/ChatToolbar;", "chatViewContainer", "Lcom/tinder/chat/view/ChatViewContainer;", "emptyChatViewContainer", "Lcom/tinder/chat/view/EmptyChatViewContainer;", "inboundFeedInstagramConnectView", "Lcom/tinder/chat/view/message/InboundFeedInstagramConnectView;", "inboundFeedInstagramImageView", "Lcom/tinder/chat/view/message/InboundFeedInstagramImageView;", "inboundFeedInstagramVideoView", "Lcom/tinder/chat/view/message/InboundFeedInstagramVideoView;", "inboundFeedLoopVideoView", "Lcom/tinder/chat/view/message/InboundFeedLoopVideoView;", "inboundFeedNewMatchView", "Lcom/tinder/chat/view/message/InboundFeedNewMatchView;", "inboundFeedProfileAddPhotoView", "Lcom/tinder/chat/view/message/InboundFeedProfileAddPhotoView;", "inboundFeedProfileChangeBioView", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeBioView;", "inboundFeedProfileChangeSchoolView", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeSchoolView;", "inboundFeedProfileChangeWorkView", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeWorkView;", "inboundFeedSpotifyView", "Lcom/tinder/chat/view/message/InboundFeedSpotifyView;", "inboundGifMessageView", "Lcom/tinder/chat/view/message/InboundGifMessageView;", "inboundImageMessageView", "Lcom/tinder/chat/view/message/InboundImageMessageView;", "inboundReactionMessageView", "Lcom/tinder/chat/view/message/InboundReactionMessageView;", "inboundTextMessageView", "Lcom/tinder/chat/view/message/InboundTextMessageView;", "outboundFeedInstagramConnectView", "Lcom/tinder/chat/view/message/OutboundFeedInstagramConnectView;", "outboundFeedInstagramImageView", "Lcom/tinder/chat/view/message/OutboundFeedInstagramImageView;", "outboundFeedInstagramVideoView", "Lcom/tinder/chat/view/message/OutboundFeedInstagramVideoView;", "outboundFeedLoopVideoView", "Lcom/tinder/chat/view/message/OutboundFeedLoopVideoView;", "outboundFeedNewMatchView", "Lcom/tinder/chat/view/message/OutboundFeedNewMatchView;", "outboundFeedProfileAddPhotoView", "Lcom/tinder/chat/view/message/OutboundFeedProfileAddPhotoView;", "outboundFeedProfileChangeBioView", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeBioView;", "outboundFeedProfileChangeSchoolView", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeSchoolView;", "outboundFeedProfileChangeWorkView", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeWorkView;", "outboundFeedSpotifyView", "Lcom/tinder/chat/view/message/OutboundFeedSpotifyView;", "outboundGifMessageView", "Lcom/tinder/chat/view/message/OutboundGifMessageView;", "outboundImageMessageView", "Lcom/tinder/chat/view/message/OutboundImageMessageView;", "outboundReactionMessageView", "Lcom/tinder/chat/view/message/OutboundReactionMessageView;", "outboundTextMessageView", "Lcom/tinder/chat/view/message/OutboundTextMessageView;", "spotifyChatTrackPlayerView", "Lcom/tinder/chat/view/message/SpotifyChatTrackPlayerView;", "typingIndicatorItemView", "Lcom/tinder/chat/view/message/TypingIndicatorItemView;", "adMessageChatActivity", "Lcom/tinder/messageads/activity/AdMessageChatActivity;", "expandButtonView", "Lcom/tinder/reactions/chat/view/ChatInputExpandButtonView;", "drawerMediator", "Lcom/tinder/reactions/drawer/mediator/DrawerMediator;", "chatInputEditText", "Lcom/tinder/reactions/drawer/view/ChatInputEditText;", "flingOnTargetGrandGestureAnimator", "Lcom/tinder/reactions/gestures/animators/FlingOnTargetGrandGestureAnimator;", "grandGestureReactionAnimator", "Lcom/tinder/reactions/gestures/animators/GrandGestureReactionAnimator;", "pullAndReleaseGrandGestureAnimator", "Lcom/tinder/reactions/gestures/animators/PullAndReleaseGrandGestureAnimator;", "strikeGrandGestureAnimator", "Lcom/tinder/reactions/gestures/animators/StrikeGrandGestureAnimator;", "flingableLottieAnimationView", "Lcom/tinder/reactions/gestures/view/FlingableLottieAnimationView;", "grandGestureMatchAvatarView", "Lcom/tinder/reactions/gestures/view/GrandGestureMatchAvatarView;", "grandGestureSelectorView", "Lcom/tinder/reactions/gestures/view/GrandGestureSelectorView;", "selectableGrandGestureView", "Lcom/tinder/reactions/gestures/view/SelectableGrandGestureView;", "gesturesAdapter", "Lcom/tinder/reactions/navigation/adapter/GesturesAdapter;", "gestureNavigationMediator", "Lcom/tinder/reactions/navigation/mediator/GestureNavigationMediator;", "gesturesNavigationLoadingView", "Lcom/tinder/reactions/navigation/view/GestureNavigationLoadingView;", "grandGestureNavigationView", "Lcom/tinder/reactions/navigation/view/GrandGestureNavigationView;", "grandGestureLayout", "Lcom/tinder/reactions/view/GrandGestureLayout;", "Builder", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
public interface ChatActivitySubcomponent extends VideoInjector {

    @dagger.Subcomponent.Builder
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/tinder/chat/injection/components/ChatActivitySubcomponent$Builder;", "", "build", "Lcom/tinder/chat/injection/components/ChatActivitySubcomponent;", "chatActivity", "Lcom/tinder/chat/activity/ChatActivity;", "matchId", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Builder {
        @NotNull
        ChatActivitySubcomponent build();

        @NotNull
        @BindsInstance
        Builder chatActivity(@NotNull ChatActivity chatActivity);

        @NotNull
        @BindsInstance
        Builder matchId(@NotNull String str);
    }

    void inject(@NotNull ChatActivity chatActivity);

    void inject(@NotNull ChatAvatarView chatAvatarView);

    void inject(@NotNull ChatInputBoxContainer chatInputBoxContainer);

    void inject(@NotNull ChatInputSendButtonView chatInputSendButtonView);

    void inject(@NotNull ChatToolbar chatToolbar);

    void inject(@NotNull ChatViewContainer chatViewContainer);

    void inject(@NotNull EmptyChatViewContainer emptyChatViewContainer);

    void inject(@NotNull InboundGifMessageView inboundGifMessageView);

    void inject(@NotNull InboundImageMessageView inboundImageMessageView);

    void inject(@NotNull InboundTextMessageView inboundTextMessageView);

    void inject(@NotNull OutboundGifMessageView outboundGifMessageView);

    void inject(@NotNull OutboundImageMessageView outboundImageMessageView);

    void inject(@NotNull OutboundTextMessageView outboundTextMessageView);

    void inject(@NotNull SpotifyChatTrackPlayerView spotifyChatTrackPlayerView);

    void inject(@NotNull C10599a c10599a);

    void inject(@NotNull ai aiVar);

    void inject(@NotNull ak akVar);

    void inject(@NotNull am amVar);

    void inject(@NotNull ao aoVar);

    void inject(@NotNull aq aqVar);

    void inject(@NotNull as asVar);

    void inject(@NotNull au auVar);

    void inject(@NotNull aw awVar);

    void inject(@NotNull ay ayVar);

    void inject(@NotNull ba baVar);

    void inject(@NotNull be beVar);

    void inject(@NotNull bh bhVar);

    void inject(@NotNull C10608c c10608c);

    void inject(@NotNull C10612e c10612e);

    void inject(@NotNull C10616g c10616g);

    void inject(@NotNull C10618i c10618i);

    void inject(@NotNull C10620k c10620k);

    void inject(@NotNull C10622m c10622m);

    void inject(@NotNull C10624o c10624o);

    void inject(@NotNull C10626q c10626q);

    void inject(@NotNull C10629s c10629s);

    void inject(@NotNull C10633w c10633w);

    void inject(@NotNull AdMessageChatActivity adMessageChatActivity);

    void inject(@NotNull ChatInputExpandButtonView chatInputExpandButtonView);

    void inject(@NotNull C16324e c16324e);

    void inject(@NotNull ChatInputEditText chatInputEditText);

    void inject(@NotNull C16335a c16335a);

    void inject(@NotNull C14650f c14650f);

    void inject(@NotNull C16339h c16339h);

    void inject(@NotNull C16342k c16342k);

    void inject(@NotNull FlingableLottieAnimationView flingableLottieAnimationView);

    void inject(@NotNull GrandGestureMatchAvatarView grandGestureMatchAvatarView);

    void inject(@NotNull GrandGestureSelectorView grandGestureSelectorView);

    void inject(@NotNull SelectableGrandGestureView selectableGrandGestureView);

    void inject(@NotNull C17992a c17992a);

    void inject(@NotNull C16374a c16374a);

    void inject(@NotNull GestureNavigationLoadingView gestureNavigationLoadingView);

    void inject(@NotNull GrandGestureNavigationView grandGestureNavigationView);

    void inject(@NotNull GrandGestureLayout grandGestureLayout);
}
