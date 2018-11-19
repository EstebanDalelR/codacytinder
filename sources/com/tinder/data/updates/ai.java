package com.tinder.data.updates;

import com.tinder.api.model.common.ApiMatch;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.message.C10839m;
import com.tinder.domain.message.usecase.InsertMessages;
import com.tinder.domain.message.usecase.InsertMessages.Request;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J$\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/data/updates/UpdatesResponseMessagesHandler;", "", "dateTimeApiAdapter", "Lcom/tinder/data/adapter/DateTimeApiAdapter;", "messageApiAdapter", "Lcom/tinder/data/message/MessageApiAdapter;", "insertMessages", "Lcom/tinder/domain/message/usecase/InsertMessages;", "(Lcom/tinder/data/adapter/DateTimeApiAdapter;Lcom/tinder/data/message/MessageApiAdapter;Lcom/tinder/domain/message/usecase/InsertMessages;)V", "createInsertMessagesRequest", "Lcom/tinder/domain/message/usecase/InsertMessages$Request;", "apiMatch", "Lcom/tinder/api/model/common/ApiMatch;", "forceMatchTouched", "", "forceMessagesMarkedAsSeen", "processMessages", "Lio/reactivex/Completable;", "apiMatches", "", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ai {
    /* renamed from: a */
    private final C10738l f30885a;
    /* renamed from: b */
    private final C10839m f30886b;
    /* renamed from: c */
    private final InsertMessages f30887c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "apiMatch", "Lcom/tinder/api/model/common/ApiMatch;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.ai$a */
    static final class C11042a<T> implements Predicate<ApiMatch> {
        /* renamed from: a */
        public static final C11042a f35806a = new C11042a();

        C11042a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m43711a((ApiMatch) obj);
        }

        /* renamed from: a */
        public final boolean m43711a(@NotNull ApiMatch apiMatch) {
            C2668g.b(apiMatch, "apiMatch");
            apiMatch = apiMatch.messages();
            if (apiMatch == null) {
                apiMatch = C19301m.a();
            }
            return ((Collection) apiMatch).isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/usecase/InsertMessages$Request;", "it", "Lcom/tinder/api/model/common/ApiMatch;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.ai$b */
    static final class C11043b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ ai f35807a;
        /* renamed from: b */
        final /* synthetic */ boolean f35808b;
        /* renamed from: c */
        final /* synthetic */ boolean f35809c;

        C11043b(ai aiVar, boolean z, boolean z2) {
            this.f35807a = aiVar;
            this.f35808b = z;
            this.f35809c = z2;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43712a((ApiMatch) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Request m43712a(@NotNull ApiMatch apiMatch) {
            C2668g.b(apiMatch, "it");
            return this.f35807a.m37478a(apiMatch, this.f35808b, this.f35809c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/domain/message/usecase/InsertMessages$Request;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.ai$c */
    static final class C11044c<T, R> implements Function<Request, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ ai f35810a;

        C11044c(ai aiVar) {
            this.f35810a = aiVar;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43713a((Request) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m43713a(@NotNull Request request) {
            C2668g.b(request, "it");
            return this.f35810a.f30887c.execute(request);
        }
    }

    @Inject
    public ai(@NotNull C10738l c10738l, @NotNull C10839m c10839m, @NotNull InsertMessages insertMessages) {
        C2668g.b(c10738l, "dateTimeApiAdapter");
        C2668g.b(c10839m, "messageApiAdapter");
        C2668g.b(insertMessages, "insertMessages");
        this.f30885a = c10738l;
        this.f30886b = c10839m;
        this.f30887c = insertMessages;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37481a(@NotNull List<? extends ApiMatch> list, boolean z, boolean z2) {
        C2668g.b(list, "apiMatches");
        list = C3959e.fromIterable(list).filter(C11042a.f35806a).map(new C11043b(this, z, z2)).flatMapCompletable((Function) new C11044c(this));
        C2668g.a(list, "Observable.fromIterable(…s.execute(request = it) }");
        return list;
    }

    /* renamed from: a */
    private final Request m37478a(ApiMatch apiMatch, boolean z, boolean z2) {
        String _id = apiMatch._id();
        if (_id == null) {
            _id = apiMatch.id();
        }
        String str = _id;
        if (str == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        _id = apiMatch.lastActivityDate();
        if (_id == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        apiMatch = apiMatch.messages();
        if (apiMatch == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        DateTime a = this.f30885a.m43129a(_id);
        C2668g.a(a, "dateTimeApiAdapter.fromApi(lastActivityDate)");
        List a2 = this.f30886b.a(apiMatch);
        C2668g.a(a2, "messageApiAdapter.fromApi(messages)");
        return new Request(str, a, z, z2, a2);
    }
}
