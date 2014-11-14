package game;

/**
 * Word文档
 * @author lujiabin
 * @since 2014-11-14
 */
public class Six {
	public static void main(String[] args) {
		long sum = 0;
		for(int i=1;i<=10000;i++){
			int j = i;
			int tmp = 0;
			while(j/10 != 0){
				if(j%10 != 0){
					if(tmp == 0){
						tmp = j%10;
					}else{
						if(tmp<10){
							tmp = (j%10)*10+tmp;
						}else if(tmp<100){
							tmp = (j%10)*100+tmp;
						}else if(tmp<1000){
							tmp = (j%10)*1000+tmp;
						}
					}
				}else{
					sum += tmp;
					tmp = 0;
				}
				j /= 10;
			}
			
			if(tmp == 0){
				tmp = j;
			}else{
				if(tmp<10){
					tmp = j*10+tmp;
				}else if(tmp<100){
					tmp = j*100+tmp;
				}else if(tmp<1000){
					tmp = j*1000+tmp;
				}
			}
			sum += tmp;
		}
		System.out.println("The sum is:"+sum);
	}
}
