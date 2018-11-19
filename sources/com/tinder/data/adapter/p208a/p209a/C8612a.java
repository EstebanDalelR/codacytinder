package com.tinder.data.adapter.p208a.p209a;

import com.tinder.data.generated.proto.TinderProto.C14245a;
import com.tinder.data.generated.proto.TinderProto.C14249c;
import com.tinder.data.generated.proto.TinderProto.C14253e;
import com.tinder.data.generated.proto.TinderProto.C14257g;
import com.tinder.data.generated.proto.TinderProto.C14261i;
import com.tinder.data.generated.proto.TinderProto.C14265k;
import com.tinder.data.generated.proto.TinderProto.C14273o;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0000\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\b\u0012\u0004\u0012\u00020\t0\u0001H\u0000\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\b\u0012\u0004\u0012\u00020\f0\u0001H\u0000\u001a\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\b\u0012\u0004\u0012\u00020\u000f0\u0001H\u0000\u001a\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\b\u0012\u0004\u0012\u00020\u00120\u0001H\u0000\u001a\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001*\b\u0012\u0004\u0012\u00020\u00150\u0001H\u0000¨\u0006\u0016"}, d2 = {"toProtoActivityFeedImages", "", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedImage;", "Lcom/tinder/domain/feed/ActivityFeedImage;", "toProtoActivityFeedJobs", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedJob;", "Lcom/tinder/domain/feed/ActivityFeedJob;", "toProtoActivityFeedLoops", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedLoop;", "Lcom/tinder/domain/feed/ActivityFeedLoop;", "toProtoActivityFeedPhotos", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedPhoto;", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "toProtoActivityFeedSchools", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedSchool;", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "toProtoActivityFeedVideos", "Lcom/tinder/data/generated/proto/TinderProto$ActivityFeedVideo;", "Lcom/tinder/domain/feed/ActivityFeedVideo;", "toProtoInstagramMedias", "Lcom/tinder/data/generated/proto/TinderProto$InstagramMedia;", "Lcom/tinder/domain/feed/InstagramMedia;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.adapter.a.a.a */
public final class C8612a {
    @NotNull
    /* renamed from: a */
    public static final List<C14273o> m36736a(@NotNull List<InstagramMedia> list) {
        C2668g.b(list, "$receiver");
        Iterable<InstagramMedia> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (InstagramMedia instagramMedia : iterable) {
            arrayList.add((C14273o) C14273o.m54237a().m54235a(instagramMedia.getId()).m54234a((Iterable) C8612a.m36738c(instagramMedia.getImages())).m54236b(C8612a.m36739d(instagramMedia.getVideos())).build());
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: b */
    public static final List<C14257g> m36737b(@NotNull List<ActivityFeedPhoto> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedPhoto> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedPhoto activityFeedPhoto : iterable) {
            arrayList.add((C14257g) C14257g.m54154a().m54152a(activityFeedPhoto.getId()).m54151a((Iterable) C8612a.m36738c(activityFeedPhoto.getImages())).m54153b(C8612a.m36739d(activityFeedPhoto.getVideos())).build());
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: c */
    public static final List<C14245a> m36738c(@NotNull List<ActivityFeedImage> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedImage> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedImage activityFeedImage : iterable) {
            arrayList.add((C14245a) C14245a.m54096a().m54093a(activityFeedImage.getName()).m54095b(activityFeedImage.getUrl()).m54092a(activityFeedImage.getWidth()).m54094b(activityFeedImage.getHeight()).build());
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: d */
    public static final List<C14265k> m36739d(@NotNull List<ActivityFeedVideo> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedVideo> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedVideo activityFeedVideo : iterable) {
            arrayList.add((C14265k) C14265k.m54195a().m54192a(activityFeedVideo.getName()).m54194b(activityFeedVideo.getUrl()).m54191a(activityFeedVideo.getWidth()).m54193b(activityFeedVideo.getHeight()).build());
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: e */
    public static final List<C14253e> m36740e(@NotNull List<ActivityFeedLoop> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedLoop> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedLoop activityFeedLoop : iterable) {
            arrayList.add((C14253e) C14253e.m54133a().m54131a(activityFeedLoop.getId()).m54130a((Iterable) C8612a.m36738c(activityFeedLoop.getThumbnailImages())).m54132b(C8612a.m36739d(activityFeedLoop.getVideos())).build());
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: f */
    public static final List<C14249c> m36741f(@NotNull List<ActivityFeedJob> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedJob> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedJob activityFeedJob : iterable) {
            arrayList.add((C14249c) C14249c.m54116a().m54114a(activityFeedJob.getCompany()).m54115b(activityFeedJob.getTitle()).build());
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: g */
    public static final List<C14261i> m36742g(@NotNull List<ActivityFeedSchool> list) {
        C2668g.b(list, "$receiver");
        Iterable<ActivityFeedSchool> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (ActivityFeedSchool activityFeedSchool : iterable) {
            arrayList.add((C14261i) C14261i.m54175a().m54172a(activityFeedSchool.getName()).m54173b(activityFeedSchool.getType()).m54174c(activityFeedSchool.getYear()).build());
        }
        return (List) arrayList;
    }
}
