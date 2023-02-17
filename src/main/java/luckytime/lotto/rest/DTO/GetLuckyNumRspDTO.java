package luckytime.lotto.rest.DTO;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GetLuckyNumRspDTO {
    private String luckyNumber;
}
