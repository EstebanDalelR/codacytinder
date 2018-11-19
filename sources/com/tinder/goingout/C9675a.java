package com.tinder.goingout;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.tinder.goingout.model.GoingOut;
import com.tinder.utils.ad;
import java.util.Arrays;

/* renamed from: com.tinder.goingout.a */
public class C9675a {
    /* renamed from: a */
    public static String m40120a(@NonNull Gson gson, @NonNull GoingOut goingOut) {
        return gson.toJson(goingOut);
    }

    @Nullable
    /* renamed from: a */
    public static GoingOut m40119a(@NonNull Gson gson, @NonNull String str, @NonNull Class<GoingOut> cls, @Nullable String[] strArr, int i) {
        try {
            return (GoingOut) gson.fromJson(str, cls);
        } catch (Gson gson2) {
            if (strArr != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Reading columnNames: ");
                stringBuilder.append(Arrays.toString(strArr));
                ad.b("GoingOutJsonSyntaxExceptionLog", stringBuilder.toString());
                strArr = new StringBuilder();
                strArr.append("Reading columnIndex: ");
                strArr.append(i);
                ad.b("GoingOutJsonSyntaxExceptionLog", strArr.toString());
            }
            strArr = new StringBuilder();
            strArr.append("Reading json: ");
            strArr.append(str);
            ad.b("GoingOutJsonSyntaxExceptionLog", strArr.toString());
            ad.a("GoingOutJsonSyntaxExceptionLog", gson2);
            return null;
        }
    }
}
