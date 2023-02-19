package luckytime.lotto.rest.DTO;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class GetLuckyNumRspDTO {
    private List<String> luckyNumber;
}
