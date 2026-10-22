
public class LinearSearch {
    public int linearsearch(int arr[],int key)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }    
    public static void main(String []args)
    {
        int a[]={10,20,30,40};
        LinearSearch ls=new LinearSearch();
        int index=ls.linearsearch(a,30);    
        System.out.println("The index of the key is : "+index);
    }
}
