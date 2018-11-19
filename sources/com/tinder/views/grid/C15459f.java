package com.tinder.views.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/views/grid/UserRecPhotoAlbum;", "", "id", "", "photos", "", "Lcom/tinder/views/grid/UserRecPhotoAlbum$Photo;", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getPhotos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Photo", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.views.grid.f */
public final class C15459f {
    @NotNull
    /* renamed from: a */
    private final String f47891a;
    @NotNull
    /* renamed from: b */
    private final List<C15458a> f47892b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/views/grid/UserRecPhotoAlbum$Photo;", "", "url", "", "thumbnailUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getThumbnailUrl", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.grid.f$a */
    public static final class C15458a {
        @NotNull
        /* renamed from: a */
        private final String f47889a;
        @NotNull
        /* renamed from: b */
        private final String f47890b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15458a) {
                    C15458a c15458a = (C15458a) obj;
                    if (C2668g.a(this.f47889a, c15458a.f47889a) && C2668g.a(this.f47890b, c15458a.f47890b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f47889a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f47890b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Photo(url=");
            stringBuilder.append(this.f47889a);
            stringBuilder.append(", thumbnailUrl=");
            stringBuilder.append(this.f47890b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15458a(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "url");
            C2668g.b(str2, "thumbnailUrl");
            this.f47889a = str;
            this.f47890b = str2;
        }

        @NotNull
        /* renamed from: a */
        public final String m57952a() {
            return this.f47889a;
        }

        @NotNull
        /* renamed from: b */
        public final String m57953b() {
            return this.f47890b;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15459f) {
                C15459f c15459f = (C15459f) obj;
                if (C2668g.a(this.f47891a, c15459f.f47891a) && C2668g.a(this.f47892b, c15459f.f47892b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f47891a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f47892b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserRecPhotoAlbum(id=");
        stringBuilder.append(this.f47891a);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f47892b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C15459f(@NotNull String str, @NotNull List<C15458a> list) {
        C2668g.b(str, "id");
        C2668g.b(list, "photos");
        this.f47891a = str;
        this.f47892b = list;
    }

    @NotNull
    /* renamed from: a */
    public final List<C15458a> m57954a() {
        return this.f47892b;
    }
}
