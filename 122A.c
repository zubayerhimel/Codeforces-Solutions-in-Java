#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

int main()
{
    int n;
    scanf("%d", &n);

    if (n%4==0 || n%7 ==0 || n%47==0)
    {
        printf("YES");
    }
    else
    {
         int x=n,key,con=0;
        while(x!=0){
            x=x/10;
            con++;
        }
        int *arr;
        arr=(int*)malloc(sizeof(int)*con);
        memset(arr,0,con);
        x=n;
        int k=0;
        while(x!=0)
        {
            key=x%10;
            arr[k]=key;
            x=x/10;
            k++;
        }
        int flag=0,i;
        for( i=0;i<k;i++)
            {
            if(arr[i]!=4&&arr[i]!=7)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }

}
