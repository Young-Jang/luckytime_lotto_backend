package luckytime.lotto.infrastructure;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import luckytime.config.FeignClientConfiguration;
import luckytime.lotto.domain.repository.LottoRepository;

@FeignClient(name = "getLottoNumber", url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber",configuration = FeignClientConfiguration.class)
public interface LottoFeignClient extends LottoRepository {
    @GetMapping()
    String getLottoNum(@RequestParam("drwNo") int drwNo);
}
