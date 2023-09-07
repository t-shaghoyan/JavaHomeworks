public class ex7{
        public static void main(String[] args){
        int[][] arr=new int[5][5];
        // int length=arr.length;
        
        
                        for(int i=0;i<arr.length;i++){
                                int count=0;
                                for(int j=0;j<arr.length;j++){
                                        arr[i][j]=i+count;
                                        count++;
                                        }
                                }
                              
                        // for(int i=0;i<arr.length;i++){
                        //     for(int j=0;j<arr.length;j++){
                        //         if(i==j){
                        //             int swap=arr[i][j];
                        //             arr[i][j]=arr[i][length-1-j];
                        //             arr[i][length-1-j]=swap;
                                    
                        //         }
                        //     }
                        // } 
                        reverse(arr);
                
                        for(int i=0;i<arr.length;i++){
                            System.out.print("[");
                                for(int j=0;j<arr.length;j++){
                                        System.out.print(arr[i][j]+" ");
                                        }
                                        System.out.print("]");
                                        System.out.println();
                        }
                       
                                      
                        }
        public static void reverse(int[][] arr){
            int length=arr.length;
                    for(int i=0;i<arr.length;i++){
                            for(int j=0;j<arr.length;j++){
                                if(i==j){
                                    int swap=arr[i][j];
                                    arr[i][j]=arr[i][length-1-j];
                                    arr[i][length-1-j]=swap;
                                    
                                }
                            }
                        }  
        }
                              
}
