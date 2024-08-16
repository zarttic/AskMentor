package org.zartt.cloud.apis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.zartt.cloud.resp.ResultData;

/**
 * @author: zartt
 * @description: TODO
 */
@FeignClient(value = "cloud-gateway")
public interface MentorAPI_Ver1 {
    @GetMapping("/mentor/v1/list")
    ResultData getList();
}
