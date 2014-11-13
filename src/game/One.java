package game;

/**
 * 两基数
 * @author lujiabin
 * @since 2014-11-13
 */
public class One {

	public static void main(String[] args) {
		int dec;
		int nine;
		for(int x = 1;x<=9;x++){
			for(int y = 0;y<=9;y++){
				for(int z = 1;z<=9;z++){
					dec = 100*x+10*y+z;
					nine = 81*z+9*y+x;
					if(dec == nine){
						System.out.println("The answer is:X="+x+",Y="+y+",Z="+z);
						break;
					}
				}
			}
		}
	}

}
