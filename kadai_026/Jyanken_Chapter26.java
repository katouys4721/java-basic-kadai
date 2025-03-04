package kadai_026;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	private String[] hand = {"r", "s", "p"};
	
//	自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		String result = null;
		Scanner scan = new Scanner(System.in);
//		有効な手かどうか判定
		boolean isValidHand = false;
		
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		while(!isValidHand) {
			try {
//				コンソールの入力を取得
				String myHand = scan.next();
				isValidHand = myHand.equals(hand[0]) || myHand.equals(hand[1]) || myHand.equals(hand[2]);
//				正しいじゃんけんの手であるか判定
				if(isValidHand) {
					result = myHand;
					break;
				}else {
					throw new NoSuchElementException();
				}
			
			}catch(NoSuchElementException e) {
				System.out.println("正しいじゃんけんの手を入力してください。");
			}
		}
		
		scan.close();
		return result;
	}
	
//	対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String enemyHand = null;
		
//		乱数生成して対戦相手のじゃんけんの手を選ぶ
		switch( (int)Math.floor(Math.random() * 3) ) {
		case 0: enemyHand = hand[0]; break;
		case 1: enemyHand = hand[1]; break;
		case 2: enemyHand = hand[2]; break;
		}
		
		return enemyHand;
	}
	
//	じゃんけんを行うメソッド
	public void playGame(String myHand, String enemyHand) {
		HashMap<String,String> handMap = new HashMap<String,String>();
//		HashMapの初期化
		handMap.put(hand[0], "グー");
		handMap.put(hand[1], "チョキ");
		handMap.put(hand[2], "パー");
		
		System.out.println("自分の手は" + handMap.get(myHand) + ",対戦相手の手は" + handMap.get(enemyHand));
		
		if(myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		}else if((myHand.equals(hand[0]) && enemyHand.equals(hand[1])) ||
				(myHand.equals(hand[1]) && enemyHand.equals(hand[2])) ||
				(myHand.equals(hand[2]) && enemyHand.equals(hand[0])) ) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}
}
