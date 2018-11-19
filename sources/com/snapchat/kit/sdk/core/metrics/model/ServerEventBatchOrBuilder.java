package com.snapchat.kit.sdk.core.metrics.model;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ServerEventBatchOrBuilder extends MessageOrBuilder {
    long getMaxSequenceIdOnInstance();

    ServerEvent getServerEvents(int i);

    int getServerEventsCount();

    List<ServerEvent> getServerEventsList();

    ServerEventOrBuilder getServerEventsOrBuilder(int i);

    List<? extends ServerEventOrBuilder> getServerEventsOrBuilderList();

    double getServerUploadTs();
}
