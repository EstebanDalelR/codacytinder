package com.tinder.api.networkperf.inspector;

import com.tinder.api.networkperf.EmptyPerfEvent;
import com.tinder.api.networkperf.NetworkPerfEvent;
import com.tinder.api.networkperf.NetworkPerfEventDataModel;
import com.tinder.api.networkperf.PerfEventUrlUtils;
import com.tinder.api.networkperf.ValidPerfEvent;
import com.tinder.etl.event.du.C9064a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/api/networkperf/inspector/FastMatchV2NetworkPerfInspector;", "Lcom/tinder/api/networkperf/inspector/NetworkPerfInspector;", "perfEventUrlUtils", "Lcom/tinder/api/networkperf/PerfEventUrlUtils;", "(Lcom/tinder/api/networkperf/PerfEventUrlUtils;)V", "inspect", "Lcom/tinder/api/networkperf/NetworkPerfEvent;", "networkPerfEventDataModel", "Lcom/tinder/api/networkperf/NetworkPerfEventDataModel;", "clientPerfEventBuilder", "Lcom/tinder/etl/event/ClientPerfEventEvent$Builder;", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchV2NetworkPerfInspector implements NetworkPerfInspector {
    private final PerfEventUrlUtils perfEventUrlUtils;

    @Inject
    public FastMatchV2NetworkPerfInspector(@NotNull PerfEventUrlUtils perfEventUrlUtils) {
        C2668g.b(perfEventUrlUtils, "perfEventUrlUtils");
        this.perfEventUrlUtils = perfEventUrlUtils;
    }

    @NotNull
    public NetworkPerfEvent inspect(@NotNull NetworkPerfEventDataModel networkPerfEventDataModel, @NotNull C9064a c9064a) {
        C2668g.b(networkPerfEventDataModel, "networkPerfEventDataModel");
        C2668g.b(c9064a, "clientPerfEventBuilder");
        List urlPathSegments = networkPerfEventDataModel.getUrlPathSegments();
        if (urlPathSegments.size() < 2 || !C2668g.a((String) urlPathSegments.get(0), "v2") || !C2668g.a((String) urlPathSegments.get(1), "fast-match")) {
            return (NetworkPerfEvent) new EmptyPerfEvent();
        }
        networkPerfEventDataModel = c9064a.m38205b(this.perfEventUrlUtils.formatEndpoint(networkPerfEventDataModel.getUrl(), ae.a())).m38203a();
        C2668g.a(networkPerfEventDataModel, "it");
        return (NetworkPerfEvent) new ValidPerfEvent(networkPerfEventDataModel);
    }
}
