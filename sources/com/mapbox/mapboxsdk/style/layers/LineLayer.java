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
public class LineLayer extends Layer {
    private native Object nativeGetLineBlur();

    private native TransitionOptions nativeGetLineBlurTransition();

    private native Object nativeGetLineCap();

    private native Object nativeGetLineColor();

    private native TransitionOptions nativeGetLineColorTransition();

    private native Object nativeGetLineDasharray();

    private native TransitionOptions nativeGetLineDasharrayTransition();

    private native Object nativeGetLineGapWidth();

    private native TransitionOptions nativeGetLineGapWidthTransition();

    private native Object nativeGetLineJoin();

    private native Object nativeGetLineMiterLimit();

    private native Object nativeGetLineOffset();

    private native TransitionOptions nativeGetLineOffsetTransition();

    private native Object nativeGetLineOpacity();

    private native TransitionOptions nativeGetLineOpacityTransition();

    private native Object nativeGetLinePattern();

    private native TransitionOptions nativeGetLinePatternTransition();

    private native Object nativeGetLineRoundLimit();

    private native Object nativeGetLineTranslate();

    private native Object nativeGetLineTranslateAnchor();

    private native TransitionOptions nativeGetLineTranslateTransition();

    private native Object nativeGetLineWidth();

    private native TransitionOptions nativeGetLineWidthTransition();

    private native void nativeSetLineBlurTransition(long j, long j2);

    private native void nativeSetLineColorTransition(long j, long j2);

    private native void nativeSetLineDasharrayTransition(long j, long j2);

    private native void nativeSetLineGapWidthTransition(long j, long j2);

    private native void nativeSetLineOffsetTransition(long j, long j2);

    private native void nativeSetLineOpacityTransition(long j, long j2);

    private native void nativeSetLinePatternTransition(long j, long j2);

    private native void nativeSetLineTranslateTransition(long j, long j2);

    private native void nativeSetLineWidthTransition(long j, long j2);

    protected native void finalize() throws Throwable;

    protected native void initialize(String str, String str2);

    public LineLayer(long j) {
        super(j);
    }

    public LineLayer(String str, String str2) {
        initialize(str, str2);
    }

    public void setSourceLayer(String str) {
        nativeSetSourceLayer(str);
    }

    public LineLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }

    public String getSourceLayer() {
        return nativeGetSourceLayer();
    }

    public void setFilter(Expression expression) {
        nativeSetFilter(expression.toArray());
    }

    public LineLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    @Nullable
    public Expression getFilter() {
        JsonArray jsonArray = (JsonArray) nativeGetFilter();
        return jsonArray != null ? Converter.convert(jsonArray) : null;
    }

    public LineLayer withProperties(@NonNull PropertyValue<?>... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public PropertyValue<String> getLineCap() {
        return new PropertyValue("line-cap", nativeGetLineCap());
    }

    public PropertyValue<String> getLineJoin() {
        return new PropertyValue("line-join", nativeGetLineJoin());
    }

    public PropertyValue<Float> getLineMiterLimit() {
        return new PropertyValue("line-miter-limit", nativeGetLineMiterLimit());
    }

    public PropertyValue<Float> getLineRoundLimit() {
        return new PropertyValue("line-round-limit", nativeGetLineRoundLimit());
    }

    public PropertyValue<Float> getLineOpacity() {
        return new PropertyValue("line-opacity", nativeGetLineOpacity());
    }

    public TransitionOptions getLineOpacityTransition() {
        return nativeGetLineOpacityTransition();
    }

    public void setLineOpacityTransition(TransitionOptions transitionOptions) {
        nativeSetLineOpacityTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getLineColor() {
        return new PropertyValue("line-color", nativeGetLineColor());
    }

    @ColorInt
    public int getLineColorAsInt() {
        PropertyValue lineColor = getLineColor();
        if (lineColor.isValue()) {
            return ColorUtils.rgbaToColor((String) lineColor.getValue());
        }
        throw new RuntimeException("line-color was set as a Function");
    }

    public TransitionOptions getLineColorTransition() {
        return nativeGetLineColorTransition();
    }

    public void setLineColorTransition(TransitionOptions transitionOptions) {
        nativeSetLineColorTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float[]> getLineTranslate() {
        return new PropertyValue("line-translate", nativeGetLineTranslate());
    }

    public TransitionOptions getLineTranslateTransition() {
        return nativeGetLineTranslateTransition();
    }

    public void setLineTranslateTransition(TransitionOptions transitionOptions) {
        nativeSetLineTranslateTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getLineTranslateAnchor() {
        return new PropertyValue("line-translate-anchor", nativeGetLineTranslateAnchor());
    }

    public PropertyValue<Float> getLineWidth() {
        return new PropertyValue("line-width", nativeGetLineWidth());
    }

    public TransitionOptions getLineWidthTransition() {
        return nativeGetLineWidthTransition();
    }

    public void setLineWidthTransition(TransitionOptions transitionOptions) {
        nativeSetLineWidthTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getLineGapWidth() {
        return new PropertyValue("line-gap-width", nativeGetLineGapWidth());
    }

    public TransitionOptions getLineGapWidthTransition() {
        return nativeGetLineGapWidthTransition();
    }

    public void setLineGapWidthTransition(TransitionOptions transitionOptions) {
        nativeSetLineGapWidthTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getLineOffset() {
        return new PropertyValue("line-offset", nativeGetLineOffset());
    }

    public TransitionOptions getLineOffsetTransition() {
        return nativeGetLineOffsetTransition();
    }

    public void setLineOffsetTransition(TransitionOptions transitionOptions) {
        nativeSetLineOffsetTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float> getLineBlur() {
        return new PropertyValue("line-blur", nativeGetLineBlur());
    }

    public TransitionOptions getLineBlurTransition() {
        return nativeGetLineBlurTransition();
    }

    public void setLineBlurTransition(TransitionOptions transitionOptions) {
        nativeSetLineBlurTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<Float[]> getLineDasharray() {
        return new PropertyValue("line-dasharray", nativeGetLineDasharray());
    }

    public TransitionOptions getLineDasharrayTransition() {
        return nativeGetLineDasharrayTransition();
    }

    public void setLineDasharrayTransition(TransitionOptions transitionOptions) {
        nativeSetLineDasharrayTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }

    public PropertyValue<String> getLinePattern() {
        return new PropertyValue("line-pattern", nativeGetLinePattern());
    }

    public TransitionOptions getLinePatternTransition() {
        return nativeGetLinePatternTransition();
    }

    public void setLinePatternTransition(TransitionOptions transitionOptions) {
        nativeSetLinePatternTransition(transitionOptions.getDuration(), transitionOptions.getDelay());
    }
}
