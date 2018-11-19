package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import java.util.Locale;

public class PropertyFactory {
    public static PropertyValue<String> visibility(String str) {
        return new LayoutPropertyValue("visibility", str);
    }

    public static PropertyValue<Boolean> fillAntialias(Boolean bool) {
        return new PaintPropertyValue("fill-antialias", bool);
    }

    public static PropertyValue<Expression> fillAntialias(Expression expression) {
        return new PaintPropertyValue("fill-antialias", expression);
    }

    public static PropertyValue<Float> fillOpacity(Float f) {
        return new PaintPropertyValue("fill-opacity", f);
    }

    public static PropertyValue<Expression> fillOpacity(Expression expression) {
        return new PaintPropertyValue("fill-opacity", expression);
    }

    public static PropertyValue<String> fillColor(@ColorInt int i) {
        return new PaintPropertyValue("fill-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> fillColor(String str) {
        return new PaintPropertyValue("fill-color", str);
    }

    public static PropertyValue<Expression> fillColor(Expression expression) {
        return new PaintPropertyValue("fill-color", expression);
    }

    public static PropertyValue<String> fillOutlineColor(@ColorInt int i) {
        return new PaintPropertyValue("fill-outline-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> fillOutlineColor(String str) {
        return new PaintPropertyValue("fill-outline-color", str);
    }

    public static PropertyValue<Expression> fillOutlineColor(Expression expression) {
        return new PaintPropertyValue("fill-outline-color", expression);
    }

    public static PropertyValue<Float[]> fillTranslate(Float[] fArr) {
        return new PaintPropertyValue("fill-translate", fArr);
    }

    public static PropertyValue<Expression> fillTranslate(Expression expression) {
        return new PaintPropertyValue("fill-translate", expression);
    }

    public static PropertyValue<String> fillTranslateAnchor(String str) {
        return new PaintPropertyValue("fill-translate-anchor", str);
    }

    public static PropertyValue<Expression> fillTranslateAnchor(Expression expression) {
        return new PaintPropertyValue("fill-translate-anchor", expression);
    }

    public static PropertyValue<String> fillPattern(String str) {
        return new PaintPropertyValue("fill-pattern", str);
    }

    public static PropertyValue<Expression> fillPattern(Expression expression) {
        return new PaintPropertyValue("fill-pattern", expression);
    }

    public static PropertyValue<Float> lineOpacity(Float f) {
        return new PaintPropertyValue("line-opacity", f);
    }

    public static PropertyValue<Expression> lineOpacity(Expression expression) {
        return new PaintPropertyValue("line-opacity", expression);
    }

    public static PropertyValue<String> lineColor(@ColorInt int i) {
        return new PaintPropertyValue("line-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> lineColor(String str) {
        return new PaintPropertyValue("line-color", str);
    }

    public static PropertyValue<Expression> lineColor(Expression expression) {
        return new PaintPropertyValue("line-color", expression);
    }

    public static PropertyValue<Float[]> lineTranslate(Float[] fArr) {
        return new PaintPropertyValue("line-translate", fArr);
    }

    public static PropertyValue<Expression> lineTranslate(Expression expression) {
        return new PaintPropertyValue("line-translate", expression);
    }

    public static PropertyValue<String> lineTranslateAnchor(String str) {
        return new PaintPropertyValue("line-translate-anchor", str);
    }

    public static PropertyValue<Expression> lineTranslateAnchor(Expression expression) {
        return new PaintPropertyValue("line-translate-anchor", expression);
    }

    public static PropertyValue<Float> lineWidth(Float f) {
        return new PaintPropertyValue("line-width", f);
    }

    public static PropertyValue<Expression> lineWidth(Expression expression) {
        return new PaintPropertyValue("line-width", expression);
    }

    public static PropertyValue<Float> lineGapWidth(Float f) {
        return new PaintPropertyValue("line-gap-width", f);
    }

    public static PropertyValue<Expression> lineGapWidth(Expression expression) {
        return new PaintPropertyValue("line-gap-width", expression);
    }

    public static PropertyValue<Float> lineOffset(Float f) {
        return new PaintPropertyValue("line-offset", f);
    }

    public static PropertyValue<Expression> lineOffset(Expression expression) {
        return new PaintPropertyValue("line-offset", expression);
    }

    public static PropertyValue<Float> lineBlur(Float f) {
        return new PaintPropertyValue("line-blur", f);
    }

    public static PropertyValue<Expression> lineBlur(Expression expression) {
        return new PaintPropertyValue("line-blur", expression);
    }

    public static PropertyValue<Float[]> lineDasharray(Float[] fArr) {
        return new PaintPropertyValue("line-dasharray", fArr);
    }

    public static PropertyValue<Expression> lineDasharray(Expression expression) {
        return new PaintPropertyValue("line-dasharray", expression);
    }

    public static PropertyValue<String> linePattern(String str) {
        return new PaintPropertyValue("line-pattern", str);
    }

    public static PropertyValue<Expression> linePattern(Expression expression) {
        return new PaintPropertyValue("line-pattern", expression);
    }

    public static PropertyValue<Float> iconOpacity(Float f) {
        return new PaintPropertyValue("icon-opacity", f);
    }

    public static PropertyValue<Expression> iconOpacity(Expression expression) {
        return new PaintPropertyValue("icon-opacity", expression);
    }

    public static PropertyValue<String> iconColor(@ColorInt int i) {
        return new PaintPropertyValue("icon-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> iconColor(String str) {
        return new PaintPropertyValue("icon-color", str);
    }

    public static PropertyValue<Expression> iconColor(Expression expression) {
        return new PaintPropertyValue("icon-color", expression);
    }

    public static PropertyValue<String> iconHaloColor(@ColorInt int i) {
        return new PaintPropertyValue("icon-halo-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> iconHaloColor(String str) {
        return new PaintPropertyValue("icon-halo-color", str);
    }

    public static PropertyValue<Expression> iconHaloColor(Expression expression) {
        return new PaintPropertyValue("icon-halo-color", expression);
    }

    public static PropertyValue<Float> iconHaloWidth(Float f) {
        return new PaintPropertyValue("icon-halo-width", f);
    }

    public static PropertyValue<Expression> iconHaloWidth(Expression expression) {
        return new PaintPropertyValue("icon-halo-width", expression);
    }

    public static PropertyValue<Float> iconHaloBlur(Float f) {
        return new PaintPropertyValue("icon-halo-blur", f);
    }

    public static PropertyValue<Expression> iconHaloBlur(Expression expression) {
        return new PaintPropertyValue("icon-halo-blur", expression);
    }

    public static PropertyValue<Float[]> iconTranslate(Float[] fArr) {
        return new PaintPropertyValue("icon-translate", fArr);
    }

    public static PropertyValue<Expression> iconTranslate(Expression expression) {
        return new PaintPropertyValue("icon-translate", expression);
    }

    public static PropertyValue<String> iconTranslateAnchor(String str) {
        return new PaintPropertyValue("icon-translate-anchor", str);
    }

    public static PropertyValue<Expression> iconTranslateAnchor(Expression expression) {
        return new PaintPropertyValue("icon-translate-anchor", expression);
    }

    public static PropertyValue<Float> textOpacity(Float f) {
        return new PaintPropertyValue("text-opacity", f);
    }

    public static PropertyValue<Expression> textOpacity(Expression expression) {
        return new PaintPropertyValue("text-opacity", expression);
    }

    public static PropertyValue<String> textColor(@ColorInt int i) {
        return new PaintPropertyValue("text-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> textColor(String str) {
        return new PaintPropertyValue("text-color", str);
    }

    public static PropertyValue<Expression> textColor(Expression expression) {
        return new PaintPropertyValue("text-color", expression);
    }

    public static PropertyValue<String> textHaloColor(@ColorInt int i) {
        return new PaintPropertyValue("text-halo-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> textHaloColor(String str) {
        return new PaintPropertyValue("text-halo-color", str);
    }

    public static PropertyValue<Expression> textHaloColor(Expression expression) {
        return new PaintPropertyValue("text-halo-color", expression);
    }

    public static PropertyValue<Float> textHaloWidth(Float f) {
        return new PaintPropertyValue("text-halo-width", f);
    }

    public static PropertyValue<Expression> textHaloWidth(Expression expression) {
        return new PaintPropertyValue("text-halo-width", expression);
    }

    public static PropertyValue<Float> textHaloBlur(Float f) {
        return new PaintPropertyValue("text-halo-blur", f);
    }

    public static PropertyValue<Expression> textHaloBlur(Expression expression) {
        return new PaintPropertyValue("text-halo-blur", expression);
    }

    public static PropertyValue<Float[]> textTranslate(Float[] fArr) {
        return new PaintPropertyValue("text-translate", fArr);
    }

    public static PropertyValue<Expression> textTranslate(Expression expression) {
        return new PaintPropertyValue("text-translate", expression);
    }

    public static PropertyValue<String> textTranslateAnchor(String str) {
        return new PaintPropertyValue("text-translate-anchor", str);
    }

    public static PropertyValue<Expression> textTranslateAnchor(Expression expression) {
        return new PaintPropertyValue("text-translate-anchor", expression);
    }

    public static PropertyValue<Float> circleRadius(Float f) {
        return new PaintPropertyValue("circle-radius", f);
    }

    public static PropertyValue<Expression> circleRadius(Expression expression) {
        return new PaintPropertyValue("circle-radius", expression);
    }

    public static PropertyValue<String> circleColor(@ColorInt int i) {
        return new PaintPropertyValue("circle-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> circleColor(String str) {
        return new PaintPropertyValue("circle-color", str);
    }

    public static PropertyValue<Expression> circleColor(Expression expression) {
        return new PaintPropertyValue("circle-color", expression);
    }

    public static PropertyValue<Float> circleBlur(Float f) {
        return new PaintPropertyValue("circle-blur", f);
    }

    public static PropertyValue<Expression> circleBlur(Expression expression) {
        return new PaintPropertyValue("circle-blur", expression);
    }

    public static PropertyValue<Float> circleOpacity(Float f) {
        return new PaintPropertyValue("circle-opacity", f);
    }

    public static PropertyValue<Expression> circleOpacity(Expression expression) {
        return new PaintPropertyValue("circle-opacity", expression);
    }

    public static PropertyValue<Float[]> circleTranslate(Float[] fArr) {
        return new PaintPropertyValue("circle-translate", fArr);
    }

    public static PropertyValue<Expression> circleTranslate(Expression expression) {
        return new PaintPropertyValue("circle-translate", expression);
    }

    public static PropertyValue<String> circleTranslateAnchor(String str) {
        return new PaintPropertyValue("circle-translate-anchor", str);
    }

    public static PropertyValue<Expression> circleTranslateAnchor(Expression expression) {
        return new PaintPropertyValue("circle-translate-anchor", expression);
    }

    public static PropertyValue<String> circlePitchScale(String str) {
        return new PaintPropertyValue("circle-pitch-scale", str);
    }

    public static PropertyValue<Expression> circlePitchScale(Expression expression) {
        return new PaintPropertyValue("circle-pitch-scale", expression);
    }

    public static PropertyValue<String> circlePitchAlignment(String str) {
        return new PaintPropertyValue("circle-pitch-alignment", str);
    }

    public static PropertyValue<Expression> circlePitchAlignment(Expression expression) {
        return new PaintPropertyValue("circle-pitch-alignment", expression);
    }

    public static PropertyValue<Float> circleStrokeWidth(Float f) {
        return new PaintPropertyValue("circle-stroke-width", f);
    }

    public static PropertyValue<Expression> circleStrokeWidth(Expression expression) {
        return new PaintPropertyValue("circle-stroke-width", expression);
    }

    public static PropertyValue<String> circleStrokeColor(@ColorInt int i) {
        return new PaintPropertyValue("circle-stroke-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> circleStrokeColor(String str) {
        return new PaintPropertyValue("circle-stroke-color", str);
    }

    public static PropertyValue<Expression> circleStrokeColor(Expression expression) {
        return new PaintPropertyValue("circle-stroke-color", expression);
    }

    public static PropertyValue<Float> circleStrokeOpacity(Float f) {
        return new PaintPropertyValue("circle-stroke-opacity", f);
    }

    public static PropertyValue<Expression> circleStrokeOpacity(Expression expression) {
        return new PaintPropertyValue("circle-stroke-opacity", expression);
    }

    public static PropertyValue<Float> heatmapRadius(Float f) {
        return new PaintPropertyValue("heatmap-radius", f);
    }

    public static PropertyValue<Expression> heatmapRadius(Expression expression) {
        return new PaintPropertyValue("heatmap-radius", expression);
    }

    public static PropertyValue<Float> heatmapWeight(Float f) {
        return new PaintPropertyValue("heatmap-weight", f);
    }

    public static PropertyValue<Expression> heatmapWeight(Expression expression) {
        return new PaintPropertyValue("heatmap-weight", expression);
    }

    public static PropertyValue<Float> heatmapIntensity(Float f) {
        return new PaintPropertyValue("heatmap-intensity", f);
    }

    public static PropertyValue<Expression> heatmapIntensity(Expression expression) {
        return new PaintPropertyValue("heatmap-intensity", expression);
    }

    public static PropertyValue<String> heatmapColor(@ColorInt int i) {
        return new PaintPropertyValue("heatmap-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> heatmapColor(String str) {
        return new PaintPropertyValue("heatmap-color", str);
    }

    public static PropertyValue<Expression> heatmapColor(Expression expression) {
        return new PaintPropertyValue("heatmap-color", expression);
    }

    public static PropertyValue<Float> heatmapOpacity(Float f) {
        return new PaintPropertyValue("heatmap-opacity", f);
    }

    public static PropertyValue<Expression> heatmapOpacity(Expression expression) {
        return new PaintPropertyValue("heatmap-opacity", expression);
    }

    public static PropertyValue<Float> fillExtrusionOpacity(Float f) {
        return new PaintPropertyValue("fill-extrusion-opacity", f);
    }

    public static PropertyValue<Expression> fillExtrusionOpacity(Expression expression) {
        return new PaintPropertyValue("fill-extrusion-opacity", expression);
    }

    public static PropertyValue<String> fillExtrusionColor(@ColorInt int i) {
        return new PaintPropertyValue("fill-extrusion-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> fillExtrusionColor(String str) {
        return new PaintPropertyValue("fill-extrusion-color", str);
    }

    public static PropertyValue<Expression> fillExtrusionColor(Expression expression) {
        return new PaintPropertyValue("fill-extrusion-color", expression);
    }

    public static PropertyValue<Float[]> fillExtrusionTranslate(Float[] fArr) {
        return new PaintPropertyValue("fill-extrusion-translate", fArr);
    }

    public static PropertyValue<Expression> fillExtrusionTranslate(Expression expression) {
        return new PaintPropertyValue("fill-extrusion-translate", expression);
    }

    public static PropertyValue<String> fillExtrusionTranslateAnchor(String str) {
        return new PaintPropertyValue("fill-extrusion-translate-anchor", str);
    }

    public static PropertyValue<Expression> fillExtrusionTranslateAnchor(Expression expression) {
        return new PaintPropertyValue("fill-extrusion-translate-anchor", expression);
    }

    public static PropertyValue<String> fillExtrusionPattern(String str) {
        return new PaintPropertyValue("fill-extrusion-pattern", str);
    }

    public static PropertyValue<Expression> fillExtrusionPattern(Expression expression) {
        return new PaintPropertyValue("fill-extrusion-pattern", expression);
    }

    public static PropertyValue<Float> fillExtrusionHeight(Float f) {
        return new PaintPropertyValue("fill-extrusion-height", f);
    }

    public static PropertyValue<Expression> fillExtrusionHeight(Expression expression) {
        return new PaintPropertyValue("fill-extrusion-height", expression);
    }

    public static PropertyValue<Float> fillExtrusionBase(Float f) {
        return new PaintPropertyValue("fill-extrusion-base", f);
    }

    public static PropertyValue<Expression> fillExtrusionBase(Expression expression) {
        return new PaintPropertyValue("fill-extrusion-base", expression);
    }

    public static PropertyValue<Float> rasterOpacity(Float f) {
        return new PaintPropertyValue("raster-opacity", f);
    }

    public static PropertyValue<Expression> rasterOpacity(Expression expression) {
        return new PaintPropertyValue("raster-opacity", expression);
    }

    public static PropertyValue<Float> rasterHueRotate(Float f) {
        return new PaintPropertyValue("raster-hue-rotate", f);
    }

    public static PropertyValue<Expression> rasterHueRotate(Expression expression) {
        return new PaintPropertyValue("raster-hue-rotate", expression);
    }

    public static PropertyValue<Float> rasterBrightnessMin(Float f) {
        return new PaintPropertyValue("raster-brightness-min", f);
    }

    public static PropertyValue<Expression> rasterBrightnessMin(Expression expression) {
        return new PaintPropertyValue("raster-brightness-min", expression);
    }

    public static PropertyValue<Float> rasterBrightnessMax(Float f) {
        return new PaintPropertyValue("raster-brightness-max", f);
    }

    public static PropertyValue<Expression> rasterBrightnessMax(Expression expression) {
        return new PaintPropertyValue("raster-brightness-max", expression);
    }

    public static PropertyValue<Float> rasterSaturation(Float f) {
        return new PaintPropertyValue("raster-saturation", f);
    }

    public static PropertyValue<Expression> rasterSaturation(Expression expression) {
        return new PaintPropertyValue("raster-saturation", expression);
    }

    public static PropertyValue<Float> rasterContrast(Float f) {
        return new PaintPropertyValue("raster-contrast", f);
    }

    public static PropertyValue<Expression> rasterContrast(Expression expression) {
        return new PaintPropertyValue("raster-contrast", expression);
    }

    public static PropertyValue<Float> rasterFadeDuration(Float f) {
        return new PaintPropertyValue("raster-fade-duration", f);
    }

    public static PropertyValue<Expression> rasterFadeDuration(Expression expression) {
        return new PaintPropertyValue("raster-fade-duration", expression);
    }

    public static PropertyValue<Float> hillshadeIlluminationDirection(Float f) {
        return new PaintPropertyValue("hillshade-illumination-direction", f);
    }

    public static PropertyValue<Expression> hillshadeIlluminationDirection(Expression expression) {
        return new PaintPropertyValue("hillshade-illumination-direction", expression);
    }

    public static PropertyValue<String> hillshadeIlluminationAnchor(String str) {
        return new PaintPropertyValue("hillshade-illumination-anchor", str);
    }

    public static PropertyValue<Expression> hillshadeIlluminationAnchor(Expression expression) {
        return new PaintPropertyValue("hillshade-illumination-anchor", expression);
    }

    public static PropertyValue<Float> hillshadeExaggeration(Float f) {
        return new PaintPropertyValue("hillshade-exaggeration", f);
    }

    public static PropertyValue<Expression> hillshadeExaggeration(Expression expression) {
        return new PaintPropertyValue("hillshade-exaggeration", expression);
    }

    public static PropertyValue<String> hillshadeShadowColor(@ColorInt int i) {
        return new PaintPropertyValue("hillshade-shadow-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> hillshadeShadowColor(String str) {
        return new PaintPropertyValue("hillshade-shadow-color", str);
    }

    public static PropertyValue<Expression> hillshadeShadowColor(Expression expression) {
        return new PaintPropertyValue("hillshade-shadow-color", expression);
    }

    public static PropertyValue<String> hillshadeHighlightColor(@ColorInt int i) {
        return new PaintPropertyValue("hillshade-highlight-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> hillshadeHighlightColor(String str) {
        return new PaintPropertyValue("hillshade-highlight-color", str);
    }

    public static PropertyValue<Expression> hillshadeHighlightColor(Expression expression) {
        return new PaintPropertyValue("hillshade-highlight-color", expression);
    }

    public static PropertyValue<String> hillshadeAccentColor(@ColorInt int i) {
        return new PaintPropertyValue("hillshade-accent-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> hillshadeAccentColor(String str) {
        return new PaintPropertyValue("hillshade-accent-color", str);
    }

    public static PropertyValue<Expression> hillshadeAccentColor(Expression expression) {
        return new PaintPropertyValue("hillshade-accent-color", expression);
    }

    public static PropertyValue<String> backgroundColor(@ColorInt int i) {
        return new PaintPropertyValue("background-color", colorToRgbaString(i));
    }

    public static PropertyValue<String> backgroundColor(String str) {
        return new PaintPropertyValue("background-color", str);
    }

    public static PropertyValue<Expression> backgroundColor(Expression expression) {
        return new PaintPropertyValue("background-color", expression);
    }

    public static PropertyValue<String> backgroundPattern(String str) {
        return new PaintPropertyValue("background-pattern", str);
    }

    public static PropertyValue<Expression> backgroundPattern(Expression expression) {
        return new PaintPropertyValue("background-pattern", expression);
    }

    public static PropertyValue<Float> backgroundOpacity(Float f) {
        return new PaintPropertyValue("background-opacity", f);
    }

    public static PropertyValue<Expression> backgroundOpacity(Expression expression) {
        return new PaintPropertyValue("background-opacity", expression);
    }

    public static PropertyValue<String> lineCap(String str) {
        return new LayoutPropertyValue("line-cap", str);
    }

    public static PropertyValue<Expression> lineCap(Expression expression) {
        return new LayoutPropertyValue("line-cap", expression);
    }

    public static PropertyValue<String> lineJoin(String str) {
        return new LayoutPropertyValue("line-join", str);
    }

    public static PropertyValue<Expression> lineJoin(Expression expression) {
        return new LayoutPropertyValue("line-join", expression);
    }

    public static PropertyValue<Float> lineMiterLimit(Float f) {
        return new LayoutPropertyValue("line-miter-limit", f);
    }

    public static PropertyValue<Expression> lineMiterLimit(Expression expression) {
        return new LayoutPropertyValue("line-miter-limit", expression);
    }

    public static PropertyValue<Float> lineRoundLimit(Float f) {
        return new LayoutPropertyValue("line-round-limit", f);
    }

    public static PropertyValue<Expression> lineRoundLimit(Expression expression) {
        return new LayoutPropertyValue("line-round-limit", expression);
    }

    public static PropertyValue<String> symbolPlacement(String str) {
        return new LayoutPropertyValue("symbol-placement", str);
    }

    public static PropertyValue<Expression> symbolPlacement(Expression expression) {
        return new LayoutPropertyValue("symbol-placement", expression);
    }

    public static PropertyValue<Float> symbolSpacing(Float f) {
        return new LayoutPropertyValue("symbol-spacing", f);
    }

    public static PropertyValue<Expression> symbolSpacing(Expression expression) {
        return new LayoutPropertyValue("symbol-spacing", expression);
    }

    public static PropertyValue<Boolean> symbolAvoidEdges(Boolean bool) {
        return new LayoutPropertyValue("symbol-avoid-edges", bool);
    }

    public static PropertyValue<Expression> symbolAvoidEdges(Expression expression) {
        return new LayoutPropertyValue("symbol-avoid-edges", expression);
    }

    public static PropertyValue<Boolean> iconAllowOverlap(Boolean bool) {
        return new LayoutPropertyValue("icon-allow-overlap", bool);
    }

    public static PropertyValue<Expression> iconAllowOverlap(Expression expression) {
        return new LayoutPropertyValue("icon-allow-overlap", expression);
    }

    public static PropertyValue<Boolean> iconIgnorePlacement(Boolean bool) {
        return new LayoutPropertyValue("icon-ignore-placement", bool);
    }

    public static PropertyValue<Expression> iconIgnorePlacement(Expression expression) {
        return new LayoutPropertyValue("icon-ignore-placement", expression);
    }

    public static PropertyValue<Boolean> iconOptional(Boolean bool) {
        return new LayoutPropertyValue("icon-optional", bool);
    }

    public static PropertyValue<Expression> iconOptional(Expression expression) {
        return new LayoutPropertyValue("icon-optional", expression);
    }

    public static PropertyValue<String> iconRotationAlignment(String str) {
        return new LayoutPropertyValue("icon-rotation-alignment", str);
    }

    public static PropertyValue<Expression> iconRotationAlignment(Expression expression) {
        return new LayoutPropertyValue("icon-rotation-alignment", expression);
    }

    public static PropertyValue<Float> iconSize(Float f) {
        return new LayoutPropertyValue("icon-size", f);
    }

    public static PropertyValue<Expression> iconSize(Expression expression) {
        return new LayoutPropertyValue("icon-size", expression);
    }

    public static PropertyValue<String> iconTextFit(String str) {
        return new LayoutPropertyValue("icon-text-fit", str);
    }

    public static PropertyValue<Expression> iconTextFit(Expression expression) {
        return new LayoutPropertyValue("icon-text-fit", expression);
    }

    public static PropertyValue<Float[]> iconTextFitPadding(Float[] fArr) {
        return new LayoutPropertyValue("icon-text-fit-padding", fArr);
    }

    public static PropertyValue<Expression> iconTextFitPadding(Expression expression) {
        return new LayoutPropertyValue("icon-text-fit-padding", expression);
    }

    public static PropertyValue<String> iconImage(String str) {
        return new LayoutPropertyValue("icon-image", str);
    }

    public static PropertyValue<Expression> iconImage(Expression expression) {
        return new LayoutPropertyValue("icon-image", expression);
    }

    public static PropertyValue<Float> iconRotate(Float f) {
        return new LayoutPropertyValue("icon-rotate", f);
    }

    public static PropertyValue<Expression> iconRotate(Expression expression) {
        return new LayoutPropertyValue("icon-rotate", expression);
    }

    public static PropertyValue<Float> iconPadding(Float f) {
        return new LayoutPropertyValue("icon-padding", f);
    }

    public static PropertyValue<Expression> iconPadding(Expression expression) {
        return new LayoutPropertyValue("icon-padding", expression);
    }

    public static PropertyValue<Boolean> iconKeepUpright(Boolean bool) {
        return new LayoutPropertyValue("icon-keep-upright", bool);
    }

    public static PropertyValue<Expression> iconKeepUpright(Expression expression) {
        return new LayoutPropertyValue("icon-keep-upright", expression);
    }

    public static PropertyValue<Float[]> iconOffset(Float[] fArr) {
        return new LayoutPropertyValue("icon-offset", fArr);
    }

    public static PropertyValue<Expression> iconOffset(Expression expression) {
        return new LayoutPropertyValue("icon-offset", expression);
    }

    public static PropertyValue<String> iconAnchor(String str) {
        return new LayoutPropertyValue("icon-anchor", str);
    }

    public static PropertyValue<Expression> iconAnchor(Expression expression) {
        return new LayoutPropertyValue("icon-anchor", expression);
    }

    public static PropertyValue<String> iconPitchAlignment(String str) {
        return new LayoutPropertyValue("icon-pitch-alignment", str);
    }

    public static PropertyValue<Expression> iconPitchAlignment(Expression expression) {
        return new LayoutPropertyValue("icon-pitch-alignment", expression);
    }

    public static PropertyValue<String> textPitchAlignment(String str) {
        return new LayoutPropertyValue("text-pitch-alignment", str);
    }

    public static PropertyValue<Expression> textPitchAlignment(Expression expression) {
        return new LayoutPropertyValue("text-pitch-alignment", expression);
    }

    public static PropertyValue<String> textRotationAlignment(String str) {
        return new LayoutPropertyValue("text-rotation-alignment", str);
    }

    public static PropertyValue<Expression> textRotationAlignment(Expression expression) {
        return new LayoutPropertyValue("text-rotation-alignment", expression);
    }

    public static PropertyValue<String> textField(String str) {
        return new LayoutPropertyValue("text-field", str);
    }

    public static PropertyValue<Expression> textField(Expression expression) {
        return new LayoutPropertyValue("text-field", expression);
    }

    public static PropertyValue<String[]> textFont(String[] strArr) {
        return new LayoutPropertyValue("text-font", strArr);
    }

    public static PropertyValue<Expression> textFont(Expression expression) {
        return new LayoutPropertyValue("text-font", expression);
    }

    public static PropertyValue<Float> textSize(Float f) {
        return new LayoutPropertyValue("text-size", f);
    }

    public static PropertyValue<Expression> textSize(Expression expression) {
        return new LayoutPropertyValue("text-size", expression);
    }

    public static PropertyValue<Float> textMaxWidth(Float f) {
        return new LayoutPropertyValue("text-max-width", f);
    }

    public static PropertyValue<Expression> textMaxWidth(Expression expression) {
        return new LayoutPropertyValue("text-max-width", expression);
    }

    public static PropertyValue<Float> textLineHeight(Float f) {
        return new LayoutPropertyValue("text-line-height", f);
    }

    public static PropertyValue<Expression> textLineHeight(Expression expression) {
        return new LayoutPropertyValue("text-line-height", expression);
    }

    public static PropertyValue<Float> textLetterSpacing(Float f) {
        return new LayoutPropertyValue("text-letter-spacing", f);
    }

    public static PropertyValue<Expression> textLetterSpacing(Expression expression) {
        return new LayoutPropertyValue("text-letter-spacing", expression);
    }

    public static PropertyValue<String> textJustify(String str) {
        return new LayoutPropertyValue("text-justify", str);
    }

    public static PropertyValue<Expression> textJustify(Expression expression) {
        return new LayoutPropertyValue("text-justify", expression);
    }

    public static PropertyValue<String> textAnchor(String str) {
        return new LayoutPropertyValue("text-anchor", str);
    }

    public static PropertyValue<Expression> textAnchor(Expression expression) {
        return new LayoutPropertyValue("text-anchor", expression);
    }

    public static PropertyValue<Float> textMaxAngle(Float f) {
        return new LayoutPropertyValue("text-max-angle", f);
    }

    public static PropertyValue<Expression> textMaxAngle(Expression expression) {
        return new LayoutPropertyValue("text-max-angle", expression);
    }

    public static PropertyValue<Float> textRotate(Float f) {
        return new LayoutPropertyValue("text-rotate", f);
    }

    public static PropertyValue<Expression> textRotate(Expression expression) {
        return new LayoutPropertyValue("text-rotate", expression);
    }

    public static PropertyValue<Float> textPadding(Float f) {
        return new LayoutPropertyValue("text-padding", f);
    }

    public static PropertyValue<Expression> textPadding(Expression expression) {
        return new LayoutPropertyValue("text-padding", expression);
    }

    public static PropertyValue<Boolean> textKeepUpright(Boolean bool) {
        return new LayoutPropertyValue("text-keep-upright", bool);
    }

    public static PropertyValue<Expression> textKeepUpright(Expression expression) {
        return new LayoutPropertyValue("text-keep-upright", expression);
    }

    public static PropertyValue<String> textTransform(String str) {
        return new LayoutPropertyValue("text-transform", str);
    }

    public static PropertyValue<Expression> textTransform(Expression expression) {
        return new LayoutPropertyValue("text-transform", expression);
    }

    public static PropertyValue<Float[]> textOffset(Float[] fArr) {
        return new LayoutPropertyValue("text-offset", fArr);
    }

    public static PropertyValue<Expression> textOffset(Expression expression) {
        return new LayoutPropertyValue("text-offset", expression);
    }

    public static PropertyValue<Boolean> textAllowOverlap(Boolean bool) {
        return new LayoutPropertyValue("text-allow-overlap", bool);
    }

    public static PropertyValue<Expression> textAllowOverlap(Expression expression) {
        return new LayoutPropertyValue("text-allow-overlap", expression);
    }

    public static PropertyValue<Boolean> textIgnorePlacement(Boolean bool) {
        return new LayoutPropertyValue("text-ignore-placement", bool);
    }

    public static PropertyValue<Expression> textIgnorePlacement(Expression expression) {
        return new LayoutPropertyValue("text-ignore-placement", expression);
    }

    public static PropertyValue<Boolean> textOptional(Boolean bool) {
        return new LayoutPropertyValue("text-optional", bool);
    }

    public static PropertyValue<Expression> textOptional(Expression expression) {
        return new LayoutPropertyValue("text-optional", expression);
    }

    public static String colorToRgbaString(@ColorInt int i) {
        return String.format(Locale.US, "rgba(%d, %d, %d, %d)", new Object[]{Integer.valueOf((i >> 16) & 255), Integer.valueOf((i >> 8) & 255), Integer.valueOf(i & 255), Integer.valueOf((i >> 24) & 255)});
    }
}
