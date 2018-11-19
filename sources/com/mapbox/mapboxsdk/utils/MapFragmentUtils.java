package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.os.Bundle;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapboxMapOptions;

public class MapFragmentUtils {
    public static Bundle createFragmentArgs(MapboxMapOptions mapboxMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS, mapboxMapOptions);
        return bundle;
    }

    public static MapboxMapOptions resolveArgs(Context context, Bundle bundle) {
        if (bundle == null || !bundle.containsKey(MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS)) {
            return MapboxMapOptions.createFromAttributes(context, null);
        }
        return (MapboxMapOptions) bundle.getParcelable(MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS);
    }
}
