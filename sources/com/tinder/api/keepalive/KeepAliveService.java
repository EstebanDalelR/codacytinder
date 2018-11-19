package com.tinder.api.keepalive;

import com.tinder.proto.keepalive.KeepAliveNudge.Nudge;
import com.tinder.proto.keepalive.KeepAliveTypingIndicator.TypingIndicator;
import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.C14797g;
import com.tinder.scarlet.WebSocket.C14786a;
import com.tinder.scarlet.ws.Receive;
import com.tinder.scarlet.ws.Send;
import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH'¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/keepalive/KeepAliveService;", "", "observeEvent", "Lio/reactivex/Flowable;", "Lcom/tinder/scarlet/Event;", "observeNudge", "Lcom/tinder/proto/keepalive/KeepAliveNudge$Nudge;", "observeState", "Lcom/tinder/scarlet/State;", "observeTypingIndicator", "Lcom/tinder/proto/keepalive/KeepAliveTypingIndicator$TypingIndicator;", "observeWebSocketEvent", "Lcom/tinder/scarlet/WebSocket$Event;", "sendTypingIndicator", "", "typingIndicator", "api_release"}, k = 1, mv = {1, 1, 10})
public interface KeepAliveService {
    @NotNull
    @Receive
    C3957b<C14788b> observeEvent();

    @NotNull
    @Receive
    C3957b<Nudge> observeNudge();

    @NotNull
    @Receive
    C3957b<C14797g> observeState();

    @NotNull
    @Receive
    C3957b<TypingIndicator> observeTypingIndicator();

    @NotNull
    @Receive
    C3957b<C14786a> observeWebSocketEvent();

    @Send
    void sendTypingIndicator(@NotNull TypingIndicator typingIndicator);
}
