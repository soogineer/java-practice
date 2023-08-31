package sec5.chap06.ex01;

import sec5.chap05.ex02.Button;

public class ToggleButton extends Button {
    private boolean on;

    public ToggleButton(String print, boolean on) {
        super(print);
        this.on = on;
    }

    @Override
    public void func() {
        super.func(); // 💡 부모에서 정의한 메소드 호출
        this.on = !this.on;
        System.out.println(
                "대문자입력: " + (this.on ? "ON" : "OFF")
        );
    }
}