package com.tinder.data.feed;

import com.tinder.domain.feed.DraftRepository;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C15811g;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/feed/InMemoryDraftRepository;", "Lcom/tinder/domain/feed/DraftRepository;", "()V", "drafts", "", "", "clear", "Lrx/Completable;", "draftKey", "feedItemId", "carouselItemId", "loadDraft", "Lrx/Single;", "saveDraft", "message", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.feed.n */
public final class C10779n implements DraftRepository {
    /* renamed from: a */
    private Map<String, String> f35207a = ae.a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.n$b */
    static final class C8662b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10779n f30513a;
        /* renamed from: b */
        final /* synthetic */ String f30514b;
        /* renamed from: c */
        final /* synthetic */ String f30515c;

        C8662b(C10779n c10779n, String str, String str2) {
            this.f30513a = c10779n;
            this.f30514b = str;
            this.f30515c = str2;
        }

        public /* synthetic */ Object call() {
            return m36933a();
        }

        @NotNull
        /* renamed from: a */
        public final String m36933a() {
            String str;
            synchronized (this.f30513a) {
                str = (String) this.f30513a.f35207a.get(this.f30513a.m43231a(this.f30514b, this.f30515c));
                if (str == null) {
                    str = "";
                }
            }
            return str;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.n$a */
    static final class C13818a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10779n f43831a;

        C13818a(C10779n c10779n) {
            this.f43831a = c10779n;
        }

        public final void call() {
            synchronized (this.f43831a) {
                this.f43831a.f35207a = ae.a();
                C15813i c15813i = C15813i.f49016a;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.feed.n$c */
    static final class C13819c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10779n f43832a;
        /* renamed from: b */
        final /* synthetic */ String f43833b;
        /* renamed from: c */
        final /* synthetic */ String f43834c;
        /* renamed from: d */
        final /* synthetic */ String f43835d;

        C13819c(C10779n c10779n, String str, String str2, String str3) {
            this.f43832a = c10779n;
            this.f43833b = str;
            this.f43834c = str2;
            this.f43835d = str3;
        }

        public final void call() {
            synchronized (this.f43832a) {
                C10779n c10779n = this.f43832a;
                c10779n.f35207a = ae.a(c10779n.f35207a, C15811g.a(this.f43832a.m43231a(this.f43833b, this.f43834c), this.f43835d));
                C15813i c15813i = C15813i.f49016a;
            }
        }
    }

    @NotNull
    public Completable clear() {
        Completable a = Completable.a(new C13818a(this));
        C2668g.a(a, "Completable.fromAction {…mptyMap()\n        }\n    }");
        return a;
    }

    @NotNull
    public Completable saveDraft(@NotNull String str, @Nullable String str2, @NotNull String str3) {
        C2668g.b(str, "feedItemId");
        C2668g.b(str3, "message");
        str = Completable.a(new C13819c(this, str, str2, str3));
        C2668g.a(str, "Completable.fromAction {…o message\n        }\n    }");
        return str;
    }

    @NotNull
    public Single<String> loadDraft(@NotNull String str, @Nullable String str2) {
        C2668g.b(str, "feedItemId");
        str = Single.a(new C8662b(this, str, str2));
        C2668g.a(str, "Single.fromCallable {\n  …d)] ?: \"\"\n        }\n    }");
        return str;
    }

    /* renamed from: a */
    private final String m43231a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(str);
        stringBuilder.append(':');
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
