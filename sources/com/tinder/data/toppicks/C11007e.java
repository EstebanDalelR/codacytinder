package com.tinder.data.toppicks;

import com.tinder.api.model.toppicks.Tagging;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.recs.model.Tag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/data/toppicks/TagDomainApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "", "Lcom/tinder/domain/recs/model/Tag;", "Lcom/tinder/api/model/toppicks/Tagging;", "()V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.e */
public final class C11007e extends C2646o<List<? extends Tag>, Tagging> {
    @NotNull
    /* renamed from: a */
    public List<Tag> m43654a(@NotNull Tagging tagging) {
        C2668g.b(tagging, "apiModel");
        Iterable<com.tinder.api.model.toppicks.Tag> tags = tagging.getTags();
        Collection arrayList = new ArrayList(C19301m.a(tags, 10));
        for (com.tinder.api.model.toppicks.Tag tag : tags) {
            String id = tag.getId();
            String name = tag.getName();
            String region = tagging.getRegion();
            if (region == null) {
                region = "empty_region";
            }
            arrayList.add(new Tag(id, name, region));
        }
        return (List) arrayList;
    }
}
