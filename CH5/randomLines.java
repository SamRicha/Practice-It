/*
 *  Write a method called randomLines that prints between 5 and 10 random strings of letters (between "a" and "z"), one per 
 *  line. Each string should have random length of up to 80 characters.
 *  
 *  rlcuhubm
 *  ilons
 *  ahidbxonunonheuxudxrcgdp
 *  xmkmkmmmmwmwqjbaeeeerceheelciheihcreidercdeehiuhhhn
 *  hdcrphdidcrydxgtkdhoendgcidgxfidgfufdgfuuuuuu
 *  (Because this problem uses random numbers, our test cases check only the general format of your output. You must 
 *  still examine the output yourself to make sure the answer is correct.)
 */

public static void randomLines(){
    Random rand = new Random();
    int counter1 = 0;
    int counter2 = 0;
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    int rowCount = rand.nextInt(5)+6;
    int coulumnCount = rand.nextInt(81);
    int alphabetPicker = rand.nextInt(27);
    char letter = 'x';
    while(counter1 < rowCount){ 
        while(counter2 < coulumnCount){
            alphabetPicker = rand.nextInt(26);
            letter = alphabet.charAt(alphabetPicker);
            if(counter2 == coulumnCount - 1){
                System.out.println(letter);
                counter2 ++;
            }else{
                System.out.print(letter);
                counter2 ++;
            }
        }
        counter2 = 0;
        counter1++;
    }
}
