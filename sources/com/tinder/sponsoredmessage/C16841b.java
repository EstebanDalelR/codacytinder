package com.tinder.sponsoredmessage;

import com.tinder.messageads.model.C12131a;
import io.paperdb.Book;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/sponsoredmessage/PaperSponsoredMessageViewedCache;", "Lcom/tinder/sponsoredmessage/SponsoredMessageViewedCache;", "sponsoredAdViewedBook", "Lio/paperdb/Book;", "(Lio/paperdb/Book;)V", "add", "", "ad", "Lcom/tinder/messageads/model/MessageAd;", "clear", "exists", "", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.sponsoredmessage.b */
public final class C16841b implements SponsoredMessageViewedCache {
    /* renamed from: a */
    private final Book f51904a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b$a */
    static final class C16828a implements Action {
        /* renamed from: a */
        final /* synthetic */ C16841b f51887a;
        /* renamed from: b */
        final /* synthetic */ C12131a f51888b;

        C16828a(C16841b c16841b, C12131a c12131a) {
            this.f51887a = c16841b;
            this.f51888b = c12131a;
        }

        public final void run() {
            this.f51887a.f51904a.write(this.f51888b.d(), this.f51888b.d());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b$b */
    static final class C16829b implements Action {
        /* renamed from: a */
        public static final C16829b f51889a = new C16829b();

        C16829b() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b$c */
    static final class C16830c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16830c f51890a = new C16830c();

        C16830c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62384a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62384a(Throwable th) {
            C0001a.b(th, "Could not save ad", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b$d */
    static final class C16831d implements Action {
        /* renamed from: a */
        final /* synthetic */ C16841b f51891a;

        C16831d(C16841b c16841b) {
            this.f51891a = c16841b;
        }

        public final void run() {
            List<String> allKeys = this.f51891a.f51904a.getAllKeys();
            C2668g.a(allKeys, "sponsoredAdViewedBook.allKeys");
            for (String delete : allKeys) {
                this.f51891a.f51904a.delete(delete);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b$e */
    static final class C16832e implements Action {
        /* renamed from: a */
        public static final C16832e f51892a = new C16832e();

        C16832e() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.sponsoredmessage.b$f */
    static final class C16833f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16833f f51893a = new C16833f();

        C16833f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62385a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62385a(Throwable th) {
            C0001a.b(th, "Error clearing sponsored ads viewed cache", new Object[0]);
        }
    }

    public C16841b(@NotNull Book book) {
        C2668g.b(book, "sponsoredAdViewedBook");
        this.f51904a = book;
    }

    public void add(@NotNull C12131a c12131a) {
        C2668g.b(c12131a, "ad");
        C3956a.a(new C16828a(this, c12131a)).b(C15756a.m59010b()).a(C16829b.f51889a, C16830c.f51890a);
    }

    public boolean exists(@NotNull C12131a c12131a) {
        C2668g.b(c12131a, "ad");
        return this.f51904a.exist(c12131a.d());
    }

    public void clear() {
        C3956a.a(new C16831d(this)).b(C15756a.m59010b()).a(C16832e.f51892a, C16833f.f51893a);
    }
}
