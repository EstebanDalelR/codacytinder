package com.tinder.data.message;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.activityfeed.ApiActivityFeedItem;
import com.tinder.api.model.common.ApiMessage;
import com.tinder.api.model.common.ApiMessageMedia;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C2646o;
import com.tinder.data.adapter.p208a.C10727b;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.Reaction;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0012H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/data/message/MessageApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/message/Message;", "Lcom/tinder/api/model/common/ApiMessage;", "dateTimeApiAdapter", "Lcom/tinder/data/adapter/DateTimeApiAdapter;", "messageTypeApiAdapter", "Lcom/tinder/data/message/MessageTypeApiAdapter;", "giphyUrlToGifMapper", "Lcom/tinder/data/message/GiphyUrlToGifMapper;", "reactionTypeToReactionMapper", "Lcom/tinder/data/message/ReactionTypeToReactionMapper;", "activityFeedItemApiAdapter", "Lcom/tinder/data/adapter/activityfeed/ActivityFeedItemApiAdapter;", "messageMediaApiAdapter", "Lcom/tinder/data/message/MessageMediaApiAdapter;", "(Lcom/tinder/data/adapter/DateTimeApiAdapter;Lcom/tinder/data/message/MessageTypeApiAdapter;Lcom/tinder/data/message/GiphyUrlToGifMapper;Lcom/tinder/data/message/ReactionTypeToReactionMapper;Lcom/tinder/data/adapter/activityfeed/ActivityFeedItemApiAdapter;Lcom/tinder/data/message/MessageMediaApiAdapter;)V", "apiMessageType", "", "messageTypeString", "createActivityMessageOrFallbackToTextMessage", "apiMessage", "createGifMessage", "Lcom/tinder/domain/message/GifMessage;", "createImageMessageOrFallbackToTextMessage", "createReactionMessage", "Lcom/tinder/domain/message/ReactionMessage;", "createSystemMessage", "Lcom/tinder/domain/message/SystemMessage;", "createTextMessage", "Lcom/tinder/domain/message/TextMessage;", "fromApi", "messageType", "Lcom/tinder/data/message/MessageType;", "sentDate", "Lorg/joda/time/DateTime;", "dateString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.m */
public final class C10839m extends C2646o<Message, ApiMessage> {
    /* renamed from: a */
    private final C10738l f35451a;
    /* renamed from: b */
    private final av f35452b;
    /* renamed from: c */
    private final C10837i f35453c;
    /* renamed from: d */
    private final bc f35454d;
    /* renamed from: e */
    private final C10727b f35455e;
    /* renamed from: f */
    private final ao f35456f;

    /* renamed from: b */
    private final String m43294b(String str) {
        return str != null ? str : ManagerWebServices.PARAM_TEXT;
    }

    @Inject
    public C10839m(@NotNull C10738l c10738l, @NotNull av avVar, @NotNull C10837i c10837i, @NotNull bc bcVar, @NotNull C10727b c10727b, @NotNull ao aoVar) {
        C2668g.b(c10738l, "dateTimeApiAdapter");
        C2668g.b(avVar, "messageTypeApiAdapter");
        C2668g.b(c10837i, "giphyUrlToGifMapper");
        C2668g.b(bcVar, "reactionTypeToReactionMapper");
        C2668g.b(c10727b, "activityFeedItemApiAdapter");
        C2668g.b(aoVar, "messageMediaApiAdapter");
        this.f35451a = c10738l;
        this.f35452b = avVar;
        this.f35453c = c10837i;
        this.f35454d = bcVar;
        this.f35455e = c10727b;
        this.f35456f = aoVar;
    }

    @NotNull
    /* renamed from: a */
    public Message m43301a(@NotNull ApiMessage apiMessage) {
        C2668g.b(apiMessage, "apiMessage");
        switch (C8695n.f30648a[m43293b(apiMessage).ordinal()]) {
            case 1:
                return m43295c(apiMessage);
            case 2:
                return m43296d(apiMessage);
            case 3:
                return m43297e(apiMessage);
            case 4:
                return m43299g(apiMessage);
            case 5:
                return m43298f(apiMessage);
            case 6:
                return m43300h(apiMessage);
            case 7:
                return m43295c(apiMessage);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final DateTime m43292a(String str) {
        C10738l c10738l = this.f35451a;
        if (str == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        str = c10738l.m43129a(str);
        C2668g.a(str, "dateTimeApiAdapter.fromA…checkNotNull(dateString))");
        return str;
    }

    /* renamed from: b */
    private final MessageType m43293b(ApiMessage apiMessage) {
        return this.f35452b.m43283a(m43294b(apiMessage.getType()));
    }

    /* renamed from: c */
    private final TextMessage m43295c(ApiMessage apiMessage) {
        String id = apiMessage.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String matchId = apiMessage.getMatchId();
        if (matchId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String to = apiMessage.getTo();
        if (to == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String from = apiMessage.getFrom();
        if (from == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String message = apiMessage.getMessage();
        if (message != null) {
            return new TextMessage(null, id, matchId, to, from, message, m43292a(apiMessage.getSentDate()), false, false, DeliveryStatus.SUCCESS, 1, null);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: d */
    private final GifMessage m43296d(ApiMessage apiMessage) {
        C10839m c10839m = this;
        String message = apiMessage.getMessage();
        if (message == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String fixedHeightUrl = apiMessage.getFixedHeightUrl();
        if (fixedHeightUrl == null) {
            fixedHeightUrl = message;
        }
        Gif a = c10839m.f35453c.m43289a(message);
        Gif a2 = c10839m.f35453c.m43289a(fixedHeightUrl);
        String id = apiMessage.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String matchId = apiMessage.getMatchId();
        if (matchId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String to = apiMessage.getTo();
        if (to == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String from = apiMessage.getFrom();
        if (from == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String message2 = apiMessage.getMessage();
        if (message2 != null) {
            return new GifMessage(null, id, matchId, to, from, message2, m43292a(apiMessage.getSentDate()), false, false, DeliveryStatus.SUCCESS, a, a2, 1, null);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: e */
    private final ReactionMessage m43297e(ApiMessage apiMessage) {
        C10839m c10839m = this;
        String reactionId = apiMessage.getReactionId();
        if (reactionId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        Reaction a = c10839m.f35454d.m43286a(reactionId);
        String id = apiMessage.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String matchId = apiMessage.getMatchId();
        if (matchId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String to = apiMessage.getTo();
        if (to == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String from = apiMessage.getFrom();
        if (from == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String message = apiMessage.getMessage();
        if (message != null) {
            return new ReactionMessage(null, id, matchId, to, from, message, m43292a(apiMessage.getSentDate()), false, false, DeliveryStatus.SUCCESS, a, 1, null);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: f */
    private final Message m43298f(ApiMessage apiMessage) {
        String id = apiMessage.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String matchId = apiMessage.getMatchId();
        if (matchId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String to = apiMessage.getTo();
        if (to == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String from = apiMessage.getFrom();
        if (from == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String message = apiMessage.getMessage();
        if (message == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        DateTime a = m43292a(apiMessage.getSentDate());
        DeliveryStatus deliveryStatus = DeliveryStatus.SUCCESS;
        ApiMessageMedia media = apiMessage.getMedia();
        ApiMessage a2 = media != null ? this.f35456f.m43281a(media) : null;
        return a2 != null ? (Message) new ImageMessage(null, id, matchId, to, from, message, a, false, false, deliveryStatus, a2, 1, null) : (Message) new TextMessage(null, id, matchId, to, from, message, a, false, false, deliveryStatus, 1, null);
    }

    /* renamed from: g */
    private final Message m43299g(ApiMessage apiMessage) {
        String id = apiMessage.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String matchId = apiMessage.getMatchId();
        if (matchId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String to = apiMessage.getTo();
        if (to == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String from = apiMessage.getFrom();
        if (from == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String message = apiMessage.getMessage();
        if (message == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        DateTime a = m43292a(apiMessage.getSentDate());
        DeliveryStatus deliveryStatus = DeliveryStatus.SUCCESS;
        ApiActivityFeedItem activityFeed = apiMessage.getActivityFeed();
        ActivityFeedItem a2 = activityFeed != null ? this.f35455e.m43066a(activityFeed) : null;
        StringBuilder stringBuilder;
        if (a2 == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid activity feed item: ");
            stringBuilder.append(apiMessage.getActivityFeed());
            C0001a.b(new IllegalStateException(stringBuilder.toString()));
            return (Message) new TextMessage(null, id, matchId, to, from, message, a, false, false, deliveryStatus, 1, null);
        } else if (!C8696o.m37148b(a2)) {
            return (Message) new ActivityMessage(null, id, matchId, to, from, message, a, false, false, deliveryStatus, a2, 1, null);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Activity feed item with unknown activity event: ");
            stringBuilder.append(apiMessage.getActivityFeed());
            C0001a.b(new IllegalStateException(stringBuilder.toString()));
            return (Message) new TextMessage(null, id, matchId, to, from, message, a, false, false, deliveryStatus, 1, null);
        }
    }

    /* renamed from: h */
    private final SystemMessage m43300h(ApiMessage apiMessage) {
        String id = apiMessage.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String matchId = apiMessage.getMatchId();
        if (matchId == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String to = apiMessage.getTo();
        if (to == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String from = apiMessage.getFrom();
        if (from == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String message = apiMessage.getMessage();
        if (message != null) {
            return new SystemMessage(null, id, matchId, to, from, message, m43292a(apiMessage.getSentDate()), false, false, DeliveryStatus.SUCCESS, 1, null);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
