package com.tinder.domain.match.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH&¢\u0006\u0002\u0010\u001bR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/tinder/domain/match/model/Match;", "", "()V", "attribution", "Lcom/tinder/domain/match/model/Match$Attribution;", "getAttribution", "()Lcom/tinder/domain/match/model/Match$Attribution;", "creationDate", "Lorg/joda/time/DateTime;", "getCreationDate", "()Lorg/joda/time/DateTime;", "id", "", "getId", "()Ljava/lang/String;", "lastActivityDate", "getLastActivityDate", "muted", "", "getMuted", "()Z", "touched", "getTouched", "accept", "T", "visitor", "Lcom/tinder/domain/match/model/Match$Visitor;", "(Lcom/tinder/domain/match/model/Match$Visitor;)Ljava/lang/Object;", "Attribution", "Visitor", "Lcom/tinder/domain/match/model/CoreMatch;", "Lcom/tinder/domain/match/model/MessageAdMatch;", "Lcom/tinder/domain/match/model/PlacesMatch;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class Match {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/match/model/Match$Attribution;", "", "(Ljava/lang/String;I)V", "NONE", "BOOST", "I_SUPER_LIKE_THEM", "THEY_SUPER_LIKE_ME", "FAST_MATCH", "SPONSORED_AD", "PLACES", "TOP_PICKS", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Attribution {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\tJ\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/domain/match/model/Match$Visitor;", "T", "", "visit", "coreMatch", "Lcom/tinder/domain/match/model/CoreMatch;", "(Lcom/tinder/domain/match/model/CoreMatch;)Ljava/lang/Object;", "messageAdMatch", "Lcom/tinder/domain/match/model/MessageAdMatch;", "(Lcom/tinder/domain/match/model/MessageAdMatch;)Ljava/lang/Object;", "placesMatch", "Lcom/tinder/domain/match/model/PlacesMatch;", "(Lcom/tinder/domain/match/model/PlacesMatch;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public interface Visitor<T> {
        T visit(@NotNull CoreMatch coreMatch);

        T visit(@NotNull MessageAdMatch messageAdMatch);

        T visit(@NotNull PlacesMatch placesMatch);
    }

    public abstract <T> T accept(@NotNull Visitor<? extends T> visitor);

    @NotNull
    public abstract Attribution getAttribution();

    @NotNull
    public abstract DateTime getCreationDate();

    @NotNull
    public abstract String getId();

    @NotNull
    public abstract DateTime getLastActivityDate();

    public abstract boolean getMuted();

    public abstract boolean getTouched();

    private Match() {
    }
}
