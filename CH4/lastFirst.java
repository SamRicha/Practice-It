/*
 *  Write a method named lastFirst that accepts a string as its parameter representing a person's first and last name. 
 *  The method should return the person's last name followed by the first initial and a period. For example, the 
 *  call lastFirst("Marla Singer") should return "Singer, M." . You may assume that the string passed consists of exactly 
 *  two words separated by a single space.
 */
 
public String lastFirst(String name){
    String lastName = "";
    int space = 0;
    while(name.charAt(space) != ' '){
        space++;        
    }
    for(int i = space + 1; i < name.length(); i++){
        lastName += name.charAt(i);
    }
    
    String nameEdit = lastName + ", " + name.charAt(0) + ".";
    return nameEdit;
}
