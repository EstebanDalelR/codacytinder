package com.tinder.data.message;

import android.database.Cursor;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.BriteDatabase.Transaction;
import com.squareup.sqlbrite.C7262a;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.database.C8642a;
import com.tinder.data.message.aq.C10832a;
import com.tinder.data.message.aq.C10833b;
import com.tinder.data.message.aq.C10834c;
import com.tinder.data.model.GifModel;
import com.tinder.data.model.GifModel.C12986c;
import com.tinder.data.model.MessageImageModel.C10857c;
import com.tinder.data.model.MessageImageModel.C13004d;
import com.tinder.data.model.MessageModel.C13005a;
import com.tinder.data.model.MessageModel.C13007d;
import com.tinder.data.model.MessageModel.C13008e;
import com.tinder.data.model.MessageModel.C13009h;
import com.tinder.data.model.MessageModel.C13010i;
import com.tinder.data.model.MessageModel.C13011j;
import com.tinder.data.model.ReactionModel;
import com.tinder.data.model.ReactionModel.C13015c;
import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.message.ActivityMessage;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.Gif.Provider;
import com.tinder.domain.message.GifMessage;
import com.tinder.domain.message.Image;
import com.tinder.domain.message.ImageMessage;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageLike;
import com.tinder.domain.message.Reaction;
import com.tinder.domain.message.ReactionMessage;
import com.tinder.domain.message.SystemMessage;
import com.tinder.domain.message.TextMessage;
import java.io.Closeable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java8.util.Optional;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ae;
import kotlin.io.C15818b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140$2\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010%\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0013J\u0018\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140)0\u0016J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190/2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u00100\u001a\u00020\u0011J\u000e\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020 J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u0002072\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00162\u0006\u00102\u001a\u00020 J\"\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00162\u0006\u00102\u001a\u00020 2\u0006\u0010:\u001a\u00020\u0019J\"\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190/0\u00162\u0006\u00102\u001a\u00020 2\u0006\u0010<\u001a\u00020=J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010C\u001a\u00020\u00142\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0002J\u0016\u0010J\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010K\u001a\u000204J\u0010\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020QH\u0002J\u0016\u0010R\u001a\u00020\u00112\u0006\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020\u0014J\u0018\u0010U\u001a\u00020\"2\u0006\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020\u0014H\u0002J\u0018\u0010V\u001a\u00020\"2\u0006\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020\u0014H\u0002J\u0016\u0010W\u001a\u00020\u00112\u0006\u0010S\u001a\u00020 2\u0006\u0010T\u001a\u00020\u0014J\u0010\u0010X\u001a\u00020\"2\u0006\u0010Y\u001a\u00020ZH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006["}, d2 = {"Lcom/tinder/data/message/MessageDataStore;", "", "db", "Lcom/squareup/sqlbrite/BriteDatabase;", "(Lcom/squareup/sqlbrite/BriteDatabase;)V", "activityFeedItemDataStore", "Lcom/tinder/data/message/ActivityFeedItemDataStore;", "getActivityFeedItemDataStore", "()Lcom/tinder/data/message/ActivityFeedItemDataStore;", "activityFeedItemDataStore$delegate", "Lkotlin/Lazy;", "messageUpsertOperation", "Lcom/tinder/data/message/MessageUpsertOperation;", "getMessageUpsertOperation", "()Lcom/tinder/data/message/MessageUpsertOperation;", "messageUpsertOperation$delegate", "addMessages", "Lrx/Completable;", "messages", "", "Lcom/tinder/domain/message/Message;", "countDistinctMatchesFromMessagesSinceDate", "Lrx/Observable;", "", "dateTime", "Lorg/joda/time/DateTime;", "createQuery", "Lcom/squareup/sqlbrite/QueryObservable;", "statement", "Lcom/squareup/sqldelight/SqlDelightStatement;", "deleteMessage", "messageId", "", "deleteMessageFromMessageTable", "", "getMessage", "Lrx/Single;", "insertLikes", "messageLikes", "Lcom/tinder/domain/message/MessageLike;", "latestMessageByMatch", "", "mapLatestByMatch", "cursor", "Landroid/database/Cursor;", "mapMessagesForMatch", "mapSentDate", "Ljava8/util/Optional;", "markAllPendingAsFailed", "markMessagesFromMatchSeen", "matchId", "messageAlreadyExists", "", "message", "messageImageById", "Lcom/tinder/domain/message/Image;", "messagesForMatch", "messagesForMatchSinceSentDate", "sinceSentDate", "minSentDateForPageSize", "limit", "", "modelToFixedHeightGif", "Lcom/tinder/domain/message/Gif;", "gifModel", "Lcom/tinder/data/model/GifModel;", "modelToGif", "modelToMessage", "messageViewModel", "Lcom/tinder/data/message/MessageModels$MessageView;", "modelToReaction", "Lcom/tinder/domain/message/Reaction;", "reactionModel", "Lcom/tinder/data/model/ReactionModel;", "setIsLiked", "isLiked", "updateGifFromGifTable", "updatedGifMessage", "Lcom/tinder/domain/message/GifMessage;", "updateImageTable", "updatedImageMessage", "Lcom/tinder/domain/message/ImageMessage;", "updateMessage", "messageToBeUpdatedId", "updatedMessage", "updateMessageFromMessageTable", "updateMessageFromRespectiveTables", "updateOrDeleteMessageIfAlreadyExists", "updateReactionFromReactionTable", "updatedReactionMessage", "Lcom/tinder/domain/message/ReactionMessage;", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ag {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f30618a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(ag.class), "messageUpsertOperation", "getMessageUpsertOperation()Lcom/tinder/data/message/MessageUpsertOperation;")), C15825i.a(new PropertyReference1Impl(C15825i.a(ag.class), "activityFeedItemDataStore", "getActivityFeedItemDataStore()Lcom/tinder/data/message/ActivityFeedItemDataStore;"))};
    /* renamed from: b */
    private final Lazy f30619b = C18451c.a((Function0) new MessageDataStore$messageUpsertOperation$2(this));
    /* renamed from: c */
    private final Lazy f30620c = C18451c.a((Function0) new MessageDataStore$activityFeedItemDataStore$2(this));
    /* renamed from: d */
    private final BriteDatabase f30621d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call", "(Landroid/database/Cursor;)Ljava/lang/Long;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$b */
    static final class C12943b<T, R> implements Func1<Cursor, Long> {
        /* renamed from: a */
        final /* synthetic */ RowMapper f41472a;

        C12943b(RowMapper rowMapper) {
            this.f41472a = rowMapper;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50646a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Long m50646a(Cursor cursor) {
            return (Long) this.f41472a.map(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "it", "Landroid/database/Cursor;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$d */
    static final class C12944d<T, R> implements Func1<Cursor, Optional<Message>> {
        /* renamed from: a */
        final /* synthetic */ ag f41473a;

        C12944d(ag agVar) {
            this.f41473a = agVar;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50647a((Cursor) obj);
        }

        /* renamed from: a */
        public final Optional<Message> m50647a(Cursor cursor) {
            ag agVar = this.f41473a;
            C2668g.a(cursor, "it");
            return Optional.a(agVar.m37093b(cursor));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$e */
    static final class C12945e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12945e f41474a = new C12945e();

        C12945e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50648a((Optional) obj);
        }

        /* renamed from: a */
        public final Message m50648a(Optional<Message> optional) {
            return (Message) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/Message;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$g */
    static final class C12946g<T, R> implements Func1<Cursor, Message> {
        /* renamed from: a */
        final /* synthetic */ ag f41475a;

        C12946g(ag agVar) {
            this.f41475a = agVar;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50649a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Message m50649a(Cursor cursor) {
            ag agVar = this.f41475a;
            C2668g.a(cursor, "it");
            return agVar.m37080a(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0001\u0012D\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00060\u0002 \u0004*J\u0012D\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00060\u0002\u0018\u00010\u00010\u00012*\u0010\u0007\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\t0\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "", "kotlin.jvm.PlatformType", "Lcom/tinder/domain/message/Message;", "", "list", "", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$h */
    static final class C12948h<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        public static final C12948h f41477a = new C12948h();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/message/Message;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.message.ag$h$1 */
        static final class C129471<T, R> implements Func1<T, K> {
            /* renamed from: a */
            public static final C129471 f41476a = new C129471();

            C129471() {
            }

            public /* synthetic */ Object call(Object obj) {
                return m50650a((Message) obj);
            }

            @NotNull
            /* renamed from: a */
            public final String m50650a(Message message) {
                return message.getMatchId();
            }
        }

        C12948h() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50651a((List) obj);
        }

        /* renamed from: a */
        public final Observable<Map<String, Message>> m50651a(List<Message> list) {
            return Observable.a(list).s(C129471.f41476a).b(ae.a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/Message;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$k */
    static final class C12949k<T, R> implements Func1<Cursor, Message> {
        /* renamed from: a */
        final /* synthetic */ ag f41478a;

        C12949k(ag agVar) {
            this.f41478a = agVar;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50652a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Message m50652a(Cursor cursor) {
            ag agVar = this.f41478a;
            C2668g.a(cursor, "it");
            return agVar.m37093b(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/Message;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$l */
    static final class C12950l<T, R> implements Func1<Cursor, Message> {
        /* renamed from: a */
        final /* synthetic */ ag f41479a;

        C12950l(ag agVar) {
            this.f41479a = agVar;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50653a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Message m50653a(Cursor cursor) {
            ag agVar = this.f41479a;
            C2668g.a(cursor, "it");
            return agVar.m37093b(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava8/util/Optional;", "Lorg/joda/time/DateTime;", "it", "Landroid/database/Cursor;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$m */
    static final class C12951m<T, R> implements Func1<Cursor, Optional<DateTime>> {
        /* renamed from: a */
        final /* synthetic */ ag f41480a;

        C12951m(ag agVar) {
            this.f41480a = agVar;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50654a((Cursor) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Optional<DateTime> m50654a(Cursor cursor) {
            ag agVar = this.f41480a;
            C2668g.a(cursor, "it");
            return agVar.m37097c(cursor);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$a */
    static final class C13837a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43888a;
        /* renamed from: b */
        final /* synthetic */ List f43889b;

        C13837a(ag agVar, List list) {
            this.f43888a = agVar;
            this.f43889b = list;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void call() {
            /*
            r6 = this;
            r0 = r6.f43888a;
            r0 = r0.f30621d;
            r0 = r0.c();
            r0 = (java.io.Closeable) r0;
            r1 = 0;
            r1 = (java.lang.Throwable) r1;
            r2 = r0;
            r2 = (com.squareup.sqlbrite.BriteDatabase.Transaction) r2;	 Catch:{ Throwable -> 0x003b }
            r3 = r6.f43889b;	 Catch:{ Throwable -> 0x003b }
            r3 = (java.lang.Iterable) r3;	 Catch:{ Throwable -> 0x003b }
            r3 = r3.iterator();	 Catch:{ Throwable -> 0x003b }
        L_0x001a:
            r4 = r3.hasNext();	 Catch:{ Throwable -> 0x003b }
            if (r4 == 0) goto L_0x0030;
        L_0x0020:
            r4 = r3.next();	 Catch:{ Throwable -> 0x003b }
            r4 = (com.tinder.domain.message.Message) r4;	 Catch:{ Throwable -> 0x003b }
            r5 = r6.f43888a;	 Catch:{ Throwable -> 0x003b }
            r5 = r5.m37095c();	 Catch:{ Throwable -> 0x003b }
            r5.m37144a(r4);	 Catch:{ Throwable -> 0x003b }
            goto L_0x001a;
        L_0x0030:
            r2.markSuccessful();	 Catch:{ Throwable -> 0x003b }
            r2 = kotlin.C15813i.f49016a;	 Catch:{ Throwable -> 0x003b }
            kotlin.io.C15818b.a(r0, r1);
            return;
        L_0x0039:
            r2 = move-exception;
            goto L_0x003d;
        L_0x003b:
            r1 = move-exception;
            throw r1;	 Catch:{ all -> 0x0039 }
        L_0x003d:
            kotlin.io.C15818b.a(r0, r1);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.ag.a.call():void");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$c */
    static final class C13838c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43890a;
        /* renamed from: b */
        final /* synthetic */ String f43891b;

        C13838c(ag agVar, String str) {
            this.f43890a = agVar;
            this.f43891b = str;
        }

        public final void call() {
            this.f43890a.m37102f(this.f43891b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$f */
    static final class C13839f implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43892a;
        /* renamed from: b */
        final /* synthetic */ List f43893b;

        C13839f(ag agVar, List list) {
            this.f43892a = agVar;
            this.f43893b = list;
        }

        public final void call() {
            if (!this.f43893b.isEmpty()) {
                BriteDatabase a = this.f43892a.f30621d;
                Closeable c = a.c();
                Throwable th = (Throwable) null;
                try {
                    Transaction transaction = (Transaction) c;
                    C13007d c13007d = new C13007d(a.b());
                    for (MessageLike messageLike : this.f43893b) {
                        c13007d.m50759a(messageLike.isLiked(), messageLike.getMessageId(), messageLike.getMatchId(), messageLike.getLikerUserId());
                        a.a("message", c13007d.b);
                    }
                    transaction.markSuccessful();
                    C15813i c15813i = C15813i.f49016a;
                    C15818b.a(c, th);
                } catch (Throwable th2) {
                    C15818b.a(c, th);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$i */
    static final class C13840i implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43894a;

        C13840i(ag agVar) {
            this.f43894a = agVar;
        }

        public final void call() {
            C13008e c13008e = new C13008e(this.f43894a.f30621d.b(), aq.f30625a);
            c13008e.m50760a(DeliveryStatus.FAILED, DeliveryStatus.PENDING);
            this.f43894a.f30621d.a(c13008e.a, c13008e.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$j */
    static final class C13841j implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43895a;
        /* renamed from: b */
        final /* synthetic */ String f43896b;

        C13841j(ag agVar, String str) {
            this.f43895a = agVar;
            this.f43896b = str;
        }

        public final void call() {
            C13010i c13010i = new C13010i(this.f43895a.f30621d.b());
            c13010i.m50762a(this.f43896b);
            this.f43895a.f30621d.a(c13010i.a, c13010i.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$n */
    static final class C13842n implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43897a;
        /* renamed from: b */
        final /* synthetic */ boolean f43898b;
        /* renamed from: c */
        final /* synthetic */ String f43899c;

        C13842n(ag agVar, boolean z, String str) {
            this.f43897a = agVar;
            this.f43898b = z;
            this.f43899c = str;
        }

        public final void call() {
            C13009h c13009h = new C13009h(this.f43897a.f30621d.b());
            c13009h.m50761a(this.f43898b, this.f43899c);
            this.f43897a.f30621d.a(c13009h.a, c13009h.b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$o */
    static final class C13843o implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43900a;
        /* renamed from: b */
        final /* synthetic */ String f43901b;
        /* renamed from: c */
        final /* synthetic */ Message f43902c;

        C13843o(ag agVar, String str, Message message) {
            this.f43900a = agVar;
            this.f43901b = str;
            this.f43902c = message;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void call() {
            /*
            r6 = this;
            r0 = r6.f43900a;
            r0 = r0.f30621d;
            r0 = r0.c();
            r0 = (java.io.Closeable) r0;
            r1 = 0;
            r1 = (java.lang.Throwable) r1;
            r2 = r0;
            r2 = (com.squareup.sqlbrite.BriteDatabase.Transaction) r2;	 Catch:{ Throwable -> 0x0026 }
            r3 = r6.f43900a;	 Catch:{ Throwable -> 0x0026 }
            r4 = r6.f43901b;	 Catch:{ Throwable -> 0x0026 }
            r5 = r6.f43902c;	 Catch:{ Throwable -> 0x0026 }
            r3.m37098c(r4, r5);	 Catch:{ Throwable -> 0x0026 }
            r2.markSuccessful();	 Catch:{ Throwable -> 0x0026 }
            r2 = kotlin.C15813i.f49016a;	 Catch:{ Throwable -> 0x0026 }
            kotlin.io.C15818b.a(r0, r1);
            return;
        L_0x0024:
            r2 = move-exception;
            goto L_0x0028;
        L_0x0026:
            r1 = move-exception;
            throw r1;	 Catch:{ all -> 0x0024 }
        L_0x0028:
            kotlin.io.C15818b.a(r0, r1);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.ag.o.call():void");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ag$p */
    static final class C13844p implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ag f43903a;
        /* renamed from: b */
        final /* synthetic */ Message f43904b;
        /* renamed from: c */
        final /* synthetic */ String f43905c;

        C13844p(ag agVar, Message message, String str) {
            this.f43903a = agVar;
            this.f43904b = message;
            this.f43905c = str;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void call() {
            /*
            r6 = this;
            r0 = r6.f43903a;
            r0 = r0.f30621d;
            r0 = r0.c();
            r0 = (java.io.Closeable) r0;
            r1 = 0;
            r1 = (java.lang.Throwable) r1;
            r2 = r0;
            r2 = (com.squareup.sqlbrite.BriteDatabase.Transaction) r2;	 Catch:{ Throwable -> 0x0038 }
            r3 = r6.f43903a;	 Catch:{ Throwable -> 0x0038 }
            r4 = r6.f43904b;	 Catch:{ Throwable -> 0x0038 }
            r3 = r3.m37090a(r4);	 Catch:{ Throwable -> 0x0038 }
            if (r3 == 0) goto L_0x0024;
        L_0x001c:
            r3 = r6.f43903a;	 Catch:{ Throwable -> 0x0038 }
            r4 = r6.f43905c;	 Catch:{ Throwable -> 0x0038 }
            r3.m37102f(r4);	 Catch:{ Throwable -> 0x0038 }
            goto L_0x002d;
        L_0x0024:
            r3 = r6.f43903a;	 Catch:{ Throwable -> 0x0038 }
            r4 = r6.f43905c;	 Catch:{ Throwable -> 0x0038 }
            r5 = r6.f43904b;	 Catch:{ Throwable -> 0x0038 }
            r3.m37098c(r4, r5);	 Catch:{ Throwable -> 0x0038 }
        L_0x002d:
            r2.markSuccessful();	 Catch:{ Throwable -> 0x0038 }
            r2 = kotlin.C15813i.f49016a;	 Catch:{ Throwable -> 0x0038 }
            kotlin.io.C15818b.a(r0, r1);
            return;
        L_0x0036:
            r2 = move-exception;
            goto L_0x003a;
        L_0x0038:
            r1 = move-exception;
            throw r1;	 Catch:{ all -> 0x0036 }
        L_0x003a:
            kotlin.io.C15818b.a(r0, r1);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.ag.p.call():void");
        }
    }

    /* renamed from: c */
    private final ax m37095c() {
        Lazy lazy = this.f30619b;
        KProperty kProperty = f30618a[0];
        return (ax) lazy.getValue();
    }

    /* renamed from: d */
    private final C8683a m37099d() {
        Lazy lazy = this.f30620c;
        KProperty kProperty = f30618a[1];
        return (C8683a) lazy.getValue();
    }

    public ag(@NotNull BriteDatabase briteDatabase) {
        C2668g.b(briteDatabase, "db");
        this.f30621d = briteDatabase;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<Message>> m37107a(@NotNull String str) {
        C2668g.b(str, "matchId");
        C6124c a = aq.f30625a.m37183a(str);
        C2668g.a(a, "statement");
        str = m37078a(a).b(new C12949k(this));
        C2668g.a(str, "createQuery(statement).m…apMessagesForMatch(it) })");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<List<Message>> m37109a(@NotNull String str, @NotNull DateTime dateTime) {
        C2668g.b(str, "matchId");
        C2668g.b(dateTime, "sinceSentDate");
        C6124c a = aq.f30625a.m37185a(str, dateTime);
        C2668g.a(a, "statement");
        str = m37078a(a).b((Func1) new C12950l(this));
        C2668g.a(str, "createQuery(statement).m…apMessagesForMatch(it) })");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<Long> m37110a(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "dateTime");
        C6124c a = aq.f30625a.m37186a(dateTime);
        RowMapper c = aq.f30625a.m37191c();
        C2668g.a(a, "statement");
        dateTime = m37078a(a).a(new C12943b(c), Long.valueOf(0));
        C2668g.a(dateTime, "createQuery(statement)\n …}, DEFAULT_MESSAGE_COUNT)");
        return dateTime;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<Optional<DateTime>> m37108a(@NotNull String str, int i) {
        C2668g.b(str, "matchId");
        C6124c a = aq.f30625a.m37184a(str, (long) i);
        C2668g.a(a, "statement");
        str = m37078a(a).a((Func1) new C12951m(this), Optional.a());
        C2668g.a(str, "createQuery(statement)\n …(it) }, Optional.empty())");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<Map<String, Message>> m37106a() {
        C6124c a = aq.f30625a.m37182a();
        C2668g.a(a, "statement");
        Observable<Map<String, Message>> h = m37078a(a).b(new C12946g(this)).h(C12948h.f41477a);
        C2668g.a(h, "createQuery(statement)\n …emptyMap())\n            }");
        return h;
    }

    @NotNull
    /* renamed from: b */
    public final Single<Message> m37114b(@NotNull String str) {
        C2668g.b(str, "messageId");
        C6124c b = aq.f30625a.m37190b(str);
        C2668g.a(b, "statement");
        str = m37078a(b).a(new C12944d(this), Optional.a()).h().k(C12945e.f41474a).a();
        C2668g.a(str, "createQuery(statement)\n …}\n            .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m37105a(@NotNull List<? extends Message> list) {
        C2668g.b(list, ManagerWebServices.PARAM_MESSAGES);
        list = Completable.a(new C13837a(this, list));
        C2668g.a(list, "Completable.fromAction {…}\n            }\n        }");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m37103a(@NotNull String str, @NotNull Message message) {
        C2668g.b(str, "messageToBeUpdatedId");
        C2668g.b(message, "updatedMessage");
        str = Completable.a(new C13844p(this, message, str));
        C2668g.a(str, "Completable.fromAction {…}\n            }\n        }");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Completable m37112b(@NotNull String str, @NotNull Message message) {
        C2668g.b(str, "messageToBeUpdatedId");
        C2668g.b(message, "updatedMessage");
        str = Completable.a(new C13843o(this, str, message));
        C2668g.a(str, "Completable.fromAction {…)\n            }\n        }");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Completable m37113b(@NotNull List<MessageLike> list) {
        C2668g.b(list, "messageLikes");
        list = Completable.a(new C13839f(this, list));
        C2668g.a(list, "Completable.fromAction {…}\n            }\n        }");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m37104a(@NotNull String str, boolean z) {
        C2668g.b(str, "messageId");
        str = Completable.a(new C13842n(this, z, str));
        C2668g.a(str, "Completable.fromAction {…update.program)\n        }");
        return str;
    }

    @NotNull
    /* renamed from: c */
    public final Completable m37115c(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = Completable.a(new C13841j(this, str));
        C2668g.a(str, "Completable.fromAction {…update.program)\n        }");
        return str;
    }

    @NotNull
    /* renamed from: d */
    public final Completable m37116d(@NotNull String str) {
        C2668g.b(str, "messageId");
        str = Completable.a(new C13838c(this, str));
        C2668g.a(str, "Completable.fromAction {…able(messageId)\n        }");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Completable m37111b() {
        Completable a = Completable.a(new C13840i(this));
        C2668g.a(a, "Completable.fromAction {…update.program)\n        }");
        return a;
    }

    /* renamed from: a */
    private final C7262a m37078a(C6124c c6124c) {
        BriteDatabase briteDatabase = this.f30621d;
        Iterable iterable = c6124c.f22516c;
        String str = c6124c.f22514a;
        c6124c = c6124c.f22515b;
        c6124c = briteDatabase.a(iterable, str, (String[]) Arrays.copyOf(c6124c, c6124c.length));
        C2668g.a(c6124c, "db.createQuery(statement…atement, *statement.args)");
        return c6124c;
    }

    /* renamed from: a */
    private final Message m37080a(Cursor cursor) {
        cursor = ((C10832a) aq.f30626b.m43366a(cursor)).message_view();
        C2668g.a(cursor, "model.message_view()");
        return m37082a((C10834c) cursor);
    }

    /* renamed from: b */
    private final Message m37093b(Cursor cursor) {
        C10834c c10834c = (C10834c) aq.f30627c.m43365a(cursor);
        C2668g.a(c10834c, "model");
        return m37082a(c10834c);
    }

    /* renamed from: c */
    private final Optional<DateTime> m37097c(Cursor cursor) {
        cursor = Optional.a(aq.f30628d.map(cursor));
        C2668g.a(cursor, "Optional.of(MessageModel…_DATE_MAPPER.map(cursor))");
        return cursor;
    }

    /* renamed from: a */
    private final Gif m37079a(GifModel gifModel) {
        String gif_id = gifModel.gif_id();
        C2668g.a(gif_id, "gif_id()");
        Provider provider = Provider.GIPHY;
        String url = gifModel.url();
        C2668g.a(url, "url()");
        return new Gif(gif_id, provider, url, (int) gifModel.width(), (int) gifModel.height());
    }

    /* renamed from: b */
    private final Gif m37092b(GifModel gifModel) {
        String gif_id = gifModel.gif_id();
        C2668g.a(gif_id, "gif_id()");
        Provider provider = Provider.GIPHY;
        String fixed_height_url = gifModel.fixed_height_url();
        C2668g.a(fixed_height_url, "fixed_height_url()");
        return new Gif(gif_id, provider, fixed_height_url, (int) gifModel.fixed_height_width(), (int) gifModel.fixed_height_height());
    }

    /* renamed from: a */
    private final Reaction m37083a(ReactionModel reactionModel) {
        reactionModel = reactionModel.reaction_id();
        C2668g.a(reactionModel, "reaction_id()");
        return new Reaction(reactionModel);
    }

    /* renamed from: a */
    private final Message m37082a(C10834c c10834c) {
        ag agVar = this;
        C10833b c10833b = (C10833b) c10834c.message();
        MessageType type = c10833b.type();
        Long valueOf;
        String id;
        String match_id;
        String to_id;
        String from_id;
        String text;
        DateTime sent_date;
        boolean is_liked;
        boolean is_seen;
        DeliveryStatus delivery_status;
        Long valueOf2;
        String from_id2;
        String text2;
        DateTime sent_date2;
        boolean is_liked2;
        boolean is_seen2;
        DeliveryStatus delivery_status2;
        switch (ah.f30622a[type.ordinal()]) {
            case 1:
                valueOf = Long.valueOf(c10833b.client_sequential_id());
                id = c10833b.id();
                C2668g.a(id, "messageModel.id()");
                match_id = c10833b.match_id();
                C2668g.a(match_id, "messageModel.match_id()");
                to_id = c10833b.to_id();
                C2668g.a(to_id, "messageModel.to_id()");
                from_id = c10833b.from_id();
                C2668g.a(from_id, "messageModel.from_id()");
                text = c10833b.text();
                C2668g.a(text, "messageModel.text()");
                sent_date = c10833b.sent_date();
                C2668g.a(sent_date, "messageModel.sent_date()");
                C2668g.a(c10833b, "messageModel");
                is_liked = c10833b.is_liked();
                is_seen = c10833b.is_seen();
                delivery_status = c10833b.delivery_status();
                C2668g.a(delivery_status, "messageModel.delivery_status()");
                return new TextMessage(valueOf, id, match_id, to_id, from_id, text, sent_date, is_liked, is_seen, delivery_status);
            case 2:
                GifModel gif = c10834c.gif();
                if (gif == null) {
                    C2668g.a();
                }
                C10835f c10835f = (C10835f) gif;
                valueOf2 = Long.valueOf(c10833b.client_sequential_id());
                to_id = c10833b.id();
                C2668g.a(to_id, "messageModel.id()");
                from_id = c10833b.match_id();
                C2668g.a(from_id, "messageModel.match_id()");
                text = c10833b.to_id();
                C2668g.a(text, "messageModel.to_id()");
                from_id2 = c10833b.from_id();
                C2668g.a(from_id2, "messageModel.from_id()");
                text2 = c10833b.text();
                C2668g.a(text2, "messageModel.text()");
                sent_date2 = c10833b.sent_date();
                C2668g.a(sent_date2, "messageModel.sent_date()");
                C2668g.a(c10833b, "messageModel");
                is_liked2 = c10833b.is_liked();
                is_seen2 = c10833b.is_seen();
                delivery_status2 = c10833b.delivery_status();
                C2668g.a(delivery_status2, "messageModel.delivery_status()");
                C2668g.a(c10835f, "gifModel");
                gif = c10835f;
                return new GifMessage(valueOf2, to_id, from_id, text, from_id2, text2, sent_date2, is_liked2, is_seen2, delivery_status2, m37079a(gif), m37092b(gif));
            case 3:
                ReactionModel reaction = c10834c.reaction();
                if (reaction == null) {
                    C2668g.a();
                }
                az azVar = (az) reaction;
                valueOf2 = Long.valueOf(c10833b.client_sequential_id());
                to_id = c10833b.id();
                C2668g.a(to_id, "messageModel.id()");
                from_id = c10833b.match_id();
                C2668g.a(from_id, "messageModel.match_id()");
                text = c10833b.to_id();
                C2668g.a(text, "messageModel.to_id()");
                from_id2 = c10833b.from_id();
                C2668g.a(from_id2, "messageModel.from_id()");
                text2 = c10833b.text();
                C2668g.a(text2, "messageModel.text()");
                sent_date2 = c10833b.sent_date();
                C2668g.a(sent_date2, "messageModel.sent_date()");
                C2668g.a(c10833b, "messageModel");
                is_liked2 = c10833b.is_liked();
                is_seen2 = c10833b.is_seen();
                delivery_status2 = c10833b.delivery_status();
                C2668g.a(delivery_status2, "messageModel.delivery_status()");
                C2668g.a(azVar, "reactionModel");
                return new ReactionMessage(valueOf2, to_id, from_id, text, from_id2, text2, sent_date2, is_liked2, is_seen2, delivery_status2, m37083a((ReactionModel) azVar));
            case 4:
                valueOf = Long.valueOf(c10833b.client_sequential_id());
                id = c10833b.id();
                C2668g.a(id, "messageModel.id()");
                match_id = c10833b.match_id();
                C2668g.a(match_id, "messageModel.match_id()");
                to_id = c10833b.to_id();
                C2668g.a(to_id, "messageModel.to_id()");
                from_id = c10833b.from_id();
                C2668g.a(from_id, "messageModel.from_id()");
                text = c10833b.text();
                C2668g.a(text, "messageModel.text()");
                sent_date = c10833b.sent_date();
                C2668g.a(sent_date, "messageModel.sent_date()");
                C2668g.a(c10833b, "messageModel");
                is_liked = c10833b.is_liked();
                is_seen = c10833b.is_seen();
                delivery_status = c10833b.delivery_status();
                C2668g.a(delivery_status, "messageModel.delivery_status()");
                return new SystemMessage(valueOf, id, match_id, to_id, from_id, text, sent_date, is_liked, is_seen, delivery_status);
            case 5:
                id = c10833b.id();
                C8683a d = m37099d();
                C2668g.a(id, "messageId");
                ActivityFeedItem a = d.m37021a(id);
                valueOf = Long.valueOf(c10833b.client_sequential_id());
                match_id = c10833b.match_id();
                C2668g.a(match_id, "messageModel.match_id()");
                to_id = c10833b.to_id();
                C2668g.a(to_id, "messageModel.to_id()");
                from_id = c10833b.from_id();
                C2668g.a(from_id, "messageModel.from_id()");
                text = c10833b.text();
                C2668g.a(text, "messageModel.text()");
                sent_date = c10833b.sent_date();
                C2668g.a(sent_date, "messageModel.sent_date()");
                C2668g.a(c10833b, "messageModel");
                is_liked = c10833b.is_liked();
                is_seen = c10833b.is_seen();
                delivery_status = c10833b.delivery_status();
                C2668g.a(delivery_status, "messageModel.delivery_status()");
                return new ActivityMessage(valueOf, id, match_id, to_id, from_id, text, sent_date, is_liked, is_seen, delivery_status, a);
            case 6:
                match_id = c10833b.id();
                C2668g.a(match_id, "messageId");
                Image e = m37101e(match_id);
                Long valueOf3 = Long.valueOf(c10833b.client_sequential_id());
                to_id = c10833b.match_id();
                C2668g.a(to_id, "messageModel.match_id()");
                from_id = c10833b.to_id();
                C2668g.a(from_id, "messageModel.to_id()");
                text = c10833b.from_id();
                C2668g.a(text, "messageModel.from_id()");
                from_id2 = c10833b.text();
                C2668g.a(from_id2, "messageModel.text()");
                DateTime sent_date3 = c10833b.sent_date();
                C2668g.a(sent_date3, "messageModel.sent_date()");
                C2668g.a(c10833b, "messageModel");
                is_seen = c10833b.is_liked();
                is_liked2 = c10833b.is_seen();
                DeliveryStatus delivery_status3 = c10833b.delivery_status();
                C2668g.a(delivery_status3, "messageModel.delivery_status()");
                return new ImageMessage(valueOf3, match_id, to_id, from_id, text, from_id2, sent_date3, is_seen, is_liked2, delivery_status3, e);
            case 7:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown message type ");
                stringBuilder.append(type);
                throw new IllegalStateException(stringBuilder.toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    private final Image m37101e(String str) {
        C10857c a = am.m37118a().m37181a();
        str = am.m37118a().m37180a(str);
        BriteDatabase briteDatabase = this.f30621d;
        String str2 = str.f22514a;
        str = str.f22515b;
        Closeable a2 = briteDatabase.a(str2, (String[]) Arrays.copyOf(str, str.length));
        Throwable th = (Throwable) null;
        try {
            Cursor cursor = (Cursor) a2;
            C2668g.a(cursor, "cursor");
            al alVar = (al) C19285g.c(C19285g.e(C8642a.m36798a(cursor), new MessageDataStore$messageImageById$2$1(a)));
            C15818b.a(a2, th);
            return new Image(alVar.source(), alVar.url(), (int) alVar.width(), (int) alVar.height());
        } catch (Throwable th2) {
            C15818b.a(a2, th);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final boolean m37090a(com.tinder.domain.message.Message r7) {
        /*
        r6 = this;
        r0 = com.tinder.data.message.aq.f30625a;
        r7 = r7.getId();
        r7 = r0.m37192c(r7);
        r0 = r6.f30621d;
        r0 = r0.a();
        r1 = r7.f22514a;
        r7 = r7.f22515b;
        r7 = r0.rawQuery(r1, r7);
        r7 = (java.io.Closeable) r7;
        r0 = 0;
        r0 = (java.lang.Throwable) r0;
        r1 = r7;
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x004e }
        r2 = r1.moveToFirst();	 Catch:{ Throwable -> 0x004e }
        r3 = 0;
        if (r2 == 0) goto L_0x003e;
    L_0x0028:
        r2 = com.tinder.data.message.aq.f30625a;	 Catch:{ Throwable -> 0x004e }
        r2 = r2.m37193d();	 Catch:{ Throwable -> 0x004e }
        r1 = r2.map(r1);	 Catch:{ Throwable -> 0x004e }
        r2 = "MessageModels.FACTORY.se…by_idMapper().map(cursor)";
        kotlin.jvm.internal.C2668g.a(r1, r2);	 Catch:{ Throwable -> 0x004e }
        r1 = (java.lang.Number) r1;	 Catch:{ Throwable -> 0x004e }
        r1 = r1.longValue();	 Catch:{ Throwable -> 0x004e }
        goto L_0x003f;
    L_0x003e:
        r1 = r3;
    L_0x003f:
        r5 = kotlin.C15813i.f49016a;	 Catch:{ Throwable -> 0x004e }
        kotlin.io.C15818b.a(r7, r0);
        r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r7 <= 0) goto L_0x004a;
    L_0x0048:
        r7 = 1;
        goto L_0x004b;
    L_0x004a:
        r7 = 0;
    L_0x004b:
        return r7;
    L_0x004c:
        r1 = move-exception;
        goto L_0x0050;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x0050:
        kotlin.io.C15818b.a(r7, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.message.ag.a(com.tinder.domain.message.Message):boolean");
    }

    /* renamed from: f */
    private final void m37102f(String str) {
        C13005a c13005a = new C13005a(this.f30621d.b());
        c13005a.m50757a(str);
        this.f30621d.a(c13005a.a, c13005a.b);
    }

    /* renamed from: c */
    private final void m37098c(String str, Message message) {
        if (message instanceof TextMessage) {
            m37100d(str, message);
            str = C15813i.f49016a;
        } else if (message instanceof GifMessage) {
            m37100d(str, message);
            m37086a((GifMessage) message);
            str = C15813i.f49016a;
        } else if (message instanceof ReactionMessage) {
            m37100d(str, message);
            m37088a((ReactionMessage) message);
            str = C15813i.f49016a;
        } else if (message instanceof SystemMessage) {
            m37100d(str, message);
            str = C15813i.f49016a;
        } else if (message instanceof ActivityMessage) {
            m37100d(str, C8696o.m37146a((ActivityMessage) message));
            str = C15813i.f49016a;
        } else if (message instanceof ImageMessage) {
            m37100d(str, message);
            m37087a((ImageMessage) message);
            str = C15813i.f49016a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    private final void m37100d(String str, Message message) {
        C13011j c13011j = new C13011j(this.f30621d.b(), aq.f30625a);
        c13011j.m50763a(message.getId(), message.getMatchId(), message.getToId(), message.getFromId(), message.getText(), message.getSentDate(), message.isLiked(), ai.m37117a(message), message.getDeliveryStatus(), message.isSeen(), str);
        this.f30621d.a(c13011j.a, c13011j.b);
    }

    /* renamed from: a */
    private final void m37086a(GifMessage gifMessage) {
        C12986c c12986c = new C12986c(this.f30621d.b());
        Gif gif = gifMessage.getGif();
        Gif fixedHeightGif = gifMessage.getFixedHeightGif();
        c12986c.m50742a(gif.getId(), gif.getUrl(), (long) gif.getWidth(), (long) gif.getHeight(), fixedHeightGif.getUrl(), (long) fixedHeightGif.getWidth(), (long) fixedHeightGif.getHeight(), gifMessage.getId());
        this.f30621d.a(c12986c.a, c12986c.b);
    }

    /* renamed from: a */
    private final void m37088a(ReactionMessage reactionMessage) {
        C13015c c13015c = new C13015c(this.f30621d.b());
        c13015c.m50767a(reactionMessage.getReaction().getId(), reactionMessage.getId());
        this.f30621d.a(c13015c.a, c13015c.b);
    }

    /* renamed from: a */
    private final void m37087a(ImageMessage imageMessage) {
        C13004d c13004d = new C13004d(this.f30621d.b());
        c13004d.m50756a(imageMessage.getImage().getSource(), imageMessage.getImage().getUrl(), (long) imageMessage.getImage().getWidth(), (long) imageMessage.getImage().getHeight(), imageMessage.getId());
        this.f30621d.a(c13004d.a, c13004d.b);
    }
}
