public class ex3{
        public static void main(String[] args){
        		
				int[][] arr=new int[5][5];
        		int count=0;
				int[] even= new int[25];
                        for(int i=0;i<5;i++){
                            int num =50;
                                for(int j=0;j<5;j++){
                                                                     num-=10;
                                        arr[i][j]=7*(j+1)+i*j+num;;
                                        }
                                }
              
                for(int i=0;i<5;i++){
                                for(int j=0;j<5;j++){
                                        if(arr[i][j]%2==0){
                                                even[count]=arr[i][j];
                                                count++;
                                                }
                                        }
                        }
                        for(int i=0;i<5;i++){
                               System.out.print("[");
                                for(int j=0;j<5;j++){
                                         System.out.print("{"+arr[i][j]+"}"+",");
                                        }
                                        System.out.print("]");
                                        System.out.println();
                                }
						for(int i=0;i<count;i++){
							System.out.print("["+even[i]+"]");
							}

                
        }
}
