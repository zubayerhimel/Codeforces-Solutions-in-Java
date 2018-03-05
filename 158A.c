#include <stdio.h>

int main()
{
    int n,k,a[101],count=0,i;
    scanf("%d", & n);
    scanf("%d", & k);

    for(i=1; i<=n; i++)
    {
        scanf("%d", & a[i]);
    }

    for(i=1; i<=n; i++)
    {
        if (a[i]>=a[k] && a[i]>0)
        {
            count++;
        }
    }
    printf("%d", count);
}
