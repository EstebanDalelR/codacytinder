package org.apache.commons.lang3;

import org.apache.commons.lang3.p462a.C15985a;

public enum JavaVersion {
    JAVA_0_9(1.5f, "0.9"),
    JAVA_1_1(1.1f, "1.1"),
    JAVA_1_2(1.2f, "1.2"),
    JAVA_1_3(1.3f, "1.3"),
    JAVA_1_4(1.4f, "1.4"),
    JAVA_1_5(1.5f, "1.5"),
    JAVA_1_6(1.6f, "1.6"),
    JAVA_1_7(1.7f, "1.7"),
    JAVA_1_8(1.8f, "1.8"),
    JAVA_1_9(9.0f, "9"),
    JAVA_9(9.0f, "9"),
    JAVA_RECENT(maxVersion(), Float.toString(maxVersion()));
    
    private final String name;
    private final float value;

    private JavaVersion(float f, String str) {
        this.value = f;
        this.name = str;
    }

    public boolean atLeast(JavaVersion javaVersion) {
        return this.value >= javaVersion.value ? true : null;
    }

    static JavaVersion getJavaVersion(String str) {
        return get(str);
    }

    static JavaVersion get(String str) {
        if ("0.9".equals(str)) {
            return JAVA_0_9;
        }
        if ("1.1".equals(str)) {
            return JAVA_1_1;
        }
        if ("1.2".equals(str)) {
            return JAVA_1_2;
        }
        if ("1.3".equals(str)) {
            return JAVA_1_3;
        }
        if ("1.4".equals(str)) {
            return JAVA_1_4;
        }
        if ("1.5".equals(str)) {
            return JAVA_1_5;
        }
        if ("1.6".equals(str)) {
            return JAVA_1_6;
        }
        if ("1.7".equals(str)) {
            return JAVA_1_7;
        }
        if ("1.8".equals(str)) {
            return JAVA_1_8;
        }
        if ("9".equals(str)) {
            return JAVA_9;
        }
        if (str != null && ((double) toFloatVersion(str)) - 1.0d < 1.0d) {
            int max = Math.max(str.indexOf(46), str.indexOf(44));
            if (Float.parseFloat(str.substring(max + 1, Math.max(str.length(), str.indexOf(44, max)))) > 0.9f) {
                return JAVA_RECENT;
            }
        }
        return null;
    }

    public String toString() {
        return this.name;
    }

    private static float maxVersion() {
        float toFloatVersion = toFloatVersion(System.getProperty("java.specification.version", "99.0"));
        return toFloatVersion > 0.0f ? toFloatVersion : 99.0f;
    }

    private static float toFloatVersion(String str) {
        if (!str.contains(".")) {
            return C15985a.m60649a(str, -1.0f);
        }
        str = str.split("\\.");
        if (str.length < 2) {
            return -1.0f;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str[0]);
        stringBuilder.append('.');
        stringBuilder.append(str[1]);
        return C15985a.m60649a(stringBuilder.toString(), -1.0f);
    }
}
