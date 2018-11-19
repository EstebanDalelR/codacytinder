package com.tinder.data.recs;

import com.tinder.data.recs.C8786k.C10997e;
import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/data/recs/CardStackRecsDataRepository;", "Lcom/tinder/data/recs/RecsDataRepository;", "recsDataStore", "Lcom/tinder/data/recs/RecsDataStore;", "recsApiClient", "Lcom/tinder/domain/recs/RecsApiClient;", "recsAlreadySwipedProvider", "Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "(Lcom/tinder/data/recs/RecsDataStore;Lcom/tinder/domain/recs/RecsApiClient;Lcom/tinder/data/recs/RecsAlreadySwipedProvider;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/recs/model/Rec$Source;)V", "consecutiveDupedResponsesCount", "", "duplicateRecsFilter", "Lcom/tinder/data/recs/DuplicateRecsFilter;", "cacheRecs", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "recsFetchResults", "incrementDupeResponsesCount", "", "normalizedRecsFetchResults", "recsResults", "recsWereAdded", "", "resetDupedResponsesCount", "tooManyDupedResponses", "Companion", "UnknownRecsResponseException", "engine_release"}, k = 1, mv = {1, 1, 9})
@EngineScope
public final class CardStackRecsDataRepository extends C10991h {
    /* renamed from: a */
    public static final C8770a f41701a = new C8770a();
    /* renamed from: b */
    private final C8773d f41702b;
    /* renamed from: c */
    private int f41703c;
    /* renamed from: d */
    private final C10992i f41704d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/data/recs/CardStackRecsDataRepository$UnknownRecsResponseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class UnknownRecsResponseException extends RuntimeException {
        public UnknownRecsResponseException(@NotNull String str) {
            C2668g.b(str, "message");
            super(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/recs/CardStackRecsDataRepository$Companion;", "", "()V", "MAX_CONSECUTIVE_DUPED_RESPONSES_ALLOWED", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.CardStackRecsDataRepository$a */
    public static final class C8770a {
        private C8770a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/data/recs/RecsFetchResults;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.CardStackRecsDataRepository$b */
    static final class C8771b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ CardStackRecsDataRepository f30819a;
        /* renamed from: b */
        final /* synthetic */ C8786k f30820b;

        C8771b(CardStackRecsDataRepository cardStackRecsDataRepository, C8786k c8786k) {
            this.f30819a = cardStackRecsDataRepository;
            this.f30820b = c8786k;
        }

        public /* synthetic */ Object call() {
            return m37373a();
        }

        @NotNull
        /* renamed from: a */
        public final C8786k m37373a() {
            if (!this.f30820b.m37394a()) {
                this.f30819a.m50946c();
                throw new UnknownRecsResponseException("RecsResults contains an unknown response");
            } else if (this.f30820b.mo9896b().isEmpty()) {
                this.f30819a.m50946c();
                return this.f30820b;
            } else {
                return this.f30819a.m50940a(this.f30820b, this.f30819a.f41704d.m43634a(this.f30819a.f41702b.m37375a(this.f30820b.mo9896b())));
            }
        }
    }

    @Inject
    public CardStackRecsDataRepository(@NotNull C10992i c10992i, @NotNull RecsApiClient recsApiClient, @NotNull C8776g c8776g, @NotNull ConnectivityProvider connectivityProvider, @NotNull Rec$Source rec$Source) {
        C2668g.b(c10992i, "recsDataStore");
        C2668g.b(recsApiClient, "recsApiClient");
        C2668g.b(c8776g, "recsAlreadySwipedProvider");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(rec$Source, "recSource");
        super(c10992i, recsApiClient, connectivityProvider, rec$Source);
        this.f41704d = c10992i;
        this.f41702b = new C8773d(c8776g, rec$Source);
    }

    @NotNull
    public Single<C8786k> cacheRecs(@NotNull C8786k c8786k) {
        C2668g.b(c8786k, "recsFetchResults");
        c8786k = Single.a(new C8771b(this, c8786k));
        C2668g.a(c8786k, "Single.fromCallable {\n  … recsWereAdded)\n        }");
        return c8786k;
    }

    /* renamed from: a */
    private final C8786k m50940a(C8786k c8786k, boolean z) {
        if (z) {
            m50946c();
        } else {
            m50944b();
            if (m50942a()) {
                C0001a.d("Too many consecutive recs responses containing only dupes. Returning %s status", new Object[]{C10997e.f35731a});
                m50946c();
                return C10997e.f35731a;
            }
        }
        return c8786k;
    }

    /* renamed from: a */
    private final boolean m50942a() {
        return this.f41703c >= 5;
    }

    /* renamed from: b */
    private final void m50944b() {
        this.f41703c++;
    }

    /* renamed from: c */
    private final void m50946c() {
        this.f41703c = 0;
    }
}
