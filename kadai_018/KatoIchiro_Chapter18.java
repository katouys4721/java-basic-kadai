package kadai_018;

//加藤一郎を表すクラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
//	名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "一郎";
	}
	
//	個別の自己紹介実装
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}
