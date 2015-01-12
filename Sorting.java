  public class Sorting {
  public static void main(String arg[])throws Exception{
  int j[]={1,28,3,4,2};   //declaring array with disordered values  

  for(int s=0;s<=j.length-1;s++){
  for(int k=0;k<=j.length-2;k++){
         if(j[k]>j[k+1]){   //comparing array values

    int temp=0;    
    temp=j[k];     //storing value of array in temp variable 

j[k]=j[k+1];    //swaping values
j[k+1]=temp;    //now storing temp value in array


}    //end if block             
}  // end inner loop    
}
//end outer loop

for(int s=0;s<=j.length-1;s++){
System.out.println(j[s]);       //retrieving values of array in ascending order 

}   

}
}