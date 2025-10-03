

public static void main(String[] args) {
    List<Integer>ls=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter target :");
    int target=scanner.nextInt();


    System.out.println("Enter number -1000 to stop");

    while(true){
        int n=scanner.nextInt();
        if(n==-1000){break;}
        ls.add(n);

    }
    Collections.sort(ls);


    int left=0,right=ls.size()-1;
    while(left<right){
        int sum=ls.get(left)+ls.get(right);
        if(sum==target){
            System.out.println(ls.get(left) + " " + ls.get(right));
            break;
        }


        if(sum<target){
            left++;
        }
        else{
            right--;
        }
    }




}
