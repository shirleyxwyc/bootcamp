public class DemoForloop {
    public static void main(String[] args) {
        //2^3=16
        int base =2;
        int value=2;
        for(int i = 0; i<3; i++) {
        value = value * base;
        }
        System.out.println(value);

        int num1 = 9;
        int num2 =17;
        int max =num1;
        if(max<num2){
            max=num2;
        }else{
            max=num1;
        }
        System.out.println("maxium no is" +max);

        //0-100, find the largest odd number, which is < 90-->89
        int maxOdd = -1;
        for(int i=0; i<=100; i++) {
            if(i % 2 == 1 && i<90 && i>maxOdd) {
                maxOdd=i;                    
            }
               } 
               System.out.println("the max odd less than 90 is " +maxOdd);
    
    //0-20, sum up all even numbers
    //0+2+4..20
    int sum = 0;
        for(int i=0; i<=20; i++) {
        if(i%2== 0){
            sum = sum + i;
        }
    }
    System.out.println(sum);

    //0-30, if<20, sum up odd numbers, if>=20, sum up even numbers

    int box = 0;
    for(int i=0 ; i <= 30; i++) {
        if(i<20){
            if(i%2==1){
            box = box + i;
            }
    }else{ //>=20
        if(i%2==0){
            box = box + i;
    }
}
    }
    System.out.println(box);

    //searching
    String s1 = "welcome to Bootcamp.";
    //1.find the no. of o
    int count=0;
    for(int i=0; i<s1.length();i++){
        if(s1.charAt(i)=='o'){
            count++;
        }
    }
    System.out.println("the no. of o in welcome to Bootcamp is " + count);

    //Approach 1: simple if
    for(int i=0; i<3; i++){
        System.out.println(i);//0,1,2
    }

    //Approach 2: 
    //continue //!see notes 5-loop--> better approach to be used when you need to filtered out some special conditions
   
    for(int i=0; i<3; i++){
        if(i%2==1){ //skip the rest of code outside code block{} and goes to i++, 0,2 (skip odd)
            continue;
        }
        if(i>100);{
            continue;
        }
        System.out.println(i); //0,2
    }

    //! for + break eg., there are 100 cutomers, break out once you find 1 customer who wear glasses
    //Approach 1 : simple if
    for(int i=0; i<3; i++){
        if(i<2){
            System.out.println(i); //0,1
        }
    }

    //Approach 2 : break
    for(int i=0; i<3; i++) {
        if(i>=2) {
            break; //skip
        }
    }



   
    }
}
