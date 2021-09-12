package chap06.Inheritance_01;

import org.omg.CORBA.PUBLIC_MEMBER;

class Speaker{
    private int volumeRate;

    public void showCurrentState() {
        System.out.println("볼륨 크기 : "+volumeRate);   // 10
    }

    public void setVolume(int vol) {
        volumeRate=vol;
    }
}

class BaseEnSpeaker extends Speaker{
    private int baseRate;

        public void showCurrentState() {
        super.showCurrentState();   // 중요 (외워라) , 오버라이딩 이면 무조건 자식이 먼저
        System.out.println("베이스 크기 : "+baseRate);   // 20
    }

    public void setBaseRate(int base) {
        baseRate=base;
    }
}

public class Overriding_09 {

    public static void main(String[] args) {
        BaseEnSpeaker bs=new BaseEnSpeaker();
        bs.setVolume(10);
        bs.setBaseRate(20);
        bs.showCurrentState();

    }
}


