public class ex6{
        public static void main(String[] args){
        int[][] arr=new int[5][5];
        int[] sum=new int[25];
        
        
                        for(int i=0;i<arr.length;i++){
                            
                                for(int j=0;j<arr.length;j++){
                                        arr[i][j]=i+1;
                                        }
                                }
                                
                for(int i=0;i<arr.length;i++){
                                for(int j=0;j<arr.length;j++){
                                
                                    sum[i*arr.length+j]=arr[i][j];
                                
                                        }
                        }
                        for(int i=0;i<arr.length;i++){
                            System.out.print("[");
                                for(int j=0;j<arr.length;j++){
                                        System.out.print(arr[i][j]+" ");
                                        }
                                        System.out.print("]");
                                        System.out.println();
                        }
                        for(int k=0;k<sum.length;k++){
                                        System.out.print(sum[k]+" ");
                                        }
                                       
                                      
                        }
                              
                          
                            
                
        
                
        
}
