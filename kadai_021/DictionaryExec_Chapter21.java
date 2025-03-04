package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		辞書クラスのインスタンス生成
		Dictionary_Chapter21 myDict = new Dictionary_Chapter21();
//		調べる英単語を配列にセット
		String[] word = {"apple","banana","grape","orange"};
		
//		辞書を英単語毎調べる
		myDict.getMeaning(word);
	}

}
