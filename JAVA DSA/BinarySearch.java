
public class BinarySearch {
    int binarysearch(int arr[],int key)
    {
        int s=0;
        int e=0;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(arr[m]==key)
            {
                return m;
            }else if(key<arr[m])
                {
                    e=m-1;
                }
            else
                {
                    s=m+1;
                }
        }
        return -1;
    }
}
