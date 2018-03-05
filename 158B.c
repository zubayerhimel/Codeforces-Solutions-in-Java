#include <stdio.h>

int main()
{
    int n,i,sum=0;
    scanf("%d", &n);
    while(n--)
    {
        scanf("%d", &i);
        sum+=i;
    }

    int result = sum/4;
    if(result*4 < sum)
    {
        printf("%d\n", result+=1);
    }
    else
    {
        printf("%d\n", result);
    }

}
