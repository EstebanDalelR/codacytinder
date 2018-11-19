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
public class FillExtrusionLayer extends Layer {
    private native Object nativeGetFillExtrusionBase();

    private native TransitionOptions nativeGetFillExtrusionBaseTransition();

    private native Object nativeGetFillExtrusionColor();

    private native TransitionOptions nativeGetFillExtrusionColorTransition();

    private native Object nativeGetFillExtrusionHeight();

    private native TransitionOptions nativeGetFillExtrusionHeightTransition();

    private native Object nativeGetFillExtrusionOpacity();

    private native TransitionOptions nativeGetFillExtrusionOpacityTransition();

    private native Object nativeGetFillExtrusionPattern();

    private native TransitionOptions nativeGetFillExtrusionPatternTransition();

    private native Object nativeGetFillExtrusionTranslate();

    private native Object nativeGetFillExtrusionTranslateAnchor();

    private native TransitionOptions nativeGetFillExtrusionTranslateTransition();

    private native void nativeSetFillExtrusionBaseTransition(long j, long j2);

    private native void nativeSetFillExtrusionColorTransition(long j, long j2);

    private native void nativeSetFillExtrusionHeightTransition(long j, long j2);

    private native void nativeSetFillExtrusionOpacityTransition(long j, long j2);

    private native void nativeSetFillExtrusionPatternTransition(long j, long j2);

    private native void nativeSetFillExtrusionTranslateTransition(long j, long j2);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, String str2);

    public FillExtrusionLayer(long j) {
        super(j);
    }

    public FillExtrusionLayer(String str, String str2) {
        initialize(str, str2);
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public FillExtrusionLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public void setFilter(Expression expression) {
        nativeSetFilter(expression.toArray());
    }

    public FillExtrusionLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    @Nullable
    public Expression getFilter() {
        JsonArray jsonArray = (JsonArray) nativeGetFilter();
        return jsonArray != null ? Converter.convert(jsonArray) : null;
    }

    public FillExtrusionLayer withProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public PropertyValue<Float> getFillExtrusionOpacity() {
        return new PropertyValue("fill-extrusion-opacity", nativeGetFillExtrusionOpacity());
    }

    public TransitionOptions getFillExtrusionOpacityTransition() {
        return nativeGetFillExtrusionOpacityTransition();
    }

    public void setFillExtrusionOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetFillExtrusionOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getFillExtrusionColor() {
        return new PropertyValue("fill-extrusion-color", nativeGetFillExtrusionColor());
    }

    @ColorInt
    public int getFillExtrusionColorAsInt() {
        PropertyValue fillExtrusionColor = getFillExtrusionColor();
        if (fillExtrusionColor.isValue()) {
            return ColorUtils.rgbaToColor((String) fillExtrusionColor.getValue());
        }
        throw new RuntimeException("fill-extrusion-color was set as a Function");
    }

    public TransitionOptions getFillExtrusionColorTransition() {
        return nativeGetFillExtrusionColorTransition();
    }

    public void setFillExtrusionColorTransition(TransitionOptions transitionOptions) {
        nativeSetFillExtrusionColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float[]> getFillExtrusionTranslate() {
        return new PropertyValue("fill-extrusion-translate", nativeGetFillExtrusionTranslate());
    }

    public TransitionOptions getFillExtrusionTranslateTransition() {
        return nativeGetFillExtrusionTranslateTransition();
    }

    public void setFillExtrusionTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetFillExtrusionTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getFillExtrusionTranslateAnchor() {
        return new PropertyValue("fill-extrusion-translate-anchor", nativeGetFillExtrusionTranslateAnchor());
    }

    public PropertyValue<String> getFillExtrusionPattern() {
        return new PropertyValue("fill-extrusion-pattern", nativeGetFillExtrusionPattern());
    }

    public TransitionOptions getFillExtrusionPatternTransition() {
        return nativeGetFillExtrusionPatternTransition();
    }

    public void setFillExtrusionPatternTransition(TransitionOptions transitionOptions) {
        nativeSetFillExtrusionPatternTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getFillExtrusionHeight() {
        return new PropertyValue("fill-extrusion-height", nativeGetFillExtrusionHeight());
    }

    public TransitionOptions getFillExtrusionHeightTransition() {
        return nativeGetFillExtrusionHeightTransition();
    }

    public void setFillExtrusionHeightTransition(TransitionOptions transitionOptions) {
        nativeSetFillExtrusionHeightTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getFillExtrusionBase() {
        return new PropertyValue("fill-extrusion-base", nativeGetFillExtrusionBase());
    }

    public TransitionOptions getFillExtrusionBaseTransition() {
        return nativeGetFillExtrusionBaseTransition();
    }

    public void setFillExtrusionBaseTransition(TransitionOptions transitionOptions) {
        nativeSetFillExtrusionBaseTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }
}
