package com.mapbox.mapboxsdk.style.expressions;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expression {
    private final Expression[] arguments;
    private final String operator;

    public static class Array {
    }

    public static final class Converter {
        public static Expression convert(@NonNull JsonArray jsonArray) {
            if (jsonArray.size() == 0) {
                throw new IllegalArgumentException("Can't convert empty jsonArray expressions");
            }
            String asString = jsonArray.get(0).getAsString();
            List arrayList = new ArrayList();
            for (int i = 1; i < jsonArray.size(); i++) {
                JsonElement jsonElement = jsonArray.get(i);
                if (jsonElement instanceof JsonArray) {
                    arrayList.add(convert((JsonArray) jsonElement));
                } else if (jsonElement instanceof JsonPrimitive) {
                    arrayList.add(convert((JsonPrimitive) jsonElement));
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported expression conversion for ");
                    stringBuilder.append(jsonElement.getClass());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
            return new Expression(asString, (Expression[]) arrayList.toArray(new Expression[arrayList.size()]));
        }

        private static Expression convert(@NonNull JsonPrimitive jsonPrimitive) {
            if (jsonPrimitive.isBoolean()) {
                return new ExpressionLiteral(Boolean.valueOf(jsonPrimitive.getAsBoolean()));
            }
            if (jsonPrimitive.isNumber()) {
                return new ExpressionLiteral(Float.valueOf(jsonPrimitive.getAsFloat()));
            }
            if (jsonPrimitive.isString()) {
                return new ExpressionLiteral(jsonPrimitive.getAsString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported literal expression conversion for ");
            stringBuilder.append(jsonPrimitive.getClass());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static class Stop {
        private Object output;
        private Object value;

        Stop(Object obj, Object obj2) {
            this.value = obj;
            this.output = obj2;
        }

        static Expression[] toExpressionArray(Stop... stopArr) {
            Expression[] expressionArr = new Expression[(stopArr.length * 2)];
            for (int i = 0; i < stopArr.length; i++) {
                Stop stop = stopArr[i];
                Object obj = stop.value;
                Expression expression = stop.output;
                if (!(obj instanceof Expression)) {
                    obj = Expression.literal(obj);
                }
                if (!(expression instanceof Expression)) {
                    expression = Expression.literal((Object) expression);
                }
                int i2 = i * 2;
                expressionArr[i2] = (Expression) obj;
                expressionArr[i2 + 1] = expression;
            }
            return expressionArr;
        }
    }

    private static class ExpressionArray extends Expression {
        private Object[] array;

        ExpressionArray(Object[] objArr) {
            this.array = objArr;
        }

        @NonNull
        public Object[] toArray() {
            return new Object[]{"literal", this.array};
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("[\"literal\"], [");
            for (int i = 0; i < this.array.length; i++) {
                Object obj = this.array[i];
                if (obj instanceof String) {
                    stringBuilder.append("\"");
                    stringBuilder.append(obj);
                    stringBuilder.append("\"");
                } else {
                    stringBuilder.append(obj);
                }
                if (i != this.array.length - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]]");
            return stringBuilder.toString();
        }
    }

    public static class ExpressionLiteral extends Expression {
        protected Object literal;

        public ExpressionLiteral(@NonNull Object obj) {
            this.literal = obj;
        }

        Object toValue() {
            return this.literal;
        }

        public String toString() {
            return this.literal.toString();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    ExpressionLiteral expressionLiteral = (ExpressionLiteral) obj;
                    if (this.literal != null) {
                        z = this.literal.equals(expressionLiteral.literal);
                    } else if (expressionLiteral.literal != null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (super.hashCode() * 31) + (this.literal != null ? this.literal.hashCode() : 0);
        }
    }

    public static class Interpolator extends Expression {
        Interpolator(@NonNull String str, @Nullable Expression... expressionArr) {
            super(str, expressionArr);
        }
    }

    Expression() {
        this.operator = null;
        this.arguments = null;
    }

    public Expression(@NonNull String str, @Nullable Expression... expressionArr) {
        this.operator = str;
        this.arguments = expressionArr;
    }

    public static Expression literal(@NonNull Number number) {
        return new ExpressionLiteral(number);
    }

    public static Expression literal(@NonNull String str) {
        return new ExpressionLiteral(str);
    }

    public static Expression literal(boolean z) {
        return new ExpressionLiteral(Boolean.valueOf(z));
    }

    public static Expression literal(@NonNull Object obj) {
        if (obj.getClass().isArray()) {
            return literal(toObjectArray(obj));
        }
        return new ExpressionLiteral(obj);
    }

    public static Expression literal(@NonNull Object[] objArr) {
        return new ExpressionArray(objArr);
    }

    public static Expression color(@ColorInt int i) {
        return toColor(literal(PropertyFactory.colorToRgbaString(i)));
    }

    public static Expression rgb(@NonNull Expression expression, @NonNull Expression expression2, @NonNull Expression expression3) {
        return new Expression("rgb", expression, expression2, expression3);
    }

    public static Expression rgb(@NonNull Number number, @NonNull Number number2, @NonNull Number number3) {
        return rgb(literal(number), literal(number2), literal(number3));
    }

    public static Expression rgba(@NonNull Expression expression, @NonNull Expression expression2, @NonNull Expression expression3, @NonNull Expression expression4) {
        return new Expression("rgba", expression, expression2, expression3, expression4);
    }

    public static Expression rgba(@NonNull Number number, @NonNull Number number2, @NonNull Number number3, @NonNull Number number4) {
        return rgba(literal(number), literal(number2), literal(number3), literal(number4));
    }

    public static Expression toRgba(@NonNull Expression expression) {
        return new Expression("to-rgba", expression);
    }

    public static Expression eq(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("==", expression, expression2);
    }

    public static Expression eq(Expression expression, boolean z) {
        return eq(expression, literal(z));
    }

    public static Expression eq(@NonNull Expression expression, @NonNull String str) {
        return eq(literal((Object) expression), literal(str));
    }

    public static Expression eq(@NonNull Expression expression, @NonNull Number number) {
        return eq(literal((Object) expression), literal(number));
    }

    public static Expression neq(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("!=", expression, expression2);
    }

    public static Expression neq(Expression expression, boolean z) {
        return new Expression("!=", literal((Object) expression), literal(z));
    }

    public static Expression neq(@NonNull Expression expression, @NonNull String str) {
        return new Expression("!=", literal((Object) expression), literal(str));
    }

    public static Expression neq(@NonNull Expression expression, @NonNull Number number) {
        return new Expression("!=", literal((Object) expression), literal(number));
    }

    public static Expression gt(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression(">", expression, expression2);
    }

    public static Expression gt(@NonNull Expression expression, @NonNull Number number) {
        return new Expression(">", literal((Object) expression), literal(number));
    }

    public static Expression gt(@NonNull Expression expression, @NonNull String str) {
        return new Expression(">", literal((Object) expression), literal(str));
    }

    public static Expression lt(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("<", expression, expression2);
    }

    public static Expression lt(@NonNull Expression expression, @NonNull Number number) {
        return new Expression("<", literal((Object) expression), literal(number));
    }

    public static Expression lt(@NonNull Expression expression, @NonNull String str) {
        return new Expression("<", literal((Object) expression), literal(str));
    }

    public static Expression gte(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression(">=", expression, expression2);
    }

    public static Expression gte(@NonNull Expression expression, @NonNull Number number) {
        return new Expression(">=", literal((Object) expression), literal(number));
    }

    public static Expression gte(@NonNull Expression expression, @NonNull String str) {
        return new Expression(">=", literal((Object) expression), literal(str));
    }

    public static Expression lte(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("<=", expression, expression2);
    }

    public static Expression lte(@NonNull Expression expression, @NonNull Number number) {
        return new Expression("<=", literal((Object) expression), literal(number));
    }

    public static Expression lte(@NonNull Expression expression, @NonNull String str) {
        return new Expression("<=", literal((Object) expression), literal(str));
    }

    public static Expression all(@NonNull Expression... expressionArr) {
        return new Expression("all", expressionArr);
    }

    public static Expression any(@NonNull Expression... expressionArr) {
        return new Expression("any", expressionArr);
    }

    public static Expression not(@NonNull Expression expression) {
        return new Expression("!", expression);
    }

    public static Expression not(boolean z) {
        return not(literal(z));
    }

    public static Expression switchCase(@Size(min = 1) @NonNull Expression... expressionArr) {
        return new Expression("case", expressionArr);
    }

    public static Expression match(@Size(min = 2) @NonNull Expression... expressionArr) {
        return new Expression("match", expressionArr);
    }

    public static Expression match(@NonNull Expression expression, @NonNull Expression expression2, @NonNull Stop... stopArr) {
        Expression[] expressionArr = new Expression[(stopArr.length * 2)];
        for (int i = 0; i < stopArr.length; i++) {
            int i2 = i * 2;
            expressionArr[i2] = literal(stopArr[i].value);
            expressionArr[i2 + 1] = literal(stopArr[i].output);
        }
        return match(join(join(new Expression[]{expression}, expressionArr), new Expression[]{expression2}));
    }

    public static Expression coalesce(@NonNull Expression... expressionArr) {
        return new Expression("coalesce", expressionArr);
    }

    public static Expression properties() {
        return new Expression("properties", new Expression[0]);
    }

    public static Expression geometryType() {
        return new Expression("geometry-type", new Expression[0]);
    }

    public static Expression id() {
        return new Expression("id", new Expression[0]);
    }

    public static Expression heatmapDensity() {
        return new Expression("heatmap-density", new Expression[0]);
    }

    public static Expression at(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("at", expression, expression2);
    }

    public static Expression at(@NonNull Number number, @NonNull Expression expression) {
        return at(literal(number), expression);
    }

    public static Expression get(@NonNull Expression expression) {
        return new Expression("get", expression);
    }

    public static Expression get(@NonNull String str) {
        return get(literal(str));
    }

    public static Expression get(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("get", expression, expression2);
    }

    public static Expression get(@NonNull String str, @NonNull Expression expression) {
        return get(literal(str), expression);
    }

    public static Expression has(@NonNull Expression expression) {
        return new Expression("has", expression);
    }

    public static Expression has(@NonNull String str) {
        return has(literal(str));
    }

    public static Expression has(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("has", expression, expression2);
    }

    public static Expression has(@NonNull String str, @NonNull Expression expression) {
        return has(literal(str), expression);
    }

    public static Expression length(@NonNull Expression expression) {
        return new Expression("length", expression);
    }

    public static Expression length(@NonNull String str) {
        return length(literal(str));
    }

    public static Expression ln2() {
        return new Expression("ln2", new Expression[0]);
    }

    public static Expression pi() {
        return new Expression("pi", new Expression[0]);
    }

    /* renamed from: e */
    public static Expression m25381e() {
        return new Expression("e", new Expression[0]);
    }

    public static Expression sum(@Size(min = 2) Expression... expressionArr) {
        return new Expression("+", expressionArr);
    }

    public static Expression sum(@Size(min = 2) Number... numberArr) {
        Expression[] expressionArr = new Expression[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            expressionArr[i] = literal(numberArr[i]);
        }
        return sum(expressionArr);
    }

    public static Expression product(@Size(min = 2) Expression... expressionArr) {
        return new Expression("*", expressionArr);
    }

    public static Expression product(@Size(min = 2) Number... numberArr) {
        Expression[] expressionArr = new Expression[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            expressionArr[i] = literal(numberArr[i]);
        }
        return product(expressionArr);
    }

    public static Expression subtract(@NonNull Expression expression) {
        return new Expression("-", expression);
    }

    public static Expression subtract(@NonNull Number number) {
        return subtract(literal(number));
    }

    public static Expression subtract(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("-", expression, expression2);
    }

    public static Expression subtract(@NonNull Number number, @NonNull Number number2) {
        return subtract(literal(number), literal(number2));
    }

    public static Expression division(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("/", expression, expression2);
    }

    public static Expression division(@NonNull Number number, @NonNull Number number2) {
        return division(literal(number), literal(number2));
    }

    public static Expression mod(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("%", expression, expression2);
    }

    public static Expression mod(@NonNull Number number, @NonNull Number number2) {
        return mod(literal(number), literal(number2));
    }

    public static Expression pow(@NonNull Expression expression, @NonNull Expression expression2) {
        return new Expression("^", expression, expression2);
    }

    public static Expression pow(@NonNull Number number, @NonNull Number number2) {
        return pow(literal(number), literal(number2));
    }

    public static Expression sqrt(@NonNull Expression expression) {
        return new Expression("sqrt", expression);
    }

    public static Expression sqrt(@NonNull Number number) {
        return sqrt(literal(number));
    }

    public static Expression log10(@NonNull Expression expression) {
        return new Expression("log10", expression);
    }

    public static Expression log10(@NonNull Number number) {
        return log10(literal(number));
    }

    public static Expression ln(Expression expression) {
        return new Expression("ln", expression);
    }

    public static Expression ln(Number number) {
        return ln(literal(number));
    }

    public static Expression log2(@NonNull Expression expression) {
        return new Expression("log2", expression);
    }

    public static Expression log2(@NonNull Number number) {
        return log2(literal(number));
    }

    public static Expression sin(@NonNull Expression expression) {
        return new Expression("sin", expression);
    }

    public static Expression sin(@NonNull Number number) {
        return sin(literal(number));
    }

    public static Expression cos(@NonNull Expression expression) {
        return new Expression("cos", expression);
    }

    public static Expression cos(@NonNull Number number) {
        return new Expression("cos", literal(number));
    }

    public static Expression tan(@NonNull Expression expression) {
        return new Expression("tan", expression);
    }

    public static Expression tan(@NonNull Number number) {
        return new Expression("tan", literal(number));
    }

    public static Expression asin(@NonNull Expression expression) {
        return new Expression("asin", expression);
    }

    public static Expression asin(@NonNull Number number) {
        return asin(literal(number));
    }

    public static Expression acos(@NonNull Expression expression) {
        return new Expression("acos", expression);
    }

    public static Expression acos(@NonNull Number number) {
        return acos(literal(number));
    }

    public static Expression atan(@NonNull Expression expression) {
        return new Expression("atan", expression);
    }

    public static Expression atan(@NonNull Number number) {
        return atan(literal(number));
    }

    public static Expression min(@Size(min = 1) Expression... expressionArr) {
        return new Expression("min", expressionArr);
    }

    public static Expression min(@Size(min = 1) Number... numberArr) {
        Expression[] expressionArr = new Expression[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            expressionArr[i] = literal(numberArr[i]);
        }
        return min(expressionArr);
    }

    public static Expression max(@Size(min = 1) Expression... expressionArr) {
        return new Expression("max", expressionArr);
    }

    public static Expression max(@Size(min = 1) Number... numberArr) {
        Expression[] expressionArr = new Expression[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            expressionArr[i] = literal(numberArr[i]);
        }
        return max(expressionArr);
    }

    public static Expression round(Expression expression) {
        return new Expression("round", expression);
    }

    public static Expression round(Number number) {
        return round(literal(number));
    }

    public static Expression abs(Expression expression) {
        return new Expression("abs", expression);
    }

    public static Expression abs(Number number) {
        return abs(literal(number));
    }

    public static Expression ceil(Expression expression) {
        return new Expression("ceil", expression);
    }

    public static Expression ceil(Number number) {
        return ceil(literal(number));
    }

    public static Expression floor(Expression expression) {
        return new Expression("floor", expression);
    }

    public static Expression floor(Number number) {
        return floor(literal(number));
    }

    public static Expression upcase(@NonNull Expression expression) {
        return new Expression("upcase", expression);
    }

    public static Expression upcase(@NonNull String str) {
        return upcase(literal(str));
    }

    public static Expression downcase(@NonNull Expression expression) {
        return new Expression("downcase", expression);
    }

    public static Expression downcase(@NonNull String str) {
        return downcase(literal(str));
    }

    public static Expression concat(@NonNull Expression... expressionArr) {
        return new Expression("concat", expressionArr);
    }

    public static Expression concat(@NonNull String... strArr) {
        Expression[] expressionArr = new Expression[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            expressionArr[i] = literal(strArr[i]);
        }
        return concat(expressionArr);
    }

    public static Expression array(@NonNull Expression expression) {
        return new Expression("array", expression);
    }

    public static Expression typeOf(@NonNull Expression expression) {
        return new Expression("typeof", expression);
    }

    public static Expression string(@NonNull Expression... expressionArr) {
        return new Expression(ManagerWebServices.PARAM_TEASER_STRING, expressionArr);
    }

    public static Expression number(@NonNull Expression... expressionArr) {
        return new Expression("number", expressionArr);
    }

    public static Expression bool(@NonNull Expression... expressionArr) {
        return new Expression("boolean", expressionArr);
    }

    public static Expression object(@NonNull Expression expression) {
        return new Expression("object", expression);
    }

    public static Expression toString(@NonNull Expression expression) {
        return new Expression("to-string", expression);
    }

    public static Expression toNumber(@NonNull Expression expression) {
        return new Expression("to-number", expression);
    }

    public static Expression toBool(@NonNull Expression expression) {
        return new Expression("to-boolean", expression);
    }

    public static Expression toColor(@NonNull Expression expression) {
        return new Expression("to-color", expression);
    }

    public static Expression let(@Size(min = 1) Expression... expressionArr) {
        return new Expression("let", expressionArr);
    }

    public static Expression var(@NonNull Expression expression) {
        return new Expression("var", expression);
    }

    public static Expression var(@NonNull String str) {
        return var(literal(str));
    }

    public static Expression zoom() {
        return new Expression("zoom", new Expression[0]);
    }

    public static Stop stop(@NonNull Object obj, @NonNull Object obj2) {
        return new Stop(obj, obj2);
    }

    public static Expression step(@NonNull Number number, @NonNull Expression expression, Expression... expressionArr) {
        return step(literal(number), expression, expressionArr);
    }

    public static Expression step(@NonNull Expression expression, @NonNull Expression expression2, Expression... expressionArr) {
        return new Expression("step", join(new Expression[]{expression, expression2}, expressionArr));
    }

    public static Expression step(@NonNull Number number, @NonNull Expression expression, Stop... stopArr) {
        return step(literal(number), expression, Stop.toExpressionArray(stopArr));
    }

    public static Expression step(@NonNull Expression expression, @NonNull Expression expression2, Stop... stopArr) {
        return step(expression, expression2, Stop.toExpressionArray(stopArr));
    }

    public static Expression step(@NonNull Number number, @NonNull Number number2, Expression... expressionArr) {
        return step(literal(number), number2, expressionArr);
    }

    public static Expression step(@NonNull Expression expression, @NonNull Number number, Expression... expressionArr) {
        return step(expression, literal(number), expressionArr);
    }

    public static Expression step(@NonNull Number number, @NonNull Number number2, Stop... stopArr) {
        return step(literal(number), number2, Stop.toExpressionArray(stopArr));
    }

    public static Expression step(@NonNull Expression expression, @NonNull Number number, Stop... stopArr) {
        return step(expression, number, Stop.toExpressionArray(stopArr));
    }

    public static Expression interpolate(@NonNull Interpolator interpolator, @NonNull Expression expression, Expression... expressionArr) {
        return new Expression("interpolate", join(new Expression[]{interpolator, expression}, expressionArr));
    }

    public static Expression interpolate(@NonNull Interpolator interpolator, @NonNull Expression expression, Stop... stopArr) {
        return interpolate(interpolator, expression, Stop.toExpressionArray(stopArr));
    }

    public static Interpolator linear() {
        return new Interpolator("linear", new Expression[0]);
    }

    public static Interpolator exponential(@NonNull Number number) {
        return exponential(literal(number));
    }

    public static Interpolator exponential(@NonNull Expression expression) {
        return new Interpolator("exponential", expression);
    }

    public static Interpolator cubicBezier(@NonNull Expression expression, @NonNull Expression expression2, @NonNull Expression expression3, @NonNull Expression expression4) {
        return new Interpolator("cubic-bezier", expression, expression2, expression3, expression4);
    }

    public static Interpolator cubicBezier(@NonNull Number number, @NonNull Number number2, @NonNull Number number3, @NonNull Number number4) {
        return cubicBezier(literal(number), literal(number2), literal(number3), literal(number4));
    }

    private static Expression[] join(Expression[] expressionArr, Expression[] expressionArr2) {
        Object obj = new Expression[(expressionArr.length + expressionArr2.length)];
        System.arraycopy(expressionArr, 0, obj, 0, expressionArr.length);
        System.arraycopy(expressionArr2, 0, obj, expressionArr.length, expressionArr2.length);
        return obj;
    }

    @NonNull
    public Object[] toArray() {
        List arrayList = new ArrayList();
        arrayList.add(this.operator);
        if (this.arguments != null) {
            for (Expression expression : this.arguments) {
                if (expression instanceof ExpressionLiteral) {
                    arrayList.add(toValue((ExpressionLiteral) expression));
                } else {
                    arrayList.add(expression.toArray());
                }
            }
        }
        return arrayList.toArray();
    }

    private Object toValue(ExpressionLiteral expressionLiteral) {
        expressionLiteral = expressionLiteral.toValue();
        if (expressionLiteral instanceof PropertyValue) {
            throw new IllegalArgumentException("PropertyValue are not allowed as an expression literal, use value instead.");
        } else if (expressionLiteral instanceof ExpressionLiteral) {
            return toValue(expressionLiteral);
        } else {
            return expressionLiteral instanceof Expression ? expressionLiteral.toArray() : expressionLiteral;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[\"");
        stringBuilder.append(this.operator);
        stringBuilder.append("\"");
        if (this.arguments != null) {
            for (Object obj : this.arguments) {
                stringBuilder.append(", ");
                if (obj instanceof ExpressionLiteral) {
                    stringBuilder.append(((ExpressionLiteral) obj).toValue());
                } else {
                    stringBuilder.append(obj.toString());
                }
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        super.equals(r4);
        if (r3 != r4) goto L_0x0007;
    L_0x0005:
        r4 = 1;
        return r4;
    L_0x0007:
        r0 = 0;
        if (r4 == 0) goto L_0x002e;
    L_0x000a:
        r1 = r4 instanceof com.mapbox.mapboxsdk.style.expressions.Expression;
        if (r1 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x002e;
    L_0x000f:
        r4 = (com.mapbox.mapboxsdk.style.expressions.Expression) r4;
        r1 = r3.operator;
        if (r1 == 0) goto L_0x0020;
    L_0x0015:
        r1 = r3.operator;
        r2 = r4.operator;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0025;
    L_0x001f:
        goto L_0x0024;
    L_0x0020:
        r1 = r4.operator;
        if (r1 == 0) goto L_0x0025;
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = r3.arguments;
        r4 = r4.arguments;
        r4 = java.util.Arrays.deepEquals(r0, r4);
        return r4;
    L_0x002e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.style.expressions.Expression.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((this.operator != null ? this.operator.hashCode() : 0) * 31) + Arrays.hashCode(this.arguments);
    }

    static Object[] toObjectArray(Object obj) {
        int length = java.lang.reflect.Array.getLength(obj);
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = java.lang.reflect.Array.get(obj, i);
        }
        return objArr;
    }
}
