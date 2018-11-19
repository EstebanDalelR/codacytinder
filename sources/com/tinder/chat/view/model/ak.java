package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/tinder/chat/view/model/SpotifySongViewModel;", "", "id", "", "name", "url", "album", "Lcom/tinder/chat/view/model/SpotifyAlbumViewModel;", "artists", "", "Lcom/tinder/chat/view/model/SpotifyArtistViewModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/chat/view/model/SpotifyAlbumViewModel;Ljava/util/List;)V", "getAlbum", "()Lcom/tinder/chat/view/model/SpotifyAlbumViewModel;", "getArtists", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ak {
    @NotNull
    /* renamed from: a */
    private final String f30198a;
    @NotNull
    /* renamed from: b */
    private final String f30199b;
    @NotNull
    /* renamed from: c */
    private final String f30200c;
    @Nullable
    /* renamed from: d */
    private final ah f30201d;
    @NotNull
    /* renamed from: e */
    private final List<ai> f30202e;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ak) {
                ak akVar = (ak) obj;
                if (C2668g.a(this.f30198a, akVar.f30198a) && C2668g.a(this.f30199b, akVar.f30199b) && C2668g.a(this.f30200c, akVar.f30200c) && C2668g.a(this.f30201d, akVar.f30201d) && C2668g.a(this.f30202e, akVar.f30202e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f30198a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30199b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f30200c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ah ahVar = this.f30201d;
        hashCode = (hashCode + (ahVar != null ? ahVar.hashCode() : 0)) * 31;
        List list = this.f30202e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifySongViewModel(id=");
        stringBuilder.append(this.f30198a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f30199b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f30200c);
        stringBuilder.append(", album=");
        stringBuilder.append(this.f30201d);
        stringBuilder.append(", artists=");
        stringBuilder.append(this.f30202e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ak(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable ah ahVar, @NotNull List<ai> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(str3, "url");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_ARTISTS);
        this.f30198a = str;
        this.f30199b = str2;
        this.f30200c = str3;
        this.f30201d = ahVar;
        this.f30202e = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m36349a() {
        return this.f30198a;
    }

    @NotNull
    /* renamed from: b */
    public final String m36350b() {
        return this.f30199b;
    }

    @NotNull
    /* renamed from: c */
    public final String m36351c() {
        return this.f30200c;
    }

    @Nullable
    /* renamed from: d */
    public final ah m36352d() {
        return this.f30201d;
    }

    @NotNull
    /* renamed from: e */
    public final List<ai> m36353e() {
        return this.f30202e;
    }
}
