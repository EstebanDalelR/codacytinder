package com.tinder.chat.view.message;

import android.support.annotation.DrawableRes;
import android.support.v4.content.C0432b;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.tinder.chat.view.LinkClickListenableMovementMethod;
import com.tinder.chat.view.LinkClickListenableMovementMethod.OnLinksClickedListener;
import com.tinder.chat.view.action.C10588n;
import com.tinder.chat.view.action.MessageLinkClickActionHandler;
import com.tinder.chat.view.action.MessageLongClickingActionHandler;
import com.tinder.chat.view.action.ae;
import com.tinder.chat.view.model.C12747i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0002\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0002\u001a2\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020!2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020$2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010H\u0000¨\u0006%"}, d2 = {"bindTextMessageContentView", "", "textMessageContentView", "Landroid/widget/TextView;", "activityMessageViewModel", "Lcom/tinder/chat/view/model/ActivityMessageViewModel;", "messageActionHandler", "Lcom/tinder/chat/view/action/InboundActivityMessageViewActionHandler;", "textSize", "", "bubbleDrawableId", "", "messageLongClickActionHandler", "Lcom/tinder/chat/view/action/MessageLongClickingActionHandler;", "messageLinkClickActionHandler", "Lcom/tinder/chat/view/action/MessageLinkClickActionHandler;", "Lcom/tinder/chat/view/action/OutboundActivityMessageViewActionHandler;", "Lcom/tinder/chat/view/message/InboundFeedInstagramConnectView;", "Lcom/tinder/chat/view/message/InboundFeedInstagramImageView;", "Lcom/tinder/chat/view/message/InboundFeedInstagramVideoView;", "Lcom/tinder/chat/view/message/InboundFeedLoopVideoView;", "Lcom/tinder/chat/view/message/InboundFeedNewMatchView;", "Lcom/tinder/chat/view/message/InboundFeedProfileAddPhotoView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeBioView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeSchoolView;", "Lcom/tinder/chat/view/message/InboundFeedProfileChangeWorkView;", "Lcom/tinder/chat/view/message/InboundFeedSpotifyView;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramConnectView;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramImageView;", "Lcom/tinder/chat/view/message/OutboundFeedInstagramVideoView;", "Lcom/tinder/chat/view/message/OutboundFeedLoopVideoView;", "Lcom/tinder/chat/view/message/OutboundFeedNewMatchView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileAddPhotoView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeBioView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeSchoolView;", "Lcom/tinder/chat/view/message/OutboundFeedProfileChangeWorkView;", "Lcom/tinder/chat/view/message/OutboundFeedSpotifyView;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
public final class ad {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.ad$a */
    static final class C8486a implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ MessageLongClickingActionHandler f30178a;
        /* renamed from: b */
        final /* synthetic */ C12747i f30179b;

        C8486a(MessageLongClickingActionHandler messageLongClickingActionHandler, C12747i c12747i) {
            this.f30178a = messageLongClickingActionHandler;
            this.f30179b = c12747i;
        }

        public final boolean onLongClick(View view) {
            this.f30178a.onMessageLongClicked(this.f30179b.m42909p(), this.f30179b.m42898e(), this.f30179b.m42899f(), this.f30179b.m42905l(), this.f30179b.m42907n().m36429a(), this.f30179b.m42903j());
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "onLinkClicked"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.message.ad$b */
    static final class C10601b implements OnLinksClickedListener {
        /* renamed from: a */
        final /* synthetic */ MessageLinkClickActionHandler f34498a;
        /* renamed from: b */
        final /* synthetic */ C12747i f34499b;

        C10601b(MessageLinkClickActionHandler messageLinkClickActionHandler, C12747i c12747i) {
            this.f34498a = messageLinkClickActionHandler;
            this.f34499b = c12747i;
        }

        public final void onLinkClicked(String str) {
            MessageLinkClickActionHandler messageLinkClickActionHandler = this.f34498a;
            String p = this.f34499b.m42909p();
            String f = this.f34499b.m42899f();
            C2668g.a(str, "url");
            messageLinkClickActionHandler.onLinkClicked(p, f, str, this.f34499b.m42900g());
        }
    }

    /* renamed from: a */
    public static final void m36280a(@NotNull C10608c c10608c, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10608c, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10608c.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10608c.getTextSize$Tinder_release(), c10608c.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36282a(@NotNull C10616g c10616g, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10616g, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10616g.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10616g.getTextSize$Tinder_release(), c10616g.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36281a(@NotNull C10612e c10612e, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10612e, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10612e.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10612e.getTextSize$Tinder_release(), c10612e.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36269a(@NotNull C10599a c10599a, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10599a, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10599a.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10599a.getTextSize$Tinder_release(), c10599a.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36283a(@NotNull C10618i c10618i, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10618i, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10618i.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10618i.getTextSize$Tinder_release(), c10618i.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36284a(@NotNull C10620k c10620k, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10620k, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10620k.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10620k.getTextSize$Tinder_release(), c10620k.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36285a(@NotNull C10622m c10622m, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10622m, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10622m.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10622m.getTextSize$Tinder_release(), c10622m.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36287a(@NotNull C10626q c10626q, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10626q, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10626q.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10626q.getTextSize$Tinder_release(), c10626q.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36286a(@NotNull C10624o c10624o, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10624o, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10624o.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10624o.getTextSize$Tinder_release(), c10624o.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36288a(@NotNull C10629s c10629s, @NotNull C12747i c12747i, @NotNull C10588n c10588n) {
        C2668g.b(c10629s, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(c10588n, "messageActionHandler");
        m36268a(c10629s.getTextMessageContentView$Tinder_release(), c12747i, c10588n, c10629s.getTextSize$Tinder_release(), c10629s.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36270a(@NotNull ai aiVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(aiVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(aiVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, aiVar.getTextSize$Tinder_release(), aiVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36279a(@NotNull ba baVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(baVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(baVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, baVar.getTextSize$Tinder_release(), baVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36275a(@NotNull as asVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(asVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(asVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, asVar.getTextSize$Tinder_release(), asVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36274a(@NotNull aq aqVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(aqVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(aqVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, aqVar.getTextSize$Tinder_release(), aqVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36271a(@NotNull ak akVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(akVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(akVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, akVar.getTextSize$Tinder_release(), akVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36273a(@NotNull ao aoVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(aoVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(aoVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, aoVar.getTextSize$Tinder_release(), aoVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36272a(@NotNull am amVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(amVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(amVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, amVar.getTextSize$Tinder_release(), amVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36276a(@NotNull au auVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(auVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(auVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, auVar.getTextSize$Tinder_release(), auVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36278a(@NotNull ay ayVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(ayVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(ayVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, ayVar.getTextSize$Tinder_release(), ayVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    public static final void m36277a(@NotNull aw awVar, @NotNull C12747i c12747i, @NotNull ae aeVar) {
        C2668g.b(awVar, "$receiver");
        C2668g.b(c12747i, "activityMessageViewModel");
        C2668g.b(aeVar, "messageActionHandler");
        m36267a(awVar.getTextMessageContentView$Tinder_release(), c12747i, aeVar, awVar.getTextSize$Tinder_release(), awVar.getBubbleDrawableId$Tinder_release());
    }

    /* renamed from: a */
    private static final void m36268a(TextView textView, C12747i c12747i, C10588n c10588n, float f, @DrawableRes int i) {
        m36266a(textView, c12747i, c10588n, c10588n, f, i);
    }

    /* renamed from: a */
    private static final void m36267a(TextView textView, C12747i c12747i, ae aeVar, float f, @DrawableRes int i) {
        m36266a(textView, c12747i, aeVar, aeVar, f, i);
    }

    /* renamed from: a */
    private static final void m36266a(TextView textView, C12747i c12747i, MessageLongClickingActionHandler messageLongClickingActionHandler, MessageLinkClickActionHandler messageLinkClickActionHandler, float f, @DrawableRes int i) {
        i = C0432b.a(textView.getContext(), i);
        if (i == 0) {
            C2668g.a();
        }
        textView.setText(c12747i.m42899f());
        textView.setBackground(i);
        textView.setTextSize(0, f);
        textView.setOnLongClickListener((OnLongClickListener) new C8486a(messageLongClickingActionHandler, c12747i));
        textView.setMovementMethod((MovementMethod) new LinkClickListenableMovementMethod((OnLinksClickedListener) new C10601b(messageLinkClickActionHandler, c12747i)));
    }
}
