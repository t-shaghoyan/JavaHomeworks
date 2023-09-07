public class ex11{
        public static void main(String[] args){
        
  		/*      
                int arr[]={1,6,2,5,10,4,4,5,2,1,6};
                int sumOfIndex=0;


        for (int i = 0; i < arr.length; i++) {
               sumOfIndex += i;
               for(int k = 0;k < arr.length; k++) {
                   if(arr[i] == arr[k] && i != k) {
                       sumOfIndex -= k;
                   }
               }
			}
           System.out.print("[");                     
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+",");
			}
			System.out.print("]");
			System.out.println();

        System.out.print("the single element is: "+" "+arr[sumOfIndex]);
   		System.out.println();
*/		
	//XOR version
		
		int arr1[]={1,6,2,5,10,4,4,5,2,1,6};
                int single=0;


        for (int i = 0; i < arr1.length; i++) {
              single ^=arr1[i];
                        }
           System.out.print("[");
                for(int i =0;i<arr1.length;i++){
                        System.out.print(arr1[i]+",");
                        }
                        System.out.print("]");
                        System.out.println();

        System.out.print("the single element is: "+" "+single);
                System.out.println();




   
	 }

                      
       
}

