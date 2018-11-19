package com.tinder.data.profile.adapter;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.BitmojiIntro;
import com.tinder.domain.profile.model.Tutorial.BitmojiTooltip;
import com.tinder.domain.profile.model.Tutorial.Boost;
import com.tinder.domain.profile.model.Tutorial.BoostReminder;
import com.tinder.domain.profile.model.Tutorial.EditInfoAnimation;
import com.tinder.domain.profile.model.Tutorial.FastMatchIntro;
import com.tinder.domain.profile.model.Tutorial.LoopsFilterVideoTooltip;
import com.tinder.domain.profile.model.Tutorial.LoopsIntro;
import com.tinder.domain.profile.model.Tutorial.LoopsNewMediaSelectorTooltip;
import com.tinder.domain.profile.model.Tutorial.PlacesEditPlaceTooltip;
import com.tinder.domain.profile.model.Tutorial.PlacesOnboarding;
import com.tinder.domain.profile.model.Tutorial.PlacesSwipeNudge;
import com.tinder.domain.profile.model.Tutorial.PlacesToggleTooltip;
import com.tinder.domain.profile.model.Tutorial.ProfileAwarenessMarker;
import com.tinder.domain.profile.model.Tutorial.ProfileVerified;
import com.tinder.domain.profile.model.Tutorial.ReactionsAnnoucement;
import com.tinder.domain.profile.model.Tutorial.ReactionsTooltip;
import com.tinder.domain.profile.model.Tutorial.Select;
import com.tinder.domain.profile.model.Tutorial.SuperlikeAction;
import com.tinder.domain.profile.model.Tutorial.Superlikeable;
import com.tinder.domain.profile.model.Tutorial.TopPicksIntro;
import com.tinder.domain.profile.model.Tutorial.TopPicksTooltip;
import com.tinder.domain.profile.model.Tutorial.WelcomeScreen;
import com.tinder.domain.profile.model.Tutorials;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C15811g;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u001c\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\u0016\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0016\u001a\u00020\u0002R/\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00040\u00078FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/data/profile/adapter/TutorialsAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/profile/model/Tutorials;", "", "", "()V", "tutorialsMap", "", "Lkotlin/reflect/KClass;", "Lcom/tinder/domain/profile/model/Tutorial;", "getTutorialsMap", "()Ljava/util/Map;", "tutorialsMap$delegate", "Lkotlin/Lazy;", "createTutorialsToNameMap", "fromApi", "apiModel", "getApiTutorialName", "tutorial", "getTutorialFrom", "tutorialName", "toApi", "tutorials", "data_release"}, k = 1, mv = {1, 1, 10})
public final class aq extends C2646o<Tutorials, List<? extends String>> {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f35619a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(aq.class), "tutorialsMap", "getTutorialsMap()Ljava/util/Map;"))};
    @NotNull
    /* renamed from: b */
    private final Lazy f35620b = C18451c.a(new TutorialsAdapter$tutorialsMap$2(this));

    @NotNull
    /* renamed from: a */
    public final Map<KClass<? extends Tutorial>, String> m43492a() {
        Lazy lazy = this.f35620b;
        KProperty kProperty = f35619a[0];
        return (Map) lazy.getValue();
    }

    /* renamed from: a */
    public /* synthetic */ Object m43490a(Object obj) {
        return m43493b((List) obj);
    }

    @NotNull
    /* renamed from: b */
    public Tutorials m43493b(@NotNull List<String> list) {
        C2668g.b(list, "apiModel");
        Collection arrayList = new ArrayList();
        for (String a : list) {
            Tutorial a2 = m43486a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new Tutorials((List) arrayList);
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m43491a(@NotNull Tutorials tutorials) {
        C2668g.b(tutorials, ManagerWebServices.PARAM_TUTORIALS);
        Collection arrayList = new ArrayList();
        for (Tutorial a : tutorials.getTutorials()) {
            String a2 = m43487a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    private final String m43487a(Tutorial tutorial) {
        return (String) m43492a().get(C15825i.a(tutorial.getClass()));
    }

    /* renamed from: a */
    private final Tutorial m43486a(String str) {
        for (Object next : m43492a().entrySet()) {
            if (C2668g.a((String) ((Entry) next).getValue(), str)) {
                break;
            }
        }
        Object next2 = null;
        Entry entry = (Entry) next2;
        if (entry == null) {
            return null;
        }
        KClass kClass = (KClass) entry.getKey();
        if (kClass != null) {
            return (Tutorial) kClass.getObjectInstance();
        }
        return null;
    }

    /* renamed from: b */
    private final Map<KClass<? extends Tutorial>, String> m43489b() {
        return ae.a(new Pair[]{C15811g.a(C15825i.a(SuperlikeAction.class), ManagerWebServices.PARAM_TUTORIAL_SUPERLIKE_ACTION_VALUE), C15811g.a(C15825i.a(ProfileVerified.class), ManagerWebServices.PARAM_TUTORIAL_PROFILE_VERIFIED_VALUE), C15811g.a(C15825i.a(Boost.class), "boost_tutorial"), C15811g.a(C15825i.a(BoostReminder.class), "boost_reminder"), C15811g.a(C15825i.a(WelcomeScreen.class), "welcome_screen"), C15811g.a(C15825i.a(Select.class), "select"), C15811g.a(C15825i.a(FastMatchIntro.class), ManagerWebServices.PARAM_TUTORIAL_FAST_MATCH), C15811g.a(C15825i.a(ProfileAwarenessMarker.class), "profile_awareness_marker"), C15811g.a(C15825i.a(EditInfoAnimation.class), "edit_info_animation"), C15811g.a(C15825i.a(ReactionsAnnoucement.class), ManagerWebServices.PARAM_TUTORIAL_REACTIONS_INTRO), C15811g.a(C15825i.a(ReactionsTooltip.class), "reactions_tooltip"), C15811g.a(C15825i.a(Superlikeable.class), "super_likeable"), C15811g.a(C15825i.a(PlacesOnboarding.class), "places_onboarding"), C15811g.a(C15825i.a(PlacesSwipeNudge.class), "places_swipe_tutorial"), C15811g.a(C15825i.a(TopPicksTooltip.class), "top_picks_toggle_tooltip"), C15811g.a(C15825i.a(PlacesToggleTooltip.class), "places_toggle_tooltip"), C15811g.a(C15825i.a(PlacesEditPlaceTooltip.class), "places_edit_place_tooltip"), C15811g.a(C15825i.a(LoopsIntro.class), "loops_intro"), C15811g.a(C15825i.a(LoopsNewMediaSelectorTooltip.class), "loops_new_media_selector"), C15811g.a(C15825i.a(LoopsFilterVideoTooltip.class), "loops_filter_video"), C15811g.a(C15825i.a(TopPicksIntro.class), "top_picks_intro"), C15811g.a(C15825i.a(BitmojiTooltip.class), "bitmoji_tooltip"), C15811g.a(C15825i.a(BitmojiIntro.class), "bitmoji_intro")});
    }
}
