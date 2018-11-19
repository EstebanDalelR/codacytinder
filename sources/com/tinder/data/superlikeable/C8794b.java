package com.tinder.data.superlikeable;

import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import io.paperdb.Book;
import java8.util.Optional;
import java8.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0007H\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/superlikeable/SuperLikeableGameDataStore;", "", "paperBook", "Lio/paperdb/Book;", "(Lio/paperdb/Book;)V", "gameInMemoryCache", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "getFromCache", "getSkipPendingToken", "", "isMarkedAsSkipPending", "", "gameToken", "markCachedGameAsSkipPending", "markTokenAsSkipPending", "", "tokenId", "resetSkipPendingStatus", "saveToMemoryCache", "superLikeableGame", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.superlikeable.b */
public final class C8794b {
    /* renamed from: a */
    private Optional<SuperLikeableGame> f30866a;
    /* renamed from: b */
    private Book f30867b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.superlikeable.b$a */
    static final class C11001a<T> implements Consumer<SuperLikeableGame> {
        /* renamed from: a */
        final /* synthetic */ C8794b f35736a;
        /* renamed from: b */
        final /* synthetic */ ObjectRef f35737b;

        C11001a(C8794b c8794b, ObjectRef objectRef) {
            this.f35736a = c8794b;
            this.f35737b = objectRef;
        }

        public /* synthetic */ void accept(Object obj) {
            m43649a((SuperLikeableGame) obj);
        }

        /* renamed from: a */
        public final void m43649a(SuperLikeableGame superLikeableGame) {
            this.f35737b.f49022a = ((SuperLikeableGame) this.f35736a.f30866a.b()).getTokenId();
            this.f35736a.m37423b((String) this.f35737b.f49022a);
        }
    }

    public C8794b(@NotNull Book book) {
        C2668g.b(book, "paperBook");
        this.f30867b = book;
        book = Optional.a();
        C2668g.a(book, "Optional.empty()");
        this.f30866a = book;
    }

    @NotNull
    /* renamed from: a */
    public final synchronized Optional<SuperLikeableGame> m37424a() {
        return this.f30866a;
    }

    /* renamed from: a */
    public final synchronized void m37425a(@NotNull SuperLikeableGame superLikeableGame) {
        C2668g.b(superLikeableGame, "superLikeableGame");
        Optional a = Optional.a(superLikeableGame);
        C2668g.a(a, "Optional.of(superLikeableGame)");
        this.f30866a = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikeable game was saved to the memory cache: ");
        stringBuilder.append(superLikeableGame);
        C0001a.b(stringBuilder.toString(), new Object[0]);
    }

    /* renamed from: b */
    public final synchronized void m37427b() {
        this.f30867b.delete("SKIP_PENDING_TOKEN_ID");
        C0001a.b("deleted skip token cache from the persistent storage", new Object[0]);
    }

    @NotNull
    /* renamed from: c */
    public final synchronized String m37428c() {
        ObjectRef objectRef;
        objectRef = new ObjectRef();
        objectRef.f49022a = "";
        this.f30866a.a(new C11001a(this, objectRef));
        return (String) objectRef.f49022a;
    }

    @NotNull
    /* renamed from: d */
    public final synchronized String m37429d() {
        String str;
        str = (String) this.f30867b.read("SKIP_PENDING_TOKEN_ID");
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* renamed from: a */
    public final synchronized boolean m37426a(@NotNull String str) {
        boolean a;
        C2668g.b(str, "gameToken");
        a = C2668g.a(str, m37429d());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("is ");
        stringBuilder.append(str);
        stringBuilder.append(" MarkedAsSkipPending? ");
        stringBuilder.append(a);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        return a;
    }

    /* renamed from: b */
    private final void m37423b(String str) {
        this.f30867b.write("SKIP_PENDING_TOKEN_ID", str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tokenId ");
        stringBuilder.append(str);
        stringBuilder.append(" was persisted");
        C0001a.b(stringBuilder.toString(), new Object[0]);
    }
}
