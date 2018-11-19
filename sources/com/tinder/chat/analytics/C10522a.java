package com.tinder.chat.analytics;

import com.tinder.analytics.chat.Origin;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.utils.StringLinkDetector;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.message.Message;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.typingindicator.TypingIndicatorConfig.Config;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.etl.event.C11263do;
import com.tinder.etl.event.C11263do.C9052a;
import com.tinder.etl.event.cw;
import com.tinder.etl.event.cw.C9016a;
import com.tinder.etl.event.cx;
import com.tinder.etl.event.cx.C9018a;
import com.tinder.etl.event.cy;
import com.tinder.etl.event.cy.C9020a;
import com.tinder.etl.event.da;
import com.tinder.etl.event.da.C9024a;
import com.tinder.etl.event.db;
import com.tinder.etl.event.db.C9026a;
import com.tinder.etl.event.dc;
import com.tinder.etl.event.dc.C9028a;
import com.tinder.etl.event.dd;
import com.tinder.etl.event.dd.C9030a;
import com.tinder.etl.event.de;
import com.tinder.etl.event.de.C9032a;
import com.tinder.etl.event.df;
import com.tinder.etl.event.df.C9034a;
import com.tinder.etl.event.dh;
import com.tinder.etl.event.dh.C9038a;
import com.tinder.etl.event.dk;
import com.tinder.etl.event.dk.C9044a;
import com.tinder.etl.event.dl;
import com.tinder.etl.event.dl.C9046a;
import com.tinder.etl.event.dm;
import com.tinder.etl.event.dm.C9048a;
import com.tinder.etl.event.dn;
import com.tinder.etl.event.dn.C9050a;
import com.tinder.etl.event.dp;
import com.tinder.etl.event.dp.C9054a;
import com.tinder.etl.event.dq;
import com.tinder.etl.event.dq.C9056a;
import com.tinder.etl.event.dr;
import com.tinder.etl.event.dr.C9058a;
import com.tinder.etl.event.ds;
import com.tinder.etl.event.ds.C9060a;
import com.tinder.etl.event.dt;
import com.tinder.etl.event.dt.C9062a;
import com.tinder.etl.event.dv;
import com.tinder.etl.event.dv.C9066a;
import com.tinder.etl.event.hl;
import com.tinder.etl.event.hl.C9104a;
import com.tinder.etl.event.hm;
import com.tinder.etl.event.hm.C9106a;
import com.tinder.etl.event.hn;
import com.tinder.etl.event.hn.C9108a;
import com.tinder.etl.event.ho;
import com.tinder.etl.event.ho.C9110a;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.typingindicator.model.TypingType;
import com.tinder.typingindicator.model.TypingType.C17161a;
import com.tinder.typingindicator.model.TypingType.C17162b;
import com.tinder.typingindicator.model.TypingType.C17163c;
import com.tinder.typingindicator.model.TypingType.Hide;
import com.tinder.typingindicator.usecase.C17174d;
import com.tinder.typingindicator.usecase.TypingIndicatorEventFactory;
import io.reactivex.C3958c;
import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import rx.Observable;
import rx.Single;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eJ$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000eJ\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001a2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eJ$\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*JH\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJH\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJP\u00105\u001a\b\u0012\u0004\u0012\u0002060\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00107\u001a\u00020\u000e2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJD\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000eJH\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJ$\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020*J\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000eJ.\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u000e2\b\u0010K\u001a\u0004\u0018\u00010\u000e2\u0006\u0010L\u001a\u00020*JN\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010O\u001a\u0004\u0018\u00010P2\u0006\u00107\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020*JH\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJH\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJX\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020*2\u0006\u0010Q\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJ\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eJ,\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020`JP\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020 2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010c\u001a\u00020d2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000eJ\u0014\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\u001a2\u0006\u0010\u0014\u001a\u00020\u000eJ\u001e\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J,\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020 2\u0006\u0010l\u001a\u00020(J\u0014\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u001a2\u0006\u0010\u0014\u001a\u00020\u000eJ4\u0010o\u001a\b\u0012\u0004\u0012\u00020p0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010q\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020 J4\u0010s\u001a\b\u0012\u0004\u0012\u00020t0\u001a2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010q\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u000e2\u0006\u0010u\u001a\u00020 J$\u0010v\u001a\b\u0012\u0004\u0012\u00020x0w2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0w2\u0006\u0010z\u001a\u00020*H\u0002J\u0010\u0010{\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010|\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010}\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010~\u001a\u00020\u000e2\u0006\u0010\u001a\u00020\u000e2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0w2\b\b\u0002\u0010z\u001a\u00020*H\u0002J6\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u00012\u0006\u0010\u001a\u00020\u000e2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0w2\b\b\u0002\u0010z\u001a\u00020*H\u0002J\u0011\u0010\u0001\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0011\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002JH\u0010\u0001\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0005\u0012\u00030\u00010\u0001j\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0005\u0012\u00030\u0001`\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0007\u0010\u001a\u00030\u00012\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0wH\u0002J \u0010\u0001\u001a\u00020 2\u0006\u0010Q\u001a\u00020*2\u0007\u0010\u0001\u001a\u00020 H\u0000¢\u0006\u0003\b\u0001J*\u0010\u0001\u001a\u00020P2\u0006\u0010\u001f\u001a\u00020 2\u0007\u0010\u0001\u001a\u00020 2\b\b\u0002\u0010Q\u001a\u00020*H\u0000¢\u0006\u0003\b\u0001J\u0012\u0010\u0001\u001a\u00020 2\u0007\u0010\u0001\u001a\u00020`H\u0002J\u0018\u0010\u0001\u001a\u00030\u0001*\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u0016H\u0002J\u0017\u0010\u0001\u001a\u00030\u0001*\u00030\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/tinder/chat/analytics/ChatAnalyticsFactory;", "Lcom/tinder/typingindicator/usecase/TypingIndicatorEventFactory;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "getMatch", "Lcom/tinder/domain/match/usecase/GetMatch;", "userGateway", "Lcom/tinder/domain/meta/gateway/MetaGateway;", "stringLinkDetector", "Lcom/tinder/common/utils/StringLinkDetector;", "getTypingIndicatorConfig", "Lcom/tinder/typingindicator/usecase/GetTypingIndicatorConfig;", "(Lcom/tinder/domain/message/MessageRepository;Lcom/tinder/domain/match/usecase/GetMatch;Lcom/tinder/domain/meta/gateway/MetaGateway;Lcom/tinder/common/utils/StringLinkDetector;Lcom/tinder/typingindicator/usecase/GetTypingIndicatorConfig;)V", "badgeType", "", "match", "Lcom/tinder/domain/match/model/Match;", "buildChatTypingEventWithConfig", "Lio/reactivex/Maybe;", "Lcom/tinder/etl/event/ChatTypingEvent;", "matchId", "type", "Lcom/tinder/typingindicator/model/TypingType;", "config", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$Config;", "createChatBlockEvent", "Lrx/Single;", "Lcom/tinder/etl/event/ChatBlockEvent;", "reportReason", "createChatCancelSendErrorOptionEvent", "Lcom/tinder/etl/event/ChatCancelSendErrorOptionEvent;", "messageIndex", "", "buttonType", "createChatClientUnifiedEvent", "Lcom/tinder/etl/event/ClientUnifiedEventEvent;", "redShiftMapping", "createChatEndEvent", "Lcom/tinder/etl/event/ChatEndEvent;", "durationMs", "", "hasUnsentMessage", "", "createChatLikeEvent", "Lcom/tinder/etl/event/ChatLikeEvent;", "messageType", "messageText", "contentId", "contentSource", "contentUrl", "createChatLongPressMessageEvent", "Lcom/tinder/etl/event/ChatLongPressMessageEvent;", "message", "createChatLongPressOptionEvent", "Lcom/tinder/etl/event/ChatLongPressOptionEvent;", "button", "createChatMediaUnavailableEvent", "Lcom/tinder/etl/event/ChatMediaUnavailableEvent;", "mediaId", "mediaType", "Lcom/tinder/chat/analytics/MediaType;", "url", "createChatMessageDeleteEvent", "Lcom/tinder/etl/event/ChatDeleteMessageEvent;", "createChatOpenEvent", "Lcom/tinder/etl/event/ChatOpenEvent;", "origin", "Lcom/tinder/analytics/chat/Origin;", "isBitmojiConnected", "createChatOpenProfileEvent", "Lcom/tinder/etl/event/ChatOpenProfileEvent;", "openProfileFrom", "createChatReportEvent", "Lcom/tinder/etl/event/ChatReportEvent;", "reason", "other", "blocked", "createChatSelectSendErrorOptionsEvent", "Lcom/tinder/etl/event/ChatSelectSendErrorOptionsEvent;", "position", "", "isFeedComment", "createChatSendErrorEvent", "Lcom/tinder/etl/event/ChatSendMessageErrorEvent;", "createChatSendErrorOptionsEvent", "Lcom/tinder/etl/event/ChatSendErrorOptionsEvent;", "createChatSendMessageEvent", "Lcom/tinder/etl/event/ChatSendMessageEvent;", "sendFrom", "isRetry", "createChatTapInputTypeEvent", "Lcom/tinder/etl/event/ChatTapInputTypeEvent;", "createChatTapLinkEvent", "Lrx/Observable;", "Lcom/tinder/etl/event/ChatTapLinkEvent;", "messageSentDate", "Lorg/joda/time/DateTime;", "createChatTapMessageEvent", "Lcom/tinder/etl/event/ChatTapMessageEvent;", "messageAction", "Lcom/tinder/chat/analytics/MessageAction;", "createChatTapTextInputEvent", "Lcom/tinder/etl/event/ChatTapTextInputEvent;", "createChatTypingEvent", "createGifSearchEvent", "Lcom/tinder/etl/event/GIFSearchEvent;", "query", "gifCount", "searchDurationMs", "createGifSearchHideEvent", "Lcom/tinder/etl/event/GIFSearchHideEvent;", "createGifSelectEvent", "Lcom/tinder/etl/event/GIFSelectEvent;", "gifId", "gifUrl", "createGifShownEvent", "Lcom/tinder/etl/event/GIFShownEvent;", "gifPosition", "filterMessagesList", "", "Lcom/tinder/domain/message/Message;", "messages", "excludeLastMsg", "getAttributionValue", "hasMatchSuperLiked", "hasMeSuperLiked", "lastMessageFrom", "me", "messagesFromMeOrOtherCount", "Lkotlin/Pair;", "minutesSinceMatch", "otherId", "placeIdFromMatch", "prepareCommonPayload", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Lcom/tinder/domain/meta/model/CurrentUser;", "resolveIndexAsLastMessage", "totalMessageCount", "resolveIndexAsLastMessage$Tinder_release", "resolveMessageIndex", "resolveMessageIndex$Tinder_release", "secondsPassedSinceDateTime", "sentDate", "applyChatTypingType", "Lcom/tinder/etl/event/ChatTypingEvent$Builder;", "typingType", "applyTypingIndicatorConfig", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.analytics.a */
public final class C10522a implements TypingIndicatorEventFactory {
    /* renamed from: a */
    public static final C8414a f34208a = new C8414a();
    /* renamed from: b */
    private final MessageRepository f34209b;
    /* renamed from: c */
    private final GetMatch f34210c;
    /* renamed from: d */
    private final MetaGateway f34211d;
    /* renamed from: e */
    private final StringLinkDetector f34212e;
    /* renamed from: f */
    private final C17174d f34213f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/chat/analytics/ChatAnalyticsFactory$Companion;", "", "()V", "FIELD_MESSAGE_EMPTY", "", "FIELD_MESSAGE_FROM_OTHER", "FIELD_MESSAGE_FROM_SELF", "FIELD_NS_ACTION_CLOSE", "FIELD_NS_ACTION_MORE_OPTIONS", "FIELD_NS_PAGE_CHAT", "FIELD_NS_SECTION_NAV", "KEY_LAST_MESSAGE_FROM", "KEY_MATCH_ID", "KEY_MATCH_SUPERLIKED_USER", "KEY_MATCH_TYPE", "KEY_NUM_MESSAGES_ME", "KEY_NUM_MESSAGES_OTHER", "KEY_OTHER_ID", "KEY_USER_SUPERLIKED_MATCH", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$a */
    public static final class C8414a {
        private C8414a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/tinder/etl/event/ChatTypingEvent;", "it", "Lcom/tinder/domain/typingindicator/TypingIndicatorConfig$Config;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$y */
    static final class C10521y<T, R> implements Function<T, MaybeSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C10522a f34205a;
        /* renamed from: b */
        final /* synthetic */ String f34206b;
        /* renamed from: c */
        final /* synthetic */ TypingType f34207c;

        C10521y(C10522a c10522a, String str, TypingType typingType) {
            this.f34205a = c10522a;
            this.f34206b = str;
            this.f34207c = typingType;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m42502a((Config) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3958c<dt> m42502a(@NotNull Config config) {
            C2668g.b(config, "it");
            return this.f34205a.m42512a(this.f34206b, this.f34207c, config);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GIFSearchHideEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$aa */
    static final class aa<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40790a;
        /* renamed from: b */
        final /* synthetic */ String f40791b;

        aa(C10522a c10522a, String str) {
            this.f40790a = c10522a;
            this.f40791b = str;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49925a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final hm m49925a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40790a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9106a c = hm.m45267a().m38343b(this.f40791b).m38344c("solo");
            C10522a c10522a2 = this.f40790a;
            C2668g.a(match, "match");
            optional = c.m38345d(c10522a2.m42515a(match)).m38339a((Number) Integer.valueOf(intValue)).m38342b((Number) Integer.valueOf(intValue2));
            c10522a = this.f40790a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            return optional.m38340a(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m38341a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GIFSelectEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$ab */
    static final class ab<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40792a;
        /* renamed from: b */
        final /* synthetic */ String f40793b;
        /* renamed from: c */
        final /* synthetic */ String f40794c;
        /* renamed from: d */
        final /* synthetic */ String f40795d;
        /* renamed from: e */
        final /* synthetic */ String f40796e;
        /* renamed from: f */
        final /* synthetic */ int f40797f;

        ab(C10522a c10522a, String str, String str2, String str3, String str4, int i) {
            this.f40792a = c10522a;
            this.f40793b = str;
            this.f40794c = str2;
            this.f40795d = str3;
            this.f40796e = str4;
            this.f40797f = i;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49926a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final hn m49926a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40792a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9108a f = hn.m45282a().m38354e(this.f40793b).m38355f("solo");
            C10522a c10522a2 = this.f40792a;
            C2668g.a(match, "match");
            optional = f.m38356g(c10522a2.m42515a(match)).m38349b((Number) Integer.valueOf(intValue)).m38351c((Number) Integer.valueOf(intValue2));
            c10522a = this.f40792a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            return optional.m38353d(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m38350b(this.f40794c).m38347a(this.f40795d).m38352c(this.f40796e).m38346a((Number) Integer.valueOf(this.f40797f)).m38348a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GIFShownEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$ac */
    static final class ac<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40798a;
        /* renamed from: b */
        final /* synthetic */ String f40799b;
        /* renamed from: c */
        final /* synthetic */ String f40800c;
        /* renamed from: d */
        final /* synthetic */ String f40801d;
        /* renamed from: e */
        final /* synthetic */ String f40802e;
        /* renamed from: f */
        final /* synthetic */ int f40803f;

        ac(C10522a c10522a, String str, String str2, String str3, String str4, int i) {
            this.f40798a = c10522a;
            this.f40799b = str;
            this.f40800c = str2;
            this.f40801d = str3;
            this.f40802e = str4;
            this.f40803f = i;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49927a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final ho m49927a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40798a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9110a f = ho.m45305a().m38365e(this.f40799b).m38366f("solo");
            C10522a c10522a2 = this.f40798a;
            C2668g.a(match, "match");
            optional = f.m38367g(c10522a2.m42515a(match)).m38360b((Number) Integer.valueOf(intValue)).m38362c((Number) Integer.valueOf(intValue2));
            c10522a = this.f40798a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            return optional.m38364d(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m38361b(this.f40800c).m38358a(this.f40801d).m38363c(this.f40802e).m38357a((Number) Integer.valueOf(this.f40803f)).m38359a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatTypingEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$b */
    static final class C12653b<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40804a;
        /* renamed from: b */
        final /* synthetic */ String f40805b;
        /* renamed from: c */
        final /* synthetic */ Config f40806c;
        /* renamed from: d */
        final /* synthetic */ TypingType f40807d;

        C12653b(C10522a c10522a, String str, Config config, TypingType typingType) {
            this.f40804a = c10522a;
            this.f40805b = str;
            this.f40806c = config;
            this.f40807d = typingType;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49928a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dt m49928a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40804a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C10522a c10522a2 = this.f40804a;
            C10522a c10522a3 = this.f40804a;
            C9062a b2 = dt.m44939a().m38193b(this.f40805b);
            C10522a c10522a4 = this.f40804a;
            C2668g.a(match, "match");
            optional = b2.m38195c(c10522a4.m42515a(match)).m38194c((Number) Integer.valueOf(intValue)).m38196d((Number) Integer.valueOf(intValue2));
            C10522a c10522a5 = this.f40804a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            C9062a a = optional.m38190a(C10522a.m42514a(c10522a5, id2, (List) list, false, 4, null));
            C2668g.a(a, "ChatTypingEvent.builder(…eFrom(me.id(), messages))");
            return c10522a2.m42510a(c10522a3.m42509a(a, this.f40806c), this.f40807d).m38191a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatBlockEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$c */
    static final class C12654c<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40808a;
        /* renamed from: b */
        final /* synthetic */ String f40809b;
        /* renamed from: c */
        final /* synthetic */ String f40810c;

        C12654c(C10522a c10522a, String str, String str2) {
            this.f40808a = c10522a;
            this.f40809b = str;
            this.f40810c = str2;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49929a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final cw m49929a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40808a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9016a c = cw.m44391a().m37944b(this.f40809b).m37945c("solo");
            C10522a c10522a2 = this.f40808a;
            C2668g.a(match, "match");
            optional = c.m37946d(c10522a2.m42515a(match)).m37940a((Number) Integer.valueOf(intValue)).m37943b((Number) Integer.valueOf(intValue2));
            c10522a = this.f40808a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            return optional.m37941a(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m37947e(this.f40810c).m37942a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatCancelSendErrorOptionEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$d */
    static final class C12655d<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40811a;
        /* renamed from: b */
        final /* synthetic */ String f40812b;
        /* renamed from: c */
        final /* synthetic */ int f40813c;
        /* renamed from: d */
        final /* synthetic */ String f40814d;

        C12655d(C10522a c10522a, String str, int i, String str2) {
            this.f40811a = c10522a;
            this.f40812b = str;
            this.f40813c = i;
            this.f40814d = str2;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m49930a((Optional) obj, (List) obj2);
        }

        /* renamed from: a */
        public final cx m49930a(Optional<Match> optional, List<? extends Message> list) {
            Match match = (Match) optional.b();
            C9018a c = cx.m44408a().m37951b(this.f40812b).m37952c("solo");
            C10522a c10522a = this.f40811a;
            C2668g.a(match, "match");
            return c.m37953d(c10522a.m42515a(match)).m37948a(C10522a.m42513a(this.f40811a, this.f40813c, list.size(), false, 4, null)).m37949a(this.f40814d).m37950a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ClientUnifiedEventEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$e */
    static final class C12656e<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40815a;
        /* renamed from: b */
        final /* synthetic */ String f40816b;

        C12656e(C10522a c10522a, String str) {
            this.f40815a = c10522a;
            this.f40816b = str;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49931a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dv m49931a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C9066a a = dv.m44984a();
            C10522a c10522a = this.f40815a;
            C2668g.a(match, "match");
            C2668g.a(currentUser, "me");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            optional = c10522a.m42518a(match, currentUser, (List) list);
            list = this.f40816b;
            currentUser = list.hashCode();
            if (currentUser != -1332022703) {
                if (currentUser == 1223655234) {
                    if (list.equals("chat_moreoptions") != null) {
                        a.m38214c("moreOptions");
                    }
                }
            } else if (list.equals("chat_close") != null) {
                a.m38214c("close");
            }
            return a.m38210a("chat").m38213b("nav").m38211a((Map) optional).m38212a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatEndEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$f */
    static final class C12657f<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40817a;
        /* renamed from: b */
        final /* synthetic */ String f40818b;
        /* renamed from: c */
        final /* synthetic */ long f40819c;
        /* renamed from: d */
        final /* synthetic */ boolean f40820d;

        C12657f(C10522a c10522a, String str, long j, boolean z) {
            this.f40817a = c10522a;
            this.f40818b = str;
            this.f40819c = j;
            this.f40820d = z;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49932a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final da m49932a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40817a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9024a a = da.m44455a();
            C10522a c10522a2 = this.f40817a;
            C2668g.a(match, "match");
            optional = a.m37980d(c10522a2.m42515a(match)).m37977c(Boolean.valueOf(this.f40817a.m42525b(match))).m37970a(Boolean.valueOf(this.f40817a.m42527c(match))).m37976b(this.f40818b).m37979c("solo").m37978c((Number) Integer.valueOf(intValue)).m37975b((Number) Integer.valueOf(intValue2));
            c10522a = this.f40817a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            return optional.m37972a(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m37971a((Number) Long.valueOf(this.f40819c)).m37974b(Boolean.valueOf(this.f40820d)).m37973a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatLikeEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$g */
    static final class C12658g<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40821a;
        /* renamed from: b */
        final /* synthetic */ String f40822b;
        /* renamed from: c */
        final /* synthetic */ int f40823c;
        /* renamed from: d */
        final /* synthetic */ String f40824d;
        /* renamed from: e */
        final /* synthetic */ String f40825e;
        /* renamed from: f */
        final /* synthetic */ int f40826f;
        /* renamed from: g */
        final /* synthetic */ String f40827g;
        /* renamed from: h */
        final /* synthetic */ String f40828h;

        C12658g(C10522a c10522a, String str, int i, String str2, String str3, int i2, String str4, String str5) {
            this.f40821a = c10522a;
            this.f40822b = str;
            this.f40823c = i;
            this.f40824d = str2;
            this.f40825e = str3;
            this.f40826f = i2;
            this.f40827g = str4;
            this.f40828h = str5;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49933a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final db m49933a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40821a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            currentUser = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) currentUser.c()).intValue();
            currentUser = ((Number) currentUser.d()).intValue();
            C9026a e = db.m44478a().m37989d(this.f40822b).m37990e("solo");
            C10522a c10522a2 = this.f40821a;
            C2668g.a(match, "match");
            optional = e.m37992g(c10522a2.m42515a(match)).m37986c((Number) Integer.valueOf(intValue)).m37988d((Number) Integer.valueOf(currentUser)).m37984b((Number) Integer.valueOf(this.f40823c)).m37991f(this.f40824d).m37982a(this.f40825e).m37981a(C10522a.m42513a(this.f40821a, this.f40826f, list.size(), false, 4, null));
            String str = this.f40827g;
            if (str != null) {
                optional.m37985b(str);
            }
            str = this.f40828h;
            if (str != null) {
                optional.m37987c(str);
            }
            return optional.m37983a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatLongPressMessageEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$h */
    static final class C12659h<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40829a;
        /* renamed from: b */
        final /* synthetic */ String f40830b;
        /* renamed from: c */
        final /* synthetic */ int f40831c;
        /* renamed from: d */
        final /* synthetic */ String f40832d;
        /* renamed from: e */
        final /* synthetic */ String f40833e;
        /* renamed from: f */
        final /* synthetic */ int f40834f;
        /* renamed from: g */
        final /* synthetic */ String f40835g;
        /* renamed from: h */
        final /* synthetic */ String f40836h;

        C12659h(C10522a c10522a, String str, int i, String str2, String str3, int i2, String str4, String str5) {
            this.f40829a = c10522a;
            this.f40830b = str;
            this.f40831c = i;
            this.f40832d = str2;
            this.f40833e = str3;
            this.f40834f = i2;
            this.f40835g = str4;
            this.f40836h = str5;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49934a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dc m49934a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40829a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            currentUser = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) currentUser.c()).intValue();
            currentUser = ((Number) currentUser.d()).intValue();
            C9028a e = dc.m44503a().m38001d(this.f40830b).m38002e("solo");
            C10522a c10522a2 = this.f40829a;
            C2668g.a(match, "match");
            optional = e.m38004g(c10522a2.m42515a(match)).m37998c((Number) Integer.valueOf(intValue)).m38000d((Number) Integer.valueOf(currentUser)).m37996b((Number) Integer.valueOf(this.f40831c)).m38003f(this.f40832d).m37994a(this.f40833e).m37993a(C10522a.m42513a(this.f40829a, this.f40834f, list.size(), false, 4, null));
            String str = this.f40835g;
            if (str != null) {
                optional.m37997b(str);
            }
            str = this.f40836h;
            if (str != null) {
                optional.m37999c(str);
            }
            return optional.m37995a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatLongPressOptionEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$i */
    static final class C12660i<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40837a;
        /* renamed from: b */
        final /* synthetic */ String f40838b;
        /* renamed from: c */
        final /* synthetic */ int f40839c;
        /* renamed from: d */
        final /* synthetic */ String f40840d;
        /* renamed from: e */
        final /* synthetic */ String f40841e;
        /* renamed from: f */
        final /* synthetic */ int f40842f;
        /* renamed from: g */
        final /* synthetic */ String f40843g;
        /* renamed from: h */
        final /* synthetic */ String f40844h;
        /* renamed from: i */
        final /* synthetic */ String f40845i;

        C12660i(C10522a c10522a, String str, int i, String str2, String str3, int i2, String str4, String str5, String str6) {
            this.f40837a = c10522a;
            this.f40838b = str;
            this.f40839c = i;
            this.f40840d = str2;
            this.f40841e = str3;
            this.f40842f = i2;
            this.f40843g = str4;
            this.f40844h = str5;
            this.f40845i = str6;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49935a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dd m49935a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40837a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            currentUser = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) currentUser.c()).intValue();
            currentUser = ((Number) currentUser.d()).intValue();
            C9030a f = dd.m44528a().m38014e(this.f40838b).m38015f("solo");
            C10522a c10522a2 = this.f40837a;
            C2668g.a(match, "match");
            optional = f.m38017h(c10522a2.m42515a(match)).m38010c((Number) Integer.valueOf(intValue)).m38012d((Number) Integer.valueOf(currentUser)).m38008b((Number) Integer.valueOf(this.f40839c)).m38016g(this.f40840d).m38009b(this.f40841e).m38005a(C10522a.m42513a(this.f40837a, this.f40842f, list.size(), false, 4, null)).m38006a(this.f40843g);
            String str = this.f40844h;
            if (str != null) {
                optional.m38011c(str);
            }
            str = this.f40845i;
            if (str != null) {
                optional.m38013d(str);
            }
            return optional.m38007a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatMediaUnavailableEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$j */
    static final class C12661j<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40846a;
        /* renamed from: b */
        final /* synthetic */ String f40847b;
        /* renamed from: c */
        final /* synthetic */ MediaType f40848c;
        /* renamed from: d */
        final /* synthetic */ String f40849d;
        /* renamed from: e */
        final /* synthetic */ String f40850e;
        /* renamed from: f */
        final /* synthetic */ String f40851f;
        /* renamed from: g */
        final /* synthetic */ String f40852g;
        /* renamed from: h */
        final /* synthetic */ int f40853h;

        C12661j(C10522a c10522a, String str, MediaType mediaType, String str2, String str3, String str4, String str5, int i) {
            this.f40846a = c10522a;
            this.f40847b = str;
            this.f40848c = mediaType;
            this.f40849d = str2;
            this.f40850e = str3;
            this.f40851f = str4;
            this.f40852g = str5;
            this.f40853h = i;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49936a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final de m49936a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40846a;
            String id = currentUser.id();
            C2668g.a(id, "currentUser.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            currentUser = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) currentUser.c()).intValue();
            currentUser = ((Number) currentUser.d()).intValue();
            C9032a b = de.m44555a().m38028d("solo").m38026c(this.f40847b).m38031g(this.f40848c.getAnalyticsValue()).m38032h(this.f40849d).m38024b(this.f40850e);
            C10522a c10522a2 = this.f40846a;
            C2668g.a(match, "match");
            return b.m38030f(c10522a2.m42515a(match)).m38025c((Number) Integer.valueOf(intValue)).m38027d((Number) Integer.valueOf(currentUser)).m38022b(Boolean.valueOf(this.f40846a.m42525b(match))).m38018a(Boolean.valueOf(this.f40846a.m42527c(match))).m38023b((Number) Integer.valueOf(3)).m38029e(this.f40851f).m38020a(this.f40852g).m38019a(C10522a.m42513a(this.f40846a, this.f40853h, list.size(), false, 4, null)).m38021a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatDeleteMessageEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$k */
    static final class C12662k<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40854a;
        /* renamed from: b */
        final /* synthetic */ String f40855b;
        /* renamed from: c */
        final /* synthetic */ int f40856c;
        /* renamed from: d */
        final /* synthetic */ String f40857d;
        /* renamed from: e */
        final /* synthetic */ String f40858e;
        /* renamed from: f */
        final /* synthetic */ int f40859f;
        /* renamed from: g */
        final /* synthetic */ String f40860g;
        /* renamed from: h */
        final /* synthetic */ String f40861h;

        C12662k(C10522a c10522a, String str, int i, String str2, String str3, int i2, String str4, String str5) {
            this.f40854a = c10522a;
            this.f40855b = str;
            this.f40856c = i;
            this.f40857d = str2;
            this.f40858e = str3;
            this.f40859f = i2;
            this.f40860g = str4;
            this.f40861h = str5;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49937a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final cy m49937a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40854a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9020a f = cy.m44421a().m37965e(this.f40855b).m37966f("solo");
            C10522a c10522a2 = this.f40854a;
            C2668g.a(match, "match");
            C9020a d = f.m37968h(c10522a2.m42515a(match)).m37961c((Number) Integer.valueOf(intValue)).m37963d((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40854a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            optional = d.m37964d(C10522a.m42514a(c10522a3, id2, (List) list, false, 4, null)).m37958b(Boolean.valueOf(this.f40854a.m42525b(match))).m37954a(Boolean.valueOf(this.f40854a.m42527c(match))).m37959b((Number) Integer.valueOf(this.f40856c)).m37967g(this.f40857d).m37956a(this.f40858e).m37955a(C10522a.m42513a(this.f40854a, this.f40859f, list.size(), false, 4, null));
            String str = this.f40860g;
            if (str != null) {
                optional.m37960b(str);
            }
            str = this.f40861h;
            if (str != null) {
                optional.m37962c(str);
            }
            return optional.m37957a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatOpenEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$l */
    static final class C12663l<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40862a;
        /* renamed from: b */
        final /* synthetic */ String f40863b;
        /* renamed from: c */
        final /* synthetic */ Origin f40864c;
        /* renamed from: d */
        final /* synthetic */ boolean f40865d;

        C12663l(C10522a c10522a, String str, Origin origin, boolean z) {
            this.f40862a = c10522a;
            this.f40863b = str;
            this.f40864c = origin;
            this.f40865d = z;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49938a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final df m49938a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40862a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9034a a = df.m44586a();
            C10522a c10522a2 = this.f40862a;
            C2668g.a(match, "match");
            C9034a c = a.m38034a((Number) Integer.valueOf(c10522a2.m42530e(match))).m38046e(this.f40862a.m42515a(match)).m38040c(Boolean.valueOf(this.f40862a.m42525b(match))).m38033a(Boolean.valueOf(this.f40862a.m42527c(match))).m38035a(this.f40862a.m42528d(match)).m38045e((Number) Integer.valueOf(this.f40862a.m42533f(match))).m38042c(this.f40863b).m38043d((Number) Integer.valueOf(this.f40864c.getValue())).m38044d("solo").m38038b((Number) Integer.valueOf(intValue)).m38041c((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40862a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            return c.m38039b(C10522a.m42514a(c10522a3, id2, (List) list, false, 4, null)).m38047f(this.f40862a.m42535g(match)).m38037b(Boolean.valueOf(this.f40865d)).m38036a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatOpenProfileEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$m */
    static final class C12664m<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40866a;
        /* renamed from: b */
        final /* synthetic */ String f40867b;
        /* renamed from: c */
        final /* synthetic */ String f40868c;

        C12664m(C10522a c10522a, String str, String str2) {
            this.f40866a = c10522a;
            this.f40867b = str;
            this.f40868c = str2;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49939a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dh m49939a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40866a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9038a a = dh.m44637a();
            C10522a c10522a2 = this.f40866a;
            C2668g.a(match, "match");
            optional = a.m38061e(c10522a2.m42515a(match)).m38056b(Boolean.valueOf(this.f40866a.m42525b(match))).m38052a(Boolean.valueOf(this.f40866a.m42527c(match))).m38058b(this.f40867b).m38059c("solo").m38053a((Number) Integer.valueOf(intValue)).m38057b((Number) Integer.valueOf(intValue2)).m38060d(this.f40868c);
            c10522a = this.f40866a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            return optional.m38054a(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m38055a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatReportEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$n */
    static final class C12665n<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40869a;
        /* renamed from: b */
        final /* synthetic */ String f40870b;
        /* renamed from: c */
        final /* synthetic */ String f40871c;
        /* renamed from: d */
        final /* synthetic */ boolean f40872d;
        /* renamed from: e */
        final /* synthetic */ String f40873e;

        C12665n(C10522a c10522a, String str, String str2, boolean z, String str3) {
            this.f40869a = c10522a;
            this.f40870b = str;
            this.f40871c = str2;
            this.f40872d = z;
            this.f40873e = str3;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49940a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dk m49940a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40869a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9044a a = dk.m44687a();
            C10522a c10522a2 = this.f40869a;
            C2668g.a(match, "match");
            optional = a.m38080e(c10522a2.m42515a(match)).m38077b(this.f40870b).m38073a((Number) Integer.valueOf(intValue)).m38076b((Number) Integer.valueOf(intValue2));
            c10522a = this.f40869a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            optional = optional.m38074a(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m38081f(this.f40871c).m38072a(Boolean.valueOf(this.f40872d)).m38078c("solo");
            if (this.f40873e != null) {
                optional.m38079d(this.f40873e);
            }
            return optional.m38075a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatSelectSendErrorOptionsEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$o */
    static final class C12666o<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40874a;
        /* renamed from: b */
        final /* synthetic */ String f40875b;
        /* renamed from: c */
        final /* synthetic */ int f40876c;
        /* renamed from: d */
        final /* synthetic */ String f40877d;
        /* renamed from: e */
        final /* synthetic */ String f40878e;
        /* renamed from: f */
        final /* synthetic */ int f40879f;
        /* renamed from: g */
        final /* synthetic */ boolean f40880g;
        /* renamed from: h */
        final /* synthetic */ Number f40881h;
        /* renamed from: i */
        final /* synthetic */ String f40882i;

        C12666o(C10522a c10522a, String str, int i, String str2, String str3, int i2, boolean z, Number number, String str4) {
            this.f40874a = c10522a;
            this.f40875b = str;
            this.f40876c = i;
            this.f40877d = str2;
            this.f40878e = str3;
            this.f40879f = i2;
            this.f40880g = z;
            this.f40881h = number;
            this.f40882i = str4;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49941a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dl m49941a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40874a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9046a e = dl.m44708a().m38092d(this.f40875b).m38094e("solo");
            C10522a c10522a2 = this.f40874a;
            C2668g.a(match, "match");
            C9046a d = e.m38096g(c10522a2.m42515a(match)).m38089c((Number) Integer.valueOf(intValue)).m38091d((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40874a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            return d.m38090c(C10522a.m42514a(c10522a3, id2, (List) list, false, 4, null)).m38086b(Boolean.valueOf(this.f40874a.m42525b(match))).m38082a(Boolean.valueOf(this.f40874a.m42527c(match))).m38087b((Number) Integer.valueOf(this.f40876c)).m38095f(this.f40877d).m38088b(this.f40878e).m38083a(this.f40874a.m42537a(this.f40879f, list.size(), this.f40880g)).m38093e(this.f40881h).m38084a(this.f40882i).m38085a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatSendMessageErrorEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$p */
    static final class C12667p<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40883a;
        /* renamed from: b */
        final /* synthetic */ String f40884b;
        /* renamed from: c */
        final /* synthetic */ int f40885c;
        /* renamed from: d */
        final /* synthetic */ String f40886d;
        /* renamed from: e */
        final /* synthetic */ String f40887e;
        /* renamed from: f */
        final /* synthetic */ boolean f40888f;
        /* renamed from: g */
        final /* synthetic */ String f40889g;
        /* renamed from: h */
        final /* synthetic */ String f40890h;

        C12667p(C10522a c10522a, String str, int i, String str2, String str3, boolean z, String str4, String str5) {
            this.f40883a = c10522a;
            this.f40884b = str;
            this.f40885c = i;
            this.f40886d = str2;
            this.f40887e = str3;
            this.f40888f = z;
            this.f40889g = str4;
            this.f40890h = str5;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49942a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dn m49942a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40883a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9050a e = dn.m44770a().m38123e(this.f40884b);
            C10522a c10522a2 = this.f40883a;
            C2668g.a(match, "match");
            C9050a d = e.m38126h(c10522a2.m42515a(match)).m38124f("solo").m38119c((Number) Integer.valueOf(intValue)).m38121d((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40883a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            optional = d.m38122d(C10522a.m42514a(c10522a3, id2, (List) list, false, 4, null)).m38116b(Boolean.valueOf(this.f40883a.m42525b(match))).m38112a(Boolean.valueOf(this.f40883a.m42527c(match))).m38117b((Number) Integer.valueOf(this.f40885c)).m38125g(this.f40886d).m38114a(this.f40887e).m38113a((Number) Integer.valueOf(this.f40883a.m42536a(this.f40888f, list.size())));
            String str = this.f40889g;
            if (str != null) {
                optional.m38118b(str);
            }
            str = this.f40890h;
            if (str != null) {
                optional.m38120c(str);
            }
            return optional.m38115a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatSendErrorOptionsEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$q */
    static final class C12668q<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40891a;
        /* renamed from: b */
        final /* synthetic */ String f40892b;
        /* renamed from: c */
        final /* synthetic */ int f40893c;
        /* renamed from: d */
        final /* synthetic */ String f40894d;
        /* renamed from: e */
        final /* synthetic */ String f40895e;
        /* renamed from: f */
        final /* synthetic */ int f40896f;
        /* renamed from: g */
        final /* synthetic */ String f40897g;
        /* renamed from: h */
        final /* synthetic */ String f40898h;

        C12668q(C10522a c10522a, String str, int i, String str2, String str3, int i2, String str4, String str5) {
            this.f40891a = c10522a;
            this.f40892b = str;
            this.f40893c = i;
            this.f40894d = str2;
            this.f40895e = str3;
            this.f40896f = i2;
            this.f40897g = str4;
            this.f40898h = str5;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49943a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dm m49943a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40891a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9048a f = dm.m44739a().m38108e(this.f40892b).m38109f("solo");
            C10522a c10522a2 = this.f40891a;
            C2668g.a(match, "match");
            C9048a d = f.m38111h(c10522a2.m42515a(match)).m38104c((Number) Integer.valueOf(intValue)).m38106d((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40891a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            optional = d.m38107d(C10522a.m42514a(c10522a3, id2, (List) list, false, 4, null)).m38101b(Boolean.valueOf(this.f40891a.m42525b(match))).m38097a(Boolean.valueOf(this.f40891a.m42527c(match))).m38102b((Number) Integer.valueOf(this.f40893c)).m38110g(this.f40894d).m38099a(this.f40895e).m38098a(C10522a.m42513a(this.f40891a, this.f40896f, list.size(), false, 4, null));
            String str = this.f40897g;
            if (str != null) {
                optional.m38103b(str);
            }
            str = this.f40898h;
            if (str != null) {
                optional.m38105c(str);
            }
            return optional.m38100a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatSendMessageEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$r */
    static final class C12669r<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40899a;
        /* renamed from: b */
        final /* synthetic */ String f40900b;
        /* renamed from: c */
        final /* synthetic */ int f40901c;
        /* renamed from: d */
        final /* synthetic */ String f40902d;
        /* renamed from: e */
        final /* synthetic */ String f40903e;
        /* renamed from: f */
        final /* synthetic */ String f40904f;
        /* renamed from: g */
        final /* synthetic */ boolean f40905g;
        /* renamed from: h */
        final /* synthetic */ boolean f40906h;
        /* renamed from: i */
        final /* synthetic */ String f40907i;
        /* renamed from: j */
        final /* synthetic */ String f40908j;

        C12669r(C10522a c10522a, String str, int i, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6) {
            this.f40899a = c10522a;
            this.f40900b = str;
            this.f40901c = i;
            this.f40902d = str2;
            this.f40903e = str3;
            this.f40904f = str4;
            this.f40905g = z;
            this.f40906h = z2;
            this.f40907i = str5;
            this.f40908j = str6;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49944a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final C11263do m49944a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40899a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair a = c10522a.m42524b(id, list, true);
            int intValue = ((Number) a.c()).intValue();
            int intValue2 = ((Number) a.d()).intValue();
            C9052a f = C11263do.m44803a().m38142e(this.f40900b).m38144f("solo");
            C10522a c10522a2 = this.f40899a;
            C2668g.a(match, "match");
            C9052a d = f.m38147h(c10522a2.m42515a(match)).m38135c((Number) Integer.valueOf(intValue)).m38138d((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40899a;
            currentUser = currentUser.id();
            C2668g.a(currentUser, "me.id()");
            optional = d.m38139d(c10522a3.m42516a((String) currentUser, (List) list, true)).m38145g(Boolean.valueOf(this.f40899a.m42525b(match))).m38140e(Boolean.valueOf(this.f40899a.m42527c(match))).m38132b((Number) Integer.valueOf(this.f40901c)).m38146g(this.f40902d).m38129a(this.f40903e).m38131b(Boolean.valueOf(this.f40899a.f34212e.containsEmail(this.f40902d))).m38127a(Boolean.valueOf(this.f40899a.f34212e.containsAddress(this.f40902d))).m38134c(Boolean.valueOf(this.f40899a.f34212e.containsPhoneNumber(this.f40902d))).m38137d(Boolean.valueOf(this.f40899a.f34212e.containsURL(this.f40902d))).m38149j(this.f40904f).m38141e((Number) Integer.valueOf(this.f40899a.m42533f(match))).m38143f(Boolean.valueOf(this.f40905g)).m38128a((Number) Integer.valueOf(this.f40899a.m42536a(this.f40906h, list.size()))).m38148i(this.f40899a.m42535g(match));
            String str = this.f40907i;
            if (str != null) {
                optional.m38133b(str);
            }
            str = this.f40908j;
            if (str != null) {
                optional.m38136c(str);
            }
            return optional.m38130a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatTapInputTypeEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$s */
    static final class C12670s<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40909a;
        /* renamed from: b */
        final /* synthetic */ String f40910b;
        /* renamed from: c */
        final /* synthetic */ String f40911c;

        C12670s(C10522a c10522a, String str, String str2) {
            this.f40909a = c10522a;
            this.f40910b = str;
            this.f40911c = str2;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49945a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dp m49945a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40909a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9054a d = dp.m44854a().m38157c(this.f40910b).m38158d("solo");
            C10522a c10522a2 = this.f40909a;
            C2668g.a(match, "match");
            C9054a b2 = d.m38159e(c10522a2.m42515a(match)).m38151a((Number) Integer.valueOf(intValue)).m38155b((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40909a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            return b2.m38156b(C10522a.m42514a(c10522a3, id2, (List) list, false, 4, null)).m38154b(Boolean.valueOf(this.f40909a.m42525b(match))).m38150a(Boolean.valueOf(this.f40909a.m42527c(match))).m38152a(this.f40911c).m38153a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "optionalMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$t */
    static final class C12671t<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C12671t f40912a = new C12671t();

        C12671t() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m49946a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m49946a(Optional<Match> optional) {
            C2668g.a(optional, "optionalMatch");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "optionalMatch", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$u */
    static final class C12672u<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12672u f40913a = new C12672u();

        C12672u() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m49947a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m49947a(Optional<Match> optional) {
            return (Match) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatTapLinkEvent;", "kotlin.jvm.PlatformType", "match", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$v */
    static final class C12673v<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40914a;
        /* renamed from: b */
        final /* synthetic */ String f40915b;
        /* renamed from: c */
        final /* synthetic */ String f40916c;
        /* renamed from: d */
        final /* synthetic */ DateTime f40917d;
        /* renamed from: e */
        final /* synthetic */ String f40918e;

        C12673v(C10522a c10522a, String str, String str2, DateTime dateTime, String str3) {
            this.f40914a = c10522a;
            this.f40915b = str;
            this.f40916c = str2;
            this.f40917d = dateTime;
            this.f40918e = str3;
        }

        public /* synthetic */ Object call(Object obj) {
            return m49948a((Match) obj);
        }

        /* renamed from: a */
        public final dq m49948a(Match match) {
            C9056a b = dq.m44876a().m38161a(this.f40915b).m38163b("solo");
            C10522a c10522a = this.f40914a;
            C2668g.a(match, "match");
            return b.m38165d(c10522a.m42515a(match)).m38164c(this.f40916c).m38160a((Number) Integer.valueOf(this.f40914a.m42505a(this.f40917d))).m38166e(this.f40918e).m38162a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatTapMessageEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$w */
    static final class C12674w<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40919a;
        /* renamed from: b */
        final /* synthetic */ String f40920b;
        /* renamed from: c */
        final /* synthetic */ int f40921c;
        /* renamed from: d */
        final /* synthetic */ String f40922d;
        /* renamed from: e */
        final /* synthetic */ String f40923e;
        /* renamed from: f */
        final /* synthetic */ int f40924f;
        /* renamed from: g */
        final /* synthetic */ MessageAction f40925g;
        /* renamed from: h */
        final /* synthetic */ String f40926h;
        /* renamed from: i */
        final /* synthetic */ String f40927i;

        C12674w(C10522a c10522a, String str, int i, String str2, String str3, int i2, MessageAction messageAction, String str4, String str5) {
            this.f40919a = c10522a;
            this.f40920b = str;
            this.f40921c = i;
            this.f40922d = str2;
            this.f40923e = str3;
            this.f40924f = i2;
            this.f40925g = messageAction;
            this.f40926h = str4;
            this.f40927i = str5;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49949a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final dr m49949a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40919a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            currentUser = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) currentUser.c()).intValue();
            currentUser = ((Number) currentUser.d()).intValue();
            C9058a e = dr.m44892a().m38175d(this.f40920b).m38176e("solo");
            C10522a c10522a2 = this.f40919a;
            C2668g.a(match, "match");
            optional = e.m38179h(c10522a2.m42515a(match)).m38172c((Number) Integer.valueOf(intValue)).m38174d((Number) Integer.valueOf(currentUser)).m38170b((Number) Integer.valueOf(this.f40921c)).m38177f(this.f40922d).m38168a(this.f40923e).m38167a(C10522a.m42513a(this.f40919a, this.f40924f, list.size(), false, 4, null));
            if (this.f40925g != MessageAction.NONE) {
                optional.m38178g(this.f40925g.getValue());
            }
            String str = this.f40926h;
            if (str != null) {
                optional.m38171b(str);
            }
            str = this.f40927i;
            if (str != null) {
                optional.m38173c(str);
            }
            return optional.m38169a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/ChatTapTextInputEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$x */
    static final class C12675x<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40928a;
        /* renamed from: b */
        final /* synthetic */ String f40929b;

        C12675x(C10522a c10522a, String str) {
            this.f40928a = c10522a;
            this.f40929b = str;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49950a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final ds m49950a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40928a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9060a c = ds.m44919a().m38186b(this.f40929b).m38187c("solo");
            C10522a c10522a2 = this.f40928a;
            C2668g.a(match, "match");
            C9060a b2 = c.m38188d(c10522a2.m42515a(match)).m38181a((Number) Integer.valueOf(intValue)).m38185b((Number) Integer.valueOf(intValue2));
            C10522a c10522a3 = this.f40928a;
            String id2 = currentUser.id();
            C2668g.a(id2, "me.id()");
            return b2.m38182a(C10522a.m42514a(c10522a3, id2, (List) list, false, 4, null)).m38184b(Boolean.valueOf(this.f40928a.m42525b(match))).m38180a(Boolean.valueOf(this.f40928a.m42527c(match))).m38183a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00072\u000e\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/etl/event/GIFSearchEvent;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "messages", "", "Lcom/tinder/domain/message/Message;", "me", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.a$z */
    static final class C12676z<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
        /* renamed from: a */
        final /* synthetic */ C10522a f40930a;
        /* renamed from: b */
        final /* synthetic */ String f40931b;
        /* renamed from: c */
        final /* synthetic */ String f40932c;
        /* renamed from: d */
        final /* synthetic */ int f40933d;
        /* renamed from: e */
        final /* synthetic */ long f40934e;

        C12676z(C10522a c10522a, String str, String str2, int i, long j) {
            this.f40930a = c10522a;
            this.f40931b = str;
            this.f40932c = str2;
            this.f40933d = i;
            this.f40934e = j;
        }

        public /* synthetic */ Object call(Object obj, Object obj2, Object obj3) {
            return m49951a((Optional) obj, (List) obj2, (CurrentUser) obj3);
        }

        /* renamed from: a */
        public final hl m49951a(Optional<Match> optional, List<? extends Message> list, CurrentUser currentUser) {
            Match match = (Match) optional.b();
            C10522a c10522a = this.f40930a;
            String id = currentUser.id();
            C2668g.a(id, "me.id()");
            C2668g.a(list, ManagerWebServices.PARAM_MESSAGES);
            Pair b = C10522a.m42523b(c10522a, id, list, false, 4, null);
            int intValue = ((Number) b.c()).intValue();
            int intValue2 = ((Number) b.d()).intValue();
            C9104a d = hl.m45246a().m38335c(this.f40931b).m38337d("solo");
            C10522a c10522a2 = this.f40930a;
            C2668g.a(match, "match");
            optional = d.m38338e(c10522a2.m42515a(match)).m38334c((Number) Integer.valueOf(intValue)).m38336d((Number) Integer.valueOf(intValue2));
            c10522a = this.f40930a;
            id = currentUser.id();
            C2668g.a(id, "me.id()");
            return optional.m38333b(C10522a.m42514a(c10522a, id, (List) list, false, 4, null)).m38330a(this.f40932c).m38329a((Number) Integer.valueOf(this.f40933d)).m38332b((Number) Long.valueOf(this.f40934e)).m38331a();
        }
    }

    /* renamed from: a */
    public final int m42536a(boolean z, int i) {
        return z ? i : i - 1;
    }

    @Inject
    public C10522a(@NotNull MessageRepository messageRepository, @NotNull GetMatch getMatch, @NotNull MetaGateway metaGateway, @NotNull StringLinkDetector stringLinkDetector, @NotNull C17174d c17174d) {
        C2668g.b(messageRepository, "messageRepository");
        C2668g.b(getMatch, "getMatch");
        C2668g.b(metaGateway, "userGateway");
        C2668g.b(stringLinkDetector, "stringLinkDetector");
        C2668g.b(c17174d, "getTypingIndicatorConfig");
        this.f34209b = messageRepository;
        this.f34210c = getMatch;
        this.f34211d = metaGateway;
        this.f34212e = stringLinkDetector;
        this.f34213f = c17174d;
    }

    @NotNull
    /* renamed from: a */
    public final Single<df> m42547a(@NotNull String str, @NotNull Origin origin, boolean z) {
        C2668g.b(str, "matchId");
        C2668g.b(origin, "origin");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12663l(this, str, origin, z)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<da> m42546a(@NotNull String str, long j, boolean z) {
        C2668g.b(str, "matchId");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12657f(this, str, j, z)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<dh> m42548a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "openProfileFrom");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12664m(this, str, str2)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<dn> m42545a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, boolean z, @Nullable String str4, @Nullable String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "message");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        Single<dn> a = Observable.a(this.f34210c.execute(str6), this.f34209b.messagesForMatch(str6), this.f34211d.observeCurrentUser(), new C12667p(this, str6, i, str7, str8, z, str4, str5)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<de> m42550a(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull MediaType mediaType, @NotNull String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "message");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        String str9 = str4;
        C2668g.b(str9, "mediaId");
        MediaType mediaType2 = mediaType;
        C2668g.b(mediaType2, "mediaType");
        String str10 = str5;
        C2668g.b(str10, "url");
        Single<de> a = Observable.a(this.f34210c.execute(str6), this.f34209b.messagesForMatch(str6), this.f34211d.observeCurrentUser(), new C12661j(this, str9, mediaType2, str10, str6, str7, str8, i)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<ds> m42539a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12675x(this, str)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<hl> m42549a(@NotNull String str, @NotNull String str2, int i, long j) {
        String str3 = str;
        C2668g.b(str3, "matchId");
        String str4 = str2;
        C2668g.b(str4, "query");
        Single<hl> a = Observable.a(this.f34210c.execute(str3), this.f34209b.messagesForMatch(str3), this.f34211d.observeCurrentUser(), new C12676z(this, str3, str4, i, j)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<cx> m42540a(@NotNull String str, int i, @NotNull String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "buttonType");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), new C12655d(this, str, i, str2)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Single<hm> m42554b(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new aa(this, str)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<hn> m42552a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        String str5 = str;
        C2668g.b(str5, "matchId");
        String str6 = str2;
        C2668g.b(str6, "query");
        String str7 = str3;
        C2668g.b(str7, "gifId");
        String str8 = str4;
        C2668g.b(str8, "gifUrl");
        Single<hn> a = Observable.a(this.f34210c.execute(str5), this.f34209b.messagesForMatch(str5), this.f34211d.observeCurrentUser(), new ab(this, str5, str6, str7, str8, i)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: b */
    public final Single<ho> m42557b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        String str5 = str;
        C2668g.b(str5, "matchId");
        String str6 = str2;
        C2668g.b(str6, "query");
        String str7 = str3;
        C2668g.b(str7, "gifId");
        String str8 = str4;
        C2668g.b(str8, "gifUrl");
        Single<ho> a = Observable.a(this.f34210c.execute(str5), this.f34209b.messagesForMatch(str5), this.f34211d.observeCurrentUser(), new ac(this, str5, str6, str7, str8, i)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: b */
    public final Single<dv> m42556b(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "redShiftMapping");
        C2668g.b(str2, "matchId");
        str = Observable.a(this.f34210c.execute(str2), this.f34209b.messagesForMatch(str2), this.f34211d.observeCurrentUser(), new C12656e(this, str)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<C11263do> m42551a(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @Nullable String str5, @Nullable String str6) {
        String str7 = str;
        C2668g.b(str7, "matchId");
        String str8 = str2;
        C2668g.b(str8, "messageText");
        String str9 = str3;
        C2668g.b(str9, "contentId");
        String str10 = str4;
        C2668g.b(str10, "sendFrom");
        Single<C11263do> a = Observable.a(this.f34210c.execute(str7), this.f34209b.messagesForMatch(str7), this.f34211d.observeCurrentUser(), new C12669r(this, str7, i, str8, str9, str10, z, z2, str5, str6)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<db> m42543a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @Nullable String str4, @Nullable String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "messageText");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        Single<db> a = Observable.a(this.f34210c.execute(str6), this.f34209b.messagesForMatch(str6), this.f34211d.observeCurrentUser(), new C12658g(this, str6, i, str7, str8, i2, str4, str5)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: b */
    public final Single<dm> m42555b(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @Nullable String str4, @Nullable String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "message");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        Single<dm> a = Observable.a(this.f34210c.execute(str6), this.f34209b.messagesForMatch(str6), this.f34211d.observeCurrentUser(), new C12668q(this, str6, i, str7, str8, i2, str4, str5)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<dl> m42542a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @Nullable Number number, @NotNull String str4, boolean z) {
        String str5 = str;
        C2668g.b(str5, "matchId");
        String str6 = str2;
        C2668g.b(str6, "message");
        String str7 = str3;
        C2668g.b(str7, "contentId");
        String str8 = str4;
        C2668g.b(str8, AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON);
        Single<dl> a = Observable.a(this.f34210c.execute(str5), this.f34209b.messagesForMatch(str5), this.f34211d.observeCurrentUser(), new C12666o(this, str5, i, str6, str7, i2, z, number, str8)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: c */
    public final Single<dp> m42559c(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "buttonType");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12670s(this, str, str2)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Single<dr> m42541a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @NotNull MessageAction messageAction, @Nullable String str4, @Nullable String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "message");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        MessageAction messageAction2 = messageAction;
        C2668g.b(messageAction2, "messageAction");
        Single<dr> a = Observable.a(this.f34210c.execute(str6), this.f34209b.messagesForMatch(str6), this.f34211d.observeCurrentUser(), new C12674w(this, str6, i, str7, str8, i2, messageAction2, str4, str5)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: c */
    public final Single<dc> m42558c(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @Nullable String str4, @Nullable String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "message");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        Single<dc> a = Observable.a(this.f34210c.execute(str6), this.f34209b.messagesForMatch(str6), this.f34211d.observeCurrentUser(), new C12659h(this, str6, i, str7, str8, i2, str4, str5)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<dd> m42544a(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @NotNull String str4, @Nullable String str5, @Nullable String str6) {
        String str7 = str;
        C2668g.b(str7, "matchId");
        String str8 = str2;
        C2668g.b(str8, "message");
        String str9 = str3;
        C2668g.b(str9, "contentId");
        String str10 = str4;
        C2668g.b(str10, AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON);
        Single<dd> a = Observable.a(this.f34210c.execute(str7), this.f34209b.messagesForMatch(str7), this.f34211d.observeCurrentUser(), new C12660i(this, str7, i, str8, str9, i2, str10, str5, str6)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: d */
    public final Single<cy> m42560d(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, int i2, @Nullable String str4, @Nullable String str5) {
        String str6 = str;
        C2668g.b(str6, "matchId");
        String str7 = str2;
        C2668g.b(str7, "message");
        String str8 = str3;
        C2668g.b(str8, "contentId");
        Single<cy> a = Observable.a(this.f34210c.execute(str6), this.f34209b.messagesForMatch(str6), this.f34211d.observeCurrentUser(), new C12662k(this, str6, i, str7, str8, i2, str4, str5)).h().a();
        C2668g.a(a, "Observable.combineLatest…              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<dk> m42553a(@NotNull String str, @NotNull String str2, @Nullable String str3, boolean z) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "reason");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12665n(this, str, str2, z, str3)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<dq> m42538a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DateTime dateTime) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "message");
        C2668g.b(str3, "url");
        C2668g.b(dateTime, "messageSentDate");
        str = this.f34210c.execute(str).f(C12671t.f40912a).k(C12672u.f40913a).h().k(new C12673v(this, str, str2, dateTime, str3));
        C2668g.a(str, "getMatch\n               …build()\n                }");
        return str;
    }

    @NotNull
    /* renamed from: d */
    public final Single<cw> m42561d(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "matchId");
        C2668g.b(str2, "reportReason");
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12654c(this, str, str2)).h().a();
        C2668g.a(str, "Observable.combineLatest…              .toSingle()");
        return str;
    }

    @NotNull
    public C3958c<dt> createChatTypingEvent(@NotNull String str, @NotNull TypingType typingType) {
        C2668g.b(str, "matchId");
        C2668g.b(typingType, "type");
        str = this.f34213f.execute().a(new C10521y(this, str, typingType));
        C2668g.a(str, "getTypingIndicatorConfig…onfig = it)\n            }");
        return str;
    }

    /* renamed from: a */
    private final C3958c<dt> m42512a(String str, TypingType typingType, Config config) {
        str = Observable.a(this.f34210c.execute(str), this.f34209b.messagesForMatch(str), this.f34211d.observeCurrentUser(), new C12653b(this, str, config, typingType));
        C2668g.a(str, "Observable.combineLatest…  .build()\n            })");
        str = RxJavaInteropExtKt.toV2Observable(str).firstElement();
        C2668g.a(str, "Observable.combineLatest…          .firstElement()");
        return str;
    }

    /* renamed from: a */
    private final C9062a m42509a(@NotNull C9062a c9062a, Config config) {
        c9062a = c9062a.m38192b((Number) Long.valueOf(config.getHeartbeat())).m38198e((Number) Long.valueOf(config.getTimeToLive()));
        C2668g.a(c9062a, "heartbeatInMillis(heartb…).ttlInMillis(timeToLive)");
        C2668g.a(c9062a, "with(config) {\n         …lis(timeToLive)\n        }");
        return c9062a;
    }

    /* renamed from: a */
    private final C9062a m42510a(@NotNull C9062a c9062a, TypingType typingType) {
        if (typingType instanceof C17162b) {
            c9062a = c9062a.m38199e(typingType.a());
            C2668g.a(c9062a, "type(typingType.value)");
            return c9062a;
        } else if (typingType instanceof C17163c) {
            c9062a = c9062a.m38199e(typingType.a());
            C2668g.a(c9062a, "type(typingType.value)");
            return c9062a;
        } else if (typingType instanceof C17161a) {
            c9062a = c9062a.m38199e(typingType.a()).m38189a((Number) Long.valueOf(((C17161a) typingType).b()));
            C2668g.a(c9062a, "type(typingType.value).d…ypingType.durationMillis)");
            return c9062a;
        } else if (typingType instanceof Hide) {
            Hide hide = (Hide) typingType;
            c9062a = c9062a.m38199e(typingType.a()).m38197d(hide.b().getValue()).m38189a((Number) Long.valueOf(hide.c()));
            C2668g.a(c9062a, "type(typingType.value)\n …ypingType.durationMillis)");
            return c9062a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final HashMap<String, Object> m42518a(Match match, CurrentUser currentUser, List<? extends Message> list) {
        String id = currentUser.id();
        C2668g.a(id, "me.id()");
        Pair b = C10522a.m42523b(this, id, list, false, 4, null);
        int intValue = ((Number) b.c()).intValue();
        int intValue2 = ((Number) b.d()).intValue();
        r2 = new Pair[8];
        String id2 = currentUser.id();
        C2668g.a(id2, "me.id()");
        r2[5] = C15811g.a("lastMessageFrom", C10522a.m42514a(this, id2, (List) list, false, 4, null));
        r2[6] = C15811g.a("userSuperlikedMatch", Boolean.valueOf(m42525b(match)));
        r2[7] = C15811g.a("matchSuperlikedUser", Boolean.valueOf(m42527c(match)));
        return ae.c(r2);
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ Number m42513a(C10522a c10522a, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return c10522a.m42537a(i, i2, z);
    }

    @NotNull
    /* renamed from: a */
    public final Number m42537a(int i, int i2, boolean z) {
        if (z) {
            return Integer.valueOf(i2);
        }
        return Integer.valueOf((i2 - i) - 1);
    }

    /* renamed from: a */
    private final String m42515a(Match match) {
        if (match instanceof CoreMatch) {
            match = ((CoreMatch) match).getPerson().id();
            C2668g.a(match, "match.person.id()");
            return match;
        } else if (match instanceof MessageAdMatch) {
            return "";
        } else {
            if (match instanceof PlacesMatch) {
                match = ((PlacesMatch) match).getPerson().id();
                C2668g.a(match, "match.person.id()");
                return match;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m42514a(C10522a c10522a, String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c10522a.m42516a(str, list, z);
    }

    /* renamed from: a */
    private final String m42516a(String str, List<? extends Message> list, boolean z) {
        list = m42519a((List) list, z);
        if (list.isEmpty()) {
            return "none";
        }
        if (C2668g.a(((Message) C19301m.f(list)).getFromId(), str)) {
            return "self";
        }
        return (C2668g.a(((Message) C19301m.f(list)).getFromId(), str) ^ 1) != null ? "other" : "";
    }

    /* renamed from: b */
    static /* synthetic */ Pair m42523b(C10522a c10522a, String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c10522a.m42524b(str, list, z);
    }

    /* renamed from: b */
    private final Pair<Integer, Integer> m42524b(String str, List<? extends Message> list, boolean z) {
        list = m42519a((List) list, z);
        Iterable<Message> iterable = list;
        int i = 0;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (Message fromId : iterable) {
                if (C2668g.a(fromId.getFromId(), str)) {
                    i++;
                }
            }
        }
        return C15811g.a(Integer.valueOf(i), Integer.valueOf(list.size() - i));
    }

    /* renamed from: a */
    private final List<Message> m42519a(List<? extends Message> list, boolean z) {
        if (z && list.size() == 1) {
            return C19301m.a();
        }
        return (!z || list.size() < true) ? list : list.subList(1, list.size());
    }

    /* renamed from: b */
    private final boolean m42525b(Match match) {
        return match.getAttribution() == Attribution.I_SUPER_LIKE_THEM ? true : null;
    }

    /* renamed from: c */
    private final boolean m42527c(Match match) {
        return match.getAttribution() == Attribution.THEY_SUPER_LIKE_ME ? true : null;
    }

    /* renamed from: d */
    private final String m42528d(Match match) {
        Badge badge;
        if (match instanceof CoreMatch) {
            match = ((CoreMatch) match).getPerson().badges();
            C2668g.a(match, "match.person.badges()");
            badge = (Badge) C19301m.g(match);
            if (badge != null) {
                match = badge.type();
                if (match != null) {
                    match = match.name();
                    if (match != null) {
                        return match;
                    }
                }
            }
            return "";
        } else if (match instanceof MessageAdMatch) {
            return "";
        } else {
            if (match instanceof PlacesMatch) {
                match = ((PlacesMatch) match).getPerson().badges();
                C2668g.a(match, "match.person.badges()");
                badge = (Badge) C19301m.g(match);
                if (badge != null) {
                    match = badge.type();
                    if (match != null) {
                        match = match.name();
                        if (match != null) {
                            return match;
                        }
                    }
                }
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    private final int m42530e(Match match) {
        switch (C8426b.f29915a[match.getAttribution().ordinal()]) {
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            case 8:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: f */
    private final int m42533f(Match match) {
        match = Minutes.a(DateTime.a(), match.getCreationDate());
        C2668g.a(match, "Minutes.minutesBetween(D…ow(), match.creationDate)");
        return Math.abs(match.b());
    }

    /* renamed from: a */
    private final int m42505a(DateTime dateTime) {
        dateTime = Seconds.a(DateTime.a(), dateTime);
        C2668g.a(dateTime, "Seconds.secondsBetween(DateTime.now(), sentDate)");
        return Math.abs(dateTime.b());
    }

    /* renamed from: g */
    private final String m42535g(Match match) {
        if (!(match instanceof PlacesMatch)) {
            match = null;
        }
        PlacesMatch placesMatch = (PlacesMatch) match;
        if (placesMatch == null) {
            return null;
        }
        match = placesMatch.getPlace();
        return match != null ? match.getId() : null;
    }
}
