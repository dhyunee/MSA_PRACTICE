package com.example.msa_service1.user.dto;

import com.example.msa_service1.user.common.code.ResultEnum;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResultDto<T> {
    private T data;
    private ResultEnum result;

    public static <T> ResultDto<T> of(T data, ResultEnum result) {
        return new ResultDto<>(data,result);
    }

    public static <T> ResultDto<T> of(T data) {
        return new ResultDto<>(data, ResultEnum.SUCCESS);
    }

    public static ResultDto<Boolean> ofSuccess() {
        return new ResultDto<>(Boolean.TRUE, ResultEnum.SUCCESS);
    }

    public static ResultDto<Boolean> ofFail() {
        return new ResultDto<>(Boolean.FALSE, ResultEnum.FAIL);
    }

}
