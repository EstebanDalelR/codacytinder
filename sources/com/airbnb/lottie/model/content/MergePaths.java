package com.airbnb.lottie.model.content;

import android.support.annotation.Nullable;
import android.util.Log;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4054g;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.layer.C4077a;
import org.json.JSONObject;

public class MergePaths implements ContentModel {
    /* renamed from: a */
    private final String f9240a;
    /* renamed from: b */
    private final MergePathsMode f9241b;

    public enum MergePathsMode {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        private static MergePathsMode forId(int i) {
            switch (i) {
                case 1:
                    return Merge;
                case 2:
                    return Add;
                case 3:
                    return Subtract;
                case 4:
                    return Intersect;
                case 5:
                    return ExcludeIntersections;
                default:
                    return Merge;
            }
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.MergePaths$a */
    static class C0825a {
        /* renamed from: a */
        static MergePaths m2899a(JSONObject jSONObject) {
            return new MergePaths(jSONObject.optString("nm"), MergePathsMode.forId(jSONObject.optInt("mm", 1)));
        }
    }

    private MergePaths(String str, MergePathsMode mergePathsMode) {
        this.f9240a = str;
        this.f9241b = mergePathsMode;
    }

    /* renamed from: a */
    public String m11518a() {
        return this.f9240a;
    }

    /* renamed from: b */
    public MergePathsMode m11519b() {
        return this.f9241b;
    }

    @Nullable
    public Content toContent(C0792d c0792d, C4077a c4077a) {
        if (c0792d.m2838a() != null) {
            return new C4054g(this);
        }
        Log.w("LOTTIE", "Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MergePaths{mode=");
        stringBuilder.append(this.f9241b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
