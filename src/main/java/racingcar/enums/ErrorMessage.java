package racingcar.enums;

public enum ErrorMessage {
    BLANK_INPUT_NOT_ALLOWED("자동차 이름은 null, 빈문자열, 공백으로만 이루어진 문자열일 수 없습니다."),
    INVALID_TRY_COUNT("시도할 횟수는 양의 정수를 입력해야 합니다."),
    INVALID_NAME_LENGTH("자동차 이름은 5자 이하여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
