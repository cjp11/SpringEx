package polymorphism02;

class SamsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() {
		System.out.println(">> SamsungTV2 객체 생성");
	}
	public SamsungTV(SonySpeaker speacker) {
		this.speaker = speacker;
		System.out.println(">> SamsungTV2(speacker) 객체 생성");
	}
	public SamsungTV(SonySpeaker speacker, int price) {
		this.speaker = speacker;
		this.price = price;
		System.out.println(">> SamsungTV2(speacker,price) 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV2 - 전원ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV2 - 전원OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV2 - 소리크게");
		speaker.volumnUp();
	}
	public void volumnDown() {
		System.out.println("SamsungTV2 - 소리작게");
		speaker.volumnDown();
	}
	//-----------------------
	@Override
	public String toString() {
		return "SamsungTV [speaker=" + speaker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
	
	//===========================
	public void initMethod() {
		System.out.println("SamsungTV2 - initMethod() 실행");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV2 - destroyMethod() 실행");
	}
}







