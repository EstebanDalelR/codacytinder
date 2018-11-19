package com.tinder.domain.recs.model;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J]\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0001J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/tinder/domain/recs/model/TopPickTeaserRec;", "Lcom/tinder/domain/recs/model/Rec;", "id", "", "isRewindable", "", "source", "Lcom/tinder/domain/recs/model/RecSource;", "type", "Lcom/tinder/domain/recs/model/RecType;", "expirationTime", "", "photos", "", "Lcom/tinder/domain/common/model/Photo;", "tags", "Lcom/tinder/domain/recs/model/Tag;", "(Ljava/lang/String;ZLcom/tinder/domain/recs/model/RecSource;Lcom/tinder/domain/recs/model/RecType;JLjava/util/List;Ljava/util/List;)V", "getExpirationTime", "()J", "getId", "()Ljava/lang/String;", "imageUrl", "getImageUrl", "()Z", "getPhotos", "()Ljava/util/List;", "getSource", "()Lcom/tinder/domain/recs/model/RecSource;", "getTags", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPickTeaserRec implements Rec {
    private final long expirationTime;
    @NotNull
    private final String id;
    private final boolean isRewindable;
    @Nullable
    private final List<Photo> photos;
    @NotNull
    private final RecSource source;
    @NotNull
    private final List<Tag> tags;
    @NotNull
    private final RecType type;

    @NotNull
    public static /* synthetic */ TopPickTeaserRec copy$default(TopPickTeaserRec topPickTeaserRec, String str, boolean z, RecSource recSource, RecType recType, long j, List list, List list2, int i, Object obj) {
        TopPickTeaserRec topPickTeaserRec2 = topPickTeaserRec;
        return topPickTeaserRec2.copy((i & 1) != 0 ? topPickTeaserRec2.getId() : str, (i & 2) != 0 ? topPickTeaserRec2.isRewindable() : z, (i & 4) != 0 ? topPickTeaserRec2.getSource() : recSource, (i & 8) != 0 ? topPickTeaserRec2.getType() : recType, (i & 16) != 0 ? topPickTeaserRec2.expirationTime : j, (i & 32) != 0 ? topPickTeaserRec2.photos : list, (i & 64) != 0 ? topPickTeaserRec2.tags : list2);
    }

    @NotNull
    public final String component1() {
        return getId();
    }

    public final boolean component2() {
        return isRewindable();
    }

    @NotNull
    public final RecSource component3() {
        return getSource();
    }

    @NotNull
    public final RecType component4() {
        return getType();
    }

    public final long component5() {
        return this.expirationTime;
    }

    @Nullable
    public final List<Photo> component6() {
        return this.photos;
    }

    @NotNull
    public final List<Tag> component7() {
        return this.tags;
    }

    @NotNull
    public final TopPickTeaserRec copy(@NotNull String str, boolean z, @NotNull RecSource recSource, @NotNull RecType recType, long j, @Nullable List<? extends Photo> list, @NotNull List<Tag> list2) {
        String str2 = str;
        C2668g.b(str2, "id");
        RecSource recSource2 = recSource;
        C2668g.b(recSource2, "source");
        RecType recType2 = recType;
        C2668g.b(recType2, "type");
        List<Tag> list3 = list2;
        C2668g.b(list3, "tags");
        return new TopPickTeaserRec(str2, z, recSource2, recType2, j, list, list3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPickTeaserRec(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", isRewindable=");
        stringBuilder.append(isRewindable());
        stringBuilder.append(", source=");
        stringBuilder.append(getSource());
        stringBuilder.append(", type=");
        stringBuilder.append(getType());
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.tags);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public TopPickTeaserRec(@NotNull String str, boolean z, @NotNull RecSource recSource, @NotNull RecType recType, long j, @Nullable List<? extends Photo> list, @NotNull List<Tag> list2) {
        C2668g.b(str, "id");
        C2668g.b(recSource, "source");
        C2668g.b(recType, "type");
        C2668g.b(list2, "tags");
        this.id = str;
        this.isRewindable = z;
        this.source = recSource;
        this.type = recType;
        this.expirationTime = j;
        this.photos = list;
        this.tags = list2;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    public boolean isRewindable() {
        return this.isRewindable;
    }

    public /* synthetic */ TopPickTeaserRec(String str, boolean z, RecSource recSource, RecType recType, long j, List list, List list2, int i, C15823e c15823e) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? TopPicks.INSTANCE : recSource, (i & 8) != 0 ? RecType.TOP_PICKS_TEASER : recType, j, (i & 32) != 0 ? (List) null : list, (i & 64) != 0 ? C19301m.a() : list2);
    }

    @NotNull
    public RecSource getSource() {
        return this.source;
    }

    @NotNull
    public RecType getType() {
        return this.type;
    }

    public final long getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    public final List<Photo> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final List<Tag> getTags() {
        return this.tags;
    }

    @NotNull
    public final String getImageUrl() {
        Render render;
        String url;
        List list = this.photos;
        if (list == null) {
            list = C19301m.a();
        }
        Photo photo = (Photo) C19301m.g(list);
        if (photo != null) {
            list = photo.renders();
            if (list != null) {
                render = (Render) C19301m.g(list);
                if (render != null) {
                    url = render.url();
                    if (url != null) {
                        return url;
                    }
                }
                return "";
            }
        }
        render = null;
        if (render != null) {
            url = render.url();
            if (url != null) {
                return url;
            }
        }
        return "";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopPickTeaserRec) {
            return C2668g.a(getId(), ((TopPickTeaserRec) obj).getId());
        }
        return null;
    }

    public int hashCode() {
        return getId().hashCode();
    }
}
