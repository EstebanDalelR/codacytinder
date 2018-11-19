package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.chat.view.model.ChatItem.C8491a;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u00012B=\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u0016\u0010\u0004\u001a\u00028\u0000X\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000fR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000f¨\u00063"}, d2 = {"Lcom/tinder/chat/view/model/MessageViewModel;", "MESSAGE", "Lcom/tinder/domain/message/Message;", "Lcom/tinder/chat/view/model/ChatItem;", "message", "userId", "", "positionInfo", "Lcom/tinder/chat/view/model/PositionInfo;", "avatarUrl", "matchId", "collapsedMessages", "", "(Lcom/tinder/domain/message/Message;Ljava/lang/String;Lcom/tinder/chat/view/model/PositionInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAvatarUrl", "()Ljava/lang/String;", "collapsedIds", "", "getCollapsedIds", "()Ljava/util/List;", "direction", "Lcom/tinder/chat/view/model/MessageViewModel$SenderDirection;", "getDirection", "()Lcom/tinder/chat/view/model/MessageViewModel$SenderDirection;", "id", "getId", "()J", "isFailed", "", "()Z", "isLiked", "isPending", "isSeen", "getMatchId", "getMessage", "()Lcom/tinder/domain/message/Message;", "Lcom/tinder/domain/message/Message;", "messageId", "getMessageId", "getPositionInfo", "()Lcom/tinder/chat/view/model/PositionInfo;", "senderId", "getSenderId", "sentDate", "Lorg/joda/time/DateTime;", "getSentDate", "()Lorg/joda/time/DateTime;", "text", "getText", "getUserId", "SenderDirection", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class MessageViewModel<MESSAGE extends Message> implements ChatItem {
    /* renamed from: a */
    private final long f34844a;
    @NotNull
    /* renamed from: b */
    private final List<Long> f34845b;
    @NotNull
    /* renamed from: c */
    private final String f34846c;
    @NotNull
    /* renamed from: d */
    private final String f34847d;
    @NotNull
    /* renamed from: e */
    private final DateTime f34848e;
    @NotNull
    /* renamed from: f */
    private final String f34849f;
    @NotNull
    /* renamed from: g */
    private final SenderDirection f34850g;
    /* renamed from: h */
    private final boolean f34851h;
    /* renamed from: i */
    private final boolean f34852i;
    /* renamed from: j */
    private final boolean f34853j;
    /* renamed from: k */
    private final boolean f34854k;
    @NotNull
    /* renamed from: l */
    private final MESSAGE f34855l;
    @NotNull
    /* renamed from: m */
    private final String f34856m;
    @NotNull
    /* renamed from: n */
    private final C8503z f34857n;
    @NotNull
    /* renamed from: o */
    private final String f34858o;
    @NotNull
    /* renamed from: p */
    private final String f34859p;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/chat/view/model/MessageViewModel$SenderDirection;", "", "(Ljava/lang/String;I)V", "INBOUND", "OUTBOUND", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum SenderDirection {
    }

    public MessageViewModel(@NotNull MESSAGE message, @NotNull String str, @NotNull C8503z c8503z, @NotNull String str2, @NotNull String str3, @NotNull List<? extends Message> list) {
        C2668g.b(message, "message");
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        C2668g.b(c8503z, "positionInfo");
        C2668g.b(str2, "avatarUrl");
        C2668g.b(str3, "matchId");
        C2668g.b(list, "collapsedMessages");
        this.f34855l = message;
        this.f34856m = str;
        this.f34857n = c8503z;
        this.f34858o = str2;
        this.f34859p = str3;
        this.f34844a = C8501v.m36423b(this.f34855l);
        Iterable<Message> iterable = list;
        Collection collection = (Collection) new ArrayList(C19301m.a(iterable, 10));
        for (Message a : iterable) {
            collection.add(Long.valueOf(C8501v.m36423b(a)));
        }
        this.f34845b = (List) collection;
        this.f34846c = this.f34855l.getId();
        this.f34847d = this.f34855l.getText();
        this.f34848e = this.f34855l.getSentDate();
        this.f34849f = this.f34855l.getFromId();
        if (C2668g.a(this.f34856m, this.f34855l.getFromId()) != null) {
            str = SenderDirection.OUTBOUND;
        } else {
            str = SenderDirection.INBOUND;
        }
        this.f34850g = str;
        this.f34851h = this.f34855l.isLiked();
        str = this.f34855l.isSeen();
        str2 = null;
        if ((iterable instanceof Collection) == null || ((Collection) iterable).isEmpty() == null) {
            for (Message isSeen : iterable) {
                if (isSeen.isSeen() == null) {
                    message = null;
                    break;
                }
            }
        }
        message = true;
        this.f34852i = message & str;
        this.f34853j = this.f34855l.getDeliveryStatus() == DeliveryStatus.FAILED ? true : null;
        iterable = C19301m.a(list, this.f34855l);
        if ((iterable instanceof Collection) == null || ((Collection) iterable).isEmpty() == null) {
            for (Message deliveryStatus : iterable) {
                if (deliveryStatus.getDeliveryStatus() == DeliveryStatus.PENDING) {
                    str = true;
                    continue;
                } else {
                    str = null;
                    continue;
                }
                if (str != null) {
                    str2 = true;
                    break;
                }
            }
        }
        this.f34854k = str2;
    }

    public boolean hasCollapsedId(long j) {
        return C8491a.m36343a(this, j);
    }

    @NotNull
    /* renamed from: n */
    public final C8503z m42907n() {
        return this.f34857n;
    }

    @NotNull
    /* renamed from: o */
    public final String m42908o() {
        return this.f34858o;
    }

    @NotNull
    /* renamed from: p */
    public final String m42909p() {
        return this.f34859p;
    }

    public /* synthetic */ MessageViewModel(Message message, String str, C8503z c8503z, String str2, String str3, List list, int i, C15823e c15823e) {
        if ((i & 32) != 0) {
            list = C19301m.a();
        }
        this(message, str, c8503z, str2, str3, list);
    }

    public long getId() {
        return this.f34844a;
    }

    @NotNull
    /* renamed from: d */
    public final List<Long> m42897d() {
        return this.f34845b;
    }

    @NotNull
    /* renamed from: e */
    public final String m42898e() {
        return this.f34846c;
    }

    @NotNull
    /* renamed from: f */
    public final String m42899f() {
        return this.f34847d;
    }

    @NotNull
    /* renamed from: g */
    public final DateTime m42900g() {
        return this.f34848e;
    }

    @NotNull
    /* renamed from: h */
    public final String m42901h() {
        return this.f34849f;
    }

    @NotNull
    /* renamed from: i */
    public final SenderDirection m42902i() {
        return this.f34850g;
    }

    /* renamed from: j */
    public final boolean m42903j() {
        return this.f34851h;
    }

    /* renamed from: k */
    public final boolean m42904k() {
        return this.f34852i;
    }

    /* renamed from: l */
    public final boolean m42905l() {
        return this.f34853j;
    }

    /* renamed from: m */
    public final boolean m42906m() {
        return this.f34854k;
    }
}
