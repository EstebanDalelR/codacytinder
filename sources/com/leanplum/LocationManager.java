package com.leanplum;

import java.util.Map;
import java.util.Set;

public interface LocationManager {
    void setRegionsData(Map<String, Object> map, Set<String> set, Set<String> set2);

    void updateGeofencing();

    void updateUserLocation();
}
