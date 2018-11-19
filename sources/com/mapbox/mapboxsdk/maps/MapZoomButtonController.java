package com.mapbox.mapboxsdk.maps;

import android.support.annotation.NonNull;
import android.widget.ZoomButtonsController;
import android.widget.ZoomButtonsController.OnZoomListener;

final class MapZoomButtonController {
    private UiSettings uiSettings;
    private ZoomButtonsController zoomButtonsController;

    MapZoomButtonController(@NonNull ZoomButtonsController zoomButtonsController) {
        this.zoomButtonsController = zoomButtonsController;
        this.zoomButtonsController.setZoomSpeed(300);
    }

    void bind(UiSettings uiSettings, OnZoomListener onZoomListener) {
        this.uiSettings = uiSettings;
        this.zoomButtonsController.setOnZoomListener(onZoomListener);
    }

    void setVisible(boolean z) {
        if (this.uiSettings == null || this.uiSettings.isZoomControlsEnabled()) {
            this.zoomButtonsController.setVisible(z);
        }
    }
}
