package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;

@UiThread
public class RasterLayer extends Layer {
    private native Object nativeGetRasterBrightnessMax();

    private native TransitionOptions nativeGetRasterBrightnessMaxTransition();

    private native Object nativeGetRasterBrightnessMin();

    private native TransitionOptions nativeGetRasterBrightnessMinTransition();

    private native Object nativeGetRasterContrast();

    private native TransitionOptions nativeGetRasterContrastTransition();

    private native Object nativeGetRasterFadeDuration();

    private native Object nativeGetRasterHueRotate();

    private native TransitionOptions nativeGetRasterHueRotateTransition();

    private native Object nativeGetRasterOpacity();

    private native TransitionOptions nativeGetRasterOpacityTransition();

    private native Object nativeGetRasterSaturation();

    private native TransitionOptions nativeGetRasterSaturationTransition();

    private native void nativeSetRasterBrightnessMaxTransition(long j, long j2);

    private native void nativeSetRasterBrightnessMinTransition(long j, long j2);

    private native void nativeSetRasterContrastTransition(long j, long j2);

    private native void nativeSetRasterHueRotateTransition(long j, long j2);

    private native void nativeSetRasterOpacityTransition(long j, long j2);

    private native void nativeSetRasterSaturationTransition(long j, long j2);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, String str2);

    public RasterLayer(long j) {
        super(j);
    }

    public RasterLayer(String str, String str2) {
        initialize(str, str2);
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public RasterLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }

    public RasterLayer withProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public PropertyValue<Float> getRasterOpacity() {
        return new PropertyValue("raster-opacity", nativeGetRasterOpacity());
    }

    public TransitionOptions getRasterOpacityTransition() {
        return nativeGetRasterOpacityTransition();
    }

    public void setRasterOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetRasterOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getRasterHueRotate() {
        return new PropertyValue("raster-hue-rotate", nativeGetRasterHueRotate());
    }

    public TransitionOptions getRasterHueRotateTransition() {
        return nativeGetRasterHueRotateTransition();
    }

    public void setRasterHueRotateTransition(TransitionOptions transitionOptions) {
        nativeSetRasterHueRotateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getRasterBrightnessMin() {
        return new PropertyValue("raster-brightness-min", nativeGetRasterBrightnessMin());
    }

    public TransitionOptions getRasterBrightnessMinTransition() {
        return nativeGetRasterBrightnessMinTransition();
    }

    public void setRasterBrightnessMinTransition(TransitionOptions transitionOptions) {
        nativeSetRasterBrightnessMinTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getRasterBrightnessMax() {
        return new PropertyValue("raster-brightness-max", nativeGetRasterBrightnessMax());
    }

    public TransitionOptions getRasterBrightnessMaxTransition() {
        return nativeGetRasterBrightnessMaxTransition();
    }

    public void setRasterBrightnessMaxTransition(TransitionOptions transitionOptions) {
        nativeSetRasterBrightnessMaxTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getRasterSaturation() {
        return new PropertyValue("raster-saturation", nativeGetRasterSaturation());
    }

    public TransitionOptions getRasterSaturationTransition() {
        return nativeGetRasterSaturationTransition();
    }

    public void setRasterSaturationTransition(TransitionOptions transitionOptions) {
        nativeSetRasterSaturationTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getRasterContrast() {
        return new PropertyValue("raster-contrast", nativeGetRasterContrast());
    }

    public TransitionOptions getRasterContrastTransition() {
        return nativeGetRasterContrastTransition();
    }

    public void setRasterContrastTransition(TransitionOptions transitionOptions) {
        nativeSetRasterContrastTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getRasterFadeDuration() {
        return new PropertyValue("raster-fade-duration", nativeGetRasterFadeDuration());
    }
}
