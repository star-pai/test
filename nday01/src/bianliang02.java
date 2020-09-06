/*注意事项：1.在同一个函数中，变量名不能重复；
 *2.必须对变量名赋值，才能使用；
 *3.对long 类型的变量，需在变量值后面加L;否则系统会默认为
 *给的变量为int型，而导致数据溢出；
 *4.对于foalt类型，需要值后面加f,否则系统默认值为double，而导致类型不兼容;
 
 * */
public class bianliang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//定义byte类型的变量
		byte a=10;
		System.out.println(a);
		//定义short类型的变量
		short  s=100;
				System.out.println(s);
	    //定义int类型的变量
				int i=10000;
				System.out.println(i);
		//定义double类型的变量
				double d=13.14;
				System.out.println(d);
		//定义char类型的变量
				char c='a';
				System.out.println(c);
		//定义boolean类型的变量
				boolean b=true;
				System.out.println(b);
	}

}
