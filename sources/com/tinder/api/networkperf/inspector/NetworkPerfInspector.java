package com.tinder.api.networkperf.inspector;

import com.tinder.api.networkperf.NetworkPerfEvent;
import com.tinder.api.networkperf.NetworkPerfEventDataModel;
import com.tinder.etl.event.du.C9064a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/api/networkperf/inspector/NetworkPerfInspector;", "", "inspect", "Lcom/tinder/api/networkperf/NetworkPerfEvent;", "networkPerfEventDataModel", "Lcom/tinder/api/networkperf/NetworkPerfEventDataModel;", "clientPerfEventBuilder", "Lcom/tinder/etl/event/ClientPerfEventEvent$Builder;", "api_release"}, k = 1, mv = {1, 1, 10})
public interface NetworkPerfInspector {
    @NotNull
    NetworkPerfEvent inspect(@NotNull NetworkPerfEventDataModel networkPerfEventDataModel, @NotNull C9064a c9064a);
}
