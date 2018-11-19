package com.tinder.domain.recs.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0011\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/recs/model/Rec;", "", "id", "", "getId", "()Ljava/lang/String;", "isRewindable", "", "()Z", "source", "Lcom/tinder/domain/recs/model/Rec$Source;", "getSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "type", "Lcom/tinder/domain/recs/model/Rec$Type;", "getType", "()Lcom/tinder/domain/recs/model/Rec$Type;", "Source", "Type", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface Rec {
    @NotNull
    String getId();

    @NotNull
    Rec$Source getSource();

    @NotNull
    Rec$Type getType();

    boolean isRewindable();
}
