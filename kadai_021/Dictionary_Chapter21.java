package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String,String> dict = new HashMap<String,String>();
	
//	辞書に英単語をキーとして意味を追加（セット）
	Dictionary_Chapter21(){
		dict.put("apple", "りんご");
		dict.put("peach", "桃");
		dict.put("banana", "バナナ");
		dict.put("lemon", "レモン");
		dict.put("pear", "梨");
		dict.put("kiwi", "キウイ");
		dict.put("strawberry", "いちご");
		dict.put("grape", "ぶどう");
		dict.put("muscat", "マスカット");
		dict.put("cherry", "さくらんぼ");
	}
	
//	辞書を調べるメソッド。登録されていないものはその旨を出力する。
	public void getMeaning(String word[]) {
		for(String str : word) {
			if(dict.get(str) == null) {
				System.out.println(str + "は辞書に存在しません");
			}else {
				System.out.println(str + "の意味は" + dict.get(str));
			}
		}
	}
}
