package com.tinder.api.model.toppicks;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/toppicks/Tagging;", "", "region", "", "tags", "", "Lcom/tinder/api/model/toppicks/Tag;", "(Ljava/lang/String;Ljava/util/List;)V", "getRegion", "()Ljava/lang/String;", "getTags", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class Tagging {
    @Nullable
    private final String region;
    @NotNull
    private final List<Tag> tags;

    @NotNull
    public static /* synthetic */ Tagging copy$default(Tagging tagging, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagging.region;
        }
        if ((i & 2) != 0) {
            list = tagging.tags;
        }
        return tagging.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.region;
    }

    @NotNull
    public final List<Tag> component2() {
        return this.tags;
    }

    @NotNull
    public final Tagging copy(@Nullable String str, @NotNull List<Tag> list) {
        C2668g.b(list, "tags");
        return new Tagging(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Tagging) {
                Tagging tagging = (Tagging) obj;
                if (C2668g.a(this.region, tagging.region) && C2668g.a(this.tags, tagging.tags)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.region;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.tags;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tagging(region=");
        stringBuilder.append(this.region);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.tags);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Tagging(@Nullable String str, @NotNull List<Tag> list) {
        C2668g.b(list, "tags");
        this.region = str;
        this.tags = list;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final List<Tag> getTags() {
        return this.tags;
    }
}
