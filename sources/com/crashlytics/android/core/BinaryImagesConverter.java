package com.crashlytics.android.core;

import android.content.Context;
import android.os.Build.VERSION;
import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class BinaryImagesConverter {
    private static final String DATA_DIR = "/data";
    private final Context context;
    private final FileIdStrategy fileIdStrategy;

    interface FileIdStrategy {
        String createId(File file) throws IOException;
    }

    BinaryImagesConverter(Context context, FileIdStrategy fileIdStrategy) {
        this.context = context;
        this.fileIdStrategy = fileIdStrategy;
    }

    byte[] convert(String str) throws IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromString(str));
    }

    byte[] convert(BufferedReader bufferedReader) throws IOException {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(bufferedReader));
    }

    private JSONArray parseProcMapsJsonFromStream(BufferedReader bufferedReader) throws IOException {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject jsonFromMapEntryString = jsonFromMapEntryString(readLine);
            if (jsonFromMapEntryString != null) {
                jSONArray.put(jsonFromMapEntryString);
            }
        }
    }

    private JSONArray parseProcMapsJsonFromString(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            str = joinMapsEntries(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String jsonFromMapEntryString : str) {
                JSONObject jsonFromMapEntryString2 = jsonFromMapEntryString(jsonFromMapEntryString);
                if (jsonFromMapEntryString2 != null) {
                    jSONArray.put(jsonFromMapEntryString2);
                }
            }
            return jSONArray;
        } catch (String str2) {
            C15608c.h().w(CrashlyticsCore.TAG, "Unable to parse proc maps string", str2);
            return jSONArray;
        }
    }

    private JSONObject jsonFromMapEntryString(String str) {
        str = ProcMapEntryParser.parse(str);
        if (str != null) {
            if (isRelevant(str)) {
                try {
                    try {
                        return createBinaryImageJson(this.fileIdStrategy.createId(getLibraryFile(str.path)), str);
                    } catch (String str2) {
                        C15608c.h().d(CrashlyticsCore.TAG, "Could not create a binary image json string", str2);
                        return null;
                    }
                } catch (Throwable e) {
                    Logger h = C15608c.h();
                    String str3 = CrashlyticsCore.TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not generate ID for file ");
                    stringBuilder.append(str2.path);
                    h.d(str3, stringBuilder.toString(), e);
                    return null;
                }
            }
        }
        return null;
    }

    private File getLibraryFile(String str) {
        File file = new File(str);
        return file.exists() == null ? correctDataPath(file) : file;
    }

    private File correctDataPath(File file) {
        if (VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith(DATA_DIR)) {
            try {
                file = new File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (Throwable e) {
                C15608c.h().e(CrashlyticsCore.TAG, "Error getting ApplicationInfo", e);
            }
        }
        return file;
    }

    private static byte[] generateBinaryImagesJsonString(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONArray jSONArray2) {
            C15608c.h().w(CrashlyticsCore.TAG, "Binary images string is null", jSONArray2);
            return new byte[null];
        }
    }

    private static JSONObject createBinaryImageJson(String str, ProcMapEntry procMapEntry) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", procMapEntry.address);
        jSONObject.put(ManagerWebServices.PARAM_SIZE, procMapEntry.size);
        jSONObject.put("name", procMapEntry.path);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    private static String joinMapsEntries(JSONArray jSONArray) throws JSONException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            stringBuilder.append(jSONArray.getString(i));
        }
        return stringBuilder.toString();
    }

    private static boolean isRelevant(ProcMapEntry procMapEntry) {
        return (procMapEntry.perms.indexOf(120) == -1 || procMapEntry.path.indexOf(47) == -1) ? null : true;
    }
}
