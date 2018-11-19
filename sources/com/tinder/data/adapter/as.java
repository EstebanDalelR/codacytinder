package com.tinder.data.adapter;

import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.data.generated.proto.TinderProto.C14287v;
import com.tinder.data.generated.proto.TinderProto.C14289w;
import com.tinder.data.generated.proto.TinderProto.C14289w.C14288a;
import com.tinder.data.generated.proto.TinderProto.TagOrBuilder;
import com.tinder.domain.recs.model.Tag;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tinder/data/adapter/TagsProtobufColumnAdapter;", "Lcom/squareup/sqldelight/ColumnAdapter;", "", "Lcom/tinder/domain/recs/model/Tag;", "", "()V", "decode", "databaseValue", "encode", "tags", "data_release"}, k = 1, mv = {1, 1, 10})
public final class as implements ColumnAdapter<List<? extends Tag>, byte[]> {
    /* renamed from: a */
    public static final as f35130a = new as();

    private as() {
    }

    public /* synthetic */ Object decode(Object obj) {
        return m43120a((byte[]) obj);
    }

    public /* synthetic */ Object encode(Object obj) {
        return m43121a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public byte[] m43121a(@NotNull List<Tag> list) {
        C2668g.b(list, "tags");
        C14288a b = C14289w.m54325b();
        for (Tag tag : list) {
            b.m54321a(C14287v.m54312a().m54309a(tag.getId()).m54310b(tag.getName()).m54311c(tag.getRegion()));
        }
        list = ((C14289w) b.build()).toByteArray();
        C2668g.a(list, "protoTagsBuilder.build().toByteArray()");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public List<Tag> m43120a(@Nullable byte[] bArr) {
        List<Tag> arrayList = new ArrayList();
        try {
            bArr = C14289w.m54322a(bArr);
            C2668g.a(bArr, "protoTags");
            for (TagOrBuilder tagOrBuilder : bArr.m54328a()) {
                C2668g.a(tagOrBuilder, "protoTag");
                String id = tagOrBuilder.getId();
                C2668g.a(id, "protoTag.id");
                String name = tagOrBuilder.getName();
                C2668g.a(name, "protoTag.name");
                String region = tagOrBuilder.getRegion();
                C2668g.a(region, "protoTag.region");
                arrayList.add(new Tag(id, name, region));
            }
        } catch (byte[] bArr2) {
            C0001a.c((Throwable) bArr2, "Error decoding Tags", new Object[0]);
        }
        return arrayList;
    }
}
