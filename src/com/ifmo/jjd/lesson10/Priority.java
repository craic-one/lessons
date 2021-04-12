package com.ifmo.jjd.lesson10;

public enum Priority {
    //Priority могут использовать другие, а Country только Article
    HIGH(10), MIDDLE(5), LOW(1);

    private int code; // свойста отвечают за дополнительную информацию Объекта

    Priority(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
