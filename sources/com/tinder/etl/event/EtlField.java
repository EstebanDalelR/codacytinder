package com.tinder.etl.event;

public interface EtlField<T> {
    String description();

    String name();

    Class<T> type();
}
