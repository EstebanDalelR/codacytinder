package com.tinder.chat.view.message;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import com.tinder.chat.view.message.C8490z.C8489a;
import com.tinder.chat.view.model.C12747i;
import com.tinder.chat.view.model.C12748m;
import com.tinder.chat.view.model.C12749o;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.ag;
import com.tinder.chat.view.model.am;
import com.tinder.common.view.extension.C8586f;
import com.tinder.deeplink.TinderSchemaParser.ChatSupportedDeeplinks;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ae;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Þ\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u001b\u0010\u0010\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0002\u001a\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0000\u001a\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0002\u001a<\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0014H\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002\u001a\n\u0010\u0011\u001a\u00020\n*\u00020\"\u001a\n\u0010\u0011\u001a\u00020\n*\u00020#\u001a\u001a\u0010$\u001a\u00020\n*\u00020%2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020'2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020(2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020)2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020*2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020+2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020,2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020-2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020.2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020/2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u0002002\u0006\u0010\r\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u0002022\u0006\u0010\r\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u0002042\u0006\u0010\r\u001a\u0002052\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020\"2\u0006\u0010\r\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u0002072\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u0002082\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u0002092\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020:2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020;2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020<2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020=2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020>2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020?2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020@2\u0006\u0010\r\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020A2\u0006\u0010\r\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020B2\u0006\u0010\r\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020C2\u0006\u0010\r\u001a\u0002052\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001a\u0010$\u001a\u00020\n*\u00020#2\u0006\u0010\r\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"#\u0010\u0004\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bX\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"DEEPLINK_PATH_REGEX", "", "DEEPLINK_PATTERN", "Ljava/util/regex/Pattern;", "showTimestampBasedOnPosition", "Lkotlin/Function1;", "Lcom/tinder/chat/view/model/MessageViewModel;", "", "Lkotlin/ExtensionFunctionType;", "bind", "", "timestampView", "Landroid/widget/TextView;", "viewModel", "formatter", "Lcom/tinder/chat/view/message/MessageTimestampFormatter;", "shouldShowTimestamp", "bindDeepLinkify", "textView", "getChatSupportedDeeplinkToHumanReadableMap", "", "context", "Landroid/content/Context;", "sanitizeChatDeepLinksWithHumanReadableText", "sanitizeLinksWithHumanReadableText", "urlSpan", "Landroid/text/style/URLSpan;", "url", "readableText", "urlReadableTextMap", "styledText", "", "formattedDateAndTime", "Lcom/tinder/chat/view/message/MessageTimestampFormatter$FormattedDateAndTime;", "Lcom/tinder/chat/view/message/InboundTextMessageView;", "Lcom/tinder/chat/view/message/OutboundTextMessageView;", "bindTimestampView", "Lcom/tinder/chat/view/message/InboundFeedInstagramConnectView;", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "Lcom/tinder/chat/view/message/InboundFeedInstagramImageView;", "Lcom/tinder/chat/view/message/InboundFeedInstagramVideoView;", "Lcom/tinder/chat/view/message/InboundFeedLoopVideoView;", "Lcom/tinder/chat/view/message/InboundFeedNewMatchView;", "Lcom/tinder/chat/view/message/InboundFeedProfileAddPhotoView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeBioView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeSchoolView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeWorkView;", "Lcom/tinder/chat/view/message/InboundFeedSpotifyView;", "Lcom/tinder/chat/view/message/InboundGifMessageView;", "Lcom/tinder/chat/view/model/GifMessageViewModel;", "Lcom/tinder/chat/view/message/InboundImageMessageView;", "Lcom/tinder/chat/view/model/ImageMessageViewModel;", "Lcom/tinder/chat/view/message/InboundReactionMessageView;", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "Lcom/tinder/chat/view/model/TextMessageViewModel;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramConnectView;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramImageView;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramVideoView;", "Lcom/tinder/chat/view/message/OutboundFeedLoopVideoView;", "Lcom/tinder/chat/view/message/OutboundFeedNewMatchView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileAddPhotoView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeBioView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeSchoolView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeWorkView;", "Lcom/tinder/chat/view/message/OutboundFeedSpotifyView;", "Lcom/tinder/chat/view/message/OutboundGifMessageView;", "Lcom/tinder/chat/view/message/OutboundImageMessageView;", "Lcom/tinder/chat/view/message/OutboundReactionMessageView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class ah {
    /* renamed from: a */
    private static final Pattern f30187a;
    /* renamed from: b */
    private static final Function1<MessageViewModel<?>, Boolean> f30188b = C13751x5145f67b.f43715a;

    static {
        Pattern compile = Pattern.compile("tinder://[a-zA-Z]+/?[a-zA-Z]*/?", 0);
        C2668g.a(compile, "java.util.regex.Pattern.compile(this, flags)");
        f30187a = compile;
    }

    /* renamed from: a */
    public static final void m36306a(@NotNull InboundTextMessageView inboundTextMessageView) {
        C2668g.b(inboundTextMessageView, "$receiver");
        m36301a(inboundTextMessageView.getTextMessageContentView$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36310a(@NotNull OutboundTextMessageView outboundTextMessageView) {
        C2668g.b(outboundTextMessageView, "$receiver");
        m36301a(outboundTextMessageView.getTextMessageContentView$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36307a(@NotNull InboundTextMessageView inboundTextMessageView, @NotNull am amVar, @NotNull C8490z c8490z) {
        C2668g.b(inboundTextMessageView, "$receiver");
        C2668g.b(amVar, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(inboundTextMessageView.getTimestampView$Tinder_release(), amVar, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36311a(@NotNull OutboundTextMessageView outboundTextMessageView, @NotNull am amVar, @NotNull C8490z c8490z) {
        C2668g.b(outboundTextMessageView, "$receiver");
        C2668g.b(amVar, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(outboundTextMessageView.getTimestampView$Tinder_release(), amVar, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36304a(@NotNull InboundGifMessageView inboundGifMessageView, @NotNull C12748m c12748m, @NotNull C8490z c8490z) {
        C2668g.b(inboundGifMessageView, "$receiver");
        C2668g.b(c12748m, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(inboundGifMessageView.getTimestampView$Tinder_release(), c12748m, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36308a(@NotNull OutboundGifMessageView outboundGifMessageView, @NotNull C12748m c12748m, @NotNull C8490z c8490z) {
        C2668g.b(outboundGifMessageView, "$receiver");
        C2668g.b(c12748m, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(outboundGifMessageView.getTimestampView$Tinder_release(), c12748m, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36305a(@NotNull InboundImageMessageView inboundImageMessageView, @NotNull C12749o c12749o, @NotNull C8490z c8490z) {
        C2668g.b(inboundImageMessageView, "$receiver");
        C2668g.b(c12749o, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(inboundImageMessageView.getTimestampView$Tinder_release(), c12749o, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36309a(@NotNull OutboundImageMessageView outboundImageMessageView, @NotNull C12749o c12749o, @NotNull C8490z c8490z) {
        C2668g.b(outboundImageMessageView, "$receiver");
        C2668g.b(c12749o, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(outboundImageMessageView.getTimestampView$Tinder_release(), c12749o, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36333a(@NotNull C10633w c10633w, @NotNull ag agVar, @NotNull C8490z c8490z) {
        C2668g.b(c10633w, "$receiver");
        C2668g.b(agVar, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10633w.getTimestampView(), agVar, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36323a(@NotNull be beVar, @NotNull ag agVar, @NotNull C8490z c8490z) {
        C2668g.b(beVar, "$receiver");
        C2668g.b(agVar, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(beVar.getTimestampView(), agVar, c8490z, f30188b);
    }

    /* renamed from: a */
    public static final void m36325a(@NotNull C10612e c10612e, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10612e, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10612e.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$1.f43705a);
    }

    /* renamed from: a */
    public static final void m36326a(@NotNull C10616g c10616g, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10616g, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10616g.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$2.f43707a);
    }

    /* renamed from: a */
    public static final void m36324a(@NotNull C10608c c10608c, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10608c, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10608c.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$3.f43708a);
    }

    /* renamed from: a */
    public static final void m36327a(@NotNull C10618i c10618i, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10618i, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10618i.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$4.f43709a);
    }

    /* renamed from: a */
    public static final void m36312a(@NotNull C10599a c10599a, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10599a, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10599a.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$5.f43710a);
    }

    /* renamed from: a */
    public static final void m36328a(@NotNull C10620k c10620k, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10620k, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10620k.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$6.f43711a);
    }

    /* renamed from: a */
    public static final void m36329a(@NotNull C10622m c10622m, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10622m, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10622m.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$7.f43712a);
    }

    /* renamed from: a */
    public static final void m36331a(@NotNull C10626q c10626q, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10626q, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10626q.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$8.f43713a);
    }

    /* renamed from: a */
    public static final void m36330a(@NotNull C10624o c10624o, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10624o, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10624o.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$9.f43714a);
    }

    /* renamed from: a */
    public static final void m36319a(@NotNull au auVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(auVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(auVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$10.f43695a);
    }

    /* renamed from: a */
    public static final void m36321a(@NotNull ay ayVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(ayVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(ayVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$11.f43696a);
    }

    /* renamed from: a */
    public static final void m36320a(@NotNull aw awVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(awVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(awVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$12.f43697a);
    }

    /* renamed from: a */
    public static final void m36313a(@NotNull ai aiVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(aiVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(aiVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$13.f43698a);
    }

    /* renamed from: a */
    public static final void m36318a(@NotNull as asVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(asVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(asVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$14.f43699a);
    }

    /* renamed from: a */
    public static final void m36317a(@NotNull aq aqVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(aqVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(aqVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$15.f43700a);
    }

    /* renamed from: a */
    public static final void m36314a(@NotNull ak akVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(akVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(akVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$16.f43701a);
    }

    /* renamed from: a */
    public static final void m36315a(@NotNull am amVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(amVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(amVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$17.f43702a);
    }

    /* renamed from: a */
    public static final void m36316a(@NotNull ao aoVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(aoVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(aoVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$18.f43703a);
    }

    /* renamed from: a */
    public static final void m36332a(@NotNull C10629s c10629s, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(c10629s, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(c10629s.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$19.f43704a);
    }

    /* renamed from: a */
    public static final void m36322a(@NotNull ba baVar, @NotNull C12747i c12747i, @NotNull C8490z c8490z) {
        C2668g.b(baVar, "$receiver");
        C2668g.b(c12747i, "viewModel");
        C2668g.b(c8490z, "formatter");
        m36303a(baVar.getTimestampView$Tinder_release(), c12747i, c8490z, MessageViewTimestampBindingExtensionsKt$bindTimestampView$20.f43706a);
    }

    /* renamed from: a */
    public static final void m36301a(@NotNull TextView textView) {
        C2668g.b(textView, "textView");
        Linkify.addLinks(textView, 15);
        Linkify.addLinks(textView, f30187a, "");
        m36334b(textView);
    }

    /* renamed from: a */
    private static final void m36303a(TextView textView, MessageViewModel<?> messageViewModel, C8490z c8490z, Function1<? super MessageViewModel<?>, Boolean> function1) {
        if (((Boolean) function1.invoke(messageViewModel)).booleanValue() != null) {
            function1 = textView.getContext();
            C2668g.a(function1, "timestampView.context");
            textView.setText(m36299a(c8490z.m36342a(function1, messageViewModel.m42900g())));
            messageViewModel = null;
        } else {
            messageViewModel = 8;
        }
        textView.setVisibility(messageViewModel);
    }

    /* renamed from: a */
    private static final CharSequence m36299a(C8489a c8489a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c8489a.m36335a());
        stringBuilder.append(c8489a.m36337c());
        stringBuilder.append(c8489a.m36336b());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(stringBuilder.toString());
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, c8489a.m36335a().length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    private static final void m36334b(TextView textView) {
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        Spannable spannable = (Spannable) text;
        if (spannable != null) {
            int i = 0;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            C2668g.a(uRLSpanArr, "existingSpans");
            if (((uRLSpanArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                Context context = textView.getContext();
                C2668g.a(context, "textView.context");
                Map a = m36300a(context);
                int length = uRLSpanArr.length;
                while (i < length) {
                    URLSpan uRLSpan = uRLSpanArr[i];
                    C2668g.a(uRLSpan, "urlSpan");
                    String url = uRLSpan.getURL();
                    C2668g.a(url, "urlSpan.url");
                    Locale locale = Locale.US;
                    C2668g.a(locale, "Locale.US");
                    if (url == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    url = url.toLowerCase(locale);
                    C2668g.a(url, "(this as java.lang.String).toLowerCase(locale)");
                    String str = (String) a.get(url);
                    if (str != null) {
                        m36302a(textView, uRLSpan, url, str, a);
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private static final Map<String, String> m36300a(Context context) {
        ChatSupportedDeeplinks[] values = ChatSupportedDeeplinks.values();
        Map<String, String> linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
        for (ChatSupportedDeeplinks chatSupportedDeeplinks : values) {
            String deepLink = chatSupportedDeeplinks.getDeepLink();
            Locale locale = Locale.US;
            C2668g.a(locale, "Locale.US");
            if (deepLink == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            deepLink = deepLink.toLowerCase(locale);
            C2668g.a(deepLink, "(this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put(deepLink, context.getString(chatSupportedDeeplinks.getReadableTextResId()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private static final void m36302a(TextView textView, URLSpan uRLSpan, String str, String str2, Map<String, String> map) {
        CharSequence text = textView.getText();
        if (text == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.text.Spannable");
        }
        Spannable spannable = (Spannable) text;
        int spanStart = spannable.getSpanStart(uRLSpan);
        int spanFlags = spannable.getSpanFlags(uRLSpan);
        spannable.removeSpan(uRLSpan);
        uRLSpan = C8586f.m36612a(spannable, str, str2, map);
        uRLSpan.setSpan(new URLSpan(str), spanStart, str2.length() + spanStart, spanFlags);
        textView.setText((CharSequence) uRLSpan);
    }
}
