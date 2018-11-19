package com.tinder.recs.model;

import com.tinder.ads.Ad;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecType;
import com.tinder.recsads.model.C16464a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/tinder/recs/model/AdRec;", "Lcom/tinder/domain/recs/model/Rec;", "ad", "Lcom/tinder/ads/Ad;", "(Lcom/tinder/ads/Ad;)V", "getAd", "()Lcom/tinder/ads/Ad;", "id", "", "getId", "()Ljava/lang/String;", "isRewindable", "", "()Z", "source", "Lcom/tinder/domain/recs/model/RecSource$Core;", "getSource", "()Lcom/tinder/domain/recs/model/RecSource$Core;", "type", "Lcom/tinder/domain/recs/model/RecType;", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "equals", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "This version of AdRec is deprecated. Use version from recs-ads module", replaceWith = @ReplaceWith(expression = "AdRec", imports = {"com.tinder.recsads.model.AdRec"}))
public final class AdRec implements Rec {
    @NotNull
    private final Ad<?> ad;
    @NotNull
    private final String id = this.ad.id();
    private final boolean isRewindable;
    @NotNull
    private final Core source = Core.INSTANCE;
    @NotNull
    private final RecType type = RecType.AD;

    public AdRec(@NotNull Ad<?> ad) {
        C2668g.m10309b(ad, "ad");
        this.ad = ad;
    }

    @NotNull
    public final Ad<?> getAd() {
        return this.ad;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public RecType getType() {
        return this.type;
    }

    @NotNull
    public Core getSource() {
        return this.source;
    }

    public boolean isRewindable() {
        return this.isRewindable;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16464a) {
            return C2668g.m10308a(getId(), ((C16464a) obj).getId());
        }
        return null;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdRec{id=");
        stringBuilder.append(getId());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
