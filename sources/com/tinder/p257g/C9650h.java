package com.tinder.p257g;

import com.tinder.api.ManagerWebServices;
import com.tinder.model.ProcessedVideo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/parse/VideoParser;", "", "()V", "parseProcessedVideos", "", "Lcom/tinder/model/ProcessedVideo;", "jsonObjectPhoto", "Lorg/json/JSONObject;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.g.h */
public final class C9650h {
    /* renamed from: a */
    public static final C9650h f32191a = new C9650h();

    private C9650h() {
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final List<ProcessedVideo> m40055a(@NotNull JSONObject jSONObject) throws JSONException {
        C2668g.b(jSONObject, "jsonObjectPhoto");
        jSONObject = jSONObject.optJSONArray(ManagerWebServices.PARAM_PROCESSED_VIDEOS_CAMEL);
        List<ProcessedVideo> arrayList = new ArrayList();
        if (jSONObject != null) {
            int length = jSONObject.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(i);
                String string = jSONObject2.getString("url");
                int i2 = jSONObject2.getInt("width");
                int i3 = jSONObject2.getInt("height");
                C2668g.a(string, "url");
                arrayList.add(new ProcessedVideo(string, i2, i3));
            }
        }
        return arrayList;
    }
}
