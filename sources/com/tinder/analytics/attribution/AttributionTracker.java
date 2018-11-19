package com.tinder.analytics.attribution;

import java.util.Map;

public interface AttributionTracker {
    void initialize();

    void trackEvent(String str, Map<String, Object> map);
}
