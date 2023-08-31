package sec5.chap06.ex01;

import sec5.chap05.ex02.Button;

public class ShutDownButton extends Button {
    public ShutDownButton () {
        super("ShutDown"); // 💡 부모의 생성자 호출
    }

    //  💡 부모의 메소드를 override
    @Override
    public void func () {
        System.out.println("프로그램 종료");
    }
}
