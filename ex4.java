public class ex4{
        public static void main(String[] args){
        int[][] arr=new int[5][5];
        
        
                        for(int i=0;i<arr.length;i++){
                            
                                for(int j=0;j<arr.length;j++){
                                        arr[i][j]=i+1;
                                        }
                                }
                for(int i=0;i<arr.length;i++){
                                for(int j=0;j<arr.length;j++){
                                        if(i==j || i+j==4 ){
                                                arr[i][j]=0;
                                                }
                                        }
                        }
                        for(int i=0;i<arr.length;i++){
                               System.out.print("[");
                                for(int j=0;j<arr.length;j++){
                                         System.out.print("{"+arr[i][j]+"}"+",");
                                        }
                                        System.out.print("]");
                                        System.out.println();
                                }
                
        
                
        }
}
