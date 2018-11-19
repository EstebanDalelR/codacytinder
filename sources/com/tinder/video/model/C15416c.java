package com.tinder.video.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\" \u0010\u0006\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00070\b8@X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001e\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00070\b8@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\" \u0010\u000f\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\b8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0012\u001a\u00020\f*\u0004\u0018\u00010\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0015\u001a\u00020\u0001*\u0004\u0018\u00010\u00038@X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, d2 = {"DEFAULT_VIDEO_ASPECT_RATIO", "", "heightWidthAspectRatio", "Lcom/tinder/video/model/VideoViewModel;", "getHeightWidthAspectRatio", "(Lcom/tinder/video/model/VideoViewModel;)F", "highResImage", "Lcom/tinder/video/model/ImageViewModel;", "", "getHighResImage", "(Ljava/util/List;)Lcom/tinder/video/model/ImageViewModel;", "highResImageUrlOrEmpty", "", "getHighResImageUrlOrEmpty", "(Ljava/util/List;)Ljava/lang/String;", "highestResolutionVideo", "getHighestResolutionVideo", "(Ljava/util/List;)Lcom/tinder/video/model/VideoViewModel;", "videoUrl", "getVideoUrl", "(Lcom/tinder/video/model/VideoViewModel;)Ljava/lang/String;", "widthHeightAspectRatio", "getWidthHeightAspectRatio", "video_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.video.model.c */
public final class C15416c {
    @Nullable
    /* renamed from: a */
    public static final C17251d m57800a(@NotNull List<C17251d> list) {
        C2668g.b(list, "$receiver");
        list = list.iterator();
        if (list.hasNext()) {
            Object next = list.next();
            int b = ((C17251d) next).m63165b();
            while (list.hasNext()) {
                Object next2 = list.next();
                int b2 = ((C17251d) next2).m63165b();
                if (b < b2) {
                    next = next2;
                    b = b2;
                }
            }
            list = next;
        } else {
            list = null;
        }
        return (C17251d) list;
    }

    /* renamed from: a */
    public static final float m57799a(@Nullable C17251d c17251d) {
        return (c17251d == null || c17251d.m63164a() <= 0 || c17251d.m63165b() <= 0) ? 1.0f : ((float) c17251d.m63165b()) / ((float) c17251d.m63164a());
    }

    /* renamed from: b */
    public static final float m57801b(@Nullable C17251d c17251d) {
        return (c17251d == null || c17251d.m63164a() <= 0 || c17251d.m63165b() <= 0) ? 1.0f : ((float) c17251d.m63164a()) / ((float) c17251d.m63165b());
    }

    @NotNull
    /* renamed from: c */
    public static final String m57803c(@Nullable C17251d c17251d) {
        c17251d = c17251d != null ? c17251d.m63166c() : null;
        return c17251d != null ? c17251d : "";
    }

    @Nullable
    /* renamed from: b */
    public static final C17250a m57802b(@NotNull List<C17250a> list) {
        C2668g.b(list, "$receiver");
        list = list.iterator();
        if (list.hasNext()) {
            Object next = list.next();
            int a = ((C17250a) next).m63162a();
            while (list.hasNext()) {
                Object next2 = list.next();
                int a2 = ((C17250a) next2).m63162a();
                if (a < a2) {
                    next = next2;
                    a = a2;
                }
            }
            list = next;
        } else {
            list = null;
        }
        return (C17250a) list;
    }

    @NotNull
    /* renamed from: c */
    public static final String m57804c(@NotNull List<C17250a> list) {
        C2668g.b(list, "$receiver");
        list = C15416c.m57802b((List) list);
        list = list != null ? list.m63163b() : null;
        return list != null ? list : "";
    }
}
