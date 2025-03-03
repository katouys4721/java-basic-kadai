package kadai_018;

public abstract class Kato_Chapter18 {
//	姓を表す
	public String familyName = "加藤";
//	名を表す
	public String givenName;
//	住所を表す
	public String address = "東京都中野区〇×";
	
//	共通の紹介を出力
	public void commonIntroduce() {
		System.out.println("住所は" + address + "です");
	}
	
//	個別の紹介を出力
	abstract public void eachIntroduce();
	
//	紹介を実行する
	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		commonIntroduce();
		eachIntroduce();
	}
}
