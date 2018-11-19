package kotlin.text;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C15807n;
import kotlin.collections.C18456j;
import kotlin.collections.C19066k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.ranges.C18464j;
import kotlin.sequences.C19155k;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\n\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001c\u001a:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006\u001a&\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\"\u001a&\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010$\u001a\u00020\u0006*\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010$\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u0010'\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010(\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010)\u001a\u00020\r*\u00020\u0002H\b\u001a \u0010*\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u0010+\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010,\u001a\u00020-*\u00020\u0002H\u0002\u001a&\u0010.\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010.\u001a\u00020\u0006*\u00020\u00022\u0006\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010/\u001a\u00020\u0006*\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010/\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00100\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u0002\u001a\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u0002\u001a\u0015\u00104\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\f\u001a\u000f\u00105\u001a\u00020\n*\u0004\u0018\u00010\nH\b\u001a\u001c\u00106\u001a\u00020\u0002*\u00020\u00022\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00106\u001a\u00020\n*\u00020\n2\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00109\u001a\u00020\n*\u00020\n2\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001aG\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000101*\u00020\u00022\u000e\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010?\u001a=\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000101*\u00020\u00022\u0006\u0010;\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0002\b>\u001a4\u0010@\u001a\u00020\r*\u00020\u00022\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010C\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u0002\u001a\u0012\u0010C\u001a\u00020\n*\u00020\n2\u0006\u0010D\u001a\u00020\u0002\u001a\u001a\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006\u001a\u0012\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u001d\u0010E\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\b\u001a\u0015\u0010E\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u0001H\b\u001a\u0012\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010G\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020\u0002\u001a\u001a\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002\u001a\u001a\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a+\u0010J\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00020LH\b\u001a\u001d\u0010J\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\nH\b\u001a$\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001d\u0010T\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\nH\b\u001a\"\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0002\u001a\u001a\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0002\u001a%\u0010U\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0002H\b\u001a\u001d\u0010U\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0002H\b\u001a=\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006¢\u0006\u0002\u0010W\u001a0\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\n\u0010;\u001a\u00020&\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006\u001a/\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0006\u0010I\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0002\bX\u001a%\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010=\u001a\u00020\u0006H\b\u001a=\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u00022\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006¢\u0006\u0002\u0010Z\u001a0\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u00022\n\u0010;\u001a\u00020&\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006\u001a\u001c\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u001d\u0010\\\u001a\u00020\u0002*\u00020\n2\u0006\u0010]\u001a\u00020\u00062\u0006\u0010^\u001a\u00020\u0006H\b\u001a\u001f\u0010_\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u0006H\b\u001a\u0012\u0010_\u001a\u00020\n*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u0012\u0010_\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u0001\u001a\u001c\u0010`\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010`\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010b\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010b\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010c\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010c\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\n\u0010d\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010d\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010d\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010d\u001a\u00020\n*\u00020\nH\b\u001a!\u0010d\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010d\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\n\u0010f\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010f\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010f\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010f\u001a\u00020\n*\u00020\nH\b\u001a!\u0010f\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010f\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\n\u0010g\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010g\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010g\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010g\u001a\u00020\n*\u00020\nH\b\u001a!\u0010g\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010g\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006h"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 1, 10}, xi = 1, xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.r */
class C19298r extends C19296q {
    @NotNull
    /* renamed from: c */
    public static final C18461c m68790c(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "$receiver");
        return new C18461c(0, charSequence.length() - 1);
    }

    /* renamed from: d */
    public static final int m68791d(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "$receiver");
        return charSequence.length() - 1;
    }

    @NotNull
    /* renamed from: a */
    public static final String m68747a(@NotNull CharSequence charSequence, @NotNull C18461c c18461c) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(c18461c, "range");
        return charSequence.subSequence(c18461c.m66914e().intValue(), c18461c.m66915f().intValue() + 1).toString();
    }

    @NotNull
    /* renamed from: a */
    public static final String m68748a(@NotNull String str, char c, @NotNull String str2) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "missingDelimiterValue");
        c = C19298r.m68740a((CharSequence) str, c, 0, false, 6, null);
        if (c == '￿') {
            return str2;
        }
        str2 = str.substring(null, c);
        C2668g.a(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str2;
    }

    @NotNull
    /* renamed from: a */
    public static final String m68751a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "delimiter");
        C2668g.b(str3, "missingDelimiterValue");
        str2 = C19298r.m68744a((CharSequence) str, str2, 0, false, 6, null);
        if (str2 == -1) {
            return str3;
        }
        str3 = str.substring(null, str2);
        C2668g.a(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str3;
    }

    @NotNull
    /* renamed from: b */
    public static final String m68776b(@NotNull String str, char c, @NotNull String str2) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "missingDelimiterValue");
        c = C19298r.m68740a((CharSequence) str, c, 0, false, 6, null);
        if (c == '￿') {
            return str2;
        }
        str2 = str.substring(c + 1, str.length());
        C2668g.a(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str2;
    }

    @NotNull
    /* renamed from: b */
    public static final String m68778b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "delimiter");
        C2668g.b(str3, "missingDelimiterValue");
        int a = C19298r.m68744a((CharSequence) str, str2, 0, false, 6, null);
        if (a == -1) {
            return str3;
        }
        str3 = str.substring(a + str2.length(), str.length());
        C2668g.a(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str3;
    }

    @NotNull
    /* renamed from: c */
    public static final String m68787c(@NotNull String str, char c, @NotNull String str2) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "missingDelimiterValue");
        c = C19298r.m68771b((CharSequence) str, c, 0, false, 6, null);
        if (c == '￿') {
            return str2;
        }
        str2 = str.substring(null, c);
        C2668g.a(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str2;
    }

    @NotNull
    /* renamed from: c */
    public static final String m68789c(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "delimiter");
        C2668g.b(str3, "missingDelimiterValue");
        str2 = C19298r.m68773b((CharSequence) str, str2, 0, false, 6, null);
        if (str2 == -1) {
            return str3;
        }
        str3 = str.substring(null, str2);
        C2668g.a(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str3;
    }

    @NotNull
    /* renamed from: c */
    public static /* synthetic */ String m68788c(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return C19298r.m68792d(str, c, str2);
    }

    @NotNull
    /* renamed from: d */
    public static final String m68792d(@NotNull String str, char c, @NotNull String str2) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "missingDelimiterValue");
        c = C19298r.m68771b((CharSequence) str, c, 0, false, 6, null);
        if (c == '￿') {
            return str2;
        }
        str2 = str.substring(c + 1, str.length());
        C2668g.a(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return str2;
    }

    @NotNull
    /* renamed from: a */
    public static final CharSequence m68746a(@NotNull CharSequence charSequence, int i, int i2, @NotNull CharSequence charSequence2) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(charSequence2, "replacement");
        if (i2 < i) {
            charSequence2 = new StringBuilder();
            charSequence2.append("End index (");
            charSequence2.append(i2);
            charSequence2.append(") is less than start index (");
            charSequence2.append(i);
            charSequence2.append(").");
            throw ((Throwable) new IndexOutOfBoundsException(charSequence2.toString()));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(charSequence, 0, i);
        stringBuilder.append(charSequence2);
        stringBuilder.append(charSequence, i2, charSequence.length());
        return stringBuilder;
    }

    @NotNull
    /* renamed from: a */
    public static final String m68750a(@NotNull String str, @NotNull CharSequence charSequence) {
        C2668g.b(str, "$receiver");
        C2668g.b(charSequence, "prefix");
        if (!C19298r.m68769a((CharSequence) str, charSequence, false, 2, null)) {
            return str;
        }
        str = str.substring(charSequence.length());
        C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public static final String m68753a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        C2668g.b(str, "$receiver");
        C2668g.b(str2, "delimiter");
        C2668g.b(str3, "replacement");
        C2668g.b(str4, "missingDelimiterValue");
        CharSequence charSequence = str;
        str2 = C19298r.m68744a(charSequence, str2, 0, false, 6, null);
        return str2 == -1 ? str4 : C19298r.m68746a(charSequence, (int) null, (int) str2, (CharSequence) str3).toString();
    }

    /* renamed from: a */
    public static final boolean m68767a(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(charSequence2, "other");
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3) {
            if (i2 <= charSequence2.length() - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!C17634c.m64245a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m68765a(@NotNull CharSequence charSequence, char c, boolean z) {
        C2668g.b(charSequence, "$receiver");
        return (charSequence.length() <= 0 || C17634c.m64245a(charSequence.charAt(C19298r.m68791d(charSequence)), c, z) == null) ? null : true;
    }

    /* renamed from: a */
    public static final boolean m68768a(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C19296q.m68678b((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return C19298r.m68767a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: a */
    public static final int m68745a(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C19066k.m67965a(cArr), i);
        }
        i = C18464j.m66926c(i, 0);
        int d = C19298r.m68791d(charSequence);
        if (i <= d) {
            while (true) {
                Object obj;
                char charAt = charSequence.charAt(i);
                for (char a : cArr) {
                    if (C17634c.m64245a(a, charAt, z)) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    if (i == d) {
                        break;
                    }
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final int m68774b(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C19066k.m67965a(cArr), i);
        }
        for (i = C18464j.m66927d(i, C19298r.m68791d(charSequence)); i >= 0; i--) {
            char charAt = charSequence.charAt(i);
            Object obj = null;
            for (char a : cArr) {
                if (C17634c.m64245a(a, charAt, z)) {
                    obj = 1;
                    break;
                }
            }
            if (obj != null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ int m68742a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return C19298r.m68741a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static final int m68741a(@org.jetbrains.annotations.NotNull java.lang.CharSequence r6, java.lang.CharSequence r7, int r8, int r9, boolean r10, boolean r11) {
        /*
        r0 = 0;
        if (r11 != 0) goto L_0x0017;
    L_0x0003:
        r8 = kotlin.ranges.C18464j.m66926c(r8, r0);
        r11 = new kotlin.ranges.c;
        r0 = r6.length();
        r9 = kotlin.ranges.C18464j.m66927d(r9, r0);
        r11.<init>(r8, r9);
        r11 = (kotlin.ranges.C17565a) r11;
        goto L_0x0027;
    L_0x0017:
        r11 = kotlin.text.C19298r.m68791d(r6);
        r8 = kotlin.ranges.C18464j.m66927d(r8, r11);
        r9 = kotlin.ranges.C18464j.m66926c(r9, r0);
        r11 = kotlin.ranges.C18464j.m66922a(r8, r9);
    L_0x0027:
        r8 = r6 instanceof java.lang.String;
        if (r8 == 0) goto L_0x005a;
    L_0x002b:
        r8 = r7 instanceof java.lang.String;
        if (r8 == 0) goto L_0x005a;
    L_0x002f:
        r8 = r11.m64208a();
        r9 = r11.m64209b();
        r11 = r11.m64210c();
        if (r11 <= 0) goto L_0x0040;
    L_0x003d:
        if (r8 > r9) goto L_0x0081;
    L_0x003f:
        goto L_0x0042;
    L_0x0040:
        if (r8 < r9) goto L_0x0081;
    L_0x0042:
        r0 = r7;
        r0 = (java.lang.String) r0;
        r1 = 0;
        r2 = r6;
        r2 = (java.lang.String) r2;
        r4 = r7.length();
        r3 = r8;
        r5 = r10;
        r0 = kotlin.text.C19296q.m68674a(r0, r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x0056;
    L_0x0055:
        return r8;
    L_0x0056:
        if (r8 == r9) goto L_0x0081;
    L_0x0058:
        r8 = r8 + r11;
        goto L_0x0042;
    L_0x005a:
        r8 = r11.m64208a();
        r9 = r11.m64209b();
        r11 = r11.m64210c();
        if (r11 <= 0) goto L_0x006b;
    L_0x0068:
        if (r8 > r9) goto L_0x0081;
    L_0x006a:
        goto L_0x006d;
    L_0x006b:
        if (r8 < r9) goto L_0x0081;
    L_0x006d:
        r1 = 0;
        r4 = r7.length();
        r0 = r7;
        r2 = r6;
        r3 = r8;
        r5 = r10;
        r0 = kotlin.text.C19298r.m68767a(r0, r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x007d;
    L_0x007c:
        return r8;
    L_0x007d:
        if (r8 == r9) goto L_0x0081;
    L_0x007f:
        r8 = r8 + r11;
        goto L_0x006d;
    L_0x0081:
        r6 = -1;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.a(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static final kotlin.Pair<java.lang.Integer, java.lang.String> m68782b(@org.jetbrains.annotations.NotNull java.lang.CharSequence r10, java.util.Collection<java.lang.String> r11, int r12, boolean r13, boolean r14) {
        /*
        r0 = 0;
        if (r13 != 0) goto L_0x0035;
    L_0x0003:
        r1 = r11.size();
        r2 = 1;
        if (r1 != r2) goto L_0x0035;
    L_0x000a:
        r11 = (java.lang.Iterable) r11;
        r11 = kotlin.collections.C19299w.m68828f(r11);
        r11 = (java.lang.String) r11;
        if (r14 != 0) goto L_0x001f;
    L_0x0014:
        r4 = 0;
        r5 = 4;
        r6 = 0;
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r10 = kotlin.text.C19298r.m68744a(r1, r2, r3, r4, r5, r6);
        goto L_0x0029;
    L_0x001f:
        r4 = 0;
        r5 = 4;
        r6 = 0;
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r10 = kotlin.text.C19298r.m68773b(r1, r2, r3, r4, r5, r6);
    L_0x0029:
        if (r10 >= 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0034;
    L_0x002c:
        r10 = java.lang.Integer.valueOf(r10);
        r0 = kotlin.C15811g.m59834a(r10, r11);
    L_0x0034:
        return r0;
    L_0x0035:
        r1 = 0;
        if (r14 != 0) goto L_0x0048;
    L_0x0038:
        r12 = kotlin.ranges.C18464j.m66926c(r12, r1);
        r14 = new kotlin.ranges.c;
        r1 = r10.length();
        r14.<init>(r12, r1);
        r14 = (kotlin.ranges.C17565a) r14;
        goto L_0x0054;
    L_0x0048:
        r14 = kotlin.text.C19298r.m68791d(r10);
        r12 = kotlin.ranges.C18464j.m66927d(r12, r14);
        r14 = kotlin.ranges.C18464j.m66922a(r12, r1);
    L_0x0054:
        r12 = r10 instanceof java.lang.String;
        if (r12 == 0) goto L_0x00a2;
    L_0x0058:
        r12 = r14.m64208a();
        r1 = r14.m64209b();
        r14 = r14.m64210c();
        if (r14 <= 0) goto L_0x0069;
    L_0x0066:
        if (r12 > r1) goto L_0x00ef;
    L_0x0068:
        goto L_0x006b;
    L_0x0069:
        if (r12 < r1) goto L_0x00ef;
    L_0x006b:
        r2 = r11;
        r2 = (java.lang.Iterable) r2;
        r8 = r2.iterator();
    L_0x0072:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0090;
    L_0x0078:
        r9 = r8.next();
        r2 = r9;
        r2 = (java.lang.String) r2;
        r3 = 0;
        r4 = r10;
        r4 = (java.lang.String) r4;
        r6 = r2.length();
        r5 = r12;
        r7 = r13;
        r2 = kotlin.text.C19296q.m68674a(r2, r3, r4, r5, r6, r7);
        if (r2 == 0) goto L_0x0072;
    L_0x008f:
        goto L_0x0091;
    L_0x0090:
        r9 = r0;
    L_0x0091:
        r9 = (java.lang.String) r9;
        if (r9 == 0) goto L_0x009e;
    L_0x0095:
        r10 = java.lang.Integer.valueOf(r12);
        r10 = kotlin.C15811g.m59834a(r10, r9);
        return r10;
    L_0x009e:
        if (r12 == r1) goto L_0x00ef;
    L_0x00a0:
        r12 = r12 + r14;
        goto L_0x006b;
    L_0x00a2:
        r12 = r14.m64208a();
        r1 = r14.m64209b();
        r14 = r14.m64210c();
        if (r14 <= 0) goto L_0x00b3;
    L_0x00b0:
        if (r12 > r1) goto L_0x00ef;
    L_0x00b2:
        goto L_0x00b5;
    L_0x00b3:
        if (r12 < r1) goto L_0x00ef;
    L_0x00b5:
        r2 = r11;
        r2 = (java.lang.Iterable) r2;
        r8 = r2.iterator();
    L_0x00bc:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00dd;
    L_0x00c2:
        r9 = r8.next();
        r2 = r9;
        r2 = (java.lang.String) r2;
        r3 = r2;
        r3 = (java.lang.CharSequence) r3;
        r4 = 0;
        r6 = r2.length();
        r2 = r3;
        r3 = r4;
        r4 = r10;
        r5 = r12;
        r7 = r13;
        r2 = kotlin.text.C19298r.m68767a(r2, r3, r4, r5, r6, r7);
        if (r2 == 0) goto L_0x00bc;
    L_0x00dc:
        goto L_0x00de;
    L_0x00dd:
        r9 = r0;
    L_0x00de:
        r9 = (java.lang.String) r9;
        if (r9 == 0) goto L_0x00eb;
    L_0x00e2:
        r10 = java.lang.Integer.valueOf(r12);
        r10 = kotlin.C15811g.m59834a(r10, r9);
        return r10;
    L_0x00eb:
        if (r12 == r1) goto L_0x00ef;
    L_0x00ed:
        r12 = r12 + r14;
        goto L_0x00b5;
    L_0x00ef:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.b(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):kotlin.Pair<java.lang.Integer, java.lang.String>");
    }

    /* renamed from: a */
    public static final int m68739a(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        C2668g.b(charSequence, "$receiver");
        if (!z) {
            if (charSequence instanceof String) {
                return ((String) charSequence).indexOf(c, i);
            }
        }
        return C19298r.m68745a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static final int m68743a(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(str, ManagerWebServices.PARAM_TEASER_STRING);
        if (!z) {
            if (charSequence instanceof String) {
                return ((String) charSequence).indexOf(str, i);
            }
        }
        return C19298r.m68742a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: b */
    public static /* synthetic */ int m68771b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != null) {
            i = C19298r.m68791d(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C19298r.m68770b(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static final int m68770b(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        C2668g.b(charSequence, "$receiver");
        if (!z) {
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(c, i);
            }
        }
        return C19298r.m68774b(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static /* synthetic */ int m68773b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != null) {
            i = C19298r.m68791d(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C19298r.m68772b(charSequence, str, i, z);
    }

    /* renamed from: b */
    public static final int m68772b(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(str, ManagerWebServices.PARAM_TEASER_STRING);
        if (!z) {
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(str, i);
            }
        }
        return C19298r.m68741a(charSequence, (CharSequence) str, i, 0, z, true);
    }

    /* renamed from: b */
    public static final boolean m68785b(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (C19298r.m68744a(charSequence, (String) charSequence2, 0, z, 2, null) < null) {
                return false;
            }
        }
        if (C19298r.m68742a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m68783b(@NotNull CharSequence charSequence, char c, boolean z) {
        C2668g.b(charSequence, "$receiver");
        return C19298r.m68740a(charSequence, c, 0, z, 2, null) >= null ? true : null;
    }

    /* renamed from: a */
    private static final Sequence<C18461c> m68757a(@NotNull CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if ((i2 >= 0 ? 1 : null) != null) {
            return new C17636d(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$2(cArr, z));
        }
        charSequence = new StringBuilder();
        charSequence.append("Limit must be non-negative, but was ");
        charSequence.append(i2);
        charSequence.append(46);
        throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
    }

    /* renamed from: a */
    private static final Sequence<C18461c> m68761a(@NotNull CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if ((i2 >= 0 ? 1 : null) != null) {
            return new C17636d(charSequence, i, i2, new StringsKt__StringsKt$rangesDelimitedBy$4(C18456j.m66903a((Object[]) strArr), z));
        }
        charSequence = new StringBuilder();
        charSequence.append("Limit must be non-negative, but was ");
        charSequence.append(i2);
        charSequence.append(46);
        throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
    }

    @NotNull
    /* renamed from: a */
    public static final Sequence<String> m68763a(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(strArr, "delimiters");
        return C19155k.m68032e(C19298r.m68762a(charSequence, strArr, 0, z, i, 2, null), (Function1) new StringsKt__StringsKt$splitToSequence$1(charSequence));
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: b */
    public static final java.util.List<java.lang.String> m68780b(@org.jetbrains.annotations.NotNull java.lang.CharSequence r7, @org.jetbrains.annotations.NotNull java.lang.String[] r8, boolean r9, int r10) {
        /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "$receiver";
        kotlin.jvm.internal.C2668g.b(r7, r0);
        r0 = "delimiters";
        kotlin.jvm.internal.C2668g.b(r8, r0);
        r0 = r8.length;
        r1 = 1;
        if (r0 != r1) goto L_0x0022;
    L_0x000e:
        r0 = 0;
        r2 = r8[r0];
        r3 = r2;
        r3 = (java.lang.CharSequence) r3;
        r3 = r3.length();
        if (r3 != 0) goto L_0x001b;
    L_0x001a:
        r0 = 1;
    L_0x001b:
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r7 = kotlin.text.C19298r.m68755a(r7, r2, r9, r10);
        return r7;
    L_0x0022:
        r2 = 0;
        r5 = 2;
        r6 = 0;
        r0 = r7;
        r1 = r8;
        r3 = r9;
        r4 = r10;
        r8 = kotlin.text.C19298r.m68762a(r0, r1, r2, r3, r4, r5, r6);
        r8 = kotlin.sequences.C19155k.m68039j(r8);
        r9 = new java.util.ArrayList;
        r10 = 10;
        r10 = kotlin.collections.C18457p.m66906a(r8, r10);
        r9.<init>(r10);
        r9 = (java.util.Collection) r9;
        r8 = r8.iterator();
    L_0x0042:
        r10 = r8.hasNext();
        if (r10 == 0) goto L_0x0056;
    L_0x0048:
        r10 = r8.next();
        r10 = (kotlin.ranges.C18461c) r10;
        r10 = kotlin.text.C19298r.m68747a(r7, r10);
        r9.add(r10);
        goto L_0x0042;
    L_0x0056:
        r9 = (java.util.List) r9;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.b(java.lang.CharSequence, java.lang.String[], boolean, int):java.util.List<java.lang.String>");
    }

    @NotNull
    /* renamed from: a */
    public static final Sequence<String> m68759a(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        C2668g.b(charSequence, "$receiver");
        C2668g.b(cArr, "delimiters");
        return C19155k.m68032e(C19298r.m68758a(charSequence, cArr, 0, z, i, 2, null), (Function1) new StringsKt__StringsKt$splitToSequence$2(charSequence));
    }

    /* renamed from: a */
    private static final List<String> m68755a(@NotNull CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if ((i >= 0 ? 1 : null) == null) {
            charSequence = new StringBuilder();
            charSequence.append("Limit must be non-negative, but was ");
            charSequence.append(i);
            charSequence.append('.');
            throw ((Throwable) new IllegalArgumentException(charSequence.toString().toString()));
        }
        int a = C19298r.m68743a(charSequence, str, 0, z);
        if (a != -1) {
            if (i != 1) {
                Object obj = i > 0 ? 1 : null;
                int i3 = 10;
                if (obj != null) {
                    i3 = C18464j.m66927d(i, 10);
                }
                ArrayList arrayList = new ArrayList(i3);
                do {
                    arrayList.add(charSequence.subSequence(i2, a).toString());
                    i2 = str.length() + a;
                    if (obj != null && arrayList.size() == i - 1) {
                        break;
                    }
                    a = C19298r.m68743a(charSequence, str, i2, z);
                } while (a != -1);
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                return arrayList;
            }
        }
        return C15807n.m59826a(charSequence.toString());
    }

    @NotNull
    /* renamed from: b */
    public static final CharSequence m68775b(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "$receiver");
        int length = charSequence.length() - 1;
        int i = 0;
        Object obj = null;
        while (i <= length) {
            boolean a = C15875b.m59926a(charSequence.charAt(obj == null ? i : length));
            if (obj == null) {
                if (a) {
                    i++;
                } else {
                    obj = 1;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
