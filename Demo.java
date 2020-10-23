public class Demo{
  public static void printLoop(int n){
    for (int i=0; i<n; i++){
      for (int j=1; j<=(n-i); j++){
        System.out.print(i+1);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr){
    String ans="{";
    if (arr.length==0){
      return "{}";
    }
    for (int i=0; i<arr.length-1; i++){
      ans+=arr[i] + ", ";
    }
    ans+=arr[arr.length-1]+"}";
    return ans;
  }

  public static String arrayDeepToString(int[][]arr){
    String ans="{";
    for (int i=0; i<arr.length-1; i++){
      ans+=(arrToString(arr[i]));
      if (i!=arr.length-2){
        ans+=", ";
      }
    }
    ans+="}";
    return ans;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] arr= new int[rows+1][cols];
    for (int i=0; i<arr.length; i++){
      for (int j=0; j<arr[i].length; j++){
        arr[i][j]=(int)((maxValue+1) * Math.random());
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] arr= new int[rows+1][];
    for (int i=0; i<arr.length; i++){
      arr[i]=new int [(int)((cols+1) * Math.random())];
      for (int j=0; j<arr[i].length; j++){
        arr[i][j]=(int)((maxValue+1) * Math.random());
      }
    }
    return arr;
  }

  public static void main(String[] args){
    if (args.length!=0){
      printLoop(Integer.parseInt(args[0]));
    }else{
      printLoop(5);
    }

    //tests
    /*
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3, 4};
    int[] c = {1, 2, 3, 4, 5};
    int[] d = {1, 2, 3, 4, 5, 6};
    int[] e = {1, 2, 3, 4, 5, 6, 7};

    int[][] x = new int[a.length][b.length];
    x[0]=a;
    x[1]=b;

    System.out.println(arrToString(a));
    System.out.println(arrToString(b));
    System.out.println(arrToString(c));
    System.out.println(arrToString(d));
    System.out.println(arrToString(e));
    System.out.println(arrToString(x[1]));
    System.out.println(arrayDeepToString(x));
    System.out.println(arrayDeepToString(x).replace("}, ","},\n"));
    System.out.println(arrayDeepToString(create2DArray(4, 11, 5)).replace("}, ","},\n"));
    System.out.println(arrayDeepToString(create2DArrayRandomized(4, 5, 6)).replace("}, ","},\n"));
    */
  }
}
