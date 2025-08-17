package com.example.msa_service1.user.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@RequiredArgsConstructor
public enum ErrCode {
        ERROR_NAME(NOT_FOUND, "에러 메세지 입니다")

        /* 409 CONFLICT : Resource 의 현재 상태와 충돌. 보통 중복된 데이터 존재 */,
        DUPLICATE_RESOURCE(CONFLICT, "데이터가 이미 존재합니다"),
        MISMATCH_REQUEST(BAD_REQUEST, "데이터 간 의미가 어긋납니다 (예: 공통코드와 대응되는 데이터)"),

        FEED_LIKE_DUPLICATE(CONFLICT, "피드 좋아요가 이미 추가되었습니다."),

        /* 400 BAD REQUEST : 잘못된 요청. 입력된 데이터에 문제가 있음 */
        PASSWORD_NOT_MATCH(BAD_REQUEST, "패스워드가 일치하지 않습니다."),
        FILE_IS_EMPTY(BAD_REQUEST, "업로드 파일이 비어있습니다."),
        FILE_IS_NOT_IMAGE(BAD_REQUEST, "업로드 파일의 형식이 이미지 파일 확장자가 아닙니다."),
        DIARY_SET_ADDITION_PROHIBITED(BAD_REQUEST, "해당 관찰 일지는 더이상 일지를 추가할 수 없습니다."),

        /* 401 UNAUTHORIZED : 권한 인증 문제. JWT 토큰과 관련된 에러 */
        UNAUTHORIZED_USER(UNAUTHORIZED, "권한이 허용되지 않은 유저입니다."),

        TOKEN_ERROR(UNAUTHORIZED, "토큰에 문제가 있습니다."),
        ACCESS_TOKEN_EXPIRED(UNAUTHORIZED, "토큰의 유효기간이 만료되었습니다."),
        ACCESS_TOKEN_NOT_FOUND(UNAUTHORIZED, "액세스 토큰이 존재하지 않습니다."),
        REFRESH_TOKEN_NOT_FOUND(UNAUTHORIZED, "리프레시 토큰이 존재하지 않습니다."),
        ACCESS_TOKEN_ERROR(UNAUTHORIZED, "액세스 토큰에 문제가 있습니다."),
        REFRESH_TOKEN_ERROR(UNAUTHORIZED, "리프레시 토큰에 문제가 있습니다."),

        /* 403 FORBIDDEN : 접근 권한 없음 */
        NO_ACCESS(FORBIDDEN, "페이지에 대한 접근 권한이 없습니다."),

        /* 404 NOT_FOUND : 대상이 존재하지 않음 */
        ENTITY_NOT_FOUND(NOT_FOUND, "엔티티가 존재하지 않습니다."),
        USER_NOT_FOUND(NOT_FOUND, "대상이 존재하지 않습니다.");

        private final HttpStatus httpStatus;
        private final String message;
    }
