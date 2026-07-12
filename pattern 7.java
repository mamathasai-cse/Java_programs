class Solution {
    public void pattern7(int n) {
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=n;j>i;j--)
            {
            System.out.print(" ");
            }
            
                for(k=1;k<=2*i-1;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
