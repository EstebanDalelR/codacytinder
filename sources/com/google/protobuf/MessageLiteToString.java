package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite.ExtendableMessage;
import io.fabric.sdk.android.services.events.C15645a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final String LIST_SUFFIX = "List";

    MessageLiteToString() {
    }

    static String toString(MessageLite messageLite, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(str);
        reflectivePrintWithIndent(messageLite, stringBuilder, null);
        return stringBuilder.toString();
    }

    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder stringBuilder, int i) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Set<String> treeSet = new TreeSet();
        for (Method method : messageLite.getClass().getDeclaredMethods()) {
            Method method2;
            hashMap2.put(method2.getName(), method2);
            if (method2.getParameterTypes().length == 0) {
                hashMap.put(method2.getName(), method2);
                if (method2.getName().startsWith("get")) {
                    treeSet.add(method2.getName());
                }
            }
        }
        for (String replaceFirst : treeSet) {
            StringBuilder stringBuilder2;
            String stringBuilder3;
            String replaceFirst2 = replaceFirst2.replaceFirst("get", "");
            if (replaceFirst2.endsWith(LIST_SUFFIX) && !replaceFirst2.endsWith(BUILDER_LIST_SUFFIX)) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(replaceFirst2.substring(0, 1).toLowerCase());
                stringBuilder2.append(replaceFirst2.substring(1, replaceFirst2.length() - LIST_SUFFIX.length()));
                stringBuilder3 = stringBuilder2.toString();
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("get");
                stringBuilder4.append(replaceFirst2);
                method2 = (Method) hashMap.get(stringBuilder4.toString());
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    printField(stringBuilder, i, camelCaseToSnakeCase(stringBuilder3), GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0]));
                }
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("set");
            stringBuilder2.append(replaceFirst2);
            if (((Method) hashMap2.get(stringBuilder2.toString())) != null) {
                if (replaceFirst2.endsWith(BYTES_SUFFIX)) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("get");
                    stringBuilder2.append(replaceFirst2.substring(0, replaceFirst2.length() - BYTES_SUFFIX.length()));
                    if (hashMap.containsKey(stringBuilder2.toString())) {
                    }
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(replaceFirst2.substring(0, 1).toLowerCase());
                stringBuilder2.append(replaceFirst2.substring(1));
                stringBuilder3 = stringBuilder2.toString();
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append("get");
                stringBuilder4.append(replaceFirst2);
                method2 = (Method) hashMap.get(stringBuilder4.toString());
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("has");
                stringBuilder5.append(replaceFirst2);
                Method method3 = (Method) hashMap.get(stringBuilder5.toString());
                if (method2 != null) {
                    Object invokeOrDie = GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0]);
                    boolean booleanValue = method3 == null ? !isDefaultValue(invokeOrDie) : ((Boolean) GeneratedMessageLite.invokeOrDie(method3, messageLite, new Object[0])).booleanValue();
                    if (booleanValue) {
                        printField(stringBuilder, i, camelCaseToSnakeCase(stringBuilder3), invokeOrDie);
                    }
                }
            }
        }
        if (messageLite instanceof ExtendableMessage) {
            Iterator it = ((ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("[");
                stringBuilder6.append(((ExtensionDescriptor) entry.getKey()).getNumber());
                stringBuilder6.append("]");
                printField(stringBuilder, i, stringBuilder6.toString(), entry.getValue());
            }
        }
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.printWithIndent(stringBuilder, i);
        }
    }

    private static boolean isDefaultValue(Object obj) {
        boolean z = true;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ^ 1;
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() != null) {
                z = false;
            }
            return z;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() != 0.0f) {
                z = false;
            }
            return z;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() != 0.0d) {
                z = false;
            }
            return z;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof ByteString) {
                return obj.equals(ByteString.EMPTY);
            }
            if (obj instanceof MessageLite) {
                if (obj != ((MessageLite) obj).getDefaultInstanceForType()) {
                    z = false;
                }
                return z;
            } else if (!(obj instanceof Enum)) {
                return false;
            } else {
                if (((Enum) obj).ordinal() != null) {
                    z = false;
                }
                return z;
            }
        }
    }

    static final void printField(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object printField : (List) obj) {
                printField(stringBuilder, i, str, printField);
            }
            return;
        }
        stringBuilder.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(str);
        if ((obj instanceof String) != null) {
            stringBuilder.append(": \"");
            stringBuilder.append(TextFormatEscaper.escapeText((String) obj));
            stringBuilder.append('\"');
        } else if ((obj instanceof ByteString) != null) {
            stringBuilder.append(": \"");
            stringBuilder.append(TextFormatEscaper.escapeBytes((ByteString) obj));
            stringBuilder.append('\"');
        } else if ((obj instanceof GeneratedMessageLite) != null) {
            stringBuilder.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, stringBuilder, i + 2);
            stringBuilder.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append("}");
        } else {
            stringBuilder.append(": ");
            stringBuilder.append(obj.toString());
        }
    }

    private static final String camelCaseToSnakeCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }
}
