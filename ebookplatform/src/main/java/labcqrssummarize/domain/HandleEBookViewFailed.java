package labcqrssummarize.domain;

import java.time.LocalDate;
import java.util.*;
import labcqrssummarize.domain.*;
import labcqrssummarize.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class HandleEBookViewFailed extends AbstractEvent {

    private Integer pid;
    private List<String> ebooks;
    private Date registeredAt;
    private Integer price;
    private String userId;  // 추가

    public HandleEBookViewFailed(EBookPlatform aggregate) {
        super(aggregate);
        this.pid = aggregate.getPid();
        this.ebooks = aggregate.getEbooks();
        this.registeredAt = java.sql.Timestamp.valueOf(java.time.LocalDateTime.now());
        this.price = aggregate.getPrice();
        // userId는 이벤트 발행 시 별도 setUserId()로 설정
    }

    public HandleEBookViewFailed() {
        super();
    }
}

//>>> DDD / Domain Event
