package com.tinder.data.recs;

import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/recs/DuplicateRecsFilter;", "", "recsAlreadySwipedProvider", "Lcom/tinder/data/recs/RecsAlreadySwipedProvider;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "(Lcom/tinder/data/recs/RecsAlreadySwipedProvider;Lcom/tinder/domain/recs/model/Rec$Source;)V", "dedupedRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "recs", "engine_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.data.recs.d */
public final class C8773d {
    /* renamed from: a */
    private final C8776g f30823a;
    /* renamed from: b */
    private final Rec$Source f30824b;

    public C8773d(@NotNull C8776g c8776g, @NotNull Rec$Source rec$Source) {
        C2668g.b(c8776g, "recsAlreadySwipedProvider");
        C2668g.b(rec$Source, "recSource");
        this.f30823a = c8776g;
        this.f30824b = rec$Source;
    }

    @NotNull
    /* renamed from: a */
    public final List<Rec> m37375a(@NotNull List<? extends Rec> list) {
        C2668g.b(list, "recs");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            Rec rec = (Rec) next;
            boolean b = this.f30823a.m37383b(rec.getId());
            if (b) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(this.f30824b);
                stringBuilder.append(" - Trying to append an already swiped Rec into the recs queue. Skipping it... ");
                stringBuilder.append(rec.getId());
                C0001a.b(stringBuilder.toString(), new Object[0]);
            }
            if ((b ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
