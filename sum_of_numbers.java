class sum_of_numbers
{
    public static void main(String args[])
    {
        int[] val = {10,51,53,39,47,44,21};
        int n=val.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(val[i]>val[j])
                {
                    int temp=val[j];
                    val[j]=val[i];
                    val[i]=temp;
                }
            }
        }
        System.out.print("Sum of 2nd and 3rd largest number : ");
        System.out.println(val[n-2]+val[n-3]);
    }
}