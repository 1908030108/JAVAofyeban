package jieKouRenWu;

interface 物价{
	String MESSAFE ="2020年5月1日前信息如实上报";
	public String 收费(String name,double money);
}
class 公交公司 implements 物价{
      
	//公交公司的名字，付费
	public String 收费(String name, double money) {
		
		return (name +"的费用是" + money + "￥");
	}

}
	

class 学校 implements 物价{
	public String 收费(String name, double money) {
		 
		return (name + "的费用是" + money + "￥");
	}
}
public class exam_3 {

	public static void main(String[] args) {
		System.out.println(物价.MESSAFE);
		公交公司 G = new 公交公司();
	     学校 S = new 学校();
	     String baiYangTian = "baiYangTian";
		   System.out.println(G.收费(baiYangTian,20));
		 String taoLin = "toaLin";
		   System.out.println(S.收费(taoLin,2000));
	}

}
