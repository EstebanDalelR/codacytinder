package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.utils.ColorUtils;

@UiThread
public class HillshadeLayer extends Layer {
    private native Object nativeGetHillshadeAccentColor();

    private native TransitionOptions nativeGetHillshadeAccentColorTransition();

    private native Object nativeGetHillshadeExaggeration();

    private native TransitionOptions nativeGetHillshadeExaggerationTransition();

    private native Object nativeGetHillshadeHighlightColor();

    private native TransitionOptions nativeGetHillshadeHighlightColorTransition();

    private native Object nativeGetHillshadeIlluminationAnchor();

    private native Object nativeGetHillshadeIlluminationDirection();

    private native Object nativeGetHillshadeShadowColor();

    private native TransitionOptions nativeGetHillshadeShadowColorTransition();

    private native void nativeSetHillshadeAccentColorTransition(long j, long j2);

    private native void nativeSetHillshadeExaggerationTransition(long j, long j2);

    private native void nativeSetHillshadeHighlightColorTransition(long j, long j2);

    private native void nativeSetHillshadeShadowColorTransition(long j, long j2);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, String str2);

    public HillshadeLayer(long j) {
        super(j);
    }

    public HillshadeLayer(String str, String str2) {
        initialize(str, str2);
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public HillshadeLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }

    public HillshadeLayer withProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public PropertyValue<Float> getHillshadeIlluminationDirection() {
        return new PropertyValue("hillshade-illumination-direction", nativeGetHillshadeIlluminationDirection());
    }

    public PropertyValue<String> getHillshadeIlluminationAnchor() {
        return new PropertyValue("hillshade-illumination-anchor", nativeGetHillshadeIlluminationAnchor());
    }

    public PropertyValue<Float> getHillshadeExaggeration() {
        return new PropertyValue("hillshade-exaggeration", nativeGetHillshadeExaggeration());
    }

    public TransitionOptions getHillshadeExaggerationTransition() {
        return nativeGetHillshadeExaggerationTransition();
    }

    public void setHillshadeExaggerationTransition(TransitionOptions transitionOptions) {
        nativeSetHillshadeExaggerationTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getHillshadeShadowColor() {
        return new PropertyValue("hillshade-shadow-color", nativeGetHillshadeShadowColor());
    }

    @ColorInt
    public int getHillshadeShadowColorAsInt() {
        PropertyValue hillshadeShadowColor = getHillshadeShadowColor();
        if (hillshadeShadowColor.isValue()) {
            return ColorUtils.rgbaToColor((String) hillshadeShadowColor.getValue());
        }
        throw new RuntimeException("hillshade-shadow-color was set as a Function");
    }

    public TransitionOptions getHillshadeShadowColorTransition() {
        return nativeGetHillshadeShadowColorTransition();
    }

    public void setHillshadeShadowColorTransition(TransitionOptions transitionOptions) {
        nativeSetHillshadeShadowColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getHillshadeHighlightColor() {
        return new PropertyValue("hillshade-highlight-color", nativeGetHillshadeHighlightColor());
    }

    @ColorInt
    public int getHillshadeHighlightColorAsInt() {
        PropertyValue hillshadeHighlightColor = getHillshadeHighlightColor();
        if (hillshadeHighlightColor.isValue()) {
            return ColorUtils.rgbaToColor((String) hillshadeHighlightColor.getValue());
        }
        throw new RuntimeException("hillshade-highlight-color was set as a Function");
    }

    public TransitionOptions getHillshadeHighlightColorTransition() {
        return nativeGetHillshadeHighlightColorTransition();
    }

    public void setHillshadeHighlightColorTransition(TransitionOptions transitionOptions) {
        nativeSetHillshadeHighlightColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getHillshadeAccentColor() {
        return new PropertyValue("hillshade-accent-color", nativeGetHillshadeAccentColor());
    }

    @ColorInt
    public int getHillshadeAccentColorAsInt() {
        PropertyValue hillshadeAccentColor = getHillshadeAccentColor();
        if (hillshadeAccentColor.isValue()) {
            return ColorUtils.rgbaToColor((String) hillshadeAccentColor.getValue());
        }
        throw new RuntimeException("hillshade-accent-color was set as a Function");
    }

    public TransitionOptions getHillshadeAccentColorTransition() {
        return nativeGetHillshadeAccentColorTransition();
    }

    public void setHillshadeAccentColorTransition(TransitionOptions transitionOptions) {
        nativeSetHillshadeAccentColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }
}
