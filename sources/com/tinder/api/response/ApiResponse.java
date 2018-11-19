package com.tinder.api.response;

import java.util.List;

public abstract class ApiResponse<T> {
    private List<T> results;

    public List<T> results() {
        return this.results;
    }
}
