package labcqrssummarize.domain;

import java.util.*;
import labcqrssummarize.domain.*;
import labcqrssummarize.infra.AbstractEvent;
import lombok.*;
//이전 도메인 EVENT
@Data
@ToString
public class RequestPublish extends AbstractEvent {

    private Long id;
}
