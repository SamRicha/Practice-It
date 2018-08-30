/*
 *  Write a method named tax that accepts a salary as a parameter and that returns the amount of tax you 
 *  would owe if you make that salary. The tax is based on your tax bracket as found from the first two 
 *  columns below. Once you know which row to use, start with the "flat amount" and add the "plus %" of 
 *  the amount over the amount listed in the final column. For example, if your income is $50,000, then 
 *  you use the third row of the table and compute the tax as $4,000 plus 25% of the amount over $29,050, 
 *  which comes to $9,237.50. The total tax on $27,500 is $3,767.50. For $6,000, the tax is $600. For $120,000, 
 *  the tax is $28,227. Assume your method is passed a value >= 0.
 *  
 *  over	but not over	flat amount	plus %	of excess over
 *  $0	$7,150	$0	10%	$0
 *  $7150	$29,050	$715	15%	$7,150
 *  $29,050	$70,350	$4000	25%	$29,050
 *  $70,350	unlimited	$14,325	28%	$70,350
 */
 
public double tax(int salary){
    double taxAmount = 0;
    int flatAmount1 = 0;
    int flatAmount2 = 715;
    int flatAmount3 = 4000;
    int flatAmount4 = 14325;
    double plusPercent1 = .1;
    double plusPercent2 = .15;
    double plusPercent3 = .25;
    double plusPercent4 = .28;
    int excess1 = 0;
    int excess2 = 7150;
    int excess3 = 29050;
    int excess4 = 70350;
    if(salary >= 0 && salary <= 7150){
        taxAmount =  flatAmount1 + ((salary - excess1) * plusPercent1); 
    }else if(salary >= 7150 && salary <= 29050){
        taxAmount =  flatAmount2 + ((salary - excess2) * plusPercent2);
    }else if(salary >= 29050 && salary <= 70350){
        taxAmount = flatAmount3 + ((salary - excess3) * plusPercent3);
    }else if(salary >= 70350){
        taxAmount = flatAmount4 + ((salary - excess4) * plusPercent4);
    }
    return taxAmount;
}
