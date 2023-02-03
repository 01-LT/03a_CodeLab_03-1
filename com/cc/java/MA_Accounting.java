package com.cc.java;

public class MA_Accounting extends Mitarbeiter {
    

public MA_Accounting(String lastName, String firstName, int dateOfBirth ) {
    super(lastName, firstName, dateOfBirth);
}

public String doYourWork(String flag) {
   switch (flag) {
        case "#firstName":
          return getFirstName();
        case "#lastName":
          return getLastName();
        case "#dateofBirth":
          return String.valueOf(getDateOfBirth());
    default:
        return "ERROR";
   } 
}
}

