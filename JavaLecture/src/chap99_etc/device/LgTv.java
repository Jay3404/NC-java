package chap99_etc.device;

public class LgTv implements Tv{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("LG 티비를 전시합니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LG 티비의 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LG 티비의 전원을 끕니다.");
	}

	@Override
	public void Speaker() {
		// TODO Auto-generated method stub
		System.out.println("LG 티비의 소리를 조절합니다.");
	}

	@Override
	public void changeChannel() {
		// TODO Auto-generated method stub
		System.out.println("LG 티비의 채널을 바꿉니다.");
	}

}
