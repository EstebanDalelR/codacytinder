package com.snapchat.kit.sdk.bitmoji.search;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import com.snapchat.kit.sdk.bitmoji.models.StickerPack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.snapchat.kit.sdk.bitmoji.search.d */
public class C5909d {
    /* renamed from: a */
    private final LinkedHashMap<String, List<Sticker>> f21646a;
    /* renamed from: b */
    private final LinkedHashMap<String, StickerPack> f21647b;
    /* renamed from: c */
    private final Map<String, C5908a> f21648c;
    /* renamed from: d */
    private final Set<String> f21649d;
    /* renamed from: e */
    private final StickerPack f21650e;

    C5909d(LinkedHashMap<String, List<Sticker>> linkedHashMap, LinkedHashMap<String, StickerPack> linkedHashMap2, Map<String, C5908a> map, Set<String> set, StickerPack stickerPack) {
        this.f21646a = linkedHashMap;
        this.f21647b = linkedHashMap2;
        this.f21648c = map;
        this.f21649d = set;
        this.f21650e = stickerPack;
    }

    @NonNull
    /* renamed from: a */
    public Set<String> m25491a() {
        return this.f21646a.keySet();
    }

    @NonNull
    /* renamed from: b */
    public Collection<StickerPack> m25492b() {
        return this.f21647b.values();
    }

    @NonNull
    /* renamed from: a */
    public List<Sticker> m25490a(String str) {
        if (this.f21647b.containsKey(str)) {
            return ((StickerPack) this.f21647b.get(str)).getStickers();
        }
        if (this.f21646a.containsKey(str)) {
            return (List) this.f21646a.get(str);
        }
        return new ArrayList();
    }

    /* renamed from: b */
    public boolean m25493b(String str) {
        return this.f21649d.contains(str);
    }

    @NonNull
    /* renamed from: c */
    public List<Sticker> m25495c() {
        return this.f21650e == null ? new ArrayList() : this.f21650e.getStickers();
    }

    @Nullable
    /* renamed from: c */
    public StickerPack m25494c(String str) {
        return (StickerPack) this.f21647b.get(str);
    }

    @Nullable
    /* renamed from: d */
    public C5908a m25496d(String str) {
        return (C5908a) this.f21648c.get(str);
    }
}
