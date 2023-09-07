public class ex2{
        public static void main(String[] args){
        int[][] arr=new int[5][5];
        int index1=0;
		int index2=0;
		int small=0;
                        for(int i=0;i<5;i++){
                            int count =50;
                                for(int j=0;j<5;j++){
										count-=10;
                                        arr[i][j]=7*(j+1)+i*j+count;;
                                        }
                                }
				small = arr[0][0];
                for(int i=0;i<5;i++){
                                for(int j=0;j<5;j++){
                                        if(arr[i][j]<small){
                                                small = arr[i][j];
												index1=i;
												index2=j;
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
                
        
                System.out.println("the smalles num is: "+ small);
				System.out.println("the index of smallest number is :"+index1+index2);
        }
}
