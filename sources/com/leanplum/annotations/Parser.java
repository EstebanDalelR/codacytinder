package com.leanplum.annotations;

import android.text.TextUtils;
import com.leanplum.Var;
import com.leanplum.p069a.ao;
import com.tinder.api.ManagerWebServices;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class Parser {
    /* renamed from: a */
    private static <T> void m9741a(Object obj, String str, T t, String str2, Field field) {
        str = Var.define(str, t, str2);
        str.addValueChangedHandler(new Parser$1(new WeakReference(obj), obj != null ? true : null, field, str));
    }

    /* renamed from: a */
    private static void m9742a(Object obj, String str, String str2, Field field) {
        str = Var.defineFile(str, str2);
        str.addFileReadyHandler(new Parser$2(new WeakReference(obj), obj != null ? true : null, field, str));
    }

    public static void parseVariables(Object... objArr) {
        try {
            for (Object obj : objArr) {
                m9740a(obj, obj.getClass());
            }
        } catch (Object[] objArr2) {
            ao.m9516a("Leanplum", "Error parsing variables", objArr2);
        }
    }

    public static void parseVariablesForClasses(Class<?>... clsArr) {
        try {
            for (Class a : clsArr) {
                m9740a(null, a);
            }
        } catch (Class<?>[] clsArr2) {
            ao.m9516a("Leanplum", "Error parsing variables", clsArr2);
        }
    }

    /* renamed from: a */
    private static void m9740a(Object obj, Class<?> cls) throws IllegalArgumentException, IllegalAccessException {
        for (Field field : cls.getFields()) {
            Object group;
            String name;
            Object obj2;
            boolean z = true;
            if (field.isAnnotationPresent(Variable.class)) {
                Variable variable = (Variable) field.getAnnotation(Variable.class);
                group = variable.group();
                name = variable.name();
                obj2 = null;
            } else if (field.isAnnotationPresent(File.class)) {
                File file = (File) field.getAnnotation(File.class);
                group = file.group();
                name = file.name();
                obj2 = 1;
            } else {
            }
            if (TextUtils.isEmpty(name)) {
                name = field.getName();
            }
            if (!TextUtils.isEmpty(group)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(group);
                stringBuilder.append(".");
                stringBuilder.append(name);
                name = stringBuilder.toString();
            }
            Class type = field.getType();
            String cls2 = type.toString();
            if (cls2.equals("int")) {
                m9741a(obj, name, Integer.valueOf(field.getInt(obj)), "integer", field);
            } else if (cls2.equals("byte")) {
                m9741a(obj, name, Byte.valueOf(field.getByte(obj)), "integer", field);
            } else if (cls2.equals("short")) {
                m9741a(obj, name, Short.valueOf(field.getShort(obj)), "integer", field);
            } else if (cls2.equals("long")) {
                m9741a(obj, name, Long.valueOf(field.getLong(obj)), "integer", field);
            } else if (cls2.equals("char")) {
                m9741a(obj, name, Character.valueOf(field.getChar(obj)), "integer", field);
            } else if (cls2.equals("float")) {
                m9741a(obj, name, Float.valueOf(field.getFloat(obj)), "float", field);
            } else if (cls2.equals("double")) {
                m9741a(obj, name, Double.valueOf(field.getDouble(obj)), "float", field);
            } else if (cls2.equals("boolean")) {
                m9741a(obj, name, Boolean.valueOf(field.getBoolean(obj)), "bool", field);
            } else if (type.isPrimitive()) {
                r3 = new Object[1];
                r5 = new StringBuilder("Variable ");
                r5.append(name);
                r5.append(" is an unsupported primitive type.");
                r3[0] = r5.toString();
                ao.m9516a(r3);
            } else if (type.isArray()) {
                r3 = new Object[1];
                r5 = new StringBuilder("Variable ");
                r5.append(name);
                r5.append(" should be a List instead of an Array.");
                r3[0] = r5.toString();
                ao.m9516a(r3);
            } else if (type.isAssignableFrom(List.class)) {
                m9741a(obj, name, field.get(obj), "list", field);
            } else if (type.isAssignableFrom(Map.class)) {
                m9741a(obj, name, field.get(obj), ManagerWebServices.PARAM_GROUP, field);
            } else {
                String str;
                group = field.get(obj);
                if (group == null) {
                    str = null;
                } else {
                    str = group.toString();
                }
                if (obj2 != null) {
                    Var defineFile = Var.defineFile(name, str);
                    if (obj == null) {
                        z = false;
                    }
                    defineFile.addFileReadyHandler(new Parser$2(new WeakReference(obj), z, field, defineFile));
                } else {
                    m9741a(obj, name, str, ManagerWebServices.PARAM_TEASER_STRING, field);
                }
            }
        }
    }
}
