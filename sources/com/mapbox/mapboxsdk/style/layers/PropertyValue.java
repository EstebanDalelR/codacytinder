package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonArray;
import com.mapbox.mapboxsdk.exceptions.ConversionException;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.expressions.Expression.Converter;
import com.mapbox.mapboxsdk.utils.ColorUtils;
import p000a.p001a.C0001a;

public class PropertyValue<T> {
    public final String name;
    public final T value;

    public PropertyValue(@NonNull String str, T t) {
        this.name = str;
        this.value = t;
    }

    public boolean isNull() {
        return this.value == null;
    }

    public boolean isExpression() {
        return !isNull() && (this.value instanceof JsonArray);
    }

    @Nullable
    public Expression getExpression() {
        if (isExpression()) {
            return Converter.convert((JsonArray) this.value);
        }
        C0001a.d("not a expression, try value", new Object[0]);
        return null;
    }

    public boolean isValue() {
        return (isNull() || isExpression()) ? false : true;
    }

    @Nullable
    public T getValue() {
        if (isValue()) {
            return this.value;
        }
        C0001a.d("not a value, try function", new Object[0]);
        return null;
    }

    @ColorInt
    @Nullable
    public Integer getColorInt() {
        if (isValue()) {
            if (this.value instanceof String) {
                try {
                    return Integer.valueOf(ColorUtils.rgbaToColor((String) this.value));
                } catch (ConversionException e) {
                    C0001a.e("%s could not be converted to a Color int: %s", new Object[]{this.name, e.getMessage()});
                    return null;
                }
            }
        }
        C0001a.e("%s is not a String value and can not be converted to a color it", new Object[]{this.name});
        return null;
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.name, this.value});
    }
}
