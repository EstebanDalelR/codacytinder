package com.tinder.etl.event;

public interface DescriptorFactory<D extends fw, E extends EtlEvent> {
    D createDescriptor(E e);
}
