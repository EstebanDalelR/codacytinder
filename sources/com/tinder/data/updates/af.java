package com.tinder.data.updates;

import com.tinder.api.model.updates.Updates.LikedMessage;
import com.tinder.data.message.C10838k;
import com.tinder.domain.message.MessageLike;
import com.tinder.domain.message.usecase.InsertMessageLikes;
import com.tinder.domain.message.usecase.InsertMessageLikes.Request;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/data/updates/UpdatesResponseMessageLikesHandler;", "", "likedMessageDomainApiAdapter", "Lcom/tinder/data/message/LikedMessageDomainApiAdapter;", "insertMessageLikes", "Lcom/tinder/domain/message/usecase/InsertMessageLikes;", "(Lcom/tinder/data/message/LikedMessageDomainApiAdapter;Lcom/tinder/domain/message/usecase/InsertMessageLikes;)V", "processMessageLikes", "Lio/reactivex/Completable;", "apiMessageLikes", "", "Lcom/tinder/api/model/updates/Updates$LikedMessage;", "forceMatchTouched", "", "data_release"}, k = 1, mv = {1, 1, 10})
public final class af {
    /* renamed from: a */
    private final C10838k f30883a;
    /* renamed from: b */
    private final InsertMessageLikes f30884b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "messageLikes", "", "Lcom/tinder/domain/message/MessageLike;", "kotlin.jvm.PlatformType", "", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.af$a */
    static final class C11039a<T> implements Predicate<List<MessageLike>> {
        /* renamed from: a */
        public static final C11039a f35802a = new C11039a();

        C11039a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m43708a((List) obj);
        }

        /* renamed from: a */
        public final boolean m43708a(@NotNull List<MessageLike> list) {
            C2668g.b(list, "messageLikes");
            return list.isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/usecase/InsertMessageLikes$Request;", "it", "", "Lcom/tinder/domain/message/MessageLike;", "kotlin.jvm.PlatformType", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.af$b */
    static final class C11040b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ boolean f35803a;

        C11040b(boolean z) {
            this.f35803a = z;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43709a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Request m43709a(@NotNull List<MessageLike> list) {
            C2668g.b(list, "it");
            return new Request(list, this.f35803a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/domain/message/usecase/InsertMessageLikes$Request;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.af$c */
    static final class C11041c<T, R> implements Function<Request, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ af f35804a;

        C11041c(af afVar) {
            this.f35804a = afVar;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43710a((Request) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43710a(@NotNull Request request) {
            C2668g.b(request, "it");
            return this.f35804a.f30884b.execute(request);
        }
    }

    @Inject
    public af(@NotNull C10838k c10838k, @NotNull InsertMessageLikes insertMessageLikes) {
        C2668g.b(c10838k, "likedMessageDomainApiAdapter");
        C2668g.b(insertMessageLikes, "insertMessageLikes");
        this.f30883a = c10838k;
        this.f30884b = insertMessageLikes;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37477a(@NotNull List<? extends LikedMessage> list, boolean z) {
        C2668g.b(list, "apiMessageLikes");
        list = C3960g.a(list).e(new ag(new UpdatesResponseMessageLikesHandler$processMessageLikes$1(this.f30883a))).a(C11039a.f35802a).f(new C11040b(z)).e((Function) new C11041c(this));
        C2668g.a(list, "Single.just(apiMessageLi…s.execute(request = it) }");
        return list;
    }
}
