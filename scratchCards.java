/**
 *Takes three arguments:- 
 * claimValue - an int value representing the value claimed by the user in pounds
 * verificationCode - A String representing the verification code printed on the card
 * secretKey - a String representing the secret key used to validate the claim
 *
 * Iterates over the characters in the Strings adding the position of matches
 * and subtracting the position of mis-matches to determine the prize value
 * The claim is valid if the amount claimed is equal to the prize value determined.
 * Returns a boolean value true if the claim is valid and false otherwise.
 */
public boolean verifyWin(int claimValue, String verificationCode, String secretKey)
{
     int prize = 0;
    
     for(int i = 0; i < 6; i++)
           {
               if (verificationCode.charAt(i) == (secretKey.charAt(i))){

             prize = prize + (i + 1);

        }

         else

            {

               prize = prize - (i + 1);

            }

         }

     
     if(prize == claimValue){
          return true;
     }
     else {
         return false;
     }
}

//Tests

System.out.println(verifyWin(1, "HPKLTC", "FQRTKJ"));
System.out.println(verifyWin(1,"HPKLTC","HPKWTD"));
System.out.println(verifyWin(3,"FQXTKN","HPKWTD"));
System.out.println(verifyWin(3,"FQXTKN","FQRTKJ"));
System.out.println(verifyWin(5,"HPKLTC","FQRTKJ"));
System.out.println(verifyWin(5,"HPKLTC","FPRTTC"));
System.out.println(verifyWin(5,"HPKLTCQW","FPRTTCQQ"));