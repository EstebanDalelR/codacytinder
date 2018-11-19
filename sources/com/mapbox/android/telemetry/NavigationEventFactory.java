package com.mapbox.android.telemetry;

import com.mapbox.android.telemetry.Event.Type;
import java.util.HashMap;
import java.util.Map;

public class NavigationEventFactory {
    private static final String NAVIGATION_STATE_ILLEGAL_NULL = "NavigationState cannot be null.";
    private static final String NOT_A_NAVIGATION_EVENT_TYPE = "Type must be a navigation event.";
    private final Map<Type, NavBuildEvent> BUILD_NAV_EVENT = new C57951();

    /* renamed from: com.mapbox.android.telemetry.NavigationEventFactory$1 */
    class C57951 extends HashMap<Type, NavBuildEvent> {

        /* renamed from: com.mapbox.android.telemetry.NavigationEventFactory$1$1 */
        class C70861 implements NavBuildEvent {
            C70861() {
            }

            public Event build(NavigationState navigationState) {
                return NavigationEventFactory.this.buildNavigationArriveEvent(navigationState);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.NavigationEventFactory$1$2 */
        class C70872 implements NavBuildEvent {
            C70872() {
            }

            public Event build(NavigationState navigationState) {
                return NavigationEventFactory.this.buildNavigationDepartEvent(navigationState);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.NavigationEventFactory$1$3 */
        class C70883 implements NavBuildEvent {
            C70883() {
            }

            public Event build(NavigationState navigationState) {
                return NavigationEventFactory.this.buildNavigationCancelEvent(navigationState);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.NavigationEventFactory$1$4 */
        class C70894 implements NavBuildEvent {
            C70894() {
            }

            public Event build(NavigationState navigationState) {
                return NavigationEventFactory.this.buildNavigationFeedbackEvent(navigationState);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.NavigationEventFactory$1$5 */
        class C70905 implements NavBuildEvent {
            C70905() {
            }

            public Event build(NavigationState navigationState) {
                return NavigationEventFactory.this.buildNavigationRerouteEvent(navigationState);
            }
        }

        /* renamed from: com.mapbox.android.telemetry.NavigationEventFactory$1$6 */
        class C70916 implements NavBuildEvent {
            C70916() {
            }

            public Event build(NavigationState navigationState) {
                return NavigationEventFactory.this.buildNavigationFasterRouteEvent(navigationState);
            }
        }

        C57951() {
            put(Type.NAV_ARRIVE, new C70861());
            put(Type.NAV_DEPART, new C70872());
            put(Type.NAV_CANCEL, new C70883());
            put(Type.NAV_FEEDBACK, new C70894());
            put(Type.NAV_REROUTE, new C70905());
            put(Type.NAV_FASTER_ROUTE, new C70916());
        }
    }

    public Event createNavigationEvent(Type type, NavigationState navigationState) {
        check(type, navigationState);
        return ((NavBuildEvent) this.BUILD_NAV_EVENT.get(type)).build(navigationState);
    }

    private NavigationDepartEvent buildNavigationDepartEvent(NavigationState navigationState) {
        return new NavigationDepartEvent(navigationState);
    }

    private NavigationArriveEvent buildNavigationArriveEvent(NavigationState navigationState) {
        return new NavigationArriveEvent(navigationState);
    }

    private NavigationCancelEvent buildNavigationCancelEvent(NavigationState navigationState) {
        return new NavigationCancelEvent(navigationState);
    }

    private NavigationRerouteEvent buildNavigationRerouteEvent(NavigationState navigationState) {
        return new NavigationRerouteEvent(navigationState);
    }

    private NavigationFeedbackEvent buildNavigationFeedbackEvent(NavigationState navigationState) {
        return new NavigationFeedbackEvent(navigationState);
    }

    private NavigationFasterRouteEvent buildNavigationFasterRouteEvent(NavigationState navigationState) {
        return new NavigationFasterRouteEvent(navigationState);
    }

    private void check(Type type, NavigationState navigationState) {
        checkNavigationEvent(type);
        isNotNull(navigationState);
    }

    private void checkNavigationEvent(Type type) {
        if (Event.navigationEventTypes.contains(type) == null) {
            throw new IllegalArgumentException(NOT_A_NAVIGATION_EVENT_TYPE);
        }
    }

    private void isNotNull(NavigationState navigationState) {
        if (navigationState == null) {
            throw new IllegalArgumentException(NAVIGATION_STATE_ILLEGAL_NULL);
        }
    }
}
