import java.util.*;
public class BankAccount{


private String account_number;
private double checking_balance;
private double saving_balance;

public static int accounts_number = 0;
public static int total_amount=0;


private String gRandom() {
    String g="";
    for(int i = 0;i<10;i++){
        Random r = new Random();


        g+=r.nextInt(9);




    }


return g ; 

}

public BankAccount(){

this.account_number=gRandom();
accounts_number++;


}

public double getCheckingBalance(){


return checking_balance;


}

public double getSavingBalance(){


return saving_balance;
}


public void deposit(char a, int amount){

if (a == 'c'){


this.checking_balance+=amount;
total_amount+=amount;

}


 if(a=='s'){
this.saving_balance+=amount;
total_amount+=amount;
 }




}

public void withdraw(char c,int amount){




if (c == 'c'){

if (checking_balance>amount){
this.checking_balance-=amount;
total_amount-=amount;
}
}


 if(c=='s'){
     if(saving_balance>amount)
     {
this.saving_balance-=amount;
total_amount-=amount;
     }
 }
}
public void viewBalance(char c){


    if (c=='s'){


        System.out.println("your saving balance is "+saving_balance);
    }

    else if(c=='c'){

System.out.println("your checking balance is "+checking_balance);

        
    }




}


}