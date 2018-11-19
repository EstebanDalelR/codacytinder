package com.tinder.data.recs;

import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.util.ConnectivityProvider;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/data/recs/CardGridRecsDataRepository;", "Lcom/tinder/data/recs/RecsDataRepository;", "recsDataStore", "Lcom/tinder/data/recs/RecsDataStore;", "recsApiClient", "Lcom/tinder/domain/recs/RecsApiClient;", "recsAlreadySwipedProvider", "Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "(Lcom/tinder/data/recs/RecsDataStore;Lcom/tinder/domain/recs/RecsApiClient;Lcom/tinder/data/recs/RecsAlreadySwipedProvider;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/recs/model/Rec$Source;)V", "duplicateRecsFilter", "Lcom/tinder/data/recs/DuplicateRecsFilter;", "cacheRecs", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "recsFetchResults", "engine_release"}, k = 1, mv = {1, 1, 9})
@EngineScope
/* renamed from: com.tinder.data.recs.a */
public final class C13095a extends C10991h {
    /* renamed from: a */
    private final C8773d f41705a;
    /* renamed from: b */
    private final C10992i f41706b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/data/recs/RecsFetchResults;", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.data.recs.a$a */
    static final class C8772a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C13095a f30821a;
        /* renamed from: b */
        final /* synthetic */ C8786k f30822b;

        C8772a(C13095a c13095a, C8786k c8786k) {
            this.f30821a = c13095a;
            this.f30822b = c8786k;
        }

        public /* synthetic */ Object call() {
            return m37374a();
        }

        @NotNull
        /* renamed from: a */
        public final C8786k m37374a() {
            this.f30821a.f41706b.m43634a(this.f30821a.f41705a.m37375a(this.f30822b.mo9896b()));
            return this.f30822b;
        }
    }

    @Inject
    public C13095a(@NotNull C10992i c10992i, @NotNull RecsApiClient recsApiClient, @NotNull C8776g c8776g, @NotNull ConnectivityProvider connectivityProvider, @NotNull Rec$Source rec$Source) {
        C2668g.b(c10992i, "recsDataStore");
        C2668g.b(recsApiClient, "recsApiClient");
        C2668g.b(c8776g, "recsAlreadySwipedProvider");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(rec$Source, "recSource");
        super(c10992i, recsApiClient, connectivityProvider, rec$Source);
        this.f41706b = c10992i;
        this.f41705a = new C8773d(c8776g, rec$Source);
    }

    @NotNull
    public Single<C8786k> cacheRecs(@NotNull C8786k c8786k) {
        C2668g.b(c8786k, "recsFetchResults");
        c8786k = Single.a(new C8772a(this, c8786k));
        C2668g.a(c8786k, "Single.fromCallable {\n  …ecsFetchResults\n        }");
        return c8786k;
    }
}
