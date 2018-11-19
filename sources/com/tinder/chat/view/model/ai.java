package com.tinder.chat.view.model;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tinder/chat/view/model/SpotifyArtistViewModel;", "", "id", "", "name", "images", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ai {
    @NotNull
    /* renamed from: a */
    private final String f30195a;
    @NotNull
    /* renamed from: b */
    private final String f30196b;
    @NotNull
    /* renamed from: c */
    private final List<C10636b> f30197c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ai) {
                ai aiVar = (ai) obj;
                if (C2668g.a(this.f30195a, aiVar.f30195a) && C2668g.a(this.f30196b, aiVar.f30196b) && C2668g.a(this.f30197c, aiVar.f30197c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f30195a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30196b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f30197c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifyArtistViewModel(id=");
        stringBuilder.append(this.f30195a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f30196b);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f30197c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ai(@NotNull String str, @NotNull String str2, @NotNull List<C10636b> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        this.f30195a = str;
        this.f30196b = str2;
        this.f30197c = list;
    }

    @NotNull
    /* renamed from: a */
    public final String m36347a() {
        return this.f30195a;
    }

    @NotNull
    /* renamed from: b */
    public final String m36348b() {
        return this.f30196b;
    }
}
