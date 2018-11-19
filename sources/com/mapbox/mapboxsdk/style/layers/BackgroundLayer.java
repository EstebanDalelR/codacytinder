package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.utils.ColorUtils;

@UiThread
public class BackgroundLayer extends Layer {
    private native Object nativeGetBackgroundColor();

    private native TransitionOptions nativeGetBackgroundColorTransition();

    private native Object nativeGetBackgroundOpacity();

    private native TransitionOptions nativeGetBackgroundOpacityTransition();

    private native Object nativeGetBackgroundPattern();

    private native TransitionOptions nativeGetBackgroundPatternTransition();

    private native void nativeSetBackgroundColorTransition(long j, long j2);

    private native void nativeSetBackgroundOpacityTransition(long j, long j2);

    private native void nativeSetBackgroundPatternTransition(long j, long j2);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str);

    public BackgroundLayer(long j) {
        super(j);
    }

    public BackgroundLayer(String str) {
        initialize(str);
    }

    public BackgroundLayer withProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public PropertyValue<String> getBackgroundColor() {
        return new PropertyValue("background-color", nativeGetBackgroundColor());
    }

    @ColorInt
    public int getBackgroundColorAsInt() {
        PropertyValue backgroundColor = getBackgroundColor();
        if (backgroundColor.isValue()) {
            return ColorUtils.rgbaToColor((String) backgroundColor.getValue());
        }
        throw new RuntimeException("background-color was set as a Function");
    }

    public TransitionOptions getBackgroundColorTransition() {
        return nativeGetBackgroundColorTransition();
    }

    public void setBackgroundColorTransition(TransitionOptions transitionOptions) {
        nativeSetBackgroundColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getBackgroundPattern() {
        return new PropertyValue("background-pattern", nativeGetBackgroundPattern());
    }

    public TransitionOptions getBackgroundPatternTransition() {
        return nativeGetBackgroundPatternTransition();
    }

    public void setBackgroundPatternTransition(TransitionOptions transitionOptions) {
        nativeSetBackgroundPatternTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getBackgroundOpacity() {
        return new PropertyValue("background-opacity", nativeGetBackgroundOpacity());
    }

    public TransitionOptions getBackgroundOpacityTransition() {
        return nativeGetBackgroundOpacityTransition();
    }

    public void setBackgroundOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetBackgroundOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }
}
