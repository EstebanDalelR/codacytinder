package com.tinder.recsads.model;

import com.tinder.addy.Ad;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.Rec$Type;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/tinder/recsads/model/AdRec;", "Lcom/tinder/domain/recs/model/Rec;", "ad", "Lcom/tinder/addy/Ad;", "(Lcom/tinder/addy/Ad;)V", "getAd", "()Lcom/tinder/addy/Ad;", "id", "", "getId", "()Ljava/lang/String;", "isRewindable", "", "()Z", "source", "Lcom/tinder/domain/recs/model/RecSource$Core;", "getSource", "()Lcom/tinder/domain/recs/model/RecSource$Core;", "type", "Lcom/tinder/domain/recs/model/RecType;", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "equals", "other", "", "hashCode", "", "toString", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.model.a */
public final class C16464a implements Rec {
    @NotNull
    /* renamed from: a */
    private final String f51053a = this.f51057e.id();
    @NotNull
    /* renamed from: b */
    private final RecType f51054b = RecType.AD;
    @NotNull
    /* renamed from: c */
    private final Core f51055c = Core.INSTANCE;
    /* renamed from: d */
    private final boolean f51056d;
    @NotNull
    /* renamed from: e */
    private final Ad f51057e;

    public C16464a(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        this.f51057e = ad;
    }

    @NotNull
    /* renamed from: c */
    public final Ad m61877c() {
        return this.f51057e;
    }

    public /* synthetic */ Rec$Source getSource() {
        return m61876b();
    }

    public /* synthetic */ Rec$Type getType() {
        return m61875a();
    }

    @NotNull
    public String getId() {
        return this.f51053a;
    }

    @NotNull
    /* renamed from: a */
    public RecType m61875a() {
        return this.f51054b;
    }

    @NotNull
    /* renamed from: b */
    public Core m61876b() {
        return this.f51055c;
    }

    public boolean isRewindable() {
        return this.f51056d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16464a) {
            return C2668g.a(getId(), ((C16464a) obj).getId());
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
