package com.tinder.scarlet;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/scarlet/Session;", "", "webSocket", "Lcom/tinder/scarlet/WebSocket;", "webSocketDisposable", "Lio/reactivex/disposables/Disposable;", "(Lcom/tinder/scarlet/WebSocket;Lio/reactivex/disposables/Disposable;)V", "getWebSocket", "()Lcom/tinder/scarlet/WebSocket;", "getWebSocketDisposable", "()Lio/reactivex/disposables/Disposable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.e */
public final class C14794e {
    @NotNull
    /* renamed from: a */
    private final WebSocket f46375a;
    @NotNull
    /* renamed from: b */
    private final Disposable f46376b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14794e) {
                C14794e c14794e = (C14794e) obj;
                if (C2668g.a(this.f46375a, c14794e.f46375a) && C2668g.a(this.f46376b, c14794e.f46376b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        WebSocket webSocket = this.f46375a;
        int i = 0;
        int hashCode = (webSocket != null ? webSocket.hashCode() : 0) * 31;
        Disposable disposable = this.f46376b;
        if (disposable != null) {
            i = disposable.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Session(webSocket=");
        stringBuilder.append(this.f46375a);
        stringBuilder.append(", webSocketDisposable=");
        stringBuilder.append(this.f46376b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14794e(@NotNull WebSocket webSocket, @NotNull Disposable disposable) {
        C2668g.b(webSocket, "webSocket");
        C2668g.b(disposable, "webSocketDisposable");
        this.f46375a = webSocket;
        this.f46376b = disposable;
    }

    @NotNull
    /* renamed from: a */
    public final WebSocket m56090a() {
        return this.f46375a;
    }
}
