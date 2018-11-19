package com.tinder.api.networkperf;

import com.tinder.etl.event.du;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/networkperf/ValidPerfEvent;", "Lcom/tinder/api/networkperf/NetworkPerfEvent;", "clientPerfEvent", "Lcom/tinder/etl/event/ClientPerfEventEvent;", "(Lcom/tinder/etl/event/ClientPerfEventEvent;)V", "getClientPerfEvent", "()Lcom/tinder/etl/event/ClientPerfEventEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ValidPerfEvent extends NetworkPerfEvent {
    @NotNull
    private final du clientPerfEvent;

    @NotNull
    public static /* synthetic */ ValidPerfEvent copy$default(ValidPerfEvent validPerfEvent, du duVar, int i, Object obj) {
        if ((i & 1) != 0) {
            duVar = validPerfEvent.clientPerfEvent;
        }
        return validPerfEvent.copy(duVar);
    }

    @NotNull
    public final du component1() {
        return this.clientPerfEvent;
    }

    @NotNull
    public final ValidPerfEvent copy(@NotNull du duVar) {
        C2668g.b(duVar, "clientPerfEvent");
        return new ValidPerfEvent(duVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ValidPerfEvent) {
                if (C2668g.a(this.clientPerfEvent, ((ValidPerfEvent) obj).clientPerfEvent)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        du duVar = this.clientPerfEvent;
        return duVar != null ? duVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ValidPerfEvent(clientPerfEvent=");
        stringBuilder.append(this.clientPerfEvent);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public final du getClientPerfEvent() {
        return this.clientPerfEvent;
    }

    public ValidPerfEvent(@NotNull du duVar) {
        C2668g.b(duVar, "clientPerfEvent");
        super();
        this.clientPerfEvent = duVar;
    }
}
