#include <stdio.h>
int main()
{
    int n,result =0;
    char value[4];

    scanf("%d", &n);
    while(n--)
    {
        scanf("%s", value);
        if (value[1] == '+')
        {
            result++;
        }
        else
        {
            result--;
        }
    }
    printf("%d\n", result);
}
