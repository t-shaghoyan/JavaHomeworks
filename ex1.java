
public class ex1{
        public static void main(String[] args){
        int[][] arr = new int[5][5];
        int larg = 0;
                        
						for(int i = 0;i < 5; i++) {
                            
                                for(int j = 0;j < 5; j++) {
                                        arr[i][j] = i * j + 12;
                                        }
                                }
                for(int i = 0; i < 5; i++) {
                                for(int j = 0; j < 5; j++) {
                                        if(arr[i][j] > larg){
                                                larg = arr[i][j];
                                                }
                                        }
                        }
                        for(int i = 0; i < 5 ; i++) {
                               System.out.print("[");
                                for(int j = 0; j < 5; j++) {
                              System.out.print("{"+arr[i][j]+"}"+",");
                                        }
                                        System.out.print("]");
                                        System.out.println();
                                }
                System.out.println("the biggest num is: "+ larg);
        }
}

