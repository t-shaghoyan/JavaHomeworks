public class ex8{
        public static void main(String[] args){
        int[][] arr=new int[5][5];
        int sum=0;
        


                        for(int i=0;i<arr.length;i++){
                                int count=1;
                                for(int j=0;j<arr.length;j++){
                                        arr[i][j]=i+count;
                                        count++;
                                        }
                                }

                        for(int i=0;i<arr.length;i++){
                            for(int j=0;j<arr[i].length;j++){
                                if(i<j){
                                   sum+=arr[i][j];

                                }
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
                        System.out.println(" sum is :"+sum);

                        }
       

}
