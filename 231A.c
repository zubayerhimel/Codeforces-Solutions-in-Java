#include <stdio.h>
int main()
{
    int n,a,b,c,last =0;
    scanf("%d", &n);

    while(n--)
    {
        scanf("%d", &a);
        scanf("%d", &b);
        scanf("%d", &c);
        if (a+b+c>1)
        {
            last++;
        }
    }
    printf("%d\n", last);


}
