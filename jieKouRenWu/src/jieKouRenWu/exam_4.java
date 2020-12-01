package jieKouRenWu;

interface 禽流感信息上报{
	String message = "如实上报";
	String 感染人数(String shengFen, int num);
	String 死亡人数(String shengFen, int num);
	String 密切接触者人数(String shengFen, int num);
}

class jilin implements 禽流感信息上报{

	public char[] 感染人数;
	public char[] 死亡人数;
	public char[] 密切接触者人数;

	public String 感染人数(String shengFen,int num) {
	
		return shengFen+num;
	}

	public String 死亡人数(String shengFen,int num) {
		return shengFen+ num;
	}

	public String 密切接触者人数(String shengFen, int num) {
		return shengFen+num;
	}
	
}
public class exam_4 {

	public static void main(String[] args) {
          jilin person = new jilin();
          System.out.println(禽流感信息上报.message);
          System.out.println("感染人数：");
          System.out.println(person.感染人数("湖南省",20));
          System.out.println(person.感染人数("吉林省",20));
          System.out.println(person.感染人数("上海省",20));
          System.out.println("死亡人数：");
          System.out.println(person.死亡人数("湖南省",20));
          System.out.println(person.死亡人数("吉林省",20));
          System.out.println(person.死亡人数("上海省",20));
          System.out.println("密切接触者人数：");
          System.out.println(person.密切接触者人数("湖南省",20));
          System.out.println(person.密切接触者人数("吉林省",20));
          System.out.println(person.密切接触者人数("上海省",20));

	}

}
