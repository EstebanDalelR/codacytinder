package com.tinder.match.sponsoredmessage;

import com.tinder.ads.MessageAd;
import com.tinder.utils.RxUtils;
import io.paperdb.Book;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/match/sponsoredmessage/PaperViewedSponsoredMessageCache;", "Lcom/tinder/match/sponsoredmessage/ViewedSponsoredMessageCache;", "viewedSponsoredAdBook", "Lio/paperdb/Book;", "(Lio/paperdb/Book;)V", "add", "", "ad", "Lcom/tinder/ads/MessageAd;", "clear", "exists", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.sponsoredmessage.g */
public final class C12088g implements ViewedSponsoredMessageCache {
    /* renamed from: a */
    private final Book f39242a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.g$a */
    static final class C14074a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C12088g f44588a;
        /* renamed from: b */
        final /* synthetic */ MessageAd f44589b;

        C14074a(C12088g c12088g, MessageAd messageAd) {
            this.f44588a = c12088g;
            this.f44589b = messageAd;
        }

        public final void call() {
            this.f44588a.f39242a.write(this.f44589b.id(), this.f44589b.id());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.sponsoredmessage.g$b */
    static final class C14075b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C12088g f44590a;

        C14075b(C12088g c12088g) {
            this.f44590a = c12088g;
        }

        public final void call() {
            List<String> allKeys = this.f44590a.f39242a.getAllKeys();
            C2668g.a(allKeys, "viewedSponsoredAdBook.allKeys");
            for (String delete : allKeys) {
                this.f44590a.f39242a.delete(delete);
            }
        }
    }

    public C12088g(@NotNull Book book) {
        C2668g.b(book, "viewedSponsoredAdBook");
        this.f39242a = book;
    }

    public void add(@NotNull MessageAd messageAd) {
        C2668g.b(messageAd, "ad");
        Completable.a(new C14074a(this, messageAd)).b(Schedulers.io()).b(RxUtils.b());
    }

    public boolean exists(@NotNull MessageAd messageAd) {
        C2668g.b(messageAd, "ad");
        return this.f39242a.exist(messageAd.id());
    }

    public void clear() {
        Completable.a(new C14075b(this)).b(Schedulers.io()).b(RxUtils.b());
    }
}
