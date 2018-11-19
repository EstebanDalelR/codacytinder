package com.tinder.data.adapter.p208a.p209a;

import com.tinder.data.generated.proto.TinderProto.C14245a;
import com.tinder.data.generated.proto.TinderProto.C14247b;
import com.tinder.data.generated.proto.TinderProto.C14249c;
import com.tinder.data.generated.proto.TinderProto.C14251d;
import com.tinder.data.generated.proto.TinderProto.C14253e;
import com.tinder.data.generated.proto.TinderProto.C14255f;
import com.tinder.data.generated.proto.TinderProto.C14257g;
import com.tinder.data.generated.proto.TinderProto.C14259h;
import com.tinder.data.generated.proto.TinderProto.C14261i;
import com.tinder.data.generated.proto.TinderProto.C14263j;
import com.tinder.data.generated.proto.TinderProto.C14265k;
import com.tinder.data.generated.proto.TinderProto.C14273o;
import com.tinder.data.generated.proto.TinderProto.C14275p;
import com.tinder.domain.feed.ActivityFeedImage;
import com.tinder.domain.feed.ActivityFeedJob;
import com.tinder.domain.feed.ActivityFeedLoop;
import com.tinder.domain.feed.ActivityFeedPhoto;
import com.tinder.domain.feed.ActivityFeedSchool;
import com.tinder.domain.feed.ActivityFeedVideo;
import com.tinder.domain.feed.InstagramMedia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0001H\u0000\u001a\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0000\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\b\u0012\u0004\u0012\u00020\b0\u0001H\u0000\u001a\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0000\u001a\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\b\u0012\u0004\u0012\u00020\f0\u0001H\u0000\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0000\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0000\u001a\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0013H\u0000\u001a\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001*\b\u0012\u0004\u0012\u00020\u00140\u0001H\u0000\u001a\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\b\u0012\u0004\u0012\u00020\u00170\u0001H\u0000\u001a\u0012\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\u00020\u001aH\u0000\u001a\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001*\b\u0012\u0004\u0012\u00020\u001b0\u0001H\u0000¨\u0006\u001c"}, d2 = {"toActivityFeedImages", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedImages;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedImage;", "toActivityFeedJobs", "Lcom/tinder/domain/feed/ActivityFeedJob;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedJobs;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedJob;", "toActivityFeedLoops", "Lcom/tinder/domain/feed/ActivityFeedLoop;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedLoops;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedLoop;", "toActivityFeedPhotos", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedPhotos;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedPhoto;", "toActivityFeedSchools", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedSchools;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedSchool;", "toActivityFeedVideos", "Lcom/tinder/domain/feed/ActivityFeedVideo;", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedVideo;", "toInstagramMedias", "Lcom/tinder/domain/feed/InstagramMedia;", "Lcom/tinder/data/generated/proto/TinderProto$InstagramMedias;", "Lcom/tinder/data/generated/proto/TinderProto$InstagramMedia;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.adapter.a.a.b */
public final class C8613b {
    @NotNull
    /* renamed from: a */
    public static final List<InstagramMedia> m36748a(@NotNull C14275p c14275p) {
        C2668g.b(c14275p, "$receiver");
        List mediasList = c14275p.getMediasList();
        C2668g.a(mediasList, "mediasList");
        return C8613b.m36749a(mediasList);
    }

    @NotNull
    /* renamed from: a */
    public static final List<InstagramMedia> m36749a(@NotNull List<C14273o> list) {
        C2668g.b(list, "$receiver");
        Iterable<C14273o> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14273o c14273o : iterable) {
            String id = c14273o.getId();
            C2668g.a(id, "it.id");
            List imagesList = c14273o.getImagesList();
            C2668g.a(imagesList, "it.imagesList");
            imagesList = C8613b.m36751c(imagesList);
            List videosList = c14273o.getVideosList();
            C2668g.a(videosList, "it.videosList");
            arrayList.add(new InstagramMedia(id, imagesList, C8613b.m36752d(videosList)));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final List<ActivityFeedPhoto> m36746a(@NotNull C14259h c14259h) {
        C2668g.b(c14259h, "$receiver");
        c14259h = c14259h.getPhotosList();
        C2668g.a(c14259h, "photosList");
        return C8613b.m36750b(c14259h);
    }

    @NotNull
    /* renamed from: b */
    public static final List<ActivityFeedPhoto> m36750b(@NotNull List<C14257g> list) {
        C2668g.b(list, "$receiver");
        Iterable<C14257g> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14257g c14257g : iterable) {
            String id = c14257g.getId();
            C2668g.a(id, "it.id");
            List imagesList = c14257g.getImagesList();
            C2668g.a(imagesList, "it.imagesList");
            imagesList = C8613b.m36751c(imagesList);
            List videosList = c14257g.getVideosList();
            C2668g.a(videosList, "it.videosList");
            arrayList.add(new ActivityFeedPhoto(id, imagesList, C8613b.m36752d(videosList)));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final List<ActivityFeedImage> m36743a(@NotNull C14247b c14247b) {
        C2668g.b(c14247b, "$receiver");
        c14247b = c14247b.getImagesList();
        C2668g.a(c14247b, "imagesList");
        return C8613b.m36751c(c14247b);
    }

    @NotNull
    /* renamed from: c */
    public static final List<ActivityFeedImage> m36751c(@NotNull List<C14245a> list) {
        C2668g.b(list, "$receiver");
        Iterable<C14245a> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14245a c14245a : iterable) {
            String name = c14245a.getName();
            if (name == null) {
                name = "";
            }
            String url = c14245a.getUrl();
            if (url == null) {
                url = "";
            }
            arrayList.add(new ActivityFeedImage(c14245a.getWidth(), c14245a.getHeight(), url, name));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: d */
    public static final List<ActivityFeedVideo> m36752d(@NotNull List<C14265k> list) {
        C2668g.b(list, "$receiver");
        Iterable<C14265k> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14265k c14265k : iterable) {
            String name = c14265k.getName();
            if (name == null) {
                name = "";
            }
            String url = c14265k.getUrl();
            if (url == null) {
                url = "";
            }
            arrayList.add(new ActivityFeedVideo(c14265k.getWidth(), c14265k.getHeight(), url, name));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final List<ActivityFeedLoop> m36745a(@NotNull C14255f c14255f) {
        C2668g.b(c14255f, "$receiver");
        c14255f = c14255f.getLoopsList();
        C2668g.a(c14255f, "loopsList");
        return C8613b.m36753e(c14255f);
    }

    @NotNull
    /* renamed from: e */
    public static final List<ActivityFeedLoop> m36753e(@NotNull List<C14253e> list) {
        C2668g.b(list, "$receiver");
        Iterable<C14253e> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14253e c14253e : iterable) {
            String id = c14253e.getId();
            C2668g.a(id, "it.id");
            List thumbnailImagesList = c14253e.getThumbnailImagesList();
            C2668g.a(thumbnailImagesList, "it.thumbnailImagesList");
            thumbnailImagesList = C8613b.m36751c(thumbnailImagesList);
            List videosList = c14253e.getVideosList();
            C2668g.a(videosList, "it.videosList");
            arrayList.add(new ActivityFeedLoop(id, thumbnailImagesList, C8613b.m36752d(videosList)));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final List<ActivityFeedJob> m36744a(@NotNull C14251d c14251d) {
        C2668g.b(c14251d, "$receiver");
        c14251d = c14251d.getJobList();
        C2668g.a(c14251d, "jobList");
        return C8613b.m36754f(c14251d);
    }

    @NotNull
    /* renamed from: f */
    public static final List<ActivityFeedJob> m36754f(@NotNull List<C14249c> list) {
        C2668g.b(list, "$receiver");
        Iterable<C14249c> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14249c c14249c : iterable) {
            String title = c14249c.getTitle();
            C2668g.a(title, "it.title");
            String company = c14249c.getCompany();
            C2668g.a(company, "it.company");
            arrayList.add(new ActivityFeedJob(company, title));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: a */
    public static final List<ActivityFeedSchool> m36747a(@NotNull C14263j c14263j) {
        C2668g.b(c14263j, "$receiver");
        c14263j = c14263j.getSchoolsList();
        C2668g.a(c14263j, "schoolsList");
        return C8613b.m36755g(c14263j);
    }

    @NotNull
    /* renamed from: g */
    public static final List<ActivityFeedSchool> m36755g(@NotNull List<C14261i> list) {
        C2668g.b(list, "$receiver");
        Iterable<C14261i> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (C14261i c14261i : iterable) {
            String name = c14261i.getName();
            C2668g.a(name, "it.name");
            String type = c14261i.getType();
            C2668g.a(type, "it.type");
            String year = c14261i.getYear();
            C2668g.a(year, "it.year");
            arrayList.add(new ActivityFeedSchool(name, type, year));
        }
        return (List) arrayList;
    }
}
