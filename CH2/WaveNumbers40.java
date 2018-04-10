// Write for loops to produce the following output, with each line 40 characters wide:

/*
* ----------------------------------------
* _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
* 1122334455667788990011223344556677889900
* ----------------------------------------
*/

public class WaveNumbers40 {
  public static void main (String[] args){
    int o = 0;
		int p = 0;
		int n = 0;
		int m = 0;
		
		for (int i = 1; i <= 40; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		
		for (int j = 1; j <= 40; j++) {
			if (j == 1 || j == o) {
				System.out.print("_");
				o = j + 4;
			}
			if(j % 2 == 0){
				System.out.print("-");
			}
			if(j == 3 || j == p){
				System.out.print("^");
				p = j + 4;
			}
		}
		
		System.out.println();
		
		for(int y = 1; y <= 39; y++){
			if(y == 1 ||  y % 2 == 0){
				
				n++;
				
				if(n == 10){
					n = 0;
				}
				
				System.out.print(n);
				System.out.print(n);
				
				m = y + 2;
			}
			
		}
		
		System.out.println();
		
		for (int i = 1; i <= 40; i++) {
			System.out.print("-");
		}
  }
}
