package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.utils.MapFragmentUtils;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment implements OnMapReadyCallback {
    private MapView map;
    private final List<OnMapReadyCallback> mapReadyCallbackList = new ArrayList();
    private MapboxMap mapboxMap;

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(@Nullable MapboxMapOptions mapboxMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        supportMapFragment.setArguments(MapFragmentUtils.createFragmentArgs(mapboxMapOptions));
        return supportMapFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = layoutInflater.getContext();
        this.map = new MapView(context, MapFragmentUtils.resolveArgs(context, getArguments()));
        return this.map;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.map.onCreate(bundle);
        this.map.getMapAsync(this);
    }

    public void onMapReady(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
        for (OnMapReadyCallback onMapReady : this.mapReadyCallbackList) {
            onMapReady.onMapReady(mapboxMap);
        }
    }

    public void onStart() {
        super.onStart();
        this.map.onStart();
    }

    public void onResume() {
        super.onResume();
        this.map.onResume();
    }

    public void onPause() {
        super.onPause();
        this.map.onPause();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.map.onSaveInstanceState(bundle);
    }

    public void onStop() {
        super.onStop();
        this.map.onStop();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.map.onLowMemory();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.map.onDestroy();
        this.mapReadyCallbackList.clear();
    }

    public void getMapAsync(@NonNull OnMapReadyCallback onMapReadyCallback) {
        if (this.mapboxMap == null) {
            this.mapReadyCallbackList.add(onMapReadyCallback);
        } else {
            onMapReadyCallback.onMapReady(this.mapboxMap);
        }
    }
}
