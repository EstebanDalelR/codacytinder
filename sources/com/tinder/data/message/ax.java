package com.tinder.data.message;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.message.activityfeed.C8684a;
import com.tinder.data.message.activityfeed.C8685b;
import com.tinder.data.model.GifModel.C12985b;
import com.tinder.data.model.GifModel.C12986c;
import com.tinder.data.model.MessageImageModel.C13003b;
import com.tinder.data.model.MessageImageModel.C13004d;
import com.tinder.data.model.MessageModel.C13006c;
import com.tinder.data.model.MessageModel.C13011j;
import com.tinder.data.model.ReactionModel.C13014b;
import com.tinder.data.model.ReactionModel.C13015c;
import com.tinder.data.model.activityfeed.MessageActivityFeedItemModel.C13033b;
import com.tinder.domain.feed.ActivityEvent;
import com.tinder.domain.feed.ActivityEventNewMatch;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.InstagramConnect;
import com.tinder.domain.feed.InstagramNewMedia;
import com.tinder.domain.feed.ProfileAddLoop;
import com.tinder.domain.feed.ProfileAddPhoto;
import com.tinder.domain.feed.ProfileChangeAnthem;
import com.tinder.domain.feed.ProfileChangeBio;
import com.tinder.domain.feed.ProfileChangeSchool;
import com.tinder.domain.feed.ProfileChangeWork;
import com.tinder.domain.feed.ProfileSpotifyTopArtist;
import com.tinder.domain.feed.UnknownActivityEvent;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import java.util.List;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020.072\u0006\u00108\u001a\u000209H\u0002J\u001e\u0010:\u001a\u00020#2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020.072\u0006\u0010/\u001a\u00020.H\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010>\u001a\u00020=2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010?\u001a\u00020=2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010@\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010A\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010B\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010C\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010D\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010E\u001a\u00020#2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010F\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002J\u0010\u0010G\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002J\u0010\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020=2\u0006\u00104\u001a\u000205H\u0002J\u000e\u0010O\u001a\u00020#2\u0006\u00101\u001a\u000202R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/tinder/data/message/MessageUpsertOperation;", "", "briteDatabase", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "activityFeedItemDeleteOperation", "Lcom/tinder/data/message/activityfeed/ActivityFeedItemDeleteOperation;", "getActivityFeedItemDeleteOperation", "()Lcom/tinder/data/message/activityfeed/ActivityFeedItemDeleteOperation;", "activityFeedItemDeleteOperation$delegate", "Lkotlin/Lazy;", "activityFeedItemInsertOperation", "Lcom/tinder/data/message/activityfeed/ActivityFeedItemInsertOperation;", "getActivityFeedItemInsertOperation", "()Lcom/tinder/data/message/activityfeed/ActivityFeedItemInsertOperation;", "activityFeedItemInsertOperation$delegate", "insertGif", "Lcom/tinder/data/model/GifModel$Insert_gif;", "insertImage", "Lcom/tinder/data/model/MessageImageModel$Insert_image;", "insertMessage", "Lcom/tinder/data/model/MessageModel$Insert_message;", "insertMessageActivityFeedItem", "Lcom/tinder/data/model/activityfeed/MessageActivityFeedItemModel$Insert_message_activity_feed_item;", "insertReaction", "Lcom/tinder/data/model/ReactionModel$Insert_reaction;", "updateGif", "Lcom/tinder/data/model/GifModel$Update_gif;", "updateImage", "Lcom/tinder/data/model/MessageImageModel$Update_image;", "updateMessage", "Lcom/tinder/data/model/MessageModel$Update_message;", "updateReaction", "Lcom/tinder/data/model/ReactionModel$Update_reaction;", "deleteIfExistsAndThenInsertActivityFeedItemForMessage", "", "activityMessage", "Lcom/tinder/domain/message/ActivityMessage;", "insertGifIntoGifTable", "gifMessage", "Lcom/tinder/domain/message/GifMessage;", "insertImageIntoImageTable", "imageMessage", "Lcom/tinder/domain/message/ImageMessage;", "insertIntoMessageActivityFeedItemTable", "messageId", "", "activityFeedItemId", "insertMessageIntoMessageTable", "message", "Lcom/tinder/domain/message/Message;", "insertReactionIntoReactionTable", "reactionMessage", "Lcom/tinder/domain/message/ReactionMessage;", "queryMessageIdsReferencingActivityFeedItem", "", "activityFeedItem", "Lcom/tinder/domain/feed/ActivityFeedItem;", "restoreBrokenMessageIdToActivityFeedItemIdLinks", "messageIdsForActivityFeedItem", "updateGifFromGifTable", "", "updateImageFromImageTable", "updateMessageFromMessageTable", "updateOrInsertActivityMessage", "updateOrInsertGifMessage", "updateOrInsertImageMessage", "updateOrInsertIntoGifTable", "updateOrInsertIntoImageTable", "updateOrInsertIntoMessageTable", "updateOrInsertIntoReactionTable", "updateOrInsertReactionMessage", "updateOrInsertSystemMessage", "systemMessage", "Lcom/tinder/domain/message/SystemMessage;", "updateOrInsertTextMessage", "textMessage", "Lcom/tinder/domain/message/TextMessage;", "updateReactionFromReactionTable", "upsert", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ax {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30632a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(ax.class), "activityFeedItemInsertOperation", "getActivityFeedItemInsertOperation()Lcom/tinder/data/message/activityfeed/ActivityFeedItemInsertOperation;")), C15825i.a(new PropertyReference1Impl(C15825i.a(ax.class), "activityFeedItemDeleteOperation", "getActivityFeedItemDeleteOperation()Lcom/tinder/data/message/activityfeed/ActivityFeedItemDeleteOperation;"))};
    /* renamed from: b */
    private final C13006c f30633b;
    /* renamed from: c */
    private final C13011j f30634c;
    /* renamed from: d */
    private final C12985b f30635d;
    /* renamed from: e */
    private final C12986c f30636e;
    /* renamed from: f */
    private final C13014b f30637f;
    /* renamed from: g */
    private final C13015c f30638g;
    /* renamed from: h */
    private final C13003b f30639h;
    /* renamed from: i */
    private final C13004d f30640i;
    /* renamed from: j */
    private final C13033b f30641j;
    /* renamed from: k */
    private final Lazy f30642k = C18451c.a((Function0) new MessageUpsertOperation$activityFeedItemInsertOperation$2(this));
    /* renamed from: l */
    private final Lazy f30643l = C18451c.a((Function0) new MessageUpsertOperation$activityFeedItemDeleteOperation$2(this));
    /* renamed from: m */
    private final BriteDatabase f30644m;

    /* renamed from: a */
    private final C8685b m37120a() {
        Lazy lazy = this.f30642k;
        KProperty kProperty = f30632a[0];
        return (C8685b) lazy.getValue();
    }

    /* renamed from: b */
    private final C8684a m37130b() {
        Lazy lazy = this.f30643l;
        KProperty kProperty = f30632a[1];
        return (C8684a) lazy.getValue();
    }

    public ax(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "briteDatabase");
        this.f30644m = briteDatabase;
        briteDatabase = this.f30644m.b();
        this.f30633b = new C13006c(briteDatabase, aq.f30625a);
        this.f30634c = new C13011j(briteDatabase, aq.f30625a);
        this.f30635d = new C12985b(briteDatabase);
        this.f30636e = new C12986c(briteDatabase);
        this.f30637f = new C13014b(briteDatabase);
        this.f30638g = new C13015c(briteDatabase);
        this.f30639h = new C13003b(briteDatabase);
        this.f30640i = new C13004d(briteDatabase);
        this.f30641j = new C13033b(briteDatabase);
    }

    /* renamed from: a */
    public final void m37144a(@NotNull Message message) {
        C2668g.b(message, "message");
        if (message instanceof TextMessage) {
            m37127a((TextMessage) message);
            message = C15813i.f49016a;
        } else if (message instanceof GifMessage) {
            m37123a((GifMessage) message);
            message = C15813i.f49016a;
        } else if (message instanceof ReactionMessage) {
            m37125a((ReactionMessage) message);
            message = C15813i.f49016a;
        } else if (message instanceof ActivityMessage) {
            m37122a((ActivityMessage) message);
            message = C15813i.f49016a;
        } else if (message instanceof ImageMessage) {
            m37124a((ImageMessage) message);
            message = C15813i.f49016a;
        } else if (message instanceof SystemMessage) {
            m37126a((SystemMessage) message);
            message = C15813i.f49016a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final void m37127a(TextMessage textMessage) {
        m37134b((Message) textMessage);
    }

    /* renamed from: a */
    private final void m37126a(SystemMessage systemMessage) {
        m37134b((Message) systemMessage);
    }

    /* renamed from: a */
    private final void m37123a(GifMessage gifMessage) {
        m37134b((Message) gifMessage);
        m37132b(gifMessage);
    }

    /* renamed from: a */
    private final void m37125a(ReactionMessage reactionMessage) {
        m37134b((Message) reactionMessage);
        m37135b(reactionMessage);
    }

    /* renamed from: a */
    private final void m37124a(ImageMessage imageMessage) {
        m37134b((Message) imageMessage);
        m37133b(imageMessage);
    }

    /* renamed from: a */
    private final void m37122a(ActivityMessage activityMessage) {
        ActivityEvent activityEvent = activityMessage.getActivityFeedItem().getActivityEvent();
        if (!(activityEvent instanceof InstagramNewMedia)) {
            if (!(activityEvent instanceof ActivityEventNewMatch)) {
                if (!(activityEvent instanceof InstagramConnect)) {
                    if (!(activityEvent instanceof ProfileAddPhoto)) {
                        if (!(activityEvent instanceof ProfileSpotifyTopArtist)) {
                            if (!(activityEvent instanceof ProfileAddLoop)) {
                                if (!(activityEvent instanceof ProfileChangeBio)) {
                                    if (!(activityEvent instanceof ProfileChangeWork)) {
                                        if (!(activityEvent instanceof ProfileChangeSchool)) {
                                            if (!(activityEvent instanceof ProfileChangeAnthem)) {
                                                if ((activityEvent instanceof UnknownActivityEvent) != null) {
                                                    throw ((Throwable) new IllegalStateException("Updating or inserting ActivityMessage with UnknownActivityEvent is prohibited"));
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        m37134b((Message) activityMessage);
        m37131b(activityMessage);
    }

    /* renamed from: b */
    private final void m37134b(Message message) {
        if (!m37142d(message)) {
            m37137c(message);
        }
    }

    /* renamed from: b */
    private final void m37132b(GifMessage gifMessage) {
        if (!m37141d(gifMessage)) {
            m37136c(gifMessage);
        }
    }

    /* renamed from: b */
    private final void m37135b(ReactionMessage reactionMessage) {
        if (!m37143d(reactionMessage)) {
            m37138c(reactionMessage);
        }
    }

    /* renamed from: b */
    private final void m37133b(ImageMessage imageMessage) {
        if (!m37139c(imageMessage)) {
            m37140d(imageMessage);
        }
    }

    /* renamed from: b */
    private final void m37131b(ActivityMessage activityMessage) {
        ActivityFeedItem activityFeedItem = activityMessage.getActivityFeedItem();
        String id = activityFeedItem.getId();
        List a = m37121a(activityFeedItem);
        m37130b().m37022a(id);
        m37120a().m37040a(activityFeedItem);
        m37129a(a, id);
        m37128a(activityMessage.getId(), id);
    }

    /* renamed from: c */
    private final void m37137c(Message message) {
        this.f30633b.m50758a(message.getId(), message.getMatchId(), message.getToId(), message.getFromId(), message.getText(), message.getSentDate(), message.isLiked(), message.isSeen(), ai.m37117a(message), message.getDeliveryStatus());
        this.f30644m.b(this.f30633b.a, this.f30633b.b);
    }

    /* renamed from: c */
    private final void m37136c(GifMessage gifMessage) {
        this.f30635d.m50741a(gifMessage.getGif().getId(), gifMessage.getId(), gifMessage.getGif().getUrl(), (long) gifMessage.getGif().getWidth(), (long) gifMessage.getGif().getHeight(), gifMessage.getFixedHeightGif().getUrl(), (long) gifMessage.getFixedHeightGif().getWidth(), (long) gifMessage.getFixedHeightGif().getHeight());
        this.f30644m.b(this.f30635d.a, this.f30635d.b);
    }

    /* renamed from: c */
    private final void m37138c(ReactionMessage reactionMessage) {
        this.f30637f.m50766a(reactionMessage.getReaction().getId(), reactionMessage.getId());
        this.f30644m.b(this.f30637f.a, this.f30637f.b);
    }

    /* renamed from: d */
    private final boolean m37142d(Message message) {
        this.f30634c.m50763a(message.getId(), message.getMatchId(), message.getToId(), message.getFromId(), message.getText(), message.getSentDate(), message.isLiked(), ai.m37117a(message), message.getDeliveryStatus(), message.isSeen(), message.getId());
        return this.f30644m.a(this.f30634c.a, this.f30634c.b) > null ? true : null;
    }

    /* renamed from: d */
    private final boolean m37141d(GifMessage gifMessage) {
        this.f30636e.m50742a(gifMessage.getGif().getId(), gifMessage.getGif().getUrl(), (long) gifMessage.getGif().getWidth(), (long) gifMessage.getGif().getHeight(), gifMessage.getFixedHeightGif().getUrl(), (long) gifMessage.getFixedHeightGif().getWidth(), (long) gifMessage.getFixedHeightGif().getHeight(), gifMessage.getId());
        return this.f30644m.a(this.f30636e.a, this.f30636e.b) > null ? true : null;
    }

    /* renamed from: d */
    private final boolean m37143d(ReactionMessage reactionMessage) {
        this.f30638g.m50767a(reactionMessage.getReaction().getId(), reactionMessage.getId());
        return this.f30644m.a(this.f30638g.a, this.f30638g.b) > null ? true : null;
    }

    /* renamed from: c */
    private final boolean m37139c(ImageMessage imageMessage) {
        this.f30640i.m50756a(imageMessage.getImage().getSource(), imageMessage.getImage().getUrl(), (long) imageMessage.getImage().getWidth(), (long) imageMessage.getImage().getHeight(), imageMessage.getId());
        return this.f30644m.a(this.f30640i.a, this.f30640i.b) > null ? true : null;
    }

    /* renamed from: d */
    private final void m37140d(ImageMessage imageMessage) {
        this.f30639h.m50755a(imageMessage.getId(), imageMessage.getImage().getSource(), imageMessage.getImage().getUrl(), (long) imageMessage.getImage().getWidth(), (long) imageMessage.getImage().getWidth());
        this.f30644m.b(this.f30639h.a, this.f30639h.b);
    }

    /* renamed from: a */
    private final void m37129a(List<String> list, String str) {
        for (String a : list) {
            m37128a(a, str);
        }
    }

    /* renamed from: a */
    private final void m37128a(String str, String str2) {
        this.f30641j.m50785a(str, str2);
        this.f30644m.b(this.f30641j.a, this.f30641j.b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final java.util.List<java.lang.String> m37121a(com.tinder.domain.feed.ActivityFeedItem r5) {
        /*
        r4 = this;
        r0 = com.tinder.data.message.activityfeed.model.as.m37051a();
        r5 = r5.getId();
        r5 = r0.m37218a(r5);
        r0 = r4.f30644m;
        r1 = r5.f22514a;
        r5 = r5.f22515b;
        r2 = r5.length;
        r5 = java.util.Arrays.copyOf(r5, r2);
        r5 = (java.lang.String[]) r5;
        r5 = r0.a(r1, r5);
        if (r5 != 0) goto L_0x0022;
    L_0x001f:
        kotlin.jvm.internal.C2668g.a();
    L_0x0022:
        r5 = (java.io.Closeable) r5;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r5;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0047 }
        r1 = com.tinder.data.database.C8642a.m36798a(r1);	 Catch:{ Throwable -> 0x0047 }
        r2 = new com.tinder.data.message.MessageUpsertOperation$queryMessageIdsReferencingActivityFeedItem$2$1;	 Catch:{ Throwable -> 0x0047 }
        r3 = com.tinder.data.message.activityfeed.model.as.m37052b();	 Catch:{ Throwable -> 0x0047 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0047 }
        r2 = (kotlin.jvm.functions.Function1) r2;	 Catch:{ Throwable -> 0x0047 }
        r1 = kotlin.sequences.C19285g.e(r1, r2);	 Catch:{ Throwable -> 0x0047 }
        r1 = kotlin.sequences.C19285g.f(r1);	 Catch:{ Throwable -> 0x0047 }
        kotlin.io.C15818b.a(r5, r0);
        return r1;
    L_0x0045:
        r1 = move-exception;
        goto L_0x0049;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0045 }
    L_0x0049:
        kotlin.io.C15818b.a(r5, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.ax.a(com.tinder.domain.feed.ActivityFeedItem):java.util.List<java.lang.String>");
    }
}
