package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.google.gson.JsonArray;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.expressions.Expression.Converter;
import com.mapbox.mapboxsdk.utils.ColorUtils;

@UiThread
public class FillLayer extends Layer {
    private native Object nativeGetFillAntialias();

    private native Object nativeGetFillColor();

    private native TransitionOptions nativeGetFillColorTransition();

    private native Object nativeGetFillOpacity();

    private native TransitionOptions nativeGetFillOpacityTransition();

    private native Object nativeGetFillOutlineColor();

    private native TransitionOptions nativeGetFillOutlineColorTransition();

    private native Object nativeGetFillPattern();

    private native TransitionOptions nativeGetFillPatternTransition();

    private native Object nativeGetFillTranslate();

    private native Object nativeGetFillTranslateAnchor();

    private native TransitionOptions nativeGetFillTranslateTransition();

    private native void nativeSetFillColorTransition(long j, long j2);

    private native void nativeSetFillOpacityTransition(long j, long j2);

    private native void nativeSetFillOutlineColorTransition(long j, long j2);

    private native void nativeSetFillPatternTransition(long j, long j2);

    private native void nativeSetFillTranslateTransition(long j, long j2);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, String str2);

    public FillLayer(long j) {
        super(j);
    }

    public FillLayer(String str, String str2) {
        initialize(str, str2);
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public FillLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public void setFilter(Expression expression) {
        nativeSetFilter(expression.toArray());
    }

    public FillLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    @Nullable
    public Expression getFilter() {
        JsonArray jsonArray = (JsonArray) nativeGetFilter();
        return jsonArray != null ? Converter.convert(jsonArray) : null;
    }

    public FillLayer withProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public PropertyValue<Boolean> getFillAntialias() {
        return new PropertyValue("fill-antialias", nativeGetFillAntialias());
    }

    public PropertyValue<Float> getFillOpacity() {
        return new PropertyValue("fill-opacity", nativeGetFillOpacity());
    }

    public TransitionOptions getFillOpacityTransition() {
        return nativeGetFillOpacityTransition();
    }

    public void setFillOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetFillOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getFillColor() {
        return new PropertyValue("fill-color", nativeGetFillColor());
    }

    @ColorInt
    public int getFillColorAsInt() {
        PropertyValue fillColor = getFillColor();
        if (fillColor.isValue()) {
            return ColorUtils.rgbaToColor((String) fillColor.getValue());
        }
        throw new RuntimeException("fill-color was set as a Function");
    }

    public TransitionOptions getFillColorTransition() {
        return nativeGetFillColorTransition();
    }

    public void setFillColorTransition(TransitionOptions transitionOptions) {
        nativeSetFillColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getFillOutlineColor() {
        return new PropertyValue("fill-outline-color", nativeGetFillOutlineColor());
    }

    @ColorInt
    public int getFillOutlineColorAsInt() {
        PropertyValue fillOutlineColor = getFillOutlineColor();
        if (fillOutlineColor.isValue()) {
            return ColorUtils.rgbaToColor((String) fillOutlineColor.getValue());
        }
        throw new RuntimeException("fill-outline-color was set as a Function");
    }

    public TransitionOptions getFillOutlineColorTransition() {
        return nativeGetFillOutlineColorTransition();
    }

    public void setFillOutlineColorTransition(TransitionOptions transitionOptions) {
        nativeSetFillOutlineColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float[]> getFillTranslate() {
        return new PropertyValue("fill-translate", nativeGetFillTranslate());
    }

    public TransitionOptions getFillTranslateTransition() {
        return nativeGetFillTranslateTransition();
    }

    public void setFillTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetFillTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getFillTranslateAnchor() {
        return new PropertyValue("fill-translate-anchor", nativeGetFillTranslateAnchor());
    }

    public PropertyValue<String> getFillPattern() {
        return new PropertyValue("fill-pattern", nativeGetFillPattern());
    }

    public TransitionOptions getFillPatternTransition() {
        return nativeGetFillPatternTransition();
    }

    public void setFillPatternTransition(TransitionOptions transitionOptions) {
        nativeSetFillPatternTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }
}
