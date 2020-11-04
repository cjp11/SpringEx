package polymorphism01;

class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println(">> SamsungTV2 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV2 - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV2 - 전원OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV2 - 소리크게");
	}
	public void volumnDown() {
		System.out.println("SamsungTV2 - 소리크게");
	}
	
	//===========================
	public void initMethod() {
		System.out.println("SamsungTV2 - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV2 - destroyMethod() 실행");
	}
}







