package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import com.google.protobuf.InvalidProtocolBufferException;
import com.squareup.sqldelight.ColumnAdapter;
import com.tinder.data.generated.proto.TinderProto;
import com.tinder.data.generated.proto.TinderProto.C14281s;
import com.tinder.data.generated.proto.TinderProto.C14281s.C14280a;
import com.tinder.data.generated.proto.TinderProto.Photo.C14241a;
import com.tinder.data.generated.proto.TinderProto.Photo.C14243b;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Builder;
import com.tinder.domain.common.model.Photo.Render;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.p001a.C0001a;

public class af implements ColumnAdapter<List<Photo>, byte[]> {
    @NonNull
    public /* synthetic */ Object decode(Object obj) {
        return m43082a((byte[]) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m43083a((List) obj);
    }

    @NonNull
    /* renamed from: a */
    public List<Photo> m43082a(byte[] bArr) {
        List<Photo> arrayList;
        List<Photo> emptyList = Collections.emptyList();
        try {
            bArr = C14281s.m54285a(bArr);
            arrayList = new ArrayList(bArr.getPhotosCount());
            try {
                for (TinderProto.Photo photo : bArr.getPhotosList()) {
                    Builder url = Photo.builder().id(photo.getId()).url(photo.getUrl());
                    List arrayList2 = new ArrayList(photo.getRendersCount());
                    for (C14243b c14243b : photo.getRendersList()) {
                        arrayList2.add(Render.builder().url(c14243b.getUrl()).width(c14243b.getWidth()).height(c14243b.getHeight()).build());
                    }
                    url.renders(arrayList2);
                    url.videos(Collections.emptyList());
                    arrayList.add(url.build());
                }
            } catch (InvalidProtocolBufferException e) {
                bArr = e;
                C0001a.c(bArr, "Error decoding Photos", new Object[0]);
                return arrayList;
            }
        } catch (InvalidProtocolBufferException e2) {
            bArr = e2;
            arrayList = emptyList;
            C0001a.c(bArr, "Error decoding Photos", new Object[0]);
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    public byte[] m43083a(@NonNull List<Photo> list) {
        C14280a a = C14281s.m54284a();
        for (Photo photo : list) {
            C14241a a2 = TinderProto.Photo.m54082a().m54069b(photo.id()).m54068a(photo.url());
            for (Render render : photo.renders()) {
                a2.m54067a(C14243b.m54073a().m54071a(render.url()).m54070a(render.width()).m54072b(render.height()));
            }
            a.m54283a(a2);
        }
        return ((C14281s) a.build()).toByteArray();
    }
}
