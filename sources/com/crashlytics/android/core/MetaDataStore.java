package com.crashlytics.android.core;

import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {
    private static final String KEYDATA_SUFFIX = "keys";
    private static final String KEY_USER_EMAIL = "userEmail";
    private static final String KEY_USER_ID = "userId";
    private static final String KEY_USER_NAME = "userName";
    private static final String METADATA_EXT = ".meta";
    private static final String USERDATA_SUFFIX = "user";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File filesDir;

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    public void writeUserData(String str, UserMetaData userMetaData) {
        str = getUserDataFileForSession(str);
        Closeable closeable = null;
        try {
            userMetaData = userDataToJson(userMetaData);
            Closeable bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), UTF_8));
            try {
                bufferedWriter.write(userMetaData);
                bufferedWriter.flush();
                CommonUtils.a(bufferedWriter, "Failed to close user metadata file.");
            } catch (Exception e) {
                str = e;
                closeable = bufferedWriter;
                try {
                    C15608c.h().e(CrashlyticsCore.TAG, "Error serializing user metadata.", str);
                    CommonUtils.a(closeable, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    str = th;
                    CommonUtils.a(closeable, "Failed to close user metadata file.");
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                closeable = bufferedWriter;
                CommonUtils.a(closeable, "Failed to close user metadata file.");
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            C15608c.h().e(CrashlyticsCore.TAG, "Error serializing user metadata.", str);
            CommonUtils.a(closeable, "Failed to close user metadata file.");
        }
    }

    public UserMetaData readUserData(String str) {
        str = getUserDataFileForSession(str);
        if (!str.exists()) {
            return UserMetaData.EMPTY;
        }
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(str);
            try {
                str = jsonToUserData(CommonUtils.a(fileInputStream));
                CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                return str;
            } catch (Exception e) {
                str = e;
                closeable = fileInputStream;
                try {
                    C15608c.h().e(CrashlyticsCore.TAG, "Error deserializing user metadata.", str);
                    CommonUtils.a(closeable, "Failed to close user metadata file.");
                    return UserMetaData.EMPTY;
                } catch (Throwable th) {
                    str = th;
                    CommonUtils.a(closeable, "Failed to close user metadata file.");
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                closeable = fileInputStream;
                CommonUtils.a(closeable, "Failed to close user metadata file.");
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            C15608c.h().e(CrashlyticsCore.TAG, "Error deserializing user metadata.", str);
            CommonUtils.a(closeable, "Failed to close user metadata file.");
            return UserMetaData.EMPTY;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        str = getKeysFileForSession(str);
        Closeable closeable = null;
        try {
            map = keysDataToJson(map);
            Closeable bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), UTF_8));
            try {
                bufferedWriter.write(map);
                bufferedWriter.flush();
                CommonUtils.a(bufferedWriter, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                str = e;
                closeable = bufferedWriter;
                try {
                    C15608c.h().e(CrashlyticsCore.TAG, "Error serializing key/value metadata.", str);
                    CommonUtils.a(closeable, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    str = th;
                    CommonUtils.a(closeable, "Failed to close key/value metadata file.");
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                closeable = bufferedWriter;
                CommonUtils.a(closeable, "Failed to close key/value metadata file.");
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            C15608c.h().e(CrashlyticsCore.TAG, "Error serializing key/value metadata.", str);
            CommonUtils.a(closeable, "Failed to close key/value metadata file.");
        }
    }

    public Map<String, String> readKeyData(String str) {
        str = getKeysFileForSession(str);
        if (!str.exists()) {
            return Collections.emptyMap();
        }
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(str);
            try {
                str = jsonToKeysData(CommonUtils.a(fileInputStream));
                CommonUtils.a(fileInputStream, "Failed to close user metadata file.");
                return str;
            } catch (Exception e) {
                str = e;
                closeable = fileInputStream;
                try {
                    C15608c.h().e(CrashlyticsCore.TAG, "Error deserializing user metadata.", str);
                    CommonUtils.a(closeable, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    str = th;
                    CommonUtils.a(closeable, "Failed to close user metadata file.");
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                closeable = fileInputStream;
                CommonUtils.a(closeable, "Failed to close user metadata file.");
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            C15608c.h().e(CrashlyticsCore.TAG, "Error deserializing user metadata.", str);
            CommonUtils.a(closeable, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    public File getUserDataFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("user");
        stringBuilder.append(METADATA_EXT);
        return new File(file, stringBuilder.toString());
    }

    public File getKeysFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(KEYDATA_SUFFIX);
        stringBuilder.append(METADATA_EXT);
        return new File(file, stringBuilder.toString());
    }

    private static UserMetaData jsonToUserData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new UserMetaData(valueOrNull(jSONObject, "userId"), valueOrNull(jSONObject, KEY_USER_NAME), valueOrNull(jSONObject, KEY_USER_EMAIL));
    }

    private static String userDataToJson(final UserMetaData userMetaData) throws JSONException {
        return new JSONObject() {
        }.toString();
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        str = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            str.put(str2, valueOrNull(jSONObject, str2));
        }
        return str;
    }

    private static String keysDataToJson(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? jSONObject.optString(str, null) : null;
    }
}
