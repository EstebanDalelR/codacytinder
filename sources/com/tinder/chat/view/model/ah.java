package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/chat/view/model/SpotifyAlbumViewModel;", "", "name", "", "images", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ah {
    @NotNull
    /* renamed from: a */
    private final String f30193a;
    @NotNull
    /* renamed from: b */
    private final List<C10636b> f30194b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ah) {
                ah ahVar = (ah) obj;
                if (C2668g.a(this.f30193a, ahVar.f30193a) && C2668g.a(this.f30194b, ahVar.f30194b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f30193a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f30194b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifyAlbumViewModel(name=");
        stringBuilder.append(this.f30193a);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f30194b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ah(@NotNull String str, @NotNull List<C10636b> list) {
        C2668g.b(str, "name");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        this.f30193a = str;
        this.f30194b = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m36345a() {
        return this.f30193a;
    }

    @NotNull
    /* renamed from: b */
    public final List<C10636b> m36346b() {
        return this.f30194b;
    }
}
