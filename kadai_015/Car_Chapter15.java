package kadai_015;

public class Car_Chapter15 {
	private int gear;
	private int speed;
	
	Car_Chapter15(){
//		1速から5速のギアを表す
		this.gear = 1;
//		ギアチェンジ後の速度を表す
		this.speed = 10;
	}
	
//	ギアの値により速度を変える
	public void gearChange(int afterGear) {
		int beforeGear = gear;
		
//		ギアの値変更
		gear = afterGear;
//		速度の変更
		switch(gear) {
		case 1: speed = 10;	break;
		case 2: speed = 20; break;
		case 3: speed = 30; break;
		case 4: speed = 40; break;
		case 5: speed = 50; break;
		default: speed = 10;
		}
		
		System.out.println("ギア" + beforeGear + "から" + gear 
				+ "に切り替えました。");
	}
	
//	ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "です。");
	}
}
