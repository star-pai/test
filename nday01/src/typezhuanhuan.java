/*类型转换：
 * 一.类型转换分类：
 * 1.自动类型转换：把一个表示数据范围小的数值或变量赋值给另一个表示数据范围大的变量
 *   如：double d=10;
 *   数据范围从小到大：byte<short<int<long<float<double
 *                char<int<long<float<double----byte和short不能转换为char
 * 2.强制类型转换：把一个数据范围大的数值或变量赋值给另一个表示数据范围小的变量 
             格式：目标数据类型变量名=（目标数据类型）值或变量；
      int k=(int)88.88          
 * 
 * */
public class typezhuanhuan {
	public static void main(String [] args){
		//自动类型转换
		double d=10;
		System .out.println(d);
		//定义byte类型的变量
		byte b=10;
		short s=b;
		int i=s;
		System .out.println(i);
		
		//这是不可以的，类型不兼容
		//char c=b;
		
		//强制类型转换
		  int k=(int)88.88 ;
		  System .out.println(k);
		
		
		
		
		
		
	}

}
